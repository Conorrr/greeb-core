package io.greeb.core.discord

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import sx.blah.discord.api.Event
import sx.blah.discord.handle.impl.events.MessageReceivedEvent

import java.util.regex.Pattern

class EventRegister {

  private final static Logger LOGGER = LoggerFactory.getLogger(EventRegister.class)

  List<Mapping> registered = []

  // Registration
  void register(Class<Event> event, Closure closure, Closure<Boolean> matcher) {
    LOGGER.debug("new consumer registered to $event.simpleName")
    registered << new Mapping(event, closure, matcher)
  }

  void register(String pattern, Closure closure) {
    LOGGER.debug("new consumer registered to $MessageReceivedEvent.simpleName")
    def matcher = createMessageMatcher(pattern)
    registered << new Mapping(MessageReceivedEvent, closure, matcher)
  }

  void register(String pattern, boolean privateMsg, Closure closure) {
    LOGGER.debug("new consumer registered to $MessageReceivedEvent.simpleName")
    def matcher = combine(createMessageMatcher(pattern), createPrivateChatMatcher(privateMsg))
    registered << new Mapping(MessageReceivedEvent, closure, matcher)
  }

  void register(String pattern, String channel, Closure closure) {
    LOGGER.debug("new consumer registered to $MessageReceivedEvent.simpleName")
    def matcher = combine(createChannelMatcher(channel), createMessageMatcher(pattern))
    registered << new Mapping(MessageReceivedEvent, closure, matcher)
  }

  private static Closure<Boolean> createMessageMatcher(String pattern) {
    Pattern compiled = ~pattern
    return { MessageReceivedEvent event ->
      (event.message.content =~ compiled).asBoolean()
    }
  }

  private static Closure<Boolean> createChannelMatcher(String channel) {
    return { MessageReceivedEvent event ->
      event.message.channel.name.equalsIgnoreCase(channel)
    }
  }

  private static Closure<Boolean> createPrivateChatMatcher(Boolean isPrivateChat) {
    return { MessageReceivedEvent event ->
      event.message.channel.private == isPrivateChat
    }
  }

  private static Closure<Boolean> combine(Closure<Boolean>... filters) {
    return { Event event ->
      filters.every { it(event) }
    }
  }

}

package io.greeb.core.dsl

import io.greeb.core.discord.Mapping
import sx.blah.discord.api.Event
import sx.blah.discord.handle.impl.events.MessageReceivedEvent

import java.util.regex.Pattern

public class DiscordMatchers {

//  void register(String pattern, Closure closure) {
//    LOGGER.debug("new consumer registered to $MessageReceivedEvent.simpleName")
//    def matcher = createMessageMatcher(pattern)
//    registered << new Mapping(MessageReceivedEvent, closure, matcher)
//  }
//
//  void register(String pattern, boolean privateMsg, Closure closure) {
//    LOGGER.debug("new consumer registered to $MessageReceivedEvent.simpleName")
//    def matcher = combine(createMessageMatcher(pattern), createPrivateChatMatcher(privateMsg))
//    registered << new Mapping(MessageReceivedEvent, closure, matcher)
//  }
//
//  void register(String pattern, String channel, Closure closure) {
//    LOGGER.debug("new consumer registered to $MessageReceivedEvent.simpleName")
//    def matcher = combine(createChannelMatcher(channel), createMessageMatcher(pattern))
//    registered << new Mapping(MessageReceivedEvent, closure, matcher)
//  }

  public static Closure<Boolean> messageMatches(String pattern) {
    Pattern compiled = ~pattern
    return { MessageReceivedEvent event ->
      (event.message.content =~ compiled).asBoolean()
    }
  }

  public static Closure<Boolean> channelMatchesOrPrivate(String channel) {
    return { MessageReceivedEvent event ->
      privateChat() || channelMatches(channel)
    }
  }

  public static Closure<Boolean> channelMatches(String channel) {
    return { MessageReceivedEvent event ->
      event.message.channel.name.equalsIgnoreCase(channel)
    }
  }

  public static Closure<Boolean> privateChat(Boolean isPrivateChat = true) {
    return { MessageReceivedEvent event ->
      event.message.channel.private == isPrivateChat
    }
  }

  public static Closure<Boolean> combine(Closure<Boolean>... filters) {
    return { Event event ->
      filters.every { it(event) }
    }
  }

}

package io.greeb.core.discord

import sx.blah.discord.api.Event
import sx.blah.discord.handle.impl.events.MessageReceivedEvent

import java.util.regex.Pattern

class Mapping {

  final Class<Event> event

  final Closure<Boolean> matcher

  final Closure closure

  public Mapping(Class<Event> event, Closure closure, Closure<Boolean> matcher) {
    this.event = event
    this.closure = closure
    this.matcher = matcher
  }

  public Mapping(String pattern, Closure closure) {
    this.event = MessageReceivedEvent
    this.closure = closure
    this.matcher = createMessageMatcher(pattern)
  }

  public Mapping(String pattern, String channel, Closure closure) {
    this.event = MessageReceivedEvent
    this.closure = closure
    this.matcher = combine(createChannelMatcher(channel), createMessageMatcher(pattern))
  }

  // TODO move this logic somewhere more semantically meaningful
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

  private static Closure<Boolean> combine(Closure<Boolean>... filters) {
    return { Event event ->
      filters.every { it(event) }
    }
  }

}

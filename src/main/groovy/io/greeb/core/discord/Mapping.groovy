package io.greeb.core.discord

import sx.blah.discord.api.Event
import sx.blah.discord.handle.impl.events.MessageReceivedEvent

class Mapping {

  Class<Event> event

  String pattern

  String channel

  Closure closure

  public Mapping(Class<Event> event, Closure closure) {
    this.event = event
    this.closure = closure
  }

  public Mapping(Class<MessageReceivedEvent> event, String pattern, Closure closure) {
    this.event = event
    this.pattern = pattern
    this.closure = closure
  }

  public Mapping(Class<MessageReceivedEvent> event, String pattern, String channel, Closure closure) {
    this.event = event
    this.pattern = pattern
    this.channel = channel
    this.closure = closure
  }

}

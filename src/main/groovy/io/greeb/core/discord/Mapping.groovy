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

}

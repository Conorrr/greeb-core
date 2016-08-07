package io.greeb.core.dsl

import io.greeb.core.discord.EventRegister
import sx.blah.discord.api.events.Event

class ConsumerChainer {

  private final EventRegister eventRegister

  private final Closure<Boolean> matcher

  private final Class<? extends Event> event

  public ConsumerChainer(Closure<Boolean> matcher, EventRegister eventRegister, Class<? extends Event> event) {
    this.eventRegister = eventRegister
    this.matcher = matcher
    this.event = event
  }

  public Closure chain(Closure closure) {
    eventRegister.register(event, closure, matcher)
    return closure
  }

}

package io.greeb.core.discord

import sx.blah.discord.api.Event

class EventContext<T extends Event> {

  final T event

  public EventContext(T event){
    this.event = event
  }

}

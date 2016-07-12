package io.greeb.core.discord

import sx.blah.discord.api.Event
import sx.blah.discord.api.IDiscordClient

class EventContext<T extends Event> {

  final T event

  final IDiscordClient client

  public EventContext(T event) {
    this.event = event
    this.client = event.client
  }

}

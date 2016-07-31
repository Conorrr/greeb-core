package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import io.greeb.core.discord.EventDispatcher
import sx.blah.discord.handle.impl.events.GuildCreateEvent

class GuildCreateEventContext extends EventContext<GuildCreateEvent> {
  GuildCreateEventContext(GuildCreateEvent event, EventDispatcher eventDispatcher, Map properties) {
    super(event, eventDispatcher, properties)
  }
}

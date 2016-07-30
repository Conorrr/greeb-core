package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import io.greeb.core.discord.EventDispatcher
import sx.blah.discord.handle.impl.events.GuildUpdateEvent

class GuildUpdateEventContext extends EventContext<GuildUpdateEvent> {
  GuildUpdateEventContext(GuildUpdateEvent event, EventDispatcher eventDispatcher) {
    super(event, eventDispatcher)
  }
}

package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import sx.blah.discord.handle.impl.events.GuildUpdateEvent

class GuildUpdateEventContext extends EventContext<GuildUpdateEvent> {
  GuildUpdateEventContext(GuildUpdateEvent event) {
    super(event)
  }
}

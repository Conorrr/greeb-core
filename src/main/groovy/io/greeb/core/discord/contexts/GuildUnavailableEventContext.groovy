package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import sx.blah.discord.handle.impl.events.GuildUnavailableEvent

class GuildUnavailableEventContext extends EventContext<GuildUnavailableEvent> {
  GuildUnavailableEventContext(GuildUnavailableEvent event) {
    super(event)
  }
}

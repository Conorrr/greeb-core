package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import io.greeb.core.discord.EventDispatcher
import sx.blah.discord.handle.impl.events.GuildLeaveEvent

class GuildLeaveEventContext extends EventContext<GuildLeaveEvent> {
  GuildLeaveEventContext(GuildLeaveEvent event, EventDispatcher eventDispatcher, Map properties) {
    super(event, eventDispatcher, properties)
  }
}

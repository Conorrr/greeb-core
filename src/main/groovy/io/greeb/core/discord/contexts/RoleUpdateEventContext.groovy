package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import sx.blah.discord.handle.impl.events.RoleDeleteEvent
import sx.blah.discord.handle.impl.events.RoleUpdateEvent

class RoleUpdateEventContext extends EventContext<RoleUpdateEvent> {
  RoleUpdateEventContext(RoleUpdateEvent event) {
    super(event)
  }
}

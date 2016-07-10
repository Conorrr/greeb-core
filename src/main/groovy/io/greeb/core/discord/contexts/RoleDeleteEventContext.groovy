package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import sx.blah.discord.handle.impl.events.RoleDeleteEvent

class RoleDeleteEventContext extends EventContext<RoleDeleteEvent> {
  RoleDeleteEventContext(RoleDeleteEvent event) {
    super(event)
  }
}

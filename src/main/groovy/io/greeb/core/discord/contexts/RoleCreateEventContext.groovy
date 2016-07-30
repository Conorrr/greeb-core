package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import io.greeb.core.discord.EventDispatcher
import sx.blah.discord.handle.impl.events.RoleCreateEvent

class RoleCreateEventContext extends EventContext<RoleCreateEvent> {
  RoleCreateEventContext(RoleCreateEvent event, EventDispatcher eventDispatcher) {
    super(event, eventDispatcher)
  }
}

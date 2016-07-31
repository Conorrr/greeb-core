package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import io.greeb.core.discord.EventDispatcher
import sx.blah.discord.handle.impl.events.UserRoleUpdateEvent

class UserRoleUpdateEventContext extends EventContext<UserRoleUpdateEvent> {
  UserRoleUpdateEventContext(UserRoleUpdateEvent event, EventDispatcher eventDispatcher, Map properties) {
    super(event, eventDispatcher, properties)
  }
}

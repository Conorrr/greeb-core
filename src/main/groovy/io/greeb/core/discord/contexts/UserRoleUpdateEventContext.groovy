package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import sx.blah.discord.handle.impl.events.UserRoleUpdateEvent

class UserRoleUpdateEventContext extends EventContext<UserRoleUpdateEvent> {
  UserRoleUpdateEventContext(UserRoleUpdateEvent event) {
    super(event)
  }
}

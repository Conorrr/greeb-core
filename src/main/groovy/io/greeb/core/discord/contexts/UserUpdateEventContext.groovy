package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import sx.blah.discord.handle.impl.events.UserUpdateEvent

class UserUpdateEventContext extends EventContext<UserUpdateEvent> {
  UserUpdateEventContext(UserUpdateEvent event) {
    super(event)
  }
}

package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import sx.blah.discord.handle.impl.events.UserJoinEvent

class UserJoinEventContext extends EventContext<UserJoinEvent> {
  UserJoinEventContext(UserJoinEvent event) {
    super(event)
  }
}

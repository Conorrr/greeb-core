package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import sx.blah.discord.handle.impl.events.UserJoinEvent
import sx.blah.discord.handle.obj.IUser

class UserJoinEventContext extends EventContext<UserJoinEvent> {
  final IUser user

  UserJoinEventContext(UserJoinEvent event) {
    super(event)
    this.user = event.user
  }
}

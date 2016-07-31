package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import io.greeb.core.discord.EventDispatcher
import sx.blah.discord.handle.impl.events.UserJoinEvent
import sx.blah.discord.handle.obj.IUser

class UserJoinEventContext extends EventContext<UserJoinEvent> {
  final IUser user

  UserJoinEventContext(UserJoinEvent event, EventDispatcher eventDispatcher, Map properties) {
    super(event, eventDispatcher, properties)
    this.user = event.user
  }
}

package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import io.greeb.core.discord.EventDispatcher
import sx.blah.discord.handle.impl.events.UserLeaveEvent

class UserLeaveEventContext extends EventContext<UserLeaveEvent> {
  UserLeaveEventContext(UserLeaveEvent event, EventDispatcher eventDispatcher, Map properties) {
    super(event, eventDispatcher, properties)
  }
}

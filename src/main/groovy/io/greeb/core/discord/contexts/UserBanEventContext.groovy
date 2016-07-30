package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import io.greeb.core.discord.EventDispatcher
import sx.blah.discord.handle.impl.events.UserBanEvent

class UserBanEventContext extends EventContext<UserBanEvent> {
  UserBanEventContext(UserBanEvent event, EventDispatcher eventDispatcher) {
    super(event, eventDispatcher)
  }
}

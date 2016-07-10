package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import sx.blah.discord.handle.impl.events.UserPardonEvent

class UserPardonEventContext extends EventContext<UserPardonEvent> {
  UserPardonEventContext(UserPardonEvent event) {
    super(event)
  }
}

package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import io.greeb.core.discord.EventDispatcher
import sx.blah.discord.handle.impl.events.UserVoiceStateUpdateEvent

class UserVoiceStateUpdateEventContext extends EventContext<UserVoiceStateUpdateEvent> {
  UserVoiceStateUpdateEventContext(UserVoiceStateUpdateEvent event, EventDispatcher eventDispatcher) {
    super(event, eventDispatcher)
  }
}

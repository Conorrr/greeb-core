package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import sx.blah.discord.handle.impl.events.UserVoiceStateUpdateEvent

class UserVoiceStateUpdateEventContext extends EventContext<UserVoiceStateUpdateEvent> {
  UserVoiceStateUpdateEventContext(UserVoiceStateUpdateEvent event) {
    super(event)
  }
}

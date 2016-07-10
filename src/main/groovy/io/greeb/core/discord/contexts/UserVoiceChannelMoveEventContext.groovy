package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import sx.blah.discord.handle.impl.events.UserVoiceChannelMoveEvent

class UserVoiceChannelMoveEventContext extends EventContext<UserVoiceChannelMoveEvent> {
  UserVoiceChannelMoveEventContext(UserVoiceChannelMoveEvent event) {
    super(event)
  }
}

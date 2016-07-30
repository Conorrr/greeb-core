package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import io.greeb.core.discord.EventDispatcher
import sx.blah.discord.handle.impl.events.UserVoiceChannelMoveEvent

class UserVoiceChannelMoveEventContext extends EventContext<UserVoiceChannelMoveEvent> {
  UserVoiceChannelMoveEventContext(UserVoiceChannelMoveEvent event, EventDispatcher eventDispatcher) {
    super(event, eventDispatcher)
  }
}

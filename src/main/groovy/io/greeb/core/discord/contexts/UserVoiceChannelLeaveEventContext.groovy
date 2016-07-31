package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import io.greeb.core.discord.EventDispatcher
import sx.blah.discord.handle.impl.events.UserVoiceChannelLeaveEvent

class UserVoiceChannelLeaveEventContext extends EventContext<UserVoiceChannelLeaveEvent> {
  UserVoiceChannelLeaveEventContext(UserVoiceChannelLeaveEvent event, EventDispatcher eventDispatcher, Map properties) {
    super(event, eventDispatcher, properties)
  }
}

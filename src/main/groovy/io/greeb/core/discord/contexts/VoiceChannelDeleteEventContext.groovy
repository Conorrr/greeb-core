package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import io.greeb.core.discord.EventDispatcher
import sx.blah.discord.handle.impl.events.VoiceChannelDeleteEvent

class VoiceChannelDeleteEventContext extends EventContext<VoiceChannelDeleteEvent> {
  VoiceChannelDeleteEventContext(VoiceChannelDeleteEvent event, EventDispatcher eventDispatcher, Map properties) {
    super(event, eventDispatcher, properties)
  }
}

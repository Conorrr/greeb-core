package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import io.greeb.core.discord.EventDispatcher
import sx.blah.discord.handle.impl.events.VoiceChannelCreateEvent

class VoiceChannelCreateEventContext extends EventContext<VoiceChannelCreateEvent> {
  VoiceChannelCreateEventContext(VoiceChannelCreateEvent event, EventDispatcher eventDispatcher, Map properties) {
    super(event, eventDispatcher, properties)
  }
}

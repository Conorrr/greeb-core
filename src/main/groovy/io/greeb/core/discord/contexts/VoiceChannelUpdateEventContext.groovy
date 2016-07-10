package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import sx.blah.discord.handle.impl.events.VoiceChannelUpdateEvent

class VoiceChannelUpdateEventContext extends EventContext<VoiceChannelUpdateEvent> {
  VoiceChannelUpdateEventContext(VoiceChannelUpdateEvent event) {
    super(event)
  }
}

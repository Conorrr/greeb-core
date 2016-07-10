package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import sx.blah.discord.handle.impl.events.VoiceChannelDeleteEvent

class VoiceChannelDeleteEventContext extends EventContext<VoiceChannelDeleteEvent> {
  VoiceChannelDeleteEventContext(VoiceChannelDeleteEvent event) {
    super(event)
  }
}

package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import io.greeb.core.discord.EventDispatcher
import sx.blah.discord.handle.impl.events.VoiceUserSpeakingEvent

class VoiceUserSpeakingEventContext extends EventContext<VoiceUserSpeakingEvent> {
  VoiceUserSpeakingEventContext(VoiceUserSpeakingEvent event, EventDispatcher eventDispatcher) {
    super(event, eventDispatcher)
  }
}

package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import io.greeb.core.discord.EventDispatcher
import sx.blah.discord.handle.impl.events.VoiceDisconnectedEvent

class VoiceDisconnectedEventContext extends EventContext<VoiceDisconnectedEvent> {
  VoiceDisconnectedEventContext(VoiceDisconnectedEvent event, EventDispatcher eventDispatcher, Map properties) {
    super(event, eventDispatcher, properties)
  }
}

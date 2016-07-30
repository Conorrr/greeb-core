package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import io.greeb.core.discord.EventDispatcher
import sx.blah.discord.handle.impl.events.VoicePingEvent

class VoicePingEventContext extends EventContext<VoicePingEvent> {
  VoicePingEventContext(VoicePingEvent event, EventDispatcher eventDispatcher) {
    super(event, eventDispatcher)
  }
}

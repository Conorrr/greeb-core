package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import io.greeb.core.discord.EventDispatcher
import sx.blah.discord.handle.impl.events.AudioStopEvent

class AudioStopEventContext extends EventContext<AudioStopEvent> {
  AudioStopEventContext(AudioStopEvent event, EventDispatcher eventDispatcher, Map properties) {
    super(event, eventDispatcher, properties)
  }
}

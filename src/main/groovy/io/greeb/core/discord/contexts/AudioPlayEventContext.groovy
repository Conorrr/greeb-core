package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import io.greeb.core.discord.EventDispatcher
import sx.blah.discord.handle.impl.events.AudioPlayEvent

class AudioPlayEventContext extends EventContext<AudioPlayEvent> {
  AudioPlayEventContext(AudioPlayEvent event, EventDispatcher eventDispatcher) {
    super(event, eventDispatcher)
  }
}

package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import io.greeb.core.discord.EventDispatcher
import sx.blah.discord.handle.impl.events.AudioUnqueuedEvent

class AudioUnqueuedEventContext extends EventContext<AudioUnqueuedEvent> {
  AudioUnqueuedEventContext(AudioUnqueuedEvent event, EventDispatcher eventDispatcher) {
    super(event, eventDispatcher)
  }
}

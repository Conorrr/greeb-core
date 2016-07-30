package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import io.greeb.core.discord.EventDispatcher
import sx.blah.discord.handle.impl.events.AudioQueuedEvent

class AudioQueuedEventContext extends EventContext<AudioQueuedEvent> {
  AudioQueuedEventContext(AudioQueuedEvent event, EventDispatcher eventDispatcher) {
    super(event, eventDispatcher)
  }
}

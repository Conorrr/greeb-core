package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import sx.blah.discord.handle.impl.events.AudioQueuedEvent

class AudioQueuedEventContext extends EventContext<AudioQueuedEvent> {
  AudioQueuedEventContext(AudioQueuedEvent event) {
    super(event)
  }
}

package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import sx.blah.discord.handle.impl.events.TypingEvent

class TypingEventContext extends EventContext<TypingEvent> {
  TypingEventContext(TypingEvent event) {
    super(event)
  }
}

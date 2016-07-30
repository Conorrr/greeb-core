package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import io.greeb.core.discord.EventDispatcher
import sx.blah.discord.handle.impl.events.TypingEvent

class TypingEventContext extends EventContext<TypingEvent> {
  TypingEventContext(TypingEvent event, EventDispatcher eventDispatcher) {
    super(event, eventDispatcher)
  }
}

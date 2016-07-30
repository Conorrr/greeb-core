package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import io.greeb.core.discord.EventDispatcher
import sx.blah.discord.handle.impl.events.MentionEvent

class MentionEventContext extends EventContext<MentionEvent> {
  MentionEventContext(MentionEvent event, EventDispatcher eventDispatcher) {
    super(event, eventDispatcher)
  }
}

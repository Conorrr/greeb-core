package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import sx.blah.discord.handle.impl.events.MentionEvent

class MentionEventContext extends EventContext<MentionEvent> {
  MentionEventContext(MentionEvent event) {
    super(event)
  }
}

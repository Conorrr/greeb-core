package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import sx.blah.discord.handle.impl.events.ReadyEvent

class ReadyEventContext extends EventContext<ReadyEvent> {
  ReadyEventContext(ReadyEvent event) {
    super(event)
  }
}

package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import sx.blah.discord.handle.impl.events.InviteReceivedEvent

class InviteReceivedEventContext extends EventContext<InviteReceivedEvent> {
  InviteReceivedEventContext(InviteReceivedEvent event) {
    super(event)
  }
}

package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import io.greeb.core.discord.EventDispatcher
import sx.blah.discord.handle.impl.events.InviteReceivedEvent

class InviteReceivedEventContext extends EventContext<InviteReceivedEvent> {
  InviteReceivedEventContext(InviteReceivedEvent event, EventDispatcher eventDispatcher) {
    super(event, eventDispatcher)
  }
}

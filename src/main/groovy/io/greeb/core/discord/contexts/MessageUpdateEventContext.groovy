package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import sx.blah.discord.handle.impl.events.MessageSendEvent
import sx.blah.discord.handle.impl.events.MessageUpdateEvent

class MessageUpdateEventContext extends EventContext<MessageUpdateEvent> {
  MessageUpdateEventContext(MessageUpdateEvent event) {
    super(event)
  }
}

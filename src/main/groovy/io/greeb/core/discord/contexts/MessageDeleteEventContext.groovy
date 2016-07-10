package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import sx.blah.discord.handle.impl.events.MessageDeleteEvent

class MessageDeleteEventContext extends EventContext<MessageDeleteEvent> {
  MessageDeleteEventContext(MessageDeleteEvent event) {
    super(event)
  }
}

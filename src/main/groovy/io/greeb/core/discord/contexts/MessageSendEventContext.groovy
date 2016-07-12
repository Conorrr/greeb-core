package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import sx.blah.discord.handle.impl.events.MessageSendEvent
import sx.blah.discord.handle.obj.IUser

class MessageSendEventContext extends EventContext<MessageSendEvent> {
  final IUser user

  MessageSendEventContext(MessageSendEvent event) {
    super(event)
    this.user = event.message.author
  }
}

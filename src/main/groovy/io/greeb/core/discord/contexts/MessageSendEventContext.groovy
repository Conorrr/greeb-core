package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import io.greeb.core.discord.EventDispatcher
import sx.blah.discord.handle.impl.events.MessageSendEvent
import sx.blah.discord.handle.obj.IMessage
import sx.blah.discord.handle.obj.IUser

class MessageSendEventContext extends EventContext<MessageSendEvent> {
  final IUser user
  final IMessage message
  final String content

  MessageSendEventContext(MessageSendEvent event, EventDispatcher eventDispatcher, Map properties) {
    super(event, eventDispatcher, properties)
    this.message = event.message
    this.user = message.author
    this.content = message.content
  }
}

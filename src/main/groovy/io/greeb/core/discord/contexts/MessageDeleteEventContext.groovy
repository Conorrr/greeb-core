package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import sx.blah.discord.handle.impl.events.MessageDeleteEvent
import sx.blah.discord.handle.obj.IMessage
import sx.blah.discord.handle.obj.IUser

class MessageDeleteEventContext extends EventContext<MessageDeleteEvent> {
  final IUser user
  final IMessage message
  final String content

  MessageDeleteEventContext(MessageDeleteEvent event) {
    super(event)
    this.message = event.message
    this.user = message.author
    this.content = message.content
  }
}

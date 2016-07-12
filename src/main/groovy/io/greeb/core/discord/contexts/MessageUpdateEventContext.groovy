package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import sx.blah.discord.handle.impl.events.MessageUpdateEvent
import sx.blah.discord.handle.obj.IUser

class MessageUpdateEventContext extends EventContext<MessageUpdateEvent> {

  final IUser user

  MessageUpdateEventContext(MessageUpdateEvent event) {
    super(event)
    this.user = event.newMessage.author
  }
}

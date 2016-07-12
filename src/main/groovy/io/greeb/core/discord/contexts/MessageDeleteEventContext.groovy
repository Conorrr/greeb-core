package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import sx.blah.discord.handle.impl.events.MessageDeleteEvent
import sx.blah.discord.handle.obj.IUser

class MessageDeleteEventContext extends EventContext<MessageDeleteEvent> {
  final IUser user

  MessageDeleteEventContext(MessageDeleteEvent event) {
    super(event)
    this.user = event.message.author
  }
}

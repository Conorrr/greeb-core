package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import sx.blah.discord.handle.impl.events.MessageReceivedEvent
import sx.blah.discord.handle.obj.IUser

class MessageReceivedEventContext extends EventContext<MessageReceivedEvent> {
  final IUser user

  MessageReceivedEventContext(MessageReceivedEvent event) {
    super(event)
    this.user = event.message.author
  }

  void respond(String message) {
    event.message.channel.sendMessage(message)
  }

}

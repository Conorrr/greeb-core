package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import sx.blah.discord.handle.impl.events.MessageReceivedEvent
import sx.blah.discord.handle.obj.IMessage
import sx.blah.discord.handle.obj.IUser

class MessageReceivedEventContext extends EventContext<MessageReceivedEvent> {
  final IUser user
  final IMessage message
  final String content

  MessageReceivedEventContext(MessageReceivedEvent event) {
    super(event)
    this.message = event.message
    this.user = message.author
    this.content = message.content
  }

  void respond(String message) {
    event.message.channel.sendMessage(message)
  }

  String getParts(){
    return content.split(/\s+/)
  }

}

package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import sx.blah.discord.handle.impl.events.MessageReceivedEvent

class MessageReceivedEventContext extends EventContext<MessageReceivedEvent> {

  MessageReceivedEventContext(MessageReceivedEvent event) {
    super(event)
  }

  void respond(String message) {
    event.message.channel.sendMessage(message)
  }

}

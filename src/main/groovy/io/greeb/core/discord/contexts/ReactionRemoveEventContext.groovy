package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import io.greeb.core.discord.EventDispatcher
import sx.blah.discord.handle.impl.events.ReactionRemoveEvent
import sx.blah.discord.handle.obj.IMessage
import sx.blah.discord.handle.obj.IUser

class ReactionRemoveEventContext extends EventContext<ReactionRemoveEvent> {

  final IUser user
  final IMessage message

  ReactionRemoveEventContext(ReactionRemoveEvent event, EventDispatcher eventDispatcher, Map properties) {
    super(event, eventDispatcher, properties)
    this.message = event.message
    this.user = event.user
  }

}

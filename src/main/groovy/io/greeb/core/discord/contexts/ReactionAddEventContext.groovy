package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import io.greeb.core.discord.EventDispatcher
import sx.blah.discord.handle.impl.events.ReactionAddEvent
import sx.blah.discord.handle.obj.IMessage
import sx.blah.discord.handle.obj.IUser

class ReactionAddEventContext extends EventContext<ReactionAddEvent> {

  final IUser user
  final IMessage message

  ReactionAddEventContext(ReactionAddEvent event, EventDispatcher eventDispatcher, Map properties) {
    super(event, eventDispatcher, properties)
    this.message = event.message
    this.user = event.user
  }

}

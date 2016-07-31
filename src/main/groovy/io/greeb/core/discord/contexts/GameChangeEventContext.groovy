package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import io.greeb.core.discord.EventDispatcher
import sx.blah.discord.handle.impl.events.GameChangeEvent

class GameChangeEventContext extends EventContext<GameChangeEvent> {
  GameChangeEventContext(GameChangeEvent event, EventDispatcher eventDispatcher, Map properties) {
    super(event, eventDispatcher, properties)
  }
}

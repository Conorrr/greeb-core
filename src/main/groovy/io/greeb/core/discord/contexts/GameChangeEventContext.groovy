package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import sx.blah.discord.handle.impl.events.GameChangeEvent

class GameChangeEventContext extends EventContext<GameChangeEvent> {
  GameChangeEventContext(GameChangeEvent event) {
    super(event)
  }
}

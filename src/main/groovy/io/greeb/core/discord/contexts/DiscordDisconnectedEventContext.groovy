package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import io.greeb.core.discord.EventDispatcher
import sx.blah.discord.handle.impl.events.DiscordDisconnectedEvent

class DiscordDisconnectedEventContext extends EventContext<DiscordDisconnectedEvent> {
  DiscordDisconnectedEventContext(DiscordDisconnectedEvent event, EventDispatcher eventDispatcher) {
    super(event, eventDispatcher)
  }
}

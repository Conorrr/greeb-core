package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import io.greeb.core.discord.EventDispatcher
import sx.blah.discord.handle.impl.events.PresenceUpdateEvent

class PresenceUpdateEventContext extends EventContext<PresenceUpdateEvent> {
  PresenceUpdateEventContext(PresenceUpdateEvent event, EventDispatcher eventDispatcher, Map properties) {
    super(event, eventDispatcher, properties)
  }
}

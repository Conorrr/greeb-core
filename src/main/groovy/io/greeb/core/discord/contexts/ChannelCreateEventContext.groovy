package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import io.greeb.core.discord.EventDispatcher
import sx.blah.discord.handle.impl.events.ChannelCreateEvent

class ChannelCreateEventContext extends EventContext<ChannelCreateEvent> {
  ChannelCreateEventContext(ChannelCreateEvent event, EventDispatcher eventDispatcher) {
    super(event, eventDispatcher)
  }
}

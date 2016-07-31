package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import io.greeb.core.discord.EventDispatcher
import sx.blah.discord.handle.impl.events.ChannelDeleteEvent

class ChannelDeleteEventContext extends EventContext<ChannelDeleteEvent> {
  ChannelDeleteEventContext(ChannelDeleteEvent event, EventDispatcher eventDispatcher, Map properties) {
    super(event, eventDispatcher, properties)
  }
}

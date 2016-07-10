package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import sx.blah.discord.handle.impl.events.ChannelUpdateEvent

class ChannelUpdateEventContext extends EventContext<ChannelUpdateEvent> {
  ChannelUpdateEventContext(ChannelUpdateEvent event) {
    super(event)
  }
}

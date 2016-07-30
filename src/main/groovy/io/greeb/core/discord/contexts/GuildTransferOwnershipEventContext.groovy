package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import io.greeb.core.discord.EventDispatcher
import sx.blah.discord.handle.impl.events.GuildTransferOwnershipEvent

class GuildTransferOwnershipEventContext extends EventContext<GuildTransferOwnershipEvent> {
  GuildTransferOwnershipEventContext(GuildTransferOwnershipEvent event, EventDispatcher eventDispatcher) {
    super(event, eventDispatcher)
  }
}

package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import io.greeb.core.discord.EventDispatcher
import sx.blah.discord.handle.impl.events.ModuleEnabledEvent

class ModuleEnabledEventContext extends EventContext<ModuleEnabledEvent> {
  ModuleEnabledEventContext(ModuleEnabledEvent event, EventDispatcher eventDispatcher) {
    super(event, eventDispatcher)
  }
}

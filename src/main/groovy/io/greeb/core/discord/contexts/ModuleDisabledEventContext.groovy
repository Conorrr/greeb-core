package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import io.greeb.core.discord.EventDispatcher
import sx.blah.discord.handle.impl.events.ModuleDisabledEvent

class ModuleDisabledEventContext extends EventContext<ModuleDisabledEvent> {
  ModuleDisabledEventContext(ModuleDisabledEvent event, EventDispatcher eventDispatcher) {
    super(event, eventDispatcher)
  }
}

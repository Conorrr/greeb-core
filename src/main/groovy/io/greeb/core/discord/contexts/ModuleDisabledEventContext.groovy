package io.greeb.core.discord.contexts

import io.greeb.core.discord.EventContext
import sx.blah.discord.handle.impl.events.ModuleDisabledEvent

class ModuleDisabledEventContext extends EventContext<ModuleDisabledEvent> {
  ModuleDisabledEventContext(ModuleDisabledEvent event) {
    super(event)
  }
}

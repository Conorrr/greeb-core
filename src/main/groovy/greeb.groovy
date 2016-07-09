import io.greeb.core.SomeGuiceModule
import sx.blah.discord.handle.impl.events.AudioPlayEvent

import static io.greeb.core.dsl.DSL.greeb

greeb {
  // all config should be in here
  credentials "MTk5NTkxODAxOTQ0OTMyMzUy.Clw72Q.IDSG3h2x2nKWaLe1VeUpCsAC-J4"

  // add this once we need to get more complicated
  bindings {
    module SomeGuiceModule // see ratpack.guice.BindingsSpec
  }

  consumers {
    // matches message pattern in any channel
    listen("some pattern") { injected ->

    }

    // matches message patterns in specific channel
    listen("some pattern", "some channel") {

    }

    // matches all patterns
    listen("*") {

    }

    // triggers after specific event
    listen(AudioPlayEvent) {

    }

    // todo add support for filters
//    listen(AudioPlayEvent) { event ->
//      event.filter == "matches"
//      return false
//    } {
//      something()
//    }
  }
}
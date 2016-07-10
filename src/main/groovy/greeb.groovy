import io.greeb.core.SomeGuiceModule

import static io.greeb.core.dsl.DSL.greeb

greeb {
  // all config should be in here
  credentials "MTk5NTkxODAxOTQ0OTMyMzUy.Clw72Q.IDSG3h2x2nKWaLe1VeUpCsAC-J4"

  // add this once we need to get more complicated
  bindings {
    module SomeGuiceModule // see ratpack.guice.BindingsSpec
  }

  consumers {
    // TODO
//    messageStartsWith('^!greeb '){
//      pattern(/talk/){
//
//      }
//    }

    // matches message pattern in any channel
    messageReceived(/^!greeb/) { event ->
      // simple echo using respond helper
      respond(event.message.content)
    }

    // matches message patterns in specific channel
    messageReceived("some pattern", "some-channel") {

      event.message.channel.sendMessage(event.message.content)
    }

    // matches all patterns
    messageReceived(".*") {

    }

    // triggers after specific event
    def matcher = {""}
    audioPlay {
      ""
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
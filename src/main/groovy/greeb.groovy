import io.greeb.core.SomeGuiceModule
import sx.blah.discord.handle.impl.events.AudioPlayEvent
import sx.blah.discord.handle.impl.events.MessageReceivedEvent

import static io.greeb.core.dsl.DSL.greeb

greeb {

  credentials new File('discord.token').text

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
    messageReceived("some pattern", "some-channel") { MessageReceivedEvent event ->

      event.message.channel.sendMessage(event.message.content)
    }

    // matches all patterns
    messageReceived(".*") {

    }

    // triggers after specific event
    def matcher = { "" }
    audioPlay { AudioPlayEvent e ->

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
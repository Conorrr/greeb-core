import io.greeb.core.SomeGuiceModule
import sx.blah.discord.handle.impl.events.AudioPlayEvent
import sx.blah.discord.handle.impl.events.MentionEvent
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

    messageReceived(/^!greeb/) {
      // simple echo using respond helper
      respond(event.message.content)
    }

    def muteList = ['poo', 'plops', 'wazoo']
    // matches message patterns in specific channel
    messageReceived { MessageReceivedEvent event ->
      muteList.any {event.message.content.contains(it)}
    } {
      event.message.channel.sendMessage(event.message.content)
    }


    // matches message patterns in specific channel
    messageReceived("some pattern", "some-channel") {
      event.message.channel.sendMessage(event.message.content)
    }

    // matches all patterns
    messageReceived(".*") {
      println event.message.content
    }

    // todo add support for filters
//    addHelp("!greeb listGames", "lists games available")
    mention{ MentionEvent event ->
      event.message.author.name == 'conorrr'
    } {
      event.message.channel.sendMessage('@conorrr what do you want?')
    }
  }
}
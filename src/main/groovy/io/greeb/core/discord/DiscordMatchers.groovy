package io.greeb.core.discord

import sx.blah.discord.api.events.Event
import sx.blah.discord.handle.impl.events.MessageReceivedEvent

import java.util.regex.Pattern

public class DiscordMatchers {

  public static Closure<Boolean> all() {
    return { true }
  }

  public static Closure<Boolean> not(Closure<Boolean> closure) {
    return { MessageReceivedEvent event ->
      !closure(event)
    }
  }

  public static Closure<Boolean> messageMatches(String pattern) {
    Pattern compiled = ~pattern
    return { MessageReceivedEvent event ->
      (event.message.content =~ compiled).asBoolean()
    }
  }

  public static Closure<Boolean> channelMatchesOrPrivate(String channel) {
    return { MessageReceivedEvent event ->
      privateChat() || channelMatches(channel)
    }
  }

  public static Closure<Boolean> channelNameMatches(String channel) {
    return { MessageReceivedEvent event ->
      event.message.channel.name.equalsIgnoreCase(channel)
    }
  }

  public static Closure<Boolean> channelMatches(String channel) {
    return { MessageReceivedEvent event ->
      event.message.channel.ID == channel
    }
  }

  public static Closure<Boolean> privateChat(Boolean isPrivateChat = true) {
    return { MessageReceivedEvent event ->
      event.message.channel.private == isPrivateChat
    }
  }

  public static Closure<Boolean> combine(Closure<Boolean>... filters) {
    return { Event event ->
      filters.every { it(event) }
    }
  }

}

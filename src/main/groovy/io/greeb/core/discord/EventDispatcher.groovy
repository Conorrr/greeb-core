package io.greeb.core.discord

import sx.blah.discord.api.Event
import sx.blah.discord.api.IListener
import sx.blah.discord.handle.impl.events.MessageReceivedEvent

class EventDispatcher implements IListener<Event> {

  List registered = []

  /**
   * This is where events come in
   */
  @Override
  void handle(Event event) {
    println event.class
  }

  void register(Class<Event> event, Closure closure) {
    registered << new Mapping(event, closure)
  }

  void register(Class<MessageReceivedEvent> event, String pattern, Closure closure) {
    registered << new Mapping(event, pattern, closure)
  }

  void register(Class<MessageReceivedEvent> event, String pattern, String channel, Closure closure) {
    registered << new Mapping(event, pattern, channel, closure)
  }

}

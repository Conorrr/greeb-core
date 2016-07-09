package io.greeb.core.discord

import sx.blah.discord.api.Event
import sx.blah.discord.api.IListener
import sx.blah.discord.handle.impl.events.MessageReceivedEvent

class EventDispatcher implements IListener<Event> {

  def registered = [1,2,3]

  /**
   * This is where events come in
   */
  @Override
  void handle(Event event) {
    registered.findAll({it})
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

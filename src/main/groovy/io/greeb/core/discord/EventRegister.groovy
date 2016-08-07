package io.greeb.core.discord

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import sx.blah.discord.api.events.Event
class EventRegister {

  private final static Logger LOGGER = LoggerFactory.getLogger(EventRegister.class)

  List<Mapping> registered = []

  // Registration
  void register(Class<Event> event, Closure closure, Closure<Boolean> matcher) {
    LOGGER.debug("new consumer registered to $event.simpleName")
    registered << new Mapping(event, closure, matcher)
  }

}
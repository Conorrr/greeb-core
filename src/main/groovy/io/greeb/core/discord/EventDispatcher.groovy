package io.greeb.core.discord

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import sx.blah.discord.api.Event
import sx.blah.discord.api.IListener
import sx.blah.discord.handle.impl.events.MessageReceivedEvent

// TODO split out EventDispatcher and EventRegister
class EventDispatcher implements IListener<Event> {

  private final static Logger LOGGER = LoggerFactory.getLogger(EventDispatcher.class)

  List<Mapping> registered = []

  // Dispatch
  @Override
  void handle(Event event) {
    LOGGER.debug("Received an event ${event.class.name}")

    registered.findAll { it.event == event.getClass() }
            .findAll { it.matcher(event) }
            .each { dispatch(event, it.closure) }
  }

  private EventContext prepareContext(Event event) {
    String className = "io.greeb.core.discord.contexts.${event.getClass().simpleName}Context"

    // todo load all classes ahead of time and use them here
    (EventContext) this.class.classLoader.loadClass(className).newInstance(event)
  }

  private dispatch(Event event, Closure closure) {
    EventContext context = prepareContext(event)

    def script = closure.rehydrate(context, this, this)
    script.resolveStrategy = Closure.DELEGATE_ONLY
    // todo add some dependancy injection
    script()
  }

  // Registration
  void register(Class<Event> event, Closure closure, Closure<Boolean> matcher) {
    LOGGER.debug("new consumer registered to $event.simpleName")
    registered << new Mapping(event, closure, matcher)
  }

  void register(String pattern, Closure closure) {
    LOGGER.debug("new consumer registered to $MessageReceivedEvent.simpleName")
    registered << new Mapping(pattern, closure)
  }

  void register(String pattern, String channel, Closure closure) {
    LOGGER.debug("new consumer registered to $MessageReceivedEvent.simpleName")
    registered << new Mapping(pattern, channel, closure)
  }

}

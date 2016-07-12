package io.greeb.core.discord

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import sx.blah.discord.api.Event
import sx.blah.discord.api.IListener
import sx.blah.discord.handle.impl.events.MessageReceivedEvent

class EventDispatcher implements IListener<Event> {

  private final static Logger LOGGER = LoggerFactory.getLogger(EventDispatcher.class)

  List<Mapping> registered = []

  public EventDispatcher(List<Mapping> registered){
    this.registered = registered
  }

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

}

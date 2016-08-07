package io.greeb.core.discord

import com.google.inject.Injector
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import sx.blah.discord.api.events.Event
import sx.blah.discord.api.events.IListener

class EventDispatcher implements IListener<Event> {

  private final static Logger LOGGER = LoggerFactory.getLogger(EventDispatcher.class)

  final List<Mapping> registered
  final Injector injector
  final Map properties

  public EventDispatcher(List<Mapping> registered, Injector injector, Map properties) {
    this.registered = registered
    this.injector = injector
    this.properties = properties
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
    (EventContext) this.class.classLoader.loadClass(className).newInstance(event, this, properties)
  }

  private dispatch(Event event, Closure closure) {
    EventContext context = prepareContext(event)

    def script = closure.rehydrate(context, this, this)
    script.resolveStrategy = Closure.DELEGATE_FIRST
    // todo add some dependancy injection
    script(*getInjectedParams(closure))
  }

  private List<Object> getInjectedParams(Closure closure) {
    closure.getParameterTypes().collect { injector.getInstance(it) }
  }

  public <T extends Event> void unregister(Class<T> eventClass, T event){
    registered.removeIf({ matcher ->
      matcher.event == eventClass && matcher.matcher.call(event)
    })
  }

}

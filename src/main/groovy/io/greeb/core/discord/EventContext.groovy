package io.greeb.core.discord

import sx.blah.discord.api.events.Event
import sx.blah.discord.api.IDiscordClient
import sx.blah.discord.handle.impl.events.MessageReceivedEvent
import sx.blah.discord.handle.obj.IChannel
import sx.blah.discord.handle.obj.IMessage

class EventContext<T extends Event> {

  final T event

  final EventDispatcher eventDispatcher

  final IDiscordClient client

  final Map properties

  public EventContext(T event, EventDispatcher eventDispatcher, Map properties) {
    this.event = event
    this.client = event.client
    this.eventDispatcher = eventDispatcher
    this.properties = properties
  }

  public <T extends Event> void unregister(Class<T> event, T matchesEvent) {
    eventDispatcher.unregister(event, matchesEvent);
  }

  public void unregister(String message) {
    MessageReceivedEvent mockEvent = new MessageReceivedEvent([getContent: { message },
                                                               getChannel: {
                                                                 [getID: { "" },
                                                                  isPrivate: { false },
                                                                  getName  : { '' }] as IChannel
                                                               }
    ] as IMessage)

    eventDispatcher.unregister(MessageReceivedEvent, mockEvent);
  }

  public void unregister(String message, String channel) {
    MessageReceivedEvent mockEvent = new MessageReceivedEvent([
            getContent: { message },
            getChannel: { [getName: { channel }] as IChannel }
    ] as IMessage)

    eventDispatcher.unregister(MessageReceivedEvent, mockEvent);
  }

}

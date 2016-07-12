package io.greeb.core

import io.greeb.core.discord.EventDispatcher
import io.greeb.core.dsl.DSL.GreebSpec
import sx.blah.discord.api.ClientBuilder
import sx.blah.discord.api.IDiscordClient

public class Greeb {

  GreebSpec spec
  IDiscordClient wrappedClient

  public void setup(GreebSpec spec) {
    this.spec = spec

    EventDispatcher eventDispatcher = new EventDispatcher(spec.eventRegister.registered)

    connect(spec.secret, eventDispatcher)
  }

  public void connect(String secret, EventDispatcher eventDispatcher) {
    ClientBuilder clientBuilder = new ClientBuilder()
    clientBuilder.withToken(secret)
    wrappedClient = clientBuilder.login()
    wrappedClient.getDispatcher().registerListener(eventDispatcher)
  }

}

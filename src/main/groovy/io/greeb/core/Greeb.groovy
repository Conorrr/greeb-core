package io.greeb.core

import io.greeb.core.discord.EventDispatcher
import io.greeb.core.dsl.DSL.GreebSpec
import sx.blah.discord.api.ClientBuilder
import sx.blah.discord.api.IDiscordClient

public class Greeb {

  GreebSpec spec
  IDiscordClient wrappedClient

  // todo create register

  public void setup(GreebSpec spec) {
    this.spec = spec

    // todo go through consumers and map them to register

    connect(spec.secret, spec.eventDispatcher)
  }

  public void connect(String secret, EventDispatcher eventDispatcher) {
    ClientBuilder clientBuilder = new ClientBuilder()
    clientBuilder.withToken(secret)
    wrappedClient = clientBuilder.login()
    wrappedClient.getDispatcher().registerListener(eventDispatcher)
  }

  public void run() {

  }

}

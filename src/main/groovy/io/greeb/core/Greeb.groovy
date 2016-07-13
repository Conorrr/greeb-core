package io.greeb.core

import com.google.inject.Guice
import com.google.inject.Injector
import io.greeb.core.discord.EventDispatcher
import io.greeb.core.dsl.DSL.GreebSpec
import io.greeb.core.dsl.GreebPropertiesModule
import sx.blah.discord.api.ClientBuilder
import sx.blah.discord.api.IDiscordClient

public class Greeb {

  GreebSpec spec
  IDiscordClient wrappedClient
  Injector guiceInjector

  public void setup(GreebSpec spec) {
    this.spec = spec

    GreebPropertiesModule propertiesModule = new GreebPropertiesModule(spec.properties)

    guiceInjector = Guice.createInjector(spec.bindingSpec.modules + propertiesModule)

    EventDispatcher eventDispatcher = new EventDispatcher(spec.eventRegister.registered, guiceInjector)

    connect(spec.secret, eventDispatcher)
  }

  public void connect(String secret, EventDispatcher eventDispatcher) {
    ClientBuilder clientBuilder = new ClientBuilder()
    clientBuilder.withToken(secret)
    wrappedClient = clientBuilder.login()
    wrappedClient.getDispatcher().registerListener(eventDispatcher)
  }

}

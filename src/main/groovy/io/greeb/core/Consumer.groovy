package io.greeb.core

import io.greeb.core.discord.PrivateMessage
import io.greeb.core.discord.PublicMessage
import io.greeb.core.dsl.DataSourceSpec

trait Consumer {

  public abstract String name()

  public abstract String author()

  public abstract void configure(@DelegatesTo(value = DataSourceSpec.class) Closure configuration)

  public abstract void consume(PublicMessage publicMessage)

  public abstract void consume(PrivateMessage privateMessage)

}
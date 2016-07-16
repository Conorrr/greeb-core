package io.greeb.core.dsl

import com.google.inject.AbstractModule
import com.google.inject.name.Names

public class GreebPropertiesModule extends AbstractModule {

  Map properties

  public GreebPropertiesModule(Map properties) {
    this.properties = properties
  }

  @Override
  protected void configure() {
    addMap('', properties)
  }

  private void addMap(String prefix, Map ele) {
    ele.each { k, v ->
      if (v instanceof Map) {
        bind(Map).annotatedWith(Names.named(prefix + k))
                .toInstance(v as Map)
        addMap(k + '.', v)
      } else if (v instanceof List) {
        bind(List).annotatedWith(Names.named(prefix + k))
                .toInstance(v as List)
      } else {
        bindConstant().annotatedWith(Names.named(prefix + k))
                .to(v)
      }
    }
  }

}

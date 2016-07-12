package io.greeb.core.dsl

import io.greeb.core.Greeb
import io.greeb.core.discord.EventDispatcher

public abstract class DSL {

  private DSL() {
    // shouldn't be publicly creatable
  }

  public static void greeb(@DelegatesTo(GreebSpec) Closure<?> closure) {
    GreebSpec greebSpec = new GreebSpec()
    EventDispatcher eventDispatcher = new EventDispatcher()

    greebSpec.eventDispatcher = eventDispatcher

    def script = closure.rehydrate(greebSpec, this, this)
    script.resolveStrategy = Closure.DELEGATE_ONLY
    script()

    startServer(greebSpec)
  }

  private static void startServer(GreebSpec spec) {
    Greeb greeb = new Greeb()
    greeb.setup(spec)
  }

  public static class GreebSpec {

    String secret
    Map properties = [:]
    EventDispatcher eventDispatcher

    public void credentials(String secret) {
      this.secret = secret
    }

    public void properties(String path) {
      properties += PropertyLoader.loadFile(path)
    }

    public void bindings(@DelegatesTo(BindingSpec) Closure closure) {
      BindingSpec bindingSpec = new BindingSpec()
      def script = closure.rehydrate(bindingSpec, this, this)
      script.resolveStrategy = Closure.DELEGATE_ONLY
      script()
    }

    public void consumers(@DelegatesTo(ConsumerSpec) Closure closure) {
      ConsumerSpec consumerSpec = new ConsumerSpec(eventDispatcher)
      def script = closure.rehydrate(consumerSpec, this, this)
      script.resolveStrategy = Closure.DELEGATE_ONLY
      script()
    }

  }
}

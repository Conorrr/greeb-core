package io.greeb.core.dsl

import io.greeb.core.Greeb
import io.greeb.core.discord.EventRegister

public abstract class DSL {

  private DSL() {
    // shouldn't be publicly creatable
  }

  public static void greeb(@DelegatesTo(value = GreebSpec, strategy = Closure.DELEGATE_FIRST) Closure<?> closure) {
    GreebSpec greebSpec = new GreebSpec()

    def script = closure.rehydrate(greebSpec, this, this)
    script.resolveStrategy = Closure.DELEGATE_FIRST
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
    Closure appStart = {/*do nothing*/ }
    EventRegister eventRegister = new EventRegister()
    BindingSpec bindingSpec = new BindingSpec()

    public void credentials(String secret) {
      this.secret = secret
    }

    public void properties(String path) {
      properties += PropertyLoader.loadFile(path)
    }

    public void bindings(@DelegatesTo(value = BindingSpec, strategy = Closure.DELEGATE_FIRST) Closure closure) {
      def script = closure.rehydrate(bindingSpec, this, this)
      script.resolveStrategy = Closure.DELEGATE_FIRST
      script()
    }

    public void onAppStart(Closure closure) {
      this.appStart = closure
    }

    public void consumers(@DelegatesTo(value = ConsumerSpec, strategy = Closure.DELEGATE_FIRST) Closure closure) {
      ConsumerSpec consumerSpec = new ConsumerSpec(eventRegister)
      def script = closure.rehydrate(consumerSpec, this, this)
      script.resolveStrategy = Closure.DELEGATE_FIRST
      script()
    }

  }
}

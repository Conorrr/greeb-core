package io.greeb.core.dsl

public abstract class DSL {

  private DSL() {
    // shouldn't be publicly creatable
  }

  public static void greeb(@DelegatesTo(value = GreebSpec) Closure<?> closure) {
    GreebSpec greebSpec = new GreebSpec()
    def script = closure.rehydrate(greebSpec, this, this)
    script.resolveStrategy = Closure.DELEGATE_ONLY
    script()
  }

  public static class GreebSpec {

    public void dataSources(@DelegatesTo(value = DataSourceSpec.class) Closure closure) {
      DataSourceSpec dataSourceSpec = new DataSourceSpec()
      def script = closure.rehydrate(dataSourceSpec, this, this)
      script.resolveStrategy = Closure.DELEGATE_ONLY
      script()
    }

    public void bindings(@DelegatesTo(value = BindingSpec.class) Closure closure) {
      BindingSpec bindingSpec = new BindingSpec()
      def script = closure.rehydrate(bindingSpec, this, this)
      script.resolveStrategy = Closure.DELEGATE_ONLY
      script()
    }

    public void consumers(@DelegatesTo(value = ConsumerSpec.class) Closure closure) {
      ConsumerSpec consumerSpec = new ConsumerSpec()
      def script = closure.rehydrate(consumerSpec, this, this)
      script.resolveStrategy = Closure.DELEGATE_ONLY
      script()
    }
  }
}

package io.greeb.core.dsl

import com.google.inject.Module

class BindingSpec {

  final List<Module> modules = []

  public void module(Module module) {
    this.modules.add(module)
  }

  public void module(Class<? extends Module> moduleClass) {
    module(createModule(moduleClass))
  }

  private static <T extends Module> T createModule(Class<T> clazz) {
    try {
      return clazz.newInstance()
    } catch (ReflectiveOperationException e) {
      throw new IllegalStateException("Module " + clazz.getName() + " is not reflectively instantiable", e)
    }
  }
}
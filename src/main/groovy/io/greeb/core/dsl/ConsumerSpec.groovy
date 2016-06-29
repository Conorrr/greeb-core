package io.greeb.core.dsl

import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.Multimap
import io.greeb.core.Consumer

public class ConsumerSpec {

    Multimap<Class<Consumer>, Map<String, String>> consumers = ArrayListMultimap.create()

    public void add(Class<Consumer> klass, Map properties = [:]) {
        consumers.put(klass, properties)
    }
}
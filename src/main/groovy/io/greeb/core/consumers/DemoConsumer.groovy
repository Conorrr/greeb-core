package io.greeb.core.consumers

import io.greeb.core.Consumer
import io.greeb.core.discord.PrivateMessage
import io.greeb.core.discord.PublicMessage

class DemoConsumer implements Consumer {
    @Override
    String name() {
        return "Demo Consumer"
    }

    @Override
    String author() {
        return null
    }

    @Override
    void configure(Closure configuration) {

    }

    @Override
    void consume(PublicMessage message) {

    }

    @Override
    void consume(PrivateMessage privateMessage) {

    }

}

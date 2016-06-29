import io.greeb.core.consumers.DemoConsumer

import static io.greeb.core.dsl.DSL.greeb

greeb{
    dataSources{

    }
    consumers {
        add DemoConsumer
        add DemoConsumer, [:]
    }
}
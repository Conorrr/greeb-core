# Greeb.io Core

Greeb is a groovy wrapper around [Discord4J](https://github.com/austinv11/Discord4J).

It was designed to make writing bots cleaner and easier. The project is still in it's very infancy expect bugs and lots of missing features. Feel free to contribute ideas and pull requests.  The project is not currently distributed anywhere; if you wish to use it you will need to download and install the project locally.

## Example Greeb bot

```
import static io.greeb.core.dsl.DSL.greeb

greeb {
  credentials new File('discord.token').text

  consumers {
    messageReceived(/^!echo/) {
      respond(content)
    }

  }
}
```

## Todo
* Add more detailed logging throughout
* Expand utility methods in Event Contexts
* Reduce the number of contexts to a more managable number by reusing them
* Add helper to load token from file
* Documentation
* Guice Integration
* Make user-agent configurable
* Add better support for multiple guilds
* Add pluginable modules
* Write gradle plugin to make developing easier
* Unit tests
* Integration tests
* Test helpers

## How to use
Todo

## Logging
Todo

## FAQs

### Why do you not use the event dispatcher built into Discord4J
Firstly it made integrating with Groovy a bit messier. Secondly I did not want to couple the framework too tightly to Discord4J in case we want to change the Discord API interface.

## Contributing
Todo

## Contact
Feel free to contact me if you have any questions at greeb@greeb.io

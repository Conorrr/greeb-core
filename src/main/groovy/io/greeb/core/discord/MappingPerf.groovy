package io.greeb.core.discord

import sx.blah.discord.handle.impl.events.MessageReceivedEvent
import sx.blah.discord.handle.obj.IMessage

class MappingPerf {

  static Random random = new Random()

  static def alphabet = (('A'..'Z') + ('a'..'z') + ('0'..'9') + '              ').join()

  static void runTest() {
    def messages = generateMessages()

    Mapping mapping = new Mapping("!something", {})

    def start = System.currentTimeMillis()

    messages.each {
      mapping.matcher(it)
    }

    println(System.currentTimeMillis() - start)
  }

  static List<String> generateMessages() {

    def messages = []

    for (def i = 0; i < 100000; i++) {
      def message = generator(alphabet, random.nextInt(90) + 10)

      if (random.nextBoolean() &&random.nextBoolean() &&random.nextBoolean()){
        message = "!something " + message
      }

      MessageReceivedEvent event = new MessageReceivedEvent([getContent: { return message }] as IMessage)
      messages << event
    }

    messages
  }

  def static generator = { String alphabet, int n ->
    random.with {
      (1..n).collect { alphabet[nextInt(alphabet.length())] }.join()
    }
  }


  public static void main(String... args) {
    runTest()
  }

}

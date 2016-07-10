package io.greeb.core.discord

import spock.lang.Specification
import sx.blah.discord.api.Event
import sx.blah.discord.handle.impl.events.MessageReceivedEvent
import sx.blah.discord.handle.obj.IChannel
import sx.blah.discord.handle.obj.IMessage

class MappingTest extends Specification {

  def "event should default to returning true"() {
    when:
    Mapping mapping = new Mapping(MessageReceivedEvent, {}, { true })

    then:
    mapping.matcher(new MessageReceivedEvent(null))
  }

  def "matcher should run regex against message"() {
    setup:
    def event = Stub(MessageReceivedEvent) {
      getMessage() >> Stub(IMessage) {
        getContent() >> content
      }
    }

    def mapping = new Mapping(pattern, {})

    expect:
    matches == mapping.matcher(event)

    where:
    pattern | content   | matches
    ''      | 'hmm h'   | true
    /^abc/  | 'abcde'   | true
    /^abc/  | 'bcde'    | false
    /.*/    | 'abcde'   | true
    /mid/   | 'a mid b' | true
  }

  def "matcher should check channel"() {
    setup:
    def event = Stub(MessageReceivedEvent) {
      getMessage() >> Stub(IMessage) {
        getContent() >> ""
        getChannel() >> Stub(IChannel) {
          getName() >> actual
        }
      }
    }

    def mapper = new Mapping(/.*/, channel, {})

    expect:
    matches == mapper.matcher(event)

    where:
    actual | channel | matches
    'cha'  | 'cha'   | true
    'cha'  | 'CHA'   | true
    'cHa'  | 'ChA'   | true
    'cha'  | 'abc'   | false
  }

  def "should not check message content if channel is wrong"() {
    setup:
    def messageStub = Mock(IMessage) {
      getContent() >> ""
      getChannel() >> Stub(IChannel) {
        getName() >> "channel"
      }
    }

    def event = Stub(MessageReceivedEvent) {
      getMessage() >> messageStub
    }

    def mapper = new Mapping(/.*/, "wrong", {})

    when:
    mapper.matcher(event)

    then:
    0 * messageStub.getContent()
  }

}

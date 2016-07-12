package io.greeb.core.discord

import spock.lang.Specification
import sx.blah.discord.handle.impl.events.MessageReceivedEvent
import sx.blah.discord.handle.obj.IChannel
import sx.blah.discord.handle.obj.IMessage

import static io.greeb.core.discord.DiscordMatchers.channelMatches
import static io.greeb.core.discord.DiscordMatchers.combine
import static io.greeb.core.discord.DiscordMatchers.messageMatches

class DiscordMatchersTest extends Specification {

  def "matcher should run regex against message"() {
    setup:
    def event = Stub(MessageReceivedEvent) {
      getMessage() >> Stub(IMessage) {
        getContent() >> content
      }
    }

    expect:
    matches == messageMatches(pattern)(event)

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

    expect:
    matches == channelMatches(channel)(event)

    where:
    actual | channel | matches
    'cha'  | 'cha'   | true
    'cha'  | 'CHA'   | true
    'cHa'  | 'ChA'   | true
    'cha'  | 'abc'   | false
  }

//  def "isPrivate"

  def "should combine multiple boolean returning closures"() {
    expect:
    result == combine({ closure1 }, { closure2 })()

    where:
    closure1 | closure2 | result
    true     | true     | true
    true     | false    | false
    false    | true     | false
    false    | false    | false
  }

  def "should not check message content if channel is wrong"() {
    setup:
    def internal = true
    def closure1 = { false }
    def closure2 = { internal = false }

    combine(closure1, closure2)()

    expect:
    internal
  }

}

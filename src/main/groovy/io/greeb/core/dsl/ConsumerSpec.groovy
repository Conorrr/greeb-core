package io.greeb.core.dsl

import groovy.transform.stc.ClosureParams
import groovy.transform.stc.SimpleType
import io.greeb.core.discord.EventDispatcher
import io.greeb.core.discord.contexts.*
import sx.blah.discord.handle.impl.events.*

public class ConsumerSpec {

  EventDispatcher eventDispatcher

  ConsumerSpec(EventDispatcher eventDispatcher) {
    this.eventDispatcher = eventDispatcher
  }

  // matchers with patterns
  public void messageReceived(String pattern,
                              @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.MessageReceivedEvent"])
                              @DelegatesTo(MessageReceivedEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(pattern, eventClosure)
  }

  public void messageReceived(String pattern, String channel,
                              @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.MessageReceivedEvent"])
                              @DelegatesTo(MessageReceivedEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(pattern, channel, eventClosure)
  }

  // specific event matchers
  public void audioPlay(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.AudioPlayEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(AudioPlayEventContext) Closure eventClosure) {
    eventDispatcher.register(AudioPlayEvent, eventClosure, filter)
  }

  public void audioQueued(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.AudioQueuedEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(AudioQueuedEventContext) Closure eventClosure) {
    eventDispatcher.register(AudioQueuedEvent, eventClosure, filter)
  }

  public void audioReceive(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.AudioReceiveEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(AudioReceiveEventContext) Closure eventClosure) {
    eventDispatcher.register(AudioReceiveEvent, eventClosure, filter)
  }

  public void audioStop(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.AudioStopEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(AudioStopEventContext) Closure eventClosure) {
    eventDispatcher.register(AudioStopEvent, eventClosure, filter)
  }

  public void audioUnqueued(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.AudioUnqueuedEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(AudioUnqueuedEventContext) Closure eventClosure) {
    eventDispatcher.register(AudioUnqueuedEvent, eventClosure, filter)
  }

  public void channelCreate(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.ChannelCreateEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(ChannelCreateEventContext) Closure eventClosure) {
    eventDispatcher.register(ChannelCreateEvent, eventClosure, filter)
  }

  public void channelDelete(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.ChannelDeleteEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(ChannelDeleteEventContext) Closure eventClosure) {
    eventDispatcher.register(ChannelDeleteEvent, eventClosure, filter)
  }

  public void channelUpdate(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.ChannelUpdateEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(ChannelUpdateEventContext) Closure eventClosure) {
    eventDispatcher.register(ChannelUpdateEvent, eventClosure, filter)
  }

  public void discordDisconnected(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.DiscordDisconnectedEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(DiscordDisconnectedEventContext) Closure eventClosure) {
    eventDispatcher.register(DiscordDisconnectedEvent, eventClosure, filter)
  }

  public void gameChange(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.GameChangeEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(GameChangeEventContext) Closure eventClosure) {
    eventDispatcher.register(GameChangeEvent, eventClosure, filter)
  }

  public void guildCreate(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.GuildCreateEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(GuildCreateEventContext) Closure eventClosure) {
    eventDispatcher.register(GuildCreateEvent, eventClosure, filter)
  }

  public void guildLeave(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.GuildLeaveEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(GuildLeaveEventContext) Closure eventClosure) {
    eventDispatcher.register(GuildLeaveEvent, eventClosure, filter)
  }

  public void guildTransferOwnership(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.GuildTransferOwnershipEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(GuildTransferOwnershipEventContext) Closure eventClosure) {
    eventDispatcher.register(GuildTransferOwnershipEvent, eventClosure, filter)
  }

  public void guildUnavailable(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.GuildUnavailableEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(GuildUnavailableEventContext) Closure eventClosure) {
    eventDispatcher.register(GuildUnavailableEvent, eventClosure, filter)
  }

  public void guildUpdate(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.GuildUpdateEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(GuildUpdateEventContext) Closure eventClosure) {
    eventDispatcher.register(GuildUpdateEvent, eventClosure, filter)
  }

  public void inviteReceived(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.InviteReceivedEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(InviteReceivedEventContext) Closure eventClosure) {
    eventDispatcher.register(InviteReceivedEvent, eventClosure, filter)
  }

  public void mention(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.MentionEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(MentionEventContext) Closure eventClosure) {
    eventDispatcher.register(MentionEvent, eventClosure, filter)
  }

  public void messageDelete(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.MessageDeleteEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(MessageDeleteEventContext) Closure eventClosure) {
    eventDispatcher.register(MessageDeleteEvent, eventClosure, filter)
  }

  public void messageReceived(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.MessageReceivedEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(MessageReceivedEventContext) Closure eventClosure) {
    eventDispatcher.register(MessageReceivedEvent, eventClosure, filter)
  }

  public void messageSend(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.MessageSendEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(MessageSendEventContext) Closure eventClosure) {
    eventDispatcher.register(MessageSendEvent, eventClosure, filter)
  }

  public void messageUpdate(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.MessageUpdateEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(MessageUpdateEventContext) Closure eventClosure) {
    eventDispatcher.register(MessageUpdateEvent, eventClosure, filter)
  }

  public void moduleDisabled(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.ModuleDisabledEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(ModuleDisabledEventContext) Closure eventClosure) {
    eventDispatcher.register(ModuleDisabledEvent, eventClosure, filter)
  }

  public void moduleEnabled(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.ModuleEnabledEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(ModuleEnabledEventContext) Closure eventClosure) {
    eventDispatcher.register(ModuleEnabledEvent, eventClosure, filter)
  }

  public void presenceUpdate(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.PresenceUpdateEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(PresenceUpdateEventContext) Closure eventClosure) {
    eventDispatcher.register(PresenceUpdateEvent, eventClosure, filter)
  }

  public void ready(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.ReadyEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(ReadyEventContext) Closure eventClosure) {
    eventDispatcher.register(ReadyEvent, eventClosure, filter)
  }

  public void roleCreate(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.RoleCreateEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(RoleCreateEventContext) Closure eventClosure) {
    eventDispatcher.register(RoleCreateEvent, eventClosure, filter)
  }

  public void roleDelete(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.RoleDeleteEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(RoleDeleteEventContext) Closure eventClosure) {
    eventDispatcher.register(RoleDeleteEvent, eventClosure, filter)
  }

  public void roleUpdate(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.RoleUpdateEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(RoleUpdateEventContext) Closure eventClosure) {
    eventDispatcher.register(RoleUpdateEvent, eventClosure, filter)
  }

  public void typing(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.TypingEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(TypingEventContext) Closure eventClosure) {
    eventDispatcher.register(TypingEvent, eventClosure, filter)
  }

  public void userBan(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.UserBanEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(UserBanEventContext) Closure eventClosure) {
    eventDispatcher.register(UserBanEvent, eventClosure, filter)
  }

  public void userJoin(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.UserJoinEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(UserJoinEventContext) Closure eventClosure) {
    eventDispatcher.register(UserJoinEvent, eventClosure, filter)
  }

  public void userLeave(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.UserPardonEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(UserPardonEventContext) Closure eventClosure) {
    eventDispatcher.register(UserPardonEvent, eventClosure, filter)
  }

  public void userPardon(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.UserPardonEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(UserPardonEventContext) Closure eventClosure) {
    eventDispatcher.register(UserPardonEvent, eventClosure, filter)
  }

  public void userRoleUpdate(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.UserRoleUpdateEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(UserRoleUpdateEventContext) Closure eventClosure) {
    eventDispatcher.register(UserRoleUpdateEvent, eventClosure, filter)
  }

  public void userUpdate(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.UserUpdateEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(UserUpdateEventContext) Closure eventClosure) {
    eventDispatcher.register(UserUpdateEvent, eventClosure, filter)
  }

  public void userVoiceChannelJoin(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.UserVoiceChannelJoinEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(UserVoiceChannelJoinEventContext) Closure eventClosure) {
    eventDispatcher.register(UserVoiceChannelJoinEvent, eventClosure, filter)
  }

  public void userVoiceChannelLeave(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.UserVoiceChannelLeaveEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(UserVoiceChannelLeaveEventContext) Closure eventClosure) {
    eventDispatcher.register(UserVoiceChannelLeaveEvent, eventClosure, filter)
  }

  public void userVoiceChannelMove(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.UserVoiceChannelMoveEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(UserVoiceChannelMoveEventContext) Closure eventClosure) {
    eventDispatcher.register(UserVoiceChannelMoveEvent, eventClosure, filter)
  }

  public void userVoiceStateUpdate(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.UserVoiceStateUpdateEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(UserVoiceStateUpdateEventContext) Closure eventClosure) {
    eventDispatcher.register(UserVoiceStateUpdateEvent, eventClosure, filter)
  }

  public void voiceChannelCreate(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.VoiceChannelCreateEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(VoiceChannelCreateEventContext) Closure eventClosure) {
    eventDispatcher.register(VoiceChannelCreateEvent, eventClosure, filter)
  }

  public void voiceChannelDelete(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.VoiceChannelDeleteEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(VoiceChannelDeleteEventContext) Closure eventClosure) {
    eventDispatcher.register(VoiceChannelDeleteEvent, eventClosure, filter)
  }

  public void voiceChannelUpdate(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.VoiceChannelUpdateEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(VoiceChannelUpdateEventContext) Closure eventClosure) {
    eventDispatcher.register(VoiceChannelUpdateEvent, eventClosure, filter)
  }

  public void voiceDisconnected(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.VoiceDisconnectedEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(VoiceDisconnectedEventContext) Closure eventClosure) {
    eventDispatcher.register(VoiceDisconnectedEvent, eventClosure, filter)
  }

  public void voicePing(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.VoicePingEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(VoicePingEventContext) Closure eventClosure) {
    eventDispatcher.register(VoicePingEvent, eventClosure, filter)
  }

  public void voiceUserSpeaking(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.VoiceUserSpeakingEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(VoiceUserSpeakingEventContext) Closure eventClosure) {
    eventDispatcher.register(VoiceUserSpeakingEvent, eventClosure, filter)
  }

}
package io.greeb.core.dsl

import groovy.transform.stc.ClosureParams
import groovy.transform.stc.SimpleType
import io.greeb.core.discord.EventRegister
import io.greeb.core.discord.contexts.*
import sx.blah.discord.handle.impl.events.*

import static io.greeb.core.dsl.DiscordMatchers.channelMatches
import static io.greeb.core.dsl.DiscordMatchers.combine
import static io.greeb.core.dsl.DiscordMatchers.messageMatches
import static io.greeb.core.dsl.DiscordMatchers.privateChat

public class ConsumerSpec {

  EventRegister eventRegister

  ConsumerSpec(EventRegister eventRegister) {
    this.eventRegister = eventRegister
  }

  // message in any channel matches pattern
  public Closure messageReceived(String pattern,
                              @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.MessageReceivedEvent"])
                              @DelegatesTo(MessageReceivedEventContext) Closure eventClosure) {
    messageReceived(messageMatches(pattern), eventClosure)
  }

  // message matches pattern in private channel
  public Closure privateMessageReceived(String pattern,
                                     @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.MessageReceivedEvent"])
                                     @DelegatesTo(MessageReceivedEventContext) Closure eventClosure) {
    messageReceived(combine(privateChat(), messageMatches(pattern)), eventClosure)
  }

  // message matches pattern in private or public channel
  public Closure messageReceived(String pattern, String channel,
                              @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.MessageReceivedEvent"])
                              @DelegatesTo(MessageReceivedEventContext) Closure eventClosure) {
    messageReceived(combine(channelMatches(channel)), eventClosure);
  }

  // specific event matchers
  public Closure audioPlay(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.AudioPlayEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(AudioPlayEventContext) Closure eventClosure) {
    eventRegister.register(AudioPlayEvent,eventClosure, filter)
    eventClosure
  }

  public Closure audioQueued(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.AudioQueuedEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(AudioQueuedEventContext) Closure eventClosure) {
    eventRegister.register(AudioQueuedEvent,eventClosure, filter)
    eventClosure
  }

  public Closure audioReceive(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.AudioReceiveEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(AudioReceiveEventContext) Closure eventClosure) {
    eventRegister.register(AudioReceiveEvent,eventClosure, filter)
    eventClosure
  }

  public Closure audioStop(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.AudioStopEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(AudioStopEventContext) Closure eventClosure) {
    eventRegister.register(AudioStopEvent,eventClosure, filter)
    eventClosure
  }

  public Closure audioUnqueued(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.AudioUnqueuedEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(AudioUnqueuedEventContext) Closure eventClosure) {
    eventRegister.register(AudioUnqueuedEvent,eventClosure, filter)
    eventClosure
  }

  public Closure channelCreate(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.ChannelCreateEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(ChannelCreateEventContext) Closure eventClosure) {
    eventRegister.register(ChannelCreateEvent,eventClosure, filter)
    eventClosure
  }

  public Closure channelDelete(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.ChannelDeleteEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(ChannelDeleteEventContext) Closure eventClosure) {
    eventRegister.register(ChannelDeleteEvent,eventClosure, filter)
    eventClosure
  }

  public Closure channelUpdate(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.ChannelUpdateEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(ChannelUpdateEventContext) Closure eventClosure) {
    eventRegister.register(ChannelUpdateEvent,eventClosure, filter)
    eventClosure
  }

  public Closure discordDisconnected(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.DiscordDisconnectedEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(DiscordDisconnectedEventContext) Closure eventClosure) {
    eventRegister.register(DiscordDisconnectedEvent,eventClosure, filter)
    eventClosure
  }

  public Closure gameChange(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.GameChangeEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(GameChangeEventContext) Closure eventClosure) {
    eventRegister.register(GameChangeEvent,eventClosure, filter)
    eventClosure
  }

  public Closure guildCreate(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.GuildCreateEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(GuildCreateEventContext) Closure eventClosure) {
    eventRegister.register(GuildCreateEvent,eventClosure, filter)
    eventClosure
  }

  public Closure guildLeave(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.GuildLeaveEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(GuildLeaveEventContext) Closure eventClosure) {
    eventRegister.register(GuildLeaveEvent,eventClosure, filter)
    eventClosure
  }

  public Closure guildTransferOwnership(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.GuildTransferOwnershipEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(GuildTransferOwnershipEventContext) Closure eventClosure) {
    eventRegister.register(GuildTransferOwnershipEvent,eventClosure, filter)
    eventClosure
  }

  public Closure guildUnavailable(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.GuildUnavailableEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(GuildUnavailableEventContext) Closure eventClosure) {
    eventRegister.register(GuildUnavailableEvent,eventClosure, filter)
    eventClosure
  }

  public Closure guildUpdate(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.GuildUpdateEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(GuildUpdateEventContext) Closure eventClosure) {
    eventRegister.register(GuildUpdateEvent,eventClosure, filter)
    eventClosure
  }

  public Closure inviteReceived(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.InviteReceivedEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(InviteReceivedEventContext) Closure eventClosure) {
    eventRegister.register(InviteReceivedEvent,eventClosure, filter)
    eventClosure
  }

  public Closure mention(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.MentionEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(MentionEventContext) Closure eventClosure) {
    eventRegister.register(MentionEvent,eventClosure, filter)
    eventClosure
  }

  public Closure messageDelete(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.MessageDeleteEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(MessageDeleteEventContext) Closure eventClosure) {
    eventRegister.register(MessageDeleteEvent,eventClosure, filter)
    eventClosure
  }

  public Closure messageReceived(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.MessageReceivedEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(MessageReceivedEventContext) Closure eventClosure) {
    eventRegister.register(MessageReceivedEvent,eventClosure, filter)
    eventClosure
  }

  public Closure messageSend(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.MessageSendEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(MessageSendEventContext) Closure eventClosure) {
    eventRegister.register(MessageSendEvent,eventClosure, filter)
    eventClosure
  }

  public Closure messageUpdate(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.MessageUpdateEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(MessageUpdateEventContext) Closure eventClosure) {
    eventRegister.register(MessageUpdateEvent,eventClosure, filter)
    eventClosure
  }

  public Closure moduleDisabled(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.ModuleDisabledEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(ModuleDisabledEventContext) Closure eventClosure) {
    eventRegister.register(ModuleDisabledEvent,eventClosure, filter)
    eventClosure
  }

  public Closure moduleEnabled(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.ModuleEnabledEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(ModuleEnabledEventContext) Closure eventClosure) {
    eventRegister.register(ModuleEnabledEvent,eventClosure, filter)
    eventClosure
  }

  public Closure presenceUpdate(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.PresenceUpdateEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(PresenceUpdateEventContext) Closure eventClosure) {
    eventRegister.register(PresenceUpdateEvent,eventClosure, filter)
    eventClosure
  }

  public Closure ready(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.ReadyEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(ReadyEventContext) Closure eventClosure) {
    eventRegister.register(ReadyEvent,eventClosure, filter)
    eventClosure
  }

  public Closure roleCreate(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.RoleCreateEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(RoleCreateEventContext) Closure eventClosure) {
    eventRegister.register(RoleCreateEvent,eventClosure, filter)
    eventClosure
  }

  public Closure roleDelete(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.RoleDeleteEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(RoleDeleteEventContext) Closure eventClosure) {
    eventRegister.register(RoleDeleteEvent,eventClosure, filter)
    eventClosure
  }

  public Closure roleUpdate(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.RoleUpdateEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(RoleUpdateEventContext) Closure eventClosure) {
    eventRegister.register(RoleUpdateEvent,eventClosure, filter)
    eventClosure
  }

  public Closure typing(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.TypingEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(TypingEventContext) Closure eventClosure) {
    eventRegister.register(TypingEvent,eventClosure, filter)
    eventClosure
  }

  public Closure userBan(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.UserBanEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(UserBanEventContext) Closure eventClosure) {
    eventRegister.register(UserBanEvent,eventClosure, filter)
    eventClosure
  }

  public Closure userJoin(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.UserJoinEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(UserJoinEventContext) Closure eventClosure) {
    eventRegister.register(UserJoinEvent,eventClosure, filter)
    eventClosure
  }

  public Closure userLeave(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.UserPardonEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(UserPardonEventContext) Closure eventClosure) {
    eventRegister.register(UserPardonEvent,eventClosure, filter)
    eventClosure
  }

  public Closure userPardon(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.UserPardonEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(UserPardonEventContext) Closure eventClosure) {
    eventRegister.register(UserPardonEvent,eventClosure, filter)
    eventClosure
  }

  public Closure userRoleUpdate(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.UserRoleUpdateEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(UserRoleUpdateEventContext) Closure eventClosure) {
    eventRegister.register(UserRoleUpdateEvent,eventClosure, filter)
    eventClosure
  }

  public Closure userUpdate(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.UserUpdateEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(UserUpdateEventContext) Closure eventClosure) {
    eventRegister.register(UserUpdateEvent,eventClosure, filter)
    eventClosure
  }

  public Closure userVoiceChannelJoin(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.UserVoiceChannelJoinEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(UserVoiceChannelJoinEventContext) Closure eventClosure) {
    eventRegister.register(UserVoiceChannelJoinEvent,eventClosure, filter)
    eventClosure
  }

  public Closure userVoiceChannelLeave(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.UserVoiceChannelLeaveEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(UserVoiceChannelLeaveEventContext) Closure eventClosure) {
    eventRegister.register(UserVoiceChannelLeaveEvent,eventClosure, filter)
    eventClosure
  }

  public Closure userVoiceChannelMove(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.UserVoiceChannelMoveEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(UserVoiceChannelMoveEventContext) Closure eventClosure) {
    eventRegister.register(UserVoiceChannelMoveEvent,eventClosure, filter)
    eventClosure
  }

  public Closure userVoiceStateUpdate(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.UserVoiceStateUpdateEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(UserVoiceStateUpdateEventContext) Closure eventClosure) {
    eventRegister.register(UserVoiceStateUpdateEvent,eventClosure, filter)
    eventClosure
  }

  public Closure voiceChannelCreate(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.VoiceChannelCreateEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(VoiceChannelCreateEventContext) Closure eventClosure) {
    eventRegister.register(VoiceChannelCreateEvent,eventClosure, filter)
    eventClosure
  }

  public Closure voiceChannelDelete(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.VoiceChannelDeleteEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(VoiceChannelDeleteEventContext) Closure eventClosure) {
    eventRegister.register(VoiceChannelDeleteEvent,eventClosure, filter)
    eventClosure
  }

  public Closure voiceChannelUpdate(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.VoiceChannelUpdateEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(VoiceChannelUpdateEventContext) Closure eventClosure) {
    eventRegister.register(VoiceChannelUpdateEvent,eventClosure, filter)
    eventClosure
  }

  public Closure voiceDisconnected(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.VoiceDisconnectedEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(VoiceDisconnectedEventContext) Closure eventClosure) {
    eventRegister.register(VoiceDisconnectedEvent,eventClosure, filter)
    eventClosure
  }

  public Closure voicePing(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.VoicePingEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(VoicePingEventContext) Closure eventClosure) {
    eventRegister.register(VoicePingEvent,eventClosure, filter)
    eventClosure
  }

  public Closure voiceUserSpeaking(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.VoiceUserSpeakingEvent"]) Closure<Boolean> filter = {true},
          @DelegatesTo(VoiceUserSpeakingEventContext) Closure eventClosure) {
    eventRegister.register(VoiceUserSpeakingEvent,eventClosure, filter)
    eventClosure
  }

  public ConsumerChainer audioPlay(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.AudioPlayEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, AudioPlayEvent)
  }

  public ConsumerChainer audioQueued(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.AudioQueuedEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, AudioQueuedEvent)
  }

  public ConsumerChainer audioReceive(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.AudioReceiveEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, AudioReceiveEvent)
  }

  public ConsumerChainer audioStop(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.AudioStopEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, AudioStopEvent)
  }

  public ConsumerChainer audioUnqueued(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.AudioUnqueuedEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, AudioUnqueuedEvent)
  }

  public ConsumerChainer channelCreate(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.ChannelCreateEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, ChannelCreateEvent)
  }

  public ConsumerChainer channelDelete(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.ChannelDeleteEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, ChannelDeleteEvent)
  }

  public ConsumerChainer channelUpdate(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.ChannelUpdateEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, ChannelUpdateEvent)
  }

  public ConsumerChainer discordDisconnected(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.DiscordDisconnectedEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, DiscordDisconnectedEvent)
  }

  public ConsumerChainer gameChange(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.GameChangeEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, GameChangeEvent)
  }

  public ConsumerChainer guildCreate(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.GuildCreateEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, GuildCreateEvent)
  }

  public ConsumerChainer guildLeave(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.GuildLeaveEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, GuildLeaveEvent)
  }

  public ConsumerChainer guildTransferOwnership(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.GuildTransferOwnershipEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, GuildTransferOwnershipEvent)
  }

  public ConsumerChainer guildUnavailable(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.GuildUnavailableEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, GuildUnavailableEvent)
  }

  public ConsumerChainer guildUpdate(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.GuildUpdateEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, GuildUpdateEvent)
  }

  public ConsumerChainer inviteReceived(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.InviteReceivedEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, InviteReceivedEvent)
  }

  public ConsumerChainer mention(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.MentionEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, MentionEvent)
  }

  public ConsumerChainer messageDelete(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.MessageDeleteEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, MessageDeleteEvent)
  }

  public ConsumerChainer messageReceived(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.MessageReceivedEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, MessageReceivedEvent)
  }

  public ConsumerChainer messageSend(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.MessageSendEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, MessageSendEvent)
  }

  public ConsumerChainer messageUpdate(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.MessageUpdateEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, MessageUpdateEvent)
  }

  public ConsumerChainer moduleDisabled(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.ModuleDisabledEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, ModuleDisabledEvent)
  }

  public ConsumerChainer moduleEnabled(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.ModuleEnabledEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, ModuleEnabledEvent)
  }

  public ConsumerChainer presenceUpdate(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.PresenceUpdateEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, PresenceUpdateEvent)
  }

  public ConsumerChainer ready(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.ReadyEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, ReadyEvent)
  }

  public ConsumerChainer roleCreate(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.RoleCreateEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, RoleCreateEvent)
  }

  public ConsumerChainer roleDelete(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.RoleDeleteEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, RoleDeleteEvent)
  }

  public ConsumerChainer roleUpdate(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.RoleUpdateEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, RoleUpdateEvent)
  }

  public ConsumerChainer typing(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.TypingEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, TypingEvent)
  }

  public ConsumerChainer userBan(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.UserBanEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, UserBanEvent)
  }

  public ConsumerChainer userJoin(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.UserJoinEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, UserJoinEvent)
  }

  public ConsumerChainer userLeave(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.UserPardonEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, UserPardonEvent)
  }

  public ConsumerChainer userPardon(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.UserPardonEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, UserPardonEvent)
  }

  public ConsumerChainer userRoleUpdate(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.UserRoleUpdateEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, UserRoleUpdateEvent)
  }

  public ConsumerChainer userUpdate(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.UserUpdateEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, UserUpdateEvent)
  }

  public ConsumerChainer userVoiceChannelJoin(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.UserVoiceChannelJoinEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, UserVoiceChannelJoinEvent)
  }

  public ConsumerChainer userVoiceChannelLeave(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.UserVoiceChannelLeaveEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, UserVoiceChannelLeaveEvent)
  }

  public ConsumerChainer userVoiceChannelMove(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.UserVoiceChannelMoveEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, UserVoiceChannelMoveEvent)
  }

  public ConsumerChainer userVoiceStateUpdate(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.UserVoiceStateUpdateEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, UserVoiceStateUpdateEvent)
  }

  public ConsumerChainer voiceChannelCreate(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.VoiceChannelCreateEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, VoiceChannelCreateEvent)
  }

  public ConsumerChainer voiceChannelDelete(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.VoiceChannelDeleteEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, VoiceChannelDeleteEvent)
  }

  public ConsumerChainer voiceChannelUpdate(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.VoiceChannelUpdateEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, VoiceChannelUpdateEvent)
  }

  public ConsumerChainer voiceDisconnected(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.VoiceDisconnectedEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, VoiceDisconnectedEvent)
  }

  public ConsumerChainer voicePing(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.VoicePingEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, VoicePingEvent)
  }

  public ConsumerChainer voiceUserSpeaking(
          @ClosureParams(value = SimpleType, options = ["sx.blah.discord.handle.impl.events.VoiceUserSpeakingEvent"]) Closure<Boolean> filter = null) {
    new ConsumerChainer(filter, eventRegister, VoiceUserSpeakingEvent)
  }

}
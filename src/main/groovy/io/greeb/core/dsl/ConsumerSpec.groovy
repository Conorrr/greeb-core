package io.greeb.core.dsl

import io.greeb.core.discord.EventDispatcher
import io.greeb.core.discord.contexts.*
import sx.blah.discord.handle.impl.events.*

public class ConsumerSpec {

  EventDispatcher eventDispatcher

  ConsumerSpec(EventDispatcher eventDispatcher) {
    this.eventDispatcher = eventDispatcher
  }

  // matchers with patterns
  public void messageReceived(String pattern, @DelegatesTo(MessageReceivedEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(MessageReceivedEvent, pattern, eventClosure)
  }

  public void messageReceived(String pattern, String channel,
                              @DelegatesTo(MessageReceivedEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(MessageReceivedEvent, pattern, channel, eventClosure)
  }

  // specific event matchers
  public void audioPlay(@DelegatesTo(AudioPlayEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(AudioPlayEvent, eventClosure)
  }

  public void audioQueued(@DelegatesTo(AudioQueuedEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(AudioQueuedEvent, eventClosure)
  }

  public void audioReceive(@DelegatesTo(AudioReceiveEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(AudioReceiveEvent, eventClosure)
  }

  public void audioStop(@DelegatesTo(AudioStopEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(AudioStopEvent, eventClosure)
  }

  public void audioUnqueued(@DelegatesTo(AudioUnqueuedEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(AudioUnqueuedEvent, eventClosure)
  }

  public void channelCreate(@DelegatesTo(ChannelCreateEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(ChannelCreateEvent, eventClosure)
  }

  public void channelDelete(@DelegatesTo(ChannelDeleteEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(ChannelDeleteEvent, eventClosure)
  }

  public void channelUpdate(@DelegatesTo(ChannelUpdateEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(ChannelUpdateEvent, eventClosure)
  }

  public void discordDisconnected(@DelegatesTo(DiscordDisconnectedEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(DiscordDisconnectedEvent, eventClosure)
  }

  public void gameChange(@DelegatesTo(GameChangeEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(GameChangeEvent, eventClosure)
  }

  public void guildCreate(@DelegatesTo(GuildCreateEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(GuildCreateEvent, eventClosure)
  }

  public void guildLeave(@DelegatesTo(GuildLeaveEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(GuildLeaveEvent, eventClosure)
  }

  public void guildTransferOwnership(@DelegatesTo(GuildTransferOwnershipEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(GuildTransferOwnershipEvent, eventClosure)
  }

  public void guildUnavailable(@DelegatesTo(GuildUnavailableEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(GuildUnavailableEvent, eventClosure)
  }

  public void guildUpdate(@DelegatesTo(GuildUpdateEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(GuildUpdateEvent, eventClosure)
  }

  public void inviteReceived(@DelegatesTo(InviteReceivedEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(InviteReceivedEvent, eventClosure)
  }

  public void mention(@DelegatesTo(MentionEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(MentionEvent, eventClosure)
  }

  public void messageDelete(@DelegatesTo(MessageDeleteEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(MessageDeleteEvent, eventClosure)
  }

  public void messageReceived(@DelegatesTo(MessageReceivedEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(MessageReceivedEvent, eventClosure)
  }

  public void messageSend(@DelegatesTo(MessageSendEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(MessageSendEvent, eventClosure)
  }

  public void messageUpdate(@DelegatesTo(MessageUpdateEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(MessageUpdateEvent, eventClosure)
  }

  public void moduleDisabled(@DelegatesTo(ModuleDisabledEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(ModuleDisabledEvent, eventClosure)
  }

  public void moduleEnabled(@DelegatesTo(ModuleEnabledEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(ModuleEnabledEvent, eventClosure)
  }

  public void presenceUpdate(@DelegatesTo(PresenceUpdateEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(PresenceUpdateEvent, eventClosure)
  }

  public void ready(@DelegatesTo(ReadyEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(ReadyEvent, eventClosure)
  }

  public void roleCreate(@DelegatesTo(RoleCreateEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(RoleCreateEvent, eventClosure)
  }

  public void roleDelete(@DelegatesTo(RoleDeleteEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(RoleDeleteEvent, eventClosure)
  }

  public void roleUpdate(@DelegatesTo(RoleUpdateEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(RoleUpdateEvent, eventClosure)
  }

  public void typing(@DelegatesTo(TypingEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(TypingEvent, eventClosure)
  }

  public void userBan(@DelegatesTo(UserBanEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(UserBanEvent, eventClosure)
  }

  public void userJoin(@DelegatesTo(UserJoinEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(UserJoinEvent, eventClosure)
  }

  public void userLeave(@DelegatesTo(UserPardonEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(UserLeaveEvent, eventClosure)
  }

  public void userPardon(@DelegatesTo(UserPardonEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(UserPardonEvent, eventClosure)
  }

  public void userRoleUpdate(@DelegatesTo(UserRoleUpdateEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(UserRoleUpdateEvent, eventClosure)
  }

  public void userUpdate(@DelegatesTo(UserUpdateEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(UserUpdateEvent, eventClosure)
  }

  public void userVoiceChannelJoin(@DelegatesTo(UserVoiceChannelJoinEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(UserVoiceChannelJoinEvent, eventClosure)
  }

  public void userVoiceChannelLeave(@DelegatesTo(UserVoiceChannelLeaveEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(UserVoiceChannelLeaveEvent, eventClosure)
  }

  public void userVoiceChannelMove(@DelegatesTo(UserVoiceChannelMoveEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(UserVoiceChannelMoveEvent, eventClosure)
  }

  public void userVoiceStateUpdate(@DelegatesTo(UserVoiceStateUpdateEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(UserVoiceStateUpdateEvent, eventClosure)
  }

  public void voiceChannelCreate(@DelegatesTo(VoiceChannelCreateEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(VoiceChannelCreateEvent, eventClosure)
  }

  public void voiceChannelDelete(@DelegatesTo(VoiceChannelDeleteEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(VoiceChannelDeleteEvent, eventClosure)
  }

  public void voiceChannelUpdate(@DelegatesTo(VoiceChannelUpdateEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(VoiceChannelUpdateEvent, eventClosure)
  }

  public void voiceDisconnected(@DelegatesTo(VoiceDisconnectedEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(VoiceDisconnectedEvent, eventClosure)
  }

  public void voicePing(@DelegatesTo(VoicePingEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(VoicePingEvent, eventClosure)
  }

  public void voiceUserSpeaking(@DelegatesTo(VoiceUserSpeakingEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(VoiceUserSpeakingEvent, eventClosure)
  }

}
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

  public void listen(String pattern, @DelegatesTo(MessageReceivedEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(MessageReceivedEvent, pattern, eventClosure)
  }

  public void listen(String pattern, String channel,
                     @DelegatesTo(MessageReceivedEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(MessageReceivedEvent, pattern, channel, eventClosure)
  }

  // specific event matchers

  public void listen(Class<AudioPlayEvent> event, @DelegatesTo(AudioPlayEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<AudioQueuedEvent> event, @DelegatesTo(AudioQueuedEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<AudioReceiveEvent> event, @DelegatesTo(AudioReceiveEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<AudioStopEvent> event, @DelegatesTo(AudioStopEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<AudioUnqueuedEvent> event, @DelegatesTo(AudioUnqueuedEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<ChannelCreateEvent> event, @DelegatesTo(ChannelCreateEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<ChannelDeleteEvent> event, @DelegatesTo(ChannelDeleteEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<ChannelUpdateEvent> event, @DelegatesTo(ChannelUpdateEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<DiscordDisconnectedEvent> event,
                     @DelegatesTo(DiscordDisconnectedEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<GameChangeEvent> event, @DelegatesTo(GameChangeEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<GuildCreateEvent> event, @DelegatesTo(GuildCreateEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<GuildLeaveEvent> event, @DelegatesTo(GuildLeaveEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<GuildTransferOwnershipEvent> event,
                     @DelegatesTo(GuildTransferOwnershipEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<GuildUnavailableEvent> event,
                     @DelegatesTo(GuildUnavailableEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<GuildUpdateEvent> event, @DelegatesTo(GuildUpdateEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<InviteReceivedEvent> event,
                     @DelegatesTo(InviteReceivedEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<MentionEvent> event, @DelegatesTo(MentionEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<MessageDeleteEvent> event, @DelegatesTo(MessageDeleteEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<MessageReceivedEvent> event,
                     @DelegatesTo(MessageReceivedEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<MessageSendEvent> event, @DelegatesTo(MessageSendEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<MessageUpdateEvent> event, @DelegatesTo(MessageUpdateEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<ModuleDisabledEvent> event,
                     @DelegatesTo(ModuleDisabledEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<ModuleEnabledEvent> event, @DelegatesTo(ModuleEnabledEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<PresenceUpdateEvent> event,
                     @DelegatesTo(PresenceUpdateEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<ReadyEvent> event, @DelegatesTo(ReadyEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<RoleCreateEvent> event, @DelegatesTo(RoleCreateEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<RoleDeleteEvent> event, @DelegatesTo(RoleDeleteEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<RoleUpdateEvent> event, @DelegatesTo(RoleUpdateEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<TypingEvent> event, @DelegatesTo(TypingEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<UserBanEvent> event, @DelegatesTo(UserBanEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<UserJoinEvent> event, @DelegatesTo(UserJoinEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<UserLeaveEvent> event, @DelegatesTo(UserPardonEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<UserPardonEvent> event, @DelegatesTo(UserPardonEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<UserRoleUpdateEvent> event,
                     @DelegatesTo(UserRoleUpdateEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<UserUpdateEvent> event, @DelegatesTo(UserUpdateEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<UserVoiceChannelJoinEvent> event,
                     @DelegatesTo(UserVoiceChannelJoinEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<UserVoiceChannelLeaveEvent> event,
                     @DelegatesTo(UserVoiceChannelLeaveEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<UserVoiceChannelMoveEvent> event,
                     @DelegatesTo(UserVoiceChannelMoveEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<UserVoiceStateUpdateEvent> event,
                     @DelegatesTo(UserVoiceStateUpdateEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<VoiceChannelCreateEvent> event,
                     @DelegatesTo(VoiceChannelCreateEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<VoiceChannelDeleteEvent> event,
                     @DelegatesTo(VoiceChannelDeleteEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<VoiceChannelUpdateEvent> event,
                     @DelegatesTo(VoiceChannelUpdateEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<VoiceDisconnectedEvent> event,
                     @DelegatesTo(VoiceDisconnectedEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<VoicePingEvent> event, @DelegatesTo(VoicePingEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }

  public void listen(Class<VoiceUserSpeakingEvent> event,
                     @DelegatesTo(VoiceUserSpeakingEventContext) Closure<?> eventClosure) {
    eventDispatcher.register(event, eventClosure)
  }


}
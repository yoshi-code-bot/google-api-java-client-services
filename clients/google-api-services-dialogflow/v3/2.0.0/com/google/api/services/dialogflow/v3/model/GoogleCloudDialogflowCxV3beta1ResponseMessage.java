/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.dialogflow.v3.model;

/**
 * Represents a response message that can be returned by a conversational agent. Response messages
 * are also used for output audio synthesis. The approach is as follows: * If at least one
 * OutputAudioText response is present, then all OutputAudioText responses are linearly
 * concatenated, and the result is used for output audio synthesis. * If the OutputAudioText
 * responses are a mixture of text and SSML, then the concatenated result is treated as SSML;
 * otherwise, the result is treated as either text or SSML as appropriate. The agent designer should
 * ideally use either text or SSML consistently throughout the bot design. * Otherwise, all Text
 * responses are linearly concatenated, and the result is used for output audio synthesis. This
 * approach allows for more sophisticated user experience scenarios, where the text displayed to the
 * user may differ from what is heard.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3beta1ResponseMessage extends com.google.api.client.json.GenericJson {

  /**
   * The channel which the response is associated with. Clients can specify the channel via
   * QueryParameters.channel, and only associated channel response will be returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String channel;

  /**
   * Indicates that the conversation succeeded.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3beta1ResponseMessageConversationSuccess conversationSuccess;

  /**
   * Output only. A signal that indicates the interaction with the Dialogflow agent has ended. This
   * message is generated by Dialogflow only when the conversation reaches `END_SESSION` page. It is
   * not supposed to be defined by the user. It's guaranteed that there is at most one such message
   * in each response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3beta1ResponseMessageEndInteraction endInteraction;

  /**
   * Represents info card for knowledge answers, to be better rendered in Dialogflow Messenger.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3beta1ResponseMessageKnowledgeInfoCard knowledgeInfoCard;

  /**
   * Hands off conversation to a human agent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoff liveAgentHandoff;

  /**
   * Output only. An audio response message composed of both the synthesized Dialogflow agent
   * responses and responses defined via play_audio. This message is generated by Dialogflow only
   * and not supposed to be defined by the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudio mixedAudio;

  /**
   * A text or ssml response that is preferentially used for TTS output audio synthesis, as
   * described in the comment on the ResponseMessage message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3beta1ResponseMessageOutputAudioText outputAudioText;

  /**
   * Returns a response containing a custom, platform-specific payload.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> payload;

  /**
   * Signal that the client should play an audio clip hosted at a client-specific URI. Dialogflow
   * uses this to construct mixed_audio. However, Dialogflow itself does not try to read or process
   * the URI in any way.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudio playAudio;

  /**
   * A signal that the client should transfer the phone call connected to this agent to a third-
   * party endpoint.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCall telephonyTransferCall;

  /**
   * Returns a text response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3beta1ResponseMessageText text;

  /**
   * Returns the definition of a tool call that should be executed by the client.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3beta1ToolCall toolCall;

  /**
   * The channel which the response is associated with. Clients can specify the channel via
   * QueryParameters.channel, and only associated channel response will be returned.
   * @return value or {@code null} for none
   */
  public java.lang.String getChannel() {
    return channel;
  }

  /**
   * The channel which the response is associated with. Clients can specify the channel via
   * QueryParameters.channel, and only associated channel response will be returned.
   * @param channel channel or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ResponseMessage setChannel(java.lang.String channel) {
    this.channel = channel;
    return this;
  }

  /**
   * Indicates that the conversation succeeded.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ResponseMessageConversationSuccess getConversationSuccess() {
    return conversationSuccess;
  }

  /**
   * Indicates that the conversation succeeded.
   * @param conversationSuccess conversationSuccess or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ResponseMessage setConversationSuccess(GoogleCloudDialogflowCxV3beta1ResponseMessageConversationSuccess conversationSuccess) {
    this.conversationSuccess = conversationSuccess;
    return this;
  }

  /**
   * Output only. A signal that indicates the interaction with the Dialogflow agent has ended. This
   * message is generated by Dialogflow only when the conversation reaches `END_SESSION` page. It is
   * not supposed to be defined by the user. It's guaranteed that there is at most one such message
   * in each response.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ResponseMessageEndInteraction getEndInteraction() {
    return endInteraction;
  }

  /**
   * Output only. A signal that indicates the interaction with the Dialogflow agent has ended. This
   * message is generated by Dialogflow only when the conversation reaches `END_SESSION` page. It is
   * not supposed to be defined by the user. It's guaranteed that there is at most one such message
   * in each response.
   * @param endInteraction endInteraction or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ResponseMessage setEndInteraction(GoogleCloudDialogflowCxV3beta1ResponseMessageEndInteraction endInteraction) {
    this.endInteraction = endInteraction;
    return this;
  }

  /**
   * Represents info card for knowledge answers, to be better rendered in Dialogflow Messenger.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ResponseMessageKnowledgeInfoCard getKnowledgeInfoCard() {
    return knowledgeInfoCard;
  }

  /**
   * Represents info card for knowledge answers, to be better rendered in Dialogflow Messenger.
   * @param knowledgeInfoCard knowledgeInfoCard or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ResponseMessage setKnowledgeInfoCard(GoogleCloudDialogflowCxV3beta1ResponseMessageKnowledgeInfoCard knowledgeInfoCard) {
    this.knowledgeInfoCard = knowledgeInfoCard;
    return this;
  }

  /**
   * Hands off conversation to a human agent.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoff getLiveAgentHandoff() {
    return liveAgentHandoff;
  }

  /**
   * Hands off conversation to a human agent.
   * @param liveAgentHandoff liveAgentHandoff or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ResponseMessage setLiveAgentHandoff(GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoff liveAgentHandoff) {
    this.liveAgentHandoff = liveAgentHandoff;
    return this;
  }

  /**
   * Output only. An audio response message composed of both the synthesized Dialogflow agent
   * responses and responses defined via play_audio. This message is generated by Dialogflow only
   * and not supposed to be defined by the user.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudio getMixedAudio() {
    return mixedAudio;
  }

  /**
   * Output only. An audio response message composed of both the synthesized Dialogflow agent
   * responses and responses defined via play_audio. This message is generated by Dialogflow only
   * and not supposed to be defined by the user.
   * @param mixedAudio mixedAudio or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ResponseMessage setMixedAudio(GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudio mixedAudio) {
    this.mixedAudio = mixedAudio;
    return this;
  }

  /**
   * A text or ssml response that is preferentially used for TTS output audio synthesis, as
   * described in the comment on the ResponseMessage message.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ResponseMessageOutputAudioText getOutputAudioText() {
    return outputAudioText;
  }

  /**
   * A text or ssml response that is preferentially used for TTS output audio synthesis, as
   * described in the comment on the ResponseMessage message.
   * @param outputAudioText outputAudioText or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ResponseMessage setOutputAudioText(GoogleCloudDialogflowCxV3beta1ResponseMessageOutputAudioText outputAudioText) {
    this.outputAudioText = outputAudioText;
    return this;
  }

  /**
   * Returns a response containing a custom, platform-specific payload.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getPayload() {
    return payload;
  }

  /**
   * Returns a response containing a custom, platform-specific payload.
   * @param payload payload or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ResponseMessage setPayload(java.util.Map<String, java.lang.Object> payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Signal that the client should play an audio clip hosted at a client-specific URI. Dialogflow
   * uses this to construct mixed_audio. However, Dialogflow itself does not try to read or process
   * the URI in any way.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudio getPlayAudio() {
    return playAudio;
  }

  /**
   * Signal that the client should play an audio clip hosted at a client-specific URI. Dialogflow
   * uses this to construct mixed_audio. However, Dialogflow itself does not try to read or process
   * the URI in any way.
   * @param playAudio playAudio or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ResponseMessage setPlayAudio(GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudio playAudio) {
    this.playAudio = playAudio;
    return this;
  }

  /**
   * A signal that the client should transfer the phone call connected to this agent to a third-
   * party endpoint.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCall getTelephonyTransferCall() {
    return telephonyTransferCall;
  }

  /**
   * A signal that the client should transfer the phone call connected to this agent to a third-
   * party endpoint.
   * @param telephonyTransferCall telephonyTransferCall or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ResponseMessage setTelephonyTransferCall(GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCall telephonyTransferCall) {
    this.telephonyTransferCall = telephonyTransferCall;
    return this;
  }

  /**
   * Returns a text response.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ResponseMessageText getText() {
    return text;
  }

  /**
   * Returns a text response.
   * @param text text or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ResponseMessage setText(GoogleCloudDialogflowCxV3beta1ResponseMessageText text) {
    this.text = text;
    return this;
  }

  /**
   * Returns the definition of a tool call that should be executed by the client.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ToolCall getToolCall() {
    return toolCall;
  }

  /**
   * Returns the definition of a tool call that should be executed by the client.
   * @param toolCall toolCall or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ResponseMessage setToolCall(GoogleCloudDialogflowCxV3beta1ToolCall toolCall) {
    this.toolCall = toolCall;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1ResponseMessage set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3beta1ResponseMessage) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1ResponseMessage clone() {
    return (GoogleCloudDialogflowCxV3beta1ResponseMessage) super.clone();
  }

}

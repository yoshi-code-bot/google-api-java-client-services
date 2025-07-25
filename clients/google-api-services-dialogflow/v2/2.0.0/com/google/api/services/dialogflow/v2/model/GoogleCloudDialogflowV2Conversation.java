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

package com.google.api.services.dialogflow.v2.model;

/**
 * Represents a conversation. A conversation is an interaction between an agent, including live
 * agents and Dialogflow agents, and a support customer. Conversations can include phone calls and
 * text-based chat sessions.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2Conversation extends com.google.api.client.json.GenericJson {

  /**
   * Required. The Conversation Profile to be used to configure this Conversation. This field cannot
   * be updated. Format: `projects//locations//conversationProfiles/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String conversationProfile;

  /**
   * Optional. The stage of a conversation. It indicates whether the virtual agent or a human agent
   * is handling the conversation. If the conversation is created with the conversation profile that
   * has Dialogflow config set, defaults to ConversationStage.VIRTUAL_AGENT_STAGE; Otherwise,
   * defaults to ConversationStage.HUMAN_ASSIST_STAGE. If the conversation is created with the
   * conversation profile that has Dialogflow config set but explicitly sets conversation_stage to
   * ConversationStage.HUMAN_ASSIST_STAGE, it skips ConversationStage.VIRTUAL_AGENT_STAGE stage and
   * directly goes to ConversationStage.HUMAN_ASSIST_STAGE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String conversationStage;

  /**
   * Output only. The time the conversation was finished.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * Output only. The context reference updates provided by external systems.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, GoogleCloudDialogflowV2ConversationContextReference> ingestedContextReferences;

  /**
   * Output only. The current state of the Conversation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lifecycleState;

  /**
   * Output only. Identifier. The unique identifier of this conversation. Format:
   * `projects//locations//conversations/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. It will not be empty if the conversation is to be connected over telephony.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2ConversationPhoneNumber phoneNumber;

  /**
   * Output only. The time the conversation was started.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * Output only. The telephony connection information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2ConversationTelephonyConnectionInfo telephonyConnectionInfo;

  /**
   * Required. The Conversation Profile to be used to configure this Conversation. This field cannot
   * be updated. Format: `projects//locations//conversationProfiles/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getConversationProfile() {
    return conversationProfile;
  }

  /**
   * Required. The Conversation Profile to be used to configure this Conversation. This field cannot
   * be updated. Format: `projects//locations//conversationProfiles/`.
   * @param conversationProfile conversationProfile or {@code null} for none
   */
  public GoogleCloudDialogflowV2Conversation setConversationProfile(java.lang.String conversationProfile) {
    this.conversationProfile = conversationProfile;
    return this;
  }

  /**
   * Optional. The stage of a conversation. It indicates whether the virtual agent or a human agent
   * is handling the conversation. If the conversation is created with the conversation profile that
   * has Dialogflow config set, defaults to ConversationStage.VIRTUAL_AGENT_STAGE; Otherwise,
   * defaults to ConversationStage.HUMAN_ASSIST_STAGE. If the conversation is created with the
   * conversation profile that has Dialogflow config set but explicitly sets conversation_stage to
   * ConversationStage.HUMAN_ASSIST_STAGE, it skips ConversationStage.VIRTUAL_AGENT_STAGE stage and
   * directly goes to ConversationStage.HUMAN_ASSIST_STAGE.
   * @return value or {@code null} for none
   */
  public java.lang.String getConversationStage() {
    return conversationStage;
  }

  /**
   * Optional. The stage of a conversation. It indicates whether the virtual agent or a human agent
   * is handling the conversation. If the conversation is created with the conversation profile that
   * has Dialogflow config set, defaults to ConversationStage.VIRTUAL_AGENT_STAGE; Otherwise,
   * defaults to ConversationStage.HUMAN_ASSIST_STAGE. If the conversation is created with the
   * conversation profile that has Dialogflow config set but explicitly sets conversation_stage to
   * ConversationStage.HUMAN_ASSIST_STAGE, it skips ConversationStage.VIRTUAL_AGENT_STAGE stage and
   * directly goes to ConversationStage.HUMAN_ASSIST_STAGE.
   * @param conversationStage conversationStage or {@code null} for none
   */
  public GoogleCloudDialogflowV2Conversation setConversationStage(java.lang.String conversationStage) {
    this.conversationStage = conversationStage;
    return this;
  }

  /**
   * Output only. The time the conversation was finished.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * Output only. The time the conversation was finished.
   * @param endTime endTime or {@code null} for none
   */
  public GoogleCloudDialogflowV2Conversation setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Output only. The context reference updates provided by external systems.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, GoogleCloudDialogflowV2ConversationContextReference> getIngestedContextReferences() {
    return ingestedContextReferences;
  }

  /**
   * Output only. The context reference updates provided by external systems.
   * @param ingestedContextReferences ingestedContextReferences or {@code null} for none
   */
  public GoogleCloudDialogflowV2Conversation setIngestedContextReferences(java.util.Map<String, GoogleCloudDialogflowV2ConversationContextReference> ingestedContextReferences) {
    this.ingestedContextReferences = ingestedContextReferences;
    return this;
  }

  /**
   * Output only. The current state of the Conversation.
   * @return value or {@code null} for none
   */
  public java.lang.String getLifecycleState() {
    return lifecycleState;
  }

  /**
   * Output only. The current state of the Conversation.
   * @param lifecycleState lifecycleState or {@code null} for none
   */
  public GoogleCloudDialogflowV2Conversation setLifecycleState(java.lang.String lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
  }

  /**
   * Output only. Identifier. The unique identifier of this conversation. Format:
   * `projects//locations//conversations/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Identifier. The unique identifier of this conversation. Format:
   * `projects//locations//conversations/`.
   * @param name name or {@code null} for none
   */
  public GoogleCloudDialogflowV2Conversation setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. It will not be empty if the conversation is to be connected over telephony.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2ConversationPhoneNumber getPhoneNumber() {
    return phoneNumber;
  }

  /**
   * Output only. It will not be empty if the conversation is to be connected over telephony.
   * @param phoneNumber phoneNumber or {@code null} for none
   */
  public GoogleCloudDialogflowV2Conversation setPhoneNumber(GoogleCloudDialogflowV2ConversationPhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Output only. The time the conversation was started.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Output only. The time the conversation was started.
   * @param startTime startTime or {@code null} for none
   */
  public GoogleCloudDialogflowV2Conversation setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Output only. The telephony connection information.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2ConversationTelephonyConnectionInfo getTelephonyConnectionInfo() {
    return telephonyConnectionInfo;
  }

  /**
   * Output only. The telephony connection information.
   * @param telephonyConnectionInfo telephonyConnectionInfo or {@code null} for none
   */
  public GoogleCloudDialogflowV2Conversation setTelephonyConnectionInfo(GoogleCloudDialogflowV2ConversationTelephonyConnectionInfo telephonyConnectionInfo) {
    this.telephonyConnectionInfo = telephonyConnectionInfo;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2Conversation set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2Conversation) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2Conversation clone() {
    return (GoogleCloudDialogflowV2Conversation) super.clone();
  }

}

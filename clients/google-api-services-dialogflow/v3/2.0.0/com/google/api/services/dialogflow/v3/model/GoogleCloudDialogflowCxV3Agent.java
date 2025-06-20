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
 * Agents are best described as Natural Language Understanding (NLU) modules that transform user
 * requests into actionable data. You can include agents in your app, product, or service to
 * determine user intent and respond to the user in a natural way. After you create an agent, you
 * can add Intents, Entity Types, Flows, Fulfillments, Webhooks, TransitionRouteGroups and so on to
 * manage the conversation flows.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3Agent extends com.google.api.client.json.GenericJson {

  /**
   * Hierarchical advanced settings for this agent. The settings exposed at the lower level
   * overrides the settings exposed at the higher level.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3AdvancedSettings advancedSettings;

  /**
   * Optional. Answer feedback collection settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3AgentAnswerFeedbackSettings answerFeedbackSettings;

  /**
   * The URI of the agent's avatar. Avatars are used throughout the Dialogflow console and in the
   * self-hosted [Web Demo](https://cloud.google.com/dialogflow/docs/integrations/web-demo)
   * integration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String avatarUri;

  /**
   * Optional. Settings for custom client certificates.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3AgentClientCertificateSettings clientCertificateSettings;

  /**
   * Required. Immutable. The default language of the agent as a language tag. See [Language
   * Support](https://cloud.google.com/dialogflow/cx/docs/reference/language) for a list of the
   * currently supported language codes. This field cannot be set by the Agents.UpdateAgent method.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String defaultLanguageCode;

  /**
   * The description of the agent. The maximum length is 500 characters. If exceeded, the request is
   * rejected.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Required. The human-readable name of the agent, unique within the location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Optional. Enable training multi-lingual models for this agent. These models will be trained on
   * all the languages supported by the agent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableMultiLanguageTraining;

  /**
   * Indicates if automatic spell correction is enabled in detect intent requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableSpellCorrection;

  /**
   * Indicates if stackdriver logging is enabled for the agent. Please use agent.advanced_settings
   * instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableStackdriverLogging;

  /**
   * Gen App Builder-related agent-level settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3AgentGenAppBuilderSettings genAppBuilderSettings;

  /**
   * Git integration settings for this agent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3AgentGitIntegrationSettings gitIntegrationSettings;

  /**
   * Indicates whether the agent is locked for changes. If the agent is locked, modifications to the
   * agent will be rejected except for RestoreAgent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean locked;

  /**
   * The unique identifier of the agent. Required for the Agents.UpdateAgent method.
   * Agents.CreateAgent populates the name automatically. Format: `projects//locations//agents/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. Settings for end user personalization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3AgentPersonalizationSettings personalizationSettings;

  /**
   * Optional. Output only. A read only boolean field reflecting Zone Isolation status of the agent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean satisfiesPzi;

  /**
   * Optional. Output only. A read only boolean field reflecting Zone Separation status of the
   * agent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean satisfiesPzs;

  /**
   * Name of the SecuritySettings reference for the agent. Format:
   * `projects//locations//securitySettings/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String securitySettings;

  /**
   * Speech recognition related settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3SpeechToTextSettings speechToTextSettings;

  /**
   * Name of the start flow in this agent. A start flow will be automatically created when the agent
   * is created, and can only be deleted by deleting the agent. Format:
   * `projects//locations//agents//flows/`. Currently only the default start flow with id
   * "00000000-0000-0000-0000-000000000000" is allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String startFlow;

  /**
   * Name of the start playbook in this agent. A start playbook will be automatically created when
   * the agent is created, and can only be deleted by deleting the agent. Format:
   * `projects//locations//agents//playbooks/`. Currently only the default playbook with id
   * "00000000-0000-0000-0000-000000000000" is allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String startPlaybook;

  /**
   * The list of all languages supported by the agent (except for the `default_language_code`).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> supportedLanguageCodes;

  /**
   * Settings on instructing the speech synthesizer on how to generate the output audio content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3TextToSpeechSettings textToSpeechSettings;

  /**
   * Required. The time zone of the agent from the [time zone database](https://www.iana.org/time-
   * zones), e.g., America/New_York, Europe/Paris.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String timeZone;

  /**
   * Hierarchical advanced settings for this agent. The settings exposed at the lower level
   * overrides the settings exposed at the higher level.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3AdvancedSettings getAdvancedSettings() {
    return advancedSettings;
  }

  /**
   * Hierarchical advanced settings for this agent. The settings exposed at the lower level
   * overrides the settings exposed at the higher level.
   * @param advancedSettings advancedSettings or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Agent setAdvancedSettings(GoogleCloudDialogflowCxV3AdvancedSettings advancedSettings) {
    this.advancedSettings = advancedSettings;
    return this;
  }

  /**
   * Optional. Answer feedback collection settings.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3AgentAnswerFeedbackSettings getAnswerFeedbackSettings() {
    return answerFeedbackSettings;
  }

  /**
   * Optional. Answer feedback collection settings.
   * @param answerFeedbackSettings answerFeedbackSettings or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Agent setAnswerFeedbackSettings(GoogleCloudDialogflowCxV3AgentAnswerFeedbackSettings answerFeedbackSettings) {
    this.answerFeedbackSettings = answerFeedbackSettings;
    return this;
  }

  /**
   * The URI of the agent's avatar. Avatars are used throughout the Dialogflow console and in the
   * self-hosted [Web Demo](https://cloud.google.com/dialogflow/docs/integrations/web-demo)
   * integration.
   * @return value or {@code null} for none
   */
  public java.lang.String getAvatarUri() {
    return avatarUri;
  }

  /**
   * The URI of the agent's avatar. Avatars are used throughout the Dialogflow console and in the
   * self-hosted [Web Demo](https://cloud.google.com/dialogflow/docs/integrations/web-demo)
   * integration.
   * @param avatarUri avatarUri or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Agent setAvatarUri(java.lang.String avatarUri) {
    this.avatarUri = avatarUri;
    return this;
  }

  /**
   * Optional. Settings for custom client certificates.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3AgentClientCertificateSettings getClientCertificateSettings() {
    return clientCertificateSettings;
  }

  /**
   * Optional. Settings for custom client certificates.
   * @param clientCertificateSettings clientCertificateSettings or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Agent setClientCertificateSettings(GoogleCloudDialogflowCxV3AgentClientCertificateSettings clientCertificateSettings) {
    this.clientCertificateSettings = clientCertificateSettings;
    return this;
  }

  /**
   * Required. Immutable. The default language of the agent as a language tag. See [Language
   * Support](https://cloud.google.com/dialogflow/cx/docs/reference/language) for a list of the
   * currently supported language codes. This field cannot be set by the Agents.UpdateAgent method.
   * @return value or {@code null} for none
   */
  public java.lang.String getDefaultLanguageCode() {
    return defaultLanguageCode;
  }

  /**
   * Required. Immutable. The default language of the agent as a language tag. See [Language
   * Support](https://cloud.google.com/dialogflow/cx/docs/reference/language) for a list of the
   * currently supported language codes. This field cannot be set by the Agents.UpdateAgent method.
   * @param defaultLanguageCode defaultLanguageCode or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Agent setDefaultLanguageCode(java.lang.String defaultLanguageCode) {
    this.defaultLanguageCode = defaultLanguageCode;
    return this;
  }

  /**
   * The description of the agent. The maximum length is 500 characters. If exceeded, the request is
   * rejected.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * The description of the agent. The maximum length is 500 characters. If exceeded, the request is
   * rejected.
   * @param description description or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Agent setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Required. The human-readable name of the agent, unique within the location.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. The human-readable name of the agent, unique within the location.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Agent setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Optional. Enable training multi-lingual models for this agent. These models will be trained on
   * all the languages supported by the agent.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableMultiLanguageTraining() {
    return enableMultiLanguageTraining;
  }

  /**
   * Optional. Enable training multi-lingual models for this agent. These models will be trained on
   * all the languages supported by the agent.
   * @param enableMultiLanguageTraining enableMultiLanguageTraining or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Agent setEnableMultiLanguageTraining(java.lang.Boolean enableMultiLanguageTraining) {
    this.enableMultiLanguageTraining = enableMultiLanguageTraining;
    return this;
  }

  /**
   * Indicates if automatic spell correction is enabled in detect intent requests.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableSpellCorrection() {
    return enableSpellCorrection;
  }

  /**
   * Indicates if automatic spell correction is enabled in detect intent requests.
   * @param enableSpellCorrection enableSpellCorrection or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Agent setEnableSpellCorrection(java.lang.Boolean enableSpellCorrection) {
    this.enableSpellCorrection = enableSpellCorrection;
    return this;
  }

  /**
   * Indicates if stackdriver logging is enabled for the agent. Please use agent.advanced_settings
   * instead.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableStackdriverLogging() {
    return enableStackdriverLogging;
  }

  /**
   * Indicates if stackdriver logging is enabled for the agent. Please use agent.advanced_settings
   * instead.
   * @param enableStackdriverLogging enableStackdriverLogging or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Agent setEnableStackdriverLogging(java.lang.Boolean enableStackdriverLogging) {
    this.enableStackdriverLogging = enableStackdriverLogging;
    return this;
  }

  /**
   * Gen App Builder-related agent-level settings.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3AgentGenAppBuilderSettings getGenAppBuilderSettings() {
    return genAppBuilderSettings;
  }

  /**
   * Gen App Builder-related agent-level settings.
   * @param genAppBuilderSettings genAppBuilderSettings or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Agent setGenAppBuilderSettings(GoogleCloudDialogflowCxV3AgentGenAppBuilderSettings genAppBuilderSettings) {
    this.genAppBuilderSettings = genAppBuilderSettings;
    return this;
  }

  /**
   * Git integration settings for this agent.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3AgentGitIntegrationSettings getGitIntegrationSettings() {
    return gitIntegrationSettings;
  }

  /**
   * Git integration settings for this agent.
   * @param gitIntegrationSettings gitIntegrationSettings or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Agent setGitIntegrationSettings(GoogleCloudDialogflowCxV3AgentGitIntegrationSettings gitIntegrationSettings) {
    this.gitIntegrationSettings = gitIntegrationSettings;
    return this;
  }

  /**
   * Indicates whether the agent is locked for changes. If the agent is locked, modifications to the
   * agent will be rejected except for RestoreAgent.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getLocked() {
    return locked;
  }

  /**
   * Indicates whether the agent is locked for changes. If the agent is locked, modifications to the
   * agent will be rejected except for RestoreAgent.
   * @param locked locked or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Agent setLocked(java.lang.Boolean locked) {
    this.locked = locked;
    return this;
  }

  /**
   * The unique identifier of the agent. Required for the Agents.UpdateAgent method.
   * Agents.CreateAgent populates the name automatically. Format: `projects//locations//agents/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The unique identifier of the agent. Required for the Agents.UpdateAgent method.
   * Agents.CreateAgent populates the name automatically. Format: `projects//locations//agents/`.
   * @param name name or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Agent setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. Settings for end user personalization.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3AgentPersonalizationSettings getPersonalizationSettings() {
    return personalizationSettings;
  }

  /**
   * Optional. Settings for end user personalization.
   * @param personalizationSettings personalizationSettings or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Agent setPersonalizationSettings(GoogleCloudDialogflowCxV3AgentPersonalizationSettings personalizationSettings) {
    this.personalizationSettings = personalizationSettings;
    return this;
  }

  /**
   * Optional. Output only. A read only boolean field reflecting Zone Isolation status of the agent.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSatisfiesPzi() {
    return satisfiesPzi;
  }

  /**
   * Optional. Output only. A read only boolean field reflecting Zone Isolation status of the agent.
   * @param satisfiesPzi satisfiesPzi or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Agent setSatisfiesPzi(java.lang.Boolean satisfiesPzi) {
    this.satisfiesPzi = satisfiesPzi;
    return this;
  }

  /**
   * Optional. Output only. A read only boolean field reflecting Zone Separation status of the
   * agent.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSatisfiesPzs() {
    return satisfiesPzs;
  }

  /**
   * Optional. Output only. A read only boolean field reflecting Zone Separation status of the
   * agent.
   * @param satisfiesPzs satisfiesPzs or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Agent setSatisfiesPzs(java.lang.Boolean satisfiesPzs) {
    this.satisfiesPzs = satisfiesPzs;
    return this;
  }

  /**
   * Name of the SecuritySettings reference for the agent. Format:
   * `projects//locations//securitySettings/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getSecuritySettings() {
    return securitySettings;
  }

  /**
   * Name of the SecuritySettings reference for the agent. Format:
   * `projects//locations//securitySettings/`.
   * @param securitySettings securitySettings or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Agent setSecuritySettings(java.lang.String securitySettings) {
    this.securitySettings = securitySettings;
    return this;
  }

  /**
   * Speech recognition related settings.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3SpeechToTextSettings getSpeechToTextSettings() {
    return speechToTextSettings;
  }

  /**
   * Speech recognition related settings.
   * @param speechToTextSettings speechToTextSettings or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Agent setSpeechToTextSettings(GoogleCloudDialogflowCxV3SpeechToTextSettings speechToTextSettings) {
    this.speechToTextSettings = speechToTextSettings;
    return this;
  }

  /**
   * Name of the start flow in this agent. A start flow will be automatically created when the agent
   * is created, and can only be deleted by deleting the agent. Format:
   * `projects//locations//agents//flows/`. Currently only the default start flow with id
   * "00000000-0000-0000-0000-000000000000" is allowed.
   * @return value or {@code null} for none
   */
  public java.lang.String getStartFlow() {
    return startFlow;
  }

  /**
   * Name of the start flow in this agent. A start flow will be automatically created when the agent
   * is created, and can only be deleted by deleting the agent. Format:
   * `projects//locations//agents//flows/`. Currently only the default start flow with id
   * "00000000-0000-0000-0000-000000000000" is allowed.
   * @param startFlow startFlow or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Agent setStartFlow(java.lang.String startFlow) {
    this.startFlow = startFlow;
    return this;
  }

  /**
   * Name of the start playbook in this agent. A start playbook will be automatically created when
   * the agent is created, and can only be deleted by deleting the agent. Format:
   * `projects//locations//agents//playbooks/`. Currently only the default playbook with id
   * "00000000-0000-0000-0000-000000000000" is allowed.
   * @return value or {@code null} for none
   */
  public java.lang.String getStartPlaybook() {
    return startPlaybook;
  }

  /**
   * Name of the start playbook in this agent. A start playbook will be automatically created when
   * the agent is created, and can only be deleted by deleting the agent. Format:
   * `projects//locations//agents//playbooks/`. Currently only the default playbook with id
   * "00000000-0000-0000-0000-000000000000" is allowed.
   * @param startPlaybook startPlaybook or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Agent setStartPlaybook(java.lang.String startPlaybook) {
    this.startPlaybook = startPlaybook;
    return this;
  }

  /**
   * The list of all languages supported by the agent (except for the `default_language_code`).
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSupportedLanguageCodes() {
    return supportedLanguageCodes;
  }

  /**
   * The list of all languages supported by the agent (except for the `default_language_code`).
   * @param supportedLanguageCodes supportedLanguageCodes or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Agent setSupportedLanguageCodes(java.util.List<java.lang.String> supportedLanguageCodes) {
    this.supportedLanguageCodes = supportedLanguageCodes;
    return this;
  }

  /**
   * Settings on instructing the speech synthesizer on how to generate the output audio content.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3TextToSpeechSettings getTextToSpeechSettings() {
    return textToSpeechSettings;
  }

  /**
   * Settings on instructing the speech synthesizer on how to generate the output audio content.
   * @param textToSpeechSettings textToSpeechSettings or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Agent setTextToSpeechSettings(GoogleCloudDialogflowCxV3TextToSpeechSettings textToSpeechSettings) {
    this.textToSpeechSettings = textToSpeechSettings;
    return this;
  }

  /**
   * Required. The time zone of the agent from the [time zone database](https://www.iana.org/time-
   * zones), e.g., America/New_York, Europe/Paris.
   * @return value or {@code null} for none
   */
  public java.lang.String getTimeZone() {
    return timeZone;
  }

  /**
   * Required. The time zone of the agent from the [time zone database](https://www.iana.org/time-
   * zones), e.g., America/New_York, Europe/Paris.
   * @param timeZone timeZone or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Agent setTimeZone(java.lang.String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3Agent set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3Agent) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3Agent clone() {
    return (GoogleCloudDialogflowCxV3Agent) super.clone();
  }

}

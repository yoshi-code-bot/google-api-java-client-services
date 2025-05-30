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
 * Hierarchical advanced settings for agent/flow/page/fulfillment/parameter. Settings exposed at
 * lower level overrides the settings exposed at higher level. Overriding occurs at the sub-setting
 * level. For example, the playback_interruption_settings at fulfillment level only overrides the
 * playback_interruption_settings at the agent level, leaving other settings at the agent level
 * unchanged. DTMF settings does not override each other. DTMF settings set at different levels
 * define DTMF detections running in parallel. Hierarchy: Agent->Flow->Page->Fulfillment/Parameter.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3AdvancedSettings extends com.google.api.client.json.GenericJson {

  /**
   * If present, incoming audio is exported by Dialogflow to the configured Google Cloud Storage
   * destination. Exposed at the following levels: - Agent level - Flow level
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3GcsDestination audioExportGcsDestination;

  /**
   * Settings for DTMF. Exposed at the following levels: - Agent level - Flow level - Page level -
   * Parameter level.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3AdvancedSettingsDtmfSettings dtmfSettings;

  /**
   * Settings for logging. Settings for Dialogflow History, Contact Center messages, StackDriver
   * logs, and speech logging. Exposed at the following levels: - Agent level.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettings loggingSettings;

  /**
   * Settings for speech to text detection. Exposed at the following levels: - Agent level - Flow
   * level - Page level - Parameter level
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3AdvancedSettingsSpeechSettings speechSettings;

  /**
   * If present, incoming audio is exported by Dialogflow to the configured Google Cloud Storage
   * destination. Exposed at the following levels: - Agent level - Flow level
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3GcsDestination getAudioExportGcsDestination() {
    return audioExportGcsDestination;
  }

  /**
   * If present, incoming audio is exported by Dialogflow to the configured Google Cloud Storage
   * destination. Exposed at the following levels: - Agent level - Flow level
   * @param audioExportGcsDestination audioExportGcsDestination or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3AdvancedSettings setAudioExportGcsDestination(GoogleCloudDialogflowCxV3GcsDestination audioExportGcsDestination) {
    this.audioExportGcsDestination = audioExportGcsDestination;
    return this;
  }

  /**
   * Settings for DTMF. Exposed at the following levels: - Agent level - Flow level - Page level -
   * Parameter level.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3AdvancedSettingsDtmfSettings getDtmfSettings() {
    return dtmfSettings;
  }

  /**
   * Settings for DTMF. Exposed at the following levels: - Agent level - Flow level - Page level -
   * Parameter level.
   * @param dtmfSettings dtmfSettings or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3AdvancedSettings setDtmfSettings(GoogleCloudDialogflowCxV3AdvancedSettingsDtmfSettings dtmfSettings) {
    this.dtmfSettings = dtmfSettings;
    return this;
  }

  /**
   * Settings for logging. Settings for Dialogflow History, Contact Center messages, StackDriver
   * logs, and speech logging. Exposed at the following levels: - Agent level.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettings getLoggingSettings() {
    return loggingSettings;
  }

  /**
   * Settings for logging. Settings for Dialogflow History, Contact Center messages, StackDriver
   * logs, and speech logging. Exposed at the following levels: - Agent level.
   * @param loggingSettings loggingSettings or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3AdvancedSettings setLoggingSettings(GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettings loggingSettings) {
    this.loggingSettings = loggingSettings;
    return this;
  }

  /**
   * Settings for speech to text detection. Exposed at the following levels: - Agent level - Flow
   * level - Page level - Parameter level
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3AdvancedSettingsSpeechSettings getSpeechSettings() {
    return speechSettings;
  }

  /**
   * Settings for speech to text detection. Exposed at the following levels: - Agent level - Flow
   * level - Page level - Parameter level
   * @param speechSettings speechSettings or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3AdvancedSettings setSpeechSettings(GoogleCloudDialogflowCxV3AdvancedSettingsSpeechSettings speechSettings) {
    this.speechSettings = speechSettings;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3AdvancedSettings set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3AdvancedSettings) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3AdvancedSettings clone() {
    return (GoogleCloudDialogflowCxV3AdvancedSettings) super.clone();
  }

}

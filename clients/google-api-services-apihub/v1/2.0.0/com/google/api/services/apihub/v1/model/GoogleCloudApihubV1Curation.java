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

package com.google.api.services.apihub.v1.model;

/**
 * A curation resource in the API Hub.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the API hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApihubV1Curation extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The time at which the curation was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. The description of the curation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Required. The display name of the curation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Required. The endpoint to be triggered for curation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudApihubV1Endpoint endpoint;

  /**
   * Output only. The error code of the last execution of the curation. The error code is populated
   * only when the last execution state is failed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lastExecutionErrorCode;

  /**
   * Output only. Error message describing the failure, if any, during the last execution of the
   * curation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lastExecutionErrorMessage;

  /**
   * Output only. The last execution state of the curation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lastExecutionState;

  /**
   * Identifier. The name of the curation. Format:
   * `projects/{project}/locations/{location}/curations/{curation}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The plugin instances and associated actions that are using the curation. Note: A
   * particular curation could be used by multiple plugin instances or multiple actions in a plugin
   * instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudApihubV1PluginInstanceActionID> pluginInstanceActions;

  /**
   * Output only. The time at which the curation was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. The time at which the curation was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time at which the curation was created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudApihubV1Curation setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. The description of the curation.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. The description of the curation.
   * @param description description or {@code null} for none
   */
  public GoogleCloudApihubV1Curation setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Required. The display name of the curation.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. The display name of the curation.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudApihubV1Curation setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Required. The endpoint to be triggered for curation.
   * @return value or {@code null} for none
   */
  public GoogleCloudApihubV1Endpoint getEndpoint() {
    return endpoint;
  }

  /**
   * Required. The endpoint to be triggered for curation.
   * @param endpoint endpoint or {@code null} for none
   */
  public GoogleCloudApihubV1Curation setEndpoint(GoogleCloudApihubV1Endpoint endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  /**
   * Output only. The error code of the last execution of the curation. The error code is populated
   * only when the last execution state is failed.
   * @return value or {@code null} for none
   */
  public java.lang.String getLastExecutionErrorCode() {
    return lastExecutionErrorCode;
  }

  /**
   * Output only. The error code of the last execution of the curation. The error code is populated
   * only when the last execution state is failed.
   * @param lastExecutionErrorCode lastExecutionErrorCode or {@code null} for none
   */
  public GoogleCloudApihubV1Curation setLastExecutionErrorCode(java.lang.String lastExecutionErrorCode) {
    this.lastExecutionErrorCode = lastExecutionErrorCode;
    return this;
  }

  /**
   * Output only. Error message describing the failure, if any, during the last execution of the
   * curation.
   * @return value or {@code null} for none
   */
  public java.lang.String getLastExecutionErrorMessage() {
    return lastExecutionErrorMessage;
  }

  /**
   * Output only. Error message describing the failure, if any, during the last execution of the
   * curation.
   * @param lastExecutionErrorMessage lastExecutionErrorMessage or {@code null} for none
   */
  public GoogleCloudApihubV1Curation setLastExecutionErrorMessage(java.lang.String lastExecutionErrorMessage) {
    this.lastExecutionErrorMessage = lastExecutionErrorMessage;
    return this;
  }

  /**
   * Output only. The last execution state of the curation.
   * @return value or {@code null} for none
   */
  public java.lang.String getLastExecutionState() {
    return lastExecutionState;
  }

  /**
   * Output only. The last execution state of the curation.
   * @param lastExecutionState lastExecutionState or {@code null} for none
   */
  public GoogleCloudApihubV1Curation setLastExecutionState(java.lang.String lastExecutionState) {
    this.lastExecutionState = lastExecutionState;
    return this;
  }

  /**
   * Identifier. The name of the curation. Format:
   * `projects/{project}/locations/{location}/curations/{curation}`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Identifier. The name of the curation. Format:
   * `projects/{project}/locations/{location}/curations/{curation}`
   * @param name name or {@code null} for none
   */
  public GoogleCloudApihubV1Curation setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The plugin instances and associated actions that are using the curation. Note: A
   * particular curation could be used by multiple plugin instances or multiple actions in a plugin
   * instance.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudApihubV1PluginInstanceActionID> getPluginInstanceActions() {
    return pluginInstanceActions;
  }

  /**
   * Output only. The plugin instances and associated actions that are using the curation. Note: A
   * particular curation could be used by multiple plugin instances or multiple actions in a plugin
   * instance.
   * @param pluginInstanceActions pluginInstanceActions or {@code null} for none
   */
  public GoogleCloudApihubV1Curation setPluginInstanceActions(java.util.List<GoogleCloudApihubV1PluginInstanceActionID> pluginInstanceActions) {
    this.pluginInstanceActions = pluginInstanceActions;
    return this;
  }

  /**
   * Output only. The time at which the curation was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The time at which the curation was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleCloudApihubV1Curation setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GoogleCloudApihubV1Curation set(String fieldName, Object value) {
    return (GoogleCloudApihubV1Curation) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApihubV1Curation clone() {
    return (GoogleCloudApihubV1Curation) super.clone();
  }

}

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
 * PluginInstanceAction represents an action which can be executed in the plugin instance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the API hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApihubV1PluginInstanceAction extends com.google.api.client.json.GenericJson {

  /**
   * Required. This should map to one of the action id specified in actions_config in the plugin.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String actionId;

  /**
   * Optional. This configuration should be provided if the plugin action is publishing data to API
   * hub curate layer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudApihubV1CurationConfig curationConfig;

  /**
   * Optional. The execution information for the plugin instance action done corresponding to an API
   * hub instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudApihubV1ExecutionStatus hubInstanceAction;

  /**
   * Output only. The configuration of resources created for a given plugin instance action. Note
   * these will be returned only in case of Non-GCP plugins like OPDK.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudApihubV1ResourceConfig resourceConfig;

  /**
   * Optional. The schedule for this plugin instance action. This can only be set if the plugin
   * supports API_HUB_SCHEDULE_TRIGGER mode for this action.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String scheduleCronExpression;

  /**
   * Optional. The time zone for the schedule cron expression. If not provided, UTC will be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String scheduleTimeZone;

  /**
   * Optional. The service account used to publish data. Note, the service account will only be
   * accepted for non GCP plugins like OPDK.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccount;

  /**
   * Output only. The current state of the plugin action in the plugin instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Required. This should map to one of the action id specified in actions_config in the plugin.
   * @return value or {@code null} for none
   */
  public java.lang.String getActionId() {
    return actionId;
  }

  /**
   * Required. This should map to one of the action id specified in actions_config in the plugin.
   * @param actionId actionId or {@code null} for none
   */
  public GoogleCloudApihubV1PluginInstanceAction setActionId(java.lang.String actionId) {
    this.actionId = actionId;
    return this;
  }

  /**
   * Optional. This configuration should be provided if the plugin action is publishing data to API
   * hub curate layer.
   * @return value or {@code null} for none
   */
  public GoogleCloudApihubV1CurationConfig getCurationConfig() {
    return curationConfig;
  }

  /**
   * Optional. This configuration should be provided if the plugin action is publishing data to API
   * hub curate layer.
   * @param curationConfig curationConfig or {@code null} for none
   */
  public GoogleCloudApihubV1PluginInstanceAction setCurationConfig(GoogleCloudApihubV1CurationConfig curationConfig) {
    this.curationConfig = curationConfig;
    return this;
  }

  /**
   * Optional. The execution information for the plugin instance action done corresponding to an API
   * hub instance.
   * @return value or {@code null} for none
   */
  public GoogleCloudApihubV1ExecutionStatus getHubInstanceAction() {
    return hubInstanceAction;
  }

  /**
   * Optional. The execution information for the plugin instance action done corresponding to an API
   * hub instance.
   * @param hubInstanceAction hubInstanceAction or {@code null} for none
   */
  public GoogleCloudApihubV1PluginInstanceAction setHubInstanceAction(GoogleCloudApihubV1ExecutionStatus hubInstanceAction) {
    this.hubInstanceAction = hubInstanceAction;
    return this;
  }

  /**
   * Output only. The configuration of resources created for a given plugin instance action. Note
   * these will be returned only in case of Non-GCP plugins like OPDK.
   * @return value or {@code null} for none
   */
  public GoogleCloudApihubV1ResourceConfig getResourceConfig() {
    return resourceConfig;
  }

  /**
   * Output only. The configuration of resources created for a given plugin instance action. Note
   * these will be returned only in case of Non-GCP plugins like OPDK.
   * @param resourceConfig resourceConfig or {@code null} for none
   */
  public GoogleCloudApihubV1PluginInstanceAction setResourceConfig(GoogleCloudApihubV1ResourceConfig resourceConfig) {
    this.resourceConfig = resourceConfig;
    return this;
  }

  /**
   * Optional. The schedule for this plugin instance action. This can only be set if the plugin
   * supports API_HUB_SCHEDULE_TRIGGER mode for this action.
   * @return value or {@code null} for none
   */
  public java.lang.String getScheduleCronExpression() {
    return scheduleCronExpression;
  }

  /**
   * Optional. The schedule for this plugin instance action. This can only be set if the plugin
   * supports API_HUB_SCHEDULE_TRIGGER mode for this action.
   * @param scheduleCronExpression scheduleCronExpression or {@code null} for none
   */
  public GoogleCloudApihubV1PluginInstanceAction setScheduleCronExpression(java.lang.String scheduleCronExpression) {
    this.scheduleCronExpression = scheduleCronExpression;
    return this;
  }

  /**
   * Optional. The time zone for the schedule cron expression. If not provided, UTC will be used.
   * @return value or {@code null} for none
   */
  public java.lang.String getScheduleTimeZone() {
    return scheduleTimeZone;
  }

  /**
   * Optional. The time zone for the schedule cron expression. If not provided, UTC will be used.
   * @param scheduleTimeZone scheduleTimeZone or {@code null} for none
   */
  public GoogleCloudApihubV1PluginInstanceAction setScheduleTimeZone(java.lang.String scheduleTimeZone) {
    this.scheduleTimeZone = scheduleTimeZone;
    return this;
  }

  /**
   * Optional. The service account used to publish data. Note, the service account will only be
   * accepted for non GCP plugins like OPDK.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccount() {
    return serviceAccount;
  }

  /**
   * Optional. The service account used to publish data. Note, the service account will only be
   * accepted for non GCP plugins like OPDK.
   * @param serviceAccount serviceAccount or {@code null} for none
   */
  public GoogleCloudApihubV1PluginInstanceAction setServiceAccount(java.lang.String serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  /**
   * Output only. The current state of the plugin action in the plugin instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The current state of the plugin action in the plugin instance.
   * @param state state or {@code null} for none
   */
  public GoogleCloudApihubV1PluginInstanceAction setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public GoogleCloudApihubV1PluginInstanceAction set(String fieldName, Object value) {
    return (GoogleCloudApihubV1PluginInstanceAction) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApihubV1PluginInstanceAction clone() {
    return (GoogleCloudApihubV1PluginInstanceAction) super.clone();
  }

}

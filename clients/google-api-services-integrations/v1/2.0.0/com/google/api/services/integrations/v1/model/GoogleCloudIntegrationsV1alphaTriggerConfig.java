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

package com.google.api.services.integrations.v1.model;

/**
 * Configuration detail of a trigger.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Application Integration API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudIntegrationsV1alphaTriggerConfig extends com.google.api.client.json.GenericJson {

  /**
   * Optional. An alert threshold configuration for the [trigger + client + integration] tuple. If
   * these values are not specified in the trigger config, default values will be populated by the
   * system. Note that there must be exactly one alert threshold configured per [client + trigger +
   * integration] when published.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudIntegrationsV1alphaIntegrationAlertConfig> alertConfig;

  static {
    // hack to force ProGuard to consider GoogleCloudIntegrationsV1alphaIntegrationAlertConfig used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudIntegrationsV1alphaIntegrationAlertConfig.class);
  }

  /**
   * Optional. Cloud Scheduler Trigger related metadata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudIntegrationsV1alphaCloudSchedulerConfig cloudSchedulerConfig;

  /**
   * Optional. User-provided description intended to give additional business context about the
   * task.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Optional. Optional Error catcher id of the error catch flow which will be executed when
   * execution error happens in the task
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String errorCatcherId;

  /**
   * Optional. List of input variables for the api trigger.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudIntegrationsV1alphaTriggerConfigVariables inputVariables;

  /**
   * Optional. The user created label for a particular trigger.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String label;

  /**
   * Optional. Dictates how next tasks will be executed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextTasksExecutionPolicy;

  /**
   * Optional. List of output variables for the api trigger.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudIntegrationsV1alphaTriggerConfigVariables outputVariables;

  /**
   * Optional. Informs the front-end application where to draw this error catcher config on the UI.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudIntegrationsV1alphaCoordinate position;

  /**
   * Optional. Configurable properties of the trigger, not to be confused with integration
   * parameters. E.g. "name" is a property for API triggers and "subscription" is a property for
   * Pub/sub triggers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> properties;

  /**
   * Optional. Set of tasks numbers from where the integration execution is started by this trigger.
   * If this is empty, then integration is executed with default start tasks. In the list of start
   * tasks, none of two tasks can have direct ancestor-descendant relationships (i.e. in a same
   * integration execution graph).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudIntegrationsV1alphaNextTask> startTasks;

  static {
    // hack to force ProGuard to consider GoogleCloudIntegrationsV1alphaNextTask used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudIntegrationsV1alphaNextTask.class);
  }

  /**
   * Optional. Name of the trigger. Example: "API Trigger", "Cloud Pub Sub Trigger" When set will be
   * sent out to monitoring dashabord for tracking purpose.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String trigger;

  /**
   * Optional. Auto-generated trigger ID. The ID is based on the properties that you define in the
   * trigger config. For example, for an API trigger, the trigger ID follows the format:
   * api_trigger/TRIGGER_NAME Where trigger config has properties with value {"Trigger name":
   * TRIGGER_NAME}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String triggerId;

  /**
   * Required. A number to uniquely identify each trigger config within the integration on UI.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String triggerNumber;

  /**
   * Optional. Type of trigger
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String triggerType;

  /**
   * Optional. An alert threshold configuration for the [trigger + client + integration] tuple. If
   * these values are not specified in the trigger config, default values will be populated by the
   * system. Note that there must be exactly one alert threshold configured per [client + trigger +
   * integration] when published.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudIntegrationsV1alphaIntegrationAlertConfig> getAlertConfig() {
    return alertConfig;
  }

  /**
   * Optional. An alert threshold configuration for the [trigger + client + integration] tuple. If
   * these values are not specified in the trigger config, default values will be populated by the
   * system. Note that there must be exactly one alert threshold configured per [client + trigger +
   * integration] when published.
   * @param alertConfig alertConfig or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaTriggerConfig setAlertConfig(java.util.List<GoogleCloudIntegrationsV1alphaIntegrationAlertConfig> alertConfig) {
    this.alertConfig = alertConfig;
    return this;
  }

  /**
   * Optional. Cloud Scheduler Trigger related metadata
   * @return value or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaCloudSchedulerConfig getCloudSchedulerConfig() {
    return cloudSchedulerConfig;
  }

  /**
   * Optional. Cloud Scheduler Trigger related metadata
   * @param cloudSchedulerConfig cloudSchedulerConfig or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaTriggerConfig setCloudSchedulerConfig(GoogleCloudIntegrationsV1alphaCloudSchedulerConfig cloudSchedulerConfig) {
    this.cloudSchedulerConfig = cloudSchedulerConfig;
    return this;
  }

  /**
   * Optional. User-provided description intended to give additional business context about the
   * task.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. User-provided description intended to give additional business context about the
   * task.
   * @param description description or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaTriggerConfig setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional. Optional Error catcher id of the error catch flow which will be executed when
   * execution error happens in the task
   * @return value or {@code null} for none
   */
  public java.lang.String getErrorCatcherId() {
    return errorCatcherId;
  }

  /**
   * Optional. Optional Error catcher id of the error catch flow which will be executed when
   * execution error happens in the task
   * @param errorCatcherId errorCatcherId or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaTriggerConfig setErrorCatcherId(java.lang.String errorCatcherId) {
    this.errorCatcherId = errorCatcherId;
    return this;
  }

  /**
   * Optional. List of input variables for the api trigger.
   * @return value or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaTriggerConfigVariables getInputVariables() {
    return inputVariables;
  }

  /**
   * Optional. List of input variables for the api trigger.
   * @param inputVariables inputVariables or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaTriggerConfig setInputVariables(GoogleCloudIntegrationsV1alphaTriggerConfigVariables inputVariables) {
    this.inputVariables = inputVariables;
    return this;
  }

  /**
   * Optional. The user created label for a particular trigger.
   * @return value or {@code null} for none
   */
  public java.lang.String getLabel() {
    return label;
  }

  /**
   * Optional. The user created label for a particular trigger.
   * @param label label or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaTriggerConfig setLabel(java.lang.String label) {
    this.label = label;
    return this;
  }

  /**
   * Optional. Dictates how next tasks will be executed.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextTasksExecutionPolicy() {
    return nextTasksExecutionPolicy;
  }

  /**
   * Optional. Dictates how next tasks will be executed.
   * @param nextTasksExecutionPolicy nextTasksExecutionPolicy or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaTriggerConfig setNextTasksExecutionPolicy(java.lang.String nextTasksExecutionPolicy) {
    this.nextTasksExecutionPolicy = nextTasksExecutionPolicy;
    return this;
  }

  /**
   * Optional. List of output variables for the api trigger.
   * @return value or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaTriggerConfigVariables getOutputVariables() {
    return outputVariables;
  }

  /**
   * Optional. List of output variables for the api trigger.
   * @param outputVariables outputVariables or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaTriggerConfig setOutputVariables(GoogleCloudIntegrationsV1alphaTriggerConfigVariables outputVariables) {
    this.outputVariables = outputVariables;
    return this;
  }

  /**
   * Optional. Informs the front-end application where to draw this error catcher config on the UI.
   * @return value or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaCoordinate getPosition() {
    return position;
  }

  /**
   * Optional. Informs the front-end application where to draw this error catcher config on the UI.
   * @param position position or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaTriggerConfig setPosition(GoogleCloudIntegrationsV1alphaCoordinate position) {
    this.position = position;
    return this;
  }

  /**
   * Optional. Configurable properties of the trigger, not to be confused with integration
   * parameters. E.g. "name" is a property for API triggers and "subscription" is a property for
   * Pub/sub triggers.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getProperties() {
    return properties;
  }

  /**
   * Optional. Configurable properties of the trigger, not to be confused with integration
   * parameters. E.g. "name" is a property for API triggers and "subscription" is a property for
   * Pub/sub triggers.
   * @param properties properties or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaTriggerConfig setProperties(java.util.Map<String, java.lang.String> properties) {
    this.properties = properties;
    return this;
  }

  /**
   * Optional. Set of tasks numbers from where the integration execution is started by this trigger.
   * If this is empty, then integration is executed with default start tasks. In the list of start
   * tasks, none of two tasks can have direct ancestor-descendant relationships (i.e. in a same
   * integration execution graph).
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudIntegrationsV1alphaNextTask> getStartTasks() {
    return startTasks;
  }

  /**
   * Optional. Set of tasks numbers from where the integration execution is started by this trigger.
   * If this is empty, then integration is executed with default start tasks. In the list of start
   * tasks, none of two tasks can have direct ancestor-descendant relationships (i.e. in a same
   * integration execution graph).
   * @param startTasks startTasks or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaTriggerConfig setStartTasks(java.util.List<GoogleCloudIntegrationsV1alphaNextTask> startTasks) {
    this.startTasks = startTasks;
    return this;
  }

  /**
   * Optional. Name of the trigger. Example: "API Trigger", "Cloud Pub Sub Trigger" When set will be
   * sent out to monitoring dashabord for tracking purpose.
   * @return value or {@code null} for none
   */
  public java.lang.String getTrigger() {
    return trigger;
  }

  /**
   * Optional. Name of the trigger. Example: "API Trigger", "Cloud Pub Sub Trigger" When set will be
   * sent out to monitoring dashabord for tracking purpose.
   * @param trigger trigger or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaTriggerConfig setTrigger(java.lang.String trigger) {
    this.trigger = trigger;
    return this;
  }

  /**
   * Optional. Auto-generated trigger ID. The ID is based on the properties that you define in the
   * trigger config. For example, for an API trigger, the trigger ID follows the format:
   * api_trigger/TRIGGER_NAME Where trigger config has properties with value {"Trigger name":
   * TRIGGER_NAME}
   * @return value or {@code null} for none
   */
  public java.lang.String getTriggerId() {
    return triggerId;
  }

  /**
   * Optional. Auto-generated trigger ID. The ID is based on the properties that you define in the
   * trigger config. For example, for an API trigger, the trigger ID follows the format:
   * api_trigger/TRIGGER_NAME Where trigger config has properties with value {"Trigger name":
   * TRIGGER_NAME}
   * @param triggerId triggerId or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaTriggerConfig setTriggerId(java.lang.String triggerId) {
    this.triggerId = triggerId;
    return this;
  }

  /**
   * Required. A number to uniquely identify each trigger config within the integration on UI.
   * @return value or {@code null} for none
   */
  public java.lang.String getTriggerNumber() {
    return triggerNumber;
  }

  /**
   * Required. A number to uniquely identify each trigger config within the integration on UI.
   * @param triggerNumber triggerNumber or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaTriggerConfig setTriggerNumber(java.lang.String triggerNumber) {
    this.triggerNumber = triggerNumber;
    return this;
  }

  /**
   * Optional. Type of trigger
   * @return value or {@code null} for none
   */
  public java.lang.String getTriggerType() {
    return triggerType;
  }

  /**
   * Optional. Type of trigger
   * @param triggerType triggerType or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaTriggerConfig setTriggerType(java.lang.String triggerType) {
    this.triggerType = triggerType;
    return this;
  }

  @Override
  public GoogleCloudIntegrationsV1alphaTriggerConfig set(String fieldName, Object value) {
    return (GoogleCloudIntegrationsV1alphaTriggerConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudIntegrationsV1alphaTriggerConfig clone() {
    return (GoogleCloudIntegrationsV1alphaTriggerConfig) super.clone();
  }

}

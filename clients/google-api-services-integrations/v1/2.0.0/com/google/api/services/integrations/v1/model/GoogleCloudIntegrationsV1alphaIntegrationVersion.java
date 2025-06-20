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
 * The integration version definition.
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
public final class GoogleCloudIntegrationsV1alphaIntegrationVersion extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Cloud KMS resource name for the CMEK encryption key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cloudKmsKey;

  /**
   * Optional. Cloud Logging details for the integration version
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudIntegrationsV1alphaCloudLoggingDetails cloudLoggingDetails;

  /**
   * Output only. Auto-generated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. Optional. The resource name of the template from which the integration is created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String createdFromTemplate;

  /**
   * Optional. Flag to disable database persistence for execution data, including event execution
   * info, execution export info, execution metadata index and execution param index.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String databasePersistencePolicy;

  /**
   * Optional. The integration description.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Optional. True if variable masking feature should be turned on for this version
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableVariableMasking;

  /**
   * Optional. Error Catch Task configuration for the integration. It's optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudIntegrationsV1alphaErrorCatcherConfig> errorCatcherConfigs;

  static {
    // hack to force ProGuard to consider GoogleCloudIntegrationsV1alphaErrorCatcherConfig used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudIntegrationsV1alphaErrorCatcherConfig.class);
  }

  /**
   * Optional. Config Parameters that are expected to be passed to the integration when an
   * integration is published. This consists of all the parameters that are expected to provide
   * configuration in the integration execution. This gives the user the ability to provide default
   * values, value, add information like connection url, project based configuration value and also
   * provide data types of each parameter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudIntegrationsV1alphaIntegrationConfigParameter> integrationConfigParameters;

  static {
    // hack to force ProGuard to consider GoogleCloudIntegrationsV1alphaIntegrationConfigParameter used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudIntegrationsV1alphaIntegrationConfigParameter.class);
  }

  /**
   * Optional. Parameters that are expected to be passed to the integration when an event is
   * triggered. This consists of all the parameters that are expected in the integration execution.
   * This gives the user the ability to provide default values, add information like PII and also
   * provide data types of each parameter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudIntegrationsV1alphaIntegrationParameter> integrationParameters;

  static {
    // hack to force ProGuard to consider GoogleCloudIntegrationsV1alphaIntegrationParameter used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudIntegrationsV1alphaIntegrationParameter.class);
  }

  /**
   * Optional. Parameters that are expected to be passed to the integration when an event is
   * triggered. This consists of all the parameters that are expected in the integration execution.
   * This gives the user the ability to provide default values, add information like PII and also
   * provide data types of each parameter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EnterpriseCrmFrontendsEventbusProtoWorkflowParameters integrationParametersInternal;

  /**
   * Optional. The last modifier's email address. Generated based on the End User Credentials/LOAS
   * role of the user making the call.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lastModifierEmail;

  /**
   * Optional. The edit lock holder's email address. Generated based on the End User
   * Credentials/LOAS role of the user making the call.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lockHolder;

  /**
   * Output only. Auto-generated primary key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. The origin that indicates where this integration is coming from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String origin;

  /**
   * Optional. The id of the template which was used to create this integration_version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parentTemplateId;

  /**
   * Optional. The run-as service account email, if set and auth config is not configured, that will
   * be used to generate auth token to be used in Connector task, Rest caller task and Cloud
   * function task.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String runAsServiceAccount;

  /**
   * Output only. An increasing sequence that is set when a new snapshot is created. The last
   * created snapshot can be identified by [workflow_name, org_id latest(snapshot_number)]. However,
   * last created snapshot need not be same as the HEAD. So users should always use "HEAD" tag to
   * identify the head.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long snapshotNumber;

  /**
   * Output only. User should not set it as an input.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. Generated by eventbus. User should not set it as an input.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * Optional. Task configuration for the integration. It's optional, but the integration doesn't do
   * anything without task_configs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudIntegrationsV1alphaTaskConfig> taskConfigs;

  /**
   * Optional. Task configuration for the integration. It's optional, but the integration doesn't do
   * anything without task_configs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EnterpriseCrmFrontendsEventbusProtoTaskConfig> taskConfigsInternal;

  static {
    // hack to force ProGuard to consider EnterpriseCrmFrontendsEventbusProtoTaskConfig used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(EnterpriseCrmFrontendsEventbusProtoTaskConfig.class);
  }

  /**
   * Optional. Contains a graph of tasks that will be executed before putting the event in a
   * terminal state (SUCCEEDED/FAILED/FATAL), regardless of success or failure, similar to "finally"
   * in code.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EnterpriseCrmEventbusProtoTeardown teardown;

  /**
   * Optional. Trigger configurations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudIntegrationsV1alphaTriggerConfig> triggerConfigs;

  /**
   * Optional. Trigger configurations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EnterpriseCrmFrontendsEventbusProtoTriggerConfig> triggerConfigsInternal;

  static {
    // hack to force ProGuard to consider EnterpriseCrmFrontendsEventbusProtoTriggerConfig used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(EnterpriseCrmFrontendsEventbusProtoTriggerConfig.class);
  }

  /**
   * Output only. Auto-generated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Optional. A user-defined label that annotates an integration version. Typically, this is only
   * set when the integration version is created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userLabel;

  /**
   * Optional. Cloud KMS resource name for the CMEK encryption key.
   * @return value or {@code null} for none
   */
  public java.lang.String getCloudKmsKey() {
    return cloudKmsKey;
  }

  /**
   * Optional. Cloud KMS resource name for the CMEK encryption key.
   * @param cloudKmsKey cloudKmsKey or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaIntegrationVersion setCloudKmsKey(java.lang.String cloudKmsKey) {
    this.cloudKmsKey = cloudKmsKey;
    return this;
  }

  /**
   * Optional. Cloud Logging details for the integration version
   * @return value or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaCloudLoggingDetails getCloudLoggingDetails() {
    return cloudLoggingDetails;
  }

  /**
   * Optional. Cloud Logging details for the integration version
   * @param cloudLoggingDetails cloudLoggingDetails or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaIntegrationVersion setCloudLoggingDetails(GoogleCloudIntegrationsV1alphaCloudLoggingDetails cloudLoggingDetails) {
    this.cloudLoggingDetails = cloudLoggingDetails;
    return this;
  }

  /**
   * Output only. Auto-generated.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Auto-generated.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaIntegrationVersion setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. Optional. The resource name of the template from which the integration is created.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreatedFromTemplate() {
    return createdFromTemplate;
  }

  /**
   * Optional. Optional. The resource name of the template from which the integration is created.
   * @param createdFromTemplate createdFromTemplate or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaIntegrationVersion setCreatedFromTemplate(java.lang.String createdFromTemplate) {
    this.createdFromTemplate = createdFromTemplate;
    return this;
  }

  /**
   * Optional. Flag to disable database persistence for execution data, including event execution
   * info, execution export info, execution metadata index and execution param index.
   * @return value or {@code null} for none
   */
  public java.lang.String getDatabasePersistencePolicy() {
    return databasePersistencePolicy;
  }

  /**
   * Optional. Flag to disable database persistence for execution data, including event execution
   * info, execution export info, execution metadata index and execution param index.
   * @param databasePersistencePolicy databasePersistencePolicy or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaIntegrationVersion setDatabasePersistencePolicy(java.lang.String databasePersistencePolicy) {
    this.databasePersistencePolicy = databasePersistencePolicy;
    return this;
  }

  /**
   * Optional. The integration description.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. The integration description.
   * @param description description or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaIntegrationVersion setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional. True if variable masking feature should be turned on for this version
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableVariableMasking() {
    return enableVariableMasking;
  }

  /**
   * Optional. True if variable masking feature should be turned on for this version
   * @param enableVariableMasking enableVariableMasking or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaIntegrationVersion setEnableVariableMasking(java.lang.Boolean enableVariableMasking) {
    this.enableVariableMasking = enableVariableMasking;
    return this;
  }

  /**
   * Optional. Error Catch Task configuration for the integration. It's optional.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudIntegrationsV1alphaErrorCatcherConfig> getErrorCatcherConfigs() {
    return errorCatcherConfigs;
  }

  /**
   * Optional. Error Catch Task configuration for the integration. It's optional.
   * @param errorCatcherConfigs errorCatcherConfigs or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaIntegrationVersion setErrorCatcherConfigs(java.util.List<GoogleCloudIntegrationsV1alphaErrorCatcherConfig> errorCatcherConfigs) {
    this.errorCatcherConfigs = errorCatcherConfigs;
    return this;
  }

  /**
   * Optional. Config Parameters that are expected to be passed to the integration when an
   * integration is published. This consists of all the parameters that are expected to provide
   * configuration in the integration execution. This gives the user the ability to provide default
   * values, value, add information like connection url, project based configuration value and also
   * provide data types of each parameter.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudIntegrationsV1alphaIntegrationConfigParameter> getIntegrationConfigParameters() {
    return integrationConfigParameters;
  }

  /**
   * Optional. Config Parameters that are expected to be passed to the integration when an
   * integration is published. This consists of all the parameters that are expected to provide
   * configuration in the integration execution. This gives the user the ability to provide default
   * values, value, add information like connection url, project based configuration value and also
   * provide data types of each parameter.
   * @param integrationConfigParameters integrationConfigParameters or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaIntegrationVersion setIntegrationConfigParameters(java.util.List<GoogleCloudIntegrationsV1alphaIntegrationConfigParameter> integrationConfigParameters) {
    this.integrationConfigParameters = integrationConfigParameters;
    return this;
  }

  /**
   * Optional. Parameters that are expected to be passed to the integration when an event is
   * triggered. This consists of all the parameters that are expected in the integration execution.
   * This gives the user the ability to provide default values, add information like PII and also
   * provide data types of each parameter.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudIntegrationsV1alphaIntegrationParameter> getIntegrationParameters() {
    return integrationParameters;
  }

  /**
   * Optional. Parameters that are expected to be passed to the integration when an event is
   * triggered. This consists of all the parameters that are expected in the integration execution.
   * This gives the user the ability to provide default values, add information like PII and also
   * provide data types of each parameter.
   * @param integrationParameters integrationParameters or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaIntegrationVersion setIntegrationParameters(java.util.List<GoogleCloudIntegrationsV1alphaIntegrationParameter> integrationParameters) {
    this.integrationParameters = integrationParameters;
    return this;
  }

  /**
   * Optional. Parameters that are expected to be passed to the integration when an event is
   * triggered. This consists of all the parameters that are expected in the integration execution.
   * This gives the user the ability to provide default values, add information like PII and also
   * provide data types of each parameter.
   * @return value or {@code null} for none
   */
  public EnterpriseCrmFrontendsEventbusProtoWorkflowParameters getIntegrationParametersInternal() {
    return integrationParametersInternal;
  }

  /**
   * Optional. Parameters that are expected to be passed to the integration when an event is
   * triggered. This consists of all the parameters that are expected in the integration execution.
   * This gives the user the ability to provide default values, add information like PII and also
   * provide data types of each parameter.
   * @param integrationParametersInternal integrationParametersInternal or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaIntegrationVersion setIntegrationParametersInternal(EnterpriseCrmFrontendsEventbusProtoWorkflowParameters integrationParametersInternal) {
    this.integrationParametersInternal = integrationParametersInternal;
    return this;
  }

  /**
   * Optional. The last modifier's email address. Generated based on the End User Credentials/LOAS
   * role of the user making the call.
   * @return value or {@code null} for none
   */
  public java.lang.String getLastModifierEmail() {
    return lastModifierEmail;
  }

  /**
   * Optional. The last modifier's email address. Generated based on the End User Credentials/LOAS
   * role of the user making the call.
   * @param lastModifierEmail lastModifierEmail or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaIntegrationVersion setLastModifierEmail(java.lang.String lastModifierEmail) {
    this.lastModifierEmail = lastModifierEmail;
    return this;
  }

  /**
   * Optional. The edit lock holder's email address. Generated based on the End User
   * Credentials/LOAS role of the user making the call.
   * @return value or {@code null} for none
   */
  public java.lang.String getLockHolder() {
    return lockHolder;
  }

  /**
   * Optional. The edit lock holder's email address. Generated based on the End User
   * Credentials/LOAS role of the user making the call.
   * @param lockHolder lockHolder or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaIntegrationVersion setLockHolder(java.lang.String lockHolder) {
    this.lockHolder = lockHolder;
    return this;
  }

  /**
   * Output only. Auto-generated primary key.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Auto-generated primary key.
   * @param name name or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaIntegrationVersion setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. The origin that indicates where this integration is coming from.
   * @return value or {@code null} for none
   */
  public java.lang.String getOrigin() {
    return origin;
  }

  /**
   * Optional. The origin that indicates where this integration is coming from.
   * @param origin origin or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaIntegrationVersion setOrigin(java.lang.String origin) {
    this.origin = origin;
    return this;
  }

  /**
   * Optional. The id of the template which was used to create this integration_version.
   * @return value or {@code null} for none
   */
  public java.lang.String getParentTemplateId() {
    return parentTemplateId;
  }

  /**
   * Optional. The id of the template which was used to create this integration_version.
   * @param parentTemplateId parentTemplateId or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaIntegrationVersion setParentTemplateId(java.lang.String parentTemplateId) {
    this.parentTemplateId = parentTemplateId;
    return this;
  }

  /**
   * Optional. The run-as service account email, if set and auth config is not configured, that will
   * be used to generate auth token to be used in Connector task, Rest caller task and Cloud
   * function task.
   * @return value or {@code null} for none
   */
  public java.lang.String getRunAsServiceAccount() {
    return runAsServiceAccount;
  }

  /**
   * Optional. The run-as service account email, if set and auth config is not configured, that will
   * be used to generate auth token to be used in Connector task, Rest caller task and Cloud
   * function task.
   * @param runAsServiceAccount runAsServiceAccount or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaIntegrationVersion setRunAsServiceAccount(java.lang.String runAsServiceAccount) {
    this.runAsServiceAccount = runAsServiceAccount;
    return this;
  }

  /**
   * Output only. An increasing sequence that is set when a new snapshot is created. The last
   * created snapshot can be identified by [workflow_name, org_id latest(snapshot_number)]. However,
   * last created snapshot need not be same as the HEAD. So users should always use "HEAD" tag to
   * identify the head.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSnapshotNumber() {
    return snapshotNumber;
  }

  /**
   * Output only. An increasing sequence that is set when a new snapshot is created. The last
   * created snapshot can be identified by [workflow_name, org_id latest(snapshot_number)]. However,
   * last created snapshot need not be same as the HEAD. So users should always use "HEAD" tag to
   * identify the head.
   * @param snapshotNumber snapshotNumber or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaIntegrationVersion setSnapshotNumber(java.lang.Long snapshotNumber) {
    this.snapshotNumber = snapshotNumber;
    return this;
  }

  /**
   * Output only. User should not set it as an input.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. User should not set it as an input.
   * @param state state or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaIntegrationVersion setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. Generated by eventbus. User should not set it as an input.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * Output only. Generated by eventbus. User should not set it as an input.
   * @param status status or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaIntegrationVersion setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * Optional. Task configuration for the integration. It's optional, but the integration doesn't do
   * anything without task_configs.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudIntegrationsV1alphaTaskConfig> getTaskConfigs() {
    return taskConfigs;
  }

  /**
   * Optional. Task configuration for the integration. It's optional, but the integration doesn't do
   * anything without task_configs.
   * @param taskConfigs taskConfigs or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaIntegrationVersion setTaskConfigs(java.util.List<GoogleCloudIntegrationsV1alphaTaskConfig> taskConfigs) {
    this.taskConfigs = taskConfigs;
    return this;
  }

  /**
   * Optional. Task configuration for the integration. It's optional, but the integration doesn't do
   * anything without task_configs.
   * @return value or {@code null} for none
   */
  public java.util.List<EnterpriseCrmFrontendsEventbusProtoTaskConfig> getTaskConfigsInternal() {
    return taskConfigsInternal;
  }

  /**
   * Optional. Task configuration for the integration. It's optional, but the integration doesn't do
   * anything without task_configs.
   * @param taskConfigsInternal taskConfigsInternal or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaIntegrationVersion setTaskConfigsInternal(java.util.List<EnterpriseCrmFrontendsEventbusProtoTaskConfig> taskConfigsInternal) {
    this.taskConfigsInternal = taskConfigsInternal;
    return this;
  }

  /**
   * Optional. Contains a graph of tasks that will be executed before putting the event in a
   * terminal state (SUCCEEDED/FAILED/FATAL), regardless of success or failure, similar to "finally"
   * in code.
   * @return value or {@code null} for none
   */
  public EnterpriseCrmEventbusProtoTeardown getTeardown() {
    return teardown;
  }

  /**
   * Optional. Contains a graph of tasks that will be executed before putting the event in a
   * terminal state (SUCCEEDED/FAILED/FATAL), regardless of success or failure, similar to "finally"
   * in code.
   * @param teardown teardown or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaIntegrationVersion setTeardown(EnterpriseCrmEventbusProtoTeardown teardown) {
    this.teardown = teardown;
    return this;
  }

  /**
   * Optional. Trigger configurations.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudIntegrationsV1alphaTriggerConfig> getTriggerConfigs() {
    return triggerConfigs;
  }

  /**
   * Optional. Trigger configurations.
   * @param triggerConfigs triggerConfigs or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaIntegrationVersion setTriggerConfigs(java.util.List<GoogleCloudIntegrationsV1alphaTriggerConfig> triggerConfigs) {
    this.triggerConfigs = triggerConfigs;
    return this;
  }

  /**
   * Optional. Trigger configurations.
   * @return value or {@code null} for none
   */
  public java.util.List<EnterpriseCrmFrontendsEventbusProtoTriggerConfig> getTriggerConfigsInternal() {
    return triggerConfigsInternal;
  }

  /**
   * Optional. Trigger configurations.
   * @param triggerConfigsInternal triggerConfigsInternal or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaIntegrationVersion setTriggerConfigsInternal(java.util.List<EnterpriseCrmFrontendsEventbusProtoTriggerConfig> triggerConfigsInternal) {
    this.triggerConfigsInternal = triggerConfigsInternal;
    return this;
  }

  /**
   * Output only. Auto-generated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Auto-generated.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaIntegrationVersion setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Optional. A user-defined label that annotates an integration version. Typically, this is only
   * set when the integration version is created.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserLabel() {
    return userLabel;
  }

  /**
   * Optional. A user-defined label that annotates an integration version. Typically, this is only
   * set when the integration version is created.
   * @param userLabel userLabel or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaIntegrationVersion setUserLabel(java.lang.String userLabel) {
    this.userLabel = userLabel;
    return this;
  }

  @Override
  public GoogleCloudIntegrationsV1alphaIntegrationVersion set(String fieldName, Object value) {
    return (GoogleCloudIntegrationsV1alphaIntegrationVersion) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudIntegrationsV1alphaIntegrationVersion clone() {
    return (GoogleCloudIntegrationsV1alphaIntegrationVersion) super.clone();
  }

}

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

package com.google.api.services.datafusion.v1beta1.model;

/**
 * Represents a Data Fusion instance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Fusion API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Instance extends com.google.api.client.json.GenericJson {

  /**
   * Output only. List of accelerators enabled for this CDF instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Accelerator> accelerators;

  static {
    // hack to force ProGuard to consider Accelerator used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Accelerator.class);
  }

  /**
   * Output only. Endpoint on which the REST APIs is accessible.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String apiEndpoint;

  /**
   * Output only. Available versions that the instance can be upgraded to using
   * UpdateInstanceRequest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Version> availableVersion;

  /**
   * Output only. The time the instance was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. The crypto key configuration. This field is used by the Customer-Managed Encryption
   * Keys (CMEK) feature.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CryptoKeyConfig cryptoKeyConfig;

  /**
   * Optional. Option to enable the Dataplex Lineage Integration feature.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean dataplexDataLineageIntegrationEnabled;

  /**
   * Optional. User-managed service account to set on Dataproc when Cloud Data Fusion creates
   * Dataproc to run data processing pipelines. This allows users to have fine-grained access
   * control on Dataproc's accesses to cloud resources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataprocServiceAccount;

  /**
   * Optional. A description of this instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Output only. If the instance state is DISABLED, the reason for disabling the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> disabledReason;

  /**
   * Optional. Display name for an instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Optional. Option to enable granular role-based access control.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableRbac;

  /**
   * Optional. Option to enable Dataproc Stackdriver Logging.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableStackdriverLogging;

  /**
   * Optional. Option to enable Stackdriver Monitoring.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableStackdriverMonitoring;

  /**
   * Output only. Option to enable zone separation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableZoneSeparation;

  /**
   * Optional. Option to enable and pass metadata for event publishing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EventPublishConfig eventPublishConfig;

  /**
   * Output only. Cloud Storage bucket generated by Data Fusion in the customer project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gcsBucket;

  /**
   * The resource labels for instance to use to annotate any related underlying resources such as
   * Compute Engine VMs. The character '=' is not allowed to be used within the labels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Optional. The logging configuration for this instance. This field is supported only in CDF
   * versions 6.11.0 and above.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LoggingConfig loggingConfig;

  /**
   * Output only. The maintenance events for this instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MaintenanceEvent> maintenanceEvents;

  /**
   * Optional. Configure the maintenance policy for this instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MaintenancePolicy maintenancePolicy;

  /**
   * Output only. The name of this instance is in the form of
   * projects/{project}/locations/{location}/instances/{instance}.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. Network configuration options. These are required when a private Data Fusion instance
   * is to be created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NetworkConfig networkConfig;

  /**
   * Optional. Map of additional options used to configure the behavior of Data Fusion instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> options;

  /**
   * Output only. Service agent for the customer project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String p4ServiceAccount;

  /**
   * Optional. Current patch revision of the Data Fusion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String patchRevision;

  /**
   * Optional. Specifies whether the Data Fusion instance should be private. If set to true, all
   * Data Fusion nodes will have private IP addresses and will not be able to access the public
   * internet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean privateInstance;

  /**
   * Output only. Reserved for future use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean satisfiesPzi;

  /**
   * Output only. Reserved for future use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean satisfiesPzs;

  /**
   * Output only. Deprecated. Use tenant_project_id instead to extract the tenant project ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccount;

  /**
   * Output only. Endpoint on which the Data Fusion UI is accessible.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceEndpoint;

  /**
   * Output only. The current state of this Data Fusion instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. Additional information about the current state of this Data Fusion instance if
   * available.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stateMessage;

  /**
   * Optional. Input only. Immutable. Tag keys/values directly bound to this resource. For example:
   * "123/environment": "production", "123/costCenter": "marketing"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> tags;

  /**
   * Output only. The name of the tenant project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tenantProjectId;

  /**
   * Required. Instance type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Output only. The time the instance was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Optional. Current version of Data Fusion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * Output only. Endpoint on which the Data Fusion UI is accessible to third-party users.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String workforceIdentityServiceEndpoint;

  /**
   * Optional. Name of the zone in which the Data Fusion instance will be created. Only DEVELOPER
   * instances use this field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * Output only. List of accelerators enabled for this CDF instance.
   * @return value or {@code null} for none
   */
  public java.util.List<Accelerator> getAccelerators() {
    return accelerators;
  }

  /**
   * Output only. List of accelerators enabled for this CDF instance.
   * @param accelerators accelerators or {@code null} for none
   */
  public Instance setAccelerators(java.util.List<Accelerator> accelerators) {
    this.accelerators = accelerators;
    return this;
  }

  /**
   * Output only. Endpoint on which the REST APIs is accessible.
   * @return value or {@code null} for none
   */
  public java.lang.String getApiEndpoint() {
    return apiEndpoint;
  }

  /**
   * Output only. Endpoint on which the REST APIs is accessible.
   * @param apiEndpoint apiEndpoint or {@code null} for none
   */
  public Instance setApiEndpoint(java.lang.String apiEndpoint) {
    this.apiEndpoint = apiEndpoint;
    return this;
  }

  /**
   * Output only. Available versions that the instance can be upgraded to using
   * UpdateInstanceRequest.
   * @return value or {@code null} for none
   */
  public java.util.List<Version> getAvailableVersion() {
    return availableVersion;
  }

  /**
   * Output only. Available versions that the instance can be upgraded to using
   * UpdateInstanceRequest.
   * @param availableVersion availableVersion or {@code null} for none
   */
  public Instance setAvailableVersion(java.util.List<Version> availableVersion) {
    this.availableVersion = availableVersion;
    return this;
  }

  /**
   * Output only. The time the instance was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time the instance was created.
   * @param createTime createTime or {@code null} for none
   */
  public Instance setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. The crypto key configuration. This field is used by the Customer-Managed Encryption
   * Keys (CMEK) feature.
   * @return value or {@code null} for none
   */
  public CryptoKeyConfig getCryptoKeyConfig() {
    return cryptoKeyConfig;
  }

  /**
   * Optional. The crypto key configuration. This field is used by the Customer-Managed Encryption
   * Keys (CMEK) feature.
   * @param cryptoKeyConfig cryptoKeyConfig or {@code null} for none
   */
  public Instance setCryptoKeyConfig(CryptoKeyConfig cryptoKeyConfig) {
    this.cryptoKeyConfig = cryptoKeyConfig;
    return this;
  }

  /**
   * Optional. Option to enable the Dataplex Lineage Integration feature.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDataplexDataLineageIntegrationEnabled() {
    return dataplexDataLineageIntegrationEnabled;
  }

  /**
   * Optional. Option to enable the Dataplex Lineage Integration feature.
   * @param dataplexDataLineageIntegrationEnabled dataplexDataLineageIntegrationEnabled or {@code null} for none
   */
  public Instance setDataplexDataLineageIntegrationEnabled(java.lang.Boolean dataplexDataLineageIntegrationEnabled) {
    this.dataplexDataLineageIntegrationEnabled = dataplexDataLineageIntegrationEnabled;
    return this;
  }

  /**
   * Optional. User-managed service account to set on Dataproc when Cloud Data Fusion creates
   * Dataproc to run data processing pipelines. This allows users to have fine-grained access
   * control on Dataproc's accesses to cloud resources.
   * @return value or {@code null} for none
   */
  public java.lang.String getDataprocServiceAccount() {
    return dataprocServiceAccount;
  }

  /**
   * Optional. User-managed service account to set on Dataproc when Cloud Data Fusion creates
   * Dataproc to run data processing pipelines. This allows users to have fine-grained access
   * control on Dataproc's accesses to cloud resources.
   * @param dataprocServiceAccount dataprocServiceAccount or {@code null} for none
   */
  public Instance setDataprocServiceAccount(java.lang.String dataprocServiceAccount) {
    this.dataprocServiceAccount = dataprocServiceAccount;
    return this;
  }

  /**
   * Optional. A description of this instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. A description of this instance.
   * @param description description or {@code null} for none
   */
  public Instance setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Output only. If the instance state is DISABLED, the reason for disabling the instance.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDisabledReason() {
    return disabledReason;
  }

  /**
   * Output only. If the instance state is DISABLED, the reason for disabling the instance.
   * @param disabledReason disabledReason or {@code null} for none
   */
  public Instance setDisabledReason(java.util.List<java.lang.String> disabledReason) {
    this.disabledReason = disabledReason;
    return this;
  }

  /**
   * Optional. Display name for an instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Optional. Display name for an instance.
   * @param displayName displayName or {@code null} for none
   */
  public Instance setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Optional. Option to enable granular role-based access control.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableRbac() {
    return enableRbac;
  }

  /**
   * Optional. Option to enable granular role-based access control.
   * @param enableRbac enableRbac or {@code null} for none
   */
  public Instance setEnableRbac(java.lang.Boolean enableRbac) {
    this.enableRbac = enableRbac;
    return this;
  }

  /**
   * Optional. Option to enable Dataproc Stackdriver Logging.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableStackdriverLogging() {
    return enableStackdriverLogging;
  }

  /**
   * Optional. Option to enable Dataproc Stackdriver Logging.
   * @param enableStackdriverLogging enableStackdriverLogging or {@code null} for none
   */
  public Instance setEnableStackdriverLogging(java.lang.Boolean enableStackdriverLogging) {
    this.enableStackdriverLogging = enableStackdriverLogging;
    return this;
  }

  /**
   * Optional. Option to enable Stackdriver Monitoring.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableStackdriverMonitoring() {
    return enableStackdriverMonitoring;
  }

  /**
   * Optional. Option to enable Stackdriver Monitoring.
   * @param enableStackdriverMonitoring enableStackdriverMonitoring or {@code null} for none
   */
  public Instance setEnableStackdriverMonitoring(java.lang.Boolean enableStackdriverMonitoring) {
    this.enableStackdriverMonitoring = enableStackdriverMonitoring;
    return this;
  }

  /**
   * Output only. Option to enable zone separation.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableZoneSeparation() {
    return enableZoneSeparation;
  }

  /**
   * Output only. Option to enable zone separation.
   * @param enableZoneSeparation enableZoneSeparation or {@code null} for none
   */
  public Instance setEnableZoneSeparation(java.lang.Boolean enableZoneSeparation) {
    this.enableZoneSeparation = enableZoneSeparation;
    return this;
  }

  /**
   * Optional. Option to enable and pass metadata for event publishing.
   * @return value or {@code null} for none
   */
  public EventPublishConfig getEventPublishConfig() {
    return eventPublishConfig;
  }

  /**
   * Optional. Option to enable and pass metadata for event publishing.
   * @param eventPublishConfig eventPublishConfig or {@code null} for none
   */
  public Instance setEventPublishConfig(EventPublishConfig eventPublishConfig) {
    this.eventPublishConfig = eventPublishConfig;
    return this;
  }

  /**
   * Output only. Cloud Storage bucket generated by Data Fusion in the customer project.
   * @return value or {@code null} for none
   */
  public java.lang.String getGcsBucket() {
    return gcsBucket;
  }

  /**
   * Output only. Cloud Storage bucket generated by Data Fusion in the customer project.
   * @param gcsBucket gcsBucket or {@code null} for none
   */
  public Instance setGcsBucket(java.lang.String gcsBucket) {
    this.gcsBucket = gcsBucket;
    return this;
  }

  /**
   * The resource labels for instance to use to annotate any related underlying resources such as
   * Compute Engine VMs. The character '=' is not allowed to be used within the labels.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * The resource labels for instance to use to annotate any related underlying resources such as
   * Compute Engine VMs. The character '=' is not allowed to be used within the labels.
   * @param labels labels or {@code null} for none
   */
  public Instance setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Optional. The logging configuration for this instance. This field is supported only in CDF
   * versions 6.11.0 and above.
   * @return value or {@code null} for none
   */
  public LoggingConfig getLoggingConfig() {
    return loggingConfig;
  }

  /**
   * Optional. The logging configuration for this instance. This field is supported only in CDF
   * versions 6.11.0 and above.
   * @param loggingConfig loggingConfig or {@code null} for none
   */
  public Instance setLoggingConfig(LoggingConfig loggingConfig) {
    this.loggingConfig = loggingConfig;
    return this;
  }

  /**
   * Output only. The maintenance events for this instance.
   * @return value or {@code null} for none
   */
  public java.util.List<MaintenanceEvent> getMaintenanceEvents() {
    return maintenanceEvents;
  }

  /**
   * Output only. The maintenance events for this instance.
   * @param maintenanceEvents maintenanceEvents or {@code null} for none
   */
  public Instance setMaintenanceEvents(java.util.List<MaintenanceEvent> maintenanceEvents) {
    this.maintenanceEvents = maintenanceEvents;
    return this;
  }

  /**
   * Optional. Configure the maintenance policy for this instance.
   * @return value or {@code null} for none
   */
  public MaintenancePolicy getMaintenancePolicy() {
    return maintenancePolicy;
  }

  /**
   * Optional. Configure the maintenance policy for this instance.
   * @param maintenancePolicy maintenancePolicy or {@code null} for none
   */
  public Instance setMaintenancePolicy(MaintenancePolicy maintenancePolicy) {
    this.maintenancePolicy = maintenancePolicy;
    return this;
  }

  /**
   * Output only. The name of this instance is in the form of
   * projects/{project}/locations/{location}/instances/{instance}.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The name of this instance is in the form of
   * projects/{project}/locations/{location}/instances/{instance}.
   * @param name name or {@code null} for none
   */
  public Instance setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. Network configuration options. These are required when a private Data Fusion instance
   * is to be created.
   * @return value or {@code null} for none
   */
  public NetworkConfig getNetworkConfig() {
    return networkConfig;
  }

  /**
   * Optional. Network configuration options. These are required when a private Data Fusion instance
   * is to be created.
   * @param networkConfig networkConfig or {@code null} for none
   */
  public Instance setNetworkConfig(NetworkConfig networkConfig) {
    this.networkConfig = networkConfig;
    return this;
  }

  /**
   * Optional. Map of additional options used to configure the behavior of Data Fusion instance.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getOptions() {
    return options;
  }

  /**
   * Optional. Map of additional options used to configure the behavior of Data Fusion instance.
   * @param options options or {@code null} for none
   */
  public Instance setOptions(java.util.Map<String, java.lang.String> options) {
    this.options = options;
    return this;
  }

  /**
   * Output only. Service agent for the customer project.
   * @return value or {@code null} for none
   */
  public java.lang.String getP4ServiceAccount() {
    return p4ServiceAccount;
  }

  /**
   * Output only. Service agent for the customer project.
   * @param p4ServiceAccount p4ServiceAccount or {@code null} for none
   */
  public Instance setP4ServiceAccount(java.lang.String p4ServiceAccount) {
    this.p4ServiceAccount = p4ServiceAccount;
    return this;
  }

  /**
   * Optional. Current patch revision of the Data Fusion.
   * @return value or {@code null} for none
   */
  public java.lang.String getPatchRevision() {
    return patchRevision;
  }

  /**
   * Optional. Current patch revision of the Data Fusion.
   * @param patchRevision patchRevision or {@code null} for none
   */
  public Instance setPatchRevision(java.lang.String patchRevision) {
    this.patchRevision = patchRevision;
    return this;
  }

  /**
   * Optional. Specifies whether the Data Fusion instance should be private. If set to true, all
   * Data Fusion nodes will have private IP addresses and will not be able to access the public
   * internet.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPrivateInstance() {
    return privateInstance;
  }

  /**
   * Optional. Specifies whether the Data Fusion instance should be private. If set to true, all
   * Data Fusion nodes will have private IP addresses and will not be able to access the public
   * internet.
   * @param privateInstance privateInstance or {@code null} for none
   */
  public Instance setPrivateInstance(java.lang.Boolean privateInstance) {
    this.privateInstance = privateInstance;
    return this;
  }

  /**
   * Output only. Reserved for future use.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSatisfiesPzi() {
    return satisfiesPzi;
  }

  /**
   * Output only. Reserved for future use.
   * @param satisfiesPzi satisfiesPzi or {@code null} for none
   */
  public Instance setSatisfiesPzi(java.lang.Boolean satisfiesPzi) {
    this.satisfiesPzi = satisfiesPzi;
    return this;
  }

  /**
   * Output only. Reserved for future use.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSatisfiesPzs() {
    return satisfiesPzs;
  }

  /**
   * Output only. Reserved for future use.
   * @param satisfiesPzs satisfiesPzs or {@code null} for none
   */
  public Instance setSatisfiesPzs(java.lang.Boolean satisfiesPzs) {
    this.satisfiesPzs = satisfiesPzs;
    return this;
  }

  /**
   * Output only. Deprecated. Use tenant_project_id instead to extract the tenant project ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccount() {
    return serviceAccount;
  }

  /**
   * Output only. Deprecated. Use tenant_project_id instead to extract the tenant project ID.
   * @param serviceAccount serviceAccount or {@code null} for none
   */
  public Instance setServiceAccount(java.lang.String serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  /**
   * Output only. Endpoint on which the Data Fusion UI is accessible.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceEndpoint() {
    return serviceEndpoint;
  }

  /**
   * Output only. Endpoint on which the Data Fusion UI is accessible.
   * @param serviceEndpoint serviceEndpoint or {@code null} for none
   */
  public Instance setServiceEndpoint(java.lang.String serviceEndpoint) {
    this.serviceEndpoint = serviceEndpoint;
    return this;
  }

  /**
   * Output only. The current state of this Data Fusion instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The current state of this Data Fusion instance.
   * @param state state or {@code null} for none
   */
  public Instance setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. Additional information about the current state of this Data Fusion instance if
   * available.
   * @return value or {@code null} for none
   */
  public java.lang.String getStateMessage() {
    return stateMessage;
  }

  /**
   * Output only. Additional information about the current state of this Data Fusion instance if
   * available.
   * @param stateMessage stateMessage or {@code null} for none
   */
  public Instance setStateMessage(java.lang.String stateMessage) {
    this.stateMessage = stateMessage;
    return this;
  }

  /**
   * Optional. Input only. Immutable. Tag keys/values directly bound to this resource. For example:
   * "123/environment": "production", "123/costCenter": "marketing"
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getTags() {
    return tags;
  }

  /**
   * Optional. Input only. Immutable. Tag keys/values directly bound to this resource. For example:
   * "123/environment": "production", "123/costCenter": "marketing"
   * @param tags tags or {@code null} for none
   */
  public Instance setTags(java.util.Map<String, java.lang.String> tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Output only. The name of the tenant project.
   * @return value or {@code null} for none
   */
  public java.lang.String getTenantProjectId() {
    return tenantProjectId;
  }

  /**
   * Output only. The name of the tenant project.
   * @param tenantProjectId tenantProjectId or {@code null} for none
   */
  public Instance setTenantProjectId(java.lang.String tenantProjectId) {
    this.tenantProjectId = tenantProjectId;
    return this;
  }

  /**
   * Required. Instance type.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Required. Instance type.
   * @param type type or {@code null} for none
   */
  public Instance setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * Output only. The time the instance was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The time the instance was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public Instance setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Optional. Current version of Data Fusion.
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * Optional. Current version of Data Fusion.
   * @param version version or {@code null} for none
   */
  public Instance setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  /**
   * Output only. Endpoint on which the Data Fusion UI is accessible to third-party users.
   * @return value or {@code null} for none
   */
  public java.lang.String getWorkforceIdentityServiceEndpoint() {
    return workforceIdentityServiceEndpoint;
  }

  /**
   * Output only. Endpoint on which the Data Fusion UI is accessible to third-party users.
   * @param workforceIdentityServiceEndpoint workforceIdentityServiceEndpoint or {@code null} for none
   */
  public Instance setWorkforceIdentityServiceEndpoint(java.lang.String workforceIdentityServiceEndpoint) {
    this.workforceIdentityServiceEndpoint = workforceIdentityServiceEndpoint;
    return this;
  }

  /**
   * Optional. Name of the zone in which the Data Fusion instance will be created. Only DEVELOPER
   * instances use this field.
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * Optional. Name of the zone in which the Data Fusion instance will be created. Only DEVELOPER
   * instances use this field.
   * @param zone zone or {@code null} for none
   */
  public Instance setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public Instance set(String fieldName, Object value) {
    return (Instance) super.set(fieldName, value);
  }

  @Override
  public Instance clone() {
    return (Instance) super.clone();
  }

}

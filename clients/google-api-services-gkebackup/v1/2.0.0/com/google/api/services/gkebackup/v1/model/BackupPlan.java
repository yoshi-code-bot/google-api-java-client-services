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

package com.google.api.services.gkebackup.v1.model;

/**
 * Defines the configuration and scheduling for a "line" of Backups.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Backup for GKE API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BackupPlan extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The fully qualified name of the BackupChannel to be used to create a backup. This
   * field is set only if the cluster being backed up is in a different project.
   * `projects/locations/backupChannels`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String backupChannel;

  /**
   * Optional. Defines the configuration of Backups created via this BackupPlan.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BackupConfig backupConfig;

  /**
   * Optional. Defines a schedule for automatic Backup creation via this BackupPlan.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Schedule backupSchedule;

  /**
   * Required. Immutable. The source cluster from which Backups will be created via this BackupPlan.
   * Valid formats: - `projects/locations/clusters` - `projects/zones/clusters`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cluster;

  /**
   * Output only. The timestamp when this BackupPlan resource was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. This flag indicates whether this BackupPlan has been deactivated. Setting this field
   * to True locks the BackupPlan such that no further updates will be allowed (except deletes),
   * including the deactivated field itself. It also prevents any new Backups from being created via
   * this BackupPlan (including scheduled Backups). Default: False
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean deactivated;

  /**
   * Optional. User specified descriptive string for this BackupPlan.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Output only. `etag` is used for optimistic concurrency control as a way to help prevent
   * simultaneous updates of a backup plan from overwriting each other. It is strongly suggested
   * that systems make use of the 'etag' in the read-modify-write cycle to perform BackupPlan
   * updates in order to avoid race conditions: An `etag` is returned in the response to
   * `GetBackupPlan`, and systems are expected to put that etag in the request to `UpdateBackupPlan`
   * or `DeleteBackupPlan` to ensure that their change will be applied to the same version of the
   * resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Optional. A set of custom labels supplied by user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Output only. Completion time of the last successful Backup. This is sourced from a successful
   * Backup's complete_time field. This field is added to maintain consistency with
   * BackupPlanBinding to display last successful backup time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastSuccessfulBackupTime;

  /**
   * Output only. The full name of the BackupPlan resource. Format: `projects/locations/backupPlans`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The number of Kubernetes Pods backed up in the last successful Backup created via
   * this BackupPlan.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer protectedPodCount;

  /**
   * Optional. RetentionPolicy governs lifecycle of Backups created under this plan.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RetentionPolicy retentionPolicy;

  /**
   * Output only. A number that represents the current risk level of this BackupPlan from RPO
   * perspective with 1 being no risk and 5 being highest risk.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer rpoRiskLevel;

  /**
   * Output only. Human-readable description of why the BackupPlan is in the current rpo_risk_level
   * and action items if any.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rpoRiskReason;

  /**
   * Output only. State of the BackupPlan. This State field reflects the various stages a BackupPlan
   * can be in during the Create operation. It will be set to "DEACTIVATED" if the BackupPlan is
   * deactivated on an Update
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. Human-readable description of why BackupPlan is in the current `state`. This field
   * is only meant for human readability and should not be used programmatically as this field is
   * not guaranteed to be consistent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stateReason;

  /**
   * Output only. Server generated global unique identifier of
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier) format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uid;

  /**
   * Output only. The timestamp when this BackupPlan resource was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. The fully qualified name of the BackupChannel to be used to create a backup. This
   * field is set only if the cluster being backed up is in a different project.
   * `projects/locations/backupChannels`
   * @return value or {@code null} for none
   */
  public java.lang.String getBackupChannel() {
    return backupChannel;
  }

  /**
   * Output only. The fully qualified name of the BackupChannel to be used to create a backup. This
   * field is set only if the cluster being backed up is in a different project.
   * `projects/locations/backupChannels`
   * @param backupChannel backupChannel or {@code null} for none
   */
  public BackupPlan setBackupChannel(java.lang.String backupChannel) {
    this.backupChannel = backupChannel;
    return this;
  }

  /**
   * Optional. Defines the configuration of Backups created via this BackupPlan.
   * @return value or {@code null} for none
   */
  public BackupConfig getBackupConfig() {
    return backupConfig;
  }

  /**
   * Optional. Defines the configuration of Backups created via this BackupPlan.
   * @param backupConfig backupConfig or {@code null} for none
   */
  public BackupPlan setBackupConfig(BackupConfig backupConfig) {
    this.backupConfig = backupConfig;
    return this;
  }

  /**
   * Optional. Defines a schedule for automatic Backup creation via this BackupPlan.
   * @return value or {@code null} for none
   */
  public Schedule getBackupSchedule() {
    return backupSchedule;
  }

  /**
   * Optional. Defines a schedule for automatic Backup creation via this BackupPlan.
   * @param backupSchedule backupSchedule or {@code null} for none
   */
  public BackupPlan setBackupSchedule(Schedule backupSchedule) {
    this.backupSchedule = backupSchedule;
    return this;
  }

  /**
   * Required. Immutable. The source cluster from which Backups will be created via this BackupPlan.
   * Valid formats: - `projects/locations/clusters` - `projects/zones/clusters`
   * @return value or {@code null} for none
   */
  public java.lang.String getCluster() {
    return cluster;
  }

  /**
   * Required. Immutable. The source cluster from which Backups will be created via this BackupPlan.
   * Valid formats: - `projects/locations/clusters` - `projects/zones/clusters`
   * @param cluster cluster or {@code null} for none
   */
  public BackupPlan setCluster(java.lang.String cluster) {
    this.cluster = cluster;
    return this;
  }

  /**
   * Output only. The timestamp when this BackupPlan resource was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The timestamp when this BackupPlan resource was created.
   * @param createTime createTime or {@code null} for none
   */
  public BackupPlan setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. This flag indicates whether this BackupPlan has been deactivated. Setting this field
   * to True locks the BackupPlan such that no further updates will be allowed (except deletes),
   * including the deactivated field itself. It also prevents any new Backups from being created via
   * this BackupPlan (including scheduled Backups). Default: False
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDeactivated() {
    return deactivated;
  }

  /**
   * Optional. This flag indicates whether this BackupPlan has been deactivated. Setting this field
   * to True locks the BackupPlan such that no further updates will be allowed (except deletes),
   * including the deactivated field itself. It also prevents any new Backups from being created via
   * this BackupPlan (including scheduled Backups). Default: False
   * @param deactivated deactivated or {@code null} for none
   */
  public BackupPlan setDeactivated(java.lang.Boolean deactivated) {
    this.deactivated = deactivated;
    return this;
  }

  /**
   * Optional. User specified descriptive string for this BackupPlan.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. User specified descriptive string for this BackupPlan.
   * @param description description or {@code null} for none
   */
  public BackupPlan setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Output only. `etag` is used for optimistic concurrency control as a way to help prevent
   * simultaneous updates of a backup plan from overwriting each other. It is strongly suggested
   * that systems make use of the 'etag' in the read-modify-write cycle to perform BackupPlan
   * updates in order to avoid race conditions: An `etag` is returned in the response to
   * `GetBackupPlan`, and systems are expected to put that etag in the request to `UpdateBackupPlan`
   * or `DeleteBackupPlan` to ensure that their change will be applied to the same version of the
   * resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Output only. `etag` is used for optimistic concurrency control as a way to help prevent
   * simultaneous updates of a backup plan from overwriting each other. It is strongly suggested
   * that systems make use of the 'etag' in the read-modify-write cycle to perform BackupPlan
   * updates in order to avoid race conditions: An `etag` is returned in the response to
   * `GetBackupPlan`, and systems are expected to put that etag in the request to `UpdateBackupPlan`
   * or `DeleteBackupPlan` to ensure that their change will be applied to the same version of the
   * resource.
   * @param etag etag or {@code null} for none
   */
  public BackupPlan setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Optional. A set of custom labels supplied by user.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. A set of custom labels supplied by user.
   * @param labels labels or {@code null} for none
   */
  public BackupPlan setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Output only. Completion time of the last successful Backup. This is sourced from a successful
   * Backup's complete_time field. This field is added to maintain consistency with
   * BackupPlanBinding to display last successful backup time.
   * @return value or {@code null} for none
   */
  public String getLastSuccessfulBackupTime() {
    return lastSuccessfulBackupTime;
  }

  /**
   * Output only. Completion time of the last successful Backup. This is sourced from a successful
   * Backup's complete_time field. This field is added to maintain consistency with
   * BackupPlanBinding to display last successful backup time.
   * @param lastSuccessfulBackupTime lastSuccessfulBackupTime or {@code null} for none
   */
  public BackupPlan setLastSuccessfulBackupTime(String lastSuccessfulBackupTime) {
    this.lastSuccessfulBackupTime = lastSuccessfulBackupTime;
    return this;
  }

  /**
   * Output only. The full name of the BackupPlan resource. Format: `projects/locations/backupPlans`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The full name of the BackupPlan resource. Format: `projects/locations/backupPlans`
   * @param name name or {@code null} for none
   */
  public BackupPlan setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The number of Kubernetes Pods backed up in the last successful Backup created via
   * this BackupPlan.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getProtectedPodCount() {
    return protectedPodCount;
  }

  /**
   * Output only. The number of Kubernetes Pods backed up in the last successful Backup created via
   * this BackupPlan.
   * @param protectedPodCount protectedPodCount or {@code null} for none
   */
  public BackupPlan setProtectedPodCount(java.lang.Integer protectedPodCount) {
    this.protectedPodCount = protectedPodCount;
    return this;
  }

  /**
   * Optional. RetentionPolicy governs lifecycle of Backups created under this plan.
   * @return value or {@code null} for none
   */
  public RetentionPolicy getRetentionPolicy() {
    return retentionPolicy;
  }

  /**
   * Optional. RetentionPolicy governs lifecycle of Backups created under this plan.
   * @param retentionPolicy retentionPolicy or {@code null} for none
   */
  public BackupPlan setRetentionPolicy(RetentionPolicy retentionPolicy) {
    this.retentionPolicy = retentionPolicy;
    return this;
  }

  /**
   * Output only. A number that represents the current risk level of this BackupPlan from RPO
   * perspective with 1 being no risk and 5 being highest risk.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRpoRiskLevel() {
    return rpoRiskLevel;
  }

  /**
   * Output only. A number that represents the current risk level of this BackupPlan from RPO
   * perspective with 1 being no risk and 5 being highest risk.
   * @param rpoRiskLevel rpoRiskLevel or {@code null} for none
   */
  public BackupPlan setRpoRiskLevel(java.lang.Integer rpoRiskLevel) {
    this.rpoRiskLevel = rpoRiskLevel;
    return this;
  }

  /**
   * Output only. Human-readable description of why the BackupPlan is in the current rpo_risk_level
   * and action items if any.
   * @return value or {@code null} for none
   */
  public java.lang.String getRpoRiskReason() {
    return rpoRiskReason;
  }

  /**
   * Output only. Human-readable description of why the BackupPlan is in the current rpo_risk_level
   * and action items if any.
   * @param rpoRiskReason rpoRiskReason or {@code null} for none
   */
  public BackupPlan setRpoRiskReason(java.lang.String rpoRiskReason) {
    this.rpoRiskReason = rpoRiskReason;
    return this;
  }

  /**
   * Output only. State of the BackupPlan. This State field reflects the various stages a BackupPlan
   * can be in during the Create operation. It will be set to "DEACTIVATED" if the BackupPlan is
   * deactivated on an Update
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. State of the BackupPlan. This State field reflects the various stages a BackupPlan
   * can be in during the Create operation. It will be set to "DEACTIVATED" if the BackupPlan is
   * deactivated on an Update
   * @param state state or {@code null} for none
   */
  public BackupPlan setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. Human-readable description of why BackupPlan is in the current `state`. This field
   * is only meant for human readability and should not be used programmatically as this field is
   * not guaranteed to be consistent.
   * @return value or {@code null} for none
   */
  public java.lang.String getStateReason() {
    return stateReason;
  }

  /**
   * Output only. Human-readable description of why BackupPlan is in the current `state`. This field
   * is only meant for human readability and should not be used programmatically as this field is
   * not guaranteed to be consistent.
   * @param stateReason stateReason or {@code null} for none
   */
  public BackupPlan setStateReason(java.lang.String stateReason) {
    this.stateReason = stateReason;
    return this;
  }

  /**
   * Output only. Server generated global unique identifier of
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier) format.
   * @return value or {@code null} for none
   */
  public java.lang.String getUid() {
    return uid;
  }

  /**
   * Output only. Server generated global unique identifier of
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier) format.
   * @param uid uid or {@code null} for none
   */
  public BackupPlan setUid(java.lang.String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * Output only. The timestamp when this BackupPlan resource was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The timestamp when this BackupPlan resource was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public BackupPlan setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public BackupPlan set(String fieldName, Object value) {
    return (BackupPlan) super.set(fieldName, value);
  }

  @Override
  public BackupPlan clone() {
    return (BackupPlan) super.clone();
  }

}

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
 * Represents a request to perform a single point-in-time capture of some portion of the state of a
 * GKE cluster, the record of the backup operation itself, and an anchor for the underlying
 * artifacts that comprise the Backup (the config backup and VolumeBackups).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Backup for GKE API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Backup extends com.google.api.client.json.GenericJson {

  /**
   * Output only. If True, all namespaces were included in the Backup.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allNamespaces;

  /**
   * Output only. Information about the GKE cluster from which this Backup was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ClusterMetadata clusterMetadata;

  /**
   * Output only. Completion time of the Backup
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String completeTime;

  /**
   * Output only. The size of the config backup in bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long configBackupSizeBytes;

  /**
   * Output only. Whether or not the Backup contains Kubernetes Secrets. Controlled by the parent
   * BackupPlan's include_secrets value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean containsSecrets;

  /**
   * Output only. Whether or not the Backup contains volume data. Controlled by the parent
   * BackupPlan's include_volume_data value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean containsVolumeData;

  /**
   * Output only. The timestamp when this Backup resource was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. Minimum age for this Backup (in days). If this field is set to a non-zero value, the
   * Backup will be "locked" against deletion (either manual or automatic deletion) for the number
   * of days provided (measured from the creation time of the Backup). MUST be an integer value
   * between 0-90 (inclusive). Defaults to parent BackupPlan's backup_delete_lock_days setting and
   * may only be increased (either at creation time or in a subsequent update).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer deleteLockDays;

  /**
   * Output only. The time at which an existing delete lock will expire for this backup (calculated
   * from create_time + delete_lock_days).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String deleteLockExpireTime;

  /**
   * Optional. User specified descriptive string for this Backup.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Output only. The customer managed encryption key that was used to encrypt the Backup's
   * artifacts. Inherited from the parent BackupPlan's encryption_key value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EncryptionKey encryptionKey;

  /**
   * Output only. `etag` is used for optimistic concurrency control as a way to help prevent
   * simultaneous updates of a backup from overwriting each other. It is strongly suggested that
   * systems make use of the `etag` in the read-modify-write cycle to perform backup updates in
   * order to avoid race conditions: An `etag` is returned in the response to `GetBackup`, and
   * systems are expected to put that etag in the request to `UpdateBackup` or `DeleteBackup` to
   * ensure that their change will be applied to the same version of the resource.
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
   * Output only. This flag indicates whether this Backup resource was created manually by a user or
   * via a schedule in the BackupPlan. A value of True means that the Backup was created manually.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean manual;

  /**
   * Output only. The fully qualified name of the Backup. `projects/locations/backupPlans/backups`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. If false, Backup will fail when Backup for GKE detects Kubernetes configuration
   * that is non-standard or requires additional setup to restore. Inherited from the parent
   * BackupPlan's permissive_mode value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean permissiveMode;

  /**
   * Output only. The total number of Kubernetes Pods contained in the Backup.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer podCount;

  /**
   * Output only. The total number of Kubernetes resources included in the Backup.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer resourceCount;

  /**
   * Optional. The age (in days) after which this Backup will be automatically deleted. Must be an
   * integer value >= 0: - If 0, no automatic deletion will occur for this Backup. - If not 0, this
   * must be >= delete_lock_days and <= 365. Once a Backup is created, this value may only be
   * increased. Defaults to the parent BackupPlan's backup_retain_days value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer retainDays;

  /**
   * Output only. The time at which this Backup will be automatically deleted (calculated from
   * create_time + retain_days).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String retainExpireTime;

  /**
   * Output only. [Output Only] Reserved for future use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean satisfiesPzi;

  /**
   * Output only. [Output Only] Reserved for future use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean satisfiesPzs;

  /**
   * Output only. If set, the list of ProtectedApplications whose resources were included in the
   * Backup.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NamespacedNames selectedApplications;

  /**
   * Output only. If set, the list of labels whose constituent namespaces were included in the
   * Backup.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ResourceLabels selectedNamespaceLabels;

  /**
   * Output only. If set, the list of namespaces that were included in the Backup.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Namespaces selectedNamespaces;

  /**
   * Output only. The total size of the Backup in bytes = config backup size + sum(volume backup
   * sizes)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long sizeBytes;

  /**
   * Output only. Current state of the Backup
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. Human-readable description of why the backup is in the current `state`. This field
   * is only meant for human readability and should not be used programmatically as this field is
   * not guaranteed to be consistent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stateReason;

  /**
   * Output only. Information about the troubleshooting steps which will provide debugging
   * information to the end users.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TroubleshootingInfo troubleshootingInfo;

  /**
   * Output only. Server generated global unique identifier of
   * [UUID4](https://en.wikipedia.org/wiki/Universally_unique_identifier)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uid;

  /**
   * Output only. The timestamp when this Backup resource was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. The total number of volume backups contained in the Backup.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer volumeCount;

  /**
   * Output only. If True, all namespaces were included in the Backup.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllNamespaces() {
    return allNamespaces;
  }

  /**
   * Output only. If True, all namespaces were included in the Backup.
   * @param allNamespaces allNamespaces or {@code null} for none
   */
  public Backup setAllNamespaces(java.lang.Boolean allNamespaces) {
    this.allNamespaces = allNamespaces;
    return this;
  }

  /**
   * Output only. Information about the GKE cluster from which this Backup was created.
   * @return value or {@code null} for none
   */
  public ClusterMetadata getClusterMetadata() {
    return clusterMetadata;
  }

  /**
   * Output only. Information about the GKE cluster from which this Backup was created.
   * @param clusterMetadata clusterMetadata or {@code null} for none
   */
  public Backup setClusterMetadata(ClusterMetadata clusterMetadata) {
    this.clusterMetadata = clusterMetadata;
    return this;
  }

  /**
   * Output only. Completion time of the Backup
   * @return value or {@code null} for none
   */
  public String getCompleteTime() {
    return completeTime;
  }

  /**
   * Output only. Completion time of the Backup
   * @param completeTime completeTime or {@code null} for none
   */
  public Backup setCompleteTime(String completeTime) {
    this.completeTime = completeTime;
    return this;
  }

  /**
   * Output only. The size of the config backup in bytes.
   * @return value or {@code null} for none
   */
  public java.lang.Long getConfigBackupSizeBytes() {
    return configBackupSizeBytes;
  }

  /**
   * Output only. The size of the config backup in bytes.
   * @param configBackupSizeBytes configBackupSizeBytes or {@code null} for none
   */
  public Backup setConfigBackupSizeBytes(java.lang.Long configBackupSizeBytes) {
    this.configBackupSizeBytes = configBackupSizeBytes;
    return this;
  }

  /**
   * Output only. Whether or not the Backup contains Kubernetes Secrets. Controlled by the parent
   * BackupPlan's include_secrets value.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getContainsSecrets() {
    return containsSecrets;
  }

  /**
   * Output only. Whether or not the Backup contains Kubernetes Secrets. Controlled by the parent
   * BackupPlan's include_secrets value.
   * @param containsSecrets containsSecrets or {@code null} for none
   */
  public Backup setContainsSecrets(java.lang.Boolean containsSecrets) {
    this.containsSecrets = containsSecrets;
    return this;
  }

  /**
   * Output only. Whether or not the Backup contains volume data. Controlled by the parent
   * BackupPlan's include_volume_data value.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getContainsVolumeData() {
    return containsVolumeData;
  }

  /**
   * Output only. Whether or not the Backup contains volume data. Controlled by the parent
   * BackupPlan's include_volume_data value.
   * @param containsVolumeData containsVolumeData or {@code null} for none
   */
  public Backup setContainsVolumeData(java.lang.Boolean containsVolumeData) {
    this.containsVolumeData = containsVolumeData;
    return this;
  }

  /**
   * Output only. The timestamp when this Backup resource was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The timestamp when this Backup resource was created.
   * @param createTime createTime or {@code null} for none
   */
  public Backup setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. Minimum age for this Backup (in days). If this field is set to a non-zero value, the
   * Backup will be "locked" against deletion (either manual or automatic deletion) for the number
   * of days provided (measured from the creation time of the Backup). MUST be an integer value
   * between 0-90 (inclusive). Defaults to parent BackupPlan's backup_delete_lock_days setting and
   * may only be increased (either at creation time or in a subsequent update).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDeleteLockDays() {
    return deleteLockDays;
  }

  /**
   * Optional. Minimum age for this Backup (in days). If this field is set to a non-zero value, the
   * Backup will be "locked" against deletion (either manual or automatic deletion) for the number
   * of days provided (measured from the creation time of the Backup). MUST be an integer value
   * between 0-90 (inclusive). Defaults to parent BackupPlan's backup_delete_lock_days setting and
   * may only be increased (either at creation time or in a subsequent update).
   * @param deleteLockDays deleteLockDays or {@code null} for none
   */
  public Backup setDeleteLockDays(java.lang.Integer deleteLockDays) {
    this.deleteLockDays = deleteLockDays;
    return this;
  }

  /**
   * Output only. The time at which an existing delete lock will expire for this backup (calculated
   * from create_time + delete_lock_days).
   * @return value or {@code null} for none
   */
  public String getDeleteLockExpireTime() {
    return deleteLockExpireTime;
  }

  /**
   * Output only. The time at which an existing delete lock will expire for this backup (calculated
   * from create_time + delete_lock_days).
   * @param deleteLockExpireTime deleteLockExpireTime or {@code null} for none
   */
  public Backup setDeleteLockExpireTime(String deleteLockExpireTime) {
    this.deleteLockExpireTime = deleteLockExpireTime;
    return this;
  }

  /**
   * Optional. User specified descriptive string for this Backup.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. User specified descriptive string for this Backup.
   * @param description description or {@code null} for none
   */
  public Backup setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Output only. The customer managed encryption key that was used to encrypt the Backup's
   * artifacts. Inherited from the parent BackupPlan's encryption_key value.
   * @return value or {@code null} for none
   */
  public EncryptionKey getEncryptionKey() {
    return encryptionKey;
  }

  /**
   * Output only. The customer managed encryption key that was used to encrypt the Backup's
   * artifacts. Inherited from the parent BackupPlan's encryption_key value.
   * @param encryptionKey encryptionKey or {@code null} for none
   */
  public Backup setEncryptionKey(EncryptionKey encryptionKey) {
    this.encryptionKey = encryptionKey;
    return this;
  }

  /**
   * Output only. `etag` is used for optimistic concurrency control as a way to help prevent
   * simultaneous updates of a backup from overwriting each other. It is strongly suggested that
   * systems make use of the `etag` in the read-modify-write cycle to perform backup updates in
   * order to avoid race conditions: An `etag` is returned in the response to `GetBackup`, and
   * systems are expected to put that etag in the request to `UpdateBackup` or `DeleteBackup` to
   * ensure that their change will be applied to the same version of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Output only. `etag` is used for optimistic concurrency control as a way to help prevent
   * simultaneous updates of a backup from overwriting each other. It is strongly suggested that
   * systems make use of the `etag` in the read-modify-write cycle to perform backup updates in
   * order to avoid race conditions: An `etag` is returned in the response to `GetBackup`, and
   * systems are expected to put that etag in the request to `UpdateBackup` or `DeleteBackup` to
   * ensure that their change will be applied to the same version of the resource.
   * @param etag etag or {@code null} for none
   */
  public Backup setEtag(java.lang.String etag) {
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
  public Backup setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Output only. This flag indicates whether this Backup resource was created manually by a user or
   * via a schedule in the BackupPlan. A value of True means that the Backup was created manually.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getManual() {
    return manual;
  }

  /**
   * Output only. This flag indicates whether this Backup resource was created manually by a user or
   * via a schedule in the BackupPlan. A value of True means that the Backup was created manually.
   * @param manual manual or {@code null} for none
   */
  public Backup setManual(java.lang.Boolean manual) {
    this.manual = manual;
    return this;
  }

  /**
   * Output only. The fully qualified name of the Backup. `projects/locations/backupPlans/backups`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The fully qualified name of the Backup. `projects/locations/backupPlans/backups`
   * @param name name or {@code null} for none
   */
  public Backup setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. If false, Backup will fail when Backup for GKE detects Kubernetes configuration
   * that is non-standard or requires additional setup to restore. Inherited from the parent
   * BackupPlan's permissive_mode value.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPermissiveMode() {
    return permissiveMode;
  }

  /**
   * Output only. If false, Backup will fail when Backup for GKE detects Kubernetes configuration
   * that is non-standard or requires additional setup to restore. Inherited from the parent
   * BackupPlan's permissive_mode value.
   * @param permissiveMode permissiveMode or {@code null} for none
   */
  public Backup setPermissiveMode(java.lang.Boolean permissiveMode) {
    this.permissiveMode = permissiveMode;
    return this;
  }

  /**
   * Output only. The total number of Kubernetes Pods contained in the Backup.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPodCount() {
    return podCount;
  }

  /**
   * Output only. The total number of Kubernetes Pods contained in the Backup.
   * @param podCount podCount or {@code null} for none
   */
  public Backup setPodCount(java.lang.Integer podCount) {
    this.podCount = podCount;
    return this;
  }

  /**
   * Output only. The total number of Kubernetes resources included in the Backup.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getResourceCount() {
    return resourceCount;
  }

  /**
   * Output only. The total number of Kubernetes resources included in the Backup.
   * @param resourceCount resourceCount or {@code null} for none
   */
  public Backup setResourceCount(java.lang.Integer resourceCount) {
    this.resourceCount = resourceCount;
    return this;
  }

  /**
   * Optional. The age (in days) after which this Backup will be automatically deleted. Must be an
   * integer value >= 0: - If 0, no automatic deletion will occur for this Backup. - If not 0, this
   * must be >= delete_lock_days and <= 365. Once a Backup is created, this value may only be
   * increased. Defaults to the parent BackupPlan's backup_retain_days value.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRetainDays() {
    return retainDays;
  }

  /**
   * Optional. The age (in days) after which this Backup will be automatically deleted. Must be an
   * integer value >= 0: - If 0, no automatic deletion will occur for this Backup. - If not 0, this
   * must be >= delete_lock_days and <= 365. Once a Backup is created, this value may only be
   * increased. Defaults to the parent BackupPlan's backup_retain_days value.
   * @param retainDays retainDays or {@code null} for none
   */
  public Backup setRetainDays(java.lang.Integer retainDays) {
    this.retainDays = retainDays;
    return this;
  }

  /**
   * Output only. The time at which this Backup will be automatically deleted (calculated from
   * create_time + retain_days).
   * @return value or {@code null} for none
   */
  public String getRetainExpireTime() {
    return retainExpireTime;
  }

  /**
   * Output only. The time at which this Backup will be automatically deleted (calculated from
   * create_time + retain_days).
   * @param retainExpireTime retainExpireTime or {@code null} for none
   */
  public Backup setRetainExpireTime(String retainExpireTime) {
    this.retainExpireTime = retainExpireTime;
    return this;
  }

  /**
   * Output only. [Output Only] Reserved for future use.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSatisfiesPzi() {
    return satisfiesPzi;
  }

  /**
   * Output only. [Output Only] Reserved for future use.
   * @param satisfiesPzi satisfiesPzi or {@code null} for none
   */
  public Backup setSatisfiesPzi(java.lang.Boolean satisfiesPzi) {
    this.satisfiesPzi = satisfiesPzi;
    return this;
  }

  /**
   * Output only. [Output Only] Reserved for future use.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSatisfiesPzs() {
    return satisfiesPzs;
  }

  /**
   * Output only. [Output Only] Reserved for future use.
   * @param satisfiesPzs satisfiesPzs or {@code null} for none
   */
  public Backup setSatisfiesPzs(java.lang.Boolean satisfiesPzs) {
    this.satisfiesPzs = satisfiesPzs;
    return this;
  }

  /**
   * Output only. If set, the list of ProtectedApplications whose resources were included in the
   * Backup.
   * @return value or {@code null} for none
   */
  public NamespacedNames getSelectedApplications() {
    return selectedApplications;
  }

  /**
   * Output only. If set, the list of ProtectedApplications whose resources were included in the
   * Backup.
   * @param selectedApplications selectedApplications or {@code null} for none
   */
  public Backup setSelectedApplications(NamespacedNames selectedApplications) {
    this.selectedApplications = selectedApplications;
    return this;
  }

  /**
   * Output only. If set, the list of labels whose constituent namespaces were included in the
   * Backup.
   * @return value or {@code null} for none
   */
  public ResourceLabels getSelectedNamespaceLabels() {
    return selectedNamespaceLabels;
  }

  /**
   * Output only. If set, the list of labels whose constituent namespaces were included in the
   * Backup.
   * @param selectedNamespaceLabels selectedNamespaceLabels or {@code null} for none
   */
  public Backup setSelectedNamespaceLabels(ResourceLabels selectedNamespaceLabels) {
    this.selectedNamespaceLabels = selectedNamespaceLabels;
    return this;
  }

  /**
   * Output only. If set, the list of namespaces that were included in the Backup.
   * @return value or {@code null} for none
   */
  public Namespaces getSelectedNamespaces() {
    return selectedNamespaces;
  }

  /**
   * Output only. If set, the list of namespaces that were included in the Backup.
   * @param selectedNamespaces selectedNamespaces or {@code null} for none
   */
  public Backup setSelectedNamespaces(Namespaces selectedNamespaces) {
    this.selectedNamespaces = selectedNamespaces;
    return this;
  }

  /**
   * Output only. The total size of the Backup in bytes = config backup size + sum(volume backup
   * sizes)
   * @return value or {@code null} for none
   */
  public java.lang.Long getSizeBytes() {
    return sizeBytes;
  }

  /**
   * Output only. The total size of the Backup in bytes = config backup size + sum(volume backup
   * sizes)
   * @param sizeBytes sizeBytes or {@code null} for none
   */
  public Backup setSizeBytes(java.lang.Long sizeBytes) {
    this.sizeBytes = sizeBytes;
    return this;
  }

  /**
   * Output only. Current state of the Backup
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. Current state of the Backup
   * @param state state or {@code null} for none
   */
  public Backup setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. Human-readable description of why the backup is in the current `state`. This field
   * is only meant for human readability and should not be used programmatically as this field is
   * not guaranteed to be consistent.
   * @return value or {@code null} for none
   */
  public java.lang.String getStateReason() {
    return stateReason;
  }

  /**
   * Output only. Human-readable description of why the backup is in the current `state`. This field
   * is only meant for human readability and should not be used programmatically as this field is
   * not guaranteed to be consistent.
   * @param stateReason stateReason or {@code null} for none
   */
  public Backup setStateReason(java.lang.String stateReason) {
    this.stateReason = stateReason;
    return this;
  }

  /**
   * Output only. Information about the troubleshooting steps which will provide debugging
   * information to the end users.
   * @return value or {@code null} for none
   */
  public TroubleshootingInfo getTroubleshootingInfo() {
    return troubleshootingInfo;
  }

  /**
   * Output only. Information about the troubleshooting steps which will provide debugging
   * information to the end users.
   * @param troubleshootingInfo troubleshootingInfo or {@code null} for none
   */
  public Backup setTroubleshootingInfo(TroubleshootingInfo troubleshootingInfo) {
    this.troubleshootingInfo = troubleshootingInfo;
    return this;
  }

  /**
   * Output only. Server generated global unique identifier of
   * [UUID4](https://en.wikipedia.org/wiki/Universally_unique_identifier)
   * @return value or {@code null} for none
   */
  public java.lang.String getUid() {
    return uid;
  }

  /**
   * Output only. Server generated global unique identifier of
   * [UUID4](https://en.wikipedia.org/wiki/Universally_unique_identifier)
   * @param uid uid or {@code null} for none
   */
  public Backup setUid(java.lang.String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * Output only. The timestamp when this Backup resource was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The timestamp when this Backup resource was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public Backup setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Output only. The total number of volume backups contained in the Backup.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getVolumeCount() {
    return volumeCount;
  }

  /**
   * Output only. The total number of volume backups contained in the Backup.
   * @param volumeCount volumeCount or {@code null} for none
   */
  public Backup setVolumeCount(java.lang.Integer volumeCount) {
    this.volumeCount = volumeCount;
    return this;
  }

  @Override
  public Backup set(String fieldName, Object value) {
    return (Backup) super.set(fieldName, value);
  }

  @Override
  public Backup clone() {
    return (Backup) super.clone();
  }

}

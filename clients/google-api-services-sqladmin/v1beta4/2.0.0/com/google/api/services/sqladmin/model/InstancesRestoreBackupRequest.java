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

package com.google.api.services.sqladmin.model;

/**
 * Database instance restore backup request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InstancesRestoreBackupRequest extends com.google.api.client.json.GenericJson {

  /**
   * The name of the backup that's used to restore a Cloud SQL instance: Format: projects/{project-
   * id}/backups/{backup-uid}. Only one of restore_backup_context, backup, backupdr_backup can be
   * passed to the input.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String backup;

  /**
   * The name of the backup that's used to restore a Cloud SQL instance: Format: "projects/{project-
   * id}/locations/{location}/backupVaults/{backupvault}/dataSources/{datasource}/backups/{backup-
   * uid}". Only one of restore_backup_context, backup, backupdr_backup can be passed to the input.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String backupdrBackup;

  /**
   * Parameters required to perform the restore backup operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RestoreBackupContext restoreBackupContext;

  /**
   * Optional. By using this parameter, Cloud SQL overrides any instance settings stored in the
   * backup you are restoring from. You can't change the instance's major database version and you
   * can only increase the disk size. You can use this field to restore new instances only. This
   * field is not applicable for restore to existing instances.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DatabaseInstance restoreInstanceSettings;

  /**
   * The name of the backup that's used to restore a Cloud SQL instance: Format: projects/{project-
   * id}/backups/{backup-uid}. Only one of restore_backup_context, backup, backupdr_backup can be
   * passed to the input.
   * @return value or {@code null} for none
   */
  public java.lang.String getBackup() {
    return backup;
  }

  /**
   * The name of the backup that's used to restore a Cloud SQL instance: Format: projects/{project-
   * id}/backups/{backup-uid}. Only one of restore_backup_context, backup, backupdr_backup can be
   * passed to the input.
   * @param backup backup or {@code null} for none
   */
  public InstancesRestoreBackupRequest setBackup(java.lang.String backup) {
    this.backup = backup;
    return this;
  }

  /**
   * The name of the backup that's used to restore a Cloud SQL instance: Format: "projects/{project-
   * id}/locations/{location}/backupVaults/{backupvault}/dataSources/{datasource}/backups/{backup-
   * uid}". Only one of restore_backup_context, backup, backupdr_backup can be passed to the input.
   * @return value or {@code null} for none
   */
  public java.lang.String getBackupdrBackup() {
    return backupdrBackup;
  }

  /**
   * The name of the backup that's used to restore a Cloud SQL instance: Format: "projects/{project-
   * id}/locations/{location}/backupVaults/{backupvault}/dataSources/{datasource}/backups/{backup-
   * uid}". Only one of restore_backup_context, backup, backupdr_backup can be passed to the input.
   * @param backupdrBackup backupdrBackup or {@code null} for none
   */
  public InstancesRestoreBackupRequest setBackupdrBackup(java.lang.String backupdrBackup) {
    this.backupdrBackup = backupdrBackup;
    return this;
  }

  /**
   * Parameters required to perform the restore backup operation.
   * @return value or {@code null} for none
   */
  public RestoreBackupContext getRestoreBackupContext() {
    return restoreBackupContext;
  }

  /**
   * Parameters required to perform the restore backup operation.
   * @param restoreBackupContext restoreBackupContext or {@code null} for none
   */
  public InstancesRestoreBackupRequest setRestoreBackupContext(RestoreBackupContext restoreBackupContext) {
    this.restoreBackupContext = restoreBackupContext;
    return this;
  }

  /**
   * Optional. By using this parameter, Cloud SQL overrides any instance settings stored in the
   * backup you are restoring from. You can't change the instance's major database version and you
   * can only increase the disk size. You can use this field to restore new instances only. This
   * field is not applicable for restore to existing instances.
   * @return value or {@code null} for none
   */
  public DatabaseInstance getRestoreInstanceSettings() {
    return restoreInstanceSettings;
  }

  /**
   * Optional. By using this parameter, Cloud SQL overrides any instance settings stored in the
   * backup you are restoring from. You can't change the instance's major database version and you
   * can only increase the disk size. You can use this field to restore new instances only. This
   * field is not applicable for restore to existing instances.
   * @param restoreInstanceSettings restoreInstanceSettings or {@code null} for none
   */
  public InstancesRestoreBackupRequest setRestoreInstanceSettings(DatabaseInstance restoreInstanceSettings) {
    this.restoreInstanceSettings = restoreInstanceSettings;
    return this;
  }

  @Override
  public InstancesRestoreBackupRequest set(String fieldName, Object value) {
    return (InstancesRestoreBackupRequest) super.set(fieldName, value);
  }

  @Override
  public InstancesRestoreBackupRequest clone() {
    return (InstancesRestoreBackupRequest) super.clone();
  }

}

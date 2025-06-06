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
 * PITR related fields include enablement settings, archiving settings, and the bucket name.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PITRFields extends com.google.api.client.json.GenericJson {

  /**
   * The enablement setting for PITR for MySQL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableBinLog;

  /**
   * The enablement setting for PITR for PostgreSQL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean replicationLogArchivingEnabled;

  /**
   * The enablement setting for PITR for SQL Server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean sqlserverPitrEnabled;

  /**
   * The number of transaction log days to retain for PITR
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer transactionLogRetentionDays;

  /**
   * The enablement setting for PITR for MySQL.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableBinLog() {
    return enableBinLog;
  }

  /**
   * The enablement setting for PITR for MySQL.
   * @param enableBinLog enableBinLog or {@code null} for none
   */
  public PITRFields setEnableBinLog(java.lang.Boolean enableBinLog) {
    this.enableBinLog = enableBinLog;
    return this;
  }

  /**
   * The enablement setting for PITR for PostgreSQL.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getReplicationLogArchivingEnabled() {
    return replicationLogArchivingEnabled;
  }

  /**
   * The enablement setting for PITR for PostgreSQL.
   * @param replicationLogArchivingEnabled replicationLogArchivingEnabled or {@code null} for none
   */
  public PITRFields setReplicationLogArchivingEnabled(java.lang.Boolean replicationLogArchivingEnabled) {
    this.replicationLogArchivingEnabled = replicationLogArchivingEnabled;
    return this;
  }

  /**
   * The enablement setting for PITR for SQL Server.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSqlserverPitrEnabled() {
    return sqlserverPitrEnabled;
  }

  /**
   * The enablement setting for PITR for SQL Server.
   * @param sqlserverPitrEnabled sqlserverPitrEnabled or {@code null} for none
   */
  public PITRFields setSqlserverPitrEnabled(java.lang.Boolean sqlserverPitrEnabled) {
    this.sqlserverPitrEnabled = sqlserverPitrEnabled;
    return this;
  }

  /**
   * The number of transaction log days to retain for PITR
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTransactionLogRetentionDays() {
    return transactionLogRetentionDays;
  }

  /**
   * The number of transaction log days to retain for PITR
   * @param transactionLogRetentionDays transactionLogRetentionDays or {@code null} for none
   */
  public PITRFields setTransactionLogRetentionDays(java.lang.Integer transactionLogRetentionDays) {
    this.transactionLogRetentionDays = transactionLogRetentionDays;
    return this;
  }

  @Override
  public PITRFields set(String fieldName, Object value) {
    return (PITRFields) super.set(fieldName, value);
  }

  @Override
  public PITRFields clone() {
    return (PITRFields) super.clone();
  }

}

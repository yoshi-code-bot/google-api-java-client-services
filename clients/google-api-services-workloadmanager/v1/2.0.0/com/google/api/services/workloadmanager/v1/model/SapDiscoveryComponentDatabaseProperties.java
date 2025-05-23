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

package com.google.api.services.workloadmanager.v1.model;

/**
 * A set of properties describing an SAP Database layer.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Workload Manager API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SapDiscoveryComponentDatabaseProperties extends com.google.api.client.json.GenericJson {

  /**
   * Optional. SID of the system database.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String databaseSid;

  /**
   * Required. Type of the database. HANA, DB2, etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String databaseType;

  /**
   * Optional. The version of the database software running in the system.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String databaseVersion;

  /**
   * Optional. Instance number of the SAP instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String instanceNumber;

  /**
   * Optional. Landscape ID from the HANA nameserver.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String landscapeId;

  /**
   * Required. URI of the recognized primary instance of the database.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String primaryInstanceUri;

  /**
   * Optional. URI of the recognized shared NFS of the database. May be empty if the database has
   * only a single node.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sharedNfsUri;

  /**
   * Optional. SID of the system database.
   * @return value or {@code null} for none
   */
  public java.lang.String getDatabaseSid() {
    return databaseSid;
  }

  /**
   * Optional. SID of the system database.
   * @param databaseSid databaseSid or {@code null} for none
   */
  public SapDiscoveryComponentDatabaseProperties setDatabaseSid(java.lang.String databaseSid) {
    this.databaseSid = databaseSid;
    return this;
  }

  /**
   * Required. Type of the database. HANA, DB2, etc.
   * @return value or {@code null} for none
   */
  public java.lang.String getDatabaseType() {
    return databaseType;
  }

  /**
   * Required. Type of the database. HANA, DB2, etc.
   * @param databaseType databaseType or {@code null} for none
   */
  public SapDiscoveryComponentDatabaseProperties setDatabaseType(java.lang.String databaseType) {
    this.databaseType = databaseType;
    return this;
  }

  /**
   * Optional. The version of the database software running in the system.
   * @return value or {@code null} for none
   */
  public java.lang.String getDatabaseVersion() {
    return databaseVersion;
  }

  /**
   * Optional. The version of the database software running in the system.
   * @param databaseVersion databaseVersion or {@code null} for none
   */
  public SapDiscoveryComponentDatabaseProperties setDatabaseVersion(java.lang.String databaseVersion) {
    this.databaseVersion = databaseVersion;
    return this;
  }

  /**
   * Optional. Instance number of the SAP instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getInstanceNumber() {
    return instanceNumber;
  }

  /**
   * Optional. Instance number of the SAP instance.
   * @param instanceNumber instanceNumber or {@code null} for none
   */
  public SapDiscoveryComponentDatabaseProperties setInstanceNumber(java.lang.String instanceNumber) {
    this.instanceNumber = instanceNumber;
    return this;
  }

  /**
   * Optional. Landscape ID from the HANA nameserver.
   * @return value or {@code null} for none
   */
  public java.lang.String getLandscapeId() {
    return landscapeId;
  }

  /**
   * Optional. Landscape ID from the HANA nameserver.
   * @param landscapeId landscapeId or {@code null} for none
   */
  public SapDiscoveryComponentDatabaseProperties setLandscapeId(java.lang.String landscapeId) {
    this.landscapeId = landscapeId;
    return this;
  }

  /**
   * Required. URI of the recognized primary instance of the database.
   * @return value or {@code null} for none
   */
  public java.lang.String getPrimaryInstanceUri() {
    return primaryInstanceUri;
  }

  /**
   * Required. URI of the recognized primary instance of the database.
   * @param primaryInstanceUri primaryInstanceUri or {@code null} for none
   */
  public SapDiscoveryComponentDatabaseProperties setPrimaryInstanceUri(java.lang.String primaryInstanceUri) {
    this.primaryInstanceUri = primaryInstanceUri;
    return this;
  }

  /**
   * Optional. URI of the recognized shared NFS of the database. May be empty if the database has
   * only a single node.
   * @return value or {@code null} for none
   */
  public java.lang.String getSharedNfsUri() {
    return sharedNfsUri;
  }

  /**
   * Optional. URI of the recognized shared NFS of the database. May be empty if the database has
   * only a single node.
   * @param sharedNfsUri sharedNfsUri or {@code null} for none
   */
  public SapDiscoveryComponentDatabaseProperties setSharedNfsUri(java.lang.String sharedNfsUri) {
    this.sharedNfsUri = sharedNfsUri;
    return this;
  }

  @Override
  public SapDiscoveryComponentDatabaseProperties set(String fieldName, Object value) {
    return (SapDiscoveryComponentDatabaseProperties) super.set(fieldName, value);
  }

  @Override
  public SapDiscoveryComponentDatabaseProperties clone() {
    return (SapDiscoveryComponentDatabaseProperties) super.clone();
  }

}

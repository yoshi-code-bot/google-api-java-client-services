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

package com.google.api.services.datamigration.v1.model;

/**
 * Specifies connection parameters required specifically for SQL Server databases.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Database Migration API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SqlServerConnectionProfile extends com.google.api.client.json.GenericJson {

  /**
   * The backup details in Cloud Storage for homogeneous migration to Cloud SQL for SQL Server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SqlServerBackups backups;

  /**
   * If the source is a Cloud SQL database, use this field to provide the Cloud SQL instance ID of
   * the source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cloudSqlId;

  /**
   * Required. The name of the specific database within the host.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String database;

  /**
   * Forward SSH tunnel connectivity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ForwardSshTunnelConnectivity forwardSshConnectivity;

  /**
   * Required. The IP or hostname of the source SQL Server database.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String host;

  /**
   * Required. Input only. The password for the user that Database Migration Service will be using
   * to connect to the database. This field is not returned on request, and the value is encrypted
   * when stored in Database Migration Service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String password;

  /**
   * Output only. Indicates whether a new password is included in the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean passwordSet;

  /**
   * Required. The network port of the source SQL Server database.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer port;

  /**
   * Private connectivity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PrivateConnectivity privateConnectivity;

  /**
   * Private Service Connect connectivity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PrivateServiceConnectConnectivity privateServiceConnectConnectivity;

  /**
   * SSL configuration for the destination to connect to the source database.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SslConfig ssl;

  /**
   * Static IP connectivity data (default, no additional details needed).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StaticIpConnectivity staticIpConnectivity;

  /**
   * Required. The username that Database Migration Service will use to connect to the database. The
   * value is encrypted when stored in Database Migration Service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String username;

  /**
   * The backup details in Cloud Storage for homogeneous migration to Cloud SQL for SQL Server.
   * @return value or {@code null} for none
   */
  public SqlServerBackups getBackups() {
    return backups;
  }

  /**
   * The backup details in Cloud Storage for homogeneous migration to Cloud SQL for SQL Server.
   * @param backups backups or {@code null} for none
   */
  public SqlServerConnectionProfile setBackups(SqlServerBackups backups) {
    this.backups = backups;
    return this;
  }

  /**
   * If the source is a Cloud SQL database, use this field to provide the Cloud SQL instance ID of
   * the source.
   * @return value or {@code null} for none
   */
  public java.lang.String getCloudSqlId() {
    return cloudSqlId;
  }

  /**
   * If the source is a Cloud SQL database, use this field to provide the Cloud SQL instance ID of
   * the source.
   * @param cloudSqlId cloudSqlId or {@code null} for none
   */
  public SqlServerConnectionProfile setCloudSqlId(java.lang.String cloudSqlId) {
    this.cloudSqlId = cloudSqlId;
    return this;
  }

  /**
   * Required. The name of the specific database within the host.
   * @return value or {@code null} for none
   */
  public java.lang.String getDatabase() {
    return database;
  }

  /**
   * Required. The name of the specific database within the host.
   * @param database database or {@code null} for none
   */
  public SqlServerConnectionProfile setDatabase(java.lang.String database) {
    this.database = database;
    return this;
  }

  /**
   * Forward SSH tunnel connectivity.
   * @return value or {@code null} for none
   */
  public ForwardSshTunnelConnectivity getForwardSshConnectivity() {
    return forwardSshConnectivity;
  }

  /**
   * Forward SSH tunnel connectivity.
   * @param forwardSshConnectivity forwardSshConnectivity or {@code null} for none
   */
  public SqlServerConnectionProfile setForwardSshConnectivity(ForwardSshTunnelConnectivity forwardSshConnectivity) {
    this.forwardSshConnectivity = forwardSshConnectivity;
    return this;
  }

  /**
   * Required. The IP or hostname of the source SQL Server database.
   * @return value or {@code null} for none
   */
  public java.lang.String getHost() {
    return host;
  }

  /**
   * Required. The IP or hostname of the source SQL Server database.
   * @param host host or {@code null} for none
   */
  public SqlServerConnectionProfile setHost(java.lang.String host) {
    this.host = host;
    return this;
  }

  /**
   * Required. Input only. The password for the user that Database Migration Service will be using
   * to connect to the database. This field is not returned on request, and the value is encrypted
   * when stored in Database Migration Service.
   * @return value or {@code null} for none
   */
  public java.lang.String getPassword() {
    return password;
  }

  /**
   * Required. Input only. The password for the user that Database Migration Service will be using
   * to connect to the database. This field is not returned on request, and the value is encrypted
   * when stored in Database Migration Service.
   * @param password password or {@code null} for none
   */
  public SqlServerConnectionProfile setPassword(java.lang.String password) {
    this.password = password;
    return this;
  }

  /**
   * Output only. Indicates whether a new password is included in the request.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPasswordSet() {
    return passwordSet;
  }

  /**
   * Output only. Indicates whether a new password is included in the request.
   * @param passwordSet passwordSet or {@code null} for none
   */
  public SqlServerConnectionProfile setPasswordSet(java.lang.Boolean passwordSet) {
    this.passwordSet = passwordSet;
    return this;
  }

  /**
   * Required. The network port of the source SQL Server database.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPort() {
    return port;
  }

  /**
   * Required. The network port of the source SQL Server database.
   * @param port port or {@code null} for none
   */
  public SqlServerConnectionProfile setPort(java.lang.Integer port) {
    this.port = port;
    return this;
  }

  /**
   * Private connectivity.
   * @return value or {@code null} for none
   */
  public PrivateConnectivity getPrivateConnectivity() {
    return privateConnectivity;
  }

  /**
   * Private connectivity.
   * @param privateConnectivity privateConnectivity or {@code null} for none
   */
  public SqlServerConnectionProfile setPrivateConnectivity(PrivateConnectivity privateConnectivity) {
    this.privateConnectivity = privateConnectivity;
    return this;
  }

  /**
   * Private Service Connect connectivity.
   * @return value or {@code null} for none
   */
  public PrivateServiceConnectConnectivity getPrivateServiceConnectConnectivity() {
    return privateServiceConnectConnectivity;
  }

  /**
   * Private Service Connect connectivity.
   * @param privateServiceConnectConnectivity privateServiceConnectConnectivity or {@code null} for none
   */
  public SqlServerConnectionProfile setPrivateServiceConnectConnectivity(PrivateServiceConnectConnectivity privateServiceConnectConnectivity) {
    this.privateServiceConnectConnectivity = privateServiceConnectConnectivity;
    return this;
  }

  /**
   * SSL configuration for the destination to connect to the source database.
   * @return value or {@code null} for none
   */
  public SslConfig getSsl() {
    return ssl;
  }

  /**
   * SSL configuration for the destination to connect to the source database.
   * @param ssl ssl or {@code null} for none
   */
  public SqlServerConnectionProfile setSsl(SslConfig ssl) {
    this.ssl = ssl;
    return this;
  }

  /**
   * Static IP connectivity data (default, no additional details needed).
   * @return value or {@code null} for none
   */
  public StaticIpConnectivity getStaticIpConnectivity() {
    return staticIpConnectivity;
  }

  /**
   * Static IP connectivity data (default, no additional details needed).
   * @param staticIpConnectivity staticIpConnectivity or {@code null} for none
   */
  public SqlServerConnectionProfile setStaticIpConnectivity(StaticIpConnectivity staticIpConnectivity) {
    this.staticIpConnectivity = staticIpConnectivity;
    return this;
  }

  /**
   * Required. The username that Database Migration Service will use to connect to the database. The
   * value is encrypted when stored in Database Migration Service.
   * @return value or {@code null} for none
   */
  public java.lang.String getUsername() {
    return username;
  }

  /**
   * Required. The username that Database Migration Service will use to connect to the database. The
   * value is encrypted when stored in Database Migration Service.
   * @param username username or {@code null} for none
   */
  public SqlServerConnectionProfile setUsername(java.lang.String username) {
    this.username = username;
    return this;
  }

  @Override
  public SqlServerConnectionProfile set(String fieldName, Object value) {
    return (SqlServerConnectionProfile) super.set(fieldName, value);
  }

  @Override
  public SqlServerConnectionProfile clone() {
    return (SqlServerConnectionProfile) super.clone();
  }

}

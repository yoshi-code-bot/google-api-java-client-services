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

package com.google.api.services.datastream.v1.model;

/**
 * Configuration for Oracle Automatic Storage Management (ASM) connection.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Datastream API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OracleAsmConfig extends com.google.api.client.json.GenericJson {

  /**
   * Required. ASM service name for the Oracle ASM connection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String asmService;

  /**
   * Optional. Connection string attributes
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> connectionAttributes;

  /**
   * Required. Hostname for the Oracle ASM connection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String hostname;

  /**
   * Optional. SSL configuration for the Oracle connection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OracleSslConfig oracleSslConfig;

  /**
   * Optional. Password for the Oracle ASM connection. Mutually exclusive with the
   * `secret_manager_stored_password` field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String password;

  /**
   * Required. Port for the Oracle ASM connection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer port;

  /**
   * Optional. A reference to a Secret Manager resource name storing the Oracle ASM connection
   * password. Mutually exclusive with the `password` field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String secretManagerStoredPassword;

  /**
   * Required. Username for the Oracle ASM connection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String username;

  /**
   * Required. ASM service name for the Oracle ASM connection.
   * @return value or {@code null} for none
   */
  public java.lang.String getAsmService() {
    return asmService;
  }

  /**
   * Required. ASM service name for the Oracle ASM connection.
   * @param asmService asmService or {@code null} for none
   */
  public OracleAsmConfig setAsmService(java.lang.String asmService) {
    this.asmService = asmService;
    return this;
  }

  /**
   * Optional. Connection string attributes
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getConnectionAttributes() {
    return connectionAttributes;
  }

  /**
   * Optional. Connection string attributes
   * @param connectionAttributes connectionAttributes or {@code null} for none
   */
  public OracleAsmConfig setConnectionAttributes(java.util.Map<String, java.lang.String> connectionAttributes) {
    this.connectionAttributes = connectionAttributes;
    return this;
  }

  /**
   * Required. Hostname for the Oracle ASM connection.
   * @return value or {@code null} for none
   */
  public java.lang.String getHostname() {
    return hostname;
  }

  /**
   * Required. Hostname for the Oracle ASM connection.
   * @param hostname hostname or {@code null} for none
   */
  public OracleAsmConfig setHostname(java.lang.String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   * Optional. SSL configuration for the Oracle connection.
   * @return value or {@code null} for none
   */
  public OracleSslConfig getOracleSslConfig() {
    return oracleSslConfig;
  }

  /**
   * Optional. SSL configuration for the Oracle connection.
   * @param oracleSslConfig oracleSslConfig or {@code null} for none
   */
  public OracleAsmConfig setOracleSslConfig(OracleSslConfig oracleSslConfig) {
    this.oracleSslConfig = oracleSslConfig;
    return this;
  }

  /**
   * Optional. Password for the Oracle ASM connection. Mutually exclusive with the
   * `secret_manager_stored_password` field.
   * @return value or {@code null} for none
   */
  public java.lang.String getPassword() {
    return password;
  }

  /**
   * Optional. Password for the Oracle ASM connection. Mutually exclusive with the
   * `secret_manager_stored_password` field.
   * @param password password or {@code null} for none
   */
  public OracleAsmConfig setPassword(java.lang.String password) {
    this.password = password;
    return this;
  }

  /**
   * Required. Port for the Oracle ASM connection.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPort() {
    return port;
  }

  /**
   * Required. Port for the Oracle ASM connection.
   * @param port port or {@code null} for none
   */
  public OracleAsmConfig setPort(java.lang.Integer port) {
    this.port = port;
    return this;
  }

  /**
   * Optional. A reference to a Secret Manager resource name storing the Oracle ASM connection
   * password. Mutually exclusive with the `password` field.
   * @return value or {@code null} for none
   */
  public java.lang.String getSecretManagerStoredPassword() {
    return secretManagerStoredPassword;
  }

  /**
   * Optional. A reference to a Secret Manager resource name storing the Oracle ASM connection
   * password. Mutually exclusive with the `password` field.
   * @param secretManagerStoredPassword secretManagerStoredPassword or {@code null} for none
   */
  public OracleAsmConfig setSecretManagerStoredPassword(java.lang.String secretManagerStoredPassword) {
    this.secretManagerStoredPassword = secretManagerStoredPassword;
    return this;
  }

  /**
   * Required. Username for the Oracle ASM connection.
   * @return value or {@code null} for none
   */
  public java.lang.String getUsername() {
    return username;
  }

  /**
   * Required. Username for the Oracle ASM connection.
   * @param username username or {@code null} for none
   */
  public OracleAsmConfig setUsername(java.lang.String username) {
    this.username = username;
    return this;
  }

  @Override
  public OracleAsmConfig set(String fieldName, Object value) {
    return (OracleAsmConfig) super.set(fieldName, value);
  }

  @Override
  public OracleAsmConfig clone() {
    return (OracleAsmConfig) super.clone();
  }

}

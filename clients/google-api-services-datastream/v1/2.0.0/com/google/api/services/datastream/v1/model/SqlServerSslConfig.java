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
 * SQL Server SSL configuration information.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Datastream API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SqlServerSslConfig extends com.google.api.client.json.GenericJson {

  /**
   * If set, Datastream will enforce encryption without authenticating server identity. Server
   * certificates will be trusted by default.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BasicEncryption basicEncryption;

  /**
   * If set, Datastream will enforce encryption and authenticate server identity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EncryptionAndServerValidation encryptionAndServerValidation;

  /**
   * If set, Datastream will not enforce encryption. If the DB server mandates encryption, then
   * connection will be encrypted but server identity will not be authenticated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EncryptionNotEnforced encryptionNotEnforced;

  /**
   * If set, Datastream will enforce encryption without authenticating server identity. Server
   * certificates will be trusted by default.
   * @return value or {@code null} for none
   */
  public BasicEncryption getBasicEncryption() {
    return basicEncryption;
  }

  /**
   * If set, Datastream will enforce encryption without authenticating server identity. Server
   * certificates will be trusted by default.
   * @param basicEncryption basicEncryption or {@code null} for none
   */
  public SqlServerSslConfig setBasicEncryption(BasicEncryption basicEncryption) {
    this.basicEncryption = basicEncryption;
    return this;
  }

  /**
   * If set, Datastream will enforce encryption and authenticate server identity.
   * @return value or {@code null} for none
   */
  public EncryptionAndServerValidation getEncryptionAndServerValidation() {
    return encryptionAndServerValidation;
  }

  /**
   * If set, Datastream will enforce encryption and authenticate server identity.
   * @param encryptionAndServerValidation encryptionAndServerValidation or {@code null} for none
   */
  public SqlServerSslConfig setEncryptionAndServerValidation(EncryptionAndServerValidation encryptionAndServerValidation) {
    this.encryptionAndServerValidation = encryptionAndServerValidation;
    return this;
  }

  /**
   * If set, Datastream will not enforce encryption. If the DB server mandates encryption, then
   * connection will be encrypted but server identity will not be authenticated.
   * @return value or {@code null} for none
   */
  public EncryptionNotEnforced getEncryptionNotEnforced() {
    return encryptionNotEnforced;
  }

  /**
   * If set, Datastream will not enforce encryption. If the DB server mandates encryption, then
   * connection will be encrypted but server identity will not be authenticated.
   * @param encryptionNotEnforced encryptionNotEnforced or {@code null} for none
   */
  public SqlServerSslConfig setEncryptionNotEnforced(EncryptionNotEnforced encryptionNotEnforced) {
    this.encryptionNotEnforced = encryptionNotEnforced;
    return this;
  }

  @Override
  public SqlServerSslConfig set(String fieldName, Object value) {
    return (SqlServerSslConfig) super.set(fieldName, value);
  }

  @Override
  public SqlServerSslConfig clone() {
    return (SqlServerSslConfig) super.clone();
  }

}

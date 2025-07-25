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

package com.google.api.services.spanner.v1.model;

/**
 * The configuration for each database in the target instance configuration.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Spanner API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DatabaseMoveConfig extends com.google.api.client.json.GenericJson {

  /**
   * Required. The unique identifier of the database resource in the Instance. For example, if the
   * database uri is `projects/foo/instances/bar/databases/baz`, then the id to supply here is baz.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String databaseId;

  /**
   * Optional. Encryption configuration to be used for the database in the target configuration. The
   * encryption configuration must be specified for every database which currently uses CMEK
   * encryption. If a database currently uses Google-managed encryption and a target encryption
   * configuration is not specified, then the database defaults to Google-managed encryption. If a
   * database currently uses Google-managed encryption and a target CMEK encryption is specified,
   * the request is rejected. If a database currently uses CMEK encryption, then a target encryption
   * configuration must be specified. You can't move a CMEK database to a Google-managed encryption
   * database using the MoveInstance API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InstanceEncryptionConfig encryptionConfig;

  /**
   * Required. The unique identifier of the database resource in the Instance. For example, if the
   * database uri is `projects/foo/instances/bar/databases/baz`, then the id to supply here is baz.
   * @return value or {@code null} for none
   */
  public java.lang.String getDatabaseId() {
    return databaseId;
  }

  /**
   * Required. The unique identifier of the database resource in the Instance. For example, if the
   * database uri is `projects/foo/instances/bar/databases/baz`, then the id to supply here is baz.
   * @param databaseId databaseId or {@code null} for none
   */
  public DatabaseMoveConfig setDatabaseId(java.lang.String databaseId) {
    this.databaseId = databaseId;
    return this;
  }

  /**
   * Optional. Encryption configuration to be used for the database in the target configuration. The
   * encryption configuration must be specified for every database which currently uses CMEK
   * encryption. If a database currently uses Google-managed encryption and a target encryption
   * configuration is not specified, then the database defaults to Google-managed encryption. If a
   * database currently uses Google-managed encryption and a target CMEK encryption is specified,
   * the request is rejected. If a database currently uses CMEK encryption, then a target encryption
   * configuration must be specified. You can't move a CMEK database to a Google-managed encryption
   * database using the MoveInstance API.
   * @return value or {@code null} for none
   */
  public InstanceEncryptionConfig getEncryptionConfig() {
    return encryptionConfig;
  }

  /**
   * Optional. Encryption configuration to be used for the database in the target configuration. The
   * encryption configuration must be specified for every database which currently uses CMEK
   * encryption. If a database currently uses Google-managed encryption and a target encryption
   * configuration is not specified, then the database defaults to Google-managed encryption. If a
   * database currently uses Google-managed encryption and a target CMEK encryption is specified,
   * the request is rejected. If a database currently uses CMEK encryption, then a target encryption
   * configuration must be specified. You can't move a CMEK database to a Google-managed encryption
   * database using the MoveInstance API.
   * @param encryptionConfig encryptionConfig or {@code null} for none
   */
  public DatabaseMoveConfig setEncryptionConfig(InstanceEncryptionConfig encryptionConfig) {
    this.encryptionConfig = encryptionConfig;
    return this;
  }

  @Override
  public DatabaseMoveConfig set(String fieldName, Object value) {
    return (DatabaseMoveConfig) super.set(fieldName, value);
  }

  @Override
  public DatabaseMoveConfig clone() {
    return (DatabaseMoveConfig) super.clone();
  }

}

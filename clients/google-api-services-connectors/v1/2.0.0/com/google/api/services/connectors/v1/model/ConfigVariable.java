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

package com.google.api.services.connectors.v1.model;

/**
 * ConfigVariable represents a configuration variable present in a Connection. or AuthConfig.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Connectors API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ConfigVariable extends com.google.api.client.json.GenericJson {

  /**
   * Value is a bool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean boolValue;

  /**
   * Value is a Encryption Key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EncryptionKey encryptionKeyValue;

  /**
   * Value is an integer
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long intValue;

  /**
   * Optional. Key of the config variable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * Value is a secret.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Secret secretValue;

  /**
   * Value is a string.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stringValue;

  /**
   * Value is a bool.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBoolValue() {
    return boolValue;
  }

  /**
   * Value is a bool.
   * @param boolValue boolValue or {@code null} for none
   */
  public ConfigVariable setBoolValue(java.lang.Boolean boolValue) {
    this.boolValue = boolValue;
    return this;
  }

  /**
   * Value is a Encryption Key.
   * @return value or {@code null} for none
   */
  public EncryptionKey getEncryptionKeyValue() {
    return encryptionKeyValue;
  }

  /**
   * Value is a Encryption Key.
   * @param encryptionKeyValue encryptionKeyValue or {@code null} for none
   */
  public ConfigVariable setEncryptionKeyValue(EncryptionKey encryptionKeyValue) {
    this.encryptionKeyValue = encryptionKeyValue;
    return this;
  }

  /**
   * Value is an integer
   * @return value or {@code null} for none
   */
  public java.lang.Long getIntValue() {
    return intValue;
  }

  /**
   * Value is an integer
   * @param intValue intValue or {@code null} for none
   */
  public ConfigVariable setIntValue(java.lang.Long intValue) {
    this.intValue = intValue;
    return this;
  }

  /**
   * Optional. Key of the config variable.
   * @return value or {@code null} for none
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * Optional. Key of the config variable.
   * @param key key or {@code null} for none
   */
  public ConfigVariable setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  /**
   * Value is a secret.
   * @return value or {@code null} for none
   */
  public Secret getSecretValue() {
    return secretValue;
  }

  /**
   * Value is a secret.
   * @param secretValue secretValue or {@code null} for none
   */
  public ConfigVariable setSecretValue(Secret secretValue) {
    this.secretValue = secretValue;
    return this;
  }

  /**
   * Value is a string.
   * @return value or {@code null} for none
   */
  public java.lang.String getStringValue() {
    return stringValue;
  }

  /**
   * Value is a string.
   * @param stringValue stringValue or {@code null} for none
   */
  public ConfigVariable setStringValue(java.lang.String stringValue) {
    this.stringValue = stringValue;
    return this;
  }

  @Override
  public ConfigVariable set(String fieldName, Object value) {
    return (ConfigVariable) super.set(fieldName, value);
  }

  @Override
  public ConfigVariable clone() {
    return (ConfigVariable) super.clone();
  }

}

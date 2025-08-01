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

package com.google.api.services.discoveryengine.v1.model;

/**
 * Configurations used to enable CMEK data encryption with Cloud KMS keys.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1CmekConfig extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The default CmekConfig for the Customer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isDefault;

  /**
   * Required. KMS key resource name which will be used to encrypt resources
   * `projects/{project}/locations/{location}/keyRings/{keyRing}/cryptoKeys/{keyId}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kmsKey;

  /**
   * Output only. KMS key version resource name which will be used to encrypt resources
   * `/cryptoKeyVersions/{keyVersion}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kmsKeyVersion;

  /**
   * Output only. The timestamp of the last key rotation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long lastRotationTimestampMicros;

  /**
   * Required. The name of the CmekConfig of the form
   * `projects/{project}/locations/{location}/cmekConfig` or
   * `projects/{project}/locations/{location}/cmekConfigs/{cmek_config}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Whether the NotebookLM Corpus is ready to be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String notebooklmState;

  /**
   * Optional. Single-regional CMEKs that are required for some VAIS features.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDiscoveryengineV1SingleRegionKey> singleRegionKeys;

  /**
   * Output only. The states of the CmekConfig.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. The default CmekConfig for the Customer.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsDefault() {
    return isDefault;
  }

  /**
   * Output only. The default CmekConfig for the Customer.
   * @param isDefault isDefault or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1CmekConfig setIsDefault(java.lang.Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Required. KMS key resource name which will be used to encrypt resources
   * `projects/{project}/locations/{location}/keyRings/{keyRing}/cryptoKeys/{keyId}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKmsKey() {
    return kmsKey;
  }

  /**
   * Required. KMS key resource name which will be used to encrypt resources
   * `projects/{project}/locations/{location}/keyRings/{keyRing}/cryptoKeys/{keyId}`.
   * @param kmsKey kmsKey or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1CmekConfig setKmsKey(java.lang.String kmsKey) {
    this.kmsKey = kmsKey;
    return this;
  }

  /**
   * Output only. KMS key version resource name which will be used to encrypt resources
   * `/cryptoKeyVersions/{keyVersion}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKmsKeyVersion() {
    return kmsKeyVersion;
  }

  /**
   * Output only. KMS key version resource name which will be used to encrypt resources
   * `/cryptoKeyVersions/{keyVersion}`.
   * @param kmsKeyVersion kmsKeyVersion or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1CmekConfig setKmsKeyVersion(java.lang.String kmsKeyVersion) {
    this.kmsKeyVersion = kmsKeyVersion;
    return this;
  }

  /**
   * Output only. The timestamp of the last key rotation.
   * @return value or {@code null} for none
   */
  public java.lang.Long getLastRotationTimestampMicros() {
    return lastRotationTimestampMicros;
  }

  /**
   * Output only. The timestamp of the last key rotation.
   * @param lastRotationTimestampMicros lastRotationTimestampMicros or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1CmekConfig setLastRotationTimestampMicros(java.lang.Long lastRotationTimestampMicros) {
    this.lastRotationTimestampMicros = lastRotationTimestampMicros;
    return this;
  }

  /**
   * Required. The name of the CmekConfig of the form
   * `projects/{project}/locations/{location}/cmekConfig` or
   * `projects/{project}/locations/{location}/cmekConfigs/{cmek_config}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. The name of the CmekConfig of the form
   * `projects/{project}/locations/{location}/cmekConfig` or
   * `projects/{project}/locations/{location}/cmekConfigs/{cmek_config}`.
   * @param name name or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1CmekConfig setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Whether the NotebookLM Corpus is ready to be used.
   * @return value or {@code null} for none
   */
  public java.lang.String getNotebooklmState() {
    return notebooklmState;
  }

  /**
   * Output only. Whether the NotebookLM Corpus is ready to be used.
   * @param notebooklmState notebooklmState or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1CmekConfig setNotebooklmState(java.lang.String notebooklmState) {
    this.notebooklmState = notebooklmState;
    return this;
  }

  /**
   * Optional. Single-regional CMEKs that are required for some VAIS features.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDiscoveryengineV1SingleRegionKey> getSingleRegionKeys() {
    return singleRegionKeys;
  }

  /**
   * Optional. Single-regional CMEKs that are required for some VAIS features.
   * @param singleRegionKeys singleRegionKeys or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1CmekConfig setSingleRegionKeys(java.util.List<GoogleCloudDiscoveryengineV1SingleRegionKey> singleRegionKeys) {
    this.singleRegionKeys = singleRegionKeys;
    return this;
  }

  /**
   * Output only. The states of the CmekConfig.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The states of the CmekConfig.
   * @param state state or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1CmekConfig setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1CmekConfig set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1CmekConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1CmekConfig clone() {
    return (GoogleCloudDiscoveryengineV1CmekConfig) super.clone();
  }

}

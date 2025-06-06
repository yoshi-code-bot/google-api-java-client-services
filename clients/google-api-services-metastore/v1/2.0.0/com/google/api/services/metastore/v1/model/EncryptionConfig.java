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

package com.google.api.services.metastore.v1.model;

/**
 * Encryption settings for the service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataproc Metastore API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EncryptionConfig extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The fully qualified customer provided Cloud KMS key name to use for customer data
   * encryption, in the following format:projects/{project_number}/locations/{location_id}/keyRings/
   * {key_ring_id}/cryptoKeys/{crypto_key_id}.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kmsKey;

  /**
   * Optional. The fully qualified customer provided Cloud KMS key name to use for customer data
   * encryption, in the following format:projects/{project_number}/locations/{location_id}/keyRings/
   * {key_ring_id}/cryptoKeys/{crypto_key_id}.
   * @return value or {@code null} for none
   */
  public java.lang.String getKmsKey() {
    return kmsKey;
  }

  /**
   * Optional. The fully qualified customer provided Cloud KMS key name to use for customer data
   * encryption, in the following format:projects/{project_number}/locations/{location_id}/keyRings/
   * {key_ring_id}/cryptoKeys/{crypto_key_id}.
   * @param kmsKey kmsKey or {@code null} for none
   */
  public EncryptionConfig setKmsKey(java.lang.String kmsKey) {
    this.kmsKey = kmsKey;
    return this;
  }

  @Override
  public EncryptionConfig set(String fieldName, Object value) {
    return (EncryptionConfig) super.set(fieldName, value);
  }

  @Override
  public EncryptionConfig clone() {
    return (EncryptionConfig) super.clone();
  }

}

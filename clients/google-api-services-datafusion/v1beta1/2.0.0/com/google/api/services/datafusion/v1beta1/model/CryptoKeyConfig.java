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

package com.google.api.services.datafusion.v1beta1.model;

/**
 * The crypto key configuration. This field is used by the Customer-managed encryption keys (CMEK)
 * feature.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Fusion API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CryptoKeyConfig extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The name of the key which is used to encrypt/decrypt customer data. For key in Cloud
   * KMS, the key should be in the format of `projects/locations/keyRings/cryptoKeys`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String keyReference;

  /**
   * Optional. The name of the key which is used to encrypt/decrypt customer data. For key in Cloud
   * KMS, the key should be in the format of `projects/locations/keyRings/cryptoKeys`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKeyReference() {
    return keyReference;
  }

  /**
   * Optional. The name of the key which is used to encrypt/decrypt customer data. For key in Cloud
   * KMS, the key should be in the format of `projects/locations/keyRings/cryptoKeys`.
   * @param keyReference keyReference or {@code null} for none
   */
  public CryptoKeyConfig setKeyReference(java.lang.String keyReference) {
    this.keyReference = keyReference;
    return this;
  }

  @Override
  public CryptoKeyConfig set(String fieldName, Object value) {
    return (CryptoKeyConfig) super.set(fieldName, value);
  }

  @Override
  public CryptoKeyConfig clone() {
    return (CryptoKeyConfig) super.clone();
  }

}

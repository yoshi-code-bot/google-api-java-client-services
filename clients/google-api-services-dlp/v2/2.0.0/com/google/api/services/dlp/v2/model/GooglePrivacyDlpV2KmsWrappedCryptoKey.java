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

package com.google.api.services.dlp.v2.model;

/**
 * Include to use an existing data crypto key wrapped by KMS. The wrapped key must be a 128-, 192-,
 * or 256-bit key. Authorization requires the following IAM permissions when sending a request to
 * perform a crypto transformation using a KMS-wrapped crypto key: dlp.kms.encrypt For more
 * information, see [Creating a wrapped key] (https://cloud.google.com/sensitive-data-
 * protection/docs/create-wrapped-key). Note: When you use Cloud KMS for cryptographic operations,
 * [charges apply](https://cloud.google.com/kms/pricing).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Sensitive Data Protection (DLP). For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2KmsWrappedCryptoKey extends com.google.api.client.json.GenericJson {

  /**
   * Required. The resource name of the KMS CryptoKey to use for unwrapping.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cryptoKeyName;

  /**
   * Required. The wrapped data crypto key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String wrappedKey;

  /**
   * Required. The resource name of the KMS CryptoKey to use for unwrapping.
   * @return value or {@code null} for none
   */
  public java.lang.String getCryptoKeyName() {
    return cryptoKeyName;
  }

  /**
   * Required. The resource name of the KMS CryptoKey to use for unwrapping.
   * @param cryptoKeyName cryptoKeyName or {@code null} for none
   */
  public GooglePrivacyDlpV2KmsWrappedCryptoKey setCryptoKeyName(java.lang.String cryptoKeyName) {
    this.cryptoKeyName = cryptoKeyName;
    return this;
  }

  /**
   * Required. The wrapped data crypto key.
   * @see #decodeWrappedKey()
   * @return value or {@code null} for none
   */
  public java.lang.String getWrappedKey() {
    return wrappedKey;
  }

  /**
   * Required. The wrapped data crypto key.
   * @see #getWrappedKey()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeWrappedKey() {
    return com.google.api.client.util.Base64.decodeBase64(wrappedKey);
  }

  /**
   * Required. The wrapped data crypto key.
   * @see #encodeWrappedKey()
   * @param wrappedKey wrappedKey or {@code null} for none
   */
  public GooglePrivacyDlpV2KmsWrappedCryptoKey setWrappedKey(java.lang.String wrappedKey) {
    this.wrappedKey = wrappedKey;
    return this;
  }

  /**
   * Required. The wrapped data crypto key.
   * @see #setWrappedKey()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GooglePrivacyDlpV2KmsWrappedCryptoKey encodeWrappedKey(byte[] wrappedKey) {
    this.wrappedKey = com.google.api.client.util.Base64.encodeBase64URLSafeString(wrappedKey);
    return this;
  }

  @Override
  public GooglePrivacyDlpV2KmsWrappedCryptoKey set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2KmsWrappedCryptoKey) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2KmsWrappedCryptoKey clone() {
    return (GooglePrivacyDlpV2KmsWrappedCryptoKey) super.clone();
  }

}

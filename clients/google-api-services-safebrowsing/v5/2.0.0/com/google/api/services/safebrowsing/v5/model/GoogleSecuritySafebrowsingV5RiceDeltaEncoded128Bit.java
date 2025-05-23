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

package com.google.api.services.safebrowsing.v5.model;

/**
 * Same as `RiceDeltaEncoded32Bit` except this encodes 128-bit numbers.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Safe Browsing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleSecuritySafebrowsingV5RiceDeltaEncoded128Bit extends com.google.api.client.json.GenericJson {

  /**
   * The encoded deltas that are encoded using the Golomb-Rice coder.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String encodedData;

  /**
   * The number of entries that are delta encoded in the encoded data. If only a single integer was
   * encoded, this will be zero and the single value will be stored in `first_value`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer entriesCount;

  /**
   * The upper 64 bits of the first entry in the encoded data (hashes). If the field is empty, the
   * upper 64 bits are all zero.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger firstValueHi;

  /**
   * The lower 64 bits of the first entry in the encoded data (hashes). If the field is empty, the
   * lower 64 bits are all zero.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger firstValueLo;

  /**
   * The Golomb-Rice parameter. This parameter is guaranteed to be between 99 and 126, inclusive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer riceParameter;

  /**
   * The encoded deltas that are encoded using the Golomb-Rice coder.
   * @see #decodeEncodedData()
   * @return value or {@code null} for none
   */
  public java.lang.String getEncodedData() {
    return encodedData;
  }

  /**
   * The encoded deltas that are encoded using the Golomb-Rice coder.
   * @see #getEncodedData()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeEncodedData() {
    return com.google.api.client.util.Base64.decodeBase64(encodedData);
  }

  /**
   * The encoded deltas that are encoded using the Golomb-Rice coder.
   * @see #encodeEncodedData()
   * @param encodedData encodedData or {@code null} for none
   */
  public GoogleSecuritySafebrowsingV5RiceDeltaEncoded128Bit setEncodedData(java.lang.String encodedData) {
    this.encodedData = encodedData;
    return this;
  }

  /**
   * The encoded deltas that are encoded using the Golomb-Rice coder.
   * @see #setEncodedData()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GoogleSecuritySafebrowsingV5RiceDeltaEncoded128Bit encodeEncodedData(byte[] encodedData) {
    this.encodedData = com.google.api.client.util.Base64.encodeBase64URLSafeString(encodedData);
    return this;
  }

  /**
   * The number of entries that are delta encoded in the encoded data. If only a single integer was
   * encoded, this will be zero and the single value will be stored in `first_value`.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getEntriesCount() {
    return entriesCount;
  }

  /**
   * The number of entries that are delta encoded in the encoded data. If only a single integer was
   * encoded, this will be zero and the single value will be stored in `first_value`.
   * @param entriesCount entriesCount or {@code null} for none
   */
  public GoogleSecuritySafebrowsingV5RiceDeltaEncoded128Bit setEntriesCount(java.lang.Integer entriesCount) {
    this.entriesCount = entriesCount;
    return this;
  }

  /**
   * The upper 64 bits of the first entry in the encoded data (hashes). If the field is empty, the
   * upper 64 bits are all zero.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getFirstValueHi() {
    return firstValueHi;
  }

  /**
   * The upper 64 bits of the first entry in the encoded data (hashes). If the field is empty, the
   * upper 64 bits are all zero.
   * @param firstValueHi firstValueHi or {@code null} for none
   */
  public GoogleSecuritySafebrowsingV5RiceDeltaEncoded128Bit setFirstValueHi(java.math.BigInteger firstValueHi) {
    this.firstValueHi = firstValueHi;
    return this;
  }

  /**
   * The lower 64 bits of the first entry in the encoded data (hashes). If the field is empty, the
   * lower 64 bits are all zero.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getFirstValueLo() {
    return firstValueLo;
  }

  /**
   * The lower 64 bits of the first entry in the encoded data (hashes). If the field is empty, the
   * lower 64 bits are all zero.
   * @param firstValueLo firstValueLo or {@code null} for none
   */
  public GoogleSecuritySafebrowsingV5RiceDeltaEncoded128Bit setFirstValueLo(java.math.BigInteger firstValueLo) {
    this.firstValueLo = firstValueLo;
    return this;
  }

  /**
   * The Golomb-Rice parameter. This parameter is guaranteed to be between 99 and 126, inclusive.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRiceParameter() {
    return riceParameter;
  }

  /**
   * The Golomb-Rice parameter. This parameter is guaranteed to be between 99 and 126, inclusive.
   * @param riceParameter riceParameter or {@code null} for none
   */
  public GoogleSecuritySafebrowsingV5RiceDeltaEncoded128Bit setRiceParameter(java.lang.Integer riceParameter) {
    this.riceParameter = riceParameter;
    return this;
  }

  @Override
  public GoogleSecuritySafebrowsingV5RiceDeltaEncoded128Bit set(String fieldName, Object value) {
    return (GoogleSecuritySafebrowsingV5RiceDeltaEncoded128Bit) super.set(fieldName, value);
  }

  @Override
  public GoogleSecuritySafebrowsingV5RiceDeltaEncoded128Bit clone() {
    return (GoogleSecuritySafebrowsingV5RiceDeltaEncoded128Bit) super.clone();
  }

}

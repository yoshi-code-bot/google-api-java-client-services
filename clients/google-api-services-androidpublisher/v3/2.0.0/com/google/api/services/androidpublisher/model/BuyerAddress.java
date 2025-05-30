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

package com.google.api.services.androidpublisher.model;

/**
 * Address information for the customer, for use in tax computation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Android Developer API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BuyerAddress extends com.google.api.client.json.GenericJson {

  /**
   * Two letter country code based on ISO-3166-1 Alpha-2 (UN country codes).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String buyerCountry;

  /**
   * Postal code of an address. When Google is the Merchant of Record for the order, this
   * information is not included.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String buyerPostcode;

  /**
   * Top-level administrative subdivision of the buyer address country. When Google is the Merchant
   * of Record for the order, this information is not included.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String buyerState;

  /**
   * Two letter country code based on ISO-3166-1 Alpha-2 (UN country codes).
   * @return value or {@code null} for none
   */
  public java.lang.String getBuyerCountry() {
    return buyerCountry;
  }

  /**
   * Two letter country code based on ISO-3166-1 Alpha-2 (UN country codes).
   * @param buyerCountry buyerCountry or {@code null} for none
   */
  public BuyerAddress setBuyerCountry(java.lang.String buyerCountry) {
    this.buyerCountry = buyerCountry;
    return this;
  }

  /**
   * Postal code of an address. When Google is the Merchant of Record for the order, this
   * information is not included.
   * @return value or {@code null} for none
   */
  public java.lang.String getBuyerPostcode() {
    return buyerPostcode;
  }

  /**
   * Postal code of an address. When Google is the Merchant of Record for the order, this
   * information is not included.
   * @param buyerPostcode buyerPostcode or {@code null} for none
   */
  public BuyerAddress setBuyerPostcode(java.lang.String buyerPostcode) {
    this.buyerPostcode = buyerPostcode;
    return this;
  }

  /**
   * Top-level administrative subdivision of the buyer address country. When Google is the Merchant
   * of Record for the order, this information is not included.
   * @return value or {@code null} for none
   */
  public java.lang.String getBuyerState() {
    return buyerState;
  }

  /**
   * Top-level administrative subdivision of the buyer address country. When Google is the Merchant
   * of Record for the order, this information is not included.
   * @param buyerState buyerState or {@code null} for none
   */
  public BuyerAddress setBuyerState(java.lang.String buyerState) {
    this.buyerState = buyerState;
    return this;
  }

  @Override
  public BuyerAddress set(String fieldName, Object value) {
    return (BuyerAddress) super.set(fieldName, value);
  }

  @Override
  public BuyerAddress clone() {
    return (BuyerAddress) super.clone();
  }

}

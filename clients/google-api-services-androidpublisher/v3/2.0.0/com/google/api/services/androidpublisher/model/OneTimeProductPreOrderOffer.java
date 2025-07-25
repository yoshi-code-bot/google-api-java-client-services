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
 * Configuration specific to pre-order offers.
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
public final class OneTimeProductPreOrderOffer extends com.google.api.client.json.GenericJson {

  /**
   * Required. Time when the pre-order will stop being available.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * Required. Immutable. Specifies how price changes affect pre-existing pre-orders.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String priceChangeBehavior;

  /**
   * Required. Time on which the product associated with the pre-order will be released and the pre-
   * order orders fulfilled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String releaseTime;

  /**
   * Required. Time when the pre-order will start being available.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * Required. Time when the pre-order will stop being available.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * Required. Time when the pre-order will stop being available.
   * @param endTime endTime or {@code null} for none
   */
  public OneTimeProductPreOrderOffer setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Required. Immutable. Specifies how price changes affect pre-existing pre-orders.
   * @return value or {@code null} for none
   */
  public java.lang.String getPriceChangeBehavior() {
    return priceChangeBehavior;
  }

  /**
   * Required. Immutable. Specifies how price changes affect pre-existing pre-orders.
   * @param priceChangeBehavior priceChangeBehavior or {@code null} for none
   */
  public OneTimeProductPreOrderOffer setPriceChangeBehavior(java.lang.String priceChangeBehavior) {
    this.priceChangeBehavior = priceChangeBehavior;
    return this;
  }

  /**
   * Required. Time on which the product associated with the pre-order will be released and the pre-
   * order orders fulfilled.
   * @return value or {@code null} for none
   */
  public String getReleaseTime() {
    return releaseTime;
  }

  /**
   * Required. Time on which the product associated with the pre-order will be released and the pre-
   * order orders fulfilled.
   * @param releaseTime releaseTime or {@code null} for none
   */
  public OneTimeProductPreOrderOffer setReleaseTime(String releaseTime) {
    this.releaseTime = releaseTime;
    return this;
  }

  /**
   * Required. Time when the pre-order will start being available.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Required. Time when the pre-order will start being available.
   * @param startTime startTime or {@code null} for none
   */
  public OneTimeProductPreOrderOffer setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  @Override
  public OneTimeProductPreOrderOffer set(String fieldName, Object value) {
    return (OneTimeProductPreOrderOffer) super.set(fieldName, value);
  }

  @Override
  public OneTimeProductPreOrderOffer clone() {
    return (OneTimeProductPreOrderOffer) super.clone();
  }

}

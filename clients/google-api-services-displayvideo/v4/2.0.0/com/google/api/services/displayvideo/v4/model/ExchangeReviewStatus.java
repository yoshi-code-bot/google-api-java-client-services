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

package com.google.api.services.displayvideo.v4.model;

/**
 * Exchange review status for the creative.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Display & Video 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExchangeReviewStatus extends com.google.api.client.json.GenericJson {

  /**
   * The exchange reviewing the creative.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String exchange;

  /**
   * Status of the exchange review.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * The exchange reviewing the creative.
   * @return value or {@code null} for none
   */
  public java.lang.String getExchange() {
    return exchange;
  }

  /**
   * The exchange reviewing the creative.
   * @param exchange exchange or {@code null} for none
   */
  public ExchangeReviewStatus setExchange(java.lang.String exchange) {
    this.exchange = exchange;
    return this;
  }

  /**
   * Status of the exchange review.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * Status of the exchange review.
   * @param status status or {@code null} for none
   */
  public ExchangeReviewStatus setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  @Override
  public ExchangeReviewStatus set(String fieldName, Object value) {
    return (ExchangeReviewStatus) super.set(fieldName, value);
  }

  @Override
  public ExchangeReviewStatus clone() {
    return (ExchangeReviewStatus) super.clone();
  }

}

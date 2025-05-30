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
 * Details of when the order was fully refunded.
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
public final class RefundEvent extends com.google.api.client.json.GenericJson {

  /**
   * The time when the order was fully refunded.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String eventTime;

  /**
   * Details for the full refund.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RefundDetails refundDetails;

  /**
   * The reason the order was refunded.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String refundReason;

  /**
   * The time when the order was fully refunded.
   * @return value or {@code null} for none
   */
  public String getEventTime() {
    return eventTime;
  }

  /**
   * The time when the order was fully refunded.
   * @param eventTime eventTime or {@code null} for none
   */
  public RefundEvent setEventTime(String eventTime) {
    this.eventTime = eventTime;
    return this;
  }

  /**
   * Details for the full refund.
   * @return value or {@code null} for none
   */
  public RefundDetails getRefundDetails() {
    return refundDetails;
  }

  /**
   * Details for the full refund.
   * @param refundDetails refundDetails or {@code null} for none
   */
  public RefundEvent setRefundDetails(RefundDetails refundDetails) {
    this.refundDetails = refundDetails;
    return this;
  }

  /**
   * The reason the order was refunded.
   * @return value or {@code null} for none
   */
  public java.lang.String getRefundReason() {
    return refundReason;
  }

  /**
   * The reason the order was refunded.
   * @param refundReason refundReason or {@code null} for none
   */
  public RefundEvent setRefundReason(java.lang.String refundReason) {
    this.refundReason = refundReason;
    return this;
  }

  @Override
  public RefundEvent set(String fieldName, Object value) {
    return (RefundEvent) super.set(fieldName, value);
  }

  @Override
  public RefundEvent clone() {
    return (RefundEvent) super.clone();
  }

}

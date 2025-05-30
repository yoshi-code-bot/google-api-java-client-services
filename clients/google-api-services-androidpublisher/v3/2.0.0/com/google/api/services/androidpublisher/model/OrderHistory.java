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
 * Details about events which modified the order.
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
public final class OrderHistory extends com.google.api.client.json.GenericJson {

  /**
   * Details of when the order was canceled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CancellationEvent cancellationEvent;

  /**
   * Details of the partial refund events for this order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PartialRefundEvent> partialRefundEvents;

  /**
   * Details of when the order was processed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ProcessedEvent processedEvent;

  /**
   * Details of when the order was fully refunded.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RefundEvent refundEvent;

  /**
   * Details of when the order was canceled.
   * @return value or {@code null} for none
   */
  public CancellationEvent getCancellationEvent() {
    return cancellationEvent;
  }

  /**
   * Details of when the order was canceled.
   * @param cancellationEvent cancellationEvent or {@code null} for none
   */
  public OrderHistory setCancellationEvent(CancellationEvent cancellationEvent) {
    this.cancellationEvent = cancellationEvent;
    return this;
  }

  /**
   * Details of the partial refund events for this order.
   * @return value or {@code null} for none
   */
  public java.util.List<PartialRefundEvent> getPartialRefundEvents() {
    return partialRefundEvents;
  }

  /**
   * Details of the partial refund events for this order.
   * @param partialRefundEvents partialRefundEvents or {@code null} for none
   */
  public OrderHistory setPartialRefundEvents(java.util.List<PartialRefundEvent> partialRefundEvents) {
    this.partialRefundEvents = partialRefundEvents;
    return this;
  }

  /**
   * Details of when the order was processed.
   * @return value or {@code null} for none
   */
  public ProcessedEvent getProcessedEvent() {
    return processedEvent;
  }

  /**
   * Details of when the order was processed.
   * @param processedEvent processedEvent or {@code null} for none
   */
  public OrderHistory setProcessedEvent(ProcessedEvent processedEvent) {
    this.processedEvent = processedEvent;
    return this;
  }

  /**
   * Details of when the order was fully refunded.
   * @return value or {@code null} for none
   */
  public RefundEvent getRefundEvent() {
    return refundEvent;
  }

  /**
   * Details of when the order was fully refunded.
   * @param refundEvent refundEvent or {@code null} for none
   */
  public OrderHistory setRefundEvent(RefundEvent refundEvent) {
    this.refundEvent = refundEvent;
    return this;
  }

  @Override
  public OrderHistory set(String fieldName, Object value) {
    return (OrderHistory) super.set(fieldName, value);
  }

  @Override
  public OrderHistory clone() {
    return (OrderHistory) super.clone();
  }

}

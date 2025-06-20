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

package com.google.api.services.contactcenterinsights.v1.model;

/**
 * A data point contains the metric values mapped to an interval.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Contact Center AI Insights API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudContactcenterinsightsV1QueryMetricsResponseSliceDataPoint extends com.google.api.client.json.GenericJson {

  /**
   * The measure related to conversations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudContactcenterinsightsV1QueryMetricsResponseSliceDataPointConversationMeasure conversationMeasure;

  /**
   * The interval that this data point represents. * If this is the total data point, the interval
   * is [starting create time, ending create time) from the request. * If this a data point from the
   * time series, the interval is [time, time + time granularity from the request).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleTypeInterval interval;

  /**
   * The measure related to conversations.
   * @return value or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1QueryMetricsResponseSliceDataPointConversationMeasure getConversationMeasure() {
    return conversationMeasure;
  }

  /**
   * The measure related to conversations.
   * @param conversationMeasure conversationMeasure or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1QueryMetricsResponseSliceDataPoint setConversationMeasure(GoogleCloudContactcenterinsightsV1QueryMetricsResponseSliceDataPointConversationMeasure conversationMeasure) {
    this.conversationMeasure = conversationMeasure;
    return this;
  }

  /**
   * The interval that this data point represents. * If this is the total data point, the interval
   * is [starting create time, ending create time) from the request. * If this a data point from the
   * time series, the interval is [time, time + time granularity from the request).
   * @return value or {@code null} for none
   */
  public GoogleTypeInterval getInterval() {
    return interval;
  }

  /**
   * The interval that this data point represents. * If this is the total data point, the interval
   * is [starting create time, ending create time) from the request. * If this a data point from the
   * time series, the interval is [time, time + time granularity from the request).
   * @param interval interval or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1QueryMetricsResponseSliceDataPoint setInterval(GoogleTypeInterval interval) {
    this.interval = interval;
    return this;
  }

  @Override
  public GoogleCloudContactcenterinsightsV1QueryMetricsResponseSliceDataPoint set(String fieldName, Object value) {
    return (GoogleCloudContactcenterinsightsV1QueryMetricsResponseSliceDataPoint) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudContactcenterinsightsV1QueryMetricsResponseSliceDataPoint clone() {
    return (GoogleCloudContactcenterinsightsV1QueryMetricsResponseSliceDataPoint) super.clone();
  }

}

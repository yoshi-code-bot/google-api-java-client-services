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

package com.google.api.services.discoveryengine.v1.model;

/**
 * The historical dedicated crawl rate timeseries data, used for monitoring. Dedicated crawl is used
 * by Vertex AI to crawl the user's website when dedicate crawl is set.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1betaDedicatedCrawlRateTimeSeries extends com.google.api.client.json.GenericJson {

  /**
   * Vertex AI's error rate time series of auto-refresh dedicated crawl.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1betaCrawlRateTimeSeries autoRefreshCrawlErrorRate;

  /**
   * Vertex AI's dedicated crawl rate time series of auto-refresh, which is the crawl rate of
   * Google-CloudVertexBot when dedicate crawl is set, and the crawl rate is for best effort use
   * cases like refreshing urls periodically.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1betaCrawlRateTimeSeries autoRefreshCrawlRate;

  /**
   * Vertex AI's error rate time series of user triggered dedicated crawl.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1betaCrawlRateTimeSeries userTriggeredCrawlErrorRate;

  /**
   * Vertex AI's dedicated crawl rate time series of user triggered crawl, which is the crawl rate
   * of Google-CloudVertexBot when dedicate crawl is set, and user triggered crawl rate is for
   * deterministic use cases like crawling urls or sitemaps specified by users.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1betaCrawlRateTimeSeries userTriggeredCrawlRate;

  /**
   * Vertex AI's error rate time series of auto-refresh dedicated crawl.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1betaCrawlRateTimeSeries getAutoRefreshCrawlErrorRate() {
    return autoRefreshCrawlErrorRate;
  }

  /**
   * Vertex AI's error rate time series of auto-refresh dedicated crawl.
   * @param autoRefreshCrawlErrorRate autoRefreshCrawlErrorRate or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1betaDedicatedCrawlRateTimeSeries setAutoRefreshCrawlErrorRate(GoogleCloudDiscoveryengineV1betaCrawlRateTimeSeries autoRefreshCrawlErrorRate) {
    this.autoRefreshCrawlErrorRate = autoRefreshCrawlErrorRate;
    return this;
  }

  /**
   * Vertex AI's dedicated crawl rate time series of auto-refresh, which is the crawl rate of
   * Google-CloudVertexBot when dedicate crawl is set, and the crawl rate is for best effort use
   * cases like refreshing urls periodically.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1betaCrawlRateTimeSeries getAutoRefreshCrawlRate() {
    return autoRefreshCrawlRate;
  }

  /**
   * Vertex AI's dedicated crawl rate time series of auto-refresh, which is the crawl rate of
   * Google-CloudVertexBot when dedicate crawl is set, and the crawl rate is for best effort use
   * cases like refreshing urls periodically.
   * @param autoRefreshCrawlRate autoRefreshCrawlRate or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1betaDedicatedCrawlRateTimeSeries setAutoRefreshCrawlRate(GoogleCloudDiscoveryengineV1betaCrawlRateTimeSeries autoRefreshCrawlRate) {
    this.autoRefreshCrawlRate = autoRefreshCrawlRate;
    return this;
  }

  /**
   * Vertex AI's error rate time series of user triggered dedicated crawl.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1betaCrawlRateTimeSeries getUserTriggeredCrawlErrorRate() {
    return userTriggeredCrawlErrorRate;
  }

  /**
   * Vertex AI's error rate time series of user triggered dedicated crawl.
   * @param userTriggeredCrawlErrorRate userTriggeredCrawlErrorRate or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1betaDedicatedCrawlRateTimeSeries setUserTriggeredCrawlErrorRate(GoogleCloudDiscoveryengineV1betaCrawlRateTimeSeries userTriggeredCrawlErrorRate) {
    this.userTriggeredCrawlErrorRate = userTriggeredCrawlErrorRate;
    return this;
  }

  /**
   * Vertex AI's dedicated crawl rate time series of user triggered crawl, which is the crawl rate
   * of Google-CloudVertexBot when dedicate crawl is set, and user triggered crawl rate is for
   * deterministic use cases like crawling urls or sitemaps specified by users.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1betaCrawlRateTimeSeries getUserTriggeredCrawlRate() {
    return userTriggeredCrawlRate;
  }

  /**
   * Vertex AI's dedicated crawl rate time series of user triggered crawl, which is the crawl rate
   * of Google-CloudVertexBot when dedicate crawl is set, and user triggered crawl rate is for
   * deterministic use cases like crawling urls or sitemaps specified by users.
   * @param userTriggeredCrawlRate userTriggeredCrawlRate or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1betaDedicatedCrawlRateTimeSeries setUserTriggeredCrawlRate(GoogleCloudDiscoveryengineV1betaCrawlRateTimeSeries userTriggeredCrawlRate) {
    this.userTriggeredCrawlRate = userTriggeredCrawlRate;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1betaDedicatedCrawlRateTimeSeries set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1betaDedicatedCrawlRateTimeSeries) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1betaDedicatedCrawlRateTimeSeries clone() {
    return (GoogleCloudDiscoveryengineV1betaDedicatedCrawlRateTimeSeries) super.clone();
  }

}

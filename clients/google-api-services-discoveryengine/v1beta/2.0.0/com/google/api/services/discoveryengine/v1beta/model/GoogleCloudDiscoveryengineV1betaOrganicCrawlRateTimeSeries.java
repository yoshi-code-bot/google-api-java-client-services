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

package com.google.api.services.discoveryengine.v1beta.model;

/**
 * The historical organic crawl rate timeseries data, used for monitoring. Organic crawl is auto-
 * determined by Google to crawl the user's website when dedicate crawl is not set. Crawl rate is
 * the QPS of crawl request Google sends to the user's website.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1betaOrganicCrawlRateTimeSeries extends com.google.api.client.json.GenericJson {

  /**
   * Google's organic crawl rate time series, which is the sum of all googlebots' crawl rate. Please
   * refer to https://developers.google.com/search/docs/crawling-indexing/overview-google-crawlers
   * for more details about googlebots.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1betaCrawlRateTimeSeries googleOrganicCrawlRate;

  /**
   * Vertex AI's organic crawl rate time series, which is the crawl rate of Google-CloudVertexBot
   * when dedicate crawl is not set. Please refer to
   * https://developers.google.com/search/docs/crawling-indexing/google-common-crawlers#google-
   * cloudvertexbot for more details about Google-CloudVertexBot.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1betaCrawlRateTimeSeries vertexAiOrganicCrawlRate;

  /**
   * Google's organic crawl rate time series, which is the sum of all googlebots' crawl rate. Please
   * refer to https://developers.google.com/search/docs/crawling-indexing/overview-google-crawlers
   * for more details about googlebots.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1betaCrawlRateTimeSeries getGoogleOrganicCrawlRate() {
    return googleOrganicCrawlRate;
  }

  /**
   * Google's organic crawl rate time series, which is the sum of all googlebots' crawl rate. Please
   * refer to https://developers.google.com/search/docs/crawling-indexing/overview-google-crawlers
   * for more details about googlebots.
   * @param googleOrganicCrawlRate googleOrganicCrawlRate or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1betaOrganicCrawlRateTimeSeries setGoogleOrganicCrawlRate(GoogleCloudDiscoveryengineV1betaCrawlRateTimeSeries googleOrganicCrawlRate) {
    this.googleOrganicCrawlRate = googleOrganicCrawlRate;
    return this;
  }

  /**
   * Vertex AI's organic crawl rate time series, which is the crawl rate of Google-CloudVertexBot
   * when dedicate crawl is not set. Please refer to
   * https://developers.google.com/search/docs/crawling-indexing/google-common-crawlers#google-
   * cloudvertexbot for more details about Google-CloudVertexBot.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1betaCrawlRateTimeSeries getVertexAiOrganicCrawlRate() {
    return vertexAiOrganicCrawlRate;
  }

  /**
   * Vertex AI's organic crawl rate time series, which is the crawl rate of Google-CloudVertexBot
   * when dedicate crawl is not set. Please refer to
   * https://developers.google.com/search/docs/crawling-indexing/google-common-crawlers#google-
   * cloudvertexbot for more details about Google-CloudVertexBot.
   * @param vertexAiOrganicCrawlRate vertexAiOrganicCrawlRate or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1betaOrganicCrawlRateTimeSeries setVertexAiOrganicCrawlRate(GoogleCloudDiscoveryengineV1betaCrawlRateTimeSeries vertexAiOrganicCrawlRate) {
    this.vertexAiOrganicCrawlRate = vertexAiOrganicCrawlRate;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1betaOrganicCrawlRateTimeSeries set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1betaOrganicCrawlRateTimeSeries) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1betaOrganicCrawlRateTimeSeries clone() {
    return (GoogleCloudDiscoveryengineV1betaOrganicCrawlRateTimeSeries) super.clone();
  }

}

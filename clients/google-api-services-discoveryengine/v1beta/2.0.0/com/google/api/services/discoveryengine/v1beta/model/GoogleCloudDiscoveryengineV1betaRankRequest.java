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
 * Request message for RankService.Rank method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1betaRankRequest extends com.google.api.client.json.GenericJson {

  /**
   * If true, the response will contain only record ID and score. By default, it is false, the
   * response will contain record details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean ignoreRecordDetailsInResponse;

  /**
   * The identifier of the model to use. It is one of: * `semantic-ranker-512@latest`: Semantic
   * ranking model with maximum input token size 512. It is set to `semantic-ranker-512@latest` by
   * default if unspecified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String model;

  /**
   * The query to use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String query;

  /**
   * Required. A list of records to rank.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDiscoveryengineV1betaRankingRecord> records;

  /**
   * The number of results to return. If this is unset or no bigger than zero, returns all results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer topN;

  /**
   * The user labels applied to a resource must meet the following requirements: * Each resource can
   * have multiple labels, up to a maximum of 64. * Each label must be a key-value pair. * Keys have
   * a minimum length of 1 character and a maximum length of 63 characters and cannot be empty.
   * Values can be empty and have a maximum length of 63 characters. * Keys and values can contain
   * only lowercase letters, numeric characters, underscores, and dashes. All characters must use
   * UTF-8 encoding, and international characters are allowed. * The key portion of a label must be
   * unique. However, you can use the same key with multiple resources. * Keys must start with a
   * lowercase letter or international character. See [Google Cloud
   * Document](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements)
   * for more details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> userLabels;

  /**
   * If true, the response will contain only record ID and score. By default, it is false, the
   * response will contain record details.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIgnoreRecordDetailsInResponse() {
    return ignoreRecordDetailsInResponse;
  }

  /**
   * If true, the response will contain only record ID and score. By default, it is false, the
   * response will contain record details.
   * @param ignoreRecordDetailsInResponse ignoreRecordDetailsInResponse or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1betaRankRequest setIgnoreRecordDetailsInResponse(java.lang.Boolean ignoreRecordDetailsInResponse) {
    this.ignoreRecordDetailsInResponse = ignoreRecordDetailsInResponse;
    return this;
  }

  /**
   * The identifier of the model to use. It is one of: * `semantic-ranker-512@latest`: Semantic
   * ranking model with maximum input token size 512. It is set to `semantic-ranker-512@latest` by
   * default if unspecified.
   * @return value or {@code null} for none
   */
  public java.lang.String getModel() {
    return model;
  }

  /**
   * The identifier of the model to use. It is one of: * `semantic-ranker-512@latest`: Semantic
   * ranking model with maximum input token size 512. It is set to `semantic-ranker-512@latest` by
   * default if unspecified.
   * @param model model or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1betaRankRequest setModel(java.lang.String model) {
    this.model = model;
    return this;
  }

  /**
   * The query to use.
   * @return value or {@code null} for none
   */
  public java.lang.String getQuery() {
    return query;
  }

  /**
   * The query to use.
   * @param query query or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1betaRankRequest setQuery(java.lang.String query) {
    this.query = query;
    return this;
  }

  /**
   * Required. A list of records to rank.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDiscoveryengineV1betaRankingRecord> getRecords() {
    return records;
  }

  /**
   * Required. A list of records to rank.
   * @param records records or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1betaRankRequest setRecords(java.util.List<GoogleCloudDiscoveryengineV1betaRankingRecord> records) {
    this.records = records;
    return this;
  }

  /**
   * The number of results to return. If this is unset or no bigger than zero, returns all results.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTopN() {
    return topN;
  }

  /**
   * The number of results to return. If this is unset or no bigger than zero, returns all results.
   * @param topN topN or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1betaRankRequest setTopN(java.lang.Integer topN) {
    this.topN = topN;
    return this;
  }

  /**
   * The user labels applied to a resource must meet the following requirements: * Each resource can
   * have multiple labels, up to a maximum of 64. * Each label must be a key-value pair. * Keys have
   * a minimum length of 1 character and a maximum length of 63 characters and cannot be empty.
   * Values can be empty and have a maximum length of 63 characters. * Keys and values can contain
   * only lowercase letters, numeric characters, underscores, and dashes. All characters must use
   * UTF-8 encoding, and international characters are allowed. * The key portion of a label must be
   * unique. However, you can use the same key with multiple resources. * Keys must start with a
   * lowercase letter or international character. See [Google Cloud
   * Document](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements)
   * for more details.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getUserLabels() {
    return userLabels;
  }

  /**
   * The user labels applied to a resource must meet the following requirements: * Each resource can
   * have multiple labels, up to a maximum of 64. * Each label must be a key-value pair. * Keys have
   * a minimum length of 1 character and a maximum length of 63 characters and cannot be empty.
   * Values can be empty and have a maximum length of 63 characters. * Keys and values can contain
   * only lowercase letters, numeric characters, underscores, and dashes. All characters must use
   * UTF-8 encoding, and international characters are allowed. * The key portion of a label must be
   * unique. However, you can use the same key with multiple resources. * Keys must start with a
   * lowercase letter or international character. See [Google Cloud
   * Document](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements)
   * for more details.
   * @param userLabels userLabels or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1betaRankRequest setUserLabels(java.util.Map<String, java.lang.String> userLabels) {
    this.userLabels = userLabels;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1betaRankRequest set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1betaRankRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1betaRankRequest clone() {
    return (GoogleCloudDiscoveryengineV1betaRankRequest) super.clone();
  }

}

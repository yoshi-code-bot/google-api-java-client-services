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

package com.google.api.services.aiplatform.v1beta1.model;

/**
 * A datapoint of Index.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1IndexDatapoint extends com.google.api.client.json.GenericJson {

  /**
   * Optional. CrowdingTag of the datapoint, the number of neighbors to return in each crowding can
   * be configured during query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1IndexDatapointCrowdingTag crowdingTag;

  /**
   * Required. Unique identifier of the datapoint.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String datapointId;

  /**
   * Optional. The key-value map of additional metadata for the datapoint.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> embeddingMetadata;

  /**
   * Required. Feature embedding vector for dense index. An array of numbers with the length of
   * [NearestNeighborSearchConfig.dimensions].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Float> featureVector;

  /**
   * Optional. List of Restrict of the datapoint, used to perform "restricted searches" where
   * boolean rule are used to filter the subset of the database eligible for matching. This uses
   * numeric comparisons.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudAiplatformV1beta1IndexDatapointNumericRestriction> numericRestricts;

  /**
   * Optional. List of Restrict of the datapoint, used to perform "restricted searches" where
   * boolean rule are used to filter the subset of the database eligible for matching. This uses
   * categorical tokens. See: https://cloud.google.com/vertex-ai/docs/matching-engine/filtering
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudAiplatformV1beta1IndexDatapointRestriction> restricts;

  /**
   * Optional. Feature embedding vector for sparse index.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1IndexDatapointSparseEmbedding sparseEmbedding;

  /**
   * Optional. CrowdingTag of the datapoint, the number of neighbors to return in each crowding can
   * be configured during query.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1IndexDatapointCrowdingTag getCrowdingTag() {
    return crowdingTag;
  }

  /**
   * Optional. CrowdingTag of the datapoint, the number of neighbors to return in each crowding can
   * be configured during query.
   * @param crowdingTag crowdingTag or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1IndexDatapoint setCrowdingTag(GoogleCloudAiplatformV1beta1IndexDatapointCrowdingTag crowdingTag) {
    this.crowdingTag = crowdingTag;
    return this;
  }

  /**
   * Required. Unique identifier of the datapoint.
   * @return value or {@code null} for none
   */
  public java.lang.String getDatapointId() {
    return datapointId;
  }

  /**
   * Required. Unique identifier of the datapoint.
   * @param datapointId datapointId or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1IndexDatapoint setDatapointId(java.lang.String datapointId) {
    this.datapointId = datapointId;
    return this;
  }

  /**
   * Optional. The key-value map of additional metadata for the datapoint.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getEmbeddingMetadata() {
    return embeddingMetadata;
  }

  /**
   * Optional. The key-value map of additional metadata for the datapoint.
   * @param embeddingMetadata embeddingMetadata or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1IndexDatapoint setEmbeddingMetadata(java.util.Map<String, java.lang.Object> embeddingMetadata) {
    this.embeddingMetadata = embeddingMetadata;
    return this;
  }

  /**
   * Required. Feature embedding vector for dense index. An array of numbers with the length of
   * [NearestNeighborSearchConfig.dimensions].
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Float> getFeatureVector() {
    return featureVector;
  }

  /**
   * Required. Feature embedding vector for dense index. An array of numbers with the length of
   * [NearestNeighborSearchConfig.dimensions].
   * @param featureVector featureVector or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1IndexDatapoint setFeatureVector(java.util.List<java.lang.Float> featureVector) {
    this.featureVector = featureVector;
    return this;
  }

  /**
   * Optional. List of Restrict of the datapoint, used to perform "restricted searches" where
   * boolean rule are used to filter the subset of the database eligible for matching. This uses
   * numeric comparisons.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudAiplatformV1beta1IndexDatapointNumericRestriction> getNumericRestricts() {
    return numericRestricts;
  }

  /**
   * Optional. List of Restrict of the datapoint, used to perform "restricted searches" where
   * boolean rule are used to filter the subset of the database eligible for matching. This uses
   * numeric comparisons.
   * @param numericRestricts numericRestricts or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1IndexDatapoint setNumericRestricts(java.util.List<GoogleCloudAiplatformV1beta1IndexDatapointNumericRestriction> numericRestricts) {
    this.numericRestricts = numericRestricts;
    return this;
  }

  /**
   * Optional. List of Restrict of the datapoint, used to perform "restricted searches" where
   * boolean rule are used to filter the subset of the database eligible for matching. This uses
   * categorical tokens. See: https://cloud.google.com/vertex-ai/docs/matching-engine/filtering
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudAiplatformV1beta1IndexDatapointRestriction> getRestricts() {
    return restricts;
  }

  /**
   * Optional. List of Restrict of the datapoint, used to perform "restricted searches" where
   * boolean rule are used to filter the subset of the database eligible for matching. This uses
   * categorical tokens. See: https://cloud.google.com/vertex-ai/docs/matching-engine/filtering
   * @param restricts restricts or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1IndexDatapoint setRestricts(java.util.List<GoogleCloudAiplatformV1beta1IndexDatapointRestriction> restricts) {
    this.restricts = restricts;
    return this;
  }

  /**
   * Optional. Feature embedding vector for sparse index.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1IndexDatapointSparseEmbedding getSparseEmbedding() {
    return sparseEmbedding;
  }

  /**
   * Optional. Feature embedding vector for sparse index.
   * @param sparseEmbedding sparseEmbedding or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1IndexDatapoint setSparseEmbedding(GoogleCloudAiplatformV1beta1IndexDatapointSparseEmbedding sparseEmbedding) {
    this.sparseEmbedding = sparseEmbedding;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1IndexDatapoint set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1IndexDatapoint) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1IndexDatapoint clone() {
    return (GoogleCloudAiplatformV1beta1IndexDatapoint) super.clone();
  }

}

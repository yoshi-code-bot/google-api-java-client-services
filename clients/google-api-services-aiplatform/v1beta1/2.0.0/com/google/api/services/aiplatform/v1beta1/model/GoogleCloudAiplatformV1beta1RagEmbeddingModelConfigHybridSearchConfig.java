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
 * Config for hybrid search.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1RagEmbeddingModelConfigHybridSearchConfig extends com.google.api.client.json.GenericJson {

  /**
   * Required. The Vertex AI Prediction Endpoint that hosts the embedding model for dense embedding
   * generations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1RagEmbeddingModelConfigVertexPredictionEndpoint denseEmbeddingModelPredictionEndpoint;

  /**
   * Optional. The configuration for sparse embedding generation. This field is optional the default
   * behavior depends on the vector database choice on the RagCorpus.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1RagEmbeddingModelConfigSparseEmbeddingConfig sparseEmbeddingConfig;

  /**
   * Required. The Vertex AI Prediction Endpoint that hosts the embedding model for dense embedding
   * generations.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1RagEmbeddingModelConfigVertexPredictionEndpoint getDenseEmbeddingModelPredictionEndpoint() {
    return denseEmbeddingModelPredictionEndpoint;
  }

  /**
   * Required. The Vertex AI Prediction Endpoint that hosts the embedding model for dense embedding
   * generations.
   * @param denseEmbeddingModelPredictionEndpoint denseEmbeddingModelPredictionEndpoint or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1RagEmbeddingModelConfigHybridSearchConfig setDenseEmbeddingModelPredictionEndpoint(GoogleCloudAiplatformV1beta1RagEmbeddingModelConfigVertexPredictionEndpoint denseEmbeddingModelPredictionEndpoint) {
    this.denseEmbeddingModelPredictionEndpoint = denseEmbeddingModelPredictionEndpoint;
    return this;
  }

  /**
   * Optional. The configuration for sparse embedding generation. This field is optional the default
   * behavior depends on the vector database choice on the RagCorpus.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1RagEmbeddingModelConfigSparseEmbeddingConfig getSparseEmbeddingConfig() {
    return sparseEmbeddingConfig;
  }

  /**
   * Optional. The configuration for sparse embedding generation. This field is optional the default
   * behavior depends on the vector database choice on the RagCorpus.
   * @param sparseEmbeddingConfig sparseEmbeddingConfig or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1RagEmbeddingModelConfigHybridSearchConfig setSparseEmbeddingConfig(GoogleCloudAiplatformV1beta1RagEmbeddingModelConfigSparseEmbeddingConfig sparseEmbeddingConfig) {
    this.sparseEmbeddingConfig = sparseEmbeddingConfig;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1RagEmbeddingModelConfigHybridSearchConfig set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1RagEmbeddingModelConfigHybridSearchConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1RagEmbeddingModelConfigHybridSearchConfig clone() {
    return (GoogleCloudAiplatformV1beta1RagEmbeddingModelConfigHybridSearchConfig) super.clone();
  }

}

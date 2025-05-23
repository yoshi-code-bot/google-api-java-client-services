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

package com.google.api.services.firebaseml.v2beta.model;

/**
 * Config for ranking and reranking.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase ML API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1RagRetrievalConfigRanking extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Config for LlmRanker.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1RagRetrievalConfigRankingLlmRanker llmRanker;

  /**
   * Optional. Config for Rank Service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1RagRetrievalConfigRankingRankService rankService;

  /**
   * Optional. Config for LlmRanker.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1RagRetrievalConfigRankingLlmRanker getLlmRanker() {
    return llmRanker;
  }

  /**
   * Optional. Config for LlmRanker.
   * @param llmRanker llmRanker or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1RagRetrievalConfigRanking setLlmRanker(GoogleCloudAiplatformV1beta1RagRetrievalConfigRankingLlmRanker llmRanker) {
    this.llmRanker = llmRanker;
    return this;
  }

  /**
   * Optional. Config for Rank Service.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1RagRetrievalConfigRankingRankService getRankService() {
    return rankService;
  }

  /**
   * Optional. Config for Rank Service.
   * @param rankService rankService or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1RagRetrievalConfigRanking setRankService(GoogleCloudAiplatformV1beta1RagRetrievalConfigRankingRankService rankService) {
    this.rankService = rankService;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1RagRetrievalConfigRanking set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1RagRetrievalConfigRanking) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1RagRetrievalConfigRanking clone() {
    return (GoogleCloudAiplatformV1beta1RagRetrievalConfigRanking) super.clone();
  }

}

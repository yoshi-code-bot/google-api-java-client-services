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

package com.google.api.services.discoveryengine.v1alpha.model;

/**
 * A specification for configuring a summary returned in a search response.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpecSummarySpec extends com.google.api.client.json.GenericJson {

  /**
   * Specifies whether to filter out adversarial queries. The default value is `false`. Google
   * employs search-query classification to detect adversarial queries. No summary is returned if
   * the search query is classified as an adversarial query. For example, a user might ask a
   * question regarding negative comments about the company or submit a query designed to generate
   * unsafe, policy-violating output. If this field is set to `true`, we skip generating summaries
   * for adversarial queries and return fallback messages instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean ignoreAdversarialQuery;

  /**
   * Optional. Specifies whether to filter out jail-breaking queries. The default value is `false`.
   * Google employs search-query classification to detect jail-breaking queries. No summary is
   * returned if the search query is classified as a jail-breaking query. A user might add
   * instructions to the query to change the tone, style, language, content of the answer, or ask
   * the model to act as a different entity, e.g. "Reply in the tone of a competing company's CEO".
   * If this field is set to `true`, we skip generating summaries for jail-breaking queries and
   * return fallback messages instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean ignoreJailBreakingQuery;

  /**
   * Specifies whether to filter out queries that have low relevance. The default value is `false`.
   * If this field is set to `false`, all search results are used regardless of relevance to
   * generate answers. If set to `true`, only queries with high relevance search results will
   * generate answers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean ignoreLowRelevantContent;

  /**
   * Specifies whether to filter out queries that are not summary-seeking. The default value is
   * `false`. Google employs search-query classification to detect summary-seeking queries. No
   * summary is returned if the search query is classified as a non-summary seeking query. For
   * example, `why is the sky blue` and `Who is the best soccer player in the world?` are summary-
   * seeking queries, but `SFO airport` and `world cup 2026` are not. They are most likely
   * navigational queries. If this field is set to `true`, we skip generating summaries for non-
   * summary seeking queries and return fallback messages instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean ignoreNonSummarySeekingQuery;

  /**
   * Specifies whether to include citations in the summary. The default value is `false`. When this
   * field is set to `true`, summaries include in-line citation numbers. Example summary including
   * citations: BigQuery is Google Cloud's fully managed and completely serverless enterprise data
   * warehouse [1]. BigQuery supports all data types, works across clouds, and has built-in machine
   * learning and business intelligence, all within a unified platform [2, 3]. The citation numbers
   * refer to the returned search results and are 1-indexed. For example, [1] means that the
   * sentence is attributed to the first search result. [2, 3] means that the sentence is attributed
   * to both the second and third search results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean includeCitations;

  /**
   * Language code for Summary. Use language tags defined by [BCP47](https://www.rfc-
   * editor.org/rfc/bcp/bcp47.txt). Note: This is an experimental feature.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String languageCode;

  /**
   * If specified, the spec will be used to modify the prompt provided to the LLM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpecSummarySpecModelPromptSpec modelPromptSpec;

  /**
   * If specified, the spec will be used to modify the model specification provided to the LLM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpecSummarySpecModelSpec modelSpec;

  /**
   * Optional. Multimodal specification.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpecSummarySpecMultiModalSpec multimodalSpec;

  /**
   * The number of top results to generate the summary from. If the number of results returned is
   * less than `summaryResultCount`, the summary is generated from all of the results. At most 10
   * results for documents mode, or 50 for chunks mode, can be used to generate a summary. The
   * chunks mode is used when SearchRequest.ContentSearchSpec.search_result_mode is set to CHUNKS.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer summaryResultCount;

  /**
   * If true, answer will be generated from most relevant chunks from top search results. This
   * feature will improve summary quality. Note that with this feature enabled, not all top search
   * results will be referenced and included in the reference list, so the citation source index
   * only points to the search results listed in the reference list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean useSemanticChunks;

  /**
   * Specifies whether to filter out adversarial queries. The default value is `false`. Google
   * employs search-query classification to detect adversarial queries. No summary is returned if
   * the search query is classified as an adversarial query. For example, a user might ask a
   * question regarding negative comments about the company or submit a query designed to generate
   * unsafe, policy-violating output. If this field is set to `true`, we skip generating summaries
   * for adversarial queries and return fallback messages instead.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIgnoreAdversarialQuery() {
    return ignoreAdversarialQuery;
  }

  /**
   * Specifies whether to filter out adversarial queries. The default value is `false`. Google
   * employs search-query classification to detect adversarial queries. No summary is returned if
   * the search query is classified as an adversarial query. For example, a user might ask a
   * question regarding negative comments about the company or submit a query designed to generate
   * unsafe, policy-violating output. If this field is set to `true`, we skip generating summaries
   * for adversarial queries and return fallback messages instead.
   * @param ignoreAdversarialQuery ignoreAdversarialQuery or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpecSummarySpec setIgnoreAdversarialQuery(java.lang.Boolean ignoreAdversarialQuery) {
    this.ignoreAdversarialQuery = ignoreAdversarialQuery;
    return this;
  }

  /**
   * Optional. Specifies whether to filter out jail-breaking queries. The default value is `false`.
   * Google employs search-query classification to detect jail-breaking queries. No summary is
   * returned if the search query is classified as a jail-breaking query. A user might add
   * instructions to the query to change the tone, style, language, content of the answer, or ask
   * the model to act as a different entity, e.g. "Reply in the tone of a competing company's CEO".
   * If this field is set to `true`, we skip generating summaries for jail-breaking queries and
   * return fallback messages instead.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIgnoreJailBreakingQuery() {
    return ignoreJailBreakingQuery;
  }

  /**
   * Optional. Specifies whether to filter out jail-breaking queries. The default value is `false`.
   * Google employs search-query classification to detect jail-breaking queries. No summary is
   * returned if the search query is classified as a jail-breaking query. A user might add
   * instructions to the query to change the tone, style, language, content of the answer, or ask
   * the model to act as a different entity, e.g. "Reply in the tone of a competing company's CEO".
   * If this field is set to `true`, we skip generating summaries for jail-breaking queries and
   * return fallback messages instead.
   * @param ignoreJailBreakingQuery ignoreJailBreakingQuery or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpecSummarySpec setIgnoreJailBreakingQuery(java.lang.Boolean ignoreJailBreakingQuery) {
    this.ignoreJailBreakingQuery = ignoreJailBreakingQuery;
    return this;
  }

  /**
   * Specifies whether to filter out queries that have low relevance. The default value is `false`.
   * If this field is set to `false`, all search results are used regardless of relevance to
   * generate answers. If set to `true`, only queries with high relevance search results will
   * generate answers.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIgnoreLowRelevantContent() {
    return ignoreLowRelevantContent;
  }

  /**
   * Specifies whether to filter out queries that have low relevance. The default value is `false`.
   * If this field is set to `false`, all search results are used regardless of relevance to
   * generate answers. If set to `true`, only queries with high relevance search results will
   * generate answers.
   * @param ignoreLowRelevantContent ignoreLowRelevantContent or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpecSummarySpec setIgnoreLowRelevantContent(java.lang.Boolean ignoreLowRelevantContent) {
    this.ignoreLowRelevantContent = ignoreLowRelevantContent;
    return this;
  }

  /**
   * Specifies whether to filter out queries that are not summary-seeking. The default value is
   * `false`. Google employs search-query classification to detect summary-seeking queries. No
   * summary is returned if the search query is classified as a non-summary seeking query. For
   * example, `why is the sky blue` and `Who is the best soccer player in the world?` are summary-
   * seeking queries, but `SFO airport` and `world cup 2026` are not. They are most likely
   * navigational queries. If this field is set to `true`, we skip generating summaries for non-
   * summary seeking queries and return fallback messages instead.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIgnoreNonSummarySeekingQuery() {
    return ignoreNonSummarySeekingQuery;
  }

  /**
   * Specifies whether to filter out queries that are not summary-seeking. The default value is
   * `false`. Google employs search-query classification to detect summary-seeking queries. No
   * summary is returned if the search query is classified as a non-summary seeking query. For
   * example, `why is the sky blue` and `Who is the best soccer player in the world?` are summary-
   * seeking queries, but `SFO airport` and `world cup 2026` are not. They are most likely
   * navigational queries. If this field is set to `true`, we skip generating summaries for non-
   * summary seeking queries and return fallback messages instead.
   * @param ignoreNonSummarySeekingQuery ignoreNonSummarySeekingQuery or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpecSummarySpec setIgnoreNonSummarySeekingQuery(java.lang.Boolean ignoreNonSummarySeekingQuery) {
    this.ignoreNonSummarySeekingQuery = ignoreNonSummarySeekingQuery;
    return this;
  }

  /**
   * Specifies whether to include citations in the summary. The default value is `false`. When this
   * field is set to `true`, summaries include in-line citation numbers. Example summary including
   * citations: BigQuery is Google Cloud's fully managed and completely serverless enterprise data
   * warehouse [1]. BigQuery supports all data types, works across clouds, and has built-in machine
   * learning and business intelligence, all within a unified platform [2, 3]. The citation numbers
   * refer to the returned search results and are 1-indexed. For example, [1] means that the
   * sentence is attributed to the first search result. [2, 3] means that the sentence is attributed
   * to both the second and third search results.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIncludeCitations() {
    return includeCitations;
  }

  /**
   * Specifies whether to include citations in the summary. The default value is `false`. When this
   * field is set to `true`, summaries include in-line citation numbers. Example summary including
   * citations: BigQuery is Google Cloud's fully managed and completely serverless enterprise data
   * warehouse [1]. BigQuery supports all data types, works across clouds, and has built-in machine
   * learning and business intelligence, all within a unified platform [2, 3]. The citation numbers
   * refer to the returned search results and are 1-indexed. For example, [1] means that the
   * sentence is attributed to the first search result. [2, 3] means that the sentence is attributed
   * to both the second and third search results.
   * @param includeCitations includeCitations or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpecSummarySpec setIncludeCitations(java.lang.Boolean includeCitations) {
    this.includeCitations = includeCitations;
    return this;
  }

  /**
   * Language code for Summary. Use language tags defined by [BCP47](https://www.rfc-
   * editor.org/rfc/bcp/bcp47.txt). Note: This is an experimental feature.
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguageCode() {
    return languageCode;
  }

  /**
   * Language code for Summary. Use language tags defined by [BCP47](https://www.rfc-
   * editor.org/rfc/bcp/bcp47.txt). Note: This is an experimental feature.
   * @param languageCode languageCode or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpecSummarySpec setLanguageCode(java.lang.String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * If specified, the spec will be used to modify the prompt provided to the LLM.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpecSummarySpecModelPromptSpec getModelPromptSpec() {
    return modelPromptSpec;
  }

  /**
   * If specified, the spec will be used to modify the prompt provided to the LLM.
   * @param modelPromptSpec modelPromptSpec or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpecSummarySpec setModelPromptSpec(GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpecSummarySpecModelPromptSpec modelPromptSpec) {
    this.modelPromptSpec = modelPromptSpec;
    return this;
  }

  /**
   * If specified, the spec will be used to modify the model specification provided to the LLM.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpecSummarySpecModelSpec getModelSpec() {
    return modelSpec;
  }

  /**
   * If specified, the spec will be used to modify the model specification provided to the LLM.
   * @param modelSpec modelSpec or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpecSummarySpec setModelSpec(GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpecSummarySpecModelSpec modelSpec) {
    this.modelSpec = modelSpec;
    return this;
  }

  /**
   * Optional. Multimodal specification.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpecSummarySpecMultiModalSpec getMultimodalSpec() {
    return multimodalSpec;
  }

  /**
   * Optional. Multimodal specification.
   * @param multimodalSpec multimodalSpec or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpecSummarySpec setMultimodalSpec(GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpecSummarySpecMultiModalSpec multimodalSpec) {
    this.multimodalSpec = multimodalSpec;
    return this;
  }

  /**
   * The number of top results to generate the summary from. If the number of results returned is
   * less than `summaryResultCount`, the summary is generated from all of the results. At most 10
   * results for documents mode, or 50 for chunks mode, can be used to generate a summary. The
   * chunks mode is used when SearchRequest.ContentSearchSpec.search_result_mode is set to CHUNKS.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSummaryResultCount() {
    return summaryResultCount;
  }

  /**
   * The number of top results to generate the summary from. If the number of results returned is
   * less than `summaryResultCount`, the summary is generated from all of the results. At most 10
   * results for documents mode, or 50 for chunks mode, can be used to generate a summary. The
   * chunks mode is used when SearchRequest.ContentSearchSpec.search_result_mode is set to CHUNKS.
   * @param summaryResultCount summaryResultCount or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpecSummarySpec setSummaryResultCount(java.lang.Integer summaryResultCount) {
    this.summaryResultCount = summaryResultCount;
    return this;
  }

  /**
   * If true, answer will be generated from most relevant chunks from top search results. This
   * feature will improve summary quality. Note that with this feature enabled, not all top search
   * results will be referenced and included in the reference list, so the citation source index
   * only points to the search results listed in the reference list.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUseSemanticChunks() {
    return useSemanticChunks;
  }

  /**
   * If true, answer will be generated from most relevant chunks from top search results. This
   * feature will improve summary quality. Note that with this feature enabled, not all top search
   * results will be referenced and included in the reference list, so the citation source index
   * only points to the search results listed in the reference list.
   * @param useSemanticChunks useSemanticChunks or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpecSummarySpec setUseSemanticChunks(java.lang.Boolean useSemanticChunks) {
    this.useSemanticChunks = useSemanticChunks;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpecSummarySpec set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpecSummarySpec) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpecSummarySpec clone() {
    return (GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpecSummarySpec) super.clone();
  }

}

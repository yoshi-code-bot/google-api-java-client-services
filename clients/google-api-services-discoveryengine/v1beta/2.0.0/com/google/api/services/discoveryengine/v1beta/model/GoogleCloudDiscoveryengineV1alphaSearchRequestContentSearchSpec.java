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
 * A specification for configuring the behavior of content search.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpec extends com.google.api.client.json.GenericJson {

  /**
   * Specifies the chunk spec to be returned from the search response. Only available if the
   * SearchRequest.ContentSearchSpec.search_result_mode is set to CHUNKS
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpecChunkSpec chunkSpec;

  /**
   * If there is no extractive_content_spec provided, there will be no extractive answer in the
   * search response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpecExtractiveContentSpec extractiveContentSpec;

  /**
   * Specifies the search result mode. If unspecified, the search result mode defaults to
   * `DOCUMENTS`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String searchResultMode;

  /**
   * If `snippetSpec` is not specified, snippets are not included in the search response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpecSnippetSpec snippetSpec;

  /**
   * If `summarySpec` is not specified, summaries are not included in the search response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpecSummarySpec summarySpec;

  /**
   * Specifies the chunk spec to be returned from the search response. Only available if the
   * SearchRequest.ContentSearchSpec.search_result_mode is set to CHUNKS
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpecChunkSpec getChunkSpec() {
    return chunkSpec;
  }

  /**
   * Specifies the chunk spec to be returned from the search response. Only available if the
   * SearchRequest.ContentSearchSpec.search_result_mode is set to CHUNKS
   * @param chunkSpec chunkSpec or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpec setChunkSpec(GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpecChunkSpec chunkSpec) {
    this.chunkSpec = chunkSpec;
    return this;
  }

  /**
   * If there is no extractive_content_spec provided, there will be no extractive answer in the
   * search response.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpecExtractiveContentSpec getExtractiveContentSpec() {
    return extractiveContentSpec;
  }

  /**
   * If there is no extractive_content_spec provided, there will be no extractive answer in the
   * search response.
   * @param extractiveContentSpec extractiveContentSpec or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpec setExtractiveContentSpec(GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpecExtractiveContentSpec extractiveContentSpec) {
    this.extractiveContentSpec = extractiveContentSpec;
    return this;
  }

  /**
   * Specifies the search result mode. If unspecified, the search result mode defaults to
   * `DOCUMENTS`.
   * @return value or {@code null} for none
   */
  public java.lang.String getSearchResultMode() {
    return searchResultMode;
  }

  /**
   * Specifies the search result mode. If unspecified, the search result mode defaults to
   * `DOCUMENTS`.
   * @param searchResultMode searchResultMode or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpec setSearchResultMode(java.lang.String searchResultMode) {
    this.searchResultMode = searchResultMode;
    return this;
  }

  /**
   * If `snippetSpec` is not specified, snippets are not included in the search response.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpecSnippetSpec getSnippetSpec() {
    return snippetSpec;
  }

  /**
   * If `snippetSpec` is not specified, snippets are not included in the search response.
   * @param snippetSpec snippetSpec or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpec setSnippetSpec(GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpecSnippetSpec snippetSpec) {
    this.snippetSpec = snippetSpec;
    return this;
  }

  /**
   * If `summarySpec` is not specified, summaries are not included in the search response.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpecSummarySpec getSummarySpec() {
    return summarySpec;
  }

  /**
   * If `summarySpec` is not specified, summaries are not included in the search response.
   * @param summarySpec summarySpec or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpec setSummarySpec(GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpecSummarySpec summarySpec) {
    this.summarySpec = summarySpec;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpec set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpec) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpec clone() {
    return (GoogleCloudDiscoveryengineV1alphaSearchRequestContentSearchSpec) super.clone();
  }

}

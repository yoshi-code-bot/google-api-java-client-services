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
 * Represents the search results.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1alphaSearchResponseSearchResult extends com.google.api.client.json.GenericJson {

  /**
   * The chunk data in the search response if the SearchRequest.ContentSearchSpec.search_result_mode
   * is set to CHUNKS.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1alphaChunk chunk;

  /**
   * The document data snippet in the search response. Only fields that are marked as `retrievable`
   * are populated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1alphaDocument document;

  /**
   * Document.id of the searched Document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Output only. Google provided available scores.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, GoogleCloudDiscoveryengineV1alphaDoubleList> modelScores;

  static {
    // hack to force ProGuard to consider GoogleCloudDiscoveryengineV1alphaDoubleList used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDiscoveryengineV1alphaDoubleList.class);
  }

  /**
   * The chunk data in the search response if the SearchRequest.ContentSearchSpec.search_result_mode
   * is set to CHUNKS.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaChunk getChunk() {
    return chunk;
  }

  /**
   * The chunk data in the search response if the SearchRequest.ContentSearchSpec.search_result_mode
   * is set to CHUNKS.
   * @param chunk chunk or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchResponseSearchResult setChunk(GoogleCloudDiscoveryengineV1alphaChunk chunk) {
    this.chunk = chunk;
    return this;
  }

  /**
   * The document data snippet in the search response. Only fields that are marked as `retrievable`
   * are populated.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaDocument getDocument() {
    return document;
  }

  /**
   * The document data snippet in the search response. Only fields that are marked as `retrievable`
   * are populated.
   * @param document document or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchResponseSearchResult setDocument(GoogleCloudDiscoveryengineV1alphaDocument document) {
    this.document = document;
    return this;
  }

  /**
   * Document.id of the searched Document.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Document.id of the searched Document.
   * @param id id or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchResponseSearchResult setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Output only. Google provided available scores.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, GoogleCloudDiscoveryengineV1alphaDoubleList> getModelScores() {
    return modelScores;
  }

  /**
   * Output only. Google provided available scores.
   * @param modelScores modelScores or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchResponseSearchResult setModelScores(java.util.Map<String, GoogleCloudDiscoveryengineV1alphaDoubleList> modelScores) {
    this.modelScores = modelScores;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaSearchResponseSearchResult set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1alphaSearchResponseSearchResult) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaSearchResponseSearchResult clone() {
    return (GoogleCloudDiscoveryengineV1alphaSearchResponseSearchResult) super.clone();
  }

}

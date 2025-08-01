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
 * Metadata that describes the training and serving parameters of an Engine.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1Engine extends com.google.api.client.json.GenericJson {

  /**
   * Configurations for the Chat Engine. Only applicable if solution_type is SOLUTION_TYPE_CHAT.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1EngineChatEngineConfig chatEngineConfig;

  /**
   * Output only. Additional information of the Chat Engine. Only applicable if solution_type is
   * SOLUTION_TYPE_CHAT.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1EngineChatEngineMetadata chatEngineMetadata;

  /**
   * Common config spec that specifies the metadata of the engine.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1EngineCommonConfig commonConfig;

  /**
   * Output only. Timestamp the Recommendation Engine was created at.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. The data stores associated with this engine. For SOLUTION_TYPE_SEARCH and
   * SOLUTION_TYPE_RECOMMENDATION type of engines, they can only associate with at most one data
   * store. If solution_type is SOLUTION_TYPE_CHAT, multiple DataStores in the same Collection can
   * be associated here. Note that when used in CreateEngineRequest, one DataStore id must be
   * provided as the system will use it for necessary initializations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> dataStoreIds;

  /**
   * Optional. Whether to disable analytics for searches performed on this engine.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disableAnalytics;

  /**
   * Required. The display name of the engine. Should be human readable. UTF-8 encoded string with
   * limit of 1024 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Optional. Feature config for the engine to opt in or opt out of features. Supported keys: *
   * `*`: all features, if it's present, all other feature state settings are ignored. * `agent-
   * gallery` * `no-code-agent-builder` * `prompt-gallery` * `model-selector` * `notebook-lm` *
   * `people-search` * `people-search-org-chart` * `bi-directional-audio` * `feedback` * `session-
   * sharing` * `personalization-memory` - Enables personalization based on user preferences.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> features;

  /**
   * Optional. The industry vertical that the engine registers. The restriction of the Engine
   * industry vertical is based on DataStore: Vertical on Engine has to match vertical of the
   * DataStore linked to the engine.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String industryVertical;

  /**
   * Configurations for the Media Engine. Only applicable on the data stores with solution_type
   * SOLUTION_TYPE_RECOMMENDATION and IndustryVertical.MEDIA vertical.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1EngineMediaRecommendationEngineConfig mediaRecommendationEngineConfig;

  /**
   * Immutable. Identifier. The fully qualified resource name of the engine. This field must be a
   * UTF-8 encoded string with a length limit of 1024 characters. Format:
   * `projects/{project}/locations/{location}/collections/{collection}/engines/{engine}` engine
   * should be 1-63 characters, and valid characters are /a-z0-9. Otherwise, an INVALID_ARGUMENT
   * error is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Configurations for the Search Engine. Only applicable if solution_type is SOLUTION_TYPE_SEARCH.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1EngineSearchEngineConfig searchEngineConfig;

  /**
   * Required. The solutions of the engine.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String solutionType;

  /**
   * Output only. Timestamp the Recommendation Engine was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Configurations for the Chat Engine. Only applicable if solution_type is SOLUTION_TYPE_CHAT.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1EngineChatEngineConfig getChatEngineConfig() {
    return chatEngineConfig;
  }

  /**
   * Configurations for the Chat Engine. Only applicable if solution_type is SOLUTION_TYPE_CHAT.
   * @param chatEngineConfig chatEngineConfig or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1Engine setChatEngineConfig(GoogleCloudDiscoveryengineV1EngineChatEngineConfig chatEngineConfig) {
    this.chatEngineConfig = chatEngineConfig;
    return this;
  }

  /**
   * Output only. Additional information of the Chat Engine. Only applicable if solution_type is
   * SOLUTION_TYPE_CHAT.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1EngineChatEngineMetadata getChatEngineMetadata() {
    return chatEngineMetadata;
  }

  /**
   * Output only. Additional information of the Chat Engine. Only applicable if solution_type is
   * SOLUTION_TYPE_CHAT.
   * @param chatEngineMetadata chatEngineMetadata or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1Engine setChatEngineMetadata(GoogleCloudDiscoveryengineV1EngineChatEngineMetadata chatEngineMetadata) {
    this.chatEngineMetadata = chatEngineMetadata;
    return this;
  }

  /**
   * Common config spec that specifies the metadata of the engine.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1EngineCommonConfig getCommonConfig() {
    return commonConfig;
  }

  /**
   * Common config spec that specifies the metadata of the engine.
   * @param commonConfig commonConfig or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1Engine setCommonConfig(GoogleCloudDiscoveryengineV1EngineCommonConfig commonConfig) {
    this.commonConfig = commonConfig;
    return this;
  }

  /**
   * Output only. Timestamp the Recommendation Engine was created at.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Timestamp the Recommendation Engine was created at.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1Engine setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. The data stores associated with this engine. For SOLUTION_TYPE_SEARCH and
   * SOLUTION_TYPE_RECOMMENDATION type of engines, they can only associate with at most one data
   * store. If solution_type is SOLUTION_TYPE_CHAT, multiple DataStores in the same Collection can
   * be associated here. Note that when used in CreateEngineRequest, one DataStore id must be
   * provided as the system will use it for necessary initializations.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDataStoreIds() {
    return dataStoreIds;
  }

  /**
   * Optional. The data stores associated with this engine. For SOLUTION_TYPE_SEARCH and
   * SOLUTION_TYPE_RECOMMENDATION type of engines, they can only associate with at most one data
   * store. If solution_type is SOLUTION_TYPE_CHAT, multiple DataStores in the same Collection can
   * be associated here. Note that when used in CreateEngineRequest, one DataStore id must be
   * provided as the system will use it for necessary initializations.
   * @param dataStoreIds dataStoreIds or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1Engine setDataStoreIds(java.util.List<java.lang.String> dataStoreIds) {
    this.dataStoreIds = dataStoreIds;
    return this;
  }

  /**
   * Optional. Whether to disable analytics for searches performed on this engine.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisableAnalytics() {
    return disableAnalytics;
  }

  /**
   * Optional. Whether to disable analytics for searches performed on this engine.
   * @param disableAnalytics disableAnalytics or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1Engine setDisableAnalytics(java.lang.Boolean disableAnalytics) {
    this.disableAnalytics = disableAnalytics;
    return this;
  }

  /**
   * Required. The display name of the engine. Should be human readable. UTF-8 encoded string with
   * limit of 1024 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. The display name of the engine. Should be human readable. UTF-8 encoded string with
   * limit of 1024 characters.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1Engine setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Optional. Feature config for the engine to opt in or opt out of features. Supported keys: *
   * `*`: all features, if it's present, all other feature state settings are ignored. * `agent-
   * gallery` * `no-code-agent-builder` * `prompt-gallery` * `model-selector` * `notebook-lm` *
   * `people-search` * `people-search-org-chart` * `bi-directional-audio` * `feedback` * `session-
   * sharing` * `personalization-memory` - Enables personalization based on user preferences.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getFeatures() {
    return features;
  }

  /**
   * Optional. Feature config for the engine to opt in or opt out of features. Supported keys: *
   * `*`: all features, if it's present, all other feature state settings are ignored. * `agent-
   * gallery` * `no-code-agent-builder` * `prompt-gallery` * `model-selector` * `notebook-lm` *
   * `people-search` * `people-search-org-chart` * `bi-directional-audio` * `feedback` * `session-
   * sharing` * `personalization-memory` - Enables personalization based on user preferences.
   * @param features features or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1Engine setFeatures(java.util.Map<String, java.lang.String> features) {
    this.features = features;
    return this;
  }

  /**
   * Optional. The industry vertical that the engine registers. The restriction of the Engine
   * industry vertical is based on DataStore: Vertical on Engine has to match vertical of the
   * DataStore linked to the engine.
   * @return value or {@code null} for none
   */
  public java.lang.String getIndustryVertical() {
    return industryVertical;
  }

  /**
   * Optional. The industry vertical that the engine registers. The restriction of the Engine
   * industry vertical is based on DataStore: Vertical on Engine has to match vertical of the
   * DataStore linked to the engine.
   * @param industryVertical industryVertical or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1Engine setIndustryVertical(java.lang.String industryVertical) {
    this.industryVertical = industryVertical;
    return this;
  }

  /**
   * Configurations for the Media Engine. Only applicable on the data stores with solution_type
   * SOLUTION_TYPE_RECOMMENDATION and IndustryVertical.MEDIA vertical.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1EngineMediaRecommendationEngineConfig getMediaRecommendationEngineConfig() {
    return mediaRecommendationEngineConfig;
  }

  /**
   * Configurations for the Media Engine. Only applicable on the data stores with solution_type
   * SOLUTION_TYPE_RECOMMENDATION and IndustryVertical.MEDIA vertical.
   * @param mediaRecommendationEngineConfig mediaRecommendationEngineConfig or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1Engine setMediaRecommendationEngineConfig(GoogleCloudDiscoveryengineV1EngineMediaRecommendationEngineConfig mediaRecommendationEngineConfig) {
    this.mediaRecommendationEngineConfig = mediaRecommendationEngineConfig;
    return this;
  }

  /**
   * Immutable. Identifier. The fully qualified resource name of the engine. This field must be a
   * UTF-8 encoded string with a length limit of 1024 characters. Format:
   * `projects/{project}/locations/{location}/collections/{collection}/engines/{engine}` engine
   * should be 1-63 characters, and valid characters are /a-z0-9. Otherwise, an INVALID_ARGUMENT
   * error is returned.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Immutable. Identifier. The fully qualified resource name of the engine. This field must be a
   * UTF-8 encoded string with a length limit of 1024 characters. Format:
   * `projects/{project}/locations/{location}/collections/{collection}/engines/{engine}` engine
   * should be 1-63 characters, and valid characters are /a-z0-9. Otherwise, an INVALID_ARGUMENT
   * error is returned.
   * @param name name or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1Engine setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Configurations for the Search Engine. Only applicable if solution_type is SOLUTION_TYPE_SEARCH.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1EngineSearchEngineConfig getSearchEngineConfig() {
    return searchEngineConfig;
  }

  /**
   * Configurations for the Search Engine. Only applicable if solution_type is SOLUTION_TYPE_SEARCH.
   * @param searchEngineConfig searchEngineConfig or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1Engine setSearchEngineConfig(GoogleCloudDiscoveryengineV1EngineSearchEngineConfig searchEngineConfig) {
    this.searchEngineConfig = searchEngineConfig;
    return this;
  }

  /**
   * Required. The solutions of the engine.
   * @return value or {@code null} for none
   */
  public java.lang.String getSolutionType() {
    return solutionType;
  }

  /**
   * Required. The solutions of the engine.
   * @param solutionType solutionType or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1Engine setSolutionType(java.lang.String solutionType) {
    this.solutionType = solutionType;
    return this;
  }

  /**
   * Output only. Timestamp the Recommendation Engine was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Timestamp the Recommendation Engine was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1Engine setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1Engine set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1Engine) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1Engine clone() {
    return (GoogleCloudDiscoveryengineV1Engine) super.clone();
  }

}

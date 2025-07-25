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
 * Specification of tools that are used to serve the request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1betaStreamAssistRequestToolsSpec extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Specification of the image generation tool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1betaStreamAssistRequestToolsSpecImageGenerationSpec imageGenerationSpec;

  /**
   * Optional. Specification of the Vertex AI Search tool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1betaStreamAssistRequestToolsSpecVertexAiSearchSpec vertexAiSearchSpec;

  /**
   * Optional. Specification of the video generation tool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1betaStreamAssistRequestToolsSpecVideoGenerationSpec videoGenerationSpec;

  /**
   * Optional. Specification of the web grounding tool. If field is present, enables grounding with
   * web search. Works only if Assistant.web_grounding_type is WEB_GROUNDING_TYPE_GOOGLE_SEARCH or
   * WEB_GROUNDING_TYPE_ENTERPRISE_WEB_SEARCH.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1betaStreamAssistRequestToolsSpecWebGroundingSpec webGroundingSpec;

  /**
   * Optional. Specification of the image generation tool.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1betaStreamAssistRequestToolsSpecImageGenerationSpec getImageGenerationSpec() {
    return imageGenerationSpec;
  }

  /**
   * Optional. Specification of the image generation tool.
   * @param imageGenerationSpec imageGenerationSpec or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1betaStreamAssistRequestToolsSpec setImageGenerationSpec(GoogleCloudDiscoveryengineV1betaStreamAssistRequestToolsSpecImageGenerationSpec imageGenerationSpec) {
    this.imageGenerationSpec = imageGenerationSpec;
    return this;
  }

  /**
   * Optional. Specification of the Vertex AI Search tool.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1betaStreamAssistRequestToolsSpecVertexAiSearchSpec getVertexAiSearchSpec() {
    return vertexAiSearchSpec;
  }

  /**
   * Optional. Specification of the Vertex AI Search tool.
   * @param vertexAiSearchSpec vertexAiSearchSpec or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1betaStreamAssistRequestToolsSpec setVertexAiSearchSpec(GoogleCloudDiscoveryengineV1betaStreamAssistRequestToolsSpecVertexAiSearchSpec vertexAiSearchSpec) {
    this.vertexAiSearchSpec = vertexAiSearchSpec;
    return this;
  }

  /**
   * Optional. Specification of the video generation tool.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1betaStreamAssistRequestToolsSpecVideoGenerationSpec getVideoGenerationSpec() {
    return videoGenerationSpec;
  }

  /**
   * Optional. Specification of the video generation tool.
   * @param videoGenerationSpec videoGenerationSpec or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1betaStreamAssistRequestToolsSpec setVideoGenerationSpec(GoogleCloudDiscoveryengineV1betaStreamAssistRequestToolsSpecVideoGenerationSpec videoGenerationSpec) {
    this.videoGenerationSpec = videoGenerationSpec;
    return this;
  }

  /**
   * Optional. Specification of the web grounding tool. If field is present, enables grounding with
   * web search. Works only if Assistant.web_grounding_type is WEB_GROUNDING_TYPE_GOOGLE_SEARCH or
   * WEB_GROUNDING_TYPE_ENTERPRISE_WEB_SEARCH.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1betaStreamAssistRequestToolsSpecWebGroundingSpec getWebGroundingSpec() {
    return webGroundingSpec;
  }

  /**
   * Optional. Specification of the web grounding tool. If field is present, enables grounding with
   * web search. Works only if Assistant.web_grounding_type is WEB_GROUNDING_TYPE_GOOGLE_SEARCH or
   * WEB_GROUNDING_TYPE_ENTERPRISE_WEB_SEARCH.
   * @param webGroundingSpec webGroundingSpec or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1betaStreamAssistRequestToolsSpec setWebGroundingSpec(GoogleCloudDiscoveryengineV1betaStreamAssistRequestToolsSpecWebGroundingSpec webGroundingSpec) {
    this.webGroundingSpec = webGroundingSpec;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1betaStreamAssistRequestToolsSpec set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1betaStreamAssistRequestToolsSpec) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1betaStreamAssistRequestToolsSpec clone() {
    return (GoogleCloudDiscoveryengineV1betaStreamAssistRequestToolsSpec) super.clone();
  }

}

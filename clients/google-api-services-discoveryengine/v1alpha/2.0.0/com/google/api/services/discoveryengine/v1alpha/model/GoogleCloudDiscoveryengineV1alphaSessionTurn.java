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
 * Represents a turn, including a query from the user and a answer from service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1alphaSessionTurn extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The resource name of the answer to the user query. Only set if the answer generation
   * (/answer API call) happened in this turn.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String answer;

  /**
   * Output only. In ConversationalSearchService.GetSession API, if
   * GetSessionRequest.include_answer_details is set to true, this field will be populated when
   * getting answer query session.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1alphaAnswer detailedAnswer;

  /**
   * Optional. The user query. May not be set if this turn is merely regenerating an answer to a
   * different turn
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1alphaQuery query;

  /**
   * Optional. Represents metadata related to the query config, for example LLM model and version
   * used, model parameters (temperature, grounding parameters, etc.). The prefix "google." is
   * reserved for Google-developed functionality.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> queryConfig;

  /**
   * Optional. The resource name of the answer to the user query. Only set if the answer generation
   * (/answer API call) happened in this turn.
   * @return value or {@code null} for none
   */
  public java.lang.String getAnswer() {
    return answer;
  }

  /**
   * Optional. The resource name of the answer to the user query. Only set if the answer generation
   * (/answer API call) happened in this turn.
   * @param answer answer or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSessionTurn setAnswer(java.lang.String answer) {
    this.answer = answer;
    return this;
  }

  /**
   * Output only. In ConversationalSearchService.GetSession API, if
   * GetSessionRequest.include_answer_details is set to true, this field will be populated when
   * getting answer query session.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaAnswer getDetailedAnswer() {
    return detailedAnswer;
  }

  /**
   * Output only. In ConversationalSearchService.GetSession API, if
   * GetSessionRequest.include_answer_details is set to true, this field will be populated when
   * getting answer query session.
   * @param detailedAnswer detailedAnswer or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSessionTurn setDetailedAnswer(GoogleCloudDiscoveryengineV1alphaAnswer detailedAnswer) {
    this.detailedAnswer = detailedAnswer;
    return this;
  }

  /**
   * Optional. The user query. May not be set if this turn is merely regenerating an answer to a
   * different turn
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaQuery getQuery() {
    return query;
  }

  /**
   * Optional. The user query. May not be set if this turn is merely regenerating an answer to a
   * different turn
   * @param query query or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSessionTurn setQuery(GoogleCloudDiscoveryengineV1alphaQuery query) {
    this.query = query;
    return this;
  }

  /**
   * Optional. Represents metadata related to the query config, for example LLM model and version
   * used, model parameters (temperature, grounding parameters, etc.). The prefix "google." is
   * reserved for Google-developed functionality.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getQueryConfig() {
    return queryConfig;
  }

  /**
   * Optional. Represents metadata related to the query config, for example LLM model and version
   * used, model parameters (temperature, grounding parameters, etc.). The prefix "google." is
   * reserved for Google-developed functionality.
   * @param queryConfig queryConfig or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSessionTurn setQueryConfig(java.util.Map<String, java.lang.String> queryConfig) {
    this.queryConfig = queryConfig;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaSessionTurn set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1alphaSessionTurn) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaSessionTurn clone() {
    return (GoogleCloudDiscoveryengineV1alphaSessionTurn) super.clone();
  }

}

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

package com.google.api.services.retail.v2alpha.model;

/**
 * Response message for ConversationalSearchService.ConversationalSearch method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI Search for commerce API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2alphaConversationalSearchResponse extends com.google.api.client.json.GenericJson {

  /**
   * Conversation UUID. This field will be stored in client side storage to maintain the
   * conversation session with server and will be used for next search request's
   * ConversationalSearchRequest.conversation_id to restore conversation state in server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String conversationId;

  /**
   * This field specifies all related information that is needed on client side for UI rendering of
   * conversational filtering search.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRetailV2alphaConversationalSearchResponseConversationalFilteringResult conversationalFilteringResult;

  /**
   * The conversational answer-based text response generated by the Server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String conversationalTextResponse;

  /**
   * The conversational followup question generated for Intent refinement.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRetailV2alphaConversationalSearchResponseFollowupQuestion followupQuestion;

  /**
   * The proposed refined search queries. They can be used to fetch the relevant search results.
   * When using CONVERSATIONAL_FILTER_ONLY mode, the refined_query from search response will be
   * populated here.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRetailV2alphaConversationalSearchResponseRefinedSearch> refinedSearch;

  /**
   * Output only. The state of the response generation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The types Retail classifies the search query as. Supported values are: - "ADVERSARIAL" -
   * "CHITCHAT" - "JAILBREAK" - "ORDER_SUPPORT" - "SIMPLE_PRODUCT_SEARCH" - "INTENT_REFINEMENT" -
   * "PRODUCT_DETAILS" - "PRODUCT_COMPARISON" - "DEALS_AND_COUPONS" - "STORE_RELEVANT" -
   * "BLOCKLISTED" - "BEST_PRODUCT" - "RETAIL_SUPPORT" - "DISABLED" clang-format off clang-format on
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> userQueryTypes;

  /**
   * Conversation UUID. This field will be stored in client side storage to maintain the
   * conversation session with server and will be used for next search request's
   * ConversationalSearchRequest.conversation_id to restore conversation state in server.
   * @return value or {@code null} for none
   */
  public java.lang.String getConversationId() {
    return conversationId;
  }

  /**
   * Conversation UUID. This field will be stored in client side storage to maintain the
   * conversation session with server and will be used for next search request's
   * ConversationalSearchRequest.conversation_id to restore conversation state in server.
   * @param conversationId conversationId or {@code null} for none
   */
  public GoogleCloudRetailV2alphaConversationalSearchResponse setConversationId(java.lang.String conversationId) {
    this.conversationId = conversationId;
    return this;
  }

  /**
   * This field specifies all related information that is needed on client side for UI rendering of
   * conversational filtering search.
   * @return value or {@code null} for none
   */
  public GoogleCloudRetailV2alphaConversationalSearchResponseConversationalFilteringResult getConversationalFilteringResult() {
    return conversationalFilteringResult;
  }

  /**
   * This field specifies all related information that is needed on client side for UI rendering of
   * conversational filtering search.
   * @param conversationalFilteringResult conversationalFilteringResult or {@code null} for none
   */
  public GoogleCloudRetailV2alphaConversationalSearchResponse setConversationalFilteringResult(GoogleCloudRetailV2alphaConversationalSearchResponseConversationalFilteringResult conversationalFilteringResult) {
    this.conversationalFilteringResult = conversationalFilteringResult;
    return this;
  }

  /**
   * The conversational answer-based text response generated by the Server.
   * @return value or {@code null} for none
   */
  public java.lang.String getConversationalTextResponse() {
    return conversationalTextResponse;
  }

  /**
   * The conversational answer-based text response generated by the Server.
   * @param conversationalTextResponse conversationalTextResponse or {@code null} for none
   */
  public GoogleCloudRetailV2alphaConversationalSearchResponse setConversationalTextResponse(java.lang.String conversationalTextResponse) {
    this.conversationalTextResponse = conversationalTextResponse;
    return this;
  }

  /**
   * The conversational followup question generated for Intent refinement.
   * @return value or {@code null} for none
   */
  public GoogleCloudRetailV2alphaConversationalSearchResponseFollowupQuestion getFollowupQuestion() {
    return followupQuestion;
  }

  /**
   * The conversational followup question generated for Intent refinement.
   * @param followupQuestion followupQuestion or {@code null} for none
   */
  public GoogleCloudRetailV2alphaConversationalSearchResponse setFollowupQuestion(GoogleCloudRetailV2alphaConversationalSearchResponseFollowupQuestion followupQuestion) {
    this.followupQuestion = followupQuestion;
    return this;
  }

  /**
   * The proposed refined search queries. They can be used to fetch the relevant search results.
   * When using CONVERSATIONAL_FILTER_ONLY mode, the refined_query from search response will be
   * populated here.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRetailV2alphaConversationalSearchResponseRefinedSearch> getRefinedSearch() {
    return refinedSearch;
  }

  /**
   * The proposed refined search queries. They can be used to fetch the relevant search results.
   * When using CONVERSATIONAL_FILTER_ONLY mode, the refined_query from search response will be
   * populated here.
   * @param refinedSearch refinedSearch or {@code null} for none
   */
  public GoogleCloudRetailV2alphaConversationalSearchResponse setRefinedSearch(java.util.List<GoogleCloudRetailV2alphaConversationalSearchResponseRefinedSearch> refinedSearch) {
    this.refinedSearch = refinedSearch;
    return this;
  }

  /**
   * Output only. The state of the response generation.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The state of the response generation.
   * @param state state or {@code null} for none
   */
  public GoogleCloudRetailV2alphaConversationalSearchResponse setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * The types Retail classifies the search query as. Supported values are: - "ADVERSARIAL" -
   * "CHITCHAT" - "JAILBREAK" - "ORDER_SUPPORT" - "SIMPLE_PRODUCT_SEARCH" - "INTENT_REFINEMENT" -
   * "PRODUCT_DETAILS" - "PRODUCT_COMPARISON" - "DEALS_AND_COUPONS" - "STORE_RELEVANT" -
   * "BLOCKLISTED" - "BEST_PRODUCT" - "RETAIL_SUPPORT" - "DISABLED" clang-format off clang-format on
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getUserQueryTypes() {
    return userQueryTypes;
  }

  /**
   * The types Retail classifies the search query as. Supported values are: - "ADVERSARIAL" -
   * "CHITCHAT" - "JAILBREAK" - "ORDER_SUPPORT" - "SIMPLE_PRODUCT_SEARCH" - "INTENT_REFINEMENT" -
   * "PRODUCT_DETAILS" - "PRODUCT_COMPARISON" - "DEALS_AND_COUPONS" - "STORE_RELEVANT" -
   * "BLOCKLISTED" - "BEST_PRODUCT" - "RETAIL_SUPPORT" - "DISABLED" clang-format off clang-format on
   * @param userQueryTypes userQueryTypes or {@code null} for none
   */
  public GoogleCloudRetailV2alphaConversationalSearchResponse setUserQueryTypes(java.util.List<java.lang.String> userQueryTypes) {
    this.userQueryTypes = userQueryTypes;
    return this;
  }

  @Override
  public GoogleCloudRetailV2alphaConversationalSearchResponse set(String fieldName, Object value) {
    return (GoogleCloudRetailV2alphaConversationalSearchResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2alphaConversationalSearchResponse clone() {
    return (GoogleCloudRetailV2alphaConversationalSearchResponse) super.clone();
  }

}

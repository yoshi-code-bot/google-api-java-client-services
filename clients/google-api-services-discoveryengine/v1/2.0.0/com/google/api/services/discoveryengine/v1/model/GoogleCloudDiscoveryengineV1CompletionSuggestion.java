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
 * Autocomplete suggestions that are imported from Customer.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1CompletionSuggestion extends com.google.api.client.json.GenericJson {

  /**
   * Alternative matching phrases for this suggestion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> alternativePhrases;

  /**
   * Frequency of this suggestion. Will be used to rank suggestions when score is not available.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long frequency;

  /**
   * Global score of this suggestion. Control how this suggestion would be scored / ranked.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double globalScore;

  /**
   * If two suggestions have the same groupId, they will not be returned together. Instead the one
   * ranked higher will be returned. This can be used to deduplicate semantically identical
   * suggestions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String groupId;

  /**
   * The score of this suggestion within its group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double groupScore;

  /**
   * BCP-47 language code of this suggestion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String languageCode;

  /**
   * Required. The suggestion text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String suggestion;

  /**
   * Alternative matching phrases for this suggestion.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAlternativePhrases() {
    return alternativePhrases;
  }

  /**
   * Alternative matching phrases for this suggestion.
   * @param alternativePhrases alternativePhrases or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1CompletionSuggestion setAlternativePhrases(java.util.List<java.lang.String> alternativePhrases) {
    this.alternativePhrases = alternativePhrases;
    return this;
  }

  /**
   * Frequency of this suggestion. Will be used to rank suggestions when score is not available.
   * @return value or {@code null} for none
   */
  public java.lang.Long getFrequency() {
    return frequency;
  }

  /**
   * Frequency of this suggestion. Will be used to rank suggestions when score is not available.
   * @param frequency frequency or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1CompletionSuggestion setFrequency(java.lang.Long frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Global score of this suggestion. Control how this suggestion would be scored / ranked.
   * @return value or {@code null} for none
   */
  public java.lang.Double getGlobalScore() {
    return globalScore;
  }

  /**
   * Global score of this suggestion. Control how this suggestion would be scored / ranked.
   * @param globalScore globalScore or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1CompletionSuggestion setGlobalScore(java.lang.Double globalScore) {
    this.globalScore = globalScore;
    return this;
  }

  /**
   * If two suggestions have the same groupId, they will not be returned together. Instead the one
   * ranked higher will be returned. This can be used to deduplicate semantically identical
   * suggestions.
   * @return value or {@code null} for none
   */
  public java.lang.String getGroupId() {
    return groupId;
  }

  /**
   * If two suggestions have the same groupId, they will not be returned together. Instead the one
   * ranked higher will be returned. This can be used to deduplicate semantically identical
   * suggestions.
   * @param groupId groupId or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1CompletionSuggestion setGroupId(java.lang.String groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * The score of this suggestion within its group.
   * @return value or {@code null} for none
   */
  public java.lang.Double getGroupScore() {
    return groupScore;
  }

  /**
   * The score of this suggestion within its group.
   * @param groupScore groupScore or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1CompletionSuggestion setGroupScore(java.lang.Double groupScore) {
    this.groupScore = groupScore;
    return this;
  }

  /**
   * BCP-47 language code of this suggestion.
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguageCode() {
    return languageCode;
  }

  /**
   * BCP-47 language code of this suggestion.
   * @param languageCode languageCode or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1CompletionSuggestion setLanguageCode(java.lang.String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * Required. The suggestion text.
   * @return value or {@code null} for none
   */
  public java.lang.String getSuggestion() {
    return suggestion;
  }

  /**
   * Required. The suggestion text.
   * @param suggestion suggestion or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1CompletionSuggestion setSuggestion(java.lang.String suggestion) {
    this.suggestion = suggestion;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1CompletionSuggestion set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1CompletionSuggestion) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1CompletionSuggestion clone() {
    return (GoogleCloudDiscoveryengineV1CompletionSuggestion) super.clone();
  }

}

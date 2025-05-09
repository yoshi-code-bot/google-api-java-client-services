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
 * Configuration for a single generated question.
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
public final class GoogleCloudRetailV2alphaGenerativeQuestionConfig extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Whether the question is asked at serving time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allowedInConversation;

  /**
   * Required. Resource name of the catalog. Format:
   * projects/{project}/locations/{location}/catalogs/{catalog}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String catalog;

  /**
   * Output only. Values that can be used to answer the question.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> exampleValues;

  /**
   * Required. The facet to which the question is associated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String facet;

  /**
   * Optional. The question that will be used at serving time. Question can have a max length of 300
   * bytes. When not populated, generated_question should be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String finalQuestion;

  /**
   * Output only. The ratio of how often a question was asked.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float frequency;

  /**
   * Output only. The LLM generated question.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String generatedQuestion;

  /**
   * Optional. Whether the question is asked at serving time.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllowedInConversation() {
    return allowedInConversation;
  }

  /**
   * Optional. Whether the question is asked at serving time.
   * @param allowedInConversation allowedInConversation or {@code null} for none
   */
  public GoogleCloudRetailV2alphaGenerativeQuestionConfig setAllowedInConversation(java.lang.Boolean allowedInConversation) {
    this.allowedInConversation = allowedInConversation;
    return this;
  }

  /**
   * Required. Resource name of the catalog. Format:
   * projects/{project}/locations/{location}/catalogs/{catalog}
   * @return value or {@code null} for none
   */
  public java.lang.String getCatalog() {
    return catalog;
  }

  /**
   * Required. Resource name of the catalog. Format:
   * projects/{project}/locations/{location}/catalogs/{catalog}
   * @param catalog catalog or {@code null} for none
   */
  public GoogleCloudRetailV2alphaGenerativeQuestionConfig setCatalog(java.lang.String catalog) {
    this.catalog = catalog;
    return this;
  }

  /**
   * Output only. Values that can be used to answer the question.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getExampleValues() {
    return exampleValues;
  }

  /**
   * Output only. Values that can be used to answer the question.
   * @param exampleValues exampleValues or {@code null} for none
   */
  public GoogleCloudRetailV2alphaGenerativeQuestionConfig setExampleValues(java.util.List<java.lang.String> exampleValues) {
    this.exampleValues = exampleValues;
    return this;
  }

  /**
   * Required. The facet to which the question is associated.
   * @return value or {@code null} for none
   */
  public java.lang.String getFacet() {
    return facet;
  }

  /**
   * Required. The facet to which the question is associated.
   * @param facet facet or {@code null} for none
   */
  public GoogleCloudRetailV2alphaGenerativeQuestionConfig setFacet(java.lang.String facet) {
    this.facet = facet;
    return this;
  }

  /**
   * Optional. The question that will be used at serving time. Question can have a max length of 300
   * bytes. When not populated, generated_question should be used.
   * @return value or {@code null} for none
   */
  public java.lang.String getFinalQuestion() {
    return finalQuestion;
  }

  /**
   * Optional. The question that will be used at serving time. Question can have a max length of 300
   * bytes. When not populated, generated_question should be used.
   * @param finalQuestion finalQuestion or {@code null} for none
   */
  public GoogleCloudRetailV2alphaGenerativeQuestionConfig setFinalQuestion(java.lang.String finalQuestion) {
    this.finalQuestion = finalQuestion;
    return this;
  }

  /**
   * Output only. The ratio of how often a question was asked.
   * @return value or {@code null} for none
   */
  public java.lang.Float getFrequency() {
    return frequency;
  }

  /**
   * Output only. The ratio of how often a question was asked.
   * @param frequency frequency or {@code null} for none
   */
  public GoogleCloudRetailV2alphaGenerativeQuestionConfig setFrequency(java.lang.Float frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Output only. The LLM generated question.
   * @return value or {@code null} for none
   */
  public java.lang.String getGeneratedQuestion() {
    return generatedQuestion;
  }

  /**
   * Output only. The LLM generated question.
   * @param generatedQuestion generatedQuestion or {@code null} for none
   */
  public GoogleCloudRetailV2alphaGenerativeQuestionConfig setGeneratedQuestion(java.lang.String generatedQuestion) {
    this.generatedQuestion = generatedQuestion;
    return this;
  }

  @Override
  public GoogleCloudRetailV2alphaGenerativeQuestionConfig set(String fieldName, Object value) {
    return (GoogleCloudRetailV2alphaGenerativeQuestionConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2alphaGenerativeQuestionConfig clone() {
    return (GoogleCloudRetailV2alphaGenerativeQuestionConfig) super.clone();
  }

}

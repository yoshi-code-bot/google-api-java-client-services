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

package com.google.api.services.dialogflow.v2beta1.model;

/**
 * The sources of the answers.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1SearchKnowledgeAnswerAnswerSource extends com.google.api.client.json.GenericJson {

  /**
   * Metadata associated with the article.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> metadata;

  /**
   * The relevant snippet of the article.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String snippet;

  /**
   * The title of the article.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The URI of the article.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * Metadata associated with the article.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getMetadata() {
    return metadata;
  }

  /**
   * Metadata associated with the article.
   * @param metadata metadata or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1SearchKnowledgeAnswerAnswerSource setMetadata(java.util.Map<String, java.lang.Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * The relevant snippet of the article.
   * @return value or {@code null} for none
   */
  public java.lang.String getSnippet() {
    return snippet;
  }

  /**
   * The relevant snippet of the article.
   * @param snippet snippet or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1SearchKnowledgeAnswerAnswerSource setSnippet(java.lang.String snippet) {
    this.snippet = snippet;
    return this;
  }

  /**
   * The title of the article.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The title of the article.
   * @param title title or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1SearchKnowledgeAnswerAnswerSource setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * The URI of the article.
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * The URI of the article.
   * @param uri uri or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1SearchKnowledgeAnswerAnswerSource setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1SearchKnowledgeAnswerAnswerSource set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1SearchKnowledgeAnswerAnswerSource) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1SearchKnowledgeAnswerAnswerSource clone() {
    return (GoogleCloudDialogflowV2beta1SearchKnowledgeAnswerAnswerSource) super.clone();
  }

}

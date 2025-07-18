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

package com.google.api.services.dialogflow.v3.model;

/**
 * Search snippet details.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3DataStoreConnectionSignalsSearchSnippet extends com.google.api.client.json.GenericJson {

  /**
   * Title of the enclosing document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String documentTitle;

  /**
   * Uri for the document. Present if specified for the document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String documentUri;

  /**
   * Metadata associated with the document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> metadata;

  /**
   * Text included in the prompt.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String text;

  /**
   * Title of the enclosing document.
   * @return value or {@code null} for none
   */
  public java.lang.String getDocumentTitle() {
    return documentTitle;
  }

  /**
   * Title of the enclosing document.
   * @param documentTitle documentTitle or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3DataStoreConnectionSignalsSearchSnippet setDocumentTitle(java.lang.String documentTitle) {
    this.documentTitle = documentTitle;
    return this;
  }

  /**
   * Uri for the document. Present if specified for the document.
   * @return value or {@code null} for none
   */
  public java.lang.String getDocumentUri() {
    return documentUri;
  }

  /**
   * Uri for the document. Present if specified for the document.
   * @param documentUri documentUri or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3DataStoreConnectionSignalsSearchSnippet setDocumentUri(java.lang.String documentUri) {
    this.documentUri = documentUri;
    return this;
  }

  /**
   * Metadata associated with the document.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getMetadata() {
    return metadata;
  }

  /**
   * Metadata associated with the document.
   * @param metadata metadata or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3DataStoreConnectionSignalsSearchSnippet setMetadata(java.util.Map<String, java.lang.Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Text included in the prompt.
   * @return value or {@code null} for none
   */
  public java.lang.String getText() {
    return text;
  }

  /**
   * Text included in the prompt.
   * @param text text or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3DataStoreConnectionSignalsSearchSnippet setText(java.lang.String text) {
    this.text = text;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3DataStoreConnectionSignalsSearchSnippet set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3DataStoreConnectionSignalsSearchSnippet) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3DataStoreConnectionSignalsSearchSnippet clone() {
    return (GoogleCloudDialogflowCxV3DataStoreConnectionSignalsSearchSnippet) super.clone();
  }

}

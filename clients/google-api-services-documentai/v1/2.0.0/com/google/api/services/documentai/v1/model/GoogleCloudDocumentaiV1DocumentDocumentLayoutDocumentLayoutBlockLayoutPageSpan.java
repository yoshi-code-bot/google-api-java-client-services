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

package com.google.api.services.documentai.v1.model;

/**
 * Represents where the block starts and ends in the document.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Document AI API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDocumentaiV1DocumentDocumentLayoutDocumentLayoutBlockLayoutPageSpan extends com.google.api.client.json.GenericJson {

  /**
   * Page where block ends in the document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer pageEnd;

  /**
   * Page where block starts in the document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer pageStart;

  /**
   * Page where block ends in the document.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPageEnd() {
    return pageEnd;
  }

  /**
   * Page where block ends in the document.
   * @param pageEnd pageEnd or {@code null} for none
   */
  public GoogleCloudDocumentaiV1DocumentDocumentLayoutDocumentLayoutBlockLayoutPageSpan setPageEnd(java.lang.Integer pageEnd) {
    this.pageEnd = pageEnd;
    return this;
  }

  /**
   * Page where block starts in the document.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPageStart() {
    return pageStart;
  }

  /**
   * Page where block starts in the document.
   * @param pageStart pageStart or {@code null} for none
   */
  public GoogleCloudDocumentaiV1DocumentDocumentLayoutDocumentLayoutBlockLayoutPageSpan setPageStart(java.lang.Integer pageStart) {
    this.pageStart = pageStart;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1DocumentDocumentLayoutDocumentLayoutBlockLayoutPageSpan set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1DocumentDocumentLayoutDocumentLayoutBlockLayoutPageSpan) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1DocumentDocumentLayoutDocumentLayoutBlockLayoutPageSpan clone() {
    return (GoogleCloudDocumentaiV1DocumentDocumentLayoutDocumentLayoutBlockLayoutPageSpan) super.clone();
  }

}

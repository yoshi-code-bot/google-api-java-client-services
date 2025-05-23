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

package com.google.api.services.merchantapi.issueresolution_v1beta.model;

/**
 * Long text from external source.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Merchant API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AdditionalContent extends com.google.api.client.json.GenericJson {

  /**
   * Long text organized into paragraphs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> paragraphs;

  /**
   * Title of the additional content;
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Long text organized into paragraphs.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getParagraphs() {
    return paragraphs;
  }

  /**
   * Long text organized into paragraphs.
   * @param paragraphs paragraphs or {@code null} for none
   */
  public AdditionalContent setParagraphs(java.util.List<java.lang.String> paragraphs) {
    this.paragraphs = paragraphs;
    return this;
  }

  /**
   * Title of the additional content;
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Title of the additional content;
   * @param title title or {@code null} for none
   */
  public AdditionalContent setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public AdditionalContent set(String fieldName, Object value) {
    return (AdditionalContent) super.set(fieldName, value);
  }

  @Override
  public AdditionalContent clone() {
    return (AdditionalContent) super.clone();
  }

}

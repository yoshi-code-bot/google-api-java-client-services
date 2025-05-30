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
 * Inline destination for a Dialogflow operation that writes or exports objects (e.g. intents)
 * outside of Dialogflow.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3InlineDestination extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The uncompressed byte content for the objects. Only populated in responses.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String content;

  /**
   * Output only. The uncompressed byte content for the objects. Only populated in responses.
   * @see #decodeContent()
   * @return value or {@code null} for none
   */
  public java.lang.String getContent() {
    return content;
  }

  /**
   * Output only. The uncompressed byte content for the objects. Only populated in responses.
   * @see #getContent()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeContent() {
    return com.google.api.client.util.Base64.decodeBase64(content);
  }

  /**
   * Output only. The uncompressed byte content for the objects. Only populated in responses.
   * @see #encodeContent()
   * @param content content or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3InlineDestination setContent(java.lang.String content) {
    this.content = content;
    return this;
  }

  /**
   * Output only. The uncompressed byte content for the objects. Only populated in responses.
   * @see #setContent()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GoogleCloudDialogflowCxV3InlineDestination encodeContent(byte[] content) {
    this.content = com.google.api.client.util.Base64.encodeBase64URLSafeString(content);
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3InlineDestination set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3InlineDestination) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3InlineDestination clone() {
    return (GoogleCloudDialogflowCxV3InlineDestination) super.clone();
  }

}

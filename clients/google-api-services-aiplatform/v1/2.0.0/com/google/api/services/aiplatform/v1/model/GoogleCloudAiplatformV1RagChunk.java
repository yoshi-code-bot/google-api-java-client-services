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

package com.google.api.services.aiplatform.v1.model;

/**
 * A RagChunk includes the content of a chunk of a RagFile, and associated metadata.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1RagChunk extends com.google.api.client.json.GenericJson {

  /**
   * If populated, represents where the chunk starts and ends in the document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1RagChunkPageSpan pageSpan;

  /**
   * The content of the chunk.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String text;

  /**
   * If populated, represents where the chunk starts and ends in the document.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1RagChunkPageSpan getPageSpan() {
    return pageSpan;
  }

  /**
   * If populated, represents where the chunk starts and ends in the document.
   * @param pageSpan pageSpan or {@code null} for none
   */
  public GoogleCloudAiplatformV1RagChunk setPageSpan(GoogleCloudAiplatformV1RagChunkPageSpan pageSpan) {
    this.pageSpan = pageSpan;
    return this;
  }

  /**
   * The content of the chunk.
   * @return value or {@code null} for none
   */
  public java.lang.String getText() {
    return text;
  }

  /**
   * The content of the chunk.
   * @param text text or {@code null} for none
   */
  public GoogleCloudAiplatformV1RagChunk setText(java.lang.String text) {
    this.text = text;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1RagChunk set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1RagChunk) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1RagChunk clone() {
    return (GoogleCloudAiplatformV1RagChunk) super.clone();
  }

}

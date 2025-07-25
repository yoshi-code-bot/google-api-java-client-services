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

package com.google.api.services.firebaseml.v2beta.model;

/**
 * Metadata describes the input video content.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase ML API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1VideoMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The end offset of the video.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endOffset;

  /**
   * Optional. The frame rate of the video sent to the model. If not specified, the default value
   * will be 1.0. The fps range is (0.0, 24.0].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double fps;

  /**
   * Optional. The start offset of the video.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startOffset;

  /**
   * Optional. The end offset of the video.
   * @return value or {@code null} for none
   */
  public String getEndOffset() {
    return endOffset;
  }

  /**
   * Optional. The end offset of the video.
   * @param endOffset endOffset or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1VideoMetadata setEndOffset(String endOffset) {
    this.endOffset = endOffset;
    return this;
  }

  /**
   * Optional. The frame rate of the video sent to the model. If not specified, the default value
   * will be 1.0. The fps range is (0.0, 24.0].
   * @return value or {@code null} for none
   */
  public java.lang.Double getFps() {
    return fps;
  }

  /**
   * Optional. The frame rate of the video sent to the model. If not specified, the default value
   * will be 1.0. The fps range is (0.0, 24.0].
   * @param fps fps or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1VideoMetadata setFps(java.lang.Double fps) {
    this.fps = fps;
    return this;
  }

  /**
   * Optional. The start offset of the video.
   * @return value or {@code null} for none
   */
  public String getStartOffset() {
    return startOffset;
  }

  /**
   * Optional. The start offset of the video.
   * @param startOffset startOffset or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1VideoMetadata setStartOffset(String startOffset) {
    this.startOffset = startOffset;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1VideoMetadata set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1VideoMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1VideoMetadata clone() {
    return (GoogleCloudAiplatformV1beta1VideoMetadata) super.clone();
  }

}

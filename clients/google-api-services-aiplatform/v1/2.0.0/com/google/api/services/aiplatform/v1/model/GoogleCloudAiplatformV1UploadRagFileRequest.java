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
 * Request message for VertexRagDataService.UploadRagFile.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1UploadRagFileRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The RagFile to upload.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1RagFile ragFile;

  /**
   * Required. The config for the RagFiles to be uploaded into the RagCorpus.
   * VertexRagDataService.UploadRagFile.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1UploadRagFileConfig uploadRagFileConfig;

  /**
   * Required. The RagFile to upload.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1RagFile getRagFile() {
    return ragFile;
  }

  /**
   * Required. The RagFile to upload.
   * @param ragFile ragFile or {@code null} for none
   */
  public GoogleCloudAiplatformV1UploadRagFileRequest setRagFile(GoogleCloudAiplatformV1RagFile ragFile) {
    this.ragFile = ragFile;
    return this;
  }

  /**
   * Required. The config for the RagFiles to be uploaded into the RagCorpus.
   * VertexRagDataService.UploadRagFile.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1UploadRagFileConfig getUploadRagFileConfig() {
    return uploadRagFileConfig;
  }

  /**
   * Required. The config for the RagFiles to be uploaded into the RagCorpus.
   * VertexRagDataService.UploadRagFile.
   * @param uploadRagFileConfig uploadRagFileConfig or {@code null} for none
   */
  public GoogleCloudAiplatformV1UploadRagFileRequest setUploadRagFileConfig(GoogleCloudAiplatformV1UploadRagFileConfig uploadRagFileConfig) {
    this.uploadRagFileConfig = uploadRagFileConfig;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1UploadRagFileRequest set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1UploadRagFileRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1UploadRagFileRequest clone() {
    return (GoogleCloudAiplatformV1UploadRagFileRequest) super.clone();
  }

}

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

package com.google.api.services.discoveryengine.v1alpha.model;

/**
 * Response for the AssistantService.UploadSessionFile method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1alphaUploadSessionFileResponse extends com.google.api.client.json.GenericJson {

  /**
   * The ID of the uploaded file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fileId;

  /**
   * Media upload response metadata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ApiservingMediaResponseInfo mediaResponseInfo;

  /**
   * The ID of the uploaded file.
   * @return value or {@code null} for none
   */
  public java.lang.String getFileId() {
    return fileId;
  }

  /**
   * The ID of the uploaded file.
   * @param fileId fileId or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaUploadSessionFileResponse setFileId(java.lang.String fileId) {
    this.fileId = fileId;
    return this;
  }

  /**
   * Media upload response metadata.
   * @return value or {@code null} for none
   */
  public ApiservingMediaResponseInfo getMediaResponseInfo() {
    return mediaResponseInfo;
  }

  /**
   * Media upload response metadata.
   * @param mediaResponseInfo mediaResponseInfo or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaUploadSessionFileResponse setMediaResponseInfo(ApiservingMediaResponseInfo mediaResponseInfo) {
    this.mediaResponseInfo = mediaResponseInfo;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaUploadSessionFileResponse set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1alphaUploadSessionFileResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaUploadSessionFileResponse clone() {
    return (GoogleCloudDiscoveryengineV1alphaUploadSessionFileResponse) super.clone();
  }

}

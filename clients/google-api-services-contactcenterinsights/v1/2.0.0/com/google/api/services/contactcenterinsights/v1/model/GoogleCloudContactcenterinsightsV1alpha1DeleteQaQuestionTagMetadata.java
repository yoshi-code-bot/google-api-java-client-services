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

package com.google.api.services.contactcenterinsights.v1.model;

/**
 * The metadata for deleting a QaQuestionTag Resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Contact Center AI Insights API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudContactcenterinsightsV1alpha1DeleteQaQuestionTagMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The time the operation was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. The time the operation finished running.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * Output only. The original request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudContactcenterinsightsV1alpha1DeleteQaQuestionTagRequest request;

  /**
   * Output only. The time the operation was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time the operation was created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1alpha1DeleteQaQuestionTagMetadata setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. The time the operation finished running.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * Output only. The time the operation finished running.
   * @param endTime endTime or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1alpha1DeleteQaQuestionTagMetadata setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Output only. The original request.
   * @return value or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1alpha1DeleteQaQuestionTagRequest getRequest() {
    return request;
  }

  /**
   * Output only. The original request.
   * @param request request or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1alpha1DeleteQaQuestionTagMetadata setRequest(GoogleCloudContactcenterinsightsV1alpha1DeleteQaQuestionTagRequest request) {
    this.request = request;
    return this;
  }

  @Override
  public GoogleCloudContactcenterinsightsV1alpha1DeleteQaQuestionTagMetadata set(String fieldName, Object value) {
    return (GoogleCloudContactcenterinsightsV1alpha1DeleteQaQuestionTagMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudContactcenterinsightsV1alpha1DeleteQaQuestionTagMetadata clone() {
    return (GoogleCloudContactcenterinsightsV1alpha1DeleteQaQuestionTagMetadata) super.clone();
  }

}

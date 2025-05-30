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

package com.google.api.services.aiplatform.v1beta1.model;

/**
 * Dataset bucket used to create a histogram for the distribution given a population of values.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1DatasetDistributionDistributionBucket extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Number of values in the bucket.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long count;

  /**
   * Output only. Left bound of the bucket.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double left;

  /**
   * Output only. Right bound of the bucket.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double right;

  /**
   * Output only. Number of values in the bucket.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCount() {
    return count;
  }

  /**
   * Output only. Number of values in the bucket.
   * @param count count or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1DatasetDistributionDistributionBucket setCount(java.lang.Long count) {
    this.count = count;
    return this;
  }

  /**
   * Output only. Left bound of the bucket.
   * @return value or {@code null} for none
   */
  public java.lang.Double getLeft() {
    return left;
  }

  /**
   * Output only. Left bound of the bucket.
   * @param left left or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1DatasetDistributionDistributionBucket setLeft(java.lang.Double left) {
    this.left = left;
    return this;
  }

  /**
   * Output only. Right bound of the bucket.
   * @return value or {@code null} for none
   */
  public java.lang.Double getRight() {
    return right;
  }

  /**
   * Output only. Right bound of the bucket.
   * @param right right or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1DatasetDistributionDistributionBucket setRight(java.lang.Double right) {
    this.right = right;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1DatasetDistributionDistributionBucket set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1DatasetDistributionDistributionBucket) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1DatasetDistributionDistributionBucket clone() {
    return (GoogleCloudAiplatformV1beta1DatasetDistributionDistributionBucket) super.clone();
  }

}

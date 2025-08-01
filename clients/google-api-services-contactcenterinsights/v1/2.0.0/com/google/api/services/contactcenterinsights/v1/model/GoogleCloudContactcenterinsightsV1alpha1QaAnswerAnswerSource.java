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
 * A question may have multiple answers from varying sources, one of which becomes the "main" answer
 * above. AnswerSource represents each individual answer.
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
public final class GoogleCloudContactcenterinsightsV1alpha1QaAnswerAnswerSource extends com.google.api.client.json.GenericJson {

  /**
   * The answer value from this source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudContactcenterinsightsV1alpha1QaAnswerAnswerValue answerValue;

  /**
   * What created the answer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceType;

  /**
   * The answer value from this source.
   * @return value or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1alpha1QaAnswerAnswerValue getAnswerValue() {
    return answerValue;
  }

  /**
   * The answer value from this source.
   * @param answerValue answerValue or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1alpha1QaAnswerAnswerSource setAnswerValue(GoogleCloudContactcenterinsightsV1alpha1QaAnswerAnswerValue answerValue) {
    this.answerValue = answerValue;
    return this;
  }

  /**
   * What created the answer.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceType() {
    return sourceType;
  }

  /**
   * What created the answer.
   * @param sourceType sourceType or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1alpha1QaAnswerAnswerSource setSourceType(java.lang.String sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  @Override
  public GoogleCloudContactcenterinsightsV1alpha1QaAnswerAnswerSource set(String fieldName, Object value) {
    return (GoogleCloudContactcenterinsightsV1alpha1QaAnswerAnswerSource) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudContactcenterinsightsV1alpha1QaAnswerAnswerSource clone() {
    return (GoogleCloudContactcenterinsightsV1alpha1QaAnswerAnswerSource) super.clone();
  }

}

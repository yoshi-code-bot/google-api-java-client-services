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
 * Metadata about the tuning operation for the question. Will only be set if a scorecard containing
 * this question has been tuned.
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
public final class GoogleCloudContactcenterinsightsV1QaQuestionTuningMetadata extends com.google.api.client.json.GenericJson {

  /**
   * A list of any applicable data validation warnings about the question's feedback labels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> datasetValidationWarnings;

  /**
   * Total number of valid labels provided for the question at the time of tuining.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long totalValidLabelCount;

  /**
   * Error status of the tuning operation for the question. Will only be set if the tuning operation
   * failed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tuningError;

  /**
   * A list of any applicable data validation warnings about the question's feedback labels.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDatasetValidationWarnings() {
    return datasetValidationWarnings;
  }

  /**
   * A list of any applicable data validation warnings about the question's feedback labels.
   * @param datasetValidationWarnings datasetValidationWarnings or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1QaQuestionTuningMetadata setDatasetValidationWarnings(java.util.List<java.lang.String> datasetValidationWarnings) {
    this.datasetValidationWarnings = datasetValidationWarnings;
    return this;
  }

  /**
   * Total number of valid labels provided for the question at the time of tuining.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTotalValidLabelCount() {
    return totalValidLabelCount;
  }

  /**
   * Total number of valid labels provided for the question at the time of tuining.
   * @param totalValidLabelCount totalValidLabelCount or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1QaQuestionTuningMetadata setTotalValidLabelCount(java.lang.Long totalValidLabelCount) {
    this.totalValidLabelCount = totalValidLabelCount;
    return this;
  }

  /**
   * Error status of the tuning operation for the question. Will only be set if the tuning operation
   * failed.
   * @return value or {@code null} for none
   */
  public java.lang.String getTuningError() {
    return tuningError;
  }

  /**
   * Error status of the tuning operation for the question. Will only be set if the tuning operation
   * failed.
   * @param tuningError tuningError or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1QaQuestionTuningMetadata setTuningError(java.lang.String tuningError) {
    this.tuningError = tuningError;
    return this;
  }

  @Override
  public GoogleCloudContactcenterinsightsV1QaQuestionTuningMetadata set(String fieldName, Object value) {
    return (GoogleCloudContactcenterinsightsV1QaQuestionTuningMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudContactcenterinsightsV1QaQuestionTuningMetadata clone() {
    return (GoogleCloudContactcenterinsightsV1QaQuestionTuningMetadata) super.clone();
  }

}

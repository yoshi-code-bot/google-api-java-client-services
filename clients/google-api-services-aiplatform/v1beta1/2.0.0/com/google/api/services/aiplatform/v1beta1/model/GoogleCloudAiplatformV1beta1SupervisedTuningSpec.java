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
 * Tuning Spec for Supervised Tuning for first party models.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1SupervisedTuningSpec extends com.google.api.client.json.GenericJson {

  /**
   * Optional. If set to true, disable intermediate checkpoints for SFT and only the last checkpoint
   * will be exported. Otherwise, enable intermediate checkpoints for SFT. Default is false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean exportLastCheckpointOnly;

  /**
   * Optional. Hyperparameters for SFT.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1SupervisedHyperParameters hyperParameters;

  /**
   * Required. Training dataset used for tuning. The dataset can be specified as either a Cloud
   * Storage path to a JSONL file or as the resource name of a Vertex Multimodal Dataset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String trainingDatasetUri;

  /**
   * Tuning mode.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tuningMode;

  /**
   * Optional. Validation dataset used for tuning. The dataset can be specified as either a Cloud
   * Storage path to a JSONL file or as the resource name of a Vertex Multimodal Dataset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String validationDatasetUri;

  /**
   * Optional. If set to true, disable intermediate checkpoints for SFT and only the last checkpoint
   * will be exported. Otherwise, enable intermediate checkpoints for SFT. Default is false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getExportLastCheckpointOnly() {
    return exportLastCheckpointOnly;
  }

  /**
   * Optional. If set to true, disable intermediate checkpoints for SFT and only the last checkpoint
   * will be exported. Otherwise, enable intermediate checkpoints for SFT. Default is false.
   * @param exportLastCheckpointOnly exportLastCheckpointOnly or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1SupervisedTuningSpec setExportLastCheckpointOnly(java.lang.Boolean exportLastCheckpointOnly) {
    this.exportLastCheckpointOnly = exportLastCheckpointOnly;
    return this;
  }

  /**
   * Optional. Hyperparameters for SFT.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1SupervisedHyperParameters getHyperParameters() {
    return hyperParameters;
  }

  /**
   * Optional. Hyperparameters for SFT.
   * @param hyperParameters hyperParameters or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1SupervisedTuningSpec setHyperParameters(GoogleCloudAiplatformV1beta1SupervisedHyperParameters hyperParameters) {
    this.hyperParameters = hyperParameters;
    return this;
  }

  /**
   * Required. Training dataset used for tuning. The dataset can be specified as either a Cloud
   * Storage path to a JSONL file or as the resource name of a Vertex Multimodal Dataset.
   * @return value or {@code null} for none
   */
  public java.lang.String getTrainingDatasetUri() {
    return trainingDatasetUri;
  }

  /**
   * Required. Training dataset used for tuning. The dataset can be specified as either a Cloud
   * Storage path to a JSONL file or as the resource name of a Vertex Multimodal Dataset.
   * @param trainingDatasetUri trainingDatasetUri or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1SupervisedTuningSpec setTrainingDatasetUri(java.lang.String trainingDatasetUri) {
    this.trainingDatasetUri = trainingDatasetUri;
    return this;
  }

  /**
   * Tuning mode.
   * @return value or {@code null} for none
   */
  public java.lang.String getTuningMode() {
    return tuningMode;
  }

  /**
   * Tuning mode.
   * @param tuningMode tuningMode or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1SupervisedTuningSpec setTuningMode(java.lang.String tuningMode) {
    this.tuningMode = tuningMode;
    return this;
  }

  /**
   * Optional. Validation dataset used for tuning. The dataset can be specified as either a Cloud
   * Storage path to a JSONL file or as the resource name of a Vertex Multimodal Dataset.
   * @return value or {@code null} for none
   */
  public java.lang.String getValidationDatasetUri() {
    return validationDatasetUri;
  }

  /**
   * Optional. Validation dataset used for tuning. The dataset can be specified as either a Cloud
   * Storage path to a JSONL file or as the resource name of a Vertex Multimodal Dataset.
   * @param validationDatasetUri validationDatasetUri or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1SupervisedTuningSpec setValidationDatasetUri(java.lang.String validationDatasetUri) {
    this.validationDatasetUri = validationDatasetUri;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1SupervisedTuningSpec set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1SupervisedTuningSpec) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1SupervisedTuningSpec clone() {
    return (GoogleCloudAiplatformV1beta1SupervisedTuningSpec) super.clone();
  }

}

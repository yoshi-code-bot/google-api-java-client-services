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

package com.google.api.services.config.v1.model;

/**
 * Ephemeral metadata content describing the state of a preview operation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Infrastructure Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PreviewOperationMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Cloud Build instance UUID associated with this preview.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String build;

  /**
   * Output only. Location of preview logs in `gs://{bucket}/{object}` format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String logs;

  /**
   * Artifacts from preview.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PreviewArtifacts previewArtifacts;

  /**
   * The current step the preview operation is running.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String step;

  /**
   * Output only. Cloud Build instance UUID associated with this preview.
   * @return value or {@code null} for none
   */
  public java.lang.String getBuild() {
    return build;
  }

  /**
   * Output only. Cloud Build instance UUID associated with this preview.
   * @param build build or {@code null} for none
   */
  public PreviewOperationMetadata setBuild(java.lang.String build) {
    this.build = build;
    return this;
  }

  /**
   * Output only. Location of preview logs in `gs://{bucket}/{object}` format.
   * @return value or {@code null} for none
   */
  public java.lang.String getLogs() {
    return logs;
  }

  /**
   * Output only. Location of preview logs in `gs://{bucket}/{object}` format.
   * @param logs logs or {@code null} for none
   */
  public PreviewOperationMetadata setLogs(java.lang.String logs) {
    this.logs = logs;
    return this;
  }

  /**
   * Artifacts from preview.
   * @return value or {@code null} for none
   */
  public PreviewArtifacts getPreviewArtifacts() {
    return previewArtifacts;
  }

  /**
   * Artifacts from preview.
   * @param previewArtifacts previewArtifacts or {@code null} for none
   */
  public PreviewOperationMetadata setPreviewArtifacts(PreviewArtifacts previewArtifacts) {
    this.previewArtifacts = previewArtifacts;
    return this;
  }

  /**
   * The current step the preview operation is running.
   * @return value or {@code null} for none
   */
  public java.lang.String getStep() {
    return step;
  }

  /**
   * The current step the preview operation is running.
   * @param step step or {@code null} for none
   */
  public PreviewOperationMetadata setStep(java.lang.String step) {
    this.step = step;
    return this;
  }

  @Override
  public PreviewOperationMetadata set(String fieldName, Object value) {
    return (PreviewOperationMetadata) super.set(fieldName, value);
  }

  @Override
  public PreviewOperationMetadata clone() {
    return (PreviewOperationMetadata) super.clone();
  }

}

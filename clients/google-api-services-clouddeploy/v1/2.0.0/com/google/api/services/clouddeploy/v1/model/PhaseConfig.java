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

package com.google.api.services.clouddeploy.v1.model;

/**
 * PhaseConfig represents the configuration for a phase in the custom canary deployment.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Deploy API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PhaseConfig extends com.google.api.client.json.GenericJson {

  /**
   * Required. Percentage deployment for the phase.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer percentage;

  /**
   * Required. The ID to assign to the `Rollout` phase. This value must consist of lower-case
   * letters, numbers, and hyphens, start with a letter and end with a letter or a number, and have
   * a max length of 63 characters. In other words, it must match the following regex:
   * `^[a-z]([a-z0-9-]{0,61}[a-z0-9])?$`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String phaseId;

  /**
   * Optional. Configuration for the postdeploy job of this phase. If this is not configured, there
   * will be no postdeploy job for this phase.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Postdeploy postdeploy;

  /**
   * Optional. Configuration for the predeploy job of this phase. If this is not configured, there
   * will be no predeploy job for this phase.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Predeploy predeploy;

  /**
   * Optional. Skaffold profiles to use when rendering the manifest for this phase. These are in
   * addition to the profiles list specified in the `DeliveryPipeline` stage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> profiles;

  /**
   * Optional. Whether to run verify tests after the deployment via `skaffold verify`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean verify;

  /**
   * Required. Percentage deployment for the phase.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPercentage() {
    return percentage;
  }

  /**
   * Required. Percentage deployment for the phase.
   * @param percentage percentage or {@code null} for none
   */
  public PhaseConfig setPercentage(java.lang.Integer percentage) {
    this.percentage = percentage;
    return this;
  }

  /**
   * Required. The ID to assign to the `Rollout` phase. This value must consist of lower-case
   * letters, numbers, and hyphens, start with a letter and end with a letter or a number, and have
   * a max length of 63 characters. In other words, it must match the following regex:
   * `^[a-z]([a-z0-9-]{0,61}[a-z0-9])?$`.
   * @return value or {@code null} for none
   */
  public java.lang.String getPhaseId() {
    return phaseId;
  }

  /**
   * Required. The ID to assign to the `Rollout` phase. This value must consist of lower-case
   * letters, numbers, and hyphens, start with a letter and end with a letter or a number, and have
   * a max length of 63 characters. In other words, it must match the following regex:
   * `^[a-z]([a-z0-9-]{0,61}[a-z0-9])?$`.
   * @param phaseId phaseId or {@code null} for none
   */
  public PhaseConfig setPhaseId(java.lang.String phaseId) {
    this.phaseId = phaseId;
    return this;
  }

  /**
   * Optional. Configuration for the postdeploy job of this phase. If this is not configured, there
   * will be no postdeploy job for this phase.
   * @return value or {@code null} for none
   */
  public Postdeploy getPostdeploy() {
    return postdeploy;
  }

  /**
   * Optional. Configuration for the postdeploy job of this phase. If this is not configured, there
   * will be no postdeploy job for this phase.
   * @param postdeploy postdeploy or {@code null} for none
   */
  public PhaseConfig setPostdeploy(Postdeploy postdeploy) {
    this.postdeploy = postdeploy;
    return this;
  }

  /**
   * Optional. Configuration for the predeploy job of this phase. If this is not configured, there
   * will be no predeploy job for this phase.
   * @return value or {@code null} for none
   */
  public Predeploy getPredeploy() {
    return predeploy;
  }

  /**
   * Optional. Configuration for the predeploy job of this phase. If this is not configured, there
   * will be no predeploy job for this phase.
   * @param predeploy predeploy or {@code null} for none
   */
  public PhaseConfig setPredeploy(Predeploy predeploy) {
    this.predeploy = predeploy;
    return this;
  }

  /**
   * Optional. Skaffold profiles to use when rendering the manifest for this phase. These are in
   * addition to the profiles list specified in the `DeliveryPipeline` stage.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getProfiles() {
    return profiles;
  }

  /**
   * Optional. Skaffold profiles to use when rendering the manifest for this phase. These are in
   * addition to the profiles list specified in the `DeliveryPipeline` stage.
   * @param profiles profiles or {@code null} for none
   */
  public PhaseConfig setProfiles(java.util.List<java.lang.String> profiles) {
    this.profiles = profiles;
    return this;
  }

  /**
   * Optional. Whether to run verify tests after the deployment via `skaffold verify`.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getVerify() {
    return verify;
  }

  /**
   * Optional. Whether to run verify tests after the deployment via `skaffold verify`.
   * @param verify verify or {@code null} for none
   */
  public PhaseConfig setVerify(java.lang.Boolean verify) {
    this.verify = verify;
    return this;
  }

  @Override
  public PhaseConfig set(String fieldName, Object value) {
    return (PhaseConfig) super.set(fieldName, value);
  }

  @Override
  public PhaseConfig clone() {
    return (PhaseConfig) super.clone();
  }

}

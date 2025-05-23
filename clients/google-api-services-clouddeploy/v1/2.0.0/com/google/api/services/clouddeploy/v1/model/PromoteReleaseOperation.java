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
 * Contains the information of an automated promote-release operation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Deploy API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PromoteReleaseOperation extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The starting phase of the rollout created by this operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String phase;

  /**
   * Output only. The name of the rollout that initiates the `AutomationRun`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rollout;

  /**
   * Output only. The ID of the target that represents the promotion stage to which the release will
   * be promoted. The value of this field is the last segment of a target name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetId;

  /**
   * Output only. How long the operation will be paused.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String wait;

  /**
   * Output only. The starting phase of the rollout created by this operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getPhase() {
    return phase;
  }

  /**
   * Output only. The starting phase of the rollout created by this operation.
   * @param phase phase or {@code null} for none
   */
  public PromoteReleaseOperation setPhase(java.lang.String phase) {
    this.phase = phase;
    return this;
  }

  /**
   * Output only. The name of the rollout that initiates the `AutomationRun`.
   * @return value or {@code null} for none
   */
  public java.lang.String getRollout() {
    return rollout;
  }

  /**
   * Output only. The name of the rollout that initiates the `AutomationRun`.
   * @param rollout rollout or {@code null} for none
   */
  public PromoteReleaseOperation setRollout(java.lang.String rollout) {
    this.rollout = rollout;
    return this;
  }

  /**
   * Output only. The ID of the target that represents the promotion stage to which the release will
   * be promoted. The value of this field is the last segment of a target name.
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetId() {
    return targetId;
  }

  /**
   * Output only. The ID of the target that represents the promotion stage to which the release will
   * be promoted. The value of this field is the last segment of a target name.
   * @param targetId targetId or {@code null} for none
   */
  public PromoteReleaseOperation setTargetId(java.lang.String targetId) {
    this.targetId = targetId;
    return this;
  }

  /**
   * Output only. How long the operation will be paused.
   * @return value or {@code null} for none
   */
  public String getWait() {
    return wait;
  }

  /**
   * Output only. How long the operation will be paused.
   * @param wait wait or {@code null} for none
   */
  public PromoteReleaseOperation setWait(String wait) {
    this.wait = wait;
    return this;
  }

  @Override
  public PromoteReleaseOperation set(String fieldName, Object value) {
    return (PromoteReleaseOperation) super.set(fieldName, value);
  }

  @Override
  public PromoteReleaseOperation clone() {
    return (PromoteReleaseOperation) super.clone();
  }

}

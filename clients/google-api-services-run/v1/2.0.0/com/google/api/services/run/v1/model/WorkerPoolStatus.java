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

package com.google.api.services.run.v1.model;

/**
 * The current state of the WorkerPool. Output only.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WorkerPoolStatus extends com.google.api.client.json.GenericJson {

  /**
   * Conditions communicate information about ongoing/complete reconciliation processes that bring
   * the `spec` inline with the observed state of the world. * `Ready`: `True` when all underlying
   * resources are ready.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRunV1Condition> conditions;

  static {
    // hack to force ProGuard to consider GoogleCloudRunV1Condition used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudRunV1Condition.class);
  }

  /**
   * Holds the configured traffic distribution. These entries will always contain RevisionName
   * references. When ConfigurationName appears in the spec, this will hold the
   * LatestReadyRevisionName that we last observed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<InstanceSplit> instanceSplits;

  static {
    // hack to force ProGuard to consider InstanceSplit used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(InstanceSplit.class);
  }

  /**
   * Name of the last revision that was created from this WorkerPool's template. It might not be
   * ready yet, for that use LatestReadyRevisionName.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String latestCreatedRevisionName;

  /**
   * Name of the latest Revision from this WorkerPool's template that has had its `Ready` condition
   * become `True`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String latestReadyRevisionName;

  /**
   * Returns the generation last seen by the system. Clients polling for completed reconciliation
   * should poll until observedGeneration = metadata.generation and the Ready condition's status is
   * True or False.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer observedGeneration;

  /**
   * Conditions communicate information about ongoing/complete reconciliation processes that bring
   * the `spec` inline with the observed state of the world. * `Ready`: `True` when all underlying
   * resources are ready.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRunV1Condition> getConditions() {
    return conditions;
  }

  /**
   * Conditions communicate information about ongoing/complete reconciliation processes that bring
   * the `spec` inline with the observed state of the world. * `Ready`: `True` when all underlying
   * resources are ready.
   * @param conditions conditions or {@code null} for none
   */
  public WorkerPoolStatus setConditions(java.util.List<GoogleCloudRunV1Condition> conditions) {
    this.conditions = conditions;
    return this;
  }

  /**
   * Holds the configured traffic distribution. These entries will always contain RevisionName
   * references. When ConfigurationName appears in the spec, this will hold the
   * LatestReadyRevisionName that we last observed.
   * @return value or {@code null} for none
   */
  public java.util.List<InstanceSplit> getInstanceSplits() {
    return instanceSplits;
  }

  /**
   * Holds the configured traffic distribution. These entries will always contain RevisionName
   * references. When ConfigurationName appears in the spec, this will hold the
   * LatestReadyRevisionName that we last observed.
   * @param instanceSplits instanceSplits or {@code null} for none
   */
  public WorkerPoolStatus setInstanceSplits(java.util.List<InstanceSplit> instanceSplits) {
    this.instanceSplits = instanceSplits;
    return this;
  }

  /**
   * Name of the last revision that was created from this WorkerPool's template. It might not be
   * ready yet, for that use LatestReadyRevisionName.
   * @return value or {@code null} for none
   */
  public java.lang.String getLatestCreatedRevisionName() {
    return latestCreatedRevisionName;
  }

  /**
   * Name of the last revision that was created from this WorkerPool's template. It might not be
   * ready yet, for that use LatestReadyRevisionName.
   * @param latestCreatedRevisionName latestCreatedRevisionName or {@code null} for none
   */
  public WorkerPoolStatus setLatestCreatedRevisionName(java.lang.String latestCreatedRevisionName) {
    this.latestCreatedRevisionName = latestCreatedRevisionName;
    return this;
  }

  /**
   * Name of the latest Revision from this WorkerPool's template that has had its `Ready` condition
   * become `True`.
   * @return value or {@code null} for none
   */
  public java.lang.String getLatestReadyRevisionName() {
    return latestReadyRevisionName;
  }

  /**
   * Name of the latest Revision from this WorkerPool's template that has had its `Ready` condition
   * become `True`.
   * @param latestReadyRevisionName latestReadyRevisionName or {@code null} for none
   */
  public WorkerPoolStatus setLatestReadyRevisionName(java.lang.String latestReadyRevisionName) {
    this.latestReadyRevisionName = latestReadyRevisionName;
    return this;
  }

  /**
   * Returns the generation last seen by the system. Clients polling for completed reconciliation
   * should poll until observedGeneration = metadata.generation and the Ready condition's status is
   * True or False.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getObservedGeneration() {
    return observedGeneration;
  }

  /**
   * Returns the generation last seen by the system. Clients polling for completed reconciliation
   * should poll until observedGeneration = metadata.generation and the Ready condition's status is
   * True or False.
   * @param observedGeneration observedGeneration or {@code null} for none
   */
  public WorkerPoolStatus setObservedGeneration(java.lang.Integer observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

  @Override
  public WorkerPoolStatus set(String fieldName, Object value) {
    return (WorkerPoolStatus) super.set(fieldName, value);
  }

  @Override
  public WorkerPoolStatus clone() {
    return (WorkerPoolStatus) super.clone();
  }

}

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

package com.google.api.services.dataform.v1beta1.model;

/**
 * Represents a single action in a workflow invocation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataform API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WorkflowInvocationAction extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The workflow action's bigquery action details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BigQueryAction bigqueryAction;

  /**
   * Output only. The action's identifier if the project had been compiled without any overrides
   * configured. Unique within the compilation result.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Target canonicalTarget;

  /**
   * Output only. The workflow action's data preparation action details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DataPreparationAction dataPreparationAction;

  /**
   * Output only. If and only if action's state is FAILED a failure reason is set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String failureReason;

  /**
   * Output only. All the metadata information that is used internally to serve the resource. For
   * example: timestamps, flags, status fields, etc. The format of this field is a JSON string.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String internalMetadata;

  /**
   * Output only. This action's timing details. `start_time` will be set if the action is in
   * [RUNNING, SUCCEEDED, CANCELLED, FAILED] state. `end_time` will be set if the action is in
   * [SUCCEEDED, CANCELLED, FAILED] state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Interval invocationTiming;

  /**
   * Output only. The workflow action's notebook action details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NotebookAction notebookAction;

  /**
   * Output only. This action's current state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. This action's identifier. Unique within the workflow invocation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Target target;

  /**
   * Output only. The workflow action's bigquery action details.
   * @return value or {@code null} for none
   */
  public BigQueryAction getBigqueryAction() {
    return bigqueryAction;
  }

  /**
   * Output only. The workflow action's bigquery action details.
   * @param bigqueryAction bigqueryAction or {@code null} for none
   */
  public WorkflowInvocationAction setBigqueryAction(BigQueryAction bigqueryAction) {
    this.bigqueryAction = bigqueryAction;
    return this;
  }

  /**
   * Output only. The action's identifier if the project had been compiled without any overrides
   * configured. Unique within the compilation result.
   * @return value or {@code null} for none
   */
  public Target getCanonicalTarget() {
    return canonicalTarget;
  }

  /**
   * Output only. The action's identifier if the project had been compiled without any overrides
   * configured. Unique within the compilation result.
   * @param canonicalTarget canonicalTarget or {@code null} for none
   */
  public WorkflowInvocationAction setCanonicalTarget(Target canonicalTarget) {
    this.canonicalTarget = canonicalTarget;
    return this;
  }

  /**
   * Output only. The workflow action's data preparation action details.
   * @return value or {@code null} for none
   */
  public DataPreparationAction getDataPreparationAction() {
    return dataPreparationAction;
  }

  /**
   * Output only. The workflow action's data preparation action details.
   * @param dataPreparationAction dataPreparationAction or {@code null} for none
   */
  public WorkflowInvocationAction setDataPreparationAction(DataPreparationAction dataPreparationAction) {
    this.dataPreparationAction = dataPreparationAction;
    return this;
  }

  /**
   * Output only. If and only if action's state is FAILED a failure reason is set.
   * @return value or {@code null} for none
   */
  public java.lang.String getFailureReason() {
    return failureReason;
  }

  /**
   * Output only. If and only if action's state is FAILED a failure reason is set.
   * @param failureReason failureReason or {@code null} for none
   */
  public WorkflowInvocationAction setFailureReason(java.lang.String failureReason) {
    this.failureReason = failureReason;
    return this;
  }

  /**
   * Output only. All the metadata information that is used internally to serve the resource. For
   * example: timestamps, flags, status fields, etc. The format of this field is a JSON string.
   * @return value or {@code null} for none
   */
  public java.lang.String getInternalMetadata() {
    return internalMetadata;
  }

  /**
   * Output only. All the metadata information that is used internally to serve the resource. For
   * example: timestamps, flags, status fields, etc. The format of this field is a JSON string.
   * @param internalMetadata internalMetadata or {@code null} for none
   */
  public WorkflowInvocationAction setInternalMetadata(java.lang.String internalMetadata) {
    this.internalMetadata = internalMetadata;
    return this;
  }

  /**
   * Output only. This action's timing details. `start_time` will be set if the action is in
   * [RUNNING, SUCCEEDED, CANCELLED, FAILED] state. `end_time` will be set if the action is in
   * [SUCCEEDED, CANCELLED, FAILED] state.
   * @return value or {@code null} for none
   */
  public Interval getInvocationTiming() {
    return invocationTiming;
  }

  /**
   * Output only. This action's timing details. `start_time` will be set if the action is in
   * [RUNNING, SUCCEEDED, CANCELLED, FAILED] state. `end_time` will be set if the action is in
   * [SUCCEEDED, CANCELLED, FAILED] state.
   * @param invocationTiming invocationTiming or {@code null} for none
   */
  public WorkflowInvocationAction setInvocationTiming(Interval invocationTiming) {
    this.invocationTiming = invocationTiming;
    return this;
  }

  /**
   * Output only. The workflow action's notebook action details.
   * @return value or {@code null} for none
   */
  public NotebookAction getNotebookAction() {
    return notebookAction;
  }

  /**
   * Output only. The workflow action's notebook action details.
   * @param notebookAction notebookAction or {@code null} for none
   */
  public WorkflowInvocationAction setNotebookAction(NotebookAction notebookAction) {
    this.notebookAction = notebookAction;
    return this;
  }

  /**
   * Output only. This action's current state.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. This action's current state.
   * @param state state or {@code null} for none
   */
  public WorkflowInvocationAction setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. This action's identifier. Unique within the workflow invocation.
   * @return value or {@code null} for none
   */
  public Target getTarget() {
    return target;
  }

  /**
   * Output only. This action's identifier. Unique within the workflow invocation.
   * @param target target or {@code null} for none
   */
  public WorkflowInvocationAction setTarget(Target target) {
    this.target = target;
    return this;
  }

  @Override
  public WorkflowInvocationAction set(String fieldName, Object value) {
    return (WorkflowInvocationAction) super.set(fieldName, value);
  }

  @Override
  public WorkflowInvocationAction clone() {
    return (WorkflowInvocationAction) super.clone();
  }

}

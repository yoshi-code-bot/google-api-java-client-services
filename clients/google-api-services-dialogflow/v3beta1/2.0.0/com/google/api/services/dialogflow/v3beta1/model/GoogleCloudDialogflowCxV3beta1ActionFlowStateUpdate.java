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

package com.google.api.services.dialogflow.v3beta1.model;

/**
 * Stores metadata of the state update action, such as a state machine execution in flows.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3beta1ActionFlowStateUpdate extends com.google.api.client.json.GenericJson {

  /**
   * The destination of the transition. Format: `projects//locations//agents//flows//pages/` or
   * `projects//locations//agents//playbooks/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String destination;

  /**
   * The type of the event that triggered the state update.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String eventType;

  /**
   * The function call to execute.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3beta1ActionFlowStateUpdateFunctionCall functionCall;

  /**
   * The updated page and flow state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3beta1ActionFlowStateUpdatePageState pageState;

  /**
   * The updated parameters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> updatedParameters;

  /**
   * The destination of the transition. Format: `projects//locations//agents//flows//pages/` or
   * `projects//locations//agents//playbooks/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getDestination() {
    return destination;
  }

  /**
   * The destination of the transition. Format: `projects//locations//agents//flows//pages/` or
   * `projects//locations//agents//playbooks/`.
   * @param destination destination or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ActionFlowStateUpdate setDestination(java.lang.String destination) {
    this.destination = destination;
    return this;
  }

  /**
   * The type of the event that triggered the state update.
   * @return value or {@code null} for none
   */
  public java.lang.String getEventType() {
    return eventType;
  }

  /**
   * The type of the event that triggered the state update.
   * @param eventType eventType or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ActionFlowStateUpdate setEventType(java.lang.String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * The function call to execute.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ActionFlowStateUpdateFunctionCall getFunctionCall() {
    return functionCall;
  }

  /**
   * The function call to execute.
   * @param functionCall functionCall or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ActionFlowStateUpdate setFunctionCall(GoogleCloudDialogflowCxV3beta1ActionFlowStateUpdateFunctionCall functionCall) {
    this.functionCall = functionCall;
    return this;
  }

  /**
   * The updated page and flow state.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ActionFlowStateUpdatePageState getPageState() {
    return pageState;
  }

  /**
   * The updated page and flow state.
   * @param pageState pageState or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ActionFlowStateUpdate setPageState(GoogleCloudDialogflowCxV3beta1ActionFlowStateUpdatePageState pageState) {
    this.pageState = pageState;
    return this;
  }

  /**
   * The updated parameters.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getUpdatedParameters() {
    return updatedParameters;
  }

  /**
   * The updated parameters.
   * @param updatedParameters updatedParameters or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ActionFlowStateUpdate setUpdatedParameters(java.util.Map<String, java.lang.Object> updatedParameters) {
    this.updatedParameters = updatedParameters;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1ActionFlowStateUpdate set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3beta1ActionFlowStateUpdate) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1ActionFlowStateUpdate clone() {
    return (GoogleCloudDialogflowCxV3beta1ActionFlowStateUpdate) super.clone();
  }

}

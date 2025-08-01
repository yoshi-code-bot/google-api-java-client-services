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

package com.google.api.services.dialogflow.v3.model;

/**
 * Metadata for a ConversationModels.DeployConversationModel operation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2DeployConversationModelOperationMetadata extends com.google.api.client.json.GenericJson {

  /**
   * The resource name of the conversation model. Format: `projects//conversationModels/`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String conversationModel;

  /**
   * Timestamp when request to deploy conversation model was submitted. The time is measured on
   * server side.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * The time when the operation finished.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String doneTime;

  /**
   * The resource name of the conversation model. Format: `projects//conversationModels/`
   * @return value or {@code null} for none
   */
  public java.lang.String getConversationModel() {
    return conversationModel;
  }

  /**
   * The resource name of the conversation model. Format: `projects//conversationModels/`
   * @param conversationModel conversationModel or {@code null} for none
   */
  public GoogleCloudDialogflowV2DeployConversationModelOperationMetadata setConversationModel(java.lang.String conversationModel) {
    this.conversationModel = conversationModel;
    return this;
  }

  /**
   * Timestamp when request to deploy conversation model was submitted. The time is measured on
   * server side.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Timestamp when request to deploy conversation model was submitted. The time is measured on
   * server side.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudDialogflowV2DeployConversationModelOperationMetadata setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The time when the operation finished.
   * @return value or {@code null} for none
   */
  public String getDoneTime() {
    return doneTime;
  }

  /**
   * The time when the operation finished.
   * @param doneTime doneTime or {@code null} for none
   */
  public GoogleCloudDialogflowV2DeployConversationModelOperationMetadata setDoneTime(String doneTime) {
    this.doneTime = doneTime;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2DeployConversationModelOperationMetadata set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2DeployConversationModelOperationMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2DeployConversationModelOperationMetadata clone() {
    return (GoogleCloudDialogflowV2DeployConversationModelOperationMetadata) super.clone();
  }

}

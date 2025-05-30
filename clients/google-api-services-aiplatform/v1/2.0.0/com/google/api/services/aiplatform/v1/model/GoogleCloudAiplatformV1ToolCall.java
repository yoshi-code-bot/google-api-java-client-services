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

package com.google.api.services.aiplatform.v1.model;

/**
 * Spec for tool call.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1ToolCall extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Spec for tool input
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String toolInput;

  /**
   * Required. Spec for tool name
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String toolName;

  /**
   * Optional. Spec for tool input
   * @return value or {@code null} for none
   */
  public java.lang.String getToolInput() {
    return toolInput;
  }

  /**
   * Optional. Spec for tool input
   * @param toolInput toolInput or {@code null} for none
   */
  public GoogleCloudAiplatformV1ToolCall setToolInput(java.lang.String toolInput) {
    this.toolInput = toolInput;
    return this;
  }

  /**
   * Required. Spec for tool name
   * @return value or {@code null} for none
   */
  public java.lang.String getToolName() {
    return toolName;
  }

  /**
   * Required. Spec for tool name
   * @param toolName toolName or {@code null} for none
   */
  public GoogleCloudAiplatformV1ToolCall setToolName(java.lang.String toolName) {
    this.toolName = toolName;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1ToolCall set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1ToolCall) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1ToolCall clone() {
    return (GoogleCloudAiplatformV1ToolCall) super.clone();
  }

}

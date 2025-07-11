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

package com.google.api.services.integrations.v1.model;

/**
 * Request message for GenerateAgentFlow.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Application Integration API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudIntegrationsV1alphaGenerateAgentFlowRequest extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The creator id;
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creator;

  /**
   * Optional. The description of the AgentFlow to be generated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Optional. The display name of the AgentFlow to be generated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Required. The intent, described in natural language, for the AgentFlow to generate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String intent;

  /**
   * Optional. The creator id;
   * @return value or {@code null} for none
   */
  public java.lang.String getCreator() {
    return creator;
  }

  /**
   * Optional. The creator id;
   * @param creator creator or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaGenerateAgentFlowRequest setCreator(java.lang.String creator) {
    this.creator = creator;
    return this;
  }

  /**
   * Optional. The description of the AgentFlow to be generated.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. The description of the AgentFlow to be generated.
   * @param description description or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaGenerateAgentFlowRequest setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional. The display name of the AgentFlow to be generated.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Optional. The display name of the AgentFlow to be generated.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaGenerateAgentFlowRequest setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Required. The intent, described in natural language, for the AgentFlow to generate.
   * @return value or {@code null} for none
   */
  public java.lang.String getIntent() {
    return intent;
  }

  /**
   * Required. The intent, described in natural language, for the AgentFlow to generate.
   * @param intent intent or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaGenerateAgentFlowRequest setIntent(java.lang.String intent) {
    this.intent = intent;
    return this;
  }

  @Override
  public GoogleCloudIntegrationsV1alphaGenerateAgentFlowRequest set(String fieldName, Object value) {
    return (GoogleCloudIntegrationsV1alphaGenerateAgentFlowRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudIntegrationsV1alphaGenerateAgentFlowRequest clone() {
    return (GoogleCloudIntegrationsV1alphaGenerateAgentFlowRequest) super.clone();
  }

}

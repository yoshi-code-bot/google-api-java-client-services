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
 * AgentFlow configurations.
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
public final class GoogleCloudIntegrationsV1alphaAgentFlow extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The timestamp when the agent flow was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. The user who created the agent flow.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creator;

  /**
   * Optional. Description of the agent flow.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Optional. Display name of the agent flow.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Required. The flow configuration, represented as a string.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String flowConfig;

  /**
   * Required. Resource name of the agent flow.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. Name of the NoCodeAgent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String noCodeAgent;

  /**
   * Output only. The timestamp when the agent flow was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. The timestamp when the agent flow was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The timestamp when the agent flow was created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaAgentFlow setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. The user who created the agent flow.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreator() {
    return creator;
  }

  /**
   * Output only. The user who created the agent flow.
   * @param creator creator or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaAgentFlow setCreator(java.lang.String creator) {
    this.creator = creator;
    return this;
  }

  /**
   * Optional. Description of the agent flow.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. Description of the agent flow.
   * @param description description or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaAgentFlow setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional. Display name of the agent flow.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Optional. Display name of the agent flow.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaAgentFlow setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Required. The flow configuration, represented as a string.
   * @return value or {@code null} for none
   */
  public java.lang.String getFlowConfig() {
    return flowConfig;
  }

  /**
   * Required. The flow configuration, represented as a string.
   * @param flowConfig flowConfig or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaAgentFlow setFlowConfig(java.lang.String flowConfig) {
    this.flowConfig = flowConfig;
    return this;
  }

  /**
   * Required. Resource name of the agent flow.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. Resource name of the agent flow.
   * @param name name or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaAgentFlow setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. Name of the NoCodeAgent.
   * @return value or {@code null} for none
   */
  public java.lang.String getNoCodeAgent() {
    return noCodeAgent;
  }

  /**
   * Optional. Name of the NoCodeAgent.
   * @param noCodeAgent noCodeAgent or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaAgentFlow setNoCodeAgent(java.lang.String noCodeAgent) {
    this.noCodeAgent = noCodeAgent;
    return this;
  }

  /**
   * Output only. The timestamp when the agent flow was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The timestamp when the agent flow was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaAgentFlow setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GoogleCloudIntegrationsV1alphaAgentFlow set(String fieldName, Object value) {
    return (GoogleCloudIntegrationsV1alphaAgentFlow) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudIntegrationsV1alphaAgentFlow clone() {
    return (GoogleCloudIntegrationsV1alphaAgentFlow) super.clone();
  }

}

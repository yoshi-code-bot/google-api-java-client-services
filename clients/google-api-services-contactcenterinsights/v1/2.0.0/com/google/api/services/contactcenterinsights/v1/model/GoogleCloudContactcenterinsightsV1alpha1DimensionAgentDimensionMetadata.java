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

package com.google.api.services.contactcenterinsights.v1.model;

/**
 * Metadata about the agent dimension.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Contact Center AI Insights API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudContactcenterinsightsV1alpha1DimensionAgentDimensionMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The agent's name
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String agentDisplayName;

  /**
   * Optional. A user-specified string representing the agent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String agentId;

  /**
   * Optional. A user-specified string representing the agent's team.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String agentTeam;

  /**
   * Optional. The agent's name
   * @return value or {@code null} for none
   */
  public java.lang.String getAgentDisplayName() {
    return agentDisplayName;
  }

  /**
   * Optional. The agent's name
   * @param agentDisplayName agentDisplayName or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1alpha1DimensionAgentDimensionMetadata setAgentDisplayName(java.lang.String agentDisplayName) {
    this.agentDisplayName = agentDisplayName;
    return this;
  }

  /**
   * Optional. A user-specified string representing the agent.
   * @return value or {@code null} for none
   */
  public java.lang.String getAgentId() {
    return agentId;
  }

  /**
   * Optional. A user-specified string representing the agent.
   * @param agentId agentId or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1alpha1DimensionAgentDimensionMetadata setAgentId(java.lang.String agentId) {
    this.agentId = agentId;
    return this;
  }

  /**
   * Optional. A user-specified string representing the agent's team.
   * @return value or {@code null} for none
   */
  public java.lang.String getAgentTeam() {
    return agentTeam;
  }

  /**
   * Optional. A user-specified string representing the agent's team.
   * @param agentTeam agentTeam or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1alpha1DimensionAgentDimensionMetadata setAgentTeam(java.lang.String agentTeam) {
    this.agentTeam = agentTeam;
    return this;
  }

  @Override
  public GoogleCloudContactcenterinsightsV1alpha1DimensionAgentDimensionMetadata set(String fieldName, Object value) {
    return (GoogleCloudContactcenterinsightsV1alpha1DimensionAgentDimensionMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudContactcenterinsightsV1alpha1DimensionAgentDimensionMetadata clone() {
    return (GoogleCloudContactcenterinsightsV1alpha1DimensionAgentDimensionMetadata) super.clone();
  }

}

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

package com.google.api.services.discoveryengine.v1.model;

/**
 * Specification to boost suggestions based on the condtion of the suggestion.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1AdvancedCompleteQueryRequestBoostSpec extends com.google.api.client.json.GenericJson {

  /**
   * Condition boost specifications. If a suggestion matches multiple conditions in the
   * specifications, boost values from these specifications are all applied and combined in a non-
   * linear way. Maximum number of specifications is 20. Note: Currently only support language
   * condition boost.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDiscoveryengineV1AdvancedCompleteQueryRequestBoostSpecConditionBoostSpec> conditionBoostSpecs;

  /**
   * Condition boost specifications. If a suggestion matches multiple conditions in the
   * specifications, boost values from these specifications are all applied and combined in a non-
   * linear way. Maximum number of specifications is 20. Note: Currently only support language
   * condition boost.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDiscoveryengineV1AdvancedCompleteQueryRequestBoostSpecConditionBoostSpec> getConditionBoostSpecs() {
    return conditionBoostSpecs;
  }

  /**
   * Condition boost specifications. If a suggestion matches multiple conditions in the
   * specifications, boost values from these specifications are all applied and combined in a non-
   * linear way. Maximum number of specifications is 20. Note: Currently only support language
   * condition boost.
   * @param conditionBoostSpecs conditionBoostSpecs or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1AdvancedCompleteQueryRequestBoostSpec setConditionBoostSpecs(java.util.List<GoogleCloudDiscoveryengineV1AdvancedCompleteQueryRequestBoostSpecConditionBoostSpec> conditionBoostSpecs) {
    this.conditionBoostSpecs = conditionBoostSpecs;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1AdvancedCompleteQueryRequestBoostSpec set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1AdvancedCompleteQueryRequestBoostSpec) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1AdvancedCompleteQueryRequestBoostSpec clone() {
    return (GoogleCloudDiscoveryengineV1AdvancedCompleteQueryRequestBoostSpec) super.clone();
  }

}

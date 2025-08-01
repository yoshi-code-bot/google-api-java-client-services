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
 * Boost specification to boost certain documents. A copy of
 * google.cloud.discoveryengine.v1main.BoostSpec, field documentation is available at
 * https://cloud.google.com/generative-ai-app-builder/docs/reference/rest/v1alpha/BoostSpec
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3BoostSpec extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Condition boost specifications. If a document matches multiple conditions in the
   * specifications, boost scores from these specifications are all applied and combined in a non-
   * linear way. Maximum number of specifications is 20.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowCxV3BoostSpecConditionBoostSpec> conditionBoostSpecs;

  /**
   * Optional. Condition boost specifications. If a document matches multiple conditions in the
   * specifications, boost scores from these specifications are all applied and combined in a non-
   * linear way. Maximum number of specifications is 20.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowCxV3BoostSpecConditionBoostSpec> getConditionBoostSpecs() {
    return conditionBoostSpecs;
  }

  /**
   * Optional. Condition boost specifications. If a document matches multiple conditions in the
   * specifications, boost scores from these specifications are all applied and combined in a non-
   * linear way. Maximum number of specifications is 20.
   * @param conditionBoostSpecs conditionBoostSpecs or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3BoostSpec setConditionBoostSpecs(java.util.List<GoogleCloudDialogflowCxV3BoostSpecConditionBoostSpec> conditionBoostSpecs) {
    this.conditionBoostSpecs = conditionBoostSpecs;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3BoostSpec set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3BoostSpec) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3BoostSpec clone() {
    return (GoogleCloudDialogflowCxV3BoostSpec) super.clone();
  }

}

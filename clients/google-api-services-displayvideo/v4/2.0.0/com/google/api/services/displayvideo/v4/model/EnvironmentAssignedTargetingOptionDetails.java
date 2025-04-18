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

package com.google.api.services.displayvideo.v4.model;

/**
 * Assigned environment targeting option details. This will be populated in the details field of an
 * AssignedTargetingOption when targeting_type is `TARGETING_TYPE_ENVIRONMENT`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Display & Video 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EnvironmentAssignedTargetingOptionDetails extends com.google.api.client.json.GenericJson {

  /**
   * Required. The serving environment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String environment;

  /**
   * Required. The serving environment.
   * @return value or {@code null} for none
   */
  public java.lang.String getEnvironment() {
    return environment;
  }

  /**
   * Required. The serving environment.
   * @param environment environment or {@code null} for none
   */
  public EnvironmentAssignedTargetingOptionDetails setEnvironment(java.lang.String environment) {
    this.environment = environment;
    return this;
  }

  @Override
  public EnvironmentAssignedTargetingOptionDetails set(String fieldName, Object value) {
    return (EnvironmentAssignedTargetingOptionDetails) super.set(fieldName, value);
  }

  @Override
  public EnvironmentAssignedTargetingOptionDetails clone() {
    return (EnvironmentAssignedTargetingOptionDetails) super.clone();
  }

}

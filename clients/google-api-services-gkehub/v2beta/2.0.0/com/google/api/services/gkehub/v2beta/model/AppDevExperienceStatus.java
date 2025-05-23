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

package com.google.api.services.gkehub.v2beta.model;

/**
 * Status specifies state for the subcomponent.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppDevExperienceStatus extends com.google.api.client.json.GenericJson {

  /**
   * Code specifies AppDevExperienceFeature's subcomponent ready state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String code;

  /**
   * Description is populated if Code is Failed, explaining why it has failed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Code specifies AppDevExperienceFeature's subcomponent ready state.
   * @return value or {@code null} for none
   */
  public java.lang.String getCode() {
    return code;
  }

  /**
   * Code specifies AppDevExperienceFeature's subcomponent ready state.
   * @param code code or {@code null} for none
   */
  public AppDevExperienceStatus setCode(java.lang.String code) {
    this.code = code;
    return this;
  }

  /**
   * Description is populated if Code is Failed, explaining why it has failed.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Description is populated if Code is Failed, explaining why it has failed.
   * @param description description or {@code null} for none
   */
  public AppDevExperienceStatus setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  @Override
  public AppDevExperienceStatus set(String fieldName, Object value) {
    return (AppDevExperienceStatus) super.set(fieldName, value);
  }

  @Override
  public AppDevExperienceStatus clone() {
    return (AppDevExperienceStatus) super.clone();
  }

}

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

package com.google.api.services.gkeonprem.v1.model;

/**
 * ValidationCheckResult defines the details about the validation check.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE On-Prem API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ValidationCheckResult extends com.google.api.client.json.GenericJson {

  /**
   * The category of the validation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String category;

  /**
   * The description of the validation check.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Detailed failure information, which might be unformatted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String details;

  /**
   * A human-readable message of the check failure.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reason;

  /**
   * The validation check state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The category of the validation.
   * @return value or {@code null} for none
   */
  public java.lang.String getCategory() {
    return category;
  }

  /**
   * The category of the validation.
   * @param category category or {@code null} for none
   */
  public ValidationCheckResult setCategory(java.lang.String category) {
    this.category = category;
    return this;
  }

  /**
   * The description of the validation check.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * The description of the validation check.
   * @param description description or {@code null} for none
   */
  public ValidationCheckResult setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Detailed failure information, which might be unformatted.
   * @return value or {@code null} for none
   */
  public java.lang.String getDetails() {
    return details;
  }

  /**
   * Detailed failure information, which might be unformatted.
   * @param details details or {@code null} for none
   */
  public ValidationCheckResult setDetails(java.lang.String details) {
    this.details = details;
    return this;
  }

  /**
   * A human-readable message of the check failure.
   * @return value or {@code null} for none
   */
  public java.lang.String getReason() {
    return reason;
  }

  /**
   * A human-readable message of the check failure.
   * @param reason reason or {@code null} for none
   */
  public ValidationCheckResult setReason(java.lang.String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * The validation check state.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The validation check state.
   * @param state state or {@code null} for none
   */
  public ValidationCheckResult setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public ValidationCheckResult set(String fieldName, Object value) {
    return (ValidationCheckResult) super.set(fieldName, value);
  }

  @Override
  public ValidationCheckResult clone() {
    return (ValidationCheckResult) super.clone();
  }

}

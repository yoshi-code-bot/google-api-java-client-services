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

package com.google.api.services.recaptchaenterprise.v1.model;

/**
 * An identifier associated with a user.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the reCAPTCHA Enterprise API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRecaptchaenterpriseV1UserId extends com.google.api.client.json.GenericJson {

  /**
   * Optional. An email address.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String email;

  /**
   * Optional. A phone number. Should use the E.164 format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String phoneNumber;

  /**
   * Optional. A unique username, if different from all the other identifiers and `account_id` that
   * are provided. Can be a unique login handle or display name for a user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String username;

  /**
   * Optional. An email address.
   * @return value or {@code null} for none
   */
  public java.lang.String getEmail() {
    return email;
  }

  /**
   * Optional. An email address.
   * @param email email or {@code null} for none
   */
  public GoogleCloudRecaptchaenterpriseV1UserId setEmail(java.lang.String email) {
    this.email = email;
    return this;
  }

  /**
   * Optional. A phone number. Should use the E.164 format.
   * @return value or {@code null} for none
   */
  public java.lang.String getPhoneNumber() {
    return phoneNumber;
  }

  /**
   * Optional. A phone number. Should use the E.164 format.
   * @param phoneNumber phoneNumber or {@code null} for none
   */
  public GoogleCloudRecaptchaenterpriseV1UserId setPhoneNumber(java.lang.String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Optional. A unique username, if different from all the other identifiers and `account_id` that
   * are provided. Can be a unique login handle or display name for a user.
   * @return value or {@code null} for none
   */
  public java.lang.String getUsername() {
    return username;
  }

  /**
   * Optional. A unique username, if different from all the other identifiers and `account_id` that
   * are provided. Can be a unique login handle or display name for a user.
   * @param username username or {@code null} for none
   */
  public GoogleCloudRecaptchaenterpriseV1UserId setUsername(java.lang.String username) {
    this.username = username;
    return this;
  }

  @Override
  public GoogleCloudRecaptchaenterpriseV1UserId set(String fieldName, Object value) {
    return (GoogleCloudRecaptchaenterpriseV1UserId) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRecaptchaenterpriseV1UserId clone() {
    return (GoogleCloudRecaptchaenterpriseV1UserId) super.clone();
  }

}

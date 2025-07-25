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

package com.google.api.services.identitytoolkit.v1.model;

/**
 * Request message for ResetPassword.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Identity Toolkit API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudIdentitytoolkitV1ResetPasswordRequest extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The email of the account to be modified. Specify this and the old password in order
   * to change an account's password without using an out-of-band code.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String email;

  /**
   * The new password to be set for this account. Specifying this field will result in a change to
   * the account and consume the out-of-band code if one was specified and it was of type
   * PASSWORD_RESET.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String newPassword;

  /**
   * The current password of the account to be modified. Specify this and email to change an
   * account's password without using an out-of-band code.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String oldPassword;

  /**
   * An out-of-band (OOB) code generated by GetOobCode request. Specify only this parameter (or only
   * this parameter and a tenant ID) to get the out-of-band code's type in the response without
   * mutating the account's state. Only a PASSWORD_RESET out-of-band code can be consumed via this
   * method.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String oobCode;

  /**
   * Optional. The tenant ID of the Identity Platform tenant the account belongs to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tenantId;

  /**
   * Optional. The email of the account to be modified. Specify this and the old password in order
   * to change an account's password without using an out-of-band code.
   * @return value or {@code null} for none
   */
  public java.lang.String getEmail() {
    return email;
  }

  /**
   * Optional. The email of the account to be modified. Specify this and the old password in order
   * to change an account's password without using an out-of-band code.
   * @param email email or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1ResetPasswordRequest setEmail(java.lang.String email) {
    this.email = email;
    return this;
  }

  /**
   * The new password to be set for this account. Specifying this field will result in a change to
   * the account and consume the out-of-band code if one was specified and it was of type
   * PASSWORD_RESET.
   * @return value or {@code null} for none
   */
  public java.lang.String getNewPassword() {
    return newPassword;
  }

  /**
   * The new password to be set for this account. Specifying this field will result in a change to
   * the account and consume the out-of-band code if one was specified and it was of type
   * PASSWORD_RESET.
   * @param newPassword newPassword or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1ResetPasswordRequest setNewPassword(java.lang.String newPassword) {
    this.newPassword = newPassword;
    return this;
  }

  /**
   * The current password of the account to be modified. Specify this and email to change an
   * account's password without using an out-of-band code.
   * @return value or {@code null} for none
   */
  public java.lang.String getOldPassword() {
    return oldPassword;
  }

  /**
   * The current password of the account to be modified. Specify this and email to change an
   * account's password without using an out-of-band code.
   * @param oldPassword oldPassword or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1ResetPasswordRequest setOldPassword(java.lang.String oldPassword) {
    this.oldPassword = oldPassword;
    return this;
  }

  /**
   * An out-of-band (OOB) code generated by GetOobCode request. Specify only this parameter (or only
   * this parameter and a tenant ID) to get the out-of-band code's type in the response without
   * mutating the account's state. Only a PASSWORD_RESET out-of-band code can be consumed via this
   * method.
   * @return value or {@code null} for none
   */
  public java.lang.String getOobCode() {
    return oobCode;
  }

  /**
   * An out-of-band (OOB) code generated by GetOobCode request. Specify only this parameter (or only
   * this parameter and a tenant ID) to get the out-of-band code's type in the response without
   * mutating the account's state. Only a PASSWORD_RESET out-of-band code can be consumed via this
   * method.
   * @param oobCode oobCode or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1ResetPasswordRequest setOobCode(java.lang.String oobCode) {
    this.oobCode = oobCode;
    return this;
  }

  /**
   * Optional. The tenant ID of the Identity Platform tenant the account belongs to.
   * @return value or {@code null} for none
   */
  public java.lang.String getTenantId() {
    return tenantId;
  }

  /**
   * Optional. The tenant ID of the Identity Platform tenant the account belongs to.
   * @param tenantId tenantId or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1ResetPasswordRequest setTenantId(java.lang.String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  @Override
  public GoogleCloudIdentitytoolkitV1ResetPasswordRequest set(String fieldName, Object value) {
    return (GoogleCloudIdentitytoolkitV1ResetPasswordRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudIdentitytoolkitV1ResetPasswordRequest clone() {
    return (GoogleCloudIdentitytoolkitV1ResetPasswordRequest) super.clone();
  }

}

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

package com.google.api.services.merchantapi.accounts_v1beta.model;

/**
 * Model definition for InventoryVerification.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Merchant API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InventoryVerification extends com.google.api.client.json.GenericJson {

  /**
   * Required. The name of the contact for the inventory verification process.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contact;

  /**
   * Required. The email address of the contact for the inventory verification process.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contactEmail;

  /**
   * Output only. The state of the contact verification.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contactState;

  /**
   * Output only. The state of the inventory verification process.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Required. The name of the contact for the inventory verification process.
   * @return value or {@code null} for none
   */
  public java.lang.String getContact() {
    return contact;
  }

  /**
   * Required. The name of the contact for the inventory verification process.
   * @param contact contact or {@code null} for none
   */
  public InventoryVerification setContact(java.lang.String contact) {
    this.contact = contact;
    return this;
  }

  /**
   * Required. The email address of the contact for the inventory verification process.
   * @return value or {@code null} for none
   */
  public java.lang.String getContactEmail() {
    return contactEmail;
  }

  /**
   * Required. The email address of the contact for the inventory verification process.
   * @param contactEmail contactEmail or {@code null} for none
   */
  public InventoryVerification setContactEmail(java.lang.String contactEmail) {
    this.contactEmail = contactEmail;
    return this;
  }

  /**
   * Output only. The state of the contact verification.
   * @return value or {@code null} for none
   */
  public java.lang.String getContactState() {
    return contactState;
  }

  /**
   * Output only. The state of the contact verification.
   * @param contactState contactState or {@code null} for none
   */
  public InventoryVerification setContactState(java.lang.String contactState) {
    this.contactState = contactState;
    return this;
  }

  /**
   * Output only. The state of the inventory verification process.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The state of the inventory verification process.
   * @param state state or {@code null} for none
   */
  public InventoryVerification setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public InventoryVerification set(String fieldName, Object value) {
    return (InventoryVerification) super.set(fieldName, value);
  }

  @Override
  public InventoryVerification clone() {
    return (InventoryVerification) super.clone();
  }

}

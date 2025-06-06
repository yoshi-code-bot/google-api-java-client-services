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

package com.google.api.services.contactcenteraiplatform.v1alpha1.model;

/**
 * Message storing SAML params to enable Google as IDP.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Contact Center AI Platform API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SAMLParams extends com.google.api.client.json.GenericJson {

  /**
   * Additional contexts used for authentication.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> authenticationContexts;

  /**
   * SAML certificate
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String certificate;

  /**
   * IdP field that maps to the user’s email address
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String emailMapping;

  /**
   * Entity id URL
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String entityId;

  /**
   * Single sign-on URL
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ssoUri;

  /**
   * Email address of the first admin users.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userEmail;

  /**
   * Additional contexts used for authentication.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAuthenticationContexts() {
    return authenticationContexts;
  }

  /**
   * Additional contexts used for authentication.
   * @param authenticationContexts authenticationContexts or {@code null} for none
   */
  public SAMLParams setAuthenticationContexts(java.util.List<java.lang.String> authenticationContexts) {
    this.authenticationContexts = authenticationContexts;
    return this;
  }

  /**
   * SAML certificate
   * @return value or {@code null} for none
   */
  public java.lang.String getCertificate() {
    return certificate;
  }

  /**
   * SAML certificate
   * @param certificate certificate or {@code null} for none
   */
  public SAMLParams setCertificate(java.lang.String certificate) {
    this.certificate = certificate;
    return this;
  }

  /**
   * IdP field that maps to the user’s email address
   * @return value or {@code null} for none
   */
  public java.lang.String getEmailMapping() {
    return emailMapping;
  }

  /**
   * IdP field that maps to the user’s email address
   * @param emailMapping emailMapping or {@code null} for none
   */
  public SAMLParams setEmailMapping(java.lang.String emailMapping) {
    this.emailMapping = emailMapping;
    return this;
  }

  /**
   * Entity id URL
   * @return value or {@code null} for none
   */
  public java.lang.String getEntityId() {
    return entityId;
  }

  /**
   * Entity id URL
   * @param entityId entityId or {@code null} for none
   */
  public SAMLParams setEntityId(java.lang.String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * Single sign-on URL
   * @return value or {@code null} for none
   */
  public java.lang.String getSsoUri() {
    return ssoUri;
  }

  /**
   * Single sign-on URL
   * @param ssoUri ssoUri or {@code null} for none
   */
  public SAMLParams setSsoUri(java.lang.String ssoUri) {
    this.ssoUri = ssoUri;
    return this;
  }

  /**
   * Email address of the first admin users.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserEmail() {
    return userEmail;
  }

  /**
   * Email address of the first admin users.
   * @param userEmail userEmail or {@code null} for none
   */
  public SAMLParams setUserEmail(java.lang.String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

  @Override
  public SAMLParams set(String fieldName, Object value) {
    return (SAMLParams) super.set(fieldName, value);
  }

  @Override
  public SAMLParams clone() {
    return (SAMLParams) super.clone();
  }

}

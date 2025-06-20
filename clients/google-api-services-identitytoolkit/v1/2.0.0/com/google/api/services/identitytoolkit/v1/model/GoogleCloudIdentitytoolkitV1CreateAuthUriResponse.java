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
 * Response message for CreateAuthUri.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Identity Toolkit API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudIdentitytoolkitV1CreateAuthUriResponse extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> allProviders;

  /**
   * The authorization URI for the requested provider. Present only when a provider ID is set in the
   * request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String authUri;

  /**
   * Whether a CAPTCHA is needed because there have been too many failed login attempts by the user.
   * Present only when a registered email identifier is set in the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean captchaRequired;

  /**
   * Whether the user has previously signed in with the provider ID in the request. Present only
   * when a registered email identifier is set in the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean forExistingProvider;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The provider ID from the request, if provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String providerId;

  /**
   * Whether the email identifier represents an existing account. Present only when an email
   * identifier is set in the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean registered;

  /**
   * The session ID from the request, or a random string generated by CreateAuthUri if absent. It is
   * used to prevent session fixation attacks.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sessionId;

  /**
   * The list of sign-in methods that the user has previously used. Each element is one of
   * `password`, `emailLink`, or the provider ID of an IdP. Present only when a registered email
   * identifier is set in the request. If [email enumeration
   * protection](https://cloud.google.com/identity-platform/docs/admin/email-enumeration-protection)
   * is enabled, this method returns an empty list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> signinMethods;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAllProviders() {
    return allProviders;
  }

  /**
   * @param allProviders allProviders or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1CreateAuthUriResponse setAllProviders(java.util.List<java.lang.String> allProviders) {
    this.allProviders = allProviders;
    return this;
  }

  /**
   * The authorization URI for the requested provider. Present only when a provider ID is set in the
   * request.
   * @return value or {@code null} for none
   */
  public java.lang.String getAuthUri() {
    return authUri;
  }

  /**
   * The authorization URI for the requested provider. Present only when a provider ID is set in the
   * request.
   * @param authUri authUri or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1CreateAuthUriResponse setAuthUri(java.lang.String authUri) {
    this.authUri = authUri;
    return this;
  }

  /**
   * Whether a CAPTCHA is needed because there have been too many failed login attempts by the user.
   * Present only when a registered email identifier is set in the request.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCaptchaRequired() {
    return captchaRequired;
  }

  /**
   * Whether a CAPTCHA is needed because there have been too many failed login attempts by the user.
   * Present only when a registered email identifier is set in the request.
   * @param captchaRequired captchaRequired or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1CreateAuthUriResponse setCaptchaRequired(java.lang.Boolean captchaRequired) {
    this.captchaRequired = captchaRequired;
    return this;
  }

  /**
   * Whether the user has previously signed in with the provider ID in the request. Present only
   * when a registered email identifier is set in the request.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getForExistingProvider() {
    return forExistingProvider;
  }

  /**
   * Whether the user has previously signed in with the provider ID in the request. Present only
   * when a registered email identifier is set in the request.
   * @param forExistingProvider forExistingProvider or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1CreateAuthUriResponse setForExistingProvider(java.lang.Boolean forExistingProvider) {
    this.forExistingProvider = forExistingProvider;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * @param kind kind or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1CreateAuthUriResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The provider ID from the request, if provided.
   * @return value or {@code null} for none
   */
  public java.lang.String getProviderId() {
    return providerId;
  }

  /**
   * The provider ID from the request, if provided.
   * @param providerId providerId or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1CreateAuthUriResponse setProviderId(java.lang.String providerId) {
    this.providerId = providerId;
    return this;
  }

  /**
   * Whether the email identifier represents an existing account. Present only when an email
   * identifier is set in the request.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRegistered() {
    return registered;
  }

  /**
   * Whether the email identifier represents an existing account. Present only when an email
   * identifier is set in the request.
   * @param registered registered or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1CreateAuthUriResponse setRegistered(java.lang.Boolean registered) {
    this.registered = registered;
    return this;
  }

  /**
   * The session ID from the request, or a random string generated by CreateAuthUri if absent. It is
   * used to prevent session fixation attacks.
   * @return value or {@code null} for none
   */
  public java.lang.String getSessionId() {
    return sessionId;
  }

  /**
   * The session ID from the request, or a random string generated by CreateAuthUri if absent. It is
   * used to prevent session fixation attacks.
   * @param sessionId sessionId or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1CreateAuthUriResponse setSessionId(java.lang.String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  /**
   * The list of sign-in methods that the user has previously used. Each element is one of
   * `password`, `emailLink`, or the provider ID of an IdP. Present only when a registered email
   * identifier is set in the request. If [email enumeration
   * protection](https://cloud.google.com/identity-platform/docs/admin/email-enumeration-protection)
   * is enabled, this method returns an empty list.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSigninMethods() {
    return signinMethods;
  }

  /**
   * The list of sign-in methods that the user has previously used. Each element is one of
   * `password`, `emailLink`, or the provider ID of an IdP. Present only when a registered email
   * identifier is set in the request. If [email enumeration
   * protection](https://cloud.google.com/identity-platform/docs/admin/email-enumeration-protection)
   * is enabled, this method returns an empty list.
   * @param signinMethods signinMethods or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1CreateAuthUriResponse setSigninMethods(java.util.List<java.lang.String> signinMethods) {
    this.signinMethods = signinMethods;
    return this;
  }

  @Override
  public GoogleCloudIdentitytoolkitV1CreateAuthUriResponse set(String fieldName, Object value) {
    return (GoogleCloudIdentitytoolkitV1CreateAuthUriResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudIdentitytoolkitV1CreateAuthUriResponse clone() {
    return (GoogleCloudIdentitytoolkitV1CreateAuthUriResponse) super.clone();
  }

}

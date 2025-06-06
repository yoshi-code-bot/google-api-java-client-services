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

package com.google.api.services.firebaseml.v2beta.model;

/**
 * Auth configuration to run the extension.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase ML API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1AuthConfig extends com.google.api.client.json.GenericJson {

  /**
   * Config for API key auth.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1AuthConfigApiKeyConfig apiKeyConfig;

  /**
   * Type of auth scheme.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String authType;

  /**
   * Config for Google Service Account auth.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1AuthConfigGoogleServiceAccountConfig googleServiceAccountConfig;

  /**
   * Config for HTTP Basic auth.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1AuthConfigHttpBasicAuthConfig httpBasicAuthConfig;

  /**
   * Config for user oauth.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1AuthConfigOauthConfig oauthConfig;

  /**
   * Config for user OIDC auth.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1AuthConfigOidcConfig oidcConfig;

  /**
   * Config for API key auth.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1AuthConfigApiKeyConfig getApiKeyConfig() {
    return apiKeyConfig;
  }

  /**
   * Config for API key auth.
   * @param apiKeyConfig apiKeyConfig or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1AuthConfig setApiKeyConfig(GoogleCloudAiplatformV1beta1AuthConfigApiKeyConfig apiKeyConfig) {
    this.apiKeyConfig = apiKeyConfig;
    return this;
  }

  /**
   * Type of auth scheme.
   * @return value or {@code null} for none
   */
  public java.lang.String getAuthType() {
    return authType;
  }

  /**
   * Type of auth scheme.
   * @param authType authType or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1AuthConfig setAuthType(java.lang.String authType) {
    this.authType = authType;
    return this;
  }

  /**
   * Config for Google Service Account auth.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1AuthConfigGoogleServiceAccountConfig getGoogleServiceAccountConfig() {
    return googleServiceAccountConfig;
  }

  /**
   * Config for Google Service Account auth.
   * @param googleServiceAccountConfig googleServiceAccountConfig or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1AuthConfig setGoogleServiceAccountConfig(GoogleCloudAiplatformV1beta1AuthConfigGoogleServiceAccountConfig googleServiceAccountConfig) {
    this.googleServiceAccountConfig = googleServiceAccountConfig;
    return this;
  }

  /**
   * Config for HTTP Basic auth.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1AuthConfigHttpBasicAuthConfig getHttpBasicAuthConfig() {
    return httpBasicAuthConfig;
  }

  /**
   * Config for HTTP Basic auth.
   * @param httpBasicAuthConfig httpBasicAuthConfig or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1AuthConfig setHttpBasicAuthConfig(GoogleCloudAiplatformV1beta1AuthConfigHttpBasicAuthConfig httpBasicAuthConfig) {
    this.httpBasicAuthConfig = httpBasicAuthConfig;
    return this;
  }

  /**
   * Config for user oauth.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1AuthConfigOauthConfig getOauthConfig() {
    return oauthConfig;
  }

  /**
   * Config for user oauth.
   * @param oauthConfig oauthConfig or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1AuthConfig setOauthConfig(GoogleCloudAiplatformV1beta1AuthConfigOauthConfig oauthConfig) {
    this.oauthConfig = oauthConfig;
    return this;
  }

  /**
   * Config for user OIDC auth.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1AuthConfigOidcConfig getOidcConfig() {
    return oidcConfig;
  }

  /**
   * Config for user OIDC auth.
   * @param oidcConfig oidcConfig or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1AuthConfig setOidcConfig(GoogleCloudAiplatformV1beta1AuthConfigOidcConfig oidcConfig) {
    this.oidcConfig = oidcConfig;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1AuthConfig set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1AuthConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1AuthConfig clone() {
    return (GoogleCloudAiplatformV1beta1AuthConfig) super.clone();
  }

}

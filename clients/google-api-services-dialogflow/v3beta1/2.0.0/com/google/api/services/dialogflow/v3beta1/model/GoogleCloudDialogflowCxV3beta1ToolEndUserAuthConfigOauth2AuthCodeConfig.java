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

package com.google.api.services.dialogflow.v3beta1.model;

/**
 * Oauth 2.0 Authorization Code authentication configuration.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3beta1ToolEndUserAuthConfigOauth2AuthCodeConfig extends com.google.api.client.json.GenericJson {

  /**
   * Required. Oauth token value or parameter name to pass it through.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String oauthToken;

  /**
   * Required. Oauth token value or parameter name to pass it through.
   * @return value or {@code null} for none
   */
  public java.lang.String getOauthToken() {
    return oauthToken;
  }

  /**
   * Required. Oauth token value or parameter name to pass it through.
   * @param oauthToken oauthToken or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ToolEndUserAuthConfigOauth2AuthCodeConfig setOauthToken(java.lang.String oauthToken) {
    this.oauthToken = oauthToken;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1ToolEndUserAuthConfigOauth2AuthCodeConfig set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3beta1ToolEndUserAuthConfigOauth2AuthCodeConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1ToolEndUserAuthConfigOauth2AuthCodeConfig clone() {
    return (GoogleCloudDialogflowCxV3beta1ToolEndUserAuthConfigOauth2AuthCodeConfig) super.clone();
  }

}

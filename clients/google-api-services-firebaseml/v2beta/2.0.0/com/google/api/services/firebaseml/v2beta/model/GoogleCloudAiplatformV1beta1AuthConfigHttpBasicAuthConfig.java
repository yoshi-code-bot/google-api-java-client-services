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
 * Config for HTTP Basic Authentication.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase ML API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1AuthConfigHttpBasicAuthConfig extends com.google.api.client.json.GenericJson {

  /**
   * Required. The name of the SecretManager secret version resource storing the base64 encoded
   * credentials. Format: `projects/{project}/secrets/{secrete}/versions/{version}` - If specified,
   * the `secretmanager.versions.access` permission should be granted to Vertex AI Extension Service
   * Agent (https://cloud.google.com/vertex-ai/docs/general/access-control#service-agents) on the
   * specified resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String credentialSecret;

  /**
   * Required. The name of the SecretManager secret version resource storing the base64 encoded
   * credentials. Format: `projects/{project}/secrets/{secrete}/versions/{version}` - If specified,
   * the `secretmanager.versions.access` permission should be granted to Vertex AI Extension Service
   * Agent (https://cloud.google.com/vertex-ai/docs/general/access-control#service-agents) on the
   * specified resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getCredentialSecret() {
    return credentialSecret;
  }

  /**
   * Required. The name of the SecretManager secret version resource storing the base64 encoded
   * credentials. Format: `projects/{project}/secrets/{secrete}/versions/{version}` - If specified,
   * the `secretmanager.versions.access` permission should be granted to Vertex AI Extension Service
   * Agent (https://cloud.google.com/vertex-ai/docs/general/access-control#service-agents) on the
   * specified resource.
   * @param credentialSecret credentialSecret or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1AuthConfigHttpBasicAuthConfig setCredentialSecret(java.lang.String credentialSecret) {
    this.credentialSecret = credentialSecret;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1AuthConfigHttpBasicAuthConfig set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1AuthConfigHttpBasicAuthConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1AuthConfigHttpBasicAuthConfig clone() {
    return (GoogleCloudAiplatformV1beta1AuthConfigHttpBasicAuthConfig) super.clone();
  }

}

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
 * Config for Google Service Account Authentication.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase ML API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1AuthConfigGoogleServiceAccountConfig extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The service account that the extension execution service runs as. - If the service
   * account is specified, the `iam.serviceAccounts.getAccessToken` permission should be granted to
   * Vertex AI Extension Service Agent (https://cloud.google.com/vertex-ai/docs/general/access-
   * control#service-agents) on the specified service account. - If not specified, the Vertex AI
   * Extension Service Agent will be used to execute the Extension.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccount;

  /**
   * Optional. The service account that the extension execution service runs as. - If the service
   * account is specified, the `iam.serviceAccounts.getAccessToken` permission should be granted to
   * Vertex AI Extension Service Agent (https://cloud.google.com/vertex-ai/docs/general/access-
   * control#service-agents) on the specified service account. - If not specified, the Vertex AI
   * Extension Service Agent will be used to execute the Extension.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccount() {
    return serviceAccount;
  }

  /**
   * Optional. The service account that the extension execution service runs as. - If the service
   * account is specified, the `iam.serviceAccounts.getAccessToken` permission should be granted to
   * Vertex AI Extension Service Agent (https://cloud.google.com/vertex-ai/docs/general/access-
   * control#service-agents) on the specified service account. - If not specified, the Vertex AI
   * Extension Service Agent will be used to execute the Extension.
   * @param serviceAccount serviceAccount or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1AuthConfigGoogleServiceAccountConfig setServiceAccount(java.lang.String serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1AuthConfigGoogleServiceAccountConfig set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1AuthConfigGoogleServiceAccountConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1AuthConfigGoogleServiceAccountConfig clone() {
    return (GoogleCloudAiplatformV1beta1AuthConfigGoogleServiceAccountConfig) super.clone();
  }

}

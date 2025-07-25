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

package com.google.api.services.integrations.v1.model;

/**
 * Response for SearchIntegrations.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Application Integration API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudIntegrationsV1alphaSearchIntegrationsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The list of integrations that match the search criteria.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudIntegrationsV1alphaSearchIntegrationsResponseIntegrationSearchResult> integrations;

  /**
   * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The list of integrations that match the search criteria.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudIntegrationsV1alphaSearchIntegrationsResponseIntegrationSearchResult> getIntegrations() {
    return integrations;
  }

  /**
   * The list of integrations that match the search criteria.
   * @param integrations integrations or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaSearchIntegrationsResponse setIntegrations(java.util.List<GoogleCloudIntegrationsV1alphaSearchIntegrationsResponseIntegrationSearchResult> integrations) {
    this.integrations = integrations;
    return this;
  }

  /**
   * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaSearchIntegrationsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public GoogleCloudIntegrationsV1alphaSearchIntegrationsResponse set(String fieldName, Object value) {
    return (GoogleCloudIntegrationsV1alphaSearchIntegrationsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudIntegrationsV1alphaSearchIntegrationsResponse clone() {
    return (GoogleCloudIntegrationsV1alphaSearchIntegrationsResponse) super.clone();
  }

}

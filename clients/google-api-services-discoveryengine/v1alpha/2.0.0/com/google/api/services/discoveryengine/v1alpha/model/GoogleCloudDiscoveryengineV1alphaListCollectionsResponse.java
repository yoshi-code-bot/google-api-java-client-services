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

package com.google.api.services.discoveryengine.v1alpha.model;

/**
 * Response message for CollectionService.ListCollections method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1alphaListCollectionsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The Collections.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDiscoveryengineV1alphaCollection> collections;

  static {
    // hack to force ProGuard to consider GoogleCloudDiscoveryengineV1alphaCollection used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDiscoveryengineV1alphaCollection.class);
  }

  /**
   * A token that can be sent as ListCollectionsRequest.page_token to retrieve the next page. If
   * this field is omitted, there are no subsequent pages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The Collections.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDiscoveryengineV1alphaCollection> getCollections() {
    return collections;
  }

  /**
   * The Collections.
   * @param collections collections or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaListCollectionsResponse setCollections(java.util.List<GoogleCloudDiscoveryengineV1alphaCollection> collections) {
    this.collections = collections;
    return this;
  }

  /**
   * A token that can be sent as ListCollectionsRequest.page_token to retrieve the next page. If
   * this field is omitted, there are no subsequent pages.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token that can be sent as ListCollectionsRequest.page_token to retrieve the next page. If
   * this field is omitted, there are no subsequent pages.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaListCollectionsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaListCollectionsResponse set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1alphaListCollectionsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaListCollectionsResponse clone() {
    return (GoogleCloudDiscoveryengineV1alphaListCollectionsResponse) super.clone();
  }

}

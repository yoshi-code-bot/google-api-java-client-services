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

package com.google.api.services.discoveryengine.v1.model;

/**
 * Response for ListControls method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1ListControlsResponse extends com.google.api.client.json.GenericJson {

  /**
   * All the Controls for a given data store.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDiscoveryengineV1Control> controls;

  static {
    // hack to force ProGuard to consider GoogleCloudDiscoveryengineV1Control used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDiscoveryengineV1Control.class);
  }

  /**
   * Pagination token, if not returned indicates the last page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * All the Controls for a given data store.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDiscoveryengineV1Control> getControls() {
    return controls;
  }

  /**
   * All the Controls for a given data store.
   * @param controls controls or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1ListControlsResponse setControls(java.util.List<GoogleCloudDiscoveryengineV1Control> controls) {
    this.controls = controls;
    return this;
  }

  /**
   * Pagination token, if not returned indicates the last page.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Pagination token, if not returned indicates the last page.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1ListControlsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1ListControlsResponse set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1ListControlsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1ListControlsResponse clone() {
    return (GoogleCloudDiscoveryengineV1ListControlsResponse) super.clone();
  }

}

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

package com.google.api.services.retail.v2beta.model;

/**
 * The inline source for the input config for ImportUserEvents method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI Search for commerce API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2betaUserEventInlineSource extends com.google.api.client.json.GenericJson {

  /**
   * Required. A list of user events to import. Recommended max of 10k items.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRetailV2betaUserEvent> userEvents;

  static {
    // hack to force ProGuard to consider GoogleCloudRetailV2betaUserEvent used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudRetailV2betaUserEvent.class);
  }

  /**
   * Required. A list of user events to import. Recommended max of 10k items.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRetailV2betaUserEvent> getUserEvents() {
    return userEvents;
  }

  /**
   * Required. A list of user events to import. Recommended max of 10k items.
   * @param userEvents userEvents or {@code null} for none
   */
  public GoogleCloudRetailV2betaUserEventInlineSource setUserEvents(java.util.List<GoogleCloudRetailV2betaUserEvent> userEvents) {
    this.userEvents = userEvents;
    return this;
  }

  @Override
  public GoogleCloudRetailV2betaUserEventInlineSource set(String fieldName, Object value) {
    return (GoogleCloudRetailV2betaUserEventInlineSource) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2betaUserEventInlineSource clone() {
    return (GoogleCloudRetailV2betaUserEventInlineSource) super.clone();
  }

}

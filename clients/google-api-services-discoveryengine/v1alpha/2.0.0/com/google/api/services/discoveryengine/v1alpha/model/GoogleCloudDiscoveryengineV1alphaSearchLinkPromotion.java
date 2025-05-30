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
 * Promotion proto includes uri and other helping information to display the promotion.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1alphaSearchLinkPromotion extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The Promotion description. Maximum length: 200 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Optional. The Document the user wants to promote. For site search, leave unset and only
   * populate uri. Can be set along with uri.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String document;

  /**
   * Optional. The enabled promotion will be returned for any serving configs associated with the
   * parent of the control this promotion is attached to. This flag is used for basic site search
   * only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enabled;

  /**
   * Optional. The promotion thumbnail image url.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imageUri;

  /**
   * Required. The title of the promotion. Maximum length: 160 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Optional. The URL for the page the user wants to promote. Must be set for site search. For
   * other verticals, this is optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * Optional. The Promotion description. Maximum length: 200 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. The Promotion description. Maximum length: 200 characters.
   * @param description description or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchLinkPromotion setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional. The Document the user wants to promote. For site search, leave unset and only
   * populate uri. Can be set along with uri.
   * @return value or {@code null} for none
   */
  public java.lang.String getDocument() {
    return document;
  }

  /**
   * Optional. The Document the user wants to promote. For site search, leave unset and only
   * populate uri. Can be set along with uri.
   * @param document document or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchLinkPromotion setDocument(java.lang.String document) {
    this.document = document;
    return this;
  }

  /**
   * Optional. The enabled promotion will be returned for any serving configs associated with the
   * parent of the control this promotion is attached to. This flag is used for basic site search
   * only.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnabled() {
    return enabled;
  }

  /**
   * Optional. The enabled promotion will be returned for any serving configs associated with the
   * parent of the control this promotion is attached to. This flag is used for basic site search
   * only.
   * @param enabled enabled or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchLinkPromotion setEnabled(java.lang.Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Optional. The promotion thumbnail image url.
   * @return value or {@code null} for none
   */
  public java.lang.String getImageUri() {
    return imageUri;
  }

  /**
   * Optional. The promotion thumbnail image url.
   * @param imageUri imageUri or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchLinkPromotion setImageUri(java.lang.String imageUri) {
    this.imageUri = imageUri;
    return this;
  }

  /**
   * Required. The title of the promotion. Maximum length: 160 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Required. The title of the promotion. Maximum length: 160 characters.
   * @param title title or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchLinkPromotion setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * Optional. The URL for the page the user wants to promote. Must be set for site search. For
   * other verticals, this is optional.
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * Optional. The URL for the page the user wants to promote. Must be set for site search. For
   * other verticals, this is optional.
   * @param uri uri or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchLinkPromotion setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaSearchLinkPromotion set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1alphaSearchLinkPromotion) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaSearchLinkPromotion clone() {
    return (GoogleCloudDiscoveryengineV1alphaSearchLinkPromotion) super.clone();
  }

}

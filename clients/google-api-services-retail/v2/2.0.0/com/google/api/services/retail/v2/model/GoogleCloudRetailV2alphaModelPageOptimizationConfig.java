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

package com.google.api.services.retail.v2.model;

/**
 * The PageOptimizationConfig for model training. This determines how many panels to optimize for,
 * and which serving configs to consider for each panel. The purpose of this model is to optimize
 * which ServingConfig to show on which panels in way that optimizes the visitors shopping journey.
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
public final class GoogleCloudRetailV2alphaModelPageOptimizationConfig extends com.google.api.client.json.GenericJson {

  /**
   * Required. The type of UserEvent this page optimization is shown for. Each page has an
   * associated event type - this will be the corresponding event type for the page that the page
   * optimization model is used on. Supported types: * `add-to-cart`: Products being added to cart.
   * * `detail-page-view`: Products detail page viewed. * `home-page-view`: Homepage viewed *
   * `category-page-view`: Homepage viewed * `shopping-cart-page-view`: User viewing a shopping
   * cart. `home-page-view` only allows models with type `recommended-for-you`. All other
   * page_optimization_event_type allow all Model.types.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pageOptimizationEventType;

  /**
   * Required. A list of panel configurations. Limit = 5.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRetailV2alphaModelPageOptimizationConfigPanel> panels;

  /**
   * Optional. How to restrict results across panels e.g. can the same ServingConfig be shown on
   * multiple panels at once. If unspecified, default to `UNIQUE_MODEL_RESTRICTION`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String restriction;

  /**
   * Required. The type of UserEvent this page optimization is shown for. Each page has an
   * associated event type - this will be the corresponding event type for the page that the page
   * optimization model is used on. Supported types: * `add-to-cart`: Products being added to cart.
   * * `detail-page-view`: Products detail page viewed. * `home-page-view`: Homepage viewed *
   * `category-page-view`: Homepage viewed * `shopping-cart-page-view`: User viewing a shopping
   * cart. `home-page-view` only allows models with type `recommended-for-you`. All other
   * page_optimization_event_type allow all Model.types.
   * @return value or {@code null} for none
   */
  public java.lang.String getPageOptimizationEventType() {
    return pageOptimizationEventType;
  }

  /**
   * Required. The type of UserEvent this page optimization is shown for. Each page has an
   * associated event type - this will be the corresponding event type for the page that the page
   * optimization model is used on. Supported types: * `add-to-cart`: Products being added to cart.
   * * `detail-page-view`: Products detail page viewed. * `home-page-view`: Homepage viewed *
   * `category-page-view`: Homepage viewed * `shopping-cart-page-view`: User viewing a shopping
   * cart. `home-page-view` only allows models with type `recommended-for-you`. All other
   * page_optimization_event_type allow all Model.types.
   * @param pageOptimizationEventType pageOptimizationEventType or {@code null} for none
   */
  public GoogleCloudRetailV2alphaModelPageOptimizationConfig setPageOptimizationEventType(java.lang.String pageOptimizationEventType) {
    this.pageOptimizationEventType = pageOptimizationEventType;
    return this;
  }

  /**
   * Required. A list of panel configurations. Limit = 5.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRetailV2alphaModelPageOptimizationConfigPanel> getPanels() {
    return panels;
  }

  /**
   * Required. A list of panel configurations. Limit = 5.
   * @param panels panels or {@code null} for none
   */
  public GoogleCloudRetailV2alphaModelPageOptimizationConfig setPanels(java.util.List<GoogleCloudRetailV2alphaModelPageOptimizationConfigPanel> panels) {
    this.panels = panels;
    return this;
  }

  /**
   * Optional. How to restrict results across panels e.g. can the same ServingConfig be shown on
   * multiple panels at once. If unspecified, default to `UNIQUE_MODEL_RESTRICTION`.
   * @return value or {@code null} for none
   */
  public java.lang.String getRestriction() {
    return restriction;
  }

  /**
   * Optional. How to restrict results across panels e.g. can the same ServingConfig be shown on
   * multiple panels at once. If unspecified, default to `UNIQUE_MODEL_RESTRICTION`.
   * @param restriction restriction or {@code null} for none
   */
  public GoogleCloudRetailV2alphaModelPageOptimizationConfig setRestriction(java.lang.String restriction) {
    this.restriction = restriction;
    return this;
  }

  @Override
  public GoogleCloudRetailV2alphaModelPageOptimizationConfig set(String fieldName, Object value) {
    return (GoogleCloudRetailV2alphaModelPageOptimizationConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2alphaModelPageOptimizationConfig clone() {
    return (GoogleCloudRetailV2alphaModelPageOptimizationConfig) super.clone();
  }

}

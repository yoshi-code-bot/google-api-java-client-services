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
 * Configures dynamic metadata that can be linked to a ServingConfig and affect search or
 * recommendation results at serving time.
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
public final class GoogleCloudRetailV2Control extends com.google.api.client.json.GenericJson {

  /**
   * Output only. List of serving config ids that are associated with this control in the same
   * Catalog. Note the association is managed via the ServingConfig, this is an output only
   * denormalized view.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> associatedServingConfigIds;

  /**
   * Required. The human readable control display name. Used in Retail UI. This field must be a
   * UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT
   * error is thrown.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Immutable. Fully qualified name `projects/locations/global/catalogs/controls`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * A rule control - a condition-action pair. Enacts a set action when the condition is triggered.
   * For example: Boost "gShoe" when query full matches "Running Shoes".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRetailV2Rule rule;

  /**
   * Specifies the use case for the control. Affects what condition fields can be set. Only settable
   * by search controls. Will default to SEARCH_SOLUTION_USE_CASE_SEARCH if not specified. Currently
   * only allow one search_solution_use_case per control.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> searchSolutionUseCase;

  /**
   * Required. Immutable. The solution types that the control is used for. Currently we support
   * setting only one type of solution at creation time. Only `SOLUTION_TYPE_SEARCH` value is
   * supported at the moment. If no solution type is provided at creation time, will default to
   * SOLUTION_TYPE_SEARCH.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> solutionTypes;

  /**
   * Output only. List of serving config ids that are associated with this control in the same
   * Catalog. Note the association is managed via the ServingConfig, this is an output only
   * denormalized view.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAssociatedServingConfigIds() {
    return associatedServingConfigIds;
  }

  /**
   * Output only. List of serving config ids that are associated with this control in the same
   * Catalog. Note the association is managed via the ServingConfig, this is an output only
   * denormalized view.
   * @param associatedServingConfigIds associatedServingConfigIds or {@code null} for none
   */
  public GoogleCloudRetailV2Control setAssociatedServingConfigIds(java.util.List<java.lang.String> associatedServingConfigIds) {
    this.associatedServingConfigIds = associatedServingConfigIds;
    return this;
  }

  /**
   * Required. The human readable control display name. Used in Retail UI. This field must be a
   * UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT
   * error is thrown.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. The human readable control display name. Used in Retail UI. This field must be a
   * UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT
   * error is thrown.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudRetailV2Control setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Immutable. Fully qualified name `projects/locations/global/catalogs/controls`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Immutable. Fully qualified name `projects/locations/global/catalogs/controls`
   * @param name name or {@code null} for none
   */
  public GoogleCloudRetailV2Control setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * A rule control - a condition-action pair. Enacts a set action when the condition is triggered.
   * For example: Boost "gShoe" when query full matches "Running Shoes".
   * @return value or {@code null} for none
   */
  public GoogleCloudRetailV2Rule getRule() {
    return rule;
  }

  /**
   * A rule control - a condition-action pair. Enacts a set action when the condition is triggered.
   * For example: Boost "gShoe" when query full matches "Running Shoes".
   * @param rule rule or {@code null} for none
   */
  public GoogleCloudRetailV2Control setRule(GoogleCloudRetailV2Rule rule) {
    this.rule = rule;
    return this;
  }

  /**
   * Specifies the use case for the control. Affects what condition fields can be set. Only settable
   * by search controls. Will default to SEARCH_SOLUTION_USE_CASE_SEARCH if not specified. Currently
   * only allow one search_solution_use_case per control.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSearchSolutionUseCase() {
    return searchSolutionUseCase;
  }

  /**
   * Specifies the use case for the control. Affects what condition fields can be set. Only settable
   * by search controls. Will default to SEARCH_SOLUTION_USE_CASE_SEARCH if not specified. Currently
   * only allow one search_solution_use_case per control.
   * @param searchSolutionUseCase searchSolutionUseCase or {@code null} for none
   */
  public GoogleCloudRetailV2Control setSearchSolutionUseCase(java.util.List<java.lang.String> searchSolutionUseCase) {
    this.searchSolutionUseCase = searchSolutionUseCase;
    return this;
  }

  /**
   * Required. Immutable. The solution types that the control is used for. Currently we support
   * setting only one type of solution at creation time. Only `SOLUTION_TYPE_SEARCH` value is
   * supported at the moment. If no solution type is provided at creation time, will default to
   * SOLUTION_TYPE_SEARCH.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSolutionTypes() {
    return solutionTypes;
  }

  /**
   * Required. Immutable. The solution types that the control is used for. Currently we support
   * setting only one type of solution at creation time. Only `SOLUTION_TYPE_SEARCH` value is
   * supported at the moment. If no solution type is provided at creation time, will default to
   * SOLUTION_TYPE_SEARCH.
   * @param solutionTypes solutionTypes or {@code null} for none
   */
  public GoogleCloudRetailV2Control setSolutionTypes(java.util.List<java.lang.String> solutionTypes) {
    this.solutionTypes = solutionTypes;
    return this;
  }

  @Override
  public GoogleCloudRetailV2Control set(String fieldName, Object value) {
    return (GoogleCloudRetailV2Control) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2Control clone() {
    return (GoogleCloudRetailV2Control) super.clone();
  }

}

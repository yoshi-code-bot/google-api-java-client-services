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

package com.google.api.services.retail.v2alpha.model;

/**
 * Removes an attribute/facet in the request if is present. * Rule Condition: Must specify non-empty
 * Condition.query_terms (for search only) or Condition.page_categories (for browse only), but can't
 * specify both. * Action Input: attribute name * Action Result: Will remove the attribute (as a
 * facet) from the request if it is present. Example: Suppose the query is "shoes", the
 * Condition.query_terms is "shoes" and the attribute name "size", then facet key "size" will be
 * removed from the request (if it is present).
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
public final class GoogleCloudRetailV2alphaRuleRemoveFacetAction extends com.google.api.client.json.GenericJson {

  /**
   * The attribute names (i.e. facet keys) to remove from the dynamic facets (if present in the
   * request). There can't be more 3 attribute names. Each attribute name should be a valid
   * attribute name, be non-empty and contain at most 80 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> attributeNames;

  /**
   * The attribute names (i.e. facet keys) to remove from the dynamic facets (if present in the
   * request). There can't be more 3 attribute names. Each attribute name should be a valid
   * attribute name, be non-empty and contain at most 80 characters.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAttributeNames() {
    return attributeNames;
  }

  /**
   * The attribute names (i.e. facet keys) to remove from the dynamic facets (if present in the
   * request). There can't be more 3 attribute names. Each attribute name should be a valid
   * attribute name, be non-empty and contain at most 80 characters.
   * @param attributeNames attributeNames or {@code null} for none
   */
  public GoogleCloudRetailV2alphaRuleRemoveFacetAction setAttributeNames(java.util.List<java.lang.String> attributeNames) {
    this.attributeNames = attributeNames;
    return this;
  }

  @Override
  public GoogleCloudRetailV2alphaRuleRemoveFacetAction set(String fieldName, Object value) {
    return (GoogleCloudRetailV2alphaRuleRemoveFacetAction) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2alphaRuleRemoveFacetAction clone() {
    return (GoogleCloudRetailV2alphaRuleRemoveFacetAction) super.clone();
  }

}

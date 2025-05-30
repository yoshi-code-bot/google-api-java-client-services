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
 * Facet values to ignore on facets during the specified time range for the given
 * SearchResponse.Facet.key attribute.
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
public final class GoogleCloudRetailV2betaCatalogAttributeFacetConfigIgnoredFacetValues extends com.google.api.client.json.GenericJson {

  /**
   * If start time is empty and end time is not empty, then ignore these facet values before end
   * time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * Time range for the current list of facet values to ignore. If multiple time ranges are
   * specified for an facet value for the current attribute, consider all of them. If both are
   * empty, ignore always. If start time and end time are set, then start time must be before end
   * time. If start time is not empty and end time is empty, then will ignore these facet values
   * after the start time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * List of facet values to ignore for the following time range. The facet values are the same as
   * the attribute values. There is a limit of 10 values per instance of IgnoredFacetValues. Each
   * value can have at most 128 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> values;

  /**
   * If start time is empty and end time is not empty, then ignore these facet values before end
   * time.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * If start time is empty and end time is not empty, then ignore these facet values before end
   * time.
   * @param endTime endTime or {@code null} for none
   */
  public GoogleCloudRetailV2betaCatalogAttributeFacetConfigIgnoredFacetValues setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Time range for the current list of facet values to ignore. If multiple time ranges are
   * specified for an facet value for the current attribute, consider all of them. If both are
   * empty, ignore always. If start time and end time are set, then start time must be before end
   * time. If start time is not empty and end time is empty, then will ignore these facet values
   * after the start time.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Time range for the current list of facet values to ignore. If multiple time ranges are
   * specified for an facet value for the current attribute, consider all of them. If both are
   * empty, ignore always. If start time and end time are set, then start time must be before end
   * time. If start time is not empty and end time is empty, then will ignore these facet values
   * after the start time.
   * @param startTime startTime or {@code null} for none
   */
  public GoogleCloudRetailV2betaCatalogAttributeFacetConfigIgnoredFacetValues setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * List of facet values to ignore for the following time range. The facet values are the same as
   * the attribute values. There is a limit of 10 values per instance of IgnoredFacetValues. Each
   * value can have at most 128 characters.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getValues() {
    return values;
  }

  /**
   * List of facet values to ignore for the following time range. The facet values are the same as
   * the attribute values. There is a limit of 10 values per instance of IgnoredFacetValues. Each
   * value can have at most 128 characters.
   * @param values values or {@code null} for none
   */
  public GoogleCloudRetailV2betaCatalogAttributeFacetConfigIgnoredFacetValues setValues(java.util.List<java.lang.String> values) {
    this.values = values;
    return this;
  }

  @Override
  public GoogleCloudRetailV2betaCatalogAttributeFacetConfigIgnoredFacetValues set(String fieldName, Object value) {
    return (GoogleCloudRetailV2betaCatalogAttributeFacetConfigIgnoredFacetValues) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2betaCatalogAttributeFacetConfigIgnoredFacetValues clone() {
    return (GoogleCloudRetailV2betaCatalogAttributeFacetConfigIgnoredFacetValues) super.clone();
  }

}

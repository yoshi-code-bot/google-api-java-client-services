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

package com.google.api.services.cloudsearch.v1.model;

/**
 * The search API request. NEXT ID: 17
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SearchRequest extends com.google.api.client.json.GenericJson {

  /**
   * Context attributes for the request which will be used to adjust ranking of search results. The
   * maximum number of elements is 10.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ContextAttribute> contextAttributes;

  static {
    // hack to force ProGuard to consider ContextAttribute used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ContextAttribute.class);
  }

  /**
   * The sources to use for querying. If not specified, all data sources from the current search
   * application are used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DataSourceRestriction> dataSourceRestrictions;

  static {
    // hack to force ProGuard to consider DataSourceRestriction used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(DataSourceRestriction.class);
  }

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<FacetOptions> facetOptions;

  static {
    // hack to force ProGuard to consider FacetOptions used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(FacetOptions.class);
  }

  /**
   * Maximum number of search results to return in one page. Valid values are between 1 and 100,
   * inclusive. Default value is 10. Minimum value is 50 when results beyond 2000 are requested.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer pageSize;

  /**
   * The raw query string. See supported search operators in the [Narrow your search with
   * operators](https://support.google.com/cloudsearch/answer/6172299)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String query;

  /**
   * Options to interpret the user query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private QueryInterpretationOptions queryInterpretationOptions;

  /**
   * Request options, such as the search application and user timezone.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RequestOptions requestOptions;

  /**
   * The options for sorting the search results
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SortOptions sortOptions;

  /**
   * Starting index of the results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer start;

  /**
   * Context attributes for the request which will be used to adjust ranking of search results. The
   * maximum number of elements is 10.
   * @return value or {@code null} for none
   */
  public java.util.List<ContextAttribute> getContextAttributes() {
    return contextAttributes;
  }

  /**
   * Context attributes for the request which will be used to adjust ranking of search results. The
   * maximum number of elements is 10.
   * @param contextAttributes contextAttributes or {@code null} for none
   */
  public SearchRequest setContextAttributes(java.util.List<ContextAttribute> contextAttributes) {
    this.contextAttributes = contextAttributes;
    return this;
  }

  /**
   * The sources to use for querying. If not specified, all data sources from the current search
   * application are used.
   * @return value or {@code null} for none
   */
  public java.util.List<DataSourceRestriction> getDataSourceRestrictions() {
    return dataSourceRestrictions;
  }

  /**
   * The sources to use for querying. If not specified, all data sources from the current search
   * application are used.
   * @param dataSourceRestrictions dataSourceRestrictions or {@code null} for none
   */
  public SearchRequest setDataSourceRestrictions(java.util.List<DataSourceRestriction> dataSourceRestrictions) {
    this.dataSourceRestrictions = dataSourceRestrictions;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<FacetOptions> getFacetOptions() {
    return facetOptions;
  }

  /**
   * @param facetOptions facetOptions or {@code null} for none
   */
  public SearchRequest setFacetOptions(java.util.List<FacetOptions> facetOptions) {
    this.facetOptions = facetOptions;
    return this;
  }

  /**
   * Maximum number of search results to return in one page. Valid values are between 1 and 100,
   * inclusive. Default value is 10. Minimum value is 50 when results beyond 2000 are requested.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPageSize() {
    return pageSize;
  }

  /**
   * Maximum number of search results to return in one page. Valid values are between 1 and 100,
   * inclusive. Default value is 10. Minimum value is 50 when results beyond 2000 are requested.
   * @param pageSize pageSize or {@code null} for none
   */
  public SearchRequest setPageSize(java.lang.Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * The raw query string. See supported search operators in the [Narrow your search with
   * operators](https://support.google.com/cloudsearch/answer/6172299)
   * @return value or {@code null} for none
   */
  public java.lang.String getQuery() {
    return query;
  }

  /**
   * The raw query string. See supported search operators in the [Narrow your search with
   * operators](https://support.google.com/cloudsearch/answer/6172299)
   * @param query query or {@code null} for none
   */
  public SearchRequest setQuery(java.lang.String query) {
    this.query = query;
    return this;
  }

  /**
   * Options to interpret the user query.
   * @return value or {@code null} for none
   */
  public QueryInterpretationOptions getQueryInterpretationOptions() {
    return queryInterpretationOptions;
  }

  /**
   * Options to interpret the user query.
   * @param queryInterpretationOptions queryInterpretationOptions or {@code null} for none
   */
  public SearchRequest setQueryInterpretationOptions(QueryInterpretationOptions queryInterpretationOptions) {
    this.queryInterpretationOptions = queryInterpretationOptions;
    return this;
  }

  /**
   * Request options, such as the search application and user timezone.
   * @return value or {@code null} for none
   */
  public RequestOptions getRequestOptions() {
    return requestOptions;
  }

  /**
   * Request options, such as the search application and user timezone.
   * @param requestOptions requestOptions or {@code null} for none
   */
  public SearchRequest setRequestOptions(RequestOptions requestOptions) {
    this.requestOptions = requestOptions;
    return this;
  }

  /**
   * The options for sorting the search results
   * @return value or {@code null} for none
   */
  public SortOptions getSortOptions() {
    return sortOptions;
  }

  /**
   * The options for sorting the search results
   * @param sortOptions sortOptions or {@code null} for none
   */
  public SearchRequest setSortOptions(SortOptions sortOptions) {
    this.sortOptions = sortOptions;
    return this;
  }

  /**
   * Starting index of the results.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getStart() {
    return start;
  }

  /**
   * Starting index of the results.
   * @param start start or {@code null} for none
   */
  public SearchRequest setStart(java.lang.Integer start) {
    this.start = start;
    return this;
  }

  @Override
  public SearchRequest set(String fieldName, Object value) {
    return (SearchRequest) super.set(fieldName, value);
  }

  @Override
  public SearchRequest clone() {
    return (SearchRequest) super.clone();
  }

}

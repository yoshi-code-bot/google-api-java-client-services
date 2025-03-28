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

package com.google.api.services.areainsights.v1.model;

/**
 * Filters for the ComputeInsights RPC.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Places Aggregate API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Filter extends com.google.api.client.json.GenericJson {

  /**
   * Required. Restricts results to places which are located in the area specified by location
   * filters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LocationFilter locationFilter;

  /**
   * Optional. Restricts results to places whose operating status is included on this list. If
   * operating_status is not set, OPERATING_STATUS_OPERATIONAL is used as default.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> operatingStatus;

  /**
   * Optional. Restricts results to places whose price level is included on this list. If
   * `price_levels` is not set, all price levels are included in the results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> priceLevels;

  /**
   * Optional. Restricts results to places whose average user ratings are in the range specified by
   * rating_filter. If rating_filter is not set, all ratings are included in the result.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RatingFilter ratingFilter;

  /**
   * Required. Place type filters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TypeFilter typeFilter;

  /**
   * Required. Restricts results to places which are located in the area specified by location
   * filters.
   * @return value or {@code null} for none
   */
  public LocationFilter getLocationFilter() {
    return locationFilter;
  }

  /**
   * Required. Restricts results to places which are located in the area specified by location
   * filters.
   * @param locationFilter locationFilter or {@code null} for none
   */
  public Filter setLocationFilter(LocationFilter locationFilter) {
    this.locationFilter = locationFilter;
    return this;
  }

  /**
   * Optional. Restricts results to places whose operating status is included on this list. If
   * operating_status is not set, OPERATING_STATUS_OPERATIONAL is used as default.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getOperatingStatus() {
    return operatingStatus;
  }

  /**
   * Optional. Restricts results to places whose operating status is included on this list. If
   * operating_status is not set, OPERATING_STATUS_OPERATIONAL is used as default.
   * @param operatingStatus operatingStatus or {@code null} for none
   */
  public Filter setOperatingStatus(java.util.List<java.lang.String> operatingStatus) {
    this.operatingStatus = operatingStatus;
    return this;
  }

  /**
   * Optional. Restricts results to places whose price level is included on this list. If
   * `price_levels` is not set, all price levels are included in the results.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPriceLevels() {
    return priceLevels;
  }

  /**
   * Optional. Restricts results to places whose price level is included on this list. If
   * `price_levels` is not set, all price levels are included in the results.
   * @param priceLevels priceLevels or {@code null} for none
   */
  public Filter setPriceLevels(java.util.List<java.lang.String> priceLevels) {
    this.priceLevels = priceLevels;
    return this;
  }

  /**
   * Optional. Restricts results to places whose average user ratings are in the range specified by
   * rating_filter. If rating_filter is not set, all ratings are included in the result.
   * @return value or {@code null} for none
   */
  public RatingFilter getRatingFilter() {
    return ratingFilter;
  }

  /**
   * Optional. Restricts results to places whose average user ratings are in the range specified by
   * rating_filter. If rating_filter is not set, all ratings are included in the result.
   * @param ratingFilter ratingFilter or {@code null} for none
   */
  public Filter setRatingFilter(RatingFilter ratingFilter) {
    this.ratingFilter = ratingFilter;
    return this;
  }

  /**
   * Required. Place type filters.
   * @return value or {@code null} for none
   */
  public TypeFilter getTypeFilter() {
    return typeFilter;
  }

  /**
   * Required. Place type filters.
   * @param typeFilter typeFilter or {@code null} for none
   */
  public Filter setTypeFilter(TypeFilter typeFilter) {
    this.typeFilter = typeFilter;
    return this;
  }

  @Override
  public Filter set(String fieldName, Object value) {
    return (Filter) super.set(fieldName, value);
  }

  @Override
  public Filter clone() {
    return (Filter) super.clone();
  }

}

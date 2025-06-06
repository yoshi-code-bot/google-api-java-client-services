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

package com.google.api.services.analyticsadmin.v1alpha.model;

/**
 * Represents a Reporting Data Annotation's date range, both start and end dates are inclusive. Time
 * zones are based on the parent property.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics Admin API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAnalyticsAdminV1alphaReportingDataAnnotationDateRange extends com.google.api.client.json.GenericJson {

  /**
   * Required. The end date for this range. Must be a valid date with year, month, and day set. This
   * date must be greater than or equal to the start date.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleTypeDate endDate;

  /**
   * Required. The start date for this range. Must be a valid date with year, month, and day set.
   * The date may be in the past, present, or future.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleTypeDate startDate;

  /**
   * Required. The end date for this range. Must be a valid date with year, month, and day set. This
   * date must be greater than or equal to the start date.
   * @return value or {@code null} for none
   */
  public GoogleTypeDate getEndDate() {
    return endDate;
  }

  /**
   * Required. The end date for this range. Must be a valid date with year, month, and day set. This
   * date must be greater than or equal to the start date.
   * @param endDate endDate or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaReportingDataAnnotationDateRange setEndDate(GoogleTypeDate endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Required. The start date for this range. Must be a valid date with year, month, and day set.
   * The date may be in the past, present, or future.
   * @return value or {@code null} for none
   */
  public GoogleTypeDate getStartDate() {
    return startDate;
  }

  /**
   * Required. The start date for this range. Must be a valid date with year, month, and day set.
   * The date may be in the past, present, or future.
   * @param startDate startDate or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaReportingDataAnnotationDateRange setStartDate(GoogleTypeDate startDate) {
    this.startDate = startDate;
    return this;
  }

  @Override
  public GoogleAnalyticsAdminV1alphaReportingDataAnnotationDateRange set(String fieldName, Object value) {
    return (GoogleAnalyticsAdminV1alphaReportingDataAnnotationDateRange) super.set(fieldName, value);
  }

  @Override
  public GoogleAnalyticsAdminV1alphaReportingDataAnnotationDateRange clone() {
    return (GoogleAnalyticsAdminV1alphaReportingDataAnnotationDateRange) super.clone();
  }

}

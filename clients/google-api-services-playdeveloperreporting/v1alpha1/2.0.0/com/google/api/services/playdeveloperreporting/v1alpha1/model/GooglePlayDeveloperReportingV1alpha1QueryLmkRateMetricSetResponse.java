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

package com.google.api.services.playdeveloperreporting.v1alpha1.model;

/**
 * Response message for QueryLmkRateMetricSet.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Developer Reporting API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePlayDeveloperReportingV1alpha1QueryLmkRateMetricSetResponse extends com.google.api.client.json.GenericJson {

  /**
   * Continuation token to fetch the next page of data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Returned rows of data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GooglePlayDeveloperReportingV1alpha1MetricsRow> rows;

  static {
    // hack to force ProGuard to consider GooglePlayDeveloperReportingV1alpha1MetricsRow used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GooglePlayDeveloperReportingV1alpha1MetricsRow.class);
  }

  /**
   * Continuation token to fetch the next page of data.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Continuation token to fetch the next page of data.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GooglePlayDeveloperReportingV1alpha1QueryLmkRateMetricSetResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Returned rows of data.
   * @return value or {@code null} for none
   */
  public java.util.List<GooglePlayDeveloperReportingV1alpha1MetricsRow> getRows() {
    return rows;
  }

  /**
   * Returned rows of data.
   * @param rows rows or {@code null} for none
   */
  public GooglePlayDeveloperReportingV1alpha1QueryLmkRateMetricSetResponse setRows(java.util.List<GooglePlayDeveloperReportingV1alpha1MetricsRow> rows) {
    this.rows = rows;
    return this;
  }

  @Override
  public GooglePlayDeveloperReportingV1alpha1QueryLmkRateMetricSetResponse set(String fieldName, Object value) {
    return (GooglePlayDeveloperReportingV1alpha1QueryLmkRateMetricSetResponse) super.set(fieldName, value);
  }

  @Override
  public GooglePlayDeveloperReportingV1alpha1QueryLmkRateMetricSetResponse clone() {
    return (GooglePlayDeveloperReportingV1alpha1QueryLmkRateMetricSetResponse) super.clone();
  }

}

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

package com.google.api.services.iam.v1.model;

/**
 * The grantable role query request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Identity and Access Management (IAM) API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class QueryGrantableRolesRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. Required. The full resource name to query from the list of grantable roles. The name
   * follows the Google Cloud Platform resource format. For example, a Cloud Platform project with
   * id `my-project` will be named `//cloudresourcemanager.googleapis.com/projects/my-project`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fullResourceName;

  /**
   * Optional limit on the number of roles to include in the response. The default is 300, and the
   * maximum is 2,000.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer pageSize;

  /**
   * Optional pagination token returned in an earlier QueryGrantableRolesResponse.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pageToken;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String view;

  /**
   * Required. Required. The full resource name to query from the list of grantable roles. The name
   * follows the Google Cloud Platform resource format. For example, a Cloud Platform project with
   * id `my-project` will be named `//cloudresourcemanager.googleapis.com/projects/my-project`.
   * @return value or {@code null} for none
   */
  public java.lang.String getFullResourceName() {
    return fullResourceName;
  }

  /**
   * Required. Required. The full resource name to query from the list of grantable roles. The name
   * follows the Google Cloud Platform resource format. For example, a Cloud Platform project with
   * id `my-project` will be named `//cloudresourcemanager.googleapis.com/projects/my-project`.
   * @param fullResourceName fullResourceName or {@code null} for none
   */
  public QueryGrantableRolesRequest setFullResourceName(java.lang.String fullResourceName) {
    this.fullResourceName = fullResourceName;
    return this;
  }

  /**
   * Optional limit on the number of roles to include in the response. The default is 300, and the
   * maximum is 2,000.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPageSize() {
    return pageSize;
  }

  /**
   * Optional limit on the number of roles to include in the response. The default is 300, and the
   * maximum is 2,000.
   * @param pageSize pageSize or {@code null} for none
   */
  public QueryGrantableRolesRequest setPageSize(java.lang.Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Optional pagination token returned in an earlier QueryGrantableRolesResponse.
   * @return value or {@code null} for none
   */
  public java.lang.String getPageToken() {
    return pageToken;
  }

  /**
   * Optional pagination token returned in an earlier QueryGrantableRolesResponse.
   * @param pageToken pageToken or {@code null} for none
   */
  public QueryGrantableRolesRequest setPageToken(java.lang.String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getView() {
    return view;
  }

  /**
   * @param view view or {@code null} for none
   */
  public QueryGrantableRolesRequest setView(java.lang.String view) {
    this.view = view;
    return this;
  }

  @Override
  public QueryGrantableRolesRequest set(String fieldName, Object value) {
    return (QueryGrantableRolesRequest) super.set(fieldName, value);
  }

  @Override
  public QueryGrantableRolesRequest clone() {
    return (QueryGrantableRolesRequest) super.clone();
  }

}

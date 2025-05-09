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

package com.google.api.services.displayvideo.v4.model;

/**
 * Model definition for BulkListAssignedTargetingOptionsResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Display & Video 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BulkListAssignedTargetingOptionsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The list of wrapper objects, each providing an assigned targeting option and the line item it
   * is assigned to. This list will be absent if empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<LineItemAssignedTargetingOption> lineItemAssignedTargetingOptions;

  /**
   * A token identifying the next page of results. This value should be specified as the pageToken
   * in a subsequent call to `BulkListAssignedTargetingOptions` to fetch the next page of results.
   * This token will be absent if there are no more line_item_assigned_targeting_options to return.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The list of wrapper objects, each providing an assigned targeting option and the line item it
   * is assigned to. This list will be absent if empty.
   * @return value or {@code null} for none
   */
  public java.util.List<LineItemAssignedTargetingOption> getLineItemAssignedTargetingOptions() {
    return lineItemAssignedTargetingOptions;
  }

  /**
   * The list of wrapper objects, each providing an assigned targeting option and the line item it
   * is assigned to. This list will be absent if empty.
   * @param lineItemAssignedTargetingOptions lineItemAssignedTargetingOptions or {@code null} for none
   */
  public BulkListAssignedTargetingOptionsResponse setLineItemAssignedTargetingOptions(java.util.List<LineItemAssignedTargetingOption> lineItemAssignedTargetingOptions) {
    this.lineItemAssignedTargetingOptions = lineItemAssignedTargetingOptions;
    return this;
  }

  /**
   * A token identifying the next page of results. This value should be specified as the pageToken
   * in a subsequent call to `BulkListAssignedTargetingOptions` to fetch the next page of results.
   * This token will be absent if there are no more line_item_assigned_targeting_options to return.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token identifying the next page of results. This value should be specified as the pageToken
   * in a subsequent call to `BulkListAssignedTargetingOptions` to fetch the next page of results.
   * This token will be absent if there are no more line_item_assigned_targeting_options to return.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public BulkListAssignedTargetingOptionsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public BulkListAssignedTargetingOptionsResponse set(String fieldName, Object value) {
    return (BulkListAssignedTargetingOptionsResponse) super.set(fieldName, value);
  }

  @Override
  public BulkListAssignedTargetingOptionsResponse clone() {
    return (BulkListAssignedTargetingOptionsResponse) super.clone();
  }

}

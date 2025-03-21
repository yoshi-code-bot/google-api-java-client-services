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

package com.google.api.services.bigtableadmin.v2.model;

/**
 * Request message for BigtableInstanceAdmin.UpdateLogicalView.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Bigtable Admin API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UpdateLogicalViewRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The logical view to update. The logical view's `name` field is used to identify the
   * view to update. Format: `projects/{project}/instances/{instance}/logicalViews/{logical_view}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LogicalView logicalView;

  /**
   * Optional. The list of fields to update.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateMask;

  /**
   * Required. The logical view to update. The logical view's `name` field is used to identify the
   * view to update. Format: `projects/{project}/instances/{instance}/logicalViews/{logical_view}`.
   * @return value or {@code null} for none
   */
  public LogicalView getLogicalView() {
    return logicalView;
  }

  /**
   * Required. The logical view to update. The logical view's `name` field is used to identify the
   * view to update. Format: `projects/{project}/instances/{instance}/logicalViews/{logical_view}`.
   * @param logicalView logicalView or {@code null} for none
   */
  public UpdateLogicalViewRequest setLogicalView(LogicalView logicalView) {
    this.logicalView = logicalView;
    return this;
  }

  /**
   * Optional. The list of fields to update.
   * @return value or {@code null} for none
   */
  public String getUpdateMask() {
    return updateMask;
  }

  /**
   * Optional. The list of fields to update.
   * @param updateMask updateMask or {@code null} for none
   */
  public UpdateLogicalViewRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  @Override
  public UpdateLogicalViewRequest set(String fieldName, Object value) {
    return (UpdateLogicalViewRequest) super.set(fieldName, value);
  }

  @Override
  public UpdateLogicalViewRequest clone() {
    return (UpdateLogicalViewRequest) super.clone();
  }

}

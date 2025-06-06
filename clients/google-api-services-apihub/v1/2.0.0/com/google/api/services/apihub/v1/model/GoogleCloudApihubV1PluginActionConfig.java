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

package com.google.api.services.apihub.v1.model;

/**
 * PluginActionConfig represents the configuration of an action supported by a plugin.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the API hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApihubV1PluginActionConfig extends com.google.api.client.json.GenericJson {

  /**
   * Required. The description of the operation performed by the action.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Required. The display name of the action.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Required. The id of the action.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Required. The trigger mode supported by the action.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String triggerMode;

  /**
   * Required. The description of the operation performed by the action.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Required. The description of the operation performed by the action.
   * @param description description or {@code null} for none
   */
  public GoogleCloudApihubV1PluginActionConfig setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Required. The display name of the action.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. The display name of the action.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudApihubV1PluginActionConfig setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Required. The id of the action.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Required. The id of the action.
   * @param id id or {@code null} for none
   */
  public GoogleCloudApihubV1PluginActionConfig setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Required. The trigger mode supported by the action.
   * @return value or {@code null} for none
   */
  public java.lang.String getTriggerMode() {
    return triggerMode;
  }

  /**
   * Required. The trigger mode supported by the action.
   * @param triggerMode triggerMode or {@code null} for none
   */
  public GoogleCloudApihubV1PluginActionConfig setTriggerMode(java.lang.String triggerMode) {
    this.triggerMode = triggerMode;
    return this;
  }

  @Override
  public GoogleCloudApihubV1PluginActionConfig set(String fieldName, Object value) {
    return (GoogleCloudApihubV1PluginActionConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApihubV1PluginActionConfig clone() {
    return (GoogleCloudApihubV1PluginActionConfig) super.clone();
  }

}

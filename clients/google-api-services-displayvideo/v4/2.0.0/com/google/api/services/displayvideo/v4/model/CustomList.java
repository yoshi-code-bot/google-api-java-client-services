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
 * Describes a custom list entity, such as a custom affinity or custom intent audience list.
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
public final class CustomList extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The unique ID of the custom list. Assigned by the system.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long customListId;

  /**
   * Output only. The display name of the custom list. .
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Output only. The resource name of the custom list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The unique ID of the custom list. Assigned by the system.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCustomListId() {
    return customListId;
  }

  /**
   * Output only. The unique ID of the custom list. Assigned by the system.
   * @param customListId customListId or {@code null} for none
   */
  public CustomList setCustomListId(java.lang.Long customListId) {
    this.customListId = customListId;
    return this;
  }

  /**
   * Output only. The display name of the custom list. .
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Output only. The display name of the custom list. .
   * @param displayName displayName or {@code null} for none
   */
  public CustomList setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Output only. The resource name of the custom list.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The resource name of the custom list.
   * @param name name or {@code null} for none
   */
  public CustomList setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public CustomList set(String fieldName, Object value) {
    return (CustomList) super.set(fieldName, value);
  }

  @Override
  public CustomList clone() {
    return (CustomList) super.clone();
  }

}

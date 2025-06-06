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

package com.google.api.services.migrationcenter.v1alpha1.model;

/**
 * A resource that represents an asset group. The purpose of an asset group is to bundle a set of
 * assets that have something in common, while allowing users to add annotations to the group. An
 * asset can belong to multiple groups.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Migration Center API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Group extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The timestamp when the group was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. The description of the group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Optional. User-friendly display name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Labels as key value pairs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Output only. The name of the group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The timestamp when the group was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. The timestamp when the group was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The timestamp when the group was created.
   * @param createTime createTime or {@code null} for none
   */
  public Group setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. The description of the group.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. The description of the group.
   * @param description description or {@code null} for none
   */
  public Group setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional. User-friendly display name.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Optional. User-friendly display name.
   * @param displayName displayName or {@code null} for none
   */
  public Group setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Labels as key value pairs.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Labels as key value pairs.
   * @param labels labels or {@code null} for none
   */
  public Group setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Output only. The name of the group.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The name of the group.
   * @param name name or {@code null} for none
   */
  public Group setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The timestamp when the group was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The timestamp when the group was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public Group setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Group set(String fieldName, Object value) {
    return (Group) super.set(fieldName, value);
  }

  @Override
  public Group clone() {
    return (Group) super.clone();
  }

}

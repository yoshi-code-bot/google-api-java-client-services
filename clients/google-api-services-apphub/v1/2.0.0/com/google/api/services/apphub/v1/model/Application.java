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

package com.google.api.services.apphub.v1.model;

/**
 * Application defines the governance boundary for App Hub entities that perform a logical end-to-
 * end business function. App Hub supports application level IAM permission to align with governance
 * requirements.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the App Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Application extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Consumer provided attributes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Attributes attributes;

  /**
   * Output only. Create time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. User-defined description of an Application. Can have a maximum length of 2048
   * characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Optional. User-defined name for the Application. Can have a maximum length of 63 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Identifier. The resource name of an Application. Format: `"projects/{host-project-
   * id}/locations/{location}/applications/{application-id}"`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. Immutable. Defines what data can be included into this Application. Limits which
   * Services and Workloads can be registered.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Scope scope;

  /**
   * Output only. Application state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. A universally unique identifier (in UUID4 format) for the `Application`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uid;

  /**
   * Output only. Update time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Optional. Consumer provided attributes.
   * @return value or {@code null} for none
   */
  public Attributes getAttributes() {
    return attributes;
  }

  /**
   * Optional. Consumer provided attributes.
   * @param attributes attributes or {@code null} for none
   */
  public Application setAttributes(Attributes attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Output only. Create time.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Create time.
   * @param createTime createTime or {@code null} for none
   */
  public Application setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. User-defined description of an Application. Can have a maximum length of 2048
   * characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. User-defined description of an Application. Can have a maximum length of 2048
   * characters.
   * @param description description or {@code null} for none
   */
  public Application setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional. User-defined name for the Application. Can have a maximum length of 63 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Optional. User-defined name for the Application. Can have a maximum length of 63 characters.
   * @param displayName displayName or {@code null} for none
   */
  public Application setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Identifier. The resource name of an Application. Format: `"projects/{host-project-
   * id}/locations/{location}/applications/{application-id}"`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Identifier. The resource name of an Application. Format: `"projects/{host-project-
   * id}/locations/{location}/applications/{application-id}"`
   * @param name name or {@code null} for none
   */
  public Application setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. Immutable. Defines what data can be included into this Application. Limits which
   * Services and Workloads can be registered.
   * @return value or {@code null} for none
   */
  public Scope getScope() {
    return scope;
  }

  /**
   * Required. Immutable. Defines what data can be included into this Application. Limits which
   * Services and Workloads can be registered.
   * @param scope scope or {@code null} for none
   */
  public Application setScope(Scope scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Output only. Application state.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. Application state.
   * @param state state or {@code null} for none
   */
  public Application setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. A universally unique identifier (in UUID4 format) for the `Application`.
   * @return value or {@code null} for none
   */
  public java.lang.String getUid() {
    return uid;
  }

  /**
   * Output only. A universally unique identifier (in UUID4 format) for the `Application`.
   * @param uid uid or {@code null} for none
   */
  public Application setUid(java.lang.String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * Output only. Update time.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Update time.
   * @param updateTime updateTime or {@code null} for none
   */
  public Application setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Application set(String fieldName, Object value) {
    return (Application) super.set(fieldName, value);
  }

  @Override
  public Application clone() {
    return (Application) super.clone();
  }

}

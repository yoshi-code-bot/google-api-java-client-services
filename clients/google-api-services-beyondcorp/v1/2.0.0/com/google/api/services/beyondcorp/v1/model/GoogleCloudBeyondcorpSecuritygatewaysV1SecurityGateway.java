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

package com.google.api.services.beyondcorp.v1.model;

/**
 * The information about a security gateway resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BeyondCorp API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudBeyondcorpSecuritygatewaysV1SecurityGateway extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Timestamp when the resource was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. Service account used for operations that involve resources in consumer projects.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String delegatingServiceAccount;

  /**
   * Optional. An arbitrary user-provided name for the SecurityGateway. Cannot exceed 64 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Output only. IP addresses that will be used for establishing connection to the endpoints.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> externalIps;

  /**
   * Optional. Map of Hubs that represents regional data path deployment with GCP region as a key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, GoogleCloudBeyondcorpSecuritygatewaysV1Hub> hubs;

  static {
    // hack to force ProGuard to consider GoogleCloudBeyondcorpSecuritygatewaysV1Hub used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudBeyondcorpSecuritygatewaysV1Hub.class);
  }

  /**
   * Identifier. Name of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The operational state of the SecurityGateway.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. Timestamp when the resource was last modified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. Timestamp when the resource was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Timestamp when the resource was created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudBeyondcorpSecuritygatewaysV1SecurityGateway setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. Service account used for operations that involve resources in consumer projects.
   * @return value or {@code null} for none
   */
  public java.lang.String getDelegatingServiceAccount() {
    return delegatingServiceAccount;
  }

  /**
   * Output only. Service account used for operations that involve resources in consumer projects.
   * @param delegatingServiceAccount delegatingServiceAccount or {@code null} for none
   */
  public GoogleCloudBeyondcorpSecuritygatewaysV1SecurityGateway setDelegatingServiceAccount(java.lang.String delegatingServiceAccount) {
    this.delegatingServiceAccount = delegatingServiceAccount;
    return this;
  }

  /**
   * Optional. An arbitrary user-provided name for the SecurityGateway. Cannot exceed 64 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Optional. An arbitrary user-provided name for the SecurityGateway. Cannot exceed 64 characters.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudBeyondcorpSecuritygatewaysV1SecurityGateway setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Output only. IP addresses that will be used for establishing connection to the endpoints.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getExternalIps() {
    return externalIps;
  }

  /**
   * Output only. IP addresses that will be used for establishing connection to the endpoints.
   * @param externalIps externalIps or {@code null} for none
   */
  public GoogleCloudBeyondcorpSecuritygatewaysV1SecurityGateway setExternalIps(java.util.List<java.lang.String> externalIps) {
    this.externalIps = externalIps;
    return this;
  }

  /**
   * Optional. Map of Hubs that represents regional data path deployment with GCP region as a key.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, GoogleCloudBeyondcorpSecuritygatewaysV1Hub> getHubs() {
    return hubs;
  }

  /**
   * Optional. Map of Hubs that represents regional data path deployment with GCP region as a key.
   * @param hubs hubs or {@code null} for none
   */
  public GoogleCloudBeyondcorpSecuritygatewaysV1SecurityGateway setHubs(java.util.Map<String, GoogleCloudBeyondcorpSecuritygatewaysV1Hub> hubs) {
    this.hubs = hubs;
    return this;
  }

  /**
   * Identifier. Name of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Identifier. Name of the resource.
   * @param name name or {@code null} for none
   */
  public GoogleCloudBeyondcorpSecuritygatewaysV1SecurityGateway setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The operational state of the SecurityGateway.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The operational state of the SecurityGateway.
   * @param state state or {@code null} for none
   */
  public GoogleCloudBeyondcorpSecuritygatewaysV1SecurityGateway setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. Timestamp when the resource was last modified.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Timestamp when the resource was last modified.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleCloudBeyondcorpSecuritygatewaysV1SecurityGateway setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GoogleCloudBeyondcorpSecuritygatewaysV1SecurityGateway set(String fieldName, Object value) {
    return (GoogleCloudBeyondcorpSecuritygatewaysV1SecurityGateway) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudBeyondcorpSecuritygatewaysV1SecurityGateway clone() {
    return (GoogleCloudBeyondcorpSecuritygatewaysV1SecurityGateway) super.clone();
  }

}

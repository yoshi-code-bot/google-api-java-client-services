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

package com.google.api.services.compute.model;

/**
 * Represents a health aggregation policy. A health aggregation policy resource defines a policy to
 * aggregate health. For more information, see Health checks overview.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HealthAggregationPolicy extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a HealthAggregationPolicy. An
   * up-to-date fingerprint must be provided in order to patch the HealthAggregationPolicy;
   * Otherwise, the request will fail with error 412 conditionNotMet. To see the latest fingerprint,
   * make a get() request to retrieve the HealthAggregationPolicy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fingerprint;

  /**
   * Can only be set if the policyType field is BACKEND_SERVICE_POLICY. Specifies the threshold (as
   * a percentage) of healthy endpoints required in order to consider the aggregated health result
   * HEALTHY. Defaults to 60. Must be in range [0, 100]. Not applicable if the policyType field is
   * DNB_PUBLIC_IP_POLICY. Can be mutated. This field is optional, and will be set to the default if
   * unspecified. Note that both this threshold and minHealthyThreshold must be satisfied in order
   * for HEALTHY to be the aggregated result. "Endpoints" refers to network endpoints within a
   * Network Endpoint Group or instances within an Instance Group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long healthyPercentThreshold;

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * [Output Only] Type of the resource. Always compute#healthAggregationPolicy for health
   * aggregation policies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Can only be set if the policyType field is BACKEND_SERVICE_POLICY. Specifies the minimum number
   * of healthy endpoints required in order to consider the aggregated health result HEALTHY.
   * Defaults to 1. Must be positive. Not applicable if the policyType field is
   * DNB_PUBLIC_IP_POLICY. Can be mutated. This field is optional, and will be set to the default if
   * unspecified. Note that both this threshold and healthyPercentThreshold must be satisfied in
   * order for HEALTHY to be the aggregated result. "Endpoints" refers to network endpoints within a
   * Network Endpoint Group or instances within an Instance Group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long minHealthyThreshold;

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Specifies the type of the healthAggregationPolicy. The only allowed value for global resources
   * is DNS_PUBLIC_IP_POLICY. The only allowed value for regional resources is
   * BACKEND_SERVICE_POLICY. Must be specified when the healthAggregationPolicy is created, and
   * cannot be mutated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String policyType;

  /**
   * [Output Only] URL of the region where the health aggregation policy resides. This field applies
   * only to the regional resource. You must specify this field as part of the HTTP request URL. It
   * is not settable as a field in the request body.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * [Output Only] Server-defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Output Only] Server-defined URL with id for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLinkWithId;

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public HealthAggregationPolicy setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @param description description or {@code null} for none
   */
  public HealthAggregationPolicy setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a HealthAggregationPolicy. An
   * up-to-date fingerprint must be provided in order to patch the HealthAggregationPolicy;
   * Otherwise, the request will fail with error 412 conditionNotMet. To see the latest fingerprint,
   * make a get() request to retrieve the HealthAggregationPolicy.
   * @see #decodeFingerprint()
   * @return value or {@code null} for none
   */
  public java.lang.String getFingerprint() {
    return fingerprint;
  }

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a HealthAggregationPolicy. An
   * up-to-date fingerprint must be provided in order to patch the HealthAggregationPolicy;
   * Otherwise, the request will fail with error 412 conditionNotMet. To see the latest fingerprint,
   * make a get() request to retrieve the HealthAggregationPolicy.
   * @see #getFingerprint()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeFingerprint() {
    return com.google.api.client.util.Base64.decodeBase64(fingerprint);
  }

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a HealthAggregationPolicy. An
   * up-to-date fingerprint must be provided in order to patch the HealthAggregationPolicy;
   * Otherwise, the request will fail with error 412 conditionNotMet. To see the latest fingerprint,
   * make a get() request to retrieve the HealthAggregationPolicy.
   * @see #encodeFingerprint()
   * @param fingerprint fingerprint or {@code null} for none
   */
  public HealthAggregationPolicy setFingerprint(java.lang.String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a HealthAggregationPolicy. An
   * up-to-date fingerprint must be provided in order to patch the HealthAggregationPolicy;
   * Otherwise, the request will fail with error 412 conditionNotMet. To see the latest fingerprint,
   * make a get() request to retrieve the HealthAggregationPolicy.
   * @see #setFingerprint()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public HealthAggregationPolicy encodeFingerprint(byte[] fingerprint) {
    this.fingerprint = com.google.api.client.util.Base64.encodeBase64URLSafeString(fingerprint);
    return this;
  }

  /**
   * Can only be set if the policyType field is BACKEND_SERVICE_POLICY. Specifies the threshold (as
   * a percentage) of healthy endpoints required in order to consider the aggregated health result
   * HEALTHY. Defaults to 60. Must be in range [0, 100]. Not applicable if the policyType field is
   * DNB_PUBLIC_IP_POLICY. Can be mutated. This field is optional, and will be set to the default if
   * unspecified. Note that both this threshold and minHealthyThreshold must be satisfied in order
   * for HEALTHY to be the aggregated result. "Endpoints" refers to network endpoints within a
   * Network Endpoint Group or instances within an Instance Group.
   * @return value or {@code null} for none
   */
  public java.lang.Long getHealthyPercentThreshold() {
    return healthyPercentThreshold;
  }

  /**
   * Can only be set if the policyType field is BACKEND_SERVICE_POLICY. Specifies the threshold (as
   * a percentage) of healthy endpoints required in order to consider the aggregated health result
   * HEALTHY. Defaults to 60. Must be in range [0, 100]. Not applicable if the policyType field is
   * DNB_PUBLIC_IP_POLICY. Can be mutated. This field is optional, and will be set to the default if
   * unspecified. Note that both this threshold and minHealthyThreshold must be satisfied in order
   * for HEALTHY to be the aggregated result. "Endpoints" refers to network endpoints within a
   * Network Endpoint Group or instances within an Instance Group.
   * @param healthyPercentThreshold healthyPercentThreshold or {@code null} for none
   */
  public HealthAggregationPolicy setHealthyPercentThreshold(java.lang.Long healthyPercentThreshold) {
    this.healthyPercentThreshold = healthyPercentThreshold;
    return this;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @param id id or {@code null} for none
   */
  public HealthAggregationPolicy setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * [Output Only] Type of the resource. Always compute#healthAggregationPolicy for health
   * aggregation policies.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource. Always compute#healthAggregationPolicy for health
   * aggregation policies.
   * @param kind kind or {@code null} for none
   */
  public HealthAggregationPolicy setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Can only be set if the policyType field is BACKEND_SERVICE_POLICY. Specifies the minimum number
   * of healthy endpoints required in order to consider the aggregated health result HEALTHY.
   * Defaults to 1. Must be positive. Not applicable if the policyType field is
   * DNB_PUBLIC_IP_POLICY. Can be mutated. This field is optional, and will be set to the default if
   * unspecified. Note that both this threshold and healthyPercentThreshold must be satisfied in
   * order for HEALTHY to be the aggregated result. "Endpoints" refers to network endpoints within a
   * Network Endpoint Group or instances within an Instance Group.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMinHealthyThreshold() {
    return minHealthyThreshold;
  }

  /**
   * Can only be set if the policyType field is BACKEND_SERVICE_POLICY. Specifies the minimum number
   * of healthy endpoints required in order to consider the aggregated health result HEALTHY.
   * Defaults to 1. Must be positive. Not applicable if the policyType field is
   * DNB_PUBLIC_IP_POLICY. Can be mutated. This field is optional, and will be set to the default if
   * unspecified. Note that both this threshold and healthyPercentThreshold must be satisfied in
   * order for HEALTHY to be the aggregated result. "Endpoints" refers to network endpoints within a
   * Network Endpoint Group or instances within an Instance Group.
   * @param minHealthyThreshold minHealthyThreshold or {@code null} for none
   */
  public HealthAggregationPolicy setMinHealthyThreshold(java.lang.Long minHealthyThreshold) {
    this.minHealthyThreshold = minHealthyThreshold;
    return this;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @param name name or {@code null} for none
   */
  public HealthAggregationPolicy setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Specifies the type of the healthAggregationPolicy. The only allowed value for global resources
   * is DNS_PUBLIC_IP_POLICY. The only allowed value for regional resources is
   * BACKEND_SERVICE_POLICY. Must be specified when the healthAggregationPolicy is created, and
   * cannot be mutated.
   * @return value or {@code null} for none
   */
  public java.lang.String getPolicyType() {
    return policyType;
  }

  /**
   * Specifies the type of the healthAggregationPolicy. The only allowed value for global resources
   * is DNS_PUBLIC_IP_POLICY. The only allowed value for regional resources is
   * BACKEND_SERVICE_POLICY. Must be specified when the healthAggregationPolicy is created, and
   * cannot be mutated.
   * @param policyType policyType or {@code null} for none
   */
  public HealthAggregationPolicy setPolicyType(java.lang.String policyType) {
    this.policyType = policyType;
    return this;
  }

  /**
   * [Output Only] URL of the region where the health aggregation policy resides. This field applies
   * only to the regional resource. You must specify this field as part of the HTTP request URL. It
   * is not settable as a field in the request body.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * [Output Only] URL of the region where the health aggregation policy resides. This field applies
   * only to the regional resource. You must specify this field as part of the HTTP request URL. It
   * is not settable as a field in the request body.
   * @param region region or {@code null} for none
   */
  public HealthAggregationPolicy setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public HealthAggregationPolicy setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * [Output Only] Server-defined URL with id for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLinkWithId() {
    return selfLinkWithId;
  }

  /**
   * [Output Only] Server-defined URL with id for the resource.
   * @param selfLinkWithId selfLinkWithId or {@code null} for none
   */
  public HealthAggregationPolicy setSelfLinkWithId(java.lang.String selfLinkWithId) {
    this.selfLinkWithId = selfLinkWithId;
    return this;
  }

  @Override
  public HealthAggregationPolicy set(String fieldName, Object value) {
    return (HealthAggregationPolicy) super.set(fieldName, value);
  }

  @Override
  public HealthAggregationPolicy clone() {
    return (HealthAggregationPolicy) super.clone();
  }

}

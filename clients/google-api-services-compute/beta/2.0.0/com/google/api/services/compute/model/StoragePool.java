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
 * Represents a zonal storage pool resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class StoragePool extends com.google.api.client.json.GenericJson {

  /**
   * Provisioning type of the byte capacity of the pool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String capacityProvisioningType;

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
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * [Output Only] Type of the resource. Always compute#storagePool for storage pools.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * A fingerprint for the labels being applied to this storage pool, which is essentially a hash of
   * the labels set used for optimistic locking. The fingerprint is initially generated by Compute
   * Engine and changes after every request to modify or update labels. You must always provide an
   * up-to-date fingerprint hash in order to update or change labels, otherwise the request will
   * fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to
   * retrieve a storage pool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String labelFingerprint;

  /**
   * Labels to apply to this storage pool. These can be later modified by the setLabels method.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

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
   * Provisioning type of the performance-related parameters of the pool, such as throughput and
   * IOPS.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String performanceProvisioningType;

  /**
   * Size of the storage pool in GiB. For more information about the size limits, see
   * https://cloud.google.com/compute/docs/disks/storage-pools.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long poolProvisionedCapacityGb;

  /**
   * Provisioned IOPS of the storage pool. Only relevant if the storage pool type is hyperdisk-
   * balanced.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long poolProvisionedIops;

  /**
   * Provisioned throughput of the storage pool in MiB/s. Only relevant if the storage pool type is
   * hyperdisk-balanced or hyperdisk-throughput.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long poolProvisionedThroughput;

  /**
   * [Output Only] Status information for the storage pool resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StoragePoolResourceStatus resourceStatus;

  /**
   * [Output Only] Server-defined fully-qualified URL for this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Output Only] Server-defined URL for this resource's resource id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLinkWithId;

  /**
   * [Output Only] The status of storage pool creation. - CREATING: Storage pool is provisioning.
   * storagePool. - FAILED: Storage pool creation failed. - READY: Storage pool is ready for use. -
   * DELETING: Storage pool is deleting.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * [Output Only] Status information for the storage pool resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StoragePoolResourceStatus status;

  /**
   * Type of the storage pool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String storagePoolType;

  /**
   * [Output Only] URL of the zone where the storage pool resides. You must specify this field as
   * part of the HTTP request URL. It is not settable as a field in the request body.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * Provisioning type of the byte capacity of the pool.
   * @return value or {@code null} for none
   */
  public java.lang.String getCapacityProvisioningType() {
    return capacityProvisioningType;
  }

  /**
   * Provisioning type of the byte capacity of the pool.
   * @param capacityProvisioningType capacityProvisioningType or {@code null} for none
   */
  public StoragePool setCapacityProvisioningType(java.lang.String capacityProvisioningType) {
    this.capacityProvisioningType = capacityProvisioningType;
    return this;
  }

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
  public StoragePool setCreationTimestamp(java.lang.String creationTimestamp) {
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
  public StoragePool setDescription(java.lang.String description) {
    this.description = description;
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
  public StoragePool setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * [Output Only] Type of the resource. Always compute#storagePool for storage pools.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource. Always compute#storagePool for storage pools.
   * @param kind kind or {@code null} for none
   */
  public StoragePool setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * A fingerprint for the labels being applied to this storage pool, which is essentially a hash of
   * the labels set used for optimistic locking. The fingerprint is initially generated by Compute
   * Engine and changes after every request to modify or update labels. You must always provide an
   * up-to-date fingerprint hash in order to update or change labels, otherwise the request will
   * fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to
   * retrieve a storage pool.
   * @see #decodeLabelFingerprint()
   * @return value or {@code null} for none
   */
  public java.lang.String getLabelFingerprint() {
    return labelFingerprint;
  }

  /**
   * A fingerprint for the labels being applied to this storage pool, which is essentially a hash of
   * the labels set used for optimistic locking. The fingerprint is initially generated by Compute
   * Engine and changes after every request to modify or update labels. You must always provide an
   * up-to-date fingerprint hash in order to update or change labels, otherwise the request will
   * fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to
   * retrieve a storage pool.
   * @see #getLabelFingerprint()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeLabelFingerprint() {
    return com.google.api.client.util.Base64.decodeBase64(labelFingerprint);
  }

  /**
   * A fingerprint for the labels being applied to this storage pool, which is essentially a hash of
   * the labels set used for optimistic locking. The fingerprint is initially generated by Compute
   * Engine and changes after every request to modify or update labels. You must always provide an
   * up-to-date fingerprint hash in order to update or change labels, otherwise the request will
   * fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to
   * retrieve a storage pool.
   * @see #encodeLabelFingerprint()
   * @param labelFingerprint labelFingerprint or {@code null} for none
   */
  public StoragePool setLabelFingerprint(java.lang.String labelFingerprint) {
    this.labelFingerprint = labelFingerprint;
    return this;
  }

  /**
   * A fingerprint for the labels being applied to this storage pool, which is essentially a hash of
   * the labels set used for optimistic locking. The fingerprint is initially generated by Compute
   * Engine and changes after every request to modify or update labels. You must always provide an
   * up-to-date fingerprint hash in order to update or change labels, otherwise the request will
   * fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to
   * retrieve a storage pool.
   * @see #setLabelFingerprint()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public StoragePool encodeLabelFingerprint(byte[] labelFingerprint) {
    this.labelFingerprint = com.google.api.client.util.Base64.encodeBase64URLSafeString(labelFingerprint);
    return this;
  }

  /**
   * Labels to apply to this storage pool. These can be later modified by the setLabels method.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Labels to apply to this storage pool. These can be later modified by the setLabels method.
   * @param labels labels or {@code null} for none
   */
  public StoragePool setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
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
  public StoragePool setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Provisioning type of the performance-related parameters of the pool, such as throughput and
   * IOPS.
   * @return value or {@code null} for none
   */
  public java.lang.String getPerformanceProvisioningType() {
    return performanceProvisioningType;
  }

  /**
   * Provisioning type of the performance-related parameters of the pool, such as throughput and
   * IOPS.
   * @param performanceProvisioningType performanceProvisioningType or {@code null} for none
   */
  public StoragePool setPerformanceProvisioningType(java.lang.String performanceProvisioningType) {
    this.performanceProvisioningType = performanceProvisioningType;
    return this;
  }

  /**
   * Size of the storage pool in GiB. For more information about the size limits, see
   * https://cloud.google.com/compute/docs/disks/storage-pools.
   * @return value or {@code null} for none
   */
  public java.lang.Long getPoolProvisionedCapacityGb() {
    return poolProvisionedCapacityGb;
  }

  /**
   * Size of the storage pool in GiB. For more information about the size limits, see
   * https://cloud.google.com/compute/docs/disks/storage-pools.
   * @param poolProvisionedCapacityGb poolProvisionedCapacityGb or {@code null} for none
   */
  public StoragePool setPoolProvisionedCapacityGb(java.lang.Long poolProvisionedCapacityGb) {
    this.poolProvisionedCapacityGb = poolProvisionedCapacityGb;
    return this;
  }

  /**
   * Provisioned IOPS of the storage pool. Only relevant if the storage pool type is hyperdisk-
   * balanced.
   * @return value or {@code null} for none
   */
  public java.lang.Long getPoolProvisionedIops() {
    return poolProvisionedIops;
  }

  /**
   * Provisioned IOPS of the storage pool. Only relevant if the storage pool type is hyperdisk-
   * balanced.
   * @param poolProvisionedIops poolProvisionedIops or {@code null} for none
   */
  public StoragePool setPoolProvisionedIops(java.lang.Long poolProvisionedIops) {
    this.poolProvisionedIops = poolProvisionedIops;
    return this;
  }

  /**
   * Provisioned throughput of the storage pool in MiB/s. Only relevant if the storage pool type is
   * hyperdisk-balanced or hyperdisk-throughput.
   * @return value or {@code null} for none
   */
  public java.lang.Long getPoolProvisionedThroughput() {
    return poolProvisionedThroughput;
  }

  /**
   * Provisioned throughput of the storage pool in MiB/s. Only relevant if the storage pool type is
   * hyperdisk-balanced or hyperdisk-throughput.
   * @param poolProvisionedThroughput poolProvisionedThroughput or {@code null} for none
   */
  public StoragePool setPoolProvisionedThroughput(java.lang.Long poolProvisionedThroughput) {
    this.poolProvisionedThroughput = poolProvisionedThroughput;
    return this;
  }

  /**
   * [Output Only] Status information for the storage pool resource.
   * @return value or {@code null} for none
   */
  public StoragePoolResourceStatus getResourceStatus() {
    return resourceStatus;
  }

  /**
   * [Output Only] Status information for the storage pool resource.
   * @param resourceStatus resourceStatus or {@code null} for none
   */
  public StoragePool setResourceStatus(StoragePoolResourceStatus resourceStatus) {
    this.resourceStatus = resourceStatus;
    return this;
  }

  /**
   * [Output Only] Server-defined fully-qualified URL for this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined fully-qualified URL for this resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public StoragePool setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for this resource's resource id.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLinkWithId() {
    return selfLinkWithId;
  }

  /**
   * [Output Only] Server-defined URL for this resource's resource id.
   * @param selfLinkWithId selfLinkWithId or {@code null} for none
   */
  public StoragePool setSelfLinkWithId(java.lang.String selfLinkWithId) {
    this.selfLinkWithId = selfLinkWithId;
    return this;
  }

  /**
   * [Output Only] The status of storage pool creation. - CREATING: Storage pool is provisioning.
   * storagePool. - FAILED: Storage pool creation failed. - READY: Storage pool is ready for use. -
   * DELETING: Storage pool is deleting.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * [Output Only] The status of storage pool creation. - CREATING: Storage pool is provisioning.
   * storagePool. - FAILED: Storage pool creation failed. - READY: Storage pool is ready for use. -
   * DELETING: Storage pool is deleting.
   * @param state state or {@code null} for none
   */
  public StoragePool setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * [Output Only] Status information for the storage pool resource.
   * @return value or {@code null} for none
   */
  public StoragePoolResourceStatus getStatus() {
    return status;
  }

  /**
   * [Output Only] Status information for the storage pool resource.
   * @param status status or {@code null} for none
   */
  public StoragePool setStatus(StoragePoolResourceStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Type of the storage pool.
   * @return value or {@code null} for none
   */
  public java.lang.String getStoragePoolType() {
    return storagePoolType;
  }

  /**
   * Type of the storage pool.
   * @param storagePoolType storagePoolType or {@code null} for none
   */
  public StoragePool setStoragePoolType(java.lang.String storagePoolType) {
    this.storagePoolType = storagePoolType;
    return this;
  }

  /**
   * [Output Only] URL of the zone where the storage pool resides. You must specify this field as
   * part of the HTTP request URL. It is not settable as a field in the request body.
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * [Output Only] URL of the zone where the storage pool resides. You must specify this field as
   * part of the HTTP request URL. It is not settable as a field in the request body.
   * @param zone zone or {@code null} for none
   */
  public StoragePool setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public StoragePool set(String fieldName, Object value) {
    return (StoragePool) super.set(fieldName, value);
  }

  @Override
  public StoragePool clone() {
    return (StoragePool) super.clone();
  }

}

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

package com.google.api.services.backupdr.v1.model;

/**
 * DiskRestoreProperties represents the properties of a Disk restore.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Backup and DR Service API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DiskRestoreProperties extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The access mode of the disk.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String accessMode;

  /**
   * Optional. The architecture of the source disk. Valid values are ARM64 or X86_64.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String architecture;

  /**
   * Optional. An optional description of this resource. Provide this property when you create the
   * resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Optional. Encrypts the disk using a customer-supplied encryption key or a customer-managed
   * encryption key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CustomerEncryptionKey diskEncryptionKey;

  /**
   * Optional. Indicates whether this disk is using confidential compute mode. Encryption with a
   * Cloud KMS key is required to enable this option.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableConfidentialCompute;

  /**
   * Optional. A list of features to enable in the guest operating system. This is applicable only
   * for bootable images.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GuestOsFeature> guestOsFeature;

  /**
   * Optional. Labels to apply to this disk. These can be modified later using setLabels method.
   * Label values can be empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Optional. A list of publicly available licenses that are applicable to this backup. This is
   * applicable if the original image had licenses attached, e.g. Windows image
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> licenses;

  /**
   * Required. Name of the disk.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. Physical block size of the persistent disk, in bytes. If not present in a request, a
   * default value is used. Currently, the supported size is 4096.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long physicalBlockSizeBytes;

  /**
   * Optional. Indicates how many IOPS to provision for the disk. This sets the number of I/O
   * operations per second that the disk can handle.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long provisionedIops;

  /**
   * Optional. Indicates how much throughput to provision for the disk. This sets the number of
   * throughput MB per second that the disk can handle.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long provisionedThroughput;

  /**
   * Optional. Resource manager tags to be bound to the disk.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> resourceManagerTags;

  /**
   * Optional. Resource policies applied to this disk.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> resourcePolicy;

  /**
   * Required. The size of the disk in GB.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long sizeGb;

  /**
   * Optional. The storage pool in which the new disk is created. You can provide this as a partial
   * or full URL to the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String storagePool;

  /**
   * Required. URL of the disk type resource describing which disk type to use to create the disk.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Optional. The access mode of the disk.
   * @return value or {@code null} for none
   */
  public java.lang.String getAccessMode() {
    return accessMode;
  }

  /**
   * Optional. The access mode of the disk.
   * @param accessMode accessMode or {@code null} for none
   */
  public DiskRestoreProperties setAccessMode(java.lang.String accessMode) {
    this.accessMode = accessMode;
    return this;
  }

  /**
   * Optional. The architecture of the source disk. Valid values are ARM64 or X86_64.
   * @return value or {@code null} for none
   */
  public java.lang.String getArchitecture() {
    return architecture;
  }

  /**
   * Optional. The architecture of the source disk. Valid values are ARM64 or X86_64.
   * @param architecture architecture or {@code null} for none
   */
  public DiskRestoreProperties setArchitecture(java.lang.String architecture) {
    this.architecture = architecture;
    return this;
  }

  /**
   * Optional. An optional description of this resource. Provide this property when you create the
   * resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. An optional description of this resource. Provide this property when you create the
   * resource.
   * @param description description or {@code null} for none
   */
  public DiskRestoreProperties setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional. Encrypts the disk using a customer-supplied encryption key or a customer-managed
   * encryption key.
   * @return value or {@code null} for none
   */
  public CustomerEncryptionKey getDiskEncryptionKey() {
    return diskEncryptionKey;
  }

  /**
   * Optional. Encrypts the disk using a customer-supplied encryption key or a customer-managed
   * encryption key.
   * @param diskEncryptionKey diskEncryptionKey or {@code null} for none
   */
  public DiskRestoreProperties setDiskEncryptionKey(CustomerEncryptionKey diskEncryptionKey) {
    this.diskEncryptionKey = diskEncryptionKey;
    return this;
  }

  /**
   * Optional. Indicates whether this disk is using confidential compute mode. Encryption with a
   * Cloud KMS key is required to enable this option.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableConfidentialCompute() {
    return enableConfidentialCompute;
  }

  /**
   * Optional. Indicates whether this disk is using confidential compute mode. Encryption with a
   * Cloud KMS key is required to enable this option.
   * @param enableConfidentialCompute enableConfidentialCompute or {@code null} for none
   */
  public DiskRestoreProperties setEnableConfidentialCompute(java.lang.Boolean enableConfidentialCompute) {
    this.enableConfidentialCompute = enableConfidentialCompute;
    return this;
  }

  /**
   * Optional. A list of features to enable in the guest operating system. This is applicable only
   * for bootable images.
   * @return value or {@code null} for none
   */
  public java.util.List<GuestOsFeature> getGuestOsFeature() {
    return guestOsFeature;
  }

  /**
   * Optional. A list of features to enable in the guest operating system. This is applicable only
   * for bootable images.
   * @param guestOsFeature guestOsFeature or {@code null} for none
   */
  public DiskRestoreProperties setGuestOsFeature(java.util.List<GuestOsFeature> guestOsFeature) {
    this.guestOsFeature = guestOsFeature;
    return this;
  }

  /**
   * Optional. Labels to apply to this disk. These can be modified later using setLabels method.
   * Label values can be empty.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. Labels to apply to this disk. These can be modified later using setLabels method.
   * Label values can be empty.
   * @param labels labels or {@code null} for none
   */
  public DiskRestoreProperties setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Optional. A list of publicly available licenses that are applicable to this backup. This is
   * applicable if the original image had licenses attached, e.g. Windows image
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getLicenses() {
    return licenses;
  }

  /**
   * Optional. A list of publicly available licenses that are applicable to this backup. This is
   * applicable if the original image had licenses attached, e.g. Windows image
   * @param licenses licenses or {@code null} for none
   */
  public DiskRestoreProperties setLicenses(java.util.List<java.lang.String> licenses) {
    this.licenses = licenses;
    return this;
  }

  /**
   * Required. Name of the disk.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. Name of the disk.
   * @param name name or {@code null} for none
   */
  public DiskRestoreProperties setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. Physical block size of the persistent disk, in bytes. If not present in a request, a
   * default value is used. Currently, the supported size is 4096.
   * @return value or {@code null} for none
   */
  public java.lang.Long getPhysicalBlockSizeBytes() {
    return physicalBlockSizeBytes;
  }

  /**
   * Optional. Physical block size of the persistent disk, in bytes. If not present in a request, a
   * default value is used. Currently, the supported size is 4096.
   * @param physicalBlockSizeBytes physicalBlockSizeBytes or {@code null} for none
   */
  public DiskRestoreProperties setPhysicalBlockSizeBytes(java.lang.Long physicalBlockSizeBytes) {
    this.physicalBlockSizeBytes = physicalBlockSizeBytes;
    return this;
  }

  /**
   * Optional. Indicates how many IOPS to provision for the disk. This sets the number of I/O
   * operations per second that the disk can handle.
   * @return value or {@code null} for none
   */
  public java.lang.Long getProvisionedIops() {
    return provisionedIops;
  }

  /**
   * Optional. Indicates how many IOPS to provision for the disk. This sets the number of I/O
   * operations per second that the disk can handle.
   * @param provisionedIops provisionedIops or {@code null} for none
   */
  public DiskRestoreProperties setProvisionedIops(java.lang.Long provisionedIops) {
    this.provisionedIops = provisionedIops;
    return this;
  }

  /**
   * Optional. Indicates how much throughput to provision for the disk. This sets the number of
   * throughput MB per second that the disk can handle.
   * @return value or {@code null} for none
   */
  public java.lang.Long getProvisionedThroughput() {
    return provisionedThroughput;
  }

  /**
   * Optional. Indicates how much throughput to provision for the disk. This sets the number of
   * throughput MB per second that the disk can handle.
   * @param provisionedThroughput provisionedThroughput or {@code null} for none
   */
  public DiskRestoreProperties setProvisionedThroughput(java.lang.Long provisionedThroughput) {
    this.provisionedThroughput = provisionedThroughput;
    return this;
  }

  /**
   * Optional. Resource manager tags to be bound to the disk.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getResourceManagerTags() {
    return resourceManagerTags;
  }

  /**
   * Optional. Resource manager tags to be bound to the disk.
   * @param resourceManagerTags resourceManagerTags or {@code null} for none
   */
  public DiskRestoreProperties setResourceManagerTags(java.util.Map<String, java.lang.String> resourceManagerTags) {
    this.resourceManagerTags = resourceManagerTags;
    return this;
  }

  /**
   * Optional. Resource policies applied to this disk.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getResourcePolicy() {
    return resourcePolicy;
  }

  /**
   * Optional. Resource policies applied to this disk.
   * @param resourcePolicy resourcePolicy or {@code null} for none
   */
  public DiskRestoreProperties setResourcePolicy(java.util.List<java.lang.String> resourcePolicy) {
    this.resourcePolicy = resourcePolicy;
    return this;
  }

  /**
   * Required. The size of the disk in GB.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSizeGb() {
    return sizeGb;
  }

  /**
   * Required. The size of the disk in GB.
   * @param sizeGb sizeGb or {@code null} for none
   */
  public DiskRestoreProperties setSizeGb(java.lang.Long sizeGb) {
    this.sizeGb = sizeGb;
    return this;
  }

  /**
   * Optional. The storage pool in which the new disk is created. You can provide this as a partial
   * or full URL to the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getStoragePool() {
    return storagePool;
  }

  /**
   * Optional. The storage pool in which the new disk is created. You can provide this as a partial
   * or full URL to the resource.
   * @param storagePool storagePool or {@code null} for none
   */
  public DiskRestoreProperties setStoragePool(java.lang.String storagePool) {
    this.storagePool = storagePool;
    return this;
  }

  /**
   * Required. URL of the disk type resource describing which disk type to use to create the disk.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Required. URL of the disk type resource describing which disk type to use to create the disk.
   * @param type type or {@code null} for none
   */
  public DiskRestoreProperties setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public DiskRestoreProperties set(String fieldName, Object value) {
    return (DiskRestoreProperties) super.set(fieldName, value);
  }

  @Override
  public DiskRestoreProperties clone() {
    return (DiskRestoreProperties) super.clone();
  }

}

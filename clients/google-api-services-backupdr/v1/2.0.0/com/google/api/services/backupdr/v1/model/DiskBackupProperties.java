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
 * DiskBackupProperties represents the properties of a Disk backup.
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
public final class DiskBackupProperties extends com.google.api.client.json.GenericJson {

  /**
   * The architecture of the source disk. Valid values are ARM64 or X86_64.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String architecture;

  /**
   * A description of the source disk.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * A list of guest OS features that are applicable to this backup.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GuestOsFeature> guestOsFeature;

  /**
   * A list of publicly available licenses that are applicable to this backup. This is applicable if
   * the original image had licenses attached, e.g. Windows image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> licenses;

  /**
   * Region and zone are mutually exclusive fields. The URL of the region of the source disk.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * The URL of the Zones where the source disk should be replicated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> replicaZones;

  /**
   * Size(in GB) of the source disk.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long sizeGb;

  /**
   * The source disk used to create this backup.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceDisk;

  /**
   * The URL of the type of the disk.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The URL of the Zone where the source disk.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * The architecture of the source disk. Valid values are ARM64 or X86_64.
   * @return value or {@code null} for none
   */
  public java.lang.String getArchitecture() {
    return architecture;
  }

  /**
   * The architecture of the source disk. Valid values are ARM64 or X86_64.
   * @param architecture architecture or {@code null} for none
   */
  public DiskBackupProperties setArchitecture(java.lang.String architecture) {
    this.architecture = architecture;
    return this;
  }

  /**
   * A description of the source disk.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * A description of the source disk.
   * @param description description or {@code null} for none
   */
  public DiskBackupProperties setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * A list of guest OS features that are applicable to this backup.
   * @return value or {@code null} for none
   */
  public java.util.List<GuestOsFeature> getGuestOsFeature() {
    return guestOsFeature;
  }

  /**
   * A list of guest OS features that are applicable to this backup.
   * @param guestOsFeature guestOsFeature or {@code null} for none
   */
  public DiskBackupProperties setGuestOsFeature(java.util.List<GuestOsFeature> guestOsFeature) {
    this.guestOsFeature = guestOsFeature;
    return this;
  }

  /**
   * A list of publicly available licenses that are applicable to this backup. This is applicable if
   * the original image had licenses attached, e.g. Windows image.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getLicenses() {
    return licenses;
  }

  /**
   * A list of publicly available licenses that are applicable to this backup. This is applicable if
   * the original image had licenses attached, e.g. Windows image.
   * @param licenses licenses or {@code null} for none
   */
  public DiskBackupProperties setLicenses(java.util.List<java.lang.String> licenses) {
    this.licenses = licenses;
    return this;
  }

  /**
   * Region and zone are mutually exclusive fields. The URL of the region of the source disk.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * Region and zone are mutually exclusive fields. The URL of the region of the source disk.
   * @param region region or {@code null} for none
   */
  public DiskBackupProperties setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * The URL of the Zones where the source disk should be replicated.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getReplicaZones() {
    return replicaZones;
  }

  /**
   * The URL of the Zones where the source disk should be replicated.
   * @param replicaZones replicaZones or {@code null} for none
   */
  public DiskBackupProperties setReplicaZones(java.util.List<java.lang.String> replicaZones) {
    this.replicaZones = replicaZones;
    return this;
  }

  /**
   * Size(in GB) of the source disk.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSizeGb() {
    return sizeGb;
  }

  /**
   * Size(in GB) of the source disk.
   * @param sizeGb sizeGb or {@code null} for none
   */
  public DiskBackupProperties setSizeGb(java.lang.Long sizeGb) {
    this.sizeGb = sizeGb;
    return this;
  }

  /**
   * The source disk used to create this backup.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceDisk() {
    return sourceDisk;
  }

  /**
   * The source disk used to create this backup.
   * @param sourceDisk sourceDisk or {@code null} for none
   */
  public DiskBackupProperties setSourceDisk(java.lang.String sourceDisk) {
    this.sourceDisk = sourceDisk;
    return this;
  }

  /**
   * The URL of the type of the disk.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The URL of the type of the disk.
   * @param type type or {@code null} for none
   */
  public DiskBackupProperties setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * The URL of the Zone where the source disk.
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * The URL of the Zone where the source disk.
   * @param zone zone or {@code null} for none
   */
  public DiskBackupProperties setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public DiskBackupProperties set(String fieldName, Object value) {
    return (DiskBackupProperties) super.set(fieldName, value);
  }

  @Override
  public DiskBackupProperties clone() {
    return (DiskBackupProperties) super.clone();
  }

}

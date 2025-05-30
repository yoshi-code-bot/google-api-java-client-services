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

package com.google.api.services.datamigration.v1.model;

/**
 * Settings for creating a Cloud SQL database instance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Database Migration API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CloudSqlSettings extends com.google.api.client.json.GenericJson {

  /**
   * The activation policy specifies when the instance is activated; it is applicable only when the
   * instance state is 'RUNNABLE'. Valid values: 'ALWAYS': The instance is on, and remains so even
   * in the absence of connection requests. `NEVER`: The instance is off; it is not activated, even
   * if a connection request arrives.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String activationPolicy;

  /**
   * [default: ON] If you enable this setting, Cloud SQL checks your available storage every 30
   * seconds. If the available storage falls below a threshold size, Cloud SQL automatically adds
   * additional storage capacity. If the available storage repeatedly falls below the threshold
   * size, Cloud SQL continues to add storage until it reaches the maximum of 30 TB.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean autoStorageIncrease;

  /**
   * Optional. Availability type. Potential values: * `ZONAL`: The instance serves data from only
   * one zone. Outages in that zone affect data availability. * `REGIONAL`: The instance can serve
   * data from more than one zone in a region (it is highly available).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String availabilityType;

  /**
   * The KMS key name used for the csql instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cmekKeyName;

  /**
   * The Cloud SQL default instance level collation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String collation;

  /**
   * Optional. Data cache is an optional feature available for Cloud SQL for MySQL Enterprise Plus
   * edition only. For more information on data cache, see [Data cache
   * overview](https://cloud.google.com/sql/help/mysql-data-cache) in Cloud SQL documentation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DataCacheConfig dataCacheConfig;

  /**
   * Optional. Provisioned number of I/O operations per second for the data disk. This field is only
   * used for hyperdisk-balanced disk types.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long dataDiskProvisionedIops;

  /**
   * Optional. Provisioned throughput measured in MiB per second for the data disk. This field is
   * only used for hyperdisk-balanced disk types.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long dataDiskProvisionedThroughput;

  /**
   * The storage capacity available to the database, in GB. The minimum (and default) size is 10GB.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long dataDiskSizeGb;

  /**
   * The type of storage: `PD_SSD` (default) or `PD_HDD` or `HYPERDISK_BALANCED`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataDiskType;

  /**
   * The database flags passed to the Cloud SQL instance at startup. An object containing a list of
   * "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> databaseFlags;

  /**
   * The database engine type and version. Deprecated. Use database_version_name instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String databaseVersion;

  /**
   * Optional. The database engine type and version name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String databaseVersionName;

  /**
   * Optional. The edition of the given Cloud SQL instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String edition;

  /**
   * The settings for IP Management. This allows to enable or disable the instance IP and manage
   * which external networks can connect to the instance. The IPv4 address cannot be disabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SqlIpConfig ipConfig;

  /**
   * Input only. Initial root password.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rootPassword;

  /**
   * Output only. Indicates If this connection profile root password is stored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean rootPasswordSet;

  /**
   * Optional. The Google Cloud Platform zone where the failover Cloud SQL database instance is
   * located. Used when the Cloud SQL database availability type is REGIONAL (i.e. multiple zones /
   * highly available).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String secondaryZone;

  /**
   * The Database Migration Service source connection profile ID, in the format:
   * `projects/my_project_name/locations/us-central1/connectionProfiles/connection_profile_ID`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceId;

  /**
   * The maximum size to which storage capacity can be automatically increased. The default value is
   * 0, which specifies that there is no limit.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long storageAutoResizeLimit;

  /**
   * The tier (or machine type) for this instance, for example: `db-n1-standard-1` (MySQL instances)
   * or `db-custom-1-3840` (PostgreSQL instances). For more information, see [Cloud SQL Instance
   * Settings](https://cloud.google.com/sql/docs/mysql/instance-settings).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tier;

  /**
   * The resource labels for a Cloud SQL instance to use to annotate any related underlying
   * resources such as Compute Engine VMs. An object containing a list of "key": "value" pairs.
   * Example: `{ "name": "wrench", "mass": "18kg", "count": "3" }`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> userLabels;

  /**
   * The Google Cloud Platform zone where your Cloud SQL database instance is located.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * The activation policy specifies when the instance is activated; it is applicable only when the
   * instance state is 'RUNNABLE'. Valid values: 'ALWAYS': The instance is on, and remains so even
   * in the absence of connection requests. `NEVER`: The instance is off; it is not activated, even
   * if a connection request arrives.
   * @return value or {@code null} for none
   */
  public java.lang.String getActivationPolicy() {
    return activationPolicy;
  }

  /**
   * The activation policy specifies when the instance is activated; it is applicable only when the
   * instance state is 'RUNNABLE'. Valid values: 'ALWAYS': The instance is on, and remains so even
   * in the absence of connection requests. `NEVER`: The instance is off; it is not activated, even
   * if a connection request arrives.
   * @param activationPolicy activationPolicy or {@code null} for none
   */
  public CloudSqlSettings setActivationPolicy(java.lang.String activationPolicy) {
    this.activationPolicy = activationPolicy;
    return this;
  }

  /**
   * [default: ON] If you enable this setting, Cloud SQL checks your available storage every 30
   * seconds. If the available storage falls below a threshold size, Cloud SQL automatically adds
   * additional storage capacity. If the available storage repeatedly falls below the threshold
   * size, Cloud SQL continues to add storage until it reaches the maximum of 30 TB.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAutoStorageIncrease() {
    return autoStorageIncrease;
  }

  /**
   * [default: ON] If you enable this setting, Cloud SQL checks your available storage every 30
   * seconds. If the available storage falls below a threshold size, Cloud SQL automatically adds
   * additional storage capacity. If the available storage repeatedly falls below the threshold
   * size, Cloud SQL continues to add storage until it reaches the maximum of 30 TB.
   * @param autoStorageIncrease autoStorageIncrease or {@code null} for none
   */
  public CloudSqlSettings setAutoStorageIncrease(java.lang.Boolean autoStorageIncrease) {
    this.autoStorageIncrease = autoStorageIncrease;
    return this;
  }

  /**
   * Optional. Availability type. Potential values: * `ZONAL`: The instance serves data from only
   * one zone. Outages in that zone affect data availability. * `REGIONAL`: The instance can serve
   * data from more than one zone in a region (it is highly available).
   * @return value or {@code null} for none
   */
  public java.lang.String getAvailabilityType() {
    return availabilityType;
  }

  /**
   * Optional. Availability type. Potential values: * `ZONAL`: The instance serves data from only
   * one zone. Outages in that zone affect data availability. * `REGIONAL`: The instance can serve
   * data from more than one zone in a region (it is highly available).
   * @param availabilityType availabilityType or {@code null} for none
   */
  public CloudSqlSettings setAvailabilityType(java.lang.String availabilityType) {
    this.availabilityType = availabilityType;
    return this;
  }

  /**
   * The KMS key name used for the csql instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getCmekKeyName() {
    return cmekKeyName;
  }

  /**
   * The KMS key name used for the csql instance.
   * @param cmekKeyName cmekKeyName or {@code null} for none
   */
  public CloudSqlSettings setCmekKeyName(java.lang.String cmekKeyName) {
    this.cmekKeyName = cmekKeyName;
    return this;
  }

  /**
   * The Cloud SQL default instance level collation.
   * @return value or {@code null} for none
   */
  public java.lang.String getCollation() {
    return collation;
  }

  /**
   * The Cloud SQL default instance level collation.
   * @param collation collation or {@code null} for none
   */
  public CloudSqlSettings setCollation(java.lang.String collation) {
    this.collation = collation;
    return this;
  }

  /**
   * Optional. Data cache is an optional feature available for Cloud SQL for MySQL Enterprise Plus
   * edition only. For more information on data cache, see [Data cache
   * overview](https://cloud.google.com/sql/help/mysql-data-cache) in Cloud SQL documentation.
   * @return value or {@code null} for none
   */
  public DataCacheConfig getDataCacheConfig() {
    return dataCacheConfig;
  }

  /**
   * Optional. Data cache is an optional feature available for Cloud SQL for MySQL Enterprise Plus
   * edition only. For more information on data cache, see [Data cache
   * overview](https://cloud.google.com/sql/help/mysql-data-cache) in Cloud SQL documentation.
   * @param dataCacheConfig dataCacheConfig or {@code null} for none
   */
  public CloudSqlSettings setDataCacheConfig(DataCacheConfig dataCacheConfig) {
    this.dataCacheConfig = dataCacheConfig;
    return this;
  }

  /**
   * Optional. Provisioned number of I/O operations per second for the data disk. This field is only
   * used for hyperdisk-balanced disk types.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDataDiskProvisionedIops() {
    return dataDiskProvisionedIops;
  }

  /**
   * Optional. Provisioned number of I/O operations per second for the data disk. This field is only
   * used for hyperdisk-balanced disk types.
   * @param dataDiskProvisionedIops dataDiskProvisionedIops or {@code null} for none
   */
  public CloudSqlSettings setDataDiskProvisionedIops(java.lang.Long dataDiskProvisionedIops) {
    this.dataDiskProvisionedIops = dataDiskProvisionedIops;
    return this;
  }

  /**
   * Optional. Provisioned throughput measured in MiB per second for the data disk. This field is
   * only used for hyperdisk-balanced disk types.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDataDiskProvisionedThroughput() {
    return dataDiskProvisionedThroughput;
  }

  /**
   * Optional. Provisioned throughput measured in MiB per second for the data disk. This field is
   * only used for hyperdisk-balanced disk types.
   * @param dataDiskProvisionedThroughput dataDiskProvisionedThroughput or {@code null} for none
   */
  public CloudSqlSettings setDataDiskProvisionedThroughput(java.lang.Long dataDiskProvisionedThroughput) {
    this.dataDiskProvisionedThroughput = dataDiskProvisionedThroughput;
    return this;
  }

  /**
   * The storage capacity available to the database, in GB. The minimum (and default) size is 10GB.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDataDiskSizeGb() {
    return dataDiskSizeGb;
  }

  /**
   * The storage capacity available to the database, in GB. The minimum (and default) size is 10GB.
   * @param dataDiskSizeGb dataDiskSizeGb or {@code null} for none
   */
  public CloudSqlSettings setDataDiskSizeGb(java.lang.Long dataDiskSizeGb) {
    this.dataDiskSizeGb = dataDiskSizeGb;
    return this;
  }

  /**
   * The type of storage: `PD_SSD` (default) or `PD_HDD` or `HYPERDISK_BALANCED`.
   * @return value or {@code null} for none
   */
  public java.lang.String getDataDiskType() {
    return dataDiskType;
  }

  /**
   * The type of storage: `PD_SSD` (default) or `PD_HDD` or `HYPERDISK_BALANCED`.
   * @param dataDiskType dataDiskType or {@code null} for none
   */
  public CloudSqlSettings setDataDiskType(java.lang.String dataDiskType) {
    this.dataDiskType = dataDiskType;
    return this;
  }

  /**
   * The database flags passed to the Cloud SQL instance at startup. An object containing a list of
   * "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getDatabaseFlags() {
    return databaseFlags;
  }

  /**
   * The database flags passed to the Cloud SQL instance at startup. An object containing a list of
   * "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
   * @param databaseFlags databaseFlags or {@code null} for none
   */
  public CloudSqlSettings setDatabaseFlags(java.util.Map<String, java.lang.String> databaseFlags) {
    this.databaseFlags = databaseFlags;
    return this;
  }

  /**
   * The database engine type and version. Deprecated. Use database_version_name instead.
   * @return value or {@code null} for none
   */
  public java.lang.String getDatabaseVersion() {
    return databaseVersion;
  }

  /**
   * The database engine type and version. Deprecated. Use database_version_name instead.
   * @param databaseVersion databaseVersion or {@code null} for none
   */
  public CloudSqlSettings setDatabaseVersion(java.lang.String databaseVersion) {
    this.databaseVersion = databaseVersion;
    return this;
  }

  /**
   * Optional. The database engine type and version name.
   * @return value or {@code null} for none
   */
  public java.lang.String getDatabaseVersionName() {
    return databaseVersionName;
  }

  /**
   * Optional. The database engine type and version name.
   * @param databaseVersionName databaseVersionName or {@code null} for none
   */
  public CloudSqlSettings setDatabaseVersionName(java.lang.String databaseVersionName) {
    this.databaseVersionName = databaseVersionName;
    return this;
  }

  /**
   * Optional. The edition of the given Cloud SQL instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getEdition() {
    return edition;
  }

  /**
   * Optional. The edition of the given Cloud SQL instance.
   * @param edition edition or {@code null} for none
   */
  public CloudSqlSettings setEdition(java.lang.String edition) {
    this.edition = edition;
    return this;
  }

  /**
   * The settings for IP Management. This allows to enable or disable the instance IP and manage
   * which external networks can connect to the instance. The IPv4 address cannot be disabled.
   * @return value or {@code null} for none
   */
  public SqlIpConfig getIpConfig() {
    return ipConfig;
  }

  /**
   * The settings for IP Management. This allows to enable or disable the instance IP and manage
   * which external networks can connect to the instance. The IPv4 address cannot be disabled.
   * @param ipConfig ipConfig or {@code null} for none
   */
  public CloudSqlSettings setIpConfig(SqlIpConfig ipConfig) {
    this.ipConfig = ipConfig;
    return this;
  }

  /**
   * Input only. Initial root password.
   * @return value or {@code null} for none
   */
  public java.lang.String getRootPassword() {
    return rootPassword;
  }

  /**
   * Input only. Initial root password.
   * @param rootPassword rootPassword or {@code null} for none
   */
  public CloudSqlSettings setRootPassword(java.lang.String rootPassword) {
    this.rootPassword = rootPassword;
    return this;
  }

  /**
   * Output only. Indicates If this connection profile root password is stored.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRootPasswordSet() {
    return rootPasswordSet;
  }

  /**
   * Output only. Indicates If this connection profile root password is stored.
   * @param rootPasswordSet rootPasswordSet or {@code null} for none
   */
  public CloudSqlSettings setRootPasswordSet(java.lang.Boolean rootPasswordSet) {
    this.rootPasswordSet = rootPasswordSet;
    return this;
  }

  /**
   * Optional. The Google Cloud Platform zone where the failover Cloud SQL database instance is
   * located. Used when the Cloud SQL database availability type is REGIONAL (i.e. multiple zones /
   * highly available).
   * @return value or {@code null} for none
   */
  public java.lang.String getSecondaryZone() {
    return secondaryZone;
  }

  /**
   * Optional. The Google Cloud Platform zone where the failover Cloud SQL database instance is
   * located. Used when the Cloud SQL database availability type is REGIONAL (i.e. multiple zones /
   * highly available).
   * @param secondaryZone secondaryZone or {@code null} for none
   */
  public CloudSqlSettings setSecondaryZone(java.lang.String secondaryZone) {
    this.secondaryZone = secondaryZone;
    return this;
  }

  /**
   * The Database Migration Service source connection profile ID, in the format:
   * `projects/my_project_name/locations/us-central1/connectionProfiles/connection_profile_ID`
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceId() {
    return sourceId;
  }

  /**
   * The Database Migration Service source connection profile ID, in the format:
   * `projects/my_project_name/locations/us-central1/connectionProfiles/connection_profile_ID`
   * @param sourceId sourceId or {@code null} for none
   */
  public CloudSqlSettings setSourceId(java.lang.String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

  /**
   * The maximum size to which storage capacity can be automatically increased. The default value is
   * 0, which specifies that there is no limit.
   * @return value or {@code null} for none
   */
  public java.lang.Long getStorageAutoResizeLimit() {
    return storageAutoResizeLimit;
  }

  /**
   * The maximum size to which storage capacity can be automatically increased. The default value is
   * 0, which specifies that there is no limit.
   * @param storageAutoResizeLimit storageAutoResizeLimit or {@code null} for none
   */
  public CloudSqlSettings setStorageAutoResizeLimit(java.lang.Long storageAutoResizeLimit) {
    this.storageAutoResizeLimit = storageAutoResizeLimit;
    return this;
  }

  /**
   * The tier (or machine type) for this instance, for example: `db-n1-standard-1` (MySQL instances)
   * or `db-custom-1-3840` (PostgreSQL instances). For more information, see [Cloud SQL Instance
   * Settings](https://cloud.google.com/sql/docs/mysql/instance-settings).
   * @return value or {@code null} for none
   */
  public java.lang.String getTier() {
    return tier;
  }

  /**
   * The tier (or machine type) for this instance, for example: `db-n1-standard-1` (MySQL instances)
   * or `db-custom-1-3840` (PostgreSQL instances). For more information, see [Cloud SQL Instance
   * Settings](https://cloud.google.com/sql/docs/mysql/instance-settings).
   * @param tier tier or {@code null} for none
   */
  public CloudSqlSettings setTier(java.lang.String tier) {
    this.tier = tier;
    return this;
  }

  /**
   * The resource labels for a Cloud SQL instance to use to annotate any related underlying
   * resources such as Compute Engine VMs. An object containing a list of "key": "value" pairs.
   * Example: `{ "name": "wrench", "mass": "18kg", "count": "3" }`.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getUserLabels() {
    return userLabels;
  }

  /**
   * The resource labels for a Cloud SQL instance to use to annotate any related underlying
   * resources such as Compute Engine VMs. An object containing a list of "key": "value" pairs.
   * Example: `{ "name": "wrench", "mass": "18kg", "count": "3" }`.
   * @param userLabels userLabels or {@code null} for none
   */
  public CloudSqlSettings setUserLabels(java.util.Map<String, java.lang.String> userLabels) {
    this.userLabels = userLabels;
    return this;
  }

  /**
   * The Google Cloud Platform zone where your Cloud SQL database instance is located.
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * The Google Cloud Platform zone where your Cloud SQL database instance is located.
   * @param zone zone or {@code null} for none
   */
  public CloudSqlSettings setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public CloudSqlSettings set(String fieldName, Object value) {
    return (CloudSqlSettings) super.set(fieldName, value);
  }

  @Override
  public CloudSqlSettings clone() {
    return (CloudSqlSettings) super.clone();
  }

}

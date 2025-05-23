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

package com.google.api.services.logging.v2.model;

/**
 * Describes a repository in which log entries are stored.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Logging API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LogBucket extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Whether log analytics is enabled for this bucket.Once enabled, log analytics features
   * cannot be disabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean analyticsEnabled;

  /**
   * Optional. The CMEK settings of the log bucket. If present, new log entries written to this log
   * bucket are encrypted using the CMEK key provided in this configuration. If a log bucket has
   * CMEK settings, the CMEK settings cannot be disabled later by updating the log bucket. Changing
   * the KMS key is allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CmekSettings cmekSettings;

  /**
   * Output only. The creation timestamp of the bucket. This is not set for any of the default
   * buckets.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. Describes this bucket.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Optional. A list of indexed fields and related configuration data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<IndexConfig> indexConfigs;

  static {
    // hack to force ProGuard to consider IndexConfig used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(IndexConfig.class);
  }

  /**
   * Output only. The bucket lifecycle state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lifecycleState;

  /**
   * Optional. Whether the bucket is locked.The retention period on a locked bucket cannot be
   * changed. Locked buckets may only be deleted if they are empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean locked;

  /**
   * Output only. The resource name of the bucket.For example:projects/my-
   * project/locations/global/buckets/my-bucketFor a list of supported locations, see Supported
   * Regions (https://cloud.google.com/logging/docs/region-support)For the location of global it is
   * unspecified where log entries are actually stored.After a bucket has been created, the location
   * cannot be changed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. Log entry field paths that are denied access in this bucket.The following fields and
   * their children are eligible: textPayload, jsonPayload, protoPayload, httpRequest, labels,
   * sourceLocation.Restricting a repeated field will restrict all values. Adding a parent will
   * block all child fields. (e.g. foo.bar will block foo.bar.baz)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> restrictedFields;

  /**
   * Optional. Logs will be retained by default for this amount of time, after which they will
   * automatically be deleted. The minimum retention period is 1 day. If this value is set to zero
   * at bucket creation time, the default time of 30 days will be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer retentionDays;

  /**
   * Output only. The last update timestamp of the bucket.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Optional. Whether log analytics is enabled for this bucket.Once enabled, log analytics features
   * cannot be disabled.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAnalyticsEnabled() {
    return analyticsEnabled;
  }

  /**
   * Optional. Whether log analytics is enabled for this bucket.Once enabled, log analytics features
   * cannot be disabled.
   * @param analyticsEnabled analyticsEnabled or {@code null} for none
   */
  public LogBucket setAnalyticsEnabled(java.lang.Boolean analyticsEnabled) {
    this.analyticsEnabled = analyticsEnabled;
    return this;
  }

  /**
   * Optional. The CMEK settings of the log bucket. If present, new log entries written to this log
   * bucket are encrypted using the CMEK key provided in this configuration. If a log bucket has
   * CMEK settings, the CMEK settings cannot be disabled later by updating the log bucket. Changing
   * the KMS key is allowed.
   * @return value or {@code null} for none
   */
  public CmekSettings getCmekSettings() {
    return cmekSettings;
  }

  /**
   * Optional. The CMEK settings of the log bucket. If present, new log entries written to this log
   * bucket are encrypted using the CMEK key provided in this configuration. If a log bucket has
   * CMEK settings, the CMEK settings cannot be disabled later by updating the log bucket. Changing
   * the KMS key is allowed.
   * @param cmekSettings cmekSettings or {@code null} for none
   */
  public LogBucket setCmekSettings(CmekSettings cmekSettings) {
    this.cmekSettings = cmekSettings;
    return this;
  }

  /**
   * Output only. The creation timestamp of the bucket. This is not set for any of the default
   * buckets.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The creation timestamp of the bucket. This is not set for any of the default
   * buckets.
   * @param createTime createTime or {@code null} for none
   */
  public LogBucket setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. Describes this bucket.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. Describes this bucket.
   * @param description description or {@code null} for none
   */
  public LogBucket setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional. A list of indexed fields and related configuration data.
   * @return value or {@code null} for none
   */
  public java.util.List<IndexConfig> getIndexConfigs() {
    return indexConfigs;
  }

  /**
   * Optional. A list of indexed fields and related configuration data.
   * @param indexConfigs indexConfigs or {@code null} for none
   */
  public LogBucket setIndexConfigs(java.util.List<IndexConfig> indexConfigs) {
    this.indexConfigs = indexConfigs;
    return this;
  }

  /**
   * Output only. The bucket lifecycle state.
   * @return value or {@code null} for none
   */
  public java.lang.String getLifecycleState() {
    return lifecycleState;
  }

  /**
   * Output only. The bucket lifecycle state.
   * @param lifecycleState lifecycleState or {@code null} for none
   */
  public LogBucket setLifecycleState(java.lang.String lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
  }

  /**
   * Optional. Whether the bucket is locked.The retention period on a locked bucket cannot be
   * changed. Locked buckets may only be deleted if they are empty.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getLocked() {
    return locked;
  }

  /**
   * Optional. Whether the bucket is locked.The retention period on a locked bucket cannot be
   * changed. Locked buckets may only be deleted if they are empty.
   * @param locked locked or {@code null} for none
   */
  public LogBucket setLocked(java.lang.Boolean locked) {
    this.locked = locked;
    return this;
  }

  /**
   * Output only. The resource name of the bucket.For example:projects/my-
   * project/locations/global/buckets/my-bucketFor a list of supported locations, see Supported
   * Regions (https://cloud.google.com/logging/docs/region-support)For the location of global it is
   * unspecified where log entries are actually stored.After a bucket has been created, the location
   * cannot be changed.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The resource name of the bucket.For example:projects/my-
   * project/locations/global/buckets/my-bucketFor a list of supported locations, see Supported
   * Regions (https://cloud.google.com/logging/docs/region-support)For the location of global it is
   * unspecified where log entries are actually stored.After a bucket has been created, the location
   * cannot be changed.
   * @param name name or {@code null} for none
   */
  public LogBucket setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. Log entry field paths that are denied access in this bucket.The following fields and
   * their children are eligible: textPayload, jsonPayload, protoPayload, httpRequest, labels,
   * sourceLocation.Restricting a repeated field will restrict all values. Adding a parent will
   * block all child fields. (e.g. foo.bar will block foo.bar.baz)
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRestrictedFields() {
    return restrictedFields;
  }

  /**
   * Optional. Log entry field paths that are denied access in this bucket.The following fields and
   * their children are eligible: textPayload, jsonPayload, protoPayload, httpRequest, labels,
   * sourceLocation.Restricting a repeated field will restrict all values. Adding a parent will
   * block all child fields. (e.g. foo.bar will block foo.bar.baz)
   * @param restrictedFields restrictedFields or {@code null} for none
   */
  public LogBucket setRestrictedFields(java.util.List<java.lang.String> restrictedFields) {
    this.restrictedFields = restrictedFields;
    return this;
  }

  /**
   * Optional. Logs will be retained by default for this amount of time, after which they will
   * automatically be deleted. The minimum retention period is 1 day. If this value is set to zero
   * at bucket creation time, the default time of 30 days will be used.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRetentionDays() {
    return retentionDays;
  }

  /**
   * Optional. Logs will be retained by default for this amount of time, after which they will
   * automatically be deleted. The minimum retention period is 1 day. If this value is set to zero
   * at bucket creation time, the default time of 30 days will be used.
   * @param retentionDays retentionDays or {@code null} for none
   */
  public LogBucket setRetentionDays(java.lang.Integer retentionDays) {
    this.retentionDays = retentionDays;
    return this;
  }

  /**
   * Output only. The last update timestamp of the bucket.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The last update timestamp of the bucket.
   * @param updateTime updateTime or {@code null} for none
   */
  public LogBucket setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public LogBucket set(String fieldName, Object value) {
    return (LogBucket) super.set(fieldName, value);
  }

  @Override
  public LogBucket clone() {
    return (LogBucket) super.clone();
  }

}

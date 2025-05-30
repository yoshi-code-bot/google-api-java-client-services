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

package com.google.api.services.sqladmin.model;

/**
 * A flag resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Flag extends com.google.api.client.json.GenericJson {

  /**
   * Use this field if only certain integers are accepted. Can be combined with min_value and
   * max_value to add additional values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.List<java.lang.Long> allowedIntValues;

  /**
   * For `STRING` flags, a list of strings that the value can be set to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> allowedStringValues;

  /**
   * The database version this flag applies to. Can be MySQL instances: `MYSQL_8_0`, `MYSQL_8_0_18`,
   * `MYSQL_8_0_26`, `MYSQL_5_7`, or `MYSQL_5_6`. PostgreSQL instances: `POSTGRES_9_6`,
   * `POSTGRES_10`, `POSTGRES_11` or `POSTGRES_12`. SQL Server instances: `SQLSERVER_2017_STANDARD`,
   * `SQLSERVER_2017_ENTERPRISE`, `SQLSERVER_2017_EXPRESS`, `SQLSERVER_2017_WEB`,
   * `SQLSERVER_2019_STANDARD`, `SQLSERVER_2019_ENTERPRISE`, `SQLSERVER_2019_EXPRESS`, or
   * `SQLSERVER_2019_WEB`. See [the complete list](/sql/docs/mysql/admin-
   * api/rest/v1/SqlDatabaseVersion).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> appliesTo;

  /**
   * Scope of flag.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String flagScope;

  /**
   * Whether or not the flag is considered in beta.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean inBeta;

  /**
   * This is always `sql#flag`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * For `INTEGER` flags, the maximum allowed value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long maxValue;

  /**
   * For `INTEGER` flags, the minimum allowed value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long minValue;

  /**
   * This is the name of the flag. Flag names always use underscores, not hyphens, for example:
   * `max_allowed_packet`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Recommended flag value in integer format for UI display.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long recommendedIntValue;

  /**
   * Recommended flag value in string format for UI display.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String recommendedStringValue;

  /**
   * Indicates whether changing this flag will trigger a database restart. Only applicable to Second
   * Generation instances.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean requiresRestart;

  /**
   * The type of the flag. Flags are typed to being `BOOLEAN`, `STRING`, `INTEGER` or `NONE`. `NONE`
   * is used for flags which do not take a value, such as `skip_grant_tables`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Use this field if only certain integers are accepted. Can be combined with min_value and
   * max_value to add additional values.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Long> getAllowedIntValues() {
    return allowedIntValues;
  }

  /**
   * Use this field if only certain integers are accepted. Can be combined with min_value and
   * max_value to add additional values.
   * @param allowedIntValues allowedIntValues or {@code null} for none
   */
  public Flag setAllowedIntValues(java.util.List<java.lang.Long> allowedIntValues) {
    this.allowedIntValues = allowedIntValues;
    return this;
  }

  /**
   * For `STRING` flags, a list of strings that the value can be set to.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAllowedStringValues() {
    return allowedStringValues;
  }

  /**
   * For `STRING` flags, a list of strings that the value can be set to.
   * @param allowedStringValues allowedStringValues or {@code null} for none
   */
  public Flag setAllowedStringValues(java.util.List<java.lang.String> allowedStringValues) {
    this.allowedStringValues = allowedStringValues;
    return this;
  }

  /**
   * The database version this flag applies to. Can be MySQL instances: `MYSQL_8_0`, `MYSQL_8_0_18`,
   * `MYSQL_8_0_26`, `MYSQL_5_7`, or `MYSQL_5_6`. PostgreSQL instances: `POSTGRES_9_6`,
   * `POSTGRES_10`, `POSTGRES_11` or `POSTGRES_12`. SQL Server instances: `SQLSERVER_2017_STANDARD`,
   * `SQLSERVER_2017_ENTERPRISE`, `SQLSERVER_2017_EXPRESS`, `SQLSERVER_2017_WEB`,
   * `SQLSERVER_2019_STANDARD`, `SQLSERVER_2019_ENTERPRISE`, `SQLSERVER_2019_EXPRESS`, or
   * `SQLSERVER_2019_WEB`. See [the complete list](/sql/docs/mysql/admin-
   * api/rest/v1/SqlDatabaseVersion).
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAppliesTo() {
    return appliesTo;
  }

  /**
   * The database version this flag applies to. Can be MySQL instances: `MYSQL_8_0`, `MYSQL_8_0_18`,
   * `MYSQL_8_0_26`, `MYSQL_5_7`, or `MYSQL_5_6`. PostgreSQL instances: `POSTGRES_9_6`,
   * `POSTGRES_10`, `POSTGRES_11` or `POSTGRES_12`. SQL Server instances: `SQLSERVER_2017_STANDARD`,
   * `SQLSERVER_2017_ENTERPRISE`, `SQLSERVER_2017_EXPRESS`, `SQLSERVER_2017_WEB`,
   * `SQLSERVER_2019_STANDARD`, `SQLSERVER_2019_ENTERPRISE`, `SQLSERVER_2019_EXPRESS`, or
   * `SQLSERVER_2019_WEB`. See [the complete list](/sql/docs/mysql/admin-
   * api/rest/v1/SqlDatabaseVersion).
   * @param appliesTo appliesTo or {@code null} for none
   */
  public Flag setAppliesTo(java.util.List<java.lang.String> appliesTo) {
    this.appliesTo = appliesTo;
    return this;
  }

  /**
   * Scope of flag.
   * @return value or {@code null} for none
   */
  public java.lang.String getFlagScope() {
    return flagScope;
  }

  /**
   * Scope of flag.
   * @param flagScope flagScope or {@code null} for none
   */
  public Flag setFlagScope(java.lang.String flagScope) {
    this.flagScope = flagScope;
    return this;
  }

  /**
   * Whether or not the flag is considered in beta.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getInBeta() {
    return inBeta;
  }

  /**
   * Whether or not the flag is considered in beta.
   * @param inBeta inBeta or {@code null} for none
   */
  public Flag setInBeta(java.lang.Boolean inBeta) {
    this.inBeta = inBeta;
    return this;
  }

  /**
   * This is always `sql#flag`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This is always `sql#flag`.
   * @param kind kind or {@code null} for none
   */
  public Flag setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * For `INTEGER` flags, the maximum allowed value.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMaxValue() {
    return maxValue;
  }

  /**
   * For `INTEGER` flags, the maximum allowed value.
   * @param maxValue maxValue or {@code null} for none
   */
  public Flag setMaxValue(java.lang.Long maxValue) {
    this.maxValue = maxValue;
    return this;
  }

  /**
   * For `INTEGER` flags, the minimum allowed value.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMinValue() {
    return minValue;
  }

  /**
   * For `INTEGER` flags, the minimum allowed value.
   * @param minValue minValue or {@code null} for none
   */
  public Flag setMinValue(java.lang.Long minValue) {
    this.minValue = minValue;
    return this;
  }

  /**
   * This is the name of the flag. Flag names always use underscores, not hyphens, for example:
   * `max_allowed_packet`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * This is the name of the flag. Flag names always use underscores, not hyphens, for example:
   * `max_allowed_packet`
   * @param name name or {@code null} for none
   */
  public Flag setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Recommended flag value in integer format for UI display.
   * @return value or {@code null} for none
   */
  public java.lang.Long getRecommendedIntValue() {
    return recommendedIntValue;
  }

  /**
   * Recommended flag value in integer format for UI display.
   * @param recommendedIntValue recommendedIntValue or {@code null} for none
   */
  public Flag setRecommendedIntValue(java.lang.Long recommendedIntValue) {
    this.recommendedIntValue = recommendedIntValue;
    return this;
  }

  /**
   * Recommended flag value in string format for UI display.
   * @return value or {@code null} for none
   */
  public java.lang.String getRecommendedStringValue() {
    return recommendedStringValue;
  }

  /**
   * Recommended flag value in string format for UI display.
   * @param recommendedStringValue recommendedStringValue or {@code null} for none
   */
  public Flag setRecommendedStringValue(java.lang.String recommendedStringValue) {
    this.recommendedStringValue = recommendedStringValue;
    return this;
  }

  /**
   * Indicates whether changing this flag will trigger a database restart. Only applicable to Second
   * Generation instances.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRequiresRestart() {
    return requiresRestart;
  }

  /**
   * Indicates whether changing this flag will trigger a database restart. Only applicable to Second
   * Generation instances.
   * @param requiresRestart requiresRestart or {@code null} for none
   */
  public Flag setRequiresRestart(java.lang.Boolean requiresRestart) {
    this.requiresRestart = requiresRestart;
    return this;
  }

  /**
   * The type of the flag. Flags are typed to being `BOOLEAN`, `STRING`, `INTEGER` or `NONE`. `NONE`
   * is used for flags which do not take a value, such as `skip_grant_tables`.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of the flag. Flags are typed to being `BOOLEAN`, `STRING`, `INTEGER` or `NONE`. `NONE`
   * is used for flags which do not take a value, such as `skip_grant_tables`.
   * @param type type or {@code null} for none
   */
  public Flag setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public Flag set(String fieldName, Object value) {
    return (Flag) super.set(fieldName, value);
  }

  @Override
  public Flag clone() {
    return (Flag) super.clone();
  }

}

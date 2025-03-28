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

package com.google.api.services.merchantapi.datasources_v1beta.model;

/**
 * Fetch details to deliver the data source.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Merchant API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FetchSettings extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The day of the month when the data source file should be fetched (1-31). This field
   * can only be set for monthly frequency.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer dayOfMonth;

  /**
   * Optional. The day of the week when the data source file should be fetched. This field can only
   * be set for weekly frequency.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dayOfWeek;

  /**
   * Optional. Enables or pauses the fetch schedule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enabled;

  /**
   * Optional. The URL where the data source file can be fetched. Google Merchant Center supports
   * automatic scheduled uploads using the HTTP, HTTPS or SFTP protocols, so the value will need to
   * be a valid link using one of those three protocols. Immutable for Google Sheets files.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fetchUri;

  /**
   * Required. The frequency describing fetch schedule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String frequency;

  /**
   * Optional. An optional password for fetch_uri. Used for [submitting data sources through
   * SFTP](https://support.google.com/merchants/answer/13813117).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String password;

  /**
   * Optional. The hour of the day when the data source file should be fetched. Minutes and seconds
   * are not supported and will be ignored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TimeOfDay timeOfDay;

  /**
   * Optional. [Time zone](https://cldr.unicode.org) used for schedule. UTC by default. For example,
   * "America/Los_Angeles".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String timeZone;

  /**
   * Optional. An optional user name for fetch_uri. Used for [submitting data sources through
   * SFTP](https://support.google.com/merchants/answer/13813117).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String username;

  /**
   * Optional. The day of the month when the data source file should be fetched (1-31). This field
   * can only be set for monthly frequency.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDayOfMonth() {
    return dayOfMonth;
  }

  /**
   * Optional. The day of the month when the data source file should be fetched (1-31). This field
   * can only be set for monthly frequency.
   * @param dayOfMonth dayOfMonth or {@code null} for none
   */
  public FetchSettings setDayOfMonth(java.lang.Integer dayOfMonth) {
    this.dayOfMonth = dayOfMonth;
    return this;
  }

  /**
   * Optional. The day of the week when the data source file should be fetched. This field can only
   * be set for weekly frequency.
   * @return value or {@code null} for none
   */
  public java.lang.String getDayOfWeek() {
    return dayOfWeek;
  }

  /**
   * Optional. The day of the week when the data source file should be fetched. This field can only
   * be set for weekly frequency.
   * @param dayOfWeek dayOfWeek or {@code null} for none
   */
  public FetchSettings setDayOfWeek(java.lang.String dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

  /**
   * Optional. Enables or pauses the fetch schedule.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnabled() {
    return enabled;
  }

  /**
   * Optional. Enables or pauses the fetch schedule.
   * @param enabled enabled or {@code null} for none
   */
  public FetchSettings setEnabled(java.lang.Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Optional. The URL where the data source file can be fetched. Google Merchant Center supports
   * automatic scheduled uploads using the HTTP, HTTPS or SFTP protocols, so the value will need to
   * be a valid link using one of those three protocols. Immutable for Google Sheets files.
   * @return value or {@code null} for none
   */
  public java.lang.String getFetchUri() {
    return fetchUri;
  }

  /**
   * Optional. The URL where the data source file can be fetched. Google Merchant Center supports
   * automatic scheduled uploads using the HTTP, HTTPS or SFTP protocols, so the value will need to
   * be a valid link using one of those three protocols. Immutable for Google Sheets files.
   * @param fetchUri fetchUri or {@code null} for none
   */
  public FetchSettings setFetchUri(java.lang.String fetchUri) {
    this.fetchUri = fetchUri;
    return this;
  }

  /**
   * Required. The frequency describing fetch schedule.
   * @return value or {@code null} for none
   */
  public java.lang.String getFrequency() {
    return frequency;
  }

  /**
   * Required. The frequency describing fetch schedule.
   * @param frequency frequency or {@code null} for none
   */
  public FetchSettings setFrequency(java.lang.String frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Optional. An optional password for fetch_uri. Used for [submitting data sources through
   * SFTP](https://support.google.com/merchants/answer/13813117).
   * @return value or {@code null} for none
   */
  public java.lang.String getPassword() {
    return password;
  }

  /**
   * Optional. An optional password for fetch_uri. Used for [submitting data sources through
   * SFTP](https://support.google.com/merchants/answer/13813117).
   * @param password password or {@code null} for none
   */
  public FetchSettings setPassword(java.lang.String password) {
    this.password = password;
    return this;
  }

  /**
   * Optional. The hour of the day when the data source file should be fetched. Minutes and seconds
   * are not supported and will be ignored.
   * @return value or {@code null} for none
   */
  public TimeOfDay getTimeOfDay() {
    return timeOfDay;
  }

  /**
   * Optional. The hour of the day when the data source file should be fetched. Minutes and seconds
   * are not supported and will be ignored.
   * @param timeOfDay timeOfDay or {@code null} for none
   */
  public FetchSettings setTimeOfDay(TimeOfDay timeOfDay) {
    this.timeOfDay = timeOfDay;
    return this;
  }

  /**
   * Optional. [Time zone](https://cldr.unicode.org) used for schedule. UTC by default. For example,
   * "America/Los_Angeles".
   * @return value or {@code null} for none
   */
  public java.lang.String getTimeZone() {
    return timeZone;
  }

  /**
   * Optional. [Time zone](https://cldr.unicode.org) used for schedule. UTC by default. For example,
   * "America/Los_Angeles".
   * @param timeZone timeZone or {@code null} for none
   */
  public FetchSettings setTimeZone(java.lang.String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * Optional. An optional user name for fetch_uri. Used for [submitting data sources through
   * SFTP](https://support.google.com/merchants/answer/13813117).
   * @return value or {@code null} for none
   */
  public java.lang.String getUsername() {
    return username;
  }

  /**
   * Optional. An optional user name for fetch_uri. Used for [submitting data sources through
   * SFTP](https://support.google.com/merchants/answer/13813117).
   * @param username username or {@code null} for none
   */
  public FetchSettings setUsername(java.lang.String username) {
    this.username = username;
    return this;
  }

  @Override
  public FetchSettings set(String fieldName, Object value) {
    return (FetchSettings) super.set(fieldName, value);
  }

  @Override
  public FetchSettings clone() {
    return (FetchSettings) super.clone();
  }

}

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

package com.google.api.services.migrationcenter.v1alpha1.model;

/**
 * Describes the Migration Center settings related to the project.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Migration Center API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Settings extends com.google.api.client.json.GenericJson {

  /**
   * Customer consent for Google sales to access their Cloud Migration Center project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean customerConsentForGoogleSalesToAccessMigrationCenter;

  /**
   * Disable Cloud Logging for the Migration Center API. Users are billed for the logs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disableCloudLogging;

  /**
   * Output only. The name of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The preference set used by default for a project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String preferenceSet;

  /**
   * Customer consent for Google sales to access their Cloud Migration Center project.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCustomerConsentForGoogleSalesToAccessMigrationCenter() {
    return customerConsentForGoogleSalesToAccessMigrationCenter;
  }

  /**
   * Customer consent for Google sales to access their Cloud Migration Center project.
   * @param customerConsentForGoogleSalesToAccessMigrationCenter customerConsentForGoogleSalesToAccessMigrationCenter or {@code null} for none
   */
  public Settings setCustomerConsentForGoogleSalesToAccessMigrationCenter(java.lang.Boolean customerConsentForGoogleSalesToAccessMigrationCenter) {
    this.customerConsentForGoogleSalesToAccessMigrationCenter = customerConsentForGoogleSalesToAccessMigrationCenter;
    return this;
  }

  /**
   * Disable Cloud Logging for the Migration Center API. Users are billed for the logs.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisableCloudLogging() {
    return disableCloudLogging;
  }

  /**
   * Disable Cloud Logging for the Migration Center API. Users are billed for the logs.
   * @param disableCloudLogging disableCloudLogging or {@code null} for none
   */
  public Settings setDisableCloudLogging(java.lang.Boolean disableCloudLogging) {
    this.disableCloudLogging = disableCloudLogging;
    return this;
  }

  /**
   * Output only. The name of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The name of the resource.
   * @param name name or {@code null} for none
   */
  public Settings setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The preference set used by default for a project.
   * @return value or {@code null} for none
   */
  public java.lang.String getPreferenceSet() {
    return preferenceSet;
  }

  /**
   * The preference set used by default for a project.
   * @param preferenceSet preferenceSet or {@code null} for none
   */
  public Settings setPreferenceSet(java.lang.String preferenceSet) {
    this.preferenceSet = preferenceSet;
    return this;
  }

  @Override
  public Settings set(String fieldName, Object value) {
    return (Settings) super.set(fieldName, value);
  }

  @Override
  public Settings clone() {
    return (Settings) super.clone();
  }

}

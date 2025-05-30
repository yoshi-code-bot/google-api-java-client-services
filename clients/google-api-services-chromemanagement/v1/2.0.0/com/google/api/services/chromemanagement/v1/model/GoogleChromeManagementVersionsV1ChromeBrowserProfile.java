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

package com.google.api.services.chromemanagement.v1.model;

/**
 * A representation of a Chrome browser profile.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Chrome Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleChromeManagementVersionsV1ChromeBrowserProfile extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The specific affiliation state of the profile.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String affiliationState;

  /**
   * Optional. Location of the profile annotated by the admin.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String annotatedLocation;

  /**
   * Optional. User of the profile annotated by the admin.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String annotatedUser;

  /**
   * Output only. Attestation credential information of the profile.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleChromeManagementVersionsV1AttestationCredential attestationCredential;

  /**
   * Output only. Channel of the browser on which the profile exists.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String browserChannel;

  /**
   * Output only. Version of the browser on which the profile exists.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String browserVersion;

  /**
   * Output only. Basic information of the device on which the profile exists. This information is
   * only available for the affiliated profiles.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleChromeManagementVersionsV1DeviceInfo deviceInfo;

  /**
   * Output only. Profile display name set by client.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Output only. Etag of this ChromeBrowserProfile resource. This etag can be used with UPDATE
   * operation to ensure consistency.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Output only. Number of extensions installed on the profile.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long extensionCount;

  /**
   * Output only. Timestamp of the first enrollment of the profile.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String firstEnrollmentTime;

  /**
   * Output only. Identify provider of the profile.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String identityProvider;

  /**
   * Output only. Timestamp of the latest activity by the profile.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastActivityTime;

  /**
   * Output only. Timestamp of the latest policy fetch by the profile.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastPolicyFetchTime;

  /**
   * Output only. Timestamp of the latest policy sync by the profile.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastPolicySyncTime;

  /**
   * Output only. Timestamp of the latest status report by the profile.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastStatusReportTime;

  /**
   * Identifier. Format: customers/{customer_id}/profiles/{profile_permanent_id}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. OS platform of the device on which the profile exists.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String osPlatformType;

  /**
   * Output only. Major OS platform version of the device on which the profile exists, from profile
   * reporting.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String osPlatformVersion;

  /**
   * Output only. OS version of the device on which the profile exists.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String osVersion;

  /**
   * Output only. Number of policies applied on the profile.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long policyCount;

  /**
   * Output only. Chrome client side profile ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String profileId;

  /**
   * Output only. Profile permanent ID is the unique identifier of a profile within one customer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String profilePermanentId;

  /**
   * Output only. Detailed reporting data of the profile. This information is only available when
   * the profile reporting policy is enabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleChromeManagementVersionsV1ReportingData reportingData;

  /**
   * Output only. Email address of the user to which the profile belongs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userEmail;

  /**
   * Output only. Unique Directory API ID of the user that can be used in Admin SDK Users API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userId;

  /**
   * Output only. The specific affiliation state of the profile.
   * @return value or {@code null} for none
   */
  public java.lang.String getAffiliationState() {
    return affiliationState;
  }

  /**
   * Output only. The specific affiliation state of the profile.
   * @param affiliationState affiliationState or {@code null} for none
   */
  public GoogleChromeManagementVersionsV1ChromeBrowserProfile setAffiliationState(java.lang.String affiliationState) {
    this.affiliationState = affiliationState;
    return this;
  }

  /**
   * Optional. Location of the profile annotated by the admin.
   * @return value or {@code null} for none
   */
  public java.lang.String getAnnotatedLocation() {
    return annotatedLocation;
  }

  /**
   * Optional. Location of the profile annotated by the admin.
   * @param annotatedLocation annotatedLocation or {@code null} for none
   */
  public GoogleChromeManagementVersionsV1ChromeBrowserProfile setAnnotatedLocation(java.lang.String annotatedLocation) {
    this.annotatedLocation = annotatedLocation;
    return this;
  }

  /**
   * Optional. User of the profile annotated by the admin.
   * @return value or {@code null} for none
   */
  public java.lang.String getAnnotatedUser() {
    return annotatedUser;
  }

  /**
   * Optional. User of the profile annotated by the admin.
   * @param annotatedUser annotatedUser or {@code null} for none
   */
  public GoogleChromeManagementVersionsV1ChromeBrowserProfile setAnnotatedUser(java.lang.String annotatedUser) {
    this.annotatedUser = annotatedUser;
    return this;
  }

  /**
   * Output only. Attestation credential information of the profile.
   * @return value or {@code null} for none
   */
  public GoogleChromeManagementVersionsV1AttestationCredential getAttestationCredential() {
    return attestationCredential;
  }

  /**
   * Output only. Attestation credential information of the profile.
   * @param attestationCredential attestationCredential or {@code null} for none
   */
  public GoogleChromeManagementVersionsV1ChromeBrowserProfile setAttestationCredential(GoogleChromeManagementVersionsV1AttestationCredential attestationCredential) {
    this.attestationCredential = attestationCredential;
    return this;
  }

  /**
   * Output only. Channel of the browser on which the profile exists.
   * @return value or {@code null} for none
   */
  public java.lang.String getBrowserChannel() {
    return browserChannel;
  }

  /**
   * Output only. Channel of the browser on which the profile exists.
   * @param browserChannel browserChannel or {@code null} for none
   */
  public GoogleChromeManagementVersionsV1ChromeBrowserProfile setBrowserChannel(java.lang.String browserChannel) {
    this.browserChannel = browserChannel;
    return this;
  }

  /**
   * Output only. Version of the browser on which the profile exists.
   * @return value or {@code null} for none
   */
  public java.lang.String getBrowserVersion() {
    return browserVersion;
  }

  /**
   * Output only. Version of the browser on which the profile exists.
   * @param browserVersion browserVersion or {@code null} for none
   */
  public GoogleChromeManagementVersionsV1ChromeBrowserProfile setBrowserVersion(java.lang.String browserVersion) {
    this.browserVersion = browserVersion;
    return this;
  }

  /**
   * Output only. Basic information of the device on which the profile exists. This information is
   * only available for the affiliated profiles.
   * @return value or {@code null} for none
   */
  public GoogleChromeManagementVersionsV1DeviceInfo getDeviceInfo() {
    return deviceInfo;
  }

  /**
   * Output only. Basic information of the device on which the profile exists. This information is
   * only available for the affiliated profiles.
   * @param deviceInfo deviceInfo or {@code null} for none
   */
  public GoogleChromeManagementVersionsV1ChromeBrowserProfile setDeviceInfo(GoogleChromeManagementVersionsV1DeviceInfo deviceInfo) {
    this.deviceInfo = deviceInfo;
    return this;
  }

  /**
   * Output only. Profile display name set by client.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Output only. Profile display name set by client.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleChromeManagementVersionsV1ChromeBrowserProfile setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Output only. Etag of this ChromeBrowserProfile resource. This etag can be used with UPDATE
   * operation to ensure consistency.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Output only. Etag of this ChromeBrowserProfile resource. This etag can be used with UPDATE
   * operation to ensure consistency.
   * @param etag etag or {@code null} for none
   */
  public GoogleChromeManagementVersionsV1ChromeBrowserProfile setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Output only. Number of extensions installed on the profile.
   * @return value or {@code null} for none
   */
  public java.lang.Long getExtensionCount() {
    return extensionCount;
  }

  /**
   * Output only. Number of extensions installed on the profile.
   * @param extensionCount extensionCount or {@code null} for none
   */
  public GoogleChromeManagementVersionsV1ChromeBrowserProfile setExtensionCount(java.lang.Long extensionCount) {
    this.extensionCount = extensionCount;
    return this;
  }

  /**
   * Output only. Timestamp of the first enrollment of the profile.
   * @return value or {@code null} for none
   */
  public String getFirstEnrollmentTime() {
    return firstEnrollmentTime;
  }

  /**
   * Output only. Timestamp of the first enrollment of the profile.
   * @param firstEnrollmentTime firstEnrollmentTime or {@code null} for none
   */
  public GoogleChromeManagementVersionsV1ChromeBrowserProfile setFirstEnrollmentTime(String firstEnrollmentTime) {
    this.firstEnrollmentTime = firstEnrollmentTime;
    return this;
  }

  /**
   * Output only. Identify provider of the profile.
   * @return value or {@code null} for none
   */
  public java.lang.String getIdentityProvider() {
    return identityProvider;
  }

  /**
   * Output only. Identify provider of the profile.
   * @param identityProvider identityProvider or {@code null} for none
   */
  public GoogleChromeManagementVersionsV1ChromeBrowserProfile setIdentityProvider(java.lang.String identityProvider) {
    this.identityProvider = identityProvider;
    return this;
  }

  /**
   * Output only. Timestamp of the latest activity by the profile.
   * @return value or {@code null} for none
   */
  public String getLastActivityTime() {
    return lastActivityTime;
  }

  /**
   * Output only. Timestamp of the latest activity by the profile.
   * @param lastActivityTime lastActivityTime or {@code null} for none
   */
  public GoogleChromeManagementVersionsV1ChromeBrowserProfile setLastActivityTime(String lastActivityTime) {
    this.lastActivityTime = lastActivityTime;
    return this;
  }

  /**
   * Output only. Timestamp of the latest policy fetch by the profile.
   * @return value or {@code null} for none
   */
  public String getLastPolicyFetchTime() {
    return lastPolicyFetchTime;
  }

  /**
   * Output only. Timestamp of the latest policy fetch by the profile.
   * @param lastPolicyFetchTime lastPolicyFetchTime or {@code null} for none
   */
  public GoogleChromeManagementVersionsV1ChromeBrowserProfile setLastPolicyFetchTime(String lastPolicyFetchTime) {
    this.lastPolicyFetchTime = lastPolicyFetchTime;
    return this;
  }

  /**
   * Output only. Timestamp of the latest policy sync by the profile.
   * @return value or {@code null} for none
   */
  public String getLastPolicySyncTime() {
    return lastPolicySyncTime;
  }

  /**
   * Output only. Timestamp of the latest policy sync by the profile.
   * @param lastPolicySyncTime lastPolicySyncTime or {@code null} for none
   */
  public GoogleChromeManagementVersionsV1ChromeBrowserProfile setLastPolicySyncTime(String lastPolicySyncTime) {
    this.lastPolicySyncTime = lastPolicySyncTime;
    return this;
  }

  /**
   * Output only. Timestamp of the latest status report by the profile.
   * @return value or {@code null} for none
   */
  public String getLastStatusReportTime() {
    return lastStatusReportTime;
  }

  /**
   * Output only. Timestamp of the latest status report by the profile.
   * @param lastStatusReportTime lastStatusReportTime or {@code null} for none
   */
  public GoogleChromeManagementVersionsV1ChromeBrowserProfile setLastStatusReportTime(String lastStatusReportTime) {
    this.lastStatusReportTime = lastStatusReportTime;
    return this;
  }

  /**
   * Identifier. Format: customers/{customer_id}/profiles/{profile_permanent_id}
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Identifier. Format: customers/{customer_id}/profiles/{profile_permanent_id}
   * @param name name or {@code null} for none
   */
  public GoogleChromeManagementVersionsV1ChromeBrowserProfile setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. OS platform of the device on which the profile exists.
   * @return value or {@code null} for none
   */
  public java.lang.String getOsPlatformType() {
    return osPlatformType;
  }

  /**
   * Output only. OS platform of the device on which the profile exists.
   * @param osPlatformType osPlatformType or {@code null} for none
   */
  public GoogleChromeManagementVersionsV1ChromeBrowserProfile setOsPlatformType(java.lang.String osPlatformType) {
    this.osPlatformType = osPlatformType;
    return this;
  }

  /**
   * Output only. Major OS platform version of the device on which the profile exists, from profile
   * reporting.
   * @return value or {@code null} for none
   */
  public java.lang.String getOsPlatformVersion() {
    return osPlatformVersion;
  }

  /**
   * Output only. Major OS platform version of the device on which the profile exists, from profile
   * reporting.
   * @param osPlatformVersion osPlatformVersion or {@code null} for none
   */
  public GoogleChromeManagementVersionsV1ChromeBrowserProfile setOsPlatformVersion(java.lang.String osPlatformVersion) {
    this.osPlatformVersion = osPlatformVersion;
    return this;
  }

  /**
   * Output only. OS version of the device on which the profile exists.
   * @return value or {@code null} for none
   */
  public java.lang.String getOsVersion() {
    return osVersion;
  }

  /**
   * Output only. OS version of the device on which the profile exists.
   * @param osVersion osVersion or {@code null} for none
   */
  public GoogleChromeManagementVersionsV1ChromeBrowserProfile setOsVersion(java.lang.String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

  /**
   * Output only. Number of policies applied on the profile.
   * @return value or {@code null} for none
   */
  public java.lang.Long getPolicyCount() {
    return policyCount;
  }

  /**
   * Output only. Number of policies applied on the profile.
   * @param policyCount policyCount or {@code null} for none
   */
  public GoogleChromeManagementVersionsV1ChromeBrowserProfile setPolicyCount(java.lang.Long policyCount) {
    this.policyCount = policyCount;
    return this;
  }

  /**
   * Output only. Chrome client side profile ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getProfileId() {
    return profileId;
  }

  /**
   * Output only. Chrome client side profile ID.
   * @param profileId profileId or {@code null} for none
   */
  public GoogleChromeManagementVersionsV1ChromeBrowserProfile setProfileId(java.lang.String profileId) {
    this.profileId = profileId;
    return this;
  }

  /**
   * Output only. Profile permanent ID is the unique identifier of a profile within one customer.
   * @return value or {@code null} for none
   */
  public java.lang.String getProfilePermanentId() {
    return profilePermanentId;
  }

  /**
   * Output only. Profile permanent ID is the unique identifier of a profile within one customer.
   * @param profilePermanentId profilePermanentId or {@code null} for none
   */
  public GoogleChromeManagementVersionsV1ChromeBrowserProfile setProfilePermanentId(java.lang.String profilePermanentId) {
    this.profilePermanentId = profilePermanentId;
    return this;
  }

  /**
   * Output only. Detailed reporting data of the profile. This information is only available when
   * the profile reporting policy is enabled.
   * @return value or {@code null} for none
   */
  public GoogleChromeManagementVersionsV1ReportingData getReportingData() {
    return reportingData;
  }

  /**
   * Output only. Detailed reporting data of the profile. This information is only available when
   * the profile reporting policy is enabled.
   * @param reportingData reportingData or {@code null} for none
   */
  public GoogleChromeManagementVersionsV1ChromeBrowserProfile setReportingData(GoogleChromeManagementVersionsV1ReportingData reportingData) {
    this.reportingData = reportingData;
    return this;
  }

  /**
   * Output only. Email address of the user to which the profile belongs.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserEmail() {
    return userEmail;
  }

  /**
   * Output only. Email address of the user to which the profile belongs.
   * @param userEmail userEmail or {@code null} for none
   */
  public GoogleChromeManagementVersionsV1ChromeBrowserProfile setUserEmail(java.lang.String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

  /**
   * Output only. Unique Directory API ID of the user that can be used in Admin SDK Users API.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserId() {
    return userId;
  }

  /**
   * Output only. Unique Directory API ID of the user that can be used in Admin SDK Users API.
   * @param userId userId or {@code null} for none
   */
  public GoogleChromeManagementVersionsV1ChromeBrowserProfile setUserId(java.lang.String userId) {
    this.userId = userId;
    return this;
  }

  @Override
  public GoogleChromeManagementVersionsV1ChromeBrowserProfile set(String fieldName, Object value) {
    return (GoogleChromeManagementVersionsV1ChromeBrowserProfile) super.set(fieldName, value);
  }

  @Override
  public GoogleChromeManagementVersionsV1ChromeBrowserProfile clone() {
    return (GoogleChromeManagementVersionsV1ChromeBrowserProfile) super.clone();
  }

}

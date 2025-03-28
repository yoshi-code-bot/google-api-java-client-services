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

package com.google.api.services.securitycenter.v1.model;

/**
 * Security Command Center Issue.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Security Command Center API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudSecuritycenterV2Issue extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The time the issue was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * The description of the issue in Markdown format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The finding category or rule name that generated the issue.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String detection;

  /**
   * The domains of the issue.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudSecuritycenterV2IssueDomain> domains;

  /**
   * The exposure score of the issue.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double exposureScore;

  /**
   * The type of the issue.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String issueType;

  /**
   * The time the issue was last observed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastObservationTime;

  /**
   * The mute information of the issue.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudSecuritycenterV2IssueMute mute;

  /**
   * Identifier. The name of the issue. Format:
   * organizations/{organization}/locations/{location}/issues/{issue}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The primary resource associated with the issue.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudSecuritycenterV2IssueResource primaryResource;

  /**
   * The findings related to the issue.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudSecuritycenterV2IssueFinding> relatedFindings;

  /**
   * Approaches to remediate the issue in Markdown format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> remediations;

  /**
   * Additional resources associated with the issue.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudSecuritycenterV2IssueResource> secondaryResources;

  /**
   * The security context of the issue.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudSecuritycenterV2IssueSecurityContext> securityContexts;

  /**
   * The severity of the issue.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String severity;

  /**
   * Output only. The state of the issue.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. The time the issue was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. The time the issue was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time the issue was created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2Issue setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The description of the issue in Markdown format.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * The description of the issue in Markdown format.
   * @param description description or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2Issue setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The finding category or rule name that generated the issue.
   * @return value or {@code null} for none
   */
  public java.lang.String getDetection() {
    return detection;
  }

  /**
   * The finding category or rule name that generated the issue.
   * @param detection detection or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2Issue setDetection(java.lang.String detection) {
    this.detection = detection;
    return this;
  }

  /**
   * The domains of the issue.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudSecuritycenterV2IssueDomain> getDomains() {
    return domains;
  }

  /**
   * The domains of the issue.
   * @param domains domains or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2Issue setDomains(java.util.List<GoogleCloudSecuritycenterV2IssueDomain> domains) {
    this.domains = domains;
    return this;
  }

  /**
   * The exposure score of the issue.
   * @return value or {@code null} for none
   */
  public java.lang.Double getExposureScore() {
    return exposureScore;
  }

  /**
   * The exposure score of the issue.
   * @param exposureScore exposureScore or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2Issue setExposureScore(java.lang.Double exposureScore) {
    this.exposureScore = exposureScore;
    return this;
  }

  /**
   * The type of the issue.
   * @return value or {@code null} for none
   */
  public java.lang.String getIssueType() {
    return issueType;
  }

  /**
   * The type of the issue.
   * @param issueType issueType or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2Issue setIssueType(java.lang.String issueType) {
    this.issueType = issueType;
    return this;
  }

  /**
   * The time the issue was last observed.
   * @return value or {@code null} for none
   */
  public String getLastObservationTime() {
    return lastObservationTime;
  }

  /**
   * The time the issue was last observed.
   * @param lastObservationTime lastObservationTime or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2Issue setLastObservationTime(String lastObservationTime) {
    this.lastObservationTime = lastObservationTime;
    return this;
  }

  /**
   * The mute information of the issue.
   * @return value or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2IssueMute getMute() {
    return mute;
  }

  /**
   * The mute information of the issue.
   * @param mute mute or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2Issue setMute(GoogleCloudSecuritycenterV2IssueMute mute) {
    this.mute = mute;
    return this;
  }

  /**
   * Identifier. The name of the issue. Format:
   * organizations/{organization}/locations/{location}/issues/{issue}
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Identifier. The name of the issue. Format:
   * organizations/{organization}/locations/{location}/issues/{issue}
   * @param name name or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2Issue setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The primary resource associated with the issue.
   * @return value or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2IssueResource getPrimaryResource() {
    return primaryResource;
  }

  /**
   * The primary resource associated with the issue.
   * @param primaryResource primaryResource or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2Issue setPrimaryResource(GoogleCloudSecuritycenterV2IssueResource primaryResource) {
    this.primaryResource = primaryResource;
    return this;
  }

  /**
   * The findings related to the issue.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudSecuritycenterV2IssueFinding> getRelatedFindings() {
    return relatedFindings;
  }

  /**
   * The findings related to the issue.
   * @param relatedFindings relatedFindings or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2Issue setRelatedFindings(java.util.List<GoogleCloudSecuritycenterV2IssueFinding> relatedFindings) {
    this.relatedFindings = relatedFindings;
    return this;
  }

  /**
   * Approaches to remediate the issue in Markdown format.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRemediations() {
    return remediations;
  }

  /**
   * Approaches to remediate the issue in Markdown format.
   * @param remediations remediations or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2Issue setRemediations(java.util.List<java.lang.String> remediations) {
    this.remediations = remediations;
    return this;
  }

  /**
   * Additional resources associated with the issue.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudSecuritycenterV2IssueResource> getSecondaryResources() {
    return secondaryResources;
  }

  /**
   * Additional resources associated with the issue.
   * @param secondaryResources secondaryResources or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2Issue setSecondaryResources(java.util.List<GoogleCloudSecuritycenterV2IssueResource> secondaryResources) {
    this.secondaryResources = secondaryResources;
    return this;
  }

  /**
   * The security context of the issue.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudSecuritycenterV2IssueSecurityContext> getSecurityContexts() {
    return securityContexts;
  }

  /**
   * The security context of the issue.
   * @param securityContexts securityContexts or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2Issue setSecurityContexts(java.util.List<GoogleCloudSecuritycenterV2IssueSecurityContext> securityContexts) {
    this.securityContexts = securityContexts;
    return this;
  }

  /**
   * The severity of the issue.
   * @return value or {@code null} for none
   */
  public java.lang.String getSeverity() {
    return severity;
  }

  /**
   * The severity of the issue.
   * @param severity severity or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2Issue setSeverity(java.lang.String severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Output only. The state of the issue.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The state of the issue.
   * @param state state or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2Issue setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. The time the issue was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The time the issue was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2Issue setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GoogleCloudSecuritycenterV2Issue set(String fieldName, Object value) {
    return (GoogleCloudSecuritycenterV2Issue) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudSecuritycenterV2Issue clone() {
    return (GoogleCloudSecuritycenterV2Issue) super.clone();
  }

}

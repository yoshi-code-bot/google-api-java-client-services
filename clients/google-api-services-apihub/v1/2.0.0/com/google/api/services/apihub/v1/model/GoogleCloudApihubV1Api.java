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

package com.google.api.services.apihub.v1.model;

/**
 * An API resource in the API Hub.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the API hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApihubV1Api extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The api functional requirements associated with the API resource. Carinality is 1 for
   * this attribute. This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-api-functional-requirements`
   * attribute. The value of the attribute should be a proper URI, and in case of Cloud Storage URI,
   * it should point to a Cloud Storage object, not a directory.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudApihubV1AttributeValues apiFunctionalRequirements;

  /**
   * Optional. The api requirement doc associated with the API resource. Carinality is 1 for this
   * attribute. This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-api-requirements` attribute. The
   * value of the attribute should be a proper URI, and in case of Cloud Storage URI, it should
   * point to a Cloud Storage object, not a directory.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudApihubV1AttributeValues apiRequirements;

  /**
   * Optional. The style of the API. This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-api-style` attribute. The number of
   * values for this attribute will be based on the cardinality of the attribute. The same can be
   * retrieved via GetAttribute API. All values should be from the list of allowed values defined
   * for the attribute.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudApihubV1AttributeValues apiStyle;

  /**
   * Optional. The api technical requirements associated with the API resource. Carinality is 1 for
   * this attribute. This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-api-technical-requirements`
   * attribute. The value of the attribute should be a proper URI, and in case of Cloud Storage URI,
   * it should point to a Cloud Storage object, not a directory.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudApihubV1AttributeValues apiTechnicalRequirements;

  /**
   * Optional. The list of user defined attributes associated with the API resource. The key is the
   * attribute name. It will be of the format:
   * `projects/{project}/locations/{location}/attributes/{attribute}`. The value is the attribute
   * values associated with the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, GoogleCloudApihubV1AttributeValues> attributes;

  /**
   * Optional. The business unit owning the API. This maps to the following system defined
   * attribute: `projects/{project}/locations/{location}/attributes/system-business-unit` attribute.
   * The number of values for this attribute will be based on the cardinality of the attribute. The
   * same can be retrieved via GetAttribute API. All values should be from the list of allowed
   * values defined for the attribute.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudApihubV1AttributeValues businessUnit;

  /**
   * Output only. The time at which the API resource was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. The description of the API resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Required. The display name of the API resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Optional. The documentation for the API resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudApihubV1Documentation documentation;

  /**
   * Optional. Fingerprint of the API resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fingerprint;

  /**
   * Optional. The maturity level of the API. This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-maturity-level` attribute. The
   * number of values for this attribute will be based on the cardinality of the attribute. The same
   * can be retrieved via GetAttribute API. All values should be from the list of allowed values
   * defined for the attribute.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudApihubV1AttributeValues maturityLevel;

  /**
   * Identifier. The name of the API resource in the API Hub. Format:
   * `projects/{project}/locations/{location}/apis/{api}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. Owner details for the API resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudApihubV1Owner owner;

  /**
   * Optional. The selected version for an API resource. This can be used when special handling is
   * needed on client side for particular version of the API. Format is
   * `projects/{project}/locations/{location}/apis/{api}/versions/{version}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selectedVersion;

  /**
   * Output only. The list of sources and metadata from the sources of the API resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudApihubV1SourceMetadata> sourceMetadata;

  /**
   * Optional. The target users for the API. This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-target-user` attribute. The number
   * of values for this attribute will be based on the cardinality of the attribute. The same can be
   * retrieved via GetAttribute API. All values should be from the list of allowed values defined
   * for the attribute.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudApihubV1AttributeValues targetUser;

  /**
   * Optional. The team owning the API. This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-team` attribute. The number of
   * values for this attribute will be based on the cardinality of the attribute. The same can be
   * retrieved via GetAttribute API. All values should be from the list of allowed values defined
   * for the attribute.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudApihubV1AttributeValues team;

  /**
   * Output only. The time at which the API resource was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. The list of versions present in an API resource. Note: An API resource can be
   * associated with more than 1 version. Format is
   * `projects/{project}/locations/{location}/apis/{api}/versions/{version}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> versions;

  /**
   * Optional. The api functional requirements associated with the API resource. Carinality is 1 for
   * this attribute. This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-api-functional-requirements`
   * attribute. The value of the attribute should be a proper URI, and in case of Cloud Storage URI,
   * it should point to a Cloud Storage object, not a directory.
   * @return value or {@code null} for none
   */
  public GoogleCloudApihubV1AttributeValues getApiFunctionalRequirements() {
    return apiFunctionalRequirements;
  }

  /**
   * Optional. The api functional requirements associated with the API resource. Carinality is 1 for
   * this attribute. This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-api-functional-requirements`
   * attribute. The value of the attribute should be a proper URI, and in case of Cloud Storage URI,
   * it should point to a Cloud Storage object, not a directory.
   * @param apiFunctionalRequirements apiFunctionalRequirements or {@code null} for none
   */
  public GoogleCloudApihubV1Api setApiFunctionalRequirements(GoogleCloudApihubV1AttributeValues apiFunctionalRequirements) {
    this.apiFunctionalRequirements = apiFunctionalRequirements;
    return this;
  }

  /**
   * Optional. The api requirement doc associated with the API resource. Carinality is 1 for this
   * attribute. This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-api-requirements` attribute. The
   * value of the attribute should be a proper URI, and in case of Cloud Storage URI, it should
   * point to a Cloud Storage object, not a directory.
   * @return value or {@code null} for none
   */
  public GoogleCloudApihubV1AttributeValues getApiRequirements() {
    return apiRequirements;
  }

  /**
   * Optional. The api requirement doc associated with the API resource. Carinality is 1 for this
   * attribute. This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-api-requirements` attribute. The
   * value of the attribute should be a proper URI, and in case of Cloud Storage URI, it should
   * point to a Cloud Storage object, not a directory.
   * @param apiRequirements apiRequirements or {@code null} for none
   */
  public GoogleCloudApihubV1Api setApiRequirements(GoogleCloudApihubV1AttributeValues apiRequirements) {
    this.apiRequirements = apiRequirements;
    return this;
  }

  /**
   * Optional. The style of the API. This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-api-style` attribute. The number of
   * values for this attribute will be based on the cardinality of the attribute. The same can be
   * retrieved via GetAttribute API. All values should be from the list of allowed values defined
   * for the attribute.
   * @return value or {@code null} for none
   */
  public GoogleCloudApihubV1AttributeValues getApiStyle() {
    return apiStyle;
  }

  /**
   * Optional. The style of the API. This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-api-style` attribute. The number of
   * values for this attribute will be based on the cardinality of the attribute. The same can be
   * retrieved via GetAttribute API. All values should be from the list of allowed values defined
   * for the attribute.
   * @param apiStyle apiStyle or {@code null} for none
   */
  public GoogleCloudApihubV1Api setApiStyle(GoogleCloudApihubV1AttributeValues apiStyle) {
    this.apiStyle = apiStyle;
    return this;
  }

  /**
   * Optional. The api technical requirements associated with the API resource. Carinality is 1 for
   * this attribute. This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-api-technical-requirements`
   * attribute. The value of the attribute should be a proper URI, and in case of Cloud Storage URI,
   * it should point to a Cloud Storage object, not a directory.
   * @return value or {@code null} for none
   */
  public GoogleCloudApihubV1AttributeValues getApiTechnicalRequirements() {
    return apiTechnicalRequirements;
  }

  /**
   * Optional. The api technical requirements associated with the API resource. Carinality is 1 for
   * this attribute. This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-api-technical-requirements`
   * attribute. The value of the attribute should be a proper URI, and in case of Cloud Storage URI,
   * it should point to a Cloud Storage object, not a directory.
   * @param apiTechnicalRequirements apiTechnicalRequirements or {@code null} for none
   */
  public GoogleCloudApihubV1Api setApiTechnicalRequirements(GoogleCloudApihubV1AttributeValues apiTechnicalRequirements) {
    this.apiTechnicalRequirements = apiTechnicalRequirements;
    return this;
  }

  /**
   * Optional. The list of user defined attributes associated with the API resource. The key is the
   * attribute name. It will be of the format:
   * `projects/{project}/locations/{location}/attributes/{attribute}`. The value is the attribute
   * values associated with the resource.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, GoogleCloudApihubV1AttributeValues> getAttributes() {
    return attributes;
  }

  /**
   * Optional. The list of user defined attributes associated with the API resource. The key is the
   * attribute name. It will be of the format:
   * `projects/{project}/locations/{location}/attributes/{attribute}`. The value is the attribute
   * values associated with the resource.
   * @param attributes attributes or {@code null} for none
   */
  public GoogleCloudApihubV1Api setAttributes(java.util.Map<String, GoogleCloudApihubV1AttributeValues> attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Optional. The business unit owning the API. This maps to the following system defined
   * attribute: `projects/{project}/locations/{location}/attributes/system-business-unit` attribute.
   * The number of values for this attribute will be based on the cardinality of the attribute. The
   * same can be retrieved via GetAttribute API. All values should be from the list of allowed
   * values defined for the attribute.
   * @return value or {@code null} for none
   */
  public GoogleCloudApihubV1AttributeValues getBusinessUnit() {
    return businessUnit;
  }

  /**
   * Optional. The business unit owning the API. This maps to the following system defined
   * attribute: `projects/{project}/locations/{location}/attributes/system-business-unit` attribute.
   * The number of values for this attribute will be based on the cardinality of the attribute. The
   * same can be retrieved via GetAttribute API. All values should be from the list of allowed
   * values defined for the attribute.
   * @param businessUnit businessUnit or {@code null} for none
   */
  public GoogleCloudApihubV1Api setBusinessUnit(GoogleCloudApihubV1AttributeValues businessUnit) {
    this.businessUnit = businessUnit;
    return this;
  }

  /**
   * Output only. The time at which the API resource was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time at which the API resource was created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudApihubV1Api setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. The description of the API resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. The description of the API resource.
   * @param description description or {@code null} for none
   */
  public GoogleCloudApihubV1Api setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Required. The display name of the API resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. The display name of the API resource.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudApihubV1Api setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Optional. The documentation for the API resource.
   * @return value or {@code null} for none
   */
  public GoogleCloudApihubV1Documentation getDocumentation() {
    return documentation;
  }

  /**
   * Optional. The documentation for the API resource.
   * @param documentation documentation or {@code null} for none
   */
  public GoogleCloudApihubV1Api setDocumentation(GoogleCloudApihubV1Documentation documentation) {
    this.documentation = documentation;
    return this;
  }

  /**
   * Optional. Fingerprint of the API resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getFingerprint() {
    return fingerprint;
  }

  /**
   * Optional. Fingerprint of the API resource.
   * @param fingerprint fingerprint or {@code null} for none
   */
  public GoogleCloudApihubV1Api setFingerprint(java.lang.String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

  /**
   * Optional. The maturity level of the API. This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-maturity-level` attribute. The
   * number of values for this attribute will be based on the cardinality of the attribute. The same
   * can be retrieved via GetAttribute API. All values should be from the list of allowed values
   * defined for the attribute.
   * @return value or {@code null} for none
   */
  public GoogleCloudApihubV1AttributeValues getMaturityLevel() {
    return maturityLevel;
  }

  /**
   * Optional. The maturity level of the API. This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-maturity-level` attribute. The
   * number of values for this attribute will be based on the cardinality of the attribute. The same
   * can be retrieved via GetAttribute API. All values should be from the list of allowed values
   * defined for the attribute.
   * @param maturityLevel maturityLevel or {@code null} for none
   */
  public GoogleCloudApihubV1Api setMaturityLevel(GoogleCloudApihubV1AttributeValues maturityLevel) {
    this.maturityLevel = maturityLevel;
    return this;
  }

  /**
   * Identifier. The name of the API resource in the API Hub. Format:
   * `projects/{project}/locations/{location}/apis/{api}`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Identifier. The name of the API resource in the API Hub. Format:
   * `projects/{project}/locations/{location}/apis/{api}`
   * @param name name or {@code null} for none
   */
  public GoogleCloudApihubV1Api setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. Owner details for the API resource.
   * @return value or {@code null} for none
   */
  public GoogleCloudApihubV1Owner getOwner() {
    return owner;
  }

  /**
   * Optional. Owner details for the API resource.
   * @param owner owner or {@code null} for none
   */
  public GoogleCloudApihubV1Api setOwner(GoogleCloudApihubV1Owner owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Optional. The selected version for an API resource. This can be used when special handling is
   * needed on client side for particular version of the API. Format is
   * `projects/{project}/locations/{location}/apis/{api}/versions/{version}`
   * @return value or {@code null} for none
   */
  public java.lang.String getSelectedVersion() {
    return selectedVersion;
  }

  /**
   * Optional. The selected version for an API resource. This can be used when special handling is
   * needed on client side for particular version of the API. Format is
   * `projects/{project}/locations/{location}/apis/{api}/versions/{version}`
   * @param selectedVersion selectedVersion or {@code null} for none
   */
  public GoogleCloudApihubV1Api setSelectedVersion(java.lang.String selectedVersion) {
    this.selectedVersion = selectedVersion;
    return this;
  }

  /**
   * Output only. The list of sources and metadata from the sources of the API resource.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudApihubV1SourceMetadata> getSourceMetadata() {
    return sourceMetadata;
  }

  /**
   * Output only. The list of sources and metadata from the sources of the API resource.
   * @param sourceMetadata sourceMetadata or {@code null} for none
   */
  public GoogleCloudApihubV1Api setSourceMetadata(java.util.List<GoogleCloudApihubV1SourceMetadata> sourceMetadata) {
    this.sourceMetadata = sourceMetadata;
    return this;
  }

  /**
   * Optional. The target users for the API. This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-target-user` attribute. The number
   * of values for this attribute will be based on the cardinality of the attribute. The same can be
   * retrieved via GetAttribute API. All values should be from the list of allowed values defined
   * for the attribute.
   * @return value or {@code null} for none
   */
  public GoogleCloudApihubV1AttributeValues getTargetUser() {
    return targetUser;
  }

  /**
   * Optional. The target users for the API. This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-target-user` attribute. The number
   * of values for this attribute will be based on the cardinality of the attribute. The same can be
   * retrieved via GetAttribute API. All values should be from the list of allowed values defined
   * for the attribute.
   * @param targetUser targetUser or {@code null} for none
   */
  public GoogleCloudApihubV1Api setTargetUser(GoogleCloudApihubV1AttributeValues targetUser) {
    this.targetUser = targetUser;
    return this;
  }

  /**
   * Optional. The team owning the API. This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-team` attribute. The number of
   * values for this attribute will be based on the cardinality of the attribute. The same can be
   * retrieved via GetAttribute API. All values should be from the list of allowed values defined
   * for the attribute.
   * @return value or {@code null} for none
   */
  public GoogleCloudApihubV1AttributeValues getTeam() {
    return team;
  }

  /**
   * Optional. The team owning the API. This maps to the following system defined attribute:
   * `projects/{project}/locations/{location}/attributes/system-team` attribute. The number of
   * values for this attribute will be based on the cardinality of the attribute. The same can be
   * retrieved via GetAttribute API. All values should be from the list of allowed values defined
   * for the attribute.
   * @param team team or {@code null} for none
   */
  public GoogleCloudApihubV1Api setTeam(GoogleCloudApihubV1AttributeValues team) {
    this.team = team;
    return this;
  }

  /**
   * Output only. The time at which the API resource was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The time at which the API resource was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleCloudApihubV1Api setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Output only. The list of versions present in an API resource. Note: An API resource can be
   * associated with more than 1 version. Format is
   * `projects/{project}/locations/{location}/apis/{api}/versions/{version}`
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getVersions() {
    return versions;
  }

  /**
   * Output only. The list of versions present in an API resource. Note: An API resource can be
   * associated with more than 1 version. Format is
   * `projects/{project}/locations/{location}/apis/{api}/versions/{version}`
   * @param versions versions or {@code null} for none
   */
  public GoogleCloudApihubV1Api setVersions(java.util.List<java.lang.String> versions) {
    this.versions = versions;
    return this;
  }

  @Override
  public GoogleCloudApihubV1Api set(String fieldName, Object value) {
    return (GoogleCloudApihubV1Api) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApihubV1Api clone() {
    return (GoogleCloudApihubV1Api) super.clone();
  }

}

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

package com.google.api.services.healthcare.v1.model;

/**
 * Documentation of a user's consent.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ConsentArtifact extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Screenshots, PDFs, or other binary information documenting the user's consent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Image> consentContentScreenshots;

  /**
   * Optional. An string indicating the version of the consent information shown to the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String consentContentVersion;

  /**
   * Optional. A signature from a guardian.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Signature guardianSignature;

  /**
   * Optional. Metadata associated with the Consent artifact. For example, the consent locale or
   * user agent version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> metadata;

  /**
   * Identifier. Resource name of the Consent artifact, of the form `projects/{project_id}/locations
   * /{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consentArtifacts/{consent
   * _artifact_id}`. Cannot be changed after creation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. User's UUID provided by the client.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userId;

  /**
   * Optional. User's signature.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Signature userSignature;

  /**
   * Optional. A signature from a witness.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Signature witnessSignature;

  /**
   * Optional. Screenshots, PDFs, or other binary information documenting the user's consent.
   * @return value or {@code null} for none
   */
  public java.util.List<Image> getConsentContentScreenshots() {
    return consentContentScreenshots;
  }

  /**
   * Optional. Screenshots, PDFs, or other binary information documenting the user's consent.
   * @param consentContentScreenshots consentContentScreenshots or {@code null} for none
   */
  public ConsentArtifact setConsentContentScreenshots(java.util.List<Image> consentContentScreenshots) {
    this.consentContentScreenshots = consentContentScreenshots;
    return this;
  }

  /**
   * Optional. An string indicating the version of the consent information shown to the user.
   * @return value or {@code null} for none
   */
  public java.lang.String getConsentContentVersion() {
    return consentContentVersion;
  }

  /**
   * Optional. An string indicating the version of the consent information shown to the user.
   * @param consentContentVersion consentContentVersion or {@code null} for none
   */
  public ConsentArtifact setConsentContentVersion(java.lang.String consentContentVersion) {
    this.consentContentVersion = consentContentVersion;
    return this;
  }

  /**
   * Optional. A signature from a guardian.
   * @return value or {@code null} for none
   */
  public Signature getGuardianSignature() {
    return guardianSignature;
  }

  /**
   * Optional. A signature from a guardian.
   * @param guardianSignature guardianSignature or {@code null} for none
   */
  public ConsentArtifact setGuardianSignature(Signature guardianSignature) {
    this.guardianSignature = guardianSignature;
    return this;
  }

  /**
   * Optional. Metadata associated with the Consent artifact. For example, the consent locale or
   * user agent version.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getMetadata() {
    return metadata;
  }

  /**
   * Optional. Metadata associated with the Consent artifact. For example, the consent locale or
   * user agent version.
   * @param metadata metadata or {@code null} for none
   */
  public ConsentArtifact setMetadata(java.util.Map<String, java.lang.String> metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Identifier. Resource name of the Consent artifact, of the form `projects/{project_id}/locations
   * /{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consentArtifacts/{consent
   * _artifact_id}`. Cannot be changed after creation.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Identifier. Resource name of the Consent artifact, of the form `projects/{project_id}/locations
   * /{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consentArtifacts/{consent
   * _artifact_id}`. Cannot be changed after creation.
   * @param name name or {@code null} for none
   */
  public ConsentArtifact setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. User's UUID provided by the client.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserId() {
    return userId;
  }

  /**
   * Required. User's UUID provided by the client.
   * @param userId userId or {@code null} for none
   */
  public ConsentArtifact setUserId(java.lang.String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Optional. User's signature.
   * @return value or {@code null} for none
   */
  public Signature getUserSignature() {
    return userSignature;
  }

  /**
   * Optional. User's signature.
   * @param userSignature userSignature or {@code null} for none
   */
  public ConsentArtifact setUserSignature(Signature userSignature) {
    this.userSignature = userSignature;
    return this;
  }

  /**
   * Optional. A signature from a witness.
   * @return value or {@code null} for none
   */
  public Signature getWitnessSignature() {
    return witnessSignature;
  }

  /**
   * Optional. A signature from a witness.
   * @param witnessSignature witnessSignature or {@code null} for none
   */
  public ConsentArtifact setWitnessSignature(Signature witnessSignature) {
    this.witnessSignature = witnessSignature;
    return this;
  }

  @Override
  public ConsentArtifact set(String fieldName, Object value) {
    return (ConsentArtifact) super.set(fieldName, value);
  }

  @Override
  public ConsentArtifact clone() {
    return (ConsentArtifact) super.clone();
  }

}

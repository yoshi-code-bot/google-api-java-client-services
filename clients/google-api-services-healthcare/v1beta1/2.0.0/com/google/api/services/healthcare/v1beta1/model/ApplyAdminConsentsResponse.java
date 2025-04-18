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

package com.google.api.services.healthcare.v1beta1.model;

/**
 * Response when all admin Consent resources in scope were processed and all affected resources were
 * reindexed successfully. This structure will be included in the response when the operation
 * finishes successfully.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ApplyAdminConsentsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The number of resources (including the Consent resources) that may have consent access change.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long affectedResources;

  /**
   * If `validate_only=false` in ApplyAdminConsentsRequest, this counter contains the number of
   * Consent resources that were successfully applied. Otherwise, it is the number of Consent
   * resources that are supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long consentApplySuccess;

  /**
   * The number of resources (including the Consent resources) that ApplyAdminConsents failed to re-
   * index.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long failedResources;

  /**
   * The number of resources (including the Consent resources) that may have consent access change.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAffectedResources() {
    return affectedResources;
  }

  /**
   * The number of resources (including the Consent resources) that may have consent access change.
   * @param affectedResources affectedResources or {@code null} for none
   */
  public ApplyAdminConsentsResponse setAffectedResources(java.lang.Long affectedResources) {
    this.affectedResources = affectedResources;
    return this;
  }

  /**
   * If `validate_only=false` in ApplyAdminConsentsRequest, this counter contains the number of
   * Consent resources that were successfully applied. Otherwise, it is the number of Consent
   * resources that are supported.
   * @return value or {@code null} for none
   */
  public java.lang.Long getConsentApplySuccess() {
    return consentApplySuccess;
  }

  /**
   * If `validate_only=false` in ApplyAdminConsentsRequest, this counter contains the number of
   * Consent resources that were successfully applied. Otherwise, it is the number of Consent
   * resources that are supported.
   * @param consentApplySuccess consentApplySuccess or {@code null} for none
   */
  public ApplyAdminConsentsResponse setConsentApplySuccess(java.lang.Long consentApplySuccess) {
    this.consentApplySuccess = consentApplySuccess;
    return this;
  }

  /**
   * The number of resources (including the Consent resources) that ApplyAdminConsents failed to re-
   * index.
   * @return value or {@code null} for none
   */
  public java.lang.Long getFailedResources() {
    return failedResources;
  }

  /**
   * The number of resources (including the Consent resources) that ApplyAdminConsents failed to re-
   * index.
   * @param failedResources failedResources or {@code null} for none
   */
  public ApplyAdminConsentsResponse setFailedResources(java.lang.Long failedResources) {
    this.failedResources = failedResources;
    return this;
  }

  @Override
  public ApplyAdminConsentsResponse set(String fieldName, Object value) {
    return (ApplyAdminConsentsResponse) super.set(fieldName, value);
  }

  @Override
  public ApplyAdminConsentsResponse clone() {
    return (ApplyAdminConsentsResponse) super.clone();
  }

}

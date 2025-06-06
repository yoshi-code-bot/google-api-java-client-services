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

package com.google.api.services.firebaseapphosting.v1.model;

/**
 * A set of updates including ACME challenges and DNS records that allow App Hosting to create an
 * SSL certificate and establish project ownership for your domain name before you direct traffic to
 * App Hosting servers. Use these updates to facilitate zero downtime migrations to App Hosting from
 * other services. After you've made the recommended updates, check your custom domain's
 * `ownershipState` and `certState`. To avoid downtime, they should be `OWNERSHIP_ACTIVE` and
 * `CERT_ACTIVE`, respectively, before you update your `A` and `AAAA` records.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase App Hosting API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LiveMigrationStep extends com.google.api.client.json.GenericJson {

  /**
   * Output only. DNS updates to facilitate your domain's zero-downtime migration to App Hosting.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DnsUpdates> dnsUpdates;

  static {
    // hack to force ProGuard to consider DnsUpdates used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(DnsUpdates.class);
  }

  /**
   * Output only. Issues that prevent the current step from completing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Status> issues;

  /**
   * Output only. One or more states from the `CustomDomainStatus` of the migrating domain that this
   * step is attempting to make ACTIVE. For example, if the step is attempting to mint an SSL
   * certificate, this field will include `CERT_STATE`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> relevantDomainStates;

  /**
   * Output only. The state of the live migration step, indicates whether you should work to
   * complete the step now, in the future, or have already completed it.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stepState;

  /**
   * Output only. DNS updates to facilitate your domain's zero-downtime migration to App Hosting.
   * @return value or {@code null} for none
   */
  public java.util.List<DnsUpdates> getDnsUpdates() {
    return dnsUpdates;
  }

  /**
   * Output only. DNS updates to facilitate your domain's zero-downtime migration to App Hosting.
   * @param dnsUpdates dnsUpdates or {@code null} for none
   */
  public LiveMigrationStep setDnsUpdates(java.util.List<DnsUpdates> dnsUpdates) {
    this.dnsUpdates = dnsUpdates;
    return this;
  }

  /**
   * Output only. Issues that prevent the current step from completing.
   * @return value or {@code null} for none
   */
  public java.util.List<Status> getIssues() {
    return issues;
  }

  /**
   * Output only. Issues that prevent the current step from completing.
   * @param issues issues or {@code null} for none
   */
  public LiveMigrationStep setIssues(java.util.List<Status> issues) {
    this.issues = issues;
    return this;
  }

  /**
   * Output only. One or more states from the `CustomDomainStatus` of the migrating domain that this
   * step is attempting to make ACTIVE. For example, if the step is attempting to mint an SSL
   * certificate, this field will include `CERT_STATE`.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRelevantDomainStates() {
    return relevantDomainStates;
  }

  /**
   * Output only. One or more states from the `CustomDomainStatus` of the migrating domain that this
   * step is attempting to make ACTIVE. For example, if the step is attempting to mint an SSL
   * certificate, this field will include `CERT_STATE`.
   * @param relevantDomainStates relevantDomainStates or {@code null} for none
   */
  public LiveMigrationStep setRelevantDomainStates(java.util.List<java.lang.String> relevantDomainStates) {
    this.relevantDomainStates = relevantDomainStates;
    return this;
  }

  /**
   * Output only. The state of the live migration step, indicates whether you should work to
   * complete the step now, in the future, or have already completed it.
   * @return value or {@code null} for none
   */
  public java.lang.String getStepState() {
    return stepState;
  }

  /**
   * Output only. The state of the live migration step, indicates whether you should work to
   * complete the step now, in the future, or have already completed it.
   * @param stepState stepState or {@code null} for none
   */
  public LiveMigrationStep setStepState(java.lang.String stepState) {
    this.stepState = stepState;
    return this;
  }

  @Override
  public LiveMigrationStep set(String fieldName, Object value) {
    return (LiveMigrationStep) super.set(fieldName, value);
  }

  @Override
  public LiveMigrationStep clone() {
    return (LiveMigrationStep) super.clone();
  }

}

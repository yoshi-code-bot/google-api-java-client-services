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

package com.google.api.services.privateca.v1.model;

/**
 * Defines controls over all certificate issuance within a CaPool.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Certificate Authority API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class IssuancePolicy extends com.google.api.client.json.GenericJson {

  /**
   * Optional. If specified, then only methods allowed in the IssuanceModes may be used to issue
   * Certificates.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private IssuanceModes allowedIssuanceModes;

  /**
   * Optional. If any AllowedKeyType is specified, then the certificate request's public key must
   * match one of the key types listed here. Otherwise, any key may be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AllowedKeyType> allowedKeyTypes;

  static {
    // hack to force ProGuard to consider AllowedKeyType used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AllowedKeyType.class);
  }

  /**
   * Optional. The duration to backdate all certificates issued from this CaPool. If not set, the
   * certificates will be issued with a not_before_time of the issuance time (i.e. the current
   * time). If set, the certificates will be issued with a not_before_time of the issuance time
   * minus the backdate_duration. The not_after_time will be adjusted to preserve the requested
   * lifetime. The backdate_duration must be less than or equal to 48 hours.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String backdateDuration;

  /**
   * Optional. A set of X.509 values that will be applied to all certificates issued through this
   * CaPool. If a certificate request includes conflicting values for the same properties, they will
   * be overwritten by the values defined here. If a certificate request uses a CertificateTemplate
   * that defines conflicting predefined_values for the same properties, the certificate issuance
   * request will fail.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private X509Parameters baselineValues;

  /**
   * Optional. Describes constraints on identities that may appear in Certificates issued through
   * this CaPool. If this is omitted, then this CaPool will not add restrictions on a certificate's
   * identity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CertificateIdentityConstraints identityConstraints;

  /**
   * Optional. The maximum lifetime allowed for issued Certificates. Note that if the issuing
   * CertificateAuthority expires before a Certificate resource's requested maximum_lifetime, the
   * effective lifetime will be explicitly truncated to match it.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String maximumLifetime;

  /**
   * Optional. Describes the set of X.509 extensions that may appear in a Certificate issued through
   * this CaPool. If a certificate request sets extensions that don't appear in the
   * passthrough_extensions, those extensions will be dropped. If a certificate request uses a
   * CertificateTemplate with predefined_values that don't appear here, the certificate issuance
   * request will fail. If this is omitted, then this CaPool will not add restrictions on a
   * certificate's X.509 extensions. These constraints do not apply to X.509 extensions set in this
   * CaPool's baseline_values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CertificateExtensionConstraints passthroughExtensions;

  /**
   * Optional. If specified, then only methods allowed in the IssuanceModes may be used to issue
   * Certificates.
   * @return value or {@code null} for none
   */
  public IssuanceModes getAllowedIssuanceModes() {
    return allowedIssuanceModes;
  }

  /**
   * Optional. If specified, then only methods allowed in the IssuanceModes may be used to issue
   * Certificates.
   * @param allowedIssuanceModes allowedIssuanceModes or {@code null} for none
   */
  public IssuancePolicy setAllowedIssuanceModes(IssuanceModes allowedIssuanceModes) {
    this.allowedIssuanceModes = allowedIssuanceModes;
    return this;
  }

  /**
   * Optional. If any AllowedKeyType is specified, then the certificate request's public key must
   * match one of the key types listed here. Otherwise, any key may be used.
   * @return value or {@code null} for none
   */
  public java.util.List<AllowedKeyType> getAllowedKeyTypes() {
    return allowedKeyTypes;
  }

  /**
   * Optional. If any AllowedKeyType is specified, then the certificate request's public key must
   * match one of the key types listed here. Otherwise, any key may be used.
   * @param allowedKeyTypes allowedKeyTypes or {@code null} for none
   */
  public IssuancePolicy setAllowedKeyTypes(java.util.List<AllowedKeyType> allowedKeyTypes) {
    this.allowedKeyTypes = allowedKeyTypes;
    return this;
  }

  /**
   * Optional. The duration to backdate all certificates issued from this CaPool. If not set, the
   * certificates will be issued with a not_before_time of the issuance time (i.e. the current
   * time). If set, the certificates will be issued with a not_before_time of the issuance time
   * minus the backdate_duration. The not_after_time will be adjusted to preserve the requested
   * lifetime. The backdate_duration must be less than or equal to 48 hours.
   * @return value or {@code null} for none
   */
  public String getBackdateDuration() {
    return backdateDuration;
  }

  /**
   * Optional. The duration to backdate all certificates issued from this CaPool. If not set, the
   * certificates will be issued with a not_before_time of the issuance time (i.e. the current
   * time). If set, the certificates will be issued with a not_before_time of the issuance time
   * minus the backdate_duration. The not_after_time will be adjusted to preserve the requested
   * lifetime. The backdate_duration must be less than or equal to 48 hours.
   * @param backdateDuration backdateDuration or {@code null} for none
   */
  public IssuancePolicy setBackdateDuration(String backdateDuration) {
    this.backdateDuration = backdateDuration;
    return this;
  }

  /**
   * Optional. A set of X.509 values that will be applied to all certificates issued through this
   * CaPool. If a certificate request includes conflicting values for the same properties, they will
   * be overwritten by the values defined here. If a certificate request uses a CertificateTemplate
   * that defines conflicting predefined_values for the same properties, the certificate issuance
   * request will fail.
   * @return value or {@code null} for none
   */
  public X509Parameters getBaselineValues() {
    return baselineValues;
  }

  /**
   * Optional. A set of X.509 values that will be applied to all certificates issued through this
   * CaPool. If a certificate request includes conflicting values for the same properties, they will
   * be overwritten by the values defined here. If a certificate request uses a CertificateTemplate
   * that defines conflicting predefined_values for the same properties, the certificate issuance
   * request will fail.
   * @param baselineValues baselineValues or {@code null} for none
   */
  public IssuancePolicy setBaselineValues(X509Parameters baselineValues) {
    this.baselineValues = baselineValues;
    return this;
  }

  /**
   * Optional. Describes constraints on identities that may appear in Certificates issued through
   * this CaPool. If this is omitted, then this CaPool will not add restrictions on a certificate's
   * identity.
   * @return value or {@code null} for none
   */
  public CertificateIdentityConstraints getIdentityConstraints() {
    return identityConstraints;
  }

  /**
   * Optional. Describes constraints on identities that may appear in Certificates issued through
   * this CaPool. If this is omitted, then this CaPool will not add restrictions on a certificate's
   * identity.
   * @param identityConstraints identityConstraints or {@code null} for none
   */
  public IssuancePolicy setIdentityConstraints(CertificateIdentityConstraints identityConstraints) {
    this.identityConstraints = identityConstraints;
    return this;
  }

  /**
   * Optional. The maximum lifetime allowed for issued Certificates. Note that if the issuing
   * CertificateAuthority expires before a Certificate resource's requested maximum_lifetime, the
   * effective lifetime will be explicitly truncated to match it.
   * @return value or {@code null} for none
   */
  public String getMaximumLifetime() {
    return maximumLifetime;
  }

  /**
   * Optional. The maximum lifetime allowed for issued Certificates. Note that if the issuing
   * CertificateAuthority expires before a Certificate resource's requested maximum_lifetime, the
   * effective lifetime will be explicitly truncated to match it.
   * @param maximumLifetime maximumLifetime or {@code null} for none
   */
  public IssuancePolicy setMaximumLifetime(String maximumLifetime) {
    this.maximumLifetime = maximumLifetime;
    return this;
  }

  /**
   * Optional. Describes the set of X.509 extensions that may appear in a Certificate issued through
   * this CaPool. If a certificate request sets extensions that don't appear in the
   * passthrough_extensions, those extensions will be dropped. If a certificate request uses a
   * CertificateTemplate with predefined_values that don't appear here, the certificate issuance
   * request will fail. If this is omitted, then this CaPool will not add restrictions on a
   * certificate's X.509 extensions. These constraints do not apply to X.509 extensions set in this
   * CaPool's baseline_values.
   * @return value or {@code null} for none
   */
  public CertificateExtensionConstraints getPassthroughExtensions() {
    return passthroughExtensions;
  }

  /**
   * Optional. Describes the set of X.509 extensions that may appear in a Certificate issued through
   * this CaPool. If a certificate request sets extensions that don't appear in the
   * passthrough_extensions, those extensions will be dropped. If a certificate request uses a
   * CertificateTemplate with predefined_values that don't appear here, the certificate issuance
   * request will fail. If this is omitted, then this CaPool will not add restrictions on a
   * certificate's X.509 extensions. These constraints do not apply to X.509 extensions set in this
   * CaPool's baseline_values.
   * @param passthroughExtensions passthroughExtensions or {@code null} for none
   */
  public IssuancePolicy setPassthroughExtensions(CertificateExtensionConstraints passthroughExtensions) {
    this.passthroughExtensions = passthroughExtensions;
    return this;
  }

  @Override
  public IssuancePolicy set(String fieldName, Object value) {
    return (IssuancePolicy) super.set(fieldName, value);
  }

  @Override
  public IssuancePolicy clone() {
    return (IssuancePolicy) super.clone();
  }

}

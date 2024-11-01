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

package com.google.api.services.iam.v1.model;

/**
 * Access related restrictions on the workforce pool.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Identity and Access Management (IAM) API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AccessRestrictions extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Immutable. Services allowed for web sign-in with the workforce pool. If not set by
   * default there are no restrictions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ServiceConfig> allowedServices;

  /**
   * Optional. Disable programmatic sign-in by disabling token issue via the Security Token API
   * endpoint. See [Security Token Service API]
   * (https://cloud.google.com/iam/docs/reference/sts/rest).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disableProgrammaticSignin;

  /**
   * Optional. Immutable. Services allowed for web sign-in with the workforce pool. If not set by
   * default there are no restrictions.
   * @return value or {@code null} for none
   */
  public java.util.List<ServiceConfig> getAllowedServices() {
    return allowedServices;
  }

  /**
   * Optional. Immutable. Services allowed for web sign-in with the workforce pool. If not set by
   * default there are no restrictions.
   * @param allowedServices allowedServices or {@code null} for none
   */
  public AccessRestrictions setAllowedServices(java.util.List<ServiceConfig> allowedServices) {
    this.allowedServices = allowedServices;
    return this;
  }

  /**
   * Optional. Disable programmatic sign-in by disabling token issue via the Security Token API
   * endpoint. See [Security Token Service API]
   * (https://cloud.google.com/iam/docs/reference/sts/rest).
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisableProgrammaticSignin() {
    return disableProgrammaticSignin;
  }

  /**
   * Optional. Disable programmatic sign-in by disabling token issue via the Security Token API
   * endpoint. See [Security Token Service API]
   * (https://cloud.google.com/iam/docs/reference/sts/rest).
   * @param disableProgrammaticSignin disableProgrammaticSignin or {@code null} for none
   */
  public AccessRestrictions setDisableProgrammaticSignin(java.lang.Boolean disableProgrammaticSignin) {
    this.disableProgrammaticSignin = disableProgrammaticSignin;
    return this;
  }

  @Override
  public AccessRestrictions set(String fieldName, Object value) {
    return (AccessRestrictions) super.set(fieldName, value);
  }

  @Override
  public AccessRestrictions clone() {
    return (AccessRestrictions) super.clone();
  }

}

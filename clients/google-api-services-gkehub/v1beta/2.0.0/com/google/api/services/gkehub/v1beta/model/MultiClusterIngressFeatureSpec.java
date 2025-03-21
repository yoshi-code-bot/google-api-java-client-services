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

package com.google.api.services.gkehub.v1beta.model;

/**
 * **Multi-cluster Ingress**: The configuration for the MultiClusterIngress feature.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MultiClusterIngressFeatureSpec extends com.google.api.client.json.GenericJson {

  /**
   * Deprecated: This field will be ignored and should not be set. Customer's billing structure.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String billing;

  /**
   * Fully-qualified Membership name which hosts the MultiClusterIngress CRD. Example:
   * `projects/foo-proj/locations/global/memberships/bar`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String configMembership;

  /**
   * Deprecated: This field will be ignored and should not be set. Customer's billing structure.
   * @return value or {@code null} for none
   */
  public java.lang.String getBilling() {
    return billing;
  }

  /**
   * Deprecated: This field will be ignored and should not be set. Customer's billing structure.
   * @param billing billing or {@code null} for none
   */
  public MultiClusterIngressFeatureSpec setBilling(java.lang.String billing) {
    this.billing = billing;
    return this;
  }

  /**
   * Fully-qualified Membership name which hosts the MultiClusterIngress CRD. Example:
   * `projects/foo-proj/locations/global/memberships/bar`
   * @return value or {@code null} for none
   */
  public java.lang.String getConfigMembership() {
    return configMembership;
  }

  /**
   * Fully-qualified Membership name which hosts the MultiClusterIngress CRD. Example:
   * `projects/foo-proj/locations/global/memberships/bar`
   * @param configMembership configMembership or {@code null} for none
   */
  public MultiClusterIngressFeatureSpec setConfigMembership(java.lang.String configMembership) {
    this.configMembership = configMembership;
    return this;
  }

  @Override
  public MultiClusterIngressFeatureSpec set(String fieldName, Object value) {
    return (MultiClusterIngressFeatureSpec) super.set(fieldName, value);
  }

  @Override
  public MultiClusterIngressFeatureSpec clone() {
    return (MultiClusterIngressFeatureSpec) super.clone();
  }

}

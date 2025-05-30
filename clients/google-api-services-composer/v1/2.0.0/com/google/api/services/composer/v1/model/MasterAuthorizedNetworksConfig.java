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

package com.google.api.services.composer.v1.model;

/**
 * Configuration options for the master authorized networks feature. Enabled master authorized
 * networks will disallow all external traffic to access Kubernetes master through HTTPS except
 * traffic from the given CIDR blocks, Google Compute Engine Public IPs and Google Prod IPs.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Composer API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MasterAuthorizedNetworksConfig extends com.google.api.client.json.GenericJson {

  /**
   * Up to 50 external networks that could access Kubernetes master through HTTPS.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CidrBlock> cidrBlocks;

  static {
    // hack to force ProGuard to consider CidrBlock used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(CidrBlock.class);
  }

  /**
   * Optional. Whether or not master authorized networks feature is enabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enabled;

  /**
   * Up to 50 external networks that could access Kubernetes master through HTTPS.
   * @return value or {@code null} for none
   */
  public java.util.List<CidrBlock> getCidrBlocks() {
    return cidrBlocks;
  }

  /**
   * Up to 50 external networks that could access Kubernetes master through HTTPS.
   * @param cidrBlocks cidrBlocks or {@code null} for none
   */
  public MasterAuthorizedNetworksConfig setCidrBlocks(java.util.List<CidrBlock> cidrBlocks) {
    this.cidrBlocks = cidrBlocks;
    return this;
  }

  /**
   * Optional. Whether or not master authorized networks feature is enabled.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnabled() {
    return enabled;
  }

  /**
   * Optional. Whether or not master authorized networks feature is enabled.
   * @param enabled enabled or {@code null} for none
   */
  public MasterAuthorizedNetworksConfig setEnabled(java.lang.Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  @Override
  public MasterAuthorizedNetworksConfig set(String fieldName, Object value) {
    return (MasterAuthorizedNetworksConfig) super.set(fieldName, value);
  }

  @Override
  public MasterAuthorizedNetworksConfig clone() {
    return (MasterAuthorizedNetworksConfig) super.clone();
  }

}

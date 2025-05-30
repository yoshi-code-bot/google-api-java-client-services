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

package com.google.api.services.gkeonprem.v1.model;

/**
 * BareMetalAdminLoadBalancerConfig specifies the load balancer configuration.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE On-Prem API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BareMetalAdminLoadBalancerConfig extends com.google.api.client.json.GenericJson {

  /**
   * Manually configured load balancers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BareMetalAdminManualLbConfig manualLbConfig;

  /**
   * Configures the ports that the load balancer will listen on.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BareMetalAdminPortConfig portConfig;

  /**
   * The VIPs used by the load balancer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BareMetalAdminVipConfig vipConfig;

  /**
   * Manually configured load balancers.
   * @return value or {@code null} for none
   */
  public BareMetalAdminManualLbConfig getManualLbConfig() {
    return manualLbConfig;
  }

  /**
   * Manually configured load balancers.
   * @param manualLbConfig manualLbConfig or {@code null} for none
   */
  public BareMetalAdminLoadBalancerConfig setManualLbConfig(BareMetalAdminManualLbConfig manualLbConfig) {
    this.manualLbConfig = manualLbConfig;
    return this;
  }

  /**
   * Configures the ports that the load balancer will listen on.
   * @return value or {@code null} for none
   */
  public BareMetalAdminPortConfig getPortConfig() {
    return portConfig;
  }

  /**
   * Configures the ports that the load balancer will listen on.
   * @param portConfig portConfig or {@code null} for none
   */
  public BareMetalAdminLoadBalancerConfig setPortConfig(BareMetalAdminPortConfig portConfig) {
    this.portConfig = portConfig;
    return this;
  }

  /**
   * The VIPs used by the load balancer.
   * @return value or {@code null} for none
   */
  public BareMetalAdminVipConfig getVipConfig() {
    return vipConfig;
  }

  /**
   * The VIPs used by the load balancer.
   * @param vipConfig vipConfig or {@code null} for none
   */
  public BareMetalAdminLoadBalancerConfig setVipConfig(BareMetalAdminVipConfig vipConfig) {
    this.vipConfig = vipConfig;
    return this;
  }

  @Override
  public BareMetalAdminLoadBalancerConfig set(String fieldName, Object value) {
    return (BareMetalAdminLoadBalancerConfig) super.set(fieldName, value);
  }

  @Override
  public BareMetalAdminLoadBalancerConfig clone() {
    return (BareMetalAdminLoadBalancerConfig) super.clone();
  }

}

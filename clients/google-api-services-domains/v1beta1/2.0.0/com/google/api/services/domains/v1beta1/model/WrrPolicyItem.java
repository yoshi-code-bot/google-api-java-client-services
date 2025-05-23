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

package com.google.api.services.domains.v1beta1.model;

/**
 * A routing block which contains the routing information for one WRR item.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Domains API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WrrPolicyItem extends com.google.api.client.json.GenericJson {

  /**
   * Endpoints that are health checked before making the routing decision. The unhealthy endpoints
   * are omitted from the result. If all endpoints within a bucket are unhealthy, we choose a
   * different bucket (sampled with respect to its weight) for responding. If DNSSEC is enabled for
   * this zone, only one of `rrdata` or `health_checked_targets` can be set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HealthCheckTargets healthCheckedTargets;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> rrdata;

  /**
   * DNSSEC generated signatures for all the `rrdata` within this item. When using health-checked
   * targets for DNSSEC-enabled zones, you can only use at most one health-checked IP address per
   * item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> signatureRrdata;

  /**
   * The weight corresponding to this `WrrPolicyItem` object. When multiple `WrrPolicyItem` objects
   * are configured, the probability of returning an `WrrPolicyItem` object's data is proportional
   * to its weight relative to the sum of weights configured for all items. This weight must be non-
   * negative.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double weight;

  /**
   * Endpoints that are health checked before making the routing decision. The unhealthy endpoints
   * are omitted from the result. If all endpoints within a bucket are unhealthy, we choose a
   * different bucket (sampled with respect to its weight) for responding. If DNSSEC is enabled for
   * this zone, only one of `rrdata` or `health_checked_targets` can be set.
   * @return value or {@code null} for none
   */
  public HealthCheckTargets getHealthCheckedTargets() {
    return healthCheckedTargets;
  }

  /**
   * Endpoints that are health checked before making the routing decision. The unhealthy endpoints
   * are omitted from the result. If all endpoints within a bucket are unhealthy, we choose a
   * different bucket (sampled with respect to its weight) for responding. If DNSSEC is enabled for
   * this zone, only one of `rrdata` or `health_checked_targets` can be set.
   * @param healthCheckedTargets healthCheckedTargets or {@code null} for none
   */
  public WrrPolicyItem setHealthCheckedTargets(HealthCheckTargets healthCheckedTargets) {
    this.healthCheckedTargets = healthCheckedTargets;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRrdata() {
    return rrdata;
  }

  /**
   * @param rrdata rrdata or {@code null} for none
   */
  public WrrPolicyItem setRrdata(java.util.List<java.lang.String> rrdata) {
    this.rrdata = rrdata;
    return this;
  }

  /**
   * DNSSEC generated signatures for all the `rrdata` within this item. When using health-checked
   * targets for DNSSEC-enabled zones, you can only use at most one health-checked IP address per
   * item.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSignatureRrdata() {
    return signatureRrdata;
  }

  /**
   * DNSSEC generated signatures for all the `rrdata` within this item. When using health-checked
   * targets for DNSSEC-enabled zones, you can only use at most one health-checked IP address per
   * item.
   * @param signatureRrdata signatureRrdata or {@code null} for none
   */
  public WrrPolicyItem setSignatureRrdata(java.util.List<java.lang.String> signatureRrdata) {
    this.signatureRrdata = signatureRrdata;
    return this;
  }

  /**
   * The weight corresponding to this `WrrPolicyItem` object. When multiple `WrrPolicyItem` objects
   * are configured, the probability of returning an `WrrPolicyItem` object's data is proportional
   * to its weight relative to the sum of weights configured for all items. This weight must be non-
   * negative.
   * @return value or {@code null} for none
   */
  public java.lang.Double getWeight() {
    return weight;
  }

  /**
   * The weight corresponding to this `WrrPolicyItem` object. When multiple `WrrPolicyItem` objects
   * are configured, the probability of returning an `WrrPolicyItem` object's data is proportional
   * to its weight relative to the sum of weights configured for all items. This weight must be non-
   * negative.
   * @param weight weight or {@code null} for none
   */
  public WrrPolicyItem setWeight(java.lang.Double weight) {
    this.weight = weight;
    return this;
  }

  @Override
  public WrrPolicyItem set(String fieldName, Object value) {
    return (WrrPolicyItem) super.set(fieldName, value);
  }

  @Override
  public WrrPolicyItem clone() {
    return (WrrPolicyItem) super.clone();
  }

}

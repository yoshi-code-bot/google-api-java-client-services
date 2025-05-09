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

package com.google.api.services.domains.v1.model;

/**
 * A RRSetRoutingPolicy represents ResourceRecordSet data that is returned dynamically with the
 * response varying based on configured properties such as geolocation or by weighted random
 * selection.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Domains API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RRSetRoutingPolicy extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GeoPolicy geo;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GeoPolicy geoPolicy;

  /**
   * The fully qualified URL of the HealthCheck to use for this RRSetRoutingPolicy. Format this URL
   * like
   * `https://www.googleapis.com/compute/v1/projects/{project}/global/healthChecks/{healthCheck}`.
   * https://cloud.google.com/compute/docs/reference/rest/v1/healthChecks
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String healthCheck;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PrimaryBackupPolicy primaryBackup;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private WrrPolicy wrr;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private WrrPolicy wrrPolicy;

  /**
   * @return value or {@code null} for none
   */
  public GeoPolicy getGeo() {
    return geo;
  }

  /**
   * @param geo geo or {@code null} for none
   */
  public RRSetRoutingPolicy setGeo(GeoPolicy geo) {
    this.geo = geo;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public GeoPolicy getGeoPolicy() {
    return geoPolicy;
  }

  /**
   * @param geoPolicy geoPolicy or {@code null} for none
   */
  public RRSetRoutingPolicy setGeoPolicy(GeoPolicy geoPolicy) {
    this.geoPolicy = geoPolicy;
    return this;
  }

  /**
   * The fully qualified URL of the HealthCheck to use for this RRSetRoutingPolicy. Format this URL
   * like
   * `https://www.googleapis.com/compute/v1/projects/{project}/global/healthChecks/{healthCheck}`.
   * https://cloud.google.com/compute/docs/reference/rest/v1/healthChecks
   * @return value or {@code null} for none
   */
  public java.lang.String getHealthCheck() {
    return healthCheck;
  }

  /**
   * The fully qualified URL of the HealthCheck to use for this RRSetRoutingPolicy. Format this URL
   * like
   * `https://www.googleapis.com/compute/v1/projects/{project}/global/healthChecks/{healthCheck}`.
   * https://cloud.google.com/compute/docs/reference/rest/v1/healthChecks
   * @param healthCheck healthCheck or {@code null} for none
   */
  public RRSetRoutingPolicy setHealthCheck(java.lang.String healthCheck) {
    this.healthCheck = healthCheck;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public PrimaryBackupPolicy getPrimaryBackup() {
    return primaryBackup;
  }

  /**
   * @param primaryBackup primaryBackup or {@code null} for none
   */
  public RRSetRoutingPolicy setPrimaryBackup(PrimaryBackupPolicy primaryBackup) {
    this.primaryBackup = primaryBackup;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public WrrPolicy getWrr() {
    return wrr;
  }

  /**
   * @param wrr wrr or {@code null} for none
   */
  public RRSetRoutingPolicy setWrr(WrrPolicy wrr) {
    this.wrr = wrr;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public WrrPolicy getWrrPolicy() {
    return wrrPolicy;
  }

  /**
   * @param wrrPolicy wrrPolicy or {@code null} for none
   */
  public RRSetRoutingPolicy setWrrPolicy(WrrPolicy wrrPolicy) {
    this.wrrPolicy = wrrPolicy;
    return this;
  }

  @Override
  public RRSetRoutingPolicy set(String fieldName, Object value) {
    return (RRSetRoutingPolicy) super.set(fieldName, value);
  }

  @Override
  public RRSetRoutingPolicy clone() {
    return (RRSetRoutingPolicy) super.clone();
  }

}

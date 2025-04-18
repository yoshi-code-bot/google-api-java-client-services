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

package com.google.api.services.compute.model;

/**
 * The status of an individual accelerator resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ResourceStatusAcceleratorStatus extends com.google.api.client.json.GenericJson {

  /**
   * The details of scans that passed for an accelerator.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ResourceStatusAcceleratorStatusPassedScan> passedScans;

  /**
   * The details of recommended scans for an accelerator.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ResourceStatusAcceleratorStatusRecommendedScan> recommendedScans;

  /**
   * The serial number of the accelerator.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serialNumber;

  /**
   * The UUID of the accelerator.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uuid;

  /**
   * The details of scans that passed for an accelerator.
   * @return value or {@code null} for none
   */
  public java.util.List<ResourceStatusAcceleratorStatusPassedScan> getPassedScans() {
    return passedScans;
  }

  /**
   * The details of scans that passed for an accelerator.
   * @param passedScans passedScans or {@code null} for none
   */
  public ResourceStatusAcceleratorStatus setPassedScans(java.util.List<ResourceStatusAcceleratorStatusPassedScan> passedScans) {
    this.passedScans = passedScans;
    return this;
  }

  /**
   * The details of recommended scans for an accelerator.
   * @return value or {@code null} for none
   */
  public java.util.List<ResourceStatusAcceleratorStatusRecommendedScan> getRecommendedScans() {
    return recommendedScans;
  }

  /**
   * The details of recommended scans for an accelerator.
   * @param recommendedScans recommendedScans or {@code null} for none
   */
  public ResourceStatusAcceleratorStatus setRecommendedScans(java.util.List<ResourceStatusAcceleratorStatusRecommendedScan> recommendedScans) {
    this.recommendedScans = recommendedScans;
    return this;
  }

  /**
   * The serial number of the accelerator.
   * @return value or {@code null} for none
   */
  public java.lang.String getSerialNumber() {
    return serialNumber;
  }

  /**
   * The serial number of the accelerator.
   * @param serialNumber serialNumber or {@code null} for none
   */
  public ResourceStatusAcceleratorStatus setSerialNumber(java.lang.String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * The UUID of the accelerator.
   * @return value or {@code null} for none
   */
  public java.lang.String getUuid() {
    return uuid;
  }

  /**
   * The UUID of the accelerator.
   * @param uuid uuid or {@code null} for none
   */
  public ResourceStatusAcceleratorStatus setUuid(java.lang.String uuid) {
    this.uuid = uuid;
    return this;
  }

  @Override
  public ResourceStatusAcceleratorStatus set(String fieldName, Object value) {
    return (ResourceStatusAcceleratorStatus) super.set(fieldName, value);
  }

  @Override
  public ResourceStatusAcceleratorStatus clone() {
    return (ResourceStatusAcceleratorStatus) super.clone();
  }

}

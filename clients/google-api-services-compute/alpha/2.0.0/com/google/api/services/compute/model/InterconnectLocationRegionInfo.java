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
 * Information about any potential InterconnectAttachments between an Interconnect at a specific
 * InterconnectLocation, and a specific Cloud Region.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InterconnectLocationRegionInfo extends com.google.api.client.json.GenericJson {

  /**
   * Expected round-trip time in milliseconds, from this InterconnectLocation to a VM in this
   * region.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long expectedRttMs;

  /**
   * Identifies whether L2 Interconnect Attachments can be created in this region for interconnects
   * that are in this location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean l2ForwardingEnabled;

  /**
   * Identifies the network presence of this location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String locationPresence;

  /**
   * URL for the region of this location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * Expected round-trip time in milliseconds, from this InterconnectLocation to a VM in this
   * region.
   * @return value or {@code null} for none
   */
  public java.lang.Long getExpectedRttMs() {
    return expectedRttMs;
  }

  /**
   * Expected round-trip time in milliseconds, from this InterconnectLocation to a VM in this
   * region.
   * @param expectedRttMs expectedRttMs or {@code null} for none
   */
  public InterconnectLocationRegionInfo setExpectedRttMs(java.lang.Long expectedRttMs) {
    this.expectedRttMs = expectedRttMs;
    return this;
  }

  /**
   * Identifies whether L2 Interconnect Attachments can be created in this region for interconnects
   * that are in this location.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getL2ForwardingEnabled() {
    return l2ForwardingEnabled;
  }

  /**
   * Identifies whether L2 Interconnect Attachments can be created in this region for interconnects
   * that are in this location.
   * @param l2ForwardingEnabled l2ForwardingEnabled or {@code null} for none
   */
  public InterconnectLocationRegionInfo setL2ForwardingEnabled(java.lang.Boolean l2ForwardingEnabled) {
    this.l2ForwardingEnabled = l2ForwardingEnabled;
    return this;
  }

  /**
   * Identifies the network presence of this location.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocationPresence() {
    return locationPresence;
  }

  /**
   * Identifies the network presence of this location.
   * @param locationPresence locationPresence or {@code null} for none
   */
  public InterconnectLocationRegionInfo setLocationPresence(java.lang.String locationPresence) {
    this.locationPresence = locationPresence;
    return this;
  }

  /**
   * URL for the region of this location.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * URL for the region of this location.
   * @param region region or {@code null} for none
   */
  public InterconnectLocationRegionInfo setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  @Override
  public InterconnectLocationRegionInfo set(String fieldName, Object value) {
    return (InterconnectLocationRegionInfo) super.set(fieldName, value);
  }

  @Override
  public InterconnectLocationRegionInfo clone() {
    return (InterconnectLocationRegionInfo) super.clone();
  }

}

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

package com.google.api.services.networkmanagement.v1.model;

/**
 * Results of active probing from the last run of the test.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ProbingDetails extends com.google.api.client.json.GenericJson {

  /**
   * The reason probing was aborted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String abortCause;

  /**
   * The EdgeLocation from which a packet, destined to the internet, will egress the Google network.
   * This will only be populated for a connectivity test which has an internet destination address.
   * The absence of this field *must not* be used as an indication that the destination is part of
   * the Google network.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EdgeLocation destinationEgressLocation;

  /**
   * Probing results for all edge devices.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SingleEdgeResponse> edgeResponses;

  /**
   * The source and destination endpoints derived from the test input and used for active probing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EndpointInfo endpointInfo;

  /**
   * Details about an internal failure or the cancellation of active probing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Status error;

  /**
   * Whether all relevant edge devices were probed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean probedAllDevices;

  /**
   * Latency as measured by active probing in one direction: from the source to the destination
   * endpoint.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LatencyDistribution probingLatency;

  /**
   * The overall result of active probing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String result;

  /**
   * Number of probes sent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer sentProbeCount;

  /**
   * Number of probes that reached the destination.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer successfulProbeCount;

  /**
   * The time that reachability was assessed through active probing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String verifyTime;

  /**
   * The reason probing was aborted.
   * @return value or {@code null} for none
   */
  public java.lang.String getAbortCause() {
    return abortCause;
  }

  /**
   * The reason probing was aborted.
   * @param abortCause abortCause or {@code null} for none
   */
  public ProbingDetails setAbortCause(java.lang.String abortCause) {
    this.abortCause = abortCause;
    return this;
  }

  /**
   * The EdgeLocation from which a packet, destined to the internet, will egress the Google network.
   * This will only be populated for a connectivity test which has an internet destination address.
   * The absence of this field *must not* be used as an indication that the destination is part of
   * the Google network.
   * @return value or {@code null} for none
   */
  public EdgeLocation getDestinationEgressLocation() {
    return destinationEgressLocation;
  }

  /**
   * The EdgeLocation from which a packet, destined to the internet, will egress the Google network.
   * This will only be populated for a connectivity test which has an internet destination address.
   * The absence of this field *must not* be used as an indication that the destination is part of
   * the Google network.
   * @param destinationEgressLocation destinationEgressLocation or {@code null} for none
   */
  public ProbingDetails setDestinationEgressLocation(EdgeLocation destinationEgressLocation) {
    this.destinationEgressLocation = destinationEgressLocation;
    return this;
  }

  /**
   * Probing results for all edge devices.
   * @return value or {@code null} for none
   */
  public java.util.List<SingleEdgeResponse> getEdgeResponses() {
    return edgeResponses;
  }

  /**
   * Probing results for all edge devices.
   * @param edgeResponses edgeResponses or {@code null} for none
   */
  public ProbingDetails setEdgeResponses(java.util.List<SingleEdgeResponse> edgeResponses) {
    this.edgeResponses = edgeResponses;
    return this;
  }

  /**
   * The source and destination endpoints derived from the test input and used for active probing.
   * @return value or {@code null} for none
   */
  public EndpointInfo getEndpointInfo() {
    return endpointInfo;
  }

  /**
   * The source and destination endpoints derived from the test input and used for active probing.
   * @param endpointInfo endpointInfo or {@code null} for none
   */
  public ProbingDetails setEndpointInfo(EndpointInfo endpointInfo) {
    this.endpointInfo = endpointInfo;
    return this;
  }

  /**
   * Details about an internal failure or the cancellation of active probing.
   * @return value or {@code null} for none
   */
  public Status getError() {
    return error;
  }

  /**
   * Details about an internal failure or the cancellation of active probing.
   * @param error error or {@code null} for none
   */
  public ProbingDetails setError(Status error) {
    this.error = error;
    return this;
  }

  /**
   * Whether all relevant edge devices were probed.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getProbedAllDevices() {
    return probedAllDevices;
  }

  /**
   * Whether all relevant edge devices were probed.
   * @param probedAllDevices probedAllDevices or {@code null} for none
   */
  public ProbingDetails setProbedAllDevices(java.lang.Boolean probedAllDevices) {
    this.probedAllDevices = probedAllDevices;
    return this;
  }

  /**
   * Latency as measured by active probing in one direction: from the source to the destination
   * endpoint.
   * @return value or {@code null} for none
   */
  public LatencyDistribution getProbingLatency() {
    return probingLatency;
  }

  /**
   * Latency as measured by active probing in one direction: from the source to the destination
   * endpoint.
   * @param probingLatency probingLatency or {@code null} for none
   */
  public ProbingDetails setProbingLatency(LatencyDistribution probingLatency) {
    this.probingLatency = probingLatency;
    return this;
  }

  /**
   * The overall result of active probing.
   * @return value or {@code null} for none
   */
  public java.lang.String getResult() {
    return result;
  }

  /**
   * The overall result of active probing.
   * @param result result or {@code null} for none
   */
  public ProbingDetails setResult(java.lang.String result) {
    this.result = result;
    return this;
  }

  /**
   * Number of probes sent.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSentProbeCount() {
    return sentProbeCount;
  }

  /**
   * Number of probes sent.
   * @param sentProbeCount sentProbeCount or {@code null} for none
   */
  public ProbingDetails setSentProbeCount(java.lang.Integer sentProbeCount) {
    this.sentProbeCount = sentProbeCount;
    return this;
  }

  /**
   * Number of probes that reached the destination.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSuccessfulProbeCount() {
    return successfulProbeCount;
  }

  /**
   * Number of probes that reached the destination.
   * @param successfulProbeCount successfulProbeCount or {@code null} for none
   */
  public ProbingDetails setSuccessfulProbeCount(java.lang.Integer successfulProbeCount) {
    this.successfulProbeCount = successfulProbeCount;
    return this;
  }

  /**
   * The time that reachability was assessed through active probing.
   * @return value or {@code null} for none
   */
  public String getVerifyTime() {
    return verifyTime;
  }

  /**
   * The time that reachability was assessed through active probing.
   * @param verifyTime verifyTime or {@code null} for none
   */
  public ProbingDetails setVerifyTime(String verifyTime) {
    this.verifyTime = verifyTime;
    return this;
  }

  @Override
  public ProbingDetails set(String fieldName, Object value) {
    return (ProbingDetails) super.set(fieldName, value);
  }

  @Override
  public ProbingDetails clone() {
    return (ProbingDetails) super.clone();
  }

}

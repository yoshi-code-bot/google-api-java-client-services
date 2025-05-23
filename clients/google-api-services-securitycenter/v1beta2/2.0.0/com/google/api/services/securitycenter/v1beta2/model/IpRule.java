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

package com.google.api.services.securitycenter.v1beta2.model;

/**
 * IP rule information.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Security Command Center API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class IpRule extends com.google.api.client.json.GenericJson {

  /**
   * Optional. An optional list of ports to which this rule applies. This field is only applicable
   * for the UDP or (S)TCP protocols. Each entry must be either an integer or a range including a
   * min and max port number.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PortRange> portRanges;

  /**
   * The IP protocol this rule applies to. This value can either be one of the following well known
   * protocol strings (TCP, UDP, ICMP, ESP, AH, IPIP, SCTP) or a string representation of the
   * integer value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String protocol;

  /**
   * Optional. An optional list of ports to which this rule applies. This field is only applicable
   * for the UDP or (S)TCP protocols. Each entry must be either an integer or a range including a
   * min and max port number.
   * @return value or {@code null} for none
   */
  public java.util.List<PortRange> getPortRanges() {
    return portRanges;
  }

  /**
   * Optional. An optional list of ports to which this rule applies. This field is only applicable
   * for the UDP or (S)TCP protocols. Each entry must be either an integer or a range including a
   * min and max port number.
   * @param portRanges portRanges or {@code null} for none
   */
  public IpRule setPortRanges(java.util.List<PortRange> portRanges) {
    this.portRanges = portRanges;
    return this;
  }

  /**
   * The IP protocol this rule applies to. This value can either be one of the following well known
   * protocol strings (TCP, UDP, ICMP, ESP, AH, IPIP, SCTP) or a string representation of the
   * integer value.
   * @return value or {@code null} for none
   */
  public java.lang.String getProtocol() {
    return protocol;
  }

  /**
   * The IP protocol this rule applies to. This value can either be one of the following well known
   * protocol strings (TCP, UDP, ICMP, ESP, AH, IPIP, SCTP) or a string representation of the
   * integer value.
   * @param protocol protocol or {@code null} for none
   */
  public IpRule setProtocol(java.lang.String protocol) {
    this.protocol = protocol;
    return this;
  }

  @Override
  public IpRule set(String fieldName, Object value) {
    return (IpRule) super.set(fieldName, value);
  }

  @Override
  public IpRule clone() {
    return (IpRule) super.clone();
  }

}

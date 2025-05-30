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
 * Represents a VPC Network resource. Networks connect resources to each other and to the internet.
 * For more information, read Virtual Private Cloud (VPC) Network.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Network extends com.google.api.client.json.GenericJson {

  /**
   * Deprecated in favor of subnet mode networks. The range of internal addresses that are legal on
   * this network. This range is a CIDR specification, for example: 192.168.0.0/16. Provided by the
   * client when the network is created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("IPv4Range")
  private java.lang.String iPv4Range;

  /**
   * Must be set to create a VPC network. If not set, a legacy network is created. When set to true,
   * the VPC network is created in auto mode. When set to false, the VPC network is created in
   * custom mode. An auto mode VPC network starts with one subnet per region. Each subnet has a
   * predetermined range as described in Auto mode VPC network IP ranges. For custom mode VPC
   * networks, you can add subnets using the subnetworks insert method.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean autoCreateSubnetworks;

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * An optional description of this resource. Provide this field when you create the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Enable ULA internal ipv6 on this network. Enabling this feature will assign a /48 from google
   * defined ULA prefix fd20::/20. .
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableUlaInternalIpv6;

  /**
   * [Output Only] URL of the firewall policy the network is associated with.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String firewallPolicy;

  /**
   * [Output Only] The gateway address for default routing out of the network, selected by Google
   * Cloud.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gatewayIPv4;

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * When enabling ula internal ipv6, caller optionally can specify the /48 range they want from the
   * google defined ULA prefix fd20::/20. The input must be a valid /48 ULA IPv6 address and must be
   * within the fd20::/20. Operation will fail if the speficied /48 is already in used by another
   * resource. If the field is not speficied, then a /48 range will be randomly allocated from
   * fd20::/20 and returned via this field. .
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String internalIpv6Range;

  /**
   * [Output Only] Type of the resource. Always compute#network for networks.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Maximum Transmission Unit in bytes. The minimum value for this field is 1300 and the maximum
   * value is 8896. The suggested value is 1500, which is the default MTU used on the Internet, or
   * 8896 if you want to use Jumbo frames. If unspecified, the value defaults to 1460.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer mtu;

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be
   * a lowercase letter, and all following characters (except for the last character) must be a
   * dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The network firewall policy enforcement order. Can be either AFTER_CLASSIC_FIREWALL or
   * BEFORE_CLASSIC_FIREWALL. Defaults to AFTER_CLASSIC_FIREWALL if the field is not specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String networkFirewallPolicyEnforcementOrder;

  /**
   * A full or partial URL of the network profile to apply to this network. This field can be set
   * only at resource creation time. For example, the following are valid URLs: - https://www.google
   * apis.com/compute/{api_version}/projects/{project_id}/global/networkProfiles/{network_profile_na
   * me} - projects/{project_id}/global/networkProfiles/{network_profile_name}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String networkProfile;

  /**
   * Input only. [Input Only] Additional params passed with the request, but not persisted as part
   * of resource payload.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NetworkParams params;

  /**
   * [Output Only] A list of network peerings for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<NetworkPeering> peerings;

  /**
   * [Output Only] URL of the region where the regional network resides. This field is not
   * applicable to global network. You must specify this field as part of the HTTP request URL. It
   * is not settable as a field in the request body.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * The network-level routing configuration for this network. Used by Cloud Router to determine
   * what type of network-wide routing behavior to enforce.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NetworkRoutingConfig routingConfig;

  /**
   * [Output Only] Server-defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Output Only] Server-defined URL for this resource with the resource id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLinkWithId;

  /**
   * [Output Only] Server-defined fully-qualified URLs for all subnetworks in this VPC network.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> subnetworks;

  /**
   * Deprecated in favor of subnet mode networks. The range of internal addresses that are legal on
   * this network. This range is a CIDR specification, for example: 192.168.0.0/16. Provided by the
   * client when the network is created.
   * @return value or {@code null} for none
   */
  public java.lang.String getIPv4Range() {
    return iPv4Range;
  }

  /**
   * Deprecated in favor of subnet mode networks. The range of internal addresses that are legal on
   * this network. This range is a CIDR specification, for example: 192.168.0.0/16. Provided by the
   * client when the network is created.
   * @param iPv4Range iPv4Range or {@code null} for none
   */
  public Network setIPv4Range(java.lang.String iPv4Range) {
    this.iPv4Range = iPv4Range;
    return this;
  }

  /**
   * Must be set to create a VPC network. If not set, a legacy network is created. When set to true,
   * the VPC network is created in auto mode. When set to false, the VPC network is created in
   * custom mode. An auto mode VPC network starts with one subnet per region. Each subnet has a
   * predetermined range as described in Auto mode VPC network IP ranges. For custom mode VPC
   * networks, you can add subnets using the subnetworks insert method.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAutoCreateSubnetworks() {
    return autoCreateSubnetworks;
  }

  /**
   * Must be set to create a VPC network. If not set, a legacy network is created. When set to true,
   * the VPC network is created in auto mode. When set to false, the VPC network is created in
   * custom mode. An auto mode VPC network starts with one subnet per region. Each subnet has a
   * predetermined range as described in Auto mode VPC network IP ranges. For custom mode VPC
   * networks, you can add subnets using the subnetworks insert method.
   * @param autoCreateSubnetworks autoCreateSubnetworks or {@code null} for none
   */
  public Network setAutoCreateSubnetworks(java.lang.Boolean autoCreateSubnetworks) {
    this.autoCreateSubnetworks = autoCreateSubnetworks;
    return this;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public Network setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * An optional description of this resource. Provide this field when you create the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource. Provide this field when you create the resource.
   * @param description description or {@code null} for none
   */
  public Network setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Enable ULA internal ipv6 on this network. Enabling this feature will assign a /48 from google
   * defined ULA prefix fd20::/20. .
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableUlaInternalIpv6() {
    return enableUlaInternalIpv6;
  }

  /**
   * Enable ULA internal ipv6 on this network. Enabling this feature will assign a /48 from google
   * defined ULA prefix fd20::/20. .
   * @param enableUlaInternalIpv6 enableUlaInternalIpv6 or {@code null} for none
   */
  public Network setEnableUlaInternalIpv6(java.lang.Boolean enableUlaInternalIpv6) {
    this.enableUlaInternalIpv6 = enableUlaInternalIpv6;
    return this;
  }

  /**
   * [Output Only] URL of the firewall policy the network is associated with.
   * @return value or {@code null} for none
   */
  public java.lang.String getFirewallPolicy() {
    return firewallPolicy;
  }

  /**
   * [Output Only] URL of the firewall policy the network is associated with.
   * @param firewallPolicy firewallPolicy or {@code null} for none
   */
  public Network setFirewallPolicy(java.lang.String firewallPolicy) {
    this.firewallPolicy = firewallPolicy;
    return this;
  }

  /**
   * [Output Only] The gateway address for default routing out of the network, selected by Google
   * Cloud.
   * @return value or {@code null} for none
   */
  public java.lang.String getGatewayIPv4() {
    return gatewayIPv4;
  }

  /**
   * [Output Only] The gateway address for default routing out of the network, selected by Google
   * Cloud.
   * @param gatewayIPv4 gatewayIPv4 or {@code null} for none
   */
  public Network setGatewayIPv4(java.lang.String gatewayIPv4) {
    this.gatewayIPv4 = gatewayIPv4;
    return this;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @param id id or {@code null} for none
   */
  public Network setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * When enabling ula internal ipv6, caller optionally can specify the /48 range they want from the
   * google defined ULA prefix fd20::/20. The input must be a valid /48 ULA IPv6 address and must be
   * within the fd20::/20. Operation will fail if the speficied /48 is already in used by another
   * resource. If the field is not speficied, then a /48 range will be randomly allocated from
   * fd20::/20 and returned via this field. .
   * @return value or {@code null} for none
   */
  public java.lang.String getInternalIpv6Range() {
    return internalIpv6Range;
  }

  /**
   * When enabling ula internal ipv6, caller optionally can specify the /48 range they want from the
   * google defined ULA prefix fd20::/20. The input must be a valid /48 ULA IPv6 address and must be
   * within the fd20::/20. Operation will fail if the speficied /48 is already in used by another
   * resource. If the field is not speficied, then a /48 range will be randomly allocated from
   * fd20::/20 and returned via this field. .
   * @param internalIpv6Range internalIpv6Range or {@code null} for none
   */
  public Network setInternalIpv6Range(java.lang.String internalIpv6Range) {
    this.internalIpv6Range = internalIpv6Range;
    return this;
  }

  /**
   * [Output Only] Type of the resource. Always compute#network for networks.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource. Always compute#network for networks.
   * @param kind kind or {@code null} for none
   */
  public Network setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Maximum Transmission Unit in bytes. The minimum value for this field is 1300 and the maximum
   * value is 8896. The suggested value is 1500, which is the default MTU used on the Internet, or
   * 8896 if you want to use Jumbo frames. If unspecified, the value defaults to 1460.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMtu() {
    return mtu;
  }

  /**
   * Maximum Transmission Unit in bytes. The minimum value for this field is 1300 and the maximum
   * value is 8896. The suggested value is 1500, which is the default MTU used on the Internet, or
   * 8896 if you want to use Jumbo frames. If unspecified, the value defaults to 1460.
   * @param mtu mtu or {@code null} for none
   */
  public Network setMtu(java.lang.Integer mtu) {
    this.mtu = mtu;
    return this;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be
   * a lowercase letter, and all following characters (except for the last character) must be a
   * dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be
   * a lowercase letter, and all following characters (except for the last character) must be a
   * dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
   * @param name name or {@code null} for none
   */
  public Network setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The network firewall policy enforcement order. Can be either AFTER_CLASSIC_FIREWALL or
   * BEFORE_CLASSIC_FIREWALL. Defaults to AFTER_CLASSIC_FIREWALL if the field is not specified.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetworkFirewallPolicyEnforcementOrder() {
    return networkFirewallPolicyEnforcementOrder;
  }

  /**
   * The network firewall policy enforcement order. Can be either AFTER_CLASSIC_FIREWALL or
   * BEFORE_CLASSIC_FIREWALL. Defaults to AFTER_CLASSIC_FIREWALL if the field is not specified.
   * @param networkFirewallPolicyEnforcementOrder networkFirewallPolicyEnforcementOrder or {@code null} for none
   */
  public Network setNetworkFirewallPolicyEnforcementOrder(java.lang.String networkFirewallPolicyEnforcementOrder) {
    this.networkFirewallPolicyEnforcementOrder = networkFirewallPolicyEnforcementOrder;
    return this;
  }

  /**
   * A full or partial URL of the network profile to apply to this network. This field can be set
   * only at resource creation time. For example, the following are valid URLs: - https://www.google
   * apis.com/compute/{api_version}/projects/{project_id}/global/networkProfiles/{network_profile_na
   * me} - projects/{project_id}/global/networkProfiles/{network_profile_name}
   * @return value or {@code null} for none
   */
  public java.lang.String getNetworkProfile() {
    return networkProfile;
  }

  /**
   * A full or partial URL of the network profile to apply to this network. This field can be set
   * only at resource creation time. For example, the following are valid URLs: - https://www.google
   * apis.com/compute/{api_version}/projects/{project_id}/global/networkProfiles/{network_profile_na
   * me} - projects/{project_id}/global/networkProfiles/{network_profile_name}
   * @param networkProfile networkProfile or {@code null} for none
   */
  public Network setNetworkProfile(java.lang.String networkProfile) {
    this.networkProfile = networkProfile;
    return this;
  }

  /**
   * Input only. [Input Only] Additional params passed with the request, but not persisted as part
   * of resource payload.
   * @return value or {@code null} for none
   */
  public NetworkParams getParams() {
    return params;
  }

  /**
   * Input only. [Input Only] Additional params passed with the request, but not persisted as part
   * of resource payload.
   * @param params params or {@code null} for none
   */
  public Network setParams(NetworkParams params) {
    this.params = params;
    return this;
  }

  /**
   * [Output Only] A list of network peerings for the resource.
   * @return value or {@code null} for none
   */
  public java.util.List<NetworkPeering> getPeerings() {
    return peerings;
  }

  /**
   * [Output Only] A list of network peerings for the resource.
   * @param peerings peerings or {@code null} for none
   */
  public Network setPeerings(java.util.List<NetworkPeering> peerings) {
    this.peerings = peerings;
    return this;
  }

  /**
   * [Output Only] URL of the region where the regional network resides. This field is not
   * applicable to global network. You must specify this field as part of the HTTP request URL. It
   * is not settable as a field in the request body.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * [Output Only] URL of the region where the regional network resides. This field is not
   * applicable to global network. You must specify this field as part of the HTTP request URL. It
   * is not settable as a field in the request body.
   * @param region region or {@code null} for none
   */
  public Network setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * The network-level routing configuration for this network. Used by Cloud Router to determine
   * what type of network-wide routing behavior to enforce.
   * @return value or {@code null} for none
   */
  public NetworkRoutingConfig getRoutingConfig() {
    return routingConfig;
  }

  /**
   * The network-level routing configuration for this network. Used by Cloud Router to determine
   * what type of network-wide routing behavior to enforce.
   * @param routingConfig routingConfig or {@code null} for none
   */
  public Network setRoutingConfig(NetworkRoutingConfig routingConfig) {
    this.routingConfig = routingConfig;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public Network setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for this resource with the resource id.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLinkWithId() {
    return selfLinkWithId;
  }

  /**
   * [Output Only] Server-defined URL for this resource with the resource id.
   * @param selfLinkWithId selfLinkWithId or {@code null} for none
   */
  public Network setSelfLinkWithId(java.lang.String selfLinkWithId) {
    this.selfLinkWithId = selfLinkWithId;
    return this;
  }

  /**
   * [Output Only] Server-defined fully-qualified URLs for all subnetworks in this VPC network.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSubnetworks() {
    return subnetworks;
  }

  /**
   * [Output Only] Server-defined fully-qualified URLs for all subnetworks in this VPC network.
   * @param subnetworks subnetworks or {@code null} for none
   */
  public Network setSubnetworks(java.util.List<java.lang.String> subnetworks) {
    this.subnetworks = subnetworks;
    return this;
  }

  @Override
  public Network set(String fieldName, Object value) {
    return (Network) super.set(fieldName, value);
  }

  @Override
  public Network clone() {
    return (Network) super.clone();
  }

}

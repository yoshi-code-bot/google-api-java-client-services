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
 * Represents a Nat resource. It enables the VMs within the specified subnetworks to access Internet
 * without external IP addresses. It specifies a list of subnetworks (and the ranges within) that
 * want to use NAT. Customers can also provide the external IPs that would be used for NAT. GCP
 * would auto-allocate ephemeral IPs if no external IPs are provided.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RouterNat extends com.google.api.client.json.GenericJson {

  /**
   * The network tier to use when automatically reserving NAT IP addresses. Must be one of: PREMIUM,
   * STANDARD. If not specified, then the current project-level default tier is used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String autoNetworkTier;

  /**
   * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs
   * that have been assigned to the NAT. These IPs should be used for updating/patching a NAT only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> drainNatIps;

  /**
   * Enable Dynamic Port Allocation. If not specified, it is disabled by default. If set to true, -
   * Dynamic Port Allocation will be enabled on this NAT config. - enableEndpointIndependentMapping
   * cannot be set to true. - If minPorts is set, minPortsPerVm must be set to a power of two
   * greater than or equal to 32. If minPortsPerVm is not set, a minimum of 32 ports will be
   * allocated to a VM from this NAT config.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableDynamicPortAllocation;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableEndpointIndependentMapping;

  /**
   * List of NAT-ted endpoint types supported by the Nat Gateway. If the list is empty, then it will
   * be equivalent to include ENDPOINT_TYPE_VM
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> endpointTypes;

  /**
   * Timeout (in seconds) for ICMP connections. Defaults to 30s if not set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer icmpIdleTimeoutSec;

  /**
   * Configure logging on this NAT.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RouterNatLogConfig logConfig;

  /**
   * Maximum number of ports allocated to a VM from this NAT config when Dynamic Port Allocation is
   * enabled. If Dynamic Port Allocation is not enabled, this field has no effect. If Dynamic Port
   * Allocation is enabled, and this field is set, it must be set to a power of two greater than
   * minPortsPerVm, or 64 if minPortsPerVm is not set. If Dynamic Port Allocation is enabled and
   * this field is not set, a maximum of 65536 ports will be allocated to a VM from this NAT config.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxPortsPerVm;

  /**
   * Minimum number of ports allocated to a VM from this NAT config. If not set, a default number of
   * ports is allocated to a VM. This is rounded up to the nearest power of 2. For example, if the
   * value of this field is 50, at least 64 ports are allocated to a VM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer minPortsPerVm;

  /**
   * Unique name of this Nat service. The name must be 1-63 characters long and comply with RFC1035.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * List of Subnetwork resources whose traffic should be translated by NAT64 Gateway. It is used
   * only when LIST_OF_IPV6_SUBNETWORKS is selected for the SubnetworkIpRangeToNat64Option above.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<RouterNatSubnetworkToNat64> nat64Subnetworks;

  /**
   * Specify the NatIpAllocateOption, which can take one of the following values: - MANUAL_ONLY:
   * Uses only Nat IP addresses provided by customers. When there are not enough specified Nat IPs,
   * the Nat service fails for new VMs. - AUTO_ONLY: Nat IPs are allocated by Google Cloud Platform;
   * customers can't specify any Nat IPs. When choosing AUTO_ONLY, then nat_ip should be empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String natIpAllocateOption;

  /**
   * A list of URLs of the IP resources used for this Nat service. These IP addresses must be valid
   * static external IP addresses assigned to the project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> natIps;

  /**
   * A list of rules associated with this NAT.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<RouterNatRule> rules;

  /**
   * Specify the Nat option, which can take one of the following values: -
   * ALL_SUBNETWORKS_ALL_IP_RANGES: All of the IP ranges in every Subnetwork are allowed to Nat. -
   * ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES: All of the primary IP ranges in every Subnetwork are
   * allowed to Nat. - LIST_OF_SUBNETWORKS: A list of Subnetworks are allowed to Nat (specified in
   * the field subnetwork below) The default is SUBNETWORK_IP_RANGE_TO_NAT_OPTION_UNSPECIFIED. Note
   * that if this field contains ALL_SUBNETWORKS_ALL_IP_RANGES then there should not be any other
   * Router.Nat section in any Router for this network in this region.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceSubnetworkIpRangesToNat;

  /**
   * Specify the Nat option for NAT64, which can take one of the following values: -
   * ALL_IPV6_SUBNETWORKS: All of the IP ranges in every Subnetwork are allowed to Nat. -
   * LIST_OF_IPV6_SUBNETWORKS: A list of Subnetworks are allowed to Nat (specified in the field
   * nat64_subnetwork below) The default is NAT64_OPTION_UNSPECIFIED. Note that if this field
   * contains NAT64_ALL_V6_SUBNETWORKS no other Router.Nat section in this region can also enable
   * NAT64 for any Subnetworks in this network. Other Router.Nat sections can still be present to
   * enable NAT44 only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceSubnetworkIpRangesToNat64;

  /**
   * A list of Subnetwork resources whose traffic should be translated by NAT Gateway. It is used
   * only when LIST_OF_SUBNETWORKS is selected for the SubnetworkIpRangeToNatOption above.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<RouterNatSubnetworkToNat> subnetworks;

  /**
   * Timeout (in seconds) for TCP established connections. Defaults to 1200s if not set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer tcpEstablishedIdleTimeoutSec;

  /**
   * Timeout (in seconds) for TCP connections that are in TIME_WAIT state. Defaults to 120s if not
   * set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer tcpTimeWaitTimeoutSec;

  /**
   * Timeout (in seconds) for TCP transitory connections. Defaults to 30s if not set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer tcpTransitoryIdleTimeoutSec;

  /**
   * Indicates whether this NAT is used for public or private IP translation. If unspecified, it
   * defaults to PUBLIC.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Timeout (in seconds) for UDP connections. Defaults to 30s if not set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer udpIdleTimeoutSec;

  /**
   * The network tier to use when automatically reserving NAT IP addresses. Must be one of: PREMIUM,
   * STANDARD. If not specified, then the current project-level default tier is used.
   * @return value or {@code null} for none
   */
  public java.lang.String getAutoNetworkTier() {
    return autoNetworkTier;
  }

  /**
   * The network tier to use when automatically reserving NAT IP addresses. Must be one of: PREMIUM,
   * STANDARD. If not specified, then the current project-level default tier is used.
   * @param autoNetworkTier autoNetworkTier or {@code null} for none
   */
  public RouterNat setAutoNetworkTier(java.lang.String autoNetworkTier) {
    this.autoNetworkTier = autoNetworkTier;
    return this;
  }

  /**
   * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs
   * that have been assigned to the NAT. These IPs should be used for updating/patching a NAT only.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDrainNatIps() {
    return drainNatIps;
  }

  /**
   * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs
   * that have been assigned to the NAT. These IPs should be used for updating/patching a NAT only.
   * @param drainNatIps drainNatIps or {@code null} for none
   */
  public RouterNat setDrainNatIps(java.util.List<java.lang.String> drainNatIps) {
    this.drainNatIps = drainNatIps;
    return this;
  }

  /**
   * Enable Dynamic Port Allocation. If not specified, it is disabled by default. If set to true, -
   * Dynamic Port Allocation will be enabled on this NAT config. - enableEndpointIndependentMapping
   * cannot be set to true. - If minPorts is set, minPortsPerVm must be set to a power of two
   * greater than or equal to 32. If minPortsPerVm is not set, a minimum of 32 ports will be
   * allocated to a VM from this NAT config.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableDynamicPortAllocation() {
    return enableDynamicPortAllocation;
  }

  /**
   * Enable Dynamic Port Allocation. If not specified, it is disabled by default. If set to true, -
   * Dynamic Port Allocation will be enabled on this NAT config. - enableEndpointIndependentMapping
   * cannot be set to true. - If minPorts is set, minPortsPerVm must be set to a power of two
   * greater than or equal to 32. If minPortsPerVm is not set, a minimum of 32 ports will be
   * allocated to a VM from this NAT config.
   * @param enableDynamicPortAllocation enableDynamicPortAllocation or {@code null} for none
   */
  public RouterNat setEnableDynamicPortAllocation(java.lang.Boolean enableDynamicPortAllocation) {
    this.enableDynamicPortAllocation = enableDynamicPortAllocation;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableEndpointIndependentMapping() {
    return enableEndpointIndependentMapping;
  }

  /**
   * @param enableEndpointIndependentMapping enableEndpointIndependentMapping or {@code null} for none
   */
  public RouterNat setEnableEndpointIndependentMapping(java.lang.Boolean enableEndpointIndependentMapping) {
    this.enableEndpointIndependentMapping = enableEndpointIndependentMapping;
    return this;
  }

  /**
   * List of NAT-ted endpoint types supported by the Nat Gateway. If the list is empty, then it will
   * be equivalent to include ENDPOINT_TYPE_VM
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getEndpointTypes() {
    return endpointTypes;
  }

  /**
   * List of NAT-ted endpoint types supported by the Nat Gateway. If the list is empty, then it will
   * be equivalent to include ENDPOINT_TYPE_VM
   * @param endpointTypes endpointTypes or {@code null} for none
   */
  public RouterNat setEndpointTypes(java.util.List<java.lang.String> endpointTypes) {
    this.endpointTypes = endpointTypes;
    return this;
  }

  /**
   * Timeout (in seconds) for ICMP connections. Defaults to 30s if not set.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getIcmpIdleTimeoutSec() {
    return icmpIdleTimeoutSec;
  }

  /**
   * Timeout (in seconds) for ICMP connections. Defaults to 30s if not set.
   * @param icmpIdleTimeoutSec icmpIdleTimeoutSec or {@code null} for none
   */
  public RouterNat setIcmpIdleTimeoutSec(java.lang.Integer icmpIdleTimeoutSec) {
    this.icmpIdleTimeoutSec = icmpIdleTimeoutSec;
    return this;
  }

  /**
   * Configure logging on this NAT.
   * @return value or {@code null} for none
   */
  public RouterNatLogConfig getLogConfig() {
    return logConfig;
  }

  /**
   * Configure logging on this NAT.
   * @param logConfig logConfig or {@code null} for none
   */
  public RouterNat setLogConfig(RouterNatLogConfig logConfig) {
    this.logConfig = logConfig;
    return this;
  }

  /**
   * Maximum number of ports allocated to a VM from this NAT config when Dynamic Port Allocation is
   * enabled. If Dynamic Port Allocation is not enabled, this field has no effect. If Dynamic Port
   * Allocation is enabled, and this field is set, it must be set to a power of two greater than
   * minPortsPerVm, or 64 if minPortsPerVm is not set. If Dynamic Port Allocation is enabled and
   * this field is not set, a maximum of 65536 ports will be allocated to a VM from this NAT config.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxPortsPerVm() {
    return maxPortsPerVm;
  }

  /**
   * Maximum number of ports allocated to a VM from this NAT config when Dynamic Port Allocation is
   * enabled. If Dynamic Port Allocation is not enabled, this field has no effect. If Dynamic Port
   * Allocation is enabled, and this field is set, it must be set to a power of two greater than
   * minPortsPerVm, or 64 if minPortsPerVm is not set. If Dynamic Port Allocation is enabled and
   * this field is not set, a maximum of 65536 ports will be allocated to a VM from this NAT config.
   * @param maxPortsPerVm maxPortsPerVm or {@code null} for none
   */
  public RouterNat setMaxPortsPerVm(java.lang.Integer maxPortsPerVm) {
    this.maxPortsPerVm = maxPortsPerVm;
    return this;
  }

  /**
   * Minimum number of ports allocated to a VM from this NAT config. If not set, a default number of
   * ports is allocated to a VM. This is rounded up to the nearest power of 2. For example, if the
   * value of this field is 50, at least 64 ports are allocated to a VM.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMinPortsPerVm() {
    return minPortsPerVm;
  }

  /**
   * Minimum number of ports allocated to a VM from this NAT config. If not set, a default number of
   * ports is allocated to a VM. This is rounded up to the nearest power of 2. For example, if the
   * value of this field is 50, at least 64 ports are allocated to a VM.
   * @param minPortsPerVm minPortsPerVm or {@code null} for none
   */
  public RouterNat setMinPortsPerVm(java.lang.Integer minPortsPerVm) {
    this.minPortsPerVm = minPortsPerVm;
    return this;
  }

  /**
   * Unique name of this Nat service. The name must be 1-63 characters long and comply with RFC1035.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Unique name of this Nat service. The name must be 1-63 characters long and comply with RFC1035.
   * @param name name or {@code null} for none
   */
  public RouterNat setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * List of Subnetwork resources whose traffic should be translated by NAT64 Gateway. It is used
   * only when LIST_OF_IPV6_SUBNETWORKS is selected for the SubnetworkIpRangeToNat64Option above.
   * @return value or {@code null} for none
   */
  public java.util.List<RouterNatSubnetworkToNat64> getNat64Subnetworks() {
    return nat64Subnetworks;
  }

  /**
   * List of Subnetwork resources whose traffic should be translated by NAT64 Gateway. It is used
   * only when LIST_OF_IPV6_SUBNETWORKS is selected for the SubnetworkIpRangeToNat64Option above.
   * @param nat64Subnetworks nat64Subnetworks or {@code null} for none
   */
  public RouterNat setNat64Subnetworks(java.util.List<RouterNatSubnetworkToNat64> nat64Subnetworks) {
    this.nat64Subnetworks = nat64Subnetworks;
    return this;
  }

  /**
   * Specify the NatIpAllocateOption, which can take one of the following values: - MANUAL_ONLY:
   * Uses only Nat IP addresses provided by customers. When there are not enough specified Nat IPs,
   * the Nat service fails for new VMs. - AUTO_ONLY: Nat IPs are allocated by Google Cloud Platform;
   * customers can't specify any Nat IPs. When choosing AUTO_ONLY, then nat_ip should be empty.
   * @return value or {@code null} for none
   */
  public java.lang.String getNatIpAllocateOption() {
    return natIpAllocateOption;
  }

  /**
   * Specify the NatIpAllocateOption, which can take one of the following values: - MANUAL_ONLY:
   * Uses only Nat IP addresses provided by customers. When there are not enough specified Nat IPs,
   * the Nat service fails for new VMs. - AUTO_ONLY: Nat IPs are allocated by Google Cloud Platform;
   * customers can't specify any Nat IPs. When choosing AUTO_ONLY, then nat_ip should be empty.
   * @param natIpAllocateOption natIpAllocateOption or {@code null} for none
   */
  public RouterNat setNatIpAllocateOption(java.lang.String natIpAllocateOption) {
    this.natIpAllocateOption = natIpAllocateOption;
    return this;
  }

  /**
   * A list of URLs of the IP resources used for this Nat service. These IP addresses must be valid
   * static external IP addresses assigned to the project.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getNatIps() {
    return natIps;
  }

  /**
   * A list of URLs of the IP resources used for this Nat service. These IP addresses must be valid
   * static external IP addresses assigned to the project.
   * @param natIps natIps or {@code null} for none
   */
  public RouterNat setNatIps(java.util.List<java.lang.String> natIps) {
    this.natIps = natIps;
    return this;
  }

  /**
   * A list of rules associated with this NAT.
   * @return value or {@code null} for none
   */
  public java.util.List<RouterNatRule> getRules() {
    return rules;
  }

  /**
   * A list of rules associated with this NAT.
   * @param rules rules or {@code null} for none
   */
  public RouterNat setRules(java.util.List<RouterNatRule> rules) {
    this.rules = rules;
    return this;
  }

  /**
   * Specify the Nat option, which can take one of the following values: -
   * ALL_SUBNETWORKS_ALL_IP_RANGES: All of the IP ranges in every Subnetwork are allowed to Nat. -
   * ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES: All of the primary IP ranges in every Subnetwork are
   * allowed to Nat. - LIST_OF_SUBNETWORKS: A list of Subnetworks are allowed to Nat (specified in
   * the field subnetwork below) The default is SUBNETWORK_IP_RANGE_TO_NAT_OPTION_UNSPECIFIED. Note
   * that if this field contains ALL_SUBNETWORKS_ALL_IP_RANGES then there should not be any other
   * Router.Nat section in any Router for this network in this region.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceSubnetworkIpRangesToNat() {
    return sourceSubnetworkIpRangesToNat;
  }

  /**
   * Specify the Nat option, which can take one of the following values: -
   * ALL_SUBNETWORKS_ALL_IP_RANGES: All of the IP ranges in every Subnetwork are allowed to Nat. -
   * ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES: All of the primary IP ranges in every Subnetwork are
   * allowed to Nat. - LIST_OF_SUBNETWORKS: A list of Subnetworks are allowed to Nat (specified in
   * the field subnetwork below) The default is SUBNETWORK_IP_RANGE_TO_NAT_OPTION_UNSPECIFIED. Note
   * that if this field contains ALL_SUBNETWORKS_ALL_IP_RANGES then there should not be any other
   * Router.Nat section in any Router for this network in this region.
   * @param sourceSubnetworkIpRangesToNat sourceSubnetworkIpRangesToNat or {@code null} for none
   */
  public RouterNat setSourceSubnetworkIpRangesToNat(java.lang.String sourceSubnetworkIpRangesToNat) {
    this.sourceSubnetworkIpRangesToNat = sourceSubnetworkIpRangesToNat;
    return this;
  }

  /**
   * Specify the Nat option for NAT64, which can take one of the following values: -
   * ALL_IPV6_SUBNETWORKS: All of the IP ranges in every Subnetwork are allowed to Nat. -
   * LIST_OF_IPV6_SUBNETWORKS: A list of Subnetworks are allowed to Nat (specified in the field
   * nat64_subnetwork below) The default is NAT64_OPTION_UNSPECIFIED. Note that if this field
   * contains NAT64_ALL_V6_SUBNETWORKS no other Router.Nat section in this region can also enable
   * NAT64 for any Subnetworks in this network. Other Router.Nat sections can still be present to
   * enable NAT44 only.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceSubnetworkIpRangesToNat64() {
    return sourceSubnetworkIpRangesToNat64;
  }

  /**
   * Specify the Nat option for NAT64, which can take one of the following values: -
   * ALL_IPV6_SUBNETWORKS: All of the IP ranges in every Subnetwork are allowed to Nat. -
   * LIST_OF_IPV6_SUBNETWORKS: A list of Subnetworks are allowed to Nat (specified in the field
   * nat64_subnetwork below) The default is NAT64_OPTION_UNSPECIFIED. Note that if this field
   * contains NAT64_ALL_V6_SUBNETWORKS no other Router.Nat section in this region can also enable
   * NAT64 for any Subnetworks in this network. Other Router.Nat sections can still be present to
   * enable NAT44 only.
   * @param sourceSubnetworkIpRangesToNat64 sourceSubnetworkIpRangesToNat64 or {@code null} for none
   */
  public RouterNat setSourceSubnetworkIpRangesToNat64(java.lang.String sourceSubnetworkIpRangesToNat64) {
    this.sourceSubnetworkIpRangesToNat64 = sourceSubnetworkIpRangesToNat64;
    return this;
  }

  /**
   * A list of Subnetwork resources whose traffic should be translated by NAT Gateway. It is used
   * only when LIST_OF_SUBNETWORKS is selected for the SubnetworkIpRangeToNatOption above.
   * @return value or {@code null} for none
   */
  public java.util.List<RouterNatSubnetworkToNat> getSubnetworks() {
    return subnetworks;
  }

  /**
   * A list of Subnetwork resources whose traffic should be translated by NAT Gateway. It is used
   * only when LIST_OF_SUBNETWORKS is selected for the SubnetworkIpRangeToNatOption above.
   * @param subnetworks subnetworks or {@code null} for none
   */
  public RouterNat setSubnetworks(java.util.List<RouterNatSubnetworkToNat> subnetworks) {
    this.subnetworks = subnetworks;
    return this;
  }

  /**
   * Timeout (in seconds) for TCP established connections. Defaults to 1200s if not set.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTcpEstablishedIdleTimeoutSec() {
    return tcpEstablishedIdleTimeoutSec;
  }

  /**
   * Timeout (in seconds) for TCP established connections. Defaults to 1200s if not set.
   * @param tcpEstablishedIdleTimeoutSec tcpEstablishedIdleTimeoutSec or {@code null} for none
   */
  public RouterNat setTcpEstablishedIdleTimeoutSec(java.lang.Integer tcpEstablishedIdleTimeoutSec) {
    this.tcpEstablishedIdleTimeoutSec = tcpEstablishedIdleTimeoutSec;
    return this;
  }

  /**
   * Timeout (in seconds) for TCP connections that are in TIME_WAIT state. Defaults to 120s if not
   * set.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTcpTimeWaitTimeoutSec() {
    return tcpTimeWaitTimeoutSec;
  }

  /**
   * Timeout (in seconds) for TCP connections that are in TIME_WAIT state. Defaults to 120s if not
   * set.
   * @param tcpTimeWaitTimeoutSec tcpTimeWaitTimeoutSec or {@code null} for none
   */
  public RouterNat setTcpTimeWaitTimeoutSec(java.lang.Integer tcpTimeWaitTimeoutSec) {
    this.tcpTimeWaitTimeoutSec = tcpTimeWaitTimeoutSec;
    return this;
  }

  /**
   * Timeout (in seconds) for TCP transitory connections. Defaults to 30s if not set.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTcpTransitoryIdleTimeoutSec() {
    return tcpTransitoryIdleTimeoutSec;
  }

  /**
   * Timeout (in seconds) for TCP transitory connections. Defaults to 30s if not set.
   * @param tcpTransitoryIdleTimeoutSec tcpTransitoryIdleTimeoutSec or {@code null} for none
   */
  public RouterNat setTcpTransitoryIdleTimeoutSec(java.lang.Integer tcpTransitoryIdleTimeoutSec) {
    this.tcpTransitoryIdleTimeoutSec = tcpTransitoryIdleTimeoutSec;
    return this;
  }

  /**
   * Indicates whether this NAT is used for public or private IP translation. If unspecified, it
   * defaults to PUBLIC.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Indicates whether this NAT is used for public or private IP translation. If unspecified, it
   * defaults to PUBLIC.
   * @param type type or {@code null} for none
   */
  public RouterNat setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * Timeout (in seconds) for UDP connections. Defaults to 30s if not set.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getUdpIdleTimeoutSec() {
    return udpIdleTimeoutSec;
  }

  /**
   * Timeout (in seconds) for UDP connections. Defaults to 30s if not set.
   * @param udpIdleTimeoutSec udpIdleTimeoutSec or {@code null} for none
   */
  public RouterNat setUdpIdleTimeoutSec(java.lang.Integer udpIdleTimeoutSec) {
    this.udpIdleTimeoutSec = udpIdleTimeoutSec;
    return this;
  }

  @Override
  public RouterNat set(String fieldName, Object value) {
    return (RouterNat) super.set(fieldName, value);
  }

  @Override
  public RouterNat clone() {
    return (RouterNat) super.clone();
  }

}

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

package com.google.api.services.memcache.v1.model;

/**
 * A Memorystore for Memcached instance
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Memorystore for Memcached API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Instance extends com.google.api.client.json.GenericJson {

  /**
   * The full name of the Google Compute Engine [network](/compute/docs/networks-and-
   * firewalls#networks) to which the instance is connected. If left unspecified, the `default`
   * network will be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String authorizedNetwork;

  /**
   * Output only. The time the instance was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. Endpoint for the Discovery API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String discoveryEndpoint;

  /**
   * User provided name for the instance, which is only used for display purposes. Cannot be more
   * than 80 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * List of messages that describe the current state of the Memcached instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<InstanceMessage> instanceMessages;

  /**
   * Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for
   * more details. https://cloud.google.com/compute/docs/labeling-resources
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * The maintenance policy for the instance. If not provided, the maintenance event will be
   * performed based on Memorystore internal rollout schedule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudMemcacheV1MaintenancePolicy maintenancePolicy;

  /**
   * Output only. Published maintenance schedule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MaintenanceSchedule maintenanceSchedule;

  /**
   * Output only. The full version of memcached server running on this instance. System
   * automatically determines the full memcached version for an instance based on the input
   * MemcacheVersion. The full version format will be "memcached-1.5.16".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String memcacheFullVersion;

  /**
   * Output only. List of Memcached nodes. Refer to Node message for more details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Node> memcacheNodes;

  /**
   * The major version of Memcached software. If not provided, latest supported version will be
   * used. Currently the latest supported major version is `MEMCACHE_1_5`. The minor version will be
   * automatically determined by our system based on the latest supported minor version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String memcacheVersion;

  /**
   * Required. Unique name of the resource in this scope including project and location using the
   * form: `projects/{project_id}/locations/{location_id}/instances/{instance_id}` Note: Memcached
   * instances are managed and addressed at the regional level so `location_id` here refers to a
   * Google Cloud region; however, users may choose which zones Memcached nodes should be
   * provisioned in within an instance. Refer to zones field for more details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. Configuration for Memcached nodes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NodeConfig nodeConfig;

  /**
   * Required. Number of nodes in the Memcached instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer nodeCount;

  /**
   * User defined parameters to apply to the memcached process on each node.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MemcacheParameters parameters;

  /**
   * Optional. Contains the id of allocated IP address ranges associated with the private service
   * access connection for example, "test-default" associated with IP range 10.0.0.0/29.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> reservedIpRangeId;

  /**
   * Optional. Output only. Reserved for future use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean satisfiesPzi;

  /**
   * Optional. Output only. Reserved for future use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean satisfiesPzs;

  /**
   * Output only. The state of this Memcached instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. The time the instance was updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Zones in which Memcached nodes should be provisioned. Memcached nodes will be equally
   * distributed across these zones. If not provided, the service will by default create nodes in
   * all zones in the region for the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> zones;

  /**
   * The full name of the Google Compute Engine [network](/compute/docs/networks-and-
   * firewalls#networks) to which the instance is connected. If left unspecified, the `default`
   * network will be used.
   * @return value or {@code null} for none
   */
  public java.lang.String getAuthorizedNetwork() {
    return authorizedNetwork;
  }

  /**
   * The full name of the Google Compute Engine [network](/compute/docs/networks-and-
   * firewalls#networks) to which the instance is connected. If left unspecified, the `default`
   * network will be used.
   * @param authorizedNetwork authorizedNetwork or {@code null} for none
   */
  public Instance setAuthorizedNetwork(java.lang.String authorizedNetwork) {
    this.authorizedNetwork = authorizedNetwork;
    return this;
  }

  /**
   * Output only. The time the instance was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time the instance was created.
   * @param createTime createTime or {@code null} for none
   */
  public Instance setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. Endpoint for the Discovery API.
   * @return value or {@code null} for none
   */
  public java.lang.String getDiscoveryEndpoint() {
    return discoveryEndpoint;
  }

  /**
   * Output only. Endpoint for the Discovery API.
   * @param discoveryEndpoint discoveryEndpoint or {@code null} for none
   */
  public Instance setDiscoveryEndpoint(java.lang.String discoveryEndpoint) {
    this.discoveryEndpoint = discoveryEndpoint;
    return this;
  }

  /**
   * User provided name for the instance, which is only used for display purposes. Cannot be more
   * than 80 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * User provided name for the instance, which is only used for display purposes. Cannot be more
   * than 80 characters.
   * @param displayName displayName or {@code null} for none
   */
  public Instance setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * List of messages that describe the current state of the Memcached instance.
   * @return value or {@code null} for none
   */
  public java.util.List<InstanceMessage> getInstanceMessages() {
    return instanceMessages;
  }

  /**
   * List of messages that describe the current state of the Memcached instance.
   * @param instanceMessages instanceMessages or {@code null} for none
   */
  public Instance setInstanceMessages(java.util.List<InstanceMessage> instanceMessages) {
    this.instanceMessages = instanceMessages;
    return this;
  }

  /**
   * Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for
   * more details. https://cloud.google.com/compute/docs/labeling-resources
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for
   * more details. https://cloud.google.com/compute/docs/labeling-resources
   * @param labels labels or {@code null} for none
   */
  public Instance setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * The maintenance policy for the instance. If not provided, the maintenance event will be
   * performed based on Memorystore internal rollout schedule.
   * @return value or {@code null} for none
   */
  public GoogleCloudMemcacheV1MaintenancePolicy getMaintenancePolicy() {
    return maintenancePolicy;
  }

  /**
   * The maintenance policy for the instance. If not provided, the maintenance event will be
   * performed based on Memorystore internal rollout schedule.
   * @param maintenancePolicy maintenancePolicy or {@code null} for none
   */
  public Instance setMaintenancePolicy(GoogleCloudMemcacheV1MaintenancePolicy maintenancePolicy) {
    this.maintenancePolicy = maintenancePolicy;
    return this;
  }

  /**
   * Output only. Published maintenance schedule.
   * @return value or {@code null} for none
   */
  public MaintenanceSchedule getMaintenanceSchedule() {
    return maintenanceSchedule;
  }

  /**
   * Output only. Published maintenance schedule.
   * @param maintenanceSchedule maintenanceSchedule or {@code null} for none
   */
  public Instance setMaintenanceSchedule(MaintenanceSchedule maintenanceSchedule) {
    this.maintenanceSchedule = maintenanceSchedule;
    return this;
  }

  /**
   * Output only. The full version of memcached server running on this instance. System
   * automatically determines the full memcached version for an instance based on the input
   * MemcacheVersion. The full version format will be "memcached-1.5.16".
   * @return value or {@code null} for none
   */
  public java.lang.String getMemcacheFullVersion() {
    return memcacheFullVersion;
  }

  /**
   * Output only. The full version of memcached server running on this instance. System
   * automatically determines the full memcached version for an instance based on the input
   * MemcacheVersion. The full version format will be "memcached-1.5.16".
   * @param memcacheFullVersion memcacheFullVersion or {@code null} for none
   */
  public Instance setMemcacheFullVersion(java.lang.String memcacheFullVersion) {
    this.memcacheFullVersion = memcacheFullVersion;
    return this;
  }

  /**
   * Output only. List of Memcached nodes. Refer to Node message for more details.
   * @return value or {@code null} for none
   */
  public java.util.List<Node> getMemcacheNodes() {
    return memcacheNodes;
  }

  /**
   * Output only. List of Memcached nodes. Refer to Node message for more details.
   * @param memcacheNodes memcacheNodes or {@code null} for none
   */
  public Instance setMemcacheNodes(java.util.List<Node> memcacheNodes) {
    this.memcacheNodes = memcacheNodes;
    return this;
  }

  /**
   * The major version of Memcached software. If not provided, latest supported version will be
   * used. Currently the latest supported major version is `MEMCACHE_1_5`. The minor version will be
   * automatically determined by our system based on the latest supported minor version.
   * @return value or {@code null} for none
   */
  public java.lang.String getMemcacheVersion() {
    return memcacheVersion;
  }

  /**
   * The major version of Memcached software. If not provided, latest supported version will be
   * used. Currently the latest supported major version is `MEMCACHE_1_5`. The minor version will be
   * automatically determined by our system based on the latest supported minor version.
   * @param memcacheVersion memcacheVersion or {@code null} for none
   */
  public Instance setMemcacheVersion(java.lang.String memcacheVersion) {
    this.memcacheVersion = memcacheVersion;
    return this;
  }

  /**
   * Required. Unique name of the resource in this scope including project and location using the
   * form: `projects/{project_id}/locations/{location_id}/instances/{instance_id}` Note: Memcached
   * instances are managed and addressed at the regional level so `location_id` here refers to a
   * Google Cloud region; however, users may choose which zones Memcached nodes should be
   * provisioned in within an instance. Refer to zones field for more details.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. Unique name of the resource in this scope including project and location using the
   * form: `projects/{project_id}/locations/{location_id}/instances/{instance_id}` Note: Memcached
   * instances are managed and addressed at the regional level so `location_id` here refers to a
   * Google Cloud region; however, users may choose which zones Memcached nodes should be
   * provisioned in within an instance. Refer to zones field for more details.
   * @param name name or {@code null} for none
   */
  public Instance setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. Configuration for Memcached nodes.
   * @return value or {@code null} for none
   */
  public NodeConfig getNodeConfig() {
    return nodeConfig;
  }

  /**
   * Required. Configuration for Memcached nodes.
   * @param nodeConfig nodeConfig or {@code null} for none
   */
  public Instance setNodeConfig(NodeConfig nodeConfig) {
    this.nodeConfig = nodeConfig;
    return this;
  }

  /**
   * Required. Number of nodes in the Memcached instance.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNodeCount() {
    return nodeCount;
  }

  /**
   * Required. Number of nodes in the Memcached instance.
   * @param nodeCount nodeCount or {@code null} for none
   */
  public Instance setNodeCount(java.lang.Integer nodeCount) {
    this.nodeCount = nodeCount;
    return this;
  }

  /**
   * User defined parameters to apply to the memcached process on each node.
   * @return value or {@code null} for none
   */
  public MemcacheParameters getParameters() {
    return parameters;
  }

  /**
   * User defined parameters to apply to the memcached process on each node.
   * @param parameters parameters or {@code null} for none
   */
  public Instance setParameters(MemcacheParameters parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * Optional. Contains the id of allocated IP address ranges associated with the private service
   * access connection for example, "test-default" associated with IP range 10.0.0.0/29.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getReservedIpRangeId() {
    return reservedIpRangeId;
  }

  /**
   * Optional. Contains the id of allocated IP address ranges associated with the private service
   * access connection for example, "test-default" associated with IP range 10.0.0.0/29.
   * @param reservedIpRangeId reservedIpRangeId or {@code null} for none
   */
  public Instance setReservedIpRangeId(java.util.List<java.lang.String> reservedIpRangeId) {
    this.reservedIpRangeId = reservedIpRangeId;
    return this;
  }

  /**
   * Optional. Output only. Reserved for future use.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSatisfiesPzi() {
    return satisfiesPzi;
  }

  /**
   * Optional. Output only. Reserved for future use.
   * @param satisfiesPzi satisfiesPzi or {@code null} for none
   */
  public Instance setSatisfiesPzi(java.lang.Boolean satisfiesPzi) {
    this.satisfiesPzi = satisfiesPzi;
    return this;
  }

  /**
   * Optional. Output only. Reserved for future use.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSatisfiesPzs() {
    return satisfiesPzs;
  }

  /**
   * Optional. Output only. Reserved for future use.
   * @param satisfiesPzs satisfiesPzs or {@code null} for none
   */
  public Instance setSatisfiesPzs(java.lang.Boolean satisfiesPzs) {
    this.satisfiesPzs = satisfiesPzs;
    return this;
  }

  /**
   * Output only. The state of this Memcached instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The state of this Memcached instance.
   * @param state state or {@code null} for none
   */
  public Instance setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. The time the instance was updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The time the instance was updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public Instance setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Zones in which Memcached nodes should be provisioned. Memcached nodes will be equally
   * distributed across these zones. If not provided, the service will by default create nodes in
   * all zones in the region for the instance.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getZones() {
    return zones;
  }

  /**
   * Zones in which Memcached nodes should be provisioned. Memcached nodes will be equally
   * distributed across these zones. If not provided, the service will by default create nodes in
   * all zones in the region for the instance.
   * @param zones zones or {@code null} for none
   */
  public Instance setZones(java.util.List<java.lang.String> zones) {
    this.zones = zones;
    return this;
  }

  @Override
  public Instance set(String fieldName, Object value) {
    return (Instance) super.set(fieldName, value);
  }

  @Override
  public Instance clone() {
    return (Instance) super.clone();
  }

}

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

package com.google.api.services.parallelstore.v1beta.model;

/**
 * A Parallelstore instance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Parallelstore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Instance extends com.google.api.client.json.GenericJson {

  /**
   * Output only. A list of IPv4 addresses used for client side configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> accessPoints;

  /**
   * Required. Immutable. The instance's storage capacity in Gibibytes (GiB). Allowed values are
   * between 12000 and 100000, in multiples of 4000; e.g., 12000, 16000, 20000, ...
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long capacityGib;

  /**
   * Output only. The time when the instance was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. Deprecated: The version of DAOS software running in the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String daosVersion;

  /**
   * Optional. Immutable. The deployment type of the instance. Allowed values are: * `SCRATCH`: the
   * instance is a scratch instance. * `PERSISTENT`: the instance is a persistent instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deploymentType;

  /**
   * Optional. The description of the instance. 2048 characters or less.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Optional. Immutable. Stripe level for directories. Allowed values are: *
   * `DIRECTORY_STRIPE_LEVEL_MIN`: recommended when directories contain a small number of files. *
   * `DIRECTORY_STRIPE_LEVEL_BALANCED`: balances performance for workloads involving a mix of small
   * and large directories. * `DIRECTORY_STRIPE_LEVEL_MAX`: recommended for directories with a large
   * number of files.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String directoryStripeLevel;

  /**
   * Output only. Immutable. The ID of the IP address range being used by the instance's VPC
   * network. This field is populated by the service and contains the value currently used by the
   * service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String effectiveReservedIpRange;

  /**
   * Optional. Immutable. Stripe level for files. Allowed values are: * `FILE_STRIPE_LEVEL_MIN`:
   * offers the best performance for small size files. * `FILE_STRIPE_LEVEL_BALANCED`: balances
   * performance for workloads involving a mix of small and large files. * `FILE_STRIPE_LEVEL_MAX`:
   * higher throughput performance for larger files.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fileStripeLevel;

  /**
   * Optional. Cloud Labels are a flexible and lightweight mechanism for organizing cloud resources
   * into groups that reflect a customer's organizational needs and deployment strategies. See
   * https://cloud.google.com/resource-manager/docs/labels-overview for details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Identifier. The resource name of the instance, in the format
   * `projects/{project}/locations/{location}/instances/{instance_id}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. Immutable. The name of the Compute Engine [VPC
   * network](https://cloud.google.com/vpc/docs/vpc) to which the instance is connected.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String network;

  /**
   * Optional. Immutable. The ID of the IP address range being used by the instance's VPC network.
   * See [Configure a VPC
   * network](https://cloud.google.com/parallelstore/docs/vpc#create_and_configure_the_vpc). If no
   * ID is provided, all ranges are considered.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reservedIpRange;

  /**
   * Output only. The instance state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. The time when the instance was updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. A list of IPv4 addresses used for client side configuration.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAccessPoints() {
    return accessPoints;
  }

  /**
   * Output only. A list of IPv4 addresses used for client side configuration.
   * @param accessPoints accessPoints or {@code null} for none
   */
  public Instance setAccessPoints(java.util.List<java.lang.String> accessPoints) {
    this.accessPoints = accessPoints;
    return this;
  }

  /**
   * Required. Immutable. The instance's storage capacity in Gibibytes (GiB). Allowed values are
   * between 12000 and 100000, in multiples of 4000; e.g., 12000, 16000, 20000, ...
   * @return value or {@code null} for none
   */
  public java.lang.Long getCapacityGib() {
    return capacityGib;
  }

  /**
   * Required. Immutable. The instance's storage capacity in Gibibytes (GiB). Allowed values are
   * between 12000 and 100000, in multiples of 4000; e.g., 12000, 16000, 20000, ...
   * @param capacityGib capacityGib or {@code null} for none
   */
  public Instance setCapacityGib(java.lang.Long capacityGib) {
    this.capacityGib = capacityGib;
    return this;
  }

  /**
   * Output only. The time when the instance was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time when the instance was created.
   * @param createTime createTime or {@code null} for none
   */
  public Instance setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. Deprecated: The version of DAOS software running in the instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getDaosVersion() {
    return daosVersion;
  }

  /**
   * Output only. Deprecated: The version of DAOS software running in the instance.
   * @param daosVersion daosVersion or {@code null} for none
   */
  public Instance setDaosVersion(java.lang.String daosVersion) {
    this.daosVersion = daosVersion;
    return this;
  }

  /**
   * Optional. Immutable. The deployment type of the instance. Allowed values are: * `SCRATCH`: the
   * instance is a scratch instance. * `PERSISTENT`: the instance is a persistent instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeploymentType() {
    return deploymentType;
  }

  /**
   * Optional. Immutable. The deployment type of the instance. Allowed values are: * `SCRATCH`: the
   * instance is a scratch instance. * `PERSISTENT`: the instance is a persistent instance.
   * @param deploymentType deploymentType or {@code null} for none
   */
  public Instance setDeploymentType(java.lang.String deploymentType) {
    this.deploymentType = deploymentType;
    return this;
  }

  /**
   * Optional. The description of the instance. 2048 characters or less.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. The description of the instance. 2048 characters or less.
   * @param description description or {@code null} for none
   */
  public Instance setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional. Immutable. Stripe level for directories. Allowed values are: *
   * `DIRECTORY_STRIPE_LEVEL_MIN`: recommended when directories contain a small number of files. *
   * `DIRECTORY_STRIPE_LEVEL_BALANCED`: balances performance for workloads involving a mix of small
   * and large directories. * `DIRECTORY_STRIPE_LEVEL_MAX`: recommended for directories with a large
   * number of files.
   * @return value or {@code null} for none
   */
  public java.lang.String getDirectoryStripeLevel() {
    return directoryStripeLevel;
  }

  /**
   * Optional. Immutable. Stripe level for directories. Allowed values are: *
   * `DIRECTORY_STRIPE_LEVEL_MIN`: recommended when directories contain a small number of files. *
   * `DIRECTORY_STRIPE_LEVEL_BALANCED`: balances performance for workloads involving a mix of small
   * and large directories. * `DIRECTORY_STRIPE_LEVEL_MAX`: recommended for directories with a large
   * number of files.
   * @param directoryStripeLevel directoryStripeLevel or {@code null} for none
   */
  public Instance setDirectoryStripeLevel(java.lang.String directoryStripeLevel) {
    this.directoryStripeLevel = directoryStripeLevel;
    return this;
  }

  /**
   * Output only. Immutable. The ID of the IP address range being used by the instance's VPC
   * network. This field is populated by the service and contains the value currently used by the
   * service.
   * @return value or {@code null} for none
   */
  public java.lang.String getEffectiveReservedIpRange() {
    return effectiveReservedIpRange;
  }

  /**
   * Output only. Immutable. The ID of the IP address range being used by the instance's VPC
   * network. This field is populated by the service and contains the value currently used by the
   * service.
   * @param effectiveReservedIpRange effectiveReservedIpRange or {@code null} for none
   */
  public Instance setEffectiveReservedIpRange(java.lang.String effectiveReservedIpRange) {
    this.effectiveReservedIpRange = effectiveReservedIpRange;
    return this;
  }

  /**
   * Optional. Immutable. Stripe level for files. Allowed values are: * `FILE_STRIPE_LEVEL_MIN`:
   * offers the best performance for small size files. * `FILE_STRIPE_LEVEL_BALANCED`: balances
   * performance for workloads involving a mix of small and large files. * `FILE_STRIPE_LEVEL_MAX`:
   * higher throughput performance for larger files.
   * @return value or {@code null} for none
   */
  public java.lang.String getFileStripeLevel() {
    return fileStripeLevel;
  }

  /**
   * Optional. Immutable. Stripe level for files. Allowed values are: * `FILE_STRIPE_LEVEL_MIN`:
   * offers the best performance for small size files. * `FILE_STRIPE_LEVEL_BALANCED`: balances
   * performance for workloads involving a mix of small and large files. * `FILE_STRIPE_LEVEL_MAX`:
   * higher throughput performance for larger files.
   * @param fileStripeLevel fileStripeLevel or {@code null} for none
   */
  public Instance setFileStripeLevel(java.lang.String fileStripeLevel) {
    this.fileStripeLevel = fileStripeLevel;
    return this;
  }

  /**
   * Optional. Cloud Labels are a flexible and lightweight mechanism for organizing cloud resources
   * into groups that reflect a customer's organizational needs and deployment strategies. See
   * https://cloud.google.com/resource-manager/docs/labels-overview for details.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. Cloud Labels are a flexible and lightweight mechanism for organizing cloud resources
   * into groups that reflect a customer's organizational needs and deployment strategies. See
   * https://cloud.google.com/resource-manager/docs/labels-overview for details.
   * @param labels labels or {@code null} for none
   */
  public Instance setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Identifier. The resource name of the instance, in the format
   * `projects/{project}/locations/{location}/instances/{instance_id}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Identifier. The resource name of the instance, in the format
   * `projects/{project}/locations/{location}/instances/{instance_id}`.
   * @param name name or {@code null} for none
   */
  public Instance setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. Immutable. The name of the Compute Engine [VPC
   * network](https://cloud.google.com/vpc/docs/vpc) to which the instance is connected.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetwork() {
    return network;
  }

  /**
   * Optional. Immutable. The name of the Compute Engine [VPC
   * network](https://cloud.google.com/vpc/docs/vpc) to which the instance is connected.
   * @param network network or {@code null} for none
   */
  public Instance setNetwork(java.lang.String network) {
    this.network = network;
    return this;
  }

  /**
   * Optional. Immutable. The ID of the IP address range being used by the instance's VPC network.
   * See [Configure a VPC
   * network](https://cloud.google.com/parallelstore/docs/vpc#create_and_configure_the_vpc). If no
   * ID is provided, all ranges are considered.
   * @return value or {@code null} for none
   */
  public java.lang.String getReservedIpRange() {
    return reservedIpRange;
  }

  /**
   * Optional. Immutable. The ID of the IP address range being used by the instance's VPC network.
   * See [Configure a VPC
   * network](https://cloud.google.com/parallelstore/docs/vpc#create_and_configure_the_vpc). If no
   * ID is provided, all ranges are considered.
   * @param reservedIpRange reservedIpRange or {@code null} for none
   */
  public Instance setReservedIpRange(java.lang.String reservedIpRange) {
    this.reservedIpRange = reservedIpRange;
    return this;
  }

  /**
   * Output only. The instance state.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The instance state.
   * @param state state or {@code null} for none
   */
  public Instance setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. The time when the instance was updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The time when the instance was updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public Instance setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
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

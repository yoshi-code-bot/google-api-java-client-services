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

package com.google.api.services.osconfig.v2.model;

/**
 * Resource groups provide a mechanism to group OS policy resources. Resource groups enable OS
 * policy authors to create a single OS policy to be applied to VMs running different operating
 * Systems. When the OS policy is applied to a target VM, the appropriate resource group within the
 * OS policy is selected based on the `OSFilter` specified within the resource group.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the OS Config API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OSPolicyResourceGroup extends com.google.api.client.json.GenericJson {

  /**
   * List of inventory filters for the resource group. The resources in this resource group are
   * applied to the target VM if it satisfies at least one of the following inventory filters. For
   * example, to apply this resource group to VMs running either `RHEL` or `CentOS` operating
   * systems, specify 2 items for the list with following values:
   * inventory_filters[0].os_short_name='rhel' and inventory_filters[1].os_short_name='centos' If
   * the list is empty, this resource group will be applied to the target VM unconditionally.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<OSPolicyInventoryFilter> inventoryFilters;

  static {
    // hack to force ProGuard to consider OSPolicyInventoryFilter used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(OSPolicyInventoryFilter.class);
  }

  /**
   * Required. List of resources configured for this resource group. The resources are executed in
   * the exact order specified here.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<OSPolicyResource> resources;

  static {
    // hack to force ProGuard to consider OSPolicyResource used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(OSPolicyResource.class);
  }

  /**
   * List of inventory filters for the resource group. The resources in this resource group are
   * applied to the target VM if it satisfies at least one of the following inventory filters. For
   * example, to apply this resource group to VMs running either `RHEL` or `CentOS` operating
   * systems, specify 2 items for the list with following values:
   * inventory_filters[0].os_short_name='rhel' and inventory_filters[1].os_short_name='centos' If
   * the list is empty, this resource group will be applied to the target VM unconditionally.
   * @return value or {@code null} for none
   */
  public java.util.List<OSPolicyInventoryFilter> getInventoryFilters() {
    return inventoryFilters;
  }

  /**
   * List of inventory filters for the resource group. The resources in this resource group are
   * applied to the target VM if it satisfies at least one of the following inventory filters. For
   * example, to apply this resource group to VMs running either `RHEL` or `CentOS` operating
   * systems, specify 2 items for the list with following values:
   * inventory_filters[0].os_short_name='rhel' and inventory_filters[1].os_short_name='centos' If
   * the list is empty, this resource group will be applied to the target VM unconditionally.
   * @param inventoryFilters inventoryFilters or {@code null} for none
   */
  public OSPolicyResourceGroup setInventoryFilters(java.util.List<OSPolicyInventoryFilter> inventoryFilters) {
    this.inventoryFilters = inventoryFilters;
    return this;
  }

  /**
   * Required. List of resources configured for this resource group. The resources are executed in
   * the exact order specified here.
   * @return value or {@code null} for none
   */
  public java.util.List<OSPolicyResource> getResources() {
    return resources;
  }

  /**
   * Required. List of resources configured for this resource group. The resources are executed in
   * the exact order specified here.
   * @param resources resources or {@code null} for none
   */
  public OSPolicyResourceGroup setResources(java.util.List<OSPolicyResource> resources) {
    this.resources = resources;
    return this;
  }

  @Override
  public OSPolicyResourceGroup set(String fieldName, Object value) {
    return (OSPolicyResourceGroup) super.set(fieldName, value);
  }

  @Override
  public OSPolicyResourceGroup clone() {
    return (OSPolicyResourceGroup) super.clone();
  }

}

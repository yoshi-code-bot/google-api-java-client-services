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
 * Filters to select target VMs for an assignment. If more than one filter criteria is specified
 * below, a VM will be selected if and only if it satisfies all of them.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the OS Config API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OSPolicyAssignmentInstanceFilter extends com.google.api.client.json.GenericJson {

  /**
   * Target all VMs in the project. If true, no other criteria is permitted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean all;

  /**
   * List of label sets used for VM exclusion. If the list has more than one label set, the VM is
   * excluded if any of the label sets are applicable for the VM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<OSPolicyAssignmentLabelSet> exclusionLabels;

  /**
   * List of label sets used for VM inclusion. If the list has more than one `LabelSet`, the VM is
   * included if any of the label sets are applicable for the VM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<OSPolicyAssignmentLabelSet> inclusionLabels;

  /**
   * List of inventories to select VMs. A VM is selected if its inventory data matches at least one
   * of the following inventories.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<OSPolicyAssignmentInstanceFilterInventory> inventories;

  /**
   * Target all VMs in the project. If true, no other criteria is permitted.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAll() {
    return all;
  }

  /**
   * Target all VMs in the project. If true, no other criteria is permitted.
   * @param all all or {@code null} for none
   */
  public OSPolicyAssignmentInstanceFilter setAll(java.lang.Boolean all) {
    this.all = all;
    return this;
  }

  /**
   * List of label sets used for VM exclusion. If the list has more than one label set, the VM is
   * excluded if any of the label sets are applicable for the VM.
   * @return value or {@code null} for none
   */
  public java.util.List<OSPolicyAssignmentLabelSet> getExclusionLabels() {
    return exclusionLabels;
  }

  /**
   * List of label sets used for VM exclusion. If the list has more than one label set, the VM is
   * excluded if any of the label sets are applicable for the VM.
   * @param exclusionLabels exclusionLabels or {@code null} for none
   */
  public OSPolicyAssignmentInstanceFilter setExclusionLabels(java.util.List<OSPolicyAssignmentLabelSet> exclusionLabels) {
    this.exclusionLabels = exclusionLabels;
    return this;
  }

  /**
   * List of label sets used for VM inclusion. If the list has more than one `LabelSet`, the VM is
   * included if any of the label sets are applicable for the VM.
   * @return value or {@code null} for none
   */
  public java.util.List<OSPolicyAssignmentLabelSet> getInclusionLabels() {
    return inclusionLabels;
  }

  /**
   * List of label sets used for VM inclusion. If the list has more than one `LabelSet`, the VM is
   * included if any of the label sets are applicable for the VM.
   * @param inclusionLabels inclusionLabels or {@code null} for none
   */
  public OSPolicyAssignmentInstanceFilter setInclusionLabels(java.util.List<OSPolicyAssignmentLabelSet> inclusionLabels) {
    this.inclusionLabels = inclusionLabels;
    return this;
  }

  /**
   * List of inventories to select VMs. A VM is selected if its inventory data matches at least one
   * of the following inventories.
   * @return value or {@code null} for none
   */
  public java.util.List<OSPolicyAssignmentInstanceFilterInventory> getInventories() {
    return inventories;
  }

  /**
   * List of inventories to select VMs. A VM is selected if its inventory data matches at least one
   * of the following inventories.
   * @param inventories inventories or {@code null} for none
   */
  public OSPolicyAssignmentInstanceFilter setInventories(java.util.List<OSPolicyAssignmentInstanceFilterInventory> inventories) {
    this.inventories = inventories;
    return this;
  }

  @Override
  public OSPolicyAssignmentInstanceFilter set(String fieldName, Object value) {
    return (OSPolicyAssignmentInstanceFilter) super.set(fieldName, value);
  }

  @Override
  public OSPolicyAssignmentInstanceFilter clone() {
    return (OSPolicyAssignmentInstanceFilter) super.clone();
  }

}

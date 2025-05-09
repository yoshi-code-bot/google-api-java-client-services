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

package com.google.api.services.apphub.v1.model;

/**
 * DiscoveredWorkload is a binary deployment (such as managed instance groups (MIGs) and GKE
 * deployments) that performs the smallest logical subset of business functionality. A discovered
 * workload can be registered to an App Hub Workload.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the App Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DiscoveredWorkload extends com.google.api.client.json.GenericJson {

  /**
   * Identifier. The resource name of the discovered workload. Format: `"projects/{host-project-
   * id}/locations/{location}/discoveredWorkloads/{uuid}"`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Properties of an underlying compute resource represented by the Workload. These
   * are immutable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private WorkloadProperties workloadProperties;

  /**
   * Output only. Reference of an underlying compute resource represented by the Workload. These are
   * immutable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private WorkloadReference workloadReference;

  /**
   * Identifier. The resource name of the discovered workload. Format: `"projects/{host-project-
   * id}/locations/{location}/discoveredWorkloads/{uuid}"`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Identifier. The resource name of the discovered workload. Format: `"projects/{host-project-
   * id}/locations/{location}/discoveredWorkloads/{uuid}"`
   * @param name name or {@code null} for none
   */
  public DiscoveredWorkload setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Properties of an underlying compute resource represented by the Workload. These
   * are immutable.
   * @return value or {@code null} for none
   */
  public WorkloadProperties getWorkloadProperties() {
    return workloadProperties;
  }

  /**
   * Output only. Properties of an underlying compute resource represented by the Workload. These
   * are immutable.
   * @param workloadProperties workloadProperties or {@code null} for none
   */
  public DiscoveredWorkload setWorkloadProperties(WorkloadProperties workloadProperties) {
    this.workloadProperties = workloadProperties;
    return this;
  }

  /**
   * Output only. Reference of an underlying compute resource represented by the Workload. These are
   * immutable.
   * @return value or {@code null} for none
   */
  public WorkloadReference getWorkloadReference() {
    return workloadReference;
  }

  /**
   * Output only. Reference of an underlying compute resource represented by the Workload. These are
   * immutable.
   * @param workloadReference workloadReference or {@code null} for none
   */
  public DiscoveredWorkload setWorkloadReference(WorkloadReference workloadReference) {
    this.workloadReference = workloadReference;
    return this;
  }

  @Override
  public DiscoveredWorkload set(String fieldName, Object value) {
    return (DiscoveredWorkload) super.set(fieldName, value);
  }

  @Override
  public DiscoveredWorkload clone() {
    return (DiscoveredWorkload) super.clone();
  }

}

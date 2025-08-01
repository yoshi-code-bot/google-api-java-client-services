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

package com.google.api.services.container.v1beta1.model;

/**
 * Autopilot is the configuration for Autopilot settings on the cluster.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Kubernetes Engine API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Autopilot extends com.google.api.client.json.GenericJson {

  /**
   * Output only. ConversionStatus shows conversion status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AutopilotConversionStatus conversionStatus;

  /**
   * Enable Autopilot
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enabled;

  /**
   * PrivilegedAdmissionConfig is the configuration related to privileged admission control.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PrivilegedAdmissionConfig privilegedAdmissionConfig;

  /**
   * WorkloadPolicyConfig is the configuration related to GCW workload policy
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private WorkloadPolicyConfig workloadPolicyConfig;

  /**
   * Output only. ConversionStatus shows conversion status.
   * @return value or {@code null} for none
   */
  public AutopilotConversionStatus getConversionStatus() {
    return conversionStatus;
  }

  /**
   * Output only. ConversionStatus shows conversion status.
   * @param conversionStatus conversionStatus or {@code null} for none
   */
  public Autopilot setConversionStatus(AutopilotConversionStatus conversionStatus) {
    this.conversionStatus = conversionStatus;
    return this;
  }

  /**
   * Enable Autopilot
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnabled() {
    return enabled;
  }

  /**
   * Enable Autopilot
   * @param enabled enabled or {@code null} for none
   */
  public Autopilot setEnabled(java.lang.Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * PrivilegedAdmissionConfig is the configuration related to privileged admission control.
   * @return value or {@code null} for none
   */
  public PrivilegedAdmissionConfig getPrivilegedAdmissionConfig() {
    return privilegedAdmissionConfig;
  }

  /**
   * PrivilegedAdmissionConfig is the configuration related to privileged admission control.
   * @param privilegedAdmissionConfig privilegedAdmissionConfig or {@code null} for none
   */
  public Autopilot setPrivilegedAdmissionConfig(PrivilegedAdmissionConfig privilegedAdmissionConfig) {
    this.privilegedAdmissionConfig = privilegedAdmissionConfig;
    return this;
  }

  /**
   * WorkloadPolicyConfig is the configuration related to GCW workload policy
   * @return value or {@code null} for none
   */
  public WorkloadPolicyConfig getWorkloadPolicyConfig() {
    return workloadPolicyConfig;
  }

  /**
   * WorkloadPolicyConfig is the configuration related to GCW workload policy
   * @param workloadPolicyConfig workloadPolicyConfig or {@code null} for none
   */
  public Autopilot setWorkloadPolicyConfig(WorkloadPolicyConfig workloadPolicyConfig) {
    this.workloadPolicyConfig = workloadPolicyConfig;
    return this;
  }

  @Override
  public Autopilot set(String fieldName, Object value) {
    return (Autopilot) super.set(fieldName, value);
  }

  @Override
  public Autopilot clone() {
    return (Autopilot) super.clone();
  }

}

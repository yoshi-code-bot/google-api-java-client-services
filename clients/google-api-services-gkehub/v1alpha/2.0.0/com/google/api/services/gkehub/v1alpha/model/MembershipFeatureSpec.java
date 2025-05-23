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

package com.google.api.services.gkehub.v1alpha.model;

/**
 * MembershipFeatureSpec contains configuration information for a single Membership.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MembershipFeatureSpec extends com.google.api.client.json.GenericJson {

  /**
   * Cloud Build-specific spec
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CloudBuildMembershipSpec cloudbuild;

  /**
   * Config Management-specific spec.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConfigManagementMembershipSpec configmanagement;

  /**
   * Fleet observability membership spec
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FleetObservabilityMembershipSpec fleetobservability;

  /**
   * Identity Service-specific spec.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private IdentityServiceMembershipSpec identityservice;

  /**
   * Anthos Service Mesh-specific spec
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ServiceMeshMembershipSpec mesh;

  /**
   * FNS Actuation membership spec
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NamespaceActuationMembershipSpec namespaceactuation;

  /**
   * Whether this per-Membership spec was inherited from a fleet-level default. This field can be
   * updated by users by either overriding a Membership config (updated to USER implicitly) or
   * setting to FLEET explicitly.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Origin origin;

  /**
   * Policy Controller spec.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PolicyControllerMembershipSpec policycontroller;

  /**
   * Workload Certificate spec.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MembershipSpec workloadcertificate;

  /**
   * Cloud Build-specific spec
   * @return value or {@code null} for none
   */
  public CloudBuildMembershipSpec getCloudbuild() {
    return cloudbuild;
  }

  /**
   * Cloud Build-specific spec
   * @param cloudbuild cloudbuild or {@code null} for none
   */
  public MembershipFeatureSpec setCloudbuild(CloudBuildMembershipSpec cloudbuild) {
    this.cloudbuild = cloudbuild;
    return this;
  }

  /**
   * Config Management-specific spec.
   * @return value or {@code null} for none
   */
  public ConfigManagementMembershipSpec getConfigmanagement() {
    return configmanagement;
  }

  /**
   * Config Management-specific spec.
   * @param configmanagement configmanagement or {@code null} for none
   */
  public MembershipFeatureSpec setConfigmanagement(ConfigManagementMembershipSpec configmanagement) {
    this.configmanagement = configmanagement;
    return this;
  }

  /**
   * Fleet observability membership spec
   * @return value or {@code null} for none
   */
  public FleetObservabilityMembershipSpec getFleetobservability() {
    return fleetobservability;
  }

  /**
   * Fleet observability membership spec
   * @param fleetobservability fleetobservability or {@code null} for none
   */
  public MembershipFeatureSpec setFleetobservability(FleetObservabilityMembershipSpec fleetobservability) {
    this.fleetobservability = fleetobservability;
    return this;
  }

  /**
   * Identity Service-specific spec.
   * @return value or {@code null} for none
   */
  public IdentityServiceMembershipSpec getIdentityservice() {
    return identityservice;
  }

  /**
   * Identity Service-specific spec.
   * @param identityservice identityservice or {@code null} for none
   */
  public MembershipFeatureSpec setIdentityservice(IdentityServiceMembershipSpec identityservice) {
    this.identityservice = identityservice;
    return this;
  }

  /**
   * Anthos Service Mesh-specific spec
   * @return value or {@code null} for none
   */
  public ServiceMeshMembershipSpec getMesh() {
    return mesh;
  }

  /**
   * Anthos Service Mesh-specific spec
   * @param mesh mesh or {@code null} for none
   */
  public MembershipFeatureSpec setMesh(ServiceMeshMembershipSpec mesh) {
    this.mesh = mesh;
    return this;
  }

  /**
   * FNS Actuation membership spec
   * @return value or {@code null} for none
   */
  public NamespaceActuationMembershipSpec getNamespaceactuation() {
    return namespaceactuation;
  }

  /**
   * FNS Actuation membership spec
   * @param namespaceactuation namespaceactuation or {@code null} for none
   */
  public MembershipFeatureSpec setNamespaceactuation(NamespaceActuationMembershipSpec namespaceactuation) {
    this.namespaceactuation = namespaceactuation;
    return this;
  }

  /**
   * Whether this per-Membership spec was inherited from a fleet-level default. This field can be
   * updated by users by either overriding a Membership config (updated to USER implicitly) or
   * setting to FLEET explicitly.
   * @return value or {@code null} for none
   */
  public Origin getOrigin() {
    return origin;
  }

  /**
   * Whether this per-Membership spec was inherited from a fleet-level default. This field can be
   * updated by users by either overriding a Membership config (updated to USER implicitly) or
   * setting to FLEET explicitly.
   * @param origin origin or {@code null} for none
   */
  public MembershipFeatureSpec setOrigin(Origin origin) {
    this.origin = origin;
    return this;
  }

  /**
   * Policy Controller spec.
   * @return value or {@code null} for none
   */
  public PolicyControllerMembershipSpec getPolicycontroller() {
    return policycontroller;
  }

  /**
   * Policy Controller spec.
   * @param policycontroller policycontroller or {@code null} for none
   */
  public MembershipFeatureSpec setPolicycontroller(PolicyControllerMembershipSpec policycontroller) {
    this.policycontroller = policycontroller;
    return this;
  }

  /**
   * Workload Certificate spec.
   * @return value or {@code null} for none
   */
  public MembershipSpec getWorkloadcertificate() {
    return workloadcertificate;
  }

  /**
   * Workload Certificate spec.
   * @param workloadcertificate workloadcertificate or {@code null} for none
   */
  public MembershipFeatureSpec setWorkloadcertificate(MembershipSpec workloadcertificate) {
    this.workloadcertificate = workloadcertificate;
    return this;
  }

  @Override
  public MembershipFeatureSpec set(String fieldName, Object value) {
    return (MembershipFeatureSpec) super.set(fieldName, value);
  }

  @Override
  public MembershipFeatureSpec clone() {
    return (MembershipFeatureSpec) super.clone();
  }

}

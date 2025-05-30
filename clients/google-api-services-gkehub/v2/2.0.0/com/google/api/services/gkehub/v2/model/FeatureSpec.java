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

package com.google.api.services.gkehub.v2.model;

/**
 * FeatureSpec contains user input per-feature spec information.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FeatureSpec extends com.google.api.client.json.GenericJson {

  /**
   * Cloudbuild-specific FeatureSpec.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CloudBuildSpec cloudbuild;

  /**
   * Config Management FeatureSpec.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConfigManagementSpec configmanagement;

  /**
   * IdentityService FeatureSpec.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private IdentityServiceSpec identityservice;

  /**
   * Whether this per-Feature spec was inherited from a fleet-level default. This field can be
   * updated by users by either overriding a Feature config (updated to USER implicitly) or setting
   * to FLEET explicitly.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Origin origin;

  /**
   * Policycontroller-specific FeatureSpec.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PolicyControllerSpec policycontroller;

  /**
   * Rbacrolebindingactuation-specific FeatureSpec.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RBACRoleBindingActuationSpec rbacrolebindingactuation;

  /**
   * ServiceMesh Feature Spec.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ServiceMeshSpec servicemesh;

  /**
   * Workloadcertificate-specific FeatureSpec.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private WorkloadCertificateSpec workloadcertificate;

  /**
   * Cloudbuild-specific FeatureSpec.
   * @return value or {@code null} for none
   */
  public CloudBuildSpec getCloudbuild() {
    return cloudbuild;
  }

  /**
   * Cloudbuild-specific FeatureSpec.
   * @param cloudbuild cloudbuild or {@code null} for none
   */
  public FeatureSpec setCloudbuild(CloudBuildSpec cloudbuild) {
    this.cloudbuild = cloudbuild;
    return this;
  }

  /**
   * Config Management FeatureSpec.
   * @return value or {@code null} for none
   */
  public ConfigManagementSpec getConfigmanagement() {
    return configmanagement;
  }

  /**
   * Config Management FeatureSpec.
   * @param configmanagement configmanagement or {@code null} for none
   */
  public FeatureSpec setConfigmanagement(ConfigManagementSpec configmanagement) {
    this.configmanagement = configmanagement;
    return this;
  }

  /**
   * IdentityService FeatureSpec.
   * @return value or {@code null} for none
   */
  public IdentityServiceSpec getIdentityservice() {
    return identityservice;
  }

  /**
   * IdentityService FeatureSpec.
   * @param identityservice identityservice or {@code null} for none
   */
  public FeatureSpec setIdentityservice(IdentityServiceSpec identityservice) {
    this.identityservice = identityservice;
    return this;
  }

  /**
   * Whether this per-Feature spec was inherited from a fleet-level default. This field can be
   * updated by users by either overriding a Feature config (updated to USER implicitly) or setting
   * to FLEET explicitly.
   * @return value or {@code null} for none
   */
  public Origin getOrigin() {
    return origin;
  }

  /**
   * Whether this per-Feature spec was inherited from a fleet-level default. This field can be
   * updated by users by either overriding a Feature config (updated to USER implicitly) or setting
   * to FLEET explicitly.
   * @param origin origin or {@code null} for none
   */
  public FeatureSpec setOrigin(Origin origin) {
    this.origin = origin;
    return this;
  }

  /**
   * Policycontroller-specific FeatureSpec.
   * @return value or {@code null} for none
   */
  public PolicyControllerSpec getPolicycontroller() {
    return policycontroller;
  }

  /**
   * Policycontroller-specific FeatureSpec.
   * @param policycontroller policycontroller or {@code null} for none
   */
  public FeatureSpec setPolicycontroller(PolicyControllerSpec policycontroller) {
    this.policycontroller = policycontroller;
    return this;
  }

  /**
   * Rbacrolebindingactuation-specific FeatureSpec.
   * @return value or {@code null} for none
   */
  public RBACRoleBindingActuationSpec getRbacrolebindingactuation() {
    return rbacrolebindingactuation;
  }

  /**
   * Rbacrolebindingactuation-specific FeatureSpec.
   * @param rbacrolebindingactuation rbacrolebindingactuation or {@code null} for none
   */
  public FeatureSpec setRbacrolebindingactuation(RBACRoleBindingActuationSpec rbacrolebindingactuation) {
    this.rbacrolebindingactuation = rbacrolebindingactuation;
    return this;
  }

  /**
   * ServiceMesh Feature Spec.
   * @return value or {@code null} for none
   */
  public ServiceMeshSpec getServicemesh() {
    return servicemesh;
  }

  /**
   * ServiceMesh Feature Spec.
   * @param servicemesh servicemesh or {@code null} for none
   */
  public FeatureSpec setServicemesh(ServiceMeshSpec servicemesh) {
    this.servicemesh = servicemesh;
    return this;
  }

  /**
   * Workloadcertificate-specific FeatureSpec.
   * @return value or {@code null} for none
   */
  public WorkloadCertificateSpec getWorkloadcertificate() {
    return workloadcertificate;
  }

  /**
   * Workloadcertificate-specific FeatureSpec.
   * @param workloadcertificate workloadcertificate or {@code null} for none
   */
  public FeatureSpec setWorkloadcertificate(WorkloadCertificateSpec workloadcertificate) {
    this.workloadcertificate = workloadcertificate;
    return this;
  }

  @Override
  public FeatureSpec set(String fieldName, Object value) {
    return (FeatureSpec) super.set(fieldName, value);
  }

  @Override
  public FeatureSpec clone() {
    return (FeatureSpec) super.clone();
  }

}

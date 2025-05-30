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

package com.google.api.services.servicenetworking.v1.model;

/**
 * Grouping of IAM role and IAM member.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Networking API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PolicyBinding extends com.google.api.client.json.GenericJson {

  /**
   * Required. Member to bind the role with. See /iam/docs/reference/rest/v1/Policy#Binding for how
   * to format each member. Eg. - user:myuser@mydomain.com - serviceAccount:my-service-
   * account@app.gserviceaccount.com
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String member;

  /**
   * Required. Role to apply. Only allowlisted roles can be used at the specified granularity. The
   * role must be one of the following: - 'roles/container.hostServiceAgentUser' applied on the
   * shared VPC host project - 'roles/compute.securityAdmin' applied on the shared VPC host project
   * - 'roles/compute.networkAdmin' applied on the shared VPC host project - 'roles/tpu.xpnAgent'
   * applied on the shared VPC host project - 'roles/dns.admin' applied on the shared VPC host
   * project - 'roles/logging.admin' applied on the shared VPC host project -
   * 'roles/monitoring.viewer' applied on the shared VPC host project -
   * 'roles/servicemanagement.quotaViewer' applied on the shared VPC host project
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String role;

  /**
   * Required. Member to bind the role with. See /iam/docs/reference/rest/v1/Policy#Binding for how
   * to format each member. Eg. - user:myuser@mydomain.com - serviceAccount:my-service-
   * account@app.gserviceaccount.com
   * @return value or {@code null} for none
   */
  public java.lang.String getMember() {
    return member;
  }

  /**
   * Required. Member to bind the role with. See /iam/docs/reference/rest/v1/Policy#Binding for how
   * to format each member. Eg. - user:myuser@mydomain.com - serviceAccount:my-service-
   * account@app.gserviceaccount.com
   * @param member member or {@code null} for none
   */
  public PolicyBinding setMember(java.lang.String member) {
    this.member = member;
    return this;
  }

  /**
   * Required. Role to apply. Only allowlisted roles can be used at the specified granularity. The
   * role must be one of the following: - 'roles/container.hostServiceAgentUser' applied on the
   * shared VPC host project - 'roles/compute.securityAdmin' applied on the shared VPC host project
   * - 'roles/compute.networkAdmin' applied on the shared VPC host project - 'roles/tpu.xpnAgent'
   * applied on the shared VPC host project - 'roles/dns.admin' applied on the shared VPC host
   * project - 'roles/logging.admin' applied on the shared VPC host project -
   * 'roles/monitoring.viewer' applied on the shared VPC host project -
   * 'roles/servicemanagement.quotaViewer' applied on the shared VPC host project
   * @return value or {@code null} for none
   */
  public java.lang.String getRole() {
    return role;
  }

  /**
   * Required. Role to apply. Only allowlisted roles can be used at the specified granularity. The
   * role must be one of the following: - 'roles/container.hostServiceAgentUser' applied on the
   * shared VPC host project - 'roles/compute.securityAdmin' applied on the shared VPC host project
   * - 'roles/compute.networkAdmin' applied on the shared VPC host project - 'roles/tpu.xpnAgent'
   * applied on the shared VPC host project - 'roles/dns.admin' applied on the shared VPC host
   * project - 'roles/logging.admin' applied on the shared VPC host project -
   * 'roles/monitoring.viewer' applied on the shared VPC host project -
   * 'roles/servicemanagement.quotaViewer' applied on the shared VPC host project
   * @param role role or {@code null} for none
   */
  public PolicyBinding setRole(java.lang.String role) {
    this.role = role;
    return this;
  }

  @Override
  public PolicyBinding set(String fieldName, Object value) {
    return (PolicyBinding) super.set(fieldName, value);
  }

  @Override
  public PolicyBinding clone() {
    return (PolicyBinding) super.clone();
  }

}

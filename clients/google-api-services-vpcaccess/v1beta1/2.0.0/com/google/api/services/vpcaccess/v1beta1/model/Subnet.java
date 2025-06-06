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

package com.google.api.services.vpcaccess.v1beta1.model;

/**
 * The subnet in which to house the connector
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Serverless VPC Access API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Subnet extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Subnet name (relative, not fully qualified). E.g. if the full subnet selfLink is http
   * s://compute.googleapis.com/compute/v1/projects/{project}/regions/{region}/subnetworks/{subnetNa
   * me} the correct input for this field would be {subnetName}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. Project in which the subnet exists. If not set, this project is assumed to be the
   * project for which the connector create request was issued.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * Optional. Subnet name (relative, not fully qualified). E.g. if the full subnet selfLink is http
   * s://compute.googleapis.com/compute/v1/projects/{project}/regions/{region}/subnetworks/{subnetNa
   * me} the correct input for this field would be {subnetName}
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Optional. Subnet name (relative, not fully qualified). E.g. if the full subnet selfLink is http
   * s://compute.googleapis.com/compute/v1/projects/{project}/regions/{region}/subnetworks/{subnetNa
   * me} the correct input for this field would be {subnetName}
   * @param name name or {@code null} for none
   */
  public Subnet setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. Project in which the subnet exists. If not set, this project is assumed to be the
   * project for which the connector create request was issued.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * Optional. Project in which the subnet exists. If not set, this project is assumed to be the
   * project for which the connector create request was issued.
   * @param projectId projectId or {@code null} for none
   */
  public Subnet setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  @Override
  public Subnet set(String fieldName, Object value) {
    return (Subnet) super.set(fieldName, value);
  }

  @Override
  public Subnet clone() {
    return (Subnet) super.clone();
  }

}

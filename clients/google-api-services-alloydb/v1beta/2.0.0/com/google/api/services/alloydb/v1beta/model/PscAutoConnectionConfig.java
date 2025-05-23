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

package com.google.api.services.alloydb.v1beta.model;

/**
 * Configuration for setting up PSC service automation. Consumer projects in the configs will be
 * allowlisted automatically for the instance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AlloyDB API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PscAutoConnectionConfig extends com.google.api.client.json.GenericJson {

  /**
   * The consumer network for the PSC service automation, example: "projects/vpc-host-
   * project/global/networks/default". The consumer network might be hosted a different project than
   * the consumer project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String consumerNetwork;

  /**
   * Output only. The status of the service connection policy. Possible values: "STATE_UNSPECIFIED"
   * - Default state, when Connection Map is created initially. "VALID" - Set when policy and map
   * configuration is valid, and their matching can lead to allowing creation of PSC Connections
   * subject to other constraints like connections limit. "CONNECTION_POLICY_MISSING" - No Service
   * Connection Policy found for this network and Service Class "POLICY_LIMIT_REACHED" - Service
   * Connection Policy limit reached for this network and Service Class
   * "CONSUMER_INSTANCE_PROJECT_NOT_ALLOWLISTED" - The consumer instance project is not in
   * AllowedGoogleProducersResourceHierarchyLevels of the matching ServiceConnectionPolicy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String consumerNetworkStatus;

  /**
   * The consumer project to which the PSC service automation endpoint will be created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String consumerProject;

  /**
   * Output only. The IP address of the PSC service automation endpoint.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ipAddress;

  /**
   * Output only. The status of the PSC service automation connection. Possible values:
   * "STATE_UNSPECIFIED" - An invalid state as the default case. "ACTIVE" - The connection has been
   * created successfully. "FAILED" - The connection is not functional since some resources on the
   * connection fail to be created. "CREATING" - The connection is being created. "DELETING" - The
   * connection is being deleted. "CREATE_REPAIRING" - The connection is being repaired to complete
   * creation. "DELETE_REPAIRING" - The connection is being repaired to complete deletion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * The consumer network for the PSC service automation, example: "projects/vpc-host-
   * project/global/networks/default". The consumer network might be hosted a different project than
   * the consumer project.
   * @return value or {@code null} for none
   */
  public java.lang.String getConsumerNetwork() {
    return consumerNetwork;
  }

  /**
   * The consumer network for the PSC service automation, example: "projects/vpc-host-
   * project/global/networks/default". The consumer network might be hosted a different project than
   * the consumer project.
   * @param consumerNetwork consumerNetwork or {@code null} for none
   */
  public PscAutoConnectionConfig setConsumerNetwork(java.lang.String consumerNetwork) {
    this.consumerNetwork = consumerNetwork;
    return this;
  }

  /**
   * Output only. The status of the service connection policy. Possible values: "STATE_UNSPECIFIED"
   * - Default state, when Connection Map is created initially. "VALID" - Set when policy and map
   * configuration is valid, and their matching can lead to allowing creation of PSC Connections
   * subject to other constraints like connections limit. "CONNECTION_POLICY_MISSING" - No Service
   * Connection Policy found for this network and Service Class "POLICY_LIMIT_REACHED" - Service
   * Connection Policy limit reached for this network and Service Class
   * "CONSUMER_INSTANCE_PROJECT_NOT_ALLOWLISTED" - The consumer instance project is not in
   * AllowedGoogleProducersResourceHierarchyLevels of the matching ServiceConnectionPolicy.
   * @return value or {@code null} for none
   */
  public java.lang.String getConsumerNetworkStatus() {
    return consumerNetworkStatus;
  }

  /**
   * Output only. The status of the service connection policy. Possible values: "STATE_UNSPECIFIED"
   * - Default state, when Connection Map is created initially. "VALID" - Set when policy and map
   * configuration is valid, and their matching can lead to allowing creation of PSC Connections
   * subject to other constraints like connections limit. "CONNECTION_POLICY_MISSING" - No Service
   * Connection Policy found for this network and Service Class "POLICY_LIMIT_REACHED" - Service
   * Connection Policy limit reached for this network and Service Class
   * "CONSUMER_INSTANCE_PROJECT_NOT_ALLOWLISTED" - The consumer instance project is not in
   * AllowedGoogleProducersResourceHierarchyLevels of the matching ServiceConnectionPolicy.
   * @param consumerNetworkStatus consumerNetworkStatus or {@code null} for none
   */
  public PscAutoConnectionConfig setConsumerNetworkStatus(java.lang.String consumerNetworkStatus) {
    this.consumerNetworkStatus = consumerNetworkStatus;
    return this;
  }

  /**
   * The consumer project to which the PSC service automation endpoint will be created.
   * @return value or {@code null} for none
   */
  public java.lang.String getConsumerProject() {
    return consumerProject;
  }

  /**
   * The consumer project to which the PSC service automation endpoint will be created.
   * @param consumerProject consumerProject or {@code null} for none
   */
  public PscAutoConnectionConfig setConsumerProject(java.lang.String consumerProject) {
    this.consumerProject = consumerProject;
    return this;
  }

  /**
   * Output only. The IP address of the PSC service automation endpoint.
   * @return value or {@code null} for none
   */
  public java.lang.String getIpAddress() {
    return ipAddress;
  }

  /**
   * Output only. The IP address of the PSC service automation endpoint.
   * @param ipAddress ipAddress or {@code null} for none
   */
  public PscAutoConnectionConfig setIpAddress(java.lang.String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * Output only. The status of the PSC service automation connection. Possible values:
   * "STATE_UNSPECIFIED" - An invalid state as the default case. "ACTIVE" - The connection has been
   * created successfully. "FAILED" - The connection is not functional since some resources on the
   * connection fail to be created. "CREATING" - The connection is being created. "DELETING" - The
   * connection is being deleted. "CREATE_REPAIRING" - The connection is being repaired to complete
   * creation. "DELETE_REPAIRING" - The connection is being repaired to complete deletion.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * Output only. The status of the PSC service automation connection. Possible values:
   * "STATE_UNSPECIFIED" - An invalid state as the default case. "ACTIVE" - The connection has been
   * created successfully. "FAILED" - The connection is not functional since some resources on the
   * connection fail to be created. "CREATING" - The connection is being created. "DELETING" - The
   * connection is being deleted. "CREATE_REPAIRING" - The connection is being repaired to complete
   * creation. "DELETE_REPAIRING" - The connection is being repaired to complete deletion.
   * @param status status or {@code null} for none
   */
  public PscAutoConnectionConfig setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  @Override
  public PscAutoConnectionConfig set(String fieldName, Object value) {
    return (PscAutoConnectionConfig) super.set(fieldName, value);
  }

  @Override
  public PscAutoConnectionConfig clone() {
    return (PscAutoConnectionConfig) super.clone();
  }

}

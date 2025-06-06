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

package com.google.api.services.networksecurity.v1beta1.model;

/**
 * The endpoint group's view of a connected deployment group.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Security API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InterceptEndpointGroupConnectedDeploymentGroup extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The list of locations where the deployment group is present.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<InterceptLocation> locations;

  /**
   * Output only. The connected deployment group's resource name, for example:
   * `projects/123456789/locations/global/interceptDeploymentGroups/my-dg`. See
   * https://google.aip.dev/124.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The list of locations where the deployment group is present.
   * @return value or {@code null} for none
   */
  public java.util.List<InterceptLocation> getLocations() {
    return locations;
  }

  /**
   * Output only. The list of locations where the deployment group is present.
   * @param locations locations or {@code null} for none
   */
  public InterceptEndpointGroupConnectedDeploymentGroup setLocations(java.util.List<InterceptLocation> locations) {
    this.locations = locations;
    return this;
  }

  /**
   * Output only. The connected deployment group's resource name, for example:
   * `projects/123456789/locations/global/interceptDeploymentGroups/my-dg`. See
   * https://google.aip.dev/124.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The connected deployment group's resource name, for example:
   * `projects/123456789/locations/global/interceptDeploymentGroups/my-dg`. See
   * https://google.aip.dev/124.
   * @param name name or {@code null} for none
   */
  public InterceptEndpointGroupConnectedDeploymentGroup setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public InterceptEndpointGroupConnectedDeploymentGroup set(String fieldName, Object value) {
    return (InterceptEndpointGroupConnectedDeploymentGroup) super.set(fieldName, value);
  }

  @Override
  public InterceptEndpointGroupConnectedDeploymentGroup clone() {
    return (InterceptEndpointGroupConnectedDeploymentGroup) super.clone();
  }

}

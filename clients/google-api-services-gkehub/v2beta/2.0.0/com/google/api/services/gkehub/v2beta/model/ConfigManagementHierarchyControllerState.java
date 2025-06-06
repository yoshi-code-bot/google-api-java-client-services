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

package com.google.api.services.gkehub.v2beta.model;

/**
 * State for Hierarchy Controller.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ConfigManagementHierarchyControllerState extends com.google.api.client.json.GenericJson {

  /**
   * The deployment state for Hierarchy Controller.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConfigManagementHierarchyControllerDeploymentState state;

  /**
   * The version for Hierarchy Controller.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConfigManagementHierarchyControllerVersion version;

  /**
   * The deployment state for Hierarchy Controller.
   * @return value or {@code null} for none
   */
  public ConfigManagementHierarchyControllerDeploymentState getState() {
    return state;
  }

  /**
   * The deployment state for Hierarchy Controller.
   * @param state state or {@code null} for none
   */
  public ConfigManagementHierarchyControllerState setState(ConfigManagementHierarchyControllerDeploymentState state) {
    this.state = state;
    return this;
  }

  /**
   * The version for Hierarchy Controller.
   * @return value or {@code null} for none
   */
  public ConfigManagementHierarchyControllerVersion getVersion() {
    return version;
  }

  /**
   * The version for Hierarchy Controller.
   * @param version version or {@code null} for none
   */
  public ConfigManagementHierarchyControllerState setVersion(ConfigManagementHierarchyControllerVersion version) {
    this.version = version;
    return this;
  }

  @Override
  public ConfigManagementHierarchyControllerState set(String fieldName, Object value) {
    return (ConfigManagementHierarchyControllerState) super.set(fieldName, value);
  }

  @Override
  public ConfigManagementHierarchyControllerState clone() {
    return (ConfigManagementHierarchyControllerState) super.clone();
  }

}

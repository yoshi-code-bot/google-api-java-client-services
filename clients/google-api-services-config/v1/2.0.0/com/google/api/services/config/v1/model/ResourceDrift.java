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

package com.google.api.services.config.v1.model;

/**
 * A resource drift represents a drift to a resource in the state file.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Infrastructure Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ResourceDrift extends com.google.api.client.json.GenericJson {

  /**
   * Identifier. The name of the resource drift. Format: 'projects/{project_id}/locations/{location}
   * /previews/{preview}/resourceDrifts/{resource_drift}'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The property drifts of the resource drift.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PropertyDrift> propertyDrifts;

  static {
    // hack to force ProGuard to consider PropertyDrift used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(PropertyDrift.class);
  }

  /**
   * Output only. Terraform info of the resource drift.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ResourceDriftTerraformInfo terraformInfo;

  /**
   * Identifier. The name of the resource drift. Format: 'projects/{project_id}/locations/{location}
   * /previews/{preview}/resourceDrifts/{resource_drift}'.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Identifier. The name of the resource drift. Format: 'projects/{project_id}/locations/{location}
   * /previews/{preview}/resourceDrifts/{resource_drift}'.
   * @param name name or {@code null} for none
   */
  public ResourceDrift setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The property drifts of the resource drift.
   * @return value or {@code null} for none
   */
  public java.util.List<PropertyDrift> getPropertyDrifts() {
    return propertyDrifts;
  }

  /**
   * Output only. The property drifts of the resource drift.
   * @param propertyDrifts propertyDrifts or {@code null} for none
   */
  public ResourceDrift setPropertyDrifts(java.util.List<PropertyDrift> propertyDrifts) {
    this.propertyDrifts = propertyDrifts;
    return this;
  }

  /**
   * Output only. Terraform info of the resource drift.
   * @return value or {@code null} for none
   */
  public ResourceDriftTerraformInfo getTerraformInfo() {
    return terraformInfo;
  }

  /**
   * Output only. Terraform info of the resource drift.
   * @param terraformInfo terraformInfo or {@code null} for none
   */
  public ResourceDrift setTerraformInfo(ResourceDriftTerraformInfo terraformInfo) {
    this.terraformInfo = terraformInfo;
    return this;
  }

  @Override
  public ResourceDrift set(String fieldName, Object value) {
    return (ResourceDrift) super.set(fieldName, value);
  }

  @Override
  public ResourceDrift clone() {
    return (ResourceDrift) super.clone();
  }

}

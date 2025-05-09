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
 * Model for a config file in the git repo with an associated Sync error.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ConfigManagementErrorResource extends com.google.api.client.json.GenericJson {

  /**
   * Group/version/kind of the resource that is causing an error
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConfigManagementGroupVersionKind resourceGvk;

  /**
   * Metadata name of the resource that is causing an error
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceName;

  /**
   * Namespace of the resource that is causing an error
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceNamespace;

  /**
   * Path in the git repo of the erroneous config
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourcePath;

  /**
   * Group/version/kind of the resource that is causing an error
   * @return value or {@code null} for none
   */
  public ConfigManagementGroupVersionKind getResourceGvk() {
    return resourceGvk;
  }

  /**
   * Group/version/kind of the resource that is causing an error
   * @param resourceGvk resourceGvk or {@code null} for none
   */
  public ConfigManagementErrorResource setResourceGvk(ConfigManagementGroupVersionKind resourceGvk) {
    this.resourceGvk = resourceGvk;
    return this;
  }

  /**
   * Metadata name of the resource that is causing an error
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceName() {
    return resourceName;
  }

  /**
   * Metadata name of the resource that is causing an error
   * @param resourceName resourceName or {@code null} for none
   */
  public ConfigManagementErrorResource setResourceName(java.lang.String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * Namespace of the resource that is causing an error
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceNamespace() {
    return resourceNamespace;
  }

  /**
   * Namespace of the resource that is causing an error
   * @param resourceNamespace resourceNamespace or {@code null} for none
   */
  public ConfigManagementErrorResource setResourceNamespace(java.lang.String resourceNamespace) {
    this.resourceNamespace = resourceNamespace;
    return this;
  }

  /**
   * Path in the git repo of the erroneous config
   * @return value or {@code null} for none
   */
  public java.lang.String getSourcePath() {
    return sourcePath;
  }

  /**
   * Path in the git repo of the erroneous config
   * @param sourcePath sourcePath or {@code null} for none
   */
  public ConfigManagementErrorResource setSourcePath(java.lang.String sourcePath) {
    this.sourcePath = sourcePath;
    return this;
  }

  @Override
  public ConfigManagementErrorResource set(String fieldName, Object value) {
    return (ConfigManagementErrorResource) super.set(fieldName, value);
  }

  @Override
  public ConfigManagementErrorResource clone() {
    return (ConfigManagementErrorResource) super.clone();
  }

}

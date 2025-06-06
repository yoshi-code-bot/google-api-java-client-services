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

package com.google.api.services.composer.v1beta1.model;

/**
 * User workloads ConfigMap used by Airflow tasks that run with Kubernetes executor or
 * KubernetesPodOperator.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Composer API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UserWorkloadsConfigMap extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The "data" field of Kubernetes ConfigMap, organized in key-value pairs. For details
   * see: https://kubernetes.io/docs/concepts/configuration/configmap/ Example: { "example_key":
   * "example_value", "another_key": "another_value" }
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> data;

  /**
   * Identifier. The resource name of the ConfigMap, in the form: "projects/{projectId}/locations/{l
   * ocationId}/environments/{environmentId}/userWorkloadsConfigMaps/{userWorkloadsConfigMapId}"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. The "data" field of Kubernetes ConfigMap, organized in key-value pairs. For details
   * see: https://kubernetes.io/docs/concepts/configuration/configmap/ Example: { "example_key":
   * "example_value", "another_key": "another_value" }
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getData() {
    return data;
  }

  /**
   * Optional. The "data" field of Kubernetes ConfigMap, organized in key-value pairs. For details
   * see: https://kubernetes.io/docs/concepts/configuration/configmap/ Example: { "example_key":
   * "example_value", "another_key": "another_value" }
   * @param data data or {@code null} for none
   */
  public UserWorkloadsConfigMap setData(java.util.Map<String, java.lang.String> data) {
    this.data = data;
    return this;
  }

  /**
   * Identifier. The resource name of the ConfigMap, in the form: "projects/{projectId}/locations/{l
   * ocationId}/environments/{environmentId}/userWorkloadsConfigMaps/{userWorkloadsConfigMapId}"
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Identifier. The resource name of the ConfigMap, in the form: "projects/{projectId}/locations/{l
   * ocationId}/environments/{environmentId}/userWorkloadsConfigMaps/{userWorkloadsConfigMapId}"
   * @param name name or {@code null} for none
   */
  public UserWorkloadsConfigMap setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public UserWorkloadsConfigMap set(String fieldName, Object value) {
    return (UserWorkloadsConfigMap) super.set(fieldName, value);
  }

  @Override
  public UserWorkloadsConfigMap clone() {
    return (UserWorkloadsConfigMap) super.clone();
  }

}

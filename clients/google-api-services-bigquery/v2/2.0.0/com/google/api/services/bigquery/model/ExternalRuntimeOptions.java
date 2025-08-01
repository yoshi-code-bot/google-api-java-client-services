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

package com.google.api.services.bigquery.model;

/**
 * Options for the runtime of the external system.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExternalRuntimeOptions extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Amount of CPU provisioned for a Python UDF container instance. For more information,
   * see [Configure container limits for Python UDFs](https://cloud.google.com/bigquery/docs/user-
   * defined-functions-python#configure-container-limits)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double containerCpu;

  /**
   * Optional. Amount of memory provisioned for a Python UDF container instance. Format:
   * {number}{unit} where unit is one of "M", "G", "Mi" and "Gi" (e.g. 1G, 512Mi). If not specified,
   * the default value is 512Mi. For more information, see [Configure container limits for Python
   * UDFs](https://cloud.google.com/bigquery/docs/user-defined-functions-python#configure-container-
   * limits)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String containerMemory;

  /**
   * Optional. Maximum number of rows in each batch sent to the external runtime. If absent or if 0,
   * BigQuery dynamically decides the number of rows in a batch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long maxBatchingRows;

  /**
   * Optional. Fully qualified name of the connection whose service account will be used to execute
   * the code in the container. Format:
   * ```"projects/{project_id}/locations/{location_id}/connections/{connection_id}"```
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String runtimeConnection;

  /**
   * Optional. Language runtime version. Example: `python-3.11`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String runtimeVersion;

  /**
   * Optional. Amount of CPU provisioned for a Python UDF container instance. For more information,
   * see [Configure container limits for Python UDFs](https://cloud.google.com/bigquery/docs/user-
   * defined-functions-python#configure-container-limits)
   * @return value or {@code null} for none
   */
  public java.lang.Double getContainerCpu() {
    return containerCpu;
  }

  /**
   * Optional. Amount of CPU provisioned for a Python UDF container instance. For more information,
   * see [Configure container limits for Python UDFs](https://cloud.google.com/bigquery/docs/user-
   * defined-functions-python#configure-container-limits)
   * @param containerCpu containerCpu or {@code null} for none
   */
  public ExternalRuntimeOptions setContainerCpu(java.lang.Double containerCpu) {
    this.containerCpu = containerCpu;
    return this;
  }

  /**
   * Optional. Amount of memory provisioned for a Python UDF container instance. Format:
   * {number}{unit} where unit is one of "M", "G", "Mi" and "Gi" (e.g. 1G, 512Mi). If not specified,
   * the default value is 512Mi. For more information, see [Configure container limits for Python
   * UDFs](https://cloud.google.com/bigquery/docs/user-defined-functions-python#configure-container-
   * limits)
   * @return value or {@code null} for none
   */
  public java.lang.String getContainerMemory() {
    return containerMemory;
  }

  /**
   * Optional. Amount of memory provisioned for a Python UDF container instance. Format:
   * {number}{unit} where unit is one of "M", "G", "Mi" and "Gi" (e.g. 1G, 512Mi). If not specified,
   * the default value is 512Mi. For more information, see [Configure container limits for Python
   * UDFs](https://cloud.google.com/bigquery/docs/user-defined-functions-python#configure-container-
   * limits)
   * @param containerMemory containerMemory or {@code null} for none
   */
  public ExternalRuntimeOptions setContainerMemory(java.lang.String containerMemory) {
    this.containerMemory = containerMemory;
    return this;
  }

  /**
   * Optional. Maximum number of rows in each batch sent to the external runtime. If absent or if 0,
   * BigQuery dynamically decides the number of rows in a batch.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMaxBatchingRows() {
    return maxBatchingRows;
  }

  /**
   * Optional. Maximum number of rows in each batch sent to the external runtime. If absent or if 0,
   * BigQuery dynamically decides the number of rows in a batch.
   * @param maxBatchingRows maxBatchingRows or {@code null} for none
   */
  public ExternalRuntimeOptions setMaxBatchingRows(java.lang.Long maxBatchingRows) {
    this.maxBatchingRows = maxBatchingRows;
    return this;
  }

  /**
   * Optional. Fully qualified name of the connection whose service account will be used to execute
   * the code in the container. Format:
   * ```"projects/{project_id}/locations/{location_id}/connections/{connection_id}"```
   * @return value or {@code null} for none
   */
  public java.lang.String getRuntimeConnection() {
    return runtimeConnection;
  }

  /**
   * Optional. Fully qualified name of the connection whose service account will be used to execute
   * the code in the container. Format:
   * ```"projects/{project_id}/locations/{location_id}/connections/{connection_id}"```
   * @param runtimeConnection runtimeConnection or {@code null} for none
   */
  public ExternalRuntimeOptions setRuntimeConnection(java.lang.String runtimeConnection) {
    this.runtimeConnection = runtimeConnection;
    return this;
  }

  /**
   * Optional. Language runtime version. Example: `python-3.11`.
   * @return value or {@code null} for none
   */
  public java.lang.String getRuntimeVersion() {
    return runtimeVersion;
  }

  /**
   * Optional. Language runtime version. Example: `python-3.11`.
   * @param runtimeVersion runtimeVersion or {@code null} for none
   */
  public ExternalRuntimeOptions setRuntimeVersion(java.lang.String runtimeVersion) {
    this.runtimeVersion = runtimeVersion;
    return this;
  }

  @Override
  public ExternalRuntimeOptions set(String fieldName, Object value) {
    return (ExternalRuntimeOptions) super.set(fieldName, value);
  }

  @Override
  public ExternalRuntimeOptions clone() {
    return (ExternalRuntimeOptions) super.clone();
  }

}

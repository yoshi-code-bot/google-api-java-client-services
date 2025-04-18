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

package com.google.api.services.alloydb.v1.model;

/**
 * Message for registering Restoring from CloudSQL resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AlloyDB API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RestoreFromCloudSQLRequest extends com.google.api.client.json.GenericJson {

  /**
   * Cluster created from CloudSQL backup run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CloudSQLBackupRunSource cloudsqlBackupRunSource;

  /**
   * Required. The resource being created
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Cluster cluster;

  /**
   * Required. ID of the requesting object.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clusterId;

  /**
   * Cluster created from CloudSQL backup run.
   * @return value or {@code null} for none
   */
  public CloudSQLBackupRunSource getCloudsqlBackupRunSource() {
    return cloudsqlBackupRunSource;
  }

  /**
   * Cluster created from CloudSQL backup run.
   * @param cloudsqlBackupRunSource cloudsqlBackupRunSource or {@code null} for none
   */
  public RestoreFromCloudSQLRequest setCloudsqlBackupRunSource(CloudSQLBackupRunSource cloudsqlBackupRunSource) {
    this.cloudsqlBackupRunSource = cloudsqlBackupRunSource;
    return this;
  }

  /**
   * Required. The resource being created
   * @return value or {@code null} for none
   */
  public Cluster getCluster() {
    return cluster;
  }

  /**
   * Required. The resource being created
   * @param cluster cluster or {@code null} for none
   */
  public RestoreFromCloudSQLRequest setCluster(Cluster cluster) {
    this.cluster = cluster;
    return this;
  }

  /**
   * Required. ID of the requesting object.
   * @return value or {@code null} for none
   */
  public java.lang.String getClusterId() {
    return clusterId;
  }

  /**
   * Required. ID of the requesting object.
   * @param clusterId clusterId or {@code null} for none
   */
  public RestoreFromCloudSQLRequest setClusterId(java.lang.String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  @Override
  public RestoreFromCloudSQLRequest set(String fieldName, Object value) {
    return (RestoreFromCloudSQLRequest) super.set(fieldName, value);
  }

  @Override
  public RestoreFromCloudSQLRequest clone() {
    return (RestoreFromCloudSQLRequest) super.clone();
  }

}

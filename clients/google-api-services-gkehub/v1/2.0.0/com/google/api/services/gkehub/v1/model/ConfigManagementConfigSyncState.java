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

package com.google.api.services.gkehub.v1.model;

/**
 * State information for ConfigSync
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ConfigManagementConfigSyncState extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Whether syncing resources to the cluster is stopped at the cluster level.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clusterLevelStopSyncingState;

  /**
   * Output only. The number of RootSync and RepoSync CRs in the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer crCount;

  /**
   * Output only. Information about the deployment of ConfigSync, including the version of the
   * various Pods deployed
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConfigManagementConfigSyncDeploymentState deploymentState;

  /**
   * Output only. Errors pertaining to the installation of Config Sync.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ConfigManagementConfigSyncError> errors;

  static {
    // hack to force ProGuard to consider ConfigManagementConfigSyncError used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ConfigManagementConfigSyncError.class);
  }

  /**
   * Output only. The state of the Reposync CRD
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reposyncCrd;

  /**
   * Output only. The state of the RootSync CRD
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rootsyncCrd;

  /**
   * Output only. The state of CS This field summarizes the other fields in this message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. The state of ConfigSync's process to sync configs to a cluster
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConfigManagementSyncState syncState;

  /**
   * Output only. The version of ConfigSync deployed
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConfigManagementConfigSyncVersion version;

  /**
   * Output only. Whether syncing resources to the cluster is stopped at the cluster level.
   * @return value or {@code null} for none
   */
  public java.lang.String getClusterLevelStopSyncingState() {
    return clusterLevelStopSyncingState;
  }

  /**
   * Output only. Whether syncing resources to the cluster is stopped at the cluster level.
   * @param clusterLevelStopSyncingState clusterLevelStopSyncingState or {@code null} for none
   */
  public ConfigManagementConfigSyncState setClusterLevelStopSyncingState(java.lang.String clusterLevelStopSyncingState) {
    this.clusterLevelStopSyncingState = clusterLevelStopSyncingState;
    return this;
  }

  /**
   * Output only. The number of RootSync and RepoSync CRs in the cluster.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getCrCount() {
    return crCount;
  }

  /**
   * Output only. The number of RootSync and RepoSync CRs in the cluster.
   * @param crCount crCount or {@code null} for none
   */
  public ConfigManagementConfigSyncState setCrCount(java.lang.Integer crCount) {
    this.crCount = crCount;
    return this;
  }

  /**
   * Output only. Information about the deployment of ConfigSync, including the version of the
   * various Pods deployed
   * @return value or {@code null} for none
   */
  public ConfigManagementConfigSyncDeploymentState getDeploymentState() {
    return deploymentState;
  }

  /**
   * Output only. Information about the deployment of ConfigSync, including the version of the
   * various Pods deployed
   * @param deploymentState deploymentState or {@code null} for none
   */
  public ConfigManagementConfigSyncState setDeploymentState(ConfigManagementConfigSyncDeploymentState deploymentState) {
    this.deploymentState = deploymentState;
    return this;
  }

  /**
   * Output only. Errors pertaining to the installation of Config Sync.
   * @return value or {@code null} for none
   */
  public java.util.List<ConfigManagementConfigSyncError> getErrors() {
    return errors;
  }

  /**
   * Output only. Errors pertaining to the installation of Config Sync.
   * @param errors errors or {@code null} for none
   */
  public ConfigManagementConfigSyncState setErrors(java.util.List<ConfigManagementConfigSyncError> errors) {
    this.errors = errors;
    return this;
  }

  /**
   * Output only. The state of the Reposync CRD
   * @return value or {@code null} for none
   */
  public java.lang.String getReposyncCrd() {
    return reposyncCrd;
  }

  /**
   * Output only. The state of the Reposync CRD
   * @param reposyncCrd reposyncCrd or {@code null} for none
   */
  public ConfigManagementConfigSyncState setReposyncCrd(java.lang.String reposyncCrd) {
    this.reposyncCrd = reposyncCrd;
    return this;
  }

  /**
   * Output only. The state of the RootSync CRD
   * @return value or {@code null} for none
   */
  public java.lang.String getRootsyncCrd() {
    return rootsyncCrd;
  }

  /**
   * Output only. The state of the RootSync CRD
   * @param rootsyncCrd rootsyncCrd or {@code null} for none
   */
  public ConfigManagementConfigSyncState setRootsyncCrd(java.lang.String rootsyncCrd) {
    this.rootsyncCrd = rootsyncCrd;
    return this;
  }

  /**
   * Output only. The state of CS This field summarizes the other fields in this message.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The state of CS This field summarizes the other fields in this message.
   * @param state state or {@code null} for none
   */
  public ConfigManagementConfigSyncState setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. The state of ConfigSync's process to sync configs to a cluster
   * @return value or {@code null} for none
   */
  public ConfigManagementSyncState getSyncState() {
    return syncState;
  }

  /**
   * Output only. The state of ConfigSync's process to sync configs to a cluster
   * @param syncState syncState or {@code null} for none
   */
  public ConfigManagementConfigSyncState setSyncState(ConfigManagementSyncState syncState) {
    this.syncState = syncState;
    return this;
  }

  /**
   * Output only. The version of ConfigSync deployed
   * @return value or {@code null} for none
   */
  public ConfigManagementConfigSyncVersion getVersion() {
    return version;
  }

  /**
   * Output only. The version of ConfigSync deployed
   * @param version version or {@code null} for none
   */
  public ConfigManagementConfigSyncState setVersion(ConfigManagementConfigSyncVersion version) {
    this.version = version;
    return this;
  }

  @Override
  public ConfigManagementConfigSyncState set(String fieldName, Object value) {
    return (ConfigManagementConfigSyncState) super.set(fieldName, value);
  }

  @Override
  public ConfigManagementConfigSyncState clone() {
    return (ConfigManagementConfigSyncState) super.clone();
  }

}

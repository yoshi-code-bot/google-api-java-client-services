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

package com.google.api.services.gkehub.v2.model;

/**
 * Git repo configuration for a single cluster.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ConfigManagementGitConfig extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The Google Cloud Service Account Email used for auth when secret_type is
   * gcpServiceAccount.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gcpServiceAccountEmail;

  /**
   * Optional. URL for the HTTPS proxy to be used when communicating with the Git repo.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String httpsProxy;

  /**
   * Optional. The path within the Git repository that represents the top level of the repo to sync.
   * Default: the root directory of the repository.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String policyDir;

  /**
   * Required. Type of secret configured for access to the Git repo. Must be one of ssh, cookiefile,
   * gcenode, token, gcpserviceaccount, githubapp or none. The validation of this is case-sensitive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String secretType;

  /**
   * Optional. The branch of the repository to sync from. Default: master.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String syncBranch;

  /**
   * Required. The URL of the Git repository to use as the source of truth.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String syncRepo;

  /**
   * Optional. Git revision (tag or hash) to check out. Default HEAD.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String syncRev;

  /**
   * Optional. Period in seconds between consecutive syncs. Default: 15.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long syncWaitSecs;

  /**
   * Optional. The Google Cloud Service Account Email used for auth when secret_type is
   * gcpServiceAccount.
   * @return value or {@code null} for none
   */
  public java.lang.String getGcpServiceAccountEmail() {
    return gcpServiceAccountEmail;
  }

  /**
   * Optional. The Google Cloud Service Account Email used for auth when secret_type is
   * gcpServiceAccount.
   * @param gcpServiceAccountEmail gcpServiceAccountEmail or {@code null} for none
   */
  public ConfigManagementGitConfig setGcpServiceAccountEmail(java.lang.String gcpServiceAccountEmail) {
    this.gcpServiceAccountEmail = gcpServiceAccountEmail;
    return this;
  }

  /**
   * Optional. URL for the HTTPS proxy to be used when communicating with the Git repo.
   * @return value or {@code null} for none
   */
  public java.lang.String getHttpsProxy() {
    return httpsProxy;
  }

  /**
   * Optional. URL for the HTTPS proxy to be used when communicating with the Git repo.
   * @param httpsProxy httpsProxy or {@code null} for none
   */
  public ConfigManagementGitConfig setHttpsProxy(java.lang.String httpsProxy) {
    this.httpsProxy = httpsProxy;
    return this;
  }

  /**
   * Optional. The path within the Git repository that represents the top level of the repo to sync.
   * Default: the root directory of the repository.
   * @return value or {@code null} for none
   */
  public java.lang.String getPolicyDir() {
    return policyDir;
  }

  /**
   * Optional. The path within the Git repository that represents the top level of the repo to sync.
   * Default: the root directory of the repository.
   * @param policyDir policyDir or {@code null} for none
   */
  public ConfigManagementGitConfig setPolicyDir(java.lang.String policyDir) {
    this.policyDir = policyDir;
    return this;
  }

  /**
   * Required. Type of secret configured for access to the Git repo. Must be one of ssh, cookiefile,
   * gcenode, token, gcpserviceaccount, githubapp or none. The validation of this is case-sensitive.
   * @return value or {@code null} for none
   */
  public java.lang.String getSecretType() {
    return secretType;
  }

  /**
   * Required. Type of secret configured for access to the Git repo. Must be one of ssh, cookiefile,
   * gcenode, token, gcpserviceaccount, githubapp or none. The validation of this is case-sensitive.
   * @param secretType secretType or {@code null} for none
   */
  public ConfigManagementGitConfig setSecretType(java.lang.String secretType) {
    this.secretType = secretType;
    return this;
  }

  /**
   * Optional. The branch of the repository to sync from. Default: master.
   * @return value or {@code null} for none
   */
  public java.lang.String getSyncBranch() {
    return syncBranch;
  }

  /**
   * Optional. The branch of the repository to sync from. Default: master.
   * @param syncBranch syncBranch or {@code null} for none
   */
  public ConfigManagementGitConfig setSyncBranch(java.lang.String syncBranch) {
    this.syncBranch = syncBranch;
    return this;
  }

  /**
   * Required. The URL of the Git repository to use as the source of truth.
   * @return value or {@code null} for none
   */
  public java.lang.String getSyncRepo() {
    return syncRepo;
  }

  /**
   * Required. The URL of the Git repository to use as the source of truth.
   * @param syncRepo syncRepo or {@code null} for none
   */
  public ConfigManagementGitConfig setSyncRepo(java.lang.String syncRepo) {
    this.syncRepo = syncRepo;
    return this;
  }

  /**
   * Optional. Git revision (tag or hash) to check out. Default HEAD.
   * @return value or {@code null} for none
   */
  public java.lang.String getSyncRev() {
    return syncRev;
  }

  /**
   * Optional. Git revision (tag or hash) to check out. Default HEAD.
   * @param syncRev syncRev or {@code null} for none
   */
  public ConfigManagementGitConfig setSyncRev(java.lang.String syncRev) {
    this.syncRev = syncRev;
    return this;
  }

  /**
   * Optional. Period in seconds between consecutive syncs. Default: 15.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSyncWaitSecs() {
    return syncWaitSecs;
  }

  /**
   * Optional. Period in seconds between consecutive syncs. Default: 15.
   * @param syncWaitSecs syncWaitSecs or {@code null} for none
   */
  public ConfigManagementGitConfig setSyncWaitSecs(java.lang.Long syncWaitSecs) {
    this.syncWaitSecs = syncWaitSecs;
    return this;
  }

  @Override
  public ConfigManagementGitConfig set(String fieldName, Object value) {
    return (ConfigManagementGitConfig) super.set(fieldName, value);
  }

  @Override
  public ConfigManagementGitConfig clone() {
    return (ConfigManagementGitConfig) super.clone();
  }

}

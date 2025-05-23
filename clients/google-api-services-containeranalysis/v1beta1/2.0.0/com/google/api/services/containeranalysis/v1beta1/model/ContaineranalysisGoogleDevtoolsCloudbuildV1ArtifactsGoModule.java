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

package com.google.api.services.containeranalysis.v1beta1.model;

/**
 * Go module to upload to Artifact Registry upon successful completion of all build steps. A module
 * refers to all dependencies in a go.mod file.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Container Analysis API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ContaineranalysisGoogleDevtoolsCloudbuildV1ArtifactsGoModule extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The Go module's "module path". e.g. example.com/foo/v2
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String modulePath;

  /**
   * Optional. The Go module's semantic version in the form vX.Y.Z. e.g. v0.1.1 Pre-release
   * identifiers can also be added by appending a dash and dot separated ASCII alphanumeric
   * characters and hyphens. e.g. v0.2.3-alpha.x.12m.5
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String moduleVersion;

  /**
   * Optional. Location of the Artifact Registry repository. i.e. us-east1 Defaults to the build’s
   * location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String repositoryLocation;

  /**
   * Optional. Artifact Registry repository name. Specified Go modules will be zipped and uploaded
   * to Artifact Registry with this location as a prefix. e.g. my-go-repo
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String repositoryName;

  /**
   * Optional. Project ID of the Artifact Registry repository. Defaults to the build project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String repositoryProjectId;

  /**
   * Optional. Source path of the go.mod file in the build's workspace. If not specified, this will
   * default to the current directory. e.g. ~/code/go/mypackage
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourcePath;

  /**
   * Optional. The Go module's "module path". e.g. example.com/foo/v2
   * @return value or {@code null} for none
   */
  public java.lang.String getModulePath() {
    return modulePath;
  }

  /**
   * Optional. The Go module's "module path". e.g. example.com/foo/v2
   * @param modulePath modulePath or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1ArtifactsGoModule setModulePath(java.lang.String modulePath) {
    this.modulePath = modulePath;
    return this;
  }

  /**
   * Optional. The Go module's semantic version in the form vX.Y.Z. e.g. v0.1.1 Pre-release
   * identifiers can also be added by appending a dash and dot separated ASCII alphanumeric
   * characters and hyphens. e.g. v0.2.3-alpha.x.12m.5
   * @return value or {@code null} for none
   */
  public java.lang.String getModuleVersion() {
    return moduleVersion;
  }

  /**
   * Optional. The Go module's semantic version in the form vX.Y.Z. e.g. v0.1.1 Pre-release
   * identifiers can also be added by appending a dash and dot separated ASCII alphanumeric
   * characters and hyphens. e.g. v0.2.3-alpha.x.12m.5
   * @param moduleVersion moduleVersion or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1ArtifactsGoModule setModuleVersion(java.lang.String moduleVersion) {
    this.moduleVersion = moduleVersion;
    return this;
  }

  /**
   * Optional. Location of the Artifact Registry repository. i.e. us-east1 Defaults to the build’s
   * location.
   * @return value or {@code null} for none
   */
  public java.lang.String getRepositoryLocation() {
    return repositoryLocation;
  }

  /**
   * Optional. Location of the Artifact Registry repository. i.e. us-east1 Defaults to the build’s
   * location.
   * @param repositoryLocation repositoryLocation or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1ArtifactsGoModule setRepositoryLocation(java.lang.String repositoryLocation) {
    this.repositoryLocation = repositoryLocation;
    return this;
  }

  /**
   * Optional. Artifact Registry repository name. Specified Go modules will be zipped and uploaded
   * to Artifact Registry with this location as a prefix. e.g. my-go-repo
   * @return value or {@code null} for none
   */
  public java.lang.String getRepositoryName() {
    return repositoryName;
  }

  /**
   * Optional. Artifact Registry repository name. Specified Go modules will be zipped and uploaded
   * to Artifact Registry with this location as a prefix. e.g. my-go-repo
   * @param repositoryName repositoryName or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1ArtifactsGoModule setRepositoryName(java.lang.String repositoryName) {
    this.repositoryName = repositoryName;
    return this;
  }

  /**
   * Optional. Project ID of the Artifact Registry repository. Defaults to the build project.
   * @return value or {@code null} for none
   */
  public java.lang.String getRepositoryProjectId() {
    return repositoryProjectId;
  }

  /**
   * Optional. Project ID of the Artifact Registry repository. Defaults to the build project.
   * @param repositoryProjectId repositoryProjectId or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1ArtifactsGoModule setRepositoryProjectId(java.lang.String repositoryProjectId) {
    this.repositoryProjectId = repositoryProjectId;
    return this;
  }

  /**
   * Optional. Source path of the go.mod file in the build's workspace. If not specified, this will
   * default to the current directory. e.g. ~/code/go/mypackage
   * @return value or {@code null} for none
   */
  public java.lang.String getSourcePath() {
    return sourcePath;
  }

  /**
   * Optional. Source path of the go.mod file in the build's workspace. If not specified, this will
   * default to the current directory. e.g. ~/code/go/mypackage
   * @param sourcePath sourcePath or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1ArtifactsGoModule setSourcePath(java.lang.String sourcePath) {
    this.sourcePath = sourcePath;
    return this;
  }

  @Override
  public ContaineranalysisGoogleDevtoolsCloudbuildV1ArtifactsGoModule set(String fieldName, Object value) {
    return (ContaineranalysisGoogleDevtoolsCloudbuildV1ArtifactsGoModule) super.set(fieldName, value);
  }

  @Override
  public ContaineranalysisGoogleDevtoolsCloudbuildV1ArtifactsGoModule clone() {
    return (ContaineranalysisGoogleDevtoolsCloudbuildV1ArtifactsGoModule) super.clone();
  }

}

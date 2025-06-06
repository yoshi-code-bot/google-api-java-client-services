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

package com.google.api.services.workstations.v1beta.model;

/**
 * A Docker container.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Workstations API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Container extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Arguments passed to the entrypoint.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> args;

  /**
   * Optional. If set, overrides the default ENTRYPOINT specified by the image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> command;

  /**
   * Optional. Environment variables passed to the container's entrypoint.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> env;

  /**
   * Optional. A Docker container image that defines a custom environment. Cloud Workstations
   * provides a number of [preconfigured
   * images](https://cloud.google.com/workstations/docs/preconfigured-base-images), but you can
   * create your own [custom container images](https://cloud.google.com/workstations/docs/custom-
   * container-images). If using a private image, the `host.gceInstance.serviceAccount` field must
   * be specified in the workstation configuration. If using a custom container image, the service
   * account must have [Artifact Registry Reader](https://cloud.google.com/artifact-
   * registry/docs/access-control#roles) permission to pull the specified image. Otherwise, the
   * image must be publicly accessible.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String image;

  /**
   * Optional. If set, overrides the USER specified in the image with the given uid.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer runAsUser;

  /**
   * Optional. If set, overrides the default DIR specified by the image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String workingDir;

  /**
   * Optional. Arguments passed to the entrypoint.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getArgs() {
    return args;
  }

  /**
   * Optional. Arguments passed to the entrypoint.
   * @param args args or {@code null} for none
   */
  public Container setArgs(java.util.List<java.lang.String> args) {
    this.args = args;
    return this;
  }

  /**
   * Optional. If set, overrides the default ENTRYPOINT specified by the image.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getCommand() {
    return command;
  }

  /**
   * Optional. If set, overrides the default ENTRYPOINT specified by the image.
   * @param command command or {@code null} for none
   */
  public Container setCommand(java.util.List<java.lang.String> command) {
    this.command = command;
    return this;
  }

  /**
   * Optional. Environment variables passed to the container's entrypoint.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getEnv() {
    return env;
  }

  /**
   * Optional. Environment variables passed to the container's entrypoint.
   * @param env env or {@code null} for none
   */
  public Container setEnv(java.util.Map<String, java.lang.String> env) {
    this.env = env;
    return this;
  }

  /**
   * Optional. A Docker container image that defines a custom environment. Cloud Workstations
   * provides a number of [preconfigured
   * images](https://cloud.google.com/workstations/docs/preconfigured-base-images), but you can
   * create your own [custom container images](https://cloud.google.com/workstations/docs/custom-
   * container-images). If using a private image, the `host.gceInstance.serviceAccount` field must
   * be specified in the workstation configuration. If using a custom container image, the service
   * account must have [Artifact Registry Reader](https://cloud.google.com/artifact-
   * registry/docs/access-control#roles) permission to pull the specified image. Otherwise, the
   * image must be publicly accessible.
   * @return value or {@code null} for none
   */
  public java.lang.String getImage() {
    return image;
  }

  /**
   * Optional. A Docker container image that defines a custom environment. Cloud Workstations
   * provides a number of [preconfigured
   * images](https://cloud.google.com/workstations/docs/preconfigured-base-images), but you can
   * create your own [custom container images](https://cloud.google.com/workstations/docs/custom-
   * container-images). If using a private image, the `host.gceInstance.serviceAccount` field must
   * be specified in the workstation configuration. If using a custom container image, the service
   * account must have [Artifact Registry Reader](https://cloud.google.com/artifact-
   * registry/docs/access-control#roles) permission to pull the specified image. Otherwise, the
   * image must be publicly accessible.
   * @param image image or {@code null} for none
   */
  public Container setImage(java.lang.String image) {
    this.image = image;
    return this;
  }

  /**
   * Optional. If set, overrides the USER specified in the image with the given uid.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRunAsUser() {
    return runAsUser;
  }

  /**
   * Optional. If set, overrides the USER specified in the image with the given uid.
   * @param runAsUser runAsUser or {@code null} for none
   */
  public Container setRunAsUser(java.lang.Integer runAsUser) {
    this.runAsUser = runAsUser;
    return this;
  }

  /**
   * Optional. If set, overrides the default DIR specified by the image.
   * @return value or {@code null} for none
   */
  public java.lang.String getWorkingDir() {
    return workingDir;
  }

  /**
   * Optional. If set, overrides the default DIR specified by the image.
   * @param workingDir workingDir or {@code null} for none
   */
  public Container setWorkingDir(java.lang.String workingDir) {
    this.workingDir = workingDir;
    return this;
  }

  @Override
  public Container set(String fieldName, Object value) {
    return (Container) super.set(fieldName, value);
  }

  @Override
  public Container clone() {
    return (Container) super.clone();
  }

}

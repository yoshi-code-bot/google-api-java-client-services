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

package com.google.api.services.developerconnect.v1.model;

/**
 * RuntimeConfig represents the runtimes where the application is deployed.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Developer Connect API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RuntimeConfig extends com.google.api.client.json.GenericJson {

  /**
   * Output only. App Hub Workload.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppHubWorkload appHubWorkload;

  /**
   * Output only. Google Kubernetes Engine runtime.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GKEWorkload gkeWorkload;

  /**
   * Output only. The state of the Runtime.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Required. Immutable. The URI of the runtime configuration. For GKE, this is the cluster name.
   * For Cloud Run, this is the service name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * Output only. App Hub Workload.
   * @return value or {@code null} for none
   */
  public AppHubWorkload getAppHubWorkload() {
    return appHubWorkload;
  }

  /**
   * Output only. App Hub Workload.
   * @param appHubWorkload appHubWorkload or {@code null} for none
   */
  public RuntimeConfig setAppHubWorkload(AppHubWorkload appHubWorkload) {
    this.appHubWorkload = appHubWorkload;
    return this;
  }

  /**
   * Output only. Google Kubernetes Engine runtime.
   * @return value or {@code null} for none
   */
  public GKEWorkload getGkeWorkload() {
    return gkeWorkload;
  }

  /**
   * Output only. Google Kubernetes Engine runtime.
   * @param gkeWorkload gkeWorkload or {@code null} for none
   */
  public RuntimeConfig setGkeWorkload(GKEWorkload gkeWorkload) {
    this.gkeWorkload = gkeWorkload;
    return this;
  }

  /**
   * Output only. The state of the Runtime.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The state of the Runtime.
   * @param state state or {@code null} for none
   */
  public RuntimeConfig setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Required. Immutable. The URI of the runtime configuration. For GKE, this is the cluster name.
   * For Cloud Run, this is the service name.
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * Required. Immutable. The URI of the runtime configuration. For GKE, this is the cluster name.
   * For Cloud Run, this is the service name.
   * @param uri uri or {@code null} for none
   */
  public RuntimeConfig setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  @Override
  public RuntimeConfig set(String fieldName, Object value) {
    return (RuntimeConfig) super.set(fieldName, value);
  }

  @Override
  public RuntimeConfig clone() {
    return (RuntimeConfig) super.clone();
  }

}

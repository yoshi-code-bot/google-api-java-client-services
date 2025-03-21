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

package com.google.api.services.aiplatform.v1.model;

/**
 * HttpGetAction describes an action based on HTTP Get requests.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1ProbeHttpGetAction extends com.google.api.client.json.GenericJson {

  /**
   * Host name to connect to, defaults to the model serving container's IP. You probably want to set
   * "Host" in httpHeaders instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String host;

  /**
   * Custom headers to set in the request. HTTP allows repeated headers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudAiplatformV1ProbeHttpHeader> httpHeaders;

  /**
   * Path to access on the HTTP server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String path;

  /**
   * Number of the port to access on the container. Number must be in the range 1 to 65535.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer port;

  /**
   * Scheme to use for connecting to the host. Defaults to HTTP. Acceptable values are "HTTP" or
   * "HTTPS".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String scheme;

  /**
   * Host name to connect to, defaults to the model serving container's IP. You probably want to set
   * "Host" in httpHeaders instead.
   * @return value or {@code null} for none
   */
  public java.lang.String getHost() {
    return host;
  }

  /**
   * Host name to connect to, defaults to the model serving container's IP. You probably want to set
   * "Host" in httpHeaders instead.
   * @param host host or {@code null} for none
   */
  public GoogleCloudAiplatformV1ProbeHttpGetAction setHost(java.lang.String host) {
    this.host = host;
    return this;
  }

  /**
   * Custom headers to set in the request. HTTP allows repeated headers.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudAiplatformV1ProbeHttpHeader> getHttpHeaders() {
    return httpHeaders;
  }

  /**
   * Custom headers to set in the request. HTTP allows repeated headers.
   * @param httpHeaders httpHeaders or {@code null} for none
   */
  public GoogleCloudAiplatformV1ProbeHttpGetAction setHttpHeaders(java.util.List<GoogleCloudAiplatformV1ProbeHttpHeader> httpHeaders) {
    this.httpHeaders = httpHeaders;
    return this;
  }

  /**
   * Path to access on the HTTP server.
   * @return value or {@code null} for none
   */
  public java.lang.String getPath() {
    return path;
  }

  /**
   * Path to access on the HTTP server.
   * @param path path or {@code null} for none
   */
  public GoogleCloudAiplatformV1ProbeHttpGetAction setPath(java.lang.String path) {
    this.path = path;
    return this;
  }

  /**
   * Number of the port to access on the container. Number must be in the range 1 to 65535.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPort() {
    return port;
  }

  /**
   * Number of the port to access on the container. Number must be in the range 1 to 65535.
   * @param port port or {@code null} for none
   */
  public GoogleCloudAiplatformV1ProbeHttpGetAction setPort(java.lang.Integer port) {
    this.port = port;
    return this;
  }

  /**
   * Scheme to use for connecting to the host. Defaults to HTTP. Acceptable values are "HTTP" or
   * "HTTPS".
   * @return value or {@code null} for none
   */
  public java.lang.String getScheme() {
    return scheme;
  }

  /**
   * Scheme to use for connecting to the host. Defaults to HTTP. Acceptable values are "HTTP" or
   * "HTTPS".
   * @param scheme scheme or {@code null} for none
   */
  public GoogleCloudAiplatformV1ProbeHttpGetAction setScheme(java.lang.String scheme) {
    this.scheme = scheme;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1ProbeHttpGetAction set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1ProbeHttpGetAction) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1ProbeHttpGetAction clone() {
    return (GoogleCloudAiplatformV1ProbeHttpGetAction) super.clone();
  }

}

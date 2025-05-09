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

package com.google.api.services.cloudtasks.v2beta3.model;

/**
 * App Engine HTTP request. The message defines the HTTP request that is sent to an App Engine app
 * when the task is dispatched. Using AppEngineHttpRequest requires
 * [`appengine.applications.get`](https://cloud.google.com/appengine/docs/admin-api/access-control)
 * Google IAM permission for the project and the following scope:
 * `https://www.googleapis.com/auth/cloud-platform` The task will be delivered to the App Engine app
 * which belongs to the same project as the queue. For more information, see [How Requests are
 * Routed](https://cloud.google.com/appengine/docs/standard/python/how-requests-are-routed) and how
 * routing is affected by [dispatch
 * files](https://cloud.google.com/appengine/docs/python/config/dispatchref). Traffic is encrypted
 * during transport and never leaves Google datacenters. Because this traffic is carried over a
 * communication mechanism internal to Google, you cannot explicitly set the protocol (for example,
 * HTTP or HTTPS). The request to the handler, however, will appear to have used the HTTP protocol.
 * The AppEngineRouting used to construct the URL that the task is delivered to can be set at the
 * queue-level or task-level: * If set, app_engine_routing_override is used for all tasks in the
 * queue, no matter what the setting is for the task-level app_engine_routing. The `url` that the
 * task will be sent to is: * `url =` host `+` relative_uri Tasks can be dispatched to secure app
 * handlers, unsecure app handlers, and URIs restricted with [`login:
 * admin`](https://cloud.google.com/appengine/docs/standard/python/config/appref). Because tasks are
 * not run as any user, they cannot be dispatched to URIs restricted with [`login:
 * required`](https://cloud.google.com/appengine/docs/standard/python/config/appref) Task dispatches
 * also do not follow redirects. The task attempt has succeeded if the app's request handler returns
 * an HTTP response code in the range [`200` - `299`]. The task attempt has failed if the app's
 * handler returns a non-2xx response code or Cloud Tasks does not receive response before the
 * deadline. Failed tasks will be retried according to the retry configuration. `503` (Service
 * Unavailable) is considered an App Engine system error instead of an application error and will
 * cause Cloud Tasks' traffic congestion control to temporarily throttle the queue's dispatches.
 * Unlike other types of task targets, a `429` (Too Many Requests) response from an app handler does
 * not cause traffic congestion control to throttle the queue.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Tasks API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppEngineHttpRequest extends com.google.api.client.json.GenericJson {

  /**
   * Task-level setting for App Engine routing. If set, app_engine_routing_override is used for all
   * tasks in the queue, no matter what the setting is for the task-level app_engine_routing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppEngineRouting appEngineRouting;

  /**
   * HTTP request body. A request body is allowed only if the HTTP method is POST or PUT. It is an
   * error to set a body on a task with an incompatible HttpMethod.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String body;

  /**
   * HTTP request headers. This map contains the header field names and values. Headers can be set
   * when the task is created. Repeated headers are not supported but a header value can contain
   * commas. Cloud Tasks sets some headers to default values: * `User-Agent`: By default, this
   * header is `"AppEngine-Google; (+http://code.google.com/appengine)"`. This header can be
   * modified, but Cloud Tasks will append `"AppEngine-Google; (+http://code.google.com/appengine)"`
   * to the modified `User-Agent`. If the task has a body, Cloud Tasks sets the following headers: *
   * `Content-Type`: By default, the `Content-Type` header is set to `"application/octet-stream"`.
   * The default can be overridden by explicitly setting `Content-Type` to a particular media type
   * when the task is created. For example, `Content-Type` can be set to `"application/json"`. *
   * `Content-Length`: This is computed by Cloud Tasks. This value is output only. It cannot be
   * changed. The headers below cannot be set or overridden: * `Host` * `X-Google-*` *
   * `X-AppEngine-*` In addition, Cloud Tasks sets some headers when the task is dispatched, such as
   * headers containing information about the task; see [request
   * headers](https://cloud.google.com/tasks/docs/creating-appengine-
   * handlers#reading_request_headers). These headers are set only when the task is dispatched, so
   * they are not visible when the task is returned in a Cloud Tasks response. Although there is no
   * specific limit for the maximum number of headers or the size, there is a limit on the maximum
   * size of the Task. For more information, see the CreateTask documentation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> headers;

  /**
   * The HTTP method to use for the request. The default is POST. The app's request handler for the
   * task's target URL must be able to handle HTTP requests with this http_method, otherwise the
   * task attempt fails with error code 405 (Method Not Allowed). See [Writing a push task request
   * handler](https://cloud.google.com/appengine/docs/java/taskqueue/push/creating-
   * handlers#writing_a_push_task_request_handler) and the App Engine documentation for your runtime
   * on [How Requests are Handled](https://cloud.google.com/appengine/docs/standard/python3/how-
   * requests-are-handled).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String httpMethod;

  /**
   * The relative URI. The relative URI must begin with "/" and must be a valid HTTP relative URI.
   * It can contain a path and query string arguments. If the relative URI is empty, then the root
   * path "/" will be used. No spaces are allowed, and the maximum length allowed is 2083
   * characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String relativeUri;

  /**
   * Task-level setting for App Engine routing. If set, app_engine_routing_override is used for all
   * tasks in the queue, no matter what the setting is for the task-level app_engine_routing.
   * @return value or {@code null} for none
   */
  public AppEngineRouting getAppEngineRouting() {
    return appEngineRouting;
  }

  /**
   * Task-level setting for App Engine routing. If set, app_engine_routing_override is used for all
   * tasks in the queue, no matter what the setting is for the task-level app_engine_routing.
   * @param appEngineRouting appEngineRouting or {@code null} for none
   */
  public AppEngineHttpRequest setAppEngineRouting(AppEngineRouting appEngineRouting) {
    this.appEngineRouting = appEngineRouting;
    return this;
  }

  /**
   * HTTP request body. A request body is allowed only if the HTTP method is POST or PUT. It is an
   * error to set a body on a task with an incompatible HttpMethod.
   * @see #decodeBody()
   * @return value or {@code null} for none
   */
  public java.lang.String getBody() {
    return body;
  }

  /**
   * HTTP request body. A request body is allowed only if the HTTP method is POST or PUT. It is an
   * error to set a body on a task with an incompatible HttpMethod.
   * @see #getBody()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeBody() {
    return com.google.api.client.util.Base64.decodeBase64(body);
  }

  /**
   * HTTP request body. A request body is allowed only if the HTTP method is POST or PUT. It is an
   * error to set a body on a task with an incompatible HttpMethod.
   * @see #encodeBody()
   * @param body body or {@code null} for none
   */
  public AppEngineHttpRequest setBody(java.lang.String body) {
    this.body = body;
    return this;
  }

  /**
   * HTTP request body. A request body is allowed only if the HTTP method is POST or PUT. It is an
   * error to set a body on a task with an incompatible HttpMethod.
   * @see #setBody()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public AppEngineHttpRequest encodeBody(byte[] body) {
    this.body = com.google.api.client.util.Base64.encodeBase64URLSafeString(body);
    return this;
  }

  /**
   * HTTP request headers. This map contains the header field names and values. Headers can be set
   * when the task is created. Repeated headers are not supported but a header value can contain
   * commas. Cloud Tasks sets some headers to default values: * `User-Agent`: By default, this
   * header is `"AppEngine-Google; (+http://code.google.com/appengine)"`. This header can be
   * modified, but Cloud Tasks will append `"AppEngine-Google; (+http://code.google.com/appengine)"`
   * to the modified `User-Agent`. If the task has a body, Cloud Tasks sets the following headers: *
   * `Content-Type`: By default, the `Content-Type` header is set to `"application/octet-stream"`.
   * The default can be overridden by explicitly setting `Content-Type` to a particular media type
   * when the task is created. For example, `Content-Type` can be set to `"application/json"`. *
   * `Content-Length`: This is computed by Cloud Tasks. This value is output only. It cannot be
   * changed. The headers below cannot be set or overridden: * `Host` * `X-Google-*` *
   * `X-AppEngine-*` In addition, Cloud Tasks sets some headers when the task is dispatched, such as
   * headers containing information about the task; see [request
   * headers](https://cloud.google.com/tasks/docs/creating-appengine-
   * handlers#reading_request_headers). These headers are set only when the task is dispatched, so
   * they are not visible when the task is returned in a Cloud Tasks response. Although there is no
   * specific limit for the maximum number of headers or the size, there is a limit on the maximum
   * size of the Task. For more information, see the CreateTask documentation.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getHeaders() {
    return headers;
  }

  /**
   * HTTP request headers. This map contains the header field names and values. Headers can be set
   * when the task is created. Repeated headers are not supported but a header value can contain
   * commas. Cloud Tasks sets some headers to default values: * `User-Agent`: By default, this
   * header is `"AppEngine-Google; (+http://code.google.com/appengine)"`. This header can be
   * modified, but Cloud Tasks will append `"AppEngine-Google; (+http://code.google.com/appengine)"`
   * to the modified `User-Agent`. If the task has a body, Cloud Tasks sets the following headers: *
   * `Content-Type`: By default, the `Content-Type` header is set to `"application/octet-stream"`.
   * The default can be overridden by explicitly setting `Content-Type` to a particular media type
   * when the task is created. For example, `Content-Type` can be set to `"application/json"`. *
   * `Content-Length`: This is computed by Cloud Tasks. This value is output only. It cannot be
   * changed. The headers below cannot be set or overridden: * `Host` * `X-Google-*` *
   * `X-AppEngine-*` In addition, Cloud Tasks sets some headers when the task is dispatched, such as
   * headers containing information about the task; see [request
   * headers](https://cloud.google.com/tasks/docs/creating-appengine-
   * handlers#reading_request_headers). These headers are set only when the task is dispatched, so
   * they are not visible when the task is returned in a Cloud Tasks response. Although there is no
   * specific limit for the maximum number of headers or the size, there is a limit on the maximum
   * size of the Task. For more information, see the CreateTask documentation.
   * @param headers headers or {@code null} for none
   */
  public AppEngineHttpRequest setHeaders(java.util.Map<String, java.lang.String> headers) {
    this.headers = headers;
    return this;
  }

  /**
   * The HTTP method to use for the request. The default is POST. The app's request handler for the
   * task's target URL must be able to handle HTTP requests with this http_method, otherwise the
   * task attempt fails with error code 405 (Method Not Allowed). See [Writing a push task request
   * handler](https://cloud.google.com/appengine/docs/java/taskqueue/push/creating-
   * handlers#writing_a_push_task_request_handler) and the App Engine documentation for your runtime
   * on [How Requests are Handled](https://cloud.google.com/appengine/docs/standard/python3/how-
   * requests-are-handled).
   * @return value or {@code null} for none
   */
  public java.lang.String getHttpMethod() {
    return httpMethod;
  }

  /**
   * The HTTP method to use for the request. The default is POST. The app's request handler for the
   * task's target URL must be able to handle HTTP requests with this http_method, otherwise the
   * task attempt fails with error code 405 (Method Not Allowed). See [Writing a push task request
   * handler](https://cloud.google.com/appengine/docs/java/taskqueue/push/creating-
   * handlers#writing_a_push_task_request_handler) and the App Engine documentation for your runtime
   * on [How Requests are Handled](https://cloud.google.com/appengine/docs/standard/python3/how-
   * requests-are-handled).
   * @param httpMethod httpMethod or {@code null} for none
   */
  public AppEngineHttpRequest setHttpMethod(java.lang.String httpMethod) {
    this.httpMethod = httpMethod;
    return this;
  }

  /**
   * The relative URI. The relative URI must begin with "/" and must be a valid HTTP relative URI.
   * It can contain a path and query string arguments. If the relative URI is empty, then the root
   * path "/" will be used. No spaces are allowed, and the maximum length allowed is 2083
   * characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getRelativeUri() {
    return relativeUri;
  }

  /**
   * The relative URI. The relative URI must begin with "/" and must be a valid HTTP relative URI.
   * It can contain a path and query string arguments. If the relative URI is empty, then the root
   * path "/" will be used. No spaces are allowed, and the maximum length allowed is 2083
   * characters.
   * @param relativeUri relativeUri or {@code null} for none
   */
  public AppEngineHttpRequest setRelativeUri(java.lang.String relativeUri) {
    this.relativeUri = relativeUri;
    return this;
  }

  @Override
  public AppEngineHttpRequest set(String fieldName, Object value) {
    return (AppEngineHttpRequest) super.set(fieldName, value);
  }

  @Override
  public AppEngineHttpRequest clone() {
    return (AppEngineHttpRequest) super.clone();
  }

}

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

package com.google.api.services.alloydb.v1beta.model;

/**
 * Configuration for Managed Connection Pool (MCP).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AlloyDB API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ConnectionPoolConfig extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Deprecated. Use 'flags' instead. The default pool size. Defaults to 20. Note: This
   * field should not be added to client libraries if not present already.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String defaultPoolSize;

  /**
   * Optional. Deprecated; Prefer 'enabled' as this will be removed soon.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enable;

  /**
   * Optional. Whether to enable Managed Connection Pool (MCP).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enabled;

  /**
   * Optional. Connection Pool flags, as a list of "key": "value" pairs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> flags;

  /**
   * Optional. Deprecated. Use 'flags' instead. The list of startup parameters to ignore. Defaults
   * to ["extra_float_digits"] Note: This field should not be added to client libraries if not
   * present already.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> ignoreStartupParameters;

  /**
   * Optional. Deprecated. Use 'flags' instead. The maximum number of client connections allowed.
   * Note: This field should not be added to client libraries if not present already.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String maxClientConn;

  /**
   * Optional. Deprecated. Use 'flags' instead. The maximum number of prepared statements allowed.
   * MCP makes sure that any statement prepared by a client, up to this limit, is available on the
   * backing server connection in transaction and statement pooling mode. Even if the statement was
   * originally prepared on another server connection. Defaults to 0. Note: This field should not be
   * added to client libraries if not present already.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String maxPreparedStatements;

  /**
   * Optional. Deprecated. Use 'flags' instead. The minimum pool size. Defaults to 0. Note: This
   * field should not be added to client libraries if not present already.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String minPoolSize;

  /**
   * Optional. Deprecated. Use 'flags' instead. The pool mode. Defaults to `POOL_MODE_TRANSACTION`.
   * Note: This field should not be added to client libraries if not present already.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String poolMode;

  /**
   * Output only. The number of running poolers per instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer poolerCount;

  /**
   * Optional. Deprecated. Use 'flags' instead. The maximum number of seconds queries are allowed to
   * spend waiting for execution. If the query is not assigned to a server during that time, the
   * client is disconnected. 0 disables. Note: This field should not be added to client libraries if
   * not present already.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String queryWaitTimeout;

  /**
   * Optional. Deprecated. Use 'flags' instead. The maximum number of seconds a server is allowed to
   * be idle before it is disconnected. 0 disables. Note: This field should not be added to client
   * libraries if not present already.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serverIdleTimeout;

  /**
   * Optional. Deprecated. Use 'flags' instead. The list of users that are allowed to connect to the
   * MCP stats console. The users must exist in the database. Note: This field should not be added
   * to client libraries if not present already.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> statsUsers;

  /**
   * Optional. Deprecated. Use 'flags' instead. The default pool size. Defaults to 20. Note: This
   * field should not be added to client libraries if not present already.
   * @return value or {@code null} for none
   */
  public java.lang.String getDefaultPoolSize() {
    return defaultPoolSize;
  }

  /**
   * Optional. Deprecated. Use 'flags' instead. The default pool size. Defaults to 20. Note: This
   * field should not be added to client libraries if not present already.
   * @param defaultPoolSize defaultPoolSize or {@code null} for none
   */
  public ConnectionPoolConfig setDefaultPoolSize(java.lang.String defaultPoolSize) {
    this.defaultPoolSize = defaultPoolSize;
    return this;
  }

  /**
   * Optional. Deprecated; Prefer 'enabled' as this will be removed soon.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnable() {
    return enable;
  }

  /**
   * Optional. Deprecated; Prefer 'enabled' as this will be removed soon.
   * @param enable enable or {@code null} for none
   */
  public ConnectionPoolConfig setEnable(java.lang.Boolean enable) {
    this.enable = enable;
    return this;
  }

  /**
   * Optional. Whether to enable Managed Connection Pool (MCP).
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnabled() {
    return enabled;
  }

  /**
   * Optional. Whether to enable Managed Connection Pool (MCP).
   * @param enabled enabled or {@code null} for none
   */
  public ConnectionPoolConfig setEnabled(java.lang.Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Optional. Connection Pool flags, as a list of "key": "value" pairs.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getFlags() {
    return flags;
  }

  /**
   * Optional. Connection Pool flags, as a list of "key": "value" pairs.
   * @param flags flags or {@code null} for none
   */
  public ConnectionPoolConfig setFlags(java.util.Map<String, java.lang.String> flags) {
    this.flags = flags;
    return this;
  }

  /**
   * Optional. Deprecated. Use 'flags' instead. The list of startup parameters to ignore. Defaults
   * to ["extra_float_digits"] Note: This field should not be added to client libraries if not
   * present already.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getIgnoreStartupParameters() {
    return ignoreStartupParameters;
  }

  /**
   * Optional. Deprecated. Use 'flags' instead. The list of startup parameters to ignore. Defaults
   * to ["extra_float_digits"] Note: This field should not be added to client libraries if not
   * present already.
   * @param ignoreStartupParameters ignoreStartupParameters or {@code null} for none
   */
  public ConnectionPoolConfig setIgnoreStartupParameters(java.util.List<java.lang.String> ignoreStartupParameters) {
    this.ignoreStartupParameters = ignoreStartupParameters;
    return this;
  }

  /**
   * Optional. Deprecated. Use 'flags' instead. The maximum number of client connections allowed.
   * Note: This field should not be added to client libraries if not present already.
   * @return value or {@code null} for none
   */
  public java.lang.String getMaxClientConn() {
    return maxClientConn;
  }

  /**
   * Optional. Deprecated. Use 'flags' instead. The maximum number of client connections allowed.
   * Note: This field should not be added to client libraries if not present already.
   * @param maxClientConn maxClientConn or {@code null} for none
   */
  public ConnectionPoolConfig setMaxClientConn(java.lang.String maxClientConn) {
    this.maxClientConn = maxClientConn;
    return this;
  }

  /**
   * Optional. Deprecated. Use 'flags' instead. The maximum number of prepared statements allowed.
   * MCP makes sure that any statement prepared by a client, up to this limit, is available on the
   * backing server connection in transaction and statement pooling mode. Even if the statement was
   * originally prepared on another server connection. Defaults to 0. Note: This field should not be
   * added to client libraries if not present already.
   * @return value or {@code null} for none
   */
  public java.lang.String getMaxPreparedStatements() {
    return maxPreparedStatements;
  }

  /**
   * Optional. Deprecated. Use 'flags' instead. The maximum number of prepared statements allowed.
   * MCP makes sure that any statement prepared by a client, up to this limit, is available on the
   * backing server connection in transaction and statement pooling mode. Even if the statement was
   * originally prepared on another server connection. Defaults to 0. Note: This field should not be
   * added to client libraries if not present already.
   * @param maxPreparedStatements maxPreparedStatements or {@code null} for none
   */
  public ConnectionPoolConfig setMaxPreparedStatements(java.lang.String maxPreparedStatements) {
    this.maxPreparedStatements = maxPreparedStatements;
    return this;
  }

  /**
   * Optional. Deprecated. Use 'flags' instead. The minimum pool size. Defaults to 0. Note: This
   * field should not be added to client libraries if not present already.
   * @return value or {@code null} for none
   */
  public java.lang.String getMinPoolSize() {
    return minPoolSize;
  }

  /**
   * Optional. Deprecated. Use 'flags' instead. The minimum pool size. Defaults to 0. Note: This
   * field should not be added to client libraries if not present already.
   * @param minPoolSize minPoolSize or {@code null} for none
   */
  public ConnectionPoolConfig setMinPoolSize(java.lang.String minPoolSize) {
    this.minPoolSize = minPoolSize;
    return this;
  }

  /**
   * Optional. Deprecated. Use 'flags' instead. The pool mode. Defaults to `POOL_MODE_TRANSACTION`.
   * Note: This field should not be added to client libraries if not present already.
   * @return value or {@code null} for none
   */
  public java.lang.String getPoolMode() {
    return poolMode;
  }

  /**
   * Optional. Deprecated. Use 'flags' instead. The pool mode. Defaults to `POOL_MODE_TRANSACTION`.
   * Note: This field should not be added to client libraries if not present already.
   * @param poolMode poolMode or {@code null} for none
   */
  public ConnectionPoolConfig setPoolMode(java.lang.String poolMode) {
    this.poolMode = poolMode;
    return this;
  }

  /**
   * Output only. The number of running poolers per instance.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPoolerCount() {
    return poolerCount;
  }

  /**
   * Output only. The number of running poolers per instance.
   * @param poolerCount poolerCount or {@code null} for none
   */
  public ConnectionPoolConfig setPoolerCount(java.lang.Integer poolerCount) {
    this.poolerCount = poolerCount;
    return this;
  }

  /**
   * Optional. Deprecated. Use 'flags' instead. The maximum number of seconds queries are allowed to
   * spend waiting for execution. If the query is not assigned to a server during that time, the
   * client is disconnected. 0 disables. Note: This field should not be added to client libraries if
   * not present already.
   * @return value or {@code null} for none
   */
  public java.lang.String getQueryWaitTimeout() {
    return queryWaitTimeout;
  }

  /**
   * Optional. Deprecated. Use 'flags' instead. The maximum number of seconds queries are allowed to
   * spend waiting for execution. If the query is not assigned to a server during that time, the
   * client is disconnected. 0 disables. Note: This field should not be added to client libraries if
   * not present already.
   * @param queryWaitTimeout queryWaitTimeout or {@code null} for none
   */
  public ConnectionPoolConfig setQueryWaitTimeout(java.lang.String queryWaitTimeout) {
    this.queryWaitTimeout = queryWaitTimeout;
    return this;
  }

  /**
   * Optional. Deprecated. Use 'flags' instead. The maximum number of seconds a server is allowed to
   * be idle before it is disconnected. 0 disables. Note: This field should not be added to client
   * libraries if not present already.
   * @return value or {@code null} for none
   */
  public java.lang.String getServerIdleTimeout() {
    return serverIdleTimeout;
  }

  /**
   * Optional. Deprecated. Use 'flags' instead. The maximum number of seconds a server is allowed to
   * be idle before it is disconnected. 0 disables. Note: This field should not be added to client
   * libraries if not present already.
   * @param serverIdleTimeout serverIdleTimeout or {@code null} for none
   */
  public ConnectionPoolConfig setServerIdleTimeout(java.lang.String serverIdleTimeout) {
    this.serverIdleTimeout = serverIdleTimeout;
    return this;
  }

  /**
   * Optional. Deprecated. Use 'flags' instead. The list of users that are allowed to connect to the
   * MCP stats console. The users must exist in the database. Note: This field should not be added
   * to client libraries if not present already.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getStatsUsers() {
    return statsUsers;
  }

  /**
   * Optional. Deprecated. Use 'flags' instead. The list of users that are allowed to connect to the
   * MCP stats console. The users must exist in the database. Note: This field should not be added
   * to client libraries if not present already.
   * @param statsUsers statsUsers or {@code null} for none
   */
  public ConnectionPoolConfig setStatsUsers(java.util.List<java.lang.String> statsUsers) {
    this.statsUsers = statsUsers;
    return this;
  }

  @Override
  public ConnectionPoolConfig set(String fieldName, Object value) {
    return (ConnectionPoolConfig) super.set(fieldName, value);
  }

  @Override
  public ConnectionPoolConfig clone() {
    return (ConnectionPoolConfig) super.clone();
  }

}

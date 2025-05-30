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

package com.google.api.services.spanner.v1.model;

/**
 * Results from Read or ExecuteSql.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Spanner API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ResultSet extends com.google.api.client.json.GenericJson {

  /**
   * Metadata about the result set, such as row type information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ResultSetMetadata metadata;

  /**
   * Optional. A precommit token is included if the read-write transaction is on a multiplexed
   * session. Pass the precommit token with the highest sequence number from this transaction
   * attempt to the Commit request for this transaction.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MultiplexedSessionPrecommitToken precommitToken;

  /**
   * Each element in `rows` is a row whose format is defined by metadata.row_type. The ith element
   * in each row matches the ith field in metadata.row_type. Elements are encoded based on type as
   * described here.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.util.List<java.lang.Object>> rows;

  /**
   * Query plan and execution statistics for the SQL statement that produced this result set. These
   * can be requested by setting ExecuteSqlRequest.query_mode. DML statements always produce stats
   * containing the number of rows modified, unless executed using the
   * ExecuteSqlRequest.QueryMode.PLAN ExecuteSqlRequest.query_mode. Other fields might or might not
   * be populated, based on the ExecuteSqlRequest.query_mode.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ResultSetStats stats;

  /**
   * Metadata about the result set, such as row type information.
   * @return value or {@code null} for none
   */
  public ResultSetMetadata getMetadata() {
    return metadata;
  }

  /**
   * Metadata about the result set, such as row type information.
   * @param metadata metadata or {@code null} for none
   */
  public ResultSet setMetadata(ResultSetMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Optional. A precommit token is included if the read-write transaction is on a multiplexed
   * session. Pass the precommit token with the highest sequence number from this transaction
   * attempt to the Commit request for this transaction.
   * @return value or {@code null} for none
   */
  public MultiplexedSessionPrecommitToken getPrecommitToken() {
    return precommitToken;
  }

  /**
   * Optional. A precommit token is included if the read-write transaction is on a multiplexed
   * session. Pass the precommit token with the highest sequence number from this transaction
   * attempt to the Commit request for this transaction.
   * @param precommitToken precommitToken or {@code null} for none
   */
  public ResultSet setPrecommitToken(MultiplexedSessionPrecommitToken precommitToken) {
    this.precommitToken = precommitToken;
    return this;
  }

  /**
   * Each element in `rows` is a row whose format is defined by metadata.row_type. The ith element
   * in each row matches the ith field in metadata.row_type. Elements are encoded based on type as
   * described here.
   * @return value or {@code null} for none
   */
  public java.util.List<java.util.List<java.lang.Object>> getRows() {
    return rows;
  }

  /**
   * Each element in `rows` is a row whose format is defined by metadata.row_type. The ith element
   * in each row matches the ith field in metadata.row_type. Elements are encoded based on type as
   * described here.
   * @param rows rows or {@code null} for none
   */
  public ResultSet setRows(java.util.List<java.util.List<java.lang.Object>> rows) {
    this.rows = rows;
    return this;
  }

  /**
   * Query plan and execution statistics for the SQL statement that produced this result set. These
   * can be requested by setting ExecuteSqlRequest.query_mode. DML statements always produce stats
   * containing the number of rows modified, unless executed using the
   * ExecuteSqlRequest.QueryMode.PLAN ExecuteSqlRequest.query_mode. Other fields might or might not
   * be populated, based on the ExecuteSqlRequest.query_mode.
   * @return value or {@code null} for none
   */
  public ResultSetStats getStats() {
    return stats;
  }

  /**
   * Query plan and execution statistics for the SQL statement that produced this result set. These
   * can be requested by setting ExecuteSqlRequest.query_mode. DML statements always produce stats
   * containing the number of rows modified, unless executed using the
   * ExecuteSqlRequest.QueryMode.PLAN ExecuteSqlRequest.query_mode. Other fields might or might not
   * be populated, based on the ExecuteSqlRequest.query_mode.
   * @param stats stats or {@code null} for none
   */
  public ResultSet setStats(ResultSetStats stats) {
    this.stats = stats;
    return this;
  }

  @Override
  public ResultSet set(String fieldName, Object value) {
    return (ResultSet) super.set(fieldName, value);
  }

  @Override
  public ResultSet clone() {
    return (ResultSet) super.clone();
  }

}

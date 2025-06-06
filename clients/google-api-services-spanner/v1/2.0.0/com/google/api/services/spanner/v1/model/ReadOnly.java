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
 * Message type to initiate a read-only transaction.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Spanner API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReadOnly extends com.google.api.client.json.GenericJson {

  /**
   * Executes all reads at a timestamp that is `exact_staleness` old. The timestamp is chosen soon
   * after the read is started. Guarantees that all writes that have committed more than the
   * specified number of seconds ago are visible. Because Cloud Spanner chooses the exact timestamp,
   * this mode works even if the client's local clock is substantially skewed from Cloud Spanner
   * commit timestamps. Useful for reading at nearby replicas without the distributed timestamp
   * negotiation overhead of `max_staleness`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String exactStaleness;

  /**
   * Read data at a timestamp >= `NOW - max_staleness` seconds. Guarantees that all writes that have
   * committed more than the specified number of seconds ago are visible. Because Cloud Spanner
   * chooses the exact timestamp, this mode works even if the client's local clock is substantially
   * skewed from Cloud Spanner commit timestamps. Useful for reading the freshest data available at
   * a nearby replica, while bounding the possible staleness if the local replica has fallen behind.
   * Note that this option can only be used in single-use transactions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String maxStaleness;

  /**
   * Executes all reads at a timestamp >= `min_read_timestamp`. This is useful for requesting
   * fresher data than some previous read, or data that is fresh enough to observe the effects of
   * some previously committed transaction whose timestamp is known. Note that this option can only
   * be used in single-use transactions. A timestamp in RFC3339 UTC \"Zulu\" format, accurate to
   * nanoseconds. Example: `"2014-10-02T15:01:23.045123456Z"`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String minReadTimestamp;

  /**
   * Executes all reads at the given timestamp. Unlike other modes, reads at a specific timestamp
   * are repeatable; the same read at the same timestamp always returns the same data. If the
   * timestamp is in the future, the read is blocked until the specified timestamp, modulo the
   * read's deadline. Useful for large scale consistent reads such as mapreduces, or for
   * coordinating many reads against a consistent snapshot of the data. A timestamp in RFC3339 UTC
   * \"Zulu\" format, accurate to nanoseconds. Example: `"2014-10-02T15:01:23.045123456Z"`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String readTimestamp;

  /**
   * If true, the Cloud Spanner-selected read timestamp is included in the Transaction message that
   * describes the transaction.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean returnReadTimestamp;

  /**
   * Read at a timestamp where all previously committed transactions are visible.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean strong;

  /**
   * Executes all reads at a timestamp that is `exact_staleness` old. The timestamp is chosen soon
   * after the read is started. Guarantees that all writes that have committed more than the
   * specified number of seconds ago are visible. Because Cloud Spanner chooses the exact timestamp,
   * this mode works even if the client's local clock is substantially skewed from Cloud Spanner
   * commit timestamps. Useful for reading at nearby replicas without the distributed timestamp
   * negotiation overhead of `max_staleness`.
   * @return value or {@code null} for none
   */
  public String getExactStaleness() {
    return exactStaleness;
  }

  /**
   * Executes all reads at a timestamp that is `exact_staleness` old. The timestamp is chosen soon
   * after the read is started. Guarantees that all writes that have committed more than the
   * specified number of seconds ago are visible. Because Cloud Spanner chooses the exact timestamp,
   * this mode works even if the client's local clock is substantially skewed from Cloud Spanner
   * commit timestamps. Useful for reading at nearby replicas without the distributed timestamp
   * negotiation overhead of `max_staleness`.
   * @param exactStaleness exactStaleness or {@code null} for none
   */
  public ReadOnly setExactStaleness(String exactStaleness) {
    this.exactStaleness = exactStaleness;
    return this;
  }

  /**
   * Read data at a timestamp >= `NOW - max_staleness` seconds. Guarantees that all writes that have
   * committed more than the specified number of seconds ago are visible. Because Cloud Spanner
   * chooses the exact timestamp, this mode works even if the client's local clock is substantially
   * skewed from Cloud Spanner commit timestamps. Useful for reading the freshest data available at
   * a nearby replica, while bounding the possible staleness if the local replica has fallen behind.
   * Note that this option can only be used in single-use transactions.
   * @return value or {@code null} for none
   */
  public String getMaxStaleness() {
    return maxStaleness;
  }

  /**
   * Read data at a timestamp >= `NOW - max_staleness` seconds. Guarantees that all writes that have
   * committed more than the specified number of seconds ago are visible. Because Cloud Spanner
   * chooses the exact timestamp, this mode works even if the client's local clock is substantially
   * skewed from Cloud Spanner commit timestamps. Useful for reading the freshest data available at
   * a nearby replica, while bounding the possible staleness if the local replica has fallen behind.
   * Note that this option can only be used in single-use transactions.
   * @param maxStaleness maxStaleness or {@code null} for none
   */
  public ReadOnly setMaxStaleness(String maxStaleness) {
    this.maxStaleness = maxStaleness;
    return this;
  }

  /**
   * Executes all reads at a timestamp >= `min_read_timestamp`. This is useful for requesting
   * fresher data than some previous read, or data that is fresh enough to observe the effects of
   * some previously committed transaction whose timestamp is known. Note that this option can only
   * be used in single-use transactions. A timestamp in RFC3339 UTC \"Zulu\" format, accurate to
   * nanoseconds. Example: `"2014-10-02T15:01:23.045123456Z"`.
   * @return value or {@code null} for none
   */
  public String getMinReadTimestamp() {
    return minReadTimestamp;
  }

  /**
   * Executes all reads at a timestamp >= `min_read_timestamp`. This is useful for requesting
   * fresher data than some previous read, or data that is fresh enough to observe the effects of
   * some previously committed transaction whose timestamp is known. Note that this option can only
   * be used in single-use transactions. A timestamp in RFC3339 UTC \"Zulu\" format, accurate to
   * nanoseconds. Example: `"2014-10-02T15:01:23.045123456Z"`.
   * @param minReadTimestamp minReadTimestamp or {@code null} for none
   */
  public ReadOnly setMinReadTimestamp(String minReadTimestamp) {
    this.minReadTimestamp = minReadTimestamp;
    return this;
  }

  /**
   * Executes all reads at the given timestamp. Unlike other modes, reads at a specific timestamp
   * are repeatable; the same read at the same timestamp always returns the same data. If the
   * timestamp is in the future, the read is blocked until the specified timestamp, modulo the
   * read's deadline. Useful for large scale consistent reads such as mapreduces, or for
   * coordinating many reads against a consistent snapshot of the data. A timestamp in RFC3339 UTC
   * \"Zulu\" format, accurate to nanoseconds. Example: `"2014-10-02T15:01:23.045123456Z"`.
   * @return value or {@code null} for none
   */
  public String getReadTimestamp() {
    return readTimestamp;
  }

  /**
   * Executes all reads at the given timestamp. Unlike other modes, reads at a specific timestamp
   * are repeatable; the same read at the same timestamp always returns the same data. If the
   * timestamp is in the future, the read is blocked until the specified timestamp, modulo the
   * read's deadline. Useful for large scale consistent reads such as mapreduces, or for
   * coordinating many reads against a consistent snapshot of the data. A timestamp in RFC3339 UTC
   * \"Zulu\" format, accurate to nanoseconds. Example: `"2014-10-02T15:01:23.045123456Z"`.
   * @param readTimestamp readTimestamp or {@code null} for none
   */
  public ReadOnly setReadTimestamp(String readTimestamp) {
    this.readTimestamp = readTimestamp;
    return this;
  }

  /**
   * If true, the Cloud Spanner-selected read timestamp is included in the Transaction message that
   * describes the transaction.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getReturnReadTimestamp() {
    return returnReadTimestamp;
  }

  /**
   * If true, the Cloud Spanner-selected read timestamp is included in the Transaction message that
   * describes the transaction.
   * @param returnReadTimestamp returnReadTimestamp or {@code null} for none
   */
  public ReadOnly setReturnReadTimestamp(java.lang.Boolean returnReadTimestamp) {
    this.returnReadTimestamp = returnReadTimestamp;
    return this;
  }

  /**
   * Read at a timestamp where all previously committed transactions are visible.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getStrong() {
    return strong;
  }

  /**
   * Read at a timestamp where all previously committed transactions are visible.
   * @param strong strong or {@code null} for none
   */
  public ReadOnly setStrong(java.lang.Boolean strong) {
    this.strong = strong;
    return this;
  }

  @Override
  public ReadOnly set(String fieldName, Object value) {
    return (ReadOnly) super.set(fieldName, value);
  }

  @Override
  public ReadOnly clone() {
    return (ReadOnly) super.clone();
  }

}

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

package com.google.api.services.dataproc.model;

/**
 * Model definition for ShufflePushReadQuantileMetrics.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ShufflePushReadQuantileMetrics extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Quantiles corruptMergedBlockChunks;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Quantiles localMergedBlocksFetched;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Quantiles localMergedBytesRead;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Quantiles localMergedChunksFetched;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Quantiles mergedFetchFallbackCount;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Quantiles remoteMergedBlocksFetched;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Quantiles remoteMergedBytesRead;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Quantiles remoteMergedChunksFetched;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Quantiles remoteMergedReqsDuration;

  /**
   * @return value or {@code null} for none
   */
  public Quantiles getCorruptMergedBlockChunks() {
    return corruptMergedBlockChunks;
  }

  /**
   * @param corruptMergedBlockChunks corruptMergedBlockChunks or {@code null} for none
   */
  public ShufflePushReadQuantileMetrics setCorruptMergedBlockChunks(Quantiles corruptMergedBlockChunks) {
    this.corruptMergedBlockChunks = corruptMergedBlockChunks;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Quantiles getLocalMergedBlocksFetched() {
    return localMergedBlocksFetched;
  }

  /**
   * @param localMergedBlocksFetched localMergedBlocksFetched or {@code null} for none
   */
  public ShufflePushReadQuantileMetrics setLocalMergedBlocksFetched(Quantiles localMergedBlocksFetched) {
    this.localMergedBlocksFetched = localMergedBlocksFetched;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Quantiles getLocalMergedBytesRead() {
    return localMergedBytesRead;
  }

  /**
   * @param localMergedBytesRead localMergedBytesRead or {@code null} for none
   */
  public ShufflePushReadQuantileMetrics setLocalMergedBytesRead(Quantiles localMergedBytesRead) {
    this.localMergedBytesRead = localMergedBytesRead;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Quantiles getLocalMergedChunksFetched() {
    return localMergedChunksFetched;
  }

  /**
   * @param localMergedChunksFetched localMergedChunksFetched or {@code null} for none
   */
  public ShufflePushReadQuantileMetrics setLocalMergedChunksFetched(Quantiles localMergedChunksFetched) {
    this.localMergedChunksFetched = localMergedChunksFetched;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Quantiles getMergedFetchFallbackCount() {
    return mergedFetchFallbackCount;
  }

  /**
   * @param mergedFetchFallbackCount mergedFetchFallbackCount or {@code null} for none
   */
  public ShufflePushReadQuantileMetrics setMergedFetchFallbackCount(Quantiles mergedFetchFallbackCount) {
    this.mergedFetchFallbackCount = mergedFetchFallbackCount;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Quantiles getRemoteMergedBlocksFetched() {
    return remoteMergedBlocksFetched;
  }

  /**
   * @param remoteMergedBlocksFetched remoteMergedBlocksFetched or {@code null} for none
   */
  public ShufflePushReadQuantileMetrics setRemoteMergedBlocksFetched(Quantiles remoteMergedBlocksFetched) {
    this.remoteMergedBlocksFetched = remoteMergedBlocksFetched;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Quantiles getRemoteMergedBytesRead() {
    return remoteMergedBytesRead;
  }

  /**
   * @param remoteMergedBytesRead remoteMergedBytesRead or {@code null} for none
   */
  public ShufflePushReadQuantileMetrics setRemoteMergedBytesRead(Quantiles remoteMergedBytesRead) {
    this.remoteMergedBytesRead = remoteMergedBytesRead;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Quantiles getRemoteMergedChunksFetched() {
    return remoteMergedChunksFetched;
  }

  /**
   * @param remoteMergedChunksFetched remoteMergedChunksFetched or {@code null} for none
   */
  public ShufflePushReadQuantileMetrics setRemoteMergedChunksFetched(Quantiles remoteMergedChunksFetched) {
    this.remoteMergedChunksFetched = remoteMergedChunksFetched;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Quantiles getRemoteMergedReqsDuration() {
    return remoteMergedReqsDuration;
  }

  /**
   * @param remoteMergedReqsDuration remoteMergedReqsDuration or {@code null} for none
   */
  public ShufflePushReadQuantileMetrics setRemoteMergedReqsDuration(Quantiles remoteMergedReqsDuration) {
    this.remoteMergedReqsDuration = remoteMergedReqsDuration;
    return this;
  }

  @Override
  public ShufflePushReadQuantileMetrics set(String fieldName, Object value) {
    return (ShufflePushReadQuantileMetrics) super.set(fieldName, value);
  }

  @Override
  public ShufflePushReadQuantileMetrics clone() {
    return (ShufflePushReadQuantileMetrics) super.clone();
  }

}

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

package com.google.api.services.dlp.v2.model;

/**
 * All Result fields are updated while the job is processing.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Sensitive Data Protection (DLP). For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2Result extends com.google.api.client.json.GenericJson {

  /**
   * Statistics related to the processing of hybrid inspect.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2HybridInspectStatistics hybridStats;

  /**
   * Statistics of how many instances of each info type were found during inspect job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GooglePrivacyDlpV2InfoTypeStats> infoTypeStats;

  static {
    // hack to force ProGuard to consider GooglePrivacyDlpV2InfoTypeStats used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GooglePrivacyDlpV2InfoTypeStats.class);
  }

  /**
   * Number of rows scanned after sampling and time filtering (applicable for row based stores such
   * as BigQuery).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long numRowsProcessed;

  /**
   * Total size in bytes that were processed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long processedBytes;

  /**
   * Estimate of the number of bytes to process.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long totalEstimatedBytes;

  /**
   * Statistics related to the processing of hybrid inspect.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2HybridInspectStatistics getHybridStats() {
    return hybridStats;
  }

  /**
   * Statistics related to the processing of hybrid inspect.
   * @param hybridStats hybridStats or {@code null} for none
   */
  public GooglePrivacyDlpV2Result setHybridStats(GooglePrivacyDlpV2HybridInspectStatistics hybridStats) {
    this.hybridStats = hybridStats;
    return this;
  }

  /**
   * Statistics of how many instances of each info type were found during inspect job.
   * @return value or {@code null} for none
   */
  public java.util.List<GooglePrivacyDlpV2InfoTypeStats> getInfoTypeStats() {
    return infoTypeStats;
  }

  /**
   * Statistics of how many instances of each info type were found during inspect job.
   * @param infoTypeStats infoTypeStats or {@code null} for none
   */
  public GooglePrivacyDlpV2Result setInfoTypeStats(java.util.List<GooglePrivacyDlpV2InfoTypeStats> infoTypeStats) {
    this.infoTypeStats = infoTypeStats;
    return this;
  }

  /**
   * Number of rows scanned after sampling and time filtering (applicable for row based stores such
   * as BigQuery).
   * @return value or {@code null} for none
   */
  public java.lang.Long getNumRowsProcessed() {
    return numRowsProcessed;
  }

  /**
   * Number of rows scanned after sampling and time filtering (applicable for row based stores such
   * as BigQuery).
   * @param numRowsProcessed numRowsProcessed or {@code null} for none
   */
  public GooglePrivacyDlpV2Result setNumRowsProcessed(java.lang.Long numRowsProcessed) {
    this.numRowsProcessed = numRowsProcessed;
    return this;
  }

  /**
   * Total size in bytes that were processed.
   * @return value or {@code null} for none
   */
  public java.lang.Long getProcessedBytes() {
    return processedBytes;
  }

  /**
   * Total size in bytes that were processed.
   * @param processedBytes processedBytes or {@code null} for none
   */
  public GooglePrivacyDlpV2Result setProcessedBytes(java.lang.Long processedBytes) {
    this.processedBytes = processedBytes;
    return this;
  }

  /**
   * Estimate of the number of bytes to process.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTotalEstimatedBytes() {
    return totalEstimatedBytes;
  }

  /**
   * Estimate of the number of bytes to process.
   * @param totalEstimatedBytes totalEstimatedBytes or {@code null} for none
   */
  public GooglePrivacyDlpV2Result setTotalEstimatedBytes(java.lang.Long totalEstimatedBytes) {
    this.totalEstimatedBytes = totalEstimatedBytes;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2Result set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2Result) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2Result clone() {
    return (GooglePrivacyDlpV2Result) super.clone();
  }

}

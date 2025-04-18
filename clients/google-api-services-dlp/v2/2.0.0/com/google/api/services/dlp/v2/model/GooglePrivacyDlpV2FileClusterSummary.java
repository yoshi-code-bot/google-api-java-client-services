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
 * The file cluster summary.
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
public final class GooglePrivacyDlpV2FileClusterSummary extends com.google.api.client.json.GenericJson {

  /**
   * The data risk level of this cluster. RISK_LOW if nothing has been scanned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2DataRiskLevel dataRiskLevel;

  /**
   * A list of errors detected while scanning this cluster. The list is truncated to 10 per cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GooglePrivacyDlpV2Error> errors;

  static {
    // hack to force ProGuard to consider GooglePrivacyDlpV2Error used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GooglePrivacyDlpV2Error.class);
  }

  /**
   * The file cluster type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2FileClusterType fileClusterType;

  /**
   * A sample of file types scanned in this cluster. Empty if no files were scanned. File extensions
   * can be derived from the file name or the file content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GooglePrivacyDlpV2FileExtensionInfo> fileExtensionsScanned;

  /**
   * A sample of file types seen in this cluster. Empty if no files were seen. File extensions can
   * be derived from the file name or the file content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GooglePrivacyDlpV2FileExtensionInfo> fileExtensionsSeen;

  /**
   * InfoTypes detected in this cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GooglePrivacyDlpV2FileStoreInfoTypeSummary> fileStoreInfoTypeSummaries;

  /**
   * True if no files exist in this cluster. If the file store had more files than could be listed,
   * this will be false even if no files for this cluster were seen and file_extensions_seen is
   * empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean noFilesExist;

  /**
   * The sensitivity score of this cluster. The score will be SENSITIVITY_LOW if nothing has been
   * scanned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2SensitivityScore sensitivityScore;

  /**
   * The data risk level of this cluster. RISK_LOW if nothing has been scanned.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2DataRiskLevel getDataRiskLevel() {
    return dataRiskLevel;
  }

  /**
   * The data risk level of this cluster. RISK_LOW if nothing has been scanned.
   * @param dataRiskLevel dataRiskLevel or {@code null} for none
   */
  public GooglePrivacyDlpV2FileClusterSummary setDataRiskLevel(GooglePrivacyDlpV2DataRiskLevel dataRiskLevel) {
    this.dataRiskLevel = dataRiskLevel;
    return this;
  }

  /**
   * A list of errors detected while scanning this cluster. The list is truncated to 10 per cluster.
   * @return value or {@code null} for none
   */
  public java.util.List<GooglePrivacyDlpV2Error> getErrors() {
    return errors;
  }

  /**
   * A list of errors detected while scanning this cluster. The list is truncated to 10 per cluster.
   * @param errors errors or {@code null} for none
   */
  public GooglePrivacyDlpV2FileClusterSummary setErrors(java.util.List<GooglePrivacyDlpV2Error> errors) {
    this.errors = errors;
    return this;
  }

  /**
   * The file cluster type.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2FileClusterType getFileClusterType() {
    return fileClusterType;
  }

  /**
   * The file cluster type.
   * @param fileClusterType fileClusterType or {@code null} for none
   */
  public GooglePrivacyDlpV2FileClusterSummary setFileClusterType(GooglePrivacyDlpV2FileClusterType fileClusterType) {
    this.fileClusterType = fileClusterType;
    return this;
  }

  /**
   * A sample of file types scanned in this cluster. Empty if no files were scanned. File extensions
   * can be derived from the file name or the file content.
   * @return value or {@code null} for none
   */
  public java.util.List<GooglePrivacyDlpV2FileExtensionInfo> getFileExtensionsScanned() {
    return fileExtensionsScanned;
  }

  /**
   * A sample of file types scanned in this cluster. Empty if no files were scanned. File extensions
   * can be derived from the file name or the file content.
   * @param fileExtensionsScanned fileExtensionsScanned or {@code null} for none
   */
  public GooglePrivacyDlpV2FileClusterSummary setFileExtensionsScanned(java.util.List<GooglePrivacyDlpV2FileExtensionInfo> fileExtensionsScanned) {
    this.fileExtensionsScanned = fileExtensionsScanned;
    return this;
  }

  /**
   * A sample of file types seen in this cluster. Empty if no files were seen. File extensions can
   * be derived from the file name or the file content.
   * @return value or {@code null} for none
   */
  public java.util.List<GooglePrivacyDlpV2FileExtensionInfo> getFileExtensionsSeen() {
    return fileExtensionsSeen;
  }

  /**
   * A sample of file types seen in this cluster. Empty if no files were seen. File extensions can
   * be derived from the file name or the file content.
   * @param fileExtensionsSeen fileExtensionsSeen or {@code null} for none
   */
  public GooglePrivacyDlpV2FileClusterSummary setFileExtensionsSeen(java.util.List<GooglePrivacyDlpV2FileExtensionInfo> fileExtensionsSeen) {
    this.fileExtensionsSeen = fileExtensionsSeen;
    return this;
  }

  /**
   * InfoTypes detected in this cluster.
   * @return value or {@code null} for none
   */
  public java.util.List<GooglePrivacyDlpV2FileStoreInfoTypeSummary> getFileStoreInfoTypeSummaries() {
    return fileStoreInfoTypeSummaries;
  }

  /**
   * InfoTypes detected in this cluster.
   * @param fileStoreInfoTypeSummaries fileStoreInfoTypeSummaries or {@code null} for none
   */
  public GooglePrivacyDlpV2FileClusterSummary setFileStoreInfoTypeSummaries(java.util.List<GooglePrivacyDlpV2FileStoreInfoTypeSummary> fileStoreInfoTypeSummaries) {
    this.fileStoreInfoTypeSummaries = fileStoreInfoTypeSummaries;
    return this;
  }

  /**
   * True if no files exist in this cluster. If the file store had more files than could be listed,
   * this will be false even if no files for this cluster were seen and file_extensions_seen is
   * empty.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getNoFilesExist() {
    return noFilesExist;
  }

  /**
   * True if no files exist in this cluster. If the file store had more files than could be listed,
   * this will be false even if no files for this cluster were seen and file_extensions_seen is
   * empty.
   * @param noFilesExist noFilesExist or {@code null} for none
   */
  public GooglePrivacyDlpV2FileClusterSummary setNoFilesExist(java.lang.Boolean noFilesExist) {
    this.noFilesExist = noFilesExist;
    return this;
  }

  /**
   * The sensitivity score of this cluster. The score will be SENSITIVITY_LOW if nothing has been
   * scanned.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2SensitivityScore getSensitivityScore() {
    return sensitivityScore;
  }

  /**
   * The sensitivity score of this cluster. The score will be SENSITIVITY_LOW if nothing has been
   * scanned.
   * @param sensitivityScore sensitivityScore or {@code null} for none
   */
  public GooglePrivacyDlpV2FileClusterSummary setSensitivityScore(GooglePrivacyDlpV2SensitivityScore sensitivityScore) {
    this.sensitivityScore = sensitivityScore;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2FileClusterSummary set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2FileClusterSummary) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2FileClusterSummary clone() {
    return (GooglePrivacyDlpV2FileClusterSummary) super.clone();
  }

}

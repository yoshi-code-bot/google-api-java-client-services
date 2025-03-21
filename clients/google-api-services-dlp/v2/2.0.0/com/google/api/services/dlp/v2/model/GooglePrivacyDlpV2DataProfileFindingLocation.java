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
 * Location of a data profile finding within a resource.
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
public final class GooglePrivacyDlpV2DataProfileFindingLocation extends com.google.api.client.json.GenericJson {

  /**
   * Name of the container where the finding is located. The top-level name is the source file name
   * or table name. Names of some common storage containers are formatted as follows: * BigQuery
   * tables: `{project_id}:{dataset_id}.{table_id}` * Cloud Storage files: `gs://{bucket}/{path}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String containerName;

  /**
   * Location of a finding within a resource that produces a table data profile.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2DataProfileFindingRecordLocation dataProfileFindingRecordLocation;

  /**
   * Name of the container where the finding is located. The top-level name is the source file name
   * or table name. Names of some common storage containers are formatted as follows: * BigQuery
   * tables: `{project_id}:{dataset_id}.{table_id}` * Cloud Storage files: `gs://{bucket}/{path}`
   * @return value or {@code null} for none
   */
  public java.lang.String getContainerName() {
    return containerName;
  }

  /**
   * Name of the container where the finding is located. The top-level name is the source file name
   * or table name. Names of some common storage containers are formatted as follows: * BigQuery
   * tables: `{project_id}:{dataset_id}.{table_id}` * Cloud Storage files: `gs://{bucket}/{path}`
   * @param containerName containerName or {@code null} for none
   */
  public GooglePrivacyDlpV2DataProfileFindingLocation setContainerName(java.lang.String containerName) {
    this.containerName = containerName;
    return this;
  }

  /**
   * Location of a finding within a resource that produces a table data profile.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2DataProfileFindingRecordLocation getDataProfileFindingRecordLocation() {
    return dataProfileFindingRecordLocation;
  }

  /**
   * Location of a finding within a resource that produces a table data profile.
   * @param dataProfileFindingRecordLocation dataProfileFindingRecordLocation or {@code null} for none
   */
  public GooglePrivacyDlpV2DataProfileFindingLocation setDataProfileFindingRecordLocation(GooglePrivacyDlpV2DataProfileFindingRecordLocation dataProfileFindingRecordLocation) {
    this.dataProfileFindingRecordLocation = dataProfileFindingRecordLocation;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2DataProfileFindingLocation set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2DataProfileFindingLocation) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2DataProfileFindingLocation clone() {
    return (GooglePrivacyDlpV2DataProfileFindingLocation) super.clone();
  }

}

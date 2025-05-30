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

package com.google.api.services.firestore.v1.model;

/**
 * The request for FirestoreAdmin.ExportDocuments.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Firestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleFirestoreAdminV1ExportDocumentsRequest extends com.google.api.client.json.GenericJson {

  /**
   * Which collection IDs to export. Unspecified means all collections. Each collection ID in this
   * list must be unique.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> collectionIds;

  /**
   * An empty list represents all namespaces. This is the preferred usage for databases that don't
   * use namespaces. An empty string element represents the default namespace. This should be used
   * if the database has data in non-default namespaces, but doesn't want to include them. Each
   * namespace in this list must be unique.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> namespaceIds;

  /**
   * The output URI. Currently only supports Google Cloud Storage URIs of the form:
   * `gs://BUCKET_NAME[/NAMESPACE_PATH]`, where `BUCKET_NAME` is the name of the Google Cloud
   * Storage bucket and `NAMESPACE_PATH` is an optional Google Cloud Storage namespace path. When
   * choosing a name, be sure to consider Google Cloud Storage naming guidelines:
   * https://cloud.google.com/storage/docs/naming. If the URI is a bucket (without a namespace
   * path), a prefix will be generated based on the start time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String outputUriPrefix;

  /**
   * The timestamp that corresponds to the version of the database to be exported. The timestamp
   * must be in the past, rounded to the minute and not older than earliestVersionTime. If
   * specified, then the exported documents will represent a consistent view of the database at the
   * provided time. Otherwise, there are no guarantees about the consistency of the exported
   * documents.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String snapshotTime;

  /**
   * Which collection IDs to export. Unspecified means all collections. Each collection ID in this
   * list must be unique.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getCollectionIds() {
    return collectionIds;
  }

  /**
   * Which collection IDs to export. Unspecified means all collections. Each collection ID in this
   * list must be unique.
   * @param collectionIds collectionIds or {@code null} for none
   */
  public GoogleFirestoreAdminV1ExportDocumentsRequest setCollectionIds(java.util.List<java.lang.String> collectionIds) {
    this.collectionIds = collectionIds;
    return this;
  }

  /**
   * An empty list represents all namespaces. This is the preferred usage for databases that don't
   * use namespaces. An empty string element represents the default namespace. This should be used
   * if the database has data in non-default namespaces, but doesn't want to include them. Each
   * namespace in this list must be unique.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getNamespaceIds() {
    return namespaceIds;
  }

  /**
   * An empty list represents all namespaces. This is the preferred usage for databases that don't
   * use namespaces. An empty string element represents the default namespace. This should be used
   * if the database has data in non-default namespaces, but doesn't want to include them. Each
   * namespace in this list must be unique.
   * @param namespaceIds namespaceIds or {@code null} for none
   */
  public GoogleFirestoreAdminV1ExportDocumentsRequest setNamespaceIds(java.util.List<java.lang.String> namespaceIds) {
    this.namespaceIds = namespaceIds;
    return this;
  }

  /**
   * The output URI. Currently only supports Google Cloud Storage URIs of the form:
   * `gs://BUCKET_NAME[/NAMESPACE_PATH]`, where `BUCKET_NAME` is the name of the Google Cloud
   * Storage bucket and `NAMESPACE_PATH` is an optional Google Cloud Storage namespace path. When
   * choosing a name, be sure to consider Google Cloud Storage naming guidelines:
   * https://cloud.google.com/storage/docs/naming. If the URI is a bucket (without a namespace
   * path), a prefix will be generated based on the start time.
   * @return value or {@code null} for none
   */
  public java.lang.String getOutputUriPrefix() {
    return outputUriPrefix;
  }

  /**
   * The output URI. Currently only supports Google Cloud Storage URIs of the form:
   * `gs://BUCKET_NAME[/NAMESPACE_PATH]`, where `BUCKET_NAME` is the name of the Google Cloud
   * Storage bucket and `NAMESPACE_PATH` is an optional Google Cloud Storage namespace path. When
   * choosing a name, be sure to consider Google Cloud Storage naming guidelines:
   * https://cloud.google.com/storage/docs/naming. If the URI is a bucket (without a namespace
   * path), a prefix will be generated based on the start time.
   * @param outputUriPrefix outputUriPrefix or {@code null} for none
   */
  public GoogleFirestoreAdminV1ExportDocumentsRequest setOutputUriPrefix(java.lang.String outputUriPrefix) {
    this.outputUriPrefix = outputUriPrefix;
    return this;
  }

  /**
   * The timestamp that corresponds to the version of the database to be exported. The timestamp
   * must be in the past, rounded to the minute and not older than earliestVersionTime. If
   * specified, then the exported documents will represent a consistent view of the database at the
   * provided time. Otherwise, there are no guarantees about the consistency of the exported
   * documents.
   * @return value or {@code null} for none
   */
  public String getSnapshotTime() {
    return snapshotTime;
  }

  /**
   * The timestamp that corresponds to the version of the database to be exported. The timestamp
   * must be in the past, rounded to the minute and not older than earliestVersionTime. If
   * specified, then the exported documents will represent a consistent view of the database at the
   * provided time. Otherwise, there are no guarantees about the consistency of the exported
   * documents.
   * @param snapshotTime snapshotTime or {@code null} for none
   */
  public GoogleFirestoreAdminV1ExportDocumentsRequest setSnapshotTime(String snapshotTime) {
    this.snapshotTime = snapshotTime;
    return this;
  }

  @Override
  public GoogleFirestoreAdminV1ExportDocumentsRequest set(String fieldName, Object value) {
    return (GoogleFirestoreAdminV1ExportDocumentsRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleFirestoreAdminV1ExportDocumentsRequest clone() {
    return (GoogleFirestoreAdminV1ExportDocumentsRequest) super.clone();
  }

}

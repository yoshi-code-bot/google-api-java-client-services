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

package com.google.api.services.aiplatform.v1beta1.model;

/**
 * Metadata config for RagFile.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1RagFileMetadataConfig extends com.google.api.client.json.GenericJson {

  /**
   * Google Cloud Storage location. Supports importing individual files as well as entire Google
   * Cloud Storage directories. Sample formats: -
   * `gs://bucket_name/my_directory/object_name/metadata_schema.json` -
   * `gs://bucket_name/my_directory` If the user provides a directory, the metadata schema will be
   * read from the files that ends with "metadata_schema.json" in the directory.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1GcsSource gcsMetadataSchemaSource;

  /**
   * Google Cloud Storage location. Supports importing individual files as well as entire Google
   * Cloud Storage directories. Sample formats: -
   * `gs://bucket_name/my_directory/object_name/metadata.json` - `gs://bucket_name/my_directory` If
   * the user provides a directory, the metadata will be read from the files that ends with
   * "metadata.json" in the directory.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1GcsSource gcsMetadataSource;

  /**
   * Google Drive location. Supports importing individual files as well as Google Drive folders. If
   * the user provides a folder, the metadata schema will be read from the files that ends with
   * "metadata_schema.json" in the directory.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1GoogleDriveSource googleDriveMetadataSchemaSource;

  /**
   * Google Drive location. Supports importing individual files as well as Google Drive folders. If
   * the user provides a directory, the metadata will be read from the files that ends with
   * "metadata.json" in the directory.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1GoogleDriveSource googleDriveMetadataSource;

  /**
   * Inline metadata schema source. Must be a JSON string.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String inlineMetadataSchemaSource;

  /**
   * Inline metadata source. Must be a JSON string.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String inlineMetadataSource;

  /**
   * Google Cloud Storage location. Supports importing individual files as well as entire Google
   * Cloud Storage directories. Sample formats: -
   * `gs://bucket_name/my_directory/object_name/metadata_schema.json` -
   * `gs://bucket_name/my_directory` If the user provides a directory, the metadata schema will be
   * read from the files that ends with "metadata_schema.json" in the directory.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1GcsSource getGcsMetadataSchemaSource() {
    return gcsMetadataSchemaSource;
  }

  /**
   * Google Cloud Storage location. Supports importing individual files as well as entire Google
   * Cloud Storage directories. Sample formats: -
   * `gs://bucket_name/my_directory/object_name/metadata_schema.json` -
   * `gs://bucket_name/my_directory` If the user provides a directory, the metadata schema will be
   * read from the files that ends with "metadata_schema.json" in the directory.
   * @param gcsMetadataSchemaSource gcsMetadataSchemaSource or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1RagFileMetadataConfig setGcsMetadataSchemaSource(GoogleCloudAiplatformV1beta1GcsSource gcsMetadataSchemaSource) {
    this.gcsMetadataSchemaSource = gcsMetadataSchemaSource;
    return this;
  }

  /**
   * Google Cloud Storage location. Supports importing individual files as well as entire Google
   * Cloud Storage directories. Sample formats: -
   * `gs://bucket_name/my_directory/object_name/metadata.json` - `gs://bucket_name/my_directory` If
   * the user provides a directory, the metadata will be read from the files that ends with
   * "metadata.json" in the directory.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1GcsSource getGcsMetadataSource() {
    return gcsMetadataSource;
  }

  /**
   * Google Cloud Storage location. Supports importing individual files as well as entire Google
   * Cloud Storage directories. Sample formats: -
   * `gs://bucket_name/my_directory/object_name/metadata.json` - `gs://bucket_name/my_directory` If
   * the user provides a directory, the metadata will be read from the files that ends with
   * "metadata.json" in the directory.
   * @param gcsMetadataSource gcsMetadataSource or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1RagFileMetadataConfig setGcsMetadataSource(GoogleCloudAiplatformV1beta1GcsSource gcsMetadataSource) {
    this.gcsMetadataSource = gcsMetadataSource;
    return this;
  }

  /**
   * Google Drive location. Supports importing individual files as well as Google Drive folders. If
   * the user provides a folder, the metadata schema will be read from the files that ends with
   * "metadata_schema.json" in the directory.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1GoogleDriveSource getGoogleDriveMetadataSchemaSource() {
    return googleDriveMetadataSchemaSource;
  }

  /**
   * Google Drive location. Supports importing individual files as well as Google Drive folders. If
   * the user provides a folder, the metadata schema will be read from the files that ends with
   * "metadata_schema.json" in the directory.
   * @param googleDriveMetadataSchemaSource googleDriveMetadataSchemaSource or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1RagFileMetadataConfig setGoogleDriveMetadataSchemaSource(GoogleCloudAiplatformV1beta1GoogleDriveSource googleDriveMetadataSchemaSource) {
    this.googleDriveMetadataSchemaSource = googleDriveMetadataSchemaSource;
    return this;
  }

  /**
   * Google Drive location. Supports importing individual files as well as Google Drive folders. If
   * the user provides a directory, the metadata will be read from the files that ends with
   * "metadata.json" in the directory.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1GoogleDriveSource getGoogleDriveMetadataSource() {
    return googleDriveMetadataSource;
  }

  /**
   * Google Drive location. Supports importing individual files as well as Google Drive folders. If
   * the user provides a directory, the metadata will be read from the files that ends with
   * "metadata.json" in the directory.
   * @param googleDriveMetadataSource googleDriveMetadataSource or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1RagFileMetadataConfig setGoogleDriveMetadataSource(GoogleCloudAiplatformV1beta1GoogleDriveSource googleDriveMetadataSource) {
    this.googleDriveMetadataSource = googleDriveMetadataSource;
    return this;
  }

  /**
   * Inline metadata schema source. Must be a JSON string.
   * @return value or {@code null} for none
   */
  public java.lang.String getInlineMetadataSchemaSource() {
    return inlineMetadataSchemaSource;
  }

  /**
   * Inline metadata schema source. Must be a JSON string.
   * @param inlineMetadataSchemaSource inlineMetadataSchemaSource or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1RagFileMetadataConfig setInlineMetadataSchemaSource(java.lang.String inlineMetadataSchemaSource) {
    this.inlineMetadataSchemaSource = inlineMetadataSchemaSource;
    return this;
  }

  /**
   * Inline metadata source. Must be a JSON string.
   * @return value or {@code null} for none
   */
  public java.lang.String getInlineMetadataSource() {
    return inlineMetadataSource;
  }

  /**
   * Inline metadata source. Must be a JSON string.
   * @param inlineMetadataSource inlineMetadataSource or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1RagFileMetadataConfig setInlineMetadataSource(java.lang.String inlineMetadataSource) {
    this.inlineMetadataSource = inlineMetadataSource;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1RagFileMetadataConfig set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1RagFileMetadataConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1RagFileMetadataConfig clone() {
    return (GoogleCloudAiplatformV1beta1RagFileMetadataConfig) super.clone();
  }

}

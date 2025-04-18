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

package com.google.api.services.cloudfunctions.v2beta.model;

/**
 * Location of the source in an archive file in Google Cloud Storage.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Functions API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class StorageSource extends com.google.api.client.json.GenericJson {

  /**
   * Google Cloud Storage bucket containing the source (see [Bucket Name
   * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bucket;

  /**
   * Google Cloud Storage generation for the object. If the generation is omitted, the latest
   * generation will be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long generation;

  /**
   * Google Cloud Storage object containing the source. This object must be a gzipped archive file
   * (`.tar.gz`) containing source to build.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("object")
  private java.lang.String object__;

  /**
   * When the specified storage bucket is a 1st gen function uploard url bucket, this field should
   * be set as the generated upload url for 1st gen deployment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceUploadUrl;

  /**
   * Google Cloud Storage bucket containing the source (see [Bucket Name
   * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
   * @return value or {@code null} for none
   */
  public java.lang.String getBucket() {
    return bucket;
  }

  /**
   * Google Cloud Storage bucket containing the source (see [Bucket Name
   * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
   * @param bucket bucket or {@code null} for none
   */
  public StorageSource setBucket(java.lang.String bucket) {
    this.bucket = bucket;
    return this;
  }

  /**
   * Google Cloud Storage generation for the object. If the generation is omitted, the latest
   * generation will be used.
   * @return value or {@code null} for none
   */
  public java.lang.Long getGeneration() {
    return generation;
  }

  /**
   * Google Cloud Storage generation for the object. If the generation is omitted, the latest
   * generation will be used.
   * @param generation generation or {@code null} for none
   */
  public StorageSource setGeneration(java.lang.Long generation) {
    this.generation = generation;
    return this;
  }

  /**
   * Google Cloud Storage object containing the source. This object must be a gzipped archive file
   * (`.tar.gz`) containing source to build.
   * @return value or {@code null} for none
   */
  public java.lang.String getObject() {
    return object__;
  }

  /**
   * Google Cloud Storage object containing the source. This object must be a gzipped archive file
   * (`.tar.gz`) containing source to build.
   * @param object__ object__ or {@code null} for none
   */
  public StorageSource setObject(java.lang.String object__) {
    this.object__ = object__;
    return this;
  }

  /**
   * When the specified storage bucket is a 1st gen function uploard url bucket, this field should
   * be set as the generated upload url for 1st gen deployment.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceUploadUrl() {
    return sourceUploadUrl;
  }

  /**
   * When the specified storage bucket is a 1st gen function uploard url bucket, this field should
   * be set as the generated upload url for 1st gen deployment.
   * @param sourceUploadUrl sourceUploadUrl or {@code null} for none
   */
  public StorageSource setSourceUploadUrl(java.lang.String sourceUploadUrl) {
    this.sourceUploadUrl = sourceUploadUrl;
    return this;
  }

  @Override
  public StorageSource set(String fieldName, Object value) {
    return (StorageSource) super.set(fieldName, value);
  }

  @Override
  public StorageSource clone() {
    return (StorageSource) super.clone();
  }

}

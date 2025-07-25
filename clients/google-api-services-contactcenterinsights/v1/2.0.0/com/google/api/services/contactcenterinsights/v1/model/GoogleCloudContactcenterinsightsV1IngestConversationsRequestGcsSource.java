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

package com.google.api.services.contactcenterinsights.v1.model;

/**
 * Configuration for Cloud Storage bucket sources.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Contact Center AI Insights API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudContactcenterinsightsV1IngestConversationsRequestGcsSource extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The Cloud Storage path to the conversation audio file. Note that: [1] Audio files
   * will be transcribed if not already. [2] Audio files and transcript files must be in separate
   * buckets / folders. [3] A source file and its corresponding audio file must share the same name
   * to be properly ingested, E.g. `gs://bucket/transcript/conversation1.json` and
   * `gs://bucket/audio/conversation1.mp3`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String audioBucketUri;

  /**
   * Optional. Specifies the type of the objects in `bucket_uri`. Avoid passing this. This is
   * inferred from the `transcript_bucket_uri`, `audio_bucket_uri`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bucketObjectType;

  /**
   * Optional. The Cloud Storage bucket containing source objects. Avoid passing this. Pass this
   * through one of `transcript_bucket_uri` or `audio_bucket_uri`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bucketUri;

  /**
   * Optional. Custom keys to extract as conversation labels from metadata files in
   * `metadata_bucket_uri`. Keys not included in this field will be ignored. Note that there is a
   * limit of 100 labels per conversation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> customMetadataKeys;

  /**
   * Optional. The Cloud Storage path to the conversation metadata. Note that: [1] Metadata files
   * are expected to be in JSON format. [2] Metadata and source files (transcripts or audio) must be
   * in separate buckets / folders. [3] A source file and its corresponding metadata file must share
   * the same name to be properly ingested, E.g. `gs://bucket/audio/conversation1.mp3` and
   * `gs://bucket/metadata/conversation1.json`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String metadataBucketUri;

  /**
   * Optional. The Cloud Storage path to the conversation transcripts. Note that: [1] Transcript
   * files are expected to be in JSON format. [2] Transcript, audio, metadata files must be in
   * separate buckets / folders. [3] A source file and its corresponding metadata file must share
   * the same name to be properly ingested, E.g. `gs://bucket/audio/conversation1.mp3` and
   * `gs://bucket/metadata/conversation1.json`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String transcriptBucketUri;

  /**
   * Optional. The Cloud Storage path to the conversation audio file. Note that: [1] Audio files
   * will be transcribed if not already. [2] Audio files and transcript files must be in separate
   * buckets / folders. [3] A source file and its corresponding audio file must share the same name
   * to be properly ingested, E.g. `gs://bucket/transcript/conversation1.json` and
   * `gs://bucket/audio/conversation1.mp3`.
   * @return value or {@code null} for none
   */
  public java.lang.String getAudioBucketUri() {
    return audioBucketUri;
  }

  /**
   * Optional. The Cloud Storage path to the conversation audio file. Note that: [1] Audio files
   * will be transcribed if not already. [2] Audio files and transcript files must be in separate
   * buckets / folders. [3] A source file and its corresponding audio file must share the same name
   * to be properly ingested, E.g. `gs://bucket/transcript/conversation1.json` and
   * `gs://bucket/audio/conversation1.mp3`.
   * @param audioBucketUri audioBucketUri or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1IngestConversationsRequestGcsSource setAudioBucketUri(java.lang.String audioBucketUri) {
    this.audioBucketUri = audioBucketUri;
    return this;
  }

  /**
   * Optional. Specifies the type of the objects in `bucket_uri`. Avoid passing this. This is
   * inferred from the `transcript_bucket_uri`, `audio_bucket_uri`.
   * @return value or {@code null} for none
   */
  public java.lang.String getBucketObjectType() {
    return bucketObjectType;
  }

  /**
   * Optional. Specifies the type of the objects in `bucket_uri`. Avoid passing this. This is
   * inferred from the `transcript_bucket_uri`, `audio_bucket_uri`.
   * @param bucketObjectType bucketObjectType or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1IngestConversationsRequestGcsSource setBucketObjectType(java.lang.String bucketObjectType) {
    this.bucketObjectType = bucketObjectType;
    return this;
  }

  /**
   * Optional. The Cloud Storage bucket containing source objects. Avoid passing this. Pass this
   * through one of `transcript_bucket_uri` or `audio_bucket_uri`.
   * @return value or {@code null} for none
   */
  public java.lang.String getBucketUri() {
    return bucketUri;
  }

  /**
   * Optional. The Cloud Storage bucket containing source objects. Avoid passing this. Pass this
   * through one of `transcript_bucket_uri` or `audio_bucket_uri`.
   * @param bucketUri bucketUri or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1IngestConversationsRequestGcsSource setBucketUri(java.lang.String bucketUri) {
    this.bucketUri = bucketUri;
    return this;
  }

  /**
   * Optional. Custom keys to extract as conversation labels from metadata files in
   * `metadata_bucket_uri`. Keys not included in this field will be ignored. Note that there is a
   * limit of 100 labels per conversation.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getCustomMetadataKeys() {
    return customMetadataKeys;
  }

  /**
   * Optional. Custom keys to extract as conversation labels from metadata files in
   * `metadata_bucket_uri`. Keys not included in this field will be ignored. Note that there is a
   * limit of 100 labels per conversation.
   * @param customMetadataKeys customMetadataKeys or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1IngestConversationsRequestGcsSource setCustomMetadataKeys(java.util.List<java.lang.String> customMetadataKeys) {
    this.customMetadataKeys = customMetadataKeys;
    return this;
  }

  /**
   * Optional. The Cloud Storage path to the conversation metadata. Note that: [1] Metadata files
   * are expected to be in JSON format. [2] Metadata and source files (transcripts or audio) must be
   * in separate buckets / folders. [3] A source file and its corresponding metadata file must share
   * the same name to be properly ingested, E.g. `gs://bucket/audio/conversation1.mp3` and
   * `gs://bucket/metadata/conversation1.json`.
   * @return value or {@code null} for none
   */
  public java.lang.String getMetadataBucketUri() {
    return metadataBucketUri;
  }

  /**
   * Optional. The Cloud Storage path to the conversation metadata. Note that: [1] Metadata files
   * are expected to be in JSON format. [2] Metadata and source files (transcripts or audio) must be
   * in separate buckets / folders. [3] A source file and its corresponding metadata file must share
   * the same name to be properly ingested, E.g. `gs://bucket/audio/conversation1.mp3` and
   * `gs://bucket/metadata/conversation1.json`.
   * @param metadataBucketUri metadataBucketUri or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1IngestConversationsRequestGcsSource setMetadataBucketUri(java.lang.String metadataBucketUri) {
    this.metadataBucketUri = metadataBucketUri;
    return this;
  }

  /**
   * Optional. The Cloud Storage path to the conversation transcripts. Note that: [1] Transcript
   * files are expected to be in JSON format. [2] Transcript, audio, metadata files must be in
   * separate buckets / folders. [3] A source file and its corresponding metadata file must share
   * the same name to be properly ingested, E.g. `gs://bucket/audio/conversation1.mp3` and
   * `gs://bucket/metadata/conversation1.json`.
   * @return value or {@code null} for none
   */
  public java.lang.String getTranscriptBucketUri() {
    return transcriptBucketUri;
  }

  /**
   * Optional. The Cloud Storage path to the conversation transcripts. Note that: [1] Transcript
   * files are expected to be in JSON format. [2] Transcript, audio, metadata files must be in
   * separate buckets / folders. [3] A source file and its corresponding metadata file must share
   * the same name to be properly ingested, E.g. `gs://bucket/audio/conversation1.mp3` and
   * `gs://bucket/metadata/conversation1.json`.
   * @param transcriptBucketUri transcriptBucketUri or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1IngestConversationsRequestGcsSource setTranscriptBucketUri(java.lang.String transcriptBucketUri) {
    this.transcriptBucketUri = transcriptBucketUri;
    return this;
  }

  @Override
  public GoogleCloudContactcenterinsightsV1IngestConversationsRequestGcsSource set(String fieldName, Object value) {
    return (GoogleCloudContactcenterinsightsV1IngestConversationsRequestGcsSource) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudContactcenterinsightsV1IngestConversationsRequestGcsSource clone() {
    return (GoogleCloudContactcenterinsightsV1IngestConversationsRequestGcsSource) super.clone();
  }

}

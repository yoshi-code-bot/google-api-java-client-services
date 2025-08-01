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

package com.google.api.services.eventarc.v1.model;

/**
 * A representation of the Pipeline resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Eventarc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Pipeline extends com.google.api.client.json.GenericJson {

  /**
   * Optional. User-defined annotations. See https://google.aip.dev/128#annotations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> annotations;

  /**
   * Output only. The creation time. A timestamp in RFC3339 UTC "Zulu" format, with nanosecond
   * resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and
   * "2014-10-02T15:01:23.045123456Z".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. Resource name of a KMS crypto key (managed by the user) used to encrypt/decrypt the
   * event data. If not set, an internal Google-owned key will be used to encrypt messages. It must
   * match the pattern
   * "projects/{project}/locations/{location}/keyRings/{keyring}/cryptoKeys/{key}".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cryptoKeyName;

  /**
   * Required. List of destinations to which messages will be forwarded. Currently, exactly one
   * destination is supported per Pipeline.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudEventarcV1PipelineDestination> destinations;

  static {
    // hack to force ProGuard to consider GoogleCloudEventarcV1PipelineDestination used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudEventarcV1PipelineDestination.class);
  }

  /**
   * Optional. Display name of resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Output only. This checksum is computed by the server based on the value of other fields, and
   * might be sent only on create requests to ensure that the client has an up-to-date value before
   * proceeding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Optional. The payload format expected for the messages received by the Pipeline. If
   * input_payload_format is set then any messages not matching this format will be treated as
   * persistent errors. If input_payload_format is not set, then the message data will be treated as
   * an opaque binary and no output format can be set on the Pipeline through the
   * Pipeline.Destination.output_payload_format field. Any Mediations on the Pipeline that involve
   * access to the data field will fail as persistent errors.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudEventarcV1PipelineMessagePayloadFormat inputPayloadFormat;

  /**
   * Optional. User labels attached to the Pipeline that can be used to group resources. An object
   * containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count":
   * "3" }.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Optional. Config to control Platform Logging for Pipelines.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LoggingConfig loggingConfig;

  /**
   * Optional. List of mediation operations to be performed on the message. Currently, only one
   * Transformation operation is allowed in each Pipeline.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudEventarcV1PipelineMediation> mediations;

  static {
    // hack to force ProGuard to consider GoogleCloudEventarcV1PipelineMediation used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudEventarcV1PipelineMediation.class);
  }

  /**
   * Identifier. The resource name of the Pipeline. Must be unique within the location of the
   * project and must be in `projects/{project}/locations/{location}/pipelines/{pipeline}` format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. The retry policy to use in the pipeline.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudEventarcV1PipelineRetryPolicy retryPolicy;

  /**
   * Output only. Whether or not this Pipeline satisfies the requirements of physical zone
   * separation
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean satisfiesPzs;

  /**
   * Output only. Server-assigned unique identifier for the Pipeline. The value is a UUID4 string
   * and guaranteed to remain unchanged until the resource is deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uid;

  /**
   * Output only. The last-modified time. A timestamp in RFC3339 UTC "Zulu" format, with nanosecond
   * resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and
   * "2014-10-02T15:01:23.045123456Z".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Optional. User-defined annotations. See https://google.aip.dev/128#annotations.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getAnnotations() {
    return annotations;
  }

  /**
   * Optional. User-defined annotations. See https://google.aip.dev/128#annotations.
   * @param annotations annotations or {@code null} for none
   */
  public Pipeline setAnnotations(java.util.Map<String, java.lang.String> annotations) {
    this.annotations = annotations;
    return this;
  }

  /**
   * Output only. The creation time. A timestamp in RFC3339 UTC "Zulu" format, with nanosecond
   * resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and
   * "2014-10-02T15:01:23.045123456Z".
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The creation time. A timestamp in RFC3339 UTC "Zulu" format, with nanosecond
   * resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and
   * "2014-10-02T15:01:23.045123456Z".
   * @param createTime createTime or {@code null} for none
   */
  public Pipeline setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. Resource name of a KMS crypto key (managed by the user) used to encrypt/decrypt the
   * event data. If not set, an internal Google-owned key will be used to encrypt messages. It must
   * match the pattern
   * "projects/{project}/locations/{location}/keyRings/{keyring}/cryptoKeys/{key}".
   * @return value or {@code null} for none
   */
  public java.lang.String getCryptoKeyName() {
    return cryptoKeyName;
  }

  /**
   * Optional. Resource name of a KMS crypto key (managed by the user) used to encrypt/decrypt the
   * event data. If not set, an internal Google-owned key will be used to encrypt messages. It must
   * match the pattern
   * "projects/{project}/locations/{location}/keyRings/{keyring}/cryptoKeys/{key}".
   * @param cryptoKeyName cryptoKeyName or {@code null} for none
   */
  public Pipeline setCryptoKeyName(java.lang.String cryptoKeyName) {
    this.cryptoKeyName = cryptoKeyName;
    return this;
  }

  /**
   * Required. List of destinations to which messages will be forwarded. Currently, exactly one
   * destination is supported per Pipeline.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudEventarcV1PipelineDestination> getDestinations() {
    return destinations;
  }

  /**
   * Required. List of destinations to which messages will be forwarded. Currently, exactly one
   * destination is supported per Pipeline.
   * @param destinations destinations or {@code null} for none
   */
  public Pipeline setDestinations(java.util.List<GoogleCloudEventarcV1PipelineDestination> destinations) {
    this.destinations = destinations;
    return this;
  }

  /**
   * Optional. Display name of resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Optional. Display name of resource.
   * @param displayName displayName or {@code null} for none
   */
  public Pipeline setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Output only. This checksum is computed by the server based on the value of other fields, and
   * might be sent only on create requests to ensure that the client has an up-to-date value before
   * proceeding.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Output only. This checksum is computed by the server based on the value of other fields, and
   * might be sent only on create requests to ensure that the client has an up-to-date value before
   * proceeding.
   * @param etag etag or {@code null} for none
   */
  public Pipeline setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Optional. The payload format expected for the messages received by the Pipeline. If
   * input_payload_format is set then any messages not matching this format will be treated as
   * persistent errors. If input_payload_format is not set, then the message data will be treated as
   * an opaque binary and no output format can be set on the Pipeline through the
   * Pipeline.Destination.output_payload_format field. Any Mediations on the Pipeline that involve
   * access to the data field will fail as persistent errors.
   * @return value or {@code null} for none
   */
  public GoogleCloudEventarcV1PipelineMessagePayloadFormat getInputPayloadFormat() {
    return inputPayloadFormat;
  }

  /**
   * Optional. The payload format expected for the messages received by the Pipeline. If
   * input_payload_format is set then any messages not matching this format will be treated as
   * persistent errors. If input_payload_format is not set, then the message data will be treated as
   * an opaque binary and no output format can be set on the Pipeline through the
   * Pipeline.Destination.output_payload_format field. Any Mediations on the Pipeline that involve
   * access to the data field will fail as persistent errors.
   * @param inputPayloadFormat inputPayloadFormat or {@code null} for none
   */
  public Pipeline setInputPayloadFormat(GoogleCloudEventarcV1PipelineMessagePayloadFormat inputPayloadFormat) {
    this.inputPayloadFormat = inputPayloadFormat;
    return this;
  }

  /**
   * Optional. User labels attached to the Pipeline that can be used to group resources. An object
   * containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count":
   * "3" }.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. User labels attached to the Pipeline that can be used to group resources. An object
   * containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count":
   * "3" }.
   * @param labels labels or {@code null} for none
   */
  public Pipeline setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Optional. Config to control Platform Logging for Pipelines.
   * @return value or {@code null} for none
   */
  public LoggingConfig getLoggingConfig() {
    return loggingConfig;
  }

  /**
   * Optional. Config to control Platform Logging for Pipelines.
   * @param loggingConfig loggingConfig or {@code null} for none
   */
  public Pipeline setLoggingConfig(LoggingConfig loggingConfig) {
    this.loggingConfig = loggingConfig;
    return this;
  }

  /**
   * Optional. List of mediation operations to be performed on the message. Currently, only one
   * Transformation operation is allowed in each Pipeline.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudEventarcV1PipelineMediation> getMediations() {
    return mediations;
  }

  /**
   * Optional. List of mediation operations to be performed on the message. Currently, only one
   * Transformation operation is allowed in each Pipeline.
   * @param mediations mediations or {@code null} for none
   */
  public Pipeline setMediations(java.util.List<GoogleCloudEventarcV1PipelineMediation> mediations) {
    this.mediations = mediations;
    return this;
  }

  /**
   * Identifier. The resource name of the Pipeline. Must be unique within the location of the
   * project and must be in `projects/{project}/locations/{location}/pipelines/{pipeline}` format.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Identifier. The resource name of the Pipeline. Must be unique within the location of the
   * project and must be in `projects/{project}/locations/{location}/pipelines/{pipeline}` format.
   * @param name name or {@code null} for none
   */
  public Pipeline setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. The retry policy to use in the pipeline.
   * @return value or {@code null} for none
   */
  public GoogleCloudEventarcV1PipelineRetryPolicy getRetryPolicy() {
    return retryPolicy;
  }

  /**
   * Optional. The retry policy to use in the pipeline.
   * @param retryPolicy retryPolicy or {@code null} for none
   */
  public Pipeline setRetryPolicy(GoogleCloudEventarcV1PipelineRetryPolicy retryPolicy) {
    this.retryPolicy = retryPolicy;
    return this;
  }

  /**
   * Output only. Whether or not this Pipeline satisfies the requirements of physical zone
   * separation
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSatisfiesPzs() {
    return satisfiesPzs;
  }

  /**
   * Output only. Whether or not this Pipeline satisfies the requirements of physical zone
   * separation
   * @param satisfiesPzs satisfiesPzs or {@code null} for none
   */
  public Pipeline setSatisfiesPzs(java.lang.Boolean satisfiesPzs) {
    this.satisfiesPzs = satisfiesPzs;
    return this;
  }

  /**
   * Output only. Server-assigned unique identifier for the Pipeline. The value is a UUID4 string
   * and guaranteed to remain unchanged until the resource is deleted.
   * @return value or {@code null} for none
   */
  public java.lang.String getUid() {
    return uid;
  }

  /**
   * Output only. Server-assigned unique identifier for the Pipeline. The value is a UUID4 string
   * and guaranteed to remain unchanged until the resource is deleted.
   * @param uid uid or {@code null} for none
   */
  public Pipeline setUid(java.lang.String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * Output only. The last-modified time. A timestamp in RFC3339 UTC "Zulu" format, with nanosecond
   * resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and
   * "2014-10-02T15:01:23.045123456Z".
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The last-modified time. A timestamp in RFC3339 UTC "Zulu" format, with nanosecond
   * resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and
   * "2014-10-02T15:01:23.045123456Z".
   * @param updateTime updateTime or {@code null} for none
   */
  public Pipeline setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Pipeline set(String fieldName, Object value) {
    return (Pipeline) super.set(fieldName, value);
  }

  @Override
  public Pipeline clone() {
    return (Pipeline) super.clone();
  }

}

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

package com.google.api.services.run.v2.model;

/**
 * WorkerPool acts as a top-level container that manages a set of configurations and revision
 * templates which implement a pull-based workload. WorkerPool exists to provide a singular
 * abstraction which can be access controlled, reasoned about, and which encapsulates software
 * lifecycle decisions such as rollout policy and team resource ownership.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRunV2WorkerPool extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Unstructured key value map that may be set by external tools to store and arbitrary
   * metadata. They are not queryable and should be preserved when modifying objects. Cloud Run API
   * v2 does not support annotations with `run.googleapis.com`, `cloud.googleapis.com`,
   * `serving.knative.dev`, or `autoscaling.knative.dev` namespaces, and they will be rejected in
   * new resources. All system annotations in v1 now have a corresponding field in v2 WorkerPool.
   * This field follows Kubernetes annotations' namespacing, limits, and rules.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> annotations;

  /**
   * Optional. Settings for the Binary Authorization feature.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRunV2BinaryAuthorization binaryAuthorization;

  /**
   * Arbitrary identifier for the API client.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String client;

  /**
   * Arbitrary version identifier for the API client.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clientVersion;

  /**
   * Output only. The Conditions of all other associated sub-resources. They contain additional
   * diagnostics information in case the WorkerPool does not reach its Serving state. See comments
   * in `reconciling` for additional information on reconciliation process in Cloud Run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRunV2Condition> conditions;

  static {
    // hack to force ProGuard to consider GoogleCloudRunV2Condition used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudRunV2Condition.class);
  }

  /**
   * Output only. The creation time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. Email address of the authenticated creator.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creator;

  /**
   * One or more custom audiences that you want this worker pool to support. Specify each custom
   * audience as the full URL in a string. The custom audiences are encoded in the token and used to
   * authenticate requests. For more information, see
   * https://cloud.google.com/run/docs/configuring/custom-audiences.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> customAudiences;

  /**
   * Output only. The deletion time. It is only populated as a response to a Delete request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String deleteTime;

  /**
   * User-provided description of the WorkerPool. This field currently has a 512-character limit.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Optional. A system-generated fingerprint for this version of the resource. May be used to
   * detect modification conflict during updates.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Output only. For a deleted resource, the time after which it will be permamently deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String expireTime;

  /**
   * Output only. A number that monotonically increases every time the user modifies the desired
   * state. Please note that unlike v1, this is an int64 value. As with most Google APIs, its JSON
   * representation will be a `string` instead of an `integer`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long generation;

  /**
   * Output only. Detailed status information for corresponding instance splits. See comments in
   * `reconciling` for additional information on reconciliation process in Cloud Run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRunV2InstanceSplitStatus> instanceSplitStatuses;

  static {
    // hack to force ProGuard to consider GoogleCloudRunV2InstanceSplitStatus used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudRunV2InstanceSplitStatus.class);
  }

  /**
   * Optional. Specifies how to distribute instances over a collection of Revisions belonging to the
   * WorkerPool. If instance split is empty or not provided, defaults to 100% instances assigned to
   * the latest `Ready` Revision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRunV2InstanceSplit> instanceSplits;

  static {
    // hack to force ProGuard to consider GoogleCloudRunV2InstanceSplit used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudRunV2InstanceSplit.class);
  }

  /**
   * Optional. Unstructured key value map that can be used to organize and categorize objects. User-
   * provided labels are shared with Google's billing system, so they can be used to filter, or
   * break down billing charges by team, component, environment, state, etc. For more information,
   * visit https://cloud.google.com/resource-manager/docs/creating-managing-labels or
   * https://cloud.google.com/run/docs/configuring/labels. Cloud Run API v2 does not support labels
   * with `run.googleapis.com`, `cloud.googleapis.com`, `serving.knative.dev`, or
   * `autoscaling.knative.dev` namespaces, and they will be rejected. All system labels in v1 now
   * have a corresponding field in v2 WorkerPool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Output only. Email address of the last authenticated modifier.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lastModifier;

  /**
   * Output only. Name of the last created revision. See comments in `reconciling` for additional
   * information on reconciliation process in Cloud Run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String latestCreatedRevision;

  /**
   * Output only. Name of the latest revision that is serving traffic. See comments in `reconciling`
   * for additional information on reconciliation process in Cloud Run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String latestReadyRevision;

  /**
   * Optional. The launch stage as defined by [Google Cloud Platform Launch
   * Stages](https://cloud.google.com/terms/launch-stages). Cloud Run supports `ALPHA`, `BETA`, and
   * `GA`. If no value is specified, GA is assumed. Set the launch stage to a preview stage on input
   * to allow use of preview features in that stage. On read (or output), describes whether the
   * resource uses preview features. For example, if ALPHA is provided as input, but only BETA and
   * GA-level features are used, this field will be BETA on output.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String launchStage;

  /**
   * The fully qualified name of this WorkerPool. In CreateWorkerPoolRequest, this field is ignored,
   * and instead composed from CreateWorkerPoolRequest.parent and CreateWorkerPoolRequest.worker_id.
   * Format: `projects/{project}/locations/{location}/workerPools/{worker_id}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The generation of this WorkerPool currently serving traffic. See comments in
   * `reconciling` for additional information on reconciliation process in Cloud Run. Please note
   * that unlike v1, this is an int64 value. As with most Google APIs, its JSON representation will
   * be a `string` instead of an `integer`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long observedGeneration;

  /**
   * Output only. Returns true if the WorkerPool is currently being acted upon by the system to
   * bring it into the desired state. When a new WorkerPool is created, or an existing one is
   * updated, Cloud Run will asynchronously perform all necessary steps to bring the WorkerPool to
   * the desired serving state. This process is called reconciliation. While reconciliation is in
   * process, `observed_generation`, `latest_ready_revison`, `traffic_statuses`, and `uri` will have
   * transient values that might mismatch the intended state: Once reconciliation is over (and this
   * field is false), there are two possible outcomes: reconciliation succeeded and the serving
   * state matches the WorkerPool, or there was an error, and reconciliation failed. This state can
   * be found in `terminal_condition.state`. If reconciliation succeeded, the following fields will
   * match: `traffic` and `traffic_statuses`, `observed_generation` and `generation`,
   * `latest_ready_revision` and `latest_created_revision`. If reconciliation failed,
   * `traffic_statuses`, `observed_generation`, and `latest_ready_revision` will have the state of
   * the last serving revision, or empty for newly created WorkerPools. Additional information on
   * the failure can be found in `terminal_condition` and `conditions`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean reconciling;

  /**
   * Output only. Reserved for future use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean satisfiesPzs;

  /**
   * Optional. Specifies worker-pool-level scaling settings
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRunV2WorkerPoolScaling scaling;

  /**
   * Required. The template used to create revisions for this WorkerPool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRunV2WorkerPoolRevisionTemplate template;

  /**
   * Output only. The Condition of this WorkerPool, containing its readiness status, and detailed
   * error information in case it did not reach a serving state. See comments in `reconciling` for
   * additional information on reconciliation process in Cloud Run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRunV2Condition terminalCondition;

  /**
   * Output only. Server assigned unique identifier for the trigger. The value is a UUID4 string and
   * guaranteed to remain unchanged until the resource is deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uid;

  /**
   * Output only. The last-modified time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Optional. Unstructured key value map that may be set by external tools to store and arbitrary
   * metadata. They are not queryable and should be preserved when modifying objects. Cloud Run API
   * v2 does not support annotations with `run.googleapis.com`, `cloud.googleapis.com`,
   * `serving.knative.dev`, or `autoscaling.knative.dev` namespaces, and they will be rejected in
   * new resources. All system annotations in v1 now have a corresponding field in v2 WorkerPool.
   * This field follows Kubernetes annotations' namespacing, limits, and rules.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getAnnotations() {
    return annotations;
  }

  /**
   * Optional. Unstructured key value map that may be set by external tools to store and arbitrary
   * metadata. They are not queryable and should be preserved when modifying objects. Cloud Run API
   * v2 does not support annotations with `run.googleapis.com`, `cloud.googleapis.com`,
   * `serving.knative.dev`, or `autoscaling.knative.dev` namespaces, and they will be rejected in
   * new resources. All system annotations in v1 now have a corresponding field in v2 WorkerPool.
   * This field follows Kubernetes annotations' namespacing, limits, and rules.
   * @param annotations annotations or {@code null} for none
   */
  public GoogleCloudRunV2WorkerPool setAnnotations(java.util.Map<String, java.lang.String> annotations) {
    this.annotations = annotations;
    return this;
  }

  /**
   * Optional. Settings for the Binary Authorization feature.
   * @return value or {@code null} for none
   */
  public GoogleCloudRunV2BinaryAuthorization getBinaryAuthorization() {
    return binaryAuthorization;
  }

  /**
   * Optional. Settings for the Binary Authorization feature.
   * @param binaryAuthorization binaryAuthorization or {@code null} for none
   */
  public GoogleCloudRunV2WorkerPool setBinaryAuthorization(GoogleCloudRunV2BinaryAuthorization binaryAuthorization) {
    this.binaryAuthorization = binaryAuthorization;
    return this;
  }

  /**
   * Arbitrary identifier for the API client.
   * @return value or {@code null} for none
   */
  public java.lang.String getClient() {
    return client;
  }

  /**
   * Arbitrary identifier for the API client.
   * @param client client or {@code null} for none
   */
  public GoogleCloudRunV2WorkerPool setClient(java.lang.String client) {
    this.client = client;
    return this;
  }

  /**
   * Arbitrary version identifier for the API client.
   * @return value or {@code null} for none
   */
  public java.lang.String getClientVersion() {
    return clientVersion;
  }

  /**
   * Arbitrary version identifier for the API client.
   * @param clientVersion clientVersion or {@code null} for none
   */
  public GoogleCloudRunV2WorkerPool setClientVersion(java.lang.String clientVersion) {
    this.clientVersion = clientVersion;
    return this;
  }

  /**
   * Output only. The Conditions of all other associated sub-resources. They contain additional
   * diagnostics information in case the WorkerPool does not reach its Serving state. See comments
   * in `reconciling` for additional information on reconciliation process in Cloud Run.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRunV2Condition> getConditions() {
    return conditions;
  }

  /**
   * Output only. The Conditions of all other associated sub-resources. They contain additional
   * diagnostics information in case the WorkerPool does not reach its Serving state. See comments
   * in `reconciling` for additional information on reconciliation process in Cloud Run.
   * @param conditions conditions or {@code null} for none
   */
  public GoogleCloudRunV2WorkerPool setConditions(java.util.List<GoogleCloudRunV2Condition> conditions) {
    this.conditions = conditions;
    return this;
  }

  /**
   * Output only. The creation time.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The creation time.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudRunV2WorkerPool setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. Email address of the authenticated creator.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreator() {
    return creator;
  }

  /**
   * Output only. Email address of the authenticated creator.
   * @param creator creator or {@code null} for none
   */
  public GoogleCloudRunV2WorkerPool setCreator(java.lang.String creator) {
    this.creator = creator;
    return this;
  }

  /**
   * One or more custom audiences that you want this worker pool to support. Specify each custom
   * audience as the full URL in a string. The custom audiences are encoded in the token and used to
   * authenticate requests. For more information, see
   * https://cloud.google.com/run/docs/configuring/custom-audiences.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getCustomAudiences() {
    return customAudiences;
  }

  /**
   * One or more custom audiences that you want this worker pool to support. Specify each custom
   * audience as the full URL in a string. The custom audiences are encoded in the token and used to
   * authenticate requests. For more information, see
   * https://cloud.google.com/run/docs/configuring/custom-audiences.
   * @param customAudiences customAudiences or {@code null} for none
   */
  public GoogleCloudRunV2WorkerPool setCustomAudiences(java.util.List<java.lang.String> customAudiences) {
    this.customAudiences = customAudiences;
    return this;
  }

  /**
   * Output only. The deletion time. It is only populated as a response to a Delete request.
   * @return value or {@code null} for none
   */
  public String getDeleteTime() {
    return deleteTime;
  }

  /**
   * Output only. The deletion time. It is only populated as a response to a Delete request.
   * @param deleteTime deleteTime or {@code null} for none
   */
  public GoogleCloudRunV2WorkerPool setDeleteTime(String deleteTime) {
    this.deleteTime = deleteTime;
    return this;
  }

  /**
   * User-provided description of the WorkerPool. This field currently has a 512-character limit.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * User-provided description of the WorkerPool. This field currently has a 512-character limit.
   * @param description description or {@code null} for none
   */
  public GoogleCloudRunV2WorkerPool setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional. A system-generated fingerprint for this version of the resource. May be used to
   * detect modification conflict during updates.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Optional. A system-generated fingerprint for this version of the resource. May be used to
   * detect modification conflict during updates.
   * @param etag etag or {@code null} for none
   */
  public GoogleCloudRunV2WorkerPool setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Output only. For a deleted resource, the time after which it will be permamently deleted.
   * @return value or {@code null} for none
   */
  public String getExpireTime() {
    return expireTime;
  }

  /**
   * Output only. For a deleted resource, the time after which it will be permamently deleted.
   * @param expireTime expireTime or {@code null} for none
   */
  public GoogleCloudRunV2WorkerPool setExpireTime(String expireTime) {
    this.expireTime = expireTime;
    return this;
  }

  /**
   * Output only. A number that monotonically increases every time the user modifies the desired
   * state. Please note that unlike v1, this is an int64 value. As with most Google APIs, its JSON
   * representation will be a `string` instead of an `integer`.
   * @return value or {@code null} for none
   */
  public java.lang.Long getGeneration() {
    return generation;
  }

  /**
   * Output only. A number that monotonically increases every time the user modifies the desired
   * state. Please note that unlike v1, this is an int64 value. As with most Google APIs, its JSON
   * representation will be a `string` instead of an `integer`.
   * @param generation generation or {@code null} for none
   */
  public GoogleCloudRunV2WorkerPool setGeneration(java.lang.Long generation) {
    this.generation = generation;
    return this;
  }

  /**
   * Output only. Detailed status information for corresponding instance splits. See comments in
   * `reconciling` for additional information on reconciliation process in Cloud Run.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRunV2InstanceSplitStatus> getInstanceSplitStatuses() {
    return instanceSplitStatuses;
  }

  /**
   * Output only. Detailed status information for corresponding instance splits. See comments in
   * `reconciling` for additional information on reconciliation process in Cloud Run.
   * @param instanceSplitStatuses instanceSplitStatuses or {@code null} for none
   */
  public GoogleCloudRunV2WorkerPool setInstanceSplitStatuses(java.util.List<GoogleCloudRunV2InstanceSplitStatus> instanceSplitStatuses) {
    this.instanceSplitStatuses = instanceSplitStatuses;
    return this;
  }

  /**
   * Optional. Specifies how to distribute instances over a collection of Revisions belonging to the
   * WorkerPool. If instance split is empty or not provided, defaults to 100% instances assigned to
   * the latest `Ready` Revision.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRunV2InstanceSplit> getInstanceSplits() {
    return instanceSplits;
  }

  /**
   * Optional. Specifies how to distribute instances over a collection of Revisions belonging to the
   * WorkerPool. If instance split is empty or not provided, defaults to 100% instances assigned to
   * the latest `Ready` Revision.
   * @param instanceSplits instanceSplits or {@code null} for none
   */
  public GoogleCloudRunV2WorkerPool setInstanceSplits(java.util.List<GoogleCloudRunV2InstanceSplit> instanceSplits) {
    this.instanceSplits = instanceSplits;
    return this;
  }

  /**
   * Optional. Unstructured key value map that can be used to organize and categorize objects. User-
   * provided labels are shared with Google's billing system, so they can be used to filter, or
   * break down billing charges by team, component, environment, state, etc. For more information,
   * visit https://cloud.google.com/resource-manager/docs/creating-managing-labels or
   * https://cloud.google.com/run/docs/configuring/labels. Cloud Run API v2 does not support labels
   * with `run.googleapis.com`, `cloud.googleapis.com`, `serving.knative.dev`, or
   * `autoscaling.knative.dev` namespaces, and they will be rejected. All system labels in v1 now
   * have a corresponding field in v2 WorkerPool.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. Unstructured key value map that can be used to organize and categorize objects. User-
   * provided labels are shared with Google's billing system, so they can be used to filter, or
   * break down billing charges by team, component, environment, state, etc. For more information,
   * visit https://cloud.google.com/resource-manager/docs/creating-managing-labels or
   * https://cloud.google.com/run/docs/configuring/labels. Cloud Run API v2 does not support labels
   * with `run.googleapis.com`, `cloud.googleapis.com`, `serving.knative.dev`, or
   * `autoscaling.knative.dev` namespaces, and they will be rejected. All system labels in v1 now
   * have a corresponding field in v2 WorkerPool.
   * @param labels labels or {@code null} for none
   */
  public GoogleCloudRunV2WorkerPool setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Output only. Email address of the last authenticated modifier.
   * @return value or {@code null} for none
   */
  public java.lang.String getLastModifier() {
    return lastModifier;
  }

  /**
   * Output only. Email address of the last authenticated modifier.
   * @param lastModifier lastModifier or {@code null} for none
   */
  public GoogleCloudRunV2WorkerPool setLastModifier(java.lang.String lastModifier) {
    this.lastModifier = lastModifier;
    return this;
  }

  /**
   * Output only. Name of the last created revision. See comments in `reconciling` for additional
   * information on reconciliation process in Cloud Run.
   * @return value or {@code null} for none
   */
  public java.lang.String getLatestCreatedRevision() {
    return latestCreatedRevision;
  }

  /**
   * Output only. Name of the last created revision. See comments in `reconciling` for additional
   * information on reconciliation process in Cloud Run.
   * @param latestCreatedRevision latestCreatedRevision or {@code null} for none
   */
  public GoogleCloudRunV2WorkerPool setLatestCreatedRevision(java.lang.String latestCreatedRevision) {
    this.latestCreatedRevision = latestCreatedRevision;
    return this;
  }

  /**
   * Output only. Name of the latest revision that is serving traffic. See comments in `reconciling`
   * for additional information on reconciliation process in Cloud Run.
   * @return value or {@code null} for none
   */
  public java.lang.String getLatestReadyRevision() {
    return latestReadyRevision;
  }

  /**
   * Output only. Name of the latest revision that is serving traffic. See comments in `reconciling`
   * for additional information on reconciliation process in Cloud Run.
   * @param latestReadyRevision latestReadyRevision or {@code null} for none
   */
  public GoogleCloudRunV2WorkerPool setLatestReadyRevision(java.lang.String latestReadyRevision) {
    this.latestReadyRevision = latestReadyRevision;
    return this;
  }

  /**
   * Optional. The launch stage as defined by [Google Cloud Platform Launch
   * Stages](https://cloud.google.com/terms/launch-stages). Cloud Run supports `ALPHA`, `BETA`, and
   * `GA`. If no value is specified, GA is assumed. Set the launch stage to a preview stage on input
   * to allow use of preview features in that stage. On read (or output), describes whether the
   * resource uses preview features. For example, if ALPHA is provided as input, but only BETA and
   * GA-level features are used, this field will be BETA on output.
   * @return value or {@code null} for none
   */
  public java.lang.String getLaunchStage() {
    return launchStage;
  }

  /**
   * Optional. The launch stage as defined by [Google Cloud Platform Launch
   * Stages](https://cloud.google.com/terms/launch-stages). Cloud Run supports `ALPHA`, `BETA`, and
   * `GA`. If no value is specified, GA is assumed. Set the launch stage to a preview stage on input
   * to allow use of preview features in that stage. On read (or output), describes whether the
   * resource uses preview features. For example, if ALPHA is provided as input, but only BETA and
   * GA-level features are used, this field will be BETA on output.
   * @param launchStage launchStage or {@code null} for none
   */
  public GoogleCloudRunV2WorkerPool setLaunchStage(java.lang.String launchStage) {
    this.launchStage = launchStage;
    return this;
  }

  /**
   * The fully qualified name of this WorkerPool. In CreateWorkerPoolRequest, this field is ignored,
   * and instead composed from CreateWorkerPoolRequest.parent and CreateWorkerPoolRequest.worker_id.
   * Format: `projects/{project}/locations/{location}/workerPools/{worker_id}`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The fully qualified name of this WorkerPool. In CreateWorkerPoolRequest, this field is ignored,
   * and instead composed from CreateWorkerPoolRequest.parent and CreateWorkerPoolRequest.worker_id.
   * Format: `projects/{project}/locations/{location}/workerPools/{worker_id}`
   * @param name name or {@code null} for none
   */
  public GoogleCloudRunV2WorkerPool setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The generation of this WorkerPool currently serving traffic. See comments in
   * `reconciling` for additional information on reconciliation process in Cloud Run. Please note
   * that unlike v1, this is an int64 value. As with most Google APIs, its JSON representation will
   * be a `string` instead of an `integer`.
   * @return value or {@code null} for none
   */
  public java.lang.Long getObservedGeneration() {
    return observedGeneration;
  }

  /**
   * Output only. The generation of this WorkerPool currently serving traffic. See comments in
   * `reconciling` for additional information on reconciliation process in Cloud Run. Please note
   * that unlike v1, this is an int64 value. As with most Google APIs, its JSON representation will
   * be a `string` instead of an `integer`.
   * @param observedGeneration observedGeneration or {@code null} for none
   */
  public GoogleCloudRunV2WorkerPool setObservedGeneration(java.lang.Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

  /**
   * Output only. Returns true if the WorkerPool is currently being acted upon by the system to
   * bring it into the desired state. When a new WorkerPool is created, or an existing one is
   * updated, Cloud Run will asynchronously perform all necessary steps to bring the WorkerPool to
   * the desired serving state. This process is called reconciliation. While reconciliation is in
   * process, `observed_generation`, `latest_ready_revison`, `traffic_statuses`, and `uri` will have
   * transient values that might mismatch the intended state: Once reconciliation is over (and this
   * field is false), there are two possible outcomes: reconciliation succeeded and the serving
   * state matches the WorkerPool, or there was an error, and reconciliation failed. This state can
   * be found in `terminal_condition.state`. If reconciliation succeeded, the following fields will
   * match: `traffic` and `traffic_statuses`, `observed_generation` and `generation`,
   * `latest_ready_revision` and `latest_created_revision`. If reconciliation failed,
   * `traffic_statuses`, `observed_generation`, and `latest_ready_revision` will have the state of
   * the last serving revision, or empty for newly created WorkerPools. Additional information on
   * the failure can be found in `terminal_condition` and `conditions`.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getReconciling() {
    return reconciling;
  }

  /**
   * Output only. Returns true if the WorkerPool is currently being acted upon by the system to
   * bring it into the desired state. When a new WorkerPool is created, or an existing one is
   * updated, Cloud Run will asynchronously perform all necessary steps to bring the WorkerPool to
   * the desired serving state. This process is called reconciliation. While reconciliation is in
   * process, `observed_generation`, `latest_ready_revison`, `traffic_statuses`, and `uri` will have
   * transient values that might mismatch the intended state: Once reconciliation is over (and this
   * field is false), there are two possible outcomes: reconciliation succeeded and the serving
   * state matches the WorkerPool, or there was an error, and reconciliation failed. This state can
   * be found in `terminal_condition.state`. If reconciliation succeeded, the following fields will
   * match: `traffic` and `traffic_statuses`, `observed_generation` and `generation`,
   * `latest_ready_revision` and `latest_created_revision`. If reconciliation failed,
   * `traffic_statuses`, `observed_generation`, and `latest_ready_revision` will have the state of
   * the last serving revision, or empty for newly created WorkerPools. Additional information on
   * the failure can be found in `terminal_condition` and `conditions`.
   * @param reconciling reconciling or {@code null} for none
   */
  public GoogleCloudRunV2WorkerPool setReconciling(java.lang.Boolean reconciling) {
    this.reconciling = reconciling;
    return this;
  }

  /**
   * Output only. Reserved for future use.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSatisfiesPzs() {
    return satisfiesPzs;
  }

  /**
   * Output only. Reserved for future use.
   * @param satisfiesPzs satisfiesPzs or {@code null} for none
   */
  public GoogleCloudRunV2WorkerPool setSatisfiesPzs(java.lang.Boolean satisfiesPzs) {
    this.satisfiesPzs = satisfiesPzs;
    return this;
  }

  /**
   * Optional. Specifies worker-pool-level scaling settings
   * @return value or {@code null} for none
   */
  public GoogleCloudRunV2WorkerPoolScaling getScaling() {
    return scaling;
  }

  /**
   * Optional. Specifies worker-pool-level scaling settings
   * @param scaling scaling or {@code null} for none
   */
  public GoogleCloudRunV2WorkerPool setScaling(GoogleCloudRunV2WorkerPoolScaling scaling) {
    this.scaling = scaling;
    return this;
  }

  /**
   * Required. The template used to create revisions for this WorkerPool.
   * @return value or {@code null} for none
   */
  public GoogleCloudRunV2WorkerPoolRevisionTemplate getTemplate() {
    return template;
  }

  /**
   * Required. The template used to create revisions for this WorkerPool.
   * @param template template or {@code null} for none
   */
  public GoogleCloudRunV2WorkerPool setTemplate(GoogleCloudRunV2WorkerPoolRevisionTemplate template) {
    this.template = template;
    return this;
  }

  /**
   * Output only. The Condition of this WorkerPool, containing its readiness status, and detailed
   * error information in case it did not reach a serving state. See comments in `reconciling` for
   * additional information on reconciliation process in Cloud Run.
   * @return value or {@code null} for none
   */
  public GoogleCloudRunV2Condition getTerminalCondition() {
    return terminalCondition;
  }

  /**
   * Output only. The Condition of this WorkerPool, containing its readiness status, and detailed
   * error information in case it did not reach a serving state. See comments in `reconciling` for
   * additional information on reconciliation process in Cloud Run.
   * @param terminalCondition terminalCondition or {@code null} for none
   */
  public GoogleCloudRunV2WorkerPool setTerminalCondition(GoogleCloudRunV2Condition terminalCondition) {
    this.terminalCondition = terminalCondition;
    return this;
  }

  /**
   * Output only. Server assigned unique identifier for the trigger. The value is a UUID4 string and
   * guaranteed to remain unchanged until the resource is deleted.
   * @return value or {@code null} for none
   */
  public java.lang.String getUid() {
    return uid;
  }

  /**
   * Output only. Server assigned unique identifier for the trigger. The value is a UUID4 string and
   * guaranteed to remain unchanged until the resource is deleted.
   * @param uid uid or {@code null} for none
   */
  public GoogleCloudRunV2WorkerPool setUid(java.lang.String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * Output only. The last-modified time.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The last-modified time.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleCloudRunV2WorkerPool setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GoogleCloudRunV2WorkerPool set(String fieldName, Object value) {
    return (GoogleCloudRunV2WorkerPool) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRunV2WorkerPool clone() {
    return (GoogleCloudRunV2WorkerPool) super.clone();
  }

}

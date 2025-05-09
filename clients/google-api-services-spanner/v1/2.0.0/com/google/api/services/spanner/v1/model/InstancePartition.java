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

package com.google.api.services.spanner.v1.model;

/**
 * An isolated set of Cloud Spanner resources that databases can define placements on.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Spanner API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InstancePartition extends com.google.api.client.json.GenericJson {

  /**
   * Required. The name of the instance partition's configuration. Values are of the form
   * `projects//instanceConfigs/`. See also InstanceConfig and ListInstanceConfigs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String config;

  /**
   * Output only. The time at which the instance partition was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Required. The descriptive name for this instance partition as it appears in UIs. Must be unique
   * per project and between 4 and 30 characters in length.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Used for optimistic concurrency control as a way to help prevent simultaneous updates of a
   * instance partition from overwriting each other. It is strongly suggested that systems make use
   * of the etag in the read-modify-write cycle to perform instance partition updates in order to
   * avoid race conditions: An etag is returned in the response which contains instance partitions,
   * and systems are expected to put that etag in the request to update instance partitions to
   * ensure that their change will be applied to the same version of the instance partition. If no
   * etag is provided in the call to update instance partition, then the existing instance partition
   * is overwritten blindly.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Required. A unique identifier for the instance partition. Values are of the form
   * `projects//instances//instancePartitions/a-z*[a-z0-9]`. The final segment of the name must be
   * between 2 and 64 characters in length. An instance partition's name cannot be changed after the
   * instance partition is created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The number of nodes allocated to this instance partition. Users can set the `node_count` field
   * to specify the target number of nodes allocated to the instance partition. This may be zero in
   * API responses for instance partitions that are not yet in state `READY`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer nodeCount;

  /**
   * The number of processing units allocated to this instance partition. Users can set the
   * `processing_units` field to specify the target number of processing units allocated to the
   * instance partition. This might be zero in API responses for instance partitions that are not
   * yet in the `READY` state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer processingUnits;

  /**
   * Output only. Deprecated: This field is not populated. Output only. The names of the backups
   * that reference this instance partition. Referencing backups should share the parent instance.
   * The existence of any referencing backup prevents the instance partition from being deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> referencingBackups;

  /**
   * Output only. The names of the databases that reference this instance partition. Referencing
   * databases should share the parent instance. The existence of any referencing database prevents
   * the instance partition from being deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> referencingDatabases;

  /**
   * Output only. The current instance partition state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. The time at which the instance partition was most recently updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Required. The name of the instance partition's configuration. Values are of the form
   * `projects//instanceConfigs/`. See also InstanceConfig and ListInstanceConfigs.
   * @return value or {@code null} for none
   */
  public java.lang.String getConfig() {
    return config;
  }

  /**
   * Required. The name of the instance partition's configuration. Values are of the form
   * `projects//instanceConfigs/`. See also InstanceConfig and ListInstanceConfigs.
   * @param config config or {@code null} for none
   */
  public InstancePartition setConfig(java.lang.String config) {
    this.config = config;
    return this;
  }

  /**
   * Output only. The time at which the instance partition was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time at which the instance partition was created.
   * @param createTime createTime or {@code null} for none
   */
  public InstancePartition setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Required. The descriptive name for this instance partition as it appears in UIs. Must be unique
   * per project and between 4 and 30 characters in length.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. The descriptive name for this instance partition as it appears in UIs. Must be unique
   * per project and between 4 and 30 characters in length.
   * @param displayName displayName or {@code null} for none
   */
  public InstancePartition setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Used for optimistic concurrency control as a way to help prevent simultaneous updates of a
   * instance partition from overwriting each other. It is strongly suggested that systems make use
   * of the etag in the read-modify-write cycle to perform instance partition updates in order to
   * avoid race conditions: An etag is returned in the response which contains instance partitions,
   * and systems are expected to put that etag in the request to update instance partitions to
   * ensure that their change will be applied to the same version of the instance partition. If no
   * etag is provided in the call to update instance partition, then the existing instance partition
   * is overwritten blindly.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Used for optimistic concurrency control as a way to help prevent simultaneous updates of a
   * instance partition from overwriting each other. It is strongly suggested that systems make use
   * of the etag in the read-modify-write cycle to perform instance partition updates in order to
   * avoid race conditions: An etag is returned in the response which contains instance partitions,
   * and systems are expected to put that etag in the request to update instance partitions to
   * ensure that their change will be applied to the same version of the instance partition. If no
   * etag is provided in the call to update instance partition, then the existing instance partition
   * is overwritten blindly.
   * @param etag etag or {@code null} for none
   */
  public InstancePartition setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Required. A unique identifier for the instance partition. Values are of the form
   * `projects//instances//instancePartitions/a-z*[a-z0-9]`. The final segment of the name must be
   * between 2 and 64 characters in length. An instance partition's name cannot be changed after the
   * instance partition is created.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. A unique identifier for the instance partition. Values are of the form
   * `projects//instances//instancePartitions/a-z*[a-z0-9]`. The final segment of the name must be
   * between 2 and 64 characters in length. An instance partition's name cannot be changed after the
   * instance partition is created.
   * @param name name or {@code null} for none
   */
  public InstancePartition setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The number of nodes allocated to this instance partition. Users can set the `node_count` field
   * to specify the target number of nodes allocated to the instance partition. This may be zero in
   * API responses for instance partitions that are not yet in state `READY`.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNodeCount() {
    return nodeCount;
  }

  /**
   * The number of nodes allocated to this instance partition. Users can set the `node_count` field
   * to specify the target number of nodes allocated to the instance partition. This may be zero in
   * API responses for instance partitions that are not yet in state `READY`.
   * @param nodeCount nodeCount or {@code null} for none
   */
  public InstancePartition setNodeCount(java.lang.Integer nodeCount) {
    this.nodeCount = nodeCount;
    return this;
  }

  /**
   * The number of processing units allocated to this instance partition. Users can set the
   * `processing_units` field to specify the target number of processing units allocated to the
   * instance partition. This might be zero in API responses for instance partitions that are not
   * yet in the `READY` state.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getProcessingUnits() {
    return processingUnits;
  }

  /**
   * The number of processing units allocated to this instance partition. Users can set the
   * `processing_units` field to specify the target number of processing units allocated to the
   * instance partition. This might be zero in API responses for instance partitions that are not
   * yet in the `READY` state.
   * @param processingUnits processingUnits or {@code null} for none
   */
  public InstancePartition setProcessingUnits(java.lang.Integer processingUnits) {
    this.processingUnits = processingUnits;
    return this;
  }

  /**
   * Output only. Deprecated: This field is not populated. Output only. The names of the backups
   * that reference this instance partition. Referencing backups should share the parent instance.
   * The existence of any referencing backup prevents the instance partition from being deleted.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getReferencingBackups() {
    return referencingBackups;
  }

  /**
   * Output only. Deprecated: This field is not populated. Output only. The names of the backups
   * that reference this instance partition. Referencing backups should share the parent instance.
   * The existence of any referencing backup prevents the instance partition from being deleted.
   * @param referencingBackups referencingBackups or {@code null} for none
   */
  public InstancePartition setReferencingBackups(java.util.List<java.lang.String> referencingBackups) {
    this.referencingBackups = referencingBackups;
    return this;
  }

  /**
   * Output only. The names of the databases that reference this instance partition. Referencing
   * databases should share the parent instance. The existence of any referencing database prevents
   * the instance partition from being deleted.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getReferencingDatabases() {
    return referencingDatabases;
  }

  /**
   * Output only. The names of the databases that reference this instance partition. Referencing
   * databases should share the parent instance. The existence of any referencing database prevents
   * the instance partition from being deleted.
   * @param referencingDatabases referencingDatabases or {@code null} for none
   */
  public InstancePartition setReferencingDatabases(java.util.List<java.lang.String> referencingDatabases) {
    this.referencingDatabases = referencingDatabases;
    return this;
  }

  /**
   * Output only. The current instance partition state.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The current instance partition state.
   * @param state state or {@code null} for none
   */
  public InstancePartition setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. The time at which the instance partition was most recently updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The time at which the instance partition was most recently updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public InstancePartition setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public InstancePartition set(String fieldName, Object value) {
    return (InstancePartition) super.set(fieldName, value);
  }

  @Override
  public InstancePartition clone() {
    return (InstancePartition) super.clone();
  }

}

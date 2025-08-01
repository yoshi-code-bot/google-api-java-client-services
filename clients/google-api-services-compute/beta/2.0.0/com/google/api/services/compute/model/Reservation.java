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

package com.google.api.services.compute.model;

/**
 * Represents a reservation resource. A reservation ensures that capacity is held in a specific zone
 * even if the reserved VMs are not running. For more information, read Reserving zonal resources.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Reservation extends com.google.api.client.json.GenericJson {

  /**
   * Reservation for aggregated resources, providing shape flexibility.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AllocationAggregateReservation aggregateReservation;

  /**
   * [Output Only] Full or partial URL to a parent commitment. This field displays for reservations
   * that are tied to a commitment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String commitment;

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * Duration time relative to reservation creation when Compute Engine will automatically delete
   * this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Duration deleteAfterDuration;

  /**
   * Absolute time in future when the reservation will be auto-deleted by Compute Engine. Timestamp
   * is represented in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deleteAtTime;

  /**
   * Specifies the deployment strategy for this reservation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deploymentType;

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Indicates whether Compute Engine allows unplanned maintenance for your VMs; for example, to fix
   * hardware errors.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableEmergentMaintenance;

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * [Output Only] Type of the resource. Always compute#reservations for reservations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * [Output Only] Full or partial URL to parent commitments. This field displays for reservations
   * that are tied to multiple commitments.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> linkedCommitments;

  /**
   * The name of the resource, provided by the client when initially creating the resource. The
   * resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name
   * must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`
   * which means the first character must be a lowercase letter, and all following characters must
   * be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Protection tier for the workload which specifies the workload expectations in the event of
   * infrastructure failures at data center (e.g. power and/or cooling failures).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String protectionTier;

  /**
   * [Output only] Indicates the reservation mode of the reservation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reservationMode;

  /**
   * Specify the reservation sharing policy. If unspecified, the reservation will not be shared with
   * Google Cloud managed services.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AllocationReservationSharingPolicy reservationSharingPolicy;

  /**
   * Resource policies to be added to this reservation. The key is defined by user, and the value is
   * resource policy url. This is to define placement policy with reservation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> resourcePolicies;

  /**
   * [Output Only] Status information for Reservation resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AllocationResourceStatus resourceStatus;

  /**
   * [Output Only] Reserved for future use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean satisfiesPzs;

  /**
   * The type of maintenance for the reservation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String schedulingType;

  /**
   * [Output Only] Server-defined fully-qualified URL for this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * Specify share-settings to create a shared reservation. This property is optional. For more
   * information about the syntax and options for this field and its subfields, see the guide for
   * creating a shared reservation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ShareSettings shareSettings;

  /**
   * Reservation for instances with specific machine shapes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AllocationSpecificSKUReservation specificReservation;

  /**
   * Indicates whether the reservation can be consumed by VMs with affinity for "any" reservation.
   * If the field is set, then only VMs that target the reservation by name can consume from this
   * reservation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean specificReservationRequired;

  /**
   * [Output Only] The status of the reservation. - CREATING: Reservation resources are being
   * allocated. - READY: Reservation resources have been allocated, and the reservation is ready for
   * use. - DELETING: Reservation deletion is in progress. - UPDATING: Reservation update is in
   * progress.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * Zone in which the reservation resides. A zone must be provided if the reservation is created
   * within a commitment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * Reservation for aggregated resources, providing shape flexibility.
   * @return value or {@code null} for none
   */
  public AllocationAggregateReservation getAggregateReservation() {
    return aggregateReservation;
  }

  /**
   * Reservation for aggregated resources, providing shape flexibility.
   * @param aggregateReservation aggregateReservation or {@code null} for none
   */
  public Reservation setAggregateReservation(AllocationAggregateReservation aggregateReservation) {
    this.aggregateReservation = aggregateReservation;
    return this;
  }

  /**
   * [Output Only] Full or partial URL to a parent commitment. This field displays for reservations
   * that are tied to a commitment.
   * @return value or {@code null} for none
   */
  public java.lang.String getCommitment() {
    return commitment;
  }

  /**
   * [Output Only] Full or partial URL to a parent commitment. This field displays for reservations
   * that are tied to a commitment.
   * @param commitment commitment or {@code null} for none
   */
  public Reservation setCommitment(java.lang.String commitment) {
    this.commitment = commitment;
    return this;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public Reservation setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * Duration time relative to reservation creation when Compute Engine will automatically delete
   * this resource.
   * @return value or {@code null} for none
   */
  public Duration getDeleteAfterDuration() {
    return deleteAfterDuration;
  }

  /**
   * Duration time relative to reservation creation when Compute Engine will automatically delete
   * this resource.
   * @param deleteAfterDuration deleteAfterDuration or {@code null} for none
   */
  public Reservation setDeleteAfterDuration(Duration deleteAfterDuration) {
    this.deleteAfterDuration = deleteAfterDuration;
    return this;
  }

  /**
   * Absolute time in future when the reservation will be auto-deleted by Compute Engine. Timestamp
   * is represented in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeleteAtTime() {
    return deleteAtTime;
  }

  /**
   * Absolute time in future when the reservation will be auto-deleted by Compute Engine. Timestamp
   * is represented in RFC3339 text format.
   * @param deleteAtTime deleteAtTime or {@code null} for none
   */
  public Reservation setDeleteAtTime(java.lang.String deleteAtTime) {
    this.deleteAtTime = deleteAtTime;
    return this;
  }

  /**
   * Specifies the deployment strategy for this reservation.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeploymentType() {
    return deploymentType;
  }

  /**
   * Specifies the deployment strategy for this reservation.
   * @param deploymentType deploymentType or {@code null} for none
   */
  public Reservation setDeploymentType(java.lang.String deploymentType) {
    this.deploymentType = deploymentType;
    return this;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @param description description or {@code null} for none
   */
  public Reservation setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Indicates whether Compute Engine allows unplanned maintenance for your VMs; for example, to fix
   * hardware errors.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableEmergentMaintenance() {
    return enableEmergentMaintenance;
  }

  /**
   * Indicates whether Compute Engine allows unplanned maintenance for your VMs; for example, to fix
   * hardware errors.
   * @param enableEmergentMaintenance enableEmergentMaintenance or {@code null} for none
   */
  public Reservation setEnableEmergentMaintenance(java.lang.Boolean enableEmergentMaintenance) {
    this.enableEmergentMaintenance = enableEmergentMaintenance;
    return this;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @param id id or {@code null} for none
   */
  public Reservation setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * [Output Only] Type of the resource. Always compute#reservations for reservations.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource. Always compute#reservations for reservations.
   * @param kind kind or {@code null} for none
   */
  public Reservation setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * [Output Only] Full or partial URL to parent commitments. This field displays for reservations
   * that are tied to multiple commitments.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getLinkedCommitments() {
    return linkedCommitments;
  }

  /**
   * [Output Only] Full or partial URL to parent commitments. This field displays for reservations
   * that are tied to multiple commitments.
   * @param linkedCommitments linkedCommitments or {@code null} for none
   */
  public Reservation setLinkedCommitments(java.util.List<java.lang.String> linkedCommitments) {
    this.linkedCommitments = linkedCommitments;
    return this;
  }

  /**
   * The name of the resource, provided by the client when initially creating the resource. The
   * resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name
   * must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`
   * which means the first character must be a lowercase letter, and all following characters must
   * be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the resource, provided by the client when initially creating the resource. The
   * resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name
   * must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`
   * which means the first character must be a lowercase letter, and all following characters must
   * be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * @param name name or {@code null} for none
   */
  public Reservation setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Protection tier for the workload which specifies the workload expectations in the event of
   * infrastructure failures at data center (e.g. power and/or cooling failures).
   * @return value or {@code null} for none
   */
  public java.lang.String getProtectionTier() {
    return protectionTier;
  }

  /**
   * Protection tier for the workload which specifies the workload expectations in the event of
   * infrastructure failures at data center (e.g. power and/or cooling failures).
   * @param protectionTier protectionTier or {@code null} for none
   */
  public Reservation setProtectionTier(java.lang.String protectionTier) {
    this.protectionTier = protectionTier;
    return this;
  }

  /**
   * [Output only] Indicates the reservation mode of the reservation.
   * @return value or {@code null} for none
   */
  public java.lang.String getReservationMode() {
    return reservationMode;
  }

  /**
   * [Output only] Indicates the reservation mode of the reservation.
   * @param reservationMode reservationMode or {@code null} for none
   */
  public Reservation setReservationMode(java.lang.String reservationMode) {
    this.reservationMode = reservationMode;
    return this;
  }

  /**
   * Specify the reservation sharing policy. If unspecified, the reservation will not be shared with
   * Google Cloud managed services.
   * @return value or {@code null} for none
   */
  public AllocationReservationSharingPolicy getReservationSharingPolicy() {
    return reservationSharingPolicy;
  }

  /**
   * Specify the reservation sharing policy. If unspecified, the reservation will not be shared with
   * Google Cloud managed services.
   * @param reservationSharingPolicy reservationSharingPolicy or {@code null} for none
   */
  public Reservation setReservationSharingPolicy(AllocationReservationSharingPolicy reservationSharingPolicy) {
    this.reservationSharingPolicy = reservationSharingPolicy;
    return this;
  }

  /**
   * Resource policies to be added to this reservation. The key is defined by user, and the value is
   * resource policy url. This is to define placement policy with reservation.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getResourcePolicies() {
    return resourcePolicies;
  }

  /**
   * Resource policies to be added to this reservation. The key is defined by user, and the value is
   * resource policy url. This is to define placement policy with reservation.
   * @param resourcePolicies resourcePolicies or {@code null} for none
   */
  public Reservation setResourcePolicies(java.util.Map<String, java.lang.String> resourcePolicies) {
    this.resourcePolicies = resourcePolicies;
    return this;
  }

  /**
   * [Output Only] Status information for Reservation resource.
   * @return value or {@code null} for none
   */
  public AllocationResourceStatus getResourceStatus() {
    return resourceStatus;
  }

  /**
   * [Output Only] Status information for Reservation resource.
   * @param resourceStatus resourceStatus or {@code null} for none
   */
  public Reservation setResourceStatus(AllocationResourceStatus resourceStatus) {
    this.resourceStatus = resourceStatus;
    return this;
  }

  /**
   * [Output Only] Reserved for future use.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSatisfiesPzs() {
    return satisfiesPzs;
  }

  /**
   * [Output Only] Reserved for future use.
   * @param satisfiesPzs satisfiesPzs or {@code null} for none
   */
  public Reservation setSatisfiesPzs(java.lang.Boolean satisfiesPzs) {
    this.satisfiesPzs = satisfiesPzs;
    return this;
  }

  /**
   * The type of maintenance for the reservation.
   * @return value or {@code null} for none
   */
  public java.lang.String getSchedulingType() {
    return schedulingType;
  }

  /**
   * The type of maintenance for the reservation.
   * @param schedulingType schedulingType or {@code null} for none
   */
  public Reservation setSchedulingType(java.lang.String schedulingType) {
    this.schedulingType = schedulingType;
    return this;
  }

  /**
   * [Output Only] Server-defined fully-qualified URL for this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined fully-qualified URL for this resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public Reservation setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * Specify share-settings to create a shared reservation. This property is optional. For more
   * information about the syntax and options for this field and its subfields, see the guide for
   * creating a shared reservation.
   * @return value or {@code null} for none
   */
  public ShareSettings getShareSettings() {
    return shareSettings;
  }

  /**
   * Specify share-settings to create a shared reservation. This property is optional. For more
   * information about the syntax and options for this field and its subfields, see the guide for
   * creating a shared reservation.
   * @param shareSettings shareSettings or {@code null} for none
   */
  public Reservation setShareSettings(ShareSettings shareSettings) {
    this.shareSettings = shareSettings;
    return this;
  }

  /**
   * Reservation for instances with specific machine shapes.
   * @return value or {@code null} for none
   */
  public AllocationSpecificSKUReservation getSpecificReservation() {
    return specificReservation;
  }

  /**
   * Reservation for instances with specific machine shapes.
   * @param specificReservation specificReservation or {@code null} for none
   */
  public Reservation setSpecificReservation(AllocationSpecificSKUReservation specificReservation) {
    this.specificReservation = specificReservation;
    return this;
  }

  /**
   * Indicates whether the reservation can be consumed by VMs with affinity for "any" reservation.
   * If the field is set, then only VMs that target the reservation by name can consume from this
   * reservation.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSpecificReservationRequired() {
    return specificReservationRequired;
  }

  /**
   * Indicates whether the reservation can be consumed by VMs with affinity for "any" reservation.
   * If the field is set, then only VMs that target the reservation by name can consume from this
   * reservation.
   * @param specificReservationRequired specificReservationRequired or {@code null} for none
   */
  public Reservation setSpecificReservationRequired(java.lang.Boolean specificReservationRequired) {
    this.specificReservationRequired = specificReservationRequired;
    return this;
  }

  /**
   * [Output Only] The status of the reservation. - CREATING: Reservation resources are being
   * allocated. - READY: Reservation resources have been allocated, and the reservation is ready for
   * use. - DELETING: Reservation deletion is in progress. - UPDATING: Reservation update is in
   * progress.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * [Output Only] The status of the reservation. - CREATING: Reservation resources are being
   * allocated. - READY: Reservation resources have been allocated, and the reservation is ready for
   * use. - DELETING: Reservation deletion is in progress. - UPDATING: Reservation update is in
   * progress.
   * @param status status or {@code null} for none
   */
  public Reservation setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * Zone in which the reservation resides. A zone must be provided if the reservation is created
   * within a commitment.
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * Zone in which the reservation resides. A zone must be provided if the reservation is created
   * within a commitment.
   * @param zone zone or {@code null} for none
   */
  public Reservation setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public Reservation set(String fieldName, Object value) {
    return (Reservation) super.set(fieldName, value);
  }

  @Override
  public Reservation clone() {
    return (Reservation) super.clone();
  }

}

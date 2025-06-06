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

package com.google.api.services.saasservicemgmt.v1beta1.model;

/**
 * Tenant represents the service producer side of an instance of the service created based on a
 * request from a consumer. In a typical scenario a Tenant has a one-to-one mapping with a resource
 * given out to a service consumer. Example: tenant: name:
 * "projects/svc1/locations/loc/tenants/inst-068afff8" consumer_resource:
 * "projects/gshoe/locations/loc/shoes/black-shoe"
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the SaaS Runtime API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Tenant extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Annotations is an unstructured key-value map stored with a resource that may be set
   * by external tools to store and retrieve arbitrary metadata. They are not queryable and should
   * be preserved when modifying objects. More info: https://kubernetes.io/docs/user-
   * guide/annotations
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> annotations;

  /**
   * Optional. Immutable. A reference to the consumer resource this SaaS Tenant is representing. The
   * relationship with a consumer resource can be used by EasySaaS for retrieving consumer-defined
   * settings and policies such as maintenance policies (using Unified Maintenance Policy API).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String consumerResource;

  /**
   * Output only. The timestamp when the resource was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. An opaque value that uniquely identifies a version or generation of a resource. It
   * can be used to confirm that the client and server agree on the ordering of a resource being
   * written.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Optional. The labels on the resource, which can be used for categorization. similar to
   * Kubernetes resource labels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Identifier. The resource name (full URI of the resource) following the standard naming scheme:
   * "projects/{project}/locations/{location}/tenants/{tenant}"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. Immutable. A reference to the Saas that defines the product (managed service) that
   * the producer wants to manage with EasySaaS. Part of the EasySaaS common data model.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String saas;

  /**
   * Output only. The unique identifier of the resource. UID is unique in the time and space for
   * this resource within the scope of the service. It is typically generated by the server on
   * successful creation of a resource and must not be changed. UID is used to uniquely identify
   * resources with resource name reuses. This should be a UUID4.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uid;

  /**
   * Output only. The timestamp when the resource was last updated. Any change to the resource made
   * by users must refresh this value. Changes to a resource made by the service should refresh this
   * value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Optional. Annotations is an unstructured key-value map stored with a resource that may be set
   * by external tools to store and retrieve arbitrary metadata. They are not queryable and should
   * be preserved when modifying objects. More info: https://kubernetes.io/docs/user-
   * guide/annotations
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getAnnotations() {
    return annotations;
  }

  /**
   * Optional. Annotations is an unstructured key-value map stored with a resource that may be set
   * by external tools to store and retrieve arbitrary metadata. They are not queryable and should
   * be preserved when modifying objects. More info: https://kubernetes.io/docs/user-
   * guide/annotations
   * @param annotations annotations or {@code null} for none
   */
  public Tenant setAnnotations(java.util.Map<String, java.lang.String> annotations) {
    this.annotations = annotations;
    return this;
  }

  /**
   * Optional. Immutable. A reference to the consumer resource this SaaS Tenant is representing. The
   * relationship with a consumer resource can be used by EasySaaS for retrieving consumer-defined
   * settings and policies such as maintenance policies (using Unified Maintenance Policy API).
   * @return value or {@code null} for none
   */
  public java.lang.String getConsumerResource() {
    return consumerResource;
  }

  /**
   * Optional. Immutable. A reference to the consumer resource this SaaS Tenant is representing. The
   * relationship with a consumer resource can be used by EasySaaS for retrieving consumer-defined
   * settings and policies such as maintenance policies (using Unified Maintenance Policy API).
   * @param consumerResource consumerResource or {@code null} for none
   */
  public Tenant setConsumerResource(java.lang.String consumerResource) {
    this.consumerResource = consumerResource;
    return this;
  }

  /**
   * Output only. The timestamp when the resource was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The timestamp when the resource was created.
   * @param createTime createTime or {@code null} for none
   */
  public Tenant setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. An opaque value that uniquely identifies a version or generation of a resource. It
   * can be used to confirm that the client and server agree on the ordering of a resource being
   * written.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Output only. An opaque value that uniquely identifies a version or generation of a resource. It
   * can be used to confirm that the client and server agree on the ordering of a resource being
   * written.
   * @param etag etag or {@code null} for none
   */
  public Tenant setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Optional. The labels on the resource, which can be used for categorization. similar to
   * Kubernetes resource labels.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. The labels on the resource, which can be used for categorization. similar to
   * Kubernetes resource labels.
   * @param labels labels or {@code null} for none
   */
  public Tenant setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Identifier. The resource name (full URI of the resource) following the standard naming scheme:
   * "projects/{project}/locations/{location}/tenants/{tenant}"
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Identifier. The resource name (full URI of the resource) following the standard naming scheme:
   * "projects/{project}/locations/{location}/tenants/{tenant}"
   * @param name name or {@code null} for none
   */
  public Tenant setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. Immutable. A reference to the Saas that defines the product (managed service) that
   * the producer wants to manage with EasySaaS. Part of the EasySaaS common data model.
   * @return value or {@code null} for none
   */
  public java.lang.String getSaas() {
    return saas;
  }

  /**
   * Required. Immutable. A reference to the Saas that defines the product (managed service) that
   * the producer wants to manage with EasySaaS. Part of the EasySaaS common data model.
   * @param saas saas or {@code null} for none
   */
  public Tenant setSaas(java.lang.String saas) {
    this.saas = saas;
    return this;
  }

  /**
   * Output only. The unique identifier of the resource. UID is unique in the time and space for
   * this resource within the scope of the service. It is typically generated by the server on
   * successful creation of a resource and must not be changed. UID is used to uniquely identify
   * resources with resource name reuses. This should be a UUID4.
   * @return value or {@code null} for none
   */
  public java.lang.String getUid() {
    return uid;
  }

  /**
   * Output only. The unique identifier of the resource. UID is unique in the time and space for
   * this resource within the scope of the service. It is typically generated by the server on
   * successful creation of a resource and must not be changed. UID is used to uniquely identify
   * resources with resource name reuses. This should be a UUID4.
   * @param uid uid or {@code null} for none
   */
  public Tenant setUid(java.lang.String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * Output only. The timestamp when the resource was last updated. Any change to the resource made
   * by users must refresh this value. Changes to a resource made by the service should refresh this
   * value.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The timestamp when the resource was last updated. Any change to the resource made
   * by users must refresh this value. Changes to a resource made by the service should refresh this
   * value.
   * @param updateTime updateTime or {@code null} for none
   */
  public Tenant setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Tenant set(String fieldName, Object value) {
    return (Tenant) super.set(fieldName, value);
  }

  @Override
  public Tenant clone() {
    return (Tenant) super.clone();
  }

}

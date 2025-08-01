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

package com.google.api.services.networksecurity.v1.model;

/**
 * ClientTlsPolicy is a resource that specifies how a client should authenticate connections to
 * backends of a service. This resource itself does not affect configuration unless it is attached
 * to a backend service resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Security API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ClientTlsPolicy extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Defines a mechanism to provision client identity (public and private keys) for peer
   * to peer authentication. The presence of this dictates mTLS.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudNetworksecurityV1CertificateProvider clientCertificate;

  /**
   * Output only. The timestamp when the resource was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. Free-text description of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Optional. Set of label tags associated with the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Required. Name of the ClientTlsPolicy resource. It matches the pattern
   * `projects/{project}/locations/{location}/clientTlsPolicies/{client_tls_policy}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. Defines the mechanism to obtain the Certificate Authority certificate to validate the
   * server certificate. If empty, client does not validate the server certificate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ValidationCA> serverValidationCa;

  /**
   * Optional. Server Name Indication string to present to the server during TLS handshake. E.g:
   * "secure.example.com".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sni;

  /**
   * Output only. The timestamp when the resource was updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Optional. Defines a mechanism to provision client identity (public and private keys) for peer
   * to peer authentication. The presence of this dictates mTLS.
   * @return value or {@code null} for none
   */
  public GoogleCloudNetworksecurityV1CertificateProvider getClientCertificate() {
    return clientCertificate;
  }

  /**
   * Optional. Defines a mechanism to provision client identity (public and private keys) for peer
   * to peer authentication. The presence of this dictates mTLS.
   * @param clientCertificate clientCertificate or {@code null} for none
   */
  public ClientTlsPolicy setClientCertificate(GoogleCloudNetworksecurityV1CertificateProvider clientCertificate) {
    this.clientCertificate = clientCertificate;
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
  public ClientTlsPolicy setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. Free-text description of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. Free-text description of the resource.
   * @param description description or {@code null} for none
   */
  public ClientTlsPolicy setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional. Set of label tags associated with the resource.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. Set of label tags associated with the resource.
   * @param labels labels or {@code null} for none
   */
  public ClientTlsPolicy setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Required. Name of the ClientTlsPolicy resource. It matches the pattern
   * `projects/{project}/locations/{location}/clientTlsPolicies/{client_tls_policy}`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. Name of the ClientTlsPolicy resource. It matches the pattern
   * `projects/{project}/locations/{location}/clientTlsPolicies/{client_tls_policy}`
   * @param name name or {@code null} for none
   */
  public ClientTlsPolicy setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. Defines the mechanism to obtain the Certificate Authority certificate to validate the
   * server certificate. If empty, client does not validate the server certificate.
   * @return value or {@code null} for none
   */
  public java.util.List<ValidationCA> getServerValidationCa() {
    return serverValidationCa;
  }

  /**
   * Optional. Defines the mechanism to obtain the Certificate Authority certificate to validate the
   * server certificate. If empty, client does not validate the server certificate.
   * @param serverValidationCa serverValidationCa or {@code null} for none
   */
  public ClientTlsPolicy setServerValidationCa(java.util.List<ValidationCA> serverValidationCa) {
    this.serverValidationCa = serverValidationCa;
    return this;
  }

  /**
   * Optional. Server Name Indication string to present to the server during TLS handshake. E.g:
   * "secure.example.com".
   * @return value or {@code null} for none
   */
  public java.lang.String getSni() {
    return sni;
  }

  /**
   * Optional. Server Name Indication string to present to the server during TLS handshake. E.g:
   * "secure.example.com".
   * @param sni sni or {@code null} for none
   */
  public ClientTlsPolicy setSni(java.lang.String sni) {
    this.sni = sni;
    return this;
  }

  /**
   * Output only. The timestamp when the resource was updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The timestamp when the resource was updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public ClientTlsPolicy setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public ClientTlsPolicy set(String fieldName, Object value) {
    return (ClientTlsPolicy) super.set(fieldName, value);
  }

  @Override
  public ClientTlsPolicy clone() {
    return (ClientTlsPolicy) super.clone();
  }

}

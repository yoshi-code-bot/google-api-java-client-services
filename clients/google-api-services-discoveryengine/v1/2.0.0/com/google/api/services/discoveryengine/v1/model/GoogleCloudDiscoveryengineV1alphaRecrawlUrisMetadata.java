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

package com.google.api.services.discoveryengine.v1.model;

/**
 * Metadata related to the progress of the SiteSearchEngineService.RecrawlUris operation. This will
 * be returned by the google.longrunning.Operation.metadata field.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1alphaRecrawlUrisMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Operation create time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Unique URIs in the request that have invalid format. Sample limited to 1000.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> invalidUris;

  /**
   * Total number of unique URIs in the request that have invalid format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer invalidUrisCount;

  /**
   * URIs that have no index meta tag. Sample limited to 1000.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> noindexUris;

  /**
   * Total number of URIs that have no index meta tag.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer noindexUrisCount;

  /**
   * Total number of URIs that have yet to be crawled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer pendingCount;

  /**
   * Total number of URIs that were rejected due to insufficient indexing resources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer quotaExceededCount;

  /**
   * Total number of URIs that have been crawled so far.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer successCount;

  /**
   * Operation last update time. If the operation is done, this is also the finish time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Unique URIs in the request that don't match any TargetSite in the DataStore, only match
   * TargetSites that haven't been fully indexed, or match a TargetSite with type EXCLUDE. Sample
   * limited to 1000.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> urisNotMatchingTargetSites;

  /**
   * Total number of URIs that don't match any TargetSites.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer urisNotMatchingTargetSitesCount;

  /**
   * Total number of unique URIs in the request that are not in invalid_uris.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer validUrisCount;

  /**
   * Operation create time.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Operation create time.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaRecrawlUrisMetadata setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Unique URIs in the request that have invalid format. Sample limited to 1000.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getInvalidUris() {
    return invalidUris;
  }

  /**
   * Unique URIs in the request that have invalid format. Sample limited to 1000.
   * @param invalidUris invalidUris or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaRecrawlUrisMetadata setInvalidUris(java.util.List<java.lang.String> invalidUris) {
    this.invalidUris = invalidUris;
    return this;
  }

  /**
   * Total number of unique URIs in the request that have invalid format.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getInvalidUrisCount() {
    return invalidUrisCount;
  }

  /**
   * Total number of unique URIs in the request that have invalid format.
   * @param invalidUrisCount invalidUrisCount or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaRecrawlUrisMetadata setInvalidUrisCount(java.lang.Integer invalidUrisCount) {
    this.invalidUrisCount = invalidUrisCount;
    return this;
  }

  /**
   * URIs that have no index meta tag. Sample limited to 1000.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getNoindexUris() {
    return noindexUris;
  }

  /**
   * URIs that have no index meta tag. Sample limited to 1000.
   * @param noindexUris noindexUris or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaRecrawlUrisMetadata setNoindexUris(java.util.List<java.lang.String> noindexUris) {
    this.noindexUris = noindexUris;
    return this;
  }

  /**
   * Total number of URIs that have no index meta tag.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNoindexUrisCount() {
    return noindexUrisCount;
  }

  /**
   * Total number of URIs that have no index meta tag.
   * @param noindexUrisCount noindexUrisCount or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaRecrawlUrisMetadata setNoindexUrisCount(java.lang.Integer noindexUrisCount) {
    this.noindexUrisCount = noindexUrisCount;
    return this;
  }

  /**
   * Total number of URIs that have yet to be crawled.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPendingCount() {
    return pendingCount;
  }

  /**
   * Total number of URIs that have yet to be crawled.
   * @param pendingCount pendingCount or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaRecrawlUrisMetadata setPendingCount(java.lang.Integer pendingCount) {
    this.pendingCount = pendingCount;
    return this;
  }

  /**
   * Total number of URIs that were rejected due to insufficient indexing resources.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getQuotaExceededCount() {
    return quotaExceededCount;
  }

  /**
   * Total number of URIs that were rejected due to insufficient indexing resources.
   * @param quotaExceededCount quotaExceededCount or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaRecrawlUrisMetadata setQuotaExceededCount(java.lang.Integer quotaExceededCount) {
    this.quotaExceededCount = quotaExceededCount;
    return this;
  }

  /**
   * Total number of URIs that have been crawled so far.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSuccessCount() {
    return successCount;
  }

  /**
   * Total number of URIs that have been crawled so far.
   * @param successCount successCount or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaRecrawlUrisMetadata setSuccessCount(java.lang.Integer successCount) {
    this.successCount = successCount;
    return this;
  }

  /**
   * Operation last update time. If the operation is done, this is also the finish time.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Operation last update time. If the operation is done, this is also the finish time.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaRecrawlUrisMetadata setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Unique URIs in the request that don't match any TargetSite in the DataStore, only match
   * TargetSites that haven't been fully indexed, or match a TargetSite with type EXCLUDE. Sample
   * limited to 1000.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getUrisNotMatchingTargetSites() {
    return urisNotMatchingTargetSites;
  }

  /**
   * Unique URIs in the request that don't match any TargetSite in the DataStore, only match
   * TargetSites that haven't been fully indexed, or match a TargetSite with type EXCLUDE. Sample
   * limited to 1000.
   * @param urisNotMatchingTargetSites urisNotMatchingTargetSites or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaRecrawlUrisMetadata setUrisNotMatchingTargetSites(java.util.List<java.lang.String> urisNotMatchingTargetSites) {
    this.urisNotMatchingTargetSites = urisNotMatchingTargetSites;
    return this;
  }

  /**
   * Total number of URIs that don't match any TargetSites.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getUrisNotMatchingTargetSitesCount() {
    return urisNotMatchingTargetSitesCount;
  }

  /**
   * Total number of URIs that don't match any TargetSites.
   * @param urisNotMatchingTargetSitesCount urisNotMatchingTargetSitesCount or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaRecrawlUrisMetadata setUrisNotMatchingTargetSitesCount(java.lang.Integer urisNotMatchingTargetSitesCount) {
    this.urisNotMatchingTargetSitesCount = urisNotMatchingTargetSitesCount;
    return this;
  }

  /**
   * Total number of unique URIs in the request that are not in invalid_uris.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getValidUrisCount() {
    return validUrisCount;
  }

  /**
   * Total number of unique URIs in the request that are not in invalid_uris.
   * @param validUrisCount validUrisCount or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaRecrawlUrisMetadata setValidUrisCount(java.lang.Integer validUrisCount) {
    this.validUrisCount = validUrisCount;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaRecrawlUrisMetadata set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1alphaRecrawlUrisMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaRecrawlUrisMetadata clone() {
    return (GoogleCloudDiscoveryengineV1alphaRecrawlUrisMetadata) super.clone();
  }

}

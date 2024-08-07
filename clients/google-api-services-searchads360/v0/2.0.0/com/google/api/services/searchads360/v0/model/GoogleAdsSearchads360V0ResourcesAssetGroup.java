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

package com.google.api.services.searchads360.v0.model;

/**
 * An asset group. AssetGroupAsset is used to link an asset to the asset group. AssetGroupSignal is
 * used to associate a signal to an asset group.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Search Ads 360 Reporting API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAdsSearchads360V0ResourcesAssetGroup extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Overall ad strength of this asset group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String adStrength;

  /**
   * Immutable. The campaign with which this asset group is associated. The asset which is linked to
   * the asset group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String campaign;

  /**
   * A list of final mobile URLs after all cross domain redirects. In performance max, by default,
   * the urls are eligible for expansion unless opted out.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> finalMobileUrls;

  /**
   * A list of final URLs after all cross domain redirects. In performance max, by default, the urls
   * are eligible for expansion unless opted out.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> finalUrls;

  /**
   * Output only. The ID of the asset group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * Required. Name of the asset group. Required. It must have a minimum length of 1 and maximum
   * length of 128. It must be unique under a campaign.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * First part of text that may appear appended to the url displayed in the ad.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String path1;

  /**
   * Second part of text that may appear appended to the url displayed in the ad. This field can
   * only be set when path1 is set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String path2;

  /**
   * Immutable. The resource name of the asset group. Asset group resource names have the form:
   * `customers/{customer_id}/assetGroups/{asset_group_id}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceName;

  /**
   * The status of the asset group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * Output only. Overall ad strength of this asset group.
   * @return value or {@code null} for none
   */
  public java.lang.String getAdStrength() {
    return adStrength;
  }

  /**
   * Output only. Overall ad strength of this asset group.
   * @param adStrength adStrength or {@code null} for none
   */
  public GoogleAdsSearchads360V0ResourcesAssetGroup setAdStrength(java.lang.String adStrength) {
    this.adStrength = adStrength;
    return this;
  }

  /**
   * Immutable. The campaign with which this asset group is associated. The asset which is linked to
   * the asset group.
   * @return value or {@code null} for none
   */
  public java.lang.String getCampaign() {
    return campaign;
  }

  /**
   * Immutable. The campaign with which this asset group is associated. The asset which is linked to
   * the asset group.
   * @param campaign campaign or {@code null} for none
   */
  public GoogleAdsSearchads360V0ResourcesAssetGroup setCampaign(java.lang.String campaign) {
    this.campaign = campaign;
    return this;
  }

  /**
   * A list of final mobile URLs after all cross domain redirects. In performance max, by default,
   * the urls are eligible for expansion unless opted out.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getFinalMobileUrls() {
    return finalMobileUrls;
  }

  /**
   * A list of final mobile URLs after all cross domain redirects. In performance max, by default,
   * the urls are eligible for expansion unless opted out.
   * @param finalMobileUrls finalMobileUrls or {@code null} for none
   */
  public GoogleAdsSearchads360V0ResourcesAssetGroup setFinalMobileUrls(java.util.List<java.lang.String> finalMobileUrls) {
    this.finalMobileUrls = finalMobileUrls;
    return this;
  }

  /**
   * A list of final URLs after all cross domain redirects. In performance max, by default, the urls
   * are eligible for expansion unless opted out.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getFinalUrls() {
    return finalUrls;
  }

  /**
   * A list of final URLs after all cross domain redirects. In performance max, by default, the urls
   * are eligible for expansion unless opted out.
   * @param finalUrls finalUrls or {@code null} for none
   */
  public GoogleAdsSearchads360V0ResourcesAssetGroup setFinalUrls(java.util.List<java.lang.String> finalUrls) {
    this.finalUrls = finalUrls;
    return this;
  }

  /**
   * Output only. The ID of the asset group.
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * Output only. The ID of the asset group.
   * @param id id or {@code null} for none
   */
  public GoogleAdsSearchads360V0ResourcesAssetGroup setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * Required. Name of the asset group. Required. It must have a minimum length of 1 and maximum
   * length of 128. It must be unique under a campaign.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. Name of the asset group. Required. It must have a minimum length of 1 and maximum
   * length of 128. It must be unique under a campaign.
   * @param name name or {@code null} for none
   */
  public GoogleAdsSearchads360V0ResourcesAssetGroup setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * First part of text that may appear appended to the url displayed in the ad.
   * @return value or {@code null} for none
   */
  public java.lang.String getPath1() {
    return path1;
  }

  /**
   * First part of text that may appear appended to the url displayed in the ad.
   * @param path1 path1 or {@code null} for none
   */
  public GoogleAdsSearchads360V0ResourcesAssetGroup setPath1(java.lang.String path1) {
    this.path1 = path1;
    return this;
  }

  /**
   * Second part of text that may appear appended to the url displayed in the ad. This field can
   * only be set when path1 is set.
   * @return value or {@code null} for none
   */
  public java.lang.String getPath2() {
    return path2;
  }

  /**
   * Second part of text that may appear appended to the url displayed in the ad. This field can
   * only be set when path1 is set.
   * @param path2 path2 or {@code null} for none
   */
  public GoogleAdsSearchads360V0ResourcesAssetGroup setPath2(java.lang.String path2) {
    this.path2 = path2;
    return this;
  }

  /**
   * Immutable. The resource name of the asset group. Asset group resource names have the form:
   * `customers/{customer_id}/assetGroups/{asset_group_id}`
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceName() {
    return resourceName;
  }

  /**
   * Immutable. The resource name of the asset group. Asset group resource names have the form:
   * `customers/{customer_id}/assetGroups/{asset_group_id}`
   * @param resourceName resourceName or {@code null} for none
   */
  public GoogleAdsSearchads360V0ResourcesAssetGroup setResourceName(java.lang.String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * The status of the asset group.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * The status of the asset group.
   * @param status status or {@code null} for none
   */
  public GoogleAdsSearchads360V0ResourcesAssetGroup setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  @Override
  public GoogleAdsSearchads360V0ResourcesAssetGroup set(String fieldName, Object value) {
    return (GoogleAdsSearchads360V0ResourcesAssetGroup) super.set(fieldName, value);
  }

  @Override
  public GoogleAdsSearchads360V0ResourcesAssetGroup clone() {
    return (GoogleAdsSearchads360V0ResourcesAssetGroup) super.clone();
  }

}

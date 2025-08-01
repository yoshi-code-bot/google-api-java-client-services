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

package com.google.api.services.displayvideo.v3.model;

/**
 * Settings for YouTube and Partners line items.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Display & Video 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class YoutubeAndPartnersSettings extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The kind of content on which the YouTube and Partners ads will be shown.
   * *Warning*: This field will be removed in the near future. Use effective_content_category
   * instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentCategory;

  /**
   * Output only. The content category which takes effect when serving the line item. When content
   * category is set in both line item and advertiser, the stricter one will take effect when
   * serving the line item. New line items will only inherit the advertiser level setting.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String effectiveContentCategory;

  /**
   * Settings that control what YouTube and Partners inventories the line item will target.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private YoutubeAndPartnersInventorySourceConfig inventorySourceSettings;

  /**
   * Optional. The ID of the form to generate leads.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long leadFormId;

  /**
   * Optional. The ID of the merchant which is linked to the line item for product feed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long linkedMerchantId;

  /**
   * Optional. The IDs of the videos appear below the primary video ad when the ad is playing in the
   * YouTube app on mobile devices.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> relatedVideoIds;

  /**
   * Optional. The average number of times you want ads from this line item to show to the same
   * person over a certain period of time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TargetFrequency targetFrequency;

  /**
   * Optional. The third-party measurement configs of the line item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ThirdPartyMeasurementConfigs thirdPartyMeasurementConfigs;

  /**
   * Optional. The settings to control which inventory is allowed for this line item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VideoAdInventoryControl videoAdInventoryControl;

  /**
   * Optional. The settings related to VideoAdSequence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VideoAdSequenceSettings videoAdSequenceSettings;

  /**
   * The view frequency cap settings of the line item. The max_views field in this settings object
   * must be used if assigning a limited cap.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FrequencyCap viewFrequencyCap;

  /**
   * Output only. The kind of content on which the YouTube and Partners ads will be shown.
   * *Warning*: This field will be removed in the near future. Use effective_content_category
   * instead.
   * @return value or {@code null} for none
   */
  public java.lang.String getContentCategory() {
    return contentCategory;
  }

  /**
   * Output only. The kind of content on which the YouTube and Partners ads will be shown.
   * *Warning*: This field will be removed in the near future. Use effective_content_category
   * instead.
   * @param contentCategory contentCategory or {@code null} for none
   */
  public YoutubeAndPartnersSettings setContentCategory(java.lang.String contentCategory) {
    this.contentCategory = contentCategory;
    return this;
  }

  /**
   * Output only. The content category which takes effect when serving the line item. When content
   * category is set in both line item and advertiser, the stricter one will take effect when
   * serving the line item. New line items will only inherit the advertiser level setting.
   * @return value or {@code null} for none
   */
  public java.lang.String getEffectiveContentCategory() {
    return effectiveContentCategory;
  }

  /**
   * Output only. The content category which takes effect when serving the line item. When content
   * category is set in both line item and advertiser, the stricter one will take effect when
   * serving the line item. New line items will only inherit the advertiser level setting.
   * @param effectiveContentCategory effectiveContentCategory or {@code null} for none
   */
  public YoutubeAndPartnersSettings setEffectiveContentCategory(java.lang.String effectiveContentCategory) {
    this.effectiveContentCategory = effectiveContentCategory;
    return this;
  }

  /**
   * Settings that control what YouTube and Partners inventories the line item will target.
   * @return value or {@code null} for none
   */
  public YoutubeAndPartnersInventorySourceConfig getInventorySourceSettings() {
    return inventorySourceSettings;
  }

  /**
   * Settings that control what YouTube and Partners inventories the line item will target.
   * @param inventorySourceSettings inventorySourceSettings or {@code null} for none
   */
  public YoutubeAndPartnersSettings setInventorySourceSettings(YoutubeAndPartnersInventorySourceConfig inventorySourceSettings) {
    this.inventorySourceSettings = inventorySourceSettings;
    return this;
  }

  /**
   * Optional. The ID of the form to generate leads.
   * @return value or {@code null} for none
   */
  public java.lang.Long getLeadFormId() {
    return leadFormId;
  }

  /**
   * Optional. The ID of the form to generate leads.
   * @param leadFormId leadFormId or {@code null} for none
   */
  public YoutubeAndPartnersSettings setLeadFormId(java.lang.Long leadFormId) {
    this.leadFormId = leadFormId;
    return this;
  }

  /**
   * Optional. The ID of the merchant which is linked to the line item for product feed.
   * @return value or {@code null} for none
   */
  public java.lang.Long getLinkedMerchantId() {
    return linkedMerchantId;
  }

  /**
   * Optional. The ID of the merchant which is linked to the line item for product feed.
   * @param linkedMerchantId linkedMerchantId or {@code null} for none
   */
  public YoutubeAndPartnersSettings setLinkedMerchantId(java.lang.Long linkedMerchantId) {
    this.linkedMerchantId = linkedMerchantId;
    return this;
  }

  /**
   * Optional. The IDs of the videos appear below the primary video ad when the ad is playing in the
   * YouTube app on mobile devices.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRelatedVideoIds() {
    return relatedVideoIds;
  }

  /**
   * Optional. The IDs of the videos appear below the primary video ad when the ad is playing in the
   * YouTube app on mobile devices.
   * @param relatedVideoIds relatedVideoIds or {@code null} for none
   */
  public YoutubeAndPartnersSettings setRelatedVideoIds(java.util.List<java.lang.String> relatedVideoIds) {
    this.relatedVideoIds = relatedVideoIds;
    return this;
  }

  /**
   * Optional. The average number of times you want ads from this line item to show to the same
   * person over a certain period of time.
   * @return value or {@code null} for none
   */
  public TargetFrequency getTargetFrequency() {
    return targetFrequency;
  }

  /**
   * Optional. The average number of times you want ads from this line item to show to the same
   * person over a certain period of time.
   * @param targetFrequency targetFrequency or {@code null} for none
   */
  public YoutubeAndPartnersSettings setTargetFrequency(TargetFrequency targetFrequency) {
    this.targetFrequency = targetFrequency;
    return this;
  }

  /**
   * Optional. The third-party measurement configs of the line item.
   * @return value or {@code null} for none
   */
  public ThirdPartyMeasurementConfigs getThirdPartyMeasurementConfigs() {
    return thirdPartyMeasurementConfigs;
  }

  /**
   * Optional. The third-party measurement configs of the line item.
   * @param thirdPartyMeasurementConfigs thirdPartyMeasurementConfigs or {@code null} for none
   */
  public YoutubeAndPartnersSettings setThirdPartyMeasurementConfigs(ThirdPartyMeasurementConfigs thirdPartyMeasurementConfigs) {
    this.thirdPartyMeasurementConfigs = thirdPartyMeasurementConfigs;
    return this;
  }

  /**
   * Optional. The settings to control which inventory is allowed for this line item.
   * @return value or {@code null} for none
   */
  public VideoAdInventoryControl getVideoAdInventoryControl() {
    return videoAdInventoryControl;
  }

  /**
   * Optional. The settings to control which inventory is allowed for this line item.
   * @param videoAdInventoryControl videoAdInventoryControl or {@code null} for none
   */
  public YoutubeAndPartnersSettings setVideoAdInventoryControl(VideoAdInventoryControl videoAdInventoryControl) {
    this.videoAdInventoryControl = videoAdInventoryControl;
    return this;
  }

  /**
   * Optional. The settings related to VideoAdSequence.
   * @return value or {@code null} for none
   */
  public VideoAdSequenceSettings getVideoAdSequenceSettings() {
    return videoAdSequenceSettings;
  }

  /**
   * Optional. The settings related to VideoAdSequence.
   * @param videoAdSequenceSettings videoAdSequenceSettings or {@code null} for none
   */
  public YoutubeAndPartnersSettings setVideoAdSequenceSettings(VideoAdSequenceSettings videoAdSequenceSettings) {
    this.videoAdSequenceSettings = videoAdSequenceSettings;
    return this;
  }

  /**
   * The view frequency cap settings of the line item. The max_views field in this settings object
   * must be used if assigning a limited cap.
   * @return value or {@code null} for none
   */
  public FrequencyCap getViewFrequencyCap() {
    return viewFrequencyCap;
  }

  /**
   * The view frequency cap settings of the line item. The max_views field in this settings object
   * must be used if assigning a limited cap.
   * @param viewFrequencyCap viewFrequencyCap or {@code null} for none
   */
  public YoutubeAndPartnersSettings setViewFrequencyCap(FrequencyCap viewFrequencyCap) {
    this.viewFrequencyCap = viewFrequencyCap;
    return this;
  }

  @Override
  public YoutubeAndPartnersSettings set(String fieldName, Object value) {
    return (YoutubeAndPartnersSettings) super.set(fieldName, value);
  }

  @Override
  public YoutubeAndPartnersSettings clone() {
    return (YoutubeAndPartnersSettings) super.clone();
  }

}

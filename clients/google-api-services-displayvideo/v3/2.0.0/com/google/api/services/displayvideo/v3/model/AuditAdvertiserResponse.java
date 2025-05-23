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
 * Response message for AdvertiserService.AuditAdvertiser.
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
public final class AuditAdvertiserResponse extends com.google.api.client.json.GenericJson {

  /**
   * The number of individual targeting options from the following targeting types that are assigned
   * to a line item under this advertiser. These individual targeting options count towards the
   * limit of 4500000 ad group targeting options per advertiser. Qualifying Targeting types: *
   * Channels, URLs, apps, and collections * Demographic * Google Audiences, including Affinity,
   * Custom Affinity, and In-market audiences * Inventory source * Keyword * Mobile app category *
   * User lists * Video targeting * Viewability
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long adGroupCriteriaCount;

  /**
   * The number of individual targeting options from the following targeting types that are assigned
   * to a line item under this advertiser. These individual targeting options count towards the
   * limit of 900000 campaign targeting options per advertiser. Qualifying Targeting types: *
   * Position * Browser * Connection speed * Day and time * Device and operating system * Digital
   * content label * Sensitive categories * Environment * Geography, including business chains and
   * proximity * ISP * Language * Third-party verification
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long campaignCriteriaCount;

  /**
   * The number of channels created under this advertiser. These channels count towards the limit of
   * 1000 channels per advertiser.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long channelsCount;

  /**
   * The number of negative keyword lists created under this advertiser. These negative keyword
   * lists count towards the limit of 20 negative keyword lists per advertiser.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long negativeKeywordListsCount;

  /**
   * The number of negatively targeted channels created under this advertiser. These negatively
   * targeted channels count towards the limit of 5 negatively targeted channels per advertiser.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long negativelyTargetedChannelsCount;

  /**
   * The number of ACTIVE and PAUSED campaigns under this advertiser. These campaigns count towards
   * the limit of 9999 campaigns per advertiser.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long usedCampaignsCount;

  /**
   * The number of ACTIVE, PAUSED and DRAFT insertion orders under this advertiser. These insertion
   * orders count towards the limit of 9999 insertion orders per advertiser.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long usedInsertionOrdersCount;

  /**
   * The number of ACTIVE, PAUSED, and DRAFT line items under this advertiser. These line items
   * count towards the limit of 9999 line items per advertiser.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long usedLineItemsCount;

  /**
   * The number of individual targeting options from the following targeting types that are assigned
   * to a line item under this advertiser. These individual targeting options count towards the
   * limit of 4500000 ad group targeting options per advertiser. Qualifying Targeting types: *
   * Channels, URLs, apps, and collections * Demographic * Google Audiences, including Affinity,
   * Custom Affinity, and In-market audiences * Inventory source * Keyword * Mobile app category *
   * User lists * Video targeting * Viewability
   * @return value or {@code null} for none
   */
  public java.lang.Long getAdGroupCriteriaCount() {
    return adGroupCriteriaCount;
  }

  /**
   * The number of individual targeting options from the following targeting types that are assigned
   * to a line item under this advertiser. These individual targeting options count towards the
   * limit of 4500000 ad group targeting options per advertiser. Qualifying Targeting types: *
   * Channels, URLs, apps, and collections * Demographic * Google Audiences, including Affinity,
   * Custom Affinity, and In-market audiences * Inventory source * Keyword * Mobile app category *
   * User lists * Video targeting * Viewability
   * @param adGroupCriteriaCount adGroupCriteriaCount or {@code null} for none
   */
  public AuditAdvertiserResponse setAdGroupCriteriaCount(java.lang.Long adGroupCriteriaCount) {
    this.adGroupCriteriaCount = adGroupCriteriaCount;
    return this;
  }

  /**
   * The number of individual targeting options from the following targeting types that are assigned
   * to a line item under this advertiser. These individual targeting options count towards the
   * limit of 900000 campaign targeting options per advertiser. Qualifying Targeting types: *
   * Position * Browser * Connection speed * Day and time * Device and operating system * Digital
   * content label * Sensitive categories * Environment * Geography, including business chains and
   * proximity * ISP * Language * Third-party verification
   * @return value or {@code null} for none
   */
  public java.lang.Long getCampaignCriteriaCount() {
    return campaignCriteriaCount;
  }

  /**
   * The number of individual targeting options from the following targeting types that are assigned
   * to a line item under this advertiser. These individual targeting options count towards the
   * limit of 900000 campaign targeting options per advertiser. Qualifying Targeting types: *
   * Position * Browser * Connection speed * Day and time * Device and operating system * Digital
   * content label * Sensitive categories * Environment * Geography, including business chains and
   * proximity * ISP * Language * Third-party verification
   * @param campaignCriteriaCount campaignCriteriaCount or {@code null} for none
   */
  public AuditAdvertiserResponse setCampaignCriteriaCount(java.lang.Long campaignCriteriaCount) {
    this.campaignCriteriaCount = campaignCriteriaCount;
    return this;
  }

  /**
   * The number of channels created under this advertiser. These channels count towards the limit of
   * 1000 channels per advertiser.
   * @return value or {@code null} for none
   */
  public java.lang.Long getChannelsCount() {
    return channelsCount;
  }

  /**
   * The number of channels created under this advertiser. These channels count towards the limit of
   * 1000 channels per advertiser.
   * @param channelsCount channelsCount or {@code null} for none
   */
  public AuditAdvertiserResponse setChannelsCount(java.lang.Long channelsCount) {
    this.channelsCount = channelsCount;
    return this;
  }

  /**
   * The number of negative keyword lists created under this advertiser. These negative keyword
   * lists count towards the limit of 20 negative keyword lists per advertiser.
   * @return value or {@code null} for none
   */
  public java.lang.Long getNegativeKeywordListsCount() {
    return negativeKeywordListsCount;
  }

  /**
   * The number of negative keyword lists created under this advertiser. These negative keyword
   * lists count towards the limit of 20 negative keyword lists per advertiser.
   * @param negativeKeywordListsCount negativeKeywordListsCount or {@code null} for none
   */
  public AuditAdvertiserResponse setNegativeKeywordListsCount(java.lang.Long negativeKeywordListsCount) {
    this.negativeKeywordListsCount = negativeKeywordListsCount;
    return this;
  }

  /**
   * The number of negatively targeted channels created under this advertiser. These negatively
   * targeted channels count towards the limit of 5 negatively targeted channels per advertiser.
   * @return value or {@code null} for none
   */
  public java.lang.Long getNegativelyTargetedChannelsCount() {
    return negativelyTargetedChannelsCount;
  }

  /**
   * The number of negatively targeted channels created under this advertiser. These negatively
   * targeted channels count towards the limit of 5 negatively targeted channels per advertiser.
   * @param negativelyTargetedChannelsCount negativelyTargetedChannelsCount or {@code null} for none
   */
  public AuditAdvertiserResponse setNegativelyTargetedChannelsCount(java.lang.Long negativelyTargetedChannelsCount) {
    this.negativelyTargetedChannelsCount = negativelyTargetedChannelsCount;
    return this;
  }

  /**
   * The number of ACTIVE and PAUSED campaigns under this advertiser. These campaigns count towards
   * the limit of 9999 campaigns per advertiser.
   * @return value or {@code null} for none
   */
  public java.lang.Long getUsedCampaignsCount() {
    return usedCampaignsCount;
  }

  /**
   * The number of ACTIVE and PAUSED campaigns under this advertiser. These campaigns count towards
   * the limit of 9999 campaigns per advertiser.
   * @param usedCampaignsCount usedCampaignsCount or {@code null} for none
   */
  public AuditAdvertiserResponse setUsedCampaignsCount(java.lang.Long usedCampaignsCount) {
    this.usedCampaignsCount = usedCampaignsCount;
    return this;
  }

  /**
   * The number of ACTIVE, PAUSED and DRAFT insertion orders under this advertiser. These insertion
   * orders count towards the limit of 9999 insertion orders per advertiser.
   * @return value or {@code null} for none
   */
  public java.lang.Long getUsedInsertionOrdersCount() {
    return usedInsertionOrdersCount;
  }

  /**
   * The number of ACTIVE, PAUSED and DRAFT insertion orders under this advertiser. These insertion
   * orders count towards the limit of 9999 insertion orders per advertiser.
   * @param usedInsertionOrdersCount usedInsertionOrdersCount or {@code null} for none
   */
  public AuditAdvertiserResponse setUsedInsertionOrdersCount(java.lang.Long usedInsertionOrdersCount) {
    this.usedInsertionOrdersCount = usedInsertionOrdersCount;
    return this;
  }

  /**
   * The number of ACTIVE, PAUSED, and DRAFT line items under this advertiser. These line items
   * count towards the limit of 9999 line items per advertiser.
   * @return value or {@code null} for none
   */
  public java.lang.Long getUsedLineItemsCount() {
    return usedLineItemsCount;
  }

  /**
   * The number of ACTIVE, PAUSED, and DRAFT line items under this advertiser. These line items
   * count towards the limit of 9999 line items per advertiser.
   * @param usedLineItemsCount usedLineItemsCount or {@code null} for none
   */
  public AuditAdvertiserResponse setUsedLineItemsCount(java.lang.Long usedLineItemsCount) {
    this.usedLineItemsCount = usedLineItemsCount;
    return this;
  }

  @Override
  public AuditAdvertiserResponse set(String fieldName, Object value) {
    return (AuditAdvertiserResponse) super.set(fieldName, value);
  }

  @Override
  public AuditAdvertiserResponse clone() {
    return (AuditAdvertiserResponse) super.clone();
  }

}

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

package com.google.api.services.merchantapi.accounts_v1beta.model;

/**
 * Collection of information related to the [automatic
 * improvements](https://developers.google.com/shopping-content/guides/automatic-improvements) of an
 * account.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Merchant API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AutomaticImprovements extends com.google.api.client.json.GenericJson {

  /**
   * This improvement will attempt to automatically correct submitted images if they don't meet the
   * [image requirements](https://support.google.com/merchants/answer/6324350), for example,
   * removing overlays. If successful, the image will be replaced and approved. This improvement is
   * only applied to images of disapproved offers. For more information see: [Automatic image
   * improvements](https://support.google.com/merchants/answer/9242973) This field is only updated
   * (cleared) if provided in the update mask.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AutomaticImageImprovements imageImprovements;

  /**
   * Turning on [item updates](https://support.google.com/merchants/answer/3246284) allows Google to
   * automatically update items for you. When item updates are on, Google uses the structured data
   * markup on the website and advanced data extractors to update the price and availability of the
   * items. When the item updates are off, items with mismatched data aren't shown. This field is
   * only updated (cleared) if provided in the update mask.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AutomaticItemUpdates itemUpdates;

  /**
   * Identifier. The resource name of the automatic improvements. Format:
   * `accounts/{account}/automaticImprovements`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Not available for [advanced accounts](https://support.google.com/merchants/answer/188487). By
   * turning on [automatic shipping
   * improvements](https://support.google.com/merchants/answer/10027038), you are allowing Google to
   * improve the accuracy of your delivery times shown to shoppers using Google. More accurate
   * delivery times, especially when faster, typically lead to better conversion rates. Google will
   * improve your estimated delivery times based on various factors: * Delivery address of an order
   * * Current handling time and shipping time settings * Estimated weekdays or business days *
   * Parcel tracking data This field is only updated (cleared) if provided in the update mask.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AutomaticShippingImprovements shippingImprovements;

  /**
   * This improvement will attempt to automatically correct submitted images if they don't meet the
   * [image requirements](https://support.google.com/merchants/answer/6324350), for example,
   * removing overlays. If successful, the image will be replaced and approved. This improvement is
   * only applied to images of disapproved offers. For more information see: [Automatic image
   * improvements](https://support.google.com/merchants/answer/9242973) This field is only updated
   * (cleared) if provided in the update mask.
   * @return value or {@code null} for none
   */
  public AutomaticImageImprovements getImageImprovements() {
    return imageImprovements;
  }

  /**
   * This improvement will attempt to automatically correct submitted images if they don't meet the
   * [image requirements](https://support.google.com/merchants/answer/6324350), for example,
   * removing overlays. If successful, the image will be replaced and approved. This improvement is
   * only applied to images of disapproved offers. For more information see: [Automatic image
   * improvements](https://support.google.com/merchants/answer/9242973) This field is only updated
   * (cleared) if provided in the update mask.
   * @param imageImprovements imageImprovements or {@code null} for none
   */
  public AutomaticImprovements setImageImprovements(AutomaticImageImprovements imageImprovements) {
    this.imageImprovements = imageImprovements;
    return this;
  }

  /**
   * Turning on [item updates](https://support.google.com/merchants/answer/3246284) allows Google to
   * automatically update items for you. When item updates are on, Google uses the structured data
   * markup on the website and advanced data extractors to update the price and availability of the
   * items. When the item updates are off, items with mismatched data aren't shown. This field is
   * only updated (cleared) if provided in the update mask.
   * @return value or {@code null} for none
   */
  public AutomaticItemUpdates getItemUpdates() {
    return itemUpdates;
  }

  /**
   * Turning on [item updates](https://support.google.com/merchants/answer/3246284) allows Google to
   * automatically update items for you. When item updates are on, Google uses the structured data
   * markup on the website and advanced data extractors to update the price and availability of the
   * items. When the item updates are off, items with mismatched data aren't shown. This field is
   * only updated (cleared) if provided in the update mask.
   * @param itemUpdates itemUpdates or {@code null} for none
   */
  public AutomaticImprovements setItemUpdates(AutomaticItemUpdates itemUpdates) {
    this.itemUpdates = itemUpdates;
    return this;
  }

  /**
   * Identifier. The resource name of the automatic improvements. Format:
   * `accounts/{account}/automaticImprovements`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Identifier. The resource name of the automatic improvements. Format:
   * `accounts/{account}/automaticImprovements`.
   * @param name name or {@code null} for none
   */
  public AutomaticImprovements setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Not available for [advanced accounts](https://support.google.com/merchants/answer/188487). By
   * turning on [automatic shipping
   * improvements](https://support.google.com/merchants/answer/10027038), you are allowing Google to
   * improve the accuracy of your delivery times shown to shoppers using Google. More accurate
   * delivery times, especially when faster, typically lead to better conversion rates. Google will
   * improve your estimated delivery times based on various factors: * Delivery address of an order
   * * Current handling time and shipping time settings * Estimated weekdays or business days *
   * Parcel tracking data This field is only updated (cleared) if provided in the update mask.
   * @return value or {@code null} for none
   */
  public AutomaticShippingImprovements getShippingImprovements() {
    return shippingImprovements;
  }

  /**
   * Not available for [advanced accounts](https://support.google.com/merchants/answer/188487). By
   * turning on [automatic shipping
   * improvements](https://support.google.com/merchants/answer/10027038), you are allowing Google to
   * improve the accuracy of your delivery times shown to shoppers using Google. More accurate
   * delivery times, especially when faster, typically lead to better conversion rates. Google will
   * improve your estimated delivery times based on various factors: * Delivery address of an order
   * * Current handling time and shipping time settings * Estimated weekdays or business days *
   * Parcel tracking data This field is only updated (cleared) if provided in the update mask.
   * @param shippingImprovements shippingImprovements or {@code null} for none
   */
  public AutomaticImprovements setShippingImprovements(AutomaticShippingImprovements shippingImprovements) {
    this.shippingImprovements = shippingImprovements;
    return this;
  }

  @Override
  public AutomaticImprovements set(String fieldName, Object value) {
    return (AutomaticImprovements) super.set(fieldName, value);
  }

  @Override
  public AutomaticImprovements clone() {
    return (AutomaticImprovements) super.clone();
  }

}

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

package com.google.api.services.merchantapi.products_v1beta.model;

/**
 * The processed product, built from multiple product inputs after applying rules and supplemental
 * data sources. This processed product matches what is shown in your Merchant Center account. Each
 * product is built from exactly one primary data source product input, and multiple supplemental
 * data source inputs. After inserting, updating, or deleting a product input, it may take several
 * minutes before the updated processed product can be retrieved. All fields in the processed
 * product and its sub-messages match the name of their corresponding attribute in the [Product data
 * specification](https://support.google.com/merchants/answer/7052112) with some exceptions.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Merchant API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Product extends com.google.api.client.json.GenericJson {

  /**
   * Output only. A list of product attributes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Attributes attributes;

  /**
   * Output only. The automated discounts information for the product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AutomatedDiscounts automatedDiscounts;

  /**
   * Output only. The [channel](https://support.google.com/merchants/answer/7361332) of the product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String channel;

  /**
   * Output only. The two-letter [ISO 639-1](http://en.wikipedia.org/wiki/ISO_639-1) language code
   * for the product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentLanguage;

  /**
   * Output only. A list of custom (merchant-provided) attributes. It can also be used to submit any
   * attribute of the data specification in its generic form (for example, `{ "name": "size type",
   * "value": "regular" }`). This is useful for submitting attributes not explicitly exposed by the
   * API, such as additional attributes used for Buy on Google.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CustomAttribute> customAttributes;

  static {
    // hack to force ProGuard to consider CustomAttribute used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(CustomAttribute.class);
  }

  /**
   * Output only. The primary data source of the product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataSource;

  /**
   * Output only. The feed label lets you categorize and identify your products. The maximum allowed
   * characters is 20 and the supported characters are`A-Z`, `0-9`, hyphen and underscore. The feed
   * label must not include any spaces. For more information, see [Using feed
   * labels](//support.google.com/merchants/answer/14994087)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String feedLabel;

  /**
   * The name of the product. Format: `accounts/{account}/products/{product}` where the last section
   * `product` consists of: `content_language~feed_label~offer_id` example for product name is
   * `accounts/123/products/en~US~sku123`. A legacy local product name would be
   * `accounts/123/products/local~en~US~sku123`. Note: For calls to the v1beta version, the
   * `product` section consists of: `channel~content_language~feed_label~offer_id`, for example:
   * `accounts/123/products/online~en~US~sku123`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Your unique identifier for the product. This is the same for the product input and
   * processed product. Leading and trailing whitespaces are stripped and multiple whitespaces are
   * replaced by a single whitespace upon submission. See the [product data
   * specification](https://support.google.com/merchants/answer/188494#id) for details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String offerId;

  /**
   * Output only. The status of a product, data validation issues, that is, information about a
   * product computed asynchronously.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ProductStatus productStatus;

  /**
   * Output only. Represents the existing version (freshness) of the product, which can be used to
   * preserve the right order when multiple updates are done at the same time. If set, the insertion
   * is prevented when version number is lower than the current version number of the existing
   * product. Re-insertion (for example, product refresh after 30 days) can be performed with the
   * current `version_number`. Only supported for insertions into primary data sources. If the
   * operation is prevented, the aborted exception will be thrown.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long versionNumber;

  /**
   * Output only. A list of product attributes.
   * @return value or {@code null} for none
   */
  public Attributes getAttributes() {
    return attributes;
  }

  /**
   * Output only. A list of product attributes.
   * @param attributes attributes or {@code null} for none
   */
  public Product setAttributes(Attributes attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Output only. The automated discounts information for the product.
   * @return value or {@code null} for none
   */
  public AutomatedDiscounts getAutomatedDiscounts() {
    return automatedDiscounts;
  }

  /**
   * Output only. The automated discounts information for the product.
   * @param automatedDiscounts automatedDiscounts or {@code null} for none
   */
  public Product setAutomatedDiscounts(AutomatedDiscounts automatedDiscounts) {
    this.automatedDiscounts = automatedDiscounts;
    return this;
  }

  /**
   * Output only. The [channel](https://support.google.com/merchants/answer/7361332) of the product.
   * @return value or {@code null} for none
   */
  public java.lang.String getChannel() {
    return channel;
  }

  /**
   * Output only. The [channel](https://support.google.com/merchants/answer/7361332) of the product.
   * @param channel channel or {@code null} for none
   */
  public Product setChannel(java.lang.String channel) {
    this.channel = channel;
    return this;
  }

  /**
   * Output only. The two-letter [ISO 639-1](http://en.wikipedia.org/wiki/ISO_639-1) language code
   * for the product.
   * @return value or {@code null} for none
   */
  public java.lang.String getContentLanguage() {
    return contentLanguage;
  }

  /**
   * Output only. The two-letter [ISO 639-1](http://en.wikipedia.org/wiki/ISO_639-1) language code
   * for the product.
   * @param contentLanguage contentLanguage or {@code null} for none
   */
  public Product setContentLanguage(java.lang.String contentLanguage) {
    this.contentLanguage = contentLanguage;
    return this;
  }

  /**
   * Output only. A list of custom (merchant-provided) attributes. It can also be used to submit any
   * attribute of the data specification in its generic form (for example, `{ "name": "size type",
   * "value": "regular" }`). This is useful for submitting attributes not explicitly exposed by the
   * API, such as additional attributes used for Buy on Google.
   * @return value or {@code null} for none
   */
  public java.util.List<CustomAttribute> getCustomAttributes() {
    return customAttributes;
  }

  /**
   * Output only. A list of custom (merchant-provided) attributes. It can also be used to submit any
   * attribute of the data specification in its generic form (for example, `{ "name": "size type",
   * "value": "regular" }`). This is useful for submitting attributes not explicitly exposed by the
   * API, such as additional attributes used for Buy on Google.
   * @param customAttributes customAttributes or {@code null} for none
   */
  public Product setCustomAttributes(java.util.List<CustomAttribute> customAttributes) {
    this.customAttributes = customAttributes;
    return this;
  }

  /**
   * Output only. The primary data source of the product.
   * @return value or {@code null} for none
   */
  public java.lang.String getDataSource() {
    return dataSource;
  }

  /**
   * Output only. The primary data source of the product.
   * @param dataSource dataSource or {@code null} for none
   */
  public Product setDataSource(java.lang.String dataSource) {
    this.dataSource = dataSource;
    return this;
  }

  /**
   * Output only. The feed label lets you categorize and identify your products. The maximum allowed
   * characters is 20 and the supported characters are`A-Z`, `0-9`, hyphen and underscore. The feed
   * label must not include any spaces. For more information, see [Using feed
   * labels](//support.google.com/merchants/answer/14994087)
   * @return value or {@code null} for none
   */
  public java.lang.String getFeedLabel() {
    return feedLabel;
  }

  /**
   * Output only. The feed label lets you categorize and identify your products. The maximum allowed
   * characters is 20 and the supported characters are`A-Z`, `0-9`, hyphen and underscore. The feed
   * label must not include any spaces. For more information, see [Using feed
   * labels](//support.google.com/merchants/answer/14994087)
   * @param feedLabel feedLabel or {@code null} for none
   */
  public Product setFeedLabel(java.lang.String feedLabel) {
    this.feedLabel = feedLabel;
    return this;
  }

  /**
   * The name of the product. Format: `accounts/{account}/products/{product}` where the last section
   * `product` consists of: `content_language~feed_label~offer_id` example for product name is
   * `accounts/123/products/en~US~sku123`. A legacy local product name would be
   * `accounts/123/products/local~en~US~sku123`. Note: For calls to the v1beta version, the
   * `product` section consists of: `channel~content_language~feed_label~offer_id`, for example:
   * `accounts/123/products/online~en~US~sku123`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the product. Format: `accounts/{account}/products/{product}` where the last section
   * `product` consists of: `content_language~feed_label~offer_id` example for product name is
   * `accounts/123/products/en~US~sku123`. A legacy local product name would be
   * `accounts/123/products/local~en~US~sku123`. Note: For calls to the v1beta version, the
   * `product` section consists of: `channel~content_language~feed_label~offer_id`, for example:
   * `accounts/123/products/online~en~US~sku123`.
   * @param name name or {@code null} for none
   */
  public Product setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Your unique identifier for the product. This is the same for the product input and
   * processed product. Leading and trailing whitespaces are stripped and multiple whitespaces are
   * replaced by a single whitespace upon submission. See the [product data
   * specification](https://support.google.com/merchants/answer/188494#id) for details.
   * @return value or {@code null} for none
   */
  public java.lang.String getOfferId() {
    return offerId;
  }

  /**
   * Output only. Your unique identifier for the product. This is the same for the product input and
   * processed product. Leading and trailing whitespaces are stripped and multiple whitespaces are
   * replaced by a single whitespace upon submission. See the [product data
   * specification](https://support.google.com/merchants/answer/188494#id) for details.
   * @param offerId offerId or {@code null} for none
   */
  public Product setOfferId(java.lang.String offerId) {
    this.offerId = offerId;
    return this;
  }

  /**
   * Output only. The status of a product, data validation issues, that is, information about a
   * product computed asynchronously.
   * @return value or {@code null} for none
   */
  public ProductStatus getProductStatus() {
    return productStatus;
  }

  /**
   * Output only. The status of a product, data validation issues, that is, information about a
   * product computed asynchronously.
   * @param productStatus productStatus or {@code null} for none
   */
  public Product setProductStatus(ProductStatus productStatus) {
    this.productStatus = productStatus;
    return this;
  }

  /**
   * Output only. Represents the existing version (freshness) of the product, which can be used to
   * preserve the right order when multiple updates are done at the same time. If set, the insertion
   * is prevented when version number is lower than the current version number of the existing
   * product. Re-insertion (for example, product refresh after 30 days) can be performed with the
   * current `version_number`. Only supported for insertions into primary data sources. If the
   * operation is prevented, the aborted exception will be thrown.
   * @return value or {@code null} for none
   */
  public java.lang.Long getVersionNumber() {
    return versionNumber;
  }

  /**
   * Output only. Represents the existing version (freshness) of the product, which can be used to
   * preserve the right order when multiple updates are done at the same time. If set, the insertion
   * is prevented when version number is lower than the current version number of the existing
   * product. Re-insertion (for example, product refresh after 30 days) can be performed with the
   * current `version_number`. Only supported for insertions into primary data sources. If the
   * operation is prevented, the aborted exception will be thrown.
   * @param versionNumber versionNumber or {@code null} for none
   */
  public Product setVersionNumber(java.lang.Long versionNumber) {
    this.versionNumber = versionNumber;
    return this;
  }

  @Override
  public Product set(String fieldName, Object value) {
    return (Product) super.set(fieldName, value);
  }

  @Override
  public Product clone() {
    return (Product) super.clone();
  }

}

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

package com.google.api.services.merchantapi.lfp_v1beta.model;

/**
 * The inventory statistics for a merchant.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Merchant API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InventoryStats extends com.google.api.client.json.GenericJson {

  /**
   * Number of entries (understanding entry as a pair of product and store) that were built based on
   * provided inventories/sales and submitted to Google.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long submittedEntries;

  /**
   * Number of submitted in stock entries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long submittedInStockEntries;

  /**
   * Number of products from provided inventories/sales that were created from matches to existing
   * online products provided by the merchant or to the Google catalog.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long submittedProducts;

  /**
   * Number of entries that were built based on provided inventories/sales and couldn't be submitted
   * to Google due to errors like missing product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long unsubmittedEntries;

  /**
   * Number of entries (understanding entry as a pair of product and store) that were built based on
   * provided inventories/sales and submitted to Google.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSubmittedEntries() {
    return submittedEntries;
  }

  /**
   * Number of entries (understanding entry as a pair of product and store) that were built based on
   * provided inventories/sales and submitted to Google.
   * @param submittedEntries submittedEntries or {@code null} for none
   */
  public InventoryStats setSubmittedEntries(java.lang.Long submittedEntries) {
    this.submittedEntries = submittedEntries;
    return this;
  }

  /**
   * Number of submitted in stock entries.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSubmittedInStockEntries() {
    return submittedInStockEntries;
  }

  /**
   * Number of submitted in stock entries.
   * @param submittedInStockEntries submittedInStockEntries or {@code null} for none
   */
  public InventoryStats setSubmittedInStockEntries(java.lang.Long submittedInStockEntries) {
    this.submittedInStockEntries = submittedInStockEntries;
    return this;
  }

  /**
   * Number of products from provided inventories/sales that were created from matches to existing
   * online products provided by the merchant or to the Google catalog.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSubmittedProducts() {
    return submittedProducts;
  }

  /**
   * Number of products from provided inventories/sales that were created from matches to existing
   * online products provided by the merchant or to the Google catalog.
   * @param submittedProducts submittedProducts or {@code null} for none
   */
  public InventoryStats setSubmittedProducts(java.lang.Long submittedProducts) {
    this.submittedProducts = submittedProducts;
    return this;
  }

  /**
   * Number of entries that were built based on provided inventories/sales and couldn't be submitted
   * to Google due to errors like missing product.
   * @return value or {@code null} for none
   */
  public java.lang.Long getUnsubmittedEntries() {
    return unsubmittedEntries;
  }

  /**
   * Number of entries that were built based on provided inventories/sales and couldn't be submitted
   * to Google due to errors like missing product.
   * @param unsubmittedEntries unsubmittedEntries or {@code null} for none
   */
  public InventoryStats setUnsubmittedEntries(java.lang.Long unsubmittedEntries) {
    this.unsubmittedEntries = unsubmittedEntries;
    return this;
  }

  @Override
  public InventoryStats set(String fieldName, Object value) {
    return (InventoryStats) super.set(fieldName, value);
  }

  @Override
  public InventoryStats clone() {
    return (InventoryStats) super.clone();
  }

}

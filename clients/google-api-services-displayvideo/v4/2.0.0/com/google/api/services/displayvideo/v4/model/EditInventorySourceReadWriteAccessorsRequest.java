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

package com.google.api.services.displayvideo.v4.model;

/**
 * Request message for InventorySourceService.EditInventorySourceReadWriteAccessors.
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
public final class EditInventorySourceReadWriteAccessorsRequest extends com.google.api.client.json.GenericJson {

  /**
   * The advertisers to add or remove from the list of advertisers that have read/write access to
   * the inventory source. This change will remove an existing partner read/write accessor.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EditInventorySourceReadWriteAccessorsRequestAdvertisersUpdate advertisersUpdate;

  /**
   * Set the partner context as read/write accessor of the inventory source. This will remove all
   * other current read/write advertiser accessors.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean assignPartner;

  /**
   * Required. The partner context by which the accessors change is being made.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long partnerId;

  /**
   * The advertisers to add or remove from the list of advertisers that have read/write access to
   * the inventory source. This change will remove an existing partner read/write accessor.
   * @return value or {@code null} for none
   */
  public EditInventorySourceReadWriteAccessorsRequestAdvertisersUpdate getAdvertisersUpdate() {
    return advertisersUpdate;
  }

  /**
   * The advertisers to add or remove from the list of advertisers that have read/write access to
   * the inventory source. This change will remove an existing partner read/write accessor.
   * @param advertisersUpdate advertisersUpdate or {@code null} for none
   */
  public EditInventorySourceReadWriteAccessorsRequest setAdvertisersUpdate(EditInventorySourceReadWriteAccessorsRequestAdvertisersUpdate advertisersUpdate) {
    this.advertisersUpdate = advertisersUpdate;
    return this;
  }

  /**
   * Set the partner context as read/write accessor of the inventory source. This will remove all
   * other current read/write advertiser accessors.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAssignPartner() {
    return assignPartner;
  }

  /**
   * Set the partner context as read/write accessor of the inventory source. This will remove all
   * other current read/write advertiser accessors.
   * @param assignPartner assignPartner or {@code null} for none
   */
  public EditInventorySourceReadWriteAccessorsRequest setAssignPartner(java.lang.Boolean assignPartner) {
    this.assignPartner = assignPartner;
    return this;
  }

  /**
   * Required. The partner context by which the accessors change is being made.
   * @return value or {@code null} for none
   */
  public java.lang.Long getPartnerId() {
    return partnerId;
  }

  /**
   * Required. The partner context by which the accessors change is being made.
   * @param partnerId partnerId or {@code null} for none
   */
  public EditInventorySourceReadWriteAccessorsRequest setPartnerId(java.lang.Long partnerId) {
    this.partnerId = partnerId;
    return this;
  }

  @Override
  public EditInventorySourceReadWriteAccessorsRequest set(String fieldName, Object value) {
    return (EditInventorySourceReadWriteAccessorsRequest) super.set(fieldName, value);
  }

  @Override
  public EditInventorySourceReadWriteAccessorsRequest clone() {
    return (EditInventorySourceReadWriteAccessorsRequest) super.clone();
  }

}

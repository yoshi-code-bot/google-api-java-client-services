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

package com.google.api.services.merchantapi.conversions_v1beta.model;

/**
 * Represents attribution settings for conversion sources receiving pre-attribution data.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Merchant API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AttributionSettings extends com.google.api.client.json.GenericJson {

  /**
   * Required. Lookback window (in days) used for attribution in this source. Supported values are
   * `7`, `30` & `40`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer attributionLookbackWindowDays;

  /**
   * Required. Attribution model.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String attributionModel;

  /**
   * Immutable. Unordered list. List of different conversion types a conversion event can be
   * classified as. A standard "purchase" type will be automatically created if this list is empty
   * at creation time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ConversionType> conversionType;

  /**
   * Required. Lookback window (in days) used for attribution in this source. Supported values are
   * `7`, `30` & `40`.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getAttributionLookbackWindowDays() {
    return attributionLookbackWindowDays;
  }

  /**
   * Required. Lookback window (in days) used for attribution in this source. Supported values are
   * `7`, `30` & `40`.
   * @param attributionLookbackWindowDays attributionLookbackWindowDays or {@code null} for none
   */
  public AttributionSettings setAttributionLookbackWindowDays(java.lang.Integer attributionLookbackWindowDays) {
    this.attributionLookbackWindowDays = attributionLookbackWindowDays;
    return this;
  }

  /**
   * Required. Attribution model.
   * @return value or {@code null} for none
   */
  public java.lang.String getAttributionModel() {
    return attributionModel;
  }

  /**
   * Required. Attribution model.
   * @param attributionModel attributionModel or {@code null} for none
   */
  public AttributionSettings setAttributionModel(java.lang.String attributionModel) {
    this.attributionModel = attributionModel;
    return this;
  }

  /**
   * Immutable. Unordered list. List of different conversion types a conversion event can be
   * classified as. A standard "purchase" type will be automatically created if this list is empty
   * at creation time.
   * @return value or {@code null} for none
   */
  public java.util.List<ConversionType> getConversionType() {
    return conversionType;
  }

  /**
   * Immutable. Unordered list. List of different conversion types a conversion event can be
   * classified as. A standard "purchase" type will be automatically created if this list is empty
   * at creation time.
   * @param conversionType conversionType or {@code null} for none
   */
  public AttributionSettings setConversionType(java.util.List<ConversionType> conversionType) {
    this.conversionType = conversionType;
    return this;
  }

  @Override
  public AttributionSettings set(String fieldName, Object value) {
    return (AttributionSettings) super.set(fieldName, value);
  }

  @Override
  public AttributionSettings clone() {
    return (AttributionSettings) super.clone();
  }

}

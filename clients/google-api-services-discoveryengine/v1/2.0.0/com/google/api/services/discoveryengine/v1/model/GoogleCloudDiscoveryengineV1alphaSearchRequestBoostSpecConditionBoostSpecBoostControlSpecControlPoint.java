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
 * The control points used to define the curve. The curve defined through these control points can
 * only be monotonically increasing or decreasing(constant values are acceptable).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1alphaSearchRequestBoostSpecConditionBoostSpecBoostControlSpecControlPoint extends com.google.api.client.json.GenericJson {

  /**
   * Can be one of: 1. The numerical field value. 2. The duration spec for freshness: The value must
   * be formatted as an XSD `dayTimeDuration` value (a restricted subset of an ISO 8601 duration
   * value). The pattern for this is: `nDnM]`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String attributeValue;

  /**
   * The value between -1 to 1 by which to boost the score if the attribute_value evaluates to the
   * value specified above.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float boostAmount;

  /**
   * Can be one of: 1. The numerical field value. 2. The duration spec for freshness: The value must
   * be formatted as an XSD `dayTimeDuration` value (a restricted subset of an ISO 8601 duration
   * value). The pattern for this is: `nDnM]`.
   * @return value or {@code null} for none
   */
  public java.lang.String getAttributeValue() {
    return attributeValue;
  }

  /**
   * Can be one of: 1. The numerical field value. 2. The duration spec for freshness: The value must
   * be formatted as an XSD `dayTimeDuration` value (a restricted subset of an ISO 8601 duration
   * value). The pattern for this is: `nDnM]`.
   * @param attributeValue attributeValue or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchRequestBoostSpecConditionBoostSpecBoostControlSpecControlPoint setAttributeValue(java.lang.String attributeValue) {
    this.attributeValue = attributeValue;
    return this;
  }

  /**
   * The value between -1 to 1 by which to boost the score if the attribute_value evaluates to the
   * value specified above.
   * @return value or {@code null} for none
   */
  public java.lang.Float getBoostAmount() {
    return boostAmount;
  }

  /**
   * The value between -1 to 1 by which to boost the score if the attribute_value evaluates to the
   * value specified above.
   * @param boostAmount boostAmount or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaSearchRequestBoostSpecConditionBoostSpecBoostControlSpecControlPoint setBoostAmount(java.lang.Float boostAmount) {
    this.boostAmount = boostAmount;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaSearchRequestBoostSpecConditionBoostSpecBoostControlSpecControlPoint set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1alphaSearchRequestBoostSpecConditionBoostSpecBoostControlSpecControlPoint) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaSearchRequestBoostSpecConditionBoostSpecBoostControlSpecControlPoint clone() {
    return (GoogleCloudDiscoveryengineV1alphaSearchRequestBoostSpecConditionBoostSpecBoostControlSpecControlPoint) super.clone();
  }

}

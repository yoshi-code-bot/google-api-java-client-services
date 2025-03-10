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

package com.google.api.services.androidpublisher.model;

/**
 * A single base plan for a subscription.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Android Developer API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BasePlan extends com.google.api.client.json.GenericJson {

  /**
   * Set when the base plan automatically renews at a regular interval.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AutoRenewingBasePlanType autoRenewingBasePlanType;

  /**
   * Required. Immutable. The unique identifier of this base plan. Must be unique within the
   * subscription, and conform with RFC-1034. That is, this ID can only contain lower-case letters
   * (a-z), numbers (0-9), and hyphens (-), and be at most 63 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String basePlanId;

  /**
   * Set for installments base plans where a user is committed to a specified number of payments.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InstallmentsBasePlanType installmentsBasePlanType;

  /**
   * List of up to 20 custom tags specified for this base plan, and returned to the app through the
   * billing library. Subscription offers for this base plan will also receive these offer tags in
   * the billing library.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<OfferTag> offerTags;

  /**
   * Pricing information for any new locations Play may launch in the future. If omitted, the
   * BasePlan will not be automatically available any new locations Play may launch in the future.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OtherRegionsBasePlanConfig otherRegionsConfig;

  /**
   * Set when the base plan does not automatically renew at the end of the billing period.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PrepaidBasePlanType prepaidBasePlanType;

  /**
   * Region-specific information for this base plan.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<RegionalBasePlanConfig> regionalConfigs;

  /**
   * Output only. The state of the base plan, i.e. whether it's active. Draft and inactive base
   * plans can be activated or deleted. Active base plans can be made inactive. Inactive base plans
   * can be canceled. This field cannot be changed by updating the resource. Use the dedicated
   * endpoints instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Set when the base plan automatically renews at a regular interval.
   * @return value or {@code null} for none
   */
  public AutoRenewingBasePlanType getAutoRenewingBasePlanType() {
    return autoRenewingBasePlanType;
  }

  /**
   * Set when the base plan automatically renews at a regular interval.
   * @param autoRenewingBasePlanType autoRenewingBasePlanType or {@code null} for none
   */
  public BasePlan setAutoRenewingBasePlanType(AutoRenewingBasePlanType autoRenewingBasePlanType) {
    this.autoRenewingBasePlanType = autoRenewingBasePlanType;
    return this;
  }

  /**
   * Required. Immutable. The unique identifier of this base plan. Must be unique within the
   * subscription, and conform with RFC-1034. That is, this ID can only contain lower-case letters
   * (a-z), numbers (0-9), and hyphens (-), and be at most 63 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getBasePlanId() {
    return basePlanId;
  }

  /**
   * Required. Immutable. The unique identifier of this base plan. Must be unique within the
   * subscription, and conform with RFC-1034. That is, this ID can only contain lower-case letters
   * (a-z), numbers (0-9), and hyphens (-), and be at most 63 characters.
   * @param basePlanId basePlanId or {@code null} for none
   */
  public BasePlan setBasePlanId(java.lang.String basePlanId) {
    this.basePlanId = basePlanId;
    return this;
  }

  /**
   * Set for installments base plans where a user is committed to a specified number of payments.
   * @return value or {@code null} for none
   */
  public InstallmentsBasePlanType getInstallmentsBasePlanType() {
    return installmentsBasePlanType;
  }

  /**
   * Set for installments base plans where a user is committed to a specified number of payments.
   * @param installmentsBasePlanType installmentsBasePlanType or {@code null} for none
   */
  public BasePlan setInstallmentsBasePlanType(InstallmentsBasePlanType installmentsBasePlanType) {
    this.installmentsBasePlanType = installmentsBasePlanType;
    return this;
  }

  /**
   * List of up to 20 custom tags specified for this base plan, and returned to the app through the
   * billing library. Subscription offers for this base plan will also receive these offer tags in
   * the billing library.
   * @return value or {@code null} for none
   */
  public java.util.List<OfferTag> getOfferTags() {
    return offerTags;
  }

  /**
   * List of up to 20 custom tags specified for this base plan, and returned to the app through the
   * billing library. Subscription offers for this base plan will also receive these offer tags in
   * the billing library.
   * @param offerTags offerTags or {@code null} for none
   */
  public BasePlan setOfferTags(java.util.List<OfferTag> offerTags) {
    this.offerTags = offerTags;
    return this;
  }

  /**
   * Pricing information for any new locations Play may launch in the future. If omitted, the
   * BasePlan will not be automatically available any new locations Play may launch in the future.
   * @return value or {@code null} for none
   */
  public OtherRegionsBasePlanConfig getOtherRegionsConfig() {
    return otherRegionsConfig;
  }

  /**
   * Pricing information for any new locations Play may launch in the future. If omitted, the
   * BasePlan will not be automatically available any new locations Play may launch in the future.
   * @param otherRegionsConfig otherRegionsConfig or {@code null} for none
   */
  public BasePlan setOtherRegionsConfig(OtherRegionsBasePlanConfig otherRegionsConfig) {
    this.otherRegionsConfig = otherRegionsConfig;
    return this;
  }

  /**
   * Set when the base plan does not automatically renew at the end of the billing period.
   * @return value or {@code null} for none
   */
  public PrepaidBasePlanType getPrepaidBasePlanType() {
    return prepaidBasePlanType;
  }

  /**
   * Set when the base plan does not automatically renew at the end of the billing period.
   * @param prepaidBasePlanType prepaidBasePlanType or {@code null} for none
   */
  public BasePlan setPrepaidBasePlanType(PrepaidBasePlanType prepaidBasePlanType) {
    this.prepaidBasePlanType = prepaidBasePlanType;
    return this;
  }

  /**
   * Region-specific information for this base plan.
   * @return value or {@code null} for none
   */
  public java.util.List<RegionalBasePlanConfig> getRegionalConfigs() {
    return regionalConfigs;
  }

  /**
   * Region-specific information for this base plan.
   * @param regionalConfigs regionalConfigs or {@code null} for none
   */
  public BasePlan setRegionalConfigs(java.util.List<RegionalBasePlanConfig> regionalConfigs) {
    this.regionalConfigs = regionalConfigs;
    return this;
  }

  /**
   * Output only. The state of the base plan, i.e. whether it's active. Draft and inactive base
   * plans can be activated or deleted. Active base plans can be made inactive. Inactive base plans
   * can be canceled. This field cannot be changed by updating the resource. Use the dedicated
   * endpoints instead.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The state of the base plan, i.e. whether it's active. Draft and inactive base
   * plans can be activated or deleted. Active base plans can be made inactive. Inactive base plans
   * can be canceled. This field cannot be changed by updating the resource. Use the dedicated
   * endpoints instead.
   * @param state state or {@code null} for none
   */
  public BasePlan setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public BasePlan set(String fieldName, Object value) {
    return (BasePlan) super.set(fieldName, value);
  }

  @Override
  public BasePlan clone() {
    return (BasePlan) super.clone();
  }

}

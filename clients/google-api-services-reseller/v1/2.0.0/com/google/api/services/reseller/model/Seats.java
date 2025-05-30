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

package com.google.api.services.reseller.model;

/**
 * JSON template for subscription seats.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Workspace Reseller API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Seats extends com.google.api.client.json.GenericJson {

  /**
   * Identifies the resource as a subscription seat setting. Value: `subscriptions#seats`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Read-only field containing the current number of users that are assigned a license for the
   * product defined in `skuId`. This field's value is equivalent to the numerical count of users
   * returned by the Enterprise License Manager API method: [`listForProductAndSku`](https://develop
   * ers.google.com/workspace/admin/licensing/v1/reference/licenseAssignments/listForProductAndSku).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer licensedNumberOfSeats;

  /**
   * This is a required property and is exclusive to subscriptions with `FLEXIBLE` or `TRIAL` plans.
   * This property sets the maximum number of licensed users allowed on a subscription. This
   * quantity can be increased up to the maximum limit defined in the reseller's contract. The
   * minimum quantity is the current number of users in the customer account. *Note: *G Suite
   * subscriptions automatically assign a license to every user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maximumNumberOfSeats;

  /**
   * This is a required property and is exclusive to subscriptions with `ANNUAL_MONTHLY_PAY` and
   * `ANNUAL_YEARLY_PAY` plans. This property sets the maximum number of licenses assignable to
   * users on a subscription. The reseller can add more licenses, but once set, the `numberOfSeats`
   * cannot be reduced until renewal. The reseller is invoiced based on the `numberOfSeats` value
   * regardless of how many of these user licenses are assigned. *Note: *Google Workspace
   * subscriptions automatically assign a license to every user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numberOfSeats;

  /**
   * Identifies the resource as a subscription seat setting. Value: `subscriptions#seats`
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies the resource as a subscription seat setting. Value: `subscriptions#seats`
   * @param kind kind or {@code null} for none
   */
  public Seats setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Read-only field containing the current number of users that are assigned a license for the
   * product defined in `skuId`. This field's value is equivalent to the numerical count of users
   * returned by the Enterprise License Manager API method: [`listForProductAndSku`](https://develop
   * ers.google.com/workspace/admin/licensing/v1/reference/licenseAssignments/listForProductAndSku).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getLicensedNumberOfSeats() {
    return licensedNumberOfSeats;
  }

  /**
   * Read-only field containing the current number of users that are assigned a license for the
   * product defined in `skuId`. This field's value is equivalent to the numerical count of users
   * returned by the Enterprise License Manager API method: [`listForProductAndSku`](https://develop
   * ers.google.com/workspace/admin/licensing/v1/reference/licenseAssignments/listForProductAndSku).
   * @param licensedNumberOfSeats licensedNumberOfSeats or {@code null} for none
   */
  public Seats setLicensedNumberOfSeats(java.lang.Integer licensedNumberOfSeats) {
    this.licensedNumberOfSeats = licensedNumberOfSeats;
    return this;
  }

  /**
   * This is a required property and is exclusive to subscriptions with `FLEXIBLE` or `TRIAL` plans.
   * This property sets the maximum number of licensed users allowed on a subscription. This
   * quantity can be increased up to the maximum limit defined in the reseller's contract. The
   * minimum quantity is the current number of users in the customer account. *Note: *G Suite
   * subscriptions automatically assign a license to every user.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaximumNumberOfSeats() {
    return maximumNumberOfSeats;
  }

  /**
   * This is a required property and is exclusive to subscriptions with `FLEXIBLE` or `TRIAL` plans.
   * This property sets the maximum number of licensed users allowed on a subscription. This
   * quantity can be increased up to the maximum limit defined in the reseller's contract. The
   * minimum quantity is the current number of users in the customer account. *Note: *G Suite
   * subscriptions automatically assign a license to every user.
   * @param maximumNumberOfSeats maximumNumberOfSeats or {@code null} for none
   */
  public Seats setMaximumNumberOfSeats(java.lang.Integer maximumNumberOfSeats) {
    this.maximumNumberOfSeats = maximumNumberOfSeats;
    return this;
  }

  /**
   * This is a required property and is exclusive to subscriptions with `ANNUAL_MONTHLY_PAY` and
   * `ANNUAL_YEARLY_PAY` plans. This property sets the maximum number of licenses assignable to
   * users on a subscription. The reseller can add more licenses, but once set, the `numberOfSeats`
   * cannot be reduced until renewal. The reseller is invoiced based on the `numberOfSeats` value
   * regardless of how many of these user licenses are assigned. *Note: *Google Workspace
   * subscriptions automatically assign a license to every user.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumberOfSeats() {
    return numberOfSeats;
  }

  /**
   * This is a required property and is exclusive to subscriptions with `ANNUAL_MONTHLY_PAY` and
   * `ANNUAL_YEARLY_PAY` plans. This property sets the maximum number of licenses assignable to
   * users on a subscription. The reseller can add more licenses, but once set, the `numberOfSeats`
   * cannot be reduced until renewal. The reseller is invoiced based on the `numberOfSeats` value
   * regardless of how many of these user licenses are assigned. *Note: *Google Workspace
   * subscriptions automatically assign a license to every user.
   * @param numberOfSeats numberOfSeats or {@code null} for none
   */
  public Seats setNumberOfSeats(java.lang.Integer numberOfSeats) {
    this.numberOfSeats = numberOfSeats;
    return this;
  }

  @Override
  public Seats set(String fieldName, Object value) {
    return (Seats) super.set(fieldName, value);
  }

  @Override
  public Seats clone() {
    return (Seats) super.clone();
  }

}

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

package com.google.api.services.workstations.v1beta.model;

/**
 * ReservationAffinity is the configuration of the desired reservation from which instances can
 * consume resources.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Workstations API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReservationAffinity extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Corresponds to the type of reservation consumption.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String consumeReservationType;

  /**
   * Optional. Corresponds to the label key of reservation resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * Optional. Corresponds to the label values of reservation resources. Valid values are either a
   * name to a reservation in the same project or "projects/{project}/reservations/{reservation}" to
   * target a shared reservation in the same zone but in a different project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> values;

  /**
   * Optional. Corresponds to the type of reservation consumption.
   * @return value or {@code null} for none
   */
  public java.lang.String getConsumeReservationType() {
    return consumeReservationType;
  }

  /**
   * Optional. Corresponds to the type of reservation consumption.
   * @param consumeReservationType consumeReservationType or {@code null} for none
   */
  public ReservationAffinity setConsumeReservationType(java.lang.String consumeReservationType) {
    this.consumeReservationType = consumeReservationType;
    return this;
  }

  /**
   * Optional. Corresponds to the label key of reservation resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * Optional. Corresponds to the label key of reservation resource.
   * @param key key or {@code null} for none
   */
  public ReservationAffinity setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  /**
   * Optional. Corresponds to the label values of reservation resources. Valid values are either a
   * name to a reservation in the same project or "projects/{project}/reservations/{reservation}" to
   * target a shared reservation in the same zone but in a different project.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getValues() {
    return values;
  }

  /**
   * Optional. Corresponds to the label values of reservation resources. Valid values are either a
   * name to a reservation in the same project or "projects/{project}/reservations/{reservation}" to
   * target a shared reservation in the same zone but in a different project.
   * @param values values or {@code null} for none
   */
  public ReservationAffinity setValues(java.util.List<java.lang.String> values) {
    this.values = values;
    return this;
  }

  @Override
  public ReservationAffinity set(String fieldName, Object value) {
    return (ReservationAffinity) super.set(fieldName, value);
  }

  @Override
  public ReservationAffinity clone() {
    return (ReservationAffinity) super.clone();
  }

}

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
 * Detailed information about the order at creation time.
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
public final class OrderDetails extends com.google.api.client.json.GenericJson {

  /**
   * Indicates whether the listed price was tax inclusive or not.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean taxInclusive;

  /**
   * Indicates whether the listed price was tax inclusive or not.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getTaxInclusive() {
    return taxInclusive;
  }

  /**
   * Indicates whether the listed price was tax inclusive or not.
   * @param taxInclusive taxInclusive or {@code null} for none
   */
  public OrderDetails setTaxInclusive(java.lang.Boolean taxInclusive) {
    this.taxInclusive = taxInclusive;
    return this;
  }

  @Override
  public OrderDetails set(String fieldName, Object value) {
    return (OrderDetails) super.set(fieldName, value);
  }

  @Override
  public OrderDetails clone() {
    return (OrderDetails) super.clone();
  }

}

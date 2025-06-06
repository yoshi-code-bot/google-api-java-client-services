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
 * Not available for [advanced accounts](https://support.google.com/merchants/answer/188487). By
 * turning on [automatic shipping
 * improvements](https://support.google.com/merchants/answer/10027038), you are allowing Google to
 * improve the accuracy of your delivery times shown to shoppers using Google. More accurate
 * delivery times, especially when faster, typically lead to better conversion rates. Google will
 * improve your estimated delivery times based on various factors: * Delivery address of an order *
 * Current handling time and shipping time settings * Estimated weekdays or business days * Parcel
 * tracking data
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Merchant API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AutomaticShippingImprovements extends com.google.api.client.json.GenericJson {

  /**
   * Enables automatic shipping improvements.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allowShippingImprovements;

  /**
   * Enables automatic shipping improvements.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllowShippingImprovements() {
    return allowShippingImprovements;
  }

  /**
   * Enables automatic shipping improvements.
   * @param allowShippingImprovements allowShippingImprovements or {@code null} for none
   */
  public AutomaticShippingImprovements setAllowShippingImprovements(java.lang.Boolean allowShippingImprovements) {
    this.allowShippingImprovements = allowShippingImprovements;
    return this;
  }

  @Override
  public AutomaticShippingImprovements set(String fieldName, Object value) {
    return (AutomaticShippingImprovements) super.set(fieldName, value);
  }

  @Override
  public AutomaticShippingImprovements clone() {
    return (AutomaticShippingImprovements) super.clone();
  }

}

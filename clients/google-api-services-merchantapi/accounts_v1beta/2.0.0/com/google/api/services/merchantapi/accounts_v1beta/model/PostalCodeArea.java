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
 * A list of postal codes that defines the region area. Note: All regions defined using postal codes
 * are accessible through the account's `ShippingSettings.postalCodeGroups` resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Merchant API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PostalCodeArea extends com.google.api.client.json.GenericJson {

  /**
   * Required. A range of postal codes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PostalCodeRange> postalCodes;

  /**
   * Required. [CLDR territory
   * code](http://www.unicode.org/repos/cldr/tags/latest/common/main/en.xml) or the country the
   * postal code group applies to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String regionCode;

  /**
   * Required. A range of postal codes.
   * @return value or {@code null} for none
   */
  public java.util.List<PostalCodeRange> getPostalCodes() {
    return postalCodes;
  }

  /**
   * Required. A range of postal codes.
   * @param postalCodes postalCodes or {@code null} for none
   */
  public PostalCodeArea setPostalCodes(java.util.List<PostalCodeRange> postalCodes) {
    this.postalCodes = postalCodes;
    return this;
  }

  /**
   * Required. [CLDR territory
   * code](http://www.unicode.org/repos/cldr/tags/latest/common/main/en.xml) or the country the
   * postal code group applies to.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegionCode() {
    return regionCode;
  }

  /**
   * Required. [CLDR territory
   * code](http://www.unicode.org/repos/cldr/tags/latest/common/main/en.xml) or the country the
   * postal code group applies to.
   * @param regionCode regionCode or {@code null} for none
   */
  public PostalCodeArea setRegionCode(java.lang.String regionCode) {
    this.regionCode = regionCode;
    return this;
  }

  @Override
  public PostalCodeArea set(String fieldName, Object value) {
    return (PostalCodeArea) super.set(fieldName, value);
  }

  @Override
  public PostalCodeArea clone() {
    return (PostalCodeArea) super.clone();
  }

}

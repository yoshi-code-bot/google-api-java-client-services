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

package com.google.api.services.chromemanagement.v1.model;

/**
 * Request to MoveThirdPartyProfileUser method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Chrome Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleChromeManagementVersionsV1MoveThirdPartyProfileUserRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. Destination organizational unit where the third party chrome profile user will be
   * moved to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String destinationOrgUnit;

  /**
   * Required. Destination organizational unit where the third party chrome profile user will be
   * moved to.
   * @return value or {@code null} for none
   */
  public java.lang.String getDestinationOrgUnit() {
    return destinationOrgUnit;
  }

  /**
   * Required. Destination organizational unit where the third party chrome profile user will be
   * moved to.
   * @param destinationOrgUnit destinationOrgUnit or {@code null} for none
   */
  public GoogleChromeManagementVersionsV1MoveThirdPartyProfileUserRequest setDestinationOrgUnit(java.lang.String destinationOrgUnit) {
    this.destinationOrgUnit = destinationOrgUnit;
    return this;
  }

  @Override
  public GoogleChromeManagementVersionsV1MoveThirdPartyProfileUserRequest set(String fieldName, Object value) {
    return (GoogleChromeManagementVersionsV1MoveThirdPartyProfileUserRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleChromeManagementVersionsV1MoveThirdPartyProfileUserRequest clone() {
    return (GoogleChromeManagementVersionsV1MoveThirdPartyProfileUserRequest) super.clone();
  }

}

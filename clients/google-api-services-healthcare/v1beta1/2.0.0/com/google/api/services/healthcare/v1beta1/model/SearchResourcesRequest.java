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

package com.google.api.services.healthcare.v1beta1.model;

/**
 * Request to search the resources in the specified FHIR store.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SearchResourcesRequest extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The FHIR resource type to search, such as Patient or Observation. For a complete
   * list, see the FHIR Resource Index ([DSTU2](https://hl7.org/fhir/DSTU2/resourcelist.html),
   * [STU3](https://hl7.org/fhir/STU3/resourcelist.html),
   * [R4](https://hl7.org/fhir/R4/resourcelist.html),
   * [R5](https://hl7.org/fhir/R5/resourcelist.html)).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceType;

  /**
   * Optional. The FHIR resource type to search, such as Patient or Observation. For a complete
   * list, see the FHIR Resource Index ([DSTU2](https://hl7.org/fhir/DSTU2/resourcelist.html),
   * [STU3](https://hl7.org/fhir/STU3/resourcelist.html),
   * [R4](https://hl7.org/fhir/R4/resourcelist.html),
   * [R5](https://hl7.org/fhir/R5/resourcelist.html)).
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceType() {
    return resourceType;
  }

  /**
   * Optional. The FHIR resource type to search, such as Patient or Observation. For a complete
   * list, see the FHIR Resource Index ([DSTU2](https://hl7.org/fhir/DSTU2/resourcelist.html),
   * [STU3](https://hl7.org/fhir/STU3/resourcelist.html),
   * [R4](https://hl7.org/fhir/R4/resourcelist.html),
   * [R5](https://hl7.org/fhir/R5/resourcelist.html)).
   * @param resourceType resourceType or {@code null} for none
   */
  public SearchResourcesRequest setResourceType(java.lang.String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  @Override
  public SearchResourcesRequest set(String fieldName, Object value) {
    return (SearchResourcesRequest) super.set(fieldName, value);
  }

  @Override
  public SearchResourcesRequest clone() {
    return (SearchResourcesRequest) super.clone();
  }

}

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

package com.google.api.services.healthcare.v1.model;

/**
 * The Consent resource name and error.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ConsentErrors extends com.google.api.client.json.GenericJson {

  /**
   * The error code and message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Status error;

  /**
   * The versioned name of the admin Consent resource, in the format `projects/{project_id}/location
   * s/{location}/datasets/{dataset_id}/fhirStores/{fhir_store_id}/fhir/Consent/{resource_id}/_histo
   * ry/{version_id}`. For FHIR stores with `disable_resource_versioning=true`, the format is `proje
   * cts/{project_id}/locations/{location}/datasets/{dataset_id}/fhirStores/{fhir_store_id}/fhir/Con
   * sent/{resource_id}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The error code and message.
   * @return value or {@code null} for none
   */
  public Status getError() {
    return error;
  }

  /**
   * The error code and message.
   * @param error error or {@code null} for none
   */
  public ConsentErrors setError(Status error) {
    this.error = error;
    return this;
  }

  /**
   * The versioned name of the admin Consent resource, in the format `projects/{project_id}/location
   * s/{location}/datasets/{dataset_id}/fhirStores/{fhir_store_id}/fhir/Consent/{resource_id}/_histo
   * ry/{version_id}`. For FHIR stores with `disable_resource_versioning=true`, the format is `proje
   * cts/{project_id}/locations/{location}/datasets/{dataset_id}/fhirStores/{fhir_store_id}/fhir/Con
   * sent/{resource_id}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The versioned name of the admin Consent resource, in the format `projects/{project_id}/location
   * s/{location}/datasets/{dataset_id}/fhirStores/{fhir_store_id}/fhir/Consent/{resource_id}/_histo
   * ry/{version_id}`. For FHIR stores with `disable_resource_versioning=true`, the format is `proje
   * cts/{project_id}/locations/{location}/datasets/{dataset_id}/fhirStores/{fhir_store_id}/fhir/Con
   * sent/{resource_id}`.
   * @param name name or {@code null} for none
   */
  public ConsentErrors setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public ConsentErrors set(String fieldName, Object value) {
    return (ConsentErrors) super.set(fieldName, value);
  }

  @Override
  public ConsentErrors clone() {
    return (ConsentErrors) super.clone();
  }

}

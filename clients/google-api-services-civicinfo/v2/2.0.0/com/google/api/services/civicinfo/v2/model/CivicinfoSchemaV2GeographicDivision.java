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

package com.google.api.services.civicinfo.v2.model;

/**
 * Describes a political geography.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Civic Information API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CivicinfoSchemaV2GeographicDivision extends com.google.api.client.json.GenericJson {

  /**
   * Any other valid OCD IDs that refer to the same division.\n\nBecause OCD IDs are meant to be
   * human-readable and at least somewhat predictable, there are occasionally several identifiers
   * for a single division. These identifiers are defined to be equivalent to one another, and one
   * is always indicated as the primary identifier. The primary identifier will be returned in
   * ocd_id above, and any other equivalent valid identifiers will be returned in this list.\n\nFor
   * example, if this division's OCD ID is ocd-division/country:us/district:dc, this will contain
   * ocd-division/country:us/state:dc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> alsoKnownAs;

  /**
   * The name of the division.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * List of indices in the offices array, one for each office elected from this division. Will only
   * be present if includeOffices was true (or absent) in the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Long> officeIndices;

  /**
   * Any other valid OCD IDs that refer to the same division.\n\nBecause OCD IDs are meant to be
   * human-readable and at least somewhat predictable, there are occasionally several identifiers
   * for a single division. These identifiers are defined to be equivalent to one another, and one
   * is always indicated as the primary identifier. The primary identifier will be returned in
   * ocd_id above, and any other equivalent valid identifiers will be returned in this list.\n\nFor
   * example, if this division's OCD ID is ocd-division/country:us/district:dc, this will contain
   * ocd-division/country:us/state:dc.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAlsoKnownAs() {
    return alsoKnownAs;
  }

  /**
   * Any other valid OCD IDs that refer to the same division.\n\nBecause OCD IDs are meant to be
   * human-readable and at least somewhat predictable, there are occasionally several identifiers
   * for a single division. These identifiers are defined to be equivalent to one another, and one
   * is always indicated as the primary identifier. The primary identifier will be returned in
   * ocd_id above, and any other equivalent valid identifiers will be returned in this list.\n\nFor
   * example, if this division's OCD ID is ocd-division/country:us/district:dc, this will contain
   * ocd-division/country:us/state:dc.
   * @param alsoKnownAs alsoKnownAs or {@code null} for none
   */
  public CivicinfoSchemaV2GeographicDivision setAlsoKnownAs(java.util.List<java.lang.String> alsoKnownAs) {
    this.alsoKnownAs = alsoKnownAs;
    return this;
  }

  /**
   * The name of the division.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the division.
   * @param name name or {@code null} for none
   */
  public CivicinfoSchemaV2GeographicDivision setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * List of indices in the offices array, one for each office elected from this division. Will only
   * be present if includeOffices was true (or absent) in the request.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Long> getOfficeIndices() {
    return officeIndices;
  }

  /**
   * List of indices in the offices array, one for each office elected from this division. Will only
   * be present if includeOffices was true (or absent) in the request.
   * @param officeIndices officeIndices or {@code null} for none
   */
  public CivicinfoSchemaV2GeographicDivision setOfficeIndices(java.util.List<java.lang.Long> officeIndices) {
    this.officeIndices = officeIndices;
    return this;
  }

  @Override
  public CivicinfoSchemaV2GeographicDivision set(String fieldName, Object value) {
    return (CivicinfoSchemaV2GeographicDivision) super.set(fieldName, value);
  }

  @Override
  public CivicinfoSchemaV2GeographicDivision clone() {
    return (CivicinfoSchemaV2GeographicDivision) super.clone();
  }

}

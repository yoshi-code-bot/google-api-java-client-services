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
 * Information about the election that was queried.
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
public final class CivicinfoSchemaV2Election extends com.google.api.client.json.GenericJson {

  /**
   * Day of the election in YYYY-MM-DD format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String electionDay;

  /**
   * The unique ID of this election.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * A displayable name for the election.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The political division of the election. Represented as an OCD Division ID. Voters within these
   * political jurisdictions are covered by this election. This is typically a state such as ocd-
   * division/country:us/state:ca or for the midterms or general election the entire US (i.e. ocd-
   * division/country:us).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ocdDivisionId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String shapeLookupBehavior;

  /**
   * Day of the election in YYYY-MM-DD format.
   * @return value or {@code null} for none
   */
  public java.lang.String getElectionDay() {
    return electionDay;
  }

  /**
   * Day of the election in YYYY-MM-DD format.
   * @param electionDay electionDay or {@code null} for none
   */
  public CivicinfoSchemaV2Election setElectionDay(java.lang.String electionDay) {
    this.electionDay = electionDay;
    return this;
  }

  /**
   * The unique ID of this election.
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * The unique ID of this election.
   * @param id id or {@code null} for none
   */
  public CivicinfoSchemaV2Election setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * A displayable name for the election.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * A displayable name for the election.
   * @param name name or {@code null} for none
   */
  public CivicinfoSchemaV2Election setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The political division of the election. Represented as an OCD Division ID. Voters within these
   * political jurisdictions are covered by this election. This is typically a state such as ocd-
   * division/country:us/state:ca or for the midterms or general election the entire US (i.e. ocd-
   * division/country:us).
   * @return value or {@code null} for none
   */
  public java.lang.String getOcdDivisionId() {
    return ocdDivisionId;
  }

  /**
   * The political division of the election. Represented as an OCD Division ID. Voters within these
   * political jurisdictions are covered by this election. This is typically a state such as ocd-
   * division/country:us/state:ca or for the midterms or general election the entire US (i.e. ocd-
   * division/country:us).
   * @param ocdDivisionId ocdDivisionId or {@code null} for none
   */
  public CivicinfoSchemaV2Election setOcdDivisionId(java.lang.String ocdDivisionId) {
    this.ocdDivisionId = ocdDivisionId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getShapeLookupBehavior() {
    return shapeLookupBehavior;
  }

  /**
   * @param shapeLookupBehavior shapeLookupBehavior or {@code null} for none
   */
  public CivicinfoSchemaV2Election setShapeLookupBehavior(java.lang.String shapeLookupBehavior) {
    this.shapeLookupBehavior = shapeLookupBehavior;
    return this;
  }

  @Override
  public CivicinfoSchemaV2Election set(String fieldName, Object value) {
    return (CivicinfoSchemaV2Election) super.set(fieldName, value);
  }

  @Override
  public CivicinfoSchemaV2Election clone() {
    return (CivicinfoSchemaV2Election) super.clone();
  }

}

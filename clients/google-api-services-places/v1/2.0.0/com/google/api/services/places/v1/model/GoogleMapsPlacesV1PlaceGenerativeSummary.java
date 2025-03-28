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

package com.google.api.services.places.v1.model;

/**
 * Experimental: See https://developers.google.com/maps/documentation/places/web-
 * service/experimental/places-generative for more details. AI-generated summary of the place.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Places API (New). For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleMapsPlacesV1PlaceGenerativeSummary extends com.google.api.client.json.GenericJson {

  /**
   * The detailed description of the place.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleTypeLocalizedText description;

  /**
   * A link where users can flag a problem with the description summary.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String descriptionFlagContentUri;

  /**
   * The overview of the place.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleTypeLocalizedText overview;

  /**
   * A link where users can flag a problem with the overview summary.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String overviewFlagContentUri;

  /**
   * References that are used to generate the summary description.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleMapsPlacesV1References references;

  /**
   * The detailed description of the place.
   * @return value or {@code null} for none
   */
  public GoogleTypeLocalizedText getDescription() {
    return description;
  }

  /**
   * The detailed description of the place.
   * @param description description or {@code null} for none
   */
  public GoogleMapsPlacesV1PlaceGenerativeSummary setDescription(GoogleTypeLocalizedText description) {
    this.description = description;
    return this;
  }

  /**
   * A link where users can flag a problem with the description summary.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescriptionFlagContentUri() {
    return descriptionFlagContentUri;
  }

  /**
   * A link where users can flag a problem with the description summary.
   * @param descriptionFlagContentUri descriptionFlagContentUri or {@code null} for none
   */
  public GoogleMapsPlacesV1PlaceGenerativeSummary setDescriptionFlagContentUri(java.lang.String descriptionFlagContentUri) {
    this.descriptionFlagContentUri = descriptionFlagContentUri;
    return this;
  }

  /**
   * The overview of the place.
   * @return value or {@code null} for none
   */
  public GoogleTypeLocalizedText getOverview() {
    return overview;
  }

  /**
   * The overview of the place.
   * @param overview overview or {@code null} for none
   */
  public GoogleMapsPlacesV1PlaceGenerativeSummary setOverview(GoogleTypeLocalizedText overview) {
    this.overview = overview;
    return this;
  }

  /**
   * A link where users can flag a problem with the overview summary.
   * @return value or {@code null} for none
   */
  public java.lang.String getOverviewFlagContentUri() {
    return overviewFlagContentUri;
  }

  /**
   * A link where users can flag a problem with the overview summary.
   * @param overviewFlagContentUri overviewFlagContentUri or {@code null} for none
   */
  public GoogleMapsPlacesV1PlaceGenerativeSummary setOverviewFlagContentUri(java.lang.String overviewFlagContentUri) {
    this.overviewFlagContentUri = overviewFlagContentUri;
    return this;
  }

  /**
   * References that are used to generate the summary description.
   * @return value or {@code null} for none
   */
  public GoogleMapsPlacesV1References getReferences() {
    return references;
  }

  /**
   * References that are used to generate the summary description.
   * @param references references or {@code null} for none
   */
  public GoogleMapsPlacesV1PlaceGenerativeSummary setReferences(GoogleMapsPlacesV1References references) {
    this.references = references;
    return this;
  }

  @Override
  public GoogleMapsPlacesV1PlaceGenerativeSummary set(String fieldName, Object value) {
    return (GoogleMapsPlacesV1PlaceGenerativeSummary) super.set(fieldName, value);
  }

  @Override
  public GoogleMapsPlacesV1PlaceGenerativeSummary clone() {
    return (GoogleMapsPlacesV1PlaceGenerativeSummary) super.clone();
  }

}

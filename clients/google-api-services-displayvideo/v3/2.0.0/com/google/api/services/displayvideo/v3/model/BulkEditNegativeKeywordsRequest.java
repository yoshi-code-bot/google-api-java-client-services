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

package com.google.api.services.displayvideo.v3.model;

/**
 * Request message for NegativeKeywordService.BulkEditNegativeKeywords.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Display & Video 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BulkEditNegativeKeywordsRequest extends com.google.api.client.json.GenericJson {

  /**
   * The negative keywords to create in batch, specified as a list of NegativeKeywords.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<NegativeKeyword> createdNegativeKeywords;

  /**
   * The negative keywords to delete in batch, specified as a list of keyword_values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> deletedNegativeKeywords;

  /**
   * The negative keywords to create in batch, specified as a list of NegativeKeywords.
   * @return value or {@code null} for none
   */
  public java.util.List<NegativeKeyword> getCreatedNegativeKeywords() {
    return createdNegativeKeywords;
  }

  /**
   * The negative keywords to create in batch, specified as a list of NegativeKeywords.
   * @param createdNegativeKeywords createdNegativeKeywords or {@code null} for none
   */
  public BulkEditNegativeKeywordsRequest setCreatedNegativeKeywords(java.util.List<NegativeKeyword> createdNegativeKeywords) {
    this.createdNegativeKeywords = createdNegativeKeywords;
    return this;
  }

  /**
   * The negative keywords to delete in batch, specified as a list of keyword_values.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDeletedNegativeKeywords() {
    return deletedNegativeKeywords;
  }

  /**
   * The negative keywords to delete in batch, specified as a list of keyword_values.
   * @param deletedNegativeKeywords deletedNegativeKeywords or {@code null} for none
   */
  public BulkEditNegativeKeywordsRequest setDeletedNegativeKeywords(java.util.List<java.lang.String> deletedNegativeKeywords) {
    this.deletedNegativeKeywords = deletedNegativeKeywords;
    return this;
  }

  @Override
  public BulkEditNegativeKeywordsRequest set(String fieldName, Object value) {
    return (BulkEditNegativeKeywordsRequest) super.set(fieldName, value);
  }

  @Override
  public BulkEditNegativeKeywordsRequest clone() {
    return (BulkEditNegativeKeywordsRequest) super.clone();
  }

}

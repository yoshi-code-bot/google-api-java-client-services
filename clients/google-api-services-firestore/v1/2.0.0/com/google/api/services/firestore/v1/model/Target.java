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

package com.google.api.services.firestore.v1.model;

/**
 * A specification of a set of documents to listen to.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Firestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Target extends com.google.api.client.json.GenericJson {

  /**
   * A target specified by a set of document names.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DocumentsTarget documents;

  /**
   * The number of documents that last matched the query at the resume token or read time. This
   * value is only relevant when a `resume_type` is provided. This value being present and greater
   * than zero signals that the client wants `ExistenceFilter.unchanged_names` to be included in the
   * response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer expectedCount;

  /**
   * If the target should be removed once it is current and consistent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean once;

  /**
   * A target specified by a query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private QueryTarget query;

  /**
   * Start listening after a specific `read_time`. The client must know the state of matching
   * documents at this time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String readTime;

  /**
   * A resume token from a prior TargetChange for an identical target. Using a resume token with a
   * different target is unsupported and may fail.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resumeToken;

  /**
   * The target ID that identifies the target on the stream. Must be a positive number and non-zero.
   * If `target_id` is 0 (or unspecified), the server will assign an ID for this target and return
   * that in a `TargetChange::ADD` event. Once a target with `target_id=0` is added, all subsequent
   * targets must also have `target_id=0`. If an `AddTarget` request with `target_id != 0` is sent
   * to the server after a target with `target_id=0` is added, the server will immediately send a
   * response with a `TargetChange::Remove` event. Note that if the client sends multiple
   * `AddTarget` requests without an ID, the order of IDs returned in `TargetChange.target_ids` are
   * undefined. Therefore, clients should provide a target ID instead of relying on the server to
   * assign one. If `target_id` is non-zero, there must not be an existing active target on this
   * stream with the same ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer targetId;

  /**
   * A target specified by a set of document names.
   * @return value or {@code null} for none
   */
  public DocumentsTarget getDocuments() {
    return documents;
  }

  /**
   * A target specified by a set of document names.
   * @param documents documents or {@code null} for none
   */
  public Target setDocuments(DocumentsTarget documents) {
    this.documents = documents;
    return this;
  }

  /**
   * The number of documents that last matched the query at the resume token or read time. This
   * value is only relevant when a `resume_type` is provided. This value being present and greater
   * than zero signals that the client wants `ExistenceFilter.unchanged_names` to be included in the
   * response.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getExpectedCount() {
    return expectedCount;
  }

  /**
   * The number of documents that last matched the query at the resume token or read time. This
   * value is only relevant when a `resume_type` is provided. This value being present and greater
   * than zero signals that the client wants `ExistenceFilter.unchanged_names` to be included in the
   * response.
   * @param expectedCount expectedCount or {@code null} for none
   */
  public Target setExpectedCount(java.lang.Integer expectedCount) {
    this.expectedCount = expectedCount;
    return this;
  }

  /**
   * If the target should be removed once it is current and consistent.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getOnce() {
    return once;
  }

  /**
   * If the target should be removed once it is current and consistent.
   * @param once once or {@code null} for none
   */
  public Target setOnce(java.lang.Boolean once) {
    this.once = once;
    return this;
  }

  /**
   * A target specified by a query.
   * @return value or {@code null} for none
   */
  public QueryTarget getQuery() {
    return query;
  }

  /**
   * A target specified by a query.
   * @param query query or {@code null} for none
   */
  public Target setQuery(QueryTarget query) {
    this.query = query;
    return this;
  }

  /**
   * Start listening after a specific `read_time`. The client must know the state of matching
   * documents at this time.
   * @return value or {@code null} for none
   */
  public String getReadTime() {
    return readTime;
  }

  /**
   * Start listening after a specific `read_time`. The client must know the state of matching
   * documents at this time.
   * @param readTime readTime or {@code null} for none
   */
  public Target setReadTime(String readTime) {
    this.readTime = readTime;
    return this;
  }

  /**
   * A resume token from a prior TargetChange for an identical target. Using a resume token with a
   * different target is unsupported and may fail.
   * @see #decodeResumeToken()
   * @return value or {@code null} for none
   */
  public java.lang.String getResumeToken() {
    return resumeToken;
  }

  /**
   * A resume token from a prior TargetChange for an identical target. Using a resume token with a
   * different target is unsupported and may fail.
   * @see #getResumeToken()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeResumeToken() {
    return com.google.api.client.util.Base64.decodeBase64(resumeToken);
  }

  /**
   * A resume token from a prior TargetChange for an identical target. Using a resume token with a
   * different target is unsupported and may fail.
   * @see #encodeResumeToken()
   * @param resumeToken resumeToken or {@code null} for none
   */
  public Target setResumeToken(java.lang.String resumeToken) {
    this.resumeToken = resumeToken;
    return this;
  }

  /**
   * A resume token from a prior TargetChange for an identical target. Using a resume token with a
   * different target is unsupported and may fail.
   * @see #setResumeToken()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public Target encodeResumeToken(byte[] resumeToken) {
    this.resumeToken = com.google.api.client.util.Base64.encodeBase64URLSafeString(resumeToken);
    return this;
  }

  /**
   * The target ID that identifies the target on the stream. Must be a positive number and non-zero.
   * If `target_id` is 0 (or unspecified), the server will assign an ID for this target and return
   * that in a `TargetChange::ADD` event. Once a target with `target_id=0` is added, all subsequent
   * targets must also have `target_id=0`. If an `AddTarget` request with `target_id != 0` is sent
   * to the server after a target with `target_id=0` is added, the server will immediately send a
   * response with a `TargetChange::Remove` event. Note that if the client sends multiple
   * `AddTarget` requests without an ID, the order of IDs returned in `TargetChange.target_ids` are
   * undefined. Therefore, clients should provide a target ID instead of relying on the server to
   * assign one. If `target_id` is non-zero, there must not be an existing active target on this
   * stream with the same ID.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTargetId() {
    return targetId;
  }

  /**
   * The target ID that identifies the target on the stream. Must be a positive number and non-zero.
   * If `target_id` is 0 (or unspecified), the server will assign an ID for this target and return
   * that in a `TargetChange::ADD` event. Once a target with `target_id=0` is added, all subsequent
   * targets must also have `target_id=0`. If an `AddTarget` request with `target_id != 0` is sent
   * to the server after a target with `target_id=0` is added, the server will immediately send a
   * response with a `TargetChange::Remove` event. Note that if the client sends multiple
   * `AddTarget` requests without an ID, the order of IDs returned in `TargetChange.target_ids` are
   * undefined. Therefore, clients should provide a target ID instead of relying on the server to
   * assign one. If `target_id` is non-zero, there must not be an existing active target on this
   * stream with the same ID.
   * @param targetId targetId or {@code null} for none
   */
  public Target setTargetId(java.lang.Integer targetId) {
    this.targetId = targetId;
    return this;
  }

  @Override
  public Target set(String fieldName, Object value) {
    return (Target) super.set(fieldName, value);
  }

  @Override
  public Target clone() {
    return (Target) super.clone();
  }

}

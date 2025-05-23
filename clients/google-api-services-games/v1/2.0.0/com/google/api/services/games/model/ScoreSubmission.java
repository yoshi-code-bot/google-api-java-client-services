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

package com.google.api.services.games.model;

/**
 * A request to submit a score to leaderboards.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Games Services API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ScoreSubmission extends com.google.api.client.json.GenericJson {

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * `games#scoreSubmission`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The leaderboard this score is being submitted to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String leaderboardId;

  /**
   * The new score being submitted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long score;

  /**
   * Additional information about this score. Values will contain no more than 64 URI-safe
   * characters as defined by section 2.3 of RFC 3986.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String scoreTag;

  /**
   * Signature Values will contain URI-safe characters as defined by section 2.3 of RFC 3986.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String signature;

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * `games#scoreSubmission`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * `games#scoreSubmission`.
   * @param kind kind or {@code null} for none
   */
  public ScoreSubmission setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The leaderboard this score is being submitted to.
   * @return value or {@code null} for none
   */
  public java.lang.String getLeaderboardId() {
    return leaderboardId;
  }

  /**
   * The leaderboard this score is being submitted to.
   * @param leaderboardId leaderboardId or {@code null} for none
   */
  public ScoreSubmission setLeaderboardId(java.lang.String leaderboardId) {
    this.leaderboardId = leaderboardId;
    return this;
  }

  /**
   * The new score being submitted.
   * @return value or {@code null} for none
   */
  public java.lang.Long getScore() {
    return score;
  }

  /**
   * The new score being submitted.
   * @param score score or {@code null} for none
   */
  public ScoreSubmission setScore(java.lang.Long score) {
    this.score = score;
    return this;
  }

  /**
   * Additional information about this score. Values will contain no more than 64 URI-safe
   * characters as defined by section 2.3 of RFC 3986.
   * @return value or {@code null} for none
   */
  public java.lang.String getScoreTag() {
    return scoreTag;
  }

  /**
   * Additional information about this score. Values will contain no more than 64 URI-safe
   * characters as defined by section 2.3 of RFC 3986.
   * @param scoreTag scoreTag or {@code null} for none
   */
  public ScoreSubmission setScoreTag(java.lang.String scoreTag) {
    this.scoreTag = scoreTag;
    return this;
  }

  /**
   * Signature Values will contain URI-safe characters as defined by section 2.3 of RFC 3986.
   * @return value or {@code null} for none
   */
  public java.lang.String getSignature() {
    return signature;
  }

  /**
   * Signature Values will contain URI-safe characters as defined by section 2.3 of RFC 3986.
   * @param signature signature or {@code null} for none
   */
  public ScoreSubmission setSignature(java.lang.String signature) {
    this.signature = signature;
    return this;
  }

  @Override
  public ScoreSubmission set(String fieldName, Object value) {
    return (ScoreSubmission) super.set(fieldName, value);
  }

  @Override
  public ScoreSubmission clone() {
    return (ScoreSubmission) super.clone();
  }

}

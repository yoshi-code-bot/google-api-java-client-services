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
 * A list of player leaderboard scores.
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
public final class PlayerLeaderboardScoreListResponse extends com.google.api.client.json.GenericJson {

  /**
   * The leaderboard scores.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PlayerLeaderboardScore> items;

  static {
    // hack to force ProGuard to consider PlayerLeaderboardScore used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(PlayerLeaderboardScore.class);
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * `games#playerLeaderboardScoreListResponse`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The pagination token for the next page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The Player resources for the owner of this score.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Player player;

  /**
   * The leaderboard scores.
   * @return value or {@code null} for none
   */
  public java.util.List<PlayerLeaderboardScore> getItems() {
    return items;
  }

  /**
   * The leaderboard scores.
   * @param items items or {@code null} for none
   */
  public PlayerLeaderboardScoreListResponse setItems(java.util.List<PlayerLeaderboardScore> items) {
    this.items = items;
    return this;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * `games#playerLeaderboardScoreListResponse`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * `games#playerLeaderboardScoreListResponse`.
   * @param kind kind or {@code null} for none
   */
  public PlayerLeaderboardScoreListResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The pagination token for the next page of results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The pagination token for the next page of results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public PlayerLeaderboardScoreListResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The Player resources for the owner of this score.
   * @return value or {@code null} for none
   */
  public Player getPlayer() {
    return player;
  }

  /**
   * The Player resources for the owner of this score.
   * @param player player or {@code null} for none
   */
  public PlayerLeaderboardScoreListResponse setPlayer(Player player) {
    this.player = player;
    return this;
  }

  @Override
  public PlayerLeaderboardScoreListResponse set(String fieldName, Object value) {
    return (PlayerLeaderboardScoreListResponse) super.set(fieldName, value);
  }

  @Override
  public PlayerLeaderboardScoreListResponse clone() {
    return (PlayerLeaderboardScoreListResponse) super.clone();
  }

}

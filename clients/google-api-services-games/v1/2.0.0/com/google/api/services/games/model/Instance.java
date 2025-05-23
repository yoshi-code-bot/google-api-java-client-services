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
 * The Instance resource.
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
public final class Instance extends com.google.api.client.json.GenericJson {

  /**
   * URI which shows where a user can acquire this instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String acquisitionUri;

  /**
   * Platform dependent details for Android.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InstanceAndroidDetails androidInstance;

  /**
   * Platform dependent details for iOS.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InstanceIosDetails iosInstance;

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * `games#instance`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Localized display name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The platform type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String platformType;

  /**
   * Flag to show if this game instance supports realtime play.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean realtimePlay;

  /**
   * Flag to show if this game instance supports turn based play.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean turnBasedPlay;

  /**
   * Platform dependent details for Web.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InstanceWebDetails webInstance;

  /**
   * URI which shows where a user can acquire this instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getAcquisitionUri() {
    return acquisitionUri;
  }

  /**
   * URI which shows where a user can acquire this instance.
   * @param acquisitionUri acquisitionUri or {@code null} for none
   */
  public Instance setAcquisitionUri(java.lang.String acquisitionUri) {
    this.acquisitionUri = acquisitionUri;
    return this;
  }

  /**
   * Platform dependent details for Android.
   * @return value or {@code null} for none
   */
  public InstanceAndroidDetails getAndroidInstance() {
    return androidInstance;
  }

  /**
   * Platform dependent details for Android.
   * @param androidInstance androidInstance or {@code null} for none
   */
  public Instance setAndroidInstance(InstanceAndroidDetails androidInstance) {
    this.androidInstance = androidInstance;
    return this;
  }

  /**
   * Platform dependent details for iOS.
   * @return value or {@code null} for none
   */
  public InstanceIosDetails getIosInstance() {
    return iosInstance;
  }

  /**
   * Platform dependent details for iOS.
   * @param iosInstance iosInstance or {@code null} for none
   */
  public Instance setIosInstance(InstanceIosDetails iosInstance) {
    this.iosInstance = iosInstance;
    return this;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * `games#instance`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * `games#instance`.
   * @param kind kind or {@code null} for none
   */
  public Instance setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Localized display name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Localized display name.
   * @param name name or {@code null} for none
   */
  public Instance setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The platform type.
   * @return value or {@code null} for none
   */
  public java.lang.String getPlatformType() {
    return platformType;
  }

  /**
   * The platform type.
   * @param platformType platformType or {@code null} for none
   */
  public Instance setPlatformType(java.lang.String platformType) {
    this.platformType = platformType;
    return this;
  }

  /**
   * Flag to show if this game instance supports realtime play.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRealtimePlay() {
    return realtimePlay;
  }

  /**
   * Flag to show if this game instance supports realtime play.
   * @param realtimePlay realtimePlay or {@code null} for none
   */
  public Instance setRealtimePlay(java.lang.Boolean realtimePlay) {
    this.realtimePlay = realtimePlay;
    return this;
  }

  /**
   * Flag to show if this game instance supports turn based play.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getTurnBasedPlay() {
    return turnBasedPlay;
  }

  /**
   * Flag to show if this game instance supports turn based play.
   * @param turnBasedPlay turnBasedPlay or {@code null} for none
   */
  public Instance setTurnBasedPlay(java.lang.Boolean turnBasedPlay) {
    this.turnBasedPlay = turnBasedPlay;
    return this;
  }

  /**
   * Platform dependent details for Web.
   * @return value or {@code null} for none
   */
  public InstanceWebDetails getWebInstance() {
    return webInstance;
  }

  /**
   * Platform dependent details for Web.
   * @param webInstance webInstance or {@code null} for none
   */
  public Instance setWebInstance(InstanceWebDetails webInstance) {
    this.webInstance = webInstance;
    return this;
  }

  @Override
  public Instance set(String fieldName, Object value) {
    return (Instance) super.set(fieldName, value);
  }

  @Override
  public Instance clone() {
    return (Instance) super.clone();
  }

}

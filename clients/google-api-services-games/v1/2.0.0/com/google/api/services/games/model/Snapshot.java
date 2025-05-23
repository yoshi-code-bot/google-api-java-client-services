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
 * An snapshot object.
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
public final class Snapshot extends com.google.api.client.json.GenericJson {

  /**
   * The cover image of this snapshot. May be absent if there is no image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SnapshotImage coverImage;

  /**
   * The description of this snapshot.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The ID of the file underlying this snapshot in the Drive API. Only present if the snapshot is a
   * view on a Drive file and the file is owned by the caller.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String driveId;

  /**
   * The duration associated with this snapshot, in millis.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long durationMillis;

  /**
   * The ID of the snapshot.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * `games#snapshot`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The timestamp (in millis since Unix epoch) of the last modification to this snapshot.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long lastModifiedMillis;

  /**
   * The progress value (64-bit integer set by developer) associated with this snapshot.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long progressValue;

  /**
   * The title of this snapshot.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The type of this snapshot.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The unique name provided when the snapshot was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uniqueName;

  /**
   * The cover image of this snapshot. May be absent if there is no image.
   * @return value or {@code null} for none
   */
  public SnapshotImage getCoverImage() {
    return coverImage;
  }

  /**
   * The cover image of this snapshot. May be absent if there is no image.
   * @param coverImage coverImage or {@code null} for none
   */
  public Snapshot setCoverImage(SnapshotImage coverImage) {
    this.coverImage = coverImage;
    return this;
  }

  /**
   * The description of this snapshot.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * The description of this snapshot.
   * @param description description or {@code null} for none
   */
  public Snapshot setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The ID of the file underlying this snapshot in the Drive API. Only present if the snapshot is a
   * view on a Drive file and the file is owned by the caller.
   * @return value or {@code null} for none
   */
  public java.lang.String getDriveId() {
    return driveId;
  }

  /**
   * The ID of the file underlying this snapshot in the Drive API. Only present if the snapshot is a
   * view on a Drive file and the file is owned by the caller.
   * @param driveId driveId or {@code null} for none
   */
  public Snapshot setDriveId(java.lang.String driveId) {
    this.driveId = driveId;
    return this;
  }

  /**
   * The duration associated with this snapshot, in millis.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDurationMillis() {
    return durationMillis;
  }

  /**
   * The duration associated with this snapshot, in millis.
   * @param durationMillis durationMillis or {@code null} for none
   */
  public Snapshot setDurationMillis(java.lang.Long durationMillis) {
    this.durationMillis = durationMillis;
    return this;
  }

  /**
   * The ID of the snapshot.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The ID of the snapshot.
   * @param id id or {@code null} for none
   */
  public Snapshot setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * `games#snapshot`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * `games#snapshot`.
   * @param kind kind or {@code null} for none
   */
  public Snapshot setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The timestamp (in millis since Unix epoch) of the last modification to this snapshot.
   * @return value or {@code null} for none
   */
  public java.lang.Long getLastModifiedMillis() {
    return lastModifiedMillis;
  }

  /**
   * The timestamp (in millis since Unix epoch) of the last modification to this snapshot.
   * @param lastModifiedMillis lastModifiedMillis or {@code null} for none
   */
  public Snapshot setLastModifiedMillis(java.lang.Long lastModifiedMillis) {
    this.lastModifiedMillis = lastModifiedMillis;
    return this;
  }

  /**
   * The progress value (64-bit integer set by developer) associated with this snapshot.
   * @return value or {@code null} for none
   */
  public java.lang.Long getProgressValue() {
    return progressValue;
  }

  /**
   * The progress value (64-bit integer set by developer) associated with this snapshot.
   * @param progressValue progressValue or {@code null} for none
   */
  public Snapshot setProgressValue(java.lang.Long progressValue) {
    this.progressValue = progressValue;
    return this;
  }

  /**
   * The title of this snapshot.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The title of this snapshot.
   * @param title title or {@code null} for none
   */
  public Snapshot setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * The type of this snapshot.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of this snapshot.
   * @param type type or {@code null} for none
   */
  public Snapshot setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * The unique name provided when the snapshot was created.
   * @return value or {@code null} for none
   */
  public java.lang.String getUniqueName() {
    return uniqueName;
  }

  /**
   * The unique name provided when the snapshot was created.
   * @param uniqueName uniqueName or {@code null} for none
   */
  public Snapshot setUniqueName(java.lang.String uniqueName) {
    this.uniqueName = uniqueName;
    return this;
  }

  @Override
  public Snapshot set(String fieldName, Object value) {
    return (Snapshot) super.set(fieldName, value);
  }

  @Override
  public Snapshot clone() {
    return (Snapshot) super.clone();
  }

}

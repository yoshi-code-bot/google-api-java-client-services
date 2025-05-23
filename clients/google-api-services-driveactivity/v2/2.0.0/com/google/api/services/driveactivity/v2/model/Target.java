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

package com.google.api.services.driveactivity.v2.model;

/**
 * Information about the target of activity. For more information on how activity history is shared
 * with users, see [Activity history
 * visibility](https://developers.google.com/workspace/drive/activity/v2#activityhistory).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Drive Activity API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Target extends com.google.api.client.json.GenericJson {

  /**
   * The target is a shared drive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Drive drive;

  /**
   * The target is a Drive item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DriveItem driveItem;

  /**
   * The target is a comment on a Drive file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FileComment fileComment;

  /**
   * This field is deprecated; please use the `drive` field instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TeamDrive teamDrive;

  /**
   * The target is a shared drive.
   * @return value or {@code null} for none
   */
  public Drive getDrive() {
    return drive;
  }

  /**
   * The target is a shared drive.
   * @param drive drive or {@code null} for none
   */
  public Target setDrive(Drive drive) {
    this.drive = drive;
    return this;
  }

  /**
   * The target is a Drive item.
   * @return value or {@code null} for none
   */
  public DriveItem getDriveItem() {
    return driveItem;
  }

  /**
   * The target is a Drive item.
   * @param driveItem driveItem or {@code null} for none
   */
  public Target setDriveItem(DriveItem driveItem) {
    this.driveItem = driveItem;
    return this;
  }

  /**
   * The target is a comment on a Drive file.
   * @return value or {@code null} for none
   */
  public FileComment getFileComment() {
    return fileComment;
  }

  /**
   * The target is a comment on a Drive file.
   * @param fileComment fileComment or {@code null} for none
   */
  public Target setFileComment(FileComment fileComment) {
    this.fileComment = fileComment;
    return this;
  }

  /**
   * This field is deprecated; please use the `drive` field instead.
   * @return value or {@code null} for none
   */
  public TeamDrive getTeamDrive() {
    return teamDrive;
  }

  /**
   * This field is deprecated; please use the `drive` field instead.
   * @param teamDrive teamDrive or {@code null} for none
   */
  public Target setTeamDrive(TeamDrive teamDrive) {
    this.teamDrive = teamDrive;
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

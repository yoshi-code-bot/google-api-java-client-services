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

package com.google.api.services.vault.v1.model;

/**
 * Additional options for Drive search.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Vault API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DriveOptions extends com.google.api.client.json.GenericJson {

  /**
   * Set whether the results include only content encrypted with [Google Workspace Client-side
   * encryption](https://support.google.com/a?p=cse_ov) content, only unencrypted content, or both.
   * Defaults to both. Currently supported for Drive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clientSideEncryptedOption;

  /**
   * Set to **true** to include shared drives.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean includeSharedDrives;

  /**
   * Set to true to include Team Drive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean includeTeamDrives;

  /**
   * Optional. Options to include or exclude documents in shared drives. We recommend using this
   * field over include_shared_drives. This field overrides include_shared_drives and
   * include_team_drives when set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sharedDrivesOption;

  /**
   * Search the current version of the Drive file, but export the contents of the last version saved
   * before 12:00 AM UTC on the specified date. Enter the date in UTC.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String versionDate;

  /**
   * Set whether the results include only content encrypted with [Google Workspace Client-side
   * encryption](https://support.google.com/a?p=cse_ov) content, only unencrypted content, or both.
   * Defaults to both. Currently supported for Drive.
   * @return value or {@code null} for none
   */
  public java.lang.String getClientSideEncryptedOption() {
    return clientSideEncryptedOption;
  }

  /**
   * Set whether the results include only content encrypted with [Google Workspace Client-side
   * encryption](https://support.google.com/a?p=cse_ov) content, only unencrypted content, or both.
   * Defaults to both. Currently supported for Drive.
   * @param clientSideEncryptedOption clientSideEncryptedOption or {@code null} for none
   */
  public DriveOptions setClientSideEncryptedOption(java.lang.String clientSideEncryptedOption) {
    this.clientSideEncryptedOption = clientSideEncryptedOption;
    return this;
  }

  /**
   * Set to **true** to include shared drives.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIncludeSharedDrives() {
    return includeSharedDrives;
  }

  /**
   * Set to **true** to include shared drives.
   * @param includeSharedDrives includeSharedDrives or {@code null} for none
   */
  public DriveOptions setIncludeSharedDrives(java.lang.Boolean includeSharedDrives) {
    this.includeSharedDrives = includeSharedDrives;
    return this;
  }

  /**
   * Set to true to include Team Drive.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIncludeTeamDrives() {
    return includeTeamDrives;
  }

  /**
   * Set to true to include Team Drive.
   * @param includeTeamDrives includeTeamDrives or {@code null} for none
   */
  public DriveOptions setIncludeTeamDrives(java.lang.Boolean includeTeamDrives) {
    this.includeTeamDrives = includeTeamDrives;
    return this;
  }

  /**
   * Optional. Options to include or exclude documents in shared drives. We recommend using this
   * field over include_shared_drives. This field overrides include_shared_drives and
   * include_team_drives when set.
   * @return value or {@code null} for none
   */
  public java.lang.String getSharedDrivesOption() {
    return sharedDrivesOption;
  }

  /**
   * Optional. Options to include or exclude documents in shared drives. We recommend using this
   * field over include_shared_drives. This field overrides include_shared_drives and
   * include_team_drives when set.
   * @param sharedDrivesOption sharedDrivesOption or {@code null} for none
   */
  public DriveOptions setSharedDrivesOption(java.lang.String sharedDrivesOption) {
    this.sharedDrivesOption = sharedDrivesOption;
    return this;
  }

  /**
   * Search the current version of the Drive file, but export the contents of the last version saved
   * before 12:00 AM UTC on the specified date. Enter the date in UTC.
   * @return value or {@code null} for none
   */
  public String getVersionDate() {
    return versionDate;
  }

  /**
   * Search the current version of the Drive file, but export the contents of the last version saved
   * before 12:00 AM UTC on the specified date. Enter the date in UTC.
   * @param versionDate versionDate or {@code null} for none
   */
  public DriveOptions setVersionDate(String versionDate) {
    this.versionDate = versionDate;
    return this;
  }

  @Override
  public DriveOptions set(String fieldName, Object value) {
    return (DriveOptions) super.set(fieldName, value);
  }

  @Override
  public DriveOptions clone() {
    return (DriveOptions) super.clone();
  }

}

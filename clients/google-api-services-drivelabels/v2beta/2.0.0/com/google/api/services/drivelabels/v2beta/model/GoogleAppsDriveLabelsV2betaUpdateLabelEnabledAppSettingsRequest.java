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

package com.google.api.services.drivelabels.v2beta.model;

/**
 * Request to update the `EnabledAppSettings` of the given Label. This change is not revisioned,
 * does not require publishing, and takes effect immediately. \
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Drive Labels API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAppsDriveLabelsV2betaUpdateLabelEnabledAppSettingsRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The new `EnabledAppSettings` value for the Label.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsDriveLabelsV2betaLabelEnabledAppSettings enabledAppSettings;

  /**
   * Optional. The BCP-47 language code to use for evaluating localized field labels. When not
   * specified, values in the default configured language will be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String languageCode;

  /**
   * Optional. Set to `true` in order to use the user's admin credentials. The server will verify
   * the user is an admin for the Label before allowing access.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean useAdminAccess;

  /**
   * Optional. When specified, only certain fields belonging to the indicated view will be returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String view;

  /**
   * Required. The new `EnabledAppSettings` value for the Label.
   * @return value or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaLabelEnabledAppSettings getEnabledAppSettings() {
    return enabledAppSettings;
  }

  /**
   * Required. The new `EnabledAppSettings` value for the Label.
   * @param enabledAppSettings enabledAppSettings or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaUpdateLabelEnabledAppSettingsRequest setEnabledAppSettings(GoogleAppsDriveLabelsV2betaLabelEnabledAppSettings enabledAppSettings) {
    this.enabledAppSettings = enabledAppSettings;
    return this;
  }

  /**
   * Optional. The BCP-47 language code to use for evaluating localized field labels. When not
   * specified, values in the default configured language will be used.
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguageCode() {
    return languageCode;
  }

  /**
   * Optional. The BCP-47 language code to use for evaluating localized field labels. When not
   * specified, values in the default configured language will be used.
   * @param languageCode languageCode or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaUpdateLabelEnabledAppSettingsRequest setLanguageCode(java.lang.String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * Optional. Set to `true` in order to use the user's admin credentials. The server will verify
   * the user is an admin for the Label before allowing access.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUseAdminAccess() {
    return useAdminAccess;
  }

  /**
   * Optional. Set to `true` in order to use the user's admin credentials. The server will verify
   * the user is an admin for the Label before allowing access.
   * @param useAdminAccess useAdminAccess or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaUpdateLabelEnabledAppSettingsRequest setUseAdminAccess(java.lang.Boolean useAdminAccess) {
    this.useAdminAccess = useAdminAccess;
    return this;
  }

  /**
   * Optional. When specified, only certain fields belonging to the indicated view will be returned.
   * @return value or {@code null} for none
   */
  public java.lang.String getView() {
    return view;
  }

  /**
   * Optional. When specified, only certain fields belonging to the indicated view will be returned.
   * @param view view or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaUpdateLabelEnabledAppSettingsRequest setView(java.lang.String view) {
    this.view = view;
    return this;
  }

  @Override
  public GoogleAppsDriveLabelsV2betaUpdateLabelEnabledAppSettingsRequest set(String fieldName, Object value) {
    return (GoogleAppsDriveLabelsV2betaUpdateLabelEnabledAppSettingsRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleAppsDriveLabelsV2betaUpdateLabelEnabledAppSettingsRequest clone() {
    return (GoogleAppsDriveLabelsV2betaUpdateLabelEnabledAppSettingsRequest) super.clone();
  }

}

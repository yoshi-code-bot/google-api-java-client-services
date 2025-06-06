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
 * Describes the Workspace apps in which the Label can be used.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Drive Labels API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAppsDriveLabelsV2betaLabelEnabledAppSettings extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The list of Apps where the Label can be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleAppsDriveLabelsV2betaLabelEnabledAppSettingsEnabledApp> enabledApps;

  /**
   * Optional. The list of Apps where the Label can be used.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleAppsDriveLabelsV2betaLabelEnabledAppSettingsEnabledApp> getEnabledApps() {
    return enabledApps;
  }

  /**
   * Optional. The list of Apps where the Label can be used.
   * @param enabledApps enabledApps or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaLabelEnabledAppSettings setEnabledApps(java.util.List<GoogleAppsDriveLabelsV2betaLabelEnabledAppSettingsEnabledApp> enabledApps) {
    this.enabledApps = enabledApps;
    return this;
  }

  @Override
  public GoogleAppsDriveLabelsV2betaLabelEnabledAppSettings set(String fieldName, Object value) {
    return (GoogleAppsDriveLabelsV2betaLabelEnabledAppSettings) super.set(fieldName, value);
  }

  @Override
  public GoogleAppsDriveLabelsV2betaLabelEnabledAppSettings clone() {
    return (GoogleAppsDriveLabelsV2betaLabelEnabledAppSettings) super.clone();
  }

}

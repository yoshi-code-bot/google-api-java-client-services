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
 * Details of first and third party audience targeting setting.
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
public final class FirstAndThirdPartyAudienceTargetingSetting extends com.google.api.client.json.GenericJson {

  /**
   * Required. First and third party audience id of the first and third party audience targeting
   * setting. This id is first_and_third_party_audience_id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long firstAndThirdPartyAudienceId;

  /**
   * Optional. The recency of the first and third party audience targeting setting. Only applicable
   * to first party audiences, otherwise will be ignored. For more info, refer to
   * https://support.google.com/displayvideo/answer/2949947#recency When unspecified, no recency
   * limit will be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String recency;

  /**
   * Required. First and third party audience id of the first and third party audience targeting
   * setting. This id is first_and_third_party_audience_id.
   * @return value or {@code null} for none
   */
  public java.lang.Long getFirstAndThirdPartyAudienceId() {
    return firstAndThirdPartyAudienceId;
  }

  /**
   * Required. First and third party audience id of the first and third party audience targeting
   * setting. This id is first_and_third_party_audience_id.
   * @param firstAndThirdPartyAudienceId firstAndThirdPartyAudienceId or {@code null} for none
   */
  public FirstAndThirdPartyAudienceTargetingSetting setFirstAndThirdPartyAudienceId(java.lang.Long firstAndThirdPartyAudienceId) {
    this.firstAndThirdPartyAudienceId = firstAndThirdPartyAudienceId;
    return this;
  }

  /**
   * Optional. The recency of the first and third party audience targeting setting. Only applicable
   * to first party audiences, otherwise will be ignored. For more info, refer to
   * https://support.google.com/displayvideo/answer/2949947#recency When unspecified, no recency
   * limit will be used.
   * @return value or {@code null} for none
   */
  public java.lang.String getRecency() {
    return recency;
  }

  /**
   * Optional. The recency of the first and third party audience targeting setting. Only applicable
   * to first party audiences, otherwise will be ignored. For more info, refer to
   * https://support.google.com/displayvideo/answer/2949947#recency When unspecified, no recency
   * limit will be used.
   * @param recency recency or {@code null} for none
   */
  public FirstAndThirdPartyAudienceTargetingSetting setRecency(java.lang.String recency) {
    this.recency = recency;
    return this;
  }

  @Override
  public FirstAndThirdPartyAudienceTargetingSetting set(String fieldName, Object value) {
    return (FirstAndThirdPartyAudienceTargetingSetting) super.set(fieldName, value);
  }

  @Override
  public FirstAndThirdPartyAudienceTargetingSetting clone() {
    return (FirstAndThirdPartyAudienceTargetingSetting) super.clone();
  }

}

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

package com.google.api.services.aiplatform.v1.model;

/**
 * Feature name & value pair.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1FeatureViewDirectWriteRequestDataKeyAndFeatureValuesFeature extends com.google.api.client.json.GenericJson {

  /**
   * Feature short name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Feature value. A user provided timestamp may be set in the
   * `FeatureValue.metadata.generate_time` field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1FeatureValue value;

  /**
   * Feature short name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Feature short name.
   * @param name name or {@code null} for none
   */
  public GoogleCloudAiplatformV1FeatureViewDirectWriteRequestDataKeyAndFeatureValuesFeature setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Feature value. A user provided timestamp may be set in the
   * `FeatureValue.metadata.generate_time` field.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1FeatureValue getValue() {
    return value;
  }

  /**
   * Feature value. A user provided timestamp may be set in the
   * `FeatureValue.metadata.generate_time` field.
   * @param value value or {@code null} for none
   */
  public GoogleCloudAiplatformV1FeatureViewDirectWriteRequestDataKeyAndFeatureValuesFeature setValue(GoogleCloudAiplatformV1FeatureValue value) {
    this.value = value;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1FeatureViewDirectWriteRequestDataKeyAndFeatureValuesFeature set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1FeatureViewDirectWriteRequestDataKeyAndFeatureValuesFeature) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1FeatureViewDirectWriteRequestDataKeyAndFeatureValuesFeature clone() {
    return (GoogleCloudAiplatformV1FeatureViewDirectWriteRequestDataKeyAndFeatureValuesFeature) super.clone();
  }

}

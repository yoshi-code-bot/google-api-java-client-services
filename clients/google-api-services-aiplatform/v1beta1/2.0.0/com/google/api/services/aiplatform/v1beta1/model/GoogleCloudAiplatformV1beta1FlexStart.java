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

package com.google.api.services.aiplatform.v1beta1.model;

/**
 * FlexStart is used to schedule the deployment workload on DWS resource. It contains the max
 * duration of the deployment.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1FlexStart extends com.google.api.client.json.GenericJson {

  /**
   * The max duration of the deployment is max_runtime_duration. The deployment will be terminated
   * after the duration. The max_runtime_duration can be set up to 7 days.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String maxRuntimeDuration;

  /**
   * The max duration of the deployment is max_runtime_duration. The deployment will be terminated
   * after the duration. The max_runtime_duration can be set up to 7 days.
   * @return value or {@code null} for none
   */
  public String getMaxRuntimeDuration() {
    return maxRuntimeDuration;
  }

  /**
   * The max duration of the deployment is max_runtime_duration. The deployment will be terminated
   * after the duration. The max_runtime_duration can be set up to 7 days.
   * @param maxRuntimeDuration maxRuntimeDuration or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1FlexStart setMaxRuntimeDuration(String maxRuntimeDuration) {
    this.maxRuntimeDuration = maxRuntimeDuration;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1FlexStart set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1FlexStart) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1FlexStart clone() {
    return (GoogleCloudAiplatformV1beta1FlexStart) super.clone();
  }

}

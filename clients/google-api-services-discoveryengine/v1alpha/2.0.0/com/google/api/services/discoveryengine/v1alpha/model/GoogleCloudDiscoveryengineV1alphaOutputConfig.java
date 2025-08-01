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

package com.google.api.services.discoveryengine.v1alpha.model;

/**
 * The output configuration setting.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1alphaOutputConfig extends com.google.api.client.json.GenericJson {

  /**
   * The BigQuery location where the output is to be written to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1alphaBigQueryDestination bigqueryDestination;

  /**
   * The BigQuery location where the output is to be written to.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaBigQueryDestination getBigqueryDestination() {
    return bigqueryDestination;
  }

  /**
   * The BigQuery location where the output is to be written to.
   * @param bigqueryDestination bigqueryDestination or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaOutputConfig setBigqueryDestination(GoogleCloudDiscoveryengineV1alphaBigQueryDestination bigqueryDestination) {
    this.bigqueryDestination = bigqueryDestination;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaOutputConfig set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1alphaOutputConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaOutputConfig clone() {
    return (GoogleCloudDiscoveryengineV1alphaOutputConfig) super.clone();
  }

}

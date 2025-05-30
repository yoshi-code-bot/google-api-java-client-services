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

package com.google.api.services.firebasedataconnect.v1.model;

/**
 * Settings for CloudSQL instance configuration.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Data Connect API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CloudSqlInstance extends com.google.api.client.json.GenericJson {

  /**
   * Required. Name of the CloudSQL instance, in the format: ```
   * projects/{project}/locations/{location}/instances/{instance} ```
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String instance;

  /**
   * Required. Name of the CloudSQL instance, in the format: ```
   * projects/{project}/locations/{location}/instances/{instance} ```
   * @return value or {@code null} for none
   */
  public java.lang.String getInstance() {
    return instance;
  }

  /**
   * Required. Name of the CloudSQL instance, in the format: ```
   * projects/{project}/locations/{location}/instances/{instance} ```
   * @param instance instance or {@code null} for none
   */
  public CloudSqlInstance setInstance(java.lang.String instance) {
    this.instance = instance;
    return this;
  }

  @Override
  public CloudSqlInstance set(String fieldName, Object value) {
    return (CloudSqlInstance) super.set(fieldName, value);
  }

  @Override
  public CloudSqlInstance clone() {
    return (CloudSqlInstance) super.clone();
  }

}

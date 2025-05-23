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

package com.google.api.services.discoveryengine.v1beta.model;

/**
 * The Bigtable Options object that contains information to support the import.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1betaBigtableOptions extends com.google.api.client.json.GenericJson {

  /**
   * The mapping from family names to an object that contains column families level information for
   * the given column family. If a family is not present in this map it will be ignored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, GoogleCloudDiscoveryengineV1betaBigtableOptionsBigtableColumnFamily> families;

  /**
   * The field name used for saving row key value in the document. The name has to match the pattern
   * `a-zA-Z0-9*`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String keyFieldName;

  /**
   * The mapping from family names to an object that contains column families level information for
   * the given column family. If a family is not present in this map it will be ignored.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, GoogleCloudDiscoveryengineV1betaBigtableOptionsBigtableColumnFamily> getFamilies() {
    return families;
  }

  /**
   * The mapping from family names to an object that contains column families level information for
   * the given column family. If a family is not present in this map it will be ignored.
   * @param families families or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1betaBigtableOptions setFamilies(java.util.Map<String, GoogleCloudDiscoveryengineV1betaBigtableOptionsBigtableColumnFamily> families) {
    this.families = families;
    return this;
  }

  /**
   * The field name used for saving row key value in the document. The name has to match the pattern
   * `a-zA-Z0-9*`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKeyFieldName() {
    return keyFieldName;
  }

  /**
   * The field name used for saving row key value in the document. The name has to match the pattern
   * `a-zA-Z0-9*`.
   * @param keyFieldName keyFieldName or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1betaBigtableOptions setKeyFieldName(java.lang.String keyFieldName) {
    this.keyFieldName = keyFieldName;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1betaBigtableOptions set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1betaBigtableOptions) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1betaBigtableOptions clone() {
    return (GoogleCloudDiscoveryengineV1betaBigtableOptions) super.clone();
  }

}

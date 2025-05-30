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
 * The configuration for the BAP connector.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1alphaBAPConfig extends com.google.api.client.json.GenericJson {

  /**
   * Required. The supported connector modes for the associated BAP connection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> supportedConnectorModes;

  /**
   * Required. The supported connector modes for the associated BAP connection.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSupportedConnectorModes() {
    return supportedConnectorModes;
  }

  /**
   * Required. The supported connector modes for the associated BAP connection.
   * @param supportedConnectorModes supportedConnectorModes or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaBAPConfig setSupportedConnectorModes(java.util.List<java.lang.String> supportedConnectorModes) {
    this.supportedConnectorModes = supportedConnectorModes;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaBAPConfig set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1alphaBAPConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaBAPConfig clone() {
    return (GoogleCloudDiscoveryengineV1alphaBAPConfig) super.clone();
  }

}

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

package com.google.api.services.composer.v1beta1.model;

/**
 * Configuration options for networking connections in the Composer 2 environment.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Composer API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NetworkingConfig extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Indicates the user requested specific connection type between Tenant and Customer
   * projects. You cannot set networking connection type in public IP environment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String connectionType;

  /**
   * Optional. Indicates the user requested specific connection type between Tenant and Customer
   * projects. You cannot set networking connection type in public IP environment.
   * @return value or {@code null} for none
   */
  public java.lang.String getConnectionType() {
    return connectionType;
  }

  /**
   * Optional. Indicates the user requested specific connection type between Tenant and Customer
   * projects. You cannot set networking connection type in public IP environment.
   * @param connectionType connectionType or {@code null} for none
   */
  public NetworkingConfig setConnectionType(java.lang.String connectionType) {
    this.connectionType = connectionType;
    return this;
  }

  @Override
  public NetworkingConfig set(String fieldName, Object value) {
    return (NetworkingConfig) super.set(fieldName, value);
  }

  @Override
  public NetworkingConfig clone() {
    return (NetworkingConfig) super.clone();
  }

}

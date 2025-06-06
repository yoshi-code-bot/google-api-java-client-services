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

package com.google.api.services.workloadmanager.v1.model;

/**
 * The configuration value.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Workload Manager API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AgentStatusConfigValue extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Whether the configuration value is the default value or overridden.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isDefault;

  /**
   * Output only. The name of the configuration value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The value of the configuration value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * Output only. Whether the configuration value is the default value or overridden.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsDefault() {
    return isDefault;
  }

  /**
   * Output only. Whether the configuration value is the default value or overridden.
   * @param isDefault isDefault or {@code null} for none
   */
  public AgentStatusConfigValue setIsDefault(java.lang.Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Output only. The name of the configuration value.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The name of the configuration value.
   * @param name name or {@code null} for none
   */
  public AgentStatusConfigValue setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The value of the configuration value.
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * Output only. The value of the configuration value.
   * @param value value or {@code null} for none
   */
  public AgentStatusConfigValue setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  @Override
  public AgentStatusConfigValue set(String fieldName, Object value) {
    return (AgentStatusConfigValue) super.set(fieldName, value);
  }

  @Override
  public AgentStatusConfigValue clone() {
    return (AgentStatusConfigValue) super.clone();
  }

}

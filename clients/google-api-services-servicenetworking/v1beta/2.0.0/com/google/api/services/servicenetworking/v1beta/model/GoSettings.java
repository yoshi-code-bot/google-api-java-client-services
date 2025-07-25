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

package com.google.api.services.servicenetworking.v1beta.model;

/**
 * Settings for Go client libraries.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Networking API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoSettings extends com.google.api.client.json.GenericJson {

  /**
   * Some settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CommonLanguageSettings common;

  /**
   * Map of service names to renamed services. Keys are the package relative service names and
   * values are the name to be used for the service client and call options. Example: publishing:
   * go_settings: renamed_services: Publisher: TopicAdmin
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> renamedServices;

  /**
   * Some settings.
   * @return value or {@code null} for none
   */
  public CommonLanguageSettings getCommon() {
    return common;
  }

  /**
   * Some settings.
   * @param common common or {@code null} for none
   */
  public GoSettings setCommon(CommonLanguageSettings common) {
    this.common = common;
    return this;
  }

  /**
   * Map of service names to renamed services. Keys are the package relative service names and
   * values are the name to be used for the service client and call options. Example: publishing:
   * go_settings: renamed_services: Publisher: TopicAdmin
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getRenamedServices() {
    return renamedServices;
  }

  /**
   * Map of service names to renamed services. Keys are the package relative service names and
   * values are the name to be used for the service client and call options. Example: publishing:
   * go_settings: renamed_services: Publisher: TopicAdmin
   * @param renamedServices renamedServices or {@code null} for none
   */
  public GoSettings setRenamedServices(java.util.Map<String, java.lang.String> renamedServices) {
    this.renamedServices = renamedServices;
    return this;
  }

  @Override
  public GoSettings set(String fieldName, Object value) {
    return (GoSettings) super.set(fieldName, value);
  }

  @Override
  public GoSettings clone() {
    return (GoSettings) super.clone();
  }

}

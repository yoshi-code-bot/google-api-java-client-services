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

package com.google.api.services.backupdr.v1.model;

/**
 * Feature type of the Guest OS.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Backup and DR Service API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GuestOsFeature extends com.google.api.client.json.GenericJson {

  /**
   * The ID of a supported feature.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The ID of a supported feature.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The ID of a supported feature.
   * @param type type or {@code null} for none
   */
  public GuestOsFeature setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public GuestOsFeature set(String fieldName, Object value) {
    return (GuestOsFeature) super.set(fieldName, value);
  }

  @Override
  public GuestOsFeature clone() {
    return (GuestOsFeature) super.clone();
  }

}

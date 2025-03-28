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

package com.google.api.services.testing.model;

/**
 * Lab specific information for a device.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Testing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LabInfo extends com.google.api.client.json.GenericJson {

  /**
   * Lab name where the device is hosted. If empty, the device is hosted in a Google owned lab.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The Unicode country/region code (CLDR) of the lab where the device is hosted. E.g. "US" for
   * United States, "CH" for Switzerland.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String regionCode;

  /**
   * Lab name where the device is hosted. If empty, the device is hosted in a Google owned lab.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Lab name where the device is hosted. If empty, the device is hosted in a Google owned lab.
   * @param name name or {@code null} for none
   */
  public LabInfo setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The Unicode country/region code (CLDR) of the lab where the device is hosted. E.g. "US" for
   * United States, "CH" for Switzerland.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegionCode() {
    return regionCode;
  }

  /**
   * The Unicode country/region code (CLDR) of the lab where the device is hosted. E.g. "US" for
   * United States, "CH" for Switzerland.
   * @param regionCode regionCode or {@code null} for none
   */
  public LabInfo setRegionCode(java.lang.String regionCode) {
    this.regionCode = regionCode;
    return this;
  }

  @Override
  public LabInfo set(String fieldName, Object value) {
    return (LabInfo) super.set(fieldName, value);
  }

  @Override
  public LabInfo clone() {
    return (LabInfo) super.clone();
  }

}

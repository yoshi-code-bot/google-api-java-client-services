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

package com.google.api.services.migrationcenter.v1alpha1.model;

/**
 * Platform specific details for Physical Machines.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Migration Center API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PhysicalPlatformDetails extends com.google.api.client.json.GenericJson {

  /**
   * Whether the machine is hyperthreaded.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String hyperthreading;

  /**
   * Free text representation of the machine location. The format of this field should not be relied
   * on. Different machines in the same location may have different string values for this field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * Whether the machine is hyperthreaded.
   * @return value or {@code null} for none
   */
  public java.lang.String getHyperthreading() {
    return hyperthreading;
  }

  /**
   * Whether the machine is hyperthreaded.
   * @param hyperthreading hyperthreading or {@code null} for none
   */
  public PhysicalPlatformDetails setHyperthreading(java.lang.String hyperthreading) {
    this.hyperthreading = hyperthreading;
    return this;
  }

  /**
   * Free text representation of the machine location. The format of this field should not be relied
   * on. Different machines in the same location may have different string values for this field.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * Free text representation of the machine location. The format of this field should not be relied
   * on. Different machines in the same location may have different string values for this field.
   * @param location location or {@code null} for none
   */
  public PhysicalPlatformDetails setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  @Override
  public PhysicalPlatformDetails set(String fieldName, Object value) {
    return (PhysicalPlatformDetails) super.set(fieldName, value);
  }

  @Override
  public PhysicalPlatformDetails clone() {
    return (PhysicalPlatformDetails) super.clone();
  }

}

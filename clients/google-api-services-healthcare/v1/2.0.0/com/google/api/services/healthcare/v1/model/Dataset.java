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

package com.google.api.services.healthcare.v1.model;

/**
 * A message representing a health dataset. A health dataset represents a collection of healthcare
 * data pertaining to one or more patients. This may include multiple modalities of healthcare data,
 * such as electronic medical records or medical imaging data.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Dataset extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Customer-managed encryption key spec for a Dataset. If set, this Dataset and all of
   * its sub-resources will be secured by this key. If empty, the Dataset is secured by the default
   * Google encryption key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EncryptionSpec encryptionSpec;

  /**
   * Identifier. Resource name of the dataset, of the form
   * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Whether the dataset satisfies zone isolation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean satisfiesPzi;

  /**
   * Output only. Whether the dataset satisfies zone separation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean satisfiesPzs;

  /**
   * Optional. The default timezone used by this dataset. Must be a either a valid IANA time zone
   * name such as "America/New_York" or empty, which defaults to UTC. This is used for parsing times
   * in resources, such as HL7 messages, where no explicit timezone is specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String timeZone;

  /**
   * Optional. Customer-managed encryption key spec for a Dataset. If set, this Dataset and all of
   * its sub-resources will be secured by this key. If empty, the Dataset is secured by the default
   * Google encryption key.
   * @return value or {@code null} for none
   */
  public EncryptionSpec getEncryptionSpec() {
    return encryptionSpec;
  }

  /**
   * Optional. Customer-managed encryption key spec for a Dataset. If set, this Dataset and all of
   * its sub-resources will be secured by this key. If empty, the Dataset is secured by the default
   * Google encryption key.
   * @param encryptionSpec encryptionSpec or {@code null} for none
   */
  public Dataset setEncryptionSpec(EncryptionSpec encryptionSpec) {
    this.encryptionSpec = encryptionSpec;
    return this;
  }

  /**
   * Identifier. Resource name of the dataset, of the form
   * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Identifier. Resource name of the dataset, of the form
   * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}`.
   * @param name name or {@code null} for none
   */
  public Dataset setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Whether the dataset satisfies zone isolation.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSatisfiesPzi() {
    return satisfiesPzi;
  }

  /**
   * Output only. Whether the dataset satisfies zone isolation.
   * @param satisfiesPzi satisfiesPzi or {@code null} for none
   */
  public Dataset setSatisfiesPzi(java.lang.Boolean satisfiesPzi) {
    this.satisfiesPzi = satisfiesPzi;
    return this;
  }

  /**
   * Output only. Whether the dataset satisfies zone separation.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSatisfiesPzs() {
    return satisfiesPzs;
  }

  /**
   * Output only. Whether the dataset satisfies zone separation.
   * @param satisfiesPzs satisfiesPzs or {@code null} for none
   */
  public Dataset setSatisfiesPzs(java.lang.Boolean satisfiesPzs) {
    this.satisfiesPzs = satisfiesPzs;
    return this;
  }

  /**
   * Optional. The default timezone used by this dataset. Must be a either a valid IANA time zone
   * name such as "America/New_York" or empty, which defaults to UTC. This is used for parsing times
   * in resources, such as HL7 messages, where no explicit timezone is specified.
   * @return value or {@code null} for none
   */
  public java.lang.String getTimeZone() {
    return timeZone;
  }

  /**
   * Optional. The default timezone used by this dataset. Must be a either a valid IANA time zone
   * name such as "America/New_York" or empty, which defaults to UTC. This is used for parsing times
   * in resources, such as HL7 messages, where no explicit timezone is specified.
   * @param timeZone timeZone or {@code null} for none
   */
  public Dataset setTimeZone(java.lang.String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  @Override
  public Dataset set(String fieldName, Object value) {
    return (Dataset) super.set(fieldName, value);
  }

  @Override
  public Dataset clone() {
    return (Dataset) super.clone();
  }

}

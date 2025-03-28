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

package com.google.api.services.integrations.v1.model;

/**
 * Attributes are additional options that can be associated with each event property. For more
 * information, see
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Application Integration API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EnterpriseCrmEventbusProtoAttributes extends com.google.api.client.json.GenericJson {

  /**
   * Things like URL, Email, Currency, Timestamp (rather than string, int64...)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataType;

  /**
   * Used to define defaults.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EnterpriseCrmEventbusProtoValueType defaultValue;

  /**
   * Required for event execution. The validation will be done by the event bus when the event is
   * triggered.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isRequired;

  /**
   * Used to indicate if a ParameterEntry should be converted to ParamIndexes for ST-Spanner full-
   * text search. DEPRECATED: use searchable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isSearchable;

  /**
   * See
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EnterpriseCrmEventbusProtoLogSettings logSettings;

  /**
   * True if this workflow parameter should be masked in the logs
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean masked;

  /**
   * Used to indicate if the ParameterEntry is a read only field or not.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean readOnly;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String searchable;

  /**
   * List of tasks that can view this property, if empty then all.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> taskVisibility;

  /**
   * Things like URL, Email, Currency, Timestamp (rather than string, int64...)
   * @return value or {@code null} for none
   */
  public java.lang.String getDataType() {
    return dataType;
  }

  /**
   * Things like URL, Email, Currency, Timestamp (rather than string, int64...)
   * @param dataType dataType or {@code null} for none
   */
  public EnterpriseCrmEventbusProtoAttributes setDataType(java.lang.String dataType) {
    this.dataType = dataType;
    return this;
  }

  /**
   * Used to define defaults.
   * @return value or {@code null} for none
   */
  public EnterpriseCrmEventbusProtoValueType getDefaultValue() {
    return defaultValue;
  }

  /**
   * Used to define defaults.
   * @param defaultValue defaultValue or {@code null} for none
   */
  public EnterpriseCrmEventbusProtoAttributes setDefaultValue(EnterpriseCrmEventbusProtoValueType defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  /**
   * Required for event execution. The validation will be done by the event bus when the event is
   * triggered.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsRequired() {
    return isRequired;
  }

  /**
   * Required for event execution. The validation will be done by the event bus when the event is
   * triggered.
   * @param isRequired isRequired or {@code null} for none
   */
  public EnterpriseCrmEventbusProtoAttributes setIsRequired(java.lang.Boolean isRequired) {
    this.isRequired = isRequired;
    return this;
  }

  /**
   * Used to indicate if a ParameterEntry should be converted to ParamIndexes for ST-Spanner full-
   * text search. DEPRECATED: use searchable.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsSearchable() {
    return isSearchable;
  }

  /**
   * Used to indicate if a ParameterEntry should be converted to ParamIndexes for ST-Spanner full-
   * text search. DEPRECATED: use searchable.
   * @param isSearchable isSearchable or {@code null} for none
   */
  public EnterpriseCrmEventbusProtoAttributes setIsSearchable(java.lang.Boolean isSearchable) {
    this.isSearchable = isSearchable;
    return this;
  }

  /**
   * See
   * @return value or {@code null} for none
   */
  public EnterpriseCrmEventbusProtoLogSettings getLogSettings() {
    return logSettings;
  }

  /**
   * See
   * @param logSettings logSettings or {@code null} for none
   */
  public EnterpriseCrmEventbusProtoAttributes setLogSettings(EnterpriseCrmEventbusProtoLogSettings logSettings) {
    this.logSettings = logSettings;
    return this;
  }

  /**
   * True if this workflow parameter should be masked in the logs
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getMasked() {
    return masked;
  }

  /**
   * True if this workflow parameter should be masked in the logs
   * @param masked masked or {@code null} for none
   */
  public EnterpriseCrmEventbusProtoAttributes setMasked(java.lang.Boolean masked) {
    this.masked = masked;
    return this;
  }

  /**
   * Used to indicate if the ParameterEntry is a read only field or not.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getReadOnly() {
    return readOnly;
  }

  /**
   * Used to indicate if the ParameterEntry is a read only field or not.
   * @param readOnly readOnly or {@code null} for none
   */
  public EnterpriseCrmEventbusProtoAttributes setReadOnly(java.lang.Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSearchable() {
    return searchable;
  }

  /**
   * @param searchable searchable or {@code null} for none
   */
  public EnterpriseCrmEventbusProtoAttributes setSearchable(java.lang.String searchable) {
    this.searchable = searchable;
    return this;
  }

  /**
   * List of tasks that can view this property, if empty then all.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTaskVisibility() {
    return taskVisibility;
  }

  /**
   * List of tasks that can view this property, if empty then all.
   * @param taskVisibility taskVisibility or {@code null} for none
   */
  public EnterpriseCrmEventbusProtoAttributes setTaskVisibility(java.util.List<java.lang.String> taskVisibility) {
    this.taskVisibility = taskVisibility;
    return this;
  }

  @Override
  public EnterpriseCrmEventbusProtoAttributes set(String fieldName, Object value) {
    return (EnterpriseCrmEventbusProtoAttributes) super.set(fieldName, value);
  }

  @Override
  public EnterpriseCrmEventbusProtoAttributes clone() {
    return (EnterpriseCrmEventbusProtoAttributes) super.clone();
  }

}

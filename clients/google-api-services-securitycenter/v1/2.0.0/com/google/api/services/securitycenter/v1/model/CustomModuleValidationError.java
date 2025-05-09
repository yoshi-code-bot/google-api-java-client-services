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

package com.google.api.services.securitycenter.v1.model;

/**
 * An error encountered while validating the uploaded configuration of an Event Threat Detection
 * Custom Module.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Security Command Center API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CustomModuleValidationError extends com.google.api.client.json.GenericJson {

  /**
   * A description of the error, suitable for human consumption. Required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The end position of the error in the uploaded text version of the module. This field may be
   * omitted if no specific position applies, or if one could not be computed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Position end;

  /**
   * The path, in RFC 8901 JSON Pointer format, to the field that failed validation. This may be
   * left empty if no specific field is affected.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fieldPath;

  /**
   * The initial position of the error in the uploaded text version of the module. This field may be
   * omitted if no specific position applies, or if one could not be computed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Position start;

  /**
   * A description of the error, suitable for human consumption. Required.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * A description of the error, suitable for human consumption. Required.
   * @param description description or {@code null} for none
   */
  public CustomModuleValidationError setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The end position of the error in the uploaded text version of the module. This field may be
   * omitted if no specific position applies, or if one could not be computed.
   * @return value or {@code null} for none
   */
  public Position getEnd() {
    return end;
  }

  /**
   * The end position of the error in the uploaded text version of the module. This field may be
   * omitted if no specific position applies, or if one could not be computed.
   * @param end end or {@code null} for none
   */
  public CustomModuleValidationError setEnd(Position end) {
    this.end = end;
    return this;
  }

  /**
   * The path, in RFC 8901 JSON Pointer format, to the field that failed validation. This may be
   * left empty if no specific field is affected.
   * @return value or {@code null} for none
   */
  public java.lang.String getFieldPath() {
    return fieldPath;
  }

  /**
   * The path, in RFC 8901 JSON Pointer format, to the field that failed validation. This may be
   * left empty if no specific field is affected.
   * @param fieldPath fieldPath or {@code null} for none
   */
  public CustomModuleValidationError setFieldPath(java.lang.String fieldPath) {
    this.fieldPath = fieldPath;
    return this;
  }

  /**
   * The initial position of the error in the uploaded text version of the module. This field may be
   * omitted if no specific position applies, or if one could not be computed.
   * @return value or {@code null} for none
   */
  public Position getStart() {
    return start;
  }

  /**
   * The initial position of the error in the uploaded text version of the module. This field may be
   * omitted if no specific position applies, or if one could not be computed.
   * @param start start or {@code null} for none
   */
  public CustomModuleValidationError setStart(Position start) {
    this.start = start;
    return this;
  }

  @Override
  public CustomModuleValidationError set(String fieldName, Object value) {
    return (CustomModuleValidationError) super.set(fieldName, value);
  }

  @Override
  public CustomModuleValidationError clone() {
    return (CustomModuleValidationError) super.clone();
  }

}

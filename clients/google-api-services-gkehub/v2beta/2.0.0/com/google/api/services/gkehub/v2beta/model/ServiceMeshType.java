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

package com.google.api.services.gkehub.v2beta.model;

/**
 * A unique identifier for the type of message. Display_name is intended to be human-readable, code
 * is intended to be machine readable. There should be a one-to-one mapping between display_name and
 * code. (i.e. do not re-use display_names or codes between message types.) See
 * istio.analysis.v1alpha1.AnalysisMessageBase.Type
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ServiceMeshType extends com.google.api.client.json.GenericJson {

  /**
   * A 7 character code matching `^IST[0-9]{4}$` or `^ASM[0-9]{4}$`, intended to uniquely identify
   * the message type. (e.g. "IST0001" is mapped to the "InternalError" message type.)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String code;

  /**
   * A human-readable name for the message type. e.g. "InternalError", "PodMissingProxy". This
   * should be the same for all messages of the same type. (This corresponds to the `name` field in
   * open-source Istio.)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * A 7 character code matching `^IST[0-9]{4}$` or `^ASM[0-9]{4}$`, intended to uniquely identify
   * the message type. (e.g. "IST0001" is mapped to the "InternalError" message type.)
   * @return value or {@code null} for none
   */
  public java.lang.String getCode() {
    return code;
  }

  /**
   * A 7 character code matching `^IST[0-9]{4}$` or `^ASM[0-9]{4}$`, intended to uniquely identify
   * the message type. (e.g. "IST0001" is mapped to the "InternalError" message type.)
   * @param code code or {@code null} for none
   */
  public ServiceMeshType setCode(java.lang.String code) {
    this.code = code;
    return this;
  }

  /**
   * A human-readable name for the message type. e.g. "InternalError", "PodMissingProxy". This
   * should be the same for all messages of the same type. (This corresponds to the `name` field in
   * open-source Istio.)
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * A human-readable name for the message type. e.g. "InternalError", "PodMissingProxy". This
   * should be the same for all messages of the same type. (This corresponds to the `name` field in
   * open-source Istio.)
   * @param displayName displayName or {@code null} for none
   */
  public ServiceMeshType setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  @Override
  public ServiceMeshType set(String fieldName, Object value) {
    return (ServiceMeshType) super.set(fieldName, value);
  }

  @Override
  public ServiceMeshType clone() {
    return (ServiceMeshType) super.clone();
  }

}

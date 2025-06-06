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

package com.google.api.services.firebasedataconnect.v1.model;

/**
 * The ExecuteQuery request to Firebase Data Connect.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Data Connect API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExecuteQueryRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The name of the GraphQL operation name. Required because all Connector operations
   * must be named. See https://graphql.org/learn/queries/#operation-name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operationName;

  /**
   * Optional. Values for GraphQL variables provided in this request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> variables;

  /**
   * Required. The name of the GraphQL operation name. Required because all Connector operations
   * must be named. See https://graphql.org/learn/queries/#operation-name.
   * @return value or {@code null} for none
   */
  public java.lang.String getOperationName() {
    return operationName;
  }

  /**
   * Required. The name of the GraphQL operation name. Required because all Connector operations
   * must be named. See https://graphql.org/learn/queries/#operation-name.
   * @param operationName operationName or {@code null} for none
   */
  public ExecuteQueryRequest setOperationName(java.lang.String operationName) {
    this.operationName = operationName;
    return this;
  }

  /**
   * Optional. Values for GraphQL variables provided in this request.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getVariables() {
    return variables;
  }

  /**
   * Optional. Values for GraphQL variables provided in this request.
   * @param variables variables or {@code null} for none
   */
  public ExecuteQueryRequest setVariables(java.util.Map<String, java.lang.Object> variables) {
    this.variables = variables;
    return this;
  }

  @Override
  public ExecuteQueryRequest set(String fieldName, Object value) {
    return (ExecuteQueryRequest) super.set(fieldName, value);
  }

  @Override
  public ExecuteQueryRequest clone() {
    return (ExecuteQueryRequest) super.clone();
  }

}

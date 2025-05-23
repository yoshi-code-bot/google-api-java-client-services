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

package com.google.api.services.merchantapi.issueresolution_v1beta.model;

/**
 * Action that is implemented and performed outside of the third-party application. It should
 * redirect the business to the provided URL of an external system where they can perform the
 * action. For example to request a review in the Merchant Center.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Merchant API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExternalAction extends com.google.api.client.json.GenericJson {

  /**
   * The type of external action.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * URL to external system, for example Merchant Center, where the business can perform the action.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * The type of external action.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of external action.
   * @param type type or {@code null} for none
   */
  public ExternalAction setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * URL to external system, for example Merchant Center, where the business can perform the action.
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * URL to external system, for example Merchant Center, where the business can perform the action.
   * @param uri uri or {@code null} for none
   */
  public ExternalAction setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  @Override
  public ExternalAction set(String fieldName, Object value) {
    return (ExternalAction) super.set(fieldName, value);
  }

  @Override
  public ExternalAction clone() {
    return (ExternalAction) super.clone();
  }

}

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

package com.google.api.services.retail.v2alpha.model;

/**
 * Request for RemoveControl method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI Search for commerce API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2alphaRemoveControlRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The id of the control to apply. Assumed to be in the same catalog as the serving
   * config.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String controlId;

  /**
   * Required. The id of the control to apply. Assumed to be in the same catalog as the serving
   * config.
   * @return value or {@code null} for none
   */
  public java.lang.String getControlId() {
    return controlId;
  }

  /**
   * Required. The id of the control to apply. Assumed to be in the same catalog as the serving
   * config.
   * @param controlId controlId or {@code null} for none
   */
  public GoogleCloudRetailV2alphaRemoveControlRequest setControlId(java.lang.String controlId) {
    this.controlId = controlId;
    return this;
  }

  @Override
  public GoogleCloudRetailV2alphaRemoveControlRequest set(String fieldName, Object value) {
    return (GoogleCloudRetailV2alphaRemoveControlRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2alphaRemoveControlRequest clone() {
    return (GoogleCloudRetailV2alphaRemoveControlRequest) super.clone();
  }

}

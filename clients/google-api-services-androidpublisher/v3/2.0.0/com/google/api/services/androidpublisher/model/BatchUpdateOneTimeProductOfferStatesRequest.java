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

package com.google.api.services.androidpublisher.model;

/**
 * Request message for BatchUpdateOneTimeProductOfferStates.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Android Developer API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BatchUpdateOneTimeProductOfferStatesRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The update request list of up to 100 elements. All requests must update different
   * offers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<UpdateOneTimeProductOfferStateRequest> requests;

  /**
   * Required. The update request list of up to 100 elements. All requests must update different
   * offers.
   * @return value or {@code null} for none
   */
  public java.util.List<UpdateOneTimeProductOfferStateRequest> getRequests() {
    return requests;
  }

  /**
   * Required. The update request list of up to 100 elements. All requests must update different
   * offers.
   * @param requests requests or {@code null} for none
   */
  public BatchUpdateOneTimeProductOfferStatesRequest setRequests(java.util.List<UpdateOneTimeProductOfferStateRequest> requests) {
    this.requests = requests;
    return this;
  }

  @Override
  public BatchUpdateOneTimeProductOfferStatesRequest set(String fieldName, Object value) {
    return (BatchUpdateOneTimeProductOfferStatesRequest) super.set(fieldName, value);
  }

  @Override
  public BatchUpdateOneTimeProductOfferStatesRequest clone() {
    return (BatchUpdateOneTimeProductOfferStatesRequest) super.clone();
  }

}

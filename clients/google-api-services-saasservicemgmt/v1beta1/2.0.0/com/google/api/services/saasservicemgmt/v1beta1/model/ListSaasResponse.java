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

package com.google.api.services.saasservicemgmt.v1beta1.model;

/**
 * The response structure for the ListSaas method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the SaaS Runtime API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListSaasResponse extends com.google.api.client.json.GenericJson {

  /**
   * If present, the next page token can be provided to a subsequent ListSaas call to list the next
   * page. If empty, there are no more pages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The resulting saas.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Saas> saas;

  /**
   * Locations that could not be reached.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> unreachable;

  /**
   * If present, the next page token can be provided to a subsequent ListSaas call to list the next
   * page. If empty, there are no more pages.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * If present, the next page token can be provided to a subsequent ListSaas call to list the next
   * page. If empty, there are no more pages.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListSaasResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The resulting saas.
   * @return value or {@code null} for none
   */
  public java.util.List<Saas> getSaas() {
    return saas;
  }

  /**
   * The resulting saas.
   * @param saas saas or {@code null} for none
   */
  public ListSaasResponse setSaas(java.util.List<Saas> saas) {
    this.saas = saas;
    return this;
  }

  /**
   * Locations that could not be reached.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getUnreachable() {
    return unreachable;
  }

  /**
   * Locations that could not be reached.
   * @param unreachable unreachable or {@code null} for none
   */
  public ListSaasResponse setUnreachable(java.util.List<java.lang.String> unreachable) {
    this.unreachable = unreachable;
    return this;
  }

  @Override
  public ListSaasResponse set(String fieldName, Object value) {
    return (ListSaasResponse) super.set(fieldName, value);
  }

  @Override
  public ListSaasResponse clone() {
    return (ListSaasResponse) super.clone();
  }

}

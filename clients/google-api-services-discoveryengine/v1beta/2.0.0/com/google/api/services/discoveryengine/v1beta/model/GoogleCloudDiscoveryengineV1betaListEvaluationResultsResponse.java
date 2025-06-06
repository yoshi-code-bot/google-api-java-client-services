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

package com.google.api.services.discoveryengine.v1beta.model;

/**
 * Response message for EvaluationService.ListEvaluationResults method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1betaListEvaluationResultsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The evaluation results for the SampleQuerys.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDiscoveryengineV1betaListEvaluationResultsResponseEvaluationResult> evaluationResults;

  /**
   * A token that can be sent as ListEvaluationResultsRequest.page_token to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The evaluation results for the SampleQuerys.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDiscoveryengineV1betaListEvaluationResultsResponseEvaluationResult> getEvaluationResults() {
    return evaluationResults;
  }

  /**
   * The evaluation results for the SampleQuerys.
   * @param evaluationResults evaluationResults or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1betaListEvaluationResultsResponse setEvaluationResults(java.util.List<GoogleCloudDiscoveryengineV1betaListEvaluationResultsResponseEvaluationResult> evaluationResults) {
    this.evaluationResults = evaluationResults;
    return this;
  }

  /**
   * A token that can be sent as ListEvaluationResultsRequest.page_token to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token that can be sent as ListEvaluationResultsRequest.page_token to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1betaListEvaluationResultsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1betaListEvaluationResultsResponse set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1betaListEvaluationResultsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1betaListEvaluationResultsResponse clone() {
    return (GoogleCloudDiscoveryengineV1betaListEvaluationResultsResponse) super.clone();
  }

}

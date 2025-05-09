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

package com.google.api.services.serviceusage.v1.model;

/**
 * The response of analyzing a consumer policy update.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Usage API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleApiServiceusageV2betaAnalyzeConsumerPolicyResponse extends com.google.api.client.json.GenericJson {

  /**
   * The list of analyses returned from performing the intended policy update analysis. The analysis
   * is grouped by service name and different analysis types. The empty analysis list means that the
   * consumer policy can be updated without any warnings or blockers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleApiServiceusageV2betaAnalysis> analysis;

  static {
    // hack to force ProGuard to consider GoogleApiServiceusageV2betaAnalysis used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleApiServiceusageV2betaAnalysis.class);
  }

  /**
   * The list of analyses returned from performing the intended policy update analysis. The analysis
   * is grouped by service name and different analysis types. The empty analysis list means that the
   * consumer policy can be updated without any warnings or blockers.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleApiServiceusageV2betaAnalysis> getAnalysis() {
    return analysis;
  }

  /**
   * The list of analyses returned from performing the intended policy update analysis. The analysis
   * is grouped by service name and different analysis types. The empty analysis list means that the
   * consumer policy can be updated without any warnings or blockers.
   * @param analysis analysis or {@code null} for none
   */
  public GoogleApiServiceusageV2betaAnalyzeConsumerPolicyResponse setAnalysis(java.util.List<GoogleApiServiceusageV2betaAnalysis> analysis) {
    this.analysis = analysis;
    return this;
  }

  @Override
  public GoogleApiServiceusageV2betaAnalyzeConsumerPolicyResponse set(String fieldName, Object value) {
    return (GoogleApiServiceusageV2betaAnalyzeConsumerPolicyResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleApiServiceusageV2betaAnalyzeConsumerPolicyResponse clone() {
    return (GoogleApiServiceusageV2betaAnalyzeConsumerPolicyResponse) super.clone();
  }

}

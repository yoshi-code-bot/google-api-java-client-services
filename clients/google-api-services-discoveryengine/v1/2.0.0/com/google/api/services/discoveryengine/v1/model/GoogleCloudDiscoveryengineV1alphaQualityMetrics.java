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

package com.google.api.services.discoveryengine.v1.model;

/**
 * Describes the metrics produced by the evaluation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1alphaQualityMetrics extends com.google.api.client.json.GenericJson {

  /**
   * Normalized discounted cumulative gain (NDCG) per document, at various top-k cutoff levels. NDCG
   * measures the ranking quality, giving higher relevance to top results. Example (top-3): Suppose
   * SampleQuery with three retrieved documents (D1, D2, D3) and binary relevance judgements (1 for
   * relevant, 0 for not relevant): Retrieved: [D3 (0), D1 (1), D2 (1)] Ideal: [D1 (1), D2 (1), D3
   * (0)] Calculate NDCG@3 for each SampleQuery: * DCG@3: 0/log2(1+1) + 1/log2(2+1) + 1/log2(3+1) =
   * 1.13 * Ideal DCG@3: 1/log2(1+1) + 1/log2(2+1) + 0/log2(3+1) = 1.63 * NDCG@3: 1.13/1.63 = 0.693
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1alphaQualityMetricsTopkMetrics docNdcg;

  /**
   * Precision per document, at various top-k cutoff levels. Precision is the fraction of retrieved
   * documents that are relevant. Example (top-5): * For a single SampleQuery, If 4 out of 5
   * retrieved documents in the top-5 are relevant, precision@5 = 4/5 = 0.8
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1alphaQualityMetricsTopkMetrics docPrecision;

  /**
   * Recall per document, at various top-k cutoff levels. Recall is the fraction of relevant
   * documents retrieved out of all relevant documents. Example (top-5): * For a single SampleQuery,
   * If 3 out of 5 relevant documents are retrieved in the top-5, recall@5 = 3/5 = 0.6
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1alphaQualityMetricsTopkMetrics docRecall;

  /**
   * Normalized discounted cumulative gain (NDCG) per page, at various top-k cutoff levels. NDCG
   * measures the ranking quality, giving higher relevance to top results. Example (top-3): Suppose
   * SampleQuery with three retrieved pages (P1, P2, P3) and binary relevance judgements (1 for
   * relevant, 0 for not relevant): Retrieved: [P3 (0), P1 (1), P2 (1)] Ideal: [P1 (1), P2 (1), P3
   * (0)] Calculate NDCG@3 for SampleQuery: * DCG@3: 0/log2(1+1) + 1/log2(2+1) + 1/log2(3+1) = 1.13
   * * Ideal DCG@3: 1/log2(1+1) + 1/log2(2+1) + 0/log2(3+1) = 1.63 * NDCG@3: 1.13/1.63 = 0.693
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1alphaQualityMetricsTopkMetrics pageNdcg;

  /**
   * Recall per page, at various top-k cutoff levels. Recall is the fraction of relevant pages
   * retrieved out of all relevant pages. Example (top-5): * For a single SampleQuery, if 3 out of 5
   * relevant pages are retrieved in the top-5, recall@5 = 3/5 = 0.6
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1alphaQualityMetricsTopkMetrics pageRecall;

  /**
   * Normalized discounted cumulative gain (NDCG) per document, at various top-k cutoff levels. NDCG
   * measures the ranking quality, giving higher relevance to top results. Example (top-3): Suppose
   * SampleQuery with three retrieved documents (D1, D2, D3) and binary relevance judgements (1 for
   * relevant, 0 for not relevant): Retrieved: [D3 (0), D1 (1), D2 (1)] Ideal: [D1 (1), D2 (1), D3
   * (0)] Calculate NDCG@3 for each SampleQuery: * DCG@3: 0/log2(1+1) + 1/log2(2+1) + 1/log2(3+1) =
   * 1.13 * Ideal DCG@3: 1/log2(1+1) + 1/log2(2+1) + 0/log2(3+1) = 1.63 * NDCG@3: 1.13/1.63 = 0.693
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaQualityMetricsTopkMetrics getDocNdcg() {
    return docNdcg;
  }

  /**
   * Normalized discounted cumulative gain (NDCG) per document, at various top-k cutoff levels. NDCG
   * measures the ranking quality, giving higher relevance to top results. Example (top-3): Suppose
   * SampleQuery with three retrieved documents (D1, D2, D3) and binary relevance judgements (1 for
   * relevant, 0 for not relevant): Retrieved: [D3 (0), D1 (1), D2 (1)] Ideal: [D1 (1), D2 (1), D3
   * (0)] Calculate NDCG@3 for each SampleQuery: * DCG@3: 0/log2(1+1) + 1/log2(2+1) + 1/log2(3+1) =
   * 1.13 * Ideal DCG@3: 1/log2(1+1) + 1/log2(2+1) + 0/log2(3+1) = 1.63 * NDCG@3: 1.13/1.63 = 0.693
   * @param docNdcg docNdcg or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaQualityMetrics setDocNdcg(GoogleCloudDiscoveryengineV1alphaQualityMetricsTopkMetrics docNdcg) {
    this.docNdcg = docNdcg;
    return this;
  }

  /**
   * Precision per document, at various top-k cutoff levels. Precision is the fraction of retrieved
   * documents that are relevant. Example (top-5): * For a single SampleQuery, If 4 out of 5
   * retrieved documents in the top-5 are relevant, precision@5 = 4/5 = 0.8
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaQualityMetricsTopkMetrics getDocPrecision() {
    return docPrecision;
  }

  /**
   * Precision per document, at various top-k cutoff levels. Precision is the fraction of retrieved
   * documents that are relevant. Example (top-5): * For a single SampleQuery, If 4 out of 5
   * retrieved documents in the top-5 are relevant, precision@5 = 4/5 = 0.8
   * @param docPrecision docPrecision or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaQualityMetrics setDocPrecision(GoogleCloudDiscoveryengineV1alphaQualityMetricsTopkMetrics docPrecision) {
    this.docPrecision = docPrecision;
    return this;
  }

  /**
   * Recall per document, at various top-k cutoff levels. Recall is the fraction of relevant
   * documents retrieved out of all relevant documents. Example (top-5): * For a single SampleQuery,
   * If 3 out of 5 relevant documents are retrieved in the top-5, recall@5 = 3/5 = 0.6
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaQualityMetricsTopkMetrics getDocRecall() {
    return docRecall;
  }

  /**
   * Recall per document, at various top-k cutoff levels. Recall is the fraction of relevant
   * documents retrieved out of all relevant documents. Example (top-5): * For a single SampleQuery,
   * If 3 out of 5 relevant documents are retrieved in the top-5, recall@5 = 3/5 = 0.6
   * @param docRecall docRecall or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaQualityMetrics setDocRecall(GoogleCloudDiscoveryengineV1alphaQualityMetricsTopkMetrics docRecall) {
    this.docRecall = docRecall;
    return this;
  }

  /**
   * Normalized discounted cumulative gain (NDCG) per page, at various top-k cutoff levels. NDCG
   * measures the ranking quality, giving higher relevance to top results. Example (top-3): Suppose
   * SampleQuery with three retrieved pages (P1, P2, P3) and binary relevance judgements (1 for
   * relevant, 0 for not relevant): Retrieved: [P3 (0), P1 (1), P2 (1)] Ideal: [P1 (1), P2 (1), P3
   * (0)] Calculate NDCG@3 for SampleQuery: * DCG@3: 0/log2(1+1) + 1/log2(2+1) + 1/log2(3+1) = 1.13
   * * Ideal DCG@3: 1/log2(1+1) + 1/log2(2+1) + 0/log2(3+1) = 1.63 * NDCG@3: 1.13/1.63 = 0.693
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaQualityMetricsTopkMetrics getPageNdcg() {
    return pageNdcg;
  }

  /**
   * Normalized discounted cumulative gain (NDCG) per page, at various top-k cutoff levels. NDCG
   * measures the ranking quality, giving higher relevance to top results. Example (top-3): Suppose
   * SampleQuery with three retrieved pages (P1, P2, P3) and binary relevance judgements (1 for
   * relevant, 0 for not relevant): Retrieved: [P3 (0), P1 (1), P2 (1)] Ideal: [P1 (1), P2 (1), P3
   * (0)] Calculate NDCG@3 for SampleQuery: * DCG@3: 0/log2(1+1) + 1/log2(2+1) + 1/log2(3+1) = 1.13
   * * Ideal DCG@3: 1/log2(1+1) + 1/log2(2+1) + 0/log2(3+1) = 1.63 * NDCG@3: 1.13/1.63 = 0.693
   * @param pageNdcg pageNdcg or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaQualityMetrics setPageNdcg(GoogleCloudDiscoveryengineV1alphaQualityMetricsTopkMetrics pageNdcg) {
    this.pageNdcg = pageNdcg;
    return this;
  }

  /**
   * Recall per page, at various top-k cutoff levels. Recall is the fraction of relevant pages
   * retrieved out of all relevant pages. Example (top-5): * For a single SampleQuery, if 3 out of 5
   * relevant pages are retrieved in the top-5, recall@5 = 3/5 = 0.6
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaQualityMetricsTopkMetrics getPageRecall() {
    return pageRecall;
  }

  /**
   * Recall per page, at various top-k cutoff levels. Recall is the fraction of relevant pages
   * retrieved out of all relevant pages. Example (top-5): * For a single SampleQuery, if 3 out of 5
   * relevant pages are retrieved in the top-5, recall@5 = 3/5 = 0.6
   * @param pageRecall pageRecall or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaQualityMetrics setPageRecall(GoogleCloudDiscoveryengineV1alphaQualityMetricsTopkMetrics pageRecall) {
    this.pageRecall = pageRecall;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaQualityMetrics set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1alphaQualityMetrics) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaQualityMetrics clone() {
    return (GoogleCloudDiscoveryengineV1alphaQualityMetrics) super.clone();
  }

}

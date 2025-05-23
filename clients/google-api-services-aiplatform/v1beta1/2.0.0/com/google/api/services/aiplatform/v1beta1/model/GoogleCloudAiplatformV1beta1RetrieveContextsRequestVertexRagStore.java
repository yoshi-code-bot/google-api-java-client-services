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

package com.google.api.services.aiplatform.v1beta1.model;

/**
 * The data source for Vertex RagStore.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1RetrieveContextsRequestVertexRagStore extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Deprecated. Please use rag_resources to specify the data source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> ragCorpora;

  /**
   * Optional. The representation of the rag source. It can be used to specify corpus only or
   * ragfiles. Currently only support one corpus or multiple files from one corpus. In the future we
   * may open up multiple corpora support.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudAiplatformV1beta1RetrieveContextsRequestVertexRagStoreRagResource> ragResources;

  /**
   * Optional. Only return contexts with vector distance smaller than the threshold.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double vectorDistanceThreshold;

  /**
   * Optional. Deprecated. Please use rag_resources to specify the data source.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRagCorpora() {
    return ragCorpora;
  }

  /**
   * Optional. Deprecated. Please use rag_resources to specify the data source.
   * @param ragCorpora ragCorpora or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1RetrieveContextsRequestVertexRagStore setRagCorpora(java.util.List<java.lang.String> ragCorpora) {
    this.ragCorpora = ragCorpora;
    return this;
  }

  /**
   * Optional. The representation of the rag source. It can be used to specify corpus only or
   * ragfiles. Currently only support one corpus or multiple files from one corpus. In the future we
   * may open up multiple corpora support.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudAiplatformV1beta1RetrieveContextsRequestVertexRagStoreRagResource> getRagResources() {
    return ragResources;
  }

  /**
   * Optional. The representation of the rag source. It can be used to specify corpus only or
   * ragfiles. Currently only support one corpus or multiple files from one corpus. In the future we
   * may open up multiple corpora support.
   * @param ragResources ragResources or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1RetrieveContextsRequestVertexRagStore setRagResources(java.util.List<GoogleCloudAiplatformV1beta1RetrieveContextsRequestVertexRagStoreRagResource> ragResources) {
    this.ragResources = ragResources;
    return this;
  }

  /**
   * Optional. Only return contexts with vector distance smaller than the threshold.
   * @return value or {@code null} for none
   */
  public java.lang.Double getVectorDistanceThreshold() {
    return vectorDistanceThreshold;
  }

  /**
   * Optional. Only return contexts with vector distance smaller than the threshold.
   * @param vectorDistanceThreshold vectorDistanceThreshold or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1RetrieveContextsRequestVertexRagStore setVectorDistanceThreshold(java.lang.Double vectorDistanceThreshold) {
    this.vectorDistanceThreshold = vectorDistanceThreshold;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1RetrieveContextsRequestVertexRagStore set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1RetrieveContextsRequestVertexRagStore) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1RetrieveContextsRequestVertexRagStore clone() {
    return (GoogleCloudAiplatformV1beta1RetrieveContextsRequestVertexRagStore) super.clone();
  }

}

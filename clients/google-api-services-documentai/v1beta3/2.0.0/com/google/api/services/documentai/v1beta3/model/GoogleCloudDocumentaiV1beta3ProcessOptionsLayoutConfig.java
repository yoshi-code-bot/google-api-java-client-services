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

package com.google.api.services.documentai.v1beta3.model;

/**
 * Serving config for layout parser processor.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Document AI API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDocumentaiV1beta3ProcessOptionsLayoutConfig extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Config for chunking in layout parser processor.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1beta3ProcessOptionsLayoutConfigChunkingConfig chunkingConfig;

  /**
   * Optional. Whether to include image annotations in layout parser response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableImageAnnotation;

  /**
   * Optional. Whether to extract images in layout parser response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableImageExtraction;

  /**
   * Optional. Whether to refine PDF layout using LLM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableLlmLayoutParsing;

  /**
   * Optional. Whether to include table annotations in layout parser response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableTableAnnotation;

  /**
   * Optional. Whether to include bounding boxes in layout parser processor response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean returnBoundingBoxes;

  /**
   * Optional. Whether to include images in layout parser processor response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean returnImages;

  /**
   * Optional. Config for chunking in layout parser processor.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3ProcessOptionsLayoutConfigChunkingConfig getChunkingConfig() {
    return chunkingConfig;
  }

  /**
   * Optional. Config for chunking in layout parser processor.
   * @param chunkingConfig chunkingConfig or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3ProcessOptionsLayoutConfig setChunkingConfig(GoogleCloudDocumentaiV1beta3ProcessOptionsLayoutConfigChunkingConfig chunkingConfig) {
    this.chunkingConfig = chunkingConfig;
    return this;
  }

  /**
   * Optional. Whether to include image annotations in layout parser response.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableImageAnnotation() {
    return enableImageAnnotation;
  }

  /**
   * Optional. Whether to include image annotations in layout parser response.
   * @param enableImageAnnotation enableImageAnnotation or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3ProcessOptionsLayoutConfig setEnableImageAnnotation(java.lang.Boolean enableImageAnnotation) {
    this.enableImageAnnotation = enableImageAnnotation;
    return this;
  }

  /**
   * Optional. Whether to extract images in layout parser response.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableImageExtraction() {
    return enableImageExtraction;
  }

  /**
   * Optional. Whether to extract images in layout parser response.
   * @param enableImageExtraction enableImageExtraction or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3ProcessOptionsLayoutConfig setEnableImageExtraction(java.lang.Boolean enableImageExtraction) {
    this.enableImageExtraction = enableImageExtraction;
    return this;
  }

  /**
   * Optional. Whether to refine PDF layout using LLM.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableLlmLayoutParsing() {
    return enableLlmLayoutParsing;
  }

  /**
   * Optional. Whether to refine PDF layout using LLM.
   * @param enableLlmLayoutParsing enableLlmLayoutParsing or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3ProcessOptionsLayoutConfig setEnableLlmLayoutParsing(java.lang.Boolean enableLlmLayoutParsing) {
    this.enableLlmLayoutParsing = enableLlmLayoutParsing;
    return this;
  }

  /**
   * Optional. Whether to include table annotations in layout parser response.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableTableAnnotation() {
    return enableTableAnnotation;
  }

  /**
   * Optional. Whether to include table annotations in layout parser response.
   * @param enableTableAnnotation enableTableAnnotation or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3ProcessOptionsLayoutConfig setEnableTableAnnotation(java.lang.Boolean enableTableAnnotation) {
    this.enableTableAnnotation = enableTableAnnotation;
    return this;
  }

  /**
   * Optional. Whether to include bounding boxes in layout parser processor response.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getReturnBoundingBoxes() {
    return returnBoundingBoxes;
  }

  /**
   * Optional. Whether to include bounding boxes in layout parser processor response.
   * @param returnBoundingBoxes returnBoundingBoxes or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3ProcessOptionsLayoutConfig setReturnBoundingBoxes(java.lang.Boolean returnBoundingBoxes) {
    this.returnBoundingBoxes = returnBoundingBoxes;
    return this;
  }

  /**
   * Optional. Whether to include images in layout parser processor response.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getReturnImages() {
    return returnImages;
  }

  /**
   * Optional. Whether to include images in layout parser processor response.
   * @param returnImages returnImages or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3ProcessOptionsLayoutConfig setReturnImages(java.lang.Boolean returnImages) {
    this.returnImages = returnImages;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1beta3ProcessOptionsLayoutConfig set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1beta3ProcessOptionsLayoutConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1beta3ProcessOptionsLayoutConfig clone() {
    return (GoogleCloudDocumentaiV1beta3ProcessOptionsLayoutConfig) super.clone();
  }

}

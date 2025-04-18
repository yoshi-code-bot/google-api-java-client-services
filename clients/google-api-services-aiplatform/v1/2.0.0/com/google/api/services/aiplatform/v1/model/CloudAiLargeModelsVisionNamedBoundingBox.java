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

package com.google.api.services.aiplatform.v1.model;

/**
 * Model definition for CloudAiLargeModelsVisionNamedBoundingBox.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CloudAiLargeModelsVisionNamedBoundingBox extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> classes;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> entities;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Float> scores;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float x1;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float x2;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float y1;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float y2;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getClasses() {
    return classes;
  }

  /**
   * @param classes classes or {@code null} for none
   */
  public CloudAiLargeModelsVisionNamedBoundingBox setClasses(java.util.List<java.lang.String> classes) {
    this.classes = classes;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getEntities() {
    return entities;
  }

  /**
   * @param entities entities or {@code null} for none
   */
  public CloudAiLargeModelsVisionNamedBoundingBox setEntities(java.util.List<java.lang.String> entities) {
    this.entities = entities;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Float> getScores() {
    return scores;
  }

  /**
   * @param scores scores or {@code null} for none
   */
  public CloudAiLargeModelsVisionNamedBoundingBox setScores(java.util.List<java.lang.Float> scores) {
    this.scores = scores;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Float getX1() {
    return x1;
  }

  /**
   * @param x1 x1 or {@code null} for none
   */
  public CloudAiLargeModelsVisionNamedBoundingBox setX1(java.lang.Float x1) {
    this.x1 = x1;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Float getX2() {
    return x2;
  }

  /**
   * @param x2 x2 or {@code null} for none
   */
  public CloudAiLargeModelsVisionNamedBoundingBox setX2(java.lang.Float x2) {
    this.x2 = x2;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Float getY1() {
    return y1;
  }

  /**
   * @param y1 y1 or {@code null} for none
   */
  public CloudAiLargeModelsVisionNamedBoundingBox setY1(java.lang.Float y1) {
    this.y1 = y1;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Float getY2() {
    return y2;
  }

  /**
   * @param y2 y2 or {@code null} for none
   */
  public CloudAiLargeModelsVisionNamedBoundingBox setY2(java.lang.Float y2) {
    this.y2 = y2;
    return this;
  }

  @Override
  public CloudAiLargeModelsVisionNamedBoundingBox set(String fieldName, Object value) {
    return (CloudAiLargeModelsVisionNamedBoundingBox) super.set(fieldName, value);
  }

  @Override
  public CloudAiLargeModelsVisionNamedBoundingBox clone() {
    return (CloudAiLargeModelsVisionNamedBoundingBox) super.clone();
  }

}

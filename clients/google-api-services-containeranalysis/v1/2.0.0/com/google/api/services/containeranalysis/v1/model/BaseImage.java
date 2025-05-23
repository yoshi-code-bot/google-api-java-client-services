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

package com.google.api.services.containeranalysis.v1.model;

/**
 * BaseImage describes a base image of a container image.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Container Analysis API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BaseImage extends com.google.api.client.json.GenericJson {

  /**
   * The number of layers that the base image is composed of.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer layerCount;

  /**
   * The name of the base image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The repository name in which the base image is from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String repository;

  /**
   * The number of layers that the base image is composed of.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getLayerCount() {
    return layerCount;
  }

  /**
   * The number of layers that the base image is composed of.
   * @param layerCount layerCount or {@code null} for none
   */
  public BaseImage setLayerCount(java.lang.Integer layerCount) {
    this.layerCount = layerCount;
    return this;
  }

  /**
   * The name of the base image.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the base image.
   * @param name name or {@code null} for none
   */
  public BaseImage setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The repository name in which the base image is from.
   * @return value or {@code null} for none
   */
  public java.lang.String getRepository() {
    return repository;
  }

  /**
   * The repository name in which the base image is from.
   * @param repository repository or {@code null} for none
   */
  public BaseImage setRepository(java.lang.String repository) {
    this.repository = repository;
    return this;
  }

  @Override
  public BaseImage set(String fieldName, Object value) {
    return (BaseImage) super.set(fieldName, value);
  }

  @Override
  public BaseImage clone() {
    return (BaseImage) super.clone();
  }

}

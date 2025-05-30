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

package com.google.api.services.managedkafka.v1.model;

/**
 * SchemaRegistry is a schema registry instance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Managed Service for Apache Kafka API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SchemaRegistry extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The contexts of the schema registry instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> contexts;

  /**
   * Identifier. The name of the schema registry instance. Structured like:
   * `projects/{project}/locations/{location}/schemaRegistries/{schema_registry}` The instance name
   * {schema_registry} can contain the following: * Up to 255 characters. * Letters (uppercase or
   * lowercase), numbers, and underscores.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The contexts of the schema registry instance.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getContexts() {
    return contexts;
  }

  /**
   * Output only. The contexts of the schema registry instance.
   * @param contexts contexts or {@code null} for none
   */
  public SchemaRegistry setContexts(java.util.List<java.lang.String> contexts) {
    this.contexts = contexts;
    return this;
  }

  /**
   * Identifier. The name of the schema registry instance. Structured like:
   * `projects/{project}/locations/{location}/schemaRegistries/{schema_registry}` The instance name
   * {schema_registry} can contain the following: * Up to 255 characters. * Letters (uppercase or
   * lowercase), numbers, and underscores.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Identifier. The name of the schema registry instance. Structured like:
   * `projects/{project}/locations/{location}/schemaRegistries/{schema_registry}` The instance name
   * {schema_registry} can contain the following: * Up to 255 characters. * Letters (uppercase or
   * lowercase), numbers, and underscores.
   * @param name name or {@code null} for none
   */
  public SchemaRegistry setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public SchemaRegistry set(String fieldName, Object value) {
    return (SchemaRegistry) super.set(fieldName, value);
  }

  @Override
  public SchemaRegistry clone() {
    return (SchemaRegistry) super.clone();
  }

}

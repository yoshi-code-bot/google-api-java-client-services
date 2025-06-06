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
 * Request to create a schema registry instance.
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
public final class CreateSchemaRegistryRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The schema registry instance to create. The name field is ignored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SchemaRegistry schemaRegistry;

  /**
   * Required. The schema registry instance ID to use for this schema registry. The ID must contain
   * only letters (a-z, A-Z), numbers (0-9), and underscores (-). The maximum length is 63
   * characters. The ID must not start with a number.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String schemaRegistryId;

  /**
   * Required. The schema registry instance to create. The name field is ignored.
   * @return value or {@code null} for none
   */
  public SchemaRegistry getSchemaRegistry() {
    return schemaRegistry;
  }

  /**
   * Required. The schema registry instance to create. The name field is ignored.
   * @param schemaRegistry schemaRegistry or {@code null} for none
   */
  public CreateSchemaRegistryRequest setSchemaRegistry(SchemaRegistry schemaRegistry) {
    this.schemaRegistry = schemaRegistry;
    return this;
  }

  /**
   * Required. The schema registry instance ID to use for this schema registry. The ID must contain
   * only letters (a-z, A-Z), numbers (0-9), and underscores (-). The maximum length is 63
   * characters. The ID must not start with a number.
   * @return value or {@code null} for none
   */
  public java.lang.String getSchemaRegistryId() {
    return schemaRegistryId;
  }

  /**
   * Required. The schema registry instance ID to use for this schema registry. The ID must contain
   * only letters (a-z, A-Z), numbers (0-9), and underscores (-). The maximum length is 63
   * characters. The ID must not start with a number.
   * @param schemaRegistryId schemaRegistryId or {@code null} for none
   */
  public CreateSchemaRegistryRequest setSchemaRegistryId(java.lang.String schemaRegistryId) {
    this.schemaRegistryId = schemaRegistryId;
    return this;
  }

  @Override
  public CreateSchemaRegistryRequest set(String fieldName, Object value) {
    return (CreateSchemaRegistryRequest) super.set(fieldName, value);
  }

  @Override
  public CreateSchemaRegistryRequest clone() {
    return (CreateSchemaRegistryRequest) super.clone();
  }

}

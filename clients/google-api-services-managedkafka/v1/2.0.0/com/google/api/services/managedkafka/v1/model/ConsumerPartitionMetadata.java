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
 * Metadata for a consumer group corresponding to a specific partition.
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
public final class ConsumerPartitionMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The associated metadata for this partition, or empty if it does not exist.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String metadata;

  /**
   * Required. The current offset for this partition, or 0 if no offset has been committed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long offset;

  /**
   * Optional. The associated metadata for this partition, or empty if it does not exist.
   * @return value or {@code null} for none
   */
  public java.lang.String getMetadata() {
    return metadata;
  }

  /**
   * Optional. The associated metadata for this partition, or empty if it does not exist.
   * @param metadata metadata or {@code null} for none
   */
  public ConsumerPartitionMetadata setMetadata(java.lang.String metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Required. The current offset for this partition, or 0 if no offset has been committed.
   * @return value or {@code null} for none
   */
  public java.lang.Long getOffset() {
    return offset;
  }

  /**
   * Required. The current offset for this partition, or 0 if no offset has been committed.
   * @param offset offset or {@code null} for none
   */
  public ConsumerPartitionMetadata setOffset(java.lang.Long offset) {
    this.offset = offset;
    return this;
  }

  @Override
  public ConsumerPartitionMetadata set(String fieldName, Object value) {
    return (ConsumerPartitionMetadata) super.set(fieldName, value);
  }

  @Override
  public ConsumerPartitionMetadata clone() {
    return (ConsumerPartitionMetadata) super.clone();
  }

}

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

package com.google.api.services.compute.model;

/**
 * Model definition for ReservationSubBlockPhysicalTopology.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReservationSubBlockPhysicalTopology extends com.google.api.client.json.GenericJson {

  /**
   * The hash of the capacity block within the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String block;

  /**
   * The cluster name of the reservation subBlock.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cluster;

  /**
   * The hash of the capacity sub-block within the capacity block.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subBlock;

  /**
   * The hash of the capacity block within the cluster.
   * @return value or {@code null} for none
   */
  public java.lang.String getBlock() {
    return block;
  }

  /**
   * The hash of the capacity block within the cluster.
   * @param block block or {@code null} for none
   */
  public ReservationSubBlockPhysicalTopology setBlock(java.lang.String block) {
    this.block = block;
    return this;
  }

  /**
   * The cluster name of the reservation subBlock.
   * @return value or {@code null} for none
   */
  public java.lang.String getCluster() {
    return cluster;
  }

  /**
   * The cluster name of the reservation subBlock.
   * @param cluster cluster or {@code null} for none
   */
  public ReservationSubBlockPhysicalTopology setCluster(java.lang.String cluster) {
    this.cluster = cluster;
    return this;
  }

  /**
   * The hash of the capacity sub-block within the capacity block.
   * @return value or {@code null} for none
   */
  public java.lang.String getSubBlock() {
    return subBlock;
  }

  /**
   * The hash of the capacity sub-block within the capacity block.
   * @param subBlock subBlock or {@code null} for none
   */
  public ReservationSubBlockPhysicalTopology setSubBlock(java.lang.String subBlock) {
    this.subBlock = subBlock;
    return this;
  }

  @Override
  public ReservationSubBlockPhysicalTopology set(String fieldName, Object value) {
    return (ReservationSubBlockPhysicalTopology) super.set(fieldName, value);
  }

  @Override
  public ReservationSubBlockPhysicalTopology clone() {
    return (ReservationSubBlockPhysicalTopology) super.clone();
  }

}

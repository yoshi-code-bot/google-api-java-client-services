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
 * Model definition for NetworkProfileProfileType.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NetworkProfileProfileType extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String networkType;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rdmaSubtype;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ullSubtype;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String vpcSubtype;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getNetworkType() {
    return networkType;
  }

  /**
   * @param networkType networkType or {@code null} for none
   */
  public NetworkProfileProfileType setNetworkType(java.lang.String networkType) {
    this.networkType = networkType;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getRdmaSubtype() {
    return rdmaSubtype;
  }

  /**
   * @param rdmaSubtype rdmaSubtype or {@code null} for none
   */
  public NetworkProfileProfileType setRdmaSubtype(java.lang.String rdmaSubtype) {
    this.rdmaSubtype = rdmaSubtype;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getUllSubtype() {
    return ullSubtype;
  }

  /**
   * @param ullSubtype ullSubtype or {@code null} for none
   */
  public NetworkProfileProfileType setUllSubtype(java.lang.String ullSubtype) {
    this.ullSubtype = ullSubtype;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getVpcSubtype() {
    return vpcSubtype;
  }

  /**
   * @param vpcSubtype vpcSubtype or {@code null} for none
   */
  public NetworkProfileProfileType setVpcSubtype(java.lang.String vpcSubtype) {
    this.vpcSubtype = vpcSubtype;
    return this;
  }

  @Override
  public NetworkProfileProfileType set(String fieldName, Object value) {
    return (NetworkProfileProfileType) super.set(fieldName, value);
  }

  @Override
  public NetworkProfileProfileType clone() {
    return (NetworkProfileProfileType) super.clone();
  }

}

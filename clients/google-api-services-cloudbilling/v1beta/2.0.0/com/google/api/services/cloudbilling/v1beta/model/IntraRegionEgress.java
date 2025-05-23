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

package com.google.api.services.cloudbilling.v1beta.model;

/**
 * Data transfer within the same region. When the source region and destination region are in the
 * same zone, using internal IP addresses, there isn't any charge for data transfer.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Billing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class IntraRegionEgress extends com.google.api.client.json.GenericJson {

  /**
   * VM to VM data transfer usage. The expected are GiBy/s, By/s, and so on.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Usage egressRate;

  /**
   * VM to VM data transfer usage. The expected are GiBy/s, By/s, and so on.
   * @return value or {@code null} for none
   */
  public Usage getEgressRate() {
    return egressRate;
  }

  /**
   * VM to VM data transfer usage. The expected are GiBy/s, By/s, and so on.
   * @param egressRate egressRate or {@code null} for none
   */
  public IntraRegionEgress setEgressRate(Usage egressRate) {
    this.egressRate = egressRate;
    return this;
  }

  @Override
  public IntraRegionEgress set(String fieldName, Object value) {
    return (IntraRegionEgress) super.set(fieldName, value);
  }

  @Override
  public IntraRegionEgress clone() {
    return (IntraRegionEgress) super.clone();
  }

}

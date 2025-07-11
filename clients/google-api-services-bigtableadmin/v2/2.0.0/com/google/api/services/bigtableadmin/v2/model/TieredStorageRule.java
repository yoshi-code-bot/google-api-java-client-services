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

package com.google.api.services.bigtableadmin.v2.model;

/**
 * Rule to specify what data is stored in a storage tier.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Bigtable Admin API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TieredStorageRule extends com.google.api.client.json.GenericJson {

  /**
   * Include cells older than the given age. For the infrequent access tier, this value must be at
   * least 30 days.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String includeIfOlderThan;

  /**
   * Include cells older than the given age. For the infrequent access tier, this value must be at
   * least 30 days.
   * @return value or {@code null} for none
   */
  public String getIncludeIfOlderThan() {
    return includeIfOlderThan;
  }

  /**
   * Include cells older than the given age. For the infrequent access tier, this value must be at
   * least 30 days.
   * @param includeIfOlderThan includeIfOlderThan or {@code null} for none
   */
  public TieredStorageRule setIncludeIfOlderThan(String includeIfOlderThan) {
    this.includeIfOlderThan = includeIfOlderThan;
    return this;
  }

  @Override
  public TieredStorageRule set(String fieldName, Object value) {
    return (TieredStorageRule) super.set(fieldName, value);
  }

  @Override
  public TieredStorageRule clone() {
    return (TieredStorageRule) super.clone();
  }

}

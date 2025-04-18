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

package com.google.api.services.alloydb.v1beta.model;

/**
 * Contains compliance information about a security standard indicating unmet recommendations.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AlloyDB API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class StorageDatabasecenterPartnerapiV1mainCompliance extends com.google.api.client.json.GenericJson {

  /**
   * Industry-wide compliance standards or benchmarks, such as CIS, PCI, and OWASP.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String standard;

  /**
   * Version of the standard or benchmark, for example, 1.1
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * Industry-wide compliance standards or benchmarks, such as CIS, PCI, and OWASP.
   * @return value or {@code null} for none
   */
  public java.lang.String getStandard() {
    return standard;
  }

  /**
   * Industry-wide compliance standards or benchmarks, such as CIS, PCI, and OWASP.
   * @param standard standard or {@code null} for none
   */
  public StorageDatabasecenterPartnerapiV1mainCompliance setStandard(java.lang.String standard) {
    this.standard = standard;
    return this;
  }

  /**
   * Version of the standard or benchmark, for example, 1.1
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * Version of the standard or benchmark, for example, 1.1
   * @param version version or {@code null} for none
   */
  public StorageDatabasecenterPartnerapiV1mainCompliance setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  @Override
  public StorageDatabasecenterPartnerapiV1mainCompliance set(String fieldName, Object value) {
    return (StorageDatabasecenterPartnerapiV1mainCompliance) super.set(fieldName, value);
  }

  @Override
  public StorageDatabasecenterPartnerapiV1mainCompliance clone() {
    return (StorageDatabasecenterPartnerapiV1mainCompliance) super.clone();
  }

}

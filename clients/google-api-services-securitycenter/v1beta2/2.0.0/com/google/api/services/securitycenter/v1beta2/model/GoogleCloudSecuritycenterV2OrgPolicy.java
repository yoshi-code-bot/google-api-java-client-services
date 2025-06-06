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

package com.google.api.services.securitycenter.v1beta2.model;

/**
 * Contains information about the org policies associated with the finding.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Security Command Center API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudSecuritycenterV2OrgPolicy extends com.google.api.client.json.GenericJson {

  /**
   * Identifier. The resource name of the org policy. Example:
   * "organizations/{organization_id}/policies/{constraint_name}"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Identifier. The resource name of the org policy. Example:
   * "organizations/{organization_id}/policies/{constraint_name}"
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Identifier. The resource name of the org policy. Example:
   * "organizations/{organization_id}/policies/{constraint_name}"
   * @param name name or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2OrgPolicy setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public GoogleCloudSecuritycenterV2OrgPolicy set(String fieldName, Object value) {
    return (GoogleCloudSecuritycenterV2OrgPolicy) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudSecuritycenterV2OrgPolicy clone() {
    return (GoogleCloudSecuritycenterV2OrgPolicy) super.clone();
  }

}

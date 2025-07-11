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

package com.google.api.services.parametermanager.v1.model;

/**
 * Output-only policy member strings of a Google Cloud resource's built-in identity.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Parameter Manager API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ResourcePolicyMember extends com.google.api.client.json.GenericJson {

  /**
   * Output only. IAM policy binding member referring to a Google Cloud resource by user-assigned
   * name (https://google.aip.dev/122). If a resource is deleted and recreated with the same name,
   * the binding will be applicable to the new resource. Example:
   * `principal://parametermanager.googleapis.com/projects/12345/name/locations/us-
   * central1-a/parameters/my-parameter`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String iamPolicyNamePrincipal;

  /**
   * Output only. IAM policy binding member referring to a Google Cloud resource by system-assigned
   * unique identifier (https://google.aip.dev/148#uid). If a resource is deleted and recreated with
   * the same name, the binding will not be applicable to the new resource Example:
   * `principal://parametermanager.googleapis.com/projects/12345/uid/locations/us-
   * central1-a/parameters/a918fed5`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String iamPolicyUidPrincipal;

  /**
   * Output only. IAM policy binding member referring to a Google Cloud resource by user-assigned
   * name (https://google.aip.dev/122). If a resource is deleted and recreated with the same name,
   * the binding will be applicable to the new resource. Example:
   * `principal://parametermanager.googleapis.com/projects/12345/name/locations/us-
   * central1-a/parameters/my-parameter`
   * @return value or {@code null} for none
   */
  public java.lang.String getIamPolicyNamePrincipal() {
    return iamPolicyNamePrincipal;
  }

  /**
   * Output only. IAM policy binding member referring to a Google Cloud resource by user-assigned
   * name (https://google.aip.dev/122). If a resource is deleted and recreated with the same name,
   * the binding will be applicable to the new resource. Example:
   * `principal://parametermanager.googleapis.com/projects/12345/name/locations/us-
   * central1-a/parameters/my-parameter`
   * @param iamPolicyNamePrincipal iamPolicyNamePrincipal or {@code null} for none
   */
  public ResourcePolicyMember setIamPolicyNamePrincipal(java.lang.String iamPolicyNamePrincipal) {
    this.iamPolicyNamePrincipal = iamPolicyNamePrincipal;
    return this;
  }

  /**
   * Output only. IAM policy binding member referring to a Google Cloud resource by system-assigned
   * unique identifier (https://google.aip.dev/148#uid). If a resource is deleted and recreated with
   * the same name, the binding will not be applicable to the new resource Example:
   * `principal://parametermanager.googleapis.com/projects/12345/uid/locations/us-
   * central1-a/parameters/a918fed5`
   * @return value or {@code null} for none
   */
  public java.lang.String getIamPolicyUidPrincipal() {
    return iamPolicyUidPrincipal;
  }

  /**
   * Output only. IAM policy binding member referring to a Google Cloud resource by system-assigned
   * unique identifier (https://google.aip.dev/148#uid). If a resource is deleted and recreated with
   * the same name, the binding will not be applicable to the new resource Example:
   * `principal://parametermanager.googleapis.com/projects/12345/uid/locations/us-
   * central1-a/parameters/a918fed5`
   * @param iamPolicyUidPrincipal iamPolicyUidPrincipal or {@code null} for none
   */
  public ResourcePolicyMember setIamPolicyUidPrincipal(java.lang.String iamPolicyUidPrincipal) {
    this.iamPolicyUidPrincipal = iamPolicyUidPrincipal;
    return this;
  }

  @Override
  public ResourcePolicyMember set(String fieldName, Object value) {
    return (ResourcePolicyMember) super.set(fieldName, value);
  }

  @Override
  public ResourcePolicyMember clone() {
    return (ResourcePolicyMember) super.clone();
  }

}

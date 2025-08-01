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

package com.google.api.services.iam.v1.model;

/**
 * Represents a token for the WorkforcePoolProviderScimTenant. Used for authenticating SCIM
 * Provisioning requests.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Identity and Access Management (IAM) API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WorkforcePoolProviderScimToken extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The user-specified display name of the scim token. Cannot exceed 32 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Identifier. The resource name of the SCIM Token. Format:
   * `locations/{location}/workforcePools/{workforce_pool}/providers/
   * {workforce_pool_provider}/scimTenants/{scim_tenant}/tokens/{token}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The token string. Provide this to the IdP for authentication. Will be set only
   * during creation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String securityToken;

  /**
   * Output only. The state of the token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Optional. The user-specified display name of the scim token. Cannot exceed 32 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Optional. The user-specified display name of the scim token. Cannot exceed 32 characters.
   * @param displayName displayName or {@code null} for none
   */
  public WorkforcePoolProviderScimToken setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Identifier. The resource name of the SCIM Token. Format:
   * `locations/{location}/workforcePools/{workforce_pool}/providers/
   * {workforce_pool_provider}/scimTenants/{scim_tenant}/tokens/{token}`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Identifier. The resource name of the SCIM Token. Format:
   * `locations/{location}/workforcePools/{workforce_pool}/providers/
   * {workforce_pool_provider}/scimTenants/{scim_tenant}/tokens/{token}`
   * @param name name or {@code null} for none
   */
  public WorkforcePoolProviderScimToken setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The token string. Provide this to the IdP for authentication. Will be set only
   * during creation.
   * @return value or {@code null} for none
   */
  public java.lang.String getSecurityToken() {
    return securityToken;
  }

  /**
   * Output only. The token string. Provide this to the IdP for authentication. Will be set only
   * during creation.
   * @param securityToken securityToken or {@code null} for none
   */
  public WorkforcePoolProviderScimToken setSecurityToken(java.lang.String securityToken) {
    this.securityToken = securityToken;
    return this;
  }

  /**
   * Output only. The state of the token.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The state of the token.
   * @param state state or {@code null} for none
   */
  public WorkforcePoolProviderScimToken setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public WorkforcePoolProviderScimToken set(String fieldName, Object value) {
    return (WorkforcePoolProviderScimToken) super.set(fieldName, value);
  }

  @Override
  public WorkforcePoolProviderScimToken clone() {
    return (WorkforcePoolProviderScimToken) super.clone();
  }

}

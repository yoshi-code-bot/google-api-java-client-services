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

package com.google.api.services.accessapproval.v1.model;

/**
 * Represents all the policies that can be set for Customer Approval.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Access Approval API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CustomerApprovalApprovalPolicy extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Policy for approval based on the justification given.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String justificationBasedApprovalPolicy;

  /**
   * Optional. Policy for approval based on the justification given.
   * @return value or {@code null} for none
   */
  public java.lang.String getJustificationBasedApprovalPolicy() {
    return justificationBasedApprovalPolicy;
  }

  /**
   * Optional. Policy for approval based on the justification given.
   * @param justificationBasedApprovalPolicy justificationBasedApprovalPolicy or {@code null} for none
   */
  public CustomerApprovalApprovalPolicy setJustificationBasedApprovalPolicy(java.lang.String justificationBasedApprovalPolicy) {
    this.justificationBasedApprovalPolicy = justificationBasedApprovalPolicy;
    return this;
  }

  @Override
  public CustomerApprovalApprovalPolicy set(String fieldName, Object value) {
    return (CustomerApprovalApprovalPolicy) super.set(fieldName, value);
  }

  @Override
  public CustomerApprovalApprovalPolicy clone() {
    return (CustomerApprovalApprovalPolicy) super.clone();
  }

}

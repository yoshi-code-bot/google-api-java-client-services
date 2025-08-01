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

package com.google.api.services.dfareporting.model;

/**
 * Contains custom rule information.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Campaign Manager 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CustomRule extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Name of this custom rule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. Priority of the custom rule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer priority;

  /**
   * Optional. A list of field filter, the custom rule will apply.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<RuleBlock> ruleBlocks;

  /**
   * Optional. Name of this custom rule.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Optional. Name of this custom rule.
   * @param name name or {@code null} for none
   */
  public CustomRule setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. Priority of the custom rule.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPriority() {
    return priority;
  }

  /**
   * Optional. Priority of the custom rule.
   * @param priority priority or {@code null} for none
   */
  public CustomRule setPriority(java.lang.Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Optional. A list of field filter, the custom rule will apply.
   * @return value or {@code null} for none
   */
  public java.util.List<RuleBlock> getRuleBlocks() {
    return ruleBlocks;
  }

  /**
   * Optional. A list of field filter, the custom rule will apply.
   * @param ruleBlocks ruleBlocks or {@code null} for none
   */
  public CustomRule setRuleBlocks(java.util.List<RuleBlock> ruleBlocks) {
    this.ruleBlocks = ruleBlocks;
    return this;
  }

  @Override
  public CustomRule set(String fieldName, Object value) {
    return (CustomRule) super.set(fieldName, value);
  }

  @Override
  public CustomRule clone() {
    return (CustomRule) super.clone();
  }

}

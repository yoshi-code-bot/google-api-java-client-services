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

package com.google.api.services.dataform.v1beta1.model;

/**
 * Defines a compiled Data Preparation entity
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataform API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DataPreparation extends com.google.api.client.json.GenericJson {

  /**
   * SQL definition for a Data Preparation. Contains a SQL query and additional context information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SqlDefinition contentsSql;

  /**
   * The data preparation definition, stored as a YAML string.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentsYaml;

  /**
   * A list of actions that this action depends on.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Target> dependencyTargets;

  /**
   * Whether this action is disabled (i.e. should not be run).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disabled;

  /**
   * Arbitrary, user-defined tags on this action.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> tags;

  /**
   * SQL definition for a Data Preparation. Contains a SQL query and additional context information.
   * @return value or {@code null} for none
   */
  public SqlDefinition getContentsSql() {
    return contentsSql;
  }

  /**
   * SQL definition for a Data Preparation. Contains a SQL query and additional context information.
   * @param contentsSql contentsSql or {@code null} for none
   */
  public DataPreparation setContentsSql(SqlDefinition contentsSql) {
    this.contentsSql = contentsSql;
    return this;
  }

  /**
   * The data preparation definition, stored as a YAML string.
   * @return value or {@code null} for none
   */
  public java.lang.String getContentsYaml() {
    return contentsYaml;
  }

  /**
   * The data preparation definition, stored as a YAML string.
   * @param contentsYaml contentsYaml or {@code null} for none
   */
  public DataPreparation setContentsYaml(java.lang.String contentsYaml) {
    this.contentsYaml = contentsYaml;
    return this;
  }

  /**
   * A list of actions that this action depends on.
   * @return value or {@code null} for none
   */
  public java.util.List<Target> getDependencyTargets() {
    return dependencyTargets;
  }

  /**
   * A list of actions that this action depends on.
   * @param dependencyTargets dependencyTargets or {@code null} for none
   */
  public DataPreparation setDependencyTargets(java.util.List<Target> dependencyTargets) {
    this.dependencyTargets = dependencyTargets;
    return this;
  }

  /**
   * Whether this action is disabled (i.e. should not be run).
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisabled() {
    return disabled;
  }

  /**
   * Whether this action is disabled (i.e. should not be run).
   * @param disabled disabled or {@code null} for none
   */
  public DataPreparation setDisabled(java.lang.Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * Arbitrary, user-defined tags on this action.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTags() {
    return tags;
  }

  /**
   * Arbitrary, user-defined tags on this action.
   * @param tags tags or {@code null} for none
   */
  public DataPreparation setTags(java.util.List<java.lang.String> tags) {
    this.tags = tags;
    return this;
  }

  @Override
  public DataPreparation set(String fieldName, Object value) {
    return (DataPreparation) super.set(fieldName, value);
  }

  @Override
  public DataPreparation clone() {
    return (DataPreparation) super.clone();
  }

}

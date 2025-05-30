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

package com.google.api.services.language.v1beta2.model;

/**
 * Model definition for XPSTablesTrainResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Natural Language API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class XPSTablesTrainResponse extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private XPSTablesModelStructure modelStructure;

  /**
   * Sample rows from the dataset this model was trained.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<XPSRow> predictionSampleRows;

  static {
    // hack to force ProGuard to consider XPSRow used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(XPSRow.class);
  }

  /**
   * Output only. Auxiliary information for each of the input_feature_column_specs, with respect to
   * this particular model.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<XPSTablesModelColumnInfo> tablesModelColumnInfo;

  static {
    // hack to force ProGuard to consider XPSTablesModelColumnInfo used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(XPSTablesModelColumnInfo.class);
  }

  /**
   * The actual training cost of the model, expressed in milli node hours, i.e. 1,000 value in this
   * field means 1 node hour. Guaranteed to not exceed the train budget.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long trainCostMilliNodeHours;

  /**
   * @return value or {@code null} for none
   */
  public XPSTablesModelStructure getModelStructure() {
    return modelStructure;
  }

  /**
   * @param modelStructure modelStructure or {@code null} for none
   */
  public XPSTablesTrainResponse setModelStructure(XPSTablesModelStructure modelStructure) {
    this.modelStructure = modelStructure;
    return this;
  }

  /**
   * Sample rows from the dataset this model was trained.
   * @return value or {@code null} for none
   */
  public java.util.List<XPSRow> getPredictionSampleRows() {
    return predictionSampleRows;
  }

  /**
   * Sample rows from the dataset this model was trained.
   * @param predictionSampleRows predictionSampleRows or {@code null} for none
   */
  public XPSTablesTrainResponse setPredictionSampleRows(java.util.List<XPSRow> predictionSampleRows) {
    this.predictionSampleRows = predictionSampleRows;
    return this;
  }

  /**
   * Output only. Auxiliary information for each of the input_feature_column_specs, with respect to
   * this particular model.
   * @return value or {@code null} for none
   */
  public java.util.List<XPSTablesModelColumnInfo> getTablesModelColumnInfo() {
    return tablesModelColumnInfo;
  }

  /**
   * Output only. Auxiliary information for each of the input_feature_column_specs, with respect to
   * this particular model.
   * @param tablesModelColumnInfo tablesModelColumnInfo or {@code null} for none
   */
  public XPSTablesTrainResponse setTablesModelColumnInfo(java.util.List<XPSTablesModelColumnInfo> tablesModelColumnInfo) {
    this.tablesModelColumnInfo = tablesModelColumnInfo;
    return this;
  }

  /**
   * The actual training cost of the model, expressed in milli node hours, i.e. 1,000 value in this
   * field means 1 node hour. Guaranteed to not exceed the train budget.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTrainCostMilliNodeHours() {
    return trainCostMilliNodeHours;
  }

  /**
   * The actual training cost of the model, expressed in milli node hours, i.e. 1,000 value in this
   * field means 1 node hour. Guaranteed to not exceed the train budget.
   * @param trainCostMilliNodeHours trainCostMilliNodeHours or {@code null} for none
   */
  public XPSTablesTrainResponse setTrainCostMilliNodeHours(java.lang.Long trainCostMilliNodeHours) {
    this.trainCostMilliNodeHours = trainCostMilliNodeHours;
    return this;
  }

  @Override
  public XPSTablesTrainResponse set(String fieldName, Object value) {
    return (XPSTablesTrainResponse) super.set(fieldName, value);
  }

  @Override
  public XPSTablesTrainResponse clone() {
    return (XPSTablesTrainResponse) super.clone();
  }

}

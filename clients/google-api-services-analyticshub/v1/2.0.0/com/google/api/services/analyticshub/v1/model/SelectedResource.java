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

package com.google.api.services.analyticshub.v1.model;

/**
 * Resource in this dataset that is selectively shared.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Analytics Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SelectedResource extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Format: For routine: `projects/{projectId}/datasets/{datasetId}/routines/{routineId}`
   * Example:"projects/test_project/datasets/test_dataset/routines/test_routine"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String routine;

  /**
   * Optional. Format: For table: `projects/{projectId}/datasets/{datasetId}/tables/{tableId}`
   * Example:"projects/test_project/datasets/test_dataset/tables/test_table"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String table;

  /**
   * Optional. Format: For routine: `projects/{projectId}/datasets/{datasetId}/routines/{routineId}`
   * Example:"projects/test_project/datasets/test_dataset/routines/test_routine"
   * @return value or {@code null} for none
   */
  public java.lang.String getRoutine() {
    return routine;
  }

  /**
   * Optional. Format: For routine: `projects/{projectId}/datasets/{datasetId}/routines/{routineId}`
   * Example:"projects/test_project/datasets/test_dataset/routines/test_routine"
   * @param routine routine or {@code null} for none
   */
  public SelectedResource setRoutine(java.lang.String routine) {
    this.routine = routine;
    return this;
  }

  /**
   * Optional. Format: For table: `projects/{projectId}/datasets/{datasetId}/tables/{tableId}`
   * Example:"projects/test_project/datasets/test_dataset/tables/test_table"
   * @return value or {@code null} for none
   */
  public java.lang.String getTable() {
    return table;
  }

  /**
   * Optional. Format: For table: `projects/{projectId}/datasets/{datasetId}/tables/{tableId}`
   * Example:"projects/test_project/datasets/test_dataset/tables/test_table"
   * @param table table or {@code null} for none
   */
  public SelectedResource setTable(java.lang.String table) {
    this.table = table;
    return this;
  }

  @Override
  public SelectedResource set(String fieldName, Object value) {
    return (SelectedResource) super.set(fieldName, value);
  }

  @Override
  public SelectedResource clone() {
    return (SelectedResource) super.clone();
  }

}

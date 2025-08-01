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

package com.google.api.services.datastream.v1.model;

/**
 * Destination datasets are created so that hierarchy of the destination data objects matches the
 * source hierarchy.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Datastream API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SourceHierarchyDatasets extends com.google.api.client.json.GenericJson {

  /**
   * The dataset template to use for dynamic dataset creation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DatasetTemplate datasetTemplate;

  /**
   * Optional. The project id of the BigQuery dataset. If not specified, the project will be
   * inferred from the stream resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * The dataset template to use for dynamic dataset creation.
   * @return value or {@code null} for none
   */
  public DatasetTemplate getDatasetTemplate() {
    return datasetTemplate;
  }

  /**
   * The dataset template to use for dynamic dataset creation.
   * @param datasetTemplate datasetTemplate or {@code null} for none
   */
  public SourceHierarchyDatasets setDatasetTemplate(DatasetTemplate datasetTemplate) {
    this.datasetTemplate = datasetTemplate;
    return this;
  }

  /**
   * Optional. The project id of the BigQuery dataset. If not specified, the project will be
   * inferred from the stream resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * Optional. The project id of the BigQuery dataset. If not specified, the project will be
   * inferred from the stream resource.
   * @param projectId projectId or {@code null} for none
   */
  public SourceHierarchyDatasets setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  @Override
  public SourceHierarchyDatasets set(String fieldName, Object value) {
    return (SourceHierarchyDatasets) super.set(fieldName, value);
  }

  @Override
  public SourceHierarchyDatasets clone() {
    return (SourceHierarchyDatasets) super.clone();
  }

}

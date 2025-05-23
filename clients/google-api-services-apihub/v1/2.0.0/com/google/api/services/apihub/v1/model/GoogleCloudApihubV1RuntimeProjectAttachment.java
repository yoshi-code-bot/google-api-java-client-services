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

package com.google.api.services.apihub.v1.model;

/**
 * Runtime project attachment represents an attachment from the runtime project to the host project.
 * Api Hub looks for deployments in the attached runtime projects and creates corresponding
 * resources in Api Hub for the discovered deployments.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the API hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApihubV1RuntimeProjectAttachment extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Create time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Identifier. The resource name of a runtime project attachment. Format: "projects/{project}/loca
   * tions/{location}/runtimeProjectAttachments/{runtime_project_attachment}".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. Immutable. Google cloud project name in the format: "projects/abc" or "projects/123".
   * As input, project name with either project id or number are accepted. As output, this field
   * will contain project number.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String runtimeProject;

  /**
   * Output only. Create time.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Create time.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudApihubV1RuntimeProjectAttachment setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Identifier. The resource name of a runtime project attachment. Format: "projects/{project}/loca
   * tions/{location}/runtimeProjectAttachments/{runtime_project_attachment}".
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Identifier. The resource name of a runtime project attachment. Format: "projects/{project}/loca
   * tions/{location}/runtimeProjectAttachments/{runtime_project_attachment}".
   * @param name name or {@code null} for none
   */
  public GoogleCloudApihubV1RuntimeProjectAttachment setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. Immutable. Google cloud project name in the format: "projects/abc" or "projects/123".
   * As input, project name with either project id or number are accepted. As output, this field
   * will contain project number.
   * @return value or {@code null} for none
   */
  public java.lang.String getRuntimeProject() {
    return runtimeProject;
  }

  /**
   * Required. Immutable. Google cloud project name in the format: "projects/abc" or "projects/123".
   * As input, project name with either project id or number are accepted. As output, this field
   * will contain project number.
   * @param runtimeProject runtimeProject or {@code null} for none
   */
  public GoogleCloudApihubV1RuntimeProjectAttachment setRuntimeProject(java.lang.String runtimeProject) {
    this.runtimeProject = runtimeProject;
    return this;
  }

  @Override
  public GoogleCloudApihubV1RuntimeProjectAttachment set(String fieldName, Object value) {
    return (GoogleCloudApihubV1RuntimeProjectAttachment) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApihubV1RuntimeProjectAttachment clone() {
    return (GoogleCloudApihubV1RuntimeProjectAttachment) super.clone();
  }

}

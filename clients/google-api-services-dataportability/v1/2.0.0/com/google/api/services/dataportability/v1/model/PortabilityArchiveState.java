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

package com.google.api.services.dataportability.v1.model;

/**
 * Resource that contains the state of an Archive job.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Data Portability API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PortabilityArchiveState extends com.google.api.client.json.GenericJson {

  /**
   * The timestamp that represents the end point for the data you are exporting. If the end_time
   * value is set in the InitiatePortabilityArchiveRequest, this field is set to that value. If
   * end_time is not set, this value is set to the time the export was requested.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String exportTime;

  /**
   * The resource name of ArchiveJob's PortabilityArchiveState singleton. The format is:
   * archiveJobs/{archive_job}/portabilityArchiveState. archive_job is the job ID provided in the
   * request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The timestamp that represents the starting point for the data you are exporting. This field is
   * set only if the start_time field is specified in the InitiatePortabilityArchiveRequest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * Resource that represents the state of the Archive job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * If the state is complete, this method returns the signed URLs of the objects in the Cloud
   * Storage bucket.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> urls;

  /**
   * The timestamp that represents the end point for the data you are exporting. If the end_time
   * value is set in the InitiatePortabilityArchiveRequest, this field is set to that value. If
   * end_time is not set, this value is set to the time the export was requested.
   * @return value or {@code null} for none
   */
  public String getExportTime() {
    return exportTime;
  }

  /**
   * The timestamp that represents the end point for the data you are exporting. If the end_time
   * value is set in the InitiatePortabilityArchiveRequest, this field is set to that value. If
   * end_time is not set, this value is set to the time the export was requested.
   * @param exportTime exportTime or {@code null} for none
   */
  public PortabilityArchiveState setExportTime(String exportTime) {
    this.exportTime = exportTime;
    return this;
  }

  /**
   * The resource name of ArchiveJob's PortabilityArchiveState singleton. The format is:
   * archiveJobs/{archive_job}/portabilityArchiveState. archive_job is the job ID provided in the
   * request.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of ArchiveJob's PortabilityArchiveState singleton. The format is:
   * archiveJobs/{archive_job}/portabilityArchiveState. archive_job is the job ID provided in the
   * request.
   * @param name name or {@code null} for none
   */
  public PortabilityArchiveState setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The timestamp that represents the starting point for the data you are exporting. This field is
   * set only if the start_time field is specified in the InitiatePortabilityArchiveRequest.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * The timestamp that represents the starting point for the data you are exporting. This field is
   * set only if the start_time field is specified in the InitiatePortabilityArchiveRequest.
   * @param startTime startTime or {@code null} for none
   */
  public PortabilityArchiveState setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Resource that represents the state of the Archive job.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Resource that represents the state of the Archive job.
   * @param state state or {@code null} for none
   */
  public PortabilityArchiveState setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * If the state is complete, this method returns the signed URLs of the objects in the Cloud
   * Storage bucket.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getUrls() {
    return urls;
  }

  /**
   * If the state is complete, this method returns the signed URLs of the objects in the Cloud
   * Storage bucket.
   * @param urls urls or {@code null} for none
   */
  public PortabilityArchiveState setUrls(java.util.List<java.lang.String> urls) {
    this.urls = urls;
    return this;
  }

  @Override
  public PortabilityArchiveState set(String fieldName, Object value) {
    return (PortabilityArchiveState) super.set(fieldName, value);
  }

  @Override
  public PortabilityArchiveState clone() {
    return (PortabilityArchiveState) super.clone();
  }

}

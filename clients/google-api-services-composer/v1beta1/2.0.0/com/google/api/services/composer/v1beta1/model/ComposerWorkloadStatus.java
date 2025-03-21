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

package com.google.api.services.composer.v1beta1.model;

/**
 * Workload status.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Composer API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ComposerWorkloadStatus extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Detailed message of the status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String detailedStatusMessage;

  /**
   * Output only. Workload state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. Text to provide more descriptive status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String statusMessage;

  /**
   * Output only. Detailed message of the status.
   * @return value or {@code null} for none
   */
  public java.lang.String getDetailedStatusMessage() {
    return detailedStatusMessage;
  }

  /**
   * Output only. Detailed message of the status.
   * @param detailedStatusMessage detailedStatusMessage or {@code null} for none
   */
  public ComposerWorkloadStatus setDetailedStatusMessage(java.lang.String detailedStatusMessage) {
    this.detailedStatusMessage = detailedStatusMessage;
    return this;
  }

  /**
   * Output only. Workload state.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. Workload state.
   * @param state state or {@code null} for none
   */
  public ComposerWorkloadStatus setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. Text to provide more descriptive status.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatusMessage() {
    return statusMessage;
  }

  /**
   * Output only. Text to provide more descriptive status.
   * @param statusMessage statusMessage or {@code null} for none
   */
  public ComposerWorkloadStatus setStatusMessage(java.lang.String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  @Override
  public ComposerWorkloadStatus set(String fieldName, Object value) {
    return (ComposerWorkloadStatus) super.set(fieldName, value);
  }

  @Override
  public ComposerWorkloadStatus clone() {
    return (ComposerWorkloadStatus) super.clone();
  }

}

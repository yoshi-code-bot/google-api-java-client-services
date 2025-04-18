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

package com.google.api.services.appengine.v1.model;

/**
 * The request sent to CLHs during project events.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the App Engine Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ProjectEvent extends com.google.api.client.json.GenericJson {

  /**
   * The unique ID for this project event. CLHs can use this value to dedup repeated calls. required
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String eventId;

  /**
   * Phase indicates when in the container event propagation this event is being communicated.
   * Events are sent before and after the per-resource events are propagated. required
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String phase;

  /**
   * The projects metadata for this project. required
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ProjectsMetadata projectMetadata;

  /**
   * The state of the organization that led to this event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ContainerState state;

  /**
   * The unique ID for this project event. CLHs can use this value to dedup repeated calls. required
   * @return value or {@code null} for none
   */
  public java.lang.String getEventId() {
    return eventId;
  }

  /**
   * The unique ID for this project event. CLHs can use this value to dedup repeated calls. required
   * @param eventId eventId or {@code null} for none
   */
  public ProjectEvent setEventId(java.lang.String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * Phase indicates when in the container event propagation this event is being communicated.
   * Events are sent before and after the per-resource events are propagated. required
   * @return value or {@code null} for none
   */
  public java.lang.String getPhase() {
    return phase;
  }

  /**
   * Phase indicates when in the container event propagation this event is being communicated.
   * Events are sent before and after the per-resource events are propagated. required
   * @param phase phase or {@code null} for none
   */
  public ProjectEvent setPhase(java.lang.String phase) {
    this.phase = phase;
    return this;
  }

  /**
   * The projects metadata for this project. required
   * @return value or {@code null} for none
   */
  public ProjectsMetadata getProjectMetadata() {
    return projectMetadata;
  }

  /**
   * The projects metadata for this project. required
   * @param projectMetadata projectMetadata or {@code null} for none
   */
  public ProjectEvent setProjectMetadata(ProjectsMetadata projectMetadata) {
    this.projectMetadata = projectMetadata;
    return this;
  }

  /**
   * The state of the organization that led to this event.
   * @return value or {@code null} for none
   */
  public ContainerState getState() {
    return state;
  }

  /**
   * The state of the organization that led to this event.
   * @param state state or {@code null} for none
   */
  public ProjectEvent setState(ContainerState state) {
    this.state = state;
    return this;
  }

  @Override
  public ProjectEvent set(String fieldName, Object value) {
    return (ProjectEvent) super.set(fieldName, value);
  }

  @Override
  public ProjectEvent clone() {
    return (ProjectEvent) super.clone();
  }

}

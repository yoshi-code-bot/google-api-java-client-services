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

package com.google.api.services.batch.v1.model;

/**
 * Status event.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Batch API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class StatusEvent extends com.google.api.client.json.GenericJson {

  /**
   * Description of the event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The time this event occurred.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String eventTime;

  /**
   * Task Execution. This field is only defined for task-level status events where the task fails.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TaskExecution taskExecution;

  /**
   * Task State. This field is only defined for task-level status events.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String taskState;

  /**
   * Type of the event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Description of the event.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Description of the event.
   * @param description description or {@code null} for none
   */
  public StatusEvent setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The time this event occurred.
   * @return value or {@code null} for none
   */
  public String getEventTime() {
    return eventTime;
  }

  /**
   * The time this event occurred.
   * @param eventTime eventTime or {@code null} for none
   */
  public StatusEvent setEventTime(String eventTime) {
    this.eventTime = eventTime;
    return this;
  }

  /**
   * Task Execution. This field is only defined for task-level status events where the task fails.
   * @return value or {@code null} for none
   */
  public TaskExecution getTaskExecution() {
    return taskExecution;
  }

  /**
   * Task Execution. This field is only defined for task-level status events where the task fails.
   * @param taskExecution taskExecution or {@code null} for none
   */
  public StatusEvent setTaskExecution(TaskExecution taskExecution) {
    this.taskExecution = taskExecution;
    return this;
  }

  /**
   * Task State. This field is only defined for task-level status events.
   * @return value or {@code null} for none
   */
  public java.lang.String getTaskState() {
    return taskState;
  }

  /**
   * Task State. This field is only defined for task-level status events.
   * @param taskState taskState or {@code null} for none
   */
  public StatusEvent setTaskState(java.lang.String taskState) {
    this.taskState = taskState;
    return this;
  }

  /**
   * Type of the event.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Type of the event.
   * @param type type or {@code null} for none
   */
  public StatusEvent setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public StatusEvent set(String fieldName, Object value) {
    return (StatusEvent) super.set(fieldName, value);
  }

  @Override
  public StatusEvent clone() {
    return (StatusEvent) super.clone();
  }

}

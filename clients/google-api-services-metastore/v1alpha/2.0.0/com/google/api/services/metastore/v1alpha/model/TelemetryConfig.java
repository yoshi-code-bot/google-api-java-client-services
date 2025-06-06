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

package com.google.api.services.metastore.v1alpha.model;

/**
 * Telemetry Configuration for the Dataproc Metastore service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataproc Metastore API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TelemetryConfig extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The output format of the Dataproc Metastore service's logs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String logFormat;

  /**
   * Optional. The output format of the Dataproc Metastore service's logs.
   * @return value or {@code null} for none
   */
  public java.lang.String getLogFormat() {
    return logFormat;
  }

  /**
   * Optional. The output format of the Dataproc Metastore service's logs.
   * @param logFormat logFormat or {@code null} for none
   */
  public TelemetryConfig setLogFormat(java.lang.String logFormat) {
    this.logFormat = logFormat;
    return this;
  }

  @Override
  public TelemetryConfig set(String fieldName, Object value) {
    return (TelemetryConfig) super.set(fieldName, value);
  }

  @Override
  public TelemetryConfig clone() {
    return (TelemetryConfig) super.clone();
  }

}

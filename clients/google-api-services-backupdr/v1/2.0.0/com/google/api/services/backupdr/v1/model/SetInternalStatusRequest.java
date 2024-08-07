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

package com.google.api.services.backupdr.v1.model;

/**
 * Request message for SetStatusInternal method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Backup and DR Service API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SetInternalStatusRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. Output only. The new BackupConfigState to set for the DataSource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String backupConfigState;

  /**
   * Optional. An optional request ID to identify requests. Specify a unique request ID so that if
   * you must retry your request, the server will know to ignore the request if it has already been
   * completed. The server will guarantee that for at least 60 minutes after the first request. The
   * request ID must be a valid UUID with the exception that zero UUID is not supported
   * (00000000-0000-0000-0000-000000000000).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String requestId;

  /**
   * Required. The value required for this method to work. This field must be the 32-byte SHA256
   * hash of the DataSourceID. The DataSourceID used here is only the final piece of the fully
   * qualified resource path for this DataSource (i.e. the part after '.../dataSources/'). This
   * field exists to make this method difficult to call since it is intended for use only by Backup
   * Appliances.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * Required. Output only. The new BackupConfigState to set for the DataSource.
   * @return value or {@code null} for none
   */
  public java.lang.String getBackupConfigState() {
    return backupConfigState;
  }

  /**
   * Required. Output only. The new BackupConfigState to set for the DataSource.
   * @param backupConfigState backupConfigState or {@code null} for none
   */
  public SetInternalStatusRequest setBackupConfigState(java.lang.String backupConfigState) {
    this.backupConfigState = backupConfigState;
    return this;
  }

  /**
   * Optional. An optional request ID to identify requests. Specify a unique request ID so that if
   * you must retry your request, the server will know to ignore the request if it has already been
   * completed. The server will guarantee that for at least 60 minutes after the first request. The
   * request ID must be a valid UUID with the exception that zero UUID is not supported
   * (00000000-0000-0000-0000-000000000000).
   * @return value or {@code null} for none
   */
  public java.lang.String getRequestId() {
    return requestId;
  }

  /**
   * Optional. An optional request ID to identify requests. Specify a unique request ID so that if
   * you must retry your request, the server will know to ignore the request if it has already been
   * completed. The server will guarantee that for at least 60 minutes after the first request. The
   * request ID must be a valid UUID with the exception that zero UUID is not supported
   * (00000000-0000-0000-0000-000000000000).
   * @param requestId requestId or {@code null} for none
   */
  public SetInternalStatusRequest setRequestId(java.lang.String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * Required. The value required for this method to work. This field must be the 32-byte SHA256
   * hash of the DataSourceID. The DataSourceID used here is only the final piece of the fully
   * qualified resource path for this DataSource (i.e. the part after '.../dataSources/'). This
   * field exists to make this method difficult to call since it is intended for use only by Backup
   * Appliances.
   * @see #decodeValue()
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * Required. The value required for this method to work. This field must be the 32-byte SHA256
   * hash of the DataSourceID. The DataSourceID used here is only the final piece of the fully
   * qualified resource path for this DataSource (i.e. the part after '.../dataSources/'). This
   * field exists to make this method difficult to call since it is intended for use only by Backup
   * Appliances.
   * @see #getValue()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeValue() {
    return com.google.api.client.util.Base64.decodeBase64(value);
  }

  /**
   * Required. The value required for this method to work. This field must be the 32-byte SHA256
   * hash of the DataSourceID. The DataSourceID used here is only the final piece of the fully
   * qualified resource path for this DataSource (i.e. the part after '.../dataSources/'). This
   * field exists to make this method difficult to call since it is intended for use only by Backup
   * Appliances.
   * @see #encodeValue()
   * @param value value or {@code null} for none
   */
  public SetInternalStatusRequest setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  /**
   * Required. The value required for this method to work. This field must be the 32-byte SHA256
   * hash of the DataSourceID. The DataSourceID used here is only the final piece of the fully
   * qualified resource path for this DataSource (i.e. the part after '.../dataSources/'). This
   * field exists to make this method difficult to call since it is intended for use only by Backup
   * Appliances.
   * @see #setValue()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public SetInternalStatusRequest encodeValue(byte[] value) {
    this.value = com.google.api.client.util.Base64.encodeBase64URLSafeString(value);
    return this;
  }

  @Override
  public SetInternalStatusRequest set(String fieldName, Object value) {
    return (SetInternalStatusRequest) super.set(fieldName, value);
  }

  @Override
  public SetInternalStatusRequest clone() {
    return (SetInternalStatusRequest) super.clone();
  }

}

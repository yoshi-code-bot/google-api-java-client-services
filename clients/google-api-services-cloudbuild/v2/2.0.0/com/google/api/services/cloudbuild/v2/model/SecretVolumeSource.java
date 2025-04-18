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

package com.google.api.services.cloudbuild.v2.model;

/**
 * Secret Volume Source.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Build API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SecretVolumeSource extends com.google.api.client.json.GenericJson {

  /**
   * Name of the secret referenced by the WorkspaceBinding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String secretName;

  /**
   * Optional. Resource name of the SecretVersion. In format: projects/secrets/versions
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String secretVersion;

  /**
   * Name of the secret referenced by the WorkspaceBinding.
   * @return value or {@code null} for none
   */
  public java.lang.String getSecretName() {
    return secretName;
  }

  /**
   * Name of the secret referenced by the WorkspaceBinding.
   * @param secretName secretName or {@code null} for none
   */
  public SecretVolumeSource setSecretName(java.lang.String secretName) {
    this.secretName = secretName;
    return this;
  }

  /**
   * Optional. Resource name of the SecretVersion. In format: projects/secrets/versions
   * @return value or {@code null} for none
   */
  public java.lang.String getSecretVersion() {
    return secretVersion;
  }

  /**
   * Optional. Resource name of the SecretVersion. In format: projects/secrets/versions
   * @param secretVersion secretVersion or {@code null} for none
   */
  public SecretVolumeSource setSecretVersion(java.lang.String secretVersion) {
    this.secretVersion = secretVersion;
    return this;
  }

  @Override
  public SecretVolumeSource set(String fieldName, Object value) {
    return (SecretVolumeSource) super.set(fieldName, value);
  }

  @Override
  public SecretVolumeSource clone() {
    return (SecretVolumeSource) super.clone();
  }

}

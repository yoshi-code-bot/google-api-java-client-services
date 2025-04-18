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

package com.google.api.services.oslogin.v1alpha.model;

/**
 * The response message for signing an SSH public key.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud OS Login API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudOsloginControlplaneRegionalV1alphaSignSshPublicKeyResponse extends com.google.api.client.json.GenericJson {

  /**
   * The signed SSH public key to use in the SSH handshake.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String signedSshPublicKey;

  /**
   * The signed SSH public key to use in the SSH handshake.
   * @return value or {@code null} for none
   */
  public java.lang.String getSignedSshPublicKey() {
    return signedSshPublicKey;
  }

  /**
   * The signed SSH public key to use in the SSH handshake.
   * @param signedSshPublicKey signedSshPublicKey or {@code null} for none
   */
  public GoogleCloudOsloginControlplaneRegionalV1alphaSignSshPublicKeyResponse setSignedSshPublicKey(java.lang.String signedSshPublicKey) {
    this.signedSshPublicKey = signedSshPublicKey;
    return this;
  }

  @Override
  public GoogleCloudOsloginControlplaneRegionalV1alphaSignSshPublicKeyResponse set(String fieldName, Object value) {
    return (GoogleCloudOsloginControlplaneRegionalV1alphaSignSshPublicKeyResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudOsloginControlplaneRegionalV1alphaSignSshPublicKeyResponse clone() {
    return (GoogleCloudOsloginControlplaneRegionalV1alphaSignSshPublicKeyResponse) super.clone();
  }

}

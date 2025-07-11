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

package com.google.api.services.bigquery.model;

/**
 * Options for a user-defined Python function.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PythonOptions extends com.google.api.client.json.GenericJson {

  /**
   * Required. The entry point function in the user's Python code.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String entryPoint;

  /**
   * Optional. A list of package names along with versions to be installed. Follows requirements.txt
   * syntax (e.g. numpy==2.0, permutation, urllib3<2.2.1)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> packages;

  /**
   * Required. The entry point function in the user's Python code.
   * @return value or {@code null} for none
   */
  public java.lang.String getEntryPoint() {
    return entryPoint;
  }

  /**
   * Required. The entry point function in the user's Python code.
   * @param entryPoint entryPoint or {@code null} for none
   */
  public PythonOptions setEntryPoint(java.lang.String entryPoint) {
    this.entryPoint = entryPoint;
    return this;
  }

  /**
   * Optional. A list of package names along with versions to be installed. Follows requirements.txt
   * syntax (e.g. numpy==2.0, permutation, urllib3<2.2.1)
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPackages() {
    return packages;
  }

  /**
   * Optional. A list of package names along with versions to be installed. Follows requirements.txt
   * syntax (e.g. numpy==2.0, permutation, urllib3<2.2.1)
   * @param packages packages or {@code null} for none
   */
  public PythonOptions setPackages(java.util.List<java.lang.String> packages) {
    this.packages = packages;
    return this;
  }

  @Override
  public PythonOptions set(String fieldName, Object value) {
    return (PythonOptions) super.set(fieldName, value);
  }

  @Override
  public PythonOptions clone() {
    return (PythonOptions) super.clone();
  }

}

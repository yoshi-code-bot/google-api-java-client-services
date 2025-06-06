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

package com.google.api.services.dataplex.v1.model;

/**
 * User-specified config for running a Spark task.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataplex API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDataplexV1TaskSparkTaskConfig extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Cloud Storage URIs of archives to be extracted into the working directory of each
   * executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> archiveUris;

  /**
   * Optional. Cloud Storage URIs of files to be placed in the working directory of each executor.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> fileUris;

  /**
   * Optional. Infrastructure specification for the execution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDataplexV1TaskInfrastructureSpec infrastructureSpec;

  /**
   * The name of the driver's main class. The jar file that contains the class must be in the
   * default CLASSPATH or specified in jar_file_uris. The execution args are passed in as a sequence
   * of named process arguments (--key=value).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mainClass;

  /**
   * The Cloud Storage URI of the jar file that contains the main class. The execution args are
   * passed in as a sequence of named process arguments (--key=value).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mainJarFileUri;

  /**
   * The Gcloud Storage URI of the main Python file to use as the driver. Must be a .py file. The
   * execution args are passed in as a sequence of named process arguments (--key=value).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pythonScriptFile;

  /**
   * The query text. The execution args are used to declare a set of script variables (set
   * key="value";).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sqlScript;

  /**
   * A reference to a query file. This should be the Cloud Storage URI of the query file. The
   * execution args are used to declare a set of script variables (set key="value";).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sqlScriptFile;

  /**
   * Optional. Cloud Storage URIs of archives to be extracted into the working directory of each
   * executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getArchiveUris() {
    return archiveUris;
  }

  /**
   * Optional. Cloud Storage URIs of archives to be extracted into the working directory of each
   * executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
   * @param archiveUris archiveUris or {@code null} for none
   */
  public GoogleCloudDataplexV1TaskSparkTaskConfig setArchiveUris(java.util.List<java.lang.String> archiveUris) {
    this.archiveUris = archiveUris;
    return this;
  }

  /**
   * Optional. Cloud Storage URIs of files to be placed in the working directory of each executor.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getFileUris() {
    return fileUris;
  }

  /**
   * Optional. Cloud Storage URIs of files to be placed in the working directory of each executor.
   * @param fileUris fileUris or {@code null} for none
   */
  public GoogleCloudDataplexV1TaskSparkTaskConfig setFileUris(java.util.List<java.lang.String> fileUris) {
    this.fileUris = fileUris;
    return this;
  }

  /**
   * Optional. Infrastructure specification for the execution.
   * @return value or {@code null} for none
   */
  public GoogleCloudDataplexV1TaskInfrastructureSpec getInfrastructureSpec() {
    return infrastructureSpec;
  }

  /**
   * Optional. Infrastructure specification for the execution.
   * @param infrastructureSpec infrastructureSpec or {@code null} for none
   */
  public GoogleCloudDataplexV1TaskSparkTaskConfig setInfrastructureSpec(GoogleCloudDataplexV1TaskInfrastructureSpec infrastructureSpec) {
    this.infrastructureSpec = infrastructureSpec;
    return this;
  }

  /**
   * The name of the driver's main class. The jar file that contains the class must be in the
   * default CLASSPATH or specified in jar_file_uris. The execution args are passed in as a sequence
   * of named process arguments (--key=value).
   * @return value or {@code null} for none
   */
  public java.lang.String getMainClass() {
    return mainClass;
  }

  /**
   * The name of the driver's main class. The jar file that contains the class must be in the
   * default CLASSPATH or specified in jar_file_uris. The execution args are passed in as a sequence
   * of named process arguments (--key=value).
   * @param mainClass mainClass or {@code null} for none
   */
  public GoogleCloudDataplexV1TaskSparkTaskConfig setMainClass(java.lang.String mainClass) {
    this.mainClass = mainClass;
    return this;
  }

  /**
   * The Cloud Storage URI of the jar file that contains the main class. The execution args are
   * passed in as a sequence of named process arguments (--key=value).
   * @return value or {@code null} for none
   */
  public java.lang.String getMainJarFileUri() {
    return mainJarFileUri;
  }

  /**
   * The Cloud Storage URI of the jar file that contains the main class. The execution args are
   * passed in as a sequence of named process arguments (--key=value).
   * @param mainJarFileUri mainJarFileUri or {@code null} for none
   */
  public GoogleCloudDataplexV1TaskSparkTaskConfig setMainJarFileUri(java.lang.String mainJarFileUri) {
    this.mainJarFileUri = mainJarFileUri;
    return this;
  }

  /**
   * The Gcloud Storage URI of the main Python file to use as the driver. Must be a .py file. The
   * execution args are passed in as a sequence of named process arguments (--key=value).
   * @return value or {@code null} for none
   */
  public java.lang.String getPythonScriptFile() {
    return pythonScriptFile;
  }

  /**
   * The Gcloud Storage URI of the main Python file to use as the driver. Must be a .py file. The
   * execution args are passed in as a sequence of named process arguments (--key=value).
   * @param pythonScriptFile pythonScriptFile or {@code null} for none
   */
  public GoogleCloudDataplexV1TaskSparkTaskConfig setPythonScriptFile(java.lang.String pythonScriptFile) {
    this.pythonScriptFile = pythonScriptFile;
    return this;
  }

  /**
   * The query text. The execution args are used to declare a set of script variables (set
   * key="value";).
   * @return value or {@code null} for none
   */
  public java.lang.String getSqlScript() {
    return sqlScript;
  }

  /**
   * The query text. The execution args are used to declare a set of script variables (set
   * key="value";).
   * @param sqlScript sqlScript or {@code null} for none
   */
  public GoogleCloudDataplexV1TaskSparkTaskConfig setSqlScript(java.lang.String sqlScript) {
    this.sqlScript = sqlScript;
    return this;
  }

  /**
   * A reference to a query file. This should be the Cloud Storage URI of the query file. The
   * execution args are used to declare a set of script variables (set key="value";).
   * @return value or {@code null} for none
   */
  public java.lang.String getSqlScriptFile() {
    return sqlScriptFile;
  }

  /**
   * A reference to a query file. This should be the Cloud Storage URI of the query file. The
   * execution args are used to declare a set of script variables (set key="value";).
   * @param sqlScriptFile sqlScriptFile or {@code null} for none
   */
  public GoogleCloudDataplexV1TaskSparkTaskConfig setSqlScriptFile(java.lang.String sqlScriptFile) {
    this.sqlScriptFile = sqlScriptFile;
    return this;
  }

  @Override
  public GoogleCloudDataplexV1TaskSparkTaskConfig set(String fieldName, Object value) {
    return (GoogleCloudDataplexV1TaskSparkTaskConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDataplexV1TaskSparkTaskConfig clone() {
    return (GoogleCloudDataplexV1TaskSparkTaskConfig) super.clone();
  }

}

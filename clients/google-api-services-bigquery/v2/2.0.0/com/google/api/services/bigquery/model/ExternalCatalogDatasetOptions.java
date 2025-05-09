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
 * Options defining open source compatible datasets living in the BigQuery catalog. Contains
 * metadata of open source database, schema, or namespace represented by the current dataset.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExternalCatalogDatasetOptions extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The storage location URI for all tables in the dataset. Equivalent to hive
   * metastore's database locationUri. Maximum length of 1024 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String defaultStorageLocationUri;

  /**
   * Optional. A map of key value pairs defining the parameters and properties of the open source
   * schema. Maximum size of 2MiB.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> parameters;

  /**
   * Optional. The storage location URI for all tables in the dataset. Equivalent to hive
   * metastore's database locationUri. Maximum length of 1024 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDefaultStorageLocationUri() {
    return defaultStorageLocationUri;
  }

  /**
   * Optional. The storage location URI for all tables in the dataset. Equivalent to hive
   * metastore's database locationUri. Maximum length of 1024 characters.
   * @param defaultStorageLocationUri defaultStorageLocationUri or {@code null} for none
   */
  public ExternalCatalogDatasetOptions setDefaultStorageLocationUri(java.lang.String defaultStorageLocationUri) {
    this.defaultStorageLocationUri = defaultStorageLocationUri;
    return this;
  }

  /**
   * Optional. A map of key value pairs defining the parameters and properties of the open source
   * schema. Maximum size of 2MiB.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getParameters() {
    return parameters;
  }

  /**
   * Optional. A map of key value pairs defining the parameters and properties of the open source
   * schema. Maximum size of 2MiB.
   * @param parameters parameters or {@code null} for none
   */
  public ExternalCatalogDatasetOptions setParameters(java.util.Map<String, java.lang.String> parameters) {
    this.parameters = parameters;
    return this;
  }

  @Override
  public ExternalCatalogDatasetOptions set(String fieldName, Object value) {
    return (ExternalCatalogDatasetOptions) super.set(fieldName, value);
  }

  @Override
  public ExternalCatalogDatasetOptions clone() {
    return (ExternalCatalogDatasetOptions) super.clone();
  }

}

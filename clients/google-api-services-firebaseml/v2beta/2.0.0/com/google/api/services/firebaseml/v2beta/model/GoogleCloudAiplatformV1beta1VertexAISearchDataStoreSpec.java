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

package com.google.api.services.firebaseml.v2beta.model;

/**
 * Define data stores within engine to filter on in a search call and configurations for those data
 * stores. For more information, see https://cloud.google.com/generative-ai-app-
 * builder/docs/reference/rpc/google.cloud.discoveryengine.v1#datastorespec
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase ML API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1VertexAISearchDataStoreSpec extends com.google.api.client.json.GenericJson {

  /**
   * Full resource name of DataStore, such as Format:
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{dataStore}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataStore;

  /**
   * Optional. Filter specification to filter documents in the data store specified by data_store
   * field. For more information on filtering, see [Filtering](https://cloud.google.com/generative-
   * ai-app-builder/docs/filter-search-metadata)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filter;

  /**
   * Full resource name of DataStore, such as Format:
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{dataStore}`
   * @return value or {@code null} for none
   */
  public java.lang.String getDataStore() {
    return dataStore;
  }

  /**
   * Full resource name of DataStore, such as Format:
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{dataStore}`
   * @param dataStore dataStore or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1VertexAISearchDataStoreSpec setDataStore(java.lang.String dataStore) {
    this.dataStore = dataStore;
    return this;
  }

  /**
   * Optional. Filter specification to filter documents in the data store specified by data_store
   * field. For more information on filtering, see [Filtering](https://cloud.google.com/generative-
   * ai-app-builder/docs/filter-search-metadata)
   * @return value or {@code null} for none
   */
  public java.lang.String getFilter() {
    return filter;
  }

  /**
   * Optional. Filter specification to filter documents in the data store specified by data_store
   * field. For more information on filtering, see [Filtering](https://cloud.google.com/generative-
   * ai-app-builder/docs/filter-search-metadata)
   * @param filter filter or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1VertexAISearchDataStoreSpec setFilter(java.lang.String filter) {
    this.filter = filter;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1VertexAISearchDataStoreSpec set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1VertexAISearchDataStoreSpec) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1VertexAISearchDataStoreSpec clone() {
    return (GoogleCloudAiplatformV1beta1VertexAISearchDataStoreSpec) super.clone();
  }

}

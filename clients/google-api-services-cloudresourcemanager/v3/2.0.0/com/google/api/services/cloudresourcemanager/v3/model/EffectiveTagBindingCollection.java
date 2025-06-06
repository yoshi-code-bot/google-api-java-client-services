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

package com.google.api.services.cloudresourcemanager.v3.model;

/**
 * Represents a collection of effective tag bindings for a GCP resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Resource Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EffectiveTagBindingCollection extends com.google.api.client.json.GenericJson {

  /**
   * Tag keys/values effectively bound to this resource, specified in namespaced format. For
   * example: "123/environment": "production"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> effectiveTags;

  /**
   * The full resource name of the resource the TagBindings are bound to. E.g.
   * `//cloudresourcemanager.googleapis.com/projects/123`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fullResourceName;

  /**
   * Identifier. The name of the EffectiveTagBindingCollection, following the convention:
   * `locations/{location}/effectiveTagBindingCollections/{encoded-full-resource-name}` where the
   * encoded-full-resource-name is the UTF-8 encoded name of the GCP resource the TagBindings are
   * bound to. E.g. "locations/global/effectiveTagBindingCollections/%2f%2fcloudresourcemanager.goog
   * leapis.com%2fprojects%2f123"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Tag keys/values effectively bound to this resource, specified in namespaced format. For
   * example: "123/environment": "production"
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getEffectiveTags() {
    return effectiveTags;
  }

  /**
   * Tag keys/values effectively bound to this resource, specified in namespaced format. For
   * example: "123/environment": "production"
   * @param effectiveTags effectiveTags or {@code null} for none
   */
  public EffectiveTagBindingCollection setEffectiveTags(java.util.Map<String, java.lang.String> effectiveTags) {
    this.effectiveTags = effectiveTags;
    return this;
  }

  /**
   * The full resource name of the resource the TagBindings are bound to. E.g.
   * `//cloudresourcemanager.googleapis.com/projects/123`
   * @return value or {@code null} for none
   */
  public java.lang.String getFullResourceName() {
    return fullResourceName;
  }

  /**
   * The full resource name of the resource the TagBindings are bound to. E.g.
   * `//cloudresourcemanager.googleapis.com/projects/123`
   * @param fullResourceName fullResourceName or {@code null} for none
   */
  public EffectiveTagBindingCollection setFullResourceName(java.lang.String fullResourceName) {
    this.fullResourceName = fullResourceName;
    return this;
  }

  /**
   * Identifier. The name of the EffectiveTagBindingCollection, following the convention:
   * `locations/{location}/effectiveTagBindingCollections/{encoded-full-resource-name}` where the
   * encoded-full-resource-name is the UTF-8 encoded name of the GCP resource the TagBindings are
   * bound to. E.g. "locations/global/effectiveTagBindingCollections/%2f%2fcloudresourcemanager.goog
   * leapis.com%2fprojects%2f123"
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Identifier. The name of the EffectiveTagBindingCollection, following the convention:
   * `locations/{location}/effectiveTagBindingCollections/{encoded-full-resource-name}` where the
   * encoded-full-resource-name is the UTF-8 encoded name of the GCP resource the TagBindings are
   * bound to. E.g. "locations/global/effectiveTagBindingCollections/%2f%2fcloudresourcemanager.goog
   * leapis.com%2fprojects%2f123"
   * @param name name or {@code null} for none
   */
  public EffectiveTagBindingCollection setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public EffectiveTagBindingCollection set(String fieldName, Object value) {
    return (EffectiveTagBindingCollection) super.set(fieldName, value);
  }

  @Override
  public EffectiveTagBindingCollection clone() {
    return (EffectiveTagBindingCollection) super.clone();
  }

}

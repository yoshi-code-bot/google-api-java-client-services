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
 * A boundary on the scope of impact that the metadata import job can have.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataplex API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDataplexV1MetadataJobImportJobSpecImportJobScope extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The aspect types that are in scope for the import job, specified as relative resource
   * names in the format
   * projects/{project_number_or_id}/locations/{location_id}/aspectTypes/{aspect_type_id}. The job
   * modifies only the aspects that belong to these aspect types.This field is required when
   * creating an aspect-only import job.If the metadata import file attempts to modify an aspect
   * whose type isn't included in this list, the import job is halted before modifying any entries
   * or aspects.The location of an aspect type must either match the location of the job, or the
   * aspect type must be global.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> aspectTypes;

  /**
   * Required. The entry group that is in scope for the import job, specified as a relative resource
   * name in the format
   * projects/{project_number_or_id}/locations/{location_id}/entryGroups/{entry_group_id}. Only
   * entries and aspects that belong to the specified entry group are affected by the job.Must
   * contain exactly one element. The entry group and the job must be in the same location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> entryGroups;

  /**
   * Optional. The entry link types that are in scope for the import job, specified as relative
   * resource names in the format
   * projects/{project_number_or_id}/locations/{location_id}/entryLinkTypes/{entry_link_type_id}.
   * The job modifies only the entryLinks that belong to these entry link types.If the metadata
   * import file attempts to create or delete an entry link whose entry link type isn't included in
   * this list, the import job will skip those entry links.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> entryLinkTypes;

  /**
   * Required. The entry types that are in scope for the import job, specified as relative resource
   * names in the format
   * projects/{project_number_or_id}/locations/{location_id}/entryTypes/{entry_type_id}. The job
   * modifies only the entries and aspects that belong to these entry types.If the metadata import
   * file attempts to modify an entry whose type isn't included in this list, the import job is
   * halted before modifying any entries or aspects.The location of an entry type must either match
   * the location of the job, or the entry type must be global.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> entryTypes;

  /**
   * Optional. The glossaries that are in scope for the import job, specified as relative resource
   * names in the format
   * projects/{project_number_or_id}/locations/{location_id}/glossaries/{glossary_id}.While
   * importing Business Glossary entries, the user must provide glossaries. While importing entries,
   * the user does not have to provide glossaries. If the metadata import file attempts to modify
   * Business Glossary entries whose glossary isn't included in this list, the import job will skip
   * those entries.The location of a glossary must either match the location of the job, or the
   * glossary must be global.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> glossaries;

  /**
   * Optional. Defines the scope of entries that can be referenced in the entry links.Currently,
   * projects are supported as valid scopes. Format: projects/{project_number_or_id}If the metadata
   * import file attempts to create an entry link which references an entry that is not in the
   * scope, the import job will skip that entry link.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> referencedEntryScopes;

  /**
   * Optional. The aspect types that are in scope for the import job, specified as relative resource
   * names in the format
   * projects/{project_number_or_id}/locations/{location_id}/aspectTypes/{aspect_type_id}. The job
   * modifies only the aspects that belong to these aspect types.This field is required when
   * creating an aspect-only import job.If the metadata import file attempts to modify an aspect
   * whose type isn't included in this list, the import job is halted before modifying any entries
   * or aspects.The location of an aspect type must either match the location of the job, or the
   * aspect type must be global.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAspectTypes() {
    return aspectTypes;
  }

  /**
   * Optional. The aspect types that are in scope for the import job, specified as relative resource
   * names in the format
   * projects/{project_number_or_id}/locations/{location_id}/aspectTypes/{aspect_type_id}. The job
   * modifies only the aspects that belong to these aspect types.This field is required when
   * creating an aspect-only import job.If the metadata import file attempts to modify an aspect
   * whose type isn't included in this list, the import job is halted before modifying any entries
   * or aspects.The location of an aspect type must either match the location of the job, or the
   * aspect type must be global.
   * @param aspectTypes aspectTypes or {@code null} for none
   */
  public GoogleCloudDataplexV1MetadataJobImportJobSpecImportJobScope setAspectTypes(java.util.List<java.lang.String> aspectTypes) {
    this.aspectTypes = aspectTypes;
    return this;
  }

  /**
   * Required. The entry group that is in scope for the import job, specified as a relative resource
   * name in the format
   * projects/{project_number_or_id}/locations/{location_id}/entryGroups/{entry_group_id}. Only
   * entries and aspects that belong to the specified entry group are affected by the job.Must
   * contain exactly one element. The entry group and the job must be in the same location.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getEntryGroups() {
    return entryGroups;
  }

  /**
   * Required. The entry group that is in scope for the import job, specified as a relative resource
   * name in the format
   * projects/{project_number_or_id}/locations/{location_id}/entryGroups/{entry_group_id}. Only
   * entries and aspects that belong to the specified entry group are affected by the job.Must
   * contain exactly one element. The entry group and the job must be in the same location.
   * @param entryGroups entryGroups or {@code null} for none
   */
  public GoogleCloudDataplexV1MetadataJobImportJobSpecImportJobScope setEntryGroups(java.util.List<java.lang.String> entryGroups) {
    this.entryGroups = entryGroups;
    return this;
  }

  /**
   * Optional. The entry link types that are in scope for the import job, specified as relative
   * resource names in the format
   * projects/{project_number_or_id}/locations/{location_id}/entryLinkTypes/{entry_link_type_id}.
   * The job modifies only the entryLinks that belong to these entry link types.If the metadata
   * import file attempts to create or delete an entry link whose entry link type isn't included in
   * this list, the import job will skip those entry links.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getEntryLinkTypes() {
    return entryLinkTypes;
  }

  /**
   * Optional. The entry link types that are in scope for the import job, specified as relative
   * resource names in the format
   * projects/{project_number_or_id}/locations/{location_id}/entryLinkTypes/{entry_link_type_id}.
   * The job modifies only the entryLinks that belong to these entry link types.If the metadata
   * import file attempts to create or delete an entry link whose entry link type isn't included in
   * this list, the import job will skip those entry links.
   * @param entryLinkTypes entryLinkTypes or {@code null} for none
   */
  public GoogleCloudDataplexV1MetadataJobImportJobSpecImportJobScope setEntryLinkTypes(java.util.List<java.lang.String> entryLinkTypes) {
    this.entryLinkTypes = entryLinkTypes;
    return this;
  }

  /**
   * Required. The entry types that are in scope for the import job, specified as relative resource
   * names in the format
   * projects/{project_number_or_id}/locations/{location_id}/entryTypes/{entry_type_id}. The job
   * modifies only the entries and aspects that belong to these entry types.If the metadata import
   * file attempts to modify an entry whose type isn't included in this list, the import job is
   * halted before modifying any entries or aspects.The location of an entry type must either match
   * the location of the job, or the entry type must be global.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getEntryTypes() {
    return entryTypes;
  }

  /**
   * Required. The entry types that are in scope for the import job, specified as relative resource
   * names in the format
   * projects/{project_number_or_id}/locations/{location_id}/entryTypes/{entry_type_id}. The job
   * modifies only the entries and aspects that belong to these entry types.If the metadata import
   * file attempts to modify an entry whose type isn't included in this list, the import job is
   * halted before modifying any entries or aspects.The location of an entry type must either match
   * the location of the job, or the entry type must be global.
   * @param entryTypes entryTypes or {@code null} for none
   */
  public GoogleCloudDataplexV1MetadataJobImportJobSpecImportJobScope setEntryTypes(java.util.List<java.lang.String> entryTypes) {
    this.entryTypes = entryTypes;
    return this;
  }

  /**
   * Optional. The glossaries that are in scope for the import job, specified as relative resource
   * names in the format
   * projects/{project_number_or_id}/locations/{location_id}/glossaries/{glossary_id}.While
   * importing Business Glossary entries, the user must provide glossaries. While importing entries,
   * the user does not have to provide glossaries. If the metadata import file attempts to modify
   * Business Glossary entries whose glossary isn't included in this list, the import job will skip
   * those entries.The location of a glossary must either match the location of the job, or the
   * glossary must be global.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getGlossaries() {
    return glossaries;
  }

  /**
   * Optional. The glossaries that are in scope for the import job, specified as relative resource
   * names in the format
   * projects/{project_number_or_id}/locations/{location_id}/glossaries/{glossary_id}.While
   * importing Business Glossary entries, the user must provide glossaries. While importing entries,
   * the user does not have to provide glossaries. If the metadata import file attempts to modify
   * Business Glossary entries whose glossary isn't included in this list, the import job will skip
   * those entries.The location of a glossary must either match the location of the job, or the
   * glossary must be global.
   * @param glossaries glossaries or {@code null} for none
   */
  public GoogleCloudDataplexV1MetadataJobImportJobSpecImportJobScope setGlossaries(java.util.List<java.lang.String> glossaries) {
    this.glossaries = glossaries;
    return this;
  }

  /**
   * Optional. Defines the scope of entries that can be referenced in the entry links.Currently,
   * projects are supported as valid scopes. Format: projects/{project_number_or_id}If the metadata
   * import file attempts to create an entry link which references an entry that is not in the
   * scope, the import job will skip that entry link.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getReferencedEntryScopes() {
    return referencedEntryScopes;
  }

  /**
   * Optional. Defines the scope of entries that can be referenced in the entry links.Currently,
   * projects are supported as valid scopes. Format: projects/{project_number_or_id}If the metadata
   * import file attempts to create an entry link which references an entry that is not in the
   * scope, the import job will skip that entry link.
   * @param referencedEntryScopes referencedEntryScopes or {@code null} for none
   */
  public GoogleCloudDataplexV1MetadataJobImportJobSpecImportJobScope setReferencedEntryScopes(java.util.List<java.lang.String> referencedEntryScopes) {
    this.referencedEntryScopes = referencedEntryScopes;
    return this;
  }

  @Override
  public GoogleCloudDataplexV1MetadataJobImportJobSpecImportJobScope set(String fieldName, Object value) {
    return (GoogleCloudDataplexV1MetadataJobImportJobSpecImportJobScope) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDataplexV1MetadataJobImportJobSpecImportJobScope clone() {
    return (GoogleCloudDataplexV1MetadataJobImportJobSpecImportJobScope) super.clone();
  }

}

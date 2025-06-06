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

package com.google.api.services.healthcare.v1beta1.model;

/**
 * Represents a FHIR store.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FhirStore extends com.google.api.client.json.GenericJson {

  /**
   * Optional. FHIR bulk export exports resources to the specified Cloud Storage destination. A
   * Cloud Storage destination is a URI for a Cloud Storage directory where result files will be
   * written. Only used in the spec-defined bulk $export methods. The Cloud Healthcare Service Agent
   * requires the `roles/storage.objectAdmin` Cloud IAM role on the destination.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BulkExportGcsDestination bulkExportGcsDestination;

  /**
   * Enable parsing of references within complex FHIR data types such as Extensions. If this value
   * is set to ENABLED, then features like referential integrity and Bundle reference rewriting
   * apply to all references. If this flag has not been specified the behavior of the FHIR store
   * will not change, references in complex data types will not be parsed. New stores will have this
   * value set to ENABLED after a notification period. Warning: turning on this flag causes
   * processing existing resources to fail if they contain references to non-existent resources.
   * Cannot be disabled in R5.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String complexDataTypeReferenceParsing;

  /**
   * Optional. Specifies whether this store has consent enforcement. Not available for DSTU2 FHIR
   * version due to absence of Consent resources. Not supported for R5 FHIR version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConsentConfig consentConfig;

  /**
   * If true, overrides the default search behavior for this FHIR store to `handling=strict` which
   * returns an error for unrecognized search parameters. If false, uses the FHIR specification
   * default `handling=lenient` which ignores unrecognized search parameters. The handling can
   * always be changed from the default on an individual API call by setting the HTTP header
   * `Prefer: handling=strict` or `Prefer: handling=lenient`. Defaults to false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean defaultSearchHandlingStrict;

  /**
   * Immutable. Whether to disable referential integrity in this FHIR store. This field is immutable
   * after FHIR store creation. The default value is false, meaning that the API enforces
   * referential integrity and fails the requests that result in inconsistent state in the FHIR
   * store. When this field is set to true, the API skips referential integrity checks.
   * Consequently, operations that rely on references, such as GetPatientEverything, do not return
   * all the results if broken references exist.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disableReferentialIntegrity;

  /**
   * Immutable. Whether to disable resource versioning for this FHIR store. This field can not be
   * changed after the creation of FHIR store. If set to false, all write operations cause
   * historical versions to be recorded automatically. The historical versions can be fetched
   * through the history APIs, but cannot be updated. If set to true, no historical versions are
   * kept. The server sends errors for attempts to read the historical versions. Defaults to false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disableResourceVersioning;

  /**
   * Optional. Whether to allow ExecuteBundle to accept history bundles, and directly insert and
   * overwrite historical resource versions into the FHIR store. If set to false, using history
   * bundles fails with an error. Defaults to false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableHistoryModifications;

  /**
   * Whether this FHIR store has the [updateCreate
   * capability](https://www.hl7.org/fhir/capabilitystatement-
   * definitions.html#CapabilityStatement.rest.resource.updateCreate). This determines if the client
   * can use an Update operation to create a new resource with a client-specified ID. If false, all
   * IDs are server-assigned through the Create operation and attempts to update a non-existent
   * resource return errors. It is strongly advised not to include or encode any sensitive data such
   * as patient identifiers in client-specified resource IDs. Those IDs are part of the FHIR
   * resource path recorded in Cloud audit logs and Pub/Sub notifications. Those IDs can also be
   * contained in reference fields within other resources. Defaults to false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableUpdateCreate;

  /**
   * User-supplied key-value pairs used to organize FHIR stores. Label keys must be between 1 and 63
   * characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following
   * PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values are optional, must be between 1 and 63
   * characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following
   * PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated
   * with a given store.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Output only. Identifier. Resource name of the FHIR store, of the form
   * `projects/{project_id}/locations/{location}/datasets/{dataset_id}/fhirStores/{fhir_store_id}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Deprecated. Use `notification_configs` instead. If non-empty, publish all resource
   * modifications of this FHIR store to this destination. The Pub/Sub message attributes contain a
   * map with a string describing the action that has triggered the notification. For example,
   * "action":"CreateResource". Not supported in R5. Use `notification_configs` instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NotificationConfig notificationConfig;

  /**
   * Specifies where and whether to send notifications upon changes to a Fhir store.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<FhirNotificationConfig> notificationConfigs;

  static {
    // hack to force ProGuard to consider FhirNotificationConfig used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(FhirNotificationConfig.class);
  }

  /**
   * Configuration for how FHIR resources can be searched.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SearchConfig searchConfig;

  /**
   * A list of streaming configs that configure the destinations of streaming export for every
   * resource mutation in this FHIR store. Each store is allowed to have up to 10 streaming configs.
   * After a new config is added, the next resource mutation is streamed to the new location in
   * addition to the existing ones. When a location is removed from the list, the server stops
   * streaming to that location. Before adding a new config, you must add the required
   * [`bigquery.dataEditor`](https://cloud.google.com/bigquery/docs/access-
   * control#bigquery.dataEditor) role to your project's **Cloud Healthcare Service Agent** [service
   * account](https://cloud.google.com/iam/docs/service-accounts). Some lag (typically on the order
   * of dozens of seconds) is expected before the results show up in the streaming destination.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<StreamConfig> streamConfigs;

  /**
   * Configuration for how to validate incoming FHIR resources against configured profiles.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ValidationConfig validationConfig;

  /**
   * Required. Immutable. The FHIR specification version that this FHIR store supports natively.
   * This field is immutable after store creation. Requests are rejected if they contain FHIR
   * resources of a different version. Version is required for every FHIR store.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * Optional. FHIR bulk export exports resources to the specified Cloud Storage destination. A
   * Cloud Storage destination is a URI for a Cloud Storage directory where result files will be
   * written. Only used in the spec-defined bulk $export methods. The Cloud Healthcare Service Agent
   * requires the `roles/storage.objectAdmin` Cloud IAM role on the destination.
   * @return value or {@code null} for none
   */
  public BulkExportGcsDestination getBulkExportGcsDestination() {
    return bulkExportGcsDestination;
  }

  /**
   * Optional. FHIR bulk export exports resources to the specified Cloud Storage destination. A
   * Cloud Storage destination is a URI for a Cloud Storage directory where result files will be
   * written. Only used in the spec-defined bulk $export methods. The Cloud Healthcare Service Agent
   * requires the `roles/storage.objectAdmin` Cloud IAM role on the destination.
   * @param bulkExportGcsDestination bulkExportGcsDestination or {@code null} for none
   */
  public FhirStore setBulkExportGcsDestination(BulkExportGcsDestination bulkExportGcsDestination) {
    this.bulkExportGcsDestination = bulkExportGcsDestination;
    return this;
  }

  /**
   * Enable parsing of references within complex FHIR data types such as Extensions. If this value
   * is set to ENABLED, then features like referential integrity and Bundle reference rewriting
   * apply to all references. If this flag has not been specified the behavior of the FHIR store
   * will not change, references in complex data types will not be parsed. New stores will have this
   * value set to ENABLED after a notification period. Warning: turning on this flag causes
   * processing existing resources to fail if they contain references to non-existent resources.
   * Cannot be disabled in R5.
   * @return value or {@code null} for none
   */
  public java.lang.String getComplexDataTypeReferenceParsing() {
    return complexDataTypeReferenceParsing;
  }

  /**
   * Enable parsing of references within complex FHIR data types such as Extensions. If this value
   * is set to ENABLED, then features like referential integrity and Bundle reference rewriting
   * apply to all references. If this flag has not been specified the behavior of the FHIR store
   * will not change, references in complex data types will not be parsed. New stores will have this
   * value set to ENABLED after a notification period. Warning: turning on this flag causes
   * processing existing resources to fail if they contain references to non-existent resources.
   * Cannot be disabled in R5.
   * @param complexDataTypeReferenceParsing complexDataTypeReferenceParsing or {@code null} for none
   */
  public FhirStore setComplexDataTypeReferenceParsing(java.lang.String complexDataTypeReferenceParsing) {
    this.complexDataTypeReferenceParsing = complexDataTypeReferenceParsing;
    return this;
  }

  /**
   * Optional. Specifies whether this store has consent enforcement. Not available for DSTU2 FHIR
   * version due to absence of Consent resources. Not supported for R5 FHIR version.
   * @return value or {@code null} for none
   */
  public ConsentConfig getConsentConfig() {
    return consentConfig;
  }

  /**
   * Optional. Specifies whether this store has consent enforcement. Not available for DSTU2 FHIR
   * version due to absence of Consent resources. Not supported for R5 FHIR version.
   * @param consentConfig consentConfig or {@code null} for none
   */
  public FhirStore setConsentConfig(ConsentConfig consentConfig) {
    this.consentConfig = consentConfig;
    return this;
  }

  /**
   * If true, overrides the default search behavior for this FHIR store to `handling=strict` which
   * returns an error for unrecognized search parameters. If false, uses the FHIR specification
   * default `handling=lenient` which ignores unrecognized search parameters. The handling can
   * always be changed from the default on an individual API call by setting the HTTP header
   * `Prefer: handling=strict` or `Prefer: handling=lenient`. Defaults to false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDefaultSearchHandlingStrict() {
    return defaultSearchHandlingStrict;
  }

  /**
   * If true, overrides the default search behavior for this FHIR store to `handling=strict` which
   * returns an error for unrecognized search parameters. If false, uses the FHIR specification
   * default `handling=lenient` which ignores unrecognized search parameters. The handling can
   * always be changed from the default on an individual API call by setting the HTTP header
   * `Prefer: handling=strict` or `Prefer: handling=lenient`. Defaults to false.
   * @param defaultSearchHandlingStrict defaultSearchHandlingStrict or {@code null} for none
   */
  public FhirStore setDefaultSearchHandlingStrict(java.lang.Boolean defaultSearchHandlingStrict) {
    this.defaultSearchHandlingStrict = defaultSearchHandlingStrict;
    return this;
  }

  /**
   * Immutable. Whether to disable referential integrity in this FHIR store. This field is immutable
   * after FHIR store creation. The default value is false, meaning that the API enforces
   * referential integrity and fails the requests that result in inconsistent state in the FHIR
   * store. When this field is set to true, the API skips referential integrity checks.
   * Consequently, operations that rely on references, such as GetPatientEverything, do not return
   * all the results if broken references exist.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisableReferentialIntegrity() {
    return disableReferentialIntegrity;
  }

  /**
   * Immutable. Whether to disable referential integrity in this FHIR store. This field is immutable
   * after FHIR store creation. The default value is false, meaning that the API enforces
   * referential integrity and fails the requests that result in inconsistent state in the FHIR
   * store. When this field is set to true, the API skips referential integrity checks.
   * Consequently, operations that rely on references, such as GetPatientEverything, do not return
   * all the results if broken references exist.
   * @param disableReferentialIntegrity disableReferentialIntegrity or {@code null} for none
   */
  public FhirStore setDisableReferentialIntegrity(java.lang.Boolean disableReferentialIntegrity) {
    this.disableReferentialIntegrity = disableReferentialIntegrity;
    return this;
  }

  /**
   * Immutable. Whether to disable resource versioning for this FHIR store. This field can not be
   * changed after the creation of FHIR store. If set to false, all write operations cause
   * historical versions to be recorded automatically. The historical versions can be fetched
   * through the history APIs, but cannot be updated. If set to true, no historical versions are
   * kept. The server sends errors for attempts to read the historical versions. Defaults to false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisableResourceVersioning() {
    return disableResourceVersioning;
  }

  /**
   * Immutable. Whether to disable resource versioning for this FHIR store. This field can not be
   * changed after the creation of FHIR store. If set to false, all write operations cause
   * historical versions to be recorded automatically. The historical versions can be fetched
   * through the history APIs, but cannot be updated. If set to true, no historical versions are
   * kept. The server sends errors for attempts to read the historical versions. Defaults to false.
   * @param disableResourceVersioning disableResourceVersioning or {@code null} for none
   */
  public FhirStore setDisableResourceVersioning(java.lang.Boolean disableResourceVersioning) {
    this.disableResourceVersioning = disableResourceVersioning;
    return this;
  }

  /**
   * Optional. Whether to allow ExecuteBundle to accept history bundles, and directly insert and
   * overwrite historical resource versions into the FHIR store. If set to false, using history
   * bundles fails with an error. Defaults to false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableHistoryModifications() {
    return enableHistoryModifications;
  }

  /**
   * Optional. Whether to allow ExecuteBundle to accept history bundles, and directly insert and
   * overwrite historical resource versions into the FHIR store. If set to false, using history
   * bundles fails with an error. Defaults to false.
   * @param enableHistoryModifications enableHistoryModifications or {@code null} for none
   */
  public FhirStore setEnableHistoryModifications(java.lang.Boolean enableHistoryModifications) {
    this.enableHistoryModifications = enableHistoryModifications;
    return this;
  }

  /**
   * Whether this FHIR store has the [updateCreate
   * capability](https://www.hl7.org/fhir/capabilitystatement-
   * definitions.html#CapabilityStatement.rest.resource.updateCreate). This determines if the client
   * can use an Update operation to create a new resource with a client-specified ID. If false, all
   * IDs are server-assigned through the Create operation and attempts to update a non-existent
   * resource return errors. It is strongly advised not to include or encode any sensitive data such
   * as patient identifiers in client-specified resource IDs. Those IDs are part of the FHIR
   * resource path recorded in Cloud audit logs and Pub/Sub notifications. Those IDs can also be
   * contained in reference fields within other resources. Defaults to false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableUpdateCreate() {
    return enableUpdateCreate;
  }

  /**
   * Whether this FHIR store has the [updateCreate
   * capability](https://www.hl7.org/fhir/capabilitystatement-
   * definitions.html#CapabilityStatement.rest.resource.updateCreate). This determines if the client
   * can use an Update operation to create a new resource with a client-specified ID. If false, all
   * IDs are server-assigned through the Create operation and attempts to update a non-existent
   * resource return errors. It is strongly advised not to include or encode any sensitive data such
   * as patient identifiers in client-specified resource IDs. Those IDs are part of the FHIR
   * resource path recorded in Cloud audit logs and Pub/Sub notifications. Those IDs can also be
   * contained in reference fields within other resources. Defaults to false.
   * @param enableUpdateCreate enableUpdateCreate or {@code null} for none
   */
  public FhirStore setEnableUpdateCreate(java.lang.Boolean enableUpdateCreate) {
    this.enableUpdateCreate = enableUpdateCreate;
    return this;
  }

  /**
   * User-supplied key-value pairs used to organize FHIR stores. Label keys must be between 1 and 63
   * characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following
   * PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values are optional, must be between 1 and 63
   * characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following
   * PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated
   * with a given store.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * User-supplied key-value pairs used to organize FHIR stores. Label keys must be between 1 and 63
   * characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following
   * PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values are optional, must be between 1 and 63
   * characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following
   * PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated
   * with a given store.
   * @param labels labels or {@code null} for none
   */
  public FhirStore setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Output only. Identifier. Resource name of the FHIR store, of the form
   * `projects/{project_id}/locations/{location}/datasets/{dataset_id}/fhirStores/{fhir_store_id}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Identifier. Resource name of the FHIR store, of the form
   * `projects/{project_id}/locations/{location}/datasets/{dataset_id}/fhirStores/{fhir_store_id}`.
   * @param name name or {@code null} for none
   */
  public FhirStore setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Deprecated. Use `notification_configs` instead. If non-empty, publish all resource
   * modifications of this FHIR store to this destination. The Pub/Sub message attributes contain a
   * map with a string describing the action that has triggered the notification. For example,
   * "action":"CreateResource". Not supported in R5. Use `notification_configs` instead.
   * @return value or {@code null} for none
   */
  public NotificationConfig getNotificationConfig() {
    return notificationConfig;
  }

  /**
   * Deprecated. Use `notification_configs` instead. If non-empty, publish all resource
   * modifications of this FHIR store to this destination. The Pub/Sub message attributes contain a
   * map with a string describing the action that has triggered the notification. For example,
   * "action":"CreateResource". Not supported in R5. Use `notification_configs` instead.
   * @param notificationConfig notificationConfig or {@code null} for none
   */
  public FhirStore setNotificationConfig(NotificationConfig notificationConfig) {
    this.notificationConfig = notificationConfig;
    return this;
  }

  /**
   * Specifies where and whether to send notifications upon changes to a Fhir store.
   * @return value or {@code null} for none
   */
  public java.util.List<FhirNotificationConfig> getNotificationConfigs() {
    return notificationConfigs;
  }

  /**
   * Specifies where and whether to send notifications upon changes to a Fhir store.
   * @param notificationConfigs notificationConfigs or {@code null} for none
   */
  public FhirStore setNotificationConfigs(java.util.List<FhirNotificationConfig> notificationConfigs) {
    this.notificationConfigs = notificationConfigs;
    return this;
  }

  /**
   * Configuration for how FHIR resources can be searched.
   * @return value or {@code null} for none
   */
  public SearchConfig getSearchConfig() {
    return searchConfig;
  }

  /**
   * Configuration for how FHIR resources can be searched.
   * @param searchConfig searchConfig or {@code null} for none
   */
  public FhirStore setSearchConfig(SearchConfig searchConfig) {
    this.searchConfig = searchConfig;
    return this;
  }

  /**
   * A list of streaming configs that configure the destinations of streaming export for every
   * resource mutation in this FHIR store. Each store is allowed to have up to 10 streaming configs.
   * After a new config is added, the next resource mutation is streamed to the new location in
   * addition to the existing ones. When a location is removed from the list, the server stops
   * streaming to that location. Before adding a new config, you must add the required
   * [`bigquery.dataEditor`](https://cloud.google.com/bigquery/docs/access-
   * control#bigquery.dataEditor) role to your project's **Cloud Healthcare Service Agent** [service
   * account](https://cloud.google.com/iam/docs/service-accounts). Some lag (typically on the order
   * of dozens of seconds) is expected before the results show up in the streaming destination.
   * @return value or {@code null} for none
   */
  public java.util.List<StreamConfig> getStreamConfigs() {
    return streamConfigs;
  }

  /**
   * A list of streaming configs that configure the destinations of streaming export for every
   * resource mutation in this FHIR store. Each store is allowed to have up to 10 streaming configs.
   * After a new config is added, the next resource mutation is streamed to the new location in
   * addition to the existing ones. When a location is removed from the list, the server stops
   * streaming to that location. Before adding a new config, you must add the required
   * [`bigquery.dataEditor`](https://cloud.google.com/bigquery/docs/access-
   * control#bigquery.dataEditor) role to your project's **Cloud Healthcare Service Agent** [service
   * account](https://cloud.google.com/iam/docs/service-accounts). Some lag (typically on the order
   * of dozens of seconds) is expected before the results show up in the streaming destination.
   * @param streamConfigs streamConfigs or {@code null} for none
   */
  public FhirStore setStreamConfigs(java.util.List<StreamConfig> streamConfigs) {
    this.streamConfigs = streamConfigs;
    return this;
  }

  /**
   * Configuration for how to validate incoming FHIR resources against configured profiles.
   * @return value or {@code null} for none
   */
  public ValidationConfig getValidationConfig() {
    return validationConfig;
  }

  /**
   * Configuration for how to validate incoming FHIR resources against configured profiles.
   * @param validationConfig validationConfig or {@code null} for none
   */
  public FhirStore setValidationConfig(ValidationConfig validationConfig) {
    this.validationConfig = validationConfig;
    return this;
  }

  /**
   * Required. Immutable. The FHIR specification version that this FHIR store supports natively.
   * This field is immutable after store creation. Requests are rejected if they contain FHIR
   * resources of a different version. Version is required for every FHIR store.
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * Required. Immutable. The FHIR specification version that this FHIR store supports natively.
   * This field is immutable after store creation. Requests are rejected if they contain FHIR
   * resources of a different version. Version is required for every FHIR store.
   * @param version version or {@code null} for none
   */
  public FhirStore setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  @Override
  public FhirStore set(String fieldName, Object value) {
    return (FhirStore) super.set(fieldName, value);
  }

  @Override
  public FhirStore clone() {
    return (FhirStore) super.clone();
  }

}

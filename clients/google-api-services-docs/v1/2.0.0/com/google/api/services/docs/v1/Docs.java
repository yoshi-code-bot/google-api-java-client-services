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

package com.google.api.services.docs.v1;

/**
 * Service definition for Docs (v1).
 *
 * <p>
 * Reads and writes Google Docs documents.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://developers.google.com/workspace/docs/" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link DocsRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Docs extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        (com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        (com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 32 ||
        (com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION == 31 &&
        com.google.api.client.googleapis.GoogleUtils.BUGFIX_VERSION >= 1))) ||
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION >= 2,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.31.1 of google-api-client to run version " +
        "2.0.0 of the Google Docs API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://docs.googleapis.com/";

  /**
   * The default encoded mTLS root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.31
   */
  public static final String DEFAULT_MTLS_ROOT_URL = "https://docs.mtls.googleapis.com/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "";

  /**
   * The default encoded batch path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.23
   */
  public static final String DEFAULT_BATCH_PATH = "batch";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Docs(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Docs(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Documents collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Docs docs = new Docs(...);}
   *   {@code Docs.Documents.List request = docs.documents().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Documents documents() {
    return new Documents();
  }

  /**
   * The "documents" collection of methods.
   */
  public class Documents {

    /**
     * Applies one or more updates to the document. Each request is validated before being applied. If
     * any request is not valid, then the entire request will fail and nothing will be applied. Some
     * requests have replies to give you some information about how they are applied. Other requests do
     * not need to return information; these each return an empty reply. The order of replies matches
     * that of the requests. For example, suppose you call batchUpdate with four updates, and only the
     * third one returns information. The response would have two empty replies, the reply to the third
     * request, and another empty reply, in that order. Because other users may be editing the document,
     * the document might not exactly reflect your changes: your changes may be altered with respect to
     * collaborator changes. If there are no collaborators, the document should reflect your changes. In
     * any case, the updates in your request are guaranteed to be applied together atomically.
     *
     * Create a request for the method "documents.batchUpdate".
     *
     * This request holds the parameters needed by the docs server.  After setting any optional
     * parameters, call the {@link BatchUpdate#execute()} method to invoke the remote operation.
     *
     * @param documentId The ID of the document to update.
     * @param content the {@link com.google.api.services.docs.v1.model.BatchUpdateDocumentRequest}
     * @return the request
     */
    public BatchUpdate batchUpdate(java.lang.String documentId, com.google.api.services.docs.v1.model.BatchUpdateDocumentRequest content) throws java.io.IOException {
      BatchUpdate result = new BatchUpdate(documentId, content);
      initialize(result);
      return result;
    }

    public class BatchUpdate extends DocsRequest<com.google.api.services.docs.v1.model.BatchUpdateDocumentResponse> {

      private static final String REST_PATH = "v1/documents/{documentId}:batchUpdate";

      /**
       * Applies one or more updates to the document. Each request is validated before being applied. If
       * any request is not valid, then the entire request will fail and nothing will be applied. Some
       * requests have replies to give you some information about how they are applied. Other requests
       * do not need to return information; these each return an empty reply. The order of replies
       * matches that of the requests. For example, suppose you call batchUpdate with four updates, and
       * only the third one returns information. The response would have two empty replies, the reply to
       * the third request, and another empty reply, in that order. Because other users may be editing
       * the document, the document might not exactly reflect your changes: your changes may be altered
       * with respect to collaborator changes. If there are no collaborators, the document should
       * reflect your changes. In any case, the updates in your request are guaranteed to be applied
       * together atomically.
       *
       * Create a request for the method "documents.batchUpdate".
       *
       * This request holds the parameters needed by the the docs server.  After setting any optional
       * parameters, call the {@link BatchUpdate#execute()} method to invoke the remote operation. <p>
       * {@link
       * BatchUpdate#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param documentId The ID of the document to update.
       * @param content the {@link com.google.api.services.docs.v1.model.BatchUpdateDocumentRequest}
       * @since 1.13
       */
      protected BatchUpdate(java.lang.String documentId, com.google.api.services.docs.v1.model.BatchUpdateDocumentRequest content) {
        super(Docs.this, "POST", REST_PATH, content, com.google.api.services.docs.v1.model.BatchUpdateDocumentResponse.class);
        this.documentId = com.google.api.client.util.Preconditions.checkNotNull(documentId, "Required parameter documentId must be specified.");
      }

      @Override
      public BatchUpdate set$Xgafv(java.lang.String $Xgafv) {
        return (BatchUpdate) super.set$Xgafv($Xgafv);
      }

      @Override
      public BatchUpdate setAccessToken(java.lang.String accessToken) {
        return (BatchUpdate) super.setAccessToken(accessToken);
      }

      @Override
      public BatchUpdate setAlt(java.lang.String alt) {
        return (BatchUpdate) super.setAlt(alt);
      }

      @Override
      public BatchUpdate setCallback(java.lang.String callback) {
        return (BatchUpdate) super.setCallback(callback);
      }

      @Override
      public BatchUpdate setFields(java.lang.String fields) {
        return (BatchUpdate) super.setFields(fields);
      }

      @Override
      public BatchUpdate setKey(java.lang.String key) {
        return (BatchUpdate) super.setKey(key);
      }

      @Override
      public BatchUpdate setOauthToken(java.lang.String oauthToken) {
        return (BatchUpdate) super.setOauthToken(oauthToken);
      }

      @Override
      public BatchUpdate setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (BatchUpdate) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public BatchUpdate setQuotaUser(java.lang.String quotaUser) {
        return (BatchUpdate) super.setQuotaUser(quotaUser);
      }

      @Override
      public BatchUpdate setUploadType(java.lang.String uploadType) {
        return (BatchUpdate) super.setUploadType(uploadType);
      }

      @Override
      public BatchUpdate setUploadProtocol(java.lang.String uploadProtocol) {
        return (BatchUpdate) super.setUploadProtocol(uploadProtocol);
      }

      /** The ID of the document to update. */
      @com.google.api.client.util.Key
      private java.lang.String documentId;

      /** The ID of the document to update.
       */
      public java.lang.String getDocumentId() {
        return documentId;
      }

      /** The ID of the document to update. */
      public BatchUpdate setDocumentId(java.lang.String documentId) {
        this.documentId = documentId;
        return this;
      }

      @Override
      public BatchUpdate set(String parameterName, Object value) {
        return (BatchUpdate) super.set(parameterName, value);
      }
    }
    /**
     * Creates a blank document using the title given in the request. Other fields in the request,
     * including any provided content, are ignored. Returns the created document.
     *
     * Create a request for the method "documents.create".
     *
     * This request holds the parameters needed by the docs server.  After setting any optional
     * parameters, call the {@link Create#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.google.api.services.docs.v1.model.Document}
     * @return the request
     */
    public Create create(com.google.api.services.docs.v1.model.Document content) throws java.io.IOException {
      Create result = new Create(content);
      initialize(result);
      return result;
    }

    public class Create extends DocsRequest<com.google.api.services.docs.v1.model.Document> {

      private static final String REST_PATH = "v1/documents";

      /**
       * Creates a blank document using the title given in the request. Other fields in the request,
       * including any provided content, are ignored. Returns the created document.
       *
       * Create a request for the method "documents.create".
       *
       * This request holds the parameters needed by the the docs server.  After setting any optional
       * parameters, call the {@link Create#execute()} method to invoke the remote operation. <p> {@link
       * Create#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.docs.v1.model.Document}
       * @since 1.13
       */
      protected Create(com.google.api.services.docs.v1.model.Document content) {
        super(Docs.this, "POST", REST_PATH, content, com.google.api.services.docs.v1.model.Document.class);
      }

      @Override
      public Create set$Xgafv(java.lang.String $Xgafv) {
        return (Create) super.set$Xgafv($Xgafv);
      }

      @Override
      public Create setAccessToken(java.lang.String accessToken) {
        return (Create) super.setAccessToken(accessToken);
      }

      @Override
      public Create setAlt(java.lang.String alt) {
        return (Create) super.setAlt(alt);
      }

      @Override
      public Create setCallback(java.lang.String callback) {
        return (Create) super.setCallback(callback);
      }

      @Override
      public Create setFields(java.lang.String fields) {
        return (Create) super.setFields(fields);
      }

      @Override
      public Create setKey(java.lang.String key) {
        return (Create) super.setKey(key);
      }

      @Override
      public Create setOauthToken(java.lang.String oauthToken) {
        return (Create) super.setOauthToken(oauthToken);
      }

      @Override
      public Create setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Create) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Create setQuotaUser(java.lang.String quotaUser) {
        return (Create) super.setQuotaUser(quotaUser);
      }

      @Override
      public Create setUploadType(java.lang.String uploadType) {
        return (Create) super.setUploadType(uploadType);
      }

      @Override
      public Create setUploadProtocol(java.lang.String uploadProtocol) {
        return (Create) super.setUploadProtocol(uploadProtocol);
      }

      @Override
      public Create set(String parameterName, Object value) {
        return (Create) super.set(parameterName, value);
      }
    }
    /**
     * Gets the latest version of the specified document.
     *
     * Create a request for the method "documents.get".
     *
     * This request holds the parameters needed by the docs server.  After setting any optional
     * parameters, call the {@link Get#execute()} method to invoke the remote operation.
     *
     * @param documentId The ID of the document to retrieve.
     * @return the request
     */
    public Get get(java.lang.String documentId) throws java.io.IOException {
      Get result = new Get(documentId);
      initialize(result);
      return result;
    }

    public class Get extends DocsRequest<com.google.api.services.docs.v1.model.Document> {

      private static final String REST_PATH = "v1/documents/{documentId}";

      /**
       * Gets the latest version of the specified document.
       *
       * Create a request for the method "documents.get".
       *
       * This request holds the parameters needed by the the docs server.  After setting any optional
       * parameters, call the {@link Get#execute()} method to invoke the remote operation. <p> {@link
       * Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
       * called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param documentId The ID of the document to retrieve.
       * @since 1.13
       */
      protected Get(java.lang.String documentId) {
        super(Docs.this, "GET", REST_PATH, null, com.google.api.services.docs.v1.model.Document.class);
        this.documentId = com.google.api.client.util.Preconditions.checkNotNull(documentId, "Required parameter documentId must be specified.");
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public Get set$Xgafv(java.lang.String $Xgafv) {
        return (Get) super.set$Xgafv($Xgafv);
      }

      @Override
      public Get setAccessToken(java.lang.String accessToken) {
        return (Get) super.setAccessToken(accessToken);
      }

      @Override
      public Get setAlt(java.lang.String alt) {
        return (Get) super.setAlt(alt);
      }

      @Override
      public Get setCallback(java.lang.String callback) {
        return (Get) super.setCallback(callback);
      }

      @Override
      public Get setFields(java.lang.String fields) {
        return (Get) super.setFields(fields);
      }

      @Override
      public Get setKey(java.lang.String key) {
        return (Get) super.setKey(key);
      }

      @Override
      public Get setOauthToken(java.lang.String oauthToken) {
        return (Get) super.setOauthToken(oauthToken);
      }

      @Override
      public Get setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Get) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Get setQuotaUser(java.lang.String quotaUser) {
        return (Get) super.setQuotaUser(quotaUser);
      }

      @Override
      public Get setUploadType(java.lang.String uploadType) {
        return (Get) super.setUploadType(uploadType);
      }

      @Override
      public Get setUploadProtocol(java.lang.String uploadProtocol) {
        return (Get) super.setUploadProtocol(uploadProtocol);
      }

      /** The ID of the document to retrieve. */
      @com.google.api.client.util.Key
      private java.lang.String documentId;

      /** The ID of the document to retrieve.
       */
      public java.lang.String getDocumentId() {
        return documentId;
      }

      /** The ID of the document to retrieve. */
      public Get setDocumentId(java.lang.String documentId) {
        this.documentId = documentId;
        return this;
      }

      /**
       * Whether to populate the Document.tabs field instead of the text content fields like `body`
       * and `documentStyle` on Document. - When `True`: Document content populates in the
       * Document.tabs field instead of the text content fields in Document. - When `False`: The
       * content of the document's first tab populates the content fields in Document excluding
       * Document.tabs. If a document has only one tab, then that tab is used to populate the
       * document content. Document.tabs will be empty.
       */
      @com.google.api.client.util.Key
      private java.lang.Boolean includeTabsContent;

      /** Whether to populate the Document.tabs field instead of the text content fields like `body` and
     `documentStyle` on Document. - When `True`: Document content populates in the Document.tabs field
     instead of the text content fields in Document. - When `False`: The content of the document's first
     tab populates the content fields in Document excluding Document.tabs. If a document has only one
     tab, then that tab is used to populate the document content. Document.tabs will be empty.
       */
      public java.lang.Boolean getIncludeTabsContent() {
        return includeTabsContent;
      }

      /**
       * Whether to populate the Document.tabs field instead of the text content fields like `body`
       * and `documentStyle` on Document. - When `True`: Document content populates in the
       * Document.tabs field instead of the text content fields in Document. - When `False`: The
       * content of the document's first tab populates the content fields in Document excluding
       * Document.tabs. If a document has only one tab, then that tab is used to populate the
       * document content. Document.tabs will be empty.
       */
      public Get setIncludeTabsContent(java.lang.Boolean includeTabsContent) {
        this.includeTabsContent = includeTabsContent;
        return this;
      }

      /**
       * The suggestions view mode to apply to the document. This allows viewing the document with
       * all suggestions inline, accepted or rejected. If one is not specified,
       * DEFAULT_FOR_CURRENT_ACCESS is used.
       */
      @com.google.api.client.util.Key
      private java.lang.String suggestionsViewMode;

      /** The suggestions view mode to apply to the document. This allows viewing the document with all
     suggestions inline, accepted or rejected. If one is not specified, DEFAULT_FOR_CURRENT_ACCESS is
     used.
       */
      public java.lang.String getSuggestionsViewMode() {
        return suggestionsViewMode;
      }

      /**
       * The suggestions view mode to apply to the document. This allows viewing the document with
       * all suggestions inline, accepted or rejected. If one is not specified,
       * DEFAULT_FOR_CURRENT_ACCESS is used.
       */
      public Get setSuggestionsViewMode(java.lang.String suggestionsViewMode) {
        this.suggestionsViewMode = suggestionsViewMode;
        return this;
      }

      @Override
      public Get set(String parameterName, Object value) {
        return (Get) super.set(parameterName, value);
      }
    }

  }

  /**
   * Builder for {@link Docs}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    private static String chooseEndpoint(com.google.api.client.http.HttpTransport transport) {
      // If the GOOGLE_API_USE_MTLS_ENDPOINT environment variable value is "always", use mTLS endpoint.
      // If the env variable is "auto", use mTLS endpoint if and only if the transport is mTLS.
      // Use the regular endpoint for all other cases.
      String useMtlsEndpoint = System.getenv("GOOGLE_API_USE_MTLS_ENDPOINT");
      useMtlsEndpoint = useMtlsEndpoint == null ? "auto" : useMtlsEndpoint;
      if ("always".equals(useMtlsEndpoint) || ("auto".equals(useMtlsEndpoint) && transport != null && transport.isMtls())) {
        return DEFAULT_MTLS_ROOT_URL;
      }
      return DEFAULT_ROOT_URL;
    }

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          Builder.chooseEndpoint(transport),
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
      setBatchPath(DEFAULT_BATCH_PATH);
    }

    /** Builds a new instance of {@link Docs}. */
    @Override
    public Docs build() {
      return new Docs(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setBatchPath(String batchPath) {
      return (Builder) super.setBatchPath(batchPath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link DocsRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setDocsRequestInitializer(
        DocsRequestInitializer docsRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(docsRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }

    @Override
    public Builder setUniverseDomain(String universeDomain) {
      return (Builder) super.setUniverseDomain(universeDomain);
    }
  }
}

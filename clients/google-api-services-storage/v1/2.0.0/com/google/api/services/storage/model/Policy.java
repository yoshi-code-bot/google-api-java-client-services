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

package com.google.api.services.storage.model;

/**
 * A bucket/object/managedFolder IAM policy.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Storage JSON API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Policy extends com.google.api.client.json.GenericJson {

  /**
   * An association between a role, which comes with a set of permissions, and members who may
   * assume that role.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Bindings> bindings;

  static {
    // hack to force ProGuard to consider Bindings used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Bindings.class);
  }

  /**
   * HTTP 1.1  Entity tag for the policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The kind of item this is. For policies, this is always storage#policy. This field is ignored on
   * input.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The ID of the resource to which this policy belongs. Will be of the form
   * projects/_/buckets/bucket for buckets, projects/_/buckets/bucket/objects/object for objects,
   * and projects/_/buckets/bucket/managedFolders/managedFolder. A specific generation may be
   * specified by appending #generationNumber to the end of the object name, e.g.
   * projects/_/buckets/my-bucket/objects/data.txt#17. The current generation can be denoted with
   * #0. This field is ignored on input.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceId;

  /**
   * The IAM policy format version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer version;

  /**
   * An association between a role, which comes with a set of permissions, and members who may
   * assume that role.
   * @return value or {@code null} for none
   */
  public java.util.List<Bindings> getBindings() {
    return bindings;
  }

  /**
   * An association between a role, which comes with a set of permissions, and members who may
   * assume that role.
   * @param bindings bindings or {@code null} for none
   */
  public Policy setBindings(java.util.List<Bindings> bindings) {
    this.bindings = bindings;
    return this;
  }

  /**
   * HTTP 1.1  Entity tag for the policy.
   * @see #decodeEtag()
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * HTTP 1.1  Entity tag for the policy.
   * @see #getEtag()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeEtag() {
    return com.google.api.client.util.Base64.decodeBase64(etag);
  }

  /**
   * HTTP 1.1  Entity tag for the policy.
   * @see #encodeEtag()
   * @param etag etag or {@code null} for none
   */
  public Policy setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * HTTP 1.1  Entity tag for the policy.
   * @see #setEtag()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public Policy encodeEtag(byte[] etag) {
    this.etag = com.google.api.client.util.Base64.encodeBase64URLSafeString(etag);
    return this;
  }

  /**
   * The kind of item this is. For policies, this is always storage#policy. This field is ignored on
   * input.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The kind of item this is. For policies, this is always storage#policy. This field is ignored on
   * input.
   * @param kind kind or {@code null} for none
   */
  public Policy setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The ID of the resource to which this policy belongs. Will be of the form
   * projects/_/buckets/bucket for buckets, projects/_/buckets/bucket/objects/object for objects,
   * and projects/_/buckets/bucket/managedFolders/managedFolder. A specific generation may be
   * specified by appending #generationNumber to the end of the object name, e.g.
   * projects/_/buckets/my-bucket/objects/data.txt#17. The current generation can be denoted with
   * #0. This field is ignored on input.
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceId() {
    return resourceId;
  }

  /**
   * The ID of the resource to which this policy belongs. Will be of the form
   * projects/_/buckets/bucket for buckets, projects/_/buckets/bucket/objects/object for objects,
   * and projects/_/buckets/bucket/managedFolders/managedFolder. A specific generation may be
   * specified by appending #generationNumber to the end of the object name, e.g.
   * projects/_/buckets/my-bucket/objects/data.txt#17. The current generation can be denoted with
   * #0. This field is ignored on input.
   * @param resourceId resourceId or {@code null} for none
   */
  public Policy setResourceId(java.lang.String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * The IAM policy format version.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getVersion() {
    return version;
  }

  /**
   * The IAM policy format version.
   * @param version version or {@code null} for none
   */
  public Policy setVersion(java.lang.Integer version) {
    this.version = version;
    return this;
  }

  @Override
  public Policy set(String fieldName, Object value) {
    return (Policy) super.set(fieldName, value);
  }

  @Override
  public Policy clone() {
    return (Policy) super.clone();
  }

  /**
   * Model definition for PolicyBindings.
   */
  public static final class Bindings extends com.google.api.client.json.GenericJson {

    /**
     * The condition that is associated with this binding. NOTE: an unsatisfied condition will not
     * allow user access via current binding. Different bindings, including their conditions, are
     * examined independently.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private Expr condition;

    /**
     * A collection of identifiers for members who may assume the provided role. Recognized
     * identifiers are as follows: - allUsers - A special identifier that represents anyone on the
     * internet; with or without a Google account.   - allAuthenticatedUsers - A special identifier
     * that represents anyone who is authenticated with a Google account or a service account.   -
     * user:emailid - An email address that represents a specific account. For example,
     * user:alice@gmail.com or user:joe@example.com.   - serviceAccount:emailid - An email address
     * that represents a service account. For example,  serviceAccount:my-other-
     * app@appspot.gserviceaccount.com .   - group:emailid - An email address that represents a Google
     * group. For example, group:admins@example.com.   - domain:domain - A Google Apps domain name
     * that represents all the users of that domain. For example, domain:google.com or
     * domain:example.com.   - projectOwner:projectid - Owners of the given project. For example,
     * projectOwner:my-example-project   - projectEditor:projectid - Editors of the given project. For
     * example, projectEditor:my-example-project   - projectViewer:projectid - Viewers of the given
     * project. For example, projectViewer:my-example-project
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<java.lang.String> members;

    /**
     * The role to which members belong. Two types of roles are supported: new IAM roles, which grant
     * permissions that do not map directly to those provided by ACLs, and legacy IAM roles, which do
     * map directly to ACL permissions. All roles are of the format roles/storage.specificRole. The
     * new IAM roles are:   - roles/storage.admin - Full control of Google Cloud Storage resources.
     * - roles/storage.objectViewer - Read-Only access to Google Cloud Storage objects.   -
     * roles/storage.objectCreator - Access to create objects in Google Cloud Storage.   -
     * roles/storage.objectAdmin - Full control of Google Cloud Storage objects.   The legacy IAM
     * roles are:   - roles/storage.legacyObjectReader - Read-only access to objects without listing.
     * Equivalent to an ACL entry on an object with the READER role.   -
     * roles/storage.legacyObjectOwner - Read/write access to existing objects without listing.
     * Equivalent to an ACL entry on an object with the OWNER role.   -
     * roles/storage.legacyBucketReader - Read access to buckets with object listing. Equivalent to an
     * ACL entry on a bucket with the READER role.   - roles/storage.legacyBucketWriter - Read access
     * to buckets with object listing/creation/deletion. Equivalent to an ACL entry on a bucket with
     * the WRITER role.   - roles/storage.legacyBucketOwner - Read and write access to existing
     * buckets with object listing/creation/deletion. Equivalent to an ACL entry on a bucket with the
     * OWNER role.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String role;

    /**
     * The condition that is associated with this binding. NOTE: an unsatisfied condition will not
     * allow user access via current binding. Different bindings, including their conditions, are
     * examined independently.
     * @return value or {@code null} for none
     */
    public Expr getCondition() {
      return condition;
    }

    /**
     * The condition that is associated with this binding. NOTE: an unsatisfied condition will not
     * allow user access via current binding. Different bindings, including their conditions, are
     * examined independently.
     * @param condition condition or {@code null} for none
     */
    public Bindings setCondition(Expr condition) {
      this.condition = condition;
      return this;
    }

    /**
     * A collection of identifiers for members who may assume the provided role. Recognized
     * identifiers are as follows: - allUsers - A special identifier that represents anyone on the
     * internet; with or without a Google account.   - allAuthenticatedUsers - A special identifier
     * that represents anyone who is authenticated with a Google account or a service account.   -
     * user:emailid - An email address that represents a specific account. For example,
     * user:alice@gmail.com or user:joe@example.com.   - serviceAccount:emailid - An email address
     * that represents a service account. For example,  serviceAccount:my-other-
     * app@appspot.gserviceaccount.com .   - group:emailid - An email address that represents a Google
     * group. For example, group:admins@example.com.   - domain:domain - A Google Apps domain name
     * that represents all the users of that domain. For example, domain:google.com or
     * domain:example.com.   - projectOwner:projectid - Owners of the given project. For example,
     * projectOwner:my-example-project   - projectEditor:projectid - Editors of the given project. For
     * example, projectEditor:my-example-project   - projectViewer:projectid - Viewers of the given
     * project. For example, projectViewer:my-example-project
     * @return value or {@code null} for none
     */
    public java.util.List<java.lang.String> getMembers() {
      return members;
    }

    /**
     * A collection of identifiers for members who may assume the provided role. Recognized
     * identifiers are as follows: - allUsers - A special identifier that represents anyone on the
     * internet; with or without a Google account.   - allAuthenticatedUsers - A special identifier
     * that represents anyone who is authenticated with a Google account or a service account.   -
     * user:emailid - An email address that represents a specific account. For example,
     * user:alice@gmail.com or user:joe@example.com.   - serviceAccount:emailid - An email address
     * that represents a service account. For example,  serviceAccount:my-other-
     * app@appspot.gserviceaccount.com .   - group:emailid - An email address that represents a Google
     * group. For example, group:admins@example.com.   - domain:domain - A Google Apps domain name
     * that represents all the users of that domain. For example, domain:google.com or
     * domain:example.com.   - projectOwner:projectid - Owners of the given project. For example,
     * projectOwner:my-example-project   - projectEditor:projectid - Editors of the given project. For
     * example, projectEditor:my-example-project   - projectViewer:projectid - Viewers of the given
     * project. For example, projectViewer:my-example-project
     * @param members members or {@code null} for none
     */
    public Bindings setMembers(java.util.List<java.lang.String> members) {
      this.members = members;
      return this;
    }

    /**
     * The role to which members belong. Two types of roles are supported: new IAM roles, which grant
     * permissions that do not map directly to those provided by ACLs, and legacy IAM roles, which do
     * map directly to ACL permissions. All roles are of the format roles/storage.specificRole. The
     * new IAM roles are:   - roles/storage.admin - Full control of Google Cloud Storage resources.
     * - roles/storage.objectViewer - Read-Only access to Google Cloud Storage objects.   -
     * roles/storage.objectCreator - Access to create objects in Google Cloud Storage.   -
     * roles/storage.objectAdmin - Full control of Google Cloud Storage objects.   The legacy IAM
     * roles are:   - roles/storage.legacyObjectReader - Read-only access to objects without listing.
     * Equivalent to an ACL entry on an object with the READER role.   -
     * roles/storage.legacyObjectOwner - Read/write access to existing objects without listing.
     * Equivalent to an ACL entry on an object with the OWNER role.   -
     * roles/storage.legacyBucketReader - Read access to buckets with object listing. Equivalent to an
     * ACL entry on a bucket with the READER role.   - roles/storage.legacyBucketWriter - Read access
     * to buckets with object listing/creation/deletion. Equivalent to an ACL entry on a bucket with
     * the WRITER role.   - roles/storage.legacyBucketOwner - Read and write access to existing
     * buckets with object listing/creation/deletion. Equivalent to an ACL entry on a bucket with the
     * OWNER role.
     * @return value or {@code null} for none
     */
    public java.lang.String getRole() {
      return role;
    }

    /**
     * The role to which members belong. Two types of roles are supported: new IAM roles, which grant
     * permissions that do not map directly to those provided by ACLs, and legacy IAM roles, which do
     * map directly to ACL permissions. All roles are of the format roles/storage.specificRole. The
     * new IAM roles are:   - roles/storage.admin - Full control of Google Cloud Storage resources.
     * - roles/storage.objectViewer - Read-Only access to Google Cloud Storage objects.   -
     * roles/storage.objectCreator - Access to create objects in Google Cloud Storage.   -
     * roles/storage.objectAdmin - Full control of Google Cloud Storage objects.   The legacy IAM
     * roles are:   - roles/storage.legacyObjectReader - Read-only access to objects without listing.
     * Equivalent to an ACL entry on an object with the READER role.   -
     * roles/storage.legacyObjectOwner - Read/write access to existing objects without listing.
     * Equivalent to an ACL entry on an object with the OWNER role.   -
     * roles/storage.legacyBucketReader - Read access to buckets with object listing. Equivalent to an
     * ACL entry on a bucket with the READER role.   - roles/storage.legacyBucketWriter - Read access
     * to buckets with object listing/creation/deletion. Equivalent to an ACL entry on a bucket with
     * the WRITER role.   - roles/storage.legacyBucketOwner - Read and write access to existing
     * buckets with object listing/creation/deletion. Equivalent to an ACL entry on a bucket with the
     * OWNER role.
     * @param role role or {@code null} for none
     */
    public Bindings setRole(java.lang.String role) {
      this.role = role;
      return this;
    }

    @Override
    public Bindings set(String fieldName, Object value) {
      return (Bindings) super.set(fieldName, value);
    }

    @Override
    public Bindings clone() {
      return (Bindings) super.clone();
    }

  }

}

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

package com.google.api.services.merchantapi.accounts_v1beta.model;

/**
 * The `AccountService` message represents a specific service that a provider account offers to a
 * Merchant Center account. `AccountService` defines the permissions and capabilities granted to the
 * provider, allowing for operations such as product management or campaign management. The
 * lifecycle of an `AccountService` involves a proposal phase, where one party suggests the service,
 * and an approval phase, where the other party accepts or rejects it. This handshake mechanism
 * ensures mutual consent before any access is granted. This mechanism safeguards both parties by
 * ensuring that access rights are granted appropriately and that both the business and provider are
 * aware of the services enabled. In scenarios where a user is an admin of both accounts, the
 * approval can happen automatically. The mutability of a service is also managed through
 * `AccountService`. Some services might be immutable, for example, if they were established through
 * other systems or APIs, and you cannot alter them through this API.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Merchant API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AccountService extends com.google.api.client.json.GenericJson {

  /**
   * Service type for account aggregation. This enables the provider, which is an advanced account,
   * to manage multiple sub-accounts (client accounts). Through this service, the advanced account
   * provider can perform administrative and operational tasks across all linked sub-accounts. This
   * is useful for agencies, aggregators, or large retailers that need centralized control over many
   * Merchant Center accounts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AccountAggregation accountAggregation;

  /**
   * Service type for account management. Enables the provider to perform administrative actions on
   * the business's account, such as configuring account settings, managing users, or updating
   * business information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AccountManagement accountManagement;

  /**
   * Service type for managing advertising campaigns. Grants the provider access to create and
   * manage the business's ad campaigns, including setting up campaigns, adjusting bids, and
   * optimizing performance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CampaignsManagement campaignsManagement;

  /**
   * Immutable. An optional, immutable identifier that Google uses to refer to this account when
   * communicating with the provider. This should be the unique account ID within the provider's
   * system (for example, your shop ID in Shopify). If you have multiple accounts with the same
   * provider - for instance, different accounts for various regions — the `external_account_id`
   * differentiates between them, ensuring accurate linking and integration between Google and the
   * provider.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String externalAccountId;

  /**
   * Output only. Information about the state of the service in terms of establishing it (e.g. is it
   * pending approval or approved).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Handshake handshake;

  /**
   * Service type for local listings management. The business group associated with the external
   * account id will be used to provide local inventory to this Merchant Center account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LocalListingManagement localListingManagement;

  /**
   * Output only. Whether the service is mutable (e.g. through Approve / Reject RPCs). A service
   * that was created through another system or API might be immutable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mutability;

  /**
   * Identifier. The resource name of the account service. Format:
   * `accounts/{account}/services/{service}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Service type for managing products. This allows the provider to handle product data on behalf
   * of the business, including reading and writing product listings. It's commonly used when the
   * provider offers inventory management or catalog synchronization services to keep the business's
   * product information up-to-date across platforms.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ProductsManagement productsManagement;

  /**
   * Output only. The provider of the service. Either the reference to an account such as
   * `providers/123` or a well-known service provider (one of `providers/GOOGLE_ADS` or
   * `providers/GOOGLE_BUSINESS_PROFILE`).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String provider;

  /**
   * Output only. The human-readable display name of the provider account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String providerDisplayName;

  /**
   * Service type for account aggregation. This enables the provider, which is an advanced account,
   * to manage multiple sub-accounts (client accounts). Through this service, the advanced account
   * provider can perform administrative and operational tasks across all linked sub-accounts. This
   * is useful for agencies, aggregators, or large retailers that need centralized control over many
   * Merchant Center accounts.
   * @return value or {@code null} for none
   */
  public AccountAggregation getAccountAggregation() {
    return accountAggregation;
  }

  /**
   * Service type for account aggregation. This enables the provider, which is an advanced account,
   * to manage multiple sub-accounts (client accounts). Through this service, the advanced account
   * provider can perform administrative and operational tasks across all linked sub-accounts. This
   * is useful for agencies, aggregators, or large retailers that need centralized control over many
   * Merchant Center accounts.
   * @param accountAggregation accountAggregation or {@code null} for none
   */
  public AccountService setAccountAggregation(AccountAggregation accountAggregation) {
    this.accountAggregation = accountAggregation;
    return this;
  }

  /**
   * Service type for account management. Enables the provider to perform administrative actions on
   * the business's account, such as configuring account settings, managing users, or updating
   * business information.
   * @return value or {@code null} for none
   */
  public AccountManagement getAccountManagement() {
    return accountManagement;
  }

  /**
   * Service type for account management. Enables the provider to perform administrative actions on
   * the business's account, such as configuring account settings, managing users, or updating
   * business information.
   * @param accountManagement accountManagement or {@code null} for none
   */
  public AccountService setAccountManagement(AccountManagement accountManagement) {
    this.accountManagement = accountManagement;
    return this;
  }

  /**
   * Service type for managing advertising campaigns. Grants the provider access to create and
   * manage the business's ad campaigns, including setting up campaigns, adjusting bids, and
   * optimizing performance.
   * @return value or {@code null} for none
   */
  public CampaignsManagement getCampaignsManagement() {
    return campaignsManagement;
  }

  /**
   * Service type for managing advertising campaigns. Grants the provider access to create and
   * manage the business's ad campaigns, including setting up campaigns, adjusting bids, and
   * optimizing performance.
   * @param campaignsManagement campaignsManagement or {@code null} for none
   */
  public AccountService setCampaignsManagement(CampaignsManagement campaignsManagement) {
    this.campaignsManagement = campaignsManagement;
    return this;
  }

  /**
   * Immutable. An optional, immutable identifier that Google uses to refer to this account when
   * communicating with the provider. This should be the unique account ID within the provider's
   * system (for example, your shop ID in Shopify). If you have multiple accounts with the same
   * provider - for instance, different accounts for various regions — the `external_account_id`
   * differentiates between them, ensuring accurate linking and integration between Google and the
   * provider.
   * @return value or {@code null} for none
   */
  public java.lang.String getExternalAccountId() {
    return externalAccountId;
  }

  /**
   * Immutable. An optional, immutable identifier that Google uses to refer to this account when
   * communicating with the provider. This should be the unique account ID within the provider's
   * system (for example, your shop ID in Shopify). If you have multiple accounts with the same
   * provider - for instance, different accounts for various regions — the `external_account_id`
   * differentiates between them, ensuring accurate linking and integration between Google and the
   * provider.
   * @param externalAccountId externalAccountId or {@code null} for none
   */
  public AccountService setExternalAccountId(java.lang.String externalAccountId) {
    this.externalAccountId = externalAccountId;
    return this;
  }

  /**
   * Output only. Information about the state of the service in terms of establishing it (e.g. is it
   * pending approval or approved).
   * @return value or {@code null} for none
   */
  public Handshake getHandshake() {
    return handshake;
  }

  /**
   * Output only. Information about the state of the service in terms of establishing it (e.g. is it
   * pending approval or approved).
   * @param handshake handshake or {@code null} for none
   */
  public AccountService setHandshake(Handshake handshake) {
    this.handshake = handshake;
    return this;
  }

  /**
   * Service type for local listings management. The business group associated with the external
   * account id will be used to provide local inventory to this Merchant Center account.
   * @return value or {@code null} for none
   */
  public LocalListingManagement getLocalListingManagement() {
    return localListingManagement;
  }

  /**
   * Service type for local listings management. The business group associated with the external
   * account id will be used to provide local inventory to this Merchant Center account.
   * @param localListingManagement localListingManagement or {@code null} for none
   */
  public AccountService setLocalListingManagement(LocalListingManagement localListingManagement) {
    this.localListingManagement = localListingManagement;
    return this;
  }

  /**
   * Output only. Whether the service is mutable (e.g. through Approve / Reject RPCs). A service
   * that was created through another system or API might be immutable.
   * @return value or {@code null} for none
   */
  public java.lang.String getMutability() {
    return mutability;
  }

  /**
   * Output only. Whether the service is mutable (e.g. through Approve / Reject RPCs). A service
   * that was created through another system or API might be immutable.
   * @param mutability mutability or {@code null} for none
   */
  public AccountService setMutability(java.lang.String mutability) {
    this.mutability = mutability;
    return this;
  }

  /**
   * Identifier. The resource name of the account service. Format:
   * `accounts/{account}/services/{service}`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Identifier. The resource name of the account service. Format:
   * `accounts/{account}/services/{service}`
   * @param name name or {@code null} for none
   */
  public AccountService setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Service type for managing products. This allows the provider to handle product data on behalf
   * of the business, including reading and writing product listings. It's commonly used when the
   * provider offers inventory management or catalog synchronization services to keep the business's
   * product information up-to-date across platforms.
   * @return value or {@code null} for none
   */
  public ProductsManagement getProductsManagement() {
    return productsManagement;
  }

  /**
   * Service type for managing products. This allows the provider to handle product data on behalf
   * of the business, including reading and writing product listings. It's commonly used when the
   * provider offers inventory management or catalog synchronization services to keep the business's
   * product information up-to-date across platforms.
   * @param productsManagement productsManagement or {@code null} for none
   */
  public AccountService setProductsManagement(ProductsManagement productsManagement) {
    this.productsManagement = productsManagement;
    return this;
  }

  /**
   * Output only. The provider of the service. Either the reference to an account such as
   * `providers/123` or a well-known service provider (one of `providers/GOOGLE_ADS` or
   * `providers/GOOGLE_BUSINESS_PROFILE`).
   * @return value or {@code null} for none
   */
  public java.lang.String getProvider() {
    return provider;
  }

  /**
   * Output only. The provider of the service. Either the reference to an account such as
   * `providers/123` or a well-known service provider (one of `providers/GOOGLE_ADS` or
   * `providers/GOOGLE_BUSINESS_PROFILE`).
   * @param provider provider or {@code null} for none
   */
  public AccountService setProvider(java.lang.String provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Output only. The human-readable display name of the provider account.
   * @return value or {@code null} for none
   */
  public java.lang.String getProviderDisplayName() {
    return providerDisplayName;
  }

  /**
   * Output only. The human-readable display name of the provider account.
   * @param providerDisplayName providerDisplayName or {@code null} for none
   */
  public AccountService setProviderDisplayName(java.lang.String providerDisplayName) {
    this.providerDisplayName = providerDisplayName;
    return this;
  }

  @Override
  public AccountService set(String fieldName, Object value) {
    return (AccountService) super.set(fieldName, value);
  }

  @Override
  public AccountService clone() {
    return (AccountService) super.clone();
  }

}

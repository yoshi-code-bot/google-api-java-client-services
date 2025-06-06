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

package com.google.api.services.saasservicemgmt.v1beta1.model;

/**
 * Set of requirements to be fulfilled on the Unit when using this Release.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the SaaS Runtime API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReleaseRequirements extends com.google.api.client.json.GenericJson {

  /**
   * Optional. A list of releases from which a unit can be upgraded to this one (optional). If left
   * empty no constraints will be applied. When provided, unit upgrade requests to this release will
   * check and enforce this constraint.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> upgradeableFromReleases;

  /**
   * Optional. A list of releases from which a unit can be upgraded to this one (optional). If left
   * empty no constraints will be applied. When provided, unit upgrade requests to this release will
   * check and enforce this constraint.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getUpgradeableFromReleases() {
    return upgradeableFromReleases;
  }

  /**
   * Optional. A list of releases from which a unit can be upgraded to this one (optional). If left
   * empty no constraints will be applied. When provided, unit upgrade requests to this release will
   * check and enforce this constraint.
   * @param upgradeableFromReleases upgradeableFromReleases or {@code null} for none
   */
  public ReleaseRequirements setUpgradeableFromReleases(java.util.List<java.lang.String> upgradeableFromReleases) {
    this.upgradeableFromReleases = upgradeableFromReleases;
    return this;
  }

  @Override
  public ReleaseRequirements set(String fieldName, Object value) {
    return (ReleaseRequirements) super.set(fieldName, value);
  }

  @Override
  public ReleaseRequirements clone() {
    return (ReleaseRequirements) super.clone();
  }

}

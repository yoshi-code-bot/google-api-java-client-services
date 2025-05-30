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

package com.google.api.services.clouddeploy.v1.model;

/**
 * Contains information on the resources to select for a deploy policy. Attributes provided must all
 * match the resource in order for policy restrictions to apply. For example, if delivery pipelines
 * attributes given are an id "prod" and labels "foo: bar", a delivery pipeline resource must match
 * both that id and have that label in order to be subject to the policy.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Deploy API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DeployPolicyResourceSelector extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Contains attributes about a delivery pipeline.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeliveryPipelineAttribute deliveryPipeline;

  /**
   * Optional. Contains attributes about a target.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TargetAttribute target;

  /**
   * Optional. Contains attributes about a delivery pipeline.
   * @return value or {@code null} for none
   */
  public DeliveryPipelineAttribute getDeliveryPipeline() {
    return deliveryPipeline;
  }

  /**
   * Optional. Contains attributes about a delivery pipeline.
   * @param deliveryPipeline deliveryPipeline or {@code null} for none
   */
  public DeployPolicyResourceSelector setDeliveryPipeline(DeliveryPipelineAttribute deliveryPipeline) {
    this.deliveryPipeline = deliveryPipeline;
    return this;
  }

  /**
   * Optional. Contains attributes about a target.
   * @return value or {@code null} for none
   */
  public TargetAttribute getTarget() {
    return target;
  }

  /**
   * Optional. Contains attributes about a target.
   * @param target target or {@code null} for none
   */
  public DeployPolicyResourceSelector setTarget(TargetAttribute target) {
    this.target = target;
    return this;
  }

  @Override
  public DeployPolicyResourceSelector set(String fieldName, Object value) {
    return (DeployPolicyResourceSelector) super.set(fieldName, value);
  }

  @Override
  public DeployPolicyResourceSelector clone() {
    return (DeployPolicyResourceSelector) super.clone();
  }

}

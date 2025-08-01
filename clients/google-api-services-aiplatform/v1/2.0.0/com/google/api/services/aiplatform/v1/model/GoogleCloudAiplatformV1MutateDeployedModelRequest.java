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

package com.google.api.services.aiplatform.v1.model;

/**
 * Request message for EndpointService.MutateDeployedModel.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1MutateDeployedModelRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The DeployedModel to be mutated within the Endpoint. Only the following fields can be
   * mutated: * `min_replica_count` in either DedicatedResources or AutomaticResources *
   * `max_replica_count` in either DedicatedResources or AutomaticResources *
   * `required_replica_count` in DedicatedResources * autoscaling_metric_specs *
   * `disable_container_logging` (v1 only) * `enable_container_logging` (v1beta1 only)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1DeployedModel deployedModel;

  /**
   * Required. The update mask applies to the resource. See google.protobuf.FieldMask.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateMask;

  /**
   * Required. The DeployedModel to be mutated within the Endpoint. Only the following fields can be
   * mutated: * `min_replica_count` in either DedicatedResources or AutomaticResources *
   * `max_replica_count` in either DedicatedResources or AutomaticResources *
   * `required_replica_count` in DedicatedResources * autoscaling_metric_specs *
   * `disable_container_logging` (v1 only) * `enable_container_logging` (v1beta1 only)
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1DeployedModel getDeployedModel() {
    return deployedModel;
  }

  /**
   * Required. The DeployedModel to be mutated within the Endpoint. Only the following fields can be
   * mutated: * `min_replica_count` in either DedicatedResources or AutomaticResources *
   * `max_replica_count` in either DedicatedResources or AutomaticResources *
   * `required_replica_count` in DedicatedResources * autoscaling_metric_specs *
   * `disable_container_logging` (v1 only) * `enable_container_logging` (v1beta1 only)
   * @param deployedModel deployedModel or {@code null} for none
   */
  public GoogleCloudAiplatformV1MutateDeployedModelRequest setDeployedModel(GoogleCloudAiplatformV1DeployedModel deployedModel) {
    this.deployedModel = deployedModel;
    return this;
  }

  /**
   * Required. The update mask applies to the resource. See google.protobuf.FieldMask.
   * @return value or {@code null} for none
   */
  public String getUpdateMask() {
    return updateMask;
  }

  /**
   * Required. The update mask applies to the resource. See google.protobuf.FieldMask.
   * @param updateMask updateMask or {@code null} for none
   */
  public GoogleCloudAiplatformV1MutateDeployedModelRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1MutateDeployedModelRequest set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1MutateDeployedModelRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1MutateDeployedModelRequest clone() {
    return (GoogleCloudAiplatformV1MutateDeployedModelRequest) super.clone();
  }

}

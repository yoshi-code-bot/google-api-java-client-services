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

package com.google.api.services.dialogflow.v3beta1.model;

/**
 * Generator settings used by the LLM to generate a text response.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3beta1FulfillmentGeneratorSettings extends com.google.api.client.json.GenericJson {

  /**
   * Required. The generator to call. Format: `projects//locations//agents//generators/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String generator;

  /**
   * Map from placeholder parameter in the Generator to corresponding session parameters. By
   * default, Dialogflow uses the session parameter with the same name to fill in the generator
   * template. e.g. If there is a placeholder parameter `city` in the Generator, Dialogflow default
   * to fill in the `$city` with `$session.params.city`. However, you may choose to fill `$city`
   * with `$session.params.desination-city`. - Map key: parameter ID - Map value: session parameter
   * name
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> inputParameters;

  /**
   * Required. Output parameter which should contain the generator response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String outputParameter;

  /**
   * Required. The generator to call. Format: `projects//locations//agents//generators/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getGenerator() {
    return generator;
  }

  /**
   * Required. The generator to call. Format: `projects//locations//agents//generators/`.
   * @param generator generator or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1FulfillmentGeneratorSettings setGenerator(java.lang.String generator) {
    this.generator = generator;
    return this;
  }

  /**
   * Map from placeholder parameter in the Generator to corresponding session parameters. By
   * default, Dialogflow uses the session parameter with the same name to fill in the generator
   * template. e.g. If there is a placeholder parameter `city` in the Generator, Dialogflow default
   * to fill in the `$city` with `$session.params.city`. However, you may choose to fill `$city`
   * with `$session.params.desination-city`. - Map key: parameter ID - Map value: session parameter
   * name
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getInputParameters() {
    return inputParameters;
  }

  /**
   * Map from placeholder parameter in the Generator to corresponding session parameters. By
   * default, Dialogflow uses the session parameter with the same name to fill in the generator
   * template. e.g. If there is a placeholder parameter `city` in the Generator, Dialogflow default
   * to fill in the `$city` with `$session.params.city`. However, you may choose to fill `$city`
   * with `$session.params.desination-city`. - Map key: parameter ID - Map value: session parameter
   * name
   * @param inputParameters inputParameters or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1FulfillmentGeneratorSettings setInputParameters(java.util.Map<String, java.lang.String> inputParameters) {
    this.inputParameters = inputParameters;
    return this;
  }

  /**
   * Required. Output parameter which should contain the generator response.
   * @return value or {@code null} for none
   */
  public java.lang.String getOutputParameter() {
    return outputParameter;
  }

  /**
   * Required. Output parameter which should contain the generator response.
   * @param outputParameter outputParameter or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1FulfillmentGeneratorSettings setOutputParameter(java.lang.String outputParameter) {
    this.outputParameter = outputParameter;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1FulfillmentGeneratorSettings set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3beta1FulfillmentGeneratorSettings) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1FulfillmentGeneratorSettings clone() {
    return (GoogleCloudDialogflowCxV3beta1FulfillmentGeneratorSettings) super.clone();
  }

}

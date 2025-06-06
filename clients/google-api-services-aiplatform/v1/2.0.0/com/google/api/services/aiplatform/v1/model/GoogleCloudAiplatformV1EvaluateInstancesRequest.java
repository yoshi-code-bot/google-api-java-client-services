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
 * Request message for EvaluationService.EvaluateInstances.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1EvaluateInstancesRequest extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Autorater config used for evaluation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1AutoraterConfig autoraterConfig;

  /**
   * Instances and metric spec for bleu metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1BleuInput bleuInput;

  /**
   * Input for coherence metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1CoherenceInput coherenceInput;

  /**
   * Translation metrics. Input for Comet metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1CometInput cometInput;

  /**
   * Auto metric instances. Instances and metric spec for exact match metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1ExactMatchInput exactMatchInput;

  /**
   * LLM-based metric instance. General text generation metrics, applicable to other categories.
   * Input for fluency metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1FluencyInput fluencyInput;

  /**
   * Input for fulfillment metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1FulfillmentInput fulfillmentInput;

  /**
   * Input for groundedness metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1GroundednessInput groundednessInput;

  /**
   * Input for Metricx metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1MetricxInput metricxInput;

  /**
   * Input for pairwise metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1PairwiseMetricInput pairwiseMetricInput;

  /**
   * Input for pairwise question answering quality metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1PairwiseQuestionAnsweringQualityInput pairwiseQuestionAnsweringQualityInput;

  /**
   * Input for pairwise summarization quality metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1PairwiseSummarizationQualityInput pairwiseSummarizationQualityInput;

  /**
   * Input for pointwise metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1PointwiseMetricInput pointwiseMetricInput;

  /**
   * Input for question answering correctness metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1QuestionAnsweringCorrectnessInput questionAnsweringCorrectnessInput;

  /**
   * Input for question answering helpfulness metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1QuestionAnsweringHelpfulnessInput questionAnsweringHelpfulnessInput;

  /**
   * Input for question answering quality metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1QuestionAnsweringQualityInput questionAnsweringQualityInput;

  /**
   * Input for question answering relevance metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1QuestionAnsweringRelevanceInput questionAnsweringRelevanceInput;

  /**
   * Instances and metric spec for rouge metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1RougeInput rougeInput;

  /**
   * Rubric Based Instruction Following metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1RubricBasedInstructionFollowingInput rubricBasedInstructionFollowingInput;

  /**
   * Input for safety metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1SafetyInput safetyInput;

  /**
   * Input for summarization helpfulness metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1SummarizationHelpfulnessInput summarizationHelpfulnessInput;

  /**
   * Input for summarization quality metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1SummarizationQualityInput summarizationQualityInput;

  /**
   * Input for summarization verbosity metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1SummarizationVerbosityInput summarizationVerbosityInput;

  /**
   * Tool call metric instances. Input for tool call valid metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1ToolCallValidInput toolCallValidInput;

  /**
   * Input for tool name match metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1ToolNameMatchInput toolNameMatchInput;

  /**
   * Input for tool parameter key match metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1ToolParameterKeyMatchInput toolParameterKeyMatchInput;

  /**
   * Input for tool parameter key value match metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1ToolParameterKVMatchInput toolParameterKvMatchInput;

  /**
   * Input for trajectory match any order metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1TrajectoryAnyOrderMatchInput trajectoryAnyOrderMatchInput;

  /**
   * Input for trajectory exact match metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1TrajectoryExactMatchInput trajectoryExactMatchInput;

  /**
   * Input for trajectory in order match metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1TrajectoryInOrderMatchInput trajectoryInOrderMatchInput;

  /**
   * Input for trajectory precision metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1TrajectoryPrecisionInput trajectoryPrecisionInput;

  /**
   * Input for trajectory recall metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1TrajectoryRecallInput trajectoryRecallInput;

  /**
   * Input for trajectory single tool use metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1TrajectorySingleToolUseInput trajectorySingleToolUseInput;

  /**
   * Optional. Autorater config used for evaluation.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1AutoraterConfig getAutoraterConfig() {
    return autoraterConfig;
  }

  /**
   * Optional. Autorater config used for evaluation.
   * @param autoraterConfig autoraterConfig or {@code null} for none
   */
  public GoogleCloudAiplatformV1EvaluateInstancesRequest setAutoraterConfig(GoogleCloudAiplatformV1AutoraterConfig autoraterConfig) {
    this.autoraterConfig = autoraterConfig;
    return this;
  }

  /**
   * Instances and metric spec for bleu metric.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1BleuInput getBleuInput() {
    return bleuInput;
  }

  /**
   * Instances and metric spec for bleu metric.
   * @param bleuInput bleuInput or {@code null} for none
   */
  public GoogleCloudAiplatformV1EvaluateInstancesRequest setBleuInput(GoogleCloudAiplatformV1BleuInput bleuInput) {
    this.bleuInput = bleuInput;
    return this;
  }

  /**
   * Input for coherence metric.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1CoherenceInput getCoherenceInput() {
    return coherenceInput;
  }

  /**
   * Input for coherence metric.
   * @param coherenceInput coherenceInput or {@code null} for none
   */
  public GoogleCloudAiplatformV1EvaluateInstancesRequest setCoherenceInput(GoogleCloudAiplatformV1CoherenceInput coherenceInput) {
    this.coherenceInput = coherenceInput;
    return this;
  }

  /**
   * Translation metrics. Input for Comet metric.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1CometInput getCometInput() {
    return cometInput;
  }

  /**
   * Translation metrics. Input for Comet metric.
   * @param cometInput cometInput or {@code null} for none
   */
  public GoogleCloudAiplatformV1EvaluateInstancesRequest setCometInput(GoogleCloudAiplatformV1CometInput cometInput) {
    this.cometInput = cometInput;
    return this;
  }

  /**
   * Auto metric instances. Instances and metric spec for exact match metric.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1ExactMatchInput getExactMatchInput() {
    return exactMatchInput;
  }

  /**
   * Auto metric instances. Instances and metric spec for exact match metric.
   * @param exactMatchInput exactMatchInput or {@code null} for none
   */
  public GoogleCloudAiplatformV1EvaluateInstancesRequest setExactMatchInput(GoogleCloudAiplatformV1ExactMatchInput exactMatchInput) {
    this.exactMatchInput = exactMatchInput;
    return this;
  }

  /**
   * LLM-based metric instance. General text generation metrics, applicable to other categories.
   * Input for fluency metric.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1FluencyInput getFluencyInput() {
    return fluencyInput;
  }

  /**
   * LLM-based metric instance. General text generation metrics, applicable to other categories.
   * Input for fluency metric.
   * @param fluencyInput fluencyInput or {@code null} for none
   */
  public GoogleCloudAiplatformV1EvaluateInstancesRequest setFluencyInput(GoogleCloudAiplatformV1FluencyInput fluencyInput) {
    this.fluencyInput = fluencyInput;
    return this;
  }

  /**
   * Input for fulfillment metric.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1FulfillmentInput getFulfillmentInput() {
    return fulfillmentInput;
  }

  /**
   * Input for fulfillment metric.
   * @param fulfillmentInput fulfillmentInput or {@code null} for none
   */
  public GoogleCloudAiplatformV1EvaluateInstancesRequest setFulfillmentInput(GoogleCloudAiplatformV1FulfillmentInput fulfillmentInput) {
    this.fulfillmentInput = fulfillmentInput;
    return this;
  }

  /**
   * Input for groundedness metric.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1GroundednessInput getGroundednessInput() {
    return groundednessInput;
  }

  /**
   * Input for groundedness metric.
   * @param groundednessInput groundednessInput or {@code null} for none
   */
  public GoogleCloudAiplatformV1EvaluateInstancesRequest setGroundednessInput(GoogleCloudAiplatformV1GroundednessInput groundednessInput) {
    this.groundednessInput = groundednessInput;
    return this;
  }

  /**
   * Input for Metricx metric.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1MetricxInput getMetricxInput() {
    return metricxInput;
  }

  /**
   * Input for Metricx metric.
   * @param metricxInput metricxInput or {@code null} for none
   */
  public GoogleCloudAiplatformV1EvaluateInstancesRequest setMetricxInput(GoogleCloudAiplatformV1MetricxInput metricxInput) {
    this.metricxInput = metricxInput;
    return this;
  }

  /**
   * Input for pairwise metric.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1PairwiseMetricInput getPairwiseMetricInput() {
    return pairwiseMetricInput;
  }

  /**
   * Input for pairwise metric.
   * @param pairwiseMetricInput pairwiseMetricInput or {@code null} for none
   */
  public GoogleCloudAiplatformV1EvaluateInstancesRequest setPairwiseMetricInput(GoogleCloudAiplatformV1PairwiseMetricInput pairwiseMetricInput) {
    this.pairwiseMetricInput = pairwiseMetricInput;
    return this;
  }

  /**
   * Input for pairwise question answering quality metric.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1PairwiseQuestionAnsweringQualityInput getPairwiseQuestionAnsweringQualityInput() {
    return pairwiseQuestionAnsweringQualityInput;
  }

  /**
   * Input for pairwise question answering quality metric.
   * @param pairwiseQuestionAnsweringQualityInput pairwiseQuestionAnsweringQualityInput or {@code null} for none
   */
  public GoogleCloudAiplatformV1EvaluateInstancesRequest setPairwiseQuestionAnsweringQualityInput(GoogleCloudAiplatformV1PairwiseQuestionAnsweringQualityInput pairwiseQuestionAnsweringQualityInput) {
    this.pairwiseQuestionAnsweringQualityInput = pairwiseQuestionAnsweringQualityInput;
    return this;
  }

  /**
   * Input for pairwise summarization quality metric.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1PairwiseSummarizationQualityInput getPairwiseSummarizationQualityInput() {
    return pairwiseSummarizationQualityInput;
  }

  /**
   * Input for pairwise summarization quality metric.
   * @param pairwiseSummarizationQualityInput pairwiseSummarizationQualityInput or {@code null} for none
   */
  public GoogleCloudAiplatformV1EvaluateInstancesRequest setPairwiseSummarizationQualityInput(GoogleCloudAiplatformV1PairwiseSummarizationQualityInput pairwiseSummarizationQualityInput) {
    this.pairwiseSummarizationQualityInput = pairwiseSummarizationQualityInput;
    return this;
  }

  /**
   * Input for pointwise metric.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1PointwiseMetricInput getPointwiseMetricInput() {
    return pointwiseMetricInput;
  }

  /**
   * Input for pointwise metric.
   * @param pointwiseMetricInput pointwiseMetricInput or {@code null} for none
   */
  public GoogleCloudAiplatformV1EvaluateInstancesRequest setPointwiseMetricInput(GoogleCloudAiplatformV1PointwiseMetricInput pointwiseMetricInput) {
    this.pointwiseMetricInput = pointwiseMetricInput;
    return this;
  }

  /**
   * Input for question answering correctness metric.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1QuestionAnsweringCorrectnessInput getQuestionAnsweringCorrectnessInput() {
    return questionAnsweringCorrectnessInput;
  }

  /**
   * Input for question answering correctness metric.
   * @param questionAnsweringCorrectnessInput questionAnsweringCorrectnessInput or {@code null} for none
   */
  public GoogleCloudAiplatformV1EvaluateInstancesRequest setQuestionAnsweringCorrectnessInput(GoogleCloudAiplatformV1QuestionAnsweringCorrectnessInput questionAnsweringCorrectnessInput) {
    this.questionAnsweringCorrectnessInput = questionAnsweringCorrectnessInput;
    return this;
  }

  /**
   * Input for question answering helpfulness metric.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1QuestionAnsweringHelpfulnessInput getQuestionAnsweringHelpfulnessInput() {
    return questionAnsweringHelpfulnessInput;
  }

  /**
   * Input for question answering helpfulness metric.
   * @param questionAnsweringHelpfulnessInput questionAnsweringHelpfulnessInput or {@code null} for none
   */
  public GoogleCloudAiplatformV1EvaluateInstancesRequest setQuestionAnsweringHelpfulnessInput(GoogleCloudAiplatformV1QuestionAnsweringHelpfulnessInput questionAnsweringHelpfulnessInput) {
    this.questionAnsweringHelpfulnessInput = questionAnsweringHelpfulnessInput;
    return this;
  }

  /**
   * Input for question answering quality metric.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1QuestionAnsweringQualityInput getQuestionAnsweringQualityInput() {
    return questionAnsweringQualityInput;
  }

  /**
   * Input for question answering quality metric.
   * @param questionAnsweringQualityInput questionAnsweringQualityInput or {@code null} for none
   */
  public GoogleCloudAiplatformV1EvaluateInstancesRequest setQuestionAnsweringQualityInput(GoogleCloudAiplatformV1QuestionAnsweringQualityInput questionAnsweringQualityInput) {
    this.questionAnsweringQualityInput = questionAnsweringQualityInput;
    return this;
  }

  /**
   * Input for question answering relevance metric.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1QuestionAnsweringRelevanceInput getQuestionAnsweringRelevanceInput() {
    return questionAnsweringRelevanceInput;
  }

  /**
   * Input for question answering relevance metric.
   * @param questionAnsweringRelevanceInput questionAnsweringRelevanceInput or {@code null} for none
   */
  public GoogleCloudAiplatformV1EvaluateInstancesRequest setQuestionAnsweringRelevanceInput(GoogleCloudAiplatformV1QuestionAnsweringRelevanceInput questionAnsweringRelevanceInput) {
    this.questionAnsweringRelevanceInput = questionAnsweringRelevanceInput;
    return this;
  }

  /**
   * Instances and metric spec for rouge metric.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1RougeInput getRougeInput() {
    return rougeInput;
  }

  /**
   * Instances and metric spec for rouge metric.
   * @param rougeInput rougeInput or {@code null} for none
   */
  public GoogleCloudAiplatformV1EvaluateInstancesRequest setRougeInput(GoogleCloudAiplatformV1RougeInput rougeInput) {
    this.rougeInput = rougeInput;
    return this;
  }

  /**
   * Rubric Based Instruction Following metric.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1RubricBasedInstructionFollowingInput getRubricBasedInstructionFollowingInput() {
    return rubricBasedInstructionFollowingInput;
  }

  /**
   * Rubric Based Instruction Following metric.
   * @param rubricBasedInstructionFollowingInput rubricBasedInstructionFollowingInput or {@code null} for none
   */
  public GoogleCloudAiplatformV1EvaluateInstancesRequest setRubricBasedInstructionFollowingInput(GoogleCloudAiplatformV1RubricBasedInstructionFollowingInput rubricBasedInstructionFollowingInput) {
    this.rubricBasedInstructionFollowingInput = rubricBasedInstructionFollowingInput;
    return this;
  }

  /**
   * Input for safety metric.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1SafetyInput getSafetyInput() {
    return safetyInput;
  }

  /**
   * Input for safety metric.
   * @param safetyInput safetyInput or {@code null} for none
   */
  public GoogleCloudAiplatformV1EvaluateInstancesRequest setSafetyInput(GoogleCloudAiplatformV1SafetyInput safetyInput) {
    this.safetyInput = safetyInput;
    return this;
  }

  /**
   * Input for summarization helpfulness metric.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1SummarizationHelpfulnessInput getSummarizationHelpfulnessInput() {
    return summarizationHelpfulnessInput;
  }

  /**
   * Input for summarization helpfulness metric.
   * @param summarizationHelpfulnessInput summarizationHelpfulnessInput or {@code null} for none
   */
  public GoogleCloudAiplatformV1EvaluateInstancesRequest setSummarizationHelpfulnessInput(GoogleCloudAiplatformV1SummarizationHelpfulnessInput summarizationHelpfulnessInput) {
    this.summarizationHelpfulnessInput = summarizationHelpfulnessInput;
    return this;
  }

  /**
   * Input for summarization quality metric.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1SummarizationQualityInput getSummarizationQualityInput() {
    return summarizationQualityInput;
  }

  /**
   * Input for summarization quality metric.
   * @param summarizationQualityInput summarizationQualityInput or {@code null} for none
   */
  public GoogleCloudAiplatformV1EvaluateInstancesRequest setSummarizationQualityInput(GoogleCloudAiplatformV1SummarizationQualityInput summarizationQualityInput) {
    this.summarizationQualityInput = summarizationQualityInput;
    return this;
  }

  /**
   * Input for summarization verbosity metric.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1SummarizationVerbosityInput getSummarizationVerbosityInput() {
    return summarizationVerbosityInput;
  }

  /**
   * Input for summarization verbosity metric.
   * @param summarizationVerbosityInput summarizationVerbosityInput or {@code null} for none
   */
  public GoogleCloudAiplatformV1EvaluateInstancesRequest setSummarizationVerbosityInput(GoogleCloudAiplatformV1SummarizationVerbosityInput summarizationVerbosityInput) {
    this.summarizationVerbosityInput = summarizationVerbosityInput;
    return this;
  }

  /**
   * Tool call metric instances. Input for tool call valid metric.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1ToolCallValidInput getToolCallValidInput() {
    return toolCallValidInput;
  }

  /**
   * Tool call metric instances. Input for tool call valid metric.
   * @param toolCallValidInput toolCallValidInput or {@code null} for none
   */
  public GoogleCloudAiplatformV1EvaluateInstancesRequest setToolCallValidInput(GoogleCloudAiplatformV1ToolCallValidInput toolCallValidInput) {
    this.toolCallValidInput = toolCallValidInput;
    return this;
  }

  /**
   * Input for tool name match metric.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1ToolNameMatchInput getToolNameMatchInput() {
    return toolNameMatchInput;
  }

  /**
   * Input for tool name match metric.
   * @param toolNameMatchInput toolNameMatchInput or {@code null} for none
   */
  public GoogleCloudAiplatformV1EvaluateInstancesRequest setToolNameMatchInput(GoogleCloudAiplatformV1ToolNameMatchInput toolNameMatchInput) {
    this.toolNameMatchInput = toolNameMatchInput;
    return this;
  }

  /**
   * Input for tool parameter key match metric.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1ToolParameterKeyMatchInput getToolParameterKeyMatchInput() {
    return toolParameterKeyMatchInput;
  }

  /**
   * Input for tool parameter key match metric.
   * @param toolParameterKeyMatchInput toolParameterKeyMatchInput or {@code null} for none
   */
  public GoogleCloudAiplatformV1EvaluateInstancesRequest setToolParameterKeyMatchInput(GoogleCloudAiplatformV1ToolParameterKeyMatchInput toolParameterKeyMatchInput) {
    this.toolParameterKeyMatchInput = toolParameterKeyMatchInput;
    return this;
  }

  /**
   * Input for tool parameter key value match metric.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1ToolParameterKVMatchInput getToolParameterKvMatchInput() {
    return toolParameterKvMatchInput;
  }

  /**
   * Input for tool parameter key value match metric.
   * @param toolParameterKvMatchInput toolParameterKvMatchInput or {@code null} for none
   */
  public GoogleCloudAiplatformV1EvaluateInstancesRequest setToolParameterKvMatchInput(GoogleCloudAiplatformV1ToolParameterKVMatchInput toolParameterKvMatchInput) {
    this.toolParameterKvMatchInput = toolParameterKvMatchInput;
    return this;
  }

  /**
   * Input for trajectory match any order metric.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1TrajectoryAnyOrderMatchInput getTrajectoryAnyOrderMatchInput() {
    return trajectoryAnyOrderMatchInput;
  }

  /**
   * Input for trajectory match any order metric.
   * @param trajectoryAnyOrderMatchInput trajectoryAnyOrderMatchInput or {@code null} for none
   */
  public GoogleCloudAiplatformV1EvaluateInstancesRequest setTrajectoryAnyOrderMatchInput(GoogleCloudAiplatformV1TrajectoryAnyOrderMatchInput trajectoryAnyOrderMatchInput) {
    this.trajectoryAnyOrderMatchInput = trajectoryAnyOrderMatchInput;
    return this;
  }

  /**
   * Input for trajectory exact match metric.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1TrajectoryExactMatchInput getTrajectoryExactMatchInput() {
    return trajectoryExactMatchInput;
  }

  /**
   * Input for trajectory exact match metric.
   * @param trajectoryExactMatchInput trajectoryExactMatchInput or {@code null} for none
   */
  public GoogleCloudAiplatformV1EvaluateInstancesRequest setTrajectoryExactMatchInput(GoogleCloudAiplatformV1TrajectoryExactMatchInput trajectoryExactMatchInput) {
    this.trajectoryExactMatchInput = trajectoryExactMatchInput;
    return this;
  }

  /**
   * Input for trajectory in order match metric.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1TrajectoryInOrderMatchInput getTrajectoryInOrderMatchInput() {
    return trajectoryInOrderMatchInput;
  }

  /**
   * Input for trajectory in order match metric.
   * @param trajectoryInOrderMatchInput trajectoryInOrderMatchInput or {@code null} for none
   */
  public GoogleCloudAiplatformV1EvaluateInstancesRequest setTrajectoryInOrderMatchInput(GoogleCloudAiplatformV1TrajectoryInOrderMatchInput trajectoryInOrderMatchInput) {
    this.trajectoryInOrderMatchInput = trajectoryInOrderMatchInput;
    return this;
  }

  /**
   * Input for trajectory precision metric.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1TrajectoryPrecisionInput getTrajectoryPrecisionInput() {
    return trajectoryPrecisionInput;
  }

  /**
   * Input for trajectory precision metric.
   * @param trajectoryPrecisionInput trajectoryPrecisionInput or {@code null} for none
   */
  public GoogleCloudAiplatformV1EvaluateInstancesRequest setTrajectoryPrecisionInput(GoogleCloudAiplatformV1TrajectoryPrecisionInput trajectoryPrecisionInput) {
    this.trajectoryPrecisionInput = trajectoryPrecisionInput;
    return this;
  }

  /**
   * Input for trajectory recall metric.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1TrajectoryRecallInput getTrajectoryRecallInput() {
    return trajectoryRecallInput;
  }

  /**
   * Input for trajectory recall metric.
   * @param trajectoryRecallInput trajectoryRecallInput or {@code null} for none
   */
  public GoogleCloudAiplatformV1EvaluateInstancesRequest setTrajectoryRecallInput(GoogleCloudAiplatformV1TrajectoryRecallInput trajectoryRecallInput) {
    this.trajectoryRecallInput = trajectoryRecallInput;
    return this;
  }

  /**
   * Input for trajectory single tool use metric.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1TrajectorySingleToolUseInput getTrajectorySingleToolUseInput() {
    return trajectorySingleToolUseInput;
  }

  /**
   * Input for trajectory single tool use metric.
   * @param trajectorySingleToolUseInput trajectorySingleToolUseInput or {@code null} for none
   */
  public GoogleCloudAiplatformV1EvaluateInstancesRequest setTrajectorySingleToolUseInput(GoogleCloudAiplatformV1TrajectorySingleToolUseInput trajectorySingleToolUseInput) {
    this.trajectorySingleToolUseInput = trajectorySingleToolUseInput;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1EvaluateInstancesRequest set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1EvaluateInstancesRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1EvaluateInstancesRequest clone() {
    return (GoogleCloudAiplatformV1EvaluateInstancesRequest) super.clone();
  }

}

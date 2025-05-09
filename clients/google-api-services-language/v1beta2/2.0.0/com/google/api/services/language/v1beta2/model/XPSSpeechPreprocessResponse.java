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

package com.google.api.services.language.v1beta2.model;

/**
 * Model definition for XPSSpeechPreprocessResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Natural Language API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class XPSSpeechPreprocessResponse extends com.google.api.client.json.GenericJson {

  /**
   * Location od shards of sstables (test data) of DataUtterance protos.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cnsTestDataPath;

  /**
   * Location of shards of sstables (training data) of DataUtterance protos.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cnsTrainDataPath;

  /**
   * The metrics for prebuilt speech models. They are included here because there is no prebuilt
   * speech models stored in the AutoML.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private XPSSpeechEvaluationMetrics prebuiltModelEvaluationMetrics;

  /**
   * Stats associated with the data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private XPSSpeechPreprocessStats speechPreprocessStats;

  /**
   * Location od shards of sstables (test data) of DataUtterance protos.
   * @return value or {@code null} for none
   */
  public java.lang.String getCnsTestDataPath() {
    return cnsTestDataPath;
  }

  /**
   * Location od shards of sstables (test data) of DataUtterance protos.
   * @param cnsTestDataPath cnsTestDataPath or {@code null} for none
   */
  public XPSSpeechPreprocessResponse setCnsTestDataPath(java.lang.String cnsTestDataPath) {
    this.cnsTestDataPath = cnsTestDataPath;
    return this;
  }

  /**
   * Location of shards of sstables (training data) of DataUtterance protos.
   * @return value or {@code null} for none
   */
  public java.lang.String getCnsTrainDataPath() {
    return cnsTrainDataPath;
  }

  /**
   * Location of shards of sstables (training data) of DataUtterance protos.
   * @param cnsTrainDataPath cnsTrainDataPath or {@code null} for none
   */
  public XPSSpeechPreprocessResponse setCnsTrainDataPath(java.lang.String cnsTrainDataPath) {
    this.cnsTrainDataPath = cnsTrainDataPath;
    return this;
  }

  /**
   * The metrics for prebuilt speech models. They are included here because there is no prebuilt
   * speech models stored in the AutoML.
   * @return value or {@code null} for none
   */
  public XPSSpeechEvaluationMetrics getPrebuiltModelEvaluationMetrics() {
    return prebuiltModelEvaluationMetrics;
  }

  /**
   * The metrics for prebuilt speech models. They are included here because there is no prebuilt
   * speech models stored in the AutoML.
   * @param prebuiltModelEvaluationMetrics prebuiltModelEvaluationMetrics or {@code null} for none
   */
  public XPSSpeechPreprocessResponse setPrebuiltModelEvaluationMetrics(XPSSpeechEvaluationMetrics prebuiltModelEvaluationMetrics) {
    this.prebuiltModelEvaluationMetrics = prebuiltModelEvaluationMetrics;
    return this;
  }

  /**
   * Stats associated with the data.
   * @return value or {@code null} for none
   */
  public XPSSpeechPreprocessStats getSpeechPreprocessStats() {
    return speechPreprocessStats;
  }

  /**
   * Stats associated with the data.
   * @param speechPreprocessStats speechPreprocessStats or {@code null} for none
   */
  public XPSSpeechPreprocessResponse setSpeechPreprocessStats(XPSSpeechPreprocessStats speechPreprocessStats) {
    this.speechPreprocessStats = speechPreprocessStats;
    return this;
  }

  @Override
  public XPSSpeechPreprocessResponse set(String fieldName, Object value) {
    return (XPSSpeechPreprocessResponse) super.set(fieldName, value);
  }

  @Override
  public XPSSpeechPreprocessResponse clone() {
    return (XPSSpeechPreprocessResponse) super.clone();
  }

}

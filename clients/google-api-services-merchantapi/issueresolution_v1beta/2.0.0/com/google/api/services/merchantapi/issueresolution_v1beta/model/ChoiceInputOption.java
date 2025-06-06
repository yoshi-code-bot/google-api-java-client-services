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

package com.google.api.services.merchantapi.issueresolution_v1beta.model;

/**
 * A choice that the business can select.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Merchant API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ChoiceInputOption extends com.google.api.client.json.GenericJson {

  /**
   * Input that should be displayed when this option is selected. The additional input will not
   * contain a `ChoiceInput`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InputField additionalInput;

  /**
   * Not for display but need to be sent back for the selected choice option.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Short description of the choice option. There may be more information to be shown as a tooltip.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TextWithTooltip label;

  /**
   * Input that should be displayed when this option is selected. The additional input will not
   * contain a `ChoiceInput`.
   * @return value or {@code null} for none
   */
  public InputField getAdditionalInput() {
    return additionalInput;
  }

  /**
   * Input that should be displayed when this option is selected. The additional input will not
   * contain a `ChoiceInput`.
   * @param additionalInput additionalInput or {@code null} for none
   */
  public ChoiceInputOption setAdditionalInput(InputField additionalInput) {
    this.additionalInput = additionalInput;
    return this;
  }

  /**
   * Not for display but need to be sent back for the selected choice option.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Not for display but need to be sent back for the selected choice option.
   * @param id id or {@code null} for none
   */
  public ChoiceInputOption setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Short description of the choice option. There may be more information to be shown as a tooltip.
   * @return value or {@code null} for none
   */
  public TextWithTooltip getLabel() {
    return label;
  }

  /**
   * Short description of the choice option. There may be more information to be shown as a tooltip.
   * @param label label or {@code null} for none
   */
  public ChoiceInputOption setLabel(TextWithTooltip label) {
    this.label = label;
    return this;
  }

  @Override
  public ChoiceInputOption set(String fieldName, Object value) {
    return (ChoiceInputOption) super.set(fieldName, value);
  }

  @Override
  public ChoiceInputOption clone() {
    return (ChoiceInputOption) super.clone();
  }

}

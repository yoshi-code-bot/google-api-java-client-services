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

package com.google.api.services.chat.v1.model;

/**
 * A section contains a collection of widgets that are rendered vertically in the order that they're
 * specified. [Google Workspace add-ons and Chat
 * apps](https://developers.google.com/workspace/extend):
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Chat API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAppsCardV1Section extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Define the expand and collapse button of the section. This button will be shown only
   * if the section is collapsible. If this field isn't set, the default button is used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsCardV1CollapseControl collapseControl;

  /**
   * Indicates whether this section is collapsible. Collapsible sections hide some or all widgets,
   * but users can expand the section to reveal the hidden widgets by clicking **Show more**. Users
   * can hide the widgets again by clicking **Show less**. To determine which widgets are hidden,
   * specify `uncollapsibleWidgetsCount`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean collapsible;

  /**
   * Text that appears at the top of a section. Supports simple HTML formatted text. For more
   * information about formatting text, see [Formatting text in Google Chat
   * apps](https://developers.google.com/workspace/chat/format-messages#card-formatting) and
   * [Formatting text in Google Workspace add-ons](https://developers.google.com/apps-script/add-
   * ons/concepts/widgets#text_formatting).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String header;

  /**
   * The number of uncollapsible widgets which remain visible even when a section is collapsed. For
   * example, when a section contains five widgets and the `uncollapsibleWidgetsCount` is set to
   * `2`, the first two widgets are always shown and the last three are collapsed by default. The
   * `uncollapsibleWidgetsCount` is taken into account only when `collapsible` is `true`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer uncollapsibleWidgetsCount;

  /**
   * All the widgets in the section. Must contain at least one widget.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleAppsCardV1Widget> widgets;

  /**
   * Optional. Define the expand and collapse button of the section. This button will be shown only
   * if the section is collapsible. If this field isn't set, the default button is used.
   * @return value or {@code null} for none
   */
  public GoogleAppsCardV1CollapseControl getCollapseControl() {
    return collapseControl;
  }

  /**
   * Optional. Define the expand and collapse button of the section. This button will be shown only
   * if the section is collapsible. If this field isn't set, the default button is used.
   * @param collapseControl collapseControl or {@code null} for none
   */
  public GoogleAppsCardV1Section setCollapseControl(GoogleAppsCardV1CollapseControl collapseControl) {
    this.collapseControl = collapseControl;
    return this;
  }

  /**
   * Indicates whether this section is collapsible. Collapsible sections hide some or all widgets,
   * but users can expand the section to reveal the hidden widgets by clicking **Show more**. Users
   * can hide the widgets again by clicking **Show less**. To determine which widgets are hidden,
   * specify `uncollapsibleWidgetsCount`.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCollapsible() {
    return collapsible;
  }

  /**
   * Indicates whether this section is collapsible. Collapsible sections hide some or all widgets,
   * but users can expand the section to reveal the hidden widgets by clicking **Show more**. Users
   * can hide the widgets again by clicking **Show less**. To determine which widgets are hidden,
   * specify `uncollapsibleWidgetsCount`.
   * @param collapsible collapsible or {@code null} for none
   */
  public GoogleAppsCardV1Section setCollapsible(java.lang.Boolean collapsible) {
    this.collapsible = collapsible;
    return this;
  }

  /**
   * Text that appears at the top of a section. Supports simple HTML formatted text. For more
   * information about formatting text, see [Formatting text in Google Chat
   * apps](https://developers.google.com/workspace/chat/format-messages#card-formatting) and
   * [Formatting text in Google Workspace add-ons](https://developers.google.com/apps-script/add-
   * ons/concepts/widgets#text_formatting).
   * @return value or {@code null} for none
   */
  public java.lang.String getHeader() {
    return header;
  }

  /**
   * Text that appears at the top of a section. Supports simple HTML formatted text. For more
   * information about formatting text, see [Formatting text in Google Chat
   * apps](https://developers.google.com/workspace/chat/format-messages#card-formatting) and
   * [Formatting text in Google Workspace add-ons](https://developers.google.com/apps-script/add-
   * ons/concepts/widgets#text_formatting).
   * @param header header or {@code null} for none
   */
  public GoogleAppsCardV1Section setHeader(java.lang.String header) {
    this.header = header;
    return this;
  }

  /**
   * The number of uncollapsible widgets which remain visible even when a section is collapsed. For
   * example, when a section contains five widgets and the `uncollapsibleWidgetsCount` is set to
   * `2`, the first two widgets are always shown and the last three are collapsed by default. The
   * `uncollapsibleWidgetsCount` is taken into account only when `collapsible` is `true`.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getUncollapsibleWidgetsCount() {
    return uncollapsibleWidgetsCount;
  }

  /**
   * The number of uncollapsible widgets which remain visible even when a section is collapsed. For
   * example, when a section contains five widgets and the `uncollapsibleWidgetsCount` is set to
   * `2`, the first two widgets are always shown and the last three are collapsed by default. The
   * `uncollapsibleWidgetsCount` is taken into account only when `collapsible` is `true`.
   * @param uncollapsibleWidgetsCount uncollapsibleWidgetsCount or {@code null} for none
   */
  public GoogleAppsCardV1Section setUncollapsibleWidgetsCount(java.lang.Integer uncollapsibleWidgetsCount) {
    this.uncollapsibleWidgetsCount = uncollapsibleWidgetsCount;
    return this;
  }

  /**
   * All the widgets in the section. Must contain at least one widget.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleAppsCardV1Widget> getWidgets() {
    return widgets;
  }

  /**
   * All the widgets in the section. Must contain at least one widget.
   * @param widgets widgets or {@code null} for none
   */
  public GoogleAppsCardV1Section setWidgets(java.util.List<GoogleAppsCardV1Widget> widgets) {
    this.widgets = widgets;
    return this;
  }

  @Override
  public GoogleAppsCardV1Section set(String fieldName, Object value) {
    return (GoogleAppsCardV1Section) super.set(fieldName, value);
  }

  @Override
  public GoogleAppsCardV1Section clone() {
    return (GoogleAppsCardV1Section) super.clone();
  }

}

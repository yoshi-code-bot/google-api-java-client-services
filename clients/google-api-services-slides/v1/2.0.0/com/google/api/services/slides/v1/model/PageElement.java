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

package com.google.api.services.slides.v1.model;

/**
 * A visual element rendered on a page.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PageElement extends com.google.api.client.json.GenericJson {

  /**
   * The description of the page element. Combined with title to display alt text. The field is not
   * supported for Group elements.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * A collection of page elements joined as a single unit.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Group elementGroup;

  /**
   * An image page element.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Image image;

  /**
   * A line page element.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Line line;

  /**
   * The object ID for this page element. Object IDs used by google.apps.slides.v1.Page and
   * google.apps.slides.v1.PageElement share the same namespace.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String objectId;

  /**
   * A generic shape.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Shape shape;

  /**
   * A linked chart embedded from Google Sheets. Unlinked charts are represented as images.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SheetsChart sheetsChart;

  /**
   * The size of the page element.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Size size;

  /**
   * A Speaker Spotlight.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SpeakerSpotlight speakerSpotlight;

  /**
   * A table page element.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Table table;

  /**
   * The title of the page element. Combined with description to display alt text. The field is not
   * supported for Group elements.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The transform of the page element. The visual appearance of the page element is determined by
   * its absolute transform. To compute the absolute transform, preconcatenate a page element's
   * transform with the transforms of all of its parent groups. If the page element is not in a
   * group, its absolute transform is the same as the value in this field. The initial transform for
   * the newly created Group is always the identity transform.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AffineTransform transform;

  /**
   * A video page element.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Video video;

  /**
   * A word art page element.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private WordArt wordArt;

  /**
   * The description of the page element. Combined with title to display alt text. The field is not
   * supported for Group elements.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * The description of the page element. Combined with title to display alt text. The field is not
   * supported for Group elements.
   * @param description description or {@code null} for none
   */
  public PageElement setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * A collection of page elements joined as a single unit.
   * @return value or {@code null} for none
   */
  public Group getElementGroup() {
    return elementGroup;
  }

  /**
   * A collection of page elements joined as a single unit.
   * @param elementGroup elementGroup or {@code null} for none
   */
  public PageElement setElementGroup(Group elementGroup) {
    this.elementGroup = elementGroup;
    return this;
  }

  /**
   * An image page element.
   * @return value or {@code null} for none
   */
  public Image getImage() {
    return image;
  }

  /**
   * An image page element.
   * @param image image or {@code null} for none
   */
  public PageElement setImage(Image image) {
    this.image = image;
    return this;
  }

  /**
   * A line page element.
   * @return value or {@code null} for none
   */
  public Line getLine() {
    return line;
  }

  /**
   * A line page element.
   * @param line line or {@code null} for none
   */
  public PageElement setLine(Line line) {
    this.line = line;
    return this;
  }

  /**
   * The object ID for this page element. Object IDs used by google.apps.slides.v1.Page and
   * google.apps.slides.v1.PageElement share the same namespace.
   * @return value or {@code null} for none
   */
  public java.lang.String getObjectId() {
    return objectId;
  }

  /**
   * The object ID for this page element. Object IDs used by google.apps.slides.v1.Page and
   * google.apps.slides.v1.PageElement share the same namespace.
   * @param objectId objectId or {@code null} for none
   */
  public PageElement setObjectId(java.lang.String objectId) {
    this.objectId = objectId;
    return this;
  }

  /**
   * A generic shape.
   * @return value or {@code null} for none
   */
  public Shape getShape() {
    return shape;
  }

  /**
   * A generic shape.
   * @param shape shape or {@code null} for none
   */
  public PageElement setShape(Shape shape) {
    this.shape = shape;
    return this;
  }

  /**
   * A linked chart embedded from Google Sheets. Unlinked charts are represented as images.
   * @return value or {@code null} for none
   */
  public SheetsChart getSheetsChart() {
    return sheetsChart;
  }

  /**
   * A linked chart embedded from Google Sheets. Unlinked charts are represented as images.
   * @param sheetsChart sheetsChart or {@code null} for none
   */
  public PageElement setSheetsChart(SheetsChart sheetsChart) {
    this.sheetsChart = sheetsChart;
    return this;
  }

  /**
   * The size of the page element.
   * @return value or {@code null} for none
   */
  public Size getSize() {
    return size;
  }

  /**
   * The size of the page element.
   * @param size size or {@code null} for none
   */
  public PageElement setSize(Size size) {
    this.size = size;
    return this;
  }

  /**
   * A Speaker Spotlight.
   * @return value or {@code null} for none
   */
  public SpeakerSpotlight getSpeakerSpotlight() {
    return speakerSpotlight;
  }

  /**
   * A Speaker Spotlight.
   * @param speakerSpotlight speakerSpotlight or {@code null} for none
   */
  public PageElement setSpeakerSpotlight(SpeakerSpotlight speakerSpotlight) {
    this.speakerSpotlight = speakerSpotlight;
    return this;
  }

  /**
   * A table page element.
   * @return value or {@code null} for none
   */
  public Table getTable() {
    return table;
  }

  /**
   * A table page element.
   * @param table table or {@code null} for none
   */
  public PageElement setTable(Table table) {
    this.table = table;
    return this;
  }

  /**
   * The title of the page element. Combined with description to display alt text. The field is not
   * supported for Group elements.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The title of the page element. Combined with description to display alt text. The field is not
   * supported for Group elements.
   * @param title title or {@code null} for none
   */
  public PageElement setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * The transform of the page element. The visual appearance of the page element is determined by
   * its absolute transform. To compute the absolute transform, preconcatenate a page element's
   * transform with the transforms of all of its parent groups. If the page element is not in a
   * group, its absolute transform is the same as the value in this field. The initial transform for
   * the newly created Group is always the identity transform.
   * @return value or {@code null} for none
   */
  public AffineTransform getTransform() {
    return transform;
  }

  /**
   * The transform of the page element. The visual appearance of the page element is determined by
   * its absolute transform. To compute the absolute transform, preconcatenate a page element's
   * transform with the transforms of all of its parent groups. If the page element is not in a
   * group, its absolute transform is the same as the value in this field. The initial transform for
   * the newly created Group is always the identity transform.
   * @param transform transform or {@code null} for none
   */
  public PageElement setTransform(AffineTransform transform) {
    this.transform = transform;
    return this;
  }

  /**
   * A video page element.
   * @return value or {@code null} for none
   */
  public Video getVideo() {
    return video;
  }

  /**
   * A video page element.
   * @param video video or {@code null} for none
   */
  public PageElement setVideo(Video video) {
    this.video = video;
    return this;
  }

  /**
   * A word art page element.
   * @return value or {@code null} for none
   */
  public WordArt getWordArt() {
    return wordArt;
  }

  /**
   * A word art page element.
   * @param wordArt wordArt or {@code null} for none
   */
  public PageElement setWordArt(WordArt wordArt) {
    this.wordArt = wordArt;
    return this;
  }

  @Override
  public PageElement set(String fieldName, Object value) {
    return (PageElement) super.set(fieldName, value);
  }

  @Override
  public PageElement clone() {
    return (PageElement) super.clone();
  }

}

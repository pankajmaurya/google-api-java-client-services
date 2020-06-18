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

package com.google.api.services.documentai.v1beta2.model;

/**
 * Dimension for the page.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Document AI API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDocumentaiV1beta2DocumentPageDimension extends com.google.api.client.json.GenericJson {

  /**
   * Page height.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float height;

  /**
   * Dimension unit.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String unit;

  /**
   * Page width.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float width;

  /**
   * Page height.
   * @return value or {@code null} for none
   */
  public java.lang.Float getHeight() {
    return height;
  }

  /**
   * Page height.
   * @param height height or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentPageDimension setHeight(java.lang.Float height) {
    this.height = height;
    return this;
  }

  /**
   * Dimension unit.
   * @return value or {@code null} for none
   */
  public java.lang.String getUnit() {
    return unit;
  }

  /**
   * Dimension unit.
   * @param unit unit or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentPageDimension setUnit(java.lang.String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Page width.
   * @return value or {@code null} for none
   */
  public java.lang.Float getWidth() {
    return width;
  }

  /**
   * Page width.
   * @param width width or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentPageDimension setWidth(java.lang.Float width) {
    this.width = width;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1beta2DocumentPageDimension set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1beta2DocumentPageDimension) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1beta2DocumentPageDimension clone() {
    return (GoogleCloudDocumentaiV1beta2DocumentPageDimension) super.clone();
  }

}

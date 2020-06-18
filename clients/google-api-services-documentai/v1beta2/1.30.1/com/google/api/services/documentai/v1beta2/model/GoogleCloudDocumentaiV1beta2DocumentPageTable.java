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
 * A table representation similar to HTML table structure.
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
public final class GoogleCloudDocumentaiV1beta2DocumentPageTable extends com.google.api.client.json.GenericJson {

  /**
   * Body rows of the table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDocumentaiV1beta2DocumentPageTableTableRow> bodyRows;

  /**
   * A list of detected languages together with confidence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDocumentaiV1beta2DocumentPageDetectedLanguage> detectedLanguages;

  static {
    // hack to force ProGuard to consider GoogleCloudDocumentaiV1beta2DocumentPageDetectedLanguage used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDocumentaiV1beta2DocumentPageDetectedLanguage.class);
  }

  /**
   * Header rows of the table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDocumentaiV1beta2DocumentPageTableTableRow> headerRows;

  /**
   * Layout for Table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1beta2DocumentPageLayout layout;

  /**
   * Body rows of the table.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDocumentaiV1beta2DocumentPageTableTableRow> getBodyRows() {
    return bodyRows;
  }

  /**
   * Body rows of the table.
   * @param bodyRows bodyRows or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentPageTable setBodyRows(java.util.List<GoogleCloudDocumentaiV1beta2DocumentPageTableTableRow> bodyRows) {
    this.bodyRows = bodyRows;
    return this;
  }

  /**
   * A list of detected languages together with confidence.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDocumentaiV1beta2DocumentPageDetectedLanguage> getDetectedLanguages() {
    return detectedLanguages;
  }

  /**
   * A list of detected languages together with confidence.
   * @param detectedLanguages detectedLanguages or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentPageTable setDetectedLanguages(java.util.List<GoogleCloudDocumentaiV1beta2DocumentPageDetectedLanguage> detectedLanguages) {
    this.detectedLanguages = detectedLanguages;
    return this;
  }

  /**
   * Header rows of the table.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDocumentaiV1beta2DocumentPageTableTableRow> getHeaderRows() {
    return headerRows;
  }

  /**
   * Header rows of the table.
   * @param headerRows headerRows or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentPageTable setHeaderRows(java.util.List<GoogleCloudDocumentaiV1beta2DocumentPageTableTableRow> headerRows) {
    this.headerRows = headerRows;
    return this;
  }

  /**
   * Layout for Table.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentPageLayout getLayout() {
    return layout;
  }

  /**
   * Layout for Table.
   * @param layout layout or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentPageTable setLayout(GoogleCloudDocumentaiV1beta2DocumentPageLayout layout) {
    this.layout = layout;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1beta2DocumentPageTable set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1beta2DocumentPageTable) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1beta2DocumentPageTable clone() {
    return (GoogleCloudDocumentaiV1beta2DocumentPageTable) super.clone();
  }

}

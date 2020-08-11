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

package com.google.api.services.translate.v3beta1.model;

/**
 * A single translation response.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Translation API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Translation extends com.google.api.client.json.GenericJson {

  /**
   * The BCP-47 language code of source text in the initial request, detected automatically, if no
   * source language was passed within the initial request. If the source language was passed, auto-
   * detection of the language does not occur and this field is empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String detectedLanguageCode;

  /**
   * The `glossary_config` used for this translation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TranslateTextGlossaryConfig glossaryConfig;

  /**
   * Only present when `model` is present in the request. `model` here is normalized to have project
   * number. For example: If the `model` requested in TranslationTextRequest is `projects/{project-
   * id}/locations/{location-id}/models/general/nmt` then `model` here would be normalized to
   * `projects/{project-number}/locations/{location-id}/models/general/nmt`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String model;

  /**
   * Text translated into the target language.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String translatedText;

  /**
   * The BCP-47 language code of source text in the initial request, detected automatically, if no
   * source language was passed within the initial request. If the source language was passed, auto-
   * detection of the language does not occur and this field is empty.
   * @return value or {@code null} for none
   */
  public java.lang.String getDetectedLanguageCode() {
    return detectedLanguageCode;
  }

  /**
   * The BCP-47 language code of source text in the initial request, detected automatically, if no
   * source language was passed within the initial request. If the source language was passed, auto-
   * detection of the language does not occur and this field is empty.
   * @param detectedLanguageCode detectedLanguageCode or {@code null} for none
   */
  public Translation setDetectedLanguageCode(java.lang.String detectedLanguageCode) {
    this.detectedLanguageCode = detectedLanguageCode;
    return this;
  }

  /**
   * The `glossary_config` used for this translation.
   * @return value or {@code null} for none
   */
  public TranslateTextGlossaryConfig getGlossaryConfig() {
    return glossaryConfig;
  }

  /**
   * The `glossary_config` used for this translation.
   * @param glossaryConfig glossaryConfig or {@code null} for none
   */
  public Translation setGlossaryConfig(TranslateTextGlossaryConfig glossaryConfig) {
    this.glossaryConfig = glossaryConfig;
    return this;
  }

  /**
   * Only present when `model` is present in the request. `model` here is normalized to have project
   * number. For example: If the `model` requested in TranslationTextRequest is `projects/{project-
   * id}/locations/{location-id}/models/general/nmt` then `model` here would be normalized to
   * `projects/{project-number}/locations/{location-id}/models/general/nmt`.
   * @return value or {@code null} for none
   */
  public java.lang.String getModel() {
    return model;
  }

  /**
   * Only present when `model` is present in the request. `model` here is normalized to have project
   * number. For example: If the `model` requested in TranslationTextRequest is `projects/{project-
   * id}/locations/{location-id}/models/general/nmt` then `model` here would be normalized to
   * `projects/{project-number}/locations/{location-id}/models/general/nmt`.
   * @param model model or {@code null} for none
   */
  public Translation setModel(java.lang.String model) {
    this.model = model;
    return this;
  }

  /**
   * Text translated into the target language.
   * @return value or {@code null} for none
   */
  public java.lang.String getTranslatedText() {
    return translatedText;
  }

  /**
   * Text translated into the target language.
   * @param translatedText translatedText or {@code null} for none
   */
  public Translation setTranslatedText(java.lang.String translatedText) {
    this.translatedText = translatedText;
    return this;
  }

  @Override
  public Translation set(String fieldName, Object value) {
    return (Translation) super.set(fieldName, value);
  }

  @Override
  public Translation clone() {
    return (Translation) super.clone();
  }

}

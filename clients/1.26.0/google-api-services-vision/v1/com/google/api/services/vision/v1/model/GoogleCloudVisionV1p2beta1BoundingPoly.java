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

package com.google.api.services.vision.v1.model;

/**
 * A bounding polygon for the detected image annotation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVisionV1p2beta1BoundingPoly extends com.google.api.client.json.GenericJson {

  /**
   * The bounding polygon normalized vertices.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVisionV1p2beta1NormalizedVertex> normalizedVertices;

  static {
    // hack to force ProGuard to consider GoogleCloudVisionV1p2beta1NormalizedVertex used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudVisionV1p2beta1NormalizedVertex.class);
  }

  /**
   * The bounding polygon vertices.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVisionV1p2beta1Vertex> vertices;

  /**
   * The bounding polygon normalized vertices.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVisionV1p2beta1NormalizedVertex> getNormalizedVertices() {
    return normalizedVertices;
  }

  /**
   * The bounding polygon normalized vertices.
   * @param normalizedVertices normalizedVertices or {@code null} for none
   */
  public GoogleCloudVisionV1p2beta1BoundingPoly setNormalizedVertices(java.util.List<GoogleCloudVisionV1p2beta1NormalizedVertex> normalizedVertices) {
    this.normalizedVertices = normalizedVertices;
    return this;
  }

  /**
   * The bounding polygon vertices.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVisionV1p2beta1Vertex> getVertices() {
    return vertices;
  }

  /**
   * The bounding polygon vertices.
   * @param vertices vertices or {@code null} for none
   */
  public GoogleCloudVisionV1p2beta1BoundingPoly setVertices(java.util.List<GoogleCloudVisionV1p2beta1Vertex> vertices) {
    this.vertices = vertices;
    return this;
  }

  @Override
  public GoogleCloudVisionV1p2beta1BoundingPoly set(String fieldName, Object value) {
    return (GoogleCloudVisionV1p2beta1BoundingPoly) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVisionV1p2beta1BoundingPoly clone() {
    return (GoogleCloudVisionV1p2beta1BoundingPoly) super.clone();
  }

}

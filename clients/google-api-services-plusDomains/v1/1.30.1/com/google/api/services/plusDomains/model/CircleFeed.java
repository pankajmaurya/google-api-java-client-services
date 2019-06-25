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

package com.google.api.services.plusDomains.model;

/**
 * Model definition for CircleFeed.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google+ Domains API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CircleFeed extends com.google.api.client.json.GenericJson {

  /**
   * ETag of this response for caching purposes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The circles in this page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Circle> items;

  static {
    // hack to force ProGuard to consider Circle used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Circle.class);
  }

  /**
   * Identifies this resource as a collection of circles. Value: "plus#circleFeed".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Link to the next page of circles.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextLink;

  /**
   * The continuation token, which is used to page through large result sets. Provide this value in
   * a subsequent request to return the next page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Link to this page of circles.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * The title of this list of resources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The total number of circles. The number of circles in this response may be smaller due to
   * paging.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer totalItems;

  /**
   * ETag of this response for caching purposes.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * ETag of this response for caching purposes.
   * @param etag etag or {@code null} for none
   */
  public CircleFeed setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The circles in this page of results.
   * @return value or {@code null} for none
   */
  public java.util.List<Circle> getItems() {
    return items;
  }

  /**
   * The circles in this page of results.
   * @param items items or {@code null} for none
   */
  public CircleFeed setItems(java.util.List<Circle> items) {
    this.items = items;
    return this;
  }

  /**
   * Identifies this resource as a collection of circles. Value: "plus#circleFeed".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies this resource as a collection of circles. Value: "plus#circleFeed".
   * @param kind kind or {@code null} for none
   */
  public CircleFeed setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Link to the next page of circles.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextLink() {
    return nextLink;
  }

  /**
   * Link to the next page of circles.
   * @param nextLink nextLink or {@code null} for none
   */
  public CircleFeed setNextLink(java.lang.String nextLink) {
    this.nextLink = nextLink;
    return this;
  }

  /**
   * The continuation token, which is used to page through large result sets. Provide this value in
   * a subsequent request to return the next page of results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The continuation token, which is used to page through large result sets. Provide this value in
   * a subsequent request to return the next page of results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public CircleFeed setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Link to this page of circles.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * Link to this page of circles.
   * @param selfLink selfLink or {@code null} for none
   */
  public CircleFeed setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * The title of this list of resources.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The title of this list of resources.
   * @param title title or {@code null} for none
   */
  public CircleFeed setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * The total number of circles. The number of circles in this response may be smaller due to
   * paging.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTotalItems() {
    return totalItems;
  }

  /**
   * The total number of circles. The number of circles in this response may be smaller due to
   * paging.
   * @param totalItems totalItems or {@code null} for none
   */
  public CircleFeed setTotalItems(java.lang.Integer totalItems) {
    this.totalItems = totalItems;
    return this;
  }

  @Override
  public CircleFeed set(String fieldName, Object value) {
    return (CircleFeed) super.set(fieldName, value);
  }

  @Override
  public CircleFeed clone() {
    return (CircleFeed) super.clone();
  }

}

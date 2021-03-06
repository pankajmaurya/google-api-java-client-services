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

package com.google.api.services.books.v1.model;

/**
 * Model definition for Offers.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Books API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Offers extends com.google.api.client.json.GenericJson {

  /**
   * A list of offers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Items> items;

  static {
    // hack to force ProGuard to consider Items used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Items.class);
  }

  /**
   * Resource type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * A list of offers.
   * @return value or {@code null} for none
   */
  public java.util.List<Items> getItems() {
    return items;
  }

  /**
   * A list of offers.
   * @param items items or {@code null} for none
   */
  public Offers setItems(java.util.List<Items> items) {
    this.items = items;
    return this;
  }

  /**
   * Resource type.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Resource type.
   * @param kind kind or {@code null} for none
   */
  public Offers setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  @Override
  public Offers set(String fieldName, Object value) {
    return (Offers) super.set(fieldName, value);
  }

  @Override
  public Offers clone() {
    return (Offers) super.clone();
  }

  /**
   * Model definition for OffersItems.
   */
  public static final class Items extends com.google.api.client.json.GenericJson {

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String artUrl;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String gservicesKey;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String id;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<OffersItemsItems> items;

    static {
      // hack to force ProGuard to consider OffersItemsItems used, since otherwise it would be stripped out
      // see https://github.com/google/google-api-java-client/issues/543
      com.google.api.client.util.Data.nullOf(OffersItemsItems.class);
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getArtUrl() {
      return artUrl;
    }

    /**
     * @param artUrl artUrl or {@code null} for none
     */
    public Items setArtUrl(java.lang.String artUrl) {
      this.artUrl = artUrl;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getGservicesKey() {
      return gservicesKey;
    }

    /**
     * @param gservicesKey gservicesKey or {@code null} for none
     */
    public Items setGservicesKey(java.lang.String gservicesKey) {
      this.gservicesKey = gservicesKey;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getId() {
      return id;
    }

    /**
     * @param id id or {@code null} for none
     */
    public Items setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.util.List<OffersItemsItems> getItems() {
      return items;
    }

    /**
     * @param items items or {@code null} for none
     */
    public Items setItems(java.util.List<OffersItemsItems> items) {
      this.items = items;
      return this;
    }

    @Override
    public Items set(String fieldName, Object value) {
      return (Items) super.set(fieldName, value);
    }

    @Override
    public Items clone() {
      return (Items) super.clone();
    }

    /**
     * Model definition for OffersItemsItems.
     */
    public static final class OffersItemsItems extends com.google.api.client.json.GenericJson {

      /**
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String author;

      /**
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String canonicalVolumeLink;

      /**
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String coverUrl;

      /**
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String description;

      /**
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String title;

      /**
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String volumeId;

      /**
       * @return value or {@code null} for none
       */
      public java.lang.String getAuthor() {
        return author;
      }

      /**
       * @param author author or {@code null} for none
       */
      public OffersItemsItems setAuthor(java.lang.String author) {
        this.author = author;
        return this;
      }

      /**
       * @return value or {@code null} for none
       */
      public java.lang.String getCanonicalVolumeLink() {
        return canonicalVolumeLink;
      }

      /**
       * @param canonicalVolumeLink canonicalVolumeLink or {@code null} for none
       */
      public OffersItemsItems setCanonicalVolumeLink(java.lang.String canonicalVolumeLink) {
        this.canonicalVolumeLink = canonicalVolumeLink;
        return this;
      }

      /**
       * @return value or {@code null} for none
       */
      public java.lang.String getCoverUrl() {
        return coverUrl;
      }

      /**
       * @param coverUrl coverUrl or {@code null} for none
       */
      public OffersItemsItems setCoverUrl(java.lang.String coverUrl) {
        this.coverUrl = coverUrl;
        return this;
      }

      /**
       * @return value or {@code null} for none
       */
      public java.lang.String getDescription() {
        return description;
      }

      /**
       * @param description description or {@code null} for none
       */
      public OffersItemsItems setDescription(java.lang.String description) {
        this.description = description;
        return this;
      }

      /**
       * @return value or {@code null} for none
       */
      public java.lang.String getTitle() {
        return title;
      }

      /**
       * @param title title or {@code null} for none
       */
      public OffersItemsItems setTitle(java.lang.String title) {
        this.title = title;
        return this;
      }

      /**
       * @return value or {@code null} for none
       */
      public java.lang.String getVolumeId() {
        return volumeId;
      }

      /**
       * @param volumeId volumeId or {@code null} for none
       */
      public OffersItemsItems setVolumeId(java.lang.String volumeId) {
        this.volumeId = volumeId;
        return this;
      }

      @Override
      public OffersItemsItems set(String fieldName, Object value) {
        return (OffersItemsItems) super.set(fieldName, value);
      }

      @Override
      public OffersItemsItems clone() {
        return (OffersItemsItems) super.clone();
      }

    }
  }

}

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

package com.google.api.services.storagetransfer.v1.model;

/**
 * Configuration for running a transfer.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Storage Transfer API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TransferSpec extends com.google.api.client.json.GenericJson {

  /**
   * An AWS S3 data source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AwsS3Data awsS3DataSource;

  /**
   * An Azure Blob Storage data source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AzureBlobStorageData azureBlobStorageDataSource;

  /**
   * A Cloud Storage data sink.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GcsData gcsDataSink;

  /**
   * A Cloud Storage data source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GcsData gcsDataSource;

  /**
   * An HTTP URL data source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HttpData httpDataSource;

  /**
   * Only objects that satisfy these object conditions are included in the set of data source and
   * data sink objects.  Object conditions based on objects' "last modification time" do not exclude
   * objects in a data sink.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ObjectConditions objectConditions;

  /**
   * If the option delete_objects_unique_in_sink is `true`, object conditions based on objects'
   * "last modification time" are ignored and do not exclude objects in a data source or a data
   * sink.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TransferOptions transferOptions;

  /**
   * An AWS S3 data source.
   * @return value or {@code null} for none
   */
  public AwsS3Data getAwsS3DataSource() {
    return awsS3DataSource;
  }

  /**
   * An AWS S3 data source.
   * @param awsS3DataSource awsS3DataSource or {@code null} for none
   */
  public TransferSpec setAwsS3DataSource(AwsS3Data awsS3DataSource) {
    this.awsS3DataSource = awsS3DataSource;
    return this;
  }

  /**
   * An Azure Blob Storage data source.
   * @return value or {@code null} for none
   */
  public AzureBlobStorageData getAzureBlobStorageDataSource() {
    return azureBlobStorageDataSource;
  }

  /**
   * An Azure Blob Storage data source.
   * @param azureBlobStorageDataSource azureBlobStorageDataSource or {@code null} for none
   */
  public TransferSpec setAzureBlobStorageDataSource(AzureBlobStorageData azureBlobStorageDataSource) {
    this.azureBlobStorageDataSource = azureBlobStorageDataSource;
    return this;
  }

  /**
   * A Cloud Storage data sink.
   * @return value or {@code null} for none
   */
  public GcsData getGcsDataSink() {
    return gcsDataSink;
  }

  /**
   * A Cloud Storage data sink.
   * @param gcsDataSink gcsDataSink or {@code null} for none
   */
  public TransferSpec setGcsDataSink(GcsData gcsDataSink) {
    this.gcsDataSink = gcsDataSink;
    return this;
  }

  /**
   * A Cloud Storage data source.
   * @return value or {@code null} for none
   */
  public GcsData getGcsDataSource() {
    return gcsDataSource;
  }

  /**
   * A Cloud Storage data source.
   * @param gcsDataSource gcsDataSource or {@code null} for none
   */
  public TransferSpec setGcsDataSource(GcsData gcsDataSource) {
    this.gcsDataSource = gcsDataSource;
    return this;
  }

  /**
   * An HTTP URL data source.
   * @return value or {@code null} for none
   */
  public HttpData getHttpDataSource() {
    return httpDataSource;
  }

  /**
   * An HTTP URL data source.
   * @param httpDataSource httpDataSource or {@code null} for none
   */
  public TransferSpec setHttpDataSource(HttpData httpDataSource) {
    this.httpDataSource = httpDataSource;
    return this;
  }

  /**
   * Only objects that satisfy these object conditions are included in the set of data source and
   * data sink objects.  Object conditions based on objects' "last modification time" do not exclude
   * objects in a data sink.
   * @return value or {@code null} for none
   */
  public ObjectConditions getObjectConditions() {
    return objectConditions;
  }

  /**
   * Only objects that satisfy these object conditions are included in the set of data source and
   * data sink objects.  Object conditions based on objects' "last modification time" do not exclude
   * objects in a data sink.
   * @param objectConditions objectConditions or {@code null} for none
   */
  public TransferSpec setObjectConditions(ObjectConditions objectConditions) {
    this.objectConditions = objectConditions;
    return this;
  }

  /**
   * If the option delete_objects_unique_in_sink is `true`, object conditions based on objects'
   * "last modification time" are ignored and do not exclude objects in a data source or a data
   * sink.
   * @return value or {@code null} for none
   */
  public TransferOptions getTransferOptions() {
    return transferOptions;
  }

  /**
   * If the option delete_objects_unique_in_sink is `true`, object conditions based on objects'
   * "last modification time" are ignored and do not exclude objects in a data source or a data
   * sink.
   * @param transferOptions transferOptions or {@code null} for none
   */
  public TransferSpec setTransferOptions(TransferOptions transferOptions) {
    this.transferOptions = transferOptions;
    return this;
  }

  @Override
  public TransferSpec set(String fieldName, Object value) {
    return (TransferSpec) super.set(fieldName, value);
  }

  @Override
  public TransferSpec clone() {
    return (TransferSpec) super.clone();
  }

}

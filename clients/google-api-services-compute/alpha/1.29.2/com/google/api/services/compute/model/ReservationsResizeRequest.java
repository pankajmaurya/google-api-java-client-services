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

package com.google.api.services.compute.model;

/**
 * Model definition for ReservationsResizeRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReservationsResizeRequest extends com.google.api.client.json.GenericJson {

  /**
   * Number of allocated resources can be resized with minimum = 1 and maximum = 1000.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long specificSkuCount;

  /**
   * Number of allocated resources can be resized with minimum = 1 and maximum = 1000.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSpecificSkuCount() {
    return specificSkuCount;
  }

  /**
   * Number of allocated resources can be resized with minimum = 1 and maximum = 1000.
   * @param specificSkuCount specificSkuCount or {@code null} for none
   */
  public ReservationsResizeRequest setSpecificSkuCount(java.lang.Long specificSkuCount) {
    this.specificSkuCount = specificSkuCount;
    return this;
  }

  @Override
  public ReservationsResizeRequest set(String fieldName, Object value) {
    return (ReservationsResizeRequest) super.set(fieldName, value);
  }

  @Override
  public ReservationsResizeRequest clone() {
    return (ReservationsResizeRequest) super.clone();
  }

}
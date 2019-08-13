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
 * A Shielded Instance Identity Entry.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ShieldedVmIdentityEntry extends com.google.api.client.json.GenericJson {

  /**
   * A PEM-encoded X.509 certificate. This field can be empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ekCert;

  /**
   * A PEM-encoded public key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ekPub;

  /**
   * A PEM-encoded X.509 certificate. This field can be empty.
   * @return value or {@code null} for none
   */
  public java.lang.String getEkCert() {
    return ekCert;
  }

  /**
   * A PEM-encoded X.509 certificate. This field can be empty.
   * @param ekCert ekCert or {@code null} for none
   */
  public ShieldedVmIdentityEntry setEkCert(java.lang.String ekCert) {
    this.ekCert = ekCert;
    return this;
  }

  /**
   * A PEM-encoded public key.
   * @return value or {@code null} for none
   */
  public java.lang.String getEkPub() {
    return ekPub;
  }

  /**
   * A PEM-encoded public key.
   * @param ekPub ekPub or {@code null} for none
   */
  public ShieldedVmIdentityEntry setEkPub(java.lang.String ekPub) {
    this.ekPub = ekPub;
    return this;
  }

  @Override
  public ShieldedVmIdentityEntry set(String fieldName, Object value) {
    return (ShieldedVmIdentityEntry) super.set(fieldName, value);
  }

  @Override
  public ShieldedVmIdentityEntry clone() {
    return (ShieldedVmIdentityEntry) super.clone();
  }

}
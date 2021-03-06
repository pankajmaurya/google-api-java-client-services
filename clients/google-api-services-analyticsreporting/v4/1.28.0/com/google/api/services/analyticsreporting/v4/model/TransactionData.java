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

package com.google.api.services.analyticsreporting.v4.model;

/**
 * Represents details collected when the visitor performs a transaction on the page.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Analytics Reporting API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TransactionData extends com.google.api.client.json.GenericJson {

  /**
   * The transaction ID, supplied by the e-commerce tracking method, for the purchase in the
   * shopping cart.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String transactionId;

  /**
   * The total sale revenue (excluding shipping and tax) of the transaction.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double transactionRevenue;

  /**
   * Total cost of shipping.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double transactionShipping;

  /**
   * Total tax for the transaction.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double transactionTax;

  /**
   * The transaction ID, supplied by the e-commerce tracking method, for the purchase in the
   * shopping cart.
   * @return value or {@code null} for none
   */
  public java.lang.String getTransactionId() {
    return transactionId;
  }

  /**
   * The transaction ID, supplied by the e-commerce tracking method, for the purchase in the
   * shopping cart.
   * @param transactionId transactionId or {@code null} for none
   */
  public TransactionData setTransactionId(java.lang.String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * The total sale revenue (excluding shipping and tax) of the transaction.
   * @return value or {@code null} for none
   */
  public java.lang.Double getTransactionRevenue() {
    return transactionRevenue;
  }

  /**
   * The total sale revenue (excluding shipping and tax) of the transaction.
   * @param transactionRevenue transactionRevenue or {@code null} for none
   */
  public TransactionData setTransactionRevenue(java.lang.Double transactionRevenue) {
    this.transactionRevenue = transactionRevenue;
    return this;
  }

  /**
   * Total cost of shipping.
   * @return value or {@code null} for none
   */
  public java.lang.Double getTransactionShipping() {
    return transactionShipping;
  }

  /**
   * Total cost of shipping.
   * @param transactionShipping transactionShipping or {@code null} for none
   */
  public TransactionData setTransactionShipping(java.lang.Double transactionShipping) {
    this.transactionShipping = transactionShipping;
    return this;
  }

  /**
   * Total tax for the transaction.
   * @return value or {@code null} for none
   */
  public java.lang.Double getTransactionTax() {
    return transactionTax;
  }

  /**
   * Total tax for the transaction.
   * @param transactionTax transactionTax or {@code null} for none
   */
  public TransactionData setTransactionTax(java.lang.Double transactionTax) {
    this.transactionTax = transactionTax;
    return this;
  }

  @Override
  public TransactionData set(String fieldName, Object value) {
    return (TransactionData) super.set(fieldName, value);
  }

  @Override
  public TransactionData clone() {
    return (TransactionData) super.clone();
  }

}

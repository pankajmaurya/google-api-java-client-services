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

package com.google.api.services.spanner.v1.model;

/**
 * Query optimizer configuration.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Spanner API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class QueryOptions extends com.google.api.client.json.GenericJson {

  /**
   * An option to control the selection of optimizer version.
   *
   * This parameter allows individual queries to pick different query optimizer versions.
   *
   * Specifying "latest" as a value instructs Cloud Spanner to use the latest supported query
   * optimizer version. If not specified, Cloud Spanner uses optimizer version set at the database
   * level options. Any other positive integer (from the list of supported optimizer versions)
   * overrides the default optimizer version for query execution. The list of supported optimizer
   * versions can be queried from SPANNER_SYS.SUPPORTED_OPTIMIZER_VERSIONS. Executing a SQL
   * statement with an invalid optimizer version will fail with a syntax error (`INVALID_ARGUMENT`)
   * status. See https://cloud.google.com/spanner/docs/query-optimizer/manage-query-optimizer for
   * more information on managing the query optimizer.
   *
   * The `optimizer_version` statement hint has precedence over this setting.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String optimizerVersion;

  /**
   * An option to control the selection of optimizer version.
   *
   * This parameter allows individual queries to pick different query optimizer versions.
   *
   * Specifying "latest" as a value instructs Cloud Spanner to use the latest supported query
   * optimizer version. If not specified, Cloud Spanner uses optimizer version set at the database
   * level options. Any other positive integer (from the list of supported optimizer versions)
   * overrides the default optimizer version for query execution. The list of supported optimizer
   * versions can be queried from SPANNER_SYS.SUPPORTED_OPTIMIZER_VERSIONS. Executing a SQL
   * statement with an invalid optimizer version will fail with a syntax error (`INVALID_ARGUMENT`)
   * status. See https://cloud.google.com/spanner/docs/query-optimizer/manage-query-optimizer for
   * more information on managing the query optimizer.
   *
   * The `optimizer_version` statement hint has precedence over this setting.
   * @return value or {@code null} for none
   */
  public java.lang.String getOptimizerVersion() {
    return optimizerVersion;
  }

  /**
   * An option to control the selection of optimizer version.
   *
   * This parameter allows individual queries to pick different query optimizer versions.
   *
   * Specifying "latest" as a value instructs Cloud Spanner to use the latest supported query
   * optimizer version. If not specified, Cloud Spanner uses optimizer version set at the database
   * level options. Any other positive integer (from the list of supported optimizer versions)
   * overrides the default optimizer version for query execution. The list of supported optimizer
   * versions can be queried from SPANNER_SYS.SUPPORTED_OPTIMIZER_VERSIONS. Executing a SQL
   * statement with an invalid optimizer version will fail with a syntax error (`INVALID_ARGUMENT`)
   * status. See https://cloud.google.com/spanner/docs/query-optimizer/manage-query-optimizer for
   * more information on managing the query optimizer.
   *
   * The `optimizer_version` statement hint has precedence over this setting.
   * @param optimizerVersion optimizerVersion or {@code null} for none
   */
  public QueryOptions setOptimizerVersion(java.lang.String optimizerVersion) {
    this.optimizerVersion = optimizerVersion;
    return this;
  }

  @Override
  public QueryOptions set(String fieldName, Object value) {
    return (QueryOptions) super.set(fieldName, value);
  }

  @Override
  public QueryOptions clone() {
    return (QueryOptions) super.clone();
  }

}

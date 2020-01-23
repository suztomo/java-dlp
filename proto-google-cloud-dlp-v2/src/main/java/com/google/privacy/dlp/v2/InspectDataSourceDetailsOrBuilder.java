/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface InspectDataSourceDetailsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.InspectDataSourceDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The configuration used for this job.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectDataSourceDetails.RequestedOptions requested_options = 2;
   * </code>
   *
   * @return Whether the requestedOptions field is set.
   */
  boolean hasRequestedOptions();
  /**
   *
   *
   * <pre>
   * The configuration used for this job.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectDataSourceDetails.RequestedOptions requested_options = 2;
   * </code>
   *
   * @return The requestedOptions.
   */
  com.google.privacy.dlp.v2.InspectDataSourceDetails.RequestedOptions getRequestedOptions();
  /**
   *
   *
   * <pre>
   * The configuration used for this job.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectDataSourceDetails.RequestedOptions requested_options = 2;
   * </code>
   */
  com.google.privacy.dlp.v2.InspectDataSourceDetails.RequestedOptionsOrBuilder
      getRequestedOptionsOrBuilder();

  /**
   *
   *
   * <pre>
   * A summary of the outcome of this inspect job.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectDataSourceDetails.Result result = 3;</code>
   *
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   *
   *
   * <pre>
   * A summary of the outcome of this inspect job.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectDataSourceDetails.Result result = 3;</code>
   *
   * @return The result.
   */
  com.google.privacy.dlp.v2.InspectDataSourceDetails.Result getResult();
  /**
   *
   *
   * <pre>
   * A summary of the outcome of this inspect job.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectDataSourceDetails.Result result = 3;</code>
   */
  com.google.privacy.dlp.v2.InspectDataSourceDetails.ResultOrBuilder getResultOrBuilder();
}

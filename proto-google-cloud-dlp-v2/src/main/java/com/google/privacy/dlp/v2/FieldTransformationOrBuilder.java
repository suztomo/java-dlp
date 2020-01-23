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

public interface FieldTransformationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.FieldTransformation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Input field(s) to apply the transformation to.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.FieldId fields = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.privacy.dlp.v2.FieldId> getFieldsList();
  /**
   *
   *
   * <pre>
   * Required. Input field(s) to apply the transformation to.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.FieldId fields = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.privacy.dlp.v2.FieldId getFields(int index);
  /**
   *
   *
   * <pre>
   * Required. Input field(s) to apply the transformation to.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.FieldId fields = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getFieldsCount();
  /**
   *
   *
   * <pre>
   * Required. Input field(s) to apply the transformation to.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.FieldId fields = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.FieldIdOrBuilder> getFieldsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. Input field(s) to apply the transformation to.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.FieldId fields = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.privacy.dlp.v2.FieldIdOrBuilder getFieldsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Only apply the transformation if the condition evaluates to true for the
   * given `RecordCondition`. The conditions are allowed to reference fields
   * that are not used in the actual transformation.
   * Example Use Cases:
   * - Apply a different bucket transformation to an age column if the zip code
   * column for the same record is within a specific range.
   * - Redact a field if the date of birth field is greater than 85.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.RecordCondition condition = 3;</code>
   *
   * @return Whether the condition field is set.
   */
  boolean hasCondition();
  /**
   *
   *
   * <pre>
   * Only apply the transformation if the condition evaluates to true for the
   * given `RecordCondition`. The conditions are allowed to reference fields
   * that are not used in the actual transformation.
   * Example Use Cases:
   * - Apply a different bucket transformation to an age column if the zip code
   * column for the same record is within a specific range.
   * - Redact a field if the date of birth field is greater than 85.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.RecordCondition condition = 3;</code>
   *
   * @return The condition.
   */
  com.google.privacy.dlp.v2.RecordCondition getCondition();
  /**
   *
   *
   * <pre>
   * Only apply the transformation if the condition evaluates to true for the
   * given `RecordCondition`. The conditions are allowed to reference fields
   * that are not used in the actual transformation.
   * Example Use Cases:
   * - Apply a different bucket transformation to an age column if the zip code
   * column for the same record is within a specific range.
   * - Redact a field if the date of birth field is greater than 85.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.RecordCondition condition = 3;</code>
   */
  com.google.privacy.dlp.v2.RecordConditionOrBuilder getConditionOrBuilder();

  /**
   *
   *
   * <pre>
   * Apply the transformation to the entire field.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.PrimitiveTransformation primitive_transformation = 4;</code>
   *
   * @return Whether the primitiveTransformation field is set.
   */
  boolean hasPrimitiveTransformation();
  /**
   *
   *
   * <pre>
   * Apply the transformation to the entire field.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.PrimitiveTransformation primitive_transformation = 4;</code>
   *
   * @return The primitiveTransformation.
   */
  com.google.privacy.dlp.v2.PrimitiveTransformation getPrimitiveTransformation();
  /**
   *
   *
   * <pre>
   * Apply the transformation to the entire field.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.PrimitiveTransformation primitive_transformation = 4;</code>
   */
  com.google.privacy.dlp.v2.PrimitiveTransformationOrBuilder getPrimitiveTransformationOrBuilder();

  /**
   *
   *
   * <pre>
   * Treat the contents of the field as free text, and selectively
   * transform content that matches an `InfoType`.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InfoTypeTransformations info_type_transformations = 5;</code>
   *
   * @return Whether the infoTypeTransformations field is set.
   */
  boolean hasInfoTypeTransformations();
  /**
   *
   *
   * <pre>
   * Treat the contents of the field as free text, and selectively
   * transform content that matches an `InfoType`.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InfoTypeTransformations info_type_transformations = 5;</code>
   *
   * @return The infoTypeTransformations.
   */
  com.google.privacy.dlp.v2.InfoTypeTransformations getInfoTypeTransformations();
  /**
   *
   *
   * <pre>
   * Treat the contents of the field as free text, and selectively
   * transform content that matches an `InfoType`.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InfoTypeTransformations info_type_transformations = 5;</code>
   */
  com.google.privacy.dlp.v2.InfoTypeTransformationsOrBuilder getInfoTypeTransformationsOrBuilder();

  public com.google.privacy.dlp.v2.FieldTransformation.TransformationCase getTransformationCase();
}

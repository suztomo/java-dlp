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
// source: google/privacy/dlp/v2/storage.proto

package com.google.privacy.dlp.v2;

public interface CloudStorageOptionsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.CloudStorageOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The set of one or more files to scan.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CloudStorageOptions.FileSet file_set = 1;</code>
   *
   * @return Whether the fileSet field is set.
   */
  boolean hasFileSet();
  /**
   *
   *
   * <pre>
   * The set of one or more files to scan.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CloudStorageOptions.FileSet file_set = 1;</code>
   *
   * @return The fileSet.
   */
  com.google.privacy.dlp.v2.CloudStorageOptions.FileSet getFileSet();
  /**
   *
   *
   * <pre>
   * The set of one or more files to scan.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CloudStorageOptions.FileSet file_set = 1;</code>
   */
  com.google.privacy.dlp.v2.CloudStorageOptions.FileSetOrBuilder getFileSetOrBuilder();

  /**
   *
   *
   * <pre>
   * Max number of bytes to scan from a file. If a scanned file's size is bigger
   * than this value then the rest of the bytes are omitted. Only one
   * of bytes_limit_per_file and bytes_limit_per_file_percent can be specified.
   * </pre>
   *
   * <code>int64 bytes_limit_per_file = 4;</code>
   *
   * @return The bytesLimitPerFile.
   */
  long getBytesLimitPerFile();

  /**
   *
   *
   * <pre>
   * Max percentage of bytes to scan from a file. The rest are omitted. The
   * number of bytes scanned is rounded down. Must be between 0 and 100,
   * inclusively. Both 0 and 100 means no limit. Defaults to 0. Only one
   * of bytes_limit_per_file and bytes_limit_per_file_percent can be specified.
   * </pre>
   *
   * <code>int32 bytes_limit_per_file_percent = 8;</code>
   *
   * @return The bytesLimitPerFilePercent.
   */
  int getBytesLimitPerFilePercent();

  /**
   *
   *
   * <pre>
   * List of file type groups to include in the scan.
   * If empty, all files are scanned and available data format processors
   * are applied. In addition, the binary content of the selected files
   * is always scanned as well.
   * Images are scanned only as binary if the specified region
   * does not support image inspection and no file_types were specified.
   * Image inspection is restricted to 'global', 'us', 'asia', and 'europe'.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.FileType file_types = 5;</code>
   *
   * @return A list containing the fileTypes.
   */
  java.util.List<com.google.privacy.dlp.v2.FileType> getFileTypesList();
  /**
   *
   *
   * <pre>
   * List of file type groups to include in the scan.
   * If empty, all files are scanned and available data format processors
   * are applied. In addition, the binary content of the selected files
   * is always scanned as well.
   * Images are scanned only as binary if the specified region
   * does not support image inspection and no file_types were specified.
   * Image inspection is restricted to 'global', 'us', 'asia', and 'europe'.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.FileType file_types = 5;</code>
   *
   * @return The count of fileTypes.
   */
  int getFileTypesCount();
  /**
   *
   *
   * <pre>
   * List of file type groups to include in the scan.
   * If empty, all files are scanned and available data format processors
   * are applied. In addition, the binary content of the selected files
   * is always scanned as well.
   * Images are scanned only as binary if the specified region
   * does not support image inspection and no file_types were specified.
   * Image inspection is restricted to 'global', 'us', 'asia', and 'europe'.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.FileType file_types = 5;</code>
   *
   * @param index The index of the element to return.
   * @return The fileTypes at the given index.
   */
  com.google.privacy.dlp.v2.FileType getFileTypes(int index);
  /**
   *
   *
   * <pre>
   * List of file type groups to include in the scan.
   * If empty, all files are scanned and available data format processors
   * are applied. In addition, the binary content of the selected files
   * is always scanned as well.
   * Images are scanned only as binary if the specified region
   * does not support image inspection and no file_types were specified.
   * Image inspection is restricted to 'global', 'us', 'asia', and 'europe'.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.FileType file_types = 5;</code>
   *
   * @return A list containing the enum numeric values on the wire for fileTypes.
   */
  java.util.List<java.lang.Integer> getFileTypesValueList();
  /**
   *
   *
   * <pre>
   * List of file type groups to include in the scan.
   * If empty, all files are scanned and available data format processors
   * are applied. In addition, the binary content of the selected files
   * is always scanned as well.
   * Images are scanned only as binary if the specified region
   * does not support image inspection and no file_types were specified.
   * Image inspection is restricted to 'global', 'us', 'asia', and 'europe'.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.FileType file_types = 5;</code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of fileTypes at the given index.
   */
  int getFileTypesValue(int index);

  /**
   * <code>.google.privacy.dlp.v2.CloudStorageOptions.SampleMethod sample_method = 6;</code>
   *
   * @return The enum numeric value on the wire for sampleMethod.
   */
  int getSampleMethodValue();
  /**
   * <code>.google.privacy.dlp.v2.CloudStorageOptions.SampleMethod sample_method = 6;</code>
   *
   * @return The sampleMethod.
   */
  com.google.privacy.dlp.v2.CloudStorageOptions.SampleMethod getSampleMethod();

  /**
   *
   *
   * <pre>
   * Limits the number of files to scan to this percentage of the input FileSet.
   * Number of files scanned is rounded down. Must be between 0 and 100,
   * inclusively. Both 0 and 100 means no limit. Defaults to 0.
   * </pre>
   *
   * <code>int32 files_limit_percent = 7;</code>
   *
   * @return The filesLimitPercent.
   */
  int getFilesLimitPercent();
}

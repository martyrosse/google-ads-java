// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/custom_interest_service.proto

package com.google.ads.googleads.v2.services;

public interface CustomInterestOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.services.CustomInterestOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Create operation: No resource name is expected for the new custom
   * interest.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.CustomInterest create = 1;</code>
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new custom
   * interest.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.CustomInterest create = 1;</code>
   */
  com.google.ads.googleads.v2.resources.CustomInterest getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new custom
   * interest.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.CustomInterest create = 1;</code>
   */
  com.google.ads.googleads.v2.resources.CustomInterestOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Update operation: The custom interest is expected to have a valid
   * resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.CustomInterest update = 2;</code>
   */
  boolean hasUpdate();
  /**
   * <pre>
   * Update operation: The custom interest is expected to have a valid
   * resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.CustomInterest update = 2;</code>
   */
  com.google.ads.googleads.v2.resources.CustomInterest getUpdate();
  /**
   * <pre>
   * Update operation: The custom interest is expected to have a valid
   * resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.CustomInterest update = 2;</code>
   */
  com.google.ads.googleads.v2.resources.CustomInterestOrBuilder getUpdateOrBuilder();

  public com.google.ads.googleads.v2.services.CustomInterestOperation.OperationCase getOperationCase();
}

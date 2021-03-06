// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/ad_group_criterion_label.proto

package com.google.ads.googleads.v3.resources;

public interface AdGroupCriterionLabelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.resources.AdGroupCriterionLabel)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the ad group criterion label.
   * Ad group criterion label resource names have the form:
   * `customers/{customer_id}/adGroupCriterionLabels/{ad_group_id}~{criterion_id}~{label_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the ad group criterion label.
   * Ad group criterion label resource names have the form:
   * `customers/{customer_id}/adGroupCriterionLabels/{ad_group_id}~{criterion_id}~{label_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Immutable. The ad group criterion to which the label is attached.
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group_criterion = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  boolean hasAdGroupCriterion();
  /**
   * <pre>
   * Immutable. The ad group criterion to which the label is attached.
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group_criterion = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValue getAdGroupCriterion();
  /**
   * <pre>
   * Immutable. The ad group criterion to which the label is attached.
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group_criterion = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getAdGroupCriterionOrBuilder();

  /**
   * <pre>
   * Immutable. The label assigned to the ad group criterion.
   * </pre>
   *
   * <code>.google.protobuf.StringValue label = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  boolean hasLabel();
  /**
   * <pre>
   * Immutable. The label assigned to the ad group criterion.
   * </pre>
   *
   * <code>.google.protobuf.StringValue label = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValue getLabel();
  /**
   * <pre>
   * Immutable. The label assigned to the ad group criterion.
   * </pre>
   *
   * <code>.google.protobuf.StringValue label = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getLabelOrBuilder();
}

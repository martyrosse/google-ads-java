// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/common/dates.proto

package com.google.ads.googleads.v3.common;

public final class DatesProto {
  private DatesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_common_DateRange_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_common_DateRange_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*google/ads/googleads/v3/common/dates.p" +
      "roto\022\036google.ads.googleads.v3.common\032\036go" +
      "ogle/protobuf/wrappers.proto\032\034google/api" +
      "/annotations.proto\"m\n\tDateRange\0220\n\nstart" +
      "_date\030\001 \001(\0132\034.google.protobuf.StringValu" +
      "e\022.\n\010end_date\030\002 \001(\0132\034.google.protobuf.St" +
      "ringValueB\345\001\n\"com.google.ads.googleads.v" +
      "3.commonB\nDatesProtoP\001ZDgoogle.golang.or" +
      "g/genproto/googleapis/ads/googleads/v3/c" +
      "ommon;common\242\002\003GAA\252\002\036Google.Ads.GoogleAd" +
      "s.V3.Common\312\002\036Google\\Ads\\GoogleAds\\V3\\Co" +
      "mmon\352\002\"Google::Ads::GoogleAds::V3::Commo" +
      "nb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_common_DateRange_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_common_DateRange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_common_DateRange_descriptor,
        new java.lang.String[] { "StartDate", "EndDate", });
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

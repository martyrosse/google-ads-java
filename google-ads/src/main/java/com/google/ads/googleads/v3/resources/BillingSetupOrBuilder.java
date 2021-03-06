// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/billing_setup.proto

package com.google.ads.googleads.v3.resources;

public interface BillingSetupOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.resources.BillingSetup)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the billing setup.
   * BillingSetup resource names have the form:
   * `customers/{customer_id}/billingSetups/{billing_setup_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the billing setup.
   * BillingSetup resource names have the form:
   * `customers/{customer_id}/billingSetups/{billing_setup_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the billing setup.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the billing setup.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <pre>
   * Output only. The ID of the billing setup.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * Output only. The status of the billing setup.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.BillingSetupStatusEnum.BillingSetupStatus status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. The status of the billing setup.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.BillingSetupStatusEnum.BillingSetupStatus status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.enums.BillingSetupStatusEnum.BillingSetupStatus getStatus();

  /**
   * <pre>
   * Immutable. The resource name of the payments account associated with this billing
   * setup. Payments resource names have the form:
   * `customers/{customer_id}/paymentsAccounts/{payments_account_id}`
   * When setting up billing, this is used to signup with an existing payments
   * account (and then payments_account_info should not be set).
   * When getting a billing setup, this and payments_account_info will be
   * populated.
   * </pre>
   *
   * <code>.google.protobuf.StringValue payments_account = 11 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  boolean hasPaymentsAccount();
  /**
   * <pre>
   * Immutable. The resource name of the payments account associated with this billing
   * setup. Payments resource names have the form:
   * `customers/{customer_id}/paymentsAccounts/{payments_account_id}`
   * When setting up billing, this is used to signup with an existing payments
   * account (and then payments_account_info should not be set).
   * When getting a billing setup, this and payments_account_info will be
   * populated.
   * </pre>
   *
   * <code>.google.protobuf.StringValue payments_account = 11 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValue getPaymentsAccount();
  /**
   * <pre>
   * Immutable. The resource name of the payments account associated with this billing
   * setup. Payments resource names have the form:
   * `customers/{customer_id}/paymentsAccounts/{payments_account_id}`
   * When setting up billing, this is used to signup with an existing payments
   * account (and then payments_account_info should not be set).
   * When getting a billing setup, this and payments_account_info will be
   * populated.
   * </pre>
   *
   * <code>.google.protobuf.StringValue payments_account = 11 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getPaymentsAccountOrBuilder();

  /**
   * <pre>
   * Immutable. The payments account information associated with this billing setup.
   * When setting up billing, this is used to signup with a new payments account
   * (and then payments_account should not be set).
   * When getting a billing setup, this and payments_account will be
   * populated.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.BillingSetup.PaymentsAccountInfo payments_account_info = 12 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  boolean hasPaymentsAccountInfo();
  /**
   * <pre>
   * Immutable. The payments account information associated with this billing setup.
   * When setting up billing, this is used to signup with a new payments account
   * (and then payments_account should not be set).
   * When getting a billing setup, this and payments_account will be
   * populated.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.BillingSetup.PaymentsAccountInfo payments_account_info = 12 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v3.resources.BillingSetup.PaymentsAccountInfo getPaymentsAccountInfo();
  /**
   * <pre>
   * Immutable. The payments account information associated with this billing setup.
   * When setting up billing, this is used to signup with a new payments account
   * (and then payments_account should not be set).
   * When getting a billing setup, this and payments_account will be
   * populated.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.BillingSetup.PaymentsAccountInfo payments_account_info = 12 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v3.resources.BillingSetup.PaymentsAccountInfoOrBuilder getPaymentsAccountInfoOrBuilder();

  /**
   * <pre>
   * Immutable. The start date time in yyyy-MM-dd or yyyy-MM-dd HH:mm:ss format. Only a
   * future time is allowed.
   * </pre>
   *
   * <code>.google.protobuf.StringValue start_date_time = 9 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  boolean hasStartDateTime();
  /**
   * <pre>
   * Immutable. The start date time in yyyy-MM-dd or yyyy-MM-dd HH:mm:ss format. Only a
   * future time is allowed.
   * </pre>
   *
   * <code>.google.protobuf.StringValue start_date_time = 9 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.protobuf.StringValue getStartDateTime();
  /**
   * <pre>
   * Immutable. The start date time in yyyy-MM-dd or yyyy-MM-dd HH:mm:ss format. Only a
   * future time is allowed.
   * </pre>
   *
   * <code>.google.protobuf.StringValue start_date_time = 9 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.protobuf.StringValueOrBuilder getStartDateTimeOrBuilder();

  /**
   * <pre>
   * Immutable. The start time as a type. Only NOW is allowed.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.TimeTypeEnum.TimeType start_time_type = 10 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  int getStartTimeTypeValue();
  /**
   * <pre>
   * Immutable. The start time as a type. Only NOW is allowed.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.TimeTypeEnum.TimeType start_time_type = 10 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v3.enums.TimeTypeEnum.TimeType getStartTimeType();

  /**
   * <pre>
   * Output only. The end date time in yyyy-MM-dd or yyyy-MM-dd HH:mm:ss format.
   * </pre>
   *
   * <code>.google.protobuf.StringValue end_date_time = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  boolean hasEndDateTime();
  /**
   * <pre>
   * Output only. The end date time in yyyy-MM-dd or yyyy-MM-dd HH:mm:ss format.
   * </pre>
   *
   * <code>.google.protobuf.StringValue end_date_time = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValue getEndDateTime();
  /**
   * <pre>
   * Output only. The end date time in yyyy-MM-dd or yyyy-MM-dd HH:mm:ss format.
   * </pre>
   *
   * <code>.google.protobuf.StringValue end_date_time = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValueOrBuilder getEndDateTimeOrBuilder();

  /**
   * <pre>
   * Output only. The end time as a type.  The only possible value is FOREVER.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.TimeTypeEnum.TimeType end_time_type = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getEndTimeTypeValue();
  /**
   * <pre>
   * Output only. The end time as a type.  The only possible value is FOREVER.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.TimeTypeEnum.TimeType end_time_type = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.enums.TimeTypeEnum.TimeType getEndTimeType();

  public com.google.ads.googleads.v3.resources.BillingSetup.StartTimeCase getStartTimeCase();

  public com.google.ads.googleads.v3.resources.BillingSetup.EndTimeCase getEndTimeCase();
}

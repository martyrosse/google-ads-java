// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/test/tester.proto

package com.google.ads.googleads.test;

/**
 * Protobuf type {@code google.ads.googleads.test.Foo}
 */
public  final class Foo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.test.Foo)
    FooOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Foo.newBuilder() to construct.
  private Foo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Foo() {
    num_ = 0L;
    bars_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Foo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            num_ = input.readInt64();
            break;
          }
          case 18: {
            com.google.ads.googleads.test.Bar.Builder subBuilder = null;
            if (bar_ != null) {
              subBuilder = bar_.toBuilder();
            }
            bar_ = input.readMessage(com.google.ads.googleads.test.Bar.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(bar_);
              bar_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              bars_ = new java.util.ArrayList<com.google.ads.googleads.test.Bar>();
              mutable_bitField0_ |= 0x00000004;
            }
            bars_.add(
                input.readMessage(com.google.ads.googleads.test.Bar.parser(), extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        bars_ = java.util.Collections.unmodifiableList(bars_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.test.TestSuiteProto.internal_static_google_ads_googleads_test_Foo_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.test.TestSuiteProto.internal_static_google_ads_googleads_test_Foo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.test.Foo.class, com.google.ads.googleads.test.Foo.Builder.class);
  }

  private int bitField0_;
  public static final int NUM_FIELD_NUMBER = 1;
  private long num_;
  /**
   * <code>int64 num = 1;</code>
   */
  public long getNum() {
    return num_;
  }

  public static final int BAR_FIELD_NUMBER = 2;
  private com.google.ads.googleads.test.Bar bar_;
  /**
   * <code>.google.ads.googleads.test.Bar bar = 2;</code>
   */
  public boolean hasBar() {
    return bar_ != null;
  }
  /**
   * <code>.google.ads.googleads.test.Bar bar = 2;</code>
   */
  public com.google.ads.googleads.test.Bar getBar() {
    return bar_ == null ? com.google.ads.googleads.test.Bar.getDefaultInstance() : bar_;
  }
  /**
   * <code>.google.ads.googleads.test.Bar bar = 2;</code>
   */
  public com.google.ads.googleads.test.BarOrBuilder getBarOrBuilder() {
    return getBar();
  }

  public static final int BARS_FIELD_NUMBER = 3;
  private java.util.List<com.google.ads.googleads.test.Bar> bars_;
  /**
   * <code>repeated .google.ads.googleads.test.Bar bars = 3;</code>
   */
  public java.util.List<com.google.ads.googleads.test.Bar> getBarsList() {
    return bars_;
  }
  /**
   * <code>repeated .google.ads.googleads.test.Bar bars = 3;</code>
   */
  public java.util.List<? extends com.google.ads.googleads.test.BarOrBuilder> 
      getBarsOrBuilderList() {
    return bars_;
  }
  /**
   * <code>repeated .google.ads.googleads.test.Bar bars = 3;</code>
   */
  public int getBarsCount() {
    return bars_.size();
  }
  /**
   * <code>repeated .google.ads.googleads.test.Bar bars = 3;</code>
   */
  public com.google.ads.googleads.test.Bar getBars(int index) {
    return bars_.get(index);
  }
  /**
   * <code>repeated .google.ads.googleads.test.Bar bars = 3;</code>
   */
  public com.google.ads.googleads.test.BarOrBuilder getBarsOrBuilder(
      int index) {
    return bars_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (num_ != 0L) {
      output.writeInt64(1, num_);
    }
    if (bar_ != null) {
      output.writeMessage(2, getBar());
    }
    for (int i = 0; i < bars_.size(); i++) {
      output.writeMessage(3, bars_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (num_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, num_);
    }
    if (bar_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getBar());
    }
    for (int i = 0; i < bars_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, bars_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.test.Foo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.test.Foo other = (com.google.ads.googleads.test.Foo) obj;

    boolean result = true;
    result = result && (getNum()
        == other.getNum());
    result = result && (hasBar() == other.hasBar());
    if (hasBar()) {
      result = result && getBar()
          .equals(other.getBar());
    }
    result = result && getBarsList()
        .equals(other.getBarsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NUM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNum());
    if (hasBar()) {
      hash = (37 * hash) + BAR_FIELD_NUMBER;
      hash = (53 * hash) + getBar().hashCode();
    }
    if (getBarsCount() > 0) {
      hash = (37 * hash) + BARS_FIELD_NUMBER;
      hash = (53 * hash) + getBarsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.test.Foo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.test.Foo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.test.Foo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.test.Foo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.test.Foo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.test.Foo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.test.Foo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.test.Foo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.test.Foo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.test.Foo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.test.Foo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.test.Foo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.ads.googleads.test.Foo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code google.ads.googleads.test.Foo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.test.Foo)
      com.google.ads.googleads.test.FooOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.test.TestSuiteProto.internal_static_google_ads_googleads_test_Foo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.test.TestSuiteProto.internal_static_google_ads_googleads_test_Foo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.test.Foo.class, com.google.ads.googleads.test.Foo.Builder.class);
    }

    // Construct using com.google.ads.googleads.test.Foo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getBarsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      num_ = 0L;

      if (barBuilder_ == null) {
        bar_ = null;
      } else {
        bar_ = null;
        barBuilder_ = null;
      }
      if (barsBuilder_ == null) {
        bars_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        barsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.test.TestSuiteProto.internal_static_google_ads_googleads_test_Foo_descriptor;
    }

    public com.google.ads.googleads.test.Foo getDefaultInstanceForType() {
      return com.google.ads.googleads.test.Foo.getDefaultInstance();
    }

    public com.google.ads.googleads.test.Foo build() {
      com.google.ads.googleads.test.Foo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.ads.googleads.test.Foo buildPartial() {
      com.google.ads.googleads.test.Foo result = new com.google.ads.googleads.test.Foo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.num_ = num_;
      if (barBuilder_ == null) {
        result.bar_ = bar_;
      } else {
        result.bar_ = barBuilder_.build();
      }
      if (barsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          bars_ = java.util.Collections.unmodifiableList(bars_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.bars_ = bars_;
      } else {
        result.bars_ = barsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.test.Foo) {
        return mergeFrom((com.google.ads.googleads.test.Foo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.test.Foo other) {
      if (other == com.google.ads.googleads.test.Foo.getDefaultInstance()) return this;
      if (other.getNum() != 0L) {
        setNum(other.getNum());
      }
      if (other.hasBar()) {
        mergeBar(other.getBar());
      }
      if (barsBuilder_ == null) {
        if (!other.bars_.isEmpty()) {
          if (bars_.isEmpty()) {
            bars_ = other.bars_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureBarsIsMutable();
            bars_.addAll(other.bars_);
          }
          onChanged();
        }
      } else {
        if (!other.bars_.isEmpty()) {
          if (barsBuilder_.isEmpty()) {
            barsBuilder_.dispose();
            barsBuilder_ = null;
            bars_ = other.bars_;
            bitField0_ = (bitField0_ & ~0x00000004);
            barsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getBarsFieldBuilder() : null;
          } else {
            barsBuilder_.addAllMessages(other.bars_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.ads.googleads.test.Foo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.test.Foo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long num_ ;
    /**
     * <code>int64 num = 1;</code>
     */
    public long getNum() {
      return num_;
    }
    /**
     * <code>int64 num = 1;</code>
     */
    public Builder setNum(long value) {
      
      num_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 num = 1;</code>
     */
    public Builder clearNum() {
      
      num_ = 0L;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.test.Bar bar_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.test.Bar, com.google.ads.googleads.test.Bar.Builder, com.google.ads.googleads.test.BarOrBuilder> barBuilder_;
    /**
     * <code>.google.ads.googleads.test.Bar bar = 2;</code>
     */
    public boolean hasBar() {
      return barBuilder_ != null || bar_ != null;
    }
    /**
     * <code>.google.ads.googleads.test.Bar bar = 2;</code>
     */
    public com.google.ads.googleads.test.Bar getBar() {
      if (barBuilder_ == null) {
        return bar_ == null ? com.google.ads.googleads.test.Bar.getDefaultInstance() : bar_;
      } else {
        return barBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.ads.googleads.test.Bar bar = 2;</code>
     */
    public Builder setBar(com.google.ads.googleads.test.Bar value) {
      if (barBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        bar_ = value;
        onChanged();
      } else {
        barBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.ads.googleads.test.Bar bar = 2;</code>
     */
    public Builder setBar(
        com.google.ads.googleads.test.Bar.Builder builderForValue) {
      if (barBuilder_ == null) {
        bar_ = builderForValue.build();
        onChanged();
      } else {
        barBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.ads.googleads.test.Bar bar = 2;</code>
     */
    public Builder mergeBar(com.google.ads.googleads.test.Bar value) {
      if (barBuilder_ == null) {
        if (bar_ != null) {
          bar_ =
            com.google.ads.googleads.test.Bar.newBuilder(bar_).mergeFrom(value).buildPartial();
        } else {
          bar_ = value;
        }
        onChanged();
      } else {
        barBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.ads.googleads.test.Bar bar = 2;</code>
     */
    public Builder clearBar() {
      if (barBuilder_ == null) {
        bar_ = null;
        onChanged();
      } else {
        bar_ = null;
        barBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.ads.googleads.test.Bar bar = 2;</code>
     */
    public com.google.ads.googleads.test.Bar.Builder getBarBuilder() {
      
      onChanged();
      return getBarFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.ads.googleads.test.Bar bar = 2;</code>
     */
    public com.google.ads.googleads.test.BarOrBuilder getBarOrBuilder() {
      if (barBuilder_ != null) {
        return barBuilder_.getMessageOrBuilder();
      } else {
        return bar_ == null ?
            com.google.ads.googleads.test.Bar.getDefaultInstance() : bar_;
      }
    }
    /**
     * <code>.google.ads.googleads.test.Bar bar = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.test.Bar, com.google.ads.googleads.test.Bar.Builder, com.google.ads.googleads.test.BarOrBuilder> 
        getBarFieldBuilder() {
      if (barBuilder_ == null) {
        barBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.test.Bar, com.google.ads.googleads.test.Bar.Builder, com.google.ads.googleads.test.BarOrBuilder>(
                getBar(),
                getParentForChildren(),
                isClean());
        bar_ = null;
      }
      return barBuilder_;
    }

    private java.util.List<com.google.ads.googleads.test.Bar> bars_ =
      java.util.Collections.emptyList();
    private void ensureBarsIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        bars_ = new java.util.ArrayList<com.google.ads.googleads.test.Bar>(bars_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.test.Bar, com.google.ads.googleads.test.Bar.Builder, com.google.ads.googleads.test.BarOrBuilder> barsBuilder_;

    /**
     * <code>repeated .google.ads.googleads.test.Bar bars = 3;</code>
     */
    public java.util.List<com.google.ads.googleads.test.Bar> getBarsList() {
      if (barsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(bars_);
      } else {
        return barsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .google.ads.googleads.test.Bar bars = 3;</code>
     */
    public int getBarsCount() {
      if (barsBuilder_ == null) {
        return bars_.size();
      } else {
        return barsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .google.ads.googleads.test.Bar bars = 3;</code>
     */
    public com.google.ads.googleads.test.Bar getBars(int index) {
      if (barsBuilder_ == null) {
        return bars_.get(index);
      } else {
        return barsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .google.ads.googleads.test.Bar bars = 3;</code>
     */
    public Builder setBars(
        int index, com.google.ads.googleads.test.Bar value) {
      if (barsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBarsIsMutable();
        bars_.set(index, value);
        onChanged();
      } else {
        barsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.ads.googleads.test.Bar bars = 3;</code>
     */
    public Builder setBars(
        int index, com.google.ads.googleads.test.Bar.Builder builderForValue) {
      if (barsBuilder_ == null) {
        ensureBarsIsMutable();
        bars_.set(index, builderForValue.build());
        onChanged();
      } else {
        barsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.ads.googleads.test.Bar bars = 3;</code>
     */
    public Builder addBars(com.google.ads.googleads.test.Bar value) {
      if (barsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBarsIsMutable();
        bars_.add(value);
        onChanged();
      } else {
        barsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .google.ads.googleads.test.Bar bars = 3;</code>
     */
    public Builder addBars(
        int index, com.google.ads.googleads.test.Bar value) {
      if (barsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBarsIsMutable();
        bars_.add(index, value);
        onChanged();
      } else {
        barsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.ads.googleads.test.Bar bars = 3;</code>
     */
    public Builder addBars(
        com.google.ads.googleads.test.Bar.Builder builderForValue) {
      if (barsBuilder_ == null) {
        ensureBarsIsMutable();
        bars_.add(builderForValue.build());
        onChanged();
      } else {
        barsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.ads.googleads.test.Bar bars = 3;</code>
     */
    public Builder addBars(
        int index, com.google.ads.googleads.test.Bar.Builder builderForValue) {
      if (barsBuilder_ == null) {
        ensureBarsIsMutable();
        bars_.add(index, builderForValue.build());
        onChanged();
      } else {
        barsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.ads.googleads.test.Bar bars = 3;</code>
     */
    public Builder addAllBars(
        java.lang.Iterable<? extends com.google.ads.googleads.test.Bar> values) {
      if (barsBuilder_ == null) {
        ensureBarsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, bars_);
        onChanged();
      } else {
        barsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .google.ads.googleads.test.Bar bars = 3;</code>
     */
    public Builder clearBars() {
      if (barsBuilder_ == null) {
        bars_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        barsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .google.ads.googleads.test.Bar bars = 3;</code>
     */
    public Builder removeBars(int index) {
      if (barsBuilder_ == null) {
        ensureBarsIsMutable();
        bars_.remove(index);
        onChanged();
      } else {
        barsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .google.ads.googleads.test.Bar bars = 3;</code>
     */
    public com.google.ads.googleads.test.Bar.Builder getBarsBuilder(
        int index) {
      return getBarsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .google.ads.googleads.test.Bar bars = 3;</code>
     */
    public com.google.ads.googleads.test.BarOrBuilder getBarsOrBuilder(
        int index) {
      if (barsBuilder_ == null) {
        return bars_.get(index);  } else {
        return barsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .google.ads.googleads.test.Bar bars = 3;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.test.BarOrBuilder> 
         getBarsOrBuilderList() {
      if (barsBuilder_ != null) {
        return barsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(bars_);
      }
    }
    /**
     * <code>repeated .google.ads.googleads.test.Bar bars = 3;</code>
     */
    public com.google.ads.googleads.test.Bar.Builder addBarsBuilder() {
      return getBarsFieldBuilder().addBuilder(
          com.google.ads.googleads.test.Bar.getDefaultInstance());
    }
    /**
     * <code>repeated .google.ads.googleads.test.Bar bars = 3;</code>
     */
    public com.google.ads.googleads.test.Bar.Builder addBarsBuilder(
        int index) {
      return getBarsFieldBuilder().addBuilder(
          index, com.google.ads.googleads.test.Bar.getDefaultInstance());
    }
    /**
     * <code>repeated .google.ads.googleads.test.Bar bars = 3;</code>
     */
    public java.util.List<com.google.ads.googleads.test.Bar.Builder> 
         getBarsBuilderList() {
      return getBarsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.test.Bar, com.google.ads.googleads.test.Bar.Builder, com.google.ads.googleads.test.BarOrBuilder> 
        getBarsFieldBuilder() {
      if (barsBuilder_ == null) {
        barsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.test.Bar, com.google.ads.googleads.test.Bar.Builder, com.google.ads.googleads.test.BarOrBuilder>(
                bars_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        bars_ = null;
      }
      return barsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.test.Foo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.test.Foo)
  private static final com.google.ads.googleads.test.Foo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.test.Foo();
  }

  public static com.google.ads.googleads.test.Foo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Foo>
      PARSER = new com.google.protobuf.AbstractParser<Foo>() {
    public Foo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Foo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Foo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Foo> getParserForType() {
    return PARSER;
  }

  public com.google.ads.googleads.test.Foo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


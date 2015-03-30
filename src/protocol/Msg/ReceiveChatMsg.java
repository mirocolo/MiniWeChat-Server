// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReceiveChatMsg.proto

package protocol.Msg;

public final class ReceiveChatMsg {
  private ReceiveChatMsg() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface SendChatReqOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .protocol.ChatItem chatData = 1;
    /**
     * <code>required .protocol.ChatItem chatData = 1;</code>
     */
    boolean hasChatData();
    /**
     * <code>required .protocol.ChatItem chatData = 1;</code>
     */
    protocol.Data.ChatData.ChatItem getChatData();
    /**
     * <code>required .protocol.ChatItem chatData = 1;</code>
     */
    protocol.Data.ChatData.ChatItemOrBuilder getChatDataOrBuilder();
  }
  /**
   * Protobuf type {@code protocol.SendChatReq}
   */
  public static final class SendChatReq extends
      com.google.protobuf.GeneratedMessage
      implements SendChatReqOrBuilder {
    // Use SendChatReq.newBuilder() to construct.
    private SendChatReq(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private SendChatReq(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final SendChatReq defaultInstance;
    public static SendChatReq getDefaultInstance() {
      return defaultInstance;
    }

    public SendChatReq getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private SendChatReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              protocol.Data.ChatData.ChatItem.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = chatData_.toBuilder();
              }
              chatData_ = input.readMessage(protocol.Data.ChatData.ChatItem.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(chatData_);
                chatData_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protocol.Msg.ReceiveChatMsg.internal_static_protocol_SendChatReq_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protocol.Msg.ReceiveChatMsg.internal_static_protocol_SendChatReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protocol.Msg.ReceiveChatMsg.SendChatReq.class, protocol.Msg.ReceiveChatMsg.SendChatReq.Builder.class);
    }

    public static com.google.protobuf.Parser<SendChatReq> PARSER =
        new com.google.protobuf.AbstractParser<SendChatReq>() {
      public SendChatReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SendChatReq(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<SendChatReq> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .protocol.ChatItem chatData = 1;
    public static final int CHATDATA_FIELD_NUMBER = 1;
    private protocol.Data.ChatData.ChatItem chatData_;
    /**
     * <code>required .protocol.ChatItem chatData = 1;</code>
     */
    public boolean hasChatData() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .protocol.ChatItem chatData = 1;</code>
     */
    public protocol.Data.ChatData.ChatItem getChatData() {
      return chatData_;
    }
    /**
     * <code>required .protocol.ChatItem chatData = 1;</code>
     */
    public protocol.Data.ChatData.ChatItemOrBuilder getChatDataOrBuilder() {
      return chatData_;
    }

    private void initFields() {
      chatData_ = protocol.Data.ChatData.ChatItem.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasChatData()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getChatData().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, chatData_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, chatData_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static protocol.Msg.ReceiveChatMsg.SendChatReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protocol.Msg.ReceiveChatMsg.SendChatReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protocol.Msg.ReceiveChatMsg.SendChatReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protocol.Msg.ReceiveChatMsg.SendChatReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protocol.Msg.ReceiveChatMsg.SendChatReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static protocol.Msg.ReceiveChatMsg.SendChatReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static protocol.Msg.ReceiveChatMsg.SendChatReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static protocol.Msg.ReceiveChatMsg.SendChatReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static protocol.Msg.ReceiveChatMsg.SendChatReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static protocol.Msg.ReceiveChatMsg.SendChatReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(protocol.Msg.ReceiveChatMsg.SendChatReq prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code protocol.SendChatReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements protocol.Msg.ReceiveChatMsg.SendChatReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return protocol.Msg.ReceiveChatMsg.internal_static_protocol_SendChatReq_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return protocol.Msg.ReceiveChatMsg.internal_static_protocol_SendChatReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                protocol.Msg.ReceiveChatMsg.SendChatReq.class, protocol.Msg.ReceiveChatMsg.SendChatReq.Builder.class);
      }

      // Construct using protocol.Msg.ReceiveChatMsg.SendChatReq.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getChatDataFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (chatDataBuilder_ == null) {
          chatData_ = protocol.Data.ChatData.ChatItem.getDefaultInstance();
        } else {
          chatDataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return protocol.Msg.ReceiveChatMsg.internal_static_protocol_SendChatReq_descriptor;
      }

      public protocol.Msg.ReceiveChatMsg.SendChatReq getDefaultInstanceForType() {
        return protocol.Msg.ReceiveChatMsg.SendChatReq.getDefaultInstance();
      }

      public protocol.Msg.ReceiveChatMsg.SendChatReq build() {
        protocol.Msg.ReceiveChatMsg.SendChatReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public protocol.Msg.ReceiveChatMsg.SendChatReq buildPartial() {
        protocol.Msg.ReceiveChatMsg.SendChatReq result = new protocol.Msg.ReceiveChatMsg.SendChatReq(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (chatDataBuilder_ == null) {
          result.chatData_ = chatData_;
        } else {
          result.chatData_ = chatDataBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof protocol.Msg.ReceiveChatMsg.SendChatReq) {
          return mergeFrom((protocol.Msg.ReceiveChatMsg.SendChatReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(protocol.Msg.ReceiveChatMsg.SendChatReq other) {
        if (other == protocol.Msg.ReceiveChatMsg.SendChatReq.getDefaultInstance()) return this;
        if (other.hasChatData()) {
          mergeChatData(other.getChatData());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasChatData()) {
          
          return false;
        }
        if (!getChatData().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        protocol.Msg.ReceiveChatMsg.SendChatReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (protocol.Msg.ReceiveChatMsg.SendChatReq) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .protocol.ChatItem chatData = 1;
      private protocol.Data.ChatData.ChatItem chatData_ = protocol.Data.ChatData.ChatItem.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          protocol.Data.ChatData.ChatItem, protocol.Data.ChatData.ChatItem.Builder, protocol.Data.ChatData.ChatItemOrBuilder> chatDataBuilder_;
      /**
       * <code>required .protocol.ChatItem chatData = 1;</code>
       */
      public boolean hasChatData() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .protocol.ChatItem chatData = 1;</code>
       */
      public protocol.Data.ChatData.ChatItem getChatData() {
        if (chatDataBuilder_ == null) {
          return chatData_;
        } else {
          return chatDataBuilder_.getMessage();
        }
      }
      /**
       * <code>required .protocol.ChatItem chatData = 1;</code>
       */
      public Builder setChatData(protocol.Data.ChatData.ChatItem value) {
        if (chatDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          chatData_ = value;
          onChanged();
        } else {
          chatDataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .protocol.ChatItem chatData = 1;</code>
       */
      public Builder setChatData(
          protocol.Data.ChatData.ChatItem.Builder builderForValue) {
        if (chatDataBuilder_ == null) {
          chatData_ = builderForValue.build();
          onChanged();
        } else {
          chatDataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .protocol.ChatItem chatData = 1;</code>
       */
      public Builder mergeChatData(protocol.Data.ChatData.ChatItem value) {
        if (chatDataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              chatData_ != protocol.Data.ChatData.ChatItem.getDefaultInstance()) {
            chatData_ =
              protocol.Data.ChatData.ChatItem.newBuilder(chatData_).mergeFrom(value).buildPartial();
          } else {
            chatData_ = value;
          }
          onChanged();
        } else {
          chatDataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .protocol.ChatItem chatData = 1;</code>
       */
      public Builder clearChatData() {
        if (chatDataBuilder_ == null) {
          chatData_ = protocol.Data.ChatData.ChatItem.getDefaultInstance();
          onChanged();
        } else {
          chatDataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .protocol.ChatItem chatData = 1;</code>
       */
      public protocol.Data.ChatData.ChatItem.Builder getChatDataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getChatDataFieldBuilder().getBuilder();
      }
      /**
       * <code>required .protocol.ChatItem chatData = 1;</code>
       */
      public protocol.Data.ChatData.ChatItemOrBuilder getChatDataOrBuilder() {
        if (chatDataBuilder_ != null) {
          return chatDataBuilder_.getMessageOrBuilder();
        } else {
          return chatData_;
        }
      }
      /**
       * <code>required .protocol.ChatItem chatData = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          protocol.Data.ChatData.ChatItem, protocol.Data.ChatData.ChatItem.Builder, protocol.Data.ChatData.ChatItemOrBuilder> 
          getChatDataFieldBuilder() {
        if (chatDataBuilder_ == null) {
          chatDataBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              protocol.Data.ChatData.ChatItem, protocol.Data.ChatData.ChatItem.Builder, protocol.Data.ChatData.ChatItemOrBuilder>(
                  chatData_,
                  getParentForChildren(),
                  isClean());
          chatData_ = null;
        }
        return chatDataBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:protocol.SendChatReq)
    }

    static {
      defaultInstance = new SendChatReq(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:protocol.SendChatReq)
  }

  public interface SendChatRspOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .protocol.SendChatRsp.ResultCode resultCode = 1;
    /**
     * <code>required .protocol.SendChatRsp.ResultCode resultCode = 1;</code>
     */
    boolean hasResultCode();
    /**
     * <code>required .protocol.SendChatRsp.ResultCode resultCode = 1;</code>
     */
    protocol.Msg.ReceiveChatMsg.SendChatRsp.ResultCode getResultCode();
  }
  /**
   * Protobuf type {@code protocol.SendChatRsp}
   */
  public static final class SendChatRsp extends
      com.google.protobuf.GeneratedMessage
      implements SendChatRspOrBuilder {
    // Use SendChatRsp.newBuilder() to construct.
    private SendChatRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private SendChatRsp(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final SendChatRsp defaultInstance;
    public static SendChatRsp getDefaultInstance() {
      return defaultInstance;
    }

    public SendChatRsp getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private SendChatRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              int rawValue = input.readEnum();
              protocol.Msg.ReceiveChatMsg.SendChatRsp.ResultCode value = protocol.Msg.ReceiveChatMsg.SendChatRsp.ResultCode.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                resultCode_ = value;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protocol.Msg.ReceiveChatMsg.internal_static_protocol_SendChatRsp_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protocol.Msg.ReceiveChatMsg.internal_static_protocol_SendChatRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protocol.Msg.ReceiveChatMsg.SendChatRsp.class, protocol.Msg.ReceiveChatMsg.SendChatRsp.Builder.class);
    }

    public static com.google.protobuf.Parser<SendChatRsp> PARSER =
        new com.google.protobuf.AbstractParser<SendChatRsp>() {
      public SendChatRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SendChatRsp(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<SendChatRsp> getParserForType() {
      return PARSER;
    }

    /**
     * Protobuf enum {@code protocol.SendChatRsp.ResultCode}
     */
    public enum ResultCode
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>SUCCESS = 0;</code>
       */
      SUCCESS(0, 0),
      /**
       * <code>FAIL = 1;</code>
       */
      FAIL(1, 1),
      ;

      /**
       * <code>SUCCESS = 0;</code>
       */
      public static final int SUCCESS_VALUE = 0;
      /**
       * <code>FAIL = 1;</code>
       */
      public static final int FAIL_VALUE = 1;


      public final int getNumber() { return value; }

      public static ResultCode valueOf(int value) {
        switch (value) {
          case 0: return SUCCESS;
          case 1: return FAIL;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<ResultCode>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<ResultCode>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<ResultCode>() {
              public ResultCode findValueByNumber(int number) {
                return ResultCode.valueOf(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return protocol.Msg.ReceiveChatMsg.SendChatRsp.getDescriptor().getEnumTypes().get(0);
      }

      private static final ResultCode[] VALUES = values();

      public static ResultCode valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private ResultCode(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:protocol.SendChatRsp.ResultCode)
    }

    private int bitField0_;
    // required .protocol.SendChatRsp.ResultCode resultCode = 1;
    public static final int RESULTCODE_FIELD_NUMBER = 1;
    private protocol.Msg.ReceiveChatMsg.SendChatRsp.ResultCode resultCode_;
    /**
     * <code>required .protocol.SendChatRsp.ResultCode resultCode = 1;</code>
     */
    public boolean hasResultCode() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .protocol.SendChatRsp.ResultCode resultCode = 1;</code>
     */
    public protocol.Msg.ReceiveChatMsg.SendChatRsp.ResultCode getResultCode() {
      return resultCode_;
    }

    private void initFields() {
      resultCode_ = protocol.Msg.ReceiveChatMsg.SendChatRsp.ResultCode.SUCCESS;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasResultCode()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeEnum(1, resultCode_.getNumber());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, resultCode_.getNumber());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static protocol.Msg.ReceiveChatMsg.SendChatRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protocol.Msg.ReceiveChatMsg.SendChatRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protocol.Msg.ReceiveChatMsg.SendChatRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protocol.Msg.ReceiveChatMsg.SendChatRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protocol.Msg.ReceiveChatMsg.SendChatRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static protocol.Msg.ReceiveChatMsg.SendChatRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static protocol.Msg.ReceiveChatMsg.SendChatRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static protocol.Msg.ReceiveChatMsg.SendChatRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static protocol.Msg.ReceiveChatMsg.SendChatRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static protocol.Msg.ReceiveChatMsg.SendChatRsp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(protocol.Msg.ReceiveChatMsg.SendChatRsp prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code protocol.SendChatRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements protocol.Msg.ReceiveChatMsg.SendChatRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return protocol.Msg.ReceiveChatMsg.internal_static_protocol_SendChatRsp_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return protocol.Msg.ReceiveChatMsg.internal_static_protocol_SendChatRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                protocol.Msg.ReceiveChatMsg.SendChatRsp.class, protocol.Msg.ReceiveChatMsg.SendChatRsp.Builder.class);
      }

      // Construct using protocol.Msg.ReceiveChatMsg.SendChatRsp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        resultCode_ = protocol.Msg.ReceiveChatMsg.SendChatRsp.ResultCode.SUCCESS;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return protocol.Msg.ReceiveChatMsg.internal_static_protocol_SendChatRsp_descriptor;
      }

      public protocol.Msg.ReceiveChatMsg.SendChatRsp getDefaultInstanceForType() {
        return protocol.Msg.ReceiveChatMsg.SendChatRsp.getDefaultInstance();
      }

      public protocol.Msg.ReceiveChatMsg.SendChatRsp build() {
        protocol.Msg.ReceiveChatMsg.SendChatRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public protocol.Msg.ReceiveChatMsg.SendChatRsp buildPartial() {
        protocol.Msg.ReceiveChatMsg.SendChatRsp result = new protocol.Msg.ReceiveChatMsg.SendChatRsp(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.resultCode_ = resultCode_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof protocol.Msg.ReceiveChatMsg.SendChatRsp) {
          return mergeFrom((protocol.Msg.ReceiveChatMsg.SendChatRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(protocol.Msg.ReceiveChatMsg.SendChatRsp other) {
        if (other == protocol.Msg.ReceiveChatMsg.SendChatRsp.getDefaultInstance()) return this;
        if (other.hasResultCode()) {
          setResultCode(other.getResultCode());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasResultCode()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        protocol.Msg.ReceiveChatMsg.SendChatRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (protocol.Msg.ReceiveChatMsg.SendChatRsp) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .protocol.SendChatRsp.ResultCode resultCode = 1;
      private protocol.Msg.ReceiveChatMsg.SendChatRsp.ResultCode resultCode_ = protocol.Msg.ReceiveChatMsg.SendChatRsp.ResultCode.SUCCESS;
      /**
       * <code>required .protocol.SendChatRsp.ResultCode resultCode = 1;</code>
       */
      public boolean hasResultCode() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .protocol.SendChatRsp.ResultCode resultCode = 1;</code>
       */
      public protocol.Msg.ReceiveChatMsg.SendChatRsp.ResultCode getResultCode() {
        return resultCode_;
      }
      /**
       * <code>required .protocol.SendChatRsp.ResultCode resultCode = 1;</code>
       */
      public Builder setResultCode(protocol.Msg.ReceiveChatMsg.SendChatRsp.ResultCode value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        resultCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required .protocol.SendChatRsp.ResultCode resultCode = 1;</code>
       */
      public Builder clearResultCode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        resultCode_ = protocol.Msg.ReceiveChatMsg.SendChatRsp.ResultCode.SUCCESS;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:protocol.SendChatRsp)
    }

    static {
      defaultInstance = new SendChatRsp(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:protocol.SendChatRsp)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_protocol_SendChatReq_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_protocol_SendChatReq_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_protocol_SendChatRsp_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_protocol_SendChatRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024ReceiveChatMsg.proto\022\010protocol\032\016ChatDa" +
      "ta.proto\"3\n\013SendChatReq\022$\n\010chatData\030\001 \002(" +
      "\0132\022.protocol.ChatItem\"h\n\013SendChatRsp\0224\n\n" +
      "resultCode\030\001 \002(\0162 .protocol.SendChatRsp." +
      "ResultCode\"#\n\nResultCode\022\013\n\007SUCCESS\020\000\022\010\n" +
      "\004FAIL\020\001B\016\n\014protocol.Msg"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_protocol_SendChatReq_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_protocol_SendChatReq_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_protocol_SendChatReq_descriptor,
              new java.lang.String[] { "ChatData", });
          internal_static_protocol_SendChatRsp_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_protocol_SendChatRsp_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_protocol_SendChatRsp_descriptor,
              new java.lang.String[] { "ResultCode", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          protocol.Data.ChatData.getDescriptor(),
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
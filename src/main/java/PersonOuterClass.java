// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: person.proto

public final class PersonOuterClass {
  private PersonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code PhoneType}
   */
  public enum PhoneType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>HOME = 0;</code>
     */
    HOME(0),
    /**
     * <code>MOBILE = 1;</code>
     */
    MOBILE(1),
    /**
     * <code>OFFICE = 2;</code>
     */
    OFFICE(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>HOME = 0;</code>
     */
    public static final int HOME_VALUE = 0;
    /**
     * <code>MOBILE = 1;</code>
     */
    public static final int MOBILE_VALUE = 1;
    /**
     * <code>OFFICE = 2;</code>
     */
    public static final int OFFICE_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static PhoneType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static PhoneType forNumber(int value) {
      switch (value) {
        case 0: return HOME;
        case 1: return MOBILE;
        case 2: return OFFICE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PhoneType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PhoneType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PhoneType>() {
            public PhoneType findValueByNumber(int number) {
              return PhoneType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return PersonOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final PhoneType[] VALUES = values();

    public static PhoneType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private PhoneType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:PhoneType)
  }

  public interface PersonOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Person)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>int32 id = 2;</code>
     * @return The id.
     */
    int getId();

    /**
     * <code>string phone = 3;</code>
     * @return The phone.
     */
    java.lang.String getPhone();
    /**
     * <code>string phone = 3;</code>
     * @return The bytes for phone.
     */
    com.google.protobuf.ByteString
        getPhoneBytes();

    /**
     * <code>.PhoneType phoneType = 4;</code>
     * @return The enum numeric value on the wire for phoneType.
     */
    int getPhoneTypeValue();
    /**
     * <code>.PhoneType phoneType = 4;</code>
     * @return The phoneType.
     */
    PersonOuterClass.PhoneType getPhoneType();
  }
  /**
   * Protobuf type {@code Person}
   */
  public static final class Person extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Person)
      PersonOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Person.newBuilder() to construct.
    private Person(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Person() {
      name_ = "";
      phone_ = "";
      phoneType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Person();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Person(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
            case 16: {

              id_ = input.readInt32();
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              phone_ = s;
              break;
            }
            case 32: {
              int rawValue = input.readEnum();

              phoneType_ = rawValue;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return PersonOuterClass.internal_static_Person_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return PersonOuterClass.internal_static_Person_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              PersonOuterClass.Person.class, PersonOuterClass.Person.Builder.class);
    }

    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ID_FIELD_NUMBER = 2;
    private int id_;
    /**
     * <code>int32 id = 2;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }

    public static final int PHONE_FIELD_NUMBER = 3;
    private volatile java.lang.Object phone_;
    /**
     * <code>string phone = 3;</code>
     * @return The phone.
     */
    @java.lang.Override
    public java.lang.String getPhone() {
      java.lang.Object ref = phone_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        phone_ = s;
        return s;
      }
    }
    /**
     * <code>string phone = 3;</code>
     * @return The bytes for phone.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPhoneBytes() {
      java.lang.Object ref = phone_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        phone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PHONETYPE_FIELD_NUMBER = 4;
    private int phoneType_;
    /**
     * <code>.PhoneType phoneType = 4;</code>
     * @return The enum numeric value on the wire for phoneType.
     */
    @java.lang.Override public int getPhoneTypeValue() {
      return phoneType_;
    }
    /**
     * <code>.PhoneType phoneType = 4;</code>
     * @return The phoneType.
     */
    @java.lang.Override public PersonOuterClass.PhoneType getPhoneType() {
      @SuppressWarnings("deprecation")
      PersonOuterClass.PhoneType result = PersonOuterClass.PhoneType.valueOf(phoneType_);
      return result == null ? PersonOuterClass.PhoneType.UNRECOGNIZED : result;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (id_ != 0) {
        output.writeInt32(2, id_);
      }
      if (!getPhoneBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, phone_);
      }
      if (phoneType_ != PersonOuterClass.PhoneType.HOME.getNumber()) {
        output.writeEnum(4, phoneType_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, id_);
      }
      if (!getPhoneBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, phone_);
      }
      if (phoneType_ != PersonOuterClass.PhoneType.HOME.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, phoneType_);
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
      if (!(obj instanceof PersonOuterClass.Person)) {
        return super.equals(obj);
      }
      PersonOuterClass.Person other = (PersonOuterClass.Person) obj;

      if (!getName()
          .equals(other.getName())) return false;
      if (getId()
          != other.getId()) return false;
      if (!getPhone()
          .equals(other.getPhone())) return false;
      if (phoneType_ != other.phoneType_) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (37 * hash) + PHONE_FIELD_NUMBER;
      hash = (53 * hash) + getPhone().hashCode();
      hash = (37 * hash) + PHONETYPE_FIELD_NUMBER;
      hash = (53 * hash) + phoneType_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static PersonOuterClass.Person parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PersonOuterClass.Person parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PersonOuterClass.Person parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PersonOuterClass.Person parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PersonOuterClass.Person parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PersonOuterClass.Person parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PersonOuterClass.Person parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static PersonOuterClass.Person parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static PersonOuterClass.Person parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static PersonOuterClass.Person parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static PersonOuterClass.Person parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static PersonOuterClass.Person parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(PersonOuterClass.Person prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * Protobuf type {@code Person}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Person)
        PersonOuterClass.PersonOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return PersonOuterClass.internal_static_Person_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return PersonOuterClass.internal_static_Person_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                PersonOuterClass.Person.class, PersonOuterClass.Person.Builder.class);
      }

      // Construct using PersonOuterClass.Person.newBuilder()
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
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        name_ = "";

        id_ = 0;

        phone_ = "";

        phoneType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return PersonOuterClass.internal_static_Person_descriptor;
      }

      @java.lang.Override
      public PersonOuterClass.Person getDefaultInstanceForType() {
        return PersonOuterClass.Person.getDefaultInstance();
      }

      @java.lang.Override
      public PersonOuterClass.Person build() {
        PersonOuterClass.Person result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public PersonOuterClass.Person buildPartial() {
        PersonOuterClass.Person result = new PersonOuterClass.Person(this);
        result.name_ = name_;
        result.id_ = id_;
        result.phone_ = phone_;
        result.phoneType_ = phoneType_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof PersonOuterClass.Person) {
          return mergeFrom((PersonOuterClass.Person)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(PersonOuterClass.Person other) {
        if (other == PersonOuterClass.Person.getDefaultInstance()) return this;
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (other.getId() != 0) {
          setId(other.getId());
        }
        if (!other.getPhone().isEmpty()) {
          phone_ = other.phone_;
          onChanged();
        }
        if (other.phoneType_ != 0) {
          setPhoneTypeValue(other.getPhoneTypeValue());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        PersonOuterClass.Person parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (PersonOuterClass.Person) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <code>string name = 1;</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        name_ = value;
        onChanged();
        return this;
      }

      private int id_ ;
      /**
       * <code>int32 id = 2;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>int32 id = 2;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object phone_ = "";
      /**
       * <code>string phone = 3;</code>
       * @return The phone.
       */
      public java.lang.String getPhone() {
        java.lang.Object ref = phone_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          phone_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string phone = 3;</code>
       * @return The bytes for phone.
       */
      public com.google.protobuf.ByteString
          getPhoneBytes() {
        java.lang.Object ref = phone_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          phone_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string phone = 3;</code>
       * @param value The phone to set.
       * @return This builder for chaining.
       */
      public Builder setPhone(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        phone_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string phone = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearPhone() {
        
        phone_ = getDefaultInstance().getPhone();
        onChanged();
        return this;
      }
      /**
       * <code>string phone = 3;</code>
       * @param value The bytes for phone to set.
       * @return This builder for chaining.
       */
      public Builder setPhoneBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        phone_ = value;
        onChanged();
        return this;
      }

      private int phoneType_ = 0;
      /**
       * <code>.PhoneType phoneType = 4;</code>
       * @return The enum numeric value on the wire for phoneType.
       */
      @java.lang.Override public int getPhoneTypeValue() {
        return phoneType_;
      }
      /**
       * <code>.PhoneType phoneType = 4;</code>
       * @param value The enum numeric value on the wire for phoneType to set.
       * @return This builder for chaining.
       */
      public Builder setPhoneTypeValue(int value) {
        
        phoneType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.PhoneType phoneType = 4;</code>
       * @return The phoneType.
       */
      @java.lang.Override
      public PersonOuterClass.PhoneType getPhoneType() {
        @SuppressWarnings("deprecation")
        PersonOuterClass.PhoneType result = PersonOuterClass.PhoneType.valueOf(phoneType_);
        return result == null ? PersonOuterClass.PhoneType.UNRECOGNIZED : result;
      }
      /**
       * <code>.PhoneType phoneType = 4;</code>
       * @param value The phoneType to set.
       * @return This builder for chaining.
       */
      public Builder setPhoneType(PersonOuterClass.PhoneType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        phoneType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.PhoneType phoneType = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearPhoneType() {
        
        phoneType_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Person)
    }

    // @@protoc_insertion_point(class_scope:Person)
    private static final PersonOuterClass.Person DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new PersonOuterClass.Person();
    }

    public static PersonOuterClass.Person getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Person>
        PARSER = new com.google.protobuf.AbstractParser<Person>() {
      @java.lang.Override
      public Person parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Person(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Person> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Person> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public PersonOuterClass.Person getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Person_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Person_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014person.proto\"P\n\006Person\022\014\n\004name\030\001 \001(\t\022\n" +
      "\n\002id\030\002 \001(\005\022\r\n\005phone\030\003 \001(\t\022\035\n\tphoneType\030\004" +
      " \001(\0162\n.PhoneType*-\n\tPhoneType\022\010\n\004HOME\020\000\022" +
      "\n\n\006MOBILE\020\001\022\n\n\006OFFICE\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Person_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Person_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Person_descriptor,
        new java.lang.String[] { "Name", "Id", "Phone", "PhoneType", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

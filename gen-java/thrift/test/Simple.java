/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thrift.test;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)", date = "2016-10-11")
public class Simple implements org.apache.thrift.TBase<Simple, Simple._Fields>, java.io.Serializable, Cloneable, Comparable<Simple> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Simple");

  private static final org.apache.thrift.protocol.TField IM_DEFAULT_FIELD_DESC = new org.apache.thrift.protocol.TField("im_default", org.apache.thrift.protocol.TType.I16, (short)1);
  private static final org.apache.thrift.protocol.TField IM_REQUIRED_FIELD_DESC = new org.apache.thrift.protocol.TField("im_required", org.apache.thrift.protocol.TType.I16, (short)2);
  private static final org.apache.thrift.protocol.TField IM_OPTIONAL_FIELD_DESC = new org.apache.thrift.protocol.TField("im_optional", org.apache.thrift.protocol.TType.I16, (short)3);

  private static final SchemeFactory STANDARD_SCHEME_FACTORY = new SimpleStandardSchemeFactory();
  private static final SchemeFactory TUPLE_SCHEME_FACTORY = new SimpleTupleSchemeFactory();

  public short im_default; // required
  public short im_required; // required
  public short im_optional; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    IM_DEFAULT((short)1, "im_default"),
    IM_REQUIRED((short)2, "im_required"),
    IM_OPTIONAL((short)3, "im_optional");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // IM_DEFAULT
          return IM_DEFAULT;
        case 2: // IM_REQUIRED
          return IM_REQUIRED;
        case 3: // IM_OPTIONAL
          return IM_OPTIONAL;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __IM_DEFAULT_ISSET_ID = 0;
  private static final int __IM_REQUIRED_ISSET_ID = 1;
  private static final int __IM_OPTIONAL_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.IM_OPTIONAL};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.IM_DEFAULT, new org.apache.thrift.meta_data.FieldMetaData("im_default", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.IM_REQUIRED, new org.apache.thrift.meta_data.FieldMetaData("im_required", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.IM_OPTIONAL, new org.apache.thrift.meta_data.FieldMetaData("im_optional", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Simple.class, metaDataMap);
  }

  public Simple() {
  }

  public Simple(
    short im_default,
    short im_required)
  {
    this();
    this.im_default = im_default;
    setIm_defaultIsSet(true);
    this.im_required = im_required;
    setIm_requiredIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Simple(Simple other) {
    __isset_bitfield = other.__isset_bitfield;
    this.im_default = other.im_default;
    this.im_required = other.im_required;
    this.im_optional = other.im_optional;
  }

  public Simple deepCopy() {
    return new Simple(this);
  }

  @Override
  public void clear() {
    setIm_defaultIsSet(false);
    this.im_default = 0;
    setIm_requiredIsSet(false);
    this.im_required = 0;
    setIm_optionalIsSet(false);
    this.im_optional = 0;
  }

  public short getIm_default() {
    return this.im_default;
  }

  public Simple setIm_default(short im_default) {
    this.im_default = im_default;
    setIm_defaultIsSet(true);
    return this;
  }

  public void unsetIm_default() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __IM_DEFAULT_ISSET_ID);
  }

  /** Returns true if field im_default is set (has been assigned a value) and false otherwise */
  public boolean isSetIm_default() {
    return EncodingUtils.testBit(__isset_bitfield, __IM_DEFAULT_ISSET_ID);
  }

  public void setIm_defaultIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __IM_DEFAULT_ISSET_ID, value);
  }

  public short getIm_required() {
    return this.im_required;
  }

  public Simple setIm_required(short im_required) {
    this.im_required = im_required;
    setIm_requiredIsSet(true);
    return this;
  }

  public void unsetIm_required() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __IM_REQUIRED_ISSET_ID);
  }

  /** Returns true if field im_required is set (has been assigned a value) and false otherwise */
  public boolean isSetIm_required() {
    return EncodingUtils.testBit(__isset_bitfield, __IM_REQUIRED_ISSET_ID);
  }

  public void setIm_requiredIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __IM_REQUIRED_ISSET_ID, value);
  }

  public short getIm_optional() {
    return this.im_optional;
  }

  public Simple setIm_optional(short im_optional) {
    this.im_optional = im_optional;
    setIm_optionalIsSet(true);
    return this;
  }

  public void unsetIm_optional() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __IM_OPTIONAL_ISSET_ID);
  }

  /** Returns true if field im_optional is set (has been assigned a value) and false otherwise */
  public boolean isSetIm_optional() {
    return EncodingUtils.testBit(__isset_bitfield, __IM_OPTIONAL_ISSET_ID);
  }

  public void setIm_optionalIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __IM_OPTIONAL_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case IM_DEFAULT:
      if (value == null) {
        unsetIm_default();
      } else {
        setIm_default((Short)value);
      }
      break;

    case IM_REQUIRED:
      if (value == null) {
        unsetIm_required();
      } else {
        setIm_required((Short)value);
      }
      break;

    case IM_OPTIONAL:
      if (value == null) {
        unsetIm_optional();
      } else {
        setIm_optional((Short)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case IM_DEFAULT:
      return getIm_default();

    case IM_REQUIRED:
      return getIm_required();

    case IM_OPTIONAL:
      return getIm_optional();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case IM_DEFAULT:
      return isSetIm_default();
    case IM_REQUIRED:
      return isSetIm_required();
    case IM_OPTIONAL:
      return isSetIm_optional();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Simple)
      return this.equals((Simple)that);
    return false;
  }

  public boolean equals(Simple that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_im_default = true;
    boolean that_present_im_default = true;
    if (this_present_im_default || that_present_im_default) {
      if (!(this_present_im_default && that_present_im_default))
        return false;
      if (this.im_default != that.im_default)
        return false;
    }

    boolean this_present_im_required = true;
    boolean that_present_im_required = true;
    if (this_present_im_required || that_present_im_required) {
      if (!(this_present_im_required && that_present_im_required))
        return false;
      if (this.im_required != that.im_required)
        return false;
    }

    boolean this_present_im_optional = true && this.isSetIm_optional();
    boolean that_present_im_optional = true && that.isSetIm_optional();
    if (this_present_im_optional || that_present_im_optional) {
      if (!(this_present_im_optional && that_present_im_optional))
        return false;
      if (this.im_optional != that.im_optional)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + im_default;

    hashCode = hashCode * 8191 + im_required;

    hashCode = hashCode * 8191 + ((isSetIm_optional()) ? 131071 : 524287);
    if (isSetIm_optional())
      hashCode = hashCode * 8191 + im_optional;

    return hashCode;
  }

  @Override
  public int compareTo(Simple other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetIm_default()).compareTo(other.isSetIm_default());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIm_default()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.im_default, other.im_default);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIm_required()).compareTo(other.isSetIm_required());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIm_required()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.im_required, other.im_required);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIm_optional()).compareTo(other.isSetIm_optional());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIm_optional()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.im_optional, other.im_optional);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Simple(");
    boolean first = true;

    sb.append("im_default:");
    sb.append(this.im_default);
    first = false;
    if (!first) sb.append(", ");
    sb.append("im_required:");
    sb.append(this.im_required);
    first = false;
    if (isSetIm_optional()) {
      if (!first) sb.append(", ");
      sb.append("im_optional:");
      sb.append(this.im_optional);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'im_required' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SimpleStandardSchemeFactory implements SchemeFactory {
    public SimpleStandardScheme getScheme() {
      return new SimpleStandardScheme();
    }
  }

  private static class SimpleStandardScheme extends StandardScheme<Simple> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Simple struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // IM_DEFAULT
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.im_default = iprot.readI16();
              struct.setIm_defaultIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // IM_REQUIRED
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.im_required = iprot.readI16();
              struct.setIm_requiredIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // IM_OPTIONAL
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.im_optional = iprot.readI16();
              struct.setIm_optionalIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetIm_required()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'im_required' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Simple struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(IM_DEFAULT_FIELD_DESC);
      oprot.writeI16(struct.im_default);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(IM_REQUIRED_FIELD_DESC);
      oprot.writeI16(struct.im_required);
      oprot.writeFieldEnd();
      if (struct.isSetIm_optional()) {
        oprot.writeFieldBegin(IM_OPTIONAL_FIELD_DESC);
        oprot.writeI16(struct.im_optional);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SimpleTupleSchemeFactory implements SchemeFactory {
    public SimpleTupleScheme getScheme() {
      return new SimpleTupleScheme();
    }
  }

  private static class SimpleTupleScheme extends TupleScheme<Simple> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Simple struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI16(struct.im_required);
      BitSet optionals = new BitSet();
      if (struct.isSetIm_default()) {
        optionals.set(0);
      }
      if (struct.isSetIm_optional()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetIm_default()) {
        oprot.writeI16(struct.im_default);
      }
      if (struct.isSetIm_optional()) {
        oprot.writeI16(struct.im_optional);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Simple struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.im_required = iprot.readI16();
      struct.setIm_requiredIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.im_default = iprot.readI16();
        struct.setIm_defaultIsSet(true);
      }
      if (incoming.get(1)) {
        struct.im_optional = iprot.readI16();
        struct.setIm_optionalIsSet(true);
      }
    }
  }

  private static <S extends IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}


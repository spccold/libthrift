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
public class BreaksRubyCompactProtocol implements org.apache.thrift.TBase<BreaksRubyCompactProtocol, BreaksRubyCompactProtocol._Fields>, java.io.Serializable, Cloneable, Comparable<BreaksRubyCompactProtocol> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BreaksRubyCompactProtocol");

  private static final org.apache.thrift.protocol.TField FIELD1_FIELD_DESC = new org.apache.thrift.protocol.TField("field1", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField FIELD2_FIELD_DESC = new org.apache.thrift.protocol.TField("field2", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField FIELD3_FIELD_DESC = new org.apache.thrift.protocol.TField("field3", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final SchemeFactory STANDARD_SCHEME_FACTORY = new BreaksRubyCompactProtocolStandardSchemeFactory();
  private static final SchemeFactory TUPLE_SCHEME_FACTORY = new BreaksRubyCompactProtocolTupleSchemeFactory();

  public String field1; // required
  public BigFieldIdStruct field2; // required
  public int field3; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FIELD1((short)1, "field1"),
    FIELD2((short)2, "field2"),
    FIELD3((short)3, "field3");

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
        case 1: // FIELD1
          return FIELD1;
        case 2: // FIELD2
          return FIELD2;
        case 3: // FIELD3
          return FIELD3;
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
  private static final int __FIELD3_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FIELD1, new org.apache.thrift.meta_data.FieldMetaData("field1", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FIELD2, new org.apache.thrift.meta_data.FieldMetaData("field2", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BigFieldIdStruct.class)));
    tmpMap.put(_Fields.FIELD3, new org.apache.thrift.meta_data.FieldMetaData("field3", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BreaksRubyCompactProtocol.class, metaDataMap);
  }

  public BreaksRubyCompactProtocol() {
  }

  public BreaksRubyCompactProtocol(
    String field1,
    BigFieldIdStruct field2,
    int field3)
  {
    this();
    this.field1 = field1;
    this.field2 = field2;
    this.field3 = field3;
    setField3IsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BreaksRubyCompactProtocol(BreaksRubyCompactProtocol other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetField1()) {
      this.field1 = other.field1;
    }
    if (other.isSetField2()) {
      this.field2 = new BigFieldIdStruct(other.field2);
    }
    this.field3 = other.field3;
  }

  public BreaksRubyCompactProtocol deepCopy() {
    return new BreaksRubyCompactProtocol(this);
  }

  @Override
  public void clear() {
    this.field1 = null;
    this.field2 = null;
    setField3IsSet(false);
    this.field3 = 0;
  }

  public String getField1() {
    return this.field1;
  }

  public BreaksRubyCompactProtocol setField1(String field1) {
    this.field1 = field1;
    return this;
  }

  public void unsetField1() {
    this.field1 = null;
  }

  /** Returns true if field field1 is set (has been assigned a value) and false otherwise */
  public boolean isSetField1() {
    return this.field1 != null;
  }

  public void setField1IsSet(boolean value) {
    if (!value) {
      this.field1 = null;
    }
  }

  public BigFieldIdStruct getField2() {
    return this.field2;
  }

  public BreaksRubyCompactProtocol setField2(BigFieldIdStruct field2) {
    this.field2 = field2;
    return this;
  }

  public void unsetField2() {
    this.field2 = null;
  }

  /** Returns true if field field2 is set (has been assigned a value) and false otherwise */
  public boolean isSetField2() {
    return this.field2 != null;
  }

  public void setField2IsSet(boolean value) {
    if (!value) {
      this.field2 = null;
    }
  }

  public int getField3() {
    return this.field3;
  }

  public BreaksRubyCompactProtocol setField3(int field3) {
    this.field3 = field3;
    setField3IsSet(true);
    return this;
  }

  public void unsetField3() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FIELD3_ISSET_ID);
  }

  /** Returns true if field field3 is set (has been assigned a value) and false otherwise */
  public boolean isSetField3() {
    return EncodingUtils.testBit(__isset_bitfield, __FIELD3_ISSET_ID);
  }

  public void setField3IsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FIELD3_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FIELD1:
      if (value == null) {
        unsetField1();
      } else {
        setField1((String)value);
      }
      break;

    case FIELD2:
      if (value == null) {
        unsetField2();
      } else {
        setField2((BigFieldIdStruct)value);
      }
      break;

    case FIELD3:
      if (value == null) {
        unsetField3();
      } else {
        setField3((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FIELD1:
      return getField1();

    case FIELD2:
      return getField2();

    case FIELD3:
      return getField3();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FIELD1:
      return isSetField1();
    case FIELD2:
      return isSetField2();
    case FIELD3:
      return isSetField3();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BreaksRubyCompactProtocol)
      return this.equals((BreaksRubyCompactProtocol)that);
    return false;
  }

  public boolean equals(BreaksRubyCompactProtocol that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_field1 = true && this.isSetField1();
    boolean that_present_field1 = true && that.isSetField1();
    if (this_present_field1 || that_present_field1) {
      if (!(this_present_field1 && that_present_field1))
        return false;
      if (!this.field1.equals(that.field1))
        return false;
    }

    boolean this_present_field2 = true && this.isSetField2();
    boolean that_present_field2 = true && that.isSetField2();
    if (this_present_field2 || that_present_field2) {
      if (!(this_present_field2 && that_present_field2))
        return false;
      if (!this.field2.equals(that.field2))
        return false;
    }

    boolean this_present_field3 = true;
    boolean that_present_field3 = true;
    if (this_present_field3 || that_present_field3) {
      if (!(this_present_field3 && that_present_field3))
        return false;
      if (this.field3 != that.field3)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetField1()) ? 131071 : 524287);
    if (isSetField1())
      hashCode = hashCode * 8191 + field1.hashCode();

    hashCode = hashCode * 8191 + ((isSetField2()) ? 131071 : 524287);
    if (isSetField2())
      hashCode = hashCode * 8191 + field2.hashCode();

    hashCode = hashCode * 8191 + field3;

    return hashCode;
  }

  @Override
  public int compareTo(BreaksRubyCompactProtocol other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetField1()).compareTo(other.isSetField1());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetField1()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.field1, other.field1);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetField2()).compareTo(other.isSetField2());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetField2()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.field2, other.field2);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetField3()).compareTo(other.isSetField3());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetField3()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.field3, other.field3);
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
    StringBuilder sb = new StringBuilder("BreaksRubyCompactProtocol(");
    boolean first = true;

    sb.append("field1:");
    if (this.field1 == null) {
      sb.append("null");
    } else {
      sb.append(this.field1);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("field2:");
    if (this.field2 == null) {
      sb.append("null");
    } else {
      sb.append(this.field2);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("field3:");
    sb.append(this.field3);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (field2 != null) {
      field2.validate();
    }
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

  private static class BreaksRubyCompactProtocolStandardSchemeFactory implements SchemeFactory {
    public BreaksRubyCompactProtocolStandardScheme getScheme() {
      return new BreaksRubyCompactProtocolStandardScheme();
    }
  }

  private static class BreaksRubyCompactProtocolStandardScheme extends StandardScheme<BreaksRubyCompactProtocol> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BreaksRubyCompactProtocol struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FIELD1
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.field1 = iprot.readString();
              struct.setField1IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FIELD2
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.field2 = new BigFieldIdStruct();
              struct.field2.read(iprot);
              struct.setField2IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FIELD3
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.field3 = iprot.readI32();
              struct.setField3IsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, BreaksRubyCompactProtocol struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.field1 != null) {
        oprot.writeFieldBegin(FIELD1_FIELD_DESC);
        oprot.writeString(struct.field1);
        oprot.writeFieldEnd();
      }
      if (struct.field2 != null) {
        oprot.writeFieldBegin(FIELD2_FIELD_DESC);
        struct.field2.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(FIELD3_FIELD_DESC);
      oprot.writeI32(struct.field3);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BreaksRubyCompactProtocolTupleSchemeFactory implements SchemeFactory {
    public BreaksRubyCompactProtocolTupleScheme getScheme() {
      return new BreaksRubyCompactProtocolTupleScheme();
    }
  }

  private static class BreaksRubyCompactProtocolTupleScheme extends TupleScheme<BreaksRubyCompactProtocol> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BreaksRubyCompactProtocol struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetField1()) {
        optionals.set(0);
      }
      if (struct.isSetField2()) {
        optionals.set(1);
      }
      if (struct.isSetField3()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetField1()) {
        oprot.writeString(struct.field1);
      }
      if (struct.isSetField2()) {
        struct.field2.write(oprot);
      }
      if (struct.isSetField3()) {
        oprot.writeI32(struct.field3);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BreaksRubyCompactProtocol struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.field1 = iprot.readString();
        struct.setField1IsSet(true);
      }
      if (incoming.get(1)) {
        struct.field2 = new BigFieldIdStruct();
        struct.field2.read(iprot);
        struct.setField2IsSet(true);
      }
      if (incoming.get(2)) {
        struct.field3 = iprot.readI32();
        struct.setField3IsSet(true);
      }
    }
  }

  private static <S extends IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}


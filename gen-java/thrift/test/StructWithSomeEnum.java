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
public class StructWithSomeEnum implements org.apache.thrift.TBase<StructWithSomeEnum, StructWithSomeEnum._Fields>, java.io.Serializable, Cloneable, Comparable<StructWithSomeEnum> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("StructWithSomeEnum");

  private static final org.apache.thrift.protocol.TField BLAH_FIELD_DESC = new org.apache.thrift.protocol.TField("blah", org.apache.thrift.protocol.TType.I32, (short)1);

  private static final SchemeFactory STANDARD_SCHEME_FACTORY = new StructWithSomeEnumStandardSchemeFactory();
  private static final SchemeFactory TUPLE_SCHEME_FACTORY = new StructWithSomeEnumTupleSchemeFactory();

  /**
   * 
   * @see SomeEnum
   */
  public SomeEnum blah; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see SomeEnum
     */
    BLAH((short)1, "blah");

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
        case 1: // BLAH
          return BLAH;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BLAH, new org.apache.thrift.meta_data.FieldMetaData("blah", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, SomeEnum.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(StructWithSomeEnum.class, metaDataMap);
  }

  public StructWithSomeEnum() {
  }

  public StructWithSomeEnum(
    SomeEnum blah)
  {
    this();
    this.blah = blah;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StructWithSomeEnum(StructWithSomeEnum other) {
    if (other.isSetBlah()) {
      this.blah = other.blah;
    }
  }

  public StructWithSomeEnum deepCopy() {
    return new StructWithSomeEnum(this);
  }

  @Override
  public void clear() {
    this.blah = null;
  }

  /**
   * 
   * @see SomeEnum
   */
  public SomeEnum getBlah() {
    return this.blah;
  }

  /**
   * 
   * @see SomeEnum
   */
  public StructWithSomeEnum setBlah(SomeEnum blah) {
    this.blah = blah;
    return this;
  }

  public void unsetBlah() {
    this.blah = null;
  }

  /** Returns true if field blah is set (has been assigned a value) and false otherwise */
  public boolean isSetBlah() {
    return this.blah != null;
  }

  public void setBlahIsSet(boolean value) {
    if (!value) {
      this.blah = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BLAH:
      if (value == null) {
        unsetBlah();
      } else {
        setBlah((SomeEnum)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BLAH:
      return getBlah();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BLAH:
      return isSetBlah();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof StructWithSomeEnum)
      return this.equals((StructWithSomeEnum)that);
    return false;
  }

  public boolean equals(StructWithSomeEnum that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_blah = true && this.isSetBlah();
    boolean that_present_blah = true && that.isSetBlah();
    if (this_present_blah || that_present_blah) {
      if (!(this_present_blah && that_present_blah))
        return false;
      if (!this.blah.equals(that.blah))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetBlah()) ? 131071 : 524287);
    if (isSetBlah())
      hashCode = hashCode * 8191 + blah.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(StructWithSomeEnum other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetBlah()).compareTo(other.isSetBlah());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBlah()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.blah, other.blah);
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
    StringBuilder sb = new StringBuilder("StructWithSomeEnum(");
    boolean first = true;

    sb.append("blah:");
    if (this.blah == null) {
      sb.append("null");
    } else {
      sb.append(this.blah);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class StructWithSomeEnumStandardSchemeFactory implements SchemeFactory {
    public StructWithSomeEnumStandardScheme getScheme() {
      return new StructWithSomeEnumStandardScheme();
    }
  }

  private static class StructWithSomeEnumStandardScheme extends StandardScheme<StructWithSomeEnum> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, StructWithSomeEnum struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BLAH
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.blah = thrift.test.SomeEnum.findByValue(iprot.readI32());
              struct.setBlahIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, StructWithSomeEnum struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.blah != null) {
        oprot.writeFieldBegin(BLAH_FIELD_DESC);
        oprot.writeI32(struct.blah.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class StructWithSomeEnumTupleSchemeFactory implements SchemeFactory {
    public StructWithSomeEnumTupleScheme getScheme() {
      return new StructWithSomeEnumTupleScheme();
    }
  }

  private static class StructWithSomeEnumTupleScheme extends TupleScheme<StructWithSomeEnum> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, StructWithSomeEnum struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBlah()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetBlah()) {
        oprot.writeI32(struct.blah.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, StructWithSomeEnum struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.blah = thrift.test.SomeEnum.findByValue(iprot.readI32());
        struct.setBlahIsSet(true);
      }
    }
  }

  private static <S extends IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}


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
public class Tricky3 implements org.apache.thrift.TBase<Tricky3, Tricky3._Fields>, java.io.Serializable, Cloneable, Comparable<Tricky3> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Tricky3");

  private static final org.apache.thrift.protocol.TField IM_REQUIRED_FIELD_DESC = new org.apache.thrift.protocol.TField("im_required", org.apache.thrift.protocol.TType.I16, (short)1);

  private static final SchemeFactory STANDARD_SCHEME_FACTORY = new Tricky3StandardSchemeFactory();
  private static final SchemeFactory TUPLE_SCHEME_FACTORY = new Tricky3TupleSchemeFactory();

  public short im_required; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    IM_REQUIRED((short)1, "im_required");

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
        case 1: // IM_REQUIRED
          return IM_REQUIRED;
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
  private static final int __IM_REQUIRED_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.IM_REQUIRED, new org.apache.thrift.meta_data.FieldMetaData("im_required", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Tricky3.class, metaDataMap);
  }

  public Tricky3() {
  }

  public Tricky3(
    short im_required)
  {
    this();
    this.im_required = im_required;
    setIm_requiredIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Tricky3(Tricky3 other) {
    __isset_bitfield = other.__isset_bitfield;
    this.im_required = other.im_required;
  }

  public Tricky3 deepCopy() {
    return new Tricky3(this);
  }

  @Override
  public void clear() {
    setIm_requiredIsSet(false);
    this.im_required = 0;
  }

  public short getIm_required() {
    return this.im_required;
  }

  public Tricky3 setIm_required(short im_required) {
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

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case IM_REQUIRED:
      if (value == null) {
        unsetIm_required();
      } else {
        setIm_required((Short)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case IM_REQUIRED:
      return getIm_required();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case IM_REQUIRED:
      return isSetIm_required();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Tricky3)
      return this.equals((Tricky3)that);
    return false;
  }

  public boolean equals(Tricky3 that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_im_required = true;
    boolean that_present_im_required = true;
    if (this_present_im_required || that_present_im_required) {
      if (!(this_present_im_required && that_present_im_required))
        return false;
      if (this.im_required != that.im_required)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + im_required;

    return hashCode;
  }

  @Override
  public int compareTo(Tricky3 other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    StringBuilder sb = new StringBuilder("Tricky3(");
    boolean first = true;

    sb.append("im_required:");
    sb.append(this.im_required);
    first = false;
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

  private static class Tricky3StandardSchemeFactory implements SchemeFactory {
    public Tricky3StandardScheme getScheme() {
      return new Tricky3StandardScheme();
    }
  }

  private static class Tricky3StandardScheme extends StandardScheme<Tricky3> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Tricky3 struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // IM_REQUIRED
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.im_required = iprot.readI16();
              struct.setIm_requiredIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Tricky3 struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(IM_REQUIRED_FIELD_DESC);
      oprot.writeI16(struct.im_required);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class Tricky3TupleSchemeFactory implements SchemeFactory {
    public Tricky3TupleScheme getScheme() {
      return new Tricky3TupleScheme();
    }
  }

  private static class Tricky3TupleScheme extends TupleScheme<Tricky3> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Tricky3 struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI16(struct.im_required);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Tricky3 struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.im_required = iprot.readI16();
      struct.setIm_requiredIsSet(true);
    }
  }

  private static <S extends IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}


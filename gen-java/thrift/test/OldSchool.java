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
public class OldSchool implements org.apache.thrift.TBase<OldSchool, OldSchool._Fields>, java.io.Serializable, Cloneable, Comparable<OldSchool> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("OldSchool");

  private static final org.apache.thrift.protocol.TField IM_INT_FIELD_DESC = new org.apache.thrift.protocol.TField("im_int", org.apache.thrift.protocol.TType.I16, (short)1);
  private static final org.apache.thrift.protocol.TField IM_STR_FIELD_DESC = new org.apache.thrift.protocol.TField("im_str", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField IM_BIG_FIELD_DESC = new org.apache.thrift.protocol.TField("im_big", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final SchemeFactory STANDARD_SCHEME_FACTORY = new OldSchoolStandardSchemeFactory();
  private static final SchemeFactory TUPLE_SCHEME_FACTORY = new OldSchoolTupleSchemeFactory();

  public short im_int; // required
  public String im_str; // required
  public List<Map<Integer,String>> im_big; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    IM_INT((short)1, "im_int"),
    IM_STR((short)2, "im_str"),
    IM_BIG((short)3, "im_big");

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
        case 1: // IM_INT
          return IM_INT;
        case 2: // IM_STR
          return IM_STR;
        case 3: // IM_BIG
          return IM_BIG;
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
  private static final int __IM_INT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.IM_INT, new org.apache.thrift.meta_data.FieldMetaData("im_int", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.IM_STR, new org.apache.thrift.meta_data.FieldMetaData("im_str", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.IM_BIG, new org.apache.thrift.meta_data.FieldMetaData("im_big", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32), 
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(OldSchool.class, metaDataMap);
  }

  public OldSchool() {
  }

  public OldSchool(
    short im_int,
    String im_str,
    List<Map<Integer,String>> im_big)
  {
    this();
    this.im_int = im_int;
    setIm_intIsSet(true);
    this.im_str = im_str;
    this.im_big = im_big;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public OldSchool(OldSchool other) {
    __isset_bitfield = other.__isset_bitfield;
    this.im_int = other.im_int;
    if (other.isSetIm_str()) {
      this.im_str = other.im_str;
    }
    if (other.isSetIm_big()) {
      List<Map<Integer,String>> __this__im_big = new ArrayList<Map<Integer,String>>(other.im_big.size());
      for (Map<Integer,String> other_element : other.im_big) {
        Map<Integer,String> __this__im_big_copy = new HashMap<Integer,String>(other_element);
        __this__im_big.add(__this__im_big_copy);
      }
      this.im_big = __this__im_big;
    }
  }

  public OldSchool deepCopy() {
    return new OldSchool(this);
  }

  @Override
  public void clear() {
    setIm_intIsSet(false);
    this.im_int = 0;
    this.im_str = null;
    this.im_big = null;
  }

  public short getIm_int() {
    return this.im_int;
  }

  public OldSchool setIm_int(short im_int) {
    this.im_int = im_int;
    setIm_intIsSet(true);
    return this;
  }

  public void unsetIm_int() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __IM_INT_ISSET_ID);
  }

  /** Returns true if field im_int is set (has been assigned a value) and false otherwise */
  public boolean isSetIm_int() {
    return EncodingUtils.testBit(__isset_bitfield, __IM_INT_ISSET_ID);
  }

  public void setIm_intIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __IM_INT_ISSET_ID, value);
  }

  public String getIm_str() {
    return this.im_str;
  }

  public OldSchool setIm_str(String im_str) {
    this.im_str = im_str;
    return this;
  }

  public void unsetIm_str() {
    this.im_str = null;
  }

  /** Returns true if field im_str is set (has been assigned a value) and false otherwise */
  public boolean isSetIm_str() {
    return this.im_str != null;
  }

  public void setIm_strIsSet(boolean value) {
    if (!value) {
      this.im_str = null;
    }
  }

  public int getIm_bigSize() {
    return (this.im_big == null) ? 0 : this.im_big.size();
  }

  public java.util.Iterator<Map<Integer,String>> getIm_bigIterator() {
    return (this.im_big == null) ? null : this.im_big.iterator();
  }

  public void addToIm_big(Map<Integer,String> elem) {
    if (this.im_big == null) {
      this.im_big = new ArrayList<Map<Integer,String>>();
    }
    this.im_big.add(elem);
  }

  public List<Map<Integer,String>> getIm_big() {
    return this.im_big;
  }

  public OldSchool setIm_big(List<Map<Integer,String>> im_big) {
    this.im_big = im_big;
    return this;
  }

  public void unsetIm_big() {
    this.im_big = null;
  }

  /** Returns true if field im_big is set (has been assigned a value) and false otherwise */
  public boolean isSetIm_big() {
    return this.im_big != null;
  }

  public void setIm_bigIsSet(boolean value) {
    if (!value) {
      this.im_big = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case IM_INT:
      if (value == null) {
        unsetIm_int();
      } else {
        setIm_int((Short)value);
      }
      break;

    case IM_STR:
      if (value == null) {
        unsetIm_str();
      } else {
        setIm_str((String)value);
      }
      break;

    case IM_BIG:
      if (value == null) {
        unsetIm_big();
      } else {
        setIm_big((List<Map<Integer,String>>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case IM_INT:
      return getIm_int();

    case IM_STR:
      return getIm_str();

    case IM_BIG:
      return getIm_big();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case IM_INT:
      return isSetIm_int();
    case IM_STR:
      return isSetIm_str();
    case IM_BIG:
      return isSetIm_big();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof OldSchool)
      return this.equals((OldSchool)that);
    return false;
  }

  public boolean equals(OldSchool that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_im_int = true;
    boolean that_present_im_int = true;
    if (this_present_im_int || that_present_im_int) {
      if (!(this_present_im_int && that_present_im_int))
        return false;
      if (this.im_int != that.im_int)
        return false;
    }

    boolean this_present_im_str = true && this.isSetIm_str();
    boolean that_present_im_str = true && that.isSetIm_str();
    if (this_present_im_str || that_present_im_str) {
      if (!(this_present_im_str && that_present_im_str))
        return false;
      if (!this.im_str.equals(that.im_str))
        return false;
    }

    boolean this_present_im_big = true && this.isSetIm_big();
    boolean that_present_im_big = true && that.isSetIm_big();
    if (this_present_im_big || that_present_im_big) {
      if (!(this_present_im_big && that_present_im_big))
        return false;
      if (!this.im_big.equals(that.im_big))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + im_int;

    hashCode = hashCode * 8191 + ((isSetIm_str()) ? 131071 : 524287);
    if (isSetIm_str())
      hashCode = hashCode * 8191 + im_str.hashCode();

    hashCode = hashCode * 8191 + ((isSetIm_big()) ? 131071 : 524287);
    if (isSetIm_big())
      hashCode = hashCode * 8191 + im_big.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(OldSchool other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetIm_int()).compareTo(other.isSetIm_int());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIm_int()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.im_int, other.im_int);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIm_str()).compareTo(other.isSetIm_str());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIm_str()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.im_str, other.im_str);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIm_big()).compareTo(other.isSetIm_big());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIm_big()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.im_big, other.im_big);
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
    StringBuilder sb = new StringBuilder("OldSchool(");
    boolean first = true;

    sb.append("im_int:");
    sb.append(this.im_int);
    first = false;
    if (!first) sb.append(", ");
    sb.append("im_str:");
    if (this.im_str == null) {
      sb.append("null");
    } else {
      sb.append(this.im_str);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("im_big:");
    if (this.im_big == null) {
      sb.append("null");
    } else {
      sb.append(this.im_big);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class OldSchoolStandardSchemeFactory implements SchemeFactory {
    public OldSchoolStandardScheme getScheme() {
      return new OldSchoolStandardScheme();
    }
  }

  private static class OldSchoolStandardScheme extends StandardScheme<OldSchool> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, OldSchool struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // IM_INT
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.im_int = iprot.readI16();
              struct.setIm_intIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // IM_STR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.im_str = iprot.readString();
              struct.setIm_strIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // IM_BIG
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.im_big = new ArrayList<Map<Integer,String>>(_list0.size);
                Map<Integer,String> _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  {
                    org.apache.thrift.protocol.TMap _map3 = iprot.readMapBegin();
                    _elem1 = new HashMap<Integer,String>(2*_map3.size);
                    int _key4;
                    String _val5;
                    for (int _i6 = 0; _i6 < _map3.size; ++_i6)
                    {
                      _key4 = iprot.readI32();
                      _val5 = iprot.readString();
                      _elem1.put(_key4, _val5);
                    }
                    iprot.readMapEnd();
                  }
                  struct.im_big.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setIm_bigIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, OldSchool struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(IM_INT_FIELD_DESC);
      oprot.writeI16(struct.im_int);
      oprot.writeFieldEnd();
      if (struct.im_str != null) {
        oprot.writeFieldBegin(IM_STR_FIELD_DESC);
        oprot.writeString(struct.im_str);
        oprot.writeFieldEnd();
      }
      if (struct.im_big != null) {
        oprot.writeFieldBegin(IM_BIG_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.MAP, struct.im_big.size()));
          for (Map<Integer,String> _iter7 : struct.im_big)
          {
            {
              oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRING, _iter7.size()));
              for (Map.Entry<Integer, String> _iter8 : _iter7.entrySet())
              {
                oprot.writeI32(_iter8.getKey());
                oprot.writeString(_iter8.getValue());
              }
              oprot.writeMapEnd();
            }
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class OldSchoolTupleSchemeFactory implements SchemeFactory {
    public OldSchoolTupleScheme getScheme() {
      return new OldSchoolTupleScheme();
    }
  }

  private static class OldSchoolTupleScheme extends TupleScheme<OldSchool> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, OldSchool struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetIm_int()) {
        optionals.set(0);
      }
      if (struct.isSetIm_str()) {
        optionals.set(1);
      }
      if (struct.isSetIm_big()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetIm_int()) {
        oprot.writeI16(struct.im_int);
      }
      if (struct.isSetIm_str()) {
        oprot.writeString(struct.im_str);
      }
      if (struct.isSetIm_big()) {
        {
          oprot.writeI32(struct.im_big.size());
          for (Map<Integer,String> _iter9 : struct.im_big)
          {
            {
              oprot.writeI32(_iter9.size());
              for (Map.Entry<Integer, String> _iter10 : _iter9.entrySet())
              {
                oprot.writeI32(_iter10.getKey());
                oprot.writeString(_iter10.getValue());
              }
            }
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, OldSchool struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.im_int = iprot.readI16();
        struct.setIm_intIsSet(true);
      }
      if (incoming.get(1)) {
        struct.im_str = iprot.readString();
        struct.setIm_strIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list11 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.MAP, iprot.readI32());
          struct.im_big = new ArrayList<Map<Integer,String>>(_list11.size);
          Map<Integer,String> _elem12;
          for (int _i13 = 0; _i13 < _list11.size; ++_i13)
          {
            {
              org.apache.thrift.protocol.TMap _map14 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
              _elem12 = new HashMap<Integer,String>(2*_map14.size);
              int _key15;
              String _val16;
              for (int _i17 = 0; _i17 < _map14.size; ++_i17)
              {
                _key15 = iprot.readI32();
                _val16 = iprot.readString();
                _elem12.put(_key15, _val16);
              }
            }
            struct.im_big.add(_elem12);
          }
        }
        struct.setIm_bigIsSet(true);
      }
    }
  }

  private static <S extends IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}


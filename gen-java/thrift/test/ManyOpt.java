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
public class ManyOpt implements org.apache.thrift.TBase<ManyOpt, ManyOpt._Fields>, java.io.Serializable, Cloneable, Comparable<ManyOpt> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ManyOpt");

  private static final org.apache.thrift.protocol.TField OPT1_FIELD_DESC = new org.apache.thrift.protocol.TField("opt1", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField OPT2_FIELD_DESC = new org.apache.thrift.protocol.TField("opt2", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField OPT3_FIELD_DESC = new org.apache.thrift.protocol.TField("opt3", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField DEF4_FIELD_DESC = new org.apache.thrift.protocol.TField("def4", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField OPT5_FIELD_DESC = new org.apache.thrift.protocol.TField("opt5", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField OPT6_FIELD_DESC = new org.apache.thrift.protocol.TField("opt6", org.apache.thrift.protocol.TType.I32, (short)6);

  private static final SchemeFactory STANDARD_SCHEME_FACTORY = new ManyOptStandardSchemeFactory();
  private static final SchemeFactory TUPLE_SCHEME_FACTORY = new ManyOptTupleSchemeFactory();

  public int opt1; // optional
  public int opt2; // optional
  public int opt3; // optional
  public int def4; // required
  public int opt5; // optional
  public int opt6; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    OPT1((short)1, "opt1"),
    OPT2((short)2, "opt2"),
    OPT3((short)3, "opt3"),
    DEF4((short)4, "def4"),
    OPT5((short)5, "opt5"),
    OPT6((short)6, "opt6");

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
        case 1: // OPT1
          return OPT1;
        case 2: // OPT2
          return OPT2;
        case 3: // OPT3
          return OPT3;
        case 4: // DEF4
          return DEF4;
        case 5: // OPT5
          return OPT5;
        case 6: // OPT6
          return OPT6;
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
  private static final int __OPT1_ISSET_ID = 0;
  private static final int __OPT2_ISSET_ID = 1;
  private static final int __OPT3_ISSET_ID = 2;
  private static final int __DEF4_ISSET_ID = 3;
  private static final int __OPT5_ISSET_ID = 4;
  private static final int __OPT6_ISSET_ID = 5;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.OPT1,_Fields.OPT2,_Fields.OPT3,_Fields.OPT5,_Fields.OPT6};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.OPT1, new org.apache.thrift.meta_data.FieldMetaData("opt1", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.OPT2, new org.apache.thrift.meta_data.FieldMetaData("opt2", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.OPT3, new org.apache.thrift.meta_data.FieldMetaData("opt3", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.DEF4, new org.apache.thrift.meta_data.FieldMetaData("def4", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.OPT5, new org.apache.thrift.meta_data.FieldMetaData("opt5", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.OPT6, new org.apache.thrift.meta_data.FieldMetaData("opt6", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ManyOpt.class, metaDataMap);
  }

  public ManyOpt() {
  }

  public ManyOpt(
    int def4)
  {
    this();
    this.def4 = def4;
    setDef4IsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ManyOpt(ManyOpt other) {
    __isset_bitfield = other.__isset_bitfield;
    this.opt1 = other.opt1;
    this.opt2 = other.opt2;
    this.opt3 = other.opt3;
    this.def4 = other.def4;
    this.opt5 = other.opt5;
    this.opt6 = other.opt6;
  }

  public ManyOpt deepCopy() {
    return new ManyOpt(this);
  }

  @Override
  public void clear() {
    setOpt1IsSet(false);
    this.opt1 = 0;
    setOpt2IsSet(false);
    this.opt2 = 0;
    setOpt3IsSet(false);
    this.opt3 = 0;
    setDef4IsSet(false);
    this.def4 = 0;
    setOpt5IsSet(false);
    this.opt5 = 0;
    setOpt6IsSet(false);
    this.opt6 = 0;
  }

  public int getOpt1() {
    return this.opt1;
  }

  public ManyOpt setOpt1(int opt1) {
    this.opt1 = opt1;
    setOpt1IsSet(true);
    return this;
  }

  public void unsetOpt1() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __OPT1_ISSET_ID);
  }

  /** Returns true if field opt1 is set (has been assigned a value) and false otherwise */
  public boolean isSetOpt1() {
    return EncodingUtils.testBit(__isset_bitfield, __OPT1_ISSET_ID);
  }

  public void setOpt1IsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __OPT1_ISSET_ID, value);
  }

  public int getOpt2() {
    return this.opt2;
  }

  public ManyOpt setOpt2(int opt2) {
    this.opt2 = opt2;
    setOpt2IsSet(true);
    return this;
  }

  public void unsetOpt2() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __OPT2_ISSET_ID);
  }

  /** Returns true if field opt2 is set (has been assigned a value) and false otherwise */
  public boolean isSetOpt2() {
    return EncodingUtils.testBit(__isset_bitfield, __OPT2_ISSET_ID);
  }

  public void setOpt2IsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __OPT2_ISSET_ID, value);
  }

  public int getOpt3() {
    return this.opt3;
  }

  public ManyOpt setOpt3(int opt3) {
    this.opt3 = opt3;
    setOpt3IsSet(true);
    return this;
  }

  public void unsetOpt3() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __OPT3_ISSET_ID);
  }

  /** Returns true if field opt3 is set (has been assigned a value) and false otherwise */
  public boolean isSetOpt3() {
    return EncodingUtils.testBit(__isset_bitfield, __OPT3_ISSET_ID);
  }

  public void setOpt3IsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __OPT3_ISSET_ID, value);
  }

  public int getDef4() {
    return this.def4;
  }

  public ManyOpt setDef4(int def4) {
    this.def4 = def4;
    setDef4IsSet(true);
    return this;
  }

  public void unsetDef4() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DEF4_ISSET_ID);
  }

  /** Returns true if field def4 is set (has been assigned a value) and false otherwise */
  public boolean isSetDef4() {
    return EncodingUtils.testBit(__isset_bitfield, __DEF4_ISSET_ID);
  }

  public void setDef4IsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DEF4_ISSET_ID, value);
  }

  public int getOpt5() {
    return this.opt5;
  }

  public ManyOpt setOpt5(int opt5) {
    this.opt5 = opt5;
    setOpt5IsSet(true);
    return this;
  }

  public void unsetOpt5() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __OPT5_ISSET_ID);
  }

  /** Returns true if field opt5 is set (has been assigned a value) and false otherwise */
  public boolean isSetOpt5() {
    return EncodingUtils.testBit(__isset_bitfield, __OPT5_ISSET_ID);
  }

  public void setOpt5IsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __OPT5_ISSET_ID, value);
  }

  public int getOpt6() {
    return this.opt6;
  }

  public ManyOpt setOpt6(int opt6) {
    this.opt6 = opt6;
    setOpt6IsSet(true);
    return this;
  }

  public void unsetOpt6() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __OPT6_ISSET_ID);
  }

  /** Returns true if field opt6 is set (has been assigned a value) and false otherwise */
  public boolean isSetOpt6() {
    return EncodingUtils.testBit(__isset_bitfield, __OPT6_ISSET_ID);
  }

  public void setOpt6IsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __OPT6_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case OPT1:
      if (value == null) {
        unsetOpt1();
      } else {
        setOpt1((Integer)value);
      }
      break;

    case OPT2:
      if (value == null) {
        unsetOpt2();
      } else {
        setOpt2((Integer)value);
      }
      break;

    case OPT3:
      if (value == null) {
        unsetOpt3();
      } else {
        setOpt3((Integer)value);
      }
      break;

    case DEF4:
      if (value == null) {
        unsetDef4();
      } else {
        setDef4((Integer)value);
      }
      break;

    case OPT5:
      if (value == null) {
        unsetOpt5();
      } else {
        setOpt5((Integer)value);
      }
      break;

    case OPT6:
      if (value == null) {
        unsetOpt6();
      } else {
        setOpt6((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case OPT1:
      return getOpt1();

    case OPT2:
      return getOpt2();

    case OPT3:
      return getOpt3();

    case DEF4:
      return getDef4();

    case OPT5:
      return getOpt5();

    case OPT6:
      return getOpt6();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case OPT1:
      return isSetOpt1();
    case OPT2:
      return isSetOpt2();
    case OPT3:
      return isSetOpt3();
    case DEF4:
      return isSetDef4();
    case OPT5:
      return isSetOpt5();
    case OPT6:
      return isSetOpt6();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ManyOpt)
      return this.equals((ManyOpt)that);
    return false;
  }

  public boolean equals(ManyOpt that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_opt1 = true && this.isSetOpt1();
    boolean that_present_opt1 = true && that.isSetOpt1();
    if (this_present_opt1 || that_present_opt1) {
      if (!(this_present_opt1 && that_present_opt1))
        return false;
      if (this.opt1 != that.opt1)
        return false;
    }

    boolean this_present_opt2 = true && this.isSetOpt2();
    boolean that_present_opt2 = true && that.isSetOpt2();
    if (this_present_opt2 || that_present_opt2) {
      if (!(this_present_opt2 && that_present_opt2))
        return false;
      if (this.opt2 != that.opt2)
        return false;
    }

    boolean this_present_opt3 = true && this.isSetOpt3();
    boolean that_present_opt3 = true && that.isSetOpt3();
    if (this_present_opt3 || that_present_opt3) {
      if (!(this_present_opt3 && that_present_opt3))
        return false;
      if (this.opt3 != that.opt3)
        return false;
    }

    boolean this_present_def4 = true;
    boolean that_present_def4 = true;
    if (this_present_def4 || that_present_def4) {
      if (!(this_present_def4 && that_present_def4))
        return false;
      if (this.def4 != that.def4)
        return false;
    }

    boolean this_present_opt5 = true && this.isSetOpt5();
    boolean that_present_opt5 = true && that.isSetOpt5();
    if (this_present_opt5 || that_present_opt5) {
      if (!(this_present_opt5 && that_present_opt5))
        return false;
      if (this.opt5 != that.opt5)
        return false;
    }

    boolean this_present_opt6 = true && this.isSetOpt6();
    boolean that_present_opt6 = true && that.isSetOpt6();
    if (this_present_opt6 || that_present_opt6) {
      if (!(this_present_opt6 && that_present_opt6))
        return false;
      if (this.opt6 != that.opt6)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetOpt1()) ? 131071 : 524287);
    if (isSetOpt1())
      hashCode = hashCode * 8191 + opt1;

    hashCode = hashCode * 8191 + ((isSetOpt2()) ? 131071 : 524287);
    if (isSetOpt2())
      hashCode = hashCode * 8191 + opt2;

    hashCode = hashCode * 8191 + ((isSetOpt3()) ? 131071 : 524287);
    if (isSetOpt3())
      hashCode = hashCode * 8191 + opt3;

    hashCode = hashCode * 8191 + def4;

    hashCode = hashCode * 8191 + ((isSetOpt5()) ? 131071 : 524287);
    if (isSetOpt5())
      hashCode = hashCode * 8191 + opt5;

    hashCode = hashCode * 8191 + ((isSetOpt6()) ? 131071 : 524287);
    if (isSetOpt6())
      hashCode = hashCode * 8191 + opt6;

    return hashCode;
  }

  @Override
  public int compareTo(ManyOpt other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetOpt1()).compareTo(other.isSetOpt1());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOpt1()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.opt1, other.opt1);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOpt2()).compareTo(other.isSetOpt2());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOpt2()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.opt2, other.opt2);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOpt3()).compareTo(other.isSetOpt3());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOpt3()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.opt3, other.opt3);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDef4()).compareTo(other.isSetDef4());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDef4()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.def4, other.def4);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOpt5()).compareTo(other.isSetOpt5());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOpt5()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.opt5, other.opt5);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOpt6()).compareTo(other.isSetOpt6());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOpt6()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.opt6, other.opt6);
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
    StringBuilder sb = new StringBuilder("ManyOpt(");
    boolean first = true;

    if (isSetOpt1()) {
      sb.append("opt1:");
      sb.append(this.opt1);
      first = false;
    }
    if (isSetOpt2()) {
      if (!first) sb.append(", ");
      sb.append("opt2:");
      sb.append(this.opt2);
      first = false;
    }
    if (isSetOpt3()) {
      if (!first) sb.append(", ");
      sb.append("opt3:");
      sb.append(this.opt3);
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("def4:");
    sb.append(this.def4);
    first = false;
    if (isSetOpt5()) {
      if (!first) sb.append(", ");
      sb.append("opt5:");
      sb.append(this.opt5);
      first = false;
    }
    if (isSetOpt6()) {
      if (!first) sb.append(", ");
      sb.append("opt6:");
      sb.append(this.opt6);
      first = false;
    }
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

  private static class ManyOptStandardSchemeFactory implements SchemeFactory {
    public ManyOptStandardScheme getScheme() {
      return new ManyOptStandardScheme();
    }
  }

  private static class ManyOptStandardScheme extends StandardScheme<ManyOpt> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ManyOpt struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OPT1
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.opt1 = iprot.readI32();
              struct.setOpt1IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OPT2
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.opt2 = iprot.readI32();
              struct.setOpt2IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // OPT3
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.opt3 = iprot.readI32();
              struct.setOpt3IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DEF4
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.def4 = iprot.readI32();
              struct.setDef4IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // OPT5
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.opt5 = iprot.readI32();
              struct.setOpt5IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // OPT6
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.opt6 = iprot.readI32();
              struct.setOpt6IsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ManyOpt struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetOpt1()) {
        oprot.writeFieldBegin(OPT1_FIELD_DESC);
        oprot.writeI32(struct.opt1);
        oprot.writeFieldEnd();
      }
      if (struct.isSetOpt2()) {
        oprot.writeFieldBegin(OPT2_FIELD_DESC);
        oprot.writeI32(struct.opt2);
        oprot.writeFieldEnd();
      }
      if (struct.isSetOpt3()) {
        oprot.writeFieldBegin(OPT3_FIELD_DESC);
        oprot.writeI32(struct.opt3);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(DEF4_FIELD_DESC);
      oprot.writeI32(struct.def4);
      oprot.writeFieldEnd();
      if (struct.isSetOpt5()) {
        oprot.writeFieldBegin(OPT5_FIELD_DESC);
        oprot.writeI32(struct.opt5);
        oprot.writeFieldEnd();
      }
      if (struct.isSetOpt6()) {
        oprot.writeFieldBegin(OPT6_FIELD_DESC);
        oprot.writeI32(struct.opt6);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ManyOptTupleSchemeFactory implements SchemeFactory {
    public ManyOptTupleScheme getScheme() {
      return new ManyOptTupleScheme();
    }
  }

  private static class ManyOptTupleScheme extends TupleScheme<ManyOpt> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ManyOpt struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetOpt1()) {
        optionals.set(0);
      }
      if (struct.isSetOpt2()) {
        optionals.set(1);
      }
      if (struct.isSetOpt3()) {
        optionals.set(2);
      }
      if (struct.isSetDef4()) {
        optionals.set(3);
      }
      if (struct.isSetOpt5()) {
        optionals.set(4);
      }
      if (struct.isSetOpt6()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetOpt1()) {
        oprot.writeI32(struct.opt1);
      }
      if (struct.isSetOpt2()) {
        oprot.writeI32(struct.opt2);
      }
      if (struct.isSetOpt3()) {
        oprot.writeI32(struct.opt3);
      }
      if (struct.isSetDef4()) {
        oprot.writeI32(struct.def4);
      }
      if (struct.isSetOpt5()) {
        oprot.writeI32(struct.opt5);
      }
      if (struct.isSetOpt6()) {
        oprot.writeI32(struct.opt6);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ManyOpt struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.opt1 = iprot.readI32();
        struct.setOpt1IsSet(true);
      }
      if (incoming.get(1)) {
        struct.opt2 = iprot.readI32();
        struct.setOpt2IsSet(true);
      }
      if (incoming.get(2)) {
        struct.opt3 = iprot.readI32();
        struct.setOpt3IsSet(true);
      }
      if (incoming.get(3)) {
        struct.def4 = iprot.readI32();
        struct.setDef4IsSet(true);
      }
      if (incoming.get(4)) {
        struct.opt5 = iprot.readI32();
        struct.setOpt5IsSet(true);
      }
      if (incoming.get(5)) {
        struct.opt6 = iprot.readI32();
        struct.setOpt6IsSet(true);
      }
    }
  }

  private static <S extends IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}


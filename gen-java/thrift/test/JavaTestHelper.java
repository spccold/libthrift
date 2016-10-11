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
public class JavaTestHelper implements org.apache.thrift.TBase<JavaTestHelper, JavaTestHelper._Fields>, java.io.Serializable, Cloneable, Comparable<JavaTestHelper> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("JavaTestHelper");

  private static final org.apache.thrift.protocol.TField REQ_INT_FIELD_DESC = new org.apache.thrift.protocol.TField("req_int", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField OPT_INT_FIELD_DESC = new org.apache.thrift.protocol.TField("opt_int", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField REQ_OBJ_FIELD_DESC = new org.apache.thrift.protocol.TField("req_obj", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField OPT_OBJ_FIELD_DESC = new org.apache.thrift.protocol.TField("opt_obj", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField REQ_BIN_FIELD_DESC = new org.apache.thrift.protocol.TField("req_bin", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField OPT_BIN_FIELD_DESC = new org.apache.thrift.protocol.TField("opt_bin", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final SchemeFactory STANDARD_SCHEME_FACTORY = new JavaTestHelperStandardSchemeFactory();
  private static final SchemeFactory TUPLE_SCHEME_FACTORY = new JavaTestHelperTupleSchemeFactory();

  public int req_int; // required
  public int opt_int; // optional
  public String req_obj; // required
  public String opt_obj; // optional
  public ByteBuffer req_bin; // required
  public ByteBuffer opt_bin; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    REQ_INT((short)1, "req_int"),
    OPT_INT((short)2, "opt_int"),
    REQ_OBJ((short)3, "req_obj"),
    OPT_OBJ((short)4, "opt_obj"),
    REQ_BIN((short)5, "req_bin"),
    OPT_BIN((short)6, "opt_bin");

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
        case 1: // REQ_INT
          return REQ_INT;
        case 2: // OPT_INT
          return OPT_INT;
        case 3: // REQ_OBJ
          return REQ_OBJ;
        case 4: // OPT_OBJ
          return OPT_OBJ;
        case 5: // REQ_BIN
          return REQ_BIN;
        case 6: // OPT_BIN
          return OPT_BIN;
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
  private static final int __REQ_INT_ISSET_ID = 0;
  private static final int __OPT_INT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.OPT_INT,_Fields.OPT_OBJ,_Fields.OPT_BIN};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.REQ_INT, new org.apache.thrift.meta_data.FieldMetaData("req_int", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.OPT_INT, new org.apache.thrift.meta_data.FieldMetaData("opt_int", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.REQ_OBJ, new org.apache.thrift.meta_data.FieldMetaData("req_obj", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.OPT_OBJ, new org.apache.thrift.meta_data.FieldMetaData("opt_obj", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.REQ_BIN, new org.apache.thrift.meta_data.FieldMetaData("req_bin", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.OPT_BIN, new org.apache.thrift.meta_data.FieldMetaData("opt_bin", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(JavaTestHelper.class, metaDataMap);
  }

  public JavaTestHelper() {
  }

  public JavaTestHelper(
    int req_int,
    String req_obj,
    ByteBuffer req_bin)
  {
    this();
    this.req_int = req_int;
    setReq_intIsSet(true);
    this.req_obj = req_obj;
    this.req_bin = org.apache.thrift.TBaseHelper.copyBinary(req_bin);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public JavaTestHelper(JavaTestHelper other) {
    __isset_bitfield = other.__isset_bitfield;
    this.req_int = other.req_int;
    this.opt_int = other.opt_int;
    if (other.isSetReq_obj()) {
      this.req_obj = other.req_obj;
    }
    if (other.isSetOpt_obj()) {
      this.opt_obj = other.opt_obj;
    }
    if (other.isSetReq_bin()) {
      this.req_bin = org.apache.thrift.TBaseHelper.copyBinary(other.req_bin);
    }
    if (other.isSetOpt_bin()) {
      this.opt_bin = org.apache.thrift.TBaseHelper.copyBinary(other.opt_bin);
    }
  }

  public JavaTestHelper deepCopy() {
    return new JavaTestHelper(this);
  }

  @Override
  public void clear() {
    setReq_intIsSet(false);
    this.req_int = 0;
    setOpt_intIsSet(false);
    this.opt_int = 0;
    this.req_obj = null;
    this.opt_obj = null;
    this.req_bin = null;
    this.opt_bin = null;
  }

  public int getReq_int() {
    return this.req_int;
  }

  public JavaTestHelper setReq_int(int req_int) {
    this.req_int = req_int;
    setReq_intIsSet(true);
    return this;
  }

  public void unsetReq_int() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __REQ_INT_ISSET_ID);
  }

  /** Returns true if field req_int is set (has been assigned a value) and false otherwise */
  public boolean isSetReq_int() {
    return EncodingUtils.testBit(__isset_bitfield, __REQ_INT_ISSET_ID);
  }

  public void setReq_intIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __REQ_INT_ISSET_ID, value);
  }

  public int getOpt_int() {
    return this.opt_int;
  }

  public JavaTestHelper setOpt_int(int opt_int) {
    this.opt_int = opt_int;
    setOpt_intIsSet(true);
    return this;
  }

  public void unsetOpt_int() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __OPT_INT_ISSET_ID);
  }

  /** Returns true if field opt_int is set (has been assigned a value) and false otherwise */
  public boolean isSetOpt_int() {
    return EncodingUtils.testBit(__isset_bitfield, __OPT_INT_ISSET_ID);
  }

  public void setOpt_intIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __OPT_INT_ISSET_ID, value);
  }

  public String getReq_obj() {
    return this.req_obj;
  }

  public JavaTestHelper setReq_obj(String req_obj) {
    this.req_obj = req_obj;
    return this;
  }

  public void unsetReq_obj() {
    this.req_obj = null;
  }

  /** Returns true if field req_obj is set (has been assigned a value) and false otherwise */
  public boolean isSetReq_obj() {
    return this.req_obj != null;
  }

  public void setReq_objIsSet(boolean value) {
    if (!value) {
      this.req_obj = null;
    }
  }

  public String getOpt_obj() {
    return this.opt_obj;
  }

  public JavaTestHelper setOpt_obj(String opt_obj) {
    this.opt_obj = opt_obj;
    return this;
  }

  public void unsetOpt_obj() {
    this.opt_obj = null;
  }

  /** Returns true if field opt_obj is set (has been assigned a value) and false otherwise */
  public boolean isSetOpt_obj() {
    return this.opt_obj != null;
  }

  public void setOpt_objIsSet(boolean value) {
    if (!value) {
      this.opt_obj = null;
    }
  }

  public byte[] getReq_bin() {
    setReq_bin(org.apache.thrift.TBaseHelper.rightSize(req_bin));
    return req_bin == null ? null : req_bin.array();
  }

  public ByteBuffer bufferForReq_bin() {
    return org.apache.thrift.TBaseHelper.copyBinary(req_bin);
  }

  public JavaTestHelper setReq_bin(byte[] req_bin) {
    this.req_bin = req_bin == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(req_bin, req_bin.length));
    return this;
  }

  public JavaTestHelper setReq_bin(ByteBuffer req_bin) {
    this.req_bin = org.apache.thrift.TBaseHelper.copyBinary(req_bin);
    return this;
  }

  public void unsetReq_bin() {
    this.req_bin = null;
  }

  /** Returns true if field req_bin is set (has been assigned a value) and false otherwise */
  public boolean isSetReq_bin() {
    return this.req_bin != null;
  }

  public void setReq_binIsSet(boolean value) {
    if (!value) {
      this.req_bin = null;
    }
  }

  public byte[] getOpt_bin() {
    setOpt_bin(org.apache.thrift.TBaseHelper.rightSize(opt_bin));
    return opt_bin == null ? null : opt_bin.array();
  }

  public ByteBuffer bufferForOpt_bin() {
    return org.apache.thrift.TBaseHelper.copyBinary(opt_bin);
  }

  public JavaTestHelper setOpt_bin(byte[] opt_bin) {
    this.opt_bin = opt_bin == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(opt_bin, opt_bin.length));
    return this;
  }

  public JavaTestHelper setOpt_bin(ByteBuffer opt_bin) {
    this.opt_bin = org.apache.thrift.TBaseHelper.copyBinary(opt_bin);
    return this;
  }

  public void unsetOpt_bin() {
    this.opt_bin = null;
  }

  /** Returns true if field opt_bin is set (has been assigned a value) and false otherwise */
  public boolean isSetOpt_bin() {
    return this.opt_bin != null;
  }

  public void setOpt_binIsSet(boolean value) {
    if (!value) {
      this.opt_bin = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case REQ_INT:
      if (value == null) {
        unsetReq_int();
      } else {
        setReq_int((Integer)value);
      }
      break;

    case OPT_INT:
      if (value == null) {
        unsetOpt_int();
      } else {
        setOpt_int((Integer)value);
      }
      break;

    case REQ_OBJ:
      if (value == null) {
        unsetReq_obj();
      } else {
        setReq_obj((String)value);
      }
      break;

    case OPT_OBJ:
      if (value == null) {
        unsetOpt_obj();
      } else {
        setOpt_obj((String)value);
      }
      break;

    case REQ_BIN:
      if (value == null) {
        unsetReq_bin();
      } else {
        if (value instanceof byte[]) {
          setReq_bin((byte[])value);
        } else {
          setReq_bin((ByteBuffer)value);
        }
      }
      break;

    case OPT_BIN:
      if (value == null) {
        unsetOpt_bin();
      } else {
        if (value instanceof byte[]) {
          setOpt_bin((byte[])value);
        } else {
          setOpt_bin((ByteBuffer)value);
        }
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case REQ_INT:
      return getReq_int();

    case OPT_INT:
      return getOpt_int();

    case REQ_OBJ:
      return getReq_obj();

    case OPT_OBJ:
      return getOpt_obj();

    case REQ_BIN:
      return getReq_bin();

    case OPT_BIN:
      return getOpt_bin();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case REQ_INT:
      return isSetReq_int();
    case OPT_INT:
      return isSetOpt_int();
    case REQ_OBJ:
      return isSetReq_obj();
    case OPT_OBJ:
      return isSetOpt_obj();
    case REQ_BIN:
      return isSetReq_bin();
    case OPT_BIN:
      return isSetOpt_bin();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof JavaTestHelper)
      return this.equals((JavaTestHelper)that);
    return false;
  }

  public boolean equals(JavaTestHelper that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_req_int = true;
    boolean that_present_req_int = true;
    if (this_present_req_int || that_present_req_int) {
      if (!(this_present_req_int && that_present_req_int))
        return false;
      if (this.req_int != that.req_int)
        return false;
    }

    boolean this_present_opt_int = true && this.isSetOpt_int();
    boolean that_present_opt_int = true && that.isSetOpt_int();
    if (this_present_opt_int || that_present_opt_int) {
      if (!(this_present_opt_int && that_present_opt_int))
        return false;
      if (this.opt_int != that.opt_int)
        return false;
    }

    boolean this_present_req_obj = true && this.isSetReq_obj();
    boolean that_present_req_obj = true && that.isSetReq_obj();
    if (this_present_req_obj || that_present_req_obj) {
      if (!(this_present_req_obj && that_present_req_obj))
        return false;
      if (!this.req_obj.equals(that.req_obj))
        return false;
    }

    boolean this_present_opt_obj = true && this.isSetOpt_obj();
    boolean that_present_opt_obj = true && that.isSetOpt_obj();
    if (this_present_opt_obj || that_present_opt_obj) {
      if (!(this_present_opt_obj && that_present_opt_obj))
        return false;
      if (!this.opt_obj.equals(that.opt_obj))
        return false;
    }

    boolean this_present_req_bin = true && this.isSetReq_bin();
    boolean that_present_req_bin = true && that.isSetReq_bin();
    if (this_present_req_bin || that_present_req_bin) {
      if (!(this_present_req_bin && that_present_req_bin))
        return false;
      if (!this.req_bin.equals(that.req_bin))
        return false;
    }

    boolean this_present_opt_bin = true && this.isSetOpt_bin();
    boolean that_present_opt_bin = true && that.isSetOpt_bin();
    if (this_present_opt_bin || that_present_opt_bin) {
      if (!(this_present_opt_bin && that_present_opt_bin))
        return false;
      if (!this.opt_bin.equals(that.opt_bin))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + req_int;

    hashCode = hashCode * 8191 + ((isSetOpt_int()) ? 131071 : 524287);
    if (isSetOpt_int())
      hashCode = hashCode * 8191 + opt_int;

    hashCode = hashCode * 8191 + ((isSetReq_obj()) ? 131071 : 524287);
    if (isSetReq_obj())
      hashCode = hashCode * 8191 + req_obj.hashCode();

    hashCode = hashCode * 8191 + ((isSetOpt_obj()) ? 131071 : 524287);
    if (isSetOpt_obj())
      hashCode = hashCode * 8191 + opt_obj.hashCode();

    hashCode = hashCode * 8191 + ((isSetReq_bin()) ? 131071 : 524287);
    if (isSetReq_bin())
      hashCode = hashCode * 8191 + req_bin.hashCode();

    hashCode = hashCode * 8191 + ((isSetOpt_bin()) ? 131071 : 524287);
    if (isSetOpt_bin())
      hashCode = hashCode * 8191 + opt_bin.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(JavaTestHelper other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetReq_int()).compareTo(other.isSetReq_int());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReq_int()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.req_int, other.req_int);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOpt_int()).compareTo(other.isSetOpt_int());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOpt_int()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.opt_int, other.opt_int);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetReq_obj()).compareTo(other.isSetReq_obj());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReq_obj()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.req_obj, other.req_obj);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOpt_obj()).compareTo(other.isSetOpt_obj());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOpt_obj()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.opt_obj, other.opt_obj);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetReq_bin()).compareTo(other.isSetReq_bin());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReq_bin()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.req_bin, other.req_bin);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOpt_bin()).compareTo(other.isSetOpt_bin());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOpt_bin()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.opt_bin, other.opt_bin);
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
    StringBuilder sb = new StringBuilder("JavaTestHelper(");
    boolean first = true;

    sb.append("req_int:");
    sb.append(this.req_int);
    first = false;
    if (isSetOpt_int()) {
      if (!first) sb.append(", ");
      sb.append("opt_int:");
      sb.append(this.opt_int);
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("req_obj:");
    if (this.req_obj == null) {
      sb.append("null");
    } else {
      sb.append(this.req_obj);
    }
    first = false;
    if (isSetOpt_obj()) {
      if (!first) sb.append(", ");
      sb.append("opt_obj:");
      if (this.opt_obj == null) {
        sb.append("null");
      } else {
        sb.append(this.opt_obj);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("req_bin:");
    if (this.req_bin == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.req_bin, sb);
    }
    first = false;
    if (isSetOpt_bin()) {
      if (!first) sb.append(", ");
      sb.append("opt_bin:");
      if (this.opt_bin == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.opt_bin, sb);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'req_int' because it's a primitive and you chose the non-beans generator.
    if (req_obj == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'req_obj' was not present! Struct: " + toString());
    }
    if (req_bin == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'req_bin' was not present! Struct: " + toString());
    }
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

  private static class JavaTestHelperStandardSchemeFactory implements SchemeFactory {
    public JavaTestHelperStandardScheme getScheme() {
      return new JavaTestHelperStandardScheme();
    }
  }

  private static class JavaTestHelperStandardScheme extends StandardScheme<JavaTestHelper> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, JavaTestHelper struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // REQ_INT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.req_int = iprot.readI32();
              struct.setReq_intIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OPT_INT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.opt_int = iprot.readI32();
              struct.setOpt_intIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // REQ_OBJ
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.req_obj = iprot.readString();
              struct.setReq_objIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // OPT_OBJ
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.opt_obj = iprot.readString();
              struct.setOpt_objIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // REQ_BIN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.req_bin = iprot.readBinary();
              struct.setReq_binIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // OPT_BIN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.opt_bin = iprot.readBinary();
              struct.setOpt_binIsSet(true);
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
      if (!struct.isSetReq_int()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'req_int' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, JavaTestHelper struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(REQ_INT_FIELD_DESC);
      oprot.writeI32(struct.req_int);
      oprot.writeFieldEnd();
      if (struct.isSetOpt_int()) {
        oprot.writeFieldBegin(OPT_INT_FIELD_DESC);
        oprot.writeI32(struct.opt_int);
        oprot.writeFieldEnd();
      }
      if (struct.req_obj != null) {
        oprot.writeFieldBegin(REQ_OBJ_FIELD_DESC);
        oprot.writeString(struct.req_obj);
        oprot.writeFieldEnd();
      }
      if (struct.opt_obj != null) {
        if (struct.isSetOpt_obj()) {
          oprot.writeFieldBegin(OPT_OBJ_FIELD_DESC);
          oprot.writeString(struct.opt_obj);
          oprot.writeFieldEnd();
        }
      }
      if (struct.req_bin != null) {
        oprot.writeFieldBegin(REQ_BIN_FIELD_DESC);
        oprot.writeBinary(struct.req_bin);
        oprot.writeFieldEnd();
      }
      if (struct.opt_bin != null) {
        if (struct.isSetOpt_bin()) {
          oprot.writeFieldBegin(OPT_BIN_FIELD_DESC);
          oprot.writeBinary(struct.opt_bin);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class JavaTestHelperTupleSchemeFactory implements SchemeFactory {
    public JavaTestHelperTupleScheme getScheme() {
      return new JavaTestHelperTupleScheme();
    }
  }

  private static class JavaTestHelperTupleScheme extends TupleScheme<JavaTestHelper> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, JavaTestHelper struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.req_int);
      oprot.writeString(struct.req_obj);
      oprot.writeBinary(struct.req_bin);
      BitSet optionals = new BitSet();
      if (struct.isSetOpt_int()) {
        optionals.set(0);
      }
      if (struct.isSetOpt_obj()) {
        optionals.set(1);
      }
      if (struct.isSetOpt_bin()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetOpt_int()) {
        oprot.writeI32(struct.opt_int);
      }
      if (struct.isSetOpt_obj()) {
        oprot.writeString(struct.opt_obj);
      }
      if (struct.isSetOpt_bin()) {
        oprot.writeBinary(struct.opt_bin);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, JavaTestHelper struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.req_int = iprot.readI32();
      struct.setReq_intIsSet(true);
      struct.req_obj = iprot.readString();
      struct.setReq_objIsSet(true);
      struct.req_bin = iprot.readBinary();
      struct.setReq_binIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.opt_int = iprot.readI32();
        struct.setOpt_intIsSet(true);
      }
      if (incoming.get(1)) {
        struct.opt_obj = iprot.readString();
        struct.setOpt_objIsSet(true);
      }
      if (incoming.get(2)) {
        struct.opt_bin = iprot.readBinary();
        struct.setOpt_binIsSet(true);
      }
    }
  }

  private static <S extends IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}


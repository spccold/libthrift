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
public class Complex implements org.apache.thrift.TBase<Complex, Complex._Fields>, java.io.Serializable, Cloneable, Comparable<Complex> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Complex");

  private static final org.apache.thrift.protocol.TField CP_DEFAULT_FIELD_DESC = new org.apache.thrift.protocol.TField("cp_default", org.apache.thrift.protocol.TType.I16, (short)1);
  private static final org.apache.thrift.protocol.TField CP_REQUIRED_FIELD_DESC = new org.apache.thrift.protocol.TField("cp_required", org.apache.thrift.protocol.TType.I16, (short)2);
  private static final org.apache.thrift.protocol.TField CP_OPTIONAL_FIELD_DESC = new org.apache.thrift.protocol.TField("cp_optional", org.apache.thrift.protocol.TType.I16, (short)3);
  private static final org.apache.thrift.protocol.TField THE_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("the_map", org.apache.thrift.protocol.TType.MAP, (short)4);
  private static final org.apache.thrift.protocol.TField REQ_SIMP_FIELD_DESC = new org.apache.thrift.protocol.TField("req_simp", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField OPT_SIMP_FIELD_DESC = new org.apache.thrift.protocol.TField("opt_simp", org.apache.thrift.protocol.TType.STRUCT, (short)6);

  private static final SchemeFactory STANDARD_SCHEME_FACTORY = new ComplexStandardSchemeFactory();
  private static final SchemeFactory TUPLE_SCHEME_FACTORY = new ComplexTupleSchemeFactory();

  public short cp_default; // required
  public short cp_required; // required
  public short cp_optional; // optional
  public Map<Short,Simple> the_map; // required
  public Simple req_simp; // required
  public Simple opt_simp; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CP_DEFAULT((short)1, "cp_default"),
    CP_REQUIRED((short)2, "cp_required"),
    CP_OPTIONAL((short)3, "cp_optional"),
    THE_MAP((short)4, "the_map"),
    REQ_SIMP((short)5, "req_simp"),
    OPT_SIMP((short)6, "opt_simp");

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
        case 1: // CP_DEFAULT
          return CP_DEFAULT;
        case 2: // CP_REQUIRED
          return CP_REQUIRED;
        case 3: // CP_OPTIONAL
          return CP_OPTIONAL;
        case 4: // THE_MAP
          return THE_MAP;
        case 5: // REQ_SIMP
          return REQ_SIMP;
        case 6: // OPT_SIMP
          return OPT_SIMP;
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
  private static final int __CP_DEFAULT_ISSET_ID = 0;
  private static final int __CP_REQUIRED_ISSET_ID = 1;
  private static final int __CP_OPTIONAL_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.CP_OPTIONAL,_Fields.OPT_SIMP};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CP_DEFAULT, new org.apache.thrift.meta_data.FieldMetaData("cp_default", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.CP_REQUIRED, new org.apache.thrift.meta_data.FieldMetaData("cp_required", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.CP_OPTIONAL, new org.apache.thrift.meta_data.FieldMetaData("cp_optional", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.THE_MAP, new org.apache.thrift.meta_data.FieldMetaData("the_map", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Simple.class))));
    tmpMap.put(_Fields.REQ_SIMP, new org.apache.thrift.meta_data.FieldMetaData("req_simp", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Simple.class)));
    tmpMap.put(_Fields.OPT_SIMP, new org.apache.thrift.meta_data.FieldMetaData("opt_simp", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Simple.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Complex.class, metaDataMap);
  }

  public Complex() {
  }

  public Complex(
    short cp_default,
    short cp_required,
    Map<Short,Simple> the_map,
    Simple req_simp)
  {
    this();
    this.cp_default = cp_default;
    setCp_defaultIsSet(true);
    this.cp_required = cp_required;
    setCp_requiredIsSet(true);
    this.the_map = the_map;
    this.req_simp = req_simp;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Complex(Complex other) {
    __isset_bitfield = other.__isset_bitfield;
    this.cp_default = other.cp_default;
    this.cp_required = other.cp_required;
    this.cp_optional = other.cp_optional;
    if (other.isSetThe_map()) {
      Map<Short,Simple> __this__the_map = new HashMap<Short,Simple>(other.the_map.size());
      for (Map.Entry<Short, Simple> other_element : other.the_map.entrySet()) {

        Short other_element_key = other_element.getKey();
        Simple other_element_value = other_element.getValue();

        Short __this__the_map_copy_key = other_element_key;

        Simple __this__the_map_copy_value = new Simple(other_element_value);

        __this__the_map.put(__this__the_map_copy_key, __this__the_map_copy_value);
      }
      this.the_map = __this__the_map;
    }
    if (other.isSetReq_simp()) {
      this.req_simp = new Simple(other.req_simp);
    }
    if (other.isSetOpt_simp()) {
      this.opt_simp = new Simple(other.opt_simp);
    }
  }

  public Complex deepCopy() {
    return new Complex(this);
  }

  @Override
  public void clear() {
    setCp_defaultIsSet(false);
    this.cp_default = 0;
    setCp_requiredIsSet(false);
    this.cp_required = 0;
    setCp_optionalIsSet(false);
    this.cp_optional = 0;
    this.the_map = null;
    this.req_simp = null;
    this.opt_simp = null;
  }

  public short getCp_default() {
    return this.cp_default;
  }

  public Complex setCp_default(short cp_default) {
    this.cp_default = cp_default;
    setCp_defaultIsSet(true);
    return this;
  }

  public void unsetCp_default() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CP_DEFAULT_ISSET_ID);
  }

  /** Returns true if field cp_default is set (has been assigned a value) and false otherwise */
  public boolean isSetCp_default() {
    return EncodingUtils.testBit(__isset_bitfield, __CP_DEFAULT_ISSET_ID);
  }

  public void setCp_defaultIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CP_DEFAULT_ISSET_ID, value);
  }

  public short getCp_required() {
    return this.cp_required;
  }

  public Complex setCp_required(short cp_required) {
    this.cp_required = cp_required;
    setCp_requiredIsSet(true);
    return this;
  }

  public void unsetCp_required() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CP_REQUIRED_ISSET_ID);
  }

  /** Returns true if field cp_required is set (has been assigned a value) and false otherwise */
  public boolean isSetCp_required() {
    return EncodingUtils.testBit(__isset_bitfield, __CP_REQUIRED_ISSET_ID);
  }

  public void setCp_requiredIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CP_REQUIRED_ISSET_ID, value);
  }

  public short getCp_optional() {
    return this.cp_optional;
  }

  public Complex setCp_optional(short cp_optional) {
    this.cp_optional = cp_optional;
    setCp_optionalIsSet(true);
    return this;
  }

  public void unsetCp_optional() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CP_OPTIONAL_ISSET_ID);
  }

  /** Returns true if field cp_optional is set (has been assigned a value) and false otherwise */
  public boolean isSetCp_optional() {
    return EncodingUtils.testBit(__isset_bitfield, __CP_OPTIONAL_ISSET_ID);
  }

  public void setCp_optionalIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CP_OPTIONAL_ISSET_ID, value);
  }

  public int getThe_mapSize() {
    return (this.the_map == null) ? 0 : this.the_map.size();
  }

  public void putToThe_map(short key, Simple val) {
    if (this.the_map == null) {
      this.the_map = new HashMap<Short,Simple>();
    }
    this.the_map.put(key, val);
  }

  public Map<Short,Simple> getThe_map() {
    return this.the_map;
  }

  public Complex setThe_map(Map<Short,Simple> the_map) {
    this.the_map = the_map;
    return this;
  }

  public void unsetThe_map() {
    this.the_map = null;
  }

  /** Returns true if field the_map is set (has been assigned a value) and false otherwise */
  public boolean isSetThe_map() {
    return this.the_map != null;
  }

  public void setThe_mapIsSet(boolean value) {
    if (!value) {
      this.the_map = null;
    }
  }

  public Simple getReq_simp() {
    return this.req_simp;
  }

  public Complex setReq_simp(Simple req_simp) {
    this.req_simp = req_simp;
    return this;
  }

  public void unsetReq_simp() {
    this.req_simp = null;
  }

  /** Returns true if field req_simp is set (has been assigned a value) and false otherwise */
  public boolean isSetReq_simp() {
    return this.req_simp != null;
  }

  public void setReq_simpIsSet(boolean value) {
    if (!value) {
      this.req_simp = null;
    }
  }

  public Simple getOpt_simp() {
    return this.opt_simp;
  }

  public Complex setOpt_simp(Simple opt_simp) {
    this.opt_simp = opt_simp;
    return this;
  }

  public void unsetOpt_simp() {
    this.opt_simp = null;
  }

  /** Returns true if field opt_simp is set (has been assigned a value) and false otherwise */
  public boolean isSetOpt_simp() {
    return this.opt_simp != null;
  }

  public void setOpt_simpIsSet(boolean value) {
    if (!value) {
      this.opt_simp = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CP_DEFAULT:
      if (value == null) {
        unsetCp_default();
      } else {
        setCp_default((Short)value);
      }
      break;

    case CP_REQUIRED:
      if (value == null) {
        unsetCp_required();
      } else {
        setCp_required((Short)value);
      }
      break;

    case CP_OPTIONAL:
      if (value == null) {
        unsetCp_optional();
      } else {
        setCp_optional((Short)value);
      }
      break;

    case THE_MAP:
      if (value == null) {
        unsetThe_map();
      } else {
        setThe_map((Map<Short,Simple>)value);
      }
      break;

    case REQ_SIMP:
      if (value == null) {
        unsetReq_simp();
      } else {
        setReq_simp((Simple)value);
      }
      break;

    case OPT_SIMP:
      if (value == null) {
        unsetOpt_simp();
      } else {
        setOpt_simp((Simple)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CP_DEFAULT:
      return getCp_default();

    case CP_REQUIRED:
      return getCp_required();

    case CP_OPTIONAL:
      return getCp_optional();

    case THE_MAP:
      return getThe_map();

    case REQ_SIMP:
      return getReq_simp();

    case OPT_SIMP:
      return getOpt_simp();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CP_DEFAULT:
      return isSetCp_default();
    case CP_REQUIRED:
      return isSetCp_required();
    case CP_OPTIONAL:
      return isSetCp_optional();
    case THE_MAP:
      return isSetThe_map();
    case REQ_SIMP:
      return isSetReq_simp();
    case OPT_SIMP:
      return isSetOpt_simp();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Complex)
      return this.equals((Complex)that);
    return false;
  }

  public boolean equals(Complex that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_cp_default = true;
    boolean that_present_cp_default = true;
    if (this_present_cp_default || that_present_cp_default) {
      if (!(this_present_cp_default && that_present_cp_default))
        return false;
      if (this.cp_default != that.cp_default)
        return false;
    }

    boolean this_present_cp_required = true;
    boolean that_present_cp_required = true;
    if (this_present_cp_required || that_present_cp_required) {
      if (!(this_present_cp_required && that_present_cp_required))
        return false;
      if (this.cp_required != that.cp_required)
        return false;
    }

    boolean this_present_cp_optional = true && this.isSetCp_optional();
    boolean that_present_cp_optional = true && that.isSetCp_optional();
    if (this_present_cp_optional || that_present_cp_optional) {
      if (!(this_present_cp_optional && that_present_cp_optional))
        return false;
      if (this.cp_optional != that.cp_optional)
        return false;
    }

    boolean this_present_the_map = true && this.isSetThe_map();
    boolean that_present_the_map = true && that.isSetThe_map();
    if (this_present_the_map || that_present_the_map) {
      if (!(this_present_the_map && that_present_the_map))
        return false;
      if (!this.the_map.equals(that.the_map))
        return false;
    }

    boolean this_present_req_simp = true && this.isSetReq_simp();
    boolean that_present_req_simp = true && that.isSetReq_simp();
    if (this_present_req_simp || that_present_req_simp) {
      if (!(this_present_req_simp && that_present_req_simp))
        return false;
      if (!this.req_simp.equals(that.req_simp))
        return false;
    }

    boolean this_present_opt_simp = true && this.isSetOpt_simp();
    boolean that_present_opt_simp = true && that.isSetOpt_simp();
    if (this_present_opt_simp || that_present_opt_simp) {
      if (!(this_present_opt_simp && that_present_opt_simp))
        return false;
      if (!this.opt_simp.equals(that.opt_simp))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + cp_default;

    hashCode = hashCode * 8191 + cp_required;

    hashCode = hashCode * 8191 + ((isSetCp_optional()) ? 131071 : 524287);
    if (isSetCp_optional())
      hashCode = hashCode * 8191 + cp_optional;

    hashCode = hashCode * 8191 + ((isSetThe_map()) ? 131071 : 524287);
    if (isSetThe_map())
      hashCode = hashCode * 8191 + the_map.hashCode();

    hashCode = hashCode * 8191 + ((isSetReq_simp()) ? 131071 : 524287);
    if (isSetReq_simp())
      hashCode = hashCode * 8191 + req_simp.hashCode();

    hashCode = hashCode * 8191 + ((isSetOpt_simp()) ? 131071 : 524287);
    if (isSetOpt_simp())
      hashCode = hashCode * 8191 + opt_simp.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Complex other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCp_default()).compareTo(other.isSetCp_default());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCp_default()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cp_default, other.cp_default);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCp_required()).compareTo(other.isSetCp_required());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCp_required()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cp_required, other.cp_required);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCp_optional()).compareTo(other.isSetCp_optional());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCp_optional()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cp_optional, other.cp_optional);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetThe_map()).compareTo(other.isSetThe_map());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetThe_map()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.the_map, other.the_map);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetReq_simp()).compareTo(other.isSetReq_simp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReq_simp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.req_simp, other.req_simp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOpt_simp()).compareTo(other.isSetOpt_simp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOpt_simp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.opt_simp, other.opt_simp);
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
    StringBuilder sb = new StringBuilder("Complex(");
    boolean first = true;

    sb.append("cp_default:");
    sb.append(this.cp_default);
    first = false;
    if (!first) sb.append(", ");
    sb.append("cp_required:");
    sb.append(this.cp_required);
    first = false;
    if (isSetCp_optional()) {
      if (!first) sb.append(", ");
      sb.append("cp_optional:");
      sb.append(this.cp_optional);
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("the_map:");
    if (this.the_map == null) {
      sb.append("null");
    } else {
      sb.append(this.the_map);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("req_simp:");
    if (this.req_simp == null) {
      sb.append("null");
    } else {
      sb.append(this.req_simp);
    }
    first = false;
    if (isSetOpt_simp()) {
      if (!first) sb.append(", ");
      sb.append("opt_simp:");
      if (this.opt_simp == null) {
        sb.append("null");
      } else {
        sb.append(this.opt_simp);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'cp_required' because it's a primitive and you chose the non-beans generator.
    if (req_simp == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'req_simp' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (req_simp != null) {
      req_simp.validate();
    }
    if (opt_simp != null) {
      opt_simp.validate();
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

  private static class ComplexStandardSchemeFactory implements SchemeFactory {
    public ComplexStandardScheme getScheme() {
      return new ComplexStandardScheme();
    }
  }

  private static class ComplexStandardScheme extends StandardScheme<Complex> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Complex struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CP_DEFAULT
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.cp_default = iprot.readI16();
              struct.setCp_defaultIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CP_REQUIRED
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.cp_required = iprot.readI16();
              struct.setCp_requiredIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CP_OPTIONAL
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.cp_optional = iprot.readI16();
              struct.setCp_optionalIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // THE_MAP
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map18 = iprot.readMapBegin();
                struct.the_map = new HashMap<Short,Simple>(2*_map18.size);
                short _key19;
                Simple _val20;
                for (int _i21 = 0; _i21 < _map18.size; ++_i21)
                {
                  _key19 = iprot.readI16();
                  _val20 = new Simple();
                  _val20.read(iprot);
                  struct.the_map.put(_key19, _val20);
                }
                iprot.readMapEnd();
              }
              struct.setThe_mapIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // REQ_SIMP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.req_simp = new Simple();
              struct.req_simp.read(iprot);
              struct.setReq_simpIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // OPT_SIMP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.opt_simp = new Simple();
              struct.opt_simp.read(iprot);
              struct.setOpt_simpIsSet(true);
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
      if (!struct.isSetCp_required()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'cp_required' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Complex struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(CP_DEFAULT_FIELD_DESC);
      oprot.writeI16(struct.cp_default);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CP_REQUIRED_FIELD_DESC);
      oprot.writeI16(struct.cp_required);
      oprot.writeFieldEnd();
      if (struct.isSetCp_optional()) {
        oprot.writeFieldBegin(CP_OPTIONAL_FIELD_DESC);
        oprot.writeI16(struct.cp_optional);
        oprot.writeFieldEnd();
      }
      if (struct.the_map != null) {
        oprot.writeFieldBegin(THE_MAP_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I16, org.apache.thrift.protocol.TType.STRUCT, struct.the_map.size()));
          for (Map.Entry<Short, Simple> _iter22 : struct.the_map.entrySet())
          {
            oprot.writeI16(_iter22.getKey());
            _iter22.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.req_simp != null) {
        oprot.writeFieldBegin(REQ_SIMP_FIELD_DESC);
        struct.req_simp.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.opt_simp != null) {
        if (struct.isSetOpt_simp()) {
          oprot.writeFieldBegin(OPT_SIMP_FIELD_DESC);
          struct.opt_simp.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ComplexTupleSchemeFactory implements SchemeFactory {
    public ComplexTupleScheme getScheme() {
      return new ComplexTupleScheme();
    }
  }

  private static class ComplexTupleScheme extends TupleScheme<Complex> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Complex struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI16(struct.cp_required);
      struct.req_simp.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetCp_default()) {
        optionals.set(0);
      }
      if (struct.isSetCp_optional()) {
        optionals.set(1);
      }
      if (struct.isSetThe_map()) {
        optionals.set(2);
      }
      if (struct.isSetOpt_simp()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetCp_default()) {
        oprot.writeI16(struct.cp_default);
      }
      if (struct.isSetCp_optional()) {
        oprot.writeI16(struct.cp_optional);
      }
      if (struct.isSetThe_map()) {
        {
          oprot.writeI32(struct.the_map.size());
          for (Map.Entry<Short, Simple> _iter23 : struct.the_map.entrySet())
          {
            oprot.writeI16(_iter23.getKey());
            _iter23.getValue().write(oprot);
          }
        }
      }
      if (struct.isSetOpt_simp()) {
        struct.opt_simp.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Complex struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.cp_required = iprot.readI16();
      struct.setCp_requiredIsSet(true);
      struct.req_simp = new Simple();
      struct.req_simp.read(iprot);
      struct.setReq_simpIsSet(true);
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.cp_default = iprot.readI16();
        struct.setCp_defaultIsSet(true);
      }
      if (incoming.get(1)) {
        struct.cp_optional = iprot.readI16();
        struct.setCp_optionalIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TMap _map24 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I16, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.the_map = new HashMap<Short,Simple>(2*_map24.size);
          short _key25;
          Simple _val26;
          for (int _i27 = 0; _i27 < _map24.size; ++_i27)
          {
            _key25 = iprot.readI16();
            _val26 = new Simple();
            _val26.read(iprot);
            struct.the_map.put(_key25, _val26);
          }
        }
        struct.setThe_mapIsSet(true);
      }
      if (incoming.get(3)) {
        struct.opt_simp = new Simple();
        struct.opt_simp.read(iprot);
        struct.setOpt_simpIsSet(true);
      }
    }
  }

  private static <S extends IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}


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
public class StructWithASomemap implements org.apache.thrift.TBase<StructWithASomemap, StructWithASomemap._Fields>, java.io.Serializable, Cloneable, Comparable<StructWithASomemap> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("StructWithASomemap");

  private static final org.apache.thrift.protocol.TField SOMEMAP_FIELD_FIELD_DESC = new org.apache.thrift.protocol.TField("somemap_field", org.apache.thrift.protocol.TType.MAP, (short)1);

  private static final SchemeFactory STANDARD_SCHEME_FACTORY = new StructWithASomemapStandardSchemeFactory();
  private static final SchemeFactory TUPLE_SCHEME_FACTORY = new StructWithASomemapTupleSchemeFactory();

  public Map<Integer,Integer> somemap_field; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SOMEMAP_FIELD((short)1, "somemap_field");

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
        case 1: // SOMEMAP_FIELD
          return SOMEMAP_FIELD;
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
    tmpMap.put(_Fields.SOMEMAP_FIELD, new org.apache.thrift.meta_data.FieldMetaData("somemap_field", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.MAP        , "SomeMap")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(StructWithASomemap.class, metaDataMap);
  }

  public StructWithASomemap() {
  }

  public StructWithASomemap(
    Map<Integer,Integer> somemap_field)
  {
    this();
    this.somemap_field = somemap_field;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StructWithASomemap(StructWithASomemap other) {
    if (other.isSetSomemap_field()) {
      Map<Integer,Integer> __this__somemap_field = new HashMap<Integer,Integer>(other.somemap_field);
      this.somemap_field = __this__somemap_field;
    }
  }

  public StructWithASomemap deepCopy() {
    return new StructWithASomemap(this);
  }

  @Override
  public void clear() {
    this.somemap_field = null;
  }

  public int getSomemap_fieldSize() {
    return (this.somemap_field == null) ? 0 : this.somemap_field.size();
  }

  public void putToSomemap_field(int key, int val) {
    if (this.somemap_field == null) {
      this.somemap_field = new HashMap<Integer,Integer>();
    }
    this.somemap_field.put(key, val);
  }

  public Map<Integer,Integer> getSomemap_field() {
    return this.somemap_field;
  }

  public StructWithASomemap setSomemap_field(Map<Integer,Integer> somemap_field) {
    this.somemap_field = somemap_field;
    return this;
  }

  public void unsetSomemap_field() {
    this.somemap_field = null;
  }

  /** Returns true if field somemap_field is set (has been assigned a value) and false otherwise */
  public boolean isSetSomemap_field() {
    return this.somemap_field != null;
  }

  public void setSomemap_fieldIsSet(boolean value) {
    if (!value) {
      this.somemap_field = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SOMEMAP_FIELD:
      if (value == null) {
        unsetSomemap_field();
      } else {
        setSomemap_field((Map<Integer,Integer>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SOMEMAP_FIELD:
      return getSomemap_field();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SOMEMAP_FIELD:
      return isSetSomemap_field();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof StructWithASomemap)
      return this.equals((StructWithASomemap)that);
    return false;
  }

  public boolean equals(StructWithASomemap that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_somemap_field = true && this.isSetSomemap_field();
    boolean that_present_somemap_field = true && that.isSetSomemap_field();
    if (this_present_somemap_field || that_present_somemap_field) {
      if (!(this_present_somemap_field && that_present_somemap_field))
        return false;
      if (!this.somemap_field.equals(that.somemap_field))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSomemap_field()) ? 131071 : 524287);
    if (isSetSomemap_field())
      hashCode = hashCode * 8191 + somemap_field.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(StructWithASomemap other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSomemap_field()).compareTo(other.isSetSomemap_field());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSomemap_field()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.somemap_field, other.somemap_field);
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
    StringBuilder sb = new StringBuilder("StructWithASomemap(");
    boolean first = true;

    sb.append("somemap_field:");
    if (this.somemap_field == null) {
      sb.append("null");
    } else {
      sb.append(this.somemap_field);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (somemap_field == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'somemap_field' was not present! Struct: " + toString());
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class StructWithASomemapStandardSchemeFactory implements SchemeFactory {
    public StructWithASomemapStandardScheme getScheme() {
      return new StructWithASomemapStandardScheme();
    }
  }

  private static class StructWithASomemapStandardScheme extends StandardScheme<StructWithASomemap> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, StructWithASomemap struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SOMEMAP_FIELD
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map706 = iprot.readMapBegin();
                struct.somemap_field = new HashMap<Integer,Integer>(2*_map706.size);
                int _key707;
                int _val708;
                for (int _i709 = 0; _i709 < _map706.size; ++_i709)
                {
                  _key707 = iprot.readI32();
                  _val708 = iprot.readI32();
                  struct.somemap_field.put(_key707, _val708);
                }
                iprot.readMapEnd();
              }
              struct.setSomemap_fieldIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, StructWithASomemap struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.somemap_field != null) {
        oprot.writeFieldBegin(SOMEMAP_FIELD_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.I32, struct.somemap_field.size()));
          for (Map.Entry<Integer, Integer> _iter710 : struct.somemap_field.entrySet())
          {
            oprot.writeI32(_iter710.getKey());
            oprot.writeI32(_iter710.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class StructWithASomemapTupleSchemeFactory implements SchemeFactory {
    public StructWithASomemapTupleScheme getScheme() {
      return new StructWithASomemapTupleScheme();
    }
  }

  private static class StructWithASomemapTupleScheme extends TupleScheme<StructWithASomemap> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, StructWithASomemap struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.somemap_field.size());
        for (Map.Entry<Integer, Integer> _iter711 : struct.somemap_field.entrySet())
        {
          oprot.writeI32(_iter711.getKey());
          oprot.writeI32(_iter711.getValue());
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, StructWithASomemap struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TMap _map712 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.I32, iprot.readI32());
        struct.somemap_field = new HashMap<Integer,Integer>(2*_map712.size);
        int _key713;
        int _val714;
        for (int _i715 = 0; _i715 < _map712.size; ++_i715)
        {
          _key713 = iprot.readI32();
          _val714 = iprot.readI32();
          struct.somemap_field.put(_key713, _val714);
        }
      }
      struct.setSomemap_fieldIsSet(true);
    }
  }

  private static <S extends IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}


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
public class ExceptionWithAMap extends org.apache.thrift.TException implements org.apache.thrift.TBase<ExceptionWithAMap, ExceptionWithAMap._Fields>, java.io.Serializable, Cloneable, Comparable<ExceptionWithAMap> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ExceptionWithAMap");

  private static final org.apache.thrift.protocol.TField BLAH_FIELD_DESC = new org.apache.thrift.protocol.TField("blah", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField MAP_FIELD_FIELD_DESC = new org.apache.thrift.protocol.TField("map_field", org.apache.thrift.protocol.TType.MAP, (short)2);

  private static final SchemeFactory STANDARD_SCHEME_FACTORY = new ExceptionWithAMapStandardSchemeFactory();
  private static final SchemeFactory TUPLE_SCHEME_FACTORY = new ExceptionWithAMapTupleSchemeFactory();

  public String blah; // required
  public Map<String,String> map_field; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BLAH((short)1, "blah"),
    MAP_FIELD((short)2, "map_field");

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
        case 2: // MAP_FIELD
          return MAP_FIELD;
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
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MAP_FIELD, new org.apache.thrift.meta_data.FieldMetaData("map_field", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ExceptionWithAMap.class, metaDataMap);
  }

  public ExceptionWithAMap() {
  }

  public ExceptionWithAMap(
    String blah,
    Map<String,String> map_field)
  {
    this();
    this.blah = blah;
    this.map_field = map_field;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ExceptionWithAMap(ExceptionWithAMap other) {
    if (other.isSetBlah()) {
      this.blah = other.blah;
    }
    if (other.isSetMap_field()) {
      Map<String,String> __this__map_field = new HashMap<String,String>(other.map_field);
      this.map_field = __this__map_field;
    }
  }

  public ExceptionWithAMap deepCopy() {
    return new ExceptionWithAMap(this);
  }

  @Override
  public void clear() {
    this.blah = null;
    this.map_field = null;
  }

  public String getBlah() {
    return this.blah;
  }

  public ExceptionWithAMap setBlah(String blah) {
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

  public int getMap_fieldSize() {
    return (this.map_field == null) ? 0 : this.map_field.size();
  }

  public void putToMap_field(String key, String val) {
    if (this.map_field == null) {
      this.map_field = new HashMap<String,String>();
    }
    this.map_field.put(key, val);
  }

  public Map<String,String> getMap_field() {
    return this.map_field;
  }

  public ExceptionWithAMap setMap_field(Map<String,String> map_field) {
    this.map_field = map_field;
    return this;
  }

  public void unsetMap_field() {
    this.map_field = null;
  }

  /** Returns true if field map_field is set (has been assigned a value) and false otherwise */
  public boolean isSetMap_field() {
    return this.map_field != null;
  }

  public void setMap_fieldIsSet(boolean value) {
    if (!value) {
      this.map_field = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BLAH:
      if (value == null) {
        unsetBlah();
      } else {
        setBlah((String)value);
      }
      break;

    case MAP_FIELD:
      if (value == null) {
        unsetMap_field();
      } else {
        setMap_field((Map<String,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BLAH:
      return getBlah();

    case MAP_FIELD:
      return getMap_field();

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
    case MAP_FIELD:
      return isSetMap_field();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ExceptionWithAMap)
      return this.equals((ExceptionWithAMap)that);
    return false;
  }

  public boolean equals(ExceptionWithAMap that) {
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

    boolean this_present_map_field = true && this.isSetMap_field();
    boolean that_present_map_field = true && that.isSetMap_field();
    if (this_present_map_field || that_present_map_field) {
      if (!(this_present_map_field && that_present_map_field))
        return false;
      if (!this.map_field.equals(that.map_field))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetBlah()) ? 131071 : 524287);
    if (isSetBlah())
      hashCode = hashCode * 8191 + blah.hashCode();

    hashCode = hashCode * 8191 + ((isSetMap_field()) ? 131071 : 524287);
    if (isSetMap_field())
      hashCode = hashCode * 8191 + map_field.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ExceptionWithAMap other) {
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
    lastComparison = Boolean.valueOf(isSetMap_field()).compareTo(other.isSetMap_field());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMap_field()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.map_field, other.map_field);
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
    StringBuilder sb = new StringBuilder("ExceptionWithAMap(");
    boolean first = true;

    sb.append("blah:");
    if (this.blah == null) {
      sb.append("null");
    } else {
      sb.append(this.blah);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("map_field:");
    if (this.map_field == null) {
      sb.append("null");
    } else {
      sb.append(this.map_field);
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

  private static class ExceptionWithAMapStandardSchemeFactory implements SchemeFactory {
    public ExceptionWithAMapStandardScheme getScheme() {
      return new ExceptionWithAMapStandardScheme();
    }
  }

  private static class ExceptionWithAMapStandardScheme extends StandardScheme<ExceptionWithAMap> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ExceptionWithAMap struct) throws org.apache.thrift.TException {
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
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.blah = iprot.readString();
              struct.setBlahIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MAP_FIELD
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map500 = iprot.readMapBegin();
                struct.map_field = new HashMap<String,String>(2*_map500.size);
                String _key501;
                String _val502;
                for (int _i503 = 0; _i503 < _map500.size; ++_i503)
                {
                  _key501 = iprot.readString();
                  _val502 = iprot.readString();
                  struct.map_field.put(_key501, _val502);
                }
                iprot.readMapEnd();
              }
              struct.setMap_fieldIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ExceptionWithAMap struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.blah != null) {
        oprot.writeFieldBegin(BLAH_FIELD_DESC);
        oprot.writeString(struct.blah);
        oprot.writeFieldEnd();
      }
      if (struct.map_field != null) {
        oprot.writeFieldBegin(MAP_FIELD_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.map_field.size()));
          for (Map.Entry<String, String> _iter504 : struct.map_field.entrySet())
          {
            oprot.writeString(_iter504.getKey());
            oprot.writeString(_iter504.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ExceptionWithAMapTupleSchemeFactory implements SchemeFactory {
    public ExceptionWithAMapTupleScheme getScheme() {
      return new ExceptionWithAMapTupleScheme();
    }
  }

  private static class ExceptionWithAMapTupleScheme extends TupleScheme<ExceptionWithAMap> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ExceptionWithAMap struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBlah()) {
        optionals.set(0);
      }
      if (struct.isSetMap_field()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetBlah()) {
        oprot.writeString(struct.blah);
      }
      if (struct.isSetMap_field()) {
        {
          oprot.writeI32(struct.map_field.size());
          for (Map.Entry<String, String> _iter505 : struct.map_field.entrySet())
          {
            oprot.writeString(_iter505.getKey());
            oprot.writeString(_iter505.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ExceptionWithAMap struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.blah = iprot.readString();
        struct.setBlahIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map506 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.map_field = new HashMap<String,String>(2*_map506.size);
          String _key507;
          String _val508;
          for (int _i509 = 0; _i509 < _map506.size; ++_i509)
          {
            _key507 = iprot.readString();
            _val508 = iprot.readString();
            struct.map_field.put(_key507, _val508);
          }
        }
        struct.setMap_fieldIsSet(true);
      }
    }
  }

  private static <S extends IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}


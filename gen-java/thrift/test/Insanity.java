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
public class Insanity implements org.apache.thrift.TBase<Insanity, Insanity._Fields>, java.io.Serializable, Cloneable, Comparable<Insanity> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Insanity");

  private static final org.apache.thrift.protocol.TField USER_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("userMap", org.apache.thrift.protocol.TType.MAP, (short)1);
  private static final org.apache.thrift.protocol.TField XTRUCTS_FIELD_DESC = new org.apache.thrift.protocol.TField("xtructs", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final SchemeFactory STANDARD_SCHEME_FACTORY = new InsanityStandardSchemeFactory();
  private static final SchemeFactory TUPLE_SCHEME_FACTORY = new InsanityTupleSchemeFactory();

  public Map<Numberz,Long> userMap; // required
  public List<Xtruct> xtructs; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER_MAP((short)1, "userMap"),
    XTRUCTS((short)2, "xtructs");

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
        case 1: // USER_MAP
          return USER_MAP;
        case 2: // XTRUCTS
          return XTRUCTS;
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
    tmpMap.put(_Fields.USER_MAP, new org.apache.thrift.meta_data.FieldMetaData("userMap", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, Numberz.class), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64            , "UserId"))));
    tmpMap.put(_Fields.XTRUCTS, new org.apache.thrift.meta_data.FieldMetaData("xtructs", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Xtruct.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Insanity.class, metaDataMap);
  }

  public Insanity() {
  }

  public Insanity(
    Map<Numberz,Long> userMap,
    List<Xtruct> xtructs)
  {
    this();
    this.userMap = userMap;
    this.xtructs = xtructs;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Insanity(Insanity other) {
    if (other.isSetUserMap()) {
      Map<Numberz,Long> __this__userMap = new HashMap<Numberz,Long>(other.userMap.size());
      for (Map.Entry<Numberz, Long> other_element : other.userMap.entrySet()) {

        Numberz other_element_key = other_element.getKey();
        Long other_element_value = other_element.getValue();

        Numberz __this__userMap_copy_key = other_element_key;

        Long __this__userMap_copy_value = other_element_value;

        __this__userMap.put(__this__userMap_copy_key, __this__userMap_copy_value);
      }
      this.userMap = __this__userMap;
    }
    if (other.isSetXtructs()) {
      List<Xtruct> __this__xtructs = new ArrayList<Xtruct>(other.xtructs.size());
      for (Xtruct other_element : other.xtructs) {
        __this__xtructs.add(new Xtruct(other_element));
      }
      this.xtructs = __this__xtructs;
    }
  }

  public Insanity deepCopy() {
    return new Insanity(this);
  }

  @Override
  public void clear() {
    this.userMap = null;
    this.xtructs = null;
  }

  public int getUserMapSize() {
    return (this.userMap == null) ? 0 : this.userMap.size();
  }

  public void putToUserMap(Numberz key, long val) {
    if (this.userMap == null) {
      this.userMap = new HashMap<Numberz,Long>();
    }
    this.userMap.put(key, val);
  }

  public Map<Numberz,Long> getUserMap() {
    return this.userMap;
  }

  public Insanity setUserMap(Map<Numberz,Long> userMap) {
    this.userMap = userMap;
    return this;
  }

  public void unsetUserMap() {
    this.userMap = null;
  }

  /** Returns true if field userMap is set (has been assigned a value) and false otherwise */
  public boolean isSetUserMap() {
    return this.userMap != null;
  }

  public void setUserMapIsSet(boolean value) {
    if (!value) {
      this.userMap = null;
    }
  }

  public int getXtructsSize() {
    return (this.xtructs == null) ? 0 : this.xtructs.size();
  }

  public java.util.Iterator<Xtruct> getXtructsIterator() {
    return (this.xtructs == null) ? null : this.xtructs.iterator();
  }

  public void addToXtructs(Xtruct elem) {
    if (this.xtructs == null) {
      this.xtructs = new ArrayList<Xtruct>();
    }
    this.xtructs.add(elem);
  }

  public List<Xtruct> getXtructs() {
    return this.xtructs;
  }

  public Insanity setXtructs(List<Xtruct> xtructs) {
    this.xtructs = xtructs;
    return this;
  }

  public void unsetXtructs() {
    this.xtructs = null;
  }

  /** Returns true if field xtructs is set (has been assigned a value) and false otherwise */
  public boolean isSetXtructs() {
    return this.xtructs != null;
  }

  public void setXtructsIsSet(boolean value) {
    if (!value) {
      this.xtructs = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case USER_MAP:
      if (value == null) {
        unsetUserMap();
      } else {
        setUserMap((Map<Numberz,Long>)value);
      }
      break;

    case XTRUCTS:
      if (value == null) {
        unsetXtructs();
      } else {
        setXtructs((List<Xtruct>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case USER_MAP:
      return getUserMap();

    case XTRUCTS:
      return getXtructs();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case USER_MAP:
      return isSetUserMap();
    case XTRUCTS:
      return isSetXtructs();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Insanity)
      return this.equals((Insanity)that);
    return false;
  }

  public boolean equals(Insanity that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_userMap = true && this.isSetUserMap();
    boolean that_present_userMap = true && that.isSetUserMap();
    if (this_present_userMap || that_present_userMap) {
      if (!(this_present_userMap && that_present_userMap))
        return false;
      if (!this.userMap.equals(that.userMap))
        return false;
    }

    boolean this_present_xtructs = true && this.isSetXtructs();
    boolean that_present_xtructs = true && that.isSetXtructs();
    if (this_present_xtructs || that_present_xtructs) {
      if (!(this_present_xtructs && that_present_xtructs))
        return false;
      if (!this.xtructs.equals(that.xtructs))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUserMap()) ? 131071 : 524287);
    if (isSetUserMap())
      hashCode = hashCode * 8191 + userMap.hashCode();

    hashCode = hashCode * 8191 + ((isSetXtructs()) ? 131071 : 524287);
    if (isSetXtructs())
      hashCode = hashCode * 8191 + xtructs.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Insanity other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUserMap()).compareTo(other.isSetUserMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserMap()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userMap, other.userMap);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetXtructs()).compareTo(other.isSetXtructs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetXtructs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.xtructs, other.xtructs);
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
    StringBuilder sb = new StringBuilder("Insanity(");
    boolean first = true;

    sb.append("userMap:");
    if (this.userMap == null) {
      sb.append("null");
    } else {
      sb.append(this.userMap);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("xtructs:");
    if (this.xtructs == null) {
      sb.append("null");
    } else {
      sb.append(this.xtructs);
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

  private static class InsanityStandardSchemeFactory implements SchemeFactory {
    public InsanityStandardScheme getScheme() {
      return new InsanityStandardScheme();
    }
  }

  private static class InsanityStandardScheme extends StandardScheme<Insanity> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Insanity struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USER_MAP
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.userMap = new HashMap<Numberz,Long>(2*_map0.size);
                Numberz _key1;
                long _val2;
                for (int _i3 = 0; _i3 < _map0.size; ++_i3)
                {
                  _key1 = thrift.test.Numberz.findByValue(iprot.readI32());
                  _val2 = iprot.readI64();
                  struct.userMap.put(_key1, _val2);
                }
                iprot.readMapEnd();
              }
              struct.setUserMapIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // XTRUCTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list4 = iprot.readListBegin();
                struct.xtructs = new ArrayList<Xtruct>(_list4.size);
                Xtruct _elem5;
                for (int _i6 = 0; _i6 < _list4.size; ++_i6)
                {
                  _elem5 = new Xtruct();
                  _elem5.read(iprot);
                  struct.xtructs.add(_elem5);
                }
                iprot.readListEnd();
              }
              struct.setXtructsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Insanity struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.userMap != null) {
        oprot.writeFieldBegin(USER_MAP_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.I64, struct.userMap.size()));
          for (Map.Entry<Numberz, Long> _iter7 : struct.userMap.entrySet())
          {
            oprot.writeI32(_iter7.getKey().getValue());
            oprot.writeI64(_iter7.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.xtructs != null) {
        oprot.writeFieldBegin(XTRUCTS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.xtructs.size()));
          for (Xtruct _iter8 : struct.xtructs)
          {
            _iter8.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class InsanityTupleSchemeFactory implements SchemeFactory {
    public InsanityTupleScheme getScheme() {
      return new InsanityTupleScheme();
    }
  }

  private static class InsanityTupleScheme extends TupleScheme<Insanity> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Insanity struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUserMap()) {
        optionals.set(0);
      }
      if (struct.isSetXtructs()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUserMap()) {
        {
          oprot.writeI32(struct.userMap.size());
          for (Map.Entry<Numberz, Long> _iter9 : struct.userMap.entrySet())
          {
            oprot.writeI32(_iter9.getKey().getValue());
            oprot.writeI64(_iter9.getValue());
          }
        }
      }
      if (struct.isSetXtructs()) {
        {
          oprot.writeI32(struct.xtructs.size());
          for (Xtruct _iter10 : struct.xtructs)
          {
            _iter10.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Insanity struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map11 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.I64, iprot.readI32());
          struct.userMap = new HashMap<Numberz,Long>(2*_map11.size);
          Numberz _key12;
          long _val13;
          for (int _i14 = 0; _i14 < _map11.size; ++_i14)
          {
            _key12 = thrift.test.Numberz.findByValue(iprot.readI32());
            _val13 = iprot.readI64();
            struct.userMap.put(_key12, _val13);
          }
        }
        struct.setUserMapIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list15 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.xtructs = new ArrayList<Xtruct>(_list15.size);
          Xtruct _elem16;
          for (int _i17 = 0; _i17 < _list15.size; ++_i17)
          {
            _elem16 = new Xtruct();
            _elem16.read(iprot);
            struct.xtructs.add(_elem16);
          }
        }
        struct.setXtructsIsSet(true);
      }
    }
  }

  private static <S extends IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}


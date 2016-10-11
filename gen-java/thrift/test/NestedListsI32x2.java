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
public class NestedListsI32x2 implements org.apache.thrift.TBase<NestedListsI32x2, NestedListsI32x2._Fields>, java.io.Serializable, Cloneable, Comparable<NestedListsI32x2> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("NestedListsI32x2");

  private static final org.apache.thrift.protocol.TField INTEGERLIST_FIELD_DESC = new org.apache.thrift.protocol.TField("integerlist", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final SchemeFactory STANDARD_SCHEME_FACTORY = new NestedListsI32x2StandardSchemeFactory();
  private static final SchemeFactory TUPLE_SCHEME_FACTORY = new NestedListsI32x2TupleSchemeFactory();

  public List<List<Integer>> integerlist; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    INTEGERLIST((short)1, "integerlist");

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
        case 1: // INTEGERLIST
          return INTEGERLIST;
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
    tmpMap.put(_Fields.INTEGERLIST, new org.apache.thrift.meta_data.FieldMetaData("integerlist", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(NestedListsI32x2.class, metaDataMap);
  }

  public NestedListsI32x2() {
  }

  public NestedListsI32x2(
    List<List<Integer>> integerlist)
  {
    this();
    this.integerlist = integerlist;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public NestedListsI32x2(NestedListsI32x2 other) {
    if (other.isSetIntegerlist()) {
      List<List<Integer>> __this__integerlist = new ArrayList<List<Integer>>(other.integerlist.size());
      for (List<Integer> other_element : other.integerlist) {
        List<Integer> __this__integerlist_copy = new ArrayList<Integer>(other_element);
        __this__integerlist.add(__this__integerlist_copy);
      }
      this.integerlist = __this__integerlist;
    }
  }

  public NestedListsI32x2 deepCopy() {
    return new NestedListsI32x2(this);
  }

  @Override
  public void clear() {
    this.integerlist = null;
  }

  public int getIntegerlistSize() {
    return (this.integerlist == null) ? 0 : this.integerlist.size();
  }

  public java.util.Iterator<List<Integer>> getIntegerlistIterator() {
    return (this.integerlist == null) ? null : this.integerlist.iterator();
  }

  public void addToIntegerlist(List<Integer> elem) {
    if (this.integerlist == null) {
      this.integerlist = new ArrayList<List<Integer>>();
    }
    this.integerlist.add(elem);
  }

  public List<List<Integer>> getIntegerlist() {
    return this.integerlist;
  }

  public NestedListsI32x2 setIntegerlist(List<List<Integer>> integerlist) {
    this.integerlist = integerlist;
    return this;
  }

  public void unsetIntegerlist() {
    this.integerlist = null;
  }

  /** Returns true if field integerlist is set (has been assigned a value) and false otherwise */
  public boolean isSetIntegerlist() {
    return this.integerlist != null;
  }

  public void setIntegerlistIsSet(boolean value) {
    if (!value) {
      this.integerlist = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case INTEGERLIST:
      if (value == null) {
        unsetIntegerlist();
      } else {
        setIntegerlist((List<List<Integer>>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case INTEGERLIST:
      return getIntegerlist();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case INTEGERLIST:
      return isSetIntegerlist();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof NestedListsI32x2)
      return this.equals((NestedListsI32x2)that);
    return false;
  }

  public boolean equals(NestedListsI32x2 that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_integerlist = true && this.isSetIntegerlist();
    boolean that_present_integerlist = true && that.isSetIntegerlist();
    if (this_present_integerlist || that_present_integerlist) {
      if (!(this_present_integerlist && that_present_integerlist))
        return false;
      if (!this.integerlist.equals(that.integerlist))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetIntegerlist()) ? 131071 : 524287);
    if (isSetIntegerlist())
      hashCode = hashCode * 8191 + integerlist.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(NestedListsI32x2 other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetIntegerlist()).compareTo(other.isSetIntegerlist());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIntegerlist()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.integerlist, other.integerlist);
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
    StringBuilder sb = new StringBuilder("NestedListsI32x2(");
    boolean first = true;

    sb.append("integerlist:");
    if (this.integerlist == null) {
      sb.append("null");
    } else {
      sb.append(this.integerlist);
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

  private static class NestedListsI32x2StandardSchemeFactory implements SchemeFactory {
    public NestedListsI32x2StandardScheme getScheme() {
      return new NestedListsI32x2StandardScheme();
    }
  }

  private static class NestedListsI32x2StandardScheme extends StandardScheme<NestedListsI32x2> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, NestedListsI32x2 struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // INTEGERLIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list156 = iprot.readListBegin();
                struct.integerlist = new ArrayList<List<Integer>>(_list156.size);
                List<Integer> _elem157;
                for (int _i158 = 0; _i158 < _list156.size; ++_i158)
                {
                  {
                    org.apache.thrift.protocol.TList _list159 = iprot.readListBegin();
                    _elem157 = new ArrayList<Integer>(_list159.size);
                    int _elem160;
                    for (int _i161 = 0; _i161 < _list159.size; ++_i161)
                    {
                      _elem160 = iprot.readI32();
                      _elem157.add(_elem160);
                    }
                    iprot.readListEnd();
                  }
                  struct.integerlist.add(_elem157);
                }
                iprot.readListEnd();
              }
              struct.setIntegerlistIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, NestedListsI32x2 struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.integerlist != null) {
        oprot.writeFieldBegin(INTEGERLIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, struct.integerlist.size()));
          for (List<Integer> _iter162 : struct.integerlist)
          {
            {
              oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, _iter162.size()));
              for (int _iter163 : _iter162)
              {
                oprot.writeI32(_iter163);
              }
              oprot.writeListEnd();
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

  private static class NestedListsI32x2TupleSchemeFactory implements SchemeFactory {
    public NestedListsI32x2TupleScheme getScheme() {
      return new NestedListsI32x2TupleScheme();
    }
  }

  private static class NestedListsI32x2TupleScheme extends TupleScheme<NestedListsI32x2> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, NestedListsI32x2 struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetIntegerlist()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetIntegerlist()) {
        {
          oprot.writeI32(struct.integerlist.size());
          for (List<Integer> _iter164 : struct.integerlist)
          {
            {
              oprot.writeI32(_iter164.size());
              for (int _iter165 : _iter164)
              {
                oprot.writeI32(_iter165);
              }
            }
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, NestedListsI32x2 struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list166 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, iprot.readI32());
          struct.integerlist = new ArrayList<List<Integer>>(_list166.size);
          List<Integer> _elem167;
          for (int _i168 = 0; _i168 < _list166.size; ++_i168)
          {
            {
              org.apache.thrift.protocol.TList _list169 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
              _elem167 = new ArrayList<Integer>(_list169.size);
              int _elem170;
              for (int _i171 = 0; _i171 < _list169.size; ++_i171)
              {
                _elem170 = iprot.readI32();
                _elem167.add(_elem170);
              }
            }
            struct.integerlist.add(_elem167);
          }
        }
        struct.setIntegerlistIsSet(true);
      }
    }
  }

  private static <S extends IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

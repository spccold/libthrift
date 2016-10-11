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
public class ListDoublePerf implements org.apache.thrift.TBase<ListDoublePerf, ListDoublePerf._Fields>, java.io.Serializable, Cloneable, Comparable<ListDoublePerf> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ListDoublePerf");

  private static final org.apache.thrift.protocol.TField FIELD_FIELD_DESC = new org.apache.thrift.protocol.TField("field", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final SchemeFactory STANDARD_SCHEME_FACTORY = new ListDoublePerfStandardSchemeFactory();
  private static final SchemeFactory TUPLE_SCHEME_FACTORY = new ListDoublePerfTupleSchemeFactory();

  public List<Double> field; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FIELD((short)1, "field");

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
        case 1: // FIELD
          return FIELD;
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
    tmpMap.put(_Fields.FIELD, new org.apache.thrift.meta_data.FieldMetaData("field", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ListDoublePerf.class, metaDataMap);
  }

  public ListDoublePerf() {
  }

  public ListDoublePerf(
    List<Double> field)
  {
    this();
    this.field = field;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ListDoublePerf(ListDoublePerf other) {
    if (other.isSetField()) {
      List<Double> __this__field = new ArrayList<Double>(other.field);
      this.field = __this__field;
    }
  }

  public ListDoublePerf deepCopy() {
    return new ListDoublePerf(this);
  }

  @Override
  public void clear() {
    this.field = null;
  }

  public int getFieldSize() {
    return (this.field == null) ? 0 : this.field.size();
  }

  public java.util.Iterator<Double> getFieldIterator() {
    return (this.field == null) ? null : this.field.iterator();
  }

  public void addToField(double elem) {
    if (this.field == null) {
      this.field = new ArrayList<Double>();
    }
    this.field.add(elem);
  }

  public List<Double> getField() {
    return this.field;
  }

  public ListDoublePerf setField(List<Double> field) {
    this.field = field;
    return this;
  }

  public void unsetField() {
    this.field = null;
  }

  /** Returns true if field field is set (has been assigned a value) and false otherwise */
  public boolean isSetField() {
    return this.field != null;
  }

  public void setFieldIsSet(boolean value) {
    if (!value) {
      this.field = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FIELD:
      if (value == null) {
        unsetField();
      } else {
        setField((List<Double>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FIELD:
      return getField();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FIELD:
      return isSetField();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ListDoublePerf)
      return this.equals((ListDoublePerf)that);
    return false;
  }

  public boolean equals(ListDoublePerf that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_field = true && this.isSetField();
    boolean that_present_field = true && that.isSetField();
    if (this_present_field || that_present_field) {
      if (!(this_present_field && that_present_field))
        return false;
      if (!this.field.equals(that.field))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetField()) ? 131071 : 524287);
    if (isSetField())
      hashCode = hashCode * 8191 + field.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ListDoublePerf other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetField()).compareTo(other.isSetField());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetField()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.field, other.field);
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
    StringBuilder sb = new StringBuilder("ListDoublePerf(");
    boolean first = true;

    sb.append("field:");
    if (this.field == null) {
      sb.append("null");
    } else {
      sb.append(this.field);
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

  private static class ListDoublePerfStandardSchemeFactory implements SchemeFactory {
    public ListDoublePerfStandardScheme getScheme() {
      return new ListDoublePerfStandardScheme();
    }
  }

  private static class ListDoublePerfStandardScheme extends StandardScheme<ListDoublePerf> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ListDoublePerf struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FIELD
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list716 = iprot.readListBegin();
                struct.field = new ArrayList<Double>(_list716.size);
                double _elem717;
                for (int _i718 = 0; _i718 < _list716.size; ++_i718)
                {
                  _elem717 = iprot.readDouble();
                  struct.field.add(_elem717);
                }
                iprot.readListEnd();
              }
              struct.setFieldIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ListDoublePerf struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.field != null) {
        oprot.writeFieldBegin(FIELD_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, struct.field.size()));
          for (double _iter719 : struct.field)
          {
            oprot.writeDouble(_iter719);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ListDoublePerfTupleSchemeFactory implements SchemeFactory {
    public ListDoublePerfTupleScheme getScheme() {
      return new ListDoublePerfTupleScheme();
    }
  }

  private static class ListDoublePerfTupleScheme extends TupleScheme<ListDoublePerf> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ListDoublePerf struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetField()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetField()) {
        {
          oprot.writeI32(struct.field.size());
          for (double _iter720 : struct.field)
          {
            oprot.writeDouble(_iter720);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ListDoublePerf struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list721 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, iprot.readI32());
          struct.field = new ArrayList<Double>(_list721.size);
          double _elem722;
          for (int _i723 = 0; _i723 < _list721.size; ++_i723)
          {
            _elem722 = iprot.readDouble();
            struct.field.add(_elem722);
          }
        }
        struct.setFieldIsSet(true);
      }
    }
  }

  private static <S extends IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

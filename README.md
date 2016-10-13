# thrift java lib source code and test case compile with maven

#thrift 支持的类型
* `bool`: A boolean value (true or false)
* `byte`: An 8-bit signed integer
* `i16`: A 16-bit signed integer
* `i32`: A 32-bit signed integer
* `i64`: A 64-bit signed integer
* `double`: A 64-bit floating point number
* `string`: A text string encoded using UTF-8 encoding
* `binary`: a sequence of unencoded bytes
* `list`: An ordered list of elements. Translates to an STL vector, Java ArrayList, native arrays in scripting languages, etc.
* `set`: An unordered set of unique elements. Translates to an STL set, Java HashSet, set in Python, etc. Note: PHP does not support sets, so it is treated similar to a List
* `map`: A map of strictly unique keys to values. Translates to an STL map, Java HashMap, PHP associative array, Python/Ruby dictionary, etc. While defaults are provided, the type mappings are not explicitly fixed. Custom code generator directives have been added to allow substitution of custom types in various destination languages.
* `struct`: Thrift structs define a common object -- they are essentially equivalent to classes in OOP languages, but without inheritance. A struct has a set of strongly typed fields, each with a unique name identifier. Fields may have various annotations (numeric field IDs, optional default values, etc.)




#thrift序列化原理(TBinaryProtocol)
## userservice.thrift如下所示
	
	namespace java thrift.demo.userservice 

	struct User {
		1: required bool flag,
		2: required i8   num8,
		3: required i16  num16,
		4: required i32  num32,
		5: required i64  num64,
		6: required double dnum,
		7: required string name,
		8: required binary bytes,
		9: required map<string,string> m,
		10: required list<string> l,
		11: required set<string> s,
	}

	service UserService{
		oneway void addUser(1: required User user),
		User getUser(1: required string name),	
	}


## thrift自动生成序列化部分的代码如下
	/**
	 * Type constants in the Thrift protocol.
 	*/
	public final class TType {
 	 	public static final byte STOP   = 0;
  		public static final byte VOID   = 1;
  		public static final byte BOOL   = 2;
  		public static final byte BYTE   = 3;
  		public static final byte DOUBLE = 4;
  		public static final byte I16    = 6;
  		public static final byte I32    = 8;
  		public static final byte I64    = 10;
  		public static final byte STRING = 11;
  		public static final byte STRUCT = 12;
  		public static final byte MAP    = 13;
  		public static final byte SET    = 14;
  		public static final byte LIST   = 15;
  		public static final byte ENUM   = 16;
	}
	//TField 包含3个字段, 分别为name(字端名称, 但其实不进行传输的), type(字段类型, 参考上面的TType), id(字段的ID, 参考userservice.thrift中的struct User， 那些数字就是ID)
	
	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("User");
	 // flag
	 private static final org.apache.thrift.protocol.TField FLAG_FIELD_DESC = new org.apache.thrift.protocol.TField("flag", org.apache.thrift.protocol.TType.BOOL, (short)1);
	 // num8
 	 private static final org.apache.thrift.protocol.TField NUM8_FIELD_DESC = new org.apache.thrift.protocol.TField("num8", org.apache.thrift.protocol.TType.BYTE, (short)2);
 	 // num16
  	 private static final org.apache.thrift.protocol.TField NUM16_FIELD_DESC = new org.apache.thrift.protocol.TField("num16", org.apache.thrift.protocol.TType.I16, (short)3);
  	 // num32
  	 private static final org.apache.thrift.protocol.TField NUM32_FIELD_DESC = new org.apache.thrift.protocol.TField("num32", org.apache.thrift.protocol.TType.I32, (short)4);
  	 // num64
     private static final org.apache.thrift.protocol.TField NUM64_FIELD_DESC = new org.apache.thrift.protocol.TField("num64", org.apache.thrift.protocol.TType.I64, (short)5);
     // dnum
  	 private static final org.apache.thrift.protocol.TField DNUM_FIELD_DESC = new org.apache.thrift.protocol.TField("dnum", org.apache.thrift.protocol.TType.DOUBLE, (short)6);
  	 // name
 	 private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)7);
 	 // bytes
 	 private static final org.apache.thrift.protocol.TField BYTES_FIELD_DESC = new org.apache.thrift.protocol.TField("bytes", org.apache.thrift.protocol.TType.STRING, (short)8);
 	 // m
 	 private static final org.apache.thrift.protocol.TField M_FIELD_DESC = new org.apache.thrift.protocol.TField("m", org.apache.thrift.protocol.TType.MAP, (short)9);
 	 // l
 	 private static final org.apache.thrift.protocol.TField L_FIELD_DESC = new org.apache.thrift.protocol.TField("l", org.apache.thrift.protocol.TType.LIST, (short)10);
 	 // s
 	 private static final org.apache.thrift.protocol.TField S_FIELD_DESC = new org.apache.thrift.protocol.TField("s", org.apache.thrift.protocol.TType.SET, (short)11);


	  oprot.writeStructBegin(STRUCT_DESC);
	  // thrift序列化flag字段的过程如下
	  // 1. 首先写该字段在thrift中的type, 标示当前字段类型
	  // 2. 写当前字段的id
	  // 3. 再写当前字段具体的值
      oprot.writeFieldBegin(FLAG_FIELD_DESC);
      //public void writeFieldBegin(TField field) throws TException {
      //     name是不写的
      //	 writeByte(field.type);  向输出流中写type
	  //  	 writeI16(field.id);     向输出流中写id
  	  //}
  	  
      oprot.writeBool(struct.flag);
      //public void writeBool(boolean b) throws TException {
      //	writeByte(b ? (byte)1 : (byte)0);
      //}
      
      //下面字段序列化的过程都可以参考flag的过程(具体可以查看/libthrift/src/main/java/thrift/demo/userservice/UserService.java中生成的序列化代码)
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(NUM8_FIELD_DESC);
      oprot.writeByte(struct.num8);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(NUM16_FIELD_DESC);
      oprot.writeI16(struct.num16);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(NUM32_FIELD_DESC);
      oprot.writeI32(struct.num32);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(NUM64_FIELD_DESC);
      oprot.writeI64(struct.num64);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(DNUM_FIELD_DESC);
      oprot.writeDouble(struct.dnum);
      oprot.writeFieldEnd();
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.bytes != null) {
        oprot.writeFieldBegin(BYTES_FIELD_DESC);
        oprot.writeBinary(struct.bytes);
        oprot.writeFieldEnd();
      }
      //集合类型的序列化方式也很简单，步骤如下:
      // 1. 先写集合类型的范型类型
      // 2. 再按顺序写入集合中所有的元素
      if (struct.m != null) {
        oprot.writeFieldBegin(M_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.m.size()));
          for (Map.Entry<String, String> _iter10 : struct.m.entrySet())
          {
            oprot.writeString(_iter10.getKey());
            oprot.writeString(_iter10.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.l != null) {
        oprot.writeFieldBegin(L_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.l.size()));
          for (String _iter11 : struct.l)
          {
            oprot.writeString(_iter11);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.s != null) {
        oprot.writeFieldBegin(S_FIELD_DESC);
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRING, struct.s.size()));
          for (String _iter12 : struct.s)
          {
            oprot.writeString(_iter12);
          }
          oprot.writeSetEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();

# 总结
* 二进制序列化协议的实现无非就是如下步骤
	* 定义序列化协议支持的基本类型(例如int8,int16......string等)
	* 用一个字节标识每种类型对应的数值(例如 int8对应的数值为1, int16对应的数值为2) 
	* 还需一个id标识field在一个例如struct这样复杂类型中的位置
	* 接着就是写入该字段在特定语言平台的值
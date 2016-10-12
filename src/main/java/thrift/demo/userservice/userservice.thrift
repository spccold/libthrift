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
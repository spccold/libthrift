/**
 *
 *	Copyright 2016-2016 spccold
 *
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *
 *   	http://www.apache.org/licenses/LICENSE-2.0
 *
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 *
 */
package thrift.demo.userservice.serialization;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TJSONProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.protocol.TSimpleJSONProtocol;
import org.apache.thrift.transport.TIOStreamTransport;

import thrift.demo.userservice.User;
import thrift.demo.userservice.UserInstance;

/**
 * 
 * @author spccold
 * @version $Id: ThriftSerialization.java, v 0.1 2016年10月13日 下午10:18:04 jileng Exp $
 */
public class ThriftSerialization {
    public static void main(String[] args) throws TException{
        binary();
        compactBinary();
        json();
        simpleJson();
    }
    
    private static void binary() throws TException{
        User originUser = UserInstance.INSTANCE.getUser().deepCopy();
        //serialize
        OutputStream baos = new ByteArrayOutputStream();
        TProtocol oprot = new TBinaryProtocol(new TIOStreamTransport(baos));
        originUser.write(oprot);

        //deserialize
        byte[] data = ((ByteArrayOutputStream)baos).toByteArray();
        System.out.println("binary length: "+data.length);
        InputStream is = new ByteArrayInputStream(data);
        TProtocol iprot = new TBinaryProtocol(new TIOStreamTransport(is));
        User deserializeUser = new User();
        deserializeUser.read(iprot);
        
        System.out.println(originUser.equals(deserializeUser));
    }

    private static void compactBinary() throws TException{
        User originUser = UserInstance.INSTANCE.getUser().deepCopy();
        //serialize
        OutputStream baos = new ByteArrayOutputStream();
        TProtocol oprot = new TCompactProtocol(new TIOStreamTransport(baos));
        originUser.write(oprot);
        
        byte[] data = ((ByteArrayOutputStream)baos).toByteArray();
        System.out.println("compact binary length: "+data.length);
        //deserialize
        InputStream is = new ByteArrayInputStream(data);
        TProtocol iprot = new TCompactProtocol(new TIOStreamTransport(is));
        User deserializeUser = new User();
        deserializeUser.read(iprot);
        
        System.out.println(originUser.equals(deserializeUser));
    }
   
    //我不太明白提供json序列化的意义
    private static void json() throws TException{
        User originUser = UserInstance.INSTANCE.getUser().deepCopy();
        //serialize
        OutputStream baos = new ByteArrayOutputStream();
        TProtocol oprot = new TJSONProtocol(new TIOStreamTransport(baos));
        originUser.write(oprot);
        
        System.out.println("json ret: "+new String((((ByteArrayOutputStream)baos).toByteArray()),Charset.forName("UTF-8")));
        //deserialize
        InputStream is = new ByteArrayInputStream(((ByteArrayOutputStream)baos).toByteArray());
        TProtocol iprot = new TJSONProtocol(new TIOStreamTransport(is));
        User deserializeUser = new User();
        deserializeUser.read(iprot);
        
        System.out.println(originUser.equals(deserializeUser));
    }
    
    private static void simpleJson() throws TException{
        User originUser = UserInstance.INSTANCE.getUser().deepCopy();
        //serialize
        OutputStream baos = new ByteArrayOutputStream();
        TProtocol oprot = new TSimpleJSONProtocol(new TIOStreamTransport(baos));
        originUser.write(oprot);
        
        System.out.println("simple json ret: "+new String((((ByteArrayOutputStream)baos).toByteArray()),Charset.forName("UTF-8")));
    }
}

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
package thrift.demo.userservice.rpc.sync;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.thrift.TException;

import thrift.demo.userservice.User;
import thrift.demo.userservice.UserInstance;
import thrift.demo.userservice.UserService;

/**
 * 
 * @author spccold
 * @version $Id: UserServiceHandler.java, v 0.1 2016年10月12日 下午12:13:06 jileng Exp $
 */
public class UserServiceHandler implements UserService.Iface{
    @Override
    public void addUser(User user) throws TException {
        System.out.println(user.isFlag());
        System.out.println(user.getNum8());
        System.out.println(user.getNum16());
        System.out.println(user.getNum32());
        System.out.println(user.getNum64());
        System.out.println(user.getDnum());
        System.out.println(user.getName());
        System.out.println(new String(user.getBytes(), Charset.forName("UTF-8")));

        Map<String, String> map = user.getM();
        if(null != map){
            for(Entry<String, String> entry : map.entrySet()){
                System.out.println(entry.getKey()+"=>"+entry.getValue());
            }
        }
        
        List<String> list = user.getL();
        System.out.println(list.get(0));
        
        Set<String> set = user.getS();
        System.out.println(set.toArray()[0]);
    }

    @Override
    public User getUser(String name) throws TException {
        return UserInstance.INSTANCE.getUser();
    }
}

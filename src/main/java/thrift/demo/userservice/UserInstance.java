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
package thrift.demo.userservice;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 
 * @author spccold
 * @version $Id: UserInstance.java, v 0.1 2016年10月12日 下午2:51:04 jileng Exp $
 */
public class UserInstance {
    public static final UserInstance INSTANCE = new UserInstance();
    private User user = new User();
    private UserInstance(){
        user.setFlag(true);
        user.setNum8((byte)-128);
        user.setNum16((short)1);
        user.setNum32(1);
        user.setNum64(2L);
        user.setDnum(1.1d);
        user.setName("spccold");
        Map<String, String> m = new HashMap<>();
        m.put("map", "map");
        user.setM(m);
        
        List<String> l = new ArrayList<>();
        l.add("list");
        user.setL(l);
        
        Set<String> s = new HashSet<>();
        s.add("set");
        user.setS(s);
        
        byte[] bytes = "thrift".getBytes(Charset.forName("UTF-8"));
        user.setBytes(bytes);
    }
    public User getUser() {
        return user;
    }
}

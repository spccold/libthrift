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
package thrift.demo.userservice.rpc.async;

import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;

import thrift.demo.userservice.User;
import thrift.demo.userservice.UserInstance;
import thrift.demo.userservice.UserService.AsyncIface;

/**
 * 
 * @author spccold
 * @version $Id: AsyncUserServiceHandler.java, v 0.1 2016年10月12日 下午2:57:40 jileng Exp $
 */
public class AsyncUserServiceHandler implements AsyncIface{

    @Override
    public void addUser(User user, AsyncMethodCallback<Void> resultHandler) throws TException {
        System.out.println(user.toString());
        resultHandler.onComplete(null);
    }

    @Override
    public void getUser(String name, AsyncMethodCallback<User> resultHandler) throws TException {
        System.out.println("received getUser request, name is "+name);
        resultHandler.onComplete(UserInstance.INSTANCE.getUser());
    }
}

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

import java.util.concurrent.CountDownLatch;

import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.async.TAsyncClientManager;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.transport.TNonblockingSocket;

import thrift.demo.userservice.User;
import thrift.demo.userservice.UserInstance;
import thrift.demo.userservice.UserService;

/**
 * 
 * @author spccold
 * @version $Id: AsyncClient.java, v 0.1 2016年10月12日 下午2:59:41 jileng Exp $
 */
public class AsyncClient {
    public static void main(String[] args) throws Exception {
        TProtocolFactory protocolFactory = new TBinaryProtocol.Factory();
        TAsyncClientManager asyncClientManager = new TAsyncClientManager();
        TNonblockingSocket nonblockingSocket = new TNonblockingSocket("localhost", 9090);
        UserService.AsyncClient client1 = new UserService.AsyncClient(protocolFactory, asyncClientManager, nonblockingSocket);
        UserService.AsyncClient client2 = new UserService.AsyncClient(protocolFactory, asyncClientManager, nonblockingSocket);
        
        final CountDownLatch latch = new CountDownLatch(2);
        client1.addUser(UserInstance.INSTANCE.getUser(), new AsyncMethodCallback<Void>() {
            @Override
            public void onError(Exception exception) {
                exception.printStackTrace();
                latch.countDown();   
            }
            @Override
            public void onComplete(Void response) {
                latch.countDown();   
            }
        });
        client2.getUser("spccold", new AsyncMethodCallback<User>() {
            
            @Override
            public void onError(Exception exception) {
                exception.printStackTrace();
                latch.countDown();
            }
            
            @Override
            public void onComplete(User response) {
                System.out.println(response.toString());
                latch.countDown();
            }
        });
        
        latch.await();
    }
}

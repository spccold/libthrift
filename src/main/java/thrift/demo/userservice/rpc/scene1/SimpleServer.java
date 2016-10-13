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
package thrift.demo.userservice.rpc.scene1;

import org.apache.thrift.TException;
import org.apache.thrift.TProcessor;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;

import thrift.demo.userservice.User;
import thrift.demo.userservice.UserInstance;
import thrift.demo.userservice.UserService;

/**
 * server->transport
 * @author spccold
 * @version $Id: SimpleServer.java, v 0.1 2016年10月13日 上午11:28:36 jileng Exp $
 */
public class SimpleServer {
    public static void main(String[] args) throws Exception{
        SimpleServer server = new SimpleServer();
        server.createSimpleServerWithBlockingMode();
    }
    
    public void createSimpleServerWithBlockingMode() throws Exception{
        TServerTransport transport = new TServerSocket(9090);
        TProcessor processor = new UserService.Processor<UserService.Iface>(new UserService.Iface() {
            @Override
            public User getUser(String name) throws TException {
                System.out.println("receive getUser request......");
                return UserInstance.INSTANCE.getUser();
            }
            
            @Override
            public void addUser(User user) throws TException {
            }
        });
        TServer server = new TSimpleServer(new TServer.Args(transport).processor(processor));
        server.serve();
        System.out.println("server start success!");
    }
}

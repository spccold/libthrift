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

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TNonblockingServer;
import org.apache.thrift.server.TServer;
import org.apache.thrift.transport.TNonblockingServerSocket;
import org.apache.thrift.transport.TNonblockingServerTransport;

import thrift.demo.userservice.UserService;

/**
 * 
 * @author spccold
 * @version $Id: Server.java, v 0.1 2016年10月12日 下午12:12:31 jileng Exp $
 */
public class Server {
    public static void main(String[] args) {
        UserService.Processor<UserServiceHandler> processor = new UserService.Processor<UserServiceHandler>(new UserServiceHandler());
        try {
            //no blocking server
            TNonblockingServerTransport serverTransport = new TNonblockingServerSocket(9090);
            TServer noblockingServer = new TNonblockingServer(new TNonblockingServer.Args(serverTransport)
                .processor(processor).protocolFactory(new TBinaryProtocol.Factory()));
            System.out.println("Starting the nobloking server...");
            noblockingServer.serve();
          } catch (Exception e) {
            e.printStackTrace();
          }
    }
}

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

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import thrift.demo.userservice.User;
import thrift.demo.userservice.UserInstance;
import thrift.demo.userservice.UserService;

/**
 * 
 * @author spccold
 * @version $Id: Client.java, v 0.1 2016年10月12日 下午12:12:22 jileng Exp $
 */
public class Client {
    public static void main(String[] args) throws Exception {
        //no blocking
        TTransport transport = new TSocket("localhost", 9090);
        TFramedTransport framedTransport = new TFramedTransport(transport);
        transport.open();
        UserService.Client client = new UserService.Client(new TBinaryProtocol(framedTransport));
        perform(client);

        transport.close();
    }
    
    private static void perform(UserService.Client client){
        try {
            client.addUser(UserInstance.INSTANCE.getUser());
            User user = client.getUser("spcclod");
            System.out.println(user.toString());
        } catch (TException e) {
            e.printStackTrace();
        }
    }
}

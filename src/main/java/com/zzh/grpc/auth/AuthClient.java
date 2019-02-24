package com.zzh.grpc.auth;

import com.zzh.cmm.Constant;
import com.zzh.grpc.greet.GreetGrpc;
import com.zzh.grpc.message.hello.HelloReply;
import com.zzh.grpc.message.hello.HelloResp;
import io.grpc.Channel;
import io.grpc.ManagedChannelBuilder;

public class AuthClient {

    private Channel channel;

    public AuthClient(){
        channel  = ManagedChannelBuilder.forAddress("localhost", Constant.SERVER_PORT)
                .usePlaintext()
                .intercept(new AuthClientIntercept())
                .build();
    }

    public String sayHelloBlock(String name){
        HelloReply reply = HelloReply.newBuilder().setName(name).build();
        HelloResp resp = GreetGrpc.newBlockingStub(channel).sayHello(reply);
        return resp.getResult();
    }

    public static void main(String[] args) {
        AuthClient client = new AuthClient();
        String result = client.sayHelloBlock("zzd");

        System.out.println(result);
    }
}

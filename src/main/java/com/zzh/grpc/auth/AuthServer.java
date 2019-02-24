package com.zzh.grpc.auth;

import com.zzh.cmm.Constant;
import com.zzh.service.HelloService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.ServerInterceptors;

import java.io.IOException;

public class AuthServer {

    private HelloService helloService = new HelloService();

    private Server server;

    private AuthServer(){
        server = ServerBuilder.forPort(Constant.SERVER_PORT)
                .addService(ServerInterceptors.intercept(helloService,new AuthServerIntercept()))
                .build();
    }

    public static void main(String[] args) throws Exception {
        AuthServer server = new AuthServer();
        server.server.start();
        server.server.awaitTermination();

        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run() {
                server.server.shutdown();
            }
        });
    }
}

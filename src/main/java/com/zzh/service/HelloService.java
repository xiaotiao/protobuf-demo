package com.zzh.service;

import com.zzh.grpc.greet.GreetGrpc;
import com.zzh.grpc.message.hello.HelloReply;
import com.zzh.grpc.message.hello.HelloResp;
import io.grpc.stub.StreamObserver;

import java.util.logging.Logger;

public class HelloService extends GreetGrpc.GreetImplBase {

    private static final Logger logger = Logger.getLogger(HelloService.class.getName());

    @Override
    public void sayHello(HelloReply request, StreamObserver<HelloResp> responseObserver) {
        logger.info("request name is: "+ request.getName());
        HelloResp resp = HelloResp.newBuilder().setResult("Hello " + request.getName()).build();
        responseObserver.onNext(resp);
        responseObserver.onCompleted();
    }
}

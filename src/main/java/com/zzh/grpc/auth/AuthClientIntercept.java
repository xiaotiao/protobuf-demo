package com.zzh.grpc.auth;

import com.zzh.cmm.Constant;
import io.grpc.*;
import io.grpc.stub.ClientCalls;

public class AuthClientIntercept implements ClientInterceptor {

    @Override
    public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> methodDescriptor, CallOptions callOptions, Channel channel) {
        return new ForwardingClientCall.SimpleForwardingClientCall<ReqT,RespT>(channel.newCall(methodDescriptor,callOptions)){

            @Override
            public void start(Listener<RespT> responseListener, Metadata headers) {
                headers.put(Constant.JWT_METADATA_KEY,"hello-world");
                super.start(responseListener,headers);
            }
        };
    }
}

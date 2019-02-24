package com.zzh.grpc.auth;

import com.zzh.cmm.Constant;
import io.grpc.*;

public class AuthServerIntercept implements ServerInterceptor {
    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> serverCall, Metadata metadata, ServerCallHandler<ReqT, RespT> serverCallHandler) {
        System.out.println("jwt token is: "+metadata.get(Constant.JWT_METADATA_KEY));
        ServerCall.Listener<ReqT> listener = new ForwardingServerCallListener.SimpleForwardingServerCallListener<ReqT>(serverCallHandler.startCall(serverCall,metadata)){
            @Override
            public void onMessage(ReqT message) {
                System.out.println(" AuthServerIntercept SimpleForwardingServerCallListener onMessage");
                super.onMessage(message);
            }
        };
        return listener;
    }
}

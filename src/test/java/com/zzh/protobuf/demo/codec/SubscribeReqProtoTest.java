package com.zzh.protobuf.demo.codec;

import com.google.protobuf.InvalidProtocolBufferException;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SubscribeReqProtoTest {

    private static byte[] encode(SubscribeReqProto.SubscribeReq req){
        return req.toByteArray();
    }

    private static SubscribeReqProto.SubscribeReq decode(byte[] body) throws InvalidProtocolBufferException {
        return SubscribeReqProto.SubscribeReq.parseFrom(body);
    }

    private static SubscribeReqProto.SubscribeReq createSubscribeReq() {
        SubscribeReqProto.SubscribeReq.Builder builder = SubscribeReqProto.SubscribeReq.newBuilder();

        builder.setSubReqID(1);
        builder.setUserName("zzh");
        builder.setProductName("Netty Book");

        builder.setAddress("ShenZhen HongShuLin");
        return builder.build();
    }


    @Test
    public void test() throws Exception {
        SubscribeReqProto.SubscribeReq req = createSubscribeReq();
        System.out.println("Before encode: "+req.toString());

        SubscribeReqProto.SubscribeReq req2 = decode(encode(req));
        System.out.println("After decode: "+ req2.toString());
    }
}

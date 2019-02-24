package com.zzh.cmm;

import io.grpc.Metadata;

import static io.grpc.Metadata.ASCII_STRING_MARSHALLER;

public interface Constant {

    int SERVER_PORT = 9100;
    String JWT_TOKEN = "jwt";
    Metadata.Key<String> JWT_METADATA_KEY = Metadata.Key.of(JWT_TOKEN, ASCII_STRING_MARSHALLER);
}

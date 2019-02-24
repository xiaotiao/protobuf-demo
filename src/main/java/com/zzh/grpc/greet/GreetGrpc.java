package com.zzh.grpc.greet;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: hello.proto")
public final class GreetGrpc {

  private GreetGrpc() {}

  public static final String SERVICE_NAME = "greet.Greet";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.zzh.grpc.message.hello.HelloReply,
      com.zzh.grpc.message.hello.HelloResp> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sayHello",
      requestType = com.zzh.grpc.message.hello.HelloReply.class,
      responseType = com.zzh.grpc.message.hello.HelloResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zzh.grpc.message.hello.HelloReply,
      com.zzh.grpc.message.hello.HelloResp> getSayHelloMethod() {
    io.grpc.MethodDescriptor<com.zzh.grpc.message.hello.HelloReply, com.zzh.grpc.message.hello.HelloResp> getSayHelloMethod;
    if ((getSayHelloMethod = GreetGrpc.getSayHelloMethod) == null) {
      synchronized (GreetGrpc.class) {
        if ((getSayHelloMethod = GreetGrpc.getSayHelloMethod) == null) {
          GreetGrpc.getSayHelloMethod = getSayHelloMethod = 
              io.grpc.MethodDescriptor.<com.zzh.grpc.message.hello.HelloReply, com.zzh.grpc.message.hello.HelloResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "greet.Greet", "sayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zzh.grpc.message.hello.HelloReply.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zzh.grpc.message.hello.HelloResp.getDefaultInstance()))
                  .setSchemaDescriptor(new GreetMethodDescriptorSupplier("sayHello"))
                  .build();
          }
        }
     }
     return getSayHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreetStub newStub(io.grpc.Channel channel) {
    return new GreetStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreetBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GreetBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreetFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GreetFutureStub(channel);
  }

  /**
   */
  public static abstract class GreetImplBase implements io.grpc.BindableService {

    /**
     */
    public void sayHello(com.zzh.grpc.message.hello.HelloReply request,
        io.grpc.stub.StreamObserver<com.zzh.grpc.message.hello.HelloResp> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.zzh.grpc.message.hello.HelloReply,
                com.zzh.grpc.message.hello.HelloResp>(
                  this, METHODID_SAY_HELLO)))
          .build();
    }
  }

  /**
   */
  public static final class GreetStub extends io.grpc.stub.AbstractStub<GreetStub> {
    private GreetStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(com.zzh.grpc.message.hello.HelloReply request,
        io.grpc.stub.StreamObserver<com.zzh.grpc.message.hello.HelloResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GreetBlockingStub extends io.grpc.stub.AbstractStub<GreetBlockingStub> {
    private GreetBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.zzh.grpc.message.hello.HelloResp sayHello(com.zzh.grpc.message.hello.HelloReply request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GreetFutureStub extends io.grpc.stub.AbstractStub<GreetFutureStub> {
    private GreetFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zzh.grpc.message.hello.HelloResp> sayHello(
        com.zzh.grpc.message.hello.HelloReply request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreetImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreetImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.zzh.grpc.message.hello.HelloReply) request,
              (io.grpc.stub.StreamObserver<com.zzh.grpc.message.hello.HelloResp>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GreetBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreetBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.zzh.grpc.message.hello.HelloProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Greet");
    }
  }

  private static final class GreetFileDescriptorSupplier
      extends GreetBaseDescriptorSupplier {
    GreetFileDescriptorSupplier() {}
  }

  private static final class GreetMethodDescriptorSupplier
      extends GreetBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreetMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GreetGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreetFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}

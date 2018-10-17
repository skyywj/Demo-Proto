package com.test.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: test/test.proto")
public final class ProtodemoGrpc {

  private ProtodemoGrpc() {}

  public static final String SERVICE_NAME = "test.Protodemo";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getTestMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.test.grpc.TestRequest,
      com.google.protobuf.Empty> METHOD_TEST = getTestMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.test.grpc.TestRequest,
      com.google.protobuf.Empty> getTestMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.test.grpc.TestRequest,
      com.google.protobuf.Empty> getTestMethod() {
    return getTestMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.test.grpc.TestRequest,
      com.google.protobuf.Empty> getTestMethodHelper() {
    io.grpc.MethodDescriptor<com.test.grpc.TestRequest, com.google.protobuf.Empty> getTestMethod;
    if ((getTestMethod = ProtodemoGrpc.getTestMethod) == null) {
      synchronized (ProtodemoGrpc.class) {
        if ((getTestMethod = ProtodemoGrpc.getTestMethod) == null) {
          ProtodemoGrpc.getTestMethod = getTestMethod = 
              io.grpc.MethodDescriptor.<com.test.grpc.TestRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "test.Protodemo", "test"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.test.grpc.TestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ProtodemoMethodDescriptorSupplier("test"))
                  .build();
          }
        }
     }
     return getTestMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getTestHttpMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.test.grpc.TestRequest,
      com.test.grpc.TestResponse> METHOD_TEST_HTTP = getTestHttpMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.test.grpc.TestRequest,
      com.test.grpc.TestResponse> getTestHttpMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.test.grpc.TestRequest,
      com.test.grpc.TestResponse> getTestHttpMethod() {
    return getTestHttpMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.test.grpc.TestRequest,
      com.test.grpc.TestResponse> getTestHttpMethodHelper() {
    io.grpc.MethodDescriptor<com.test.grpc.TestRequest, com.test.grpc.TestResponse> getTestHttpMethod;
    if ((getTestHttpMethod = ProtodemoGrpc.getTestHttpMethod) == null) {
      synchronized (ProtodemoGrpc.class) {
        if ((getTestHttpMethod = ProtodemoGrpc.getTestHttpMethod) == null) {
          ProtodemoGrpc.getTestHttpMethod = getTestHttpMethod = 
              io.grpc.MethodDescriptor.<com.test.grpc.TestRequest, com.test.grpc.TestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "test.Protodemo", "testHttp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.test.grpc.TestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.test.grpc.TestResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProtodemoMethodDescriptorSupplier("testHttp"))
                  .build();
          }
        }
     }
     return getTestHttpMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProtodemoStub newStub(io.grpc.Channel channel) {
    return new ProtodemoStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProtodemoBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProtodemoBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProtodemoFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProtodemoFutureStub(channel);
  }

  /**
   */
  public static abstract class ProtodemoImplBase implements io.grpc.BindableService {

    /**
     */
    public void test(com.test.grpc.TestRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getTestMethodHelper(), responseObserver);
    }

    /**
     */
    public void testHttp(com.test.grpc.TestRequest request,
        io.grpc.stub.StreamObserver<com.test.grpc.TestResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTestHttpMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTestMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.test.grpc.TestRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_TEST)))
          .addMethod(
            getTestHttpMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.test.grpc.TestRequest,
                com.test.grpc.TestResponse>(
                  this, METHODID_TEST_HTTP)))
          .build();
    }
  }

  /**
   */
  public static final class ProtodemoStub extends io.grpc.stub.AbstractStub<ProtodemoStub> {
    private ProtodemoStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProtodemoStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProtodemoStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProtodemoStub(channel, callOptions);
    }

    /**
     */
    public void test(com.test.grpc.TestRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTestMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void testHttp(com.test.grpc.TestRequest request,
        io.grpc.stub.StreamObserver<com.test.grpc.TestResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTestHttpMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProtodemoBlockingStub extends io.grpc.stub.AbstractStub<ProtodemoBlockingStub> {
    private ProtodemoBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProtodemoBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProtodemoBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProtodemoBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty test(com.test.grpc.TestRequest request) {
      return blockingUnaryCall(
          getChannel(), getTestMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.test.grpc.TestResponse testHttp(com.test.grpc.TestRequest request) {
      return blockingUnaryCall(
          getChannel(), getTestHttpMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProtodemoFutureStub extends io.grpc.stub.AbstractStub<ProtodemoFutureStub> {
    private ProtodemoFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProtodemoFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProtodemoFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProtodemoFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> test(
        com.test.grpc.TestRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTestMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.test.grpc.TestResponse> testHttp(
        com.test.grpc.TestRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTestHttpMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TEST = 0;
  private static final int METHODID_TEST_HTTP = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProtodemoImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProtodemoImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TEST:
          serviceImpl.test((com.test.grpc.TestRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_TEST_HTTP:
          serviceImpl.testHttp((com.test.grpc.TestRequest) request,
              (io.grpc.stub.StreamObserver<com.test.grpc.TestResponse>) responseObserver);
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

  private static abstract class ProtodemoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProtodemoBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.test.grpc.ProtodemoProtos.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Protodemo");
    }
  }

  private static final class ProtodemoFileDescriptorSupplier
      extends ProtodemoBaseDescriptorSupplier {
    ProtodemoFileDescriptorSupplier() {}
  }

  private static final class ProtodemoMethodDescriptorSupplier
      extends ProtodemoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProtodemoMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProtodemoGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProtodemoFileDescriptorSupplier())
              .addMethod(getTestMethodHelper())
              .addMethod(getTestHttpMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}

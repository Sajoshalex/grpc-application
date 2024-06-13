package com.assessment.product;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: product-service.proto")
public final class ProductServiceGrpc {

  private ProductServiceGrpc() {}

  public static final String SERVICE_NAME = "ProductService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.assessment.product.GetAllProductRequest,
      com.assessment.product.GetAllProductResponse> METHOD_GET_ALL_PRODUCTS =
      io.grpc.MethodDescriptor.<com.assessment.product.GetAllProductRequest, com.assessment.product.GetAllProductResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "ProductService", "getAllProducts"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.assessment.product.GetAllProductRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.assessment.product.GetAllProductResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.assessment.product.CreateProductRequest,
      com.assessment.product.CreateProductResponse> METHOD_CREATE_PRODUCT =
      io.grpc.MethodDescriptor.<com.assessment.product.CreateProductRequest, com.assessment.product.CreateProductResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "ProductService", "createProduct"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.assessment.product.CreateProductRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.assessment.product.CreateProductResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.assessment.product.GetProductRequest,
      com.assessment.product.GetProductResponse> METHOD_GET_PRODUCT =
      io.grpc.MethodDescriptor.<com.assessment.product.GetProductRequest, com.assessment.product.GetProductResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "ProductService", "getProduct"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.assessment.product.GetProductRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.assessment.product.GetProductResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.assessment.product.UpdateRequest,
      com.assessment.product.UpdateResponse> METHOD_UPDATE_PRODUCT =
      io.grpc.MethodDescriptor.<com.assessment.product.UpdateRequest, com.assessment.product.UpdateResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "ProductService", "updateProduct"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.assessment.product.UpdateRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.assessment.product.UpdateResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.assessment.product.DeleteRequest,
      com.assessment.product.DeleteResponse> METHOD_DELETE_PRODUCT =
      io.grpc.MethodDescriptor.<com.assessment.product.DeleteRequest, com.assessment.product.DeleteResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "ProductService", "deleteProduct"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.assessment.product.DeleteRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.assessment.product.DeleteResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductServiceStub newStub(io.grpc.Channel channel) {
    return new ProductServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProductServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProductServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ProductServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllProducts(com.assessment.product.GetAllProductRequest request,
        io.grpc.stub.StreamObserver<com.assessment.product.GetAllProductResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ALL_PRODUCTS, responseObserver);
    }

    /**
     */
    public void createProduct(com.assessment.product.CreateProductRequest request,
        io.grpc.stub.StreamObserver<com.assessment.product.CreateProductResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_PRODUCT, responseObserver);
    }

    /**
     */
    public void getProduct(com.assessment.product.GetProductRequest request,
        io.grpc.stub.StreamObserver<com.assessment.product.GetProductResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_PRODUCT, responseObserver);
    }

    /**
     */
    public void updateProduct(com.assessment.product.UpdateRequest request,
        io.grpc.stub.StreamObserver<com.assessment.product.UpdateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_PRODUCT, responseObserver);
    }

    /**
     */
    public void deleteProduct(com.assessment.product.DeleteRequest request,
        io.grpc.stub.StreamObserver<com.assessment.product.DeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_PRODUCT, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_ALL_PRODUCTS,
            asyncUnaryCall(
              new MethodHandlers<
                com.assessment.product.GetAllProductRequest,
                com.assessment.product.GetAllProductResponse>(
                  this, METHODID_GET_ALL_PRODUCTS)))
          .addMethod(
            METHOD_CREATE_PRODUCT,
            asyncUnaryCall(
              new MethodHandlers<
                com.assessment.product.CreateProductRequest,
                com.assessment.product.CreateProductResponse>(
                  this, METHODID_CREATE_PRODUCT)))
          .addMethod(
            METHOD_GET_PRODUCT,
            asyncUnaryCall(
              new MethodHandlers<
                com.assessment.product.GetProductRequest,
                com.assessment.product.GetProductResponse>(
                  this, METHODID_GET_PRODUCT)))
          .addMethod(
            METHOD_UPDATE_PRODUCT,
            asyncUnaryCall(
              new MethodHandlers<
                com.assessment.product.UpdateRequest,
                com.assessment.product.UpdateResponse>(
                  this, METHODID_UPDATE_PRODUCT)))
          .addMethod(
            METHOD_DELETE_PRODUCT,
            asyncUnaryCall(
              new MethodHandlers<
                com.assessment.product.DeleteRequest,
                com.assessment.product.DeleteResponse>(
                  this, METHODID_DELETE_PRODUCT)))
          .build();
    }
  }

  /**
   */
  public static final class ProductServiceStub extends io.grpc.stub.AbstractStub<ProductServiceStub> {
    private ProductServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllProducts(com.assessment.product.GetAllProductRequest request,
        io.grpc.stub.StreamObserver<com.assessment.product.GetAllProductResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_PRODUCTS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createProduct(com.assessment.product.CreateProductRequest request,
        io.grpc.stub.StreamObserver<com.assessment.product.CreateProductResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_PRODUCT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProduct(com.assessment.product.GetProductRequest request,
        io.grpc.stub.StreamObserver<com.assessment.product.GetProductResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_PRODUCT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateProduct(com.assessment.product.UpdateRequest request,
        io.grpc.stub.StreamObserver<com.assessment.product.UpdateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_PRODUCT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteProduct(com.assessment.product.DeleteRequest request,
        io.grpc.stub.StreamObserver<com.assessment.product.DeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_PRODUCT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProductServiceBlockingStub extends io.grpc.stub.AbstractStub<ProductServiceBlockingStub> {
    private ProductServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.assessment.product.GetAllProductResponse getAllProducts(com.assessment.product.GetAllProductRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ALL_PRODUCTS, getCallOptions(), request);
    }

    /**
     */
    public com.assessment.product.CreateProductResponse createProduct(com.assessment.product.CreateProductRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_PRODUCT, getCallOptions(), request);
    }

    /**
     */
    public com.assessment.product.GetProductResponse getProduct(com.assessment.product.GetProductRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_PRODUCT, getCallOptions(), request);
    }

    /**
     */
    public com.assessment.product.UpdateResponse updateProduct(com.assessment.product.UpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_PRODUCT, getCallOptions(), request);
    }

    /**
     */
    public com.assessment.product.DeleteResponse deleteProduct(com.assessment.product.DeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_PRODUCT, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProductServiceFutureStub extends io.grpc.stub.AbstractStub<ProductServiceFutureStub> {
    private ProductServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.assessment.product.GetAllProductResponse> getAllProducts(
        com.assessment.product.GetAllProductRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_PRODUCTS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.assessment.product.CreateProductResponse> createProduct(
        com.assessment.product.CreateProductRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_PRODUCT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.assessment.product.GetProductResponse> getProduct(
        com.assessment.product.GetProductRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_PRODUCT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.assessment.product.UpdateResponse> updateProduct(
        com.assessment.product.UpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_PRODUCT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.assessment.product.DeleteResponse> deleteProduct(
        com.assessment.product.DeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_PRODUCT, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_PRODUCTS = 0;
  private static final int METHODID_CREATE_PRODUCT = 1;
  private static final int METHODID_GET_PRODUCT = 2;
  private static final int METHODID_UPDATE_PRODUCT = 3;
  private static final int METHODID_DELETE_PRODUCT = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProductServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProductServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_PRODUCTS:
          serviceImpl.getAllProducts((com.assessment.product.GetAllProductRequest) request,
              (io.grpc.stub.StreamObserver<com.assessment.product.GetAllProductResponse>) responseObserver);
          break;
        case METHODID_CREATE_PRODUCT:
          serviceImpl.createProduct((com.assessment.product.CreateProductRequest) request,
              (io.grpc.stub.StreamObserver<com.assessment.product.CreateProductResponse>) responseObserver);
          break;
        case METHODID_GET_PRODUCT:
          serviceImpl.getProduct((com.assessment.product.GetProductRequest) request,
              (io.grpc.stub.StreamObserver<com.assessment.product.GetProductResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PRODUCT:
          serviceImpl.updateProduct((com.assessment.product.UpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.assessment.product.UpdateResponse>) responseObserver);
          break;
        case METHODID_DELETE_PRODUCT:
          serviceImpl.deleteProduct((com.assessment.product.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.assessment.product.DeleteResponse>) responseObserver);
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

  private static final class ProductServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.assessment.product.ProductServiceOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ProductServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductServiceDescriptorSupplier())
              .addMethod(METHOD_GET_ALL_PRODUCTS)
              .addMethod(METHOD_CREATE_PRODUCT)
              .addMethod(METHOD_GET_PRODUCT)
              .addMethod(METHOD_UPDATE_PRODUCT)
              .addMethod(METHOD_DELETE_PRODUCT)
              .build();
        }
      }
    }
    return result;
  }
}

package cn.mrdear.route;

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
 * <pre>
 *定义服务
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.3)",
    comments = "Source: route.proto")
public class RouteGuideGrpc {

  private RouteGuideGrpc() {}

  public static final String SERVICE_NAME = "RouteGuide";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.mrdear.route.Point,
      cn.mrdear.route.Feature> METHOD_GET_FEATURE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "RouteGuide", "GetFeature"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.mrdear.route.Point.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.mrdear.route.Feature.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.mrdear.route.Rectangle,
      cn.mrdear.route.Feature> METHOD_LIST_FEATURES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "RouteGuide", "ListFeatures"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.mrdear.route.Rectangle.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.mrdear.route.Feature.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.mrdear.route.Point,
      cn.mrdear.route.RouteSummary> METHOD_RECORD_ROUTE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING,
          generateFullMethodName(
              "RouteGuide", "RecordRoute"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.mrdear.route.Point.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.mrdear.route.RouteSummary.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.mrdear.route.RouteNote,
      cn.mrdear.route.RouteNote> METHOD_ROUTE_CHAT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING,
          generateFullMethodName(
              "RouteGuide", "RouteChat"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.mrdear.route.RouteNote.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.mrdear.route.RouteNote.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RouteGuideStub newStub(io.grpc.Channel channel) {
    return new RouteGuideStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RouteGuideBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RouteGuideBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static RouteGuideFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RouteGuideFutureStub(channel);
  }

  /**
   * <pre>
   *定义服务
   * </pre>
   */
  public static abstract class RouteGuideImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *得到指定点的feature
     *一个 简单 RPC ， 客户端使用存根发送请求到服务器并等待响应返回，就像平常的函数调用一样。
     * </pre>
     */
    public void getFeature(cn.mrdear.route.Point request,
        io.grpc.stub.StreamObserver<cn.mrdear.route.Feature> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_FEATURE, responseObserver);
    }

    /**
     * <pre>
     *获取一个矩形内的点
     *一个 服务器端流式 RPC ， 客户端发送请求到服务器，拿到一个流去读取返回的消息序列。 客户端读取返回的流，
     *直到里面没有任何消息。从例子中可以看出，通过在 响应 类型前插入 stream 关键字，可以指定一个服务器端的流方法。
     * </pre>
     */
    public void listFeatures(cn.mrdear.route.Rectangle request,
        io.grpc.stub.StreamObserver<cn.mrdear.route.Feature> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_FEATURES, responseObserver);
    }

    /**
     * <pre>
     *记录该点
     *一个 客户端流式 RPC ， 客户端写入一个消息序列并将其发送到服务器，同样也是使用流。一旦客户端完成写入消息，
     *它等待服务器完成读取返回它的响应。通过在 请求 类型前指定 stream 关键字来指定一个客户端的流方法。
     * </pre>
     */
    public io.grpc.stub.StreamObserver<cn.mrdear.route.Point> recordRoute(
        io.grpc.stub.StreamObserver<cn.mrdear.route.RouteSummary> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_RECORD_ROUTE, responseObserver);
    }

    /**
     * <pre>
     *路由交流
     *一个 双向流式 RPC 是双方使用读写流去发送一个消息序列。两个流独立操作，因此客户端和服务器
     *可以以任意喜欢的顺序读写：比如， 服务器可以在写入响应前等待接收所有的客户端消息，或者可以交替 的读取和写入消息，
     *或者其他读写的组合。每个流中的消息顺序被预留。你可以通过在请求和响应前加 stream 关键字去制定方法的类型。
     * </pre>
     */
    public io.grpc.stub.StreamObserver<cn.mrdear.route.RouteNote> routeChat(
        io.grpc.stub.StreamObserver<cn.mrdear.route.RouteNote> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_ROUTE_CHAT, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_FEATURE,
            asyncUnaryCall(
              new MethodHandlers<
                cn.mrdear.route.Point,
                cn.mrdear.route.Feature>(
                  this, METHODID_GET_FEATURE)))
          .addMethod(
            METHOD_LIST_FEATURES,
            asyncServerStreamingCall(
              new MethodHandlers<
                cn.mrdear.route.Rectangle,
                cn.mrdear.route.Feature>(
                  this, METHODID_LIST_FEATURES)))
          .addMethod(
            METHOD_RECORD_ROUTE,
            asyncClientStreamingCall(
              new MethodHandlers<
                cn.mrdear.route.Point,
                cn.mrdear.route.RouteSummary>(
                  this, METHODID_RECORD_ROUTE)))
          .addMethod(
            METHOD_ROUTE_CHAT,
            asyncBidiStreamingCall(
              new MethodHandlers<
                cn.mrdear.route.RouteNote,
                cn.mrdear.route.RouteNote>(
                  this, METHODID_ROUTE_CHAT)))
          .build();
    }
  }

  /**
   * <pre>
   *定义服务
   * </pre>
   */
  public static final class RouteGuideStub extends io.grpc.stub.AbstractStub<RouteGuideStub> {
    private RouteGuideStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RouteGuideStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouteGuideStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RouteGuideStub(channel, callOptions);
    }

    /**
     * <pre>
     *得到指定点的feature
     *一个 简单 RPC ， 客户端使用存根发送请求到服务器并等待响应返回，就像平常的函数调用一样。
     * </pre>
     */
    public void getFeature(cn.mrdear.route.Point request,
        io.grpc.stub.StreamObserver<cn.mrdear.route.Feature> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_FEATURE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *获取一个矩形内的点
     *一个 服务器端流式 RPC ， 客户端发送请求到服务器，拿到一个流去读取返回的消息序列。 客户端读取返回的流，
     *直到里面没有任何消息。从例子中可以看出，通过在 响应 类型前插入 stream 关键字，可以指定一个服务器端的流方法。
     * </pre>
     */
    public void listFeatures(cn.mrdear.route.Rectangle request,
        io.grpc.stub.StreamObserver<cn.mrdear.route.Feature> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_LIST_FEATURES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *记录该点
     *一个 客户端流式 RPC ， 客户端写入一个消息序列并将其发送到服务器，同样也是使用流。一旦客户端完成写入消息，
     *它等待服务器完成读取返回它的响应。通过在 请求 类型前指定 stream 关键字来指定一个客户端的流方法。
     * </pre>
     */
    public io.grpc.stub.StreamObserver<cn.mrdear.route.Point> recordRoute(
        io.grpc.stub.StreamObserver<cn.mrdear.route.RouteSummary> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_RECORD_ROUTE, getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *路由交流
     *一个 双向流式 RPC 是双方使用读写流去发送一个消息序列。两个流独立操作，因此客户端和服务器
     *可以以任意喜欢的顺序读写：比如， 服务器可以在写入响应前等待接收所有的客户端消息，或者可以交替 的读取和写入消息，
     *或者其他读写的组合。每个流中的消息顺序被预留。你可以通过在请求和响应前加 stream 关键字去制定方法的类型。
     * </pre>
     */
    public io.grpc.stub.StreamObserver<cn.mrdear.route.RouteNote> routeChat(
        io.grpc.stub.StreamObserver<cn.mrdear.route.RouteNote> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_ROUTE_CHAT, getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   *定义服务
   * </pre>
   */
  public static final class RouteGuideBlockingStub extends io.grpc.stub.AbstractStub<RouteGuideBlockingStub> {
    private RouteGuideBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RouteGuideBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouteGuideBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RouteGuideBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *得到指定点的feature
     *一个 简单 RPC ， 客户端使用存根发送请求到服务器并等待响应返回，就像平常的函数调用一样。
     * </pre>
     */
    public cn.mrdear.route.Feature getFeature(cn.mrdear.route.Point request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_FEATURE, getCallOptions(), request);
    }

    /**
     * <pre>
     *获取一个矩形内的点
     *一个 服务器端流式 RPC ， 客户端发送请求到服务器，拿到一个流去读取返回的消息序列。 客户端读取返回的流，
     *直到里面没有任何消息。从例子中可以看出，通过在 响应 类型前插入 stream 关键字，可以指定一个服务器端的流方法。
     * </pre>
     */
    public java.util.Iterator<cn.mrdear.route.Feature> listFeatures(
        cn.mrdear.route.Rectangle request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_LIST_FEATURES, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *定义服务
   * </pre>
   */
  public static final class RouteGuideFutureStub extends io.grpc.stub.AbstractStub<RouteGuideFutureStub> {
    private RouteGuideFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RouteGuideFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouteGuideFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RouteGuideFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *得到指定点的feature
     *一个 简单 RPC ， 客户端使用存根发送请求到服务器并等待响应返回，就像平常的函数调用一样。
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.mrdear.route.Feature> getFeature(
        cn.mrdear.route.Point request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_FEATURE, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FEATURE = 0;
  private static final int METHODID_LIST_FEATURES = 1;
  private static final int METHODID_RECORD_ROUTE = 2;
  private static final int METHODID_ROUTE_CHAT = 3;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RouteGuideImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(RouteGuideImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_FEATURE:
          serviceImpl.getFeature((cn.mrdear.route.Point) request,
              (io.grpc.stub.StreamObserver<cn.mrdear.route.Feature>) responseObserver);
          break;
        case METHODID_LIST_FEATURES:
          serviceImpl.listFeatures((cn.mrdear.route.Rectangle) request,
              (io.grpc.stub.StreamObserver<cn.mrdear.route.Feature>) responseObserver);
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
        case METHODID_RECORD_ROUTE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.recordRoute(
              (io.grpc.stub.StreamObserver<cn.mrdear.route.RouteSummary>) responseObserver);
        case METHODID_ROUTE_CHAT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.routeChat(
              (io.grpc.stub.StreamObserver<cn.mrdear.route.RouteNote>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_GET_FEATURE,
        METHOD_LIST_FEATURES,
        METHOD_RECORD_ROUTE,
        METHOD_ROUTE_CHAT);
  }

}

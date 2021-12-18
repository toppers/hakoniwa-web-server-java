package hakoniwa;

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
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: hakoniwa_core.proto")
public final class CoreServiceGrpc {

  private CoreServiceGrpc() {}

  public static final String SERVICE_NAME = "hakoniwa.CoreService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<hakoniwa.HakoniwaCore.AssetInfo,
      hakoniwa.HakoniwaCore.NormalReply> getRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Register",
      requestType = hakoniwa.HakoniwaCore.AssetInfo.class,
      responseType = hakoniwa.HakoniwaCore.NormalReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<hakoniwa.HakoniwaCore.AssetInfo,
      hakoniwa.HakoniwaCore.NormalReply> getRegisterMethod() {
    io.grpc.MethodDescriptor<hakoniwa.HakoniwaCore.AssetInfo, hakoniwa.HakoniwaCore.NormalReply> getRegisterMethod;
    if ((getRegisterMethod = CoreServiceGrpc.getRegisterMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getRegisterMethod = CoreServiceGrpc.getRegisterMethod) == null) {
          CoreServiceGrpc.getRegisterMethod = getRegisterMethod = 
              io.grpc.MethodDescriptor.<hakoniwa.HakoniwaCore.AssetInfo, hakoniwa.HakoniwaCore.NormalReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "hakoniwa.CoreService", "Register"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  hakoniwa.HakoniwaCore.AssetInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  hakoniwa.HakoniwaCore.NormalReply.getDefaultInstance()))
                  .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("Register"))
                  .build();
          }
        }
     }
     return getRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<hakoniwa.HakoniwaCore.AssetInfo,
      hakoniwa.HakoniwaCore.NormalReply> getUnregisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Unregister",
      requestType = hakoniwa.HakoniwaCore.AssetInfo.class,
      responseType = hakoniwa.HakoniwaCore.NormalReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<hakoniwa.HakoniwaCore.AssetInfo,
      hakoniwa.HakoniwaCore.NormalReply> getUnregisterMethod() {
    io.grpc.MethodDescriptor<hakoniwa.HakoniwaCore.AssetInfo, hakoniwa.HakoniwaCore.NormalReply> getUnregisterMethod;
    if ((getUnregisterMethod = CoreServiceGrpc.getUnregisterMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getUnregisterMethod = CoreServiceGrpc.getUnregisterMethod) == null) {
          CoreServiceGrpc.getUnregisterMethod = getUnregisterMethod = 
              io.grpc.MethodDescriptor.<hakoniwa.HakoniwaCore.AssetInfo, hakoniwa.HakoniwaCore.NormalReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "hakoniwa.CoreService", "Unregister"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  hakoniwa.HakoniwaCore.AssetInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  hakoniwa.HakoniwaCore.NormalReply.getDefaultInstance()))
                  .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("Unregister"))
                  .build();
          }
        }
     }
     return getUnregisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      hakoniwa.HakoniwaCore.AssetInfoList> getGetAssetListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAssetList",
      requestType = com.google.protobuf.Empty.class,
      responseType = hakoniwa.HakoniwaCore.AssetInfoList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      hakoniwa.HakoniwaCore.AssetInfoList> getGetAssetListMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, hakoniwa.HakoniwaCore.AssetInfoList> getGetAssetListMethod;
    if ((getGetAssetListMethod = CoreServiceGrpc.getGetAssetListMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getGetAssetListMethod = CoreServiceGrpc.getGetAssetListMethod) == null) {
          CoreServiceGrpc.getGetAssetListMethod = getGetAssetListMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, hakoniwa.HakoniwaCore.AssetInfoList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "hakoniwa.CoreService", "GetAssetList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  hakoniwa.HakoniwaCore.AssetInfoList.getDefaultInstance()))
                  .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("GetAssetList"))
                  .build();
          }
        }
     }
     return getGetAssetListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      hakoniwa.HakoniwaCore.NormalReply> getStartSimulationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartSimulation",
      requestType = com.google.protobuf.Empty.class,
      responseType = hakoniwa.HakoniwaCore.NormalReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      hakoniwa.HakoniwaCore.NormalReply> getStartSimulationMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, hakoniwa.HakoniwaCore.NormalReply> getStartSimulationMethod;
    if ((getStartSimulationMethod = CoreServiceGrpc.getStartSimulationMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getStartSimulationMethod = CoreServiceGrpc.getStartSimulationMethod) == null) {
          CoreServiceGrpc.getStartSimulationMethod = getStartSimulationMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, hakoniwa.HakoniwaCore.NormalReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "hakoniwa.CoreService", "StartSimulation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  hakoniwa.HakoniwaCore.NormalReply.getDefaultInstance()))
                  .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("StartSimulation"))
                  .build();
          }
        }
     }
     return getStartSimulationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      hakoniwa.HakoniwaCore.NormalReply> getStopSimulationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopSimulation",
      requestType = com.google.protobuf.Empty.class,
      responseType = hakoniwa.HakoniwaCore.NormalReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      hakoniwa.HakoniwaCore.NormalReply> getStopSimulationMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, hakoniwa.HakoniwaCore.NormalReply> getStopSimulationMethod;
    if ((getStopSimulationMethod = CoreServiceGrpc.getStopSimulationMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getStopSimulationMethod = CoreServiceGrpc.getStopSimulationMethod) == null) {
          CoreServiceGrpc.getStopSimulationMethod = getStopSimulationMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, hakoniwa.HakoniwaCore.NormalReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "hakoniwa.CoreService", "StopSimulation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  hakoniwa.HakoniwaCore.NormalReply.getDefaultInstance()))
                  .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("StopSimulation"))
                  .build();
          }
        }
     }
     return getStopSimulationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      hakoniwa.HakoniwaCore.SimStatReply> getGetSimStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSimStatus",
      requestType = com.google.protobuf.Empty.class,
      responseType = hakoniwa.HakoniwaCore.SimStatReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      hakoniwa.HakoniwaCore.SimStatReply> getGetSimStatusMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, hakoniwa.HakoniwaCore.SimStatReply> getGetSimStatusMethod;
    if ((getGetSimStatusMethod = CoreServiceGrpc.getGetSimStatusMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getGetSimStatusMethod = CoreServiceGrpc.getGetSimStatusMethod) == null) {
          CoreServiceGrpc.getGetSimStatusMethod = getGetSimStatusMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, hakoniwa.HakoniwaCore.SimStatReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "hakoniwa.CoreService", "GetSimStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  hakoniwa.HakoniwaCore.SimStatReply.getDefaultInstance()))
                  .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("GetSimStatus"))
                  .build();
          }
        }
     }
     return getGetSimStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      hakoniwa.HakoniwaCore.NormalReply> getResetSimulationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResetSimulation",
      requestType = com.google.protobuf.Empty.class,
      responseType = hakoniwa.HakoniwaCore.NormalReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      hakoniwa.HakoniwaCore.NormalReply> getResetSimulationMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, hakoniwa.HakoniwaCore.NormalReply> getResetSimulationMethod;
    if ((getResetSimulationMethod = CoreServiceGrpc.getResetSimulationMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getResetSimulationMethod = CoreServiceGrpc.getResetSimulationMethod) == null) {
          CoreServiceGrpc.getResetSimulationMethod = getResetSimulationMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, hakoniwa.HakoniwaCore.NormalReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "hakoniwa.CoreService", "ResetSimulation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  hakoniwa.HakoniwaCore.NormalReply.getDefaultInstance()))
                  .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("ResetSimulation"))
                  .build();
          }
        }
     }
     return getResetSimulationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<hakoniwa.HakoniwaCore.SimulationTimeSyncOutputFile,
      hakoniwa.HakoniwaCore.NormalReply> getFlushSimulationTimeSyncInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FlushSimulationTimeSyncInfo",
      requestType = hakoniwa.HakoniwaCore.SimulationTimeSyncOutputFile.class,
      responseType = hakoniwa.HakoniwaCore.NormalReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<hakoniwa.HakoniwaCore.SimulationTimeSyncOutputFile,
      hakoniwa.HakoniwaCore.NormalReply> getFlushSimulationTimeSyncInfoMethod() {
    io.grpc.MethodDescriptor<hakoniwa.HakoniwaCore.SimulationTimeSyncOutputFile, hakoniwa.HakoniwaCore.NormalReply> getFlushSimulationTimeSyncInfoMethod;
    if ((getFlushSimulationTimeSyncInfoMethod = CoreServiceGrpc.getFlushSimulationTimeSyncInfoMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getFlushSimulationTimeSyncInfoMethod = CoreServiceGrpc.getFlushSimulationTimeSyncInfoMethod) == null) {
          CoreServiceGrpc.getFlushSimulationTimeSyncInfoMethod = getFlushSimulationTimeSyncInfoMethod = 
              io.grpc.MethodDescriptor.<hakoniwa.HakoniwaCore.SimulationTimeSyncOutputFile, hakoniwa.HakoniwaCore.NormalReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "hakoniwa.CoreService", "FlushSimulationTimeSyncInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  hakoniwa.HakoniwaCore.SimulationTimeSyncOutputFile.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  hakoniwa.HakoniwaCore.NormalReply.getDefaultInstance()))
                  .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("FlushSimulationTimeSyncInfo"))
                  .build();
          }
        }
     }
     return getFlushSimulationTimeSyncInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<hakoniwa.HakoniwaCore.AssetInfo,
      hakoniwa.HakoniwaCore.AssetNotification> getAssetNotificationStartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssetNotificationStart",
      requestType = hakoniwa.HakoniwaCore.AssetInfo.class,
      responseType = hakoniwa.HakoniwaCore.AssetNotification.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<hakoniwa.HakoniwaCore.AssetInfo,
      hakoniwa.HakoniwaCore.AssetNotification> getAssetNotificationStartMethod() {
    io.grpc.MethodDescriptor<hakoniwa.HakoniwaCore.AssetInfo, hakoniwa.HakoniwaCore.AssetNotification> getAssetNotificationStartMethod;
    if ((getAssetNotificationStartMethod = CoreServiceGrpc.getAssetNotificationStartMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getAssetNotificationStartMethod = CoreServiceGrpc.getAssetNotificationStartMethod) == null) {
          CoreServiceGrpc.getAssetNotificationStartMethod = getAssetNotificationStartMethod = 
              io.grpc.MethodDescriptor.<hakoniwa.HakoniwaCore.AssetInfo, hakoniwa.HakoniwaCore.AssetNotification>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "hakoniwa.CoreService", "AssetNotificationStart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  hakoniwa.HakoniwaCore.AssetInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  hakoniwa.HakoniwaCore.AssetNotification.getDefaultInstance()))
                  .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("AssetNotificationStart"))
                  .build();
          }
        }
     }
     return getAssetNotificationStartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<hakoniwa.HakoniwaCore.AssetNotificationReply,
      hakoniwa.HakoniwaCore.NormalReply> getAssetNotificationFeedbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssetNotificationFeedback",
      requestType = hakoniwa.HakoniwaCore.AssetNotificationReply.class,
      responseType = hakoniwa.HakoniwaCore.NormalReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<hakoniwa.HakoniwaCore.AssetNotificationReply,
      hakoniwa.HakoniwaCore.NormalReply> getAssetNotificationFeedbackMethod() {
    io.grpc.MethodDescriptor<hakoniwa.HakoniwaCore.AssetNotificationReply, hakoniwa.HakoniwaCore.NormalReply> getAssetNotificationFeedbackMethod;
    if ((getAssetNotificationFeedbackMethod = CoreServiceGrpc.getAssetNotificationFeedbackMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getAssetNotificationFeedbackMethod = CoreServiceGrpc.getAssetNotificationFeedbackMethod) == null) {
          CoreServiceGrpc.getAssetNotificationFeedbackMethod = getAssetNotificationFeedbackMethod = 
              io.grpc.MethodDescriptor.<hakoniwa.HakoniwaCore.AssetNotificationReply, hakoniwa.HakoniwaCore.NormalReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "hakoniwa.CoreService", "AssetNotificationFeedback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  hakoniwa.HakoniwaCore.AssetNotificationReply.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  hakoniwa.HakoniwaCore.NormalReply.getDefaultInstance()))
                  .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("AssetNotificationFeedback"))
                  .build();
          }
        }
     }
     return getAssetNotificationFeedbackMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CoreServiceStub newStub(io.grpc.Channel channel) {
    return new CoreServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CoreServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CoreServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CoreServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CoreServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CoreServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *箱庭アセットを登録する
     * </pre>
     */
    public void register(hakoniwa.HakoniwaCore.AssetInfo request,
        io.grpc.stub.StreamObserver<hakoniwa.HakoniwaCore.NormalReply> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterMethod(), responseObserver);
    }

    /**
     * <pre>
     *箱庭アセットを登録解除する
     * </pre>
     */
    public void unregister(hakoniwa.HakoniwaCore.AssetInfo request,
        io.grpc.stub.StreamObserver<hakoniwa.HakoniwaCore.NormalReply> responseObserver) {
      asyncUnimplementedUnaryCall(getUnregisterMethod(), responseObserver);
    }

    /**
     * <pre>
     *箱庭アセットのリストを取得する
     * </pre>
     */
    public void getAssetList(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<hakoniwa.HakoniwaCore.AssetInfoList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAssetListMethod(), responseObserver);
    }

    /**
     * <pre>
     *シミュレーションを開始する
     * </pre>
     */
    public void startSimulation(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<hakoniwa.HakoniwaCore.NormalReply> responseObserver) {
      asyncUnimplementedUnaryCall(getStartSimulationMethod(), responseObserver);
    }

    /**
     * <pre>
     *シミュレーションを終了する
     * </pre>
     */
    public void stopSimulation(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<hakoniwa.HakoniwaCore.NormalReply> responseObserver) {
      asyncUnimplementedUnaryCall(getStopSimulationMethod(), responseObserver);
    }

    /**
     * <pre>
     *シミュレーション実行状況を取得する
     * </pre>
     */
    public void getSimStatus(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<hakoniwa.HakoniwaCore.SimStatReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSimStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     *シミュレーションを実行開始状態に戻す
     * </pre>
     */
    public void resetSimulation(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<hakoniwa.HakoniwaCore.NormalReply> responseObserver) {
      asyncUnimplementedUnaryCall(getResetSimulationMethod(), responseObserver);
    }

    /**
     * <pre>
     *シミュレーション時間同期度合いを取得する
     * </pre>
     */
    public void flushSimulationTimeSyncInfo(hakoniwa.HakoniwaCore.SimulationTimeSyncOutputFile request,
        io.grpc.stub.StreamObserver<hakoniwa.HakoniwaCore.NormalReply> responseObserver) {
      asyncUnimplementedUnaryCall(getFlushSimulationTimeSyncInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     *箱庭アセット非同期通知
     * </pre>
     */
    public void assetNotificationStart(hakoniwa.HakoniwaCore.AssetInfo request,
        io.grpc.stub.StreamObserver<hakoniwa.HakoniwaCore.AssetNotification> responseObserver) {
      asyncUnimplementedUnaryCall(getAssetNotificationStartMethod(), responseObserver);
    }

    /**
     */
    public void assetNotificationFeedback(hakoniwa.HakoniwaCore.AssetNotificationReply request,
        io.grpc.stub.StreamObserver<hakoniwa.HakoniwaCore.NormalReply> responseObserver) {
      asyncUnimplementedUnaryCall(getAssetNotificationFeedbackMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                hakoniwa.HakoniwaCore.AssetInfo,
                hakoniwa.HakoniwaCore.NormalReply>(
                  this, METHODID_REGISTER)))
          .addMethod(
            getUnregisterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                hakoniwa.HakoniwaCore.AssetInfo,
                hakoniwa.HakoniwaCore.NormalReply>(
                  this, METHODID_UNREGISTER)))
          .addMethod(
            getGetAssetListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                hakoniwa.HakoniwaCore.AssetInfoList>(
                  this, METHODID_GET_ASSET_LIST)))
          .addMethod(
            getStartSimulationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                hakoniwa.HakoniwaCore.NormalReply>(
                  this, METHODID_START_SIMULATION)))
          .addMethod(
            getStopSimulationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                hakoniwa.HakoniwaCore.NormalReply>(
                  this, METHODID_STOP_SIMULATION)))
          .addMethod(
            getGetSimStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                hakoniwa.HakoniwaCore.SimStatReply>(
                  this, METHODID_GET_SIM_STATUS)))
          .addMethod(
            getResetSimulationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                hakoniwa.HakoniwaCore.NormalReply>(
                  this, METHODID_RESET_SIMULATION)))
          .addMethod(
            getFlushSimulationTimeSyncInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                hakoniwa.HakoniwaCore.SimulationTimeSyncOutputFile,
                hakoniwa.HakoniwaCore.NormalReply>(
                  this, METHODID_FLUSH_SIMULATION_TIME_SYNC_INFO)))
          .addMethod(
            getAssetNotificationStartMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                hakoniwa.HakoniwaCore.AssetInfo,
                hakoniwa.HakoniwaCore.AssetNotification>(
                  this, METHODID_ASSET_NOTIFICATION_START)))
          .addMethod(
            getAssetNotificationFeedbackMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                hakoniwa.HakoniwaCore.AssetNotificationReply,
                hakoniwa.HakoniwaCore.NormalReply>(
                  this, METHODID_ASSET_NOTIFICATION_FEEDBACK)))
          .build();
    }
  }

  /**
   */
  public static final class CoreServiceStub extends io.grpc.stub.AbstractStub<CoreServiceStub> {
    private CoreServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CoreServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoreServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CoreServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *箱庭アセットを登録する
     * </pre>
     */
    public void register(hakoniwa.HakoniwaCore.AssetInfo request,
        io.grpc.stub.StreamObserver<hakoniwa.HakoniwaCore.NormalReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *箱庭アセットを登録解除する
     * </pre>
     */
    public void unregister(hakoniwa.HakoniwaCore.AssetInfo request,
        io.grpc.stub.StreamObserver<hakoniwa.HakoniwaCore.NormalReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnregisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *箱庭アセットのリストを取得する
     * </pre>
     */
    public void getAssetList(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<hakoniwa.HakoniwaCore.AssetInfoList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAssetListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *シミュレーションを開始する
     * </pre>
     */
    public void startSimulation(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<hakoniwa.HakoniwaCore.NormalReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStartSimulationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *シミュレーションを終了する
     * </pre>
     */
    public void stopSimulation(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<hakoniwa.HakoniwaCore.NormalReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStopSimulationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *シミュレーション実行状況を取得する
     * </pre>
     */
    public void getSimStatus(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<hakoniwa.HakoniwaCore.SimStatReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSimStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *シミュレーションを実行開始状態に戻す
     * </pre>
     */
    public void resetSimulation(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<hakoniwa.HakoniwaCore.NormalReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getResetSimulationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *シミュレーション時間同期度合いを取得する
     * </pre>
     */
    public void flushSimulationTimeSyncInfo(hakoniwa.HakoniwaCore.SimulationTimeSyncOutputFile request,
        io.grpc.stub.StreamObserver<hakoniwa.HakoniwaCore.NormalReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFlushSimulationTimeSyncInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *箱庭アセット非同期通知
     * </pre>
     */
    public void assetNotificationStart(hakoniwa.HakoniwaCore.AssetInfo request,
        io.grpc.stub.StreamObserver<hakoniwa.HakoniwaCore.AssetNotification> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getAssetNotificationStartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void assetNotificationFeedback(hakoniwa.HakoniwaCore.AssetNotificationReply request,
        io.grpc.stub.StreamObserver<hakoniwa.HakoniwaCore.NormalReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAssetNotificationFeedbackMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CoreServiceBlockingStub extends io.grpc.stub.AbstractStub<CoreServiceBlockingStub> {
    private CoreServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CoreServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoreServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CoreServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *箱庭アセットを登録する
     * </pre>
     */
    public hakoniwa.HakoniwaCore.NormalReply register(hakoniwa.HakoniwaCore.AssetInfo request) {
      return blockingUnaryCall(
          getChannel(), getRegisterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *箱庭アセットを登録解除する
     * </pre>
     */
    public hakoniwa.HakoniwaCore.NormalReply unregister(hakoniwa.HakoniwaCore.AssetInfo request) {
      return blockingUnaryCall(
          getChannel(), getUnregisterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *箱庭アセットのリストを取得する
     * </pre>
     */
    public hakoniwa.HakoniwaCore.AssetInfoList getAssetList(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetAssetListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *シミュレーションを開始する
     * </pre>
     */
    public hakoniwa.HakoniwaCore.NormalReply startSimulation(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getStartSimulationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *シミュレーションを終了する
     * </pre>
     */
    public hakoniwa.HakoniwaCore.NormalReply stopSimulation(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getStopSimulationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *シミュレーション実行状況を取得する
     * </pre>
     */
    public hakoniwa.HakoniwaCore.SimStatReply getSimStatus(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetSimStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *シミュレーションを実行開始状態に戻す
     * </pre>
     */
    public hakoniwa.HakoniwaCore.NormalReply resetSimulation(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getResetSimulationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *シミュレーション時間同期度合いを取得する
     * </pre>
     */
    public hakoniwa.HakoniwaCore.NormalReply flushSimulationTimeSyncInfo(hakoniwa.HakoniwaCore.SimulationTimeSyncOutputFile request) {
      return blockingUnaryCall(
          getChannel(), getFlushSimulationTimeSyncInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *箱庭アセット非同期通知
     * </pre>
     */
    public java.util.Iterator<hakoniwa.HakoniwaCore.AssetNotification> assetNotificationStart(
        hakoniwa.HakoniwaCore.AssetInfo request) {
      return blockingServerStreamingCall(
          getChannel(), getAssetNotificationStartMethod(), getCallOptions(), request);
    }

    /**
     */
    public hakoniwa.HakoniwaCore.NormalReply assetNotificationFeedback(hakoniwa.HakoniwaCore.AssetNotificationReply request) {
      return blockingUnaryCall(
          getChannel(), getAssetNotificationFeedbackMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CoreServiceFutureStub extends io.grpc.stub.AbstractStub<CoreServiceFutureStub> {
    private CoreServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CoreServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoreServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CoreServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *箱庭アセットを登録する
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<hakoniwa.HakoniwaCore.NormalReply> register(
        hakoniwa.HakoniwaCore.AssetInfo request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *箱庭アセットを登録解除する
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<hakoniwa.HakoniwaCore.NormalReply> unregister(
        hakoniwa.HakoniwaCore.AssetInfo request) {
      return futureUnaryCall(
          getChannel().newCall(getUnregisterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *箱庭アセットのリストを取得する
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<hakoniwa.HakoniwaCore.AssetInfoList> getAssetList(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAssetListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *シミュレーションを開始する
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<hakoniwa.HakoniwaCore.NormalReply> startSimulation(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getStartSimulationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *シミュレーションを終了する
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<hakoniwa.HakoniwaCore.NormalReply> stopSimulation(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getStopSimulationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *シミュレーション実行状況を取得する
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<hakoniwa.HakoniwaCore.SimStatReply> getSimStatus(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSimStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *シミュレーションを実行開始状態に戻す
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<hakoniwa.HakoniwaCore.NormalReply> resetSimulation(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getResetSimulationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *シミュレーション時間同期度合いを取得する
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<hakoniwa.HakoniwaCore.NormalReply> flushSimulationTimeSyncInfo(
        hakoniwa.HakoniwaCore.SimulationTimeSyncOutputFile request) {
      return futureUnaryCall(
          getChannel().newCall(getFlushSimulationTimeSyncInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<hakoniwa.HakoniwaCore.NormalReply> assetNotificationFeedback(
        hakoniwa.HakoniwaCore.AssetNotificationReply request) {
      return futureUnaryCall(
          getChannel().newCall(getAssetNotificationFeedbackMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER = 0;
  private static final int METHODID_UNREGISTER = 1;
  private static final int METHODID_GET_ASSET_LIST = 2;
  private static final int METHODID_START_SIMULATION = 3;
  private static final int METHODID_STOP_SIMULATION = 4;
  private static final int METHODID_GET_SIM_STATUS = 5;
  private static final int METHODID_RESET_SIMULATION = 6;
  private static final int METHODID_FLUSH_SIMULATION_TIME_SYNC_INFO = 7;
  private static final int METHODID_ASSET_NOTIFICATION_START = 8;
  private static final int METHODID_ASSET_NOTIFICATION_FEEDBACK = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CoreServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CoreServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER:
          serviceImpl.register((hakoniwa.HakoniwaCore.AssetInfo) request,
              (io.grpc.stub.StreamObserver<hakoniwa.HakoniwaCore.NormalReply>) responseObserver);
          break;
        case METHODID_UNREGISTER:
          serviceImpl.unregister((hakoniwa.HakoniwaCore.AssetInfo) request,
              (io.grpc.stub.StreamObserver<hakoniwa.HakoniwaCore.NormalReply>) responseObserver);
          break;
        case METHODID_GET_ASSET_LIST:
          serviceImpl.getAssetList((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<hakoniwa.HakoniwaCore.AssetInfoList>) responseObserver);
          break;
        case METHODID_START_SIMULATION:
          serviceImpl.startSimulation((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<hakoniwa.HakoniwaCore.NormalReply>) responseObserver);
          break;
        case METHODID_STOP_SIMULATION:
          serviceImpl.stopSimulation((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<hakoniwa.HakoniwaCore.NormalReply>) responseObserver);
          break;
        case METHODID_GET_SIM_STATUS:
          serviceImpl.getSimStatus((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<hakoniwa.HakoniwaCore.SimStatReply>) responseObserver);
          break;
        case METHODID_RESET_SIMULATION:
          serviceImpl.resetSimulation((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<hakoniwa.HakoniwaCore.NormalReply>) responseObserver);
          break;
        case METHODID_FLUSH_SIMULATION_TIME_SYNC_INFO:
          serviceImpl.flushSimulationTimeSyncInfo((hakoniwa.HakoniwaCore.SimulationTimeSyncOutputFile) request,
              (io.grpc.stub.StreamObserver<hakoniwa.HakoniwaCore.NormalReply>) responseObserver);
          break;
        case METHODID_ASSET_NOTIFICATION_START:
          serviceImpl.assetNotificationStart((hakoniwa.HakoniwaCore.AssetInfo) request,
              (io.grpc.stub.StreamObserver<hakoniwa.HakoniwaCore.AssetNotification>) responseObserver);
          break;
        case METHODID_ASSET_NOTIFICATION_FEEDBACK:
          serviceImpl.assetNotificationFeedback((hakoniwa.HakoniwaCore.AssetNotificationReply) request,
              (io.grpc.stub.StreamObserver<hakoniwa.HakoniwaCore.NormalReply>) responseObserver);
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

  private static abstract class CoreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CoreServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return hakoniwa.HakoniwaCore.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CoreService");
    }
  }

  private static final class CoreServiceFileDescriptorSupplier
      extends CoreServiceBaseDescriptorSupplier {
    CoreServiceFileDescriptorSupplier() {}
  }

  private static final class CoreServiceMethodDescriptorSupplier
      extends CoreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CoreServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CoreServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CoreServiceFileDescriptorSupplier())
              .addMethod(getRegisterMethod())
              .addMethod(getUnregisterMethod())
              .addMethod(getGetAssetListMethod())
              .addMethod(getStartSimulationMethod())
              .addMethod(getStopSimulationMethod())
              .addMethod(getGetSimStatusMethod())
              .addMethod(getResetSimulationMethod())
              .addMethod(getFlushSimulationTimeSyncInfoMethod())
              .addMethod(getAssetNotificationStartMethod())
              .addMethod(getAssetNotificationFeedbackMethod())
              .build();
        }
      }
    }
    return result;
  }
}

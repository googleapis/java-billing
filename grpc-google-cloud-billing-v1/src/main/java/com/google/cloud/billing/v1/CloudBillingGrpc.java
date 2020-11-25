/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.billing.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/** */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/cloud/billing/v1/cloud_billing.proto")
public final class CloudBillingGrpc {

  private CloudBillingGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.billing.v1.CloudBilling";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.billing.v1.GetBillingAccountRequest,
          com.google.cloud.billing.v1.BillingAccount>
      getGetBillingAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBillingAccount",
      requestType = com.google.cloud.billing.v1.GetBillingAccountRequest.class,
      responseType = com.google.cloud.billing.v1.BillingAccount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.billing.v1.GetBillingAccountRequest,
          com.google.cloud.billing.v1.BillingAccount>
      getGetBillingAccountMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.billing.v1.GetBillingAccountRequest,
            com.google.cloud.billing.v1.BillingAccount>
        getGetBillingAccountMethod;
    if ((getGetBillingAccountMethod = CloudBillingGrpc.getGetBillingAccountMethod) == null) {
      synchronized (CloudBillingGrpc.class) {
        if ((getGetBillingAccountMethod = CloudBillingGrpc.getGetBillingAccountMethod) == null) {
          CloudBillingGrpc.getGetBillingAccountMethod =
              getGetBillingAccountMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.billing.v1.GetBillingAccountRequest,
                          com.google.cloud.billing.v1.BillingAccount>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBillingAccount"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.billing.v1.GetBillingAccountRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.billing.v1.BillingAccount.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new CloudBillingMethodDescriptorSupplier("GetBillingAccount"))
                      .build();
        }
      }
    }
    return getGetBillingAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.billing.v1.ListBillingAccountsRequest,
          com.google.cloud.billing.v1.ListBillingAccountsResponse>
      getListBillingAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBillingAccounts",
      requestType = com.google.cloud.billing.v1.ListBillingAccountsRequest.class,
      responseType = com.google.cloud.billing.v1.ListBillingAccountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.billing.v1.ListBillingAccountsRequest,
          com.google.cloud.billing.v1.ListBillingAccountsResponse>
      getListBillingAccountsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.billing.v1.ListBillingAccountsRequest,
            com.google.cloud.billing.v1.ListBillingAccountsResponse>
        getListBillingAccountsMethod;
    if ((getListBillingAccountsMethod = CloudBillingGrpc.getListBillingAccountsMethod) == null) {
      synchronized (CloudBillingGrpc.class) {
        if ((getListBillingAccountsMethod = CloudBillingGrpc.getListBillingAccountsMethod)
            == null) {
          CloudBillingGrpc.getListBillingAccountsMethod =
              getListBillingAccountsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.billing.v1.ListBillingAccountsRequest,
                          com.google.cloud.billing.v1.ListBillingAccountsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "ListBillingAccounts"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.billing.v1.ListBillingAccountsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.billing.v1.ListBillingAccountsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new CloudBillingMethodDescriptorSupplier("ListBillingAccounts"))
                      .build();
        }
      }
    }
    return getListBillingAccountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.billing.v1.UpdateBillingAccountRequest,
          com.google.cloud.billing.v1.BillingAccount>
      getUpdateBillingAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBillingAccount",
      requestType = com.google.cloud.billing.v1.UpdateBillingAccountRequest.class,
      responseType = com.google.cloud.billing.v1.BillingAccount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.billing.v1.UpdateBillingAccountRequest,
          com.google.cloud.billing.v1.BillingAccount>
      getUpdateBillingAccountMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.billing.v1.UpdateBillingAccountRequest,
            com.google.cloud.billing.v1.BillingAccount>
        getUpdateBillingAccountMethod;
    if ((getUpdateBillingAccountMethod = CloudBillingGrpc.getUpdateBillingAccountMethod) == null) {
      synchronized (CloudBillingGrpc.class) {
        if ((getUpdateBillingAccountMethod = CloudBillingGrpc.getUpdateBillingAccountMethod)
            == null) {
          CloudBillingGrpc.getUpdateBillingAccountMethod =
              getUpdateBillingAccountMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.billing.v1.UpdateBillingAccountRequest,
                          com.google.cloud.billing.v1.BillingAccount>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "UpdateBillingAccount"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.billing.v1.UpdateBillingAccountRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.billing.v1.BillingAccount.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new CloudBillingMethodDescriptorSupplier("UpdateBillingAccount"))
                      .build();
        }
      }
    }
    return getUpdateBillingAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.billing.v1.CreateBillingAccountRequest,
          com.google.cloud.billing.v1.BillingAccount>
      getCreateBillingAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBillingAccount",
      requestType = com.google.cloud.billing.v1.CreateBillingAccountRequest.class,
      responseType = com.google.cloud.billing.v1.BillingAccount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.billing.v1.CreateBillingAccountRequest,
          com.google.cloud.billing.v1.BillingAccount>
      getCreateBillingAccountMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.billing.v1.CreateBillingAccountRequest,
            com.google.cloud.billing.v1.BillingAccount>
        getCreateBillingAccountMethod;
    if ((getCreateBillingAccountMethod = CloudBillingGrpc.getCreateBillingAccountMethod) == null) {
      synchronized (CloudBillingGrpc.class) {
        if ((getCreateBillingAccountMethod = CloudBillingGrpc.getCreateBillingAccountMethod)
            == null) {
          CloudBillingGrpc.getCreateBillingAccountMethod =
              getCreateBillingAccountMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.billing.v1.CreateBillingAccountRequest,
                          com.google.cloud.billing.v1.BillingAccount>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "CreateBillingAccount"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.billing.v1.CreateBillingAccountRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.billing.v1.BillingAccount.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new CloudBillingMethodDescriptorSupplier("CreateBillingAccount"))
                      .build();
        }
      }
    }
    return getCreateBillingAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.billing.v1.ListProjectBillingInfoRequest,
          com.google.cloud.billing.v1.ListProjectBillingInfoResponse>
      getListProjectBillingInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListProjectBillingInfo",
      requestType = com.google.cloud.billing.v1.ListProjectBillingInfoRequest.class,
      responseType = com.google.cloud.billing.v1.ListProjectBillingInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.billing.v1.ListProjectBillingInfoRequest,
          com.google.cloud.billing.v1.ListProjectBillingInfoResponse>
      getListProjectBillingInfoMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.billing.v1.ListProjectBillingInfoRequest,
            com.google.cloud.billing.v1.ListProjectBillingInfoResponse>
        getListProjectBillingInfoMethod;
    if ((getListProjectBillingInfoMethod = CloudBillingGrpc.getListProjectBillingInfoMethod)
        == null) {
      synchronized (CloudBillingGrpc.class) {
        if ((getListProjectBillingInfoMethod = CloudBillingGrpc.getListProjectBillingInfoMethod)
            == null) {
          CloudBillingGrpc.getListProjectBillingInfoMethod =
              getListProjectBillingInfoMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.billing.v1.ListProjectBillingInfoRequest,
                          com.google.cloud.billing.v1.ListProjectBillingInfoResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "ListProjectBillingInfo"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.billing.v1.ListProjectBillingInfoRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.billing.v1.ListProjectBillingInfoResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new CloudBillingMethodDescriptorSupplier("ListProjectBillingInfo"))
                      .build();
        }
      }
    }
    return getListProjectBillingInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.billing.v1.GetProjectBillingInfoRequest,
          com.google.cloud.billing.v1.ProjectBillingInfo>
      getGetProjectBillingInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProjectBillingInfo",
      requestType = com.google.cloud.billing.v1.GetProjectBillingInfoRequest.class,
      responseType = com.google.cloud.billing.v1.ProjectBillingInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.billing.v1.GetProjectBillingInfoRequest,
          com.google.cloud.billing.v1.ProjectBillingInfo>
      getGetProjectBillingInfoMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.billing.v1.GetProjectBillingInfoRequest,
            com.google.cloud.billing.v1.ProjectBillingInfo>
        getGetProjectBillingInfoMethod;
    if ((getGetProjectBillingInfoMethod = CloudBillingGrpc.getGetProjectBillingInfoMethod)
        == null) {
      synchronized (CloudBillingGrpc.class) {
        if ((getGetProjectBillingInfoMethod = CloudBillingGrpc.getGetProjectBillingInfoMethod)
            == null) {
          CloudBillingGrpc.getGetProjectBillingInfoMethod =
              getGetProjectBillingInfoMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.billing.v1.GetProjectBillingInfoRequest,
                          com.google.cloud.billing.v1.ProjectBillingInfo>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "GetProjectBillingInfo"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.billing.v1.GetProjectBillingInfoRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.billing.v1.ProjectBillingInfo.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new CloudBillingMethodDescriptorSupplier("GetProjectBillingInfo"))
                      .build();
        }
      }
    }
    return getGetProjectBillingInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest,
          com.google.cloud.billing.v1.ProjectBillingInfo>
      getUpdateProjectBillingInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProjectBillingInfo",
      requestType = com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest.class,
      responseType = com.google.cloud.billing.v1.ProjectBillingInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest,
          com.google.cloud.billing.v1.ProjectBillingInfo>
      getUpdateProjectBillingInfoMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest,
            com.google.cloud.billing.v1.ProjectBillingInfo>
        getUpdateProjectBillingInfoMethod;
    if ((getUpdateProjectBillingInfoMethod = CloudBillingGrpc.getUpdateProjectBillingInfoMethod)
        == null) {
      synchronized (CloudBillingGrpc.class) {
        if ((getUpdateProjectBillingInfoMethod = CloudBillingGrpc.getUpdateProjectBillingInfoMethod)
            == null) {
          CloudBillingGrpc.getUpdateProjectBillingInfoMethod =
              getUpdateProjectBillingInfoMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest,
                          com.google.cloud.billing.v1.ProjectBillingInfo>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "UpdateProjectBillingInfo"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.billing.v1.ProjectBillingInfo.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new CloudBillingMethodDescriptorSupplier("UpdateProjectBillingInfo"))
                      .build();
        }
      }
    }
    return getUpdateProjectBillingInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.iam.v1.GetIamPolicyRequest, com.google.iam.v1.Policy>
      getGetIamPolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetIamPolicy",
      requestType = com.google.iam.v1.GetIamPolicyRequest.class,
      responseType = com.google.iam.v1.Policy.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.iam.v1.GetIamPolicyRequest, com.google.iam.v1.Policy>
      getGetIamPolicyMethod() {
    io.grpc.MethodDescriptor<com.google.iam.v1.GetIamPolicyRequest, com.google.iam.v1.Policy>
        getGetIamPolicyMethod;
    if ((getGetIamPolicyMethod = CloudBillingGrpc.getGetIamPolicyMethod) == null) {
      synchronized (CloudBillingGrpc.class) {
        if ((getGetIamPolicyMethod = CloudBillingGrpc.getGetIamPolicyMethod) == null) {
          CloudBillingGrpc.getGetIamPolicyMethod =
              getGetIamPolicyMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.iam.v1.GetIamPolicyRequest, com.google.iam.v1.Policy>newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetIamPolicy"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.iam.v1.GetIamPolicyRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.iam.v1.Policy.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudBillingMethodDescriptorSupplier("GetIamPolicy"))
                      .build();
        }
      }
    }
    return getGetIamPolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.iam.v1.SetIamPolicyRequest, com.google.iam.v1.Policy>
      getSetIamPolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetIamPolicy",
      requestType = com.google.iam.v1.SetIamPolicyRequest.class,
      responseType = com.google.iam.v1.Policy.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.iam.v1.SetIamPolicyRequest, com.google.iam.v1.Policy>
      getSetIamPolicyMethod() {
    io.grpc.MethodDescriptor<com.google.iam.v1.SetIamPolicyRequest, com.google.iam.v1.Policy>
        getSetIamPolicyMethod;
    if ((getSetIamPolicyMethod = CloudBillingGrpc.getSetIamPolicyMethod) == null) {
      synchronized (CloudBillingGrpc.class) {
        if ((getSetIamPolicyMethod = CloudBillingGrpc.getSetIamPolicyMethod) == null) {
          CloudBillingGrpc.getSetIamPolicyMethod =
              getSetIamPolicyMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.iam.v1.SetIamPolicyRequest, com.google.iam.v1.Policy>newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetIamPolicy"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.iam.v1.SetIamPolicyRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.iam.v1.Policy.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudBillingMethodDescriptorSupplier("SetIamPolicy"))
                      .build();
        }
      }
    }
    return getSetIamPolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.iam.v1.TestIamPermissionsRequest, com.google.iam.v1.TestIamPermissionsResponse>
      getTestIamPermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TestIamPermissions",
      requestType = com.google.iam.v1.TestIamPermissionsRequest.class,
      responseType = com.google.iam.v1.TestIamPermissionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.iam.v1.TestIamPermissionsRequest, com.google.iam.v1.TestIamPermissionsResponse>
      getTestIamPermissionsMethod() {
    io.grpc.MethodDescriptor<
            com.google.iam.v1.TestIamPermissionsRequest,
            com.google.iam.v1.TestIamPermissionsResponse>
        getTestIamPermissionsMethod;
    if ((getTestIamPermissionsMethod = CloudBillingGrpc.getTestIamPermissionsMethod) == null) {
      synchronized (CloudBillingGrpc.class) {
        if ((getTestIamPermissionsMethod = CloudBillingGrpc.getTestIamPermissionsMethod) == null) {
          CloudBillingGrpc.getTestIamPermissionsMethod =
              getTestIamPermissionsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.iam.v1.TestIamPermissionsRequest,
                          com.google.iam.v1.TestIamPermissionsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TestIamPermissions"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.iam.v1.TestIamPermissionsRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.iam.v1.TestIamPermissionsResponse.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new CloudBillingMethodDescriptorSupplier("TestIamPermissions"))
                      .build();
        }
      }
    }
    return getTestIamPermissionsMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static CloudBillingStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CloudBillingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<CloudBillingStub>() {
          @java.lang.Override
          public CloudBillingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new CloudBillingStub(channel, callOptions);
          }
        };
    return CloudBillingStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CloudBillingBlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CloudBillingBlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<CloudBillingBlockingStub>() {
          @java.lang.Override
          public CloudBillingBlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new CloudBillingBlockingStub(channel, callOptions);
          }
        };
    return CloudBillingBlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static CloudBillingFutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CloudBillingFutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<CloudBillingFutureStub>() {
          @java.lang.Override
          public CloudBillingFutureStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new CloudBillingFutureStub(channel, callOptions);
          }
        };
    return CloudBillingFutureStub.newStub(factory, channel);
  }

  /** */
  public abstract static class CloudBillingImplBase implements io.grpc.BindableService {

    /** */
    public void getBillingAccount(
        com.google.cloud.billing.v1.GetBillingAccountRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.billing.v1.BillingAccount> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBillingAccountMethod(), responseObserver);
    }

    /** */
    public void listBillingAccounts(
        com.google.cloud.billing.v1.ListBillingAccountsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.billing.v1.ListBillingAccountsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListBillingAccountsMethod(), responseObserver);
    }

    /** */
    public void updateBillingAccount(
        com.google.cloud.billing.v1.UpdateBillingAccountRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.billing.v1.BillingAccount> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateBillingAccountMethod(), responseObserver);
    }

    /** */
    public void createBillingAccount(
        com.google.cloud.billing.v1.CreateBillingAccountRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.billing.v1.BillingAccount> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateBillingAccountMethod(), responseObserver);
    }

    /** */
    public void listProjectBillingInfo(
        com.google.cloud.billing.v1.ListProjectBillingInfoRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.billing.v1.ListProjectBillingInfoResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListProjectBillingInfoMethod(), responseObserver);
    }

    /** */
    public void getProjectBillingInfo(
        com.google.cloud.billing.v1.GetProjectBillingInfoRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.billing.v1.ProjectBillingInfo>
            responseObserver) {
      asyncUnimplementedUnaryCall(getGetProjectBillingInfoMethod(), responseObserver);
    }

    /** */
    public void updateProjectBillingInfo(
        com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.billing.v1.ProjectBillingInfo>
            responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateProjectBillingInfoMethod(), responseObserver);
    }

    /** */
    public void getIamPolicy(
        com.google.iam.v1.GetIamPolicyRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.v1.Policy> responseObserver) {
      asyncUnimplementedUnaryCall(getGetIamPolicyMethod(), responseObserver);
    }

    /** */
    public void setIamPolicy(
        com.google.iam.v1.SetIamPolicyRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.v1.Policy> responseObserver) {
      asyncUnimplementedUnaryCall(getSetIamPolicyMethod(), responseObserver);
    }

    /** */
    public void testIamPermissions(
        com.google.iam.v1.TestIamPermissionsRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.v1.TestIamPermissionsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getTestIamPermissionsMethod(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getGetBillingAccountMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.billing.v1.GetBillingAccountRequest,
                      com.google.cloud.billing.v1.BillingAccount>(
                      this, METHODID_GET_BILLING_ACCOUNT)))
          .addMethod(
              getListBillingAccountsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.billing.v1.ListBillingAccountsRequest,
                      com.google.cloud.billing.v1.ListBillingAccountsResponse>(
                      this, METHODID_LIST_BILLING_ACCOUNTS)))
          .addMethod(
              getUpdateBillingAccountMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.billing.v1.UpdateBillingAccountRequest,
                      com.google.cloud.billing.v1.BillingAccount>(
                      this, METHODID_UPDATE_BILLING_ACCOUNT)))
          .addMethod(
              getCreateBillingAccountMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.billing.v1.CreateBillingAccountRequest,
                      com.google.cloud.billing.v1.BillingAccount>(
                      this, METHODID_CREATE_BILLING_ACCOUNT)))
          .addMethod(
              getListProjectBillingInfoMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.billing.v1.ListProjectBillingInfoRequest,
                      com.google.cloud.billing.v1.ListProjectBillingInfoResponse>(
                      this, METHODID_LIST_PROJECT_BILLING_INFO)))
          .addMethod(
              getGetProjectBillingInfoMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.billing.v1.GetProjectBillingInfoRequest,
                      com.google.cloud.billing.v1.ProjectBillingInfo>(
                      this, METHODID_GET_PROJECT_BILLING_INFO)))
          .addMethod(
              getUpdateProjectBillingInfoMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest,
                      com.google.cloud.billing.v1.ProjectBillingInfo>(
                      this, METHODID_UPDATE_PROJECT_BILLING_INFO)))
          .addMethod(
              getGetIamPolicyMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.iam.v1.GetIamPolicyRequest, com.google.iam.v1.Policy>(
                      this, METHODID_GET_IAM_POLICY)))
          .addMethod(
              getSetIamPolicyMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.iam.v1.SetIamPolicyRequest, com.google.iam.v1.Policy>(
                      this, METHODID_SET_IAM_POLICY)))
          .addMethod(
              getTestIamPermissionsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.iam.v1.TestIamPermissionsRequest,
                      com.google.iam.v1.TestIamPermissionsResponse>(
                      this, METHODID_TEST_IAM_PERMISSIONS)))
          .build();
    }
  }

  /** */
  public static final class CloudBillingStub
      extends io.grpc.stub.AbstractAsyncStub<CloudBillingStub> {
    private CloudBillingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CloudBillingStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CloudBillingStub(channel, callOptions);
    }

    /** */
    public void getBillingAccount(
        com.google.cloud.billing.v1.GetBillingAccountRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.billing.v1.BillingAccount> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBillingAccountMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void listBillingAccounts(
        com.google.cloud.billing.v1.ListBillingAccountsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.billing.v1.ListBillingAccountsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListBillingAccountsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void updateBillingAccount(
        com.google.cloud.billing.v1.UpdateBillingAccountRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.billing.v1.BillingAccount> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateBillingAccountMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void createBillingAccount(
        com.google.cloud.billing.v1.CreateBillingAccountRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.billing.v1.BillingAccount> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateBillingAccountMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void listProjectBillingInfo(
        com.google.cloud.billing.v1.ListProjectBillingInfoRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.billing.v1.ListProjectBillingInfoResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListProjectBillingInfoMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void getProjectBillingInfo(
        com.google.cloud.billing.v1.GetProjectBillingInfoRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.billing.v1.ProjectBillingInfo>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProjectBillingInfoMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void updateProjectBillingInfo(
        com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.billing.v1.ProjectBillingInfo>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateProjectBillingInfoMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void getIamPolicy(
        com.google.iam.v1.GetIamPolicyRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.v1.Policy> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetIamPolicyMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void setIamPolicy(
        com.google.iam.v1.SetIamPolicyRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.v1.Policy> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetIamPolicyMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void testIamPermissions(
        com.google.iam.v1.TestIamPermissionsRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.v1.TestIamPermissionsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTestIamPermissionsMethod(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /** */
  public static final class CloudBillingBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CloudBillingBlockingStub> {
    private CloudBillingBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CloudBillingBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CloudBillingBlockingStub(channel, callOptions);
    }

    /** */
    public com.google.cloud.billing.v1.BillingAccount getBillingAccount(
        com.google.cloud.billing.v1.GetBillingAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBillingAccountMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.billing.v1.ListBillingAccountsResponse listBillingAccounts(
        com.google.cloud.billing.v1.ListBillingAccountsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListBillingAccountsMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.billing.v1.BillingAccount updateBillingAccount(
        com.google.cloud.billing.v1.UpdateBillingAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateBillingAccountMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.billing.v1.BillingAccount createBillingAccount(
        com.google.cloud.billing.v1.CreateBillingAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateBillingAccountMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.billing.v1.ListProjectBillingInfoResponse listProjectBillingInfo(
        com.google.cloud.billing.v1.ListProjectBillingInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getListProjectBillingInfoMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.billing.v1.ProjectBillingInfo getProjectBillingInfo(
        com.google.cloud.billing.v1.GetProjectBillingInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetProjectBillingInfoMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.billing.v1.ProjectBillingInfo updateProjectBillingInfo(
        com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateProjectBillingInfoMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.iam.v1.Policy getIamPolicy(com.google.iam.v1.GetIamPolicyRequest request) {
      return blockingUnaryCall(getChannel(), getGetIamPolicyMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.iam.v1.Policy setIamPolicy(com.google.iam.v1.SetIamPolicyRequest request) {
      return blockingUnaryCall(getChannel(), getSetIamPolicyMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.iam.v1.TestIamPermissionsResponse testIamPermissions(
        com.google.iam.v1.TestIamPermissionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getTestIamPermissionsMethod(), getCallOptions(), request);
    }
  }

  /** */
  public static final class CloudBillingFutureStub
      extends io.grpc.stub.AbstractFutureStub<CloudBillingFutureStub> {
    private CloudBillingFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CloudBillingFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CloudBillingFutureStub(channel, callOptions);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.billing.v1.BillingAccount>
        getBillingAccount(com.google.cloud.billing.v1.GetBillingAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBillingAccountMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.billing.v1.ListBillingAccountsResponse>
        listBillingAccounts(com.google.cloud.billing.v1.ListBillingAccountsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListBillingAccountsMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.billing.v1.BillingAccount>
        updateBillingAccount(com.google.cloud.billing.v1.UpdateBillingAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateBillingAccountMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.billing.v1.BillingAccount>
        createBillingAccount(com.google.cloud.billing.v1.CreateBillingAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateBillingAccountMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.billing.v1.ListProjectBillingInfoResponse>
        listProjectBillingInfo(com.google.cloud.billing.v1.ListProjectBillingInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListProjectBillingInfoMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.billing.v1.ProjectBillingInfo>
        getProjectBillingInfo(com.google.cloud.billing.v1.GetProjectBillingInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProjectBillingInfoMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.billing.v1.ProjectBillingInfo>
        updateProjectBillingInfo(
            com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateProjectBillingInfoMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.iam.v1.Policy>
        getIamPolicy(com.google.iam.v1.GetIamPolicyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetIamPolicyMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.iam.v1.Policy>
        setIamPolicy(com.google.iam.v1.SetIamPolicyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetIamPolicyMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.iam.v1.TestIamPermissionsResponse>
        testIamPermissions(com.google.iam.v1.TestIamPermissionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTestIamPermissionsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BILLING_ACCOUNT = 0;
  private static final int METHODID_LIST_BILLING_ACCOUNTS = 1;
  private static final int METHODID_UPDATE_BILLING_ACCOUNT = 2;
  private static final int METHODID_CREATE_BILLING_ACCOUNT = 3;
  private static final int METHODID_LIST_PROJECT_BILLING_INFO = 4;
  private static final int METHODID_GET_PROJECT_BILLING_INFO = 5;
  private static final int METHODID_UPDATE_PROJECT_BILLING_INFO = 6;
  private static final int METHODID_GET_IAM_POLICY = 7;
  private static final int METHODID_SET_IAM_POLICY = 8;
  private static final int METHODID_TEST_IAM_PERMISSIONS = 9;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CloudBillingImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CloudBillingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BILLING_ACCOUNT:
          serviceImpl.getBillingAccount(
              (com.google.cloud.billing.v1.GetBillingAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.billing.v1.BillingAccount>)
                  responseObserver);
          break;
        case METHODID_LIST_BILLING_ACCOUNTS:
          serviceImpl.listBillingAccounts(
              (com.google.cloud.billing.v1.ListBillingAccountsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.billing.v1.ListBillingAccountsResponse>)
                  responseObserver);
          break;
        case METHODID_UPDATE_BILLING_ACCOUNT:
          serviceImpl.updateBillingAccount(
              (com.google.cloud.billing.v1.UpdateBillingAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.billing.v1.BillingAccount>)
                  responseObserver);
          break;
        case METHODID_CREATE_BILLING_ACCOUNT:
          serviceImpl.createBillingAccount(
              (com.google.cloud.billing.v1.CreateBillingAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.billing.v1.BillingAccount>)
                  responseObserver);
          break;
        case METHODID_LIST_PROJECT_BILLING_INFO:
          serviceImpl.listProjectBillingInfo(
              (com.google.cloud.billing.v1.ListProjectBillingInfoRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.billing.v1.ListProjectBillingInfoResponse>)
                  responseObserver);
          break;
        case METHODID_GET_PROJECT_BILLING_INFO:
          serviceImpl.getProjectBillingInfo(
              (com.google.cloud.billing.v1.GetProjectBillingInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.billing.v1.ProjectBillingInfo>)
                  responseObserver);
          break;
        case METHODID_UPDATE_PROJECT_BILLING_INFO:
          serviceImpl.updateProjectBillingInfo(
              (com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.billing.v1.ProjectBillingInfo>)
                  responseObserver);
          break;
        case METHODID_GET_IAM_POLICY:
          serviceImpl.getIamPolicy(
              (com.google.iam.v1.GetIamPolicyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.iam.v1.Policy>) responseObserver);
          break;
        case METHODID_SET_IAM_POLICY:
          serviceImpl.setIamPolicy(
              (com.google.iam.v1.SetIamPolicyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.iam.v1.Policy>) responseObserver);
          break;
        case METHODID_TEST_IAM_PERMISSIONS:
          serviceImpl.testIamPermissions(
              (com.google.iam.v1.TestIamPermissionsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.iam.v1.TestIamPermissionsResponse>)
                  responseObserver);
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

  private abstract static class CloudBillingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CloudBillingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.billing.v1.CloudBillingProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CloudBilling");
    }
  }

  private static final class CloudBillingFileDescriptorSupplier
      extends CloudBillingBaseDescriptorSupplier {
    CloudBillingFileDescriptorSupplier() {}
  }

  private static final class CloudBillingMethodDescriptorSupplier
      extends CloudBillingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CloudBillingMethodDescriptorSupplier(String methodName) {
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
      synchronized (CloudBillingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new CloudBillingFileDescriptorSupplier())
                      .addMethod(getGetBillingAccountMethod())
                      .addMethod(getListBillingAccountsMethod())
                      .addMethod(getUpdateBillingAccountMethod())
                      .addMethod(getCreateBillingAccountMethod())
                      .addMethod(getListProjectBillingInfoMethod())
                      .addMethod(getGetProjectBillingInfoMethod())
                      .addMethod(getUpdateProjectBillingInfoMethod())
                      .addMethod(getGetIamPolicyMethod())
                      .addMethod(getSetIamPolicyMethod())
                      .addMethod(getTestIamPermissionsMethod())
                      .build();
        }
      }
    }
    return result;
  }
}

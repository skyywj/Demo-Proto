package com.test.grpc;

import com.fullcontact.rpc.jersey.HttpHeaderInterceptors;
import com.fullcontact.rpc.jersey.JerseyUnaryObserver;
import com.fullcontact.rpc.jersey.JerseyStreamingObserver;
import com.fullcontact.rpc.jersey.RequestParser;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;

import java.io.OutputStream;
import java.io.IOException;
import javax.servlet.AsyncContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;

import static com.fullcontact.rpc.jersey.JerseyStreamingObserver.VARIANT_LIST;

@javax.annotation.Generated(
    value = "by grpc-jersey compiler (version 0.3.2)",
    comments = "Source: test/test.proto")
@Produces({"application/json; charset=UTF-8"})
@Consumes({"application/json; charset=UTF-8"})
@Path("/")
public class ProtodemoGrpcJerseyResource {
    private com.test.grpc.ProtodemoGrpc.ProtodemoStub stub;

    public ProtodemoGrpcJerseyResource(com.test.grpc.ProtodemoGrpc.ProtodemoStub stub) {
        this.stub = stub;
    }

    @POST
    @Path("/test")
    public void testHttp_POST_0(
            @Context UriInfo uriInfo,
            @Context HttpHeaders headers
            ,String body
            ,@Suspended final AsyncResponse asyncResponse) throws IOException {
        HttpHeaderInterceptors.HttpHeaderClientInterceptor interceptor =
            HttpHeaderInterceptors.clientInterceptor(headers);
        JerseyUnaryObserver<com.test.grpc.TestResponse> observer = new JerseyUnaryObserver<>(asyncResponse, interceptor);
        com.test.grpc.TestRequest.Builder r = com.test.grpc.TestRequest.newBuilder();
        com.test.grpc.ProtodemoGrpc.ProtodemoStub stub = this.stub;
        try {
            stub = RequestParser.parseHeaders(headers, stub);
            stub = stub.withInterceptors(interceptor);
            RequestParser.handleBody("*", r, body);
        } catch(Exception e) {
            observer.onError(e);
            return;
        }
        stub.testHttp(r.build(), observer);
    }
}

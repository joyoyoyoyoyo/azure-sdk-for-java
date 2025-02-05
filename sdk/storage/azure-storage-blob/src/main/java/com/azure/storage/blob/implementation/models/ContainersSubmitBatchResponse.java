// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import java.io.Closeable;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;

/**
 * Contains all response data for the submitBatch operation.
 */
public final class ContainersSubmitBatchResponse extends ResponseBase<ContainerSubmitBatchHeaders, Flux<ByteBuffer>> implements Closeable {
    /**
     * Creates an instance of ContainersSubmitBatchResponse.
     *
     * @param request the request which resulted in this ContainersSubmitBatchResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the content stream.
     * @param headers the deserialized headers of the HTTP response.
     */
    public ContainersSubmitBatchResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, Flux<ByteBuffer> value, ContainerSubmitBatchHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * @return the response content stream.
     */
    @Override
    public Flux<ByteBuffer> getValue() {
        return super.getValue();
    }

    /**
     * Disposes of the connection associated with this stream response.
     */
    @Override
    public void close() {
        getValue().subscribe(bb -> { }, t -> { }).dispose();
    }
}

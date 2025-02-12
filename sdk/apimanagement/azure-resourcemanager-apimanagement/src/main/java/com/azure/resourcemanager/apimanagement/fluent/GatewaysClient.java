// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.GatewayContractInner;
import com.azure.resourcemanager.apimanagement.fluent.models.GatewayKeysContractInner;
import com.azure.resourcemanager.apimanagement.fluent.models.GatewayTokenContractInner;
import com.azure.resourcemanager.apimanagement.models.GatewayKeyRegenerationRequestContract;
import com.azure.resourcemanager.apimanagement.models.GatewayTokenRequestContract;

/** An instance of this class provides access to all the operations defined in GatewaysClient. */
public interface GatewaysClient {
    /**
     * Lists a collection of gateways registered with service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Gateway list representation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GatewayContractInner> listByService(String resourceGroupName, String serviceName);

    /**
     * Lists a collection of gateways registered with service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param filter | Field | Usage | Supported operators | Supported functions
     *     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| name | filter | ge, le, eq,
     *     ne, gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;| region | filter | ge, le, eq, ne, gt,
     *     lt | substringof, contains, startswith, endswith |&lt;/br&gt;| description | filter | ge, le, eq, ne, gt, lt
     *     | substringof, contains, startswith, endswith |&lt;/br&gt;.
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Gateway list representation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GatewayContractInner> listByService(
        String resourceGroupName, String serviceName, String filter, Integer top, Integer skip, Context context);

    /**
     * Gets the entity state (Etag) version of the Gateway specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void getEntityTag(String resourceGroupName, String serviceName, String gatewayId);

    /**
     * Gets the entity state (Etag) version of the Gateway specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the entity state (Etag) version of the Gateway specified by its identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> getEntityTagWithResponse(
        String resourceGroupName, String serviceName, String gatewayId, Context context);

    /**
     * Gets the details of the Gateway specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the Gateway specified by its identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GatewayContractInner get(String resourceGroupName, String serviceName, String gatewayId);

    /**
     * Gets the details of the Gateway specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the Gateway specified by its identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<GatewayContractInner> getWithResponse(
        String resourceGroupName, String serviceName, String gatewayId, Context context);

    /**
     * Creates or updates a Gateway to be used in Api Management instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @param parameters Gateway details.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return gateway details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GatewayContractInner createOrUpdate(
        String resourceGroupName, String serviceName, String gatewayId, GatewayContractInner parameters);

    /**
     * Creates or updates a Gateway to be used in Api Management instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @param parameters Gateway details.
     * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return gateway details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<GatewayContractInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String serviceName,
        String gatewayId,
        GatewayContractInner parameters,
        String ifMatch,
        Context context);

    /**
     * Updates the details of the gateway specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param parameters Gateway details.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return gateway details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GatewayContractInner update(
        String resourceGroupName,
        String serviceName,
        String gatewayId,
        String ifMatch,
        GatewayContractInner parameters);

    /**
     * Updates the details of the gateway specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param parameters Gateway details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return gateway details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<GatewayContractInner> updateWithResponse(
        String resourceGroupName,
        String serviceName,
        String gatewayId,
        String ifMatch,
        GatewayContractInner parameters,
        Context context);

    /**
     * Deletes specific Gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serviceName, String gatewayId, String ifMatch);

    /**
     * Deletes specific Gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String serviceName, String gatewayId, String ifMatch, Context context);

    /**
     * Retrieves gateway keys.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return gateway authentication keys.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GatewayKeysContractInner listKeys(String resourceGroupName, String serviceName, String gatewayId);

    /**
     * Retrieves gateway keys.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return gateway authentication keys.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<GatewayKeysContractInner> listKeysWithResponse(
        String resourceGroupName, String serviceName, String gatewayId, Context context);

    /**
     * Regenerates specified gateway key invalidating any tokens created with it.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @param parameters Gateway key regeneration request contract properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void regenerateKey(
        String resourceGroupName,
        String serviceName,
        String gatewayId,
        GatewayKeyRegenerationRequestContract parameters);

    /**
     * Regenerates specified gateway key invalidating any tokens created with it.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @param parameters Gateway key regeneration request contract properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> regenerateKeyWithResponse(
        String resourceGroupName,
        String serviceName,
        String gatewayId,
        GatewayKeyRegenerationRequestContract parameters,
        Context context);

    /**
     * Gets the Shared Access Authorization Token for the gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @param parameters Gateway token request contract properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Shared Access Authorization Token for the gateway.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GatewayTokenContractInner generateToken(
        String resourceGroupName, String serviceName, String gatewayId, GatewayTokenRequestContract parameters);

    /**
     * Gets the Shared Access Authorization Token for the gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @param parameters Gateway token request contract properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Shared Access Authorization Token for the gateway.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<GatewayTokenContractInner> generateTokenWithResponse(
        String resourceGroupName,
        String serviceName,
        String gatewayId,
        GatewayTokenRequestContract parameters,
        Context context);
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.resourcemanager.eventgrid.fluent.models.TopicTypeInfoInner;
import java.util.List;

/** An immutable client-side representation of TopicTypeInfo. */
public interface TopicTypeInfo {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the provider property: Namespace of the provider of the topic type.
     *
     * @return the provider value.
     */
    String provider();

    /**
     * Gets the displayName property: Display Name for the topic type.
     *
     * @return the displayName value.
     */
    String displayName();

    /**
     * Gets the description property: Description of the topic type.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the resourceRegionType property: Region type of the resource.
     *
     * @return the resourceRegionType value.
     */
    ResourceRegionType resourceRegionType();

    /**
     * Gets the provisioningState property: Provisioning state of the topic type.
     *
     * @return the provisioningState value.
     */
    TopicTypeProvisioningState provisioningState();

    /**
     * Gets the supportedLocations property: List of locations supported by this topic type.
     *
     * @return the supportedLocations value.
     */
    List<String> supportedLocations();

    /**
     * Gets the sourceResourceFormat property: Source resource format.
     *
     * @return the sourceResourceFormat value.
     */
    String sourceResourceFormat();

    /**
     * Gets the supportedScopesForSource property: Supported source scopes.
     *
     * @return the supportedScopesForSource value.
     */
    List<TopicTypePropertiesSupportedScopesForSourceItem> supportedScopesForSource();

    /**
     * Gets the inner com.azure.resourcemanager.eventgrid.fluent.models.TopicTypeInfoInner object.
     *
     * @return the inner object.
     */
    TopicTypeInfoInner innerModel();
}

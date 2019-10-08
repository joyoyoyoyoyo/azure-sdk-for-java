/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for Delete operation.
 */
public class DedicatedCloudNodesDeleteHeaders {
    /**
     * The contentType property.
     */
    @JsonProperty(value = "Content-Type")
    private String contentType;

    /**
     * Get the contentType value.
     *
     * @return the contentType value
     */
    public String contentType() {
        return this.contentType;
    }

    /**
     * Set the contentType value.
     *
     * @param contentType the contentType value to set
     * @return the DedicatedCloudNodesDeleteHeaders object itself.
     */
    public DedicatedCloudNodesDeleteHeaders withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

}

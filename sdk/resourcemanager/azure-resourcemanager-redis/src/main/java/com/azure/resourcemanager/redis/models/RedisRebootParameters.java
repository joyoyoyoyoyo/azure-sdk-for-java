// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Specifies which Redis node(s) to reboot. */
@Fluent
public final class RedisRebootParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RedisRebootParameters.class);

    /*
     * Which Redis node(s) to reboot. Depending on this value data loss is
     * possible.
     */
    @JsonProperty(value = "rebootType")
    private RebootType rebootType;

    /*
     * If clustering is enabled, the ID of the shard to be rebooted.
     */
    @JsonProperty(value = "shardId")
    private Integer shardId;

    /*
     * A list of redis instances to reboot, specified by per-instance SSL ports
     * or non-SSL ports.
     */
    @JsonProperty(value = "ports")
    private List<Integer> ports;

    /**
     * Get the rebootType property: Which Redis node(s) to reboot. Depending on this value data loss is possible.
     *
     * @return the rebootType value.
     */
    public RebootType rebootType() {
        return this.rebootType;
    }

    /**
     * Set the rebootType property: Which Redis node(s) to reboot. Depending on this value data loss is possible.
     *
     * @param rebootType the rebootType value to set.
     * @return the RedisRebootParameters object itself.
     */
    public RedisRebootParameters withRebootType(RebootType rebootType) {
        this.rebootType = rebootType;
        return this;
    }

    /**
     * Get the shardId property: If clustering is enabled, the ID of the shard to be rebooted.
     *
     * @return the shardId value.
     */
    public Integer shardId() {
        return this.shardId;
    }

    /**
     * Set the shardId property: If clustering is enabled, the ID of the shard to be rebooted.
     *
     * @param shardId the shardId value to set.
     * @return the RedisRebootParameters object itself.
     */
    public RedisRebootParameters withShardId(Integer shardId) {
        this.shardId = shardId;
        return this;
    }

    /**
     * Get the ports property: A list of redis instances to reboot, specified by per-instance SSL ports or non-SSL
     * ports.
     *
     * @return the ports value.
     */
    public List<Integer> ports() {
        return this.ports;
    }

    /**
     * Set the ports property: A list of redis instances to reboot, specified by per-instance SSL ports or non-SSL
     * ports.
     *
     * @param ports the ports value to set.
     * @return the RedisRebootParameters object itself.
     */
    public RedisRebootParameters withPorts(List<Integer> ports) {
        this.ports = ports;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}

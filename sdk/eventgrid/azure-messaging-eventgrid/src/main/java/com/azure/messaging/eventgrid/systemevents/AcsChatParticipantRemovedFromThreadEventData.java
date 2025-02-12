// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Schema of the Data property of an EventGridEvent for an Microsoft.Communication.ChatParticipantRemovedFromThread
 * event.
 */
@Fluent
public final class AcsChatParticipantRemovedFromThreadEventData extends AcsChatEventInThreadBaseProperties {
    /*
     * The time at which the user was removed to the thread
     */
    @JsonProperty(value = "time")
    private OffsetDateTime time;

    /*
     * The communication identifier of the user who removed the user
     */
    @JsonProperty(value = "removedByCommunicationIdentifier")
    private CommunicationIdentifierModel removedByCommunicationIdentifier;

    /*
     * The details of the user who was removed
     */
    @JsonProperty(value = "participantRemoved")
    private AcsChatThreadParticipantProperties participantRemoved;

    /*
     * The version of the thread
     */
    @JsonProperty(value = "version")
    private Long version;

    /**
     * Get the time property: The time at which the user was removed to the thread.
     *
     * @return the time value.
     */
    public OffsetDateTime getTime() {
        return this.time;
    }

    /**
     * Set the time property: The time at which the user was removed to the thread.
     *
     * @param time the time value to set.
     * @return the AcsChatParticipantRemovedFromThreadEventData object itself.
     */
    public AcsChatParticipantRemovedFromThreadEventData setTime(OffsetDateTime time) {
        this.time = time;
        return this;
    }

    /**
     * Get the removedByCommunicationIdentifier property: The communication identifier of the user who removed the user.
     *
     * @return the removedByCommunicationIdentifier value.
     */
    public CommunicationIdentifierModel getRemovedByCommunicationIdentifier() {
        return this.removedByCommunicationIdentifier;
    }

    /**
     * Set the removedByCommunicationIdentifier property: The communication identifier of the user who removed the user.
     *
     * @param removedByCommunicationIdentifier the removedByCommunicationIdentifier value to set.
     * @return the AcsChatParticipantRemovedFromThreadEventData object itself.
     */
    public AcsChatParticipantRemovedFromThreadEventData setRemovedByCommunicationIdentifier(
            CommunicationIdentifierModel removedByCommunicationIdentifier) {
        this.removedByCommunicationIdentifier = removedByCommunicationIdentifier;
        return this;
    }

    /**
     * Get the participantRemoved property: The details of the user who was removed.
     *
     * @return the participantRemoved value.
     */
    public AcsChatThreadParticipantProperties getParticipantRemoved() {
        return this.participantRemoved;
    }

    /**
     * Set the participantRemoved property: The details of the user who was removed.
     *
     * @param participantRemoved the participantRemoved value to set.
     * @return the AcsChatParticipantRemovedFromThreadEventData object itself.
     */
    public AcsChatParticipantRemovedFromThreadEventData setParticipantRemoved(
            AcsChatThreadParticipantProperties participantRemoved) {
        this.participantRemoved = participantRemoved;
        return this;
    }

    /**
     * Get the version property: The version of the thread.
     *
     * @return the version value.
     */
    public Long getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The version of the thread.
     *
     * @param version the version value to set.
     * @return the AcsChatParticipantRemovedFromThreadEventData object itself.
     */
    public AcsChatParticipantRemovedFromThreadEventData setVersion(Long version) {
        this.version = version;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsChatParticipantRemovedFromThreadEventData setThreadId(String threadId) {
        super.setThreadId(threadId);
        return this;
    }
}

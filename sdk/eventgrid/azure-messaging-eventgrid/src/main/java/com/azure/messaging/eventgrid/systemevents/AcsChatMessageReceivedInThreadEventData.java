// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Schema of the Data property of an EventGridEvent for an Microsoft.Communication.ChatMessageReceivedInThread event.
 */
@Fluent
public final class AcsChatMessageReceivedInThreadEventData extends AcsChatMessageEventInThreadBaseProperties {
    /*
     * The body of the chat message
     */
    @JsonProperty(value = "messageBody")
    private String messageBody;

    /**
     * Get the messageBody property: The body of the chat message.
     *
     * @return the messageBody value.
     */
    public String getMessageBody() {
        return this.messageBody;
    }

    /**
     * Set the messageBody property: The body of the chat message.
     *
     * @param messageBody the messageBody value to set.
     * @return the AcsChatMessageReceivedInThreadEventData object itself.
     */
    public AcsChatMessageReceivedInThreadEventData setMessageBody(String messageBody) {
        this.messageBody = messageBody;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsChatMessageReceivedInThreadEventData setMessageId(String messageId) {
        super.setMessageId(messageId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsChatMessageReceivedInThreadEventData setSenderCommunicationIdentifier(
            CommunicationIdentifierModel senderCommunicationIdentifier) {
        super.setSenderCommunicationIdentifier(senderCommunicationIdentifier);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsChatMessageReceivedInThreadEventData setSenderDisplayName(String senderDisplayName) {
        super.setSenderDisplayName(senderDisplayName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsChatMessageReceivedInThreadEventData setComposeTime(OffsetDateTime composeTime) {
        super.setComposeTime(composeTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsChatMessageReceivedInThreadEventData setType(String type) {
        super.setType(type);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsChatMessageReceivedInThreadEventData setVersion(Long version) {
        super.setVersion(version);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsChatMessageReceivedInThreadEventData setThreadId(String threadId) {
        super.setThreadId(threadId);
        return this;
    }
}

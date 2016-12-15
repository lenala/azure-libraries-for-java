/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Hybrid Connection contract. This is used to configure a Hybrid Connection.
 */
@JsonFlatten
public class HybridConnectionInner extends Resource {
    /**
     * The name of the Service Bus namespace.
     */
    @JsonProperty(value = "properties.serviceBusNamespace")
    private String serviceBusNamespace;

    /**
     * The name of the Service Bus relay.
     */
    @JsonProperty(value = "properties.relayName")
    private String relayName;

    /**
     * The ARM URI to the Service Bus relay.
     */
    @JsonProperty(value = "properties.relayArmUri")
    private String relayArmUri;

    /**
     * The hostname of the endpoint.
     */
    @JsonProperty(value = "properties.hostname")
    private String hostname;

    /**
     * The port of the endpoint.
     */
    @JsonProperty(value = "properties.port")
    private Integer port;

    /**
     * The name of the Service Bus key which has Send permissions. This is
     * used to authenticate to Service Bus.
     */
    @JsonProperty(value = "properties.sendKeyName")
    private String sendKeyName;

    /**
     * The value of the Service Bus key. This is used to authenticate to
     * Service Bus. In ARM this key will not be returned
     * normally, use the POST /listKeys API instead.
     */
    @JsonProperty(value = "properties.sendKeyValue")
    private String sendKeyValue;

    /**
     * Get the serviceBusNamespace value.
     *
     * @return the serviceBusNamespace value
     */
    public String serviceBusNamespace() {
        return this.serviceBusNamespace;
    }

    /**
     * Set the serviceBusNamespace value.
     *
     * @param serviceBusNamespace the serviceBusNamespace value to set
     * @return the HybridConnectionInner object itself.
     */
    public HybridConnectionInner withServiceBusNamespace(String serviceBusNamespace) {
        this.serviceBusNamespace = serviceBusNamespace;
        return this;
    }

    /**
     * Get the relayName value.
     *
     * @return the relayName value
     */
    public String relayName() {
        return this.relayName;
    }

    /**
     * Set the relayName value.
     *
     * @param relayName the relayName value to set
     * @return the HybridConnectionInner object itself.
     */
    public HybridConnectionInner withRelayName(String relayName) {
        this.relayName = relayName;
        return this;
    }

    /**
     * Get the relayArmUri value.
     *
     * @return the relayArmUri value
     */
    public String relayArmUri() {
        return this.relayArmUri;
    }

    /**
     * Set the relayArmUri value.
     *
     * @param relayArmUri the relayArmUri value to set
     * @return the HybridConnectionInner object itself.
     */
    public HybridConnectionInner withRelayArmUri(String relayArmUri) {
        this.relayArmUri = relayArmUri;
        return this;
    }

    /**
     * Get the hostname value.
     *
     * @return the hostname value
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname value.
     *
     * @param hostname the hostname value to set
     * @return the HybridConnectionInner object itself.
     */
    public HybridConnectionInner withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get the port value.
     *
     * @return the port value
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port value.
     *
     * @param port the port value to set
     * @return the HybridConnectionInner object itself.
     */
    public HybridConnectionInner withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Get the sendKeyName value.
     *
     * @return the sendKeyName value
     */
    public String sendKeyName() {
        return this.sendKeyName;
    }

    /**
     * Set the sendKeyName value.
     *
     * @param sendKeyName the sendKeyName value to set
     * @return the HybridConnectionInner object itself.
     */
    public HybridConnectionInner withSendKeyName(String sendKeyName) {
        this.sendKeyName = sendKeyName;
        return this;
    }

    /**
     * Get the sendKeyValue value.
     *
     * @return the sendKeyValue value
     */
    public String sendKeyValue() {
        return this.sendKeyValue;
    }

    /**
     * Set the sendKeyValue value.
     *
     * @param sendKeyValue the sendKeyValue value to set
     * @return the HybridConnectionInner object itself.
     */
    public HybridConnectionInner withSendKeyValue(String sendKeyValue) {
        this.sendKeyValue = sendKeyValue;
        return this;
    }

}

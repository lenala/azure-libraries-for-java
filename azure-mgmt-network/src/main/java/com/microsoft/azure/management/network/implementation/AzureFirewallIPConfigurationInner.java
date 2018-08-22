/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.implementation;

import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * IP configuration of an Azure Firewall.
 */
@JsonFlatten
public class AzureFirewallIPConfigurationInner extends SubResource {
    /**
     * The Firewall Internal Load Balancer IP to be used as the next hop in
     * User Defined Routes.
     */
    @JsonProperty(value = "properties.privateIPAddress")
    private String privateIPAddress;

    /**
     * Reference of the subnet resource. This resource must be named
     * 'AzureFirewallSubnet'.
     */
    @JsonProperty(value = "properties.subnet")
    private SubResource subnet;

    /**
     * Reference of the PublicIP resource. This field is a mandatory input.
     */
    @JsonProperty(value = "properties.internalPublicIpAddress")
    private SubResource internalPublicIpAddress;

    /**
     * Reference of the PublicIP resource. This field is populated in the
     * output.
     */
    @JsonProperty(value = "properties.publicIPAddress")
    private SubResource publicIPAddress;

    /**
     * The provisioning state of the resource. Possible values include:
     * 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private ProvisioningState provisioningState;

    /**
     * Name of the resource that is unique within a resource group. This name
     * can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get the Firewall Internal Load Balancer IP to be used as the next hop in User Defined Routes.
     *
     * @return the privateIPAddress value
     */
    public String privateIPAddress() {
        return this.privateIPAddress;
    }

    /**
     * Set the Firewall Internal Load Balancer IP to be used as the next hop in User Defined Routes.
     *
     * @param privateIPAddress the privateIPAddress value to set
     * @return the AzureFirewallIPConfigurationInner object itself.
     */
    public AzureFirewallIPConfigurationInner withPrivateIPAddress(String privateIPAddress) {
        this.privateIPAddress = privateIPAddress;
        return this;
    }

    /**
     * Get reference of the subnet resource. This resource must be named 'AzureFirewallSubnet'.
     *
     * @return the subnet value
     */
    public SubResource subnet() {
        return this.subnet;
    }

    /**
     * Set reference of the subnet resource. This resource must be named 'AzureFirewallSubnet'.
     *
     * @param subnet the subnet value to set
     * @return the AzureFirewallIPConfigurationInner object itself.
     */
    public AzureFirewallIPConfigurationInner withSubnet(SubResource subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get reference of the PublicIP resource. This field is a mandatory input.
     *
     * @return the internalPublicIpAddress value
     */
    public SubResource internalPublicIpAddress() {
        return this.internalPublicIpAddress;
    }

    /**
     * Set reference of the PublicIP resource. This field is a mandatory input.
     *
     * @param internalPublicIpAddress the internalPublicIpAddress value to set
     * @return the AzureFirewallIPConfigurationInner object itself.
     */
    public AzureFirewallIPConfigurationInner withInternalPublicIpAddress(SubResource internalPublicIpAddress) {
        this.internalPublicIpAddress = internalPublicIpAddress;
        return this;
    }

    /**
     * Get reference of the PublicIP resource. This field is populated in the output.
     *
     * @return the publicIPAddress value
     */
    public SubResource publicIPAddress() {
        return this.publicIPAddress;
    }

    /**
     * Set reference of the PublicIP resource. This field is populated in the output.
     *
     * @param publicIPAddress the publicIPAddress value to set
     * @return the AzureFirewallIPConfigurationInner object itself.
     */
    public AzureFirewallIPConfigurationInner withPublicIPAddress(SubResource publicIPAddress) {
        this.publicIPAddress = publicIPAddress;
        return this;
    }

    /**
     * Get the provisioning state of the resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioning state of the resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the AzureFirewallIPConfigurationInner object itself.
     */
    public AzureFirewallIPConfigurationInner withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @param name the name value to set
     * @return the AzureFirewallIPConfigurationInner object itself.
     */
    public AzureFirewallIPConfigurationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set a unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set
     * @return the AzureFirewallIPConfigurationInner object itself.
     */
    public AzureFirewallIPConfigurationInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

}

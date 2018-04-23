/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The configuration for compute nodes in a pool based on the Azure Virtual
 * Machines infrastructure.
 */
public class VirtualMachineConfiguration {
    /**
     * A reference to the Azure Virtual Machines Marketplace Image or the
     * custom Virtual Machine Image to use.
     */
    @JsonProperty(value = "imageReference", required = true)
    private ImageReference imageReference;

    /**
     * Settings for the operating system disk of the Virtual Machine.
     */
    @JsonProperty(value = "osDisk")
    private OSDisk osDisk;

    /**
     * The SKU of the Batch node agent to be provisioned on compute nodes in
     * the pool.
     * The Batch node agent is a program that runs on each node in the pool,
     * and provides the command-and-control interface between the node and the
     * Batch service. There are different implementations of the node agent,
     * known as SKUs, for different operating systems. You must specify a node
     * agent SKU which matches the selected image reference. To get the list of
     * supported node agent SKUs along with their list of verified image
     * references, see the 'List supported node agent SKUs' operation.
     */
    @JsonProperty(value = "nodeAgentSkuId", required = true)
    private String nodeAgentSkuId;

    /**
     * Windows operating system settings on the virtual machine.
     * This property must not be specified if the imageReference specifies a
     * Linux OS image.
     */
    @JsonProperty(value = "windowsConfiguration")
    private WindowsConfiguration windowsConfiguration;

    /**
     * The configuration for data disks attached to the comptue nodes in the
     * pool.
     * This property must be specified if the compute nodes in the pool need to
     * have empty data disks attached to them.
     */
    @JsonProperty(value = "dataDisks")
    private List<DataDisk> dataDisks;

    /**
     * The type of on-premises license to be used when deploying the operating
     * system.
     * This only applies to images that contain the Windows operating system,
     * and should only be used when you hold valid on-premises licenses for the
     * nodes which will be deployed. If omitted, no on-premises licensing
     * discount is applied. Values are:
     *
     * Windows_Server - The on-premises license is for Windows Server.
     * Windows_Client - The on-premises license is for Windows Client.
     */
    @JsonProperty(value = "licenseType")
    private String licenseType;

    /**
     * Get the imageReference value.
     *
     * @return the imageReference value
     */
    public ImageReference imageReference() {
        return this.imageReference;
    }

    /**
     * Set the imageReference value.
     *
     * @param imageReference the imageReference value to set
     * @return the VirtualMachineConfiguration object itself.
     */
    public VirtualMachineConfiguration withImageReference(ImageReference imageReference) {
        this.imageReference = imageReference;
        return this;
    }

    /**
     * Get the osDisk value.
     *
     * @return the osDisk value
     */
    public OSDisk osDisk() {
        return this.osDisk;
    }

    /**
     * Set the osDisk value.
     *
     * @param osDisk the osDisk value to set
     * @return the VirtualMachineConfiguration object itself.
     */
    public VirtualMachineConfiguration withOsDisk(OSDisk osDisk) {
        this.osDisk = osDisk;
        return this;
    }

    /**
     * Get the nodeAgentSkuId value.
     *
     * @return the nodeAgentSkuId value
     */
    public String nodeAgentSkuId() {
        return this.nodeAgentSkuId;
    }

    /**
     * Set the nodeAgentSkuId value.
     *
     * @param nodeAgentSkuId the nodeAgentSkuId value to set
     * @return the VirtualMachineConfiguration object itself.
     */
    public VirtualMachineConfiguration withNodeAgentSkuId(String nodeAgentSkuId) {
        this.nodeAgentSkuId = nodeAgentSkuId;
        return this;
    }

    /**
     * Get the windowsConfiguration value.
     *
     * @return the windowsConfiguration value
     */
    public WindowsConfiguration windowsConfiguration() {
        return this.windowsConfiguration;
    }

    /**
     * Set the windowsConfiguration value.
     *
     * @param windowsConfiguration the windowsConfiguration value to set
     * @return the VirtualMachineConfiguration object itself.
     */
    public VirtualMachineConfiguration withWindowsConfiguration(WindowsConfiguration windowsConfiguration) {
        this.windowsConfiguration = windowsConfiguration;
        return this;
    }

    /**
     * Get the dataDisks value.
     *
     * @return the dataDisks value
     */
    public List<DataDisk> dataDisks() {
        return this.dataDisks;
    }

    /**
     * Set the dataDisks value.
     *
     * @param dataDisks the dataDisks value to set
     * @return the VirtualMachineConfiguration object itself.
     */
    public VirtualMachineConfiguration withDataDisks(List<DataDisk> dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }

    /**
     * Get the licenseType value.
     *
     * @return the licenseType value
     */
    public String licenseType() {
        return this.licenseType;
    }

    /**
     * Set the licenseType value.
     *
     * @param licenseType the licenseType value to set
     * @return the VirtualMachineConfiguration object itself.
     */
    public VirtualMachineConfiguration withLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }

}
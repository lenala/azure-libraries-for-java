/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The elastic pool edition capabilities.
 */
public class ElasticPoolEditionCapability {
    /**
     * The elastic pool edition name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The status of the elastic pool edition. Possible values include:
     * 'Visible', 'Available', 'Default', 'Disabled'.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private CapabilityStatus status;

    /**
     * The list of supported elastic pool DTU levels for the edition.
     */
    @JsonProperty(value = "supportedElasticPoolDtus", access = JsonProperty.Access.WRITE_ONLY)
    private List<ElasticPoolDtuCapability> supportedElasticPoolDtus;

    /**
     * Whether or not zone redundancy is supported for the edition.
     */
    @JsonProperty(value = "zoneRedundant", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean zoneRedundant;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public CapabilityStatus status() {
        return this.status;
    }

    /**
     * Get the supportedElasticPoolDtus value.
     *
     * @return the supportedElasticPoolDtus value
     */
    public List<ElasticPoolDtuCapability> supportedElasticPoolDtus() {
        return this.supportedElasticPoolDtus;
    }

    /**
     * Get the zoneRedundant value.
     *
     * @return the zoneRedundant value
     */
    public Boolean zoneRedundant() {
        return this.zoneRedundant;
    }

}

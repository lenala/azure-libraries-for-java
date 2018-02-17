/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * May be used to filter budgets by resource group, resource, or meter.
 */
public class Filters {
    /**
     * The list of filters on resource groups, allowed at subscription level
     * only.
     */
    @JsonProperty(value = "resourceGroups")
    private List<String> resourceGroups;

    /**
     * The list of filters on resources.
     */
    @JsonProperty(value = "resources")
    private List<String> resources;

    /**
     * The list of filters on meters, mandatory for budgets of usage category.
     */
    @JsonProperty(value = "meters")
    private List<String> meters;

    /**
     * Get the resourceGroups value.
     *
     * @return the resourceGroups value
     */
    public List<String> resourceGroups() {
        return this.resourceGroups;
    }

    /**
     * Set the resourceGroups value.
     *
     * @param resourceGroups the resourceGroups value to set
     * @return the Filters object itself.
     */
    public Filters withResourceGroups(List<String> resourceGroups) {
        this.resourceGroups = resourceGroups;
        return this;
    }

    /**
     * Get the resources value.
     *
     * @return the resources value
     */
    public List<String> resources() {
        return this.resources;
    }

    /**
     * Set the resources value.
     *
     * @param resources the resources value to set
     * @return the Filters object itself.
     */
    public Filters withResources(List<String> resources) {
        this.resources = resources;
        return this;
    }

    /**
     * Get the meters value.
     *
     * @return the meters value
     */
    public List<String> meters() {
        return this.meters;
    }

    /**
     * Set the meters value.
     *
     * @param meters the meters value to set
     * @return the Filters object itself.
     */
    public Filters withMeters(List<String> meters) {
        this.meters = meters;
        return this;
    }

}

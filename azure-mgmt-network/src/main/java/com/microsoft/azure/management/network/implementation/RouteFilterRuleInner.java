/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.implementation;

import com.microsoft.azure.management.network.Access;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * Route Filter Rule Resource.
 */
@JsonFlatten
public class RouteFilterRuleInner extends SubResource {
    /**
     * The access type of the rule. Valid values are: 'Allow', 'Deny'. Possible
     * values include: 'Allow', 'Deny'.
     */
    @JsonProperty(value = "properties.access", required = true)
    private Access access;

    /**
     * The rule type of the rule. Valid value is: 'Community'.
     */
    @JsonProperty(value = "properties.routeFilterRuleType", required = true)
    private String routeFilterRuleType;

    /**
     * The collection for bgp community values to filter on. e.g.
     * ['12076:5010','12076:5020'].
     */
    @JsonProperty(value = "properties.communities", required = true)
    private List<String> communities;

    /**
     * The provisioning state of the resource. Possible values are: 'Updating',
     * 'Deleting', 'Succeeded' and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Resource location.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Creates an instance of RouteFilterRuleInner class.
     * @param access the access type of the rule. Valid values are: 'Allow', 'Deny'. Possible values include: 'Allow', 'Deny'.
     * @param communities the collection for bgp community values to filter on. e.g. ['12076:5010','12076:5020'].
     */
    public RouteFilterRuleInner() {
        routeFilterRuleType = "Community";
    }

    /**
     * Get the access type of the rule. Valid values are: 'Allow', 'Deny'. Possible values include: 'Allow', 'Deny'.
     *
     * @return the access value
     */
    public Access access() {
        return this.access;
    }

    /**
     * Set the access type of the rule. Valid values are: 'Allow', 'Deny'. Possible values include: 'Allow', 'Deny'.
     *
     * @param access the access value to set
     * @return the RouteFilterRuleInner object itself.
     */
    public RouteFilterRuleInner withAccess(Access access) {
        this.access = access;
        return this;
    }

    /**
     * Get the rule type of the rule. Valid value is: 'Community'.
     *
     * @return the routeFilterRuleType value
     */
    public String routeFilterRuleType() {
        return this.routeFilterRuleType;
    }

    /**
     * Set the rule type of the rule. Valid value is: 'Community'.
     *
     * @param routeFilterRuleType the routeFilterRuleType value to set
     * @return the RouteFilterRuleInner object itself.
     */
    public RouteFilterRuleInner withRouteFilterRuleType(String routeFilterRuleType) {
        this.routeFilterRuleType = routeFilterRuleType;
        return this;
    }

    /**
     * Get the collection for bgp community values to filter on. e.g. ['12076:5010','12076:5020'].
     *
     * @return the communities value
     */
    public List<String> communities() {
        return this.communities;
    }

    /**
     * Set the collection for bgp community values to filter on. e.g. ['12076:5010','12076:5020'].
     *
     * @param communities the communities value to set
     * @return the RouteFilterRuleInner object itself.
     */
    public RouteFilterRuleInner withCommunities(List<String> communities) {
        this.communities = communities;
        return this;
    }

    /**
     * Get the provisioning state of the resource. Possible values are: 'Updating', 'Deleting', 'Succeeded' and 'Failed'.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @param name the name value to set
     * @return the RouteFilterRuleInner object itself.
     */
    public RouteFilterRuleInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get resource location.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set resource location.
     *
     * @param location the location value to set
     * @return the RouteFilterRuleInner object itself.
     */
    public RouteFilterRuleInner withLocation(String location) {
        this.location = location;
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

}

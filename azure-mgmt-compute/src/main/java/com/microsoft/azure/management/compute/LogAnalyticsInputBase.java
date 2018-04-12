/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Api input base class for LogAnalytics Api.
 */
public class LogAnalyticsInputBase {
    /**
     * SAS Uri of the logging blob container to which LogAnalytics Api writes
     * output logs to.
     */
    @JsonProperty(value = "blobContainerSasUri", required = true)
    private String blobContainerSasUri;

    /**
     * From time of the query.
     */
    @JsonProperty(value = "fromTime", required = true)
    private DateTime fromTime;

    /**
     * To time of the query.
     */
    @JsonProperty(value = "toTime", required = true)
    private DateTime toTime;

    /**
     * Group query result by Throttle Policy applied.
     */
    @JsonProperty(value = "groupByThrottlePolicy")
    private Boolean groupByThrottlePolicy;

    /**
     * Group query result by  by Operation Name.
     */
    @JsonProperty(value = "groupByOperationName")
    private Boolean groupByOperationName;

    /**
     * Group query result by Resource Name.
     */
    @JsonProperty(value = "groupByResourceName")
    private Boolean groupByResourceName;

    /**
     * Get the blobContainerSasUri value.
     *
     * @return the blobContainerSasUri value
     */
    public String blobContainerSasUri() {
        return this.blobContainerSasUri;
    }

    /**
     * Set the blobContainerSasUri value.
     *
     * @param blobContainerSasUri the blobContainerSasUri value to set
     * @return the LogAnalyticsInputBase object itself.
     */
    public LogAnalyticsInputBase withBlobContainerSasUri(String blobContainerSasUri) {
        this.blobContainerSasUri = blobContainerSasUri;
        return this;
    }

    /**
     * Get the fromTime value.
     *
     * @return the fromTime value
     */
    public DateTime fromTime() {
        return this.fromTime;
    }

    /**
     * Set the fromTime value.
     *
     * @param fromTime the fromTime value to set
     * @return the LogAnalyticsInputBase object itself.
     */
    public LogAnalyticsInputBase withFromTime(DateTime fromTime) {
        this.fromTime = fromTime;
        return this;
    }

    /**
     * Get the toTime value.
     *
     * @return the toTime value
     */
    public DateTime toTime() {
        return this.toTime;
    }

    /**
     * Set the toTime value.
     *
     * @param toTime the toTime value to set
     * @return the LogAnalyticsInputBase object itself.
     */
    public LogAnalyticsInputBase withToTime(DateTime toTime) {
        this.toTime = toTime;
        return this;
    }

    /**
     * Get the groupByThrottlePolicy value.
     *
     * @return the groupByThrottlePolicy value
     */
    public Boolean groupByThrottlePolicy() {
        return this.groupByThrottlePolicy;
    }

    /**
     * Set the groupByThrottlePolicy value.
     *
     * @param groupByThrottlePolicy the groupByThrottlePolicy value to set
     * @return the LogAnalyticsInputBase object itself.
     */
    public LogAnalyticsInputBase withGroupByThrottlePolicy(Boolean groupByThrottlePolicy) {
        this.groupByThrottlePolicy = groupByThrottlePolicy;
        return this;
    }

    /**
     * Get the groupByOperationName value.
     *
     * @return the groupByOperationName value
     */
    public Boolean groupByOperationName() {
        return this.groupByOperationName;
    }

    /**
     * Set the groupByOperationName value.
     *
     * @param groupByOperationName the groupByOperationName value to set
     * @return the LogAnalyticsInputBase object itself.
     */
    public LogAnalyticsInputBase withGroupByOperationName(Boolean groupByOperationName) {
        this.groupByOperationName = groupByOperationName;
        return this;
    }

    /**
     * Get the groupByResourceName value.
     *
     * @return the groupByResourceName value
     */
    public Boolean groupByResourceName() {
        return this.groupByResourceName;
    }

    /**
     * Set the groupByResourceName value.
     *
     * @param groupByResourceName the groupByResourceName value to set
     * @return the LogAnalyticsInputBase object itself.
     */
    public LogAnalyticsInputBase withGroupByResourceName(Boolean groupByResourceName) {
        this.groupByResourceName = groupByResourceName;
        return this;
    }

}

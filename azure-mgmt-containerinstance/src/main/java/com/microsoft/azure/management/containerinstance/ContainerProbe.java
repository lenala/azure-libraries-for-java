/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The container probe, for liveness or readiness.
 */
public class ContainerProbe {
    /**
     * The execution command to probe.
     */
    @JsonProperty(value = "exec")
    private ContainerExec exec;

    /**
     * The Http Get settings to probe.
     */
    @JsonProperty(value = "httpGet")
    private ContainerHttpGet httpGet;

    /**
     * The initial delay seconds.
     */
    @JsonProperty(value = "initialDelaySeconds")
    private Integer initialDelaySeconds;

    /**
     * The period seconds.
     */
    @JsonProperty(value = "periodSeconds")
    private Integer periodSeconds;

    /**
     * The failure threshold.
     */
    @JsonProperty(value = "failureThreshold")
    private Integer failureThreshold;

    /**
     * The success threshold.
     */
    @JsonProperty(value = "successThreshold")
    private Integer successThreshold;

    /**
     * The timeout seconds.
     */
    @JsonProperty(value = "timeoutSeconds")
    private Integer timeoutSeconds;

    /**
     * Get the exec value.
     *
     * @return the exec value
     */
    public ContainerExec exec() {
        return this.exec;
    }

    /**
     * Set the exec value.
     *
     * @param exec the exec value to set
     * @return the ContainerProbe object itself.
     */
    public ContainerProbe withExec(ContainerExec exec) {
        this.exec = exec;
        return this;
    }

    /**
     * Get the httpGet value.
     *
     * @return the httpGet value
     */
    public ContainerHttpGet httpGet() {
        return this.httpGet;
    }

    /**
     * Set the httpGet value.
     *
     * @param httpGet the httpGet value to set
     * @return the ContainerProbe object itself.
     */
    public ContainerProbe withHttpGet(ContainerHttpGet httpGet) {
        this.httpGet = httpGet;
        return this;
    }

    /**
     * Get the initialDelaySeconds value.
     *
     * @return the initialDelaySeconds value
     */
    public Integer initialDelaySeconds() {
        return this.initialDelaySeconds;
    }

    /**
     * Set the initialDelaySeconds value.
     *
     * @param initialDelaySeconds the initialDelaySeconds value to set
     * @return the ContainerProbe object itself.
     */
    public ContainerProbe withInitialDelaySeconds(Integer initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
        return this;
    }

    /**
     * Get the periodSeconds value.
     *
     * @return the periodSeconds value
     */
    public Integer periodSeconds() {
        return this.periodSeconds;
    }

    /**
     * Set the periodSeconds value.
     *
     * @param periodSeconds the periodSeconds value to set
     * @return the ContainerProbe object itself.
     */
    public ContainerProbe withPeriodSeconds(Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
        return this;
    }

    /**
     * Get the failureThreshold value.
     *
     * @return the failureThreshold value
     */
    public Integer failureThreshold() {
        return this.failureThreshold;
    }

    /**
     * Set the failureThreshold value.
     *
     * @param failureThreshold the failureThreshold value to set
     * @return the ContainerProbe object itself.
     */
    public ContainerProbe withFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
        return this;
    }

    /**
     * Get the successThreshold value.
     *
     * @return the successThreshold value
     */
    public Integer successThreshold() {
        return this.successThreshold;
    }

    /**
     * Set the successThreshold value.
     *
     * @param successThreshold the successThreshold value to set
     * @return the ContainerProbe object itself.
     */
    public ContainerProbe withSuccessThreshold(Integer successThreshold) {
        this.successThreshold = successThreshold;
        return this;
    }

    /**
     * Get the timeoutSeconds value.
     *
     * @return the timeoutSeconds value
     */
    public Integer timeoutSeconds() {
        return this.timeoutSeconds;
    }

    /**
     * Set the timeoutSeconds value.
     *
     * @param timeoutSeconds the timeoutSeconds value to set
     * @return the ContainerProbe object itself.
     */
    public ContainerProbe withTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }

}
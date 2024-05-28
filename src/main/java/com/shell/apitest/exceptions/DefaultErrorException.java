/*
 * ShellCardManagementAPIsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.apitest.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.shell.apitest.models.DefaultErrorFault;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is a model class for DefaultErrorException type.
 */
public class DefaultErrorException extends ApiException {
    private static final long serialVersionUID = 72704182718492090L;
    private DefaultErrorFault fault;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public DefaultErrorException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Fault.
     * Error object
     * @return Returns the DefaultErrorFault
     */
    @JsonGetter("fault")
    public DefaultErrorFault getFault() {
        return this.fault;
    }

    /**
     * Setter for Fault.
     * Error object
     * @param fault Value for DefaultErrorFault
     */
    @JsonSetter("fault")
    private void setFault(DefaultErrorFault fault) {
        this.fault = fault;
    }
}

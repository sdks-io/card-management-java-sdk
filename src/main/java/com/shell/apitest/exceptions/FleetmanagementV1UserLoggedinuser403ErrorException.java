/*
 * ShellCardManagementAPIsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.apitest.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.shell.apitest.models.ErrorUserAccessError;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is a model class for FleetmanagementV1UserLoggedinuser403ErrorException type.
 */
public class FleetmanagementV1UserLoggedinuser403ErrorException extends ApiException {
    private static final long serialVersionUID = 23117817150073653L;
    private ErrorUserAccessError error;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public FleetmanagementV1UserLoggedinuser403ErrorException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Error.
     * @return Returns the ErrorUserAccessError
     */
    @JsonGetter("Error")
    public ErrorUserAccessError getError() {
        return this.error;
    }

    /**
     * Setter for Error.
     * @param error Value for ErrorUserAccessError
     */
    @JsonSetter("Error")
    private void setError(ErrorUserAccessError error) {
        this.error = error;
    }

    /**
     * Converts this FleetmanagementV1UserLoggedinuser403ErrorException into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "FleetmanagementV1UserLoggedinuser403ErrorException [" + "statusCode="
                + getResponseCode() + ", message=" + getMessage() + ", error=" + error + "]";
    }
}

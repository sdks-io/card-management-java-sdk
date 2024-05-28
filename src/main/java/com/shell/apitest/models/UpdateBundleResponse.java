/*
 * ShellCardManagementAPIsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.apitest.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for UpdateBundleResponse type.
 */
public class UpdateBundleResponse {
    private String requestId;
    private String status;
    private ErrorDetails errors;

    /**
     * Default constructor.
     */
    public UpdateBundleResponse() {
    }

    /**
     * Initialization constructor.
     * @param  requestId  String value for requestId.
     * @param  status  String value for status.
     * @param  errors  ErrorDetails value for errors.
     */
    public UpdateBundleResponse(
            String requestId,
            String status,
            ErrorDetails errors) {
        this.requestId = requestId;
        this.status = status;
        this.errors = errors;
    }

    /**
     * Getter for RequestId.
     * API Request Id
     * @return Returns the String
     */
    @JsonGetter("RequestId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRequestId() {
        return requestId;
    }

    /**
     * Setter for RequestId.
     * API Request Id
     * @param requestId Value for String
     */
    @JsonSetter("RequestId")
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Getter for Status.
     * API Response Status
     * @return Returns the String
     */
    @JsonGetter("Status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * API Response Status
     * @param status Value for String
     */
    @JsonSetter("Status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter for Errors.
     * @return Returns the ErrorDetails
     */
    @JsonGetter("Errors")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ErrorDetails getErrors() {
        return errors;
    }

    /**
     * Setter for Errors.
     * @param errors Value for ErrorDetails
     */
    @JsonSetter("Errors")
    public void setErrors(ErrorDetails errors) {
        this.errors = errors;
    }

    /**
     * Converts this UpdateBundleResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateBundleResponse [" + "requestId=" + requestId + ", status=" + status
                + ", errors=" + errors + "]";
    }

    /**
     * Builds a new {@link UpdateBundleResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateBundleResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .requestId(getRequestId())
                .status(getStatus())
                .errors(getErrors());
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateBundleResponse}.
     */
    public static class Builder {
        private String requestId;
        private String status;
        private ErrorDetails errors;



        /**
         * Setter for requestId.
         * @param  requestId  String value for requestId.
         * @return Builder
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for errors.
         * @param  errors  ErrorDetails value for errors.
         * @return Builder
         */
        public Builder errors(ErrorDetails errors) {
            this.errors = errors;
            return this;
        }

        /**
         * Builds a new {@link UpdateBundleResponse} object using the set fields.
         * @return {@link UpdateBundleResponse}
         */
        public UpdateBundleResponse build() {
            return new UpdateBundleResponse(requestId, status, errors);
        }
    }
}
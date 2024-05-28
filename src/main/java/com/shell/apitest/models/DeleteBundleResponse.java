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
 * This is a model class for DeleteBundleResponse type.
 */
public class DeleteBundleResponse {
    private String requestId;
    private String status;

    /**
     * Default constructor.
     */
    public DeleteBundleResponse() {
    }

    /**
     * Initialization constructor.
     * @param  requestId  String value for requestId.
     * @param  status  String value for status.
     */
    public DeleteBundleResponse(
            String requestId,
            String status) {
        this.requestId = requestId;
        this.status = status;
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
     * Converts this DeleteBundleResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DeleteBundleResponse [" + "requestId=" + requestId + ", status=" + status + "]";
    }

    /**
     * Builds a new {@link DeleteBundleResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DeleteBundleResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .requestId(getRequestId())
                .status(getStatus());
        return builder;
    }

    /**
     * Class to build instances of {@link DeleteBundleResponse}.
     */
    public static class Builder {
        private String requestId;
        private String status;



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
         * Builds a new {@link DeleteBundleResponse} object using the set fields.
         * @return {@link DeleteBundleResponse}
         */
        public DeleteBundleResponse build() {
            return new DeleteBundleResponse(requestId, status);
        }
    }
}

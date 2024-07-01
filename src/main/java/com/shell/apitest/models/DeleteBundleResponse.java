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
    private ErrorStatus error;

    /**
     * Default constructor.
     */
    public DeleteBundleResponse() {
    }

    /**
     * Initialization constructor.
     * @param  requestId  String value for requestId.
     * @param  error  ErrorStatus value for error.
     */
    public DeleteBundleResponse(
            String requestId,
            ErrorStatus error) {
        this.requestId = requestId;
        this.error = error;
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
     * Getter for Error.
     * @return Returns the ErrorStatus
     */
    @JsonGetter("Error")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ErrorStatus getError() {
        return error;
    }

    /**
     * Setter for Error.
     * @param error Value for ErrorStatus
     */
    @JsonSetter("Error")
    public void setError(ErrorStatus error) {
        this.error = error;
    }

    /**
     * Converts this DeleteBundleResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DeleteBundleResponse [" + "requestId=" + requestId + ", error=" + error + "]";
    }

    /**
     * Builds a new {@link DeleteBundleResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DeleteBundleResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .requestId(getRequestId())
                .error(getError());
        return builder;
    }

    /**
     * Class to build instances of {@link DeleteBundleResponse}.
     */
    public static class Builder {
        private String requestId;
        private ErrorStatus error;



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
         * Setter for error.
         * @param  error  ErrorStatus value for error.
         * @return Builder
         */
        public Builder error(ErrorStatus error) {
            this.error = error;
            return this;
        }

        /**
         * Builds a new {@link DeleteBundleResponse} object using the set fields.
         * @return {@link DeleteBundleResponse}
         */
        public DeleteBundleResponse build() {
            return new DeleteBundleResponse(requestId, error);
        }
    }
}

/*
 * ShellCardManagementAPIsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.apitest.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for CreateBundleResponse type.
 */
public class CreateBundleResponse {
    private String requestId;
    private String status;
    private List<CreateBundleResponseDataItems> data;
    private List<ErrorDetails> errors;

    /**
     * Default constructor.
     */
    public CreateBundleResponse() {
    }

    /**
     * Initialization constructor.
     * @param  requestId  String value for requestId.
     * @param  status  String value for status.
     * @param  data  List of CreateBundleResponseDataItems value for data.
     * @param  errors  List of ErrorDetails value for errors.
     */
    public CreateBundleResponse(
            String requestId,
            String status,
            List<CreateBundleResponseDataItems> data,
            List<ErrorDetails> errors) {
        this.requestId = requestId;
        this.status = status;
        this.data = data;
        this.errors = errors;
    }

    /**
     * Getter for RequestId.
     * Request Id
     * @return Returns the String
     */
    @JsonGetter("RequestId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRequestId() {
        return requestId;
    }

    /**
     * Setter for RequestId.
     * Request Id
     * @param requestId Value for String
     */
    @JsonSetter("RequestId")
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Getter for Status.
     * Response status
     * @return Returns the String
     */
    @JsonGetter("Status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Response status
     * @param status Value for String
     */
    @JsonSetter("Status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter for Data.
     * @return Returns the List of CreateBundleResponseDataItems
     */
    @JsonGetter("Data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CreateBundleResponseDataItems> getData() {
        return data;
    }

    /**
     * Setter for Data.
     * @param data Value for List of CreateBundleResponseDataItems
     */
    @JsonSetter("Data")
    public void setData(List<CreateBundleResponseDataItems> data) {
        this.data = data;
    }

    /**
     * Getter for Errors.
     * @return Returns the List of ErrorDetails
     */
    @JsonGetter("Errors")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ErrorDetails> getErrors() {
        return errors;
    }

    /**
     * Setter for Errors.
     * @param errors Value for List of ErrorDetails
     */
    @JsonSetter("Errors")
    public void setErrors(List<ErrorDetails> errors) {
        this.errors = errors;
    }

    /**
     * Converts this CreateBundleResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateBundleResponse [" + "requestId=" + requestId + ", status=" + status
                + ", data=" + data + ", errors=" + errors + "]";
    }

    /**
     * Builds a new {@link CreateBundleResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateBundleResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .requestId(getRequestId())
                .status(getStatus())
                .data(getData())
                .errors(getErrors());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateBundleResponse}.
     */
    public static class Builder {
        private String requestId;
        private String status;
        private List<CreateBundleResponseDataItems> data;
        private List<ErrorDetails> errors;



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
         * Setter for data.
         * @param  data  List of CreateBundleResponseDataItems value for data.
         * @return Builder
         */
        public Builder data(List<CreateBundleResponseDataItems> data) {
            this.data = data;
            return this;
        }

        /**
         * Setter for errors.
         * @param  errors  List of ErrorDetails value for errors.
         * @return Builder
         */
        public Builder errors(List<ErrorDetails> errors) {
            this.errors = errors;
            return this;
        }

        /**
         * Builds a new {@link CreateBundleResponse} object using the set fields.
         * @return {@link CreateBundleResponse}
         */
        public CreateBundleResponse build() {
            return new CreateBundleResponse(requestId, status, data, errors);
        }
    }
}
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
 * This is a model class for SummaryOfBundleResponse type.
 */
public class SummaryOfBundleResponse {
    private String requestId;
    private String status;
    private List<SummaryOfBundleResponseDataItems> data;

    /**
     * Default constructor.
     */
    public SummaryOfBundleResponse() {
    }

    /**
     * Initialization constructor.
     * @param  requestId  String value for requestId.
     * @param  status  String value for status.
     * @param  data  List of SummaryOfBundleResponseDataItems value for data.
     */
    public SummaryOfBundleResponse(
            String requestId,
            String status,
            List<SummaryOfBundleResponseDataItems> data) {
        this.requestId = requestId;
        this.status = status;
        this.data = data;
    }

    /**
     * Getter for RequestId.
     * @return Returns the String
     */
    @JsonGetter("RequestId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRequestId() {
        return requestId;
    }

    /**
     * Setter for RequestId.
     * @param requestId Value for String
     */
    @JsonSetter("RequestId")
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Getter for Status.
     * @return Returns the String
     */
    @JsonGetter("Status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * @param status Value for String
     */
    @JsonSetter("Status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter for Data.
     * @return Returns the List of SummaryOfBundleResponseDataItems
     */
    @JsonGetter("Data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<SummaryOfBundleResponseDataItems> getData() {
        return data;
    }

    /**
     * Setter for Data.
     * @param data Value for List of SummaryOfBundleResponseDataItems
     */
    @JsonSetter("Data")
    public void setData(List<SummaryOfBundleResponseDataItems> data) {
        this.data = data;
    }

    /**
     * Converts this SummaryOfBundleResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SummaryOfBundleResponse [" + "requestId=" + requestId + ", status=" + status
                + ", data=" + data + "]";
    }

    /**
     * Builds a new {@link SummaryOfBundleResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SummaryOfBundleResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .requestId(getRequestId())
                .status(getStatus())
                .data(getData());
        return builder;
    }

    /**
     * Class to build instances of {@link SummaryOfBundleResponse}.
     */
    public static class Builder {
        private String requestId;
        private String status;
        private List<SummaryOfBundleResponseDataItems> data;



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
         * @param  data  List of SummaryOfBundleResponseDataItems value for data.
         * @return Builder
         */
        public Builder data(List<SummaryOfBundleResponseDataItems> data) {
            this.data = data;
            return this;
        }

        /**
         * Builds a new {@link SummaryOfBundleResponse} object using the set fields.
         * @return {@link SummaryOfBundleResponse}
         */
        public SummaryOfBundleResponse build() {
            return new SummaryOfBundleResponse(requestId, status, data);
        }
    }
}
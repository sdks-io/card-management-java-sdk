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
 * This is a model class for PINReminderResponse type.
 */
public class PINReminderResponse {
    private String requestId;
    private Integer mainReference;
    private String status;
    private List<PINReminderReference> data;

    /**
     * Default constructor.
     */
    public PINReminderResponse() {
    }

    /**
     * Initialization constructor.
     * @param  requestId  String value for requestId.
     * @param  mainReference  Integer value for mainReference.
     * @param  status  String value for status.
     * @param  data  List of PINReminderReference value for data.
     */
    public PINReminderResponse(
            String requestId,
            Integer mainReference,
            String status,
            List<PINReminderReference> data) {
        this.requestId = requestId;
        this.mainReference = mainReference;
        this.status = status;
        this.data = data;
    }

    /**
     * Getter for RequestId.
     * Unique request identifier passed from end user. This identifier helps in tracing a
     * transaction
     * @return Returns the String
     */
    @JsonGetter("RequestId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRequestId() {
        return requestId;
    }

    /**
     * Setter for RequestId.
     * Unique request identifier passed from end user. This identifier helps in tracing a
     * transaction
     * @param requestId Value for String
     */
    @JsonSetter("RequestId")
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Getter for MainReference.
     * Service reference number for tracking.
     * @return Returns the Integer
     */
    @JsonGetter("MainReference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getMainReference() {
        return mainReference;
    }

    /**
     * Setter for MainReference.
     * Service reference number for tracking.
     * @param mainReference Value for Integer
     */
    @JsonSetter("MainReference")
    public void setMainReference(Integer mainReference) {
        this.mainReference = mainReference;
    }

    /**
     * Getter for Status.
     * Indicates overall status of the request. Allowed values: SUCCESS, FAILED
     * @return Returns the String
     */
    @JsonGetter("Status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Indicates overall status of the request. Allowed values: SUCCESS, FAILED
     * @param status Value for String
     */
    @JsonSetter("Status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter for Data.
     * @return Returns the List of PINReminderReference
     */
    @JsonGetter("Data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<PINReminderReference> getData() {
        return data;
    }

    /**
     * Setter for Data.
     * @param data Value for List of PINReminderReference
     */
    @JsonSetter("Data")
    public void setData(List<PINReminderReference> data) {
        this.data = data;
    }

    /**
     * Converts this PINReminderResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PINReminderResponse [" + "requestId=" + requestId + ", mainReference="
                + mainReference + ", status=" + status + ", data=" + data + "]";
    }

    /**
     * Builds a new {@link PINReminderResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PINReminderResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .requestId(getRequestId())
                .mainReference(getMainReference())
                .status(getStatus())
                .data(getData());
        return builder;
    }

    /**
     * Class to build instances of {@link PINReminderResponse}.
     */
    public static class Builder {
        private String requestId;
        private Integer mainReference;
        private String status;
        private List<PINReminderReference> data;



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
         * Setter for mainReference.
         * @param  mainReference  Integer value for mainReference.
         * @return Builder
         */
        public Builder mainReference(Integer mainReference) {
            this.mainReference = mainReference;
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
         * @param  data  List of PINReminderReference value for data.
         * @return Builder
         */
        public Builder data(List<PINReminderReference> data) {
            this.data = data;
            return this;
        }

        /**
         * Builds a new {@link PINReminderResponse} object using the set fields.
         * @return {@link PINReminderResponse}
         */
        public PINReminderResponse build() {
            return new PINReminderResponse(requestId, mainReference, status, data);
        }
    }
}
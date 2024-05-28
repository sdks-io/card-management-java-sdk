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
 * This is a model class for UpdateMPayRegStatusRequestMPayRequestsItems type.
 */
public class UpdateMPayRegStatusRequestMPayRequestsItems {
    private String globalRequestID;
    private String status;
    private String approverUserID;
    private String approverUserDisplayName;
    private String reason;

    /**
     * Default constructor.
     */
    public UpdateMPayRegStatusRequestMPayRequestsItems() {
    }

    /**
     * Initialization constructor.
     * @param  globalRequestID  String value for globalRequestID.
     * @param  status  String value for status.
     * @param  approverUserID  String value for approverUserID.
     * @param  approverUserDisplayName  String value for approverUserDisplayName.
     * @param  reason  String value for reason.
     */
    public UpdateMPayRegStatusRequestMPayRequestsItems(
            String globalRequestID,
            String status,
            String approverUserID,
            String approverUserDisplayName,
            String reason) {
        this.globalRequestID = globalRequestID;
        this.status = status;
        this.approverUserID = approverUserID;
        this.approverUserDisplayName = approverUserDisplayName;
        this.reason = reason;
    }

    /**
     * Getter for GlobalRequestID.
     * List of MPay Request to be updated for Fleet Manager approval status. Mandatory Maximum
     * number of requests that can be submitted are 50
     * @return Returns the String
     */
    @JsonGetter("GlobalRequestID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getGlobalRequestID() {
        return globalRequestID;
    }

    /**
     * Setter for GlobalRequestID.
     * List of MPay Request to be updated for Fleet Manager approval status. Mandatory Maximum
     * number of requests that can be submitted are 50
     * @param globalRequestID Value for String
     */
    @JsonSetter("GlobalRequestID")
    public void setGlobalRequestID(String globalRequestID) {
        this.globalRequestID = globalRequestID;
    }

    /**
     * Getter for Status.
     * Status of mobile payment registration request Mandatory. Allowed values – •	Approved •
     * Rejected
     * @return Returns the String
     */
    @JsonGetter("Status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Status of mobile payment registration request Mandatory. Allowed values – •	Approved •
     * Rejected
     * @param status Value for String
     */
    @JsonSetter("Status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter for ApproverUserID.
     * Approver’s User ID ApproverUserID is mandatory when Status is Approved else optional
     * @return Returns the String
     */
    @JsonGetter("ApproverUserID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getApproverUserID() {
        return approverUserID;
    }

    /**
     * Setter for ApproverUserID.
     * Approver’s User ID ApproverUserID is mandatory when Status is Approved else optional
     * @param approverUserID Value for String
     */
    @JsonSetter("ApproverUserID")
    public void setApproverUserID(String approverUserID) {
        this.approverUserID = approverUserID;
    }

    /**
     * Getter for ApproverUserDisplayName.
     * Approver’s display name Mandatory when Status is Approved else optional.
     * @return Returns the String
     */
    @JsonGetter("ApproverUserDisplayName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getApproverUserDisplayName() {
        return approverUserDisplayName;
    }

    /**
     * Setter for ApproverUserDisplayName.
     * Approver’s display name Mandatory when Status is Approved else optional.
     * @param approverUserDisplayName Value for String
     */
    @JsonSetter("ApproverUserDisplayName")
    public void setApproverUserDisplayName(String approverUserDisplayName) {
        this.approverUserDisplayName = approverUserDisplayName;
    }

    /**
     * Getter for Reason.
     * Reason for Fleet Manager approval/rejection. Optional
     * @return Returns the String
     */
    @JsonGetter("Reason")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getReason() {
        return reason;
    }

    /**
     * Setter for Reason.
     * Reason for Fleet Manager approval/rejection. Optional
     * @param reason Value for String
     */
    @JsonSetter("Reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * Converts this UpdateMPayRegStatusRequestMPayRequestsItems into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateMPayRegStatusRequestMPayRequestsItems [" + "globalRequestID="
                + globalRequestID + ", status=" + status + ", approverUserID=" + approverUserID
                + ", approverUserDisplayName=" + approverUserDisplayName + ", reason=" + reason
                + "]";
    }

    /**
     * Builds a new {@link UpdateMPayRegStatusRequestMPayRequestsItems.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateMPayRegStatusRequestMPayRequestsItems.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .globalRequestID(getGlobalRequestID())
                .status(getStatus())
                .approverUserID(getApproverUserID())
                .approverUserDisplayName(getApproverUserDisplayName())
                .reason(getReason());
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateMPayRegStatusRequestMPayRequestsItems}.
     */
    public static class Builder {
        private String globalRequestID;
        private String status;
        private String approverUserID;
        private String approverUserDisplayName;
        private String reason;



        /**
         * Setter for globalRequestID.
         * @param  globalRequestID  String value for globalRequestID.
         * @return Builder
         */
        public Builder globalRequestID(String globalRequestID) {
            this.globalRequestID = globalRequestID;
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
         * Setter for approverUserID.
         * @param  approverUserID  String value for approverUserID.
         * @return Builder
         */
        public Builder approverUserID(String approverUserID) {
            this.approverUserID = approverUserID;
            return this;
        }

        /**
         * Setter for approverUserDisplayName.
         * @param  approverUserDisplayName  String value for approverUserDisplayName.
         * @return Builder
         */
        public Builder approverUserDisplayName(String approverUserDisplayName) {
            this.approverUserDisplayName = approverUserDisplayName;
            return this;
        }

        /**
         * Setter for reason.
         * @param  reason  String value for reason.
         * @return Builder
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * Builds a new {@link UpdateMPayRegStatusRequestMPayRequestsItems} object using the set
         * fields.
         * @return {@link UpdateMPayRegStatusRequestMPayRequestsItems}
         */
        public UpdateMPayRegStatusRequestMPayRequestsItems build() {
            return new UpdateMPayRegStatusRequestMPayRequestsItems(globalRequestID, status,
                    approverUserID, approverUserDisplayName, reason);
        }
    }
}

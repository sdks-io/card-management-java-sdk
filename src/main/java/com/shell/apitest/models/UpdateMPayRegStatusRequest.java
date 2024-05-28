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
 * This is a model class for UpdateMPayRegStatusRequest type.
 */
public class UpdateMPayRegStatusRequest {
    private Integer colCoId;
    private Integer colCoCode;
    private Integer payerId;
    private String payerNumber;
    private List<UpdateMPayRegStatusRequestMPayRequestsItems> mPayRequests;

    /**
     * Default constructor.
     */
    public UpdateMPayRegStatusRequest() {
    }

    /**
     * Initialization constructor.
     * @param  colCoId  Integer value for colCoId.
     * @param  colCoCode  Integer value for colCoCode.
     * @param  payerId  Integer value for payerId.
     * @param  payerNumber  String value for payerNumber.
     * @param  mPayRequests  List of UpdateMPayRegStatusRequestMPayRequestsItems value for
     *         mPayRequests.
     */
    public UpdateMPayRegStatusRequest(
            Integer colCoId,
            Integer colCoCode,
            Integer payerId,
            String payerNumber,
            List<UpdateMPayRegStatusRequestMPayRequestsItems> mPayRequests) {
        this.colCoId = colCoId;
        this.colCoCode = colCoCode;
        this.payerId = payerId;
        this.payerNumber = payerNumber;
        this.mPayRequests = mPayRequests;
    }

    /**
     * Getter for ColCoId.
     * Collecting Company Id of the selected payer. Optional if ColCoCode is passed else Mandatory.
     * Example: 1-Philippines 5-UK
     * @return Returns the Integer
     */
    @JsonGetter("ColCoId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getColCoId() {
        return colCoId;
    }

    /**
     * Setter for ColCoId.
     * Collecting Company Id of the selected payer. Optional if ColCoCode is passed else Mandatory.
     * Example: 1-Philippines 5-UK
     * @param colCoId Value for Integer
     */
    @JsonSetter("ColCoId")
    public void setColCoId(Integer colCoId) {
        this.colCoId = colCoId;
    }

    /**
     * Getter for ColCoCode.
     * Collecting Company Code (Shell Code) of the selected payer. Mandatory for serviced OUs such
     * as Romania, Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if
     * ColCoID is provided. Example: 86-Philippines 5-UK
     * @return Returns the Integer
     */
    @JsonGetter("ColCoCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getColCoCode() {
        return colCoCode;
    }

    /**
     * Setter for ColCoCode.
     * Collecting Company Code (Shell Code) of the selected payer. Mandatory for serviced OUs such
     * as Romania, Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if
     * ColCoID is provided. Example: 86-Philippines 5-UK
     * @param colCoCode Value for Integer
     */
    @JsonSetter("ColCoCode")
    public void setColCoCode(Integer colCoCode) {
        this.colCoCode = colCoCode;
    }

    /**
     * Getter for PayerId.
     * Payer Id of the selected payer. Optional if PayerNumber is passed else Mandatory
     * @return Returns the Integer
     */
    @JsonGetter("PayerId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPayerId() {
        return payerId;
    }

    /**
     * Setter for PayerId.
     * Payer Id of the selected payer. Optional if PayerNumber is passed else Mandatory
     * @param payerId Value for Integer
     */
    @JsonSetter("PayerId")
    public void setPayerId(Integer payerId) {
        this.payerId = payerId;
    }

    /**
     * Getter for PayerNumber.
     * Payer Number (Ex: GB000000123) of the selected payer. Optional if PayerId is passed else
     * Mandatory
     * @return Returns the String
     */
    @JsonGetter("PayerNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPayerNumber() {
        return payerNumber;
    }

    /**
     * Setter for PayerNumber.
     * Payer Number (Ex: GB000000123) of the selected payer. Optional if PayerId is passed else
     * Mandatory
     * @param payerNumber Value for String
     */
    @JsonSetter("PayerNumber")
    public void setPayerNumber(String payerNumber) {
        this.payerNumber = payerNumber;
    }

    /**
     * Getter for MPayRequests.
     * List of MPay Request to be updated for Fleet Manager approval status. Mandatory Maximum
     * number of requests that can be submitted are 50
     * @return Returns the List of UpdateMPayRegStatusRequestMPayRequestsItems
     */
    @JsonGetter("MPayRequests")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<UpdateMPayRegStatusRequestMPayRequestsItems> getMPayRequests() {
        return mPayRequests;
    }

    /**
     * Setter for MPayRequests.
     * List of MPay Request to be updated for Fleet Manager approval status. Mandatory Maximum
     * number of requests that can be submitted are 50
     * @param mPayRequests Value for List of UpdateMPayRegStatusRequestMPayRequestsItems
     */
    @JsonSetter("MPayRequests")
    public void setMPayRequests(List<UpdateMPayRegStatusRequestMPayRequestsItems> mPayRequests) {
        this.mPayRequests = mPayRequests;
    }

    /**
     * Converts this UpdateMPayRegStatusRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateMPayRegStatusRequest [" + "colCoId=" + colCoId + ", colCoCode=" + colCoCode
                + ", payerId=" + payerId + ", payerNumber=" + payerNumber + ", mPayRequests="
                + mPayRequests + "]";
    }

    /**
     * Builds a new {@link UpdateMPayRegStatusRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateMPayRegStatusRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .colCoId(getColCoId())
                .colCoCode(getColCoCode())
                .payerId(getPayerId())
                .payerNumber(getPayerNumber())
                .mPayRequests(getMPayRequests());
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateMPayRegStatusRequest}.
     */
    public static class Builder {
        private Integer colCoId;
        private Integer colCoCode;
        private Integer payerId;
        private String payerNumber;
        private List<UpdateMPayRegStatusRequestMPayRequestsItems> mPayRequests;



        /**
         * Setter for colCoId.
         * @param  colCoId  Integer value for colCoId.
         * @return Builder
         */
        public Builder colCoId(Integer colCoId) {
            this.colCoId = colCoId;
            return this;
        }

        /**
         * Setter for colCoCode.
         * @param  colCoCode  Integer value for colCoCode.
         * @return Builder
         */
        public Builder colCoCode(Integer colCoCode) {
            this.colCoCode = colCoCode;
            return this;
        }

        /**
         * Setter for payerId.
         * @param  payerId  Integer value for payerId.
         * @return Builder
         */
        public Builder payerId(Integer payerId) {
            this.payerId = payerId;
            return this;
        }

        /**
         * Setter for payerNumber.
         * @param  payerNumber  String value for payerNumber.
         * @return Builder
         */
        public Builder payerNumber(String payerNumber) {
            this.payerNumber = payerNumber;
            return this;
        }

        /**
         * Setter for mPayRequests.
         * @param  mPayRequests  List of UpdateMPayRegStatusRequestMPayRequestsItems value for
         *         mPayRequests.
         * @return Builder
         */
        public Builder mPayRequests(
                List<UpdateMPayRegStatusRequestMPayRequestsItems> mPayRequests) {
            this.mPayRequests = mPayRequests;
            return this;
        }

        /**
         * Builds a new {@link UpdateMPayRegStatusRequest} object using the set fields.
         * @return {@link UpdateMPayRegStatusRequest}
         */
        public UpdateMPayRegStatusRequest build() {
            return new UpdateMPayRegStatusRequest(colCoId, colCoCode, payerId, payerNumber,
                    mPayRequests);
        }
    }
}
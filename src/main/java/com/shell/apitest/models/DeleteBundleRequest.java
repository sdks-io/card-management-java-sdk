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
 * This is a model class for DeleteBundleRequest type.
 */
public class DeleteBundleRequest {
    private Integer colCoCode;
    private Integer colCoId;
    private String payerNumber;
    private Integer payerId;
    private Integer accountId;
    private String accountNumber;
    private String bundleId;

    /**
     * Default constructor.
     */
    public DeleteBundleRequest() {
    }

    /**
     * Initialization constructor.
     * @param  bundleId  String value for bundleId.
     * @param  colCoCode  Integer value for colCoCode.
     * @param  colCoId  Integer value for colCoId.
     * @param  payerNumber  String value for payerNumber.
     * @param  payerId  Integer value for payerId.
     * @param  accountId  Integer value for accountId.
     * @param  accountNumber  String value for accountNumber.
     */
    public DeleteBundleRequest(
            String bundleId,
            Integer colCoCode,
            Integer colCoId,
            String payerNumber,
            Integer payerId,
            Integer accountId,
            String accountNumber) {
        this.colCoCode = colCoCode;
        this.colCoId = colCoId;
        this.payerNumber = payerNumber;
        this.payerId = payerId;
        this.accountId = accountId;
        this.accountNumber = accountNumber;
        this.bundleId = bundleId;
    }

    /**
     * Getter for ColCoCode.
     * Collecting Company Code (Shell Code) of the selected payer. Mandatory for serviced OUs such
     * as Romania, Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if
     * ColCoID is provided. Example: 86 for Philippines 5 for UK
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
     * ColCoID is provided. Example: 86 for Philippines 5 for UK
     * @param colCoCode Value for Integer
     */
    @JsonSetter("ColCoCode")
    public void setColCoCode(Integer colCoCode) {
        this.colCoCode = colCoCode;
    }

    /**
     * Getter for ColCoId.
     * Collecting Company Code (Shell Code) of the selected payer. Mandatory for serviced OUs such
     * as Romania, Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if
     * ColCoID is provided. Example: 86 for Philippines 5 for UK
     * @return Returns the Integer
     */
    @JsonGetter("ColCoId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getColCoId() {
        return colCoId;
    }

    /**
     * Setter for ColCoId.
     * Collecting Company Code (Shell Code) of the selected payer. Mandatory for serviced OUs such
     * as Romania, Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if
     * ColCoID is provided. Example: 86 for Philippines 5 for UK
     * @param colCoId Value for Integer
     */
    @JsonSetter("ColCoId")
    public void setColCoId(Integer colCoId) {
        this.colCoId = colCoId;
    }

    /**
     * Getter for PayerNumber.
     * Payer Number of the selected payer. Either PayerId or PayerNumber or both must be passed.
     * Example: GB000000123
     * @return Returns the String
     */
    @JsonGetter("PayerNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPayerNumber() {
        return payerNumber;
    }

    /**
     * Setter for PayerNumber.
     * Payer Number of the selected payer. Either PayerId or PayerNumber or both must be passed.
     * Example: GB000000123
     * @param payerNumber Value for String
     */
    @JsonSetter("PayerNumber")
    public void setPayerNumber(String payerNumber) {
        this.payerNumber = payerNumber;
    }

    /**
     * Getter for PayerId.
     * Payer Id of the selected payer. Either PayerId or PayerNumber or both must be passed.
     * Example: 123456
     * @return Returns the Integer
     */
    @JsonGetter("PayerId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPayerId() {
        return payerId;
    }

    /**
     * Setter for PayerId.
     * Payer Id of the selected payer. Either PayerId or PayerNumber or both must be passed.
     * Example: 123456
     * @param payerId Value for Integer
     */
    @JsonSetter("PayerId")
    public void setPayerId(Integer payerId) {
        this.payerId = payerId;
    }

    /**
     * Getter for AccountId.
     * Account ID of the customer. Either AccountId or AccountNumber or both must be passed.
     * Example: 123456
     * @return Returns the Integer
     */
    @JsonGetter("AccountId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getAccountId() {
        return accountId;
    }

    /**
     * Setter for AccountId.
     * Account ID of the customer. Either AccountId or AccountNumber or both must be passed.
     * Example: 123456
     * @param accountId Value for Integer
     */
    @JsonSetter("AccountId")
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    /**
     * Getter for AccountNumber.
     * Account Number of the customer. Either AccountId or AccountNumber or both must be passed.
     * Example: GB000000123
     * @return Returns the String
     */
    @JsonGetter("AccountNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Setter for AccountNumber.
     * Account Number of the customer. Either AccountId or AccountNumber or both must be passed.
     * Example: GB000000123
     * @param accountNumber Value for String
     */
    @JsonSetter("AccountNumber")
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Getter for BundleId.
     * Identifier of the card bundle in Gateway. Mandatory
     * @return Returns the String
     */
    @JsonGetter("BundleId")
    public String getBundleId() {
        return bundleId;
    }

    /**
     * Setter for BundleId.
     * Identifier of the card bundle in Gateway. Mandatory
     * @param bundleId Value for String
     */
    @JsonSetter("BundleId")
    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    /**
     * Converts this DeleteBundleRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DeleteBundleRequest [" + "bundleId=" + bundleId + ", colCoCode=" + colCoCode
                + ", colCoId=" + colCoId + ", payerNumber=" + payerNumber + ", payerId=" + payerId
                + ", accountId=" + accountId + ", accountNumber=" + accountNumber + "]";
    }

    /**
     * Builds a new {@link DeleteBundleRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DeleteBundleRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(bundleId)
                .colCoCode(getColCoCode())
                .colCoId(getColCoId())
                .payerNumber(getPayerNumber())
                .payerId(getPayerId())
                .accountId(getAccountId())
                .accountNumber(getAccountNumber());
        return builder;
    }

    /**
     * Class to build instances of {@link DeleteBundleRequest}.
     */
    public static class Builder {
        private String bundleId;
        private Integer colCoCode;
        private Integer colCoId;
        private String payerNumber;
        private Integer payerId;
        private Integer accountId;
        private String accountNumber;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  bundleId  String value for bundleId.
         */
        public Builder(String bundleId) {
            this.bundleId = bundleId;
        }

        /**
         * Setter for bundleId.
         * @param  bundleId  String value for bundleId.
         * @return Builder
         */
        public Builder bundleId(String bundleId) {
            this.bundleId = bundleId;
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
         * Setter for colCoId.
         * @param  colCoId  Integer value for colCoId.
         * @return Builder
         */
        public Builder colCoId(Integer colCoId) {
            this.colCoId = colCoId;
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
         * Setter for payerId.
         * @param  payerId  Integer value for payerId.
         * @return Builder
         */
        public Builder payerId(Integer payerId) {
            this.payerId = payerId;
            return this;
        }

        /**
         * Setter for accountId.
         * @param  accountId  Integer value for accountId.
         * @return Builder
         */
        public Builder accountId(Integer accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * Setter for accountNumber.
         * @param  accountNumber  String value for accountNumber.
         * @return Builder
         */
        public Builder accountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        /**
         * Builds a new {@link DeleteBundleRequest} object using the set fields.
         * @return {@link DeleteBundleRequest}
         */
        public DeleteBundleRequest build() {
            return new DeleteBundleRequest(bundleId, colCoCode, colCoId, payerNumber, payerId,
                    accountId, accountNumber);
        }
    }
}

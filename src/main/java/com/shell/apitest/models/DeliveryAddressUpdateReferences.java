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
 * This is a model class for DeliveryAddressUpdateReferences type.
 */
public class DeliveryAddressUpdateReferences {
    private Integer cardId;
    private String cardPAN;
    private Integer accountId;
    private String accountNumber;
    private Integer referenceId;
    private String errorInfo;

    /**
     * Default constructor.
     */
    public DeliveryAddressUpdateReferences() {
    }

    /**
     * Initialization constructor.
     * @param  cardId  Integer value for cardId.
     * @param  cardPAN  String value for cardPAN.
     * @param  accountId  Integer value for accountId.
     * @param  accountNumber  String value for accountNumber.
     * @param  referenceId  Integer value for referenceId.
     * @param  errorInfo  String value for errorInfo.
     */
    public DeliveryAddressUpdateReferences(
            Integer cardId,
            String cardPAN,
            Integer accountId,
            String accountNumber,
            Integer referenceId,
            String errorInfo) {
        this.cardId = cardId;
        this.cardPAN = cardPAN;
        this.accountId = accountId;
        this.accountNumber = accountNumber;
        this.referenceId = referenceId;
        this.errorInfo = errorInfo;
    }

    /**
     * Getter for CardId.
     * CardId
     * @return Returns the Integer
     */
    @JsonGetter("CardId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCardId() {
        return cardId;
    }

    /**
     * Setter for CardId.
     * CardId
     * @param cardId Value for Integer
     */
    @JsonSetter("CardId")
    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    /**
     * Getter for CardPAN.
     * PAN of the card.
     * @return Returns the String
     */
    @JsonGetter("CardPAN")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCardPAN() {
        return cardPAN;
    }

    /**
     * Setter for CardPAN.
     * PAN of the card.
     * @param cardPAN Value for String
     */
    @JsonSetter("CardPAN")
    public void setCardPAN(String cardPAN) {
        this.cardPAN = cardPAN;
    }

    /**
     * Getter for AccountId.
     * AccountId
     * @return Returns the Integer
     */
    @JsonGetter("AccountId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getAccountId() {
        return accountId;
    }

    /**
     * Setter for AccountId.
     * AccountId
     * @param accountId Value for Integer
     */
    @JsonSetter("AccountId")
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    /**
     * Getter for AccountNumber.
     * Account number
     * @return Returns the String
     */
    @JsonGetter("AccountNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Setter for AccountNumber.
     * Account number
     * @param accountNumber Value for String
     */
    @JsonSetter("AccountNumber")
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Getter for ReferenceId.
     * Individual delivery address update reference number for the delivery address update request.
     * @return Returns the Integer
     */
    @JsonGetter("ReferenceId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getReferenceId() {
        return referenceId;
    }

    /**
     * Setter for ReferenceId.
     * Individual delivery address update reference number for the delivery address update request.
     * @param referenceId Value for Integer
     */
    @JsonSetter("ReferenceId")
    public void setReferenceId(Integer referenceId) {
        this.referenceId = referenceId;
    }

    /**
     * Getter for ErrorInfo.
     * Individual error information for the delivery address update request.
     * @return Returns the String
     */
    @JsonGetter("ErrorInfo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getErrorInfo() {
        return errorInfo;
    }

    /**
     * Setter for ErrorInfo.
     * Individual error information for the delivery address update request.
     * @param errorInfo Value for String
     */
    @JsonSetter("ErrorInfo")
    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    /**
     * Converts this DeliveryAddressUpdateReferences into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DeliveryAddressUpdateReferences [" + "cardId=" + cardId + ", cardPAN=" + cardPAN
                + ", accountId=" + accountId + ", accountNumber=" + accountNumber + ", referenceId="
                + referenceId + ", errorInfo=" + errorInfo + "]";
    }

    /**
     * Builds a new {@link DeliveryAddressUpdateReferences.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DeliveryAddressUpdateReferences.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .cardId(getCardId())
                .cardPAN(getCardPAN())
                .accountId(getAccountId())
                .accountNumber(getAccountNumber())
                .referenceId(getReferenceId())
                .errorInfo(getErrorInfo());
        return builder;
    }

    /**
     * Class to build instances of {@link DeliveryAddressUpdateReferences}.
     */
    public static class Builder {
        private Integer cardId;
        private String cardPAN;
        private Integer accountId;
        private String accountNumber;
        private Integer referenceId;
        private String errorInfo;



        /**
         * Setter for cardId.
         * @param  cardId  Integer value for cardId.
         * @return Builder
         */
        public Builder cardId(Integer cardId) {
            this.cardId = cardId;
            return this;
        }

        /**
         * Setter for cardPAN.
         * @param  cardPAN  String value for cardPAN.
         * @return Builder
         */
        public Builder cardPAN(String cardPAN) {
            this.cardPAN = cardPAN;
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
         * Setter for referenceId.
         * @param  referenceId  Integer value for referenceId.
         * @return Builder
         */
        public Builder referenceId(Integer referenceId) {
            this.referenceId = referenceId;
            return this;
        }

        /**
         * Setter for errorInfo.
         * @param  errorInfo  String value for errorInfo.
         * @return Builder
         */
        public Builder errorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }

        /**
         * Builds a new {@link DeliveryAddressUpdateReferences} object using the set fields.
         * @return {@link DeliveryAddressUpdateReferences}
         */
        public DeliveryAddressUpdateReferences build() {
            return new DeliveryAddressUpdateReferences(cardId, cardPAN, accountId, accountNumber,
                    referenceId, errorInfo);
        }
    }
}

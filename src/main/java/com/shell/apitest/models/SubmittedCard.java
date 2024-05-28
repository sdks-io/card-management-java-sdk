/*
 * ShellCardManagementAPIsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.apitest.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for SubmittedCard type.
 */
public class SubmittedCard {
    private OptionalNullable<Integer> replacementCardReference;
    private OptionalNullable<Integer> updateCardReference;
    private OptionalNullable<Integer> accountId;
    private OptionalNullable<String> accountNumber;
    private OptionalNullable<String> cardExpiryDate;
    private OptionalNullable<Integer> cardId;
    private OptionalNullable<Integer> colCoCode;
    private OptionalNullable<Integer> colCoId;
    private OptionalNullable<String> pAN;
    private OptionalNullable<Integer> payerId;
    private OptionalNullable<String> payerNumber;

    /**
     * Default constructor.
     */
    public SubmittedCard() {
    }

    /**
     * Initialization constructor.
     * @param  replacementCardReference  Integer value for replacementCardReference.
     * @param  updateCardReference  Integer value for updateCardReference.
     * @param  accountId  Integer value for accountId.
     * @param  accountNumber  String value for accountNumber.
     * @param  cardExpiryDate  String value for cardExpiryDate.
     * @param  cardId  Integer value for cardId.
     * @param  colCoCode  Integer value for colCoCode.
     * @param  colCoId  Integer value for colCoId.
     * @param  pAN  String value for pAN.
     * @param  payerId  Integer value for payerId.
     * @param  payerNumber  String value for payerNumber.
     */
    public SubmittedCard(
            Integer replacementCardReference,
            Integer updateCardReference,
            Integer accountId,
            String accountNumber,
            String cardExpiryDate,
            Integer cardId,
            Integer colCoCode,
            Integer colCoId,
            String pAN,
            Integer payerId,
            String payerNumber) {
        this.replacementCardReference = OptionalNullable.of(replacementCardReference);
        this.updateCardReference = OptionalNullable.of(updateCardReference);
        this.accountId = OptionalNullable.of(accountId);
        this.accountNumber = OptionalNullable.of(accountNumber);
        this.cardExpiryDate = OptionalNullable.of(cardExpiryDate);
        this.cardId = OptionalNullable.of(cardId);
        this.colCoCode = OptionalNullable.of(colCoCode);
        this.colCoId = OptionalNullable.of(colCoId);
        this.pAN = OptionalNullable.of(pAN);
        this.payerId = OptionalNullable.of(payerId);
        this.payerNumber = OptionalNullable.of(payerNumber);
    }

    /**
     * Initialization constructor.
     * @param  replacementCardReference  Integer value for replacementCardReference.
     * @param  updateCardReference  Integer value for updateCardReference.
     * @param  accountId  Integer value for accountId.
     * @param  accountNumber  String value for accountNumber.
     * @param  cardExpiryDate  String value for cardExpiryDate.
     * @param  cardId  Integer value for cardId.
     * @param  colCoCode  Integer value for colCoCode.
     * @param  colCoId  Integer value for colCoId.
     * @param  pAN  String value for pAN.
     * @param  payerId  Integer value for payerId.
     * @param  payerNumber  String value for payerNumber.
     */

    protected SubmittedCard(OptionalNullable<Integer> replacementCardReference,
            OptionalNullable<Integer> updateCardReference, OptionalNullable<Integer> accountId,
            OptionalNullable<String> accountNumber, OptionalNullable<String> cardExpiryDate,
            OptionalNullable<Integer> cardId, OptionalNullable<Integer> colCoCode,
            OptionalNullable<Integer> colCoId, OptionalNullable<String> pAN,
            OptionalNullable<Integer> payerId, OptionalNullable<String> payerNumber) {
        this.replacementCardReference = replacementCardReference;
        this.updateCardReference = updateCardReference;
        this.accountId = accountId;
        this.accountNumber = accountNumber;
        this.cardExpiryDate = cardExpiryDate;
        this.cardId = cardId;
        this.colCoCode = colCoCode;
        this.colCoId = colCoId;
        this.pAN = pAN;
        this.payerId = payerId;
        this.payerNumber = payerNumber;
    }

    /**
     * Internal Getter for ReplacementCardReference.
     * Reference number for tracking of replacement card order request of the specific card,&lt;br /&gt;
     * This is applicable for requests with target status as Block and OrderReplacement passed as
     * True.
     * @return Returns the Internal Integer
     */
    @JsonGetter("ReplacementCardReference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetReplacementCardReference() {
        return this.replacementCardReference;
    }

    /**
     * Getter for ReplacementCardReference.
     * Reference number for tracking of replacement card order request of the specific card,&lt;br /&gt;
     * This is applicable for requests with target status as Block and OrderReplacement passed as
     * True.
     * @return Returns the Integer
     */
    public Integer getReplacementCardReference() {
        return OptionalNullable.getFrom(replacementCardReference);
    }

    /**
     * Setter for ReplacementCardReference.
     * Reference number for tracking of replacement card order request of the specific card,&lt;br /&gt;
     * This is applicable for requests with target status as Block and OrderReplacement passed as
     * True.
     * @param replacementCardReference Value for Integer
     */
    @JsonSetter("ReplacementCardReference")
    public void setReplacementCardReference(Integer replacementCardReference) {
        this.replacementCardReference = OptionalNullable.of(replacementCardReference);
    }

    /**
     * UnSetter for ReplacementCardReference.
     * Reference number for tracking of replacement card order request of the specific card,&lt;br /&gt;
     * This is applicable for requests with target status as Block and OrderReplacement passed as
     * True.
     */
    public void unsetReplacementCardReference() {
        replacementCardReference = null;
    }

    /**
     * Internal Getter for UpdateCardReference.
     * Reference number for tracking of update status request of the specific card,
     * @return Returns the Internal Integer
     */
    @JsonGetter("UpdateCardReference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetUpdateCardReference() {
        return this.updateCardReference;
    }

    /**
     * Getter for UpdateCardReference.
     * Reference number for tracking of update status request of the specific card,
     * @return Returns the Integer
     */
    public Integer getUpdateCardReference() {
        return OptionalNullable.getFrom(updateCardReference);
    }

    /**
     * Setter for UpdateCardReference.
     * Reference number for tracking of update status request of the specific card,
     * @param updateCardReference Value for Integer
     */
    @JsonSetter("UpdateCardReference")
    public void setUpdateCardReference(Integer updateCardReference) {
        this.updateCardReference = OptionalNullable.of(updateCardReference);
    }

    /**
     * UnSetter for UpdateCardReference.
     * Reference number for tracking of update status request of the specific card,
     */
    public void unsetUpdateCardReference() {
        updateCardReference = null;
    }

    /**
     * Internal Getter for AccountId.
     * Account Id of the customer.&lt;br /&gt; Optional if AccountNumber is passed, else Mandatory.
     * @return Returns the Internal Integer
     */
    @JsonGetter("AccountId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetAccountId() {
        return this.accountId;
    }

    /**
     * Getter for AccountId.
     * Account Id of the customer.&lt;br /&gt; Optional if AccountNumber is passed, else Mandatory.
     * @return Returns the Integer
     */
    public Integer getAccountId() {
        return OptionalNullable.getFrom(accountId);
    }

    /**
     * Setter for AccountId.
     * Account Id of the customer.&lt;br /&gt; Optional if AccountNumber is passed, else Mandatory.
     * @param accountId Value for Integer
     */
    @JsonSetter("AccountId")
    public void setAccountId(Integer accountId) {
        this.accountId = OptionalNullable.of(accountId);
    }

    /**
     * UnSetter for AccountId.
     * Account Id of the customer.&lt;br /&gt; Optional if AccountNumber is passed, else Mandatory.
     */
    public void unsetAccountId() {
        accountId = null;
    }

    /**
     * Internal Getter for AccountNumber.
     * Account Number of the customer.&lt;br /&gt; Optional if AccountId is passed, else Mandatory.
     * @return Returns the Internal String
     */
    @JsonGetter("AccountNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetAccountNumber() {
        return this.accountNumber;
    }

    /**
     * Getter for AccountNumber.
     * Account Number of the customer.&lt;br /&gt; Optional if AccountId is passed, else Mandatory.
     * @return Returns the String
     */
    public String getAccountNumber() {
        return OptionalNullable.getFrom(accountNumber);
    }

    /**
     * Setter for AccountNumber.
     * Account Number of the customer.&lt;br /&gt; Optional if AccountId is passed, else Mandatory.
     * @param accountNumber Value for String
     */
    @JsonSetter("AccountNumber")
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = OptionalNullable.of(accountNumber);
    }

    /**
     * UnSetter for AccountNumber.
     * Account Number of the customer.&lt;br /&gt; Optional if AccountId is passed, else Mandatory.
     */
    public void unsetAccountNumber() {
        accountNumber = null;
    }

    /**
     * Internal Getter for CardExpiryDate.
     * Expiry date of the card.&lt;br /&gt; Mandatory if PAN is passed, else optional.&lt;br /&gt; Format:
     * yyyyMMdd
     * @return Returns the Internal String
     */
    @JsonGetter("CardExpiryDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCardExpiryDate() {
        return this.cardExpiryDate;
    }

    /**
     * Getter for CardExpiryDate.
     * Expiry date of the card.&lt;br /&gt; Mandatory if PAN is passed, else optional.&lt;br /&gt; Format:
     * yyyyMMdd
     * @return Returns the String
     */
    public String getCardExpiryDate() {
        return OptionalNullable.getFrom(cardExpiryDate);
    }

    /**
     * Setter for CardExpiryDate.
     * Expiry date of the card.&lt;br /&gt; Mandatory if PAN is passed, else optional.&lt;br /&gt; Format:
     * yyyyMMdd
     * @param cardExpiryDate Value for String
     */
    @JsonSetter("CardExpiryDate")
    public void setCardExpiryDate(String cardExpiryDate) {
        this.cardExpiryDate = OptionalNullable.of(cardExpiryDate);
    }

    /**
     * UnSetter for CardExpiryDate.
     * Expiry date of the card.&lt;br /&gt; Mandatory if PAN is passed, else optional.&lt;br /&gt; Format:
     * yyyyMMdd
     */
    public void unsetCardExpiryDate() {
        cardExpiryDate = null;
    }

    /**
     * Internal Getter for CardId.
     * Card Id of the card.&lt;br /&gt; Optional if PAN is passed, else Mandatory.
     * @return Returns the Internal Integer
     */
    @JsonGetter("CardId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetCardId() {
        return this.cardId;
    }

    /**
     * Getter for CardId.
     * Card Id of the card.&lt;br /&gt; Optional if PAN is passed, else Mandatory.
     * @return Returns the Integer
     */
    public Integer getCardId() {
        return OptionalNullable.getFrom(cardId);
    }

    /**
     * Setter for CardId.
     * Card Id of the card.&lt;br /&gt; Optional if PAN is passed, else Mandatory.
     * @param cardId Value for Integer
     */
    @JsonSetter("CardId")
    public void setCardId(Integer cardId) {
        this.cardId = OptionalNullable.of(cardId);
    }

    /**
     * UnSetter for CardId.
     * Card Id of the card.&lt;br /&gt; Optional if PAN is passed, else Mandatory.
     */
    public void unsetCardId() {
        cardId = null;
    }

    /**
     * Internal Getter for ColCoCode.
     * Collecting company code of the customer. &lt;br /&gt; Optional if ColCoId is passed, else
     * Mandatory.&lt;br /&gt;
     * @return Returns the Internal Integer
     */
    @JsonGetter("ColCoCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetColCoCode() {
        return this.colCoCode;
    }

    /**
     * Getter for ColCoCode.
     * Collecting company code of the customer. &lt;br /&gt; Optional if ColCoId is passed, else
     * Mandatory.&lt;br /&gt;
     * @return Returns the Integer
     */
    public Integer getColCoCode() {
        return OptionalNullable.getFrom(colCoCode);
    }

    /**
     * Setter for ColCoCode.
     * Collecting company code of the customer. &lt;br /&gt; Optional if ColCoId is passed, else
     * Mandatory.&lt;br /&gt;
     * @param colCoCode Value for Integer
     */
    @JsonSetter("ColCoCode")
    public void setColCoCode(Integer colCoCode) {
        this.colCoCode = OptionalNullable.of(colCoCode);
    }

    /**
     * UnSetter for ColCoCode.
     * Collecting company code of the customer. &lt;br /&gt; Optional if ColCoId is passed, else
     * Mandatory.&lt;br /&gt;
     */
    public void unsetColCoCode() {
        colCoCode = null;
    }

    /**
     * Internal Getter for ColCoId.
     * Collecting company id of the customer. &lt;br /&gt; Optional if ColCoCode is passed, else
     * Mandatory.&lt;br /&gt;
     * @return Returns the Internal Integer
     */
    @JsonGetter("ColCoId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetColCoId() {
        return this.colCoId;
    }

    /**
     * Getter for ColCoId.
     * Collecting company id of the customer. &lt;br /&gt; Optional if ColCoCode is passed, else
     * Mandatory.&lt;br /&gt;
     * @return Returns the Integer
     */
    public Integer getColCoId() {
        return OptionalNullable.getFrom(colCoId);
    }

    /**
     * Setter for ColCoId.
     * Collecting company id of the customer. &lt;br /&gt; Optional if ColCoCode is passed, else
     * Mandatory.&lt;br /&gt;
     * @param colCoId Value for Integer
     */
    @JsonSetter("ColCoId")
    public void setColCoId(Integer colCoId) {
        this.colCoId = OptionalNullable.of(colCoId);
    }

    /**
     * UnSetter for ColCoId.
     * Collecting company id of the customer. &lt;br /&gt; Optional if ColCoCode is passed, else
     * Mandatory.&lt;br /&gt;
     */
    public void unsetColCoId() {
        colCoId = null;
    }

    /**
     * Internal Getter for PAN.
     * PAN of the card.&lt;br /&gt; Optional if CardId is passed, else Mandatory.&lt;br /&gt;
     * @return Returns the Internal String
     */
    @JsonGetter("PAN")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPAN() {
        return this.pAN;
    }

    /**
     * Getter for PAN.
     * PAN of the card.&lt;br /&gt; Optional if CardId is passed, else Mandatory.&lt;br /&gt;
     * @return Returns the String
     */
    public String getPAN() {
        return OptionalNullable.getFrom(pAN);
    }

    /**
     * Setter for PAN.
     * PAN of the card.&lt;br /&gt; Optional if CardId is passed, else Mandatory.&lt;br /&gt;
     * @param pAN Value for String
     */
    @JsonSetter("PAN")
    public void setPAN(String pAN) {
        this.pAN = OptionalNullable.of(pAN);
    }

    /**
     * UnSetter for PAN.
     * PAN of the card.&lt;br /&gt; Optional if CardId is passed, else Mandatory.&lt;br /&gt;
     */
    public void unsetPAN() {
        pAN = null;
    }

    /**
     * Internal Getter for PayerId.
     * Payer id of the customer.&lt;br /&gt; Optional if PayerNumber is passed, else Mandatory.
     * @return Returns the Internal Integer
     */
    @JsonGetter("PayerId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetPayerId() {
        return this.payerId;
    }

    /**
     * Getter for PayerId.
     * Payer id of the customer.&lt;br /&gt; Optional if PayerNumber is passed, else Mandatory.
     * @return Returns the Integer
     */
    public Integer getPayerId() {
        return OptionalNullable.getFrom(payerId);
    }

    /**
     * Setter for PayerId.
     * Payer id of the customer.&lt;br /&gt; Optional if PayerNumber is passed, else Mandatory.
     * @param payerId Value for Integer
     */
    @JsonSetter("PayerId")
    public void setPayerId(Integer payerId) {
        this.payerId = OptionalNullable.of(payerId);
    }

    /**
     * UnSetter for PayerId.
     * Payer id of the customer.&lt;br /&gt; Optional if PayerNumber is passed, else Mandatory.
     */
    public void unsetPayerId() {
        payerId = null;
    }

    /**
     * Internal Getter for PayerNumber.
     * PayerNumber of the customer.&lt;br /&gt; Optional if PayerId is passed, else Mandatory.
     * @return Returns the Internal String
     */
    @JsonGetter("PayerNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPayerNumber() {
        return this.payerNumber;
    }

    /**
     * Getter for PayerNumber.
     * PayerNumber of the customer.&lt;br /&gt; Optional if PayerId is passed, else Mandatory.
     * @return Returns the String
     */
    public String getPayerNumber() {
        return OptionalNullable.getFrom(payerNumber);
    }

    /**
     * Setter for PayerNumber.
     * PayerNumber of the customer.&lt;br /&gt; Optional if PayerId is passed, else Mandatory.
     * @param payerNumber Value for String
     */
    @JsonSetter("PayerNumber")
    public void setPayerNumber(String payerNumber) {
        this.payerNumber = OptionalNullable.of(payerNumber);
    }

    /**
     * UnSetter for PayerNumber.
     * PayerNumber of the customer.&lt;br /&gt; Optional if PayerId is passed, else Mandatory.
     */
    public void unsetPayerNumber() {
        payerNumber = null;
    }

    /**
     * Converts this SubmittedCard into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubmittedCard [" + "replacementCardReference=" + replacementCardReference
                + ", updateCardReference=" + updateCardReference + ", accountId=" + accountId
                + ", accountNumber=" + accountNumber + ", cardExpiryDate=" + cardExpiryDate
                + ", cardId=" + cardId + ", colCoCode=" + colCoCode + ", colCoId=" + colCoId
                + ", pAN=" + pAN + ", payerId=" + payerId + ", payerNumber=" + payerNumber + "]";
    }

    /**
     * Builds a new {@link SubmittedCard.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubmittedCard.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.replacementCardReference = internalGetReplacementCardReference();
        builder.updateCardReference = internalGetUpdateCardReference();
        builder.accountId = internalGetAccountId();
        builder.accountNumber = internalGetAccountNumber();
        builder.cardExpiryDate = internalGetCardExpiryDate();
        builder.cardId = internalGetCardId();
        builder.colCoCode = internalGetColCoCode();
        builder.colCoId = internalGetColCoId();
        builder.pAN = internalGetPAN();
        builder.payerId = internalGetPayerId();
        builder.payerNumber = internalGetPayerNumber();
        return builder;
    }

    /**
     * Class to build instances of {@link SubmittedCard}.
     */
    public static class Builder {
        private OptionalNullable<Integer> replacementCardReference;
        private OptionalNullable<Integer> updateCardReference;
        private OptionalNullable<Integer> accountId;
        private OptionalNullable<String> accountNumber;
        private OptionalNullable<String> cardExpiryDate;
        private OptionalNullable<Integer> cardId;
        private OptionalNullable<Integer> colCoCode;
        private OptionalNullable<Integer> colCoId;
        private OptionalNullable<String> pAN;
        private OptionalNullable<Integer> payerId;
        private OptionalNullable<String> payerNumber;



        /**
         * Setter for replacementCardReference.
         * @param  replacementCardReference  Integer value for replacementCardReference.
         * @return Builder
         */
        public Builder replacementCardReference(Integer replacementCardReference) {
            this.replacementCardReference = OptionalNullable.of(replacementCardReference);
            return this;
        }

        /**
         * UnSetter for replacementCardReference.
         * @return Builder
         */
        public Builder unsetReplacementCardReference() {
            replacementCardReference = null;
            return this;
        }

        /**
         * Setter for updateCardReference.
         * @param  updateCardReference  Integer value for updateCardReference.
         * @return Builder
         */
        public Builder updateCardReference(Integer updateCardReference) {
            this.updateCardReference = OptionalNullable.of(updateCardReference);
            return this;
        }

        /**
         * UnSetter for updateCardReference.
         * @return Builder
         */
        public Builder unsetUpdateCardReference() {
            updateCardReference = null;
            return this;
        }

        /**
         * Setter for accountId.
         * @param  accountId  Integer value for accountId.
         * @return Builder
         */
        public Builder accountId(Integer accountId) {
            this.accountId = OptionalNullable.of(accountId);
            return this;
        }

        /**
         * UnSetter for accountId.
         * @return Builder
         */
        public Builder unsetAccountId() {
            accountId = null;
            return this;
        }

        /**
         * Setter for accountNumber.
         * @param  accountNumber  String value for accountNumber.
         * @return Builder
         */
        public Builder accountNumber(String accountNumber) {
            this.accountNumber = OptionalNullable.of(accountNumber);
            return this;
        }

        /**
         * UnSetter for accountNumber.
         * @return Builder
         */
        public Builder unsetAccountNumber() {
            accountNumber = null;
            return this;
        }

        /**
         * Setter for cardExpiryDate.
         * @param  cardExpiryDate  String value for cardExpiryDate.
         * @return Builder
         */
        public Builder cardExpiryDate(String cardExpiryDate) {
            this.cardExpiryDate = OptionalNullable.of(cardExpiryDate);
            return this;
        }

        /**
         * UnSetter for cardExpiryDate.
         * @return Builder
         */
        public Builder unsetCardExpiryDate() {
            cardExpiryDate = null;
            return this;
        }

        /**
         * Setter for cardId.
         * @param  cardId  Integer value for cardId.
         * @return Builder
         */
        public Builder cardId(Integer cardId) {
            this.cardId = OptionalNullable.of(cardId);
            return this;
        }

        /**
         * UnSetter for cardId.
         * @return Builder
         */
        public Builder unsetCardId() {
            cardId = null;
            return this;
        }

        /**
         * Setter for colCoCode.
         * @param  colCoCode  Integer value for colCoCode.
         * @return Builder
         */
        public Builder colCoCode(Integer colCoCode) {
            this.colCoCode = OptionalNullable.of(colCoCode);
            return this;
        }

        /**
         * UnSetter for colCoCode.
         * @return Builder
         */
        public Builder unsetColCoCode() {
            colCoCode = null;
            return this;
        }

        /**
         * Setter for colCoId.
         * @param  colCoId  Integer value for colCoId.
         * @return Builder
         */
        public Builder colCoId(Integer colCoId) {
            this.colCoId = OptionalNullable.of(colCoId);
            return this;
        }

        /**
         * UnSetter for colCoId.
         * @return Builder
         */
        public Builder unsetColCoId() {
            colCoId = null;
            return this;
        }

        /**
         * Setter for pAN.
         * @param  pAN  String value for pAN.
         * @return Builder
         */
        public Builder pAN(String pAN) {
            this.pAN = OptionalNullable.of(pAN);
            return this;
        }

        /**
         * UnSetter for pAN.
         * @return Builder
         */
        public Builder unsetPAN() {
            pAN = null;
            return this;
        }

        /**
         * Setter for payerId.
         * @param  payerId  Integer value for payerId.
         * @return Builder
         */
        public Builder payerId(Integer payerId) {
            this.payerId = OptionalNullable.of(payerId);
            return this;
        }

        /**
         * UnSetter for payerId.
         * @return Builder
         */
        public Builder unsetPayerId() {
            payerId = null;
            return this;
        }

        /**
         * Setter for payerNumber.
         * @param  payerNumber  String value for payerNumber.
         * @return Builder
         */
        public Builder payerNumber(String payerNumber) {
            this.payerNumber = OptionalNullable.of(payerNumber);
            return this;
        }

        /**
         * UnSetter for payerNumber.
         * @return Builder
         */
        public Builder unsetPayerNumber() {
            payerNumber = null;
            return this;
        }

        /**
         * Builds a new {@link SubmittedCard} object using the set fields.
         * @return {@link SubmittedCard}
         */
        public SubmittedCard build() {
            return new SubmittedCard(replacementCardReference, updateCardReference, accountId,
                    accountNumber, cardExpiryDate, cardId, colCoCode, colCoId, pAN, payerId,
                    payerNumber);
        }
    }
}
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
 * This is a model class for CardRestrictionReq type.
 */
public class CardRestrictionReq {
    private OptionalNullable<Integer> colCoId;
    private OptionalNullable<Integer> colCoCode;
    private OptionalNullable<Integer> payerId;
    private OptionalNullable<String> payerNumber;
    private RestrictionCardsList cards;

    /**
     * Default constructor.
     */
    public CardRestrictionReq() {
    }

    /**
     * Initialization constructor.
     * @param  colCoId  Integer value for colCoId.
     * @param  colCoCode  Integer value for colCoCode.
     * @param  payerId  Integer value for payerId.
     * @param  payerNumber  String value for payerNumber.
     * @param  cards  RestrictionCardsList value for cards.
     */
    public CardRestrictionReq(
            Integer colCoId,
            Integer colCoCode,
            Integer payerId,
            String payerNumber,
            RestrictionCardsList cards) {
        this.colCoId = OptionalNullable.of(colCoId);
        this.colCoCode = OptionalNullable.of(colCoCode);
        this.payerId = OptionalNullable.of(payerId);
        this.payerNumber = OptionalNullable.of(payerNumber);
        this.cards = cards;
    }

    /**
     * Initialization constructor.
     * @param  colCoId  Integer value for colCoId.
     * @param  colCoCode  Integer value for colCoCode.
     * @param  payerId  Integer value for payerId.
     * @param  payerNumber  String value for payerNumber.
     * @param  cards  RestrictionCardsList value for cards.
     */

    protected CardRestrictionReq(OptionalNullable<Integer> colCoId,
            OptionalNullable<Integer> colCoCode, OptionalNullable<Integer> payerId,
            OptionalNullable<String> payerNumber, RestrictionCardsList cards) {
        this.colCoId = colCoId;
        this.colCoCode = colCoCode;
        this.payerId = payerId;
        this.payerNumber = payerNumber;
        this.cards = cards;
    }

    /**
     * Internal Getter for ColCoId.
     * Collecting Company Id of the selected payer. Optional if ColCoCode is passed else Mandatory.
     * Example: 1 for Philippines 5 for UK
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
     * Collecting Company Id of the selected payer. Optional if ColCoCode is passed else Mandatory.
     * Example: 1 for Philippines 5 for UK
     * @return Returns the Integer
     */
    public Integer getColCoId() {
        return OptionalNullable.getFrom(colCoId);
    }

    /**
     * Setter for ColCoId.
     * Collecting Company Id of the selected payer. Optional if ColCoCode is passed else Mandatory.
     * Example: 1 for Philippines 5 for UK
     * @param colCoId Value for Integer
     */
    @JsonSetter("ColCoId")
    public void setColCoId(Integer colCoId) {
        this.colCoId = OptionalNullable.of(colCoId);
    }

    /**
     * UnSetter for ColCoId.
     * Collecting Company Id of the selected payer. Optional if ColCoCode is passed else Mandatory.
     * Example: 1 for Philippines 5 for UK
     */
    public void unsetColCoId() {
        colCoId = null;
    }

    /**
     * Internal Getter for ColCoCode.
     * Collecting Company Code of the selected payer. Mandatory for serviced OUs such as Romania,
     * Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if ColCoID is
     * provided. Example: 86 for Philippines 5 for UK
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
     * Collecting Company Code of the selected payer. Mandatory for serviced OUs such as Romania,
     * Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if ColCoID is
     * provided. Example: 86 for Philippines 5 for UK
     * @return Returns the Integer
     */
    public Integer getColCoCode() {
        return OptionalNullable.getFrom(colCoCode);
    }

    /**
     * Setter for ColCoCode.
     * Collecting Company Code of the selected payer. Mandatory for serviced OUs such as Romania,
     * Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if ColCoID is
     * provided. Example: 86 for Philippines 5 for UK
     * @param colCoCode Value for Integer
     */
    @JsonSetter("ColCoCode")
    public void setColCoCode(Integer colCoCode) {
        this.colCoCode = OptionalNullable.of(colCoCode);
    }

    /**
     * UnSetter for ColCoCode.
     * Collecting Company Code of the selected payer. Mandatory for serviced OUs such as Romania,
     * Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if ColCoID is
     * provided. Example: 86 for Philippines 5 for UK
     */
    public void unsetColCoCode() {
        colCoCode = null;
    }

    /**
     * Internal Getter for PayerId.
     * Payer Id of the selected payer. Optional if PayerNumber is passed else Mandatory Example:
     * 123456
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
     * Payer Id of the selected payer. Optional if PayerNumber is passed else Mandatory Example:
     * 123456
     * @return Returns the Integer
     */
    public Integer getPayerId() {
        return OptionalNullable.getFrom(payerId);
    }

    /**
     * Setter for PayerId.
     * Payer Id of the selected payer. Optional if PayerNumber is passed else Mandatory Example:
     * 123456
     * @param payerId Value for Integer
     */
    @JsonSetter("PayerId")
    public void setPayerId(Integer payerId) {
        this.payerId = OptionalNullable.of(payerId);
    }

    /**
     * UnSetter for PayerId.
     * Payer Id of the selected payer. Optional if PayerNumber is passed else Mandatory Example:
     * 123456
     */
    public void unsetPayerId() {
        payerId = null;
    }

    /**
     * Internal Getter for PayerNumber.
     * Payer Number of the selected payer. Optional if PayerId is passed else Mandatory Example:
     * GB000000123
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
     * Payer Number of the selected payer. Optional if PayerId is passed else Mandatory Example:
     * GB000000123
     * @return Returns the String
     */
    public String getPayerNumber() {
        return OptionalNullable.getFrom(payerNumber);
    }

    /**
     * Setter for PayerNumber.
     * Payer Number of the selected payer. Optional if PayerId is passed else Mandatory Example:
     * GB000000123
     * @param payerNumber Value for String
     */
    @JsonSetter("PayerNumber")
    public void setPayerNumber(String payerNumber) {
        this.payerNumber = OptionalNullable.of(payerNumber);
    }

    /**
     * UnSetter for PayerNumber.
     * Payer Number of the selected payer. Optional if PayerId is passed else Mandatory Example:
     * GB000000123
     */
    public void unsetPayerNumber() {
        payerNumber = null;
    }

    /**
     * Getter for Cards.
     * @return Returns the RestrictionCardsList
     */
    @JsonGetter("Cards")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public RestrictionCardsList getCards() {
        return cards;
    }

    /**
     * Setter for Cards.
     * @param cards Value for RestrictionCardsList
     */
    @JsonSetter("Cards")
    public void setCards(RestrictionCardsList cards) {
        this.cards = cards;
    }

    /**
     * Converts this CardRestrictionReq into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CardRestrictionReq [" + "colCoId=" + colCoId + ", colCoCode=" + colCoCode
                + ", payerId=" + payerId + ", payerNumber=" + payerNumber + ", cards=" + cards
                + "]";
    }

    /**
     * Builds a new {@link CardRestrictionReq.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CardRestrictionReq.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .cards(getCards());
        builder.colCoId = internalGetColCoId();
        builder.colCoCode = internalGetColCoCode();
        builder.payerId = internalGetPayerId();
        builder.payerNumber = internalGetPayerNumber();
        return builder;
    }

    /**
     * Class to build instances of {@link CardRestrictionReq}.
     */
    public static class Builder {
        private OptionalNullable<Integer> colCoId;
        private OptionalNullable<Integer> colCoCode;
        private OptionalNullable<Integer> payerId;
        private OptionalNullable<String> payerNumber;
        private RestrictionCardsList cards;



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
         * Setter for cards.
         * @param  cards  RestrictionCardsList value for cards.
         * @return Builder
         */
        public Builder cards(RestrictionCardsList cards) {
            this.cards = cards;
            return this;
        }

        /**
         * Builds a new {@link CardRestrictionReq} object using the set fields.
         * @return {@link CardRestrictionReq}
         */
        public CardRestrictionReq build() {
            return new CardRestrictionReq(colCoId, colCoCode, payerId, payerNumber, cards);
        }
    }
}

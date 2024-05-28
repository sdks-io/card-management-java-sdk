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
 * This is a model class for AutoRenewCardResponseDataItems type.
 */
public class AutoRenewCardResponseDataItems {
    private OptionalNullable<Integer> autoRenewReferenceId;
    private OptionalNullable<String> cardIdAndPAN;

    /**
     * Default constructor.
     */
    public AutoRenewCardResponseDataItems() {
    }

    /**
     * Initialization constructor.
     * @param  autoRenewReferenceId  Integer value for autoRenewReferenceId.
     * @param  cardIdAndPAN  String value for cardIdAndPAN.
     */
    public AutoRenewCardResponseDataItems(
            Integer autoRenewReferenceId,
            String cardIdAndPAN) {
        this.autoRenewReferenceId = OptionalNullable.of(autoRenewReferenceId);
        this.cardIdAndPAN = OptionalNullable.of(cardIdAndPAN);
    }

    /**
     * Initialization constructor.
     * @param  autoRenewReferenceId  Integer value for autoRenewReferenceId.
     * @param  cardIdAndPAN  String value for cardIdAndPAN.
     */

    protected AutoRenewCardResponseDataItems(OptionalNullable<Integer> autoRenewReferenceId,
            OptionalNullable<String> cardIdAndPAN) {
        this.autoRenewReferenceId = autoRenewReferenceId;
        this.cardIdAndPAN = cardIdAndPAN;
    }

    /**
     * Internal Getter for AutoRenewReferenceId.
     * CardId and PAN of the card. ;( Semicolon is used as delimiter.
     * @return Returns the Internal Integer
     */
    @JsonGetter("AutoRenewReferenceId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetAutoRenewReferenceId() {
        return this.autoRenewReferenceId;
    }

    /**
     * Getter for AutoRenewReferenceId.
     * CardId and PAN of the card. ;( Semicolon is used as delimiter.
     * @return Returns the Integer
     */
    public Integer getAutoRenewReferenceId() {
        return OptionalNullable.getFrom(autoRenewReferenceId);
    }

    /**
     * Setter for AutoRenewReferenceId.
     * CardId and PAN of the card. ;( Semicolon is used as delimiter.
     * @param autoRenewReferenceId Value for Integer
     */
    @JsonSetter("AutoRenewReferenceId")
    public void setAutoRenewReferenceId(Integer autoRenewReferenceId) {
        this.autoRenewReferenceId = OptionalNullable.of(autoRenewReferenceId);
    }

    /**
     * UnSetter for AutoRenewReferenceId.
     * CardId and PAN of the card. ;( Semicolon is used as delimiter.
     */
    public void unsetAutoRenewReferenceId() {
        autoRenewReferenceId = null;
    }

    /**
     * Internal Getter for CardIdAndPAN.
     * Reference number for each individual auto renew card in the order.
     * @return Returns the Internal String
     */
    @JsonGetter("CardIdAndPAN")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCardIdAndPAN() {
        return this.cardIdAndPAN;
    }

    /**
     * Getter for CardIdAndPAN.
     * Reference number for each individual auto renew card in the order.
     * @return Returns the String
     */
    public String getCardIdAndPAN() {
        return OptionalNullable.getFrom(cardIdAndPAN);
    }

    /**
     * Setter for CardIdAndPAN.
     * Reference number for each individual auto renew card in the order.
     * @param cardIdAndPAN Value for String
     */
    @JsonSetter("CardIdAndPAN")
    public void setCardIdAndPAN(String cardIdAndPAN) {
        this.cardIdAndPAN = OptionalNullable.of(cardIdAndPAN);
    }

    /**
     * UnSetter for CardIdAndPAN.
     * Reference number for each individual auto renew card in the order.
     */
    public void unsetCardIdAndPAN() {
        cardIdAndPAN = null;
    }

    /**
     * Converts this AutoRenewCardResponseDataItems into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AutoRenewCardResponseDataItems [" + "autoRenewReferenceId=" + autoRenewReferenceId
                + ", cardIdAndPAN=" + cardIdAndPAN + "]";
    }

    /**
     * Builds a new {@link AutoRenewCardResponseDataItems.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AutoRenewCardResponseDataItems.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.autoRenewReferenceId = internalGetAutoRenewReferenceId();
        builder.cardIdAndPAN = internalGetCardIdAndPAN();
        return builder;
    }

    /**
     * Class to build instances of {@link AutoRenewCardResponseDataItems}.
     */
    public static class Builder {
        private OptionalNullable<Integer> autoRenewReferenceId;
        private OptionalNullable<String> cardIdAndPAN;



        /**
         * Setter for autoRenewReferenceId.
         * @param  autoRenewReferenceId  Integer value for autoRenewReferenceId.
         * @return Builder
         */
        public Builder autoRenewReferenceId(Integer autoRenewReferenceId) {
            this.autoRenewReferenceId = OptionalNullable.of(autoRenewReferenceId);
            return this;
        }

        /**
         * UnSetter for autoRenewReferenceId.
         * @return Builder
         */
        public Builder unsetAutoRenewReferenceId() {
            autoRenewReferenceId = null;
            return this;
        }

        /**
         * Setter for cardIdAndPAN.
         * @param  cardIdAndPAN  String value for cardIdAndPAN.
         * @return Builder
         */
        public Builder cardIdAndPAN(String cardIdAndPAN) {
            this.cardIdAndPAN = OptionalNullable.of(cardIdAndPAN);
            return this;
        }

        /**
         * UnSetter for cardIdAndPAN.
         * @return Builder
         */
        public Builder unsetCardIdAndPAN() {
            cardIdAndPAN = null;
            return this;
        }

        /**
         * Builds a new {@link AutoRenewCardResponseDataItems} object using the set fields.
         * @return {@link AutoRenewCardResponseDataItems}
         */
        public AutoRenewCardResponseDataItems build() {
            return new AutoRenewCardResponseDataItems(autoRenewReferenceId, cardIdAndPAN);
        }
    }
}

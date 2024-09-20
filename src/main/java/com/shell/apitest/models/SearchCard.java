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
 * This is a model class for SearchCard type.
 */
public class SearchCard {
    private OptionalNullable<Integer> cardId;
    private OptionalNullable<String> pAN;
    private Double pANID;

    /**
     * Default constructor.
     */
    public SearchCard() {
    }

    /**
     * Initialization constructor.
     * @param  cardId  Integer value for cardId.
     * @param  pAN  String value for pAN.
     * @param  pANID  Double value for pANID.
     */
    public SearchCard(
            Integer cardId,
            String pAN,
            Double pANID) {
        this.cardId = OptionalNullable.of(cardId);
        this.pAN = OptionalNullable.of(pAN);
        this.pANID = pANID;
    }

    /**
     * Initialization constructor.
     * @param  cardId  Integer value for cardId.
     * @param  pAN  String value for pAN.
     * @param  pANID  Double value for pANID.
     */

    protected SearchCard(OptionalNullable<Integer> cardId, OptionalNullable<String> pAN,
            Double pANID) {
        this.cardId = cardId;
        this.pAN = pAN;
        this.pANID = pANID;
    }

    /**
     * Internal Getter for CardId.
     * Unique Card Id Optional if PAN is given, else mandatory.
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
     * Unique Card Id Optional if PAN is given, else mandatory.
     * @return Returns the Integer
     */
    public Integer getCardId() {
        return OptionalNullable.getFrom(cardId);
    }

    /**
     * Setter for CardId.
     * Unique Card Id Optional if PAN is given, else mandatory.
     * @param cardId Value for Integer
     */
    @JsonSetter("CardId")
    public void setCardId(Integer cardId) {
        this.cardId = OptionalNullable.of(cardId);
    }

    /**
     * UnSetter for CardId.
     * Unique Card Id Optional if PAN is given, else mandatory.
     */
    public void unsetCardId() {
        cardId = null;
    }

    /**
     * Internal Getter for PAN.
     * Card PAN. Optional if CardId is given, else mandatory. Note: PAN is ignored if CardId is
     * given.
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
     * Card PAN. Optional if CardId is given, else mandatory. Note: PAN is ignored if CardId is
     * given.
     * @return Returns the String
     */
    public String getPAN() {
        return OptionalNullable.getFrom(pAN);
    }

    /**
     * Setter for PAN.
     * Card PAN. Optional if CardId is given, else mandatory. Note: PAN is ignored if CardId is
     * given.
     * @param pAN Value for String
     */
    @JsonSetter("PAN")
    public void setPAN(String pAN) {
        this.pAN = OptionalNullable.of(pAN);
    }

    /**
     * UnSetter for PAN.
     * Card PAN. Optional if CardId is given, else mandatory. Note: PAN is ignored if CardId is
     * given.
     */
    public void unsetPAN() {
        pAN = null;
    }

    /**
     * Getter for PANID.
     * Card PANID optional id cardid given, else mandatory Note: PANID is ignored if CardId is
     * given.
     * @return Returns the Double
     */
    @JsonGetter("PANID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getPANID() {
        return pANID;
    }

    /**
     * Setter for PANID.
     * Card PANID optional id cardid given, else mandatory Note: PANID is ignored if CardId is
     * given.
     * @param pANID Value for Double
     */
    @JsonSetter("PANID")
    public void setPANID(Double pANID) {
        this.pANID = pANID;
    }

    /**
     * Converts this SearchCard into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SearchCard [" + "cardId=" + cardId + ", pAN=" + pAN + ", pANID=" + pANID + "]";
    }

    /**
     * Builds a new {@link SearchCard.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SearchCard.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .pANID(getPANID());
        builder.cardId = internalGetCardId();
        builder.pAN = internalGetPAN();
        return builder;
    }

    /**
     * Class to build instances of {@link SearchCard}.
     */
    public static class Builder {
        private OptionalNullable<Integer> cardId;
        private OptionalNullable<String> pAN;
        private Double pANID;



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
         * Setter for pANID.
         * @param  pANID  Double value for pANID.
         * @return Builder
         */
        public Builder pANID(Double pANID) {
            this.pANID = pANID;
            return this;
        }

        /**
         * Builds a new {@link SearchCard} object using the set fields.
         * @return {@link SearchCard}
         */
        public SearchCard build() {
            return new SearchCard(cardId, pAN, pANID);
        }
    }
}

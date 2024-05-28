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
 * This is a model class for CreateCardGroupResponseErrorCardsItems type.
 */
public class CreateCardGroupResponseErrorCardsItems {
    private Integer cardId;
    private String pAN;
    private String errorCode;
    private String errorDescription;

    /**
     * Default constructor.
     */
    public CreateCardGroupResponseErrorCardsItems() {
    }

    /**
     * Initialization constructor.
     * @param  cardId  Integer value for cardId.
     * @param  pAN  String value for pAN.
     * @param  errorCode  String value for errorCode.
     * @param  errorDescription  String value for errorDescription.
     */
    public CreateCardGroupResponseErrorCardsItems(
            Integer cardId,
            String pAN,
            String errorCode,
            String errorDescription) {
        this.cardId = cardId;
        this.pAN = pAN;
        this.errorCode = errorCode;
        this.errorDescription = errorDescription;
    }

    /**
     * Getter for CardId.
     * Card Id of the card.
     * @return Returns the Integer
     */
    @JsonGetter("CardId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCardId() {
        return cardId;
    }

    /**
     * Setter for CardId.
     * Card Id of the card.
     * @param cardId Value for Integer
     */
    @JsonSetter("CardId")
    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    /**
     * Getter for PAN.
     * PAN of the card.
     * @return Returns the String
     */
    @JsonGetter("PAN")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPAN() {
        return pAN;
    }

    /**
     * Setter for PAN.
     * PAN of the card.
     * @param pAN Value for String
     */
    @JsonSetter("PAN")
    public void setPAN(String pAN) {
        this.pAN = pAN;
    }

    /**
     * Getter for ErrorCode.
     * Error code for validation failure.
     * @return Returns the String
     */
    @JsonGetter("ErrorCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Setter for ErrorCode.
     * Error code for validation failure.
     * @param errorCode Value for String
     */
    @JsonSetter("ErrorCode")
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Getter for ErrorDescription.
     * Description of validation failure.
     * @return Returns the String
     */
    @JsonGetter("ErrorDescription")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getErrorDescription() {
        return errorDescription;
    }

    /**
     * Setter for ErrorDescription.
     * Description of validation failure.
     * @param errorDescription Value for String
     */
    @JsonSetter("ErrorDescription")
    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    /**
     * Converts this CreateCardGroupResponseErrorCardsItems into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateCardGroupResponseErrorCardsItems [" + "cardId=" + cardId + ", pAN=" + pAN
                + ", errorCode=" + errorCode + ", errorDescription=" + errorDescription + "]";
    }

    /**
     * Builds a new {@link CreateCardGroupResponseErrorCardsItems.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateCardGroupResponseErrorCardsItems.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .cardId(getCardId())
                .pAN(getPAN())
                .errorCode(getErrorCode())
                .errorDescription(getErrorDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateCardGroupResponseErrorCardsItems}.
     */
    public static class Builder {
        private Integer cardId;
        private String pAN;
        private String errorCode;
        private String errorDescription;



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
         * Setter for pAN.
         * @param  pAN  String value for pAN.
         * @return Builder
         */
        public Builder pAN(String pAN) {
            this.pAN = pAN;
            return this;
        }

        /**
         * Setter for errorCode.
         * @param  errorCode  String value for errorCode.
         * @return Builder
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * Setter for errorDescription.
         * @param  errorDescription  String value for errorDescription.
         * @return Builder
         */
        public Builder errorDescription(String errorDescription) {
            this.errorDescription = errorDescription;
            return this;
        }

        /**
         * Builds a new {@link CreateCardGroupResponseErrorCardsItems} object using the set fields.
         * @return {@link CreateCardGroupResponseErrorCardsItems}
         */
        public CreateCardGroupResponseErrorCardsItems build() {
            return new CreateCardGroupResponseErrorCardsItems(cardId, pAN, errorCode,
                    errorDescription);
        }
    }
}

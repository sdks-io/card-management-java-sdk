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
 * This is a model class for CardMoveResponse type.
 */
public class CardMoveResponse {
    private Integer moveCardRequestReference;
    private List<CardMoveResponseSuccessfulRequestsItems> successfulRequests;
    private List<CardMoveResponseErrorCardsItems> errorCards;
    private String requestId;
    private ErrorStatus error;

    /**
     * Default constructor.
     */
    public CardMoveResponse() {
    }

    /**
     * Initialization constructor.
     * @param  moveCardRequestReference  Integer value for moveCardRequestReference.
     * @param  successfulRequests  List of CardMoveResponseSuccessfulRequestsItems value for
     *         successfulRequests.
     * @param  errorCards  List of CardMoveResponseErrorCardsItems value for errorCards.
     * @param  requestId  String value for requestId.
     * @param  error  ErrorStatus value for error.
     */
    public CardMoveResponse(
            Integer moveCardRequestReference,
            List<CardMoveResponseSuccessfulRequestsItems> successfulRequests,
            List<CardMoveResponseErrorCardsItems> errorCards,
            String requestId,
            ErrorStatus error) {
        this.moveCardRequestReference = moveCardRequestReference;
        this.successfulRequests = successfulRequests;
        this.errorCards = errorCards;
        this.requestId = requestId;
        this.error = error;
    }

    /**
     * Getter for MoveCardRequestReference.
     * @return Returns the Integer
     */
    @JsonGetter("MoveCardRequestReference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getMoveCardRequestReference() {
        return moveCardRequestReference;
    }

    /**
     * Setter for MoveCardRequestReference.
     * @param moveCardRequestReference Value for Integer
     */
    @JsonSetter("MoveCardRequestReference")
    public void setMoveCardRequestReference(Integer moveCardRequestReference) {
        this.moveCardRequestReference = moveCardRequestReference;
    }

    /**
     * Getter for SuccessfulRequests.
     * @return Returns the List of CardMoveResponseSuccessfulRequestsItems
     */
    @JsonGetter("SuccessfulRequests")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CardMoveResponseSuccessfulRequestsItems> getSuccessfulRequests() {
        return successfulRequests;
    }

    /**
     * Setter for SuccessfulRequests.
     * @param successfulRequests Value for List of CardMoveResponseSuccessfulRequestsItems
     */
    @JsonSetter("SuccessfulRequests")
    public void setSuccessfulRequests(List<CardMoveResponseSuccessfulRequestsItems> successfulRequests) {
        this.successfulRequests = successfulRequests;
    }

    /**
     * Getter for ErrorCards.
     * @return Returns the List of CardMoveResponseErrorCardsItems
     */
    @JsonGetter("ErrorCards")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CardMoveResponseErrorCardsItems> getErrorCards() {
        return errorCards;
    }

    /**
     * Setter for ErrorCards.
     * @param errorCards Value for List of CardMoveResponseErrorCardsItems
     */
    @JsonSetter("ErrorCards")
    public void setErrorCards(List<CardMoveResponseErrorCardsItems> errorCards) {
        this.errorCards = errorCards;
    }

    /**
     * Getter for RequestId.
     * @return Returns the String
     */
    @JsonGetter("RequestId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRequestId() {
        return requestId;
    }

    /**
     * Setter for RequestId.
     * @param requestId Value for String
     */
    @JsonSetter("RequestId")
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Getter for Error.
     * @return Returns the ErrorStatus
     */
    @JsonGetter("Error")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ErrorStatus getError() {
        return error;
    }

    /**
     * Setter for Error.
     * @param error Value for ErrorStatus
     */
    @JsonSetter("Error")
    public void setError(ErrorStatus error) {
        this.error = error;
    }

    /**
     * Converts this CardMoveResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CardMoveResponse [" + "moveCardRequestReference=" + moveCardRequestReference
                + ", successfulRequests=" + successfulRequests + ", errorCards=" + errorCards
                + ", requestId=" + requestId + ", error=" + error + "]";
    }

    /**
     * Builds a new {@link CardMoveResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CardMoveResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .moveCardRequestReference(getMoveCardRequestReference())
                .successfulRequests(getSuccessfulRequests())
                .errorCards(getErrorCards())
                .requestId(getRequestId())
                .error(getError());
        return builder;
    }

    /**
     * Class to build instances of {@link CardMoveResponse}.
     */
    public static class Builder {
        private Integer moveCardRequestReference;
        private List<CardMoveResponseSuccessfulRequestsItems> successfulRequests;
        private List<CardMoveResponseErrorCardsItems> errorCards;
        private String requestId;
        private ErrorStatus error;



        /**
         * Setter for moveCardRequestReference.
         * @param  moveCardRequestReference  Integer value for moveCardRequestReference.
         * @return Builder
         */
        public Builder moveCardRequestReference(Integer moveCardRequestReference) {
            this.moveCardRequestReference = moveCardRequestReference;
            return this;
        }

        /**
         * Setter for successfulRequests.
         * @param  successfulRequests  List of CardMoveResponseSuccessfulRequestsItems value for
         *         successfulRequests.
         * @return Builder
         */
        public Builder successfulRequests(
                List<CardMoveResponseSuccessfulRequestsItems> successfulRequests) {
            this.successfulRequests = successfulRequests;
            return this;
        }

        /**
         * Setter for errorCards.
         * @param  errorCards  List of CardMoveResponseErrorCardsItems value for errorCards.
         * @return Builder
         */
        public Builder errorCards(List<CardMoveResponseErrorCardsItems> errorCards) {
            this.errorCards = errorCards;
            return this;
        }

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
         * Setter for error.
         * @param  error  ErrorStatus value for error.
         * @return Builder
         */
        public Builder error(ErrorStatus error) {
            this.error = error;
            return this;
        }

        /**
         * Builds a new {@link CardMoveResponse} object using the set fields.
         * @return {@link CardMoveResponse}
         */
        public CardMoveResponse build() {
            return new CardMoveResponse(moveCardRequestReference, successfulRequests, errorCards,
                    requestId, error);
        }
    }
}

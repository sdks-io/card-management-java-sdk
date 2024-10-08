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
import java.util.List;

/**
 * This is a model class for SearchCardRestrictionRes type.
 */
public class SearchCardRestrictionRes {
    private OptionalNullable<String> requestId;
    private List<RestrictionCardList> cards;
    private Restriction restrictions;
    private ErrorStatus error;

    /**
     * Default constructor.
     */
    public SearchCardRestrictionRes() {
    }

    /**
     * Initialization constructor.
     * @param  requestId  String value for requestId.
     * @param  cards  List of RestrictionCardList value for cards.
     * @param  restrictions  Restriction value for restrictions.
     * @param  error  ErrorStatus value for error.
     */
    public SearchCardRestrictionRes(
            String requestId,
            List<RestrictionCardList> cards,
            Restriction restrictions,
            ErrorStatus error) {
        this.requestId = OptionalNullable.of(requestId);
        this.cards = cards;
        this.restrictions = restrictions;
        this.error = error;
    }

    /**
     * Initialization constructor.
     * @param  requestId  String value for requestId.
     * @param  cards  List of RestrictionCardList value for cards.
     * @param  restrictions  Restriction value for restrictions.
     * @param  error  ErrorStatus value for error.
     */

    protected SearchCardRestrictionRes(OptionalNullable<String> requestId,
            List<RestrictionCardList> cards, Restriction restrictions, ErrorStatus error) {
        this.requestId = requestId;
        this.cards = cards;
        this.restrictions = restrictions;
        this.error = error;
    }

    /**
     * Internal Getter for RequestId.
     * Request Id of the API call
     * @return Returns the Internal String
     */
    @JsonGetter("RequestId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetRequestId() {
        return this.requestId;
    }

    /**
     * Getter for RequestId.
     * Request Id of the API call
     * @return Returns the String
     */
    public String getRequestId() {
        return OptionalNullable.getFrom(requestId);
    }

    /**
     * Setter for RequestId.
     * Request Id of the API call
     * @param requestId Value for String
     */
    @JsonSetter("RequestId")
    public void setRequestId(String requestId) {
        this.requestId = OptionalNullable.of(requestId);
    }

    /**
     * UnSetter for RequestId.
     * Request Id of the API call
     */
    public void unsetRequestId() {
        requestId = null;
    }

    /**
     * Getter for Cards.
     * @return Returns the List of RestrictionCardList
     */
    @JsonGetter("cards")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<RestrictionCardList> getCards() {
        return cards;
    }

    /**
     * Setter for Cards.
     * @param cards Value for List of RestrictionCardList
     */
    @JsonSetter("cards")
    public void setCards(List<RestrictionCardList> cards) {
        this.cards = cards;
    }

    /**
     * Getter for Restrictions.
     * @return Returns the Restriction
     */
    @JsonGetter("Restrictions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Restriction getRestrictions() {
        return restrictions;
    }

    /**
     * Setter for Restrictions.
     * @param restrictions Value for Restriction
     */
    @JsonSetter("Restrictions")
    public void setRestrictions(Restriction restrictions) {
        this.restrictions = restrictions;
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
     * Converts this SearchCardRestrictionRes into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SearchCardRestrictionRes [" + "requestId=" + requestId + ", cards=" + cards
                + ", restrictions=" + restrictions + ", error=" + error + "]";
    }

    /**
     * Builds a new {@link SearchCardRestrictionRes.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SearchCardRestrictionRes.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .cards(getCards())
                .restrictions(getRestrictions())
                .error(getError());
        builder.requestId = internalGetRequestId();
        return builder;
    }

    /**
     * Class to build instances of {@link SearchCardRestrictionRes}.
     */
    public static class Builder {
        private OptionalNullable<String> requestId;
        private List<RestrictionCardList> cards;
        private Restriction restrictions;
        private ErrorStatus error;



        /**
         * Setter for requestId.
         * @param  requestId  String value for requestId.
         * @return Builder
         */
        public Builder requestId(String requestId) {
            this.requestId = OptionalNullable.of(requestId);
            return this;
        }

        /**
         * UnSetter for requestId.
         * @return Builder
         */
        public Builder unsetRequestId() {
            requestId = null;
            return this;
        }

        /**
         * Setter for cards.
         * @param  cards  List of RestrictionCardList value for cards.
         * @return Builder
         */
        public Builder cards(List<RestrictionCardList> cards) {
            this.cards = cards;
            return this;
        }

        /**
         * Setter for restrictions.
         * @param  restrictions  Restriction value for restrictions.
         * @return Builder
         */
        public Builder restrictions(Restriction restrictions) {
            this.restrictions = restrictions;
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
         * Builds a new {@link SearchCardRestrictionRes} object using the set fields.
         * @return {@link SearchCardRestrictionRes}
         */
        public SearchCardRestrictionRes build() {
            return new SearchCardRestrictionRes(requestId, cards, restrictions, error);
        }
    }
}

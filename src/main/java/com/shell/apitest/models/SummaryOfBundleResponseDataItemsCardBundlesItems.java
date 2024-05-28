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
 * This is a model class for SummaryOfBundleResponseDataItemsCardBundlesItems type.
 */
public class SummaryOfBundleResponseDataItemsCardBundlesItems {
    private OptionalNullable<String> bundleId;
    private OptionalNullable<String> externalBundleId;
    private OptionalNullable<String> description;
    private OptionalNullable<Integer> totalCards;

    /**
     * Default constructor.
     */
    public SummaryOfBundleResponseDataItemsCardBundlesItems() {
    }

    /**
     * Initialization constructor.
     * @param  bundleId  String value for bundleId.
     * @param  externalBundleId  String value for externalBundleId.
     * @param  description  String value for description.
     * @param  totalCards  Integer value for totalCards.
     */
    public SummaryOfBundleResponseDataItemsCardBundlesItems(
            String bundleId,
            String externalBundleId,
            String description,
            Integer totalCards) {
        this.bundleId = OptionalNullable.of(bundleId);
        this.externalBundleId = OptionalNullable.of(externalBundleId);
        this.description = OptionalNullable.of(description);
        this.totalCards = OptionalNullable.of(totalCards);
    }

    /**
     * Initialization constructor.
     * @param  bundleId  String value for bundleId.
     * @param  externalBundleId  String value for externalBundleId.
     * @param  description  String value for description.
     * @param  totalCards  Integer value for totalCards.
     */

    protected SummaryOfBundleResponseDataItemsCardBundlesItems(OptionalNullable<String> bundleId,
            OptionalNullable<String> externalBundleId, OptionalNullable<String> description,
            OptionalNullable<Integer> totalCards) {
        this.bundleId = bundleId;
        this.externalBundleId = externalBundleId;
        this.description = description;
        this.totalCards = totalCards;
    }

    /**
     * Internal Getter for BundleId.
     * Gateway assigned unique identifier for the Card Bundle.
     * @return Returns the Internal String
     */
    @JsonGetter("BundleId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetBundleId() {
        return this.bundleId;
    }

    /**
     * Getter for BundleId.
     * Gateway assigned unique identifier for the Card Bundle.
     * @return Returns the String
     */
    public String getBundleId() {
        return OptionalNullable.getFrom(bundleId);
    }

    /**
     * Setter for BundleId.
     * Gateway assigned unique identifier for the Card Bundle.
     * @param bundleId Value for String
     */
    @JsonSetter("BundleId")
    public void setBundleId(String bundleId) {
        this.bundleId = OptionalNullable.of(bundleId);
    }

    /**
     * UnSetter for BundleId.
     * Gateway assigned unique identifier for the Card Bundle.
     */
    public void unsetBundleId() {
        bundleId = null;
    }

    /**
     * Internal Getter for ExternalBundleId.
     * External system allocated Card Bundle identifier for Card Bundle.
     * @return Returns the Internal String
     */
    @JsonGetter("ExternalBundleId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetExternalBundleId() {
        return this.externalBundleId;
    }

    /**
     * Getter for ExternalBundleId.
     * External system allocated Card Bundle identifier for Card Bundle.
     * @return Returns the String
     */
    public String getExternalBundleId() {
        return OptionalNullable.getFrom(externalBundleId);
    }

    /**
     * Setter for ExternalBundleId.
     * External system allocated Card Bundle identifier for Card Bundle.
     * @param externalBundleId Value for String
     */
    @JsonSetter("ExternalBundleId")
    public void setExternalBundleId(String externalBundleId) {
        this.externalBundleId = OptionalNullable.of(externalBundleId);
    }

    /**
     * UnSetter for ExternalBundleId.
     * External system allocated Card Bundle identifier for Card Bundle.
     */
    public void unsetExternalBundleId() {
        externalBundleId = null;
    }

    /**
     * Internal Getter for Description.
     * Card Bundle Description.
     * @return Returns the Internal String
     */
    @JsonGetter("Description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDescription() {
        return this.description;
    }

    /**
     * Getter for Description.
     * Card Bundle Description.
     * @return Returns the String
     */
    public String getDescription() {
        return OptionalNullable.getFrom(description);
    }

    /**
     * Setter for Description.
     * Card Bundle Description.
     * @param description Value for String
     */
    @JsonSetter("Description")
    public void setDescription(String description) {
        this.description = OptionalNullable.of(description);
    }

    /**
     * UnSetter for Description.
     * Card Bundle Description.
     */
    public void unsetDescription() {
        description = null;
    }

    /**
     * Internal Getter for TotalCards.
     * No of Card PAN added to the card bundle.
     * @return Returns the Internal Integer
     */
    @JsonGetter("TotalCards")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetTotalCards() {
        return this.totalCards;
    }

    /**
     * Getter for TotalCards.
     * No of Card PAN added to the card bundle.
     * @return Returns the Integer
     */
    public Integer getTotalCards() {
        return OptionalNullable.getFrom(totalCards);
    }

    /**
     * Setter for TotalCards.
     * No of Card PAN added to the card bundle.
     * @param totalCards Value for Integer
     */
    @JsonSetter("TotalCards")
    public void setTotalCards(Integer totalCards) {
        this.totalCards = OptionalNullable.of(totalCards);
    }

    /**
     * UnSetter for TotalCards.
     * No of Card PAN added to the card bundle.
     */
    public void unsetTotalCards() {
        totalCards = null;
    }

    /**
     * Converts this SummaryOfBundleResponseDataItemsCardBundlesItems into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SummaryOfBundleResponseDataItemsCardBundlesItems [" + "bundleId=" + bundleId
                + ", externalBundleId=" + externalBundleId + ", description=" + description
                + ", totalCards=" + totalCards + "]";
    }

    /**
     * Builds a new {@link SummaryOfBundleResponseDataItemsCardBundlesItems.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SummaryOfBundleResponseDataItemsCardBundlesItems.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.bundleId = internalGetBundleId();
        builder.externalBundleId = internalGetExternalBundleId();
        builder.description = internalGetDescription();
        builder.totalCards = internalGetTotalCards();
        return builder;
    }

    /**
     * Class to build instances of {@link SummaryOfBundleResponseDataItemsCardBundlesItems}.
     */
    public static class Builder {
        private OptionalNullable<String> bundleId;
        private OptionalNullable<String> externalBundleId;
        private OptionalNullable<String> description;
        private OptionalNullable<Integer> totalCards;



        /**
         * Setter for bundleId.
         * @param  bundleId  String value for bundleId.
         * @return Builder
         */
        public Builder bundleId(String bundleId) {
            this.bundleId = OptionalNullable.of(bundleId);
            return this;
        }

        /**
         * UnSetter for bundleId.
         * @return Builder
         */
        public Builder unsetBundleId() {
            bundleId = null;
            return this;
        }

        /**
         * Setter for externalBundleId.
         * @param  externalBundleId  String value for externalBundleId.
         * @return Builder
         */
        public Builder externalBundleId(String externalBundleId) {
            this.externalBundleId = OptionalNullable.of(externalBundleId);
            return this;
        }

        /**
         * UnSetter for externalBundleId.
         * @return Builder
         */
        public Builder unsetExternalBundleId() {
            externalBundleId = null;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = OptionalNullable.of(description);
            return this;
        }

        /**
         * UnSetter for description.
         * @return Builder
         */
        public Builder unsetDescription() {
            description = null;
            return this;
        }

        /**
         * Setter for totalCards.
         * @param  totalCards  Integer value for totalCards.
         * @return Builder
         */
        public Builder totalCards(Integer totalCards) {
            this.totalCards = OptionalNullable.of(totalCards);
            return this;
        }

        /**
         * UnSetter for totalCards.
         * @return Builder
         */
        public Builder unsetTotalCards() {
            totalCards = null;
            return this;
        }

        /**
         * Builds a new {@link SummaryOfBundleResponseDataItemsCardBundlesItems} object using the
         * set fields.
         * @return {@link SummaryOfBundleResponseDataItemsCardBundlesItems}
         */
        public SummaryOfBundleResponseDataItemsCardBundlesItems build() {
            return new SummaryOfBundleResponseDataItemsCardBundlesItems(bundleId, externalBundleId,
                    description, totalCards);
        }
    }
}
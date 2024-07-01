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
 * This is a model class for CardBundle type.
 */
public class CardBundle {
    private String bundleId;
    private String externalBundleId;
    private String description;
    private Integer totalCards;

    /**
     * Default constructor.
     */
    public CardBundle() {
    }

    /**
     * Initialization constructor.
     * @param  bundleId  String value for bundleId.
     * @param  externalBundleId  String value for externalBundleId.
     * @param  description  String value for description.
     * @param  totalCards  Integer value for totalCards.
     */
    public CardBundle(
            String bundleId,
            String externalBundleId,
            String description,
            Integer totalCards) {
        this.bundleId = bundleId;
        this.externalBundleId = externalBundleId;
        this.description = description;
        this.totalCards = totalCards;
    }

    /**
     * Getter for BundleId.
     * Unique identifier for the Card Bundle
     * @return Returns the String
     */
    @JsonGetter("BundleId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBundleId() {
        return bundleId;
    }

    /**
     * Setter for BundleId.
     * Unique identifier for the Card Bundle
     * @param bundleId Value for String
     */
    @JsonSetter("BundleId")
    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    /**
     * Getter for ExternalBundleId.
     * External system allocated Card Bundle identifier for Card Bundle.
     * @return Returns the String
     */
    @JsonGetter("ExternalBundleId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getExternalBundleId() {
        return externalBundleId;
    }

    /**
     * Setter for ExternalBundleId.
     * External system allocated Card Bundle identifier for Card Bundle.
     * @param externalBundleId Value for String
     */
    @JsonSetter("ExternalBundleId")
    public void setExternalBundleId(String externalBundleId) {
        this.externalBundleId = externalBundleId;
    }

    /**
     * Getter for Description.
     * DescriptionCard Bundle Description.
     * @return Returns the String
     */
    @JsonGetter("Description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * DescriptionCard Bundle Description.
     * @param description Value for String
     */
    @JsonSetter("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for TotalCards.
     * No of Card PAN added to the card bundle.
     * @return Returns the Integer
     */
    @JsonGetter("TotalCards")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTotalCards() {
        return totalCards;
    }

    /**
     * Setter for TotalCards.
     * No of Card PAN added to the card bundle.
     * @param totalCards Value for Integer
     */
    @JsonSetter("TotalCards")
    public void setTotalCards(Integer totalCards) {
        this.totalCards = totalCards;
    }

    /**
     * Converts this CardBundle into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CardBundle [" + "bundleId=" + bundleId + ", externalBundleId=" + externalBundleId
                + ", description=" + description + ", totalCards=" + totalCards + "]";
    }

    /**
     * Builds a new {@link CardBundle.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CardBundle.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .bundleId(getBundleId())
                .externalBundleId(getExternalBundleId())
                .description(getDescription())
                .totalCards(getTotalCards());
        return builder;
    }

    /**
     * Class to build instances of {@link CardBundle}.
     */
    public static class Builder {
        private String bundleId;
        private String externalBundleId;
        private String description;
        private Integer totalCards;



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
         * Setter for externalBundleId.
         * @param  externalBundleId  String value for externalBundleId.
         * @return Builder
         */
        public Builder externalBundleId(String externalBundleId) {
            this.externalBundleId = externalBundleId;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for totalCards.
         * @param  totalCards  Integer value for totalCards.
         * @return Builder
         */
        public Builder totalCards(Integer totalCards) {
            this.totalCards = totalCards;
            return this;
        }

        /**
         * Builds a new {@link CardBundle} object using the set fields.
         * @return {@link CardBundle}
         */
        public CardBundle build() {
            return new CardBundle(bundleId, externalBundleId, description, totalCards);
        }
    }
}
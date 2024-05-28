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
 * This is a model class for ScheduleCardBlockResponseDataItems type.
 */
public class ScheduleCardBlockResponseDataItems {
    private Integer cardId;
    private String fromDate;
    private String toDate;
    private Integer referenceId;

    /**
     * Default constructor.
     */
    public ScheduleCardBlockResponseDataItems() {
    }

    /**
     * Initialization constructor.
     * @param  cardId  Integer value for cardId.
     * @param  fromDate  String value for fromDate.
     * @param  toDate  String value for toDate.
     * @param  referenceId  Integer value for referenceId.
     */
    public ScheduleCardBlockResponseDataItems(
            Integer cardId,
            String fromDate,
            String toDate,
            Integer referenceId) {
        this.cardId = cardId;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.referenceId = referenceId;
    }

    /**
     * Getter for CardId.
     * Unique Id of the card.
     * @return Returns the Integer
     */
    @JsonGetter("CardId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCardId() {
        return cardId;
    }

    /**
     * Setter for CardId.
     * Unique Id of the card.
     * @param cardId Value for Integer
     */
    @JsonSetter("CardId")
    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    /**
     * Getter for FromDate.
     * Effective start date &amp; time of Block / Unblock as updated in the intermediate queue table.
     * Format: yyyyMMdd HH:mm Eg: 20230512 12:30
     * @return Returns the String
     */
    @JsonGetter("FromDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFromDate() {
        return fromDate;
    }

    /**
     * Setter for FromDate.
     * Effective start date &amp; time of Block / Unblock as updated in the intermediate queue table.
     * Format: yyyyMMdd HH:mm Eg: 20230512 12:30
     * @param fromDate Value for String
     */
    @JsonSetter("FromDate")
    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    /**
     * Getter for ToDate.
     * Effective end date &amp; time of Block / Unblock as updated in the intermediate queue table.
     * Format: yyyyMMdd HH:mm Eg: 20230512 14:30
     * @return Returns the String
     */
    @JsonGetter("ToDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getToDate() {
        return toDate;
    }

    /**
     * Setter for ToDate.
     * Effective end date &amp; time of Block / Unblock as updated in the intermediate queue table.
     * Format: yyyyMMdd HH:mm Eg: 20230512 14:30
     * @param toDate Value for String
     */
    @JsonSetter("ToDate")
    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    /**
     * Getter for ReferenceId.
     * Effective end date &amp; time of Block / Unblock as updated in the intermediate queue table.
     * Format: yyyyMMdd HH:mm Eg: 20230512 14:30
     * @return Returns the Integer
     */
    @JsonGetter("ReferenceId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getReferenceId() {
        return referenceId;
    }

    /**
     * Setter for ReferenceId.
     * Effective end date &amp; time of Block / Unblock as updated in the intermediate queue table.
     * Format: yyyyMMdd HH:mm Eg: 20230512 14:30
     * @param referenceId Value for Integer
     */
    @JsonSetter("ReferenceId")
    public void setReferenceId(Integer referenceId) {
        this.referenceId = referenceId;
    }

    /**
     * Converts this ScheduleCardBlockResponseDataItems into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ScheduleCardBlockResponseDataItems [" + "cardId=" + cardId + ", fromDate="
                + fromDate + ", toDate=" + toDate + ", referenceId=" + referenceId + "]";
    }

    /**
     * Builds a new {@link ScheduleCardBlockResponseDataItems.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ScheduleCardBlockResponseDataItems.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .cardId(getCardId())
                .fromDate(getFromDate())
                .toDate(getToDate())
                .referenceId(getReferenceId());
        return builder;
    }

    /**
     * Class to build instances of {@link ScheduleCardBlockResponseDataItems}.
     */
    public static class Builder {
        private Integer cardId;
        private String fromDate;
        private String toDate;
        private Integer referenceId;



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
         * Setter for fromDate.
         * @param  fromDate  String value for fromDate.
         * @return Builder
         */
        public Builder fromDate(String fromDate) {
            this.fromDate = fromDate;
            return this;
        }

        /**
         * Setter for toDate.
         * @param  toDate  String value for toDate.
         * @return Builder
         */
        public Builder toDate(String toDate) {
            this.toDate = toDate;
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
         * Builds a new {@link ScheduleCardBlockResponseDataItems} object using the set fields.
         * @return {@link ScheduleCardBlockResponseDataItems}
         */
        public ScheduleCardBlockResponseDataItems build() {
            return new ScheduleCardBlockResponseDataItems(cardId, fromDate, toDate, referenceId);
        }
    }
}
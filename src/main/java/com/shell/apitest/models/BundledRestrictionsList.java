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
 * This is a model class for BundledRestrictionsList type.
 */
public class BundledRestrictionsList {
    private OptionalNullable<UsageRestriction> usageRestrictions;
    private DayTimeRestriction dayTimeRestrictions;
    private BundledDetailsProductList productRestrictions;
    private LocationRestriction locationRestrictions;

    /**
     * Default constructor.
     */
    public BundledRestrictionsList() {
    }

    /**
     * Initialization constructor.
     * @param  usageRestrictions  UsageRestriction value for usageRestrictions.
     * @param  dayTimeRestrictions  DayTimeRestriction value for dayTimeRestrictions.
     * @param  productRestrictions  BundledDetailsProductList value for productRestrictions.
     * @param  locationRestrictions  LocationRestriction value for locationRestrictions.
     */
    public BundledRestrictionsList(
            UsageRestriction usageRestrictions,
            DayTimeRestriction dayTimeRestrictions,
            BundledDetailsProductList productRestrictions,
            LocationRestriction locationRestrictions) {
        this.usageRestrictions = OptionalNullable.of(usageRestrictions);
        this.dayTimeRestrictions = dayTimeRestrictions;
        this.productRestrictions = productRestrictions;
        this.locationRestrictions = locationRestrictions;
    }

    /**
     * Initialization constructor.
     * @param  usageRestrictions  UsageRestriction value for usageRestrictions.
     * @param  dayTimeRestrictions  DayTimeRestriction value for dayTimeRestrictions.
     * @param  productRestrictions  BundledDetailsProductList value for productRestrictions.
     * @param  locationRestrictions  LocationRestriction value for locationRestrictions.
     */

    protected BundledRestrictionsList(OptionalNullable<UsageRestriction> usageRestrictions,
            DayTimeRestriction dayTimeRestrictions, BundledDetailsProductList productRestrictions,
            LocationRestriction locationRestrictions) {
        this.usageRestrictions = usageRestrictions;
        this.dayTimeRestrictions = dayTimeRestrictions;
        this.productRestrictions = productRestrictions;
        this.locationRestrictions = locationRestrictions;
    }

    /**
     * Internal Getter for UsageRestrictions.
     * Details of the usage restrictions such as day/week/month value and volume restrictions
     * applied on the card.
     * @return Returns the Internal UsageRestriction
     */
    @JsonGetter("UsageRestrictions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<UsageRestriction> internalGetUsageRestrictions() {
        return this.usageRestrictions;
    }

    /**
     * Getter for UsageRestrictions.
     * Details of the usage restrictions such as day/week/month value and volume restrictions
     * applied on the card.
     * @return Returns the UsageRestriction
     */
    public UsageRestriction getUsageRestrictions() {
        return OptionalNullable.getFrom(usageRestrictions);
    }

    /**
     * Setter for UsageRestrictions.
     * Details of the usage restrictions such as day/week/month value and volume restrictions
     * applied on the card.
     * @param usageRestrictions Value for UsageRestriction
     */
    @JsonSetter("UsageRestrictions")
    public void setUsageRestrictions(UsageRestriction usageRestrictions) {
        this.usageRestrictions = OptionalNullable.of(usageRestrictions);
    }

    /**
     * UnSetter for UsageRestrictions.
     * Details of the usage restrictions such as day/week/month value and volume restrictions
     * applied on the card.
     */
    public void unsetUsageRestrictions() {
        usageRestrictions = null;
    }

    /**
     * Getter for DayTimeRestrictions.
     * Details of the day/time restrictions such as weekdays and time range in which transactions
     * should be allowed on the card.
     * @return Returns the DayTimeRestriction
     */
    @JsonGetter("DayTimeRestrictions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DayTimeRestriction getDayTimeRestrictions() {
        return dayTimeRestrictions;
    }

    /**
     * Setter for DayTimeRestrictions.
     * Details of the day/time restrictions such as weekdays and time range in which transactions
     * should be allowed on the card.
     * @param dayTimeRestrictions Value for DayTimeRestriction
     */
    @JsonSetter("DayTimeRestrictions")
    public void setDayTimeRestrictions(DayTimeRestriction dayTimeRestrictions) {
        this.dayTimeRestrictions = dayTimeRestrictions;
    }

    /**
     * Getter for ProductRestrictions.
     * @return Returns the BundledDetailsProductList
     */
    @JsonGetter("ProductRestrictions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BundledDetailsProductList getProductRestrictions() {
        return productRestrictions;
    }

    /**
     * Setter for ProductRestrictions.
     * @param productRestrictions Value for BundledDetailsProductList
     */
    @JsonSetter("ProductRestrictions")
    public void setProductRestrictions(BundledDetailsProductList productRestrictions) {
        this.productRestrictions = productRestrictions;
    }

    /**
     * Getter for LocationRestrictions.
     * @return Returns the LocationRestriction
     */
    @JsonGetter("LocationRestrictions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public LocationRestriction getLocationRestrictions() {
        return locationRestrictions;
    }

    /**
     * Setter for LocationRestrictions.
     * @param locationRestrictions Value for LocationRestriction
     */
    @JsonSetter("LocationRestrictions")
    public void setLocationRestrictions(LocationRestriction locationRestrictions) {
        this.locationRestrictions = locationRestrictions;
    }

    /**
     * Converts this BundledRestrictionsList into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BundledRestrictionsList [" + "usageRestrictions=" + usageRestrictions
                + ", dayTimeRestrictions=" + dayTimeRestrictions + ", productRestrictions="
                + productRestrictions + ", locationRestrictions=" + locationRestrictions + "]";
    }

    /**
     * Builds a new {@link BundledRestrictionsList.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BundledRestrictionsList.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .dayTimeRestrictions(getDayTimeRestrictions())
                .productRestrictions(getProductRestrictions())
                .locationRestrictions(getLocationRestrictions());
        builder.usageRestrictions = internalGetUsageRestrictions();
        return builder;
    }

    /**
     * Class to build instances of {@link BundledRestrictionsList}.
     */
    public static class Builder {
        private OptionalNullable<UsageRestriction> usageRestrictions;
        private DayTimeRestriction dayTimeRestrictions;
        private BundledDetailsProductList productRestrictions;
        private LocationRestriction locationRestrictions;



        /**
         * Setter for usageRestrictions.
         * @param  usageRestrictions  UsageRestriction value for usageRestrictions.
         * @return Builder
         */
        public Builder usageRestrictions(UsageRestriction usageRestrictions) {
            this.usageRestrictions = OptionalNullable.of(usageRestrictions);
            return this;
        }

        /**
         * UnSetter for usageRestrictions.
         * @return Builder
         */
        public Builder unsetUsageRestrictions() {
            usageRestrictions = null;
            return this;
        }

        /**
         * Setter for dayTimeRestrictions.
         * @param  dayTimeRestrictions  DayTimeRestriction value for dayTimeRestrictions.
         * @return Builder
         */
        public Builder dayTimeRestrictions(DayTimeRestriction dayTimeRestrictions) {
            this.dayTimeRestrictions = dayTimeRestrictions;
            return this;
        }

        /**
         * Setter for productRestrictions.
         * @param  productRestrictions  BundledDetailsProductList value for productRestrictions.
         * @return Builder
         */
        public Builder productRestrictions(BundledDetailsProductList productRestrictions) {
            this.productRestrictions = productRestrictions;
            return this;
        }

        /**
         * Setter for locationRestrictions.
         * @param  locationRestrictions  LocationRestriction value for locationRestrictions.
         * @return Builder
         */
        public Builder locationRestrictions(LocationRestriction locationRestrictions) {
            this.locationRestrictions = locationRestrictions;
            return this;
        }

        /**
         * Builds a new {@link BundledRestrictionsList} object using the set fields.
         * @return {@link BundledRestrictionsList}
         */
        public BundledRestrictionsList build() {
            return new BundledRestrictionsList(usageRestrictions, dayTimeRestrictions,
                    productRestrictions, locationRestrictions);
        }
    }
}

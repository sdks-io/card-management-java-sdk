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
 * This is a model class for AccountVelocityLimit type.
 */
public class AccountVelocityLimit {
    private OptionalNullable<String> type;
    private OptionalNullable<String> period;
    private OptionalNullable<Double> limit;
    private OptionalNullable<Double> accumulation;
    private OptionalNullable<Double> balance;
    private OptionalNullable<Boolean> override;
    private OptionalNullable<String> productGroup;
    private OptionalNullable<Double> threshold;

    /**
     * Default constructor.
     */
    public AccountVelocityLimit() {
    }

    /**
     * Initialization constructor.
     * @param  type  String value for type.
     * @param  period  String value for period.
     * @param  limit  Double value for limit.
     * @param  accumulation  Double value for accumulation.
     * @param  balance  Double value for balance.
     * @param  override  Boolean value for override.
     * @param  productGroup  String value for productGroup.
     * @param  threshold  Double value for threshold.
     */
    public AccountVelocityLimit(
            String type,
            String period,
            Double limit,
            Double accumulation,
            Double balance,
            Boolean override,
            String productGroup,
            Double threshold) {
        this.type = OptionalNullable.of(type);
        this.period = OptionalNullable.of(period);
        this.limit = OptionalNullable.of(limit);
        this.accumulation = OptionalNullable.of(accumulation);
        this.balance = OptionalNullable.of(balance);
        this.override = OptionalNullable.of(override);
        this.productGroup = OptionalNullable.of(productGroup);
        this.threshold = OptionalNullable.of(threshold);
    }

    /**
     * Initialization constructor.
     * @param  type  String value for type.
     * @param  period  String value for period.
     * @param  limit  Double value for limit.
     * @param  accumulation  Double value for accumulation.
     * @param  balance  Double value for balance.
     * @param  override  Boolean value for override.
     * @param  productGroup  String value for productGroup.
     * @param  threshold  Double value for threshold.
     */

    protected AccountVelocityLimit(OptionalNullable<String> type, OptionalNullable<String> period,
            OptionalNullable<Double> limit, OptionalNullable<Double> accumulation,
            OptionalNullable<Double> balance, OptionalNullable<Boolean> override,
            OptionalNullable<String> productGroup, OptionalNullable<Double> threshold) {
        this.type = type;
        this.period = period;
        this.limit = limit;
        this.accumulation = accumulation;
        this.balance = balance;
        this.override = override;
        this.productGroup = productGroup;
        this.threshold = threshold;
    }

    /**
     * Internal Getter for Type.
     * Type of velocity (COUNT type is not present for limits of PERTRX period Possible Values:
     * VALUE, VOLUME, COUNT
     * @return Returns the Internal String
     */
    @JsonGetter("Type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetType() {
        return this.type;
    }

    /**
     * Getter for Type.
     * Type of velocity (COUNT type is not present for limits of PERTRX period Possible Values:
     * VALUE, VOLUME, COUNT
     * @return Returns the String
     */
    public String getType() {
        return OptionalNullable.getFrom(type);
    }

    /**
     * Setter for Type.
     * Type of velocity (COUNT type is not present for limits of PERTRX period Possible Values:
     * VALUE, VOLUME, COUNT
     * @param type Value for String
     */
    @JsonSetter("Type")
    public void setType(String type) {
        this.type = OptionalNullable.of(type);
    }

    /**
     * UnSetter for Type.
     * Type of velocity (COUNT type is not present for limits of PERTRX period Possible Values:
     * VALUE, VOLUME, COUNT
     */
    public void unsetType() {
        type = null;
    }

    /**
     * Internal Getter for Period.
     * Duration of the velocity or threshold alert. Possible Values: DAILY, WEEKLY, MONTHLY, ANNUAL,
     * LIFETIME, PERTRX
     * @return Returns the Internal String
     */
    @JsonGetter("Period")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPeriod() {
        return this.period;
    }

    /**
     * Getter for Period.
     * Duration of the velocity or threshold alert. Possible Values: DAILY, WEEKLY, MONTHLY, ANNUAL,
     * LIFETIME, PERTRX
     * @return Returns the String
     */
    public String getPeriod() {
        return OptionalNullable.getFrom(period);
    }

    /**
     * Setter for Period.
     * Duration of the velocity or threshold alert. Possible Values: DAILY, WEEKLY, MONTHLY, ANNUAL,
     * LIFETIME, PERTRX
     * @param period Value for String
     */
    @JsonSetter("Period")
    public void setPeriod(String period) {
        this.period = OptionalNullable.of(period);
    }

    /**
     * UnSetter for Period.
     * Duration of the velocity or threshold alert. Possible Values: DAILY, WEEKLY, MONTHLY, ANNUAL,
     * LIFETIME, PERTRX
     */
    public void unsetPeriod() {
        period = null;
    }

    /**
     * Internal Getter for Limit.
     * The limit associated with this velocity with the correct number of digits after the decimal
     * point according to the minor denomination of the currency of the card issuer (except for
     * COUNT type velocity).
     * @return Returns the Internal Double
     */
    @JsonGetter("Limit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Double> internalGetLimit() {
        return this.limit;
    }

    /**
     * Getter for Limit.
     * The limit associated with this velocity with the correct number of digits after the decimal
     * point according to the minor denomination of the currency of the card issuer (except for
     * COUNT type velocity).
     * @return Returns the Double
     */
    public Double getLimit() {
        return OptionalNullable.getFrom(limit);
    }

    /**
     * Setter for Limit.
     * The limit associated with this velocity with the correct number of digits after the decimal
     * point according to the minor denomination of the currency of the card issuer (except for
     * COUNT type velocity).
     * @param limit Value for Double
     */
    @JsonSetter("Limit")
    public void setLimit(Double limit) {
        this.limit = OptionalNullable.of(limit);
    }

    /**
     * UnSetter for Limit.
     * The limit associated with this velocity with the correct number of digits after the decimal
     * point according to the minor denomination of the currency of the card issuer (except for
     * COUNT type velocity).
     */
    public void unsetLimit() {
        limit = null;
    }

    /**
     * Internal Getter for Accumulation.
     * The transaction accumulation during the current period with the correct number of digits
     * after the decimal point according to the minor denomination of the currency of the card
     * issuer (except for COUNT type velocity). Not present for PERTRX period.
     * @return Returns the Internal Double
     */
    @JsonGetter("Accumulation")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Double> internalGetAccumulation() {
        return this.accumulation;
    }

    /**
     * Getter for Accumulation.
     * The transaction accumulation during the current period with the correct number of digits
     * after the decimal point according to the minor denomination of the currency of the card
     * issuer (except for COUNT type velocity). Not present for PERTRX period.
     * @return Returns the Double
     */
    public Double getAccumulation() {
        return OptionalNullable.getFrom(accumulation);
    }

    /**
     * Setter for Accumulation.
     * The transaction accumulation during the current period with the correct number of digits
     * after the decimal point according to the minor denomination of the currency of the card
     * issuer (except for COUNT type velocity). Not present for PERTRX period.
     * @param accumulation Value for Double
     */
    @JsonSetter("Accumulation")
    public void setAccumulation(Double accumulation) {
        this.accumulation = OptionalNullable.of(accumulation);
    }

    /**
     * UnSetter for Accumulation.
     * The transaction accumulation during the current period with the correct number of digits
     * after the decimal point according to the minor denomination of the currency of the card
     * issuer (except for COUNT type velocity). Not present for PERTRX period.
     */
    public void unsetAccumulation() {
        accumulation = null;
    }

    /**
     * Internal Getter for Balance.
     * The remaining/available balance at this point in time with the correct number of digits after
     * the decimal point according to the minor denomination of the currency of the card issuer
     * (except for COUNT type velocity). Not present for PERTRX period.
     * @return Returns the Internal Double
     */
    @JsonGetter("Balance")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Double> internalGetBalance() {
        return this.balance;
    }

    /**
     * Getter for Balance.
     * The remaining/available balance at this point in time with the correct number of digits after
     * the decimal point according to the minor denomination of the currency of the card issuer
     * (except for COUNT type velocity). Not present for PERTRX period.
     * @return Returns the Double
     */
    public Double getBalance() {
        return OptionalNullable.getFrom(balance);
    }

    /**
     * Setter for Balance.
     * The remaining/available balance at this point in time with the correct number of digits after
     * the decimal point according to the minor denomination of the currency of the card issuer
     * (except for COUNT type velocity). Not present for PERTRX period.
     * @param balance Value for Double
     */
    @JsonSetter("Balance")
    public void setBalance(Double balance) {
        this.balance = OptionalNullable.of(balance);
    }

    /**
     * UnSetter for Balance.
     * The remaining/available balance at this point in time with the correct number of digits after
     * the decimal point according to the minor denomination of the currency of the card issuer
     * (except for COUNT type velocity). Not present for PERTRX period.
     */
    public void unsetBalance() {
        balance = null;
    }

    /**
     * Internal Getter for MOverride.
     * Indicate if the limit is overridden or default. (false for default).
     * @return Returns the Internal Boolean
     */
    @JsonGetter("Override")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetMOverride() {
        return this.override;
    }

    /**
     * Getter for MOverride.
     * Indicate if the limit is overridden or default. (false for default).
     * @return Returns the Boolean
     */
    public Boolean getMOverride() {
        return OptionalNullable.getFrom(override);
    }

    /**
     * Setter for MOverride.
     * Indicate if the limit is overridden or default. (false for default).
     * @param override Value for Boolean
     */
    @JsonSetter("Override")
    public void setMOverride(Boolean override) {
        this.override = OptionalNullable.of(override);
    }

    /**
     * UnSetter for MOverride.
     * Indicate if the limit is overridden or default. (false for default).
     */
    public void unsetMOverride() {
        override = null;
    }

    /**
     * Internal Getter for ProductGroup.
     * The reference group name for product differentiated velocities. This field cannot be used
     * with Volume type velocity. Example: RoadSvc This is an optional output field.
     * @return Returns the Internal String
     */
    @JsonGetter("ProductGroup")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetProductGroup() {
        return this.productGroup;
    }

    /**
     * Getter for ProductGroup.
     * The reference group name for product differentiated velocities. This field cannot be used
     * with Volume type velocity. Example: RoadSvc This is an optional output field.
     * @return Returns the String
     */
    public String getProductGroup() {
        return OptionalNullable.getFrom(productGroup);
    }

    /**
     * Setter for ProductGroup.
     * The reference group name for product differentiated velocities. This field cannot be used
     * with Volume type velocity. Example: RoadSvc This is an optional output field.
     * @param productGroup Value for String
     */
    @JsonSetter("ProductGroup")
    public void setProductGroup(String productGroup) {
        this.productGroup = OptionalNullable.of(productGroup);
    }

    /**
     * UnSetter for ProductGroup.
     * The reference group name for product differentiated velocities. This field cannot be used
     * with Volume type velocity. Example: RoadSvc This is an optional output field.
     */
    public void unsetProductGroup() {
        productGroup = null;
    }

    /**
     * Internal Getter for Threshold.
     * The limit to trigger an alert if the balance after a transaction reaches it or below. 0
     * indicates no alerts will be sent. Not present if not set (issuer value threshold limit
     * applies if available). Not present for COUNT type velocity.
     * @return Returns the Internal Double
     */
    @JsonGetter("Threshold")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Double> internalGetThreshold() {
        return this.threshold;
    }

    /**
     * Getter for Threshold.
     * The limit to trigger an alert if the balance after a transaction reaches it or below. 0
     * indicates no alerts will be sent. Not present if not set (issuer value threshold limit
     * applies if available). Not present for COUNT type velocity.
     * @return Returns the Double
     */
    public Double getThreshold() {
        return OptionalNullable.getFrom(threshold);
    }

    /**
     * Setter for Threshold.
     * The limit to trigger an alert if the balance after a transaction reaches it or below. 0
     * indicates no alerts will be sent. Not present if not set (issuer value threshold limit
     * applies if available). Not present for COUNT type velocity.
     * @param threshold Value for Double
     */
    @JsonSetter("Threshold")
    public void setThreshold(Double threshold) {
        this.threshold = OptionalNullable.of(threshold);
    }

    /**
     * UnSetter for Threshold.
     * The limit to trigger an alert if the balance after a transaction reaches it or below. 0
     * indicates no alerts will be sent. Not present if not set (issuer value threshold limit
     * applies if available). Not present for COUNT type velocity.
     */
    public void unsetThreshold() {
        threshold = null;
    }

    /**
     * Converts this AccountVelocityLimit into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AccountVelocityLimit [" + "type=" + type + ", period=" + period + ", limit=" + limit
                + ", accumulation=" + accumulation + ", balance=" + balance + ", override="
                + override + ", productGroup=" + productGroup + ", threshold=" + threshold + "]";
    }

    /**
     * Builds a new {@link AccountVelocityLimit.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AccountVelocityLimit.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.type = internalGetType();
        builder.period = internalGetPeriod();
        builder.limit = internalGetLimit();
        builder.accumulation = internalGetAccumulation();
        builder.balance = internalGetBalance();
        builder.override = internalGetMOverride();
        builder.productGroup = internalGetProductGroup();
        builder.threshold = internalGetThreshold();
        return builder;
    }

    /**
     * Class to build instances of {@link AccountVelocityLimit}.
     */
    public static class Builder {
        private OptionalNullable<String> type;
        private OptionalNullable<String> period;
        private OptionalNullable<Double> limit;
        private OptionalNullable<Double> accumulation;
        private OptionalNullable<Double> balance;
        private OptionalNullable<Boolean> override;
        private OptionalNullable<String> productGroup;
        private OptionalNullable<Double> threshold;



        /**
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = OptionalNullable.of(type);
            return this;
        }

        /**
         * UnSetter for type.
         * @return Builder
         */
        public Builder unsetType() {
            type = null;
            return this;
        }

        /**
         * Setter for period.
         * @param  period  String value for period.
         * @return Builder
         */
        public Builder period(String period) {
            this.period = OptionalNullable.of(period);
            return this;
        }

        /**
         * UnSetter for period.
         * @return Builder
         */
        public Builder unsetPeriod() {
            period = null;
            return this;
        }

        /**
         * Setter for limit.
         * @param  limit  Double value for limit.
         * @return Builder
         */
        public Builder limit(Double limit) {
            this.limit = OptionalNullable.of(limit);
            return this;
        }

        /**
         * UnSetter for limit.
         * @return Builder
         */
        public Builder unsetLimit() {
            limit = null;
            return this;
        }

        /**
         * Setter for accumulation.
         * @param  accumulation  Double value for accumulation.
         * @return Builder
         */
        public Builder accumulation(Double accumulation) {
            this.accumulation = OptionalNullable.of(accumulation);
            return this;
        }

        /**
         * UnSetter for accumulation.
         * @return Builder
         */
        public Builder unsetAccumulation() {
            accumulation = null;
            return this;
        }

        /**
         * Setter for balance.
         * @param  balance  Double value for balance.
         * @return Builder
         */
        public Builder balance(Double balance) {
            this.balance = OptionalNullable.of(balance);
            return this;
        }

        /**
         * UnSetter for balance.
         * @return Builder
         */
        public Builder unsetBalance() {
            balance = null;
            return this;
        }

        /**
         * Setter for override.
         * @param  override  Boolean value for override.
         * @return Builder
         */
        public Builder override(Boolean override) {
            this.override = OptionalNullable.of(override);
            return this;
        }

        /**
         * UnSetter for override.
         * @return Builder
         */
        public Builder unsetMOverride() {
            override = null;
            return this;
        }

        /**
         * Setter for productGroup.
         * @param  productGroup  String value for productGroup.
         * @return Builder
         */
        public Builder productGroup(String productGroup) {
            this.productGroup = OptionalNullable.of(productGroup);
            return this;
        }

        /**
         * UnSetter for productGroup.
         * @return Builder
         */
        public Builder unsetProductGroup() {
            productGroup = null;
            return this;
        }

        /**
         * Setter for threshold.
         * @param  threshold  Double value for threshold.
         * @return Builder
         */
        public Builder threshold(Double threshold) {
            this.threshold = OptionalNullable.of(threshold);
            return this;
        }

        /**
         * UnSetter for threshold.
         * @return Builder
         */
        public Builder unsetThreshold() {
            threshold = null;
            return this;
        }

        /**
         * Builds a new {@link AccountVelocityLimit} object using the set fields.
         * @return {@link AccountVelocityLimit}
         */
        public AccountVelocityLimit build() {
            return new AccountVelocityLimit(type, period, limit, accumulation, balance, override,
                    productGroup, threshold);
        }
    }
}

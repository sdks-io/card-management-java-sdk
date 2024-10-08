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
 * This is a model class for PINAdviceTypes type.
 */
public class PINAdviceTypes {
    private OptionalNullable<Integer> pINAdviceTypeID;
    private Boolean isCardOrderOption;
    private Boolean isPINReminderOption;

    /**
     * Default constructor.
     */
    public PINAdviceTypes() {
    }

    /**
     * Initialization constructor.
     * @param  pINAdviceTypeID  Integer value for pINAdviceTypeID.
     * @param  isCardOrderOption  Boolean value for isCardOrderOption.
     * @param  isPINReminderOption  Boolean value for isPINReminderOption.
     */
    public PINAdviceTypes(
            Integer pINAdviceTypeID,
            Boolean isCardOrderOption,
            Boolean isPINReminderOption) {
        this.pINAdviceTypeID = OptionalNullable.of(pINAdviceTypeID);
        this.isCardOrderOption = isCardOrderOption;
        this.isPINReminderOption = isPINReminderOption;
    }

    /**
     * Initialization constructor.
     * @param  pINAdviceTypeID  Integer value for pINAdviceTypeID.
     * @param  isCardOrderOption  Boolean value for isCardOrderOption.
     * @param  isPINReminderOption  Boolean value for isPINReminderOption.
     */

    protected PINAdviceTypes(OptionalNullable<Integer> pINAdviceTypeID, Boolean isCardOrderOption,
            Boolean isPINReminderOption) {
        this.pINAdviceTypeID = pINAdviceTypeID;
        this.isCardOrderOption = isCardOrderOption;
        this.isPINReminderOption = isPINReminderOption;
    }

    /**
     * Internal Getter for PINAdviceTypeID.
     * Id of of PIN advice type. Possible Values: 1. Paper 2. Email 3. SMS 4. None
     * @return Returns the Internal Integer
     */
    @JsonGetter("PINAdviceTypeID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetPINAdviceTypeID() {
        return this.pINAdviceTypeID;
    }

    /**
     * Getter for PINAdviceTypeID.
     * Id of of PIN advice type. Possible Values: 1. Paper 2. Email 3. SMS 4. None
     * @return Returns the Integer
     */
    public Integer getPINAdviceTypeID() {
        return OptionalNullable.getFrom(pINAdviceTypeID);
    }

    /**
     * Setter for PINAdviceTypeID.
     * Id of of PIN advice type. Possible Values: 1. Paper 2. Email 3. SMS 4. None
     * @param pINAdviceTypeID Value for Integer
     */
    @JsonSetter("PINAdviceTypeID")
    public void setPINAdviceTypeID(Integer pINAdviceTypeID) {
        this.pINAdviceTypeID = OptionalNullable.of(pINAdviceTypeID);
    }

    /**
     * UnSetter for PINAdviceTypeID.
     * Id of of PIN advice type. Possible Values: 1. Paper 2. Email 3. SMS 4. None
     */
    public void unsetPINAdviceTypeID() {
        pINAdviceTypeID = null;
    }

    /**
     * Getter for IsCardOrderOption.
     * Whether the PIN advice type is available for card ordering
     * @return Returns the Boolean
     */
    @JsonGetter("IsCardOrderOption")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsCardOrderOption() {
        return isCardOrderOption;
    }

    /**
     * Setter for IsCardOrderOption.
     * Whether the PIN advice type is available for card ordering
     * @param isCardOrderOption Value for Boolean
     */
    @JsonSetter("IsCardOrderOption")
    public void setIsCardOrderOption(Boolean isCardOrderOption) {
        this.isCardOrderOption = isCardOrderOption;
    }

    /**
     * Getter for IsPINReminderOption.
     * Whether the PIN advice type is available for PIN Reminder
     * @return Returns the Boolean
     */
    @JsonGetter("IsPINReminderOption")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsPINReminderOption() {
        return isPINReminderOption;
    }

    /**
     * Setter for IsPINReminderOption.
     * Whether the PIN advice type is available for PIN Reminder
     * @param isPINReminderOption Value for Boolean
     */
    @JsonSetter("IsPINReminderOption")
    public void setIsPINReminderOption(Boolean isPINReminderOption) {
        this.isPINReminderOption = isPINReminderOption;
    }

    /**
     * Converts this PINAdviceTypes into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PINAdviceTypes [" + "pINAdviceTypeID=" + pINAdviceTypeID + ", isCardOrderOption="
                + isCardOrderOption + ", isPINReminderOption=" + isPINReminderOption + "]";
    }

    /**
     * Builds a new {@link PINAdviceTypes.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PINAdviceTypes.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .isCardOrderOption(getIsCardOrderOption())
                .isPINReminderOption(getIsPINReminderOption());
        builder.pINAdviceTypeID = internalGetPINAdviceTypeID();
        return builder;
    }

    /**
     * Class to build instances of {@link PINAdviceTypes}.
     */
    public static class Builder {
        private OptionalNullable<Integer> pINAdviceTypeID;
        private Boolean isCardOrderOption;
        private Boolean isPINReminderOption;



        /**
         * Setter for pINAdviceTypeID.
         * @param  pINAdviceTypeID  Integer value for pINAdviceTypeID.
         * @return Builder
         */
        public Builder pINAdviceTypeID(Integer pINAdviceTypeID) {
            this.pINAdviceTypeID = OptionalNullable.of(pINAdviceTypeID);
            return this;
        }

        /**
         * UnSetter for pINAdviceTypeID.
         * @return Builder
         */
        public Builder unsetPINAdviceTypeID() {
            pINAdviceTypeID = null;
            return this;
        }

        /**
         * Setter for isCardOrderOption.
         * @param  isCardOrderOption  Boolean value for isCardOrderOption.
         * @return Builder
         */
        public Builder isCardOrderOption(Boolean isCardOrderOption) {
            this.isCardOrderOption = isCardOrderOption;
            return this;
        }

        /**
         * Setter for isPINReminderOption.
         * @param  isPINReminderOption  Boolean value for isPINReminderOption.
         * @return Builder
         */
        public Builder isPINReminderOption(Boolean isPINReminderOption) {
            this.isPINReminderOption = isPINReminderOption;
            return this;
        }

        /**
         * Builds a new {@link PINAdviceTypes} object using the set fields.
         * @return {@link PINAdviceTypes}
         */
        public PINAdviceTypes build() {
            return new PINAdviceTypes(pINAdviceTypeID, isCardOrderOption, isPINReminderOption);
        }
    }
}

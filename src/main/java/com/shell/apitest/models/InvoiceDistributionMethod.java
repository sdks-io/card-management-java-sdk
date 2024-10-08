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
 * This is a model class for InvoiceDistributionMethod type.
 */
public class InvoiceDistributionMethod {
    private Boolean isPrimary;
    private OptionalNullable<String> frequencyType;
    private OptionalNullable<String> distributionMethod;
    private OptionalNullable<String> outputType;

    /**
     * Default constructor.
     */
    public InvoiceDistributionMethod() {
        isPrimary = true;
    }

    /**
     * Initialization constructor.
     * @param  isPrimary  Boolean value for isPrimary.
     * @param  frequencyType  String value for frequencyType.
     * @param  distributionMethod  String value for distributionMethod.
     * @param  outputType  String value for outputType.
     */
    public InvoiceDistributionMethod(
            Boolean isPrimary,
            String frequencyType,
            String distributionMethod,
            String outputType) {
        this.isPrimary = isPrimary;
        this.frequencyType = OptionalNullable.of(frequencyType);
        this.distributionMethod = OptionalNullable.of(distributionMethod);
        this.outputType = OptionalNullable.of(outputType);
    }

    /**
     * Initialization constructor.
     * @param  isPrimary  Boolean value for isPrimary.
     * @param  frequencyType  String value for frequencyType.
     * @param  distributionMethod  String value for distributionMethod.
     * @param  outputType  String value for outputType.
     */

    protected InvoiceDistributionMethod(Boolean isPrimary, OptionalNullable<String> frequencyType,
            OptionalNullable<String> distributionMethod, OptionalNullable<String> outputType) {
        this.isPrimary = isPrimary;
        this.frequencyType = frequencyType;
        this.distributionMethod = distributionMethod;
        this.outputType = outputType;
    }

    /**
     * Getter for IsPrimary.
     * If True then this distribution method is the default distribution method.
     * @return Returns the Boolean
     */
    @JsonGetter("IsPrimary")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsPrimary() {
        return isPrimary;
    }

    /**
     * Setter for IsPrimary.
     * If True then this distribution method is the default distribution method.
     * @param isPrimary Value for Boolean
     */
    @JsonSetter("IsPrimary")
    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    /**
     * Internal Getter for FrequencyType.
     * Frequency type unit Id &amp; description E.g.: 1- Daily 2-Weekly 3-Monthly 4-Invoicing 6-Calendar
     * quarter
     * @return Returns the Internal String
     */
    @JsonGetter("FrequencyType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetFrequencyType() {
        return this.frequencyType;
    }

    /**
     * Getter for FrequencyType.
     * Frequency type unit Id &amp; description E.g.: 1- Daily 2-Weekly 3-Monthly 4-Invoicing 6-Calendar
     * quarter
     * @return Returns the String
     */
    public String getFrequencyType() {
        return OptionalNullable.getFrom(frequencyType);
    }

    /**
     * Setter for FrequencyType.
     * Frequency type unit Id &amp; description E.g.: 1- Daily 2-Weekly 3-Monthly 4-Invoicing 6-Calendar
     * quarter
     * @param frequencyType Value for String
     */
    @JsonSetter("FrequencyType")
    public void setFrequencyType(String frequencyType) {
        this.frequencyType = OptionalNullable.of(frequencyType);
    }

    /**
     * UnSetter for FrequencyType.
     * Frequency type unit Id &amp; description E.g.: 1- Daily 2-Weekly 3-Monthly 4-Invoicing 6-Calendar
     * quarter
     */
    public void unsetFrequencyType() {
        frequencyType = null;
    }

    /**
     * Internal Getter for DistributionMethod.
     * Invoice Distribution Method (Id-Description) E.g.: 1-e-mail 2-Fax 3-Courier to Customer
     * 4-Courier to Client 5-Print 6-FTP 7-SMS
     * @return Returns the Internal String
     */
    @JsonGetter("DistributionMethod")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDistributionMethod() {
        return this.distributionMethod;
    }

    /**
     * Getter for DistributionMethod.
     * Invoice Distribution Method (Id-Description) E.g.: 1-e-mail 2-Fax 3-Courier to Customer
     * 4-Courier to Client 5-Print 6-FTP 7-SMS
     * @return Returns the String
     */
    public String getDistributionMethod() {
        return OptionalNullable.getFrom(distributionMethod);
    }

    /**
     * Setter for DistributionMethod.
     * Invoice Distribution Method (Id-Description) E.g.: 1-e-mail 2-Fax 3-Courier to Customer
     * 4-Courier to Client 5-Print 6-FTP 7-SMS
     * @param distributionMethod Value for String
     */
    @JsonSetter("DistributionMethod")
    public void setDistributionMethod(String distributionMethod) {
        this.distributionMethod = OptionalNullable.of(distributionMethod);
    }

    /**
     * UnSetter for DistributionMethod.
     * Invoice Distribution Method (Id-Description) E.g.: 1-e-mail 2-Fax 3-Courier to Customer
     * 4-Courier to Client 5-Print 6-FTP 7-SMS
     */
    public void unsetDistributionMethod() {
        distributionMethod = null;
    }

    /**
     * Internal Getter for OutputType.
     * Invoice output type (Id - Description)
     * @return Returns the Internal String
     */
    @JsonGetter("OutputType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetOutputType() {
        return this.outputType;
    }

    /**
     * Getter for OutputType.
     * Invoice output type (Id - Description)
     * @return Returns the String
     */
    public String getOutputType() {
        return OptionalNullable.getFrom(outputType);
    }

    /**
     * Setter for OutputType.
     * Invoice output type (Id - Description)
     * @param outputType Value for String
     */
    @JsonSetter("OutputType")
    public void setOutputType(String outputType) {
        this.outputType = OptionalNullable.of(outputType);
    }

    /**
     * UnSetter for OutputType.
     * Invoice output type (Id - Description)
     */
    public void unsetOutputType() {
        outputType = null;
    }

    /**
     * Converts this InvoiceDistributionMethod into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InvoiceDistributionMethod [" + "isPrimary=" + isPrimary + ", frequencyType="
                + frequencyType + ", distributionMethod=" + distributionMethod + ", outputType="
                + outputType + "]";
    }

    /**
     * Builds a new {@link InvoiceDistributionMethod.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InvoiceDistributionMethod.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .isPrimary(getIsPrimary());
        builder.frequencyType = internalGetFrequencyType();
        builder.distributionMethod = internalGetDistributionMethod();
        builder.outputType = internalGetOutputType();
        return builder;
    }

    /**
     * Class to build instances of {@link InvoiceDistributionMethod}.
     */
    public static class Builder {
        private Boolean isPrimary = true;
        private OptionalNullable<String> frequencyType;
        private OptionalNullable<String> distributionMethod;
        private OptionalNullable<String> outputType;



        /**
         * Setter for isPrimary.
         * @param  isPrimary  Boolean value for isPrimary.
         * @return Builder
         */
        public Builder isPrimary(Boolean isPrimary) {
            this.isPrimary = isPrimary;
            return this;
        }

        /**
         * Setter for frequencyType.
         * @param  frequencyType  String value for frequencyType.
         * @return Builder
         */
        public Builder frequencyType(String frequencyType) {
            this.frequencyType = OptionalNullable.of(frequencyType);
            return this;
        }

        /**
         * UnSetter for frequencyType.
         * @return Builder
         */
        public Builder unsetFrequencyType() {
            frequencyType = null;
            return this;
        }

        /**
         * Setter for distributionMethod.
         * @param  distributionMethod  String value for distributionMethod.
         * @return Builder
         */
        public Builder distributionMethod(String distributionMethod) {
            this.distributionMethod = OptionalNullable.of(distributionMethod);
            return this;
        }

        /**
         * UnSetter for distributionMethod.
         * @return Builder
         */
        public Builder unsetDistributionMethod() {
            distributionMethod = null;
            return this;
        }

        /**
         * Setter for outputType.
         * @param  outputType  String value for outputType.
         * @return Builder
         */
        public Builder outputType(String outputType) {
            this.outputType = OptionalNullable.of(outputType);
            return this;
        }

        /**
         * UnSetter for outputType.
         * @return Builder
         */
        public Builder unsetOutputType() {
            outputType = null;
            return this;
        }

        /**
         * Builds a new {@link InvoiceDistributionMethod} object using the set fields.
         * @return {@link InvoiceDistributionMethod}
         */
        public InvoiceDistributionMethod build() {
            return new InvoiceDistributionMethod(isPrimary, frequencyType, distributionMethod,
                    outputType);
        }
    }
}

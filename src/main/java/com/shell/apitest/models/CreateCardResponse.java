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
 * This is a model class for CreateCardResponse type.
 */
public class CreateCardResponse {
    private OptionalNullable<String> driverAndVRN;
    private OptionalNullable<Integer> orderCardReference;

    /**
     * Default constructor.
     */
    public CreateCardResponse() {
    }

    /**
     * Initialization constructor.
     * @param  driverAndVRN  String value for driverAndVRN.
     * @param  orderCardReference  Integer value for orderCardReference.
     */
    public CreateCardResponse(
            String driverAndVRN,
            Integer orderCardReference) {
        this.driverAndVRN = OptionalNullable.of(driverAndVRN);
        this.orderCardReference = OptionalNullable.of(orderCardReference);
    }

    /**
     * Initialization constructor.
     * @param  driverAndVRN  String value for driverAndVRN.
     * @param  orderCardReference  Integer value for orderCardReference.
     */

    protected CreateCardResponse(OptionalNullable<String> driverAndVRN,
            OptionalNullable<Integer> orderCardReference) {
        this.driverAndVRN = driverAndVRN;
        this.orderCardReference = orderCardReference;
    }

    /**
     * Internal Getter for DriverAndVRN.
     * Driver and VRN of the card. ;( semicolon) is used as delimiter
     * @return Returns the Internal String
     */
    @JsonGetter("DriverAndVRN")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDriverAndVRN() {
        return this.driverAndVRN;
    }

    /**
     * Getter for DriverAndVRN.
     * Driver and VRN of the card. ;( semicolon) is used as delimiter
     * @return Returns the String
     */
    public String getDriverAndVRN() {
        return OptionalNullable.getFrom(driverAndVRN);
    }

    /**
     * Setter for DriverAndVRN.
     * Driver and VRN of the card. ;( semicolon) is used as delimiter
     * @param driverAndVRN Value for String
     */
    @JsonSetter("DriverAndVRN")
    public void setDriverAndVRN(String driverAndVRN) {
        this.driverAndVRN = OptionalNullable.of(driverAndVRN);
    }

    /**
     * UnSetter for DriverAndVRN.
     * Driver and VRN of the card. ;( semicolon) is used as delimiter
     */
    public void unsetDriverAndVRN() {
        driverAndVRN = null;
    }

    /**
     * Internal Getter for OrderCardReference.
     * Reference number for each individual card in the order
     * @return Returns the Internal Integer
     */
    @JsonGetter("OrderCardReference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetOrderCardReference() {
        return this.orderCardReference;
    }

    /**
     * Getter for OrderCardReference.
     * Reference number for each individual card in the order
     * @return Returns the Integer
     */
    public Integer getOrderCardReference() {
        return OptionalNullable.getFrom(orderCardReference);
    }

    /**
     * Setter for OrderCardReference.
     * Reference number for each individual card in the order
     * @param orderCardReference Value for Integer
     */
    @JsonSetter("OrderCardReference")
    public void setOrderCardReference(Integer orderCardReference) {
        this.orderCardReference = OptionalNullable.of(orderCardReference);
    }

    /**
     * UnSetter for OrderCardReference.
     * Reference number for each individual card in the order
     */
    public void unsetOrderCardReference() {
        orderCardReference = null;
    }

    /**
     * Converts this CreateCardResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateCardResponse [" + "driverAndVRN=" + driverAndVRN + ", orderCardReference="
                + orderCardReference + "]";
    }

    /**
     * Builds a new {@link CreateCardResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateCardResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.driverAndVRN = internalGetDriverAndVRN();
        builder.orderCardReference = internalGetOrderCardReference();
        return builder;
    }

    /**
     * Class to build instances of {@link CreateCardResponse}.
     */
    public static class Builder {
        private OptionalNullable<String> driverAndVRN;
        private OptionalNullable<Integer> orderCardReference;



        /**
         * Setter for driverAndVRN.
         * @param  driverAndVRN  String value for driverAndVRN.
         * @return Builder
         */
        public Builder driverAndVRN(String driverAndVRN) {
            this.driverAndVRN = OptionalNullable.of(driverAndVRN);
            return this;
        }

        /**
         * UnSetter for driverAndVRN.
         * @return Builder
         */
        public Builder unsetDriverAndVRN() {
            driverAndVRN = null;
            return this;
        }

        /**
         * Setter for orderCardReference.
         * @param  orderCardReference  Integer value for orderCardReference.
         * @return Builder
         */
        public Builder orderCardReference(Integer orderCardReference) {
            this.orderCardReference = OptionalNullable.of(orderCardReference);
            return this;
        }

        /**
         * UnSetter for orderCardReference.
         * @return Builder
         */
        public Builder unsetOrderCardReference() {
            orderCardReference = null;
            return this;
        }

        /**
         * Builds a new {@link CreateCardResponse} object using the set fields.
         * @return {@link CreateCardResponse}
         */
        public CreateCardResponse build() {
            return new CreateCardResponse(driverAndVRN, orderCardReference);
        }
    }
}

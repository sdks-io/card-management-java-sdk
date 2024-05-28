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
 * This is a model class for Payers type.
 */
public class Payers {
    private OptionalNullable<Integer> colCoId;
    private OptionalNullable<Integer> colCoCode;
    private OptionalNullable<Integer> payerId;
    private OptionalNullable<String> payerNumber;
    private OptionalNullable<String> payerName;
    private OptionalNullable<Integer> payerGroupId;

    /**
     * Default constructor.
     */
    public Payers() {
    }

    /**
     * Initialization constructor.
     * @param  colCoId  Integer value for colCoId.
     * @param  colCoCode  Integer value for colCoCode.
     * @param  payerId  Integer value for payerId.
     * @param  payerNumber  String value for payerNumber.
     * @param  payerName  String value for payerName.
     * @param  payerGroupId  Integer value for payerGroupId.
     */
    public Payers(
            Integer colCoId,
            Integer colCoCode,
            Integer payerId,
            String payerNumber,
            String payerName,
            Integer payerGroupId) {
        this.colCoId = OptionalNullable.of(colCoId);
        this.colCoCode = OptionalNullable.of(colCoCode);
        this.payerId = OptionalNullable.of(payerId);
        this.payerNumber = OptionalNullable.of(payerNumber);
        this.payerName = OptionalNullable.of(payerName);
        this.payerGroupId = OptionalNullable.of(payerGroupId);
    }

    /**
     * Initialization constructor.
     * @param  colCoId  Integer value for colCoId.
     * @param  colCoCode  Integer value for colCoCode.
     * @param  payerId  Integer value for payerId.
     * @param  payerNumber  String value for payerNumber.
     * @param  payerName  String value for payerName.
     * @param  payerGroupId  Integer value for payerGroupId.
     */

    protected Payers(OptionalNullable<Integer> colCoId, OptionalNullable<Integer> colCoCode,
            OptionalNullable<Integer> payerId, OptionalNullable<String> payerNumber,
            OptionalNullable<String> payerName, OptionalNullable<Integer> payerGroupId) {
        this.colCoId = colCoId;
        this.colCoCode = colCoCode;
        this.payerId = payerId;
        this.payerNumber = payerNumber;
        this.payerName = payerName;
        this.payerGroupId = payerGroupId;
    }

    /**
     * Internal Getter for ColCoId.
     * Collecting Company Id of the payer
     * @return Returns the Internal Integer
     */
    @JsonGetter("ColCoId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetColCoId() {
        return this.colCoId;
    }

    /**
     * Getter for ColCoId.
     * Collecting Company Id of the payer
     * @return Returns the Integer
     */
    public Integer getColCoId() {
        return OptionalNullable.getFrom(colCoId);
    }

    /**
     * Setter for ColCoId.
     * Collecting Company Id of the payer
     * @param colCoId Value for Integer
     */
    @JsonSetter("ColCoId")
    public void setColCoId(Integer colCoId) {
        this.colCoId = OptionalNullable.of(colCoId);
    }

    /**
     * UnSetter for ColCoId.
     * Collecting Company Id of the payer
     */
    public void unsetColCoId() {
        colCoId = null;
    }

    /**
     * Internal Getter for ColCoCode.
     * Collecting Company Code (Shell Code) of the selected payer. Mandatory for serviced OUs such
     * as Romania, Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if
     * ColCoID is provided.
     * @return Returns the Internal Integer
     */
    @JsonGetter("ColCoCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetColCoCode() {
        return this.colCoCode;
    }

    /**
     * Getter for ColCoCode.
     * Collecting Company Code (Shell Code) of the selected payer. Mandatory for serviced OUs such
     * as Romania, Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if
     * ColCoID is provided.
     * @return Returns the Integer
     */
    public Integer getColCoCode() {
        return OptionalNullable.getFrom(colCoCode);
    }

    /**
     * Setter for ColCoCode.
     * Collecting Company Code (Shell Code) of the selected payer. Mandatory for serviced OUs such
     * as Romania, Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if
     * ColCoID is provided.
     * @param colCoCode Value for Integer
     */
    @JsonSetter("ColCoCode")
    public void setColCoCode(Integer colCoCode) {
        this.colCoCode = OptionalNullable.of(colCoCode);
    }

    /**
     * UnSetter for ColCoCode.
     * Collecting Company Code (Shell Code) of the selected payer. Mandatory for serviced OUs such
     * as Romania, Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if
     * ColCoID is provided.
     */
    public void unsetColCoCode() {
        colCoCode = null;
    }

    /**
     * Internal Getter for PayerId.
     * Payer id of the customer.
     * @return Returns the Internal Integer
     */
    @JsonGetter("PayerId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetPayerId() {
        return this.payerId;
    }

    /**
     * Getter for PayerId.
     * Payer id of the customer.
     * @return Returns the Integer
     */
    public Integer getPayerId() {
        return OptionalNullable.getFrom(payerId);
    }

    /**
     * Setter for PayerId.
     * Payer id of the customer.
     * @param payerId Value for Integer
     */
    @JsonSetter("PayerId")
    public void setPayerId(Integer payerId) {
        this.payerId = OptionalNullable.of(payerId);
    }

    /**
     * UnSetter for PayerId.
     * Payer id of the customer.
     */
    public void unsetPayerId() {
        payerId = null;
    }

    /**
     * Internal Getter for PayerNumber.
     * Payer Number of the customer.
     * @return Returns the Internal String
     */
    @JsonGetter("PayerNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPayerNumber() {
        return this.payerNumber;
    }

    /**
     * Getter for PayerNumber.
     * Payer Number of the customer.
     * @return Returns the String
     */
    public String getPayerNumber() {
        return OptionalNullable.getFrom(payerNumber);
    }

    /**
     * Setter for PayerNumber.
     * Payer Number of the customer.
     * @param payerNumber Value for String
     */
    @JsonSetter("PayerNumber")
    public void setPayerNumber(String payerNumber) {
        this.payerNumber = OptionalNullable.of(payerNumber);
    }

    /**
     * UnSetter for PayerNumber.
     * Payer Number of the customer.
     */
    public void unsetPayerNumber() {
        payerNumber = null;
    }

    /**
     * Internal Getter for PayerName.
     * Payer Name of the customer.
     * @return Returns the Internal String
     */
    @JsonGetter("PayerName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPayerName() {
        return this.payerName;
    }

    /**
     * Getter for PayerName.
     * Payer Name of the customer.
     * @return Returns the String
     */
    public String getPayerName() {
        return OptionalNullable.getFrom(payerName);
    }

    /**
     * Setter for PayerName.
     * Payer Name of the customer.
     * @param payerName Value for String
     */
    @JsonSetter("PayerName")
    public void setPayerName(String payerName) {
        this.payerName = OptionalNullable.of(payerName);
    }

    /**
     * UnSetter for PayerName.
     * Payer Name of the customer.
     */
    public void unsetPayerName() {
        payerName = null;
    }

    /**
     * Internal Getter for PayerGroupId.
     * Payer Group identifier of the customer
     * @return Returns the Internal Integer
     */
    @JsonGetter("PayerGroupId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetPayerGroupId() {
        return this.payerGroupId;
    }

    /**
     * Getter for PayerGroupId.
     * Payer Group identifier of the customer
     * @return Returns the Integer
     */
    public Integer getPayerGroupId() {
        return OptionalNullable.getFrom(payerGroupId);
    }

    /**
     * Setter for PayerGroupId.
     * Payer Group identifier of the customer
     * @param payerGroupId Value for Integer
     */
    @JsonSetter("PayerGroupId")
    public void setPayerGroupId(Integer payerGroupId) {
        this.payerGroupId = OptionalNullable.of(payerGroupId);
    }

    /**
     * UnSetter for PayerGroupId.
     * Payer Group identifier of the customer
     */
    public void unsetPayerGroupId() {
        payerGroupId = null;
    }

    /**
     * Converts this Payers into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Payers [" + "colCoId=" + colCoId + ", colCoCode=" + colCoCode + ", payerId="
                + payerId + ", payerNumber=" + payerNumber + ", payerName=" + payerName
                + ", payerGroupId=" + payerGroupId + "]";
    }

    /**
     * Builds a new {@link Payers.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Payers.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.colCoId = internalGetColCoId();
        builder.colCoCode = internalGetColCoCode();
        builder.payerId = internalGetPayerId();
        builder.payerNumber = internalGetPayerNumber();
        builder.payerName = internalGetPayerName();
        builder.payerGroupId = internalGetPayerGroupId();
        return builder;
    }

    /**
     * Class to build instances of {@link Payers}.
     */
    public static class Builder {
        private OptionalNullable<Integer> colCoId;
        private OptionalNullable<Integer> colCoCode;
        private OptionalNullable<Integer> payerId;
        private OptionalNullable<String> payerNumber;
        private OptionalNullable<String> payerName;
        private OptionalNullable<Integer> payerGroupId;



        /**
         * Setter for colCoId.
         * @param  colCoId  Integer value for colCoId.
         * @return Builder
         */
        public Builder colCoId(Integer colCoId) {
            this.colCoId = OptionalNullable.of(colCoId);
            return this;
        }

        /**
         * UnSetter for colCoId.
         * @return Builder
         */
        public Builder unsetColCoId() {
            colCoId = null;
            return this;
        }

        /**
         * Setter for colCoCode.
         * @param  colCoCode  Integer value for colCoCode.
         * @return Builder
         */
        public Builder colCoCode(Integer colCoCode) {
            this.colCoCode = OptionalNullable.of(colCoCode);
            return this;
        }

        /**
         * UnSetter for colCoCode.
         * @return Builder
         */
        public Builder unsetColCoCode() {
            colCoCode = null;
            return this;
        }

        /**
         * Setter for payerId.
         * @param  payerId  Integer value for payerId.
         * @return Builder
         */
        public Builder payerId(Integer payerId) {
            this.payerId = OptionalNullable.of(payerId);
            return this;
        }

        /**
         * UnSetter for payerId.
         * @return Builder
         */
        public Builder unsetPayerId() {
            payerId = null;
            return this;
        }

        /**
         * Setter for payerNumber.
         * @param  payerNumber  String value for payerNumber.
         * @return Builder
         */
        public Builder payerNumber(String payerNumber) {
            this.payerNumber = OptionalNullable.of(payerNumber);
            return this;
        }

        /**
         * UnSetter for payerNumber.
         * @return Builder
         */
        public Builder unsetPayerNumber() {
            payerNumber = null;
            return this;
        }

        /**
         * Setter for payerName.
         * @param  payerName  String value for payerName.
         * @return Builder
         */
        public Builder payerName(String payerName) {
            this.payerName = OptionalNullable.of(payerName);
            return this;
        }

        /**
         * UnSetter for payerName.
         * @return Builder
         */
        public Builder unsetPayerName() {
            payerName = null;
            return this;
        }

        /**
         * Setter for payerGroupId.
         * @param  payerGroupId  Integer value for payerGroupId.
         * @return Builder
         */
        public Builder payerGroupId(Integer payerGroupId) {
            this.payerGroupId = OptionalNullable.of(payerGroupId);
            return this;
        }

        /**
         * UnSetter for payerGroupId.
         * @return Builder
         */
        public Builder unsetPayerGroupId() {
            payerGroupId = null;
            return this;
        }

        /**
         * Builds a new {@link Payers} object using the set fields.
         * @return {@link Payers}
         */
        public Payers build() {
            return new Payers(colCoId, colCoCode, payerId, payerNumber, payerName, payerGroupId);
        }
    }
}

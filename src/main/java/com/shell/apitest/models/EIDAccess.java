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
 * This is a model class for EIDAccess type.
 */
public class EIDAccess {
    private OptionalNullable<String> colCoId;
    private OptionalNullable<Integer> colCoCode;
    private OptionalNullable<String> accountGroupId;

    /**
     * Default constructor.
     */
    public EIDAccess() {
    }

    /**
     * Initialization constructor.
     * @param  colCoId  String value for colCoId.
     * @param  colCoCode  Integer value for colCoCode.
     * @param  accountGroupId  String value for accountGroupId.
     */
    public EIDAccess(
            String colCoId,
            Integer colCoCode,
            String accountGroupId) {
        this.colCoId = OptionalNullable.of(colCoId);
        this.colCoCode = OptionalNullable.of(colCoCode);
        this.accountGroupId = OptionalNullable.of(accountGroupId);
    }

    /**
     * Initialization constructor.
     * @param  colCoId  String value for colCoId.
     * @param  colCoCode  Integer value for colCoCode.
     * @param  accountGroupId  String value for accountGroupId.
     */

    protected EIDAccess(OptionalNullable<String> colCoId, OptionalNullable<Integer> colCoCode,
            OptionalNullable<String> accountGroupId) {
        this.colCoId = colCoId;
        this.colCoCode = colCoCode;
        this.accountGroupId = accountGroupId;
    }

    /**
     * Internal Getter for ColCoId.
     * Collecting company id.
     * @return Returns the Internal String
     */
    @JsonGetter("ColCoId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetColCoId() {
        return this.colCoId;
    }

    /**
     * Getter for ColCoId.
     * Collecting company id.
     * @return Returns the String
     */
    public String getColCoId() {
        return OptionalNullable.getFrom(colCoId);
    }

    /**
     * Setter for ColCoId.
     * Collecting company id.
     * @param colCoId Value for String
     */
    @JsonSetter("ColCoId")
    public void setColCoId(String colCoId) {
        this.colCoId = OptionalNullable.of(colCoId);
    }

    /**
     * UnSetter for ColCoId.
     * Collecting company id.
     */
    public void unsetColCoId() {
        colCoId = null;
    }

    /**
     * Internal Getter for ColCoCode.
     * Collecting company Code
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
     * Collecting company Code
     * @return Returns the Integer
     */
    public Integer getColCoCode() {
        return OptionalNullable.getFrom(colCoCode);
    }

    /**
     * Setter for ColCoCode.
     * Collecting company Code
     * @param colCoCode Value for Integer
     */
    @JsonSetter("ColCoCode")
    public void setColCoCode(Integer colCoCode) {
        this.colCoCode = OptionalNullable.of(colCoCode);
    }

    /**
     * UnSetter for ColCoCode.
     * Collecting company Code
     */
    public void unsetColCoCode() {
        colCoCode = null;
    }

    /**
     * Internal Getter for AccountGroupId.
     * Identifier for the EID account group configured for the user.
     * @return Returns the Internal String
     */
    @JsonGetter("AccountGroupId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetAccountGroupId() {
        return this.accountGroupId;
    }

    /**
     * Getter for AccountGroupId.
     * Identifier for the EID account group configured for the user.
     * @return Returns the String
     */
    public String getAccountGroupId() {
        return OptionalNullable.getFrom(accountGroupId);
    }

    /**
     * Setter for AccountGroupId.
     * Identifier for the EID account group configured for the user.
     * @param accountGroupId Value for String
     */
    @JsonSetter("AccountGroupId")
    public void setAccountGroupId(String accountGroupId) {
        this.accountGroupId = OptionalNullable.of(accountGroupId);
    }

    /**
     * UnSetter for AccountGroupId.
     * Identifier for the EID account group configured for the user.
     */
    public void unsetAccountGroupId() {
        accountGroupId = null;
    }

    /**
     * Converts this EIDAccess into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "EIDAccess [" + "colCoId=" + colCoId + ", colCoCode=" + colCoCode
                + ", accountGroupId=" + accountGroupId + "]";
    }

    /**
     * Builds a new {@link EIDAccess.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link EIDAccess.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.colCoId = internalGetColCoId();
        builder.colCoCode = internalGetColCoCode();
        builder.accountGroupId = internalGetAccountGroupId();
        return builder;
    }

    /**
     * Class to build instances of {@link EIDAccess}.
     */
    public static class Builder {
        private OptionalNullable<String> colCoId;
        private OptionalNullable<Integer> colCoCode;
        private OptionalNullable<String> accountGroupId;



        /**
         * Setter for colCoId.
         * @param  colCoId  String value for colCoId.
         * @return Builder
         */
        public Builder colCoId(String colCoId) {
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
         * Setter for accountGroupId.
         * @param  accountGroupId  String value for accountGroupId.
         * @return Builder
         */
        public Builder accountGroupId(String accountGroupId) {
            this.accountGroupId = OptionalNullable.of(accountGroupId);
            return this;
        }

        /**
         * UnSetter for accountGroupId.
         * @return Builder
         */
        public Builder unsetAccountGroupId() {
            accountGroupId = null;
            return this;
        }

        /**
         * Builds a new {@link EIDAccess} object using the set fields.
         * @return {@link EIDAccess}
         */
        public EIDAccess build() {
            return new EIDAccess(colCoId, colCoCode, accountGroupId);
        }
    }
}

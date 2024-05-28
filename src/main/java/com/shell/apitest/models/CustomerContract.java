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
 * This is a model class for CustomerContract type.
 */
public class CustomerContract {
    private OptionalNullable<String> partnerId;
    private OptionalNullable<String> partnerName;

    /**
     * Default constructor.
     */
    public CustomerContract() {
    }

    /**
     * Initialization constructor.
     * @param  partnerId  String value for partnerId.
     * @param  partnerName  String value for partnerName.
     */
    public CustomerContract(
            String partnerId,
            String partnerName) {
        this.partnerId = OptionalNullable.of(partnerId);
        this.partnerName = OptionalNullable.of(partnerName);
    }

    /**
     * Initialization constructor.
     * @param  partnerId  String value for partnerId.
     * @param  partnerName  String value for partnerName.
     */

    protected CustomerContract(OptionalNullable<String> partnerId,
            OptionalNullable<String> partnerName) {
        this.partnerId = partnerId;
        this.partnerName = partnerName;
    }

    /**
     * Internal Getter for PartnerId.
     * Partner Id in e-TM system
     * @return Returns the Internal String
     */
    @JsonGetter("PartnerId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPartnerId() {
        return this.partnerId;
    }

    /**
     * Getter for PartnerId.
     * Partner Id in e-TM system
     * @return Returns the String
     */
    public String getPartnerId() {
        return OptionalNullable.getFrom(partnerId);
    }

    /**
     * Setter for PartnerId.
     * Partner Id in e-TM system
     * @param partnerId Value for String
     */
    @JsonSetter("PartnerId")
    public void setPartnerId(String partnerId) {
        this.partnerId = OptionalNullable.of(partnerId);
    }

    /**
     * UnSetter for PartnerId.
     * Partner Id in e-TM system
     */
    public void unsetPartnerId() {
        partnerId = null;
    }

    /**
     * Internal Getter for PartnerName.
     * Partner Name in e-TM system
     * @return Returns the Internal String
     */
    @JsonGetter("PartnerName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPartnerName() {
        return this.partnerName;
    }

    /**
     * Getter for PartnerName.
     * Partner Name in e-TM system
     * @return Returns the String
     */
    public String getPartnerName() {
        return OptionalNullable.getFrom(partnerName);
    }

    /**
     * Setter for PartnerName.
     * Partner Name in e-TM system
     * @param partnerName Value for String
     */
    @JsonSetter("PartnerName")
    public void setPartnerName(String partnerName) {
        this.partnerName = OptionalNullable.of(partnerName);
    }

    /**
     * UnSetter for PartnerName.
     * Partner Name in e-TM system
     */
    public void unsetPartnerName() {
        partnerName = null;
    }

    /**
     * Converts this CustomerContract into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CustomerContract [" + "partnerId=" + partnerId + ", partnerName=" + partnerName
                + "]";
    }

    /**
     * Builds a new {@link CustomerContract.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CustomerContract.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.partnerId = internalGetPartnerId();
        builder.partnerName = internalGetPartnerName();
        return builder;
    }

    /**
     * Class to build instances of {@link CustomerContract}.
     */
    public static class Builder {
        private OptionalNullable<String> partnerId;
        private OptionalNullable<String> partnerName;



        /**
         * Setter for partnerId.
         * @param  partnerId  String value for partnerId.
         * @return Builder
         */
        public Builder partnerId(String partnerId) {
            this.partnerId = OptionalNullable.of(partnerId);
            return this;
        }

        /**
         * UnSetter for partnerId.
         * @return Builder
         */
        public Builder unsetPartnerId() {
            partnerId = null;
            return this;
        }

        /**
         * Setter for partnerName.
         * @param  partnerName  String value for partnerName.
         * @return Builder
         */
        public Builder partnerName(String partnerName) {
            this.partnerName = OptionalNullable.of(partnerName);
            return this;
        }

        /**
         * UnSetter for partnerName.
         * @return Builder
         */
        public Builder unsetPartnerName() {
            partnerName = null;
            return this;
        }

        /**
         * Builds a new {@link CustomerContract} object using the set fields.
         * @return {@link CustomerContract}
         */
        public CustomerContract build() {
            return new CustomerContract(partnerId, partnerName);
        }
    }
}
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
 * This is a model class for DefaultErrorFault type.
 */
public class DefaultErrorFault {
    private String faultstring;
    private DefaultErrorFaultDetail detail;

    /**
     * Default constructor.
     */
    public DefaultErrorFault() {
    }

    /**
     * Initialization constructor.
     * @param  faultstring  String value for faultstring.
     * @param  detail  DefaultErrorFaultDetail value for detail.
     */
    public DefaultErrorFault(
            String faultstring,
            DefaultErrorFaultDetail detail) {
        this.faultstring = faultstring;
        this.detail = detail;
    }

    /**
     * Getter for Faultstring.
     * Error Description
     * @return Returns the String
     */
    @JsonGetter("faultstring")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFaultstring() {
        return faultstring;
    }

    /**
     * Setter for Faultstring.
     * Error Description
     * @param faultstring Value for String
     */
    @JsonSetter("faultstring")
    public void setFaultstring(String faultstring) {
        this.faultstring = faultstring;
    }

    /**
     * Getter for Detail.
     * Details about the error
     * @return Returns the DefaultErrorFaultDetail
     */
    @JsonGetter("detail")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DefaultErrorFaultDetail getDetail() {
        return detail;
    }

    /**
     * Setter for Detail.
     * Details about the error
     * @param detail Value for DefaultErrorFaultDetail
     */
    @JsonSetter("detail")
    public void setDetail(DefaultErrorFaultDetail detail) {
        this.detail = detail;
    }

    /**
     * Converts this DefaultErrorFault into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DefaultErrorFault [" + "faultstring=" + faultstring + ", detail=" + detail + "]";
    }

    /**
     * Builds a new {@link DefaultErrorFault.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DefaultErrorFault.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .faultstring(getFaultstring())
                .detail(getDetail());
        return builder;
    }

    /**
     * Class to build instances of {@link DefaultErrorFault}.
     */
    public static class Builder {
        private String faultstring;
        private DefaultErrorFaultDetail detail;



        /**
         * Setter for faultstring.
         * @param  faultstring  String value for faultstring.
         * @return Builder
         */
        public Builder faultstring(String faultstring) {
            this.faultstring = faultstring;
            return this;
        }

        /**
         * Setter for detail.
         * @param  detail  DefaultErrorFaultDetail value for detail.
         * @return Builder
         */
        public Builder detail(DefaultErrorFaultDetail detail) {
            this.detail = detail;
            return this;
        }

        /**
         * Builds a new {@link DefaultErrorFault} object using the set fields.
         * @return {@link DefaultErrorFault}
         */
        public DefaultErrorFault build() {
            return new DefaultErrorFault(faultstring, detail);
        }
    }
}
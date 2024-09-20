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
 * This is a model class for FleetmanagementV1UserLoggedinuser401Error1 type.
 */
public class FleetmanagementV1UserLoggedinuser401Error1 {
    private Fault fault;

    /**
     * Default constructor.
     */
    public FleetmanagementV1UserLoggedinuser401Error1() {
    }

    /**
     * Initialization constructor.
     * @param  fault  Fault value for fault.
     */
    public FleetmanagementV1UserLoggedinuser401Error1(
            Fault fault) {
        this.fault = fault;
    }

    /**
     * Getter for Fault.
     * @return Returns the Fault
     */
    @JsonGetter("fault")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Fault getFault() {
        return fault;
    }

    /**
     * Setter for Fault.
     * @param fault Value for Fault
     */
    @JsonSetter("fault")
    public void setFault(Fault fault) {
        this.fault = fault;
    }

    /**
     * Converts this FleetmanagementV1UserLoggedinuser401Error1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "FleetmanagementV1UserLoggedinuser401Error1 [" + "fault=" + fault + "]";
    }

    /**
     * Builds a new {@link FleetmanagementV1UserLoggedinuser401Error1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link FleetmanagementV1UserLoggedinuser401Error1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .fault(getFault());
        return builder;
    }

    /**
     * Class to build instances of {@link FleetmanagementV1UserLoggedinuser401Error1}.
     */
    public static class Builder {
        private Fault fault;



        /**
         * Setter for fault.
         * @param  fault  Fault value for fault.
         * @return Builder
         */
        public Builder fault(Fault fault) {
            this.fault = fault;
            return this;
        }

        /**
         * Builds a new {@link FleetmanagementV1UserLoggedinuser401Error1} object using the set
         * fields.
         * @return {@link FleetmanagementV1UserLoggedinuser401Error1}
         */
        public FleetmanagementV1UserLoggedinuser401Error1 build() {
            return new FleetmanagementV1UserLoggedinuser401Error1(fault);
        }
    }
}

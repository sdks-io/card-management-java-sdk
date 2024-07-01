/*
 * ShellCardManagementAPIsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.apitest.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for LocationRestriction type.
 */
public class LocationRestriction {
    private CountryRestriction countryRestrictions;
    private List<NetworkRestriction> networkRestrictions;
    private List<ShellSiteRestriction> shellSiteRestrictions;
    private List<PartnerSiteRestriction> partnerSiteRestrictions;

    /**
     * Default constructor.
     */
    public LocationRestriction() {
    }

    /**
     * Initialization constructor.
     * @param  countryRestrictions  CountryRestriction value for countryRestrictions.
     * @param  networkRestrictions  List of NetworkRestriction value for networkRestrictions.
     * @param  shellSiteRestrictions  List of ShellSiteRestriction value for shellSiteRestrictions.
     * @param  partnerSiteRestrictions  List of PartnerSiteRestriction value for
     *         partnerSiteRestrictions.
     */
    public LocationRestriction(
            CountryRestriction countryRestrictions,
            List<NetworkRestriction> networkRestrictions,
            List<ShellSiteRestriction> shellSiteRestrictions,
            List<PartnerSiteRestriction> partnerSiteRestrictions) {
        this.countryRestrictions = countryRestrictions;
        this.networkRestrictions = networkRestrictions;
        this.shellSiteRestrictions = shellSiteRestrictions;
        this.partnerSiteRestrictions = partnerSiteRestrictions;
    }

    /**
     * Getter for CountryRestrictions.
     * @return Returns the CountryRestriction
     */
    @JsonGetter("CountryRestrictions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CountryRestriction getCountryRestrictions() {
        return countryRestrictions;
    }

    /**
     * Setter for CountryRestrictions.
     * @param countryRestrictions Value for CountryRestriction
     */
    @JsonSetter("CountryRestrictions")
    public void setCountryRestrictions(CountryRestriction countryRestrictions) {
        this.countryRestrictions = countryRestrictions;
    }

    /**
     * Getter for NetworkRestrictions.
     * @return Returns the List of NetworkRestriction
     */
    @JsonGetter("NetworkRestrictions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<NetworkRestriction> getNetworkRestrictions() {
        return networkRestrictions;
    }

    /**
     * Setter for NetworkRestrictions.
     * @param networkRestrictions Value for List of NetworkRestriction
     */
    @JsonSetter("NetworkRestrictions")
    public void setNetworkRestrictions(List<NetworkRestriction> networkRestrictions) {
        this.networkRestrictions = networkRestrictions;
    }

    /**
     * Getter for ShellSiteRestrictions.
     * @return Returns the List of ShellSiteRestriction
     */
    @JsonGetter("ShellSiteRestrictions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ShellSiteRestriction> getShellSiteRestrictions() {
        return shellSiteRestrictions;
    }

    /**
     * Setter for ShellSiteRestrictions.
     * @param shellSiteRestrictions Value for List of ShellSiteRestriction
     */
    @JsonSetter("ShellSiteRestrictions")
    public void setShellSiteRestrictions(List<ShellSiteRestriction> shellSiteRestrictions) {
        this.shellSiteRestrictions = shellSiteRestrictions;
    }

    /**
     * Getter for PartnerSiteRestrictions.
     * @return Returns the List of PartnerSiteRestriction
     */
    @JsonGetter("PartnerSiteRestrictions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<PartnerSiteRestriction> getPartnerSiteRestrictions() {
        return partnerSiteRestrictions;
    }

    /**
     * Setter for PartnerSiteRestrictions.
     * @param partnerSiteRestrictions Value for List of PartnerSiteRestriction
     */
    @JsonSetter("PartnerSiteRestrictions")
    public void setPartnerSiteRestrictions(List<PartnerSiteRestriction> partnerSiteRestrictions) {
        this.partnerSiteRestrictions = partnerSiteRestrictions;
    }

    /**
     * Converts this LocationRestriction into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "LocationRestriction [" + "countryRestrictions=" + countryRestrictions
                + ", networkRestrictions=" + networkRestrictions + ", shellSiteRestrictions="
                + shellSiteRestrictions + ", partnerSiteRestrictions=" + partnerSiteRestrictions
                + "]";
    }

    /**
     * Builds a new {@link LocationRestriction.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link LocationRestriction.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .countryRestrictions(getCountryRestrictions())
                .networkRestrictions(getNetworkRestrictions())
                .shellSiteRestrictions(getShellSiteRestrictions())
                .partnerSiteRestrictions(getPartnerSiteRestrictions());
        return builder;
    }

    /**
     * Class to build instances of {@link LocationRestriction}.
     */
    public static class Builder {
        private CountryRestriction countryRestrictions;
        private List<NetworkRestriction> networkRestrictions;
        private List<ShellSiteRestriction> shellSiteRestrictions;
        private List<PartnerSiteRestriction> partnerSiteRestrictions;



        /**
         * Setter for countryRestrictions.
         * @param  countryRestrictions  CountryRestriction value for countryRestrictions.
         * @return Builder
         */
        public Builder countryRestrictions(CountryRestriction countryRestrictions) {
            this.countryRestrictions = countryRestrictions;
            return this;
        }

        /**
         * Setter for networkRestrictions.
         * @param  networkRestrictions  List of NetworkRestriction value for networkRestrictions.
         * @return Builder
         */
        public Builder networkRestrictions(List<NetworkRestriction> networkRestrictions) {
            this.networkRestrictions = networkRestrictions;
            return this;
        }

        /**
         * Setter for shellSiteRestrictions.
         * @param  shellSiteRestrictions  List of ShellSiteRestriction value for
         *         shellSiteRestrictions.
         * @return Builder
         */
        public Builder shellSiteRestrictions(List<ShellSiteRestriction> shellSiteRestrictions) {
            this.shellSiteRestrictions = shellSiteRestrictions;
            return this;
        }

        /**
         * Setter for partnerSiteRestrictions.
         * @param  partnerSiteRestrictions  List of PartnerSiteRestriction value for
         *         partnerSiteRestrictions.
         * @return Builder
         */
        public Builder partnerSiteRestrictions(
                List<PartnerSiteRestriction> partnerSiteRestrictions) {
            this.partnerSiteRestrictions = partnerSiteRestrictions;
            return this;
        }

        /**
         * Builds a new {@link LocationRestriction} object using the set fields.
         * @return {@link LocationRestriction}
         */
        public LocationRestriction build() {
            return new LocationRestriction(countryRestrictions, networkRestrictions,
                    shellSiteRestrictions, partnerSiteRestrictions);
        }
    }
}
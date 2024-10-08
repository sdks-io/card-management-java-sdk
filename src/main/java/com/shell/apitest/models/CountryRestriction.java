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
 * This is a model class for CountryRestriction type.
 */
public class CountryRestriction {
    private List<String> countries;
    private Boolean exclusive;

    /**
     * Default constructor.
     */
    public CountryRestriction() {
    }

    /**
     * Initialization constructor.
     * @param  countries  List of String value for countries.
     * @param  exclusive  Boolean value for exclusive.
     */
    public CountryRestriction(
            List<String> countries,
            Boolean exclusive) {
        this.countries = countries;
        this.exclusive = exclusive;
    }

    /**
     * Getter for Countries.
     * A list of ISO 3166-1 Numeric-3 country codes. Example: 826 for United Kingdom.
     * @return Returns the List of String
     */
    @JsonGetter("Countries")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getCountries() {
        return countries;
    }

    /**
     * Setter for Countries.
     * A list of ISO 3166-1 Numeric-3 country codes. Example: 826 for United Kingdom.
     * @param countries Value for List of String
     */
    @JsonSetter("Countries")
    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    /**
     * Getter for Exclusive.
     * Flag indicates whether the profile is inclusive or exclusive. Example: False - (inclusive),
     * i.e. the “Countries” property lists the countries where the transactions will be allowed.
     * True - (exclusive), i.e. the “Countries” property lists the countries where the transactions
     * will be declined.
     * @return Returns the Boolean
     */
    @JsonGetter("Exclusive")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getExclusive() {
        return exclusive;
    }

    /**
     * Setter for Exclusive.
     * Flag indicates whether the profile is inclusive or exclusive. Example: False - (inclusive),
     * i.e. the “Countries” property lists the countries where the transactions will be allowed.
     * True - (exclusive), i.e. the “Countries” property lists the countries where the transactions
     * will be declined.
     * @param exclusive Value for Boolean
     */
    @JsonSetter("Exclusive")
    public void setExclusive(Boolean exclusive) {
        this.exclusive = exclusive;
    }

    /**
     * Converts this CountryRestriction into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CountryRestriction [" + "countries=" + countries + ", exclusive=" + exclusive + "]";
    }

    /**
     * Builds a new {@link CountryRestriction.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CountryRestriction.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .countries(getCountries())
                .exclusive(getExclusive());
        return builder;
    }

    /**
     * Class to build instances of {@link CountryRestriction}.
     */
    public static class Builder {
        private List<String> countries;
        private Boolean exclusive;



        /**
         * Setter for countries.
         * @param  countries  List of String value for countries.
         * @return Builder
         */
        public Builder countries(List<String> countries) {
            this.countries = countries;
            return this;
        }

        /**
         * Setter for exclusive.
         * @param  exclusive  Boolean value for exclusive.
         * @return Builder
         */
        public Builder exclusive(Boolean exclusive) {
            this.exclusive = exclusive;
            return this;
        }

        /**
         * Builds a new {@link CountryRestriction} object using the set fields.
         * @return {@link CountryRestriction}
         */
        public CountryRestriction build() {
            return new CountryRestriction(countries, exclusive);
        }
    }
}

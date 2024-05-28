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
 * This is a model class for RestrictionSearchCardRequest type.
 */
public class RestrictionSearchCardRequest {
    private RestrictionSearchCardRequestFilters filters;

    /**
     * Default constructor.
     */
    public RestrictionSearchCardRequest() {
    }

    /**
     * Initialization constructor.
     * @param  filters  RestrictionSearchCardRequestFilters value for filters.
     */
    public RestrictionSearchCardRequest(
            RestrictionSearchCardRequestFilters filters) {
        this.filters = filters;
    }

    /**
     * Getter for Filters.
     * @return Returns the RestrictionSearchCardRequestFilters
     */
    @JsonGetter("Filters")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public RestrictionSearchCardRequestFilters getFilters() {
        return filters;
    }

    /**
     * Setter for Filters.
     * @param filters Value for RestrictionSearchCardRequestFilters
     */
    @JsonSetter("Filters")
    public void setFilters(RestrictionSearchCardRequestFilters filters) {
        this.filters = filters;
    }

    /**
     * Converts this RestrictionSearchCardRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RestrictionSearchCardRequest [" + "filters=" + filters + "]";
    }

    /**
     * Builds a new {@link RestrictionSearchCardRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RestrictionSearchCardRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .filters(getFilters());
        return builder;
    }

    /**
     * Class to build instances of {@link RestrictionSearchCardRequest}.
     */
    public static class Builder {
        private RestrictionSearchCardRequestFilters filters;



        /**
         * Setter for filters.
         * @param  filters  RestrictionSearchCardRequestFilters value for filters.
         * @return Builder
         */
        public Builder filters(RestrictionSearchCardRequestFilters filters) {
            this.filters = filters;
            return this;
        }

        /**
         * Builds a new {@link RestrictionSearchCardRequest} object using the set fields.
         * @return {@link RestrictionSearchCardRequest}
         */
        public RestrictionSearchCardRequest build() {
            return new RestrictionSearchCardRequest(filters);
        }
    }
}

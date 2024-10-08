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
 * This is a model class for PayerRequest type.
 */
public class PayerRequest {
    private List<Payers> payers;
    private Boolean returnBasicDetailsOnly;
    private Boolean includeAddresses;
    private Boolean includeBonusParameters;
    private Integer currentPage;
    private Integer pageSize;

    /**
     * Default constructor.
     */
    public PayerRequest() {
        returnBasicDetailsOnly = false;
        includeAddresses = false;
        includeBonusParameters = false;
    }

    /**
     * Initialization constructor.
     * @param  payers  List of Payers value for payers.
     * @param  returnBasicDetailsOnly  Boolean value for returnBasicDetailsOnly.
     * @param  includeAddresses  Boolean value for includeAddresses.
     * @param  includeBonusParameters  Boolean value for includeBonusParameters.
     * @param  currentPage  Integer value for currentPage.
     * @param  pageSize  Integer value for pageSize.
     */
    public PayerRequest(
            List<Payers> payers,
            Boolean returnBasicDetailsOnly,
            Boolean includeAddresses,
            Boolean includeBonusParameters,
            Integer currentPage,
            Integer pageSize) {
        this.payers = payers;
        this.returnBasicDetailsOnly = returnBasicDetailsOnly;
        this.includeAddresses = includeAddresses;
        this.includeBonusParameters = includeBonusParameters;
        this.currentPage = currentPage;
        this.pageSize = pageSize;
    }

    /**
     * Getter for Payers.
     * List of Payer entity. Optional. Note: • Max number of payers allowed in the input is 10, if
     * it exceeds in the input it will throw an error. • This value is configurable. Initial
     * configuration will be 1000 and will change to 10 once SFH changes are integrated.
     * @return Returns the List of Payers
     */
    @JsonGetter("Payers")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Payers> getPayers() {
        return payers;
    }

    /**
     * Setter for Payers.
     * List of Payer entity. Optional. Note: • Max number of payers allowed in the input is 10, if
     * it exceeds in the input it will throw an error. • This value is configurable. Initial
     * configuration will be 1000 and will change to 10 once SFH changes are integrated.
     * @param payers Value for List of Payers
     */
    @JsonSetter("Payers")
    public void setPayers(List<Payers> payers) {
        this.payers = payers;
    }

    /**
     * Getter for ReturnBasicDetailsOnly.
     * Returns only the high-level basic details of payers. Set this field to ‘true’ when only the
     * basic details are required to get the result quicker.
     * @return Returns the Boolean
     */
    @JsonGetter("ReturnBasicDetailsOnly")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getReturnBasicDetailsOnly() {
        return returnBasicDetailsOnly;
    }

    /**
     * Setter for ReturnBasicDetailsOnly.
     * Returns only the high-level basic details of payers. Set this field to ‘true’ when only the
     * basic details are required to get the result quicker.
     * @param returnBasicDetailsOnly Value for Boolean
     */
    @JsonSetter("ReturnBasicDetailsOnly")
    public void setReturnBasicDetailsOnly(Boolean returnBasicDetailsOnly) {
        this.returnBasicDetailsOnly = returnBasicDetailsOnly;
    }

    /**
     * Getter for IncludeAddresses.
     * Include address related fields on the response. Set this field to ‘False’ when Address fields
     * are not required to get the result quicker.
     * @return Returns the Boolean
     */
    @JsonGetter("IncludeAddresses")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIncludeAddresses() {
        return includeAddresses;
    }

    /**
     * Setter for IncludeAddresses.
     * Include address related fields on the response. Set this field to ‘False’ when Address fields
     * are not required to get the result quicker.
     * @param includeAddresses Value for Boolean
     */
    @JsonSetter("IncludeAddresses")
    public void setIncludeAddresses(Boolean includeAddresses) {
        this.includeAddresses = includeAddresses;
    }

    /**
     * Getter for IncludeBonusParameters.
     * Include the Finance Currency, used for Finance Widget, in the response
     * @return Returns the Boolean
     */
    @JsonGetter("IncludeBonusParameters")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIncludeBonusParameters() {
        return includeBonusParameters;
    }

    /**
     * Setter for IncludeBonusParameters.
     * Include the Finance Currency, used for Finance Widget, in the response
     * @param includeBonusParameters Value for Boolean
     */
    @JsonSetter("IncludeBonusParameters")
    public void setIncludeBonusParameters(Boolean includeBonusParameters) {
        this.includeBonusParameters = includeBonusParameters;
    }

    /**
     * Getter for CurrentPage.
     * Page Number
     * @return Returns the Integer
     */
    @JsonGetter("CurrentPage")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCurrentPage() {
        return currentPage;
    }

    /**
     * Setter for CurrentPage.
     * Page Number
     * @param currentPage Value for Integer
     */
    @JsonSetter("CurrentPage")
    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    /**
     * Getter for PageSize.
     * Page Size – Number of records to show on a page Default value 50 Return 250 rows only in the
     * response if -1 is supplied as page size. Note: • Max page size is 250, if the user provided
     * value is more than 250 then it will throw error. • This value is configurable.
     * @return Returns the Integer
     */
    @JsonGetter("PageSize")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * Setter for PageSize.
     * Page Size – Number of records to show on a page Default value 50 Return 250 rows only in the
     * response if -1 is supplied as page size. Note: • Max page size is 250, if the user provided
     * value is more than 250 then it will throw error. • This value is configurable.
     * @param pageSize Value for Integer
     */
    @JsonSetter("PageSize")
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * Converts this PayerRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PayerRequest [" + "payers=" + payers + ", returnBasicDetailsOnly="
                + returnBasicDetailsOnly + ", includeAddresses=" + includeAddresses
                + ", includeBonusParameters=" + includeBonusParameters + ", currentPage="
                + currentPage + ", pageSize=" + pageSize + "]";
    }

    /**
     * Builds a new {@link PayerRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PayerRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .payers(getPayers())
                .returnBasicDetailsOnly(getReturnBasicDetailsOnly())
                .includeAddresses(getIncludeAddresses())
                .includeBonusParameters(getIncludeBonusParameters())
                .currentPage(getCurrentPage())
                .pageSize(getPageSize());
        return builder;
    }

    /**
     * Class to build instances of {@link PayerRequest}.
     */
    public static class Builder {
        private List<Payers> payers;
        private Boolean returnBasicDetailsOnly = false;
        private Boolean includeAddresses = false;
        private Boolean includeBonusParameters = false;
        private Integer currentPage;
        private Integer pageSize;



        /**
         * Setter for payers.
         * @param  payers  List of Payers value for payers.
         * @return Builder
         */
        public Builder payers(List<Payers> payers) {
            this.payers = payers;
            return this;
        }

        /**
         * Setter for returnBasicDetailsOnly.
         * @param  returnBasicDetailsOnly  Boolean value for returnBasicDetailsOnly.
         * @return Builder
         */
        public Builder returnBasicDetailsOnly(Boolean returnBasicDetailsOnly) {
            this.returnBasicDetailsOnly = returnBasicDetailsOnly;
            return this;
        }

        /**
         * Setter for includeAddresses.
         * @param  includeAddresses  Boolean value for includeAddresses.
         * @return Builder
         */
        public Builder includeAddresses(Boolean includeAddresses) {
            this.includeAddresses = includeAddresses;
            return this;
        }

        /**
         * Setter for includeBonusParameters.
         * @param  includeBonusParameters  Boolean value for includeBonusParameters.
         * @return Builder
         */
        public Builder includeBonusParameters(Boolean includeBonusParameters) {
            this.includeBonusParameters = includeBonusParameters;
            return this;
        }

        /**
         * Setter for currentPage.
         * @param  currentPage  Integer value for currentPage.
         * @return Builder
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Setter for pageSize.
         * @param  pageSize  Integer value for pageSize.
         * @return Builder
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Builds a new {@link PayerRequest} object using the set fields.
         * @return {@link PayerRequest}
         */
        public PayerRequest build() {
            return new PayerRequest(payers, returnBasicDetailsOnly, includeAddresses,
                    includeBonusParameters, currentPage, pageSize);
        }
    }
}

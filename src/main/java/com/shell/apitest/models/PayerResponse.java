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
import java.util.List;

/**
 * This is a model class for PayerResponse type.
 */
public class PayerResponse {
    private OptionalNullable<String> requestId;
    private List<PayerDetails> payers;
    private Integer currentPage;
    private Integer rowCount;
    private Integer totalPages;
    private ErrorStatus error;

    /**
     * Default constructor.
     */
    public PayerResponse() {
    }

    /**
     * Initialization constructor.
     * @param  requestId  String value for requestId.
     * @param  payers  List of PayerDetails value for payers.
     * @param  currentPage  Integer value for currentPage.
     * @param  rowCount  Integer value for rowCount.
     * @param  totalPages  Integer value for totalPages.
     * @param  error  ErrorStatus value for error.
     */
    public PayerResponse(
            String requestId,
            List<PayerDetails> payers,
            Integer currentPage,
            Integer rowCount,
            Integer totalPages,
            ErrorStatus error) {
        this.requestId = OptionalNullable.of(requestId);
        this.payers = payers;
        this.currentPage = currentPage;
        this.rowCount = rowCount;
        this.totalPages = totalPages;
        this.error = error;
    }

    /**
     * Initialization constructor.
     * @param  requestId  String value for requestId.
     * @param  payers  List of PayerDetails value for payers.
     * @param  currentPage  Integer value for currentPage.
     * @param  rowCount  Integer value for rowCount.
     * @param  totalPages  Integer value for totalPages.
     * @param  error  ErrorStatus value for error.
     */

    protected PayerResponse(OptionalNullable<String> requestId, List<PayerDetails> payers,
            Integer currentPage, Integer rowCount, Integer totalPages, ErrorStatus error) {
        this.requestId = requestId;
        this.payers = payers;
        this.currentPage = currentPage;
        this.rowCount = rowCount;
        this.totalPages = totalPages;
        this.error = error;
    }

    /**
     * Internal Getter for RequestId.
     * Request Id of the API call
     * @return Returns the Internal String
     */
    @JsonGetter("RequestId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetRequestId() {
        return this.requestId;
    }

    /**
     * Getter for RequestId.
     * Request Id of the API call
     * @return Returns the String
     */
    public String getRequestId() {
        return OptionalNullable.getFrom(requestId);
    }

    /**
     * Setter for RequestId.
     * Request Id of the API call
     * @param requestId Value for String
     */
    @JsonSetter("RequestId")
    public void setRequestId(String requestId) {
        this.requestId = OptionalNullable.of(requestId);
    }

    /**
     * UnSetter for RequestId.
     * Request Id of the API call
     */
    public void unsetRequestId() {
        requestId = null;
    }

    /**
     * Getter for Payers.
     * @return Returns the List of PayerDetails
     */
    @JsonGetter("Payers")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<PayerDetails> getPayers() {
        return payers;
    }

    /**
     * Setter for Payers.
     * @param payers Value for List of PayerDetails
     */
    @JsonSetter("Payers")
    public void setPayers(List<PayerDetails> payers) {
        this.payers = payers;
    }

    /**
     * Getter for CurrentPage.
     * Current Page
     * @return Returns the Integer
     */
    @JsonGetter("CurrentPage")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCurrentPage() {
        return currentPage;
    }

    /**
     * Setter for CurrentPage.
     * Current Page
     * @param currentPage Value for Integer
     */
    @JsonSetter("CurrentPage")
    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    /**
     * Getter for RowCount.
     * Total row count matched for the given input criteria
     * @return Returns the Integer
     */
    @JsonGetter("RowCount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getRowCount() {
        return rowCount;
    }

    /**
     * Setter for RowCount.
     * Total row count matched for the given input criteria
     * @param rowCount Value for Integer
     */
    @JsonSetter("RowCount")
    public void setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
    }

    /**
     * Getter for TotalPages.
     * Calculated page count based on page size from the incoming API request and total number of
     * rows matched for the given input criteria. Return 1 if the page size is -1 as all records are
     * returned
     * @return Returns the Integer
     */
    @JsonGetter("TotalPages")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTotalPages() {
        return totalPages;
    }

    /**
     * Setter for TotalPages.
     * Calculated page count based on page size from the incoming API request and total number of
     * rows matched for the given input criteria. Return 1 if the page size is -1 as all records are
     * returned
     * @param totalPages Value for Integer
     */
    @JsonSetter("TotalPages")
    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    /**
     * Getter for Error.
     * @return Returns the ErrorStatus
     */
    @JsonGetter("Error")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ErrorStatus getError() {
        return error;
    }

    /**
     * Setter for Error.
     * @param error Value for ErrorStatus
     */
    @JsonSetter("Error")
    public void setError(ErrorStatus error) {
        this.error = error;
    }

    /**
     * Converts this PayerResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PayerResponse [" + "requestId=" + requestId + ", payers=" + payers
                + ", currentPage=" + currentPage + ", rowCount=" + rowCount + ", totalPages="
                + totalPages + ", error=" + error + "]";
    }

    /**
     * Builds a new {@link PayerResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PayerResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .payers(getPayers())
                .currentPage(getCurrentPage())
                .rowCount(getRowCount())
                .totalPages(getTotalPages())
                .error(getError());
        builder.requestId = internalGetRequestId();
        return builder;
    }

    /**
     * Class to build instances of {@link PayerResponse}.
     */
    public static class Builder {
        private OptionalNullable<String> requestId;
        private List<PayerDetails> payers;
        private Integer currentPage;
        private Integer rowCount;
        private Integer totalPages;
        private ErrorStatus error;



        /**
         * Setter for requestId.
         * @param  requestId  String value for requestId.
         * @return Builder
         */
        public Builder requestId(String requestId) {
            this.requestId = OptionalNullable.of(requestId);
            return this;
        }

        /**
         * UnSetter for requestId.
         * @return Builder
         */
        public Builder unsetRequestId() {
            requestId = null;
            return this;
        }

        /**
         * Setter for payers.
         * @param  payers  List of PayerDetails value for payers.
         * @return Builder
         */
        public Builder payers(List<PayerDetails> payers) {
            this.payers = payers;
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
         * Setter for rowCount.
         * @param  rowCount  Integer value for rowCount.
         * @return Builder
         */
        public Builder rowCount(Integer rowCount) {
            this.rowCount = rowCount;
            return this;
        }

        /**
         * Setter for totalPages.
         * @param  totalPages  Integer value for totalPages.
         * @return Builder
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        /**
         * Setter for error.
         * @param  error  ErrorStatus value for error.
         * @return Builder
         */
        public Builder error(ErrorStatus error) {
            this.error = error;
            return this;
        }

        /**
         * Builds a new {@link PayerResponse} object using the set fields.
         * @return {@link PayerResponse}
         */
        public PayerResponse build() {
            return new PayerResponse(requestId, payers, currentPage, rowCount, totalPages, error);
        }
    }
}
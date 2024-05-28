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
 * This is a model class for CardGroupResponse type.
 */
public class CardGroupResponse {
    private List<CardGroupResponseCardGroupsItems> cardGroups;
    private Integer currentPage;
    private Integer rowCount;
    private Integer totalPages;
    private ErrorStatus error;
    private String requestId;

    /**
     * Default constructor.
     */
    public CardGroupResponse() {
    }

    /**
     * Initialization constructor.
     * @param  cardGroups  List of CardGroupResponseCardGroupsItems value for cardGroups.
     * @param  currentPage  Integer value for currentPage.
     * @param  rowCount  Integer value for rowCount.
     * @param  totalPages  Integer value for totalPages.
     * @param  error  ErrorStatus value for error.
     * @param  requestId  String value for requestId.
     */
    public CardGroupResponse(
            List<CardGroupResponseCardGroupsItems> cardGroups,
            Integer currentPage,
            Integer rowCount,
            Integer totalPages,
            ErrorStatus error,
            String requestId) {
        this.cardGroups = cardGroups;
        this.currentPage = currentPage;
        this.rowCount = rowCount;
        this.totalPages = totalPages;
        this.error = error;
        this.requestId = requestId;
    }

    /**
     * Getter for CardGroups.
     * @return Returns the List of CardGroupResponseCardGroupsItems
     */
    @JsonGetter("CardGroups")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CardGroupResponseCardGroupsItems> getCardGroups() {
        return cardGroups;
    }

    /**
     * Setter for CardGroups.
     * @param cardGroups Value for List of CardGroupResponseCardGroupsItems
     */
    @JsonSetter("CardGroups")
    public void setCardGroups(List<CardGroupResponseCardGroupsItems> cardGroups) {
        this.cardGroups = cardGroups;
    }

    /**
     * Getter for CurrentPage.
     * current page
     * @return Returns the Integer
     */
    @JsonGetter("CurrentPage")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCurrentPage() {
        return currentPage;
    }

    /**
     * Setter for CurrentPage.
     * current page
     * @param currentPage Value for Integer
     */
    @JsonSetter("CurrentPage")
    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    /**
     * Getter for RowCount.
     * number of records in current response
     * @return Returns the Integer
     */
    @JsonGetter("RowCount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getRowCount() {
        return rowCount;
    }

    /**
     * Setter for RowCount.
     * number of records in current response
     * @param rowCount Value for Integer
     */
    @JsonSetter("RowCount")
    public void setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
    }

    /**
     * Getter for TotalPages.
     * Total pages available
     * @return Returns the Integer
     */
    @JsonGetter("TotalPages")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTotalPages() {
        return totalPages;
    }

    /**
     * Setter for TotalPages.
     * Total pages available
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
     * Getter for RequestId.
     * API Request id
     * @return Returns the String
     */
    @JsonGetter("RequestId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRequestId() {
        return requestId;
    }

    /**
     * Setter for RequestId.
     * API Request id
     * @param requestId Value for String
     */
    @JsonSetter("RequestId")
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Converts this CardGroupResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CardGroupResponse [" + "cardGroups=" + cardGroups + ", currentPage=" + currentPage
                + ", rowCount=" + rowCount + ", totalPages=" + totalPages + ", error=" + error
                + ", requestId=" + requestId + "]";
    }

    /**
     * Builds a new {@link CardGroupResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CardGroupResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .cardGroups(getCardGroups())
                .currentPage(getCurrentPage())
                .rowCount(getRowCount())
                .totalPages(getTotalPages())
                .error(getError())
                .requestId(getRequestId());
        return builder;
    }

    /**
     * Class to build instances of {@link CardGroupResponse}.
     */
    public static class Builder {
        private List<CardGroupResponseCardGroupsItems> cardGroups;
        private Integer currentPage;
        private Integer rowCount;
        private Integer totalPages;
        private ErrorStatus error;
        private String requestId;



        /**
         * Setter for cardGroups.
         * @param  cardGroups  List of CardGroupResponseCardGroupsItems value for cardGroups.
         * @return Builder
         */
        public Builder cardGroups(List<CardGroupResponseCardGroupsItems> cardGroups) {
            this.cardGroups = cardGroups;
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
         * Setter for requestId.
         * @param  requestId  String value for requestId.
         * @return Builder
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Builds a new {@link CardGroupResponse} object using the set fields.
         * @return {@link CardGroupResponse}
         */
        public CardGroupResponse build() {
            return new CardGroupResponse(cardGroups, currentPage, rowCount, totalPages, error,
                    requestId);
        }
    }
}
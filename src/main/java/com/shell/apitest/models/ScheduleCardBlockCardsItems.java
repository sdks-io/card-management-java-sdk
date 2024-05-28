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
 * This is a model class for ScheduleCardBlockCardsItems type.
 */
public class ScheduleCardBlockCardsItems {
    private Integer colCoCode;
    private Integer colCoId;
    private Integer accountId;
    private String accountNumber;
    private Integer payerId;
    private String payerNumber;
    private Integer cardId;
    private String pAN;
    private String cardExpiryDate;
    private String action;
    private String fromDate;
    private String toDate;
    private OptionalNullable<String> caller;
    private Boolean notifyCaller;

    /**
     * Default constructor.
     */
    public ScheduleCardBlockCardsItems() {
    }

    /**
     * Initialization constructor.
     * @param  action  String value for action.
     * @param  colCoCode  Integer value for colCoCode.
     * @param  colCoId  Integer value for colCoId.
     * @param  accountId  Integer value for accountId.
     * @param  accountNumber  String value for accountNumber.
     * @param  payerId  Integer value for payerId.
     * @param  payerNumber  String value for payerNumber.
     * @param  cardId  Integer value for cardId.
     * @param  pAN  String value for pAN.
     * @param  cardExpiryDate  String value for cardExpiryDate.
     * @param  fromDate  String value for fromDate.
     * @param  toDate  String value for toDate.
     * @param  caller  String value for caller.
     * @param  notifyCaller  Boolean value for notifyCaller.
     */
    public ScheduleCardBlockCardsItems(
            String action,
            Integer colCoCode,
            Integer colCoId,
            Integer accountId,
            String accountNumber,
            Integer payerId,
            String payerNumber,
            Integer cardId,
            String pAN,
            String cardExpiryDate,
            String fromDate,
            String toDate,
            String caller,
            Boolean notifyCaller) {
        this.colCoCode = colCoCode;
        this.colCoId = colCoId;
        this.accountId = accountId;
        this.accountNumber = accountNumber;
        this.payerId = payerId;
        this.payerNumber = payerNumber;
        this.cardId = cardId;
        this.pAN = pAN;
        this.cardExpiryDate = cardExpiryDate;
        this.action = action;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.caller = OptionalNullable.of(caller);
        this.notifyCaller = notifyCaller;
    }

    /**
     * Initialization constructor.
     * @param  action  String value for action.
     * @param  colCoCode  Integer value for colCoCode.
     * @param  colCoId  Integer value for colCoId.
     * @param  accountId  Integer value for accountId.
     * @param  accountNumber  String value for accountNumber.
     * @param  payerId  Integer value for payerId.
     * @param  payerNumber  String value for payerNumber.
     * @param  cardId  Integer value for cardId.
     * @param  pAN  String value for pAN.
     * @param  cardExpiryDate  String value for cardExpiryDate.
     * @param  fromDate  String value for fromDate.
     * @param  toDate  String value for toDate.
     * @param  caller  String value for caller.
     * @param  notifyCaller  Boolean value for notifyCaller.
     */

    protected ScheduleCardBlockCardsItems(String action, Integer colCoCode, Integer colCoId,
            Integer accountId, String accountNumber, Integer payerId, String payerNumber,
            Integer cardId, String pAN, String cardExpiryDate, String fromDate, String toDate,
            OptionalNullable<String> caller, Boolean notifyCaller) {
        this.colCoCode = colCoCode;
        this.colCoId = colCoId;
        this.accountId = accountId;
        this.accountNumber = accountNumber;
        this.payerId = payerId;
        this.payerNumber = payerNumber;
        this.cardId = cardId;
        this.pAN = pAN;
        this.cardExpiryDate = cardExpiryDate;
        this.action = action;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.caller = caller;
        this.notifyCaller = notifyCaller;
    }

    /**
     * Getter for ColCoCode.
     * Collecting Company Code (Shell Code) of the selected payer. Mandatory for serviced OUs such
     * as Romania, Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if
     * ColCoID is provided. Example: 86-Philippines 5-UK
     * @return Returns the Integer
     */
    @JsonGetter("ColCoCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getColCoCode() {
        return colCoCode;
    }

    /**
     * Setter for ColCoCode.
     * Collecting Company Code (Shell Code) of the selected payer. Mandatory for serviced OUs such
     * as Romania, Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if
     * ColCoID is provided. Example: 86-Philippines 5-UK
     * @param colCoCode Value for Integer
     */
    @JsonSetter("ColCoCode")
    public void setColCoCode(Integer colCoCode) {
        this.colCoCode = colCoCode;
    }

    /**
     * Getter for ColCoId.
     * Collecting Company Id of the selected payer. Optional if ColCoCode is passed else Mandatory.
     * Example: 1-Philippines 5-UK
     * @return Returns the Integer
     */
    @JsonGetter("ColCoId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getColCoId() {
        return colCoId;
    }

    /**
     * Setter for ColCoId.
     * Collecting Company Id of the selected payer. Optional if ColCoCode is passed else Mandatory.
     * Example: 1-Philippines 5-UK
     * @param colCoId Value for Integer
     */
    @JsonSetter("ColCoId")
    public void setColCoId(Integer colCoId) {
        this.colCoId = colCoId;
    }

    /**
     * Getter for AccountId.
     * Account Id of the customer. Optional if AccountNumber is passed, else Mandatory.
     * @return Returns the Integer
     */
    @JsonGetter("AccountId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getAccountId() {
        return accountId;
    }

    /**
     * Setter for AccountId.
     * Account Id of the customer. Optional if AccountNumber is passed, else Mandatory.
     * @param accountId Value for Integer
     */
    @JsonSetter("AccountId")
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    /**
     * Getter for AccountNumber.
     * Account Number of the customer. Optional if AccountId is passed, else Mandatory.
     * @return Returns the String
     */
    @JsonGetter("AccountNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Setter for AccountNumber.
     * Account Number of the customer. Optional if AccountId is passed, else Mandatory.
     * @param accountNumber Value for String
     */
    @JsonSetter("AccountNumber")
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Getter for PayerId.
     * Payer id of the customer. Optional if PayerNumber is passed, else Mandatory. Example: 123456
     * @return Returns the Integer
     */
    @JsonGetter("PayerId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPayerId() {
        return payerId;
    }

    /**
     * Setter for PayerId.
     * Payer id of the customer. Optional if PayerNumber is passed, else Mandatory. Example: 123456
     * @param payerId Value for Integer
     */
    @JsonSetter("PayerId")
    public void setPayerId(Integer payerId) {
        this.payerId = payerId;
    }

    /**
     * Getter for PayerNumber.
     * PayerNumber of the customer. Optional if PayerId is passed, else Mandatory.
     * @return Returns the String
     */
    @JsonGetter("PayerNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPayerNumber() {
        return payerNumber;
    }

    /**
     * Setter for PayerNumber.
     * PayerNumber of the customer. Optional if PayerId is passed, else Mandatory.
     * @param payerNumber Value for String
     */
    @JsonSetter("PayerNumber")
    public void setPayerNumber(String payerNumber) {
        this.payerNumber = payerNumber;
    }

    /**
     * Getter for CardId.
     * Unique Id of the card. Optional if PAN is passed, else Mandatory.
     * @return Returns the Integer
     */
    @JsonGetter("CardId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCardId() {
        return cardId;
    }

    /**
     * Setter for CardId.
     * Unique Id of the card. Optional if PAN is passed, else Mandatory.
     * @param cardId Value for Integer
     */
    @JsonSetter("CardId")
    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    /**
     * Getter for PAN.
     * PAN of the card. Optional if CardId is passed, else Mandatory.
     * @return Returns the String
     */
    @JsonGetter("PAN")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPAN() {
        return pAN;
    }

    /**
     * Setter for PAN.
     * PAN of the card. Optional if CardId is passed, else Mandatory.
     * @param pAN Value for String
     */
    @JsonSetter("PAN")
    public void setPAN(String pAN) {
        this.pAN = pAN;
    }

    /**
     * Getter for CardExpiryDate.
     * Expiry date of the card. Optional if CardId is passed, else Mandatory. Format: yyyyMMdd
     * Example: 20170930
     * @return Returns the String
     */
    @JsonGetter("CardExpiryDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCardExpiryDate() {
        return cardExpiryDate;
    }

    /**
     * Setter for CardExpiryDate.
     * Expiry date of the card. Optional if CardId is passed, else Mandatory. Format: yyyyMMdd
     * Example: 20170930
     * @param cardExpiryDate Value for String
     */
    @JsonSetter("CardExpiryDate")
    public void setCardExpiryDate(String cardExpiryDate) {
        this.cardExpiryDate = cardExpiryDate;
    }

    /**
     * Getter for Action.
     * Action Mandatory Possible values are: •	AddOrUpdate – adds a new request or updates any
     * existing requests, with overlapping dates, for the card •	AddAndOverwriteAll - all the
     * existing requests of the given card will be removed and a new request with the specified
     * FromDate and ToDate will be added. •	Delete – deletes any existing request with the same
     * start date and end date for the card •	DeleteAll – deletes all saved future dated requests
     * (all block and unblock requests) of the card.
     * @return Returns the String
     */
    @JsonGetter("Action")
    public String getAction() {
        return action;
    }

    /**
     * Setter for Action.
     * Action Mandatory Possible values are: •	AddOrUpdate – adds a new request or updates any
     * existing requests, with overlapping dates, for the card •	AddAndOverwriteAll - all the
     * existing requests of the given card will be removed and a new request with the specified
     * FromDate and ToDate will be added. •	Delete – deletes any existing request with the same
     * start date and end date for the card •	DeleteAll – deletes all saved future dated requests
     * (all block and unblock requests) of the card.
     * @param action Value for String
     */
    @JsonSetter("Action")
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * Getter for FromDate.
     * Effective start date of Block / Unblock Allowed Formats: – •	yyyyMMdd •	yyyyMMdd HH:mm Eg:
     * 20230512 14:30, 20230512 Optional Default value: •	 If the card status is “Active” then
     * Current date &amp; Time •	If the card status is “TemporaryBlock (Customer)” then null. Note:
     * •	Time is considered only when “IsTimeSupported” is true else it will be treated as a date.
     * •	Time will be passed in UTC time-zone. •	If the Card Status is “Temporary Block (Customer)”
     * and FromDate is provided – The fromdate &amp; time is considered as starting period of unblock
     * request.
     * @return Returns the String
     */
    @JsonGetter("FromDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFromDate() {
        return fromDate;
    }

    /**
     * Setter for FromDate.
     * Effective start date of Block / Unblock Allowed Formats: – •	yyyyMMdd •	yyyyMMdd HH:mm Eg:
     * 20230512 14:30, 20230512 Optional Default value: •	 If the card status is “Active” then
     * Current date &amp; Time •	If the card status is “TemporaryBlock (Customer)” then null. Note:
     * •	Time is considered only when “IsTimeSupported” is true else it will be treated as a date.
     * •	Time will be passed in UTC time-zone. •	If the Card Status is “Temporary Block (Customer)”
     * and FromDate is provided – The fromdate &amp; time is considered as starting period of unblock
     * request.
     * @param fromDate Value for String
     */
    @JsonSetter("FromDate")
    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    /**
     * Getter for ToDate.
     * Effective end date of Block / Unblock Allowed Formats: – •	yyyyMMdd •	yyyyMMdd HH:mm Eg:
     * 20230512 14:30, 20230512 Optional – When the Card status is Active else mandatory. When not
     * provided, the card will remain blocked until manually unblocked. Note: •	Time is considered
     * only when the “IsTimeSupported” flag is set as true, else it will be considered as only date.
     * •	Date &amp; Time passed in the request will be considered in UTC time-zone. •	If the card is
     * currently in ‘Temporary Block (Customer)’ status, then this date is treated as the unblock
     * date and is mandatory. •	If the Card Status is “Temporary Block (Customer)” and FromDate &amp;
     * ToDate is provided - The request will be considered as a scheduled specific period unblock
     * request.
     * @return Returns the String
     */
    @JsonGetter("ToDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getToDate() {
        return toDate;
    }

    /**
     * Setter for ToDate.
     * Effective end date of Block / Unblock Allowed Formats: – •	yyyyMMdd •	yyyyMMdd HH:mm Eg:
     * 20230512 14:30, 20230512 Optional – When the Card status is Active else mandatory. When not
     * provided, the card will remain blocked until manually unblocked. Note: •	Time is considered
     * only when the “IsTimeSupported” flag is set as true, else it will be considered as only date.
     * •	Date &amp; Time passed in the request will be considered in UTC time-zone. •	If the card is
     * currently in ‘Temporary Block (Customer)’ status, then this date is treated as the unblock
     * date and is mandatory. •	If the Card Status is “Temporary Block (Customer)” and FromDate &amp;
     * ToDate is provided - The request will be considered as a scheduled specific period unblock
     * request.
     * @param toDate Value for String
     */
    @JsonSetter("ToDate")
    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    /**
     * Internal Getter for Caller.
     * The caller to be notified with the status of the scheduled card block / unblock request.
     * Mandatory, if NotifyCaller is true. Maximum field length: 20
     * @return Returns the Internal String
     */
    @JsonGetter("Caller")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCaller() {
        return this.caller;
    }

    /**
     * Getter for Caller.
     * The caller to be notified with the status of the scheduled card block / unblock request.
     * Mandatory, if NotifyCaller is true. Maximum field length: 20
     * @return Returns the String
     */
    public String getCaller() {
        return OptionalNullable.getFrom(caller);
    }

    /**
     * Setter for Caller.
     * The caller to be notified with the status of the scheduled card block / unblock request.
     * Mandatory, if NotifyCaller is true. Maximum field length: 20
     * @param caller Value for String
     */
    @JsonSetter("Caller")
    public void setCaller(String caller) {
        this.caller = OptionalNullable.of(caller);
    }

    /**
     * UnSetter for Caller.
     * The caller to be notified with the status of the scheduled card block / unblock request.
     * Mandatory, if NotifyCaller is true. Maximum field length: 20
     */
    public void unsetCaller() {
        caller = null;
    }

    /**
     * Getter for NotifyCaller.
     * True/False. Optional. Default: False If true, the caller would be notified back with the
     * status as success or failure after the scheduled card block / unblock request is processed.
     * @return Returns the Boolean
     */
    @JsonGetter("NotifyCaller")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getNotifyCaller() {
        return notifyCaller;
    }

    /**
     * Setter for NotifyCaller.
     * True/False. Optional. Default: False If true, the caller would be notified back with the
     * status as success or failure after the scheduled card block / unblock request is processed.
     * @param notifyCaller Value for Boolean
     */
    @JsonSetter("NotifyCaller")
    public void setNotifyCaller(Boolean notifyCaller) {
        this.notifyCaller = notifyCaller;
    }

    /**
     * Converts this ScheduleCardBlockCardsItems into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ScheduleCardBlockCardsItems [" + "action=" + action + ", colCoCode=" + colCoCode
                + ", colCoId=" + colCoId + ", accountId=" + accountId + ", accountNumber="
                + accountNumber + ", payerId=" + payerId + ", payerNumber=" + payerNumber
                + ", cardId=" + cardId + ", pAN=" + pAN + ", cardExpiryDate=" + cardExpiryDate
                + ", fromDate=" + fromDate + ", toDate=" + toDate + ", caller=" + caller
                + ", notifyCaller=" + notifyCaller + "]";
    }

    /**
     * Builds a new {@link ScheduleCardBlockCardsItems.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ScheduleCardBlockCardsItems.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(action)
                .colCoCode(getColCoCode())
                .colCoId(getColCoId())
                .accountId(getAccountId())
                .accountNumber(getAccountNumber())
                .payerId(getPayerId())
                .payerNumber(getPayerNumber())
                .cardId(getCardId())
                .pAN(getPAN())
                .cardExpiryDate(getCardExpiryDate())
                .fromDate(getFromDate())
                .toDate(getToDate())
                .notifyCaller(getNotifyCaller());
        builder.caller = internalGetCaller();
        return builder;
    }

    /**
     * Class to build instances of {@link ScheduleCardBlockCardsItems}.
     */
    public static class Builder {
        private String action;
        private Integer colCoCode;
        private Integer colCoId;
        private Integer accountId;
        private String accountNumber;
        private Integer payerId;
        private String payerNumber;
        private Integer cardId;
        private String pAN;
        private String cardExpiryDate;
        private String fromDate;
        private String toDate;
        private OptionalNullable<String> caller;
        private Boolean notifyCaller;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  action  String value for action.
         */
        public Builder(String action) {
            this.action = action;
        }

        /**
         * Setter for action.
         * @param  action  String value for action.
         * @return Builder
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        /**
         * Setter for colCoCode.
         * @param  colCoCode  Integer value for colCoCode.
         * @return Builder
         */
        public Builder colCoCode(Integer colCoCode) {
            this.colCoCode = colCoCode;
            return this;
        }

        /**
         * Setter for colCoId.
         * @param  colCoId  Integer value for colCoId.
         * @return Builder
         */
        public Builder colCoId(Integer colCoId) {
            this.colCoId = colCoId;
            return this;
        }

        /**
         * Setter for accountId.
         * @param  accountId  Integer value for accountId.
         * @return Builder
         */
        public Builder accountId(Integer accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * Setter for accountNumber.
         * @param  accountNumber  String value for accountNumber.
         * @return Builder
         */
        public Builder accountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        /**
         * Setter for payerId.
         * @param  payerId  Integer value for payerId.
         * @return Builder
         */
        public Builder payerId(Integer payerId) {
            this.payerId = payerId;
            return this;
        }

        /**
         * Setter for payerNumber.
         * @param  payerNumber  String value for payerNumber.
         * @return Builder
         */
        public Builder payerNumber(String payerNumber) {
            this.payerNumber = payerNumber;
            return this;
        }

        /**
         * Setter for cardId.
         * @param  cardId  Integer value for cardId.
         * @return Builder
         */
        public Builder cardId(Integer cardId) {
            this.cardId = cardId;
            return this;
        }

        /**
         * Setter for pAN.
         * @param  pAN  String value for pAN.
         * @return Builder
         */
        public Builder pAN(String pAN) {
            this.pAN = pAN;
            return this;
        }

        /**
         * Setter for cardExpiryDate.
         * @param  cardExpiryDate  String value for cardExpiryDate.
         * @return Builder
         */
        public Builder cardExpiryDate(String cardExpiryDate) {
            this.cardExpiryDate = cardExpiryDate;
            return this;
        }

        /**
         * Setter for fromDate.
         * @param  fromDate  String value for fromDate.
         * @return Builder
         */
        public Builder fromDate(String fromDate) {
            this.fromDate = fromDate;
            return this;
        }

        /**
         * Setter for toDate.
         * @param  toDate  String value for toDate.
         * @return Builder
         */
        public Builder toDate(String toDate) {
            this.toDate = toDate;
            return this;
        }

        /**
         * Setter for caller.
         * @param  caller  String value for caller.
         * @return Builder
         */
        public Builder caller(String caller) {
            this.caller = OptionalNullable.of(caller);
            return this;
        }

        /**
         * UnSetter for caller.
         * @return Builder
         */
        public Builder unsetCaller() {
            caller = null;
            return this;
        }

        /**
         * Setter for notifyCaller.
         * @param  notifyCaller  Boolean value for notifyCaller.
         * @return Builder
         */
        public Builder notifyCaller(Boolean notifyCaller) {
            this.notifyCaller = notifyCaller;
            return this;
        }

        /**
         * Builds a new {@link ScheduleCardBlockCardsItems} object using the set fields.
         * @return {@link ScheduleCardBlockCardsItems}
         */
        public ScheduleCardBlockCardsItems build() {
            return new ScheduleCardBlockCardsItems(action, colCoCode, colCoId, accountId,
                    accountNumber, payerId, payerNumber, cardId, pAN, cardExpiryDate, fromDate,
                    toDate, caller, notifyCaller);
        }
    }
}

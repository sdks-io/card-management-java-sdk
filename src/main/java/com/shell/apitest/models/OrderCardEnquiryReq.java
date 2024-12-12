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
 * This is a model class for OrderCardEnquiryReq type.
 */
public class OrderCardEnquiryReq {
    private OptionalNullable<Integer> accountId;
    private OptionalNullable<String> accountNumber;
    private OptionalNullable<Integer> colCoCode;
    private OptionalNullable<Integer> colCoId;
    private OptionalNullable<String> colCoCountryCode;
    private OptionalNullable<Integer> payerId;
    private OptionalNullable<String> payerNumber;
    private Integer referenceNumber;
    private OrderCardEnquiryReqReferenceTypeEnum referenceType;
    private OptionalNullable<String> fromDate;
    private OptionalNullable<String> toDate;
    private OptionalNullable<String> orderRequestId;

    /**
     * Default constructor.
     */
    public OrderCardEnquiryReq() {
    }

    /**
     * Initialization constructor.
     * @param  accountId  Integer value for accountId.
     * @param  accountNumber  String value for accountNumber.
     * @param  colCoCode  Integer value for colCoCode.
     * @param  colCoId  Integer value for colCoId.
     * @param  colCoCountryCode  String value for colCoCountryCode.
     * @param  payerId  Integer value for payerId.
     * @param  payerNumber  String value for payerNumber.
     * @param  referenceNumber  Integer value for referenceNumber.
     * @param  referenceType  OrderCardEnquiryReqReferenceTypeEnum value for referenceType.
     * @param  fromDate  String value for fromDate.
     * @param  toDate  String value for toDate.
     * @param  orderRequestId  String value for orderRequestId.
     */
    public OrderCardEnquiryReq(
            Integer accountId,
            String accountNumber,
            Integer colCoCode,
            Integer colCoId,
            String colCoCountryCode,
            Integer payerId,
            String payerNumber,
            Integer referenceNumber,
            OrderCardEnquiryReqReferenceTypeEnum referenceType,
            String fromDate,
            String toDate,
            String orderRequestId) {
        this.accountId = OptionalNullable.of(accountId);
        this.accountNumber = OptionalNullable.of(accountNumber);
        this.colCoCode = OptionalNullable.of(colCoCode);
        this.colCoId = OptionalNullable.of(colCoId);
        this.colCoCountryCode = OptionalNullable.of(colCoCountryCode);
        this.payerId = OptionalNullable.of(payerId);
        this.payerNumber = OptionalNullable.of(payerNumber);
        this.referenceNumber = referenceNumber;
        this.referenceType = referenceType;
        this.fromDate = OptionalNullable.of(fromDate);
        this.toDate = OptionalNullable.of(toDate);
        this.orderRequestId = OptionalNullable.of(orderRequestId);
    }

    /**
     * Initialization constructor.
     * @param  accountId  Integer value for accountId.
     * @param  accountNumber  String value for accountNumber.
     * @param  colCoCode  Integer value for colCoCode.
     * @param  colCoId  Integer value for colCoId.
     * @param  colCoCountryCode  String value for colCoCountryCode.
     * @param  payerId  Integer value for payerId.
     * @param  payerNumber  String value for payerNumber.
     * @param  referenceNumber  Integer value for referenceNumber.
     * @param  referenceType  OrderCardEnquiryReqReferenceTypeEnum value for referenceType.
     * @param  fromDate  String value for fromDate.
     * @param  toDate  String value for toDate.
     * @param  orderRequestId  String value for orderRequestId.
     */

    protected OrderCardEnquiryReq(OptionalNullable<Integer> accountId,
            OptionalNullable<String> accountNumber, OptionalNullable<Integer> colCoCode,
            OptionalNullable<Integer> colCoId, OptionalNullable<String> colCoCountryCode,
            OptionalNullable<Integer> payerId, OptionalNullable<String> payerNumber,
            Integer referenceNumber, OrderCardEnquiryReqReferenceTypeEnum referenceType,
            OptionalNullable<String> fromDate, OptionalNullable<String> toDate,
            OptionalNullable<String> orderRequestId) {
        this.accountId = accountId;
        this.accountNumber = accountNumber;
        this.colCoCode = colCoCode;
        this.colCoId = colCoId;
        this.colCoCountryCode = colCoCountryCode;
        this.payerId = payerId;
        this.payerNumber = payerNumber;
        this.referenceNumber = referenceNumber;
        this.referenceType = referenceType;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.orderRequestId = orderRequestId;
    }

    /**
     * Internal Getter for AccountId.
     * Account ID of the customer.&lt;br/&gt; Optional if AccountNumber is passed, else mandatory. &lt;br/&gt;
     * This input is a search criterion, if given.
     * @return Returns the Internal Integer
     */
    @JsonGetter("AccountId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetAccountId() {
        return this.accountId;
    }

    /**
     * Getter for AccountId.
     * Account ID of the customer.&lt;br/&gt; Optional if AccountNumber is passed, else mandatory. &lt;br/&gt;
     * This input is a search criterion, if given.
     * @return Returns the Integer
     */
    public Integer getAccountId() {
        return OptionalNullable.getFrom(accountId);
    }

    /**
     * Setter for AccountId.
     * Account ID of the customer.&lt;br/&gt; Optional if AccountNumber is passed, else mandatory. &lt;br/&gt;
     * This input is a search criterion, if given.
     * @param accountId Value for Integer
     */
    @JsonSetter("AccountId")
    public void setAccountId(Integer accountId) {
        this.accountId = OptionalNullable.of(accountId);
    }

    /**
     * UnSetter for AccountId.
     * Account ID of the customer.&lt;br/&gt; Optional if AccountNumber is passed, else mandatory. &lt;br/&gt;
     * This input is a search criterion, if given.
     */
    public void unsetAccountId() {
        accountId = null;
    }

    /**
     * Internal Getter for AccountNumber.
     * Account Number of the customer.&lt;br/&gt; Optional if AccountId is passed, else mandatory.&lt;br/&gt;
     * This input is a search criterion, if given.
     * @return Returns the Internal String
     */
    @JsonGetter("AccountNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetAccountNumber() {
        return this.accountNumber;
    }

    /**
     * Getter for AccountNumber.
     * Account Number of the customer.&lt;br/&gt; Optional if AccountId is passed, else mandatory.&lt;br/&gt;
     * This input is a search criterion, if given.
     * @return Returns the String
     */
    public String getAccountNumber() {
        return OptionalNullable.getFrom(accountNumber);
    }

    /**
     * Setter for AccountNumber.
     * Account Number of the customer.&lt;br/&gt; Optional if AccountId is passed, else mandatory.&lt;br/&gt;
     * This input is a search criterion, if given.
     * @param accountNumber Value for String
     */
    @JsonSetter("AccountNumber")
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = OptionalNullable.of(accountNumber);
    }

    /**
     * UnSetter for AccountNumber.
     * Account Number of the customer.&lt;br/&gt; Optional if AccountId is passed, else mandatory.&lt;br/&gt;
     * This input is a search criterion, if given.
     */
    public void unsetAccountNumber() {
        accountNumber = null;
    }

    /**
     * Internal Getter for ColCoCode.
     * Collecting Company Code (Shell Code) of the selected payer. &lt;br /&gt; Optional – when
     * ‘ReferenceNumber’ is provided.&lt;br /&gt;
     * @return Returns the Internal Integer
     */
    @JsonGetter("ColCoCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetColCoCode() {
        return this.colCoCode;
    }

    /**
     * Getter for ColCoCode.
     * Collecting Company Code (Shell Code) of the selected payer. &lt;br /&gt; Optional – when
     * ‘ReferenceNumber’ is provided.&lt;br /&gt;
     * @return Returns the Integer
     */
    public Integer getColCoCode() {
        return OptionalNullable.getFrom(colCoCode);
    }

    /**
     * Setter for ColCoCode.
     * Collecting Company Code (Shell Code) of the selected payer. &lt;br /&gt; Optional – when
     * ‘ReferenceNumber’ is provided.&lt;br /&gt;
     * @param colCoCode Value for Integer
     */
    @JsonSetter("ColCoCode")
    public void setColCoCode(Integer colCoCode) {
        this.colCoCode = OptionalNullable.of(colCoCode);
    }

    /**
     * UnSetter for ColCoCode.
     * Collecting Company Code (Shell Code) of the selected payer. &lt;br /&gt; Optional – when
     * ‘ReferenceNumber’ is provided.&lt;br /&gt;
     */
    public void unsetColCoCode() {
        colCoCode = null;
    }

    /**
     * Internal Getter for ColCoId.
     * Collecting Company Id (in ) of the selected payer. &lt;br /&gt; Optional – when ‘ReferenceNumber’
     * is provided. Else, either ‘ColCoId’ or ‘ColCoCode’ is mandatory.&lt;br /&gt;
     * @return Returns the Internal Integer
     */
    @JsonGetter("ColCoId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetColCoId() {
        return this.colCoId;
    }

    /**
     * Getter for ColCoId.
     * Collecting Company Id (in ) of the selected payer. &lt;br /&gt; Optional – when ‘ReferenceNumber’
     * is provided. Else, either ‘ColCoId’ or ‘ColCoCode’ is mandatory.&lt;br /&gt;
     * @return Returns the Integer
     */
    public Integer getColCoId() {
        return OptionalNullable.getFrom(colCoId);
    }

    /**
     * Setter for ColCoId.
     * Collecting Company Id (in ) of the selected payer. &lt;br /&gt; Optional – when ‘ReferenceNumber’
     * is provided. Else, either ‘ColCoId’ or ‘ColCoCode’ is mandatory.&lt;br /&gt;
     * @param colCoId Value for Integer
     */
    @JsonSetter("ColCoId")
    public void setColCoId(Integer colCoId) {
        this.colCoId = OptionalNullable.of(colCoId);
    }

    /**
     * UnSetter for ColCoId.
     * Collecting Company Id (in ) of the selected payer. &lt;br /&gt; Optional – when ‘ReferenceNumber’
     * is provided. Else, either ‘ColCoId’ or ‘ColCoCode’ is mandatory.&lt;br /&gt;
     */
    public void unsetColCoId() {
        colCoId = null;
    }

    /**
     * Internal Getter for ColCoCountryCode.
     * ISO 3166 Alpha-2 Country Code for the customer and card owning country.
     * @return Returns the Internal String
     */
    @JsonGetter("ColCoCountryCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetColCoCountryCode() {
        return this.colCoCountryCode;
    }

    /**
     * Getter for ColCoCountryCode.
     * ISO 3166 Alpha-2 Country Code for the customer and card owning country.
     * @return Returns the String
     */
    public String getColCoCountryCode() {
        return OptionalNullable.getFrom(colCoCountryCode);
    }

    /**
     * Setter for ColCoCountryCode.
     * ISO 3166 Alpha-2 Country Code for the customer and card owning country.
     * @param colCoCountryCode Value for String
     */
    @JsonSetter("ColCoCountryCode")
    public void setColCoCountryCode(String colCoCountryCode) {
        this.colCoCountryCode = OptionalNullable.of(colCoCountryCode);
    }

    /**
     * UnSetter for ColCoCountryCode.
     * ISO 3166 Alpha-2 Country Code for the customer and card owning country.
     */
    public void unsetColCoCountryCode() {
        colCoCountryCode = null;
    }

    /**
     * Internal Getter for PayerId.
     * Payer Id (i.e. Customer Id of the Payment Customer) of the selected payer.&lt;br /&gt; Optional –
     * when ‘ReferenceNumber’ is provided. Else, either ‘PayerId’ or ‘PayerNumber’ is mandatory.
     * @return Returns the Internal Integer
     */
    @JsonGetter("PayerId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetPayerId() {
        return this.payerId;
    }

    /**
     * Getter for PayerId.
     * Payer Id (i.e. Customer Id of the Payment Customer) of the selected payer.&lt;br /&gt; Optional –
     * when ‘ReferenceNumber’ is provided. Else, either ‘PayerId’ or ‘PayerNumber’ is mandatory.
     * @return Returns the Integer
     */
    public Integer getPayerId() {
        return OptionalNullable.getFrom(payerId);
    }

    /**
     * Setter for PayerId.
     * Payer Id (i.e. Customer Id of the Payment Customer) of the selected payer.&lt;br /&gt; Optional –
     * when ‘ReferenceNumber’ is provided. Else, either ‘PayerId’ or ‘PayerNumber’ is mandatory.
     * @param payerId Value for Integer
     */
    @JsonSetter("PayerId")
    public void setPayerId(Integer payerId) {
        this.payerId = OptionalNullable.of(payerId);
    }

    /**
     * UnSetter for PayerId.
     * Payer Id (i.e. Customer Id of the Payment Customer) of the selected payer.&lt;br /&gt; Optional –
     * when ‘ReferenceNumber’ is provided. Else, either ‘PayerId’ or ‘PayerNumber’ is mandatory.
     */
    public void unsetPayerId() {
        payerId = null;
    }

    /**
     * Internal Getter for PayerNumber.
     * Payer Number of the selected payer.&lt;br /&gt; Optional – when ‘ReferenceNumber’ is provided.
     * Else, either ‘PayerId’ or ‘PayerNumber’ is mandatory.
     * @return Returns the Internal String
     */
    @JsonGetter("PayerNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPayerNumber() {
        return this.payerNumber;
    }

    /**
     * Getter for PayerNumber.
     * Payer Number of the selected payer.&lt;br /&gt; Optional – when ‘ReferenceNumber’ is provided.
     * Else, either ‘PayerId’ or ‘PayerNumber’ is mandatory.
     * @return Returns the String
     */
    public String getPayerNumber() {
        return OptionalNullable.getFrom(payerNumber);
    }

    /**
     * Setter for PayerNumber.
     * Payer Number of the selected payer.&lt;br /&gt; Optional – when ‘ReferenceNumber’ is provided.
     * Else, either ‘PayerId’ or ‘PayerNumber’ is mandatory.
     * @param payerNumber Value for String
     */
    @JsonSetter("PayerNumber")
    public void setPayerNumber(String payerNumber) {
        this.payerNumber = OptionalNullable.of(payerNumber);
    }

    /**
     * UnSetter for PayerNumber.
     * Payer Number of the selected payer.&lt;br /&gt; Optional – when ‘ReferenceNumber’ is provided.
     * Else, either ‘PayerId’ or ‘PayerNumber’ is mandatory.
     */
    public void unsetPayerNumber() {
        payerNumber = null;
    }

    /**
     * Getter for ReferenceNumber.
     * Reference number of the Card Order/ Bulk Card Order/ Order Card Request.&lt;br /&gt; Mandatory when
     * ColCo and Payer fields are not provided. Else, optional.
     * @return Returns the Integer
     */
    @JsonGetter("ReferenceNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Setter for ReferenceNumber.
     * Reference number of the Card Order/ Bulk Card Order/ Order Card Request.&lt;br /&gt; Mandatory when
     * ColCo and Payer fields are not provided. Else, optional.
     * @param referenceNumber Value for Integer
     */
    @JsonSetter("ReferenceNumber")
    public void setReferenceNumber(Integer referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    /**
     * Getter for ReferenceType.
     * @return Returns the OrderCardEnquiryReqReferenceTypeEnum
     */
    @JsonGetter("ReferenceType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OrderCardEnquiryReqReferenceTypeEnum getReferenceType() {
        return referenceType;
    }

    /**
     * Setter for ReferenceType.
     * @param referenceType Value for OrderCardEnquiryReqReferenceTypeEnum
     */
    @JsonSetter("ReferenceType")
    public void setReferenceType(OrderCardEnquiryReqReferenceTypeEnum referenceType) {
        this.referenceType = referenceType;
    }

    /**
     * Internal Getter for FromDate.
     * Card Orders from Date/Time.&lt;br /&gt; Optional.&lt;br /&gt; Value should be with in last 7 days&lt;br /&gt;
     * This field is ignored if ReferenceNumber is provided &lt;br /&gt; This field is optional when not
     * provided and ReferenceNumber is null or empty then the value should be set to D-7(Where D is
     * current date)&lt;br /&gt; Format: yyyyMMdd
     * @return Returns the Internal String
     */
    @JsonGetter("FromDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetFromDate() {
        return this.fromDate;
    }

    /**
     * Getter for FromDate.
     * Card Orders from Date/Time.&lt;br /&gt; Optional.&lt;br /&gt; Value should be with in last 7 days&lt;br /&gt;
     * This field is ignored if ReferenceNumber is provided &lt;br /&gt; This field is optional when not
     * provided and ReferenceNumber is null or empty then the value should be set to D-7(Where D is
     * current date)&lt;br /&gt; Format: yyyyMMdd
     * @return Returns the String
     */
    public String getFromDate() {
        return OptionalNullable.getFrom(fromDate);
    }

    /**
     * Setter for FromDate.
     * Card Orders from Date/Time.&lt;br /&gt; Optional.&lt;br /&gt; Value should be with in last 7 days&lt;br /&gt;
     * This field is ignored if ReferenceNumber is provided &lt;br /&gt; This field is optional when not
     * provided and ReferenceNumber is null or empty then the value should be set to D-7(Where D is
     * current date)&lt;br /&gt; Format: yyyyMMdd
     * @param fromDate Value for String
     */
    @JsonSetter("FromDate")
    public void setFromDate(String fromDate) {
        this.fromDate = OptionalNullable.of(fromDate);
    }

    /**
     * UnSetter for FromDate.
     * Card Orders from Date/Time.&lt;br /&gt; Optional.&lt;br /&gt; Value should be with in last 7 days&lt;br /&gt;
     * This field is ignored if ReferenceNumber is provided &lt;br /&gt; This field is optional when not
     * provided and ReferenceNumber is null or empty then the value should be set to D-7(Where D is
     * current date)&lt;br /&gt; Format: yyyyMMdd
     */
    public void unsetFromDate() {
        fromDate = null;
    }

    /**
     * Internal Getter for ToDate.
     * Card Order to Date/Time&lt;br /&gt; Optional&lt;br /&gt; Value should be with in last 7 days&lt;br /&gt; This
     * field is ignored if ReferenceNumber is provided &lt;br /&gt; This field is optional when not
     * provided and ReferenceNumber is null or empty then the value should be set to current date&lt;br
     * /&gt; Format: yyyyMMdd
     * @return Returns the Internal String
     */
    @JsonGetter("ToDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetToDate() {
        return this.toDate;
    }

    /**
     * Getter for ToDate.
     * Card Order to Date/Time&lt;br /&gt; Optional&lt;br /&gt; Value should be with in last 7 days&lt;br /&gt; This
     * field is ignored if ReferenceNumber is provided &lt;br /&gt; This field is optional when not
     * provided and ReferenceNumber is null or empty then the value should be set to current date&lt;br
     * /&gt; Format: yyyyMMdd
     * @return Returns the String
     */
    public String getToDate() {
        return OptionalNullable.getFrom(toDate);
    }

    /**
     * Setter for ToDate.
     * Card Order to Date/Time&lt;br /&gt; Optional&lt;br /&gt; Value should be with in last 7 days&lt;br /&gt; This
     * field is ignored if ReferenceNumber is provided &lt;br /&gt; This field is optional when not
     * provided and ReferenceNumber is null or empty then the value should be set to current date&lt;br
     * /&gt; Format: yyyyMMdd
     * @param toDate Value for String
     */
    @JsonSetter("ToDate")
    public void setToDate(String toDate) {
        this.toDate = OptionalNullable.of(toDate);
    }

    /**
     * UnSetter for ToDate.
     * Card Order to Date/Time&lt;br /&gt; Optional&lt;br /&gt; Value should be with in last 7 days&lt;br /&gt; This
     * field is ignored if ReferenceNumber is provided &lt;br /&gt; This field is optional when not
     * provided and ReferenceNumber is null or empty then the value should be set to current date&lt;br
     * /&gt; Format: yyyyMMdd
     */
    public void unsetToDate() {
        toDate = null;
    }

    /**
     * Internal Getter for OrderRequestId.
     * Client provided Unique Id of the original Order Card request, the status of which is enquired
     * by this API
     * @return Returns the Internal String
     */
    @JsonGetter("OrderRequestId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetOrderRequestId() {
        return this.orderRequestId;
    }

    /**
     * Getter for OrderRequestId.
     * Client provided Unique Id of the original Order Card request, the status of which is enquired
     * by this API
     * @return Returns the String
     */
    public String getOrderRequestId() {
        return OptionalNullable.getFrom(orderRequestId);
    }

    /**
     * Setter for OrderRequestId.
     * Client provided Unique Id of the original Order Card request, the status of which is enquired
     * by this API
     * @param orderRequestId Value for String
     */
    @JsonSetter("OrderRequestId")
    public void setOrderRequestId(String orderRequestId) {
        this.orderRequestId = OptionalNullable.of(orderRequestId);
    }

    /**
     * UnSetter for OrderRequestId.
     * Client provided Unique Id of the original Order Card request, the status of which is enquired
     * by this API
     */
    public void unsetOrderRequestId() {
        orderRequestId = null;
    }

    /**
     * Converts this OrderCardEnquiryReq into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrderCardEnquiryReq [" + "accountId=" + accountId + ", accountNumber="
                + accountNumber + ", colCoCode=" + colCoCode + ", colCoId=" + colCoId
                + ", colCoCountryCode=" + colCoCountryCode + ", payerId=" + payerId
                + ", payerNumber=" + payerNumber + ", referenceNumber=" + referenceNumber
                + ", referenceType=" + referenceType + ", fromDate=" + fromDate + ", toDate="
                + toDate + ", orderRequestId=" + orderRequestId + "]";
    }

    /**
     * Builds a new {@link OrderCardEnquiryReq.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrderCardEnquiryReq.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .referenceNumber(getReferenceNumber())
                .referenceType(getReferenceType());
        builder.accountId = internalGetAccountId();
        builder.accountNumber = internalGetAccountNumber();
        builder.colCoCode = internalGetColCoCode();
        builder.colCoId = internalGetColCoId();
        builder.colCoCountryCode = internalGetColCoCountryCode();
        builder.payerId = internalGetPayerId();
        builder.payerNumber = internalGetPayerNumber();
        builder.fromDate = internalGetFromDate();
        builder.toDate = internalGetToDate();
        builder.orderRequestId = internalGetOrderRequestId();
        return builder;
    }

    /**
     * Class to build instances of {@link OrderCardEnquiryReq}.
     */
    public static class Builder {
        private OptionalNullable<Integer> accountId;
        private OptionalNullable<String> accountNumber;
        private OptionalNullable<Integer> colCoCode;
        private OptionalNullable<Integer> colCoId;
        private OptionalNullable<String> colCoCountryCode;
        private OptionalNullable<Integer> payerId;
        private OptionalNullable<String> payerNumber;
        private Integer referenceNumber;
        private OrderCardEnquiryReqReferenceTypeEnum referenceType;
        private OptionalNullable<String> fromDate;
        private OptionalNullable<String> toDate;
        private OptionalNullable<String> orderRequestId;



        /**
         * Setter for accountId.
         * @param  accountId  Integer value for accountId.
         * @return Builder
         */
        public Builder accountId(Integer accountId) {
            this.accountId = OptionalNullable.of(accountId);
            return this;
        }

        /**
         * UnSetter for accountId.
         * @return Builder
         */
        public Builder unsetAccountId() {
            accountId = null;
            return this;
        }

        /**
         * Setter for accountNumber.
         * @param  accountNumber  String value for accountNumber.
         * @return Builder
         */
        public Builder accountNumber(String accountNumber) {
            this.accountNumber = OptionalNullable.of(accountNumber);
            return this;
        }

        /**
         * UnSetter for accountNumber.
         * @return Builder
         */
        public Builder unsetAccountNumber() {
            accountNumber = null;
            return this;
        }

        /**
         * Setter for colCoCode.
         * @param  colCoCode  Integer value for colCoCode.
         * @return Builder
         */
        public Builder colCoCode(Integer colCoCode) {
            this.colCoCode = OptionalNullable.of(colCoCode);
            return this;
        }

        /**
         * UnSetter for colCoCode.
         * @return Builder
         */
        public Builder unsetColCoCode() {
            colCoCode = null;
            return this;
        }

        /**
         * Setter for colCoId.
         * @param  colCoId  Integer value for colCoId.
         * @return Builder
         */
        public Builder colCoId(Integer colCoId) {
            this.colCoId = OptionalNullable.of(colCoId);
            return this;
        }

        /**
         * UnSetter for colCoId.
         * @return Builder
         */
        public Builder unsetColCoId() {
            colCoId = null;
            return this;
        }

        /**
         * Setter for colCoCountryCode.
         * @param  colCoCountryCode  String value for colCoCountryCode.
         * @return Builder
         */
        public Builder colCoCountryCode(String colCoCountryCode) {
            this.colCoCountryCode = OptionalNullable.of(colCoCountryCode);
            return this;
        }

        /**
         * UnSetter for colCoCountryCode.
         * @return Builder
         */
        public Builder unsetColCoCountryCode() {
            colCoCountryCode = null;
            return this;
        }

        /**
         * Setter for payerId.
         * @param  payerId  Integer value for payerId.
         * @return Builder
         */
        public Builder payerId(Integer payerId) {
            this.payerId = OptionalNullable.of(payerId);
            return this;
        }

        /**
         * UnSetter for payerId.
         * @return Builder
         */
        public Builder unsetPayerId() {
            payerId = null;
            return this;
        }

        /**
         * Setter for payerNumber.
         * @param  payerNumber  String value for payerNumber.
         * @return Builder
         */
        public Builder payerNumber(String payerNumber) {
            this.payerNumber = OptionalNullable.of(payerNumber);
            return this;
        }

        /**
         * UnSetter for payerNumber.
         * @return Builder
         */
        public Builder unsetPayerNumber() {
            payerNumber = null;
            return this;
        }

        /**
         * Setter for referenceNumber.
         * @param  referenceNumber  Integer value for referenceNumber.
         * @return Builder
         */
        public Builder referenceNumber(Integer referenceNumber) {
            this.referenceNumber = referenceNumber;
            return this;
        }

        /**
         * Setter for referenceType.
         * @param  referenceType  OrderCardEnquiryReqReferenceTypeEnum value for referenceType.
         * @return Builder
         */
        public Builder referenceType(OrderCardEnquiryReqReferenceTypeEnum referenceType) {
            this.referenceType = referenceType;
            return this;
        }

        /**
         * Setter for fromDate.
         * @param  fromDate  String value for fromDate.
         * @return Builder
         */
        public Builder fromDate(String fromDate) {
            this.fromDate = OptionalNullable.of(fromDate);
            return this;
        }

        /**
         * UnSetter for fromDate.
         * @return Builder
         */
        public Builder unsetFromDate() {
            fromDate = null;
            return this;
        }

        /**
         * Setter for toDate.
         * @param  toDate  String value for toDate.
         * @return Builder
         */
        public Builder toDate(String toDate) {
            this.toDate = OptionalNullable.of(toDate);
            return this;
        }

        /**
         * UnSetter for toDate.
         * @return Builder
         */
        public Builder unsetToDate() {
            toDate = null;
            return this;
        }

        /**
         * Setter for orderRequestId.
         * @param  orderRequestId  String value for orderRequestId.
         * @return Builder
         */
        public Builder orderRequestId(String orderRequestId) {
            this.orderRequestId = OptionalNullable.of(orderRequestId);
            return this;
        }

        /**
         * UnSetter for orderRequestId.
         * @return Builder
         */
        public Builder unsetOrderRequestId() {
            orderRequestId = null;
            return this;
        }

        /**
         * Builds a new {@link OrderCardEnquiryReq} object using the set fields.
         * @return {@link OrderCardEnquiryReq}
         */
        public OrderCardEnquiryReq build() {
            return new OrderCardEnquiryReq(accountId, accountNumber, colCoCode, colCoId,
                    colCoCountryCode, payerId, payerNumber, referenceNumber, referenceType,
                    fromDate, toDate, orderRequestId);
        }
    }
}

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
 * This is a model class for UpdateBundleRequest type.
 */
public class UpdateBundleRequest {
    private OptionalNullable<Integer> colCoId;
    private OptionalNullable<Integer> colCoCode;
    private OptionalNullable<String> payerId;
    private OptionalNullable<String> payerNumber;
    private OptionalNullable<Integer> accountId;
    private OptionalNullable<String> accountNumber;
    private String bundleId;
    private String requestAction;
    private List<String> cards;
    private String usageRestrictionAction;
    private BundleRestrictionUpdate restrictions;

    /**
     * Default constructor.
     */
    public UpdateBundleRequest() {
    }

    /**
     * Initialization constructor.
     * @param  bundleId  String value for bundleId.
     * @param  requestAction  String value for requestAction.
     * @param  cards  List of String value for cards.
     * @param  usageRestrictionAction  String value for usageRestrictionAction.
     * @param  colCoId  Integer value for colCoId.
     * @param  colCoCode  Integer value for colCoCode.
     * @param  payerId  String value for payerId.
     * @param  payerNumber  String value for payerNumber.
     * @param  accountId  Integer value for accountId.
     * @param  accountNumber  String value for accountNumber.
     * @param  restrictions  BundleRestrictionUpdate value for restrictions.
     */
    public UpdateBundleRequest(
            String bundleId,
            String requestAction,
            List<String> cards,
            String usageRestrictionAction,
            Integer colCoId,
            Integer colCoCode,
            String payerId,
            String payerNumber,
            Integer accountId,
            String accountNumber,
            BundleRestrictionUpdate restrictions) {
        this.colCoId = OptionalNullable.of(colCoId);
        this.colCoCode = OptionalNullable.of(colCoCode);
        this.payerId = OptionalNullable.of(payerId);
        this.payerNumber = OptionalNullable.of(payerNumber);
        this.accountId = OptionalNullable.of(accountId);
        this.accountNumber = OptionalNullable.of(accountNumber);
        this.bundleId = bundleId;
        this.requestAction = requestAction;
        this.cards = cards;
        this.usageRestrictionAction = usageRestrictionAction;
        this.restrictions = restrictions;
    }

    /**
     * Initialization constructor.
     * @param  bundleId  String value for bundleId.
     * @param  requestAction  String value for requestAction.
     * @param  cards  List of String value for cards.
     * @param  usageRestrictionAction  String value for usageRestrictionAction.
     * @param  colCoId  Integer value for colCoId.
     * @param  colCoCode  Integer value for colCoCode.
     * @param  payerId  String value for payerId.
     * @param  payerNumber  String value for payerNumber.
     * @param  accountId  Integer value for accountId.
     * @param  accountNumber  String value for accountNumber.
     * @param  restrictions  BundleRestrictionUpdate value for restrictions.
     */

    protected UpdateBundleRequest(String bundleId, String requestAction, List<String> cards,
            String usageRestrictionAction, OptionalNullable<Integer> colCoId,
            OptionalNullable<Integer> colCoCode, OptionalNullable<String> payerId,
            OptionalNullable<String> payerNumber, OptionalNullable<Integer> accountId,
            OptionalNullable<String> accountNumber, BundleRestrictionUpdate restrictions) {
        this.colCoId = colCoId;
        this.colCoCode = colCoCode;
        this.payerId = payerId;
        this.payerNumber = payerNumber;
        this.accountId = accountId;
        this.accountNumber = accountNumber;
        this.bundleId = bundleId;
        this.requestAction = requestAction;
        this.cards = cards;
        this.usageRestrictionAction = usageRestrictionAction;
        this.restrictions = restrictions;
    }

    /**
     * Internal Getter for ColCoId.
     * Collecting Company Id of the selected payer. Optional if ColCoCode is passed else Mandatory.
     * Example: 1 for Philippines 5 for UK
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
     * Collecting Company Id of the selected payer. Optional if ColCoCode is passed else Mandatory.
     * Example: 1 for Philippines 5 for UK
     * @return Returns the Integer
     */
    public Integer getColCoId() {
        return OptionalNullable.getFrom(colCoId);
    }

    /**
     * Setter for ColCoId.
     * Collecting Company Id of the selected payer. Optional if ColCoCode is passed else Mandatory.
     * Example: 1 for Philippines 5 for UK
     * @param colCoId Value for Integer
     */
    @JsonSetter("ColCoId")
    public void setColCoId(Integer colCoId) {
        this.colCoId = OptionalNullable.of(colCoId);
    }

    /**
     * UnSetter for ColCoId.
     * Collecting Company Id of the selected payer. Optional if ColCoCode is passed else Mandatory.
     * Example: 1 for Philippines 5 for UK
     */
    public void unsetColCoId() {
        colCoId = null;
    }

    /**
     * Internal Getter for ColCoCode.
     * Collecting Company Code of the selected payer. Mandatory for serviced OUs such as Romania,
     * Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if ColCoID is
     * provided. Example: 86 for Philippines 5 for UK
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
     * Collecting Company Code of the selected payer. Mandatory for serviced OUs such as Romania,
     * Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if ColCoID is
     * provided. Example: 86 for Philippines 5 for UK
     * @return Returns the Integer
     */
    public Integer getColCoCode() {
        return OptionalNullable.getFrom(colCoCode);
    }

    /**
     * Setter for ColCoCode.
     * Collecting Company Code of the selected payer. Mandatory for serviced OUs such as Romania,
     * Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if ColCoID is
     * provided. Example: 86 for Philippines 5 for UK
     * @param colCoCode Value for Integer
     */
    @JsonSetter("ColCoCode")
    public void setColCoCode(Integer colCoCode) {
        this.colCoCode = OptionalNullable.of(colCoCode);
    }

    /**
     * UnSetter for ColCoCode.
     * Collecting Company Code of the selected payer. Mandatory for serviced OUs such as Romania,
     * Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if ColCoID is
     * provided. Example: 86 for Philippines 5 for UK
     */
    public void unsetColCoCode() {
        colCoCode = null;
    }

    /**
     * Internal Getter for PayerId.
     * Payer Id of the selected payer. Either PayerId or PayerNumber or both must be passed.
     * Example: 123456
     * @return Returns the Internal String
     */
    @JsonGetter("PayerId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPayerId() {
        return this.payerId;
    }

    /**
     * Getter for PayerId.
     * Payer Id of the selected payer. Either PayerId or PayerNumber or both must be passed.
     * Example: 123456
     * @return Returns the String
     */
    public String getPayerId() {
        return OptionalNullable.getFrom(payerId);
    }

    /**
     * Setter for PayerId.
     * Payer Id of the selected payer. Either PayerId or PayerNumber or both must be passed.
     * Example: 123456
     * @param payerId Value for String
     */
    @JsonSetter("PayerId")
    public void setPayerId(String payerId) {
        this.payerId = OptionalNullable.of(payerId);
    }

    /**
     * UnSetter for PayerId.
     * Payer Id of the selected payer. Either PayerId or PayerNumber or both must be passed.
     * Example: 123456
     */
    public void unsetPayerId() {
        payerId = null;
    }

    /**
     * Internal Getter for PayerNumber.
     * Payer Number of the selected payer. Either PayerId or PayerNumber or both must be passed.
     * Example: GB000000123
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
     * Payer Number of the selected payer. Either PayerId or PayerNumber or both must be passed.
     * Example: GB000000123
     * @return Returns the String
     */
    public String getPayerNumber() {
        return OptionalNullable.getFrom(payerNumber);
    }

    /**
     * Setter for PayerNumber.
     * Payer Number of the selected payer. Either PayerId or PayerNumber or both must be passed.
     * Example: GB000000123
     * @param payerNumber Value for String
     */
    @JsonSetter("PayerNumber")
    public void setPayerNumber(String payerNumber) {
        this.payerNumber = OptionalNullable.of(payerNumber);
    }

    /**
     * UnSetter for PayerNumber.
     * Payer Number of the selected payer. Either PayerId or PayerNumber or both must be passed.
     * Example: GB000000123
     */
    public void unsetPayerNumber() {
        payerNumber = null;
    }

    /**
     * Internal Getter for AccountId.
     * Account ID of the customer. Either AccountId or AccountNumber or both must be passed.
     * Example: 123456
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
     * Account ID of the customer. Either AccountId or AccountNumber or both must be passed.
     * Example: 123456
     * @return Returns the Integer
     */
    public Integer getAccountId() {
        return OptionalNullable.getFrom(accountId);
    }

    /**
     * Setter for AccountId.
     * Account ID of the customer. Either AccountId or AccountNumber or both must be passed.
     * Example: 123456
     * @param accountId Value for Integer
     */
    @JsonSetter("AccountId")
    public void setAccountId(Integer accountId) {
        this.accountId = OptionalNullable.of(accountId);
    }

    /**
     * UnSetter for AccountId.
     * Account ID of the customer. Either AccountId or AccountNumber or both must be passed.
     * Example: 123456
     */
    public void unsetAccountId() {
        accountId = null;
    }

    /**
     * Internal Getter for AccountNumber.
     * Account Number of the customer. Either AccountId or AccountNumber or both must be passed.
     * Example: GB000000123
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
     * Account Number of the customer. Either AccountId or AccountNumber or both must be passed.
     * Example: GB000000123
     * @return Returns the String
     */
    public String getAccountNumber() {
        return OptionalNullable.getFrom(accountNumber);
    }

    /**
     * Setter for AccountNumber.
     * Account Number of the customer. Either AccountId or AccountNumber or both must be passed.
     * Example: GB000000123
     * @param accountNumber Value for String
     */
    @JsonSetter("AccountNumber")
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = OptionalNullable.of(accountNumber);
    }

    /**
     * UnSetter for AccountNumber.
     * Account Number of the customer. Either AccountId or AccountNumber or both must be passed.
     * Example: GB000000123
     */
    public void unsetAccountNumber() {
        accountNumber = null;
    }

    /**
     * Getter for BundleId.
     * Identifier of the bundle in Gateway. Mandatory
     * @return Returns the String
     */
    @JsonGetter("BundleId")
    public String getBundleId() {
        return bundleId;
    }

    /**
     * Setter for BundleId.
     * Identifier of the bundle in Gateway. Mandatory
     * @param bundleId Value for String
     */
    @JsonSetter("BundleId")
    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    /**
     * Getter for RequestAction.
     * The value indicates the action to be performed with the request. Mandatory Allowed values:
     * •	Add •	Update •	Remove
     * @return Returns the String
     */
    @JsonGetter("RequestAction")
    public String getRequestAction() {
        return requestAction;
    }

    /**
     * Setter for RequestAction.
     * The value indicates the action to be performed with the request. Mandatory Allowed values:
     * •	Add •	Update •	Remove
     * @param requestAction Value for String
     */
    @JsonSetter("RequestAction")
    public void setRequestAction(String requestAction) {
        this.requestAction = requestAction;
    }

    /**
     * Getter for Cards.
     * List of Card PANs to be added in the bundle. Mandatory for Add / Remove request action.
     * Ignored for Update action. Example: 7002051006629890645 When PAN matches with multiple cards,
     * the restriction will be applied on the latest issued card.
     * @return Returns the List of String
     */
    @JsonGetter("Cards")
    public List<String> getCards() {
        return cards;
    }

    /**
     * Setter for Cards.
     * List of Card PANs to be added in the bundle. Mandatory for Add / Remove request action.
     * Ignored for Update action. Example: 7002051006629890645 When PAN matches with multiple cards,
     * the restriction will be applied on the latest issued card.
     * @param cards Value for List of String
     */
    @JsonSetter("Cards")
    public void setCards(List<String> cards) {
        this.cards = cards;
    }

    /**
     * Getter for UsageRestrictionAction.
     * The value indicates what actions to be performed with respect to usage restrictions on the
     * list of cards being added or removed. Mandatory for Add / Remove request action. Ignored for
     * Update action. Allowed values: •	Update •	None
     * @return Returns the String
     */
    @JsonGetter("UsageRestrictionAction")
    public String getUsageRestrictionAction() {
        return usageRestrictionAction;
    }

    /**
     * Setter for UsageRestrictionAction.
     * The value indicates what actions to be performed with respect to usage restrictions on the
     * list of cards being added or removed. Mandatory for Add / Remove request action. Ignored for
     * Update action. Allowed values: •	Update •	None
     * @param usageRestrictionAction Value for String
     */
    @JsonSetter("UsageRestrictionAction")
    public void setUsageRestrictionAction(String usageRestrictionAction) {
        this.usageRestrictionAction = usageRestrictionAction;
    }

    /**
     * Getter for Restrictions.
     * @return Returns the BundleRestrictionUpdate
     */
    @JsonGetter("Restrictions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BundleRestrictionUpdate getRestrictions() {
        return restrictions;
    }

    /**
     * Setter for Restrictions.
     * @param restrictions Value for BundleRestrictionUpdate
     */
    @JsonSetter("Restrictions")
    public void setRestrictions(BundleRestrictionUpdate restrictions) {
        this.restrictions = restrictions;
    }

    /**
     * Converts this UpdateBundleRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateBundleRequest [" + "bundleId=" + bundleId + ", requestAction=" + requestAction
                + ", cards=" + cards + ", usageRestrictionAction=" + usageRestrictionAction
                + ", colCoId=" + colCoId + ", colCoCode=" + colCoCode + ", payerId=" + payerId
                + ", payerNumber=" + payerNumber + ", accountId=" + accountId + ", accountNumber="
                + accountNumber + ", restrictions=" + restrictions + "]";
    }

    /**
     * Builds a new {@link UpdateBundleRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateBundleRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(bundleId, requestAction, cards, usageRestrictionAction)
                .restrictions(getRestrictions());
        builder.colCoId = internalGetColCoId();
        builder.colCoCode = internalGetColCoCode();
        builder.payerId = internalGetPayerId();
        builder.payerNumber = internalGetPayerNumber();
        builder.accountId = internalGetAccountId();
        builder.accountNumber = internalGetAccountNumber();
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateBundleRequest}.
     */
    public static class Builder {
        private String bundleId;
        private String requestAction;
        private List<String> cards;
        private String usageRestrictionAction;
        private OptionalNullable<Integer> colCoId;
        private OptionalNullable<Integer> colCoCode;
        private OptionalNullable<String> payerId;
        private OptionalNullable<String> payerNumber;
        private OptionalNullable<Integer> accountId;
        private OptionalNullable<String> accountNumber;
        private BundleRestrictionUpdate restrictions;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  bundleId  String value for bundleId.
         * @param  requestAction  String value for requestAction.
         * @param  cards  List of String value for cards.
         * @param  usageRestrictionAction  String value for usageRestrictionAction.
         */
        public Builder(String bundleId, String requestAction, List<String> cards,
                String usageRestrictionAction) {
            this.bundleId = bundleId;
            this.requestAction = requestAction;
            this.cards = cards;
            this.usageRestrictionAction = usageRestrictionAction;
        }

        /**
         * Setter for bundleId.
         * @param  bundleId  String value for bundleId.
         * @return Builder
         */
        public Builder bundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }

        /**
         * Setter for requestAction.
         * @param  requestAction  String value for requestAction.
         * @return Builder
         */
        public Builder requestAction(String requestAction) {
            this.requestAction = requestAction;
            return this;
        }

        /**
         * Setter for cards.
         * @param  cards  List of String value for cards.
         * @return Builder
         */
        public Builder cards(List<String> cards) {
            this.cards = cards;
            return this;
        }

        /**
         * Setter for usageRestrictionAction.
         * @param  usageRestrictionAction  String value for usageRestrictionAction.
         * @return Builder
         */
        public Builder usageRestrictionAction(String usageRestrictionAction) {
            this.usageRestrictionAction = usageRestrictionAction;
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
         * Setter for payerId.
         * @param  payerId  String value for payerId.
         * @return Builder
         */
        public Builder payerId(String payerId) {
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
         * Setter for restrictions.
         * @param  restrictions  BundleRestrictionUpdate value for restrictions.
         * @return Builder
         */
        public Builder restrictions(BundleRestrictionUpdate restrictions) {
            this.restrictions = restrictions;
            return this;
        }

        /**
         * Builds a new {@link UpdateBundleRequest} object using the set fields.
         * @return {@link UpdateBundleRequest}
         */
        public UpdateBundleRequest build() {
            return new UpdateBundleRequest(bundleId, requestAction, cards, usageRestrictionAction,
                    colCoId, colCoCode, payerId, payerNumber, accountId, accountNumber,
                    restrictions);
        }
    }
}

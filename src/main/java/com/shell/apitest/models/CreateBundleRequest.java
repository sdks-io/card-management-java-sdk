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
 * This is a model class for CreateBundleRequest type.
 */
public class CreateBundleRequest {
    private Integer colCoId;
    private Integer payerId;
    private Integer accountId;
    private OptionalNullable<String> externalBundleId;
    private String description;
    private List<String> cards;
    private OptionalNullable<Integer> colCoCode;
    private String payerNumber;
    private OptionalNullable<String> accountNumber;
    private CreateBundleRequestRestrictions restrictions;

    /**
     * Default constructor.
     */
    public CreateBundleRequest() {
    }

    /**
     * Initialization constructor.
     * @param  description  String value for description.
     * @param  cards  List of String value for cards.
     * @param  colCoId  Integer value for colCoId.
     * @param  payerId  Integer value for payerId.
     * @param  accountId  Integer value for accountId.
     * @param  externalBundleId  String value for externalBundleId.
     * @param  colCoCode  Integer value for colCoCode.
     * @param  payerNumber  String value for payerNumber.
     * @param  accountNumber  String value for accountNumber.
     * @param  restrictions  CreateBundleRequestRestrictions value for restrictions.
     */
    public CreateBundleRequest(
            String description,
            List<String> cards,
            Integer colCoId,
            Integer payerId,
            Integer accountId,
            String externalBundleId,
            Integer colCoCode,
            String payerNumber,
            String accountNumber,
            CreateBundleRequestRestrictions restrictions) {
        this.colCoId = colCoId;
        this.payerId = payerId;
        this.accountId = accountId;
        this.externalBundleId = OptionalNullable.of(externalBundleId);
        this.description = description;
        this.cards = cards;
        this.colCoCode = OptionalNullable.of(colCoCode);
        this.payerNumber = payerNumber;
        this.accountNumber = OptionalNullable.of(accountNumber);
        this.restrictions = restrictions;
    }

    /**
     * Initialization constructor.
     * @param  description  String value for description.
     * @param  cards  List of String value for cards.
     * @param  colCoId  Integer value for colCoId.
     * @param  payerId  Integer value for payerId.
     * @param  accountId  Integer value for accountId.
     * @param  externalBundleId  String value for externalBundleId.
     * @param  colCoCode  Integer value for colCoCode.
     * @param  payerNumber  String value for payerNumber.
     * @param  accountNumber  String value for accountNumber.
     * @param  restrictions  CreateBundleRequestRestrictions value for restrictions.
     */

    protected CreateBundleRequest(String description, List<String> cards, Integer colCoId,
            Integer payerId, Integer accountId, OptionalNullable<String> externalBundleId,
            OptionalNullable<Integer> colCoCode, String payerNumber,
            OptionalNullable<String> accountNumber,
            CreateBundleRequestRestrictions restrictions) {
        this.colCoId = colCoId;
        this.payerId = payerId;
        this.accountId = accountId;
        this.externalBundleId = externalBundleId;
        this.description = description;
        this.cards = cards;
        this.colCoCode = colCoCode;
        this.payerNumber = payerNumber;
        this.accountNumber = accountNumber;
        this.restrictions = restrictions;
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
     * Getter for PayerId.
     * Payer Id of the selected payer. Optional if PayerNumber is passed else Mandatory Example:
     * 123456
     * @return Returns the Integer
     */
    @JsonGetter("PayerId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPayerId() {
        return payerId;
    }

    /**
     * Setter for PayerId.
     * Payer Id of the selected payer. Optional if PayerNumber is passed else Mandatory Example:
     * 123456
     * @param payerId Value for Integer
     */
    @JsonSetter("PayerId")
    public void setPayerId(Integer payerId) {
        this.payerId = payerId;
    }

    /**
     * Getter for AccountId.
     * Account ID of the customer. Either AccountId or AccountNumber or both must be passed.
     * Example: 123456
     * @return Returns the Integer
     */
    @JsonGetter("AccountId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getAccountId() {
        return accountId;
    }

    /**
     * Setter for AccountId.
     * Account ID of the customer. Either AccountId or AccountNumber or both must be passed.
     * Example: 123456
     * @param accountId Value for Integer
     */
    @JsonSetter("AccountId")
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    /**
     * Internal Getter for ExternalBundleId.
     * Identifier of the bundle in external system. Optional.
     * @return Returns the Internal String
     */
    @JsonGetter("ExternalBundleId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetExternalBundleId() {
        return this.externalBundleId;
    }

    /**
     * Getter for ExternalBundleId.
     * Identifier of the bundle in external system. Optional.
     * @return Returns the String
     */
    public String getExternalBundleId() {
        return OptionalNullable.getFrom(externalBundleId);
    }

    /**
     * Setter for ExternalBundleId.
     * Identifier of the bundle in external system. Optional.
     * @param externalBundleId Value for String
     */
    @JsonSetter("ExternalBundleId")
    public void setExternalBundleId(String externalBundleId) {
        this.externalBundleId = OptionalNullable.of(externalBundleId);
    }

    /**
     * UnSetter for ExternalBundleId.
     * Identifier of the bundle in external system. Optional.
     */
    public void unsetExternalBundleId() {
        externalBundleId = null;
    }

    /**
     * Getter for Description.
     * A bundle description. Optional.
     * @return Returns the String
     */
    @JsonGetter("Description")
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * A bundle description. Optional.
     * @param description Value for String
     */
    @JsonSetter("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for Cards.
     * List of Card PANs to be added in the bundle. Mandatory. Example: 7002051006629890645 When PAN
     * matches with multiple cards, the restriction will be applied on the latest issued card.
     * @return Returns the List of String
     */
    @JsonGetter("Cards")
    public List<String> getCards() {
        return cards;
    }

    /**
     * Setter for Cards.
     * List of Card PANs to be added in the bundle. Mandatory. Example: 7002051006629890645 When PAN
     * matches with multiple cards, the restriction will be applied on the latest issued card.
     * @param cards Value for List of String
     */
    @JsonSetter("Cards")
    public void setCards(List<String> cards) {
        this.cards = cards;
    }

    /**
     * Internal Getter for ColCoCode.
     * Collecting Company Code (Shell Code) of the selected payer. Mandatory for serviced OUs such
     * as Romania, Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if
     * ColCoID is provided. Example: 86-Philippines 5-UK
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
     * Collecting Company Code (Shell Code) of the selected payer. Mandatory for serviced OUs such
     * as Romania, Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if
     * ColCoID is provided. Example: 86-Philippines 5-UK
     * @return Returns the Integer
     */
    public Integer getColCoCode() {
        return OptionalNullable.getFrom(colCoCode);
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
        this.colCoCode = OptionalNullable.of(colCoCode);
    }

    /**
     * UnSetter for ColCoCode.
     * Collecting Company Code (Shell Code) of the selected payer. Mandatory for serviced OUs such
     * as Romania, Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if
     * ColCoID is provided. Example: 86-Philippines 5-UK
     */
    public void unsetColCoCode() {
        colCoCode = null;
    }

    /**
     * Getter for PayerNumber.
     * Payer Number (Ex: GB000000123) of the selected payer. Optional if PayerId is passed else
     * Mandatory
     * @return Returns the String
     */
    @JsonGetter("PayerNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPayerNumber() {
        return payerNumber;
    }

    /**
     * Setter for PayerNumber.
     * Payer Number (Ex: GB000000123) of the selected payer. Optional if PayerId is passed else
     * Mandatory
     * @param payerNumber Value for String
     */
    @JsonSetter("PayerNumber")
    public void setPayerNumber(String payerNumber) {
        this.payerNumber = payerNumber;
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
     * Getter for Restrictions.
     * Restrictions to be applied on the bundle. Mandatory
     * @return Returns the CreateBundleRequestRestrictions
     */
    @JsonGetter("Restrictions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateBundleRequestRestrictions getRestrictions() {
        return restrictions;
    }

    /**
     * Setter for Restrictions.
     * Restrictions to be applied on the bundle. Mandatory
     * @param restrictions Value for CreateBundleRequestRestrictions
     */
    @JsonSetter("Restrictions")
    public void setRestrictions(CreateBundleRequestRestrictions restrictions) {
        this.restrictions = restrictions;
    }

    /**
     * Converts this CreateBundleRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateBundleRequest [" + "description=" + description + ", cards=" + cards
                + ", colCoId=" + colCoId + ", payerId=" + payerId + ", accountId=" + accountId
                + ", externalBundleId=" + externalBundleId + ", colCoCode=" + colCoCode
                + ", payerNumber=" + payerNumber + ", accountNumber=" + accountNumber
                + ", restrictions=" + restrictions + "]";
    }

    /**
     * Builds a new {@link CreateBundleRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateBundleRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(description, cards)
                .colCoId(getColCoId())
                .payerId(getPayerId())
                .accountId(getAccountId())
                .payerNumber(getPayerNumber())
                .restrictions(getRestrictions());
        builder.externalBundleId = internalGetExternalBundleId();
        builder.colCoCode = internalGetColCoCode();
        builder.accountNumber = internalGetAccountNumber();
        return builder;
    }

    /**
     * Class to build instances of {@link CreateBundleRequest}.
     */
    public static class Builder {
        private String description;
        private List<String> cards;
        private Integer colCoId;
        private Integer payerId;
        private Integer accountId;
        private OptionalNullable<String> externalBundleId;
        private OptionalNullable<Integer> colCoCode;
        private String payerNumber;
        private OptionalNullable<String> accountNumber;
        private CreateBundleRequestRestrictions restrictions;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  description  String value for description.
         * @param  cards  List of String value for cards.
         */
        public Builder(String description, List<String> cards) {
            this.description = description;
            this.cards = cards;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
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
         * Setter for colCoId.
         * @param  colCoId  Integer value for colCoId.
         * @return Builder
         */
        public Builder colCoId(Integer colCoId) {
            this.colCoId = colCoId;
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
         * Setter for accountId.
         * @param  accountId  Integer value for accountId.
         * @return Builder
         */
        public Builder accountId(Integer accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * Setter for externalBundleId.
         * @param  externalBundleId  String value for externalBundleId.
         * @return Builder
         */
        public Builder externalBundleId(String externalBundleId) {
            this.externalBundleId = OptionalNullable.of(externalBundleId);
            return this;
        }

        /**
         * UnSetter for externalBundleId.
         * @return Builder
         */
        public Builder unsetExternalBundleId() {
            externalBundleId = null;
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
         * Setter for payerNumber.
         * @param  payerNumber  String value for payerNumber.
         * @return Builder
         */
        public Builder payerNumber(String payerNumber) {
            this.payerNumber = payerNumber;
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
         * @param  restrictions  CreateBundleRequestRestrictions value for restrictions.
         * @return Builder
         */
        public Builder restrictions(CreateBundleRequestRestrictions restrictions) {
            this.restrictions = restrictions;
            return this;
        }

        /**
         * Builds a new {@link CreateBundleRequest} object using the set fields.
         * @return {@link CreateBundleRequest}
         */
        public CreateBundleRequest build() {
            return new CreateBundleRequest(description, cards, colCoId, payerId, accountId,
                    externalBundleId, colCoCode, payerNumber, accountNumber, restrictions);
        }
    }
}

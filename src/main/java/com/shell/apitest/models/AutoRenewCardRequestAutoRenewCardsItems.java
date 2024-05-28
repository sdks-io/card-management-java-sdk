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
 * This is a model class for AutoRenewCardRequestAutoRenewCardsItems type.
 */
public class AutoRenewCardRequestAutoRenewCardsItems {
    private String accountNumber;
    private Integer accountId;
    private String pAN;
    private Integer cardId;
    private boolean reissueSetting;

    /**
     * Default constructor.
     */
    public AutoRenewCardRequestAutoRenewCardsItems() {
    }

    /**
     * Initialization constructor.
     * @param  reissueSetting  boolean value for reissueSetting.
     * @param  accountNumber  String value for accountNumber.
     * @param  accountId  Integer value for accountId.
     * @param  pAN  String value for pAN.
     * @param  cardId  Integer value for cardId.
     */
    public AutoRenewCardRequestAutoRenewCardsItems(
            boolean reissueSetting,
            String accountNumber,
            Integer accountId,
            String pAN,
            Integer cardId) {
        this.accountNumber = accountNumber;
        this.accountId = accountId;
        this.pAN = pAN;
        this.cardId = cardId;
        this.reissueSetting = reissueSetting;
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
     * Getter for CardId.
     * Card Id of the card. Optional if PAN is passed, else Mandatory.
     * @return Returns the Integer
     */
    @JsonGetter("CardId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCardId() {
        return cardId;
    }

    /**
     * Setter for CardId.
     * Card Id of the card. Optional if PAN is passed, else Mandatory.
     * @param cardId Value for Integer
     */
    @JsonSetter("CardId")
    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    /**
     * Getter for ReissueSetting.
     * Reissue setting of the card. Values: True – Card will be Reissued when nearing its expiry
     * date False – Card will not be Reissued Mandatory
     * @return Returns the boolean
     */
    @JsonGetter("ReissueSetting")
    public boolean getReissueSetting() {
        return reissueSetting;
    }

    /**
     * Setter for ReissueSetting.
     * Reissue setting of the card. Values: True – Card will be Reissued when nearing its expiry
     * date False – Card will not be Reissued Mandatory
     * @param reissueSetting Value for boolean
     */
    @JsonSetter("ReissueSetting")
    public void setReissueSetting(boolean reissueSetting) {
        this.reissueSetting = reissueSetting;
    }

    /**
     * Converts this AutoRenewCardRequestAutoRenewCardsItems into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AutoRenewCardRequestAutoRenewCardsItems [" + "reissueSetting=" + reissueSetting
                + ", accountNumber=" + accountNumber + ", accountId=" + accountId + ", pAN=" + pAN
                + ", cardId=" + cardId + "]";
    }

    /**
     * Builds a new {@link AutoRenewCardRequestAutoRenewCardsItems.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AutoRenewCardRequestAutoRenewCardsItems.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(reissueSetting)
                .accountNumber(getAccountNumber())
                .accountId(getAccountId())
                .pAN(getPAN())
                .cardId(getCardId());
        return builder;
    }

    /**
     * Class to build instances of {@link AutoRenewCardRequestAutoRenewCardsItems}.
     */
    public static class Builder {
        private boolean reissueSetting;
        private String accountNumber;
        private Integer accountId;
        private String pAN;
        private Integer cardId;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  reissueSetting  boolean value for reissueSetting.
         */
        public Builder(boolean reissueSetting) {
            this.reissueSetting = reissueSetting;
        }

        /**
         * Setter for reissueSetting.
         * @param  reissueSetting  boolean value for reissueSetting.
         * @return Builder
         */
        public Builder reissueSetting(boolean reissueSetting) {
            this.reissueSetting = reissueSetting;
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
         * Setter for accountId.
         * @param  accountId  Integer value for accountId.
         * @return Builder
         */
        public Builder accountId(Integer accountId) {
            this.accountId = accountId;
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
         * Setter for cardId.
         * @param  cardId  Integer value for cardId.
         * @return Builder
         */
        public Builder cardId(Integer cardId) {
            this.cardId = cardId;
            return this;
        }

        /**
         * Builds a new {@link AutoRenewCardRequestAutoRenewCardsItems} object using the set fields.
         * @return {@link AutoRenewCardRequestAutoRenewCardsItems}
         */
        public AutoRenewCardRequestAutoRenewCardsItems build() {
            return new AutoRenewCardRequestAutoRenewCardsItems(reissueSetting, accountNumber,
                    accountId, pAN, cardId);
        }
    }
}

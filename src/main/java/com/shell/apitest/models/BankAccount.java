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
 * This is a model class for BankAccount type.
 */
public class BankAccount {
    private OptionalNullable<String> accountNumber;
    private OptionalNullable<String> bankName;
    private OptionalNullable<String> accountName;
    private OptionalNullable<String> dateEffective;
    private OptionalNullable<String> dateTerminated;
    private OptionalNullable<String> iBAN;
    private OptionalNullable<String> currencyCode;
    private OptionalNullable<String> currencySymbol;
    private OptionalNullable<String> countryISOCode;
    private OptionalNullable<String> country;
    private OptionalNullable<String> sortCode;
    private OptionalNullable<String> swiftCode;
    private OptionalNullable<String> bankType;

    /**
     * Default constructor.
     */
    public BankAccount() {
    }

    /**
     * Initialization constructor.
     * @param  accountNumber  String value for accountNumber.
     * @param  bankName  String value for bankName.
     * @param  accountName  String value for accountName.
     * @param  dateEffective  String value for dateEffective.
     * @param  dateTerminated  String value for dateTerminated.
     * @param  iBAN  String value for iBAN.
     * @param  currencyCode  String value for currencyCode.
     * @param  currencySymbol  String value for currencySymbol.
     * @param  countryISOCode  String value for countryISOCode.
     * @param  country  String value for country.
     * @param  sortCode  String value for sortCode.
     * @param  swiftCode  String value for swiftCode.
     * @param  bankType  String value for bankType.
     */
    public BankAccount(
            String accountNumber,
            String bankName,
            String accountName,
            String dateEffective,
            String dateTerminated,
            String iBAN,
            String currencyCode,
            String currencySymbol,
            String countryISOCode,
            String country,
            String sortCode,
            String swiftCode,
            String bankType) {
        this.accountNumber = OptionalNullable.of(accountNumber);
        this.bankName = OptionalNullable.of(bankName);
        this.accountName = OptionalNullable.of(accountName);
        this.dateEffective = OptionalNullable.of(dateEffective);
        this.dateTerminated = OptionalNullable.of(dateTerminated);
        this.iBAN = OptionalNullable.of(iBAN);
        this.currencyCode = OptionalNullable.of(currencyCode);
        this.currencySymbol = OptionalNullable.of(currencySymbol);
        this.countryISOCode = OptionalNullable.of(countryISOCode);
        this.country = OptionalNullable.of(country);
        this.sortCode = OptionalNullable.of(sortCode);
        this.swiftCode = OptionalNullable.of(swiftCode);
        this.bankType = OptionalNullable.of(bankType);
    }

    /**
     * Initialization constructor.
     * @param  accountNumber  String value for accountNumber.
     * @param  bankName  String value for bankName.
     * @param  accountName  String value for accountName.
     * @param  dateEffective  String value for dateEffective.
     * @param  dateTerminated  String value for dateTerminated.
     * @param  iBAN  String value for iBAN.
     * @param  currencyCode  String value for currencyCode.
     * @param  currencySymbol  String value for currencySymbol.
     * @param  countryISOCode  String value for countryISOCode.
     * @param  country  String value for country.
     * @param  sortCode  String value for sortCode.
     * @param  swiftCode  String value for swiftCode.
     * @param  bankType  String value for bankType.
     */

    protected BankAccount(OptionalNullable<String> accountNumber, OptionalNullable<String> bankName,
            OptionalNullable<String> accountName, OptionalNullable<String> dateEffective,
            OptionalNullable<String> dateTerminated, OptionalNullable<String> iBAN,
            OptionalNullable<String> currencyCode, OptionalNullable<String> currencySymbol,
            OptionalNullable<String> countryISOCode, OptionalNullable<String> country,
            OptionalNullable<String> sortCode, OptionalNullable<String> swiftCode,
            OptionalNullable<String> bankType) {
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.accountName = accountName;
        this.dateEffective = dateEffective;
        this.dateTerminated = dateTerminated;
        this.iBAN = iBAN;
        this.currencyCode = currencyCode;
        this.currencySymbol = currencySymbol;
        this.countryISOCode = countryISOCode;
        this.country = country;
        this.sortCode = sortCode;
        this.swiftCode = swiftCode;
        this.bankType = bankType;
    }

    /**
     * Internal Getter for AccountNumber.
     * Account Number
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
     * Account Number
     * @return Returns the String
     */
    public String getAccountNumber() {
        return OptionalNullable.getFrom(accountNumber);
    }

    /**
     * Setter for AccountNumber.
     * Account Number
     * @param accountNumber Value for String
     */
    @JsonSetter("AccountNumber")
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = OptionalNullable.of(accountNumber);
    }

    /**
     * UnSetter for AccountNumber.
     * Account Number
     */
    public void unsetAccountNumber() {
        accountNumber = null;
    }

    /**
     * Internal Getter for BankName.
     * Bank Name
     * @return Returns the Internal String
     */
    @JsonGetter("BankName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetBankName() {
        return this.bankName;
    }

    /**
     * Getter for BankName.
     * Bank Name
     * @return Returns the String
     */
    public String getBankName() {
        return OptionalNullable.getFrom(bankName);
    }

    /**
     * Setter for BankName.
     * Bank Name
     * @param bankName Value for String
     */
    @JsonSetter("BankName")
    public void setBankName(String bankName) {
        this.bankName = OptionalNullable.of(bankName);
    }

    /**
     * UnSetter for BankName.
     * Bank Name
     */
    public void unsetBankName() {
        bankName = null;
    }

    /**
     * Internal Getter for AccountName.
     * Account Name
     * @return Returns the Internal String
     */
    @JsonGetter("AccountName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetAccountName() {
        return this.accountName;
    }

    /**
     * Getter for AccountName.
     * Account Name
     * @return Returns the String
     */
    public String getAccountName() {
        return OptionalNullable.getFrom(accountName);
    }

    /**
     * Setter for AccountName.
     * Account Name
     * @param accountName Value for String
     */
    @JsonSetter("AccountName")
    public void setAccountName(String accountName) {
        this.accountName = OptionalNullable.of(accountName);
    }

    /**
     * UnSetter for AccountName.
     * Account Name
     */
    public void unsetAccountName() {
        accountName = null;
    }

    /**
     * Internal Getter for DateEffective.
     * Bank Account effective date for the payer
     * @return Returns the Internal String
     */
    @JsonGetter("DateEffective")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDateEffective() {
        return this.dateEffective;
    }

    /**
     * Getter for DateEffective.
     * Bank Account effective date for the payer
     * @return Returns the String
     */
    public String getDateEffective() {
        return OptionalNullable.getFrom(dateEffective);
    }

    /**
     * Setter for DateEffective.
     * Bank Account effective date for the payer
     * @param dateEffective Value for String
     */
    @JsonSetter("DateEffective")
    public void setDateEffective(String dateEffective) {
        this.dateEffective = OptionalNullable.of(dateEffective);
    }

    /**
     * UnSetter for DateEffective.
     * Bank Account effective date for the payer
     */
    public void unsetDateEffective() {
        dateEffective = null;
    }

    /**
     * Internal Getter for DateTerminated.
     * Bank Account terminated date. Default is null
     * @return Returns the Internal String
     */
    @JsonGetter("DateTerminated")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDateTerminated() {
        return this.dateTerminated;
    }

    /**
     * Getter for DateTerminated.
     * Bank Account terminated date. Default is null
     * @return Returns the String
     */
    public String getDateTerminated() {
        return OptionalNullable.getFrom(dateTerminated);
    }

    /**
     * Setter for DateTerminated.
     * Bank Account terminated date. Default is null
     * @param dateTerminated Value for String
     */
    @JsonSetter("DateTerminated")
    public void setDateTerminated(String dateTerminated) {
        this.dateTerminated = OptionalNullable.of(dateTerminated);
    }

    /**
     * UnSetter for DateTerminated.
     * Bank Account terminated date. Default is null
     */
    public void unsetDateTerminated() {
        dateTerminated = null;
    }

    /**
     * Internal Getter for IBAN.
     * Bank Account IBAN for Payer
     * @return Returns the Internal String
     */
    @JsonGetter("IBAN")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetIBAN() {
        return this.iBAN;
    }

    /**
     * Getter for IBAN.
     * Bank Account IBAN for Payer
     * @return Returns the String
     */
    public String getIBAN() {
        return OptionalNullable.getFrom(iBAN);
    }

    /**
     * Setter for IBAN.
     * Bank Account IBAN for Payer
     * @param iBAN Value for String
     */
    @JsonSetter("IBAN")
    public void setIBAN(String iBAN) {
        this.iBAN = OptionalNullable.of(iBAN);
    }

    /**
     * UnSetter for IBAN.
     * Bank Account IBAN for Payer
     */
    public void unsetIBAN() {
        iBAN = null;
    }

    /**
     * Internal Getter for CurrencyCode.
     * Bank Account currency ISO code.
     * @return Returns the Internal String
     */
    @JsonGetter("CurrencyCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * Getter for CurrencyCode.
     * Bank Account currency ISO code.
     * @return Returns the String
     */
    public String getCurrencyCode() {
        return OptionalNullable.getFrom(currencyCode);
    }

    /**
     * Setter for CurrencyCode.
     * Bank Account currency ISO code.
     * @param currencyCode Value for String
     */
    @JsonSetter("CurrencyCode")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = OptionalNullable.of(currencyCode);
    }

    /**
     * UnSetter for CurrencyCode.
     * Bank Account currency ISO code.
     */
    public void unsetCurrencyCode() {
        currencyCode = null;
    }

    /**
     * Internal Getter for CurrencySymbol.
     * Bank Account currency Symbol.
     * @return Returns the Internal String
     */
    @JsonGetter("CurrencySymbol")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCurrencySymbol() {
        return this.currencySymbol;
    }

    /**
     * Getter for CurrencySymbol.
     * Bank Account currency Symbol.
     * @return Returns the String
     */
    public String getCurrencySymbol() {
        return OptionalNullable.getFrom(currencySymbol);
    }

    /**
     * Setter for CurrencySymbol.
     * Bank Account currency Symbol.
     * @param currencySymbol Value for String
     */
    @JsonSetter("CurrencySymbol")
    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = OptionalNullable.of(currencySymbol);
    }

    /**
     * UnSetter for CurrencySymbol.
     * Bank Account currency Symbol.
     */
    public void unsetCurrencySymbol() {
        currencySymbol = null;
    }

    /**
     * Internal Getter for CountryISOCode.
     * Bank Account Country ISO Code
     * @return Returns the Internal String
     */
    @JsonGetter("CountryISOCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCountryISOCode() {
        return this.countryISOCode;
    }

    /**
     * Getter for CountryISOCode.
     * Bank Account Country ISO Code
     * @return Returns the String
     */
    public String getCountryISOCode() {
        return OptionalNullable.getFrom(countryISOCode);
    }

    /**
     * Setter for CountryISOCode.
     * Bank Account Country ISO Code
     * @param countryISOCode Value for String
     */
    @JsonSetter("CountryISOCode")
    public void setCountryISOCode(String countryISOCode) {
        this.countryISOCode = OptionalNullable.of(countryISOCode);
    }

    /**
     * UnSetter for CountryISOCode.
     * Bank Account Country ISO Code
     */
    public void unsetCountryISOCode() {
        countryISOCode = null;
    }

    /**
     * Internal Getter for Country.
     * Bank Account Country Name 1-Austria 2-Belgium 3-Bulgaria 4-Croatia 5-Czech Republic
     * @return Returns the Internal String
     */
    @JsonGetter("Country")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCountry() {
        return this.country;
    }

    /**
     * Getter for Country.
     * Bank Account Country Name 1-Austria 2-Belgium 3-Bulgaria 4-Croatia 5-Czech Republic
     * @return Returns the String
     */
    public String getCountry() {
        return OptionalNullable.getFrom(country);
    }

    /**
     * Setter for Country.
     * Bank Account Country Name 1-Austria 2-Belgium 3-Bulgaria 4-Croatia 5-Czech Republic
     * @param country Value for String
     */
    @JsonSetter("Country")
    public void setCountry(String country) {
        this.country = OptionalNullable.of(country);
    }

    /**
     * UnSetter for Country.
     * Bank Account Country Name 1-Austria 2-Belgium 3-Bulgaria 4-Croatia 5-Czech Republic
     */
    public void unsetCountry() {
        country = null;
    }

    /**
     * Internal Getter for SortCode.
     * Payer bank Sort Code
     * @return Returns the Internal String
     */
    @JsonGetter("SortCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetSortCode() {
        return this.sortCode;
    }

    /**
     * Getter for SortCode.
     * Payer bank Sort Code
     * @return Returns the String
     */
    public String getSortCode() {
        return OptionalNullable.getFrom(sortCode);
    }

    /**
     * Setter for SortCode.
     * Payer bank Sort Code
     * @param sortCode Value for String
     */
    @JsonSetter("SortCode")
    public void setSortCode(String sortCode) {
        this.sortCode = OptionalNullable.of(sortCode);
    }

    /**
     * UnSetter for SortCode.
     * Payer bank Sort Code
     */
    public void unsetSortCode() {
        sortCode = null;
    }

    /**
     * Internal Getter for SwiftCode.
     * Payer Bank Swift Code
     * @return Returns the Internal String
     */
    @JsonGetter("SwiftCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetSwiftCode() {
        return this.swiftCode;
    }

    /**
     * Getter for SwiftCode.
     * Payer Bank Swift Code
     * @return Returns the String
     */
    public String getSwiftCode() {
        return OptionalNullable.getFrom(swiftCode);
    }

    /**
     * Setter for SwiftCode.
     * Payer Bank Swift Code
     * @param swiftCode Value for String
     */
    @JsonSetter("SwiftCode")
    public void setSwiftCode(String swiftCode) {
        this.swiftCode = OptionalNullable.of(swiftCode);
    }

    /**
     * UnSetter for SwiftCode.
     * Payer Bank Swift Code
     */
    public void unsetSwiftCode() {
        swiftCode = null;
    }

    /**
     * Internal Getter for BankType.
     * Bank Type Id and Description
     * @return Returns the Internal String
     */
    @JsonGetter("BankType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetBankType() {
        return this.bankType;
    }

    /**
     * Getter for BankType.
     * Bank Type Id and Description
     * @return Returns the String
     */
    public String getBankType() {
        return OptionalNullable.getFrom(bankType);
    }

    /**
     * Setter for BankType.
     * Bank Type Id and Description
     * @param bankType Value for String
     */
    @JsonSetter("BankType")
    public void setBankType(String bankType) {
        this.bankType = OptionalNullable.of(bankType);
    }

    /**
     * UnSetter for BankType.
     * Bank Type Id and Description
     */
    public void unsetBankType() {
        bankType = null;
    }

    /**
     * Converts this BankAccount into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BankAccount [" + "accountNumber=" + accountNumber + ", bankName=" + bankName
                + ", accountName=" + accountName + ", dateEffective=" + dateEffective
                + ", dateTerminated=" + dateTerminated + ", iBAN=" + iBAN + ", currencyCode="
                + currencyCode + ", currencySymbol=" + currencySymbol + ", countryISOCode="
                + countryISOCode + ", country=" + country + ", sortCode=" + sortCode
                + ", swiftCode=" + swiftCode + ", bankType=" + bankType + "]";
    }

    /**
     * Builds a new {@link BankAccount.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BankAccount.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.accountNumber = internalGetAccountNumber();
        builder.bankName = internalGetBankName();
        builder.accountName = internalGetAccountName();
        builder.dateEffective = internalGetDateEffective();
        builder.dateTerminated = internalGetDateTerminated();
        builder.iBAN = internalGetIBAN();
        builder.currencyCode = internalGetCurrencyCode();
        builder.currencySymbol = internalGetCurrencySymbol();
        builder.countryISOCode = internalGetCountryISOCode();
        builder.country = internalGetCountry();
        builder.sortCode = internalGetSortCode();
        builder.swiftCode = internalGetSwiftCode();
        builder.bankType = internalGetBankType();
        return builder;
    }

    /**
     * Class to build instances of {@link BankAccount}.
     */
    public static class Builder {
        private OptionalNullable<String> accountNumber;
        private OptionalNullable<String> bankName;
        private OptionalNullable<String> accountName;
        private OptionalNullable<String> dateEffective;
        private OptionalNullable<String> dateTerminated;
        private OptionalNullable<String> iBAN;
        private OptionalNullable<String> currencyCode;
        private OptionalNullable<String> currencySymbol;
        private OptionalNullable<String> countryISOCode;
        private OptionalNullable<String> country;
        private OptionalNullable<String> sortCode;
        private OptionalNullable<String> swiftCode;
        private OptionalNullable<String> bankType;



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
         * Setter for bankName.
         * @param  bankName  String value for bankName.
         * @return Builder
         */
        public Builder bankName(String bankName) {
            this.bankName = OptionalNullable.of(bankName);
            return this;
        }

        /**
         * UnSetter for bankName.
         * @return Builder
         */
        public Builder unsetBankName() {
            bankName = null;
            return this;
        }

        /**
         * Setter for accountName.
         * @param  accountName  String value for accountName.
         * @return Builder
         */
        public Builder accountName(String accountName) {
            this.accountName = OptionalNullable.of(accountName);
            return this;
        }

        /**
         * UnSetter for accountName.
         * @return Builder
         */
        public Builder unsetAccountName() {
            accountName = null;
            return this;
        }

        /**
         * Setter for dateEffective.
         * @param  dateEffective  String value for dateEffective.
         * @return Builder
         */
        public Builder dateEffective(String dateEffective) {
            this.dateEffective = OptionalNullable.of(dateEffective);
            return this;
        }

        /**
         * UnSetter for dateEffective.
         * @return Builder
         */
        public Builder unsetDateEffective() {
            dateEffective = null;
            return this;
        }

        /**
         * Setter for dateTerminated.
         * @param  dateTerminated  String value for dateTerminated.
         * @return Builder
         */
        public Builder dateTerminated(String dateTerminated) {
            this.dateTerminated = OptionalNullable.of(dateTerminated);
            return this;
        }

        /**
         * UnSetter for dateTerminated.
         * @return Builder
         */
        public Builder unsetDateTerminated() {
            dateTerminated = null;
            return this;
        }

        /**
         * Setter for iBAN.
         * @param  iBAN  String value for iBAN.
         * @return Builder
         */
        public Builder iBAN(String iBAN) {
            this.iBAN = OptionalNullable.of(iBAN);
            return this;
        }

        /**
         * UnSetter for iBAN.
         * @return Builder
         */
        public Builder unsetIBAN() {
            iBAN = null;
            return this;
        }

        /**
         * Setter for currencyCode.
         * @param  currencyCode  String value for currencyCode.
         * @return Builder
         */
        public Builder currencyCode(String currencyCode) {
            this.currencyCode = OptionalNullable.of(currencyCode);
            return this;
        }

        /**
         * UnSetter for currencyCode.
         * @return Builder
         */
        public Builder unsetCurrencyCode() {
            currencyCode = null;
            return this;
        }

        /**
         * Setter for currencySymbol.
         * @param  currencySymbol  String value for currencySymbol.
         * @return Builder
         */
        public Builder currencySymbol(String currencySymbol) {
            this.currencySymbol = OptionalNullable.of(currencySymbol);
            return this;
        }

        /**
         * UnSetter for currencySymbol.
         * @return Builder
         */
        public Builder unsetCurrencySymbol() {
            currencySymbol = null;
            return this;
        }

        /**
         * Setter for countryISOCode.
         * @param  countryISOCode  String value for countryISOCode.
         * @return Builder
         */
        public Builder countryISOCode(String countryISOCode) {
            this.countryISOCode = OptionalNullable.of(countryISOCode);
            return this;
        }

        /**
         * UnSetter for countryISOCode.
         * @return Builder
         */
        public Builder unsetCountryISOCode() {
            countryISOCode = null;
            return this;
        }

        /**
         * Setter for country.
         * @param  country  String value for country.
         * @return Builder
         */
        public Builder country(String country) {
            this.country = OptionalNullable.of(country);
            return this;
        }

        /**
         * UnSetter for country.
         * @return Builder
         */
        public Builder unsetCountry() {
            country = null;
            return this;
        }

        /**
         * Setter for sortCode.
         * @param  sortCode  String value for sortCode.
         * @return Builder
         */
        public Builder sortCode(String sortCode) {
            this.sortCode = OptionalNullable.of(sortCode);
            return this;
        }

        /**
         * UnSetter for sortCode.
         * @return Builder
         */
        public Builder unsetSortCode() {
            sortCode = null;
            return this;
        }

        /**
         * Setter for swiftCode.
         * @param  swiftCode  String value for swiftCode.
         * @return Builder
         */
        public Builder swiftCode(String swiftCode) {
            this.swiftCode = OptionalNullable.of(swiftCode);
            return this;
        }

        /**
         * UnSetter for swiftCode.
         * @return Builder
         */
        public Builder unsetSwiftCode() {
            swiftCode = null;
            return this;
        }

        /**
         * Setter for bankType.
         * @param  bankType  String value for bankType.
         * @return Builder
         */
        public Builder bankType(String bankType) {
            this.bankType = OptionalNullable.of(bankType);
            return this;
        }

        /**
         * UnSetter for bankType.
         * @return Builder
         */
        public Builder unsetBankType() {
            bankType = null;
            return this;
        }

        /**
         * Builds a new {@link BankAccount} object using the set fields.
         * @return {@link BankAccount}
         */
        public BankAccount build() {
            return new BankAccount(accountNumber, bankName, accountName, dateEffective,
                    dateTerminated, iBAN, currencyCode, currencySymbol, countryISOCode, country,
                    sortCode, swiftCode, bankType);
        }
    }
}

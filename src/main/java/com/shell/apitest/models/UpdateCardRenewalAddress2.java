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
 * This is a model class for UpdateCardRenewalAddress2 type.
 */
public class UpdateCardRenewalAddress2 {
    private String contactName;
    private String contactTitle;
    private String companyName;
    private String addressLine;
    private String zipCode;
    private String city;
    private Integer regionID;
    private int countryID;
    private String emailAddress;
    private String phoneNumber;

    /**
     * Default constructor.
     */
    public UpdateCardRenewalAddress2() {
    }

    /**
     * Initialization constructor.
     * @param  contactName  String value for contactName.
     * @param  companyName  String value for companyName.
     * @param  addressLine  String value for addressLine.
     * @param  zipCode  String value for zipCode.
     * @param  countryID  int value for countryID.
     * @param  contactTitle  String value for contactTitle.
     * @param  city  String value for city.
     * @param  regionID  Integer value for regionID.
     * @param  emailAddress  String value for emailAddress.
     * @param  phoneNumber  String value for phoneNumber.
     */
    public UpdateCardRenewalAddress2(
            String contactName,
            String companyName,
            String addressLine,
            String zipCode,
            int countryID,
            String contactTitle,
            String city,
            Integer regionID,
            String emailAddress,
            String phoneNumber) {
        this.contactName = contactName;
        this.contactTitle = contactTitle;
        this.companyName = companyName;
        this.addressLine = addressLine;
        this.zipCode = zipCode;
        this.city = city;
        this.regionID = regionID;
        this.countryID = countryID;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Getter for ContactName.
     * Contact name Note: Mandatory when ‘UseCustomerDefaultAddress’ is set to ‘false’. The field is
     * ignored otherwise. Max Length: 50
     * @return Returns the String
     */
    @JsonGetter("ContactName")
    public String getContactName() {
        return contactName;
    }

    /**
     * Setter for ContactName.
     * Contact name Note: Mandatory when ‘UseCustomerDefaultAddress’ is set to ‘false’. The field is
     * ignored otherwise. Max Length: 50
     * @param contactName Value for String
     */
    @JsonSetter("ContactName")
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    /**
     * Getter for ContactTitle.
     * Title Max Length: 50
     * @return Returns the String
     */
    @JsonGetter("ContactTitle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getContactTitle() {
        return contactTitle;
    }

    /**
     * Setter for ContactTitle.
     * Title Max Length: 50
     * @param contactTitle Value for String
     */
    @JsonSetter("ContactTitle")
    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
    }

    /**
     * Getter for CompanyName.
     * Company name. Note: Mandatory when ‘UseCustomerDefaultAddress’ is set to ‘false’. The field
     * is ignored otherwise. Max Length: 50
     * @return Returns the String
     */
    @JsonGetter("CompanyName")
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Setter for CompanyName.
     * Company name. Note: Mandatory when ‘UseCustomerDefaultAddress’ is set to ‘false’. The field
     * is ignored otherwise. Max Length: 50
     * @param companyName Value for String
     */
    @JsonSetter("CompanyName")
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * Getter for AddressLine.
     * Address line 1,2 and 3 Note: Mandatory when ‘UseCustomerDefaultAddress’ is set to ‘false’.
     * The field is ignored otherwise. Max Length: 128 Note: -Each address line should be separated
     * by “\r\n”.
     * @return Returns the String
     */
    @JsonGetter("AddressLine")
    public String getAddressLine() {
        return addressLine;
    }

    /**
     * Setter for AddressLine.
     * Address line 1,2 and 3 Note: Mandatory when ‘UseCustomerDefaultAddress’ is set to ‘false’.
     * The field is ignored otherwise. Max Length: 128 Note: -Each address line should be separated
     * by “\r\n”.
     * @param addressLine Value for String
     */
    @JsonSetter("AddressLine")
    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    /**
     * Getter for ZipCode.
     * ZipCode Note: Mandatory when ‘UseCustomerDefaultAddress’ is set to ‘false’. The field is
     * ignored otherwise. Max Length: 10
     * @return Returns the String
     */
    @JsonGetter("ZipCode")
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Setter for ZipCode.
     * ZipCode Note: Mandatory when ‘UseCustomerDefaultAddress’ is set to ‘false’. The field is
     * ignored otherwise. Max Length: 10
     * @param zipCode Value for String
     */
    @JsonSetter("ZipCode")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * Getter for City.
     * City Note: Mandatory when ‘UseCustomerDefaultAddress’ is set to ‘false’. The field is ignored
     * otherwise. Max Length: 40
     * @return Returns the String
     */
    @JsonGetter("City")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCity() {
        return city;
    }

    /**
     * Setter for City.
     * City Note: Mandatory when ‘UseCustomerDefaultAddress’ is set to ‘false’. The field is ignored
     * otherwise. Max Length: 40
     * @param city Value for String
     */
    @JsonSetter("City")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Getter for RegionID.
     * Region id of card.
     * @return Returns the Integer
     */
    @JsonGetter("RegionID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getRegionID() {
        return regionID;
    }

    /**
     * Setter for RegionID.
     * Region id of card.
     * @param regionID Value for Integer
     */
    @JsonSetter("RegionID")
    public void setRegionID(Integer regionID) {
        this.regionID = regionID;
    }

    /**
     * Getter for CountryID.
     * Country ID Note: Mandatory when ‘UseCustomerDefaultAddress’ is set to ‘false’. The field is
     * ignored otherwise.
     * @return Returns the int
     */
    @JsonGetter("CountryID")
    public int getCountryID() {
        return countryID;
    }

    /**
     * Setter for CountryID.
     * Country ID Note: Mandatory when ‘UseCustomerDefaultAddress’ is set to ‘false’. The field is
     * ignored otherwise.
     * @param countryID Value for int
     */
    @JsonSetter("CountryID")
    public void setCountryID(int countryID) {
        this.countryID = countryID;
    }

    /**
     * Getter for EmailAddress.
     * Email Address Max Length: 90 Note: - Based on the international standard that there can be •
     * Max Length 64 before the {@literal @} (the 'Local part’) =64(minimum of 1) • Max Lenth after the (the
     * domain) = 88 (Minimum of 2)
     * @return Returns the String
     */
    @JsonGetter("EmailAddress")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Setter for EmailAddress.
     * Email Address Max Length: 90 Note: - Based on the international standard that there can be •
     * Max Length 64 before the {@literal @} (the 'Local part’) =64(minimum of 1) • Max Lenth after the (the
     * domain) = 88 (Minimum of 2)
     * @param emailAddress Value for String
     */
    @JsonSetter("EmailAddress")
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Getter for PhoneNumber.
     * Phone number Optional Max Length: 16
     * @return Returns the String
     */
    @JsonGetter("PhoneNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Setter for PhoneNumber.
     * Phone number Optional Max Length: 16
     * @param phoneNumber Value for String
     */
    @JsonSetter("PhoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Converts this UpdateCardRenewalAddress2 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateCardRenewalAddress2 [" + "contactName=" + contactName + ", companyName="
                + companyName + ", addressLine=" + addressLine + ", zipCode=" + zipCode
                + ", countryID=" + countryID + ", contactTitle=" + contactTitle + ", city=" + city
                + ", regionID=" + regionID + ", emailAddress=" + emailAddress + ", phoneNumber="
                + phoneNumber + "]";
    }

    /**
     * Builds a new {@link UpdateCardRenewalAddress2.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateCardRenewalAddress2.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(contactName, companyName, addressLine, zipCode, countryID)
                .contactTitle(getContactTitle())
                .city(getCity())
                .regionID(getRegionID())
                .emailAddress(getEmailAddress())
                .phoneNumber(getPhoneNumber());
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateCardRenewalAddress2}.
     */
    public static class Builder {
        private String contactName;
        private String companyName;
        private String addressLine;
        private String zipCode;
        private int countryID;
        private String contactTitle;
        private String city;
        private Integer regionID;
        private String emailAddress;
        private String phoneNumber;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  contactName  String value for contactName.
         * @param  companyName  String value for companyName.
         * @param  addressLine  String value for addressLine.
         * @param  zipCode  String value for zipCode.
         * @param  countryID  int value for countryID.
         */
        public Builder(String contactName, String companyName, String addressLine, String zipCode,
                int countryID) {
            this.contactName = contactName;
            this.companyName = companyName;
            this.addressLine = addressLine;
            this.zipCode = zipCode;
            this.countryID = countryID;
        }

        /**
         * Setter for contactName.
         * @param  contactName  String value for contactName.
         * @return Builder
         */
        public Builder contactName(String contactName) {
            this.contactName = contactName;
            return this;
        }

        /**
         * Setter for companyName.
         * @param  companyName  String value for companyName.
         * @return Builder
         */
        public Builder companyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        /**
         * Setter for addressLine.
         * @param  addressLine  String value for addressLine.
         * @return Builder
         */
        public Builder addressLine(String addressLine) {
            this.addressLine = addressLine;
            return this;
        }

        /**
         * Setter for zipCode.
         * @param  zipCode  String value for zipCode.
         * @return Builder
         */
        public Builder zipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        /**
         * Setter for countryID.
         * @param  countryID  int value for countryID.
         * @return Builder
         */
        public Builder countryID(int countryID) {
            this.countryID = countryID;
            return this;
        }

        /**
         * Setter for contactTitle.
         * @param  contactTitle  String value for contactTitle.
         * @return Builder
         */
        public Builder contactTitle(String contactTitle) {
            this.contactTitle = contactTitle;
            return this;
        }

        /**
         * Setter for city.
         * @param  city  String value for city.
         * @return Builder
         */
        public Builder city(String city) {
            this.city = city;
            return this;
        }

        /**
         * Setter for regionID.
         * @param  regionID  Integer value for regionID.
         * @return Builder
         */
        public Builder regionID(Integer regionID) {
            this.regionID = regionID;
            return this;
        }

        /**
         * Setter for emailAddress.
         * @param  emailAddress  String value for emailAddress.
         * @return Builder
         */
        public Builder emailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        /**
         * Setter for phoneNumber.
         * @param  phoneNumber  String value for phoneNumber.
         * @return Builder
         */
        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * Builds a new {@link UpdateCardRenewalAddress2} object using the set fields.
         * @return {@link UpdateCardRenewalAddress2}
         */
        public UpdateCardRenewalAddress2 build() {
            return new UpdateCardRenewalAddress2(contactName, companyName, addressLine, zipCode,
                    countryID, contactTitle, city, regionID, emailAddress, phoneNumber);
        }
    }
}

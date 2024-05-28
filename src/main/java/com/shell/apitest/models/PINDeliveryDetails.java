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
 * This is a model class for PINDeliveryDetails type.
 */
public class PINDeliveryDetails {
    private OptionalNullable<String> contactName;
    private OptionalNullable<String> contactTitle;
    private String companyName;
    private String addressLine;
    private String zipCode;
    private String city;
    private OptionalNullable<Integer> regionID;
    private OptionalNullable<Integer> countryID;
    private OptionalNullable<String> phoneNumber;
    private OptionalNullable<String> emailAddress;
    private Boolean savePINReminder;

    /**
     * Default constructor.
     */
    public PINDeliveryDetails() {
    }

    /**
     * Initialization constructor.
     * @param  companyName  String value for companyName.
     * @param  addressLine  String value for addressLine.
     * @param  zipCode  String value for zipCode.
     * @param  city  String value for city.
     * @param  contactName  String value for contactName.
     * @param  contactTitle  String value for contactTitle.
     * @param  regionID  Integer value for regionID.
     * @param  countryID  Integer value for countryID.
     * @param  phoneNumber  String value for phoneNumber.
     * @param  emailAddress  String value for emailAddress.
     * @param  savePINReminder  Boolean value for savePINReminder.
     */
    public PINDeliveryDetails(
            String companyName,
            String addressLine,
            String zipCode,
            String city,
            String contactName,
            String contactTitle,
            Integer regionID,
            Integer countryID,
            String phoneNumber,
            String emailAddress,
            Boolean savePINReminder) {
        this.contactName = OptionalNullable.of(contactName);
        this.contactTitle = OptionalNullable.of(contactTitle);
        this.companyName = companyName;
        this.addressLine = addressLine;
        this.zipCode = zipCode;
        this.city = city;
        this.regionID = OptionalNullable.of(regionID);
        this.countryID = OptionalNullable.of(countryID);
        this.phoneNumber = OptionalNullable.of(phoneNumber);
        this.emailAddress = OptionalNullable.of(emailAddress);
        this.savePINReminder = savePINReminder;
    }

    /**
     * Initialization constructor.
     * @param  companyName  String value for companyName.
     * @param  addressLine  String value for addressLine.
     * @param  zipCode  String value for zipCode.
     * @param  city  String value for city.
     * @param  contactName  String value for contactName.
     * @param  contactTitle  String value for contactTitle.
     * @param  regionID  Integer value for regionID.
     * @param  countryID  Integer value for countryID.
     * @param  phoneNumber  String value for phoneNumber.
     * @param  emailAddress  String value for emailAddress.
     * @param  savePINReminder  Boolean value for savePINReminder.
     */

    protected PINDeliveryDetails(String companyName, String addressLine, String zipCode,
            String city, OptionalNullable<String> contactName,
            OptionalNullable<String> contactTitle, OptionalNullable<Integer> regionID,
            OptionalNullable<Integer> countryID, OptionalNullable<String> phoneNumber,
            OptionalNullable<String> emailAddress, Boolean savePINReminder) {
        this.contactName = contactName;
        this.contactTitle = contactTitle;
        this.companyName = companyName;
        this.addressLine = addressLine;
        this.zipCode = zipCode;
        this.city = city;
        this.regionID = regionID;
        this.countryID = countryID;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.savePINReminder = savePINReminder;
    }

    /**
     * Internal Getter for ContactName.
     * Contact Name Max Length: 50
     * @return Returns the Internal String
     */
    @JsonGetter("ContactName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetContactName() {
        return this.contactName;
    }

    /**
     * Getter for ContactName.
     * Contact Name Max Length: 50
     * @return Returns the String
     */
    public String getContactName() {
        return OptionalNullable.getFrom(contactName);
    }

    /**
     * Setter for ContactName.
     * Contact Name Max Length: 50
     * @param contactName Value for String
     */
    @JsonSetter("ContactName")
    public void setContactName(String contactName) {
        this.contactName = OptionalNullable.of(contactName);
    }

    /**
     * UnSetter for ContactName.
     * Contact Name Max Length: 50
     */
    public void unsetContactName() {
        contactName = null;
    }

    /**
     * Internal Getter for ContactTitle.
     * Contact Title Max Length: 50
     * @return Returns the Internal String
     */
    @JsonGetter("ContactTitle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetContactTitle() {
        return this.contactTitle;
    }

    /**
     * Getter for ContactTitle.
     * Contact Title Max Length: 50
     * @return Returns the String
     */
    public String getContactTitle() {
        return OptionalNullable.getFrom(contactTitle);
    }

    /**
     * Setter for ContactTitle.
     * Contact Title Max Length: 50
     * @param contactTitle Value for String
     */
    @JsonSetter("ContactTitle")
    public void setContactTitle(String contactTitle) {
        this.contactTitle = OptionalNullable.of(contactTitle);
    }

    /**
     * UnSetter for ContactTitle.
     * Contact Title Max Length: 50
     */
    public void unsetContactTitle() {
        contactTitle = null;
    }

    /**
     * Getter for CompanyName.
     * Company Name for PIN delivery. Max Length: 50
     * @return Returns the String
     */
    @JsonGetter("CompanyName")
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Setter for CompanyName.
     * Company Name for PIN delivery. Max Length: 50
     * @param companyName Value for String
     */
    @JsonSetter("CompanyName")
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * Getter for AddressLine.
     * Address Lines Max Length: 1024
     * @return Returns the String
     */
    @JsonGetter("AddressLine")
    public String getAddressLine() {
        return addressLine;
    }

    /**
     * Setter for AddressLine.
     * Address Lines Max Length: 1024
     * @param addressLine Value for String
     */
    @JsonSetter("AddressLine")
    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    /**
     * Getter for ZipCode.
     * Zip Code Max Length: 10
     * @return Returns the String
     */
    @JsonGetter("ZipCode")
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Setter for ZipCode.
     * Zip Code Max Length: 10
     * @param zipCode Value for String
     */
    @JsonSetter("ZipCode")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * Getter for City.
     * City Max Length: 40
     * @return Returns the String
     */
    @JsonGetter("City")
    public String getCity() {
        return city;
    }

    /**
     * Setter for City.
     * City Max Length: 40
     * @param city Value for String
     */
    @JsonSetter("City")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Internal Getter for RegionID.
     * Region
     * @return Returns the Internal Integer
     */
    @JsonGetter("RegionID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetRegionID() {
        return this.regionID;
    }

    /**
     * Getter for RegionID.
     * Region
     * @return Returns the Integer
     */
    public Integer getRegionID() {
        return OptionalNullable.getFrom(regionID);
    }

    /**
     * Setter for RegionID.
     * Region
     * @param regionID Value for Integer
     */
    @JsonSetter("RegionID")
    public void setRegionID(Integer regionID) {
        this.regionID = OptionalNullable.of(regionID);
    }

    /**
     * UnSetter for RegionID.
     * Region
     */
    public void unsetRegionID() {
        regionID = null;
    }

    /**
     * Internal Getter for CountryID.
     * Country
     * @return Returns the Internal Integer
     */
    @JsonGetter("CountryID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetCountryID() {
        return this.countryID;
    }

    /**
     * Getter for CountryID.
     * Country
     * @return Returns the Integer
     */
    public Integer getCountryID() {
        return OptionalNullable.getFrom(countryID);
    }

    /**
     * Setter for CountryID.
     * Country
     * @param countryID Value for Integer
     */
    @JsonSetter("CountryID")
    public void setCountryID(Integer countryID) {
        this.countryID = OptionalNullable.of(countryID);
    }

    /**
     * UnSetter for CountryID.
     * Country
     */
    public void unsetCountryID() {
        countryID = null;
    }

    /**
     * Internal Getter for PhoneNumber.
     * Cardholder phone number for PIN delivery.
     * @return Returns the Internal String
     */
    @JsonGetter("PhoneNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Getter for PhoneNumber.
     * Cardholder phone number for PIN delivery.
     * @return Returns the String
     */
    public String getPhoneNumber() {
        return OptionalNullable.getFrom(phoneNumber);
    }

    /**
     * Setter for PhoneNumber.
     * Cardholder phone number for PIN delivery.
     * @param phoneNumber Value for String
     */
    @JsonSetter("PhoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = OptionalNullable.of(phoneNumber);
    }

    /**
     * UnSetter for PhoneNumber.
     * Cardholder phone number for PIN delivery.
     */
    public void unsetPhoneNumber() {
        phoneNumber = null;
    }

    /**
     * Internal Getter for EmailAddress.
     * Cardholder email address for PIN delivery Max Length : 90 Example: xxxxxx{@literal @}example.com
     * &lt;br/&gt;Note:Based on the international standard that there can be Max Length 64 before the {@literal @}
     * (the 'Local part’) =64(minimum of 1) Max Lenth after the (the domain) = 88 (Minimum of 2)
     * @return Returns the Internal String
     */
    @JsonGetter("EmailAddress")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetEmailAddress() {
        return this.emailAddress;
    }

    /**
     * Getter for EmailAddress.
     * Cardholder email address for PIN delivery Max Length : 90 Example: xxxxxx{@literal @}example.com
     * &lt;br/&gt;Note:Based on the international standard that there can be Max Length 64 before the {@literal @}
     * (the 'Local part’) =64(minimum of 1) Max Lenth after the (the domain) = 88 (Minimum of 2)
     * @return Returns the String
     */
    public String getEmailAddress() {
        return OptionalNullable.getFrom(emailAddress);
    }

    /**
     * Setter for EmailAddress.
     * Cardholder email address for PIN delivery Max Length : 90 Example: xxxxxx{@literal @}example.com
     * &lt;br/&gt;Note:Based on the international standard that there can be Max Length 64 before the {@literal @}
     * (the 'Local part’) =64(minimum of 1) Max Lenth after the (the domain) = 88 (Minimum of 2)
     * @param emailAddress Value for String
     */
    @JsonSetter("EmailAddress")
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = OptionalNullable.of(emailAddress);
    }

    /**
     * UnSetter for EmailAddress.
     * Cardholder email address for PIN delivery Max Length : 90 Example: xxxxxx{@literal @}example.com
     * &lt;br/&gt;Note:Based on the international standard that there can be Max Length 64 before the {@literal @}
     * (the 'Local part’) =64(minimum of 1) Max Lenth after the (the domain) = 88 (Minimum of 2)
     */
    public void unsetEmailAddress() {
        emailAddress = null;
    }

    /**
     * Getter for SavePINReminder.
     * Save PIN Reminder If SavePINReminder is true, the contact address will be saved database for
     * PIN reminder. &lt;br/&gt;Only allowed for PIN Advice paper delivery.
     * @return Returns the Boolean
     */
    @JsonGetter("SavePINReminder")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getSavePINReminder() {
        return savePINReminder;
    }

    /**
     * Setter for SavePINReminder.
     * Save PIN Reminder If SavePINReminder is true, the contact address will be saved database for
     * PIN reminder. &lt;br/&gt;Only allowed for PIN Advice paper delivery.
     * @param savePINReminder Value for Boolean
     */
    @JsonSetter("SavePINReminder")
    public void setSavePINReminder(Boolean savePINReminder) {
        this.savePINReminder = savePINReminder;
    }

    /**
     * Converts this PINDeliveryDetails into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PINDeliveryDetails [" + "companyName=" + companyName + ", addressLine="
                + addressLine + ", zipCode=" + zipCode + ", city=" + city + ", contactName="
                + contactName + ", contactTitle=" + contactTitle + ", regionID=" + regionID
                + ", countryID=" + countryID + ", phoneNumber=" + phoneNumber + ", emailAddress="
                + emailAddress + ", savePINReminder=" + savePINReminder + "]";
    }

    /**
     * Builds a new {@link PINDeliveryDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PINDeliveryDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(companyName, addressLine, zipCode, city)
                .savePINReminder(getSavePINReminder());
        builder.contactName = internalGetContactName();
        builder.contactTitle = internalGetContactTitle();
        builder.regionID = internalGetRegionID();
        builder.countryID = internalGetCountryID();
        builder.phoneNumber = internalGetPhoneNumber();
        builder.emailAddress = internalGetEmailAddress();
        return builder;
    }

    /**
     * Class to build instances of {@link PINDeliveryDetails}.
     */
    public static class Builder {
        private String companyName;
        private String addressLine;
        private String zipCode;
        private String city;
        private OptionalNullable<String> contactName;
        private OptionalNullable<String> contactTitle;
        private OptionalNullable<Integer> regionID;
        private OptionalNullable<Integer> countryID;
        private OptionalNullable<String> phoneNumber;
        private OptionalNullable<String> emailAddress;
        private Boolean savePINReminder;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  companyName  String value for companyName.
         * @param  addressLine  String value for addressLine.
         * @param  zipCode  String value for zipCode.
         * @param  city  String value for city.
         */
        public Builder(String companyName, String addressLine, String zipCode, String city) {
            this.companyName = companyName;
            this.addressLine = addressLine;
            this.zipCode = zipCode;
            this.city = city;
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
         * Setter for city.
         * @param  city  String value for city.
         * @return Builder
         */
        public Builder city(String city) {
            this.city = city;
            return this;
        }

        /**
         * Setter for contactName.
         * @param  contactName  String value for contactName.
         * @return Builder
         */
        public Builder contactName(String contactName) {
            this.contactName = OptionalNullable.of(contactName);
            return this;
        }

        /**
         * UnSetter for contactName.
         * @return Builder
         */
        public Builder unsetContactName() {
            contactName = null;
            return this;
        }

        /**
         * Setter for contactTitle.
         * @param  contactTitle  String value for contactTitle.
         * @return Builder
         */
        public Builder contactTitle(String contactTitle) {
            this.contactTitle = OptionalNullable.of(contactTitle);
            return this;
        }

        /**
         * UnSetter for contactTitle.
         * @return Builder
         */
        public Builder unsetContactTitle() {
            contactTitle = null;
            return this;
        }

        /**
         * Setter for regionID.
         * @param  regionID  Integer value for regionID.
         * @return Builder
         */
        public Builder regionID(Integer regionID) {
            this.regionID = OptionalNullable.of(regionID);
            return this;
        }

        /**
         * UnSetter for regionID.
         * @return Builder
         */
        public Builder unsetRegionID() {
            regionID = null;
            return this;
        }

        /**
         * Setter for countryID.
         * @param  countryID  Integer value for countryID.
         * @return Builder
         */
        public Builder countryID(Integer countryID) {
            this.countryID = OptionalNullable.of(countryID);
            return this;
        }

        /**
         * UnSetter for countryID.
         * @return Builder
         */
        public Builder unsetCountryID() {
            countryID = null;
            return this;
        }

        /**
         * Setter for phoneNumber.
         * @param  phoneNumber  String value for phoneNumber.
         * @return Builder
         */
        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = OptionalNullable.of(phoneNumber);
            return this;
        }

        /**
         * UnSetter for phoneNumber.
         * @return Builder
         */
        public Builder unsetPhoneNumber() {
            phoneNumber = null;
            return this;
        }

        /**
         * Setter for emailAddress.
         * @param  emailAddress  String value for emailAddress.
         * @return Builder
         */
        public Builder emailAddress(String emailAddress) {
            this.emailAddress = OptionalNullable.of(emailAddress);
            return this;
        }

        /**
         * UnSetter for emailAddress.
         * @return Builder
         */
        public Builder unsetEmailAddress() {
            emailAddress = null;
            return this;
        }

        /**
         * Setter for savePINReminder.
         * @param  savePINReminder  Boolean value for savePINReminder.
         * @return Builder
         */
        public Builder savePINReminder(Boolean savePINReminder) {
            this.savePINReminder = savePINReminder;
            return this;
        }

        /**
         * Builds a new {@link PINDeliveryDetails} object using the set fields.
         * @return {@link PINDeliveryDetails}
         */
        public PINDeliveryDetails build() {
            return new PINDeliveryDetails(companyName, addressLine, zipCode, city, contactName,
                    contactTitle, regionID, countryID, phoneNumber, emailAddress, savePINReminder);
        }
    }
}

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
 * This is a model class for PINDeliveryAddress type.
 */
public class PINDeliveryAddress {
    private OptionalNullable<String> contactForeName;
    private OptionalNullable<String> contactMiddleName;
    private OptionalNullable<String> contactLastName;
    private OptionalNullable<String> contactTitle;
    private String companyName;
    private int addressId;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String zipCode;
    private String city;
    private OptionalNullable<Integer> regionId;
    private String region;
    private int countryId;
    private String countryISOCode;
    private String country;

    /**
     * Default constructor.
     */
    public PINDeliveryAddress() {
    }

    /**
     * Initialization constructor.
     * @param  companyName  String value for companyName.
     * @param  addressId  int value for addressId.
     * @param  addressLine1  String value for addressLine1.
     * @param  zipCode  String value for zipCode.
     * @param  countryId  int value for countryId.
     * @param  countryISOCode  String value for countryISOCode.
     * @param  country  String value for country.
     * @param  contactForeName  String value for contactForeName.
     * @param  contactMiddleName  String value for contactMiddleName.
     * @param  contactLastName  String value for contactLastName.
     * @param  contactTitle  String value for contactTitle.
     * @param  addressLine2  String value for addressLine2.
     * @param  addressLine3  String value for addressLine3.
     * @param  city  String value for city.
     * @param  regionId  Integer value for regionId.
     * @param  region  String value for region.
     */
    public PINDeliveryAddress(
            String companyName,
            int addressId,
            String addressLine1,
            String zipCode,
            int countryId,
            String countryISOCode,
            String country,
            String contactForeName,
            String contactMiddleName,
            String contactLastName,
            String contactTitle,
            String addressLine2,
            String addressLine3,
            String city,
            Integer regionId,
            String region) {
        this.contactForeName = OptionalNullable.of(contactForeName);
        this.contactMiddleName = OptionalNullable.of(contactMiddleName);
        this.contactLastName = OptionalNullable.of(contactLastName);
        this.contactTitle = OptionalNullable.of(contactTitle);
        this.companyName = companyName;
        this.addressId = addressId;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = addressLine3;
        this.zipCode = zipCode;
        this.city = city;
        this.regionId = OptionalNullable.of(regionId);
        this.region = region;
        this.countryId = countryId;
        this.countryISOCode = countryISOCode;
        this.country = country;
    }

    /**
     * Initialization constructor.
     * @param  companyName  String value for companyName.
     * @param  addressId  int value for addressId.
     * @param  addressLine1  String value for addressLine1.
     * @param  zipCode  String value for zipCode.
     * @param  countryId  int value for countryId.
     * @param  countryISOCode  String value for countryISOCode.
     * @param  country  String value for country.
     * @param  contactForeName  String value for contactForeName.
     * @param  contactMiddleName  String value for contactMiddleName.
     * @param  contactLastName  String value for contactLastName.
     * @param  contactTitle  String value for contactTitle.
     * @param  addressLine2  String value for addressLine2.
     * @param  addressLine3  String value for addressLine3.
     * @param  city  String value for city.
     * @param  regionId  Integer value for regionId.
     * @param  region  String value for region.
     */

    protected PINDeliveryAddress(String companyName, int addressId, String addressLine1,
            String zipCode, int countryId, String countryISOCode, String country,
            OptionalNullable<String> contactForeName, OptionalNullable<String> contactMiddleName,
            OptionalNullable<String> contactLastName, OptionalNullable<String> contactTitle,
            String addressLine2, String addressLine3, String city,
            OptionalNullable<Integer> regionId, String region) {
        this.contactForeName = contactForeName;
        this.contactMiddleName = contactMiddleName;
        this.contactLastName = contactLastName;
        this.contactTitle = contactTitle;
        this.companyName = companyName;
        this.addressId = addressId;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = addressLine3;
        this.zipCode = zipCode;
        this.city = city;
        this.regionId = regionId;
        this.region = region;
        this.countryId = countryId;
        this.countryISOCode = countryISOCode;
        this.country = country;
    }

    /**
     * Internal Getter for ContactForeName.
     * Fore name of the contact person
     * @return Returns the Internal String
     */
    @JsonGetter("ContactForeName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetContactForeName() {
        return this.contactForeName;
    }

    /**
     * Getter for ContactForeName.
     * Fore name of the contact person
     * @return Returns the String
     */
    public String getContactForeName() {
        return OptionalNullable.getFrom(contactForeName);
    }

    /**
     * Setter for ContactForeName.
     * Fore name of the contact person
     * @param contactForeName Value for String
     */
    @JsonSetter("ContactForeName")
    public void setContactForeName(String contactForeName) {
        this.contactForeName = OptionalNullable.of(contactForeName);
    }

    /**
     * UnSetter for ContactForeName.
     * Fore name of the contact person
     */
    public void unsetContactForeName() {
        contactForeName = null;
    }

    /**
     * Internal Getter for ContactMiddleName.
     * Middle name of the contact person
     * @return Returns the Internal String
     */
    @JsonGetter("ContactMiddleName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetContactMiddleName() {
        return this.contactMiddleName;
    }

    /**
     * Getter for ContactMiddleName.
     * Middle name of the contact person
     * @return Returns the String
     */
    public String getContactMiddleName() {
        return OptionalNullable.getFrom(contactMiddleName);
    }

    /**
     * Setter for ContactMiddleName.
     * Middle name of the contact person
     * @param contactMiddleName Value for String
     */
    @JsonSetter("ContactMiddleName")
    public void setContactMiddleName(String contactMiddleName) {
        this.contactMiddleName = OptionalNullable.of(contactMiddleName);
    }

    /**
     * UnSetter for ContactMiddleName.
     * Middle name of the contact person
     */
    public void unsetContactMiddleName() {
        contactMiddleName = null;
    }

    /**
     * Internal Getter for ContactLastName.
     * Last name of the contact person
     * @return Returns the Internal String
     */
    @JsonGetter("ContactLastName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetContactLastName() {
        return this.contactLastName;
    }

    /**
     * Getter for ContactLastName.
     * Last name of the contact person
     * @return Returns the String
     */
    public String getContactLastName() {
        return OptionalNullable.getFrom(contactLastName);
    }

    /**
     * Setter for ContactLastName.
     * Last name of the contact person
     * @param contactLastName Value for String
     */
    @JsonSetter("ContactLastName")
    public void setContactLastName(String contactLastName) {
        this.contactLastName = OptionalNullable.of(contactLastName);
    }

    /**
     * UnSetter for ContactLastName.
     * Last name of the contact person
     */
    public void unsetContactLastName() {
        contactLastName = null;
    }

    /**
     * Internal Getter for ContactTitle.
     * Title of the contact person Optional Max field length- 10 Note- If the Shell Card Platform
     * configuration is set to clear the personal details captured on card orders, this value will
     * be cleared from the record after processing the request.
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
     * Title of the contact person Optional Max field length- 10 Note- If the Shell Card Platform
     * configuration is set to clear the personal details captured on card orders, this value will
     * be cleared from the record after processing the request.
     * @return Returns the String
     */
    public String getContactTitle() {
        return OptionalNullable.getFrom(contactTitle);
    }

    /**
     * Setter for ContactTitle.
     * Title of the contact person Optional Max field length- 10 Note- If the Shell Card Platform
     * configuration is set to clear the personal details captured on card orders, this value will
     * be cleared from the record after processing the request.
     * @param contactTitle Value for String
     */
    @JsonSetter("ContactTitle")
    public void setContactTitle(String contactTitle) {
        this.contactTitle = OptionalNullable.of(contactTitle);
    }

    /**
     * UnSetter for ContactTitle.
     * Title of the contact person Optional Max field length- 10 Note- If the Shell Card Platform
     * configuration is set to clear the personal details captured on card orders, this value will
     * be cleared from the record after processing the request.
     */
    public void unsetContactTitle() {
        contactTitle = null;
    }

    /**
     * Getter for CompanyName.
     * Company name Mandatory if IsNewDeliveryAddress and OrderReplacement are passed. True, Note-
     * If the Shell Card Platform configuration is set to clear the personal details captured on
     * card orders, this value will be cleared from the record after processing the request.
     * @return Returns the String
     */
    @JsonGetter("CompanyName")
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Setter for CompanyName.
     * Company name Mandatory if IsNewDeliveryAddress and OrderReplacement are passed. True, Note-
     * If the Shell Card Platform configuration is set to clear the personal details captured on
     * card orders, this value will be cleared from the record after processing the request.
     * @param companyName Value for String
     */
    @JsonSetter("CompanyName")
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * Getter for AddressId.
     * Address Id in cards platform.
     * @return Returns the int
     */
    @JsonGetter("AddressId")
    public int getAddressId() {
        return addressId;
    }

    /**
     * Setter for AddressId.
     * Address Id in cards platform.
     * @param addressId Value for int
     */
    @JsonSetter("AddressId")
    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    /**
     * Getter for AddressLine1.
     * Address line 1 Mandatory if IsNewDeliveryAddress and OrderReplacement are passed True. Max
     * field length- 40 Note- If the Shell Card Platform configuration is set to clear the personal
     * details captured on card orders, this value will be cleared from the record after processing
     * the request.
     * @return Returns the String
     */
    @JsonGetter("AddressLine1")
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Setter for AddressLine1.
     * Address line 1 Mandatory if IsNewDeliveryAddress and OrderReplacement are passed True. Max
     * field length- 40 Note- If the Shell Card Platform configuration is set to clear the personal
     * details captured on card orders, this value will be cleared from the record after processing
     * the request.
     * @param addressLine1 Value for String
     */
    @JsonSetter("AddressLine1")
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    /**
     * Getter for AddressLine2.
     * Address line 2 Optional Max field length- 40 Note- If the Shell Card Platform configuration
     * is set to clear the personal details captured on card orders, this value will be cleared from
     * the record after processing the request.
     * @return Returns the String
     */
    @JsonGetter("AddressLine2")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Setter for AddressLine2.
     * Address line 2 Optional Max field length- 40 Note- If the Shell Card Platform configuration
     * is set to clear the personal details captured on card orders, this value will be cleared from
     * the record after processing the request.
     * @param addressLine2 Value for String
     */
    @JsonSetter("AddressLine2")
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    /**
     * Getter for AddressLine3.
     * Address line Optional Max field length- 40 Note- If the Shell Card Platform configuration is
     * set to clear the personal details captured on card orders, this value will be cleared from
     * the record after processing the request.
     * @return Returns the String
     */
    @JsonGetter("AddressLine3")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddressLine3() {
        return addressLine3;
    }

    /**
     * Setter for AddressLine3.
     * Address line Optional Max field length- 40 Note- If the Shell Card Platform configuration is
     * set to clear the personal details captured on card orders, this value will be cleared from
     * the record after processing the request.
     * @param addressLine3 Value for String
     */
    @JsonSetter("AddressLine3")
    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    /**
     * Getter for ZipCode.
     * ZIP code Mandatory if IsNewDeliveryAddress and OrderReplacement are passed. True, Max field
     * length- 10 Note- If the Shell Card Platform configuration is set to clear the personal
     * details captured on card orders, this value will be cleared from the record after processing
     * the request.
     * @return Returns the String
     */
    @JsonGetter("ZipCode")
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Setter for ZipCode.
     * ZIP code Mandatory if IsNewDeliveryAddress and OrderReplacement are passed. True, Max field
     * length- 10 Note- If the Shell Card Platform configuration is set to clear the personal
     * details captured on card orders, this value will be cleared from the record after processing
     * the request.
     * @param zipCode Value for String
     */
    @JsonSetter("ZipCode")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * Getter for City.
     * City Max field length- 40 Note- If the Shell Card Platform configuration is set to clear the
     * personal details captured on card orders, this value will be cleared from the record after
     * processing the request.
     * @return Returns the String
     */
    @JsonGetter("City")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCity() {
        return city;
    }

    /**
     * Setter for City.
     * City Max field length- 40 Note- If the Shell Card Platform configuration is set to clear the
     * personal details captured on card orders, this value will be cleared from the record after
     * processing the request.
     * @param city Value for String
     */
    @JsonSetter("City")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Internal Getter for RegionId.
     * Region Id
     * @return Returns the Internal Integer
     */
    @JsonGetter("RegionId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetRegionId() {
        return this.regionId;
    }

    /**
     * Getter for RegionId.
     * Region Id
     * @return Returns the Integer
     */
    public Integer getRegionId() {
        return OptionalNullable.getFrom(regionId);
    }

    /**
     * Setter for RegionId.
     * Region Id
     * @param regionId Value for Integer
     */
    @JsonSetter("RegionId")
    public void setRegionId(Integer regionId) {
        this.regionId = OptionalNullable.of(regionId);
    }

    /**
     * UnSetter for RegionId.
     * Region Id
     */
    public void unsetRegionId() {
        regionId = null;
    }

    /**
     * Getter for Region.
     * Region Optional When region is passed, Shell Card Platform will look up for the region id for
     * the given region. If the option to clear personal details is set in the Shell Card Platform,
     * then this value will be cleared from the record after processing the request .
     * @return Returns the String
     */
    @JsonGetter("Region")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRegion() {
        return region;
    }

    /**
     * Setter for Region.
     * Region Optional When region is passed, Shell Card Platform will look up for the region id for
     * the given region. If the option to clear personal details is set in the Shell Card Platform,
     * then this value will be cleared from the record after processing the request .
     * @param region Value for String
     */
    @JsonSetter("Region")
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Getter for CountryId.
     * Country Id in cards platform.
     * @return Returns the int
     */
    @JsonGetter("CountryId")
    public int getCountryId() {
        return countryId;
    }

    /**
     * Setter for CountryId.
     * Country Id in cards platform.
     * @param countryId Value for int
     */
    @JsonSetter("CountryId")
    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    /**
     * Getter for CountryISOCode.
     * The ISO code of the country. Mandatory if IsNewDeliveryAddress and OrderReplacement are
     * passed. If the option to clear personal details is set in the Shell Card Platform, then this
     * value will be cleared from the record after processing the request .
     * @return Returns the String
     */
    @JsonGetter("CountryISOCode")
    public String getCountryISOCode() {
        return countryISOCode;
    }

    /**
     * Setter for CountryISOCode.
     * The ISO code of the country. Mandatory if IsNewDeliveryAddress and OrderReplacement are
     * passed. If the option to clear personal details is set in the Shell Card Platform, then this
     * value will be cleared from the record after processing the request .
     * @param countryISOCode Value for String
     */
    @JsonSetter("CountryISOCode")
    public void setCountryISOCode(String countryISOCode) {
        this.countryISOCode = countryISOCode;
    }

    /**
     * Getter for Country.
     * Country name.
     * @return Returns the String
     */
    @JsonGetter("Country")
    public String getCountry() {
        return country;
    }

    /**
     * Setter for Country.
     * Country name.
     * @param country Value for String
     */
    @JsonSetter("Country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Converts this PINDeliveryAddress into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PINDeliveryAddress [" + "companyName=" + companyName + ", addressId=" + addressId
                + ", addressLine1=" + addressLine1 + ", zipCode=" + zipCode + ", countryId="
                + countryId + ", countryISOCode=" + countryISOCode + ", country=" + country
                + ", contactForeName=" + contactForeName + ", contactMiddleName="
                + contactMiddleName + ", contactLastName=" + contactLastName + ", contactTitle="
                + contactTitle + ", addressLine2=" + addressLine2 + ", addressLine3=" + addressLine3
                + ", city=" + city + ", regionId=" + regionId + ", region=" + region + "]";
    }

    /**
     * Builds a new {@link PINDeliveryAddress.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PINDeliveryAddress.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(companyName, addressId, addressLine1, zipCode, countryId,
                countryISOCode, country)
                .addressLine2(getAddressLine2())
                .addressLine3(getAddressLine3())
                .city(getCity())
                .region(getRegion());
        builder.contactForeName = internalGetContactForeName();
        builder.contactMiddleName = internalGetContactMiddleName();
        builder.contactLastName = internalGetContactLastName();
        builder.contactTitle = internalGetContactTitle();
        builder.regionId = internalGetRegionId();
        return builder;
    }

    /**
     * Class to build instances of {@link PINDeliveryAddress}.
     */
    public static class Builder {
        private String companyName;
        private int addressId;
        private String addressLine1;
        private String zipCode;
        private int countryId;
        private String countryISOCode;
        private String country;
        private OptionalNullable<String> contactForeName;
        private OptionalNullable<String> contactMiddleName;
        private OptionalNullable<String> contactLastName;
        private OptionalNullable<String> contactTitle;
        private String addressLine2;
        private String addressLine3;
        private String city;
        private OptionalNullable<Integer> regionId;
        private String region;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  companyName  String value for companyName.
         * @param  addressId  int value for addressId.
         * @param  addressLine1  String value for addressLine1.
         * @param  zipCode  String value for zipCode.
         * @param  countryId  int value for countryId.
         * @param  countryISOCode  String value for countryISOCode.
         * @param  country  String value for country.
         */
        public Builder(String companyName, int addressId, String addressLine1, String zipCode,
                int countryId, String countryISOCode, String country) {
            this.companyName = companyName;
            this.addressId = addressId;
            this.addressLine1 = addressLine1;
            this.zipCode = zipCode;
            this.countryId = countryId;
            this.countryISOCode = countryISOCode;
            this.country = country;
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
         * Setter for addressId.
         * @param  addressId  int value for addressId.
         * @return Builder
         */
        public Builder addressId(int addressId) {
            this.addressId = addressId;
            return this;
        }

        /**
         * Setter for addressLine1.
         * @param  addressLine1  String value for addressLine1.
         * @return Builder
         */
        public Builder addressLine1(String addressLine1) {
            this.addressLine1 = addressLine1;
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
         * Setter for countryId.
         * @param  countryId  int value for countryId.
         * @return Builder
         */
        public Builder countryId(int countryId) {
            this.countryId = countryId;
            return this;
        }

        /**
         * Setter for countryISOCode.
         * @param  countryISOCode  String value for countryISOCode.
         * @return Builder
         */
        public Builder countryISOCode(String countryISOCode) {
            this.countryISOCode = countryISOCode;
            return this;
        }

        /**
         * Setter for country.
         * @param  country  String value for country.
         * @return Builder
         */
        public Builder country(String country) {
            this.country = country;
            return this;
        }

        /**
         * Setter for contactForeName.
         * @param  contactForeName  String value for contactForeName.
         * @return Builder
         */
        public Builder contactForeName(String contactForeName) {
            this.contactForeName = OptionalNullable.of(contactForeName);
            return this;
        }

        /**
         * UnSetter for contactForeName.
         * @return Builder
         */
        public Builder unsetContactForeName() {
            contactForeName = null;
            return this;
        }

        /**
         * Setter for contactMiddleName.
         * @param  contactMiddleName  String value for contactMiddleName.
         * @return Builder
         */
        public Builder contactMiddleName(String contactMiddleName) {
            this.contactMiddleName = OptionalNullable.of(contactMiddleName);
            return this;
        }

        /**
         * UnSetter for contactMiddleName.
         * @return Builder
         */
        public Builder unsetContactMiddleName() {
            contactMiddleName = null;
            return this;
        }

        /**
         * Setter for contactLastName.
         * @param  contactLastName  String value for contactLastName.
         * @return Builder
         */
        public Builder contactLastName(String contactLastName) {
            this.contactLastName = OptionalNullable.of(contactLastName);
            return this;
        }

        /**
         * UnSetter for contactLastName.
         * @return Builder
         */
        public Builder unsetContactLastName() {
            contactLastName = null;
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
         * Setter for addressLine2.
         * @param  addressLine2  String value for addressLine2.
         * @return Builder
         */
        public Builder addressLine2(String addressLine2) {
            this.addressLine2 = addressLine2;
            return this;
        }

        /**
         * Setter for addressLine3.
         * @param  addressLine3  String value for addressLine3.
         * @return Builder
         */
        public Builder addressLine3(String addressLine3) {
            this.addressLine3 = addressLine3;
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
         * Setter for regionId.
         * @param  regionId  Integer value for regionId.
         * @return Builder
         */
        public Builder regionId(Integer regionId) {
            this.regionId = OptionalNullable.of(regionId);
            return this;
        }

        /**
         * UnSetter for regionId.
         * @return Builder
         */
        public Builder unsetRegionId() {
            regionId = null;
            return this;
        }

        /**
         * Setter for region.
         * @param  region  String value for region.
         * @return Builder
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * Builds a new {@link PINDeliveryAddress} object using the set fields.
         * @return {@link PINDeliveryAddress}
         */
        public PINDeliveryAddress build() {
            return new PINDeliveryAddress(companyName, addressId, addressLine1, zipCode, countryId,
                    countryISOCode, country, contactForeName, contactMiddleName, contactLastName,
                    contactTitle, addressLine2, addressLine3, city, regionId, region);
        }
    }
}

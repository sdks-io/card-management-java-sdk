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
 * This is a model class for DeliveryAddresses type.
 */
public class DeliveryAddresses {
    private OptionalNullable<Integer> addressId;
    private OptionalNullable<String> addressLine1;
    private OptionalNullable<String> addressLine2;
    private OptionalNullable<String> addressLine3;
    private OptionalNullable<String> city;
    private OptionalNullable<String> companyName;
    private OptionalNullable<String> contactForeName;
    private OptionalNullable<String> contactLastName;
    private OptionalNullable<String> contactMiddleName;
    private OptionalNullable<String> contactTitle;
    private OptionalNullable<String> country;
    private OptionalNullable<Integer> countryId;
    private OptionalNullable<String> countryISOCode;
    private OptionalNullable<String> fax;
    private OptionalNullable<String> region;
    private OptionalNullable<Integer> regionId;
    private OptionalNullable<String> telephone;
    private OptionalNullable<String> zipCode;
    private OptionalNullable<Integer> addressType;

    /**
     * Default constructor.
     */
    public DeliveryAddresses() {
    }

    /**
     * Initialization constructor.
     * @param  addressId  Integer value for addressId.
     * @param  addressLine1  String value for addressLine1.
     * @param  addressLine2  String value for addressLine2.
     * @param  addressLine3  String value for addressLine3.
     * @param  city  String value for city.
     * @param  companyName  String value for companyName.
     * @param  contactForeName  String value for contactForeName.
     * @param  contactLastName  String value for contactLastName.
     * @param  contactMiddleName  String value for contactMiddleName.
     * @param  contactTitle  String value for contactTitle.
     * @param  country  String value for country.
     * @param  countryId  Integer value for countryId.
     * @param  countryISOCode  String value for countryISOCode.
     * @param  fax  String value for fax.
     * @param  region  String value for region.
     * @param  regionId  Integer value for regionId.
     * @param  telephone  String value for telephone.
     * @param  zipCode  String value for zipCode.
     * @param  addressType  Integer value for addressType.
     */
    public DeliveryAddresses(
            Integer addressId,
            String addressLine1,
            String addressLine2,
            String addressLine3,
            String city,
            String companyName,
            String contactForeName,
            String contactLastName,
            String contactMiddleName,
            String contactTitle,
            String country,
            Integer countryId,
            String countryISOCode,
            String fax,
            String region,
            Integer regionId,
            String telephone,
            String zipCode,
            Integer addressType) {
        this.addressId = OptionalNullable.of(addressId);
        this.addressLine1 = OptionalNullable.of(addressLine1);
        this.addressLine2 = OptionalNullable.of(addressLine2);
        this.addressLine3 = OptionalNullable.of(addressLine3);
        this.city = OptionalNullable.of(city);
        this.companyName = OptionalNullable.of(companyName);
        this.contactForeName = OptionalNullable.of(contactForeName);
        this.contactLastName = OptionalNullable.of(contactLastName);
        this.contactMiddleName = OptionalNullable.of(contactMiddleName);
        this.contactTitle = OptionalNullable.of(contactTitle);
        this.country = OptionalNullable.of(country);
        this.countryId = OptionalNullable.of(countryId);
        this.countryISOCode = OptionalNullable.of(countryISOCode);
        this.fax = OptionalNullable.of(fax);
        this.region = OptionalNullable.of(region);
        this.regionId = OptionalNullable.of(regionId);
        this.telephone = OptionalNullable.of(telephone);
        this.zipCode = OptionalNullable.of(zipCode);
        this.addressType = OptionalNullable.of(addressType);
    }

    /**
     * Initialization constructor.
     * @param  addressId  Integer value for addressId.
     * @param  addressLine1  String value for addressLine1.
     * @param  addressLine2  String value for addressLine2.
     * @param  addressLine3  String value for addressLine3.
     * @param  city  String value for city.
     * @param  companyName  String value for companyName.
     * @param  contactForeName  String value for contactForeName.
     * @param  contactLastName  String value for contactLastName.
     * @param  contactMiddleName  String value for contactMiddleName.
     * @param  contactTitle  String value for contactTitle.
     * @param  country  String value for country.
     * @param  countryId  Integer value for countryId.
     * @param  countryISOCode  String value for countryISOCode.
     * @param  fax  String value for fax.
     * @param  region  String value for region.
     * @param  regionId  Integer value for regionId.
     * @param  telephone  String value for telephone.
     * @param  zipCode  String value for zipCode.
     * @param  addressType  Integer value for addressType.
     */

    protected DeliveryAddresses(OptionalNullable<Integer> addressId,
            OptionalNullable<String> addressLine1, OptionalNullable<String> addressLine2,
            OptionalNullable<String> addressLine3, OptionalNullable<String> city,
            OptionalNullable<String> companyName, OptionalNullable<String> contactForeName,
            OptionalNullable<String> contactLastName, OptionalNullable<String> contactMiddleName,
            OptionalNullable<String> contactTitle, OptionalNullable<String> country,
            OptionalNullable<Integer> countryId, OptionalNullable<String> countryISOCode,
            OptionalNullable<String> fax, OptionalNullable<String> region,
            OptionalNullable<Integer> regionId, OptionalNullable<String> telephone,
            OptionalNullable<String> zipCode, OptionalNullable<Integer> addressType) {
        this.addressId = addressId;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = addressLine3;
        this.city = city;
        this.companyName = companyName;
        this.contactForeName = contactForeName;
        this.contactLastName = contactLastName;
        this.contactMiddleName = contactMiddleName;
        this.contactTitle = contactTitle;
        this.country = country;
        this.countryId = countryId;
        this.countryISOCode = countryISOCode;
        this.fax = fax;
        this.region = region;
        this.regionId = regionId;
        this.telephone = telephone;
        this.zipCode = zipCode;
        this.addressType = addressType;
    }

    /**
     * Internal Getter for AddressId.
     * Address Id
     * @return Returns the Internal Integer
     */
    @JsonGetter("AddressId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetAddressId() {
        return this.addressId;
    }

    /**
     * Getter for AddressId.
     * Address Id
     * @return Returns the Integer
     */
    public Integer getAddressId() {
        return OptionalNullable.getFrom(addressId);
    }

    /**
     * Setter for AddressId.
     * Address Id
     * @param addressId Value for Integer
     */
    @JsonSetter("AddressId")
    public void setAddressId(Integer addressId) {
        this.addressId = OptionalNullable.of(addressId);
    }

    /**
     * UnSetter for AddressId.
     * Address Id
     */
    public void unsetAddressId() {
        addressId = null;
    }

    /**
     * Internal Getter for AddressLine1.
     * AddressLine1
     * @return Returns the Internal String
     */
    @JsonGetter("AddressLine1")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetAddressLine1() {
        return this.addressLine1;
    }

    /**
     * Getter for AddressLine1.
     * AddressLine1
     * @return Returns the String
     */
    public String getAddressLine1() {
        return OptionalNullable.getFrom(addressLine1);
    }

    /**
     * Setter for AddressLine1.
     * AddressLine1
     * @param addressLine1 Value for String
     */
    @JsonSetter("AddressLine1")
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = OptionalNullable.of(addressLine1);
    }

    /**
     * UnSetter for AddressLine1.
     * AddressLine1
     */
    public void unsetAddressLine1() {
        addressLine1 = null;
    }

    /**
     * Internal Getter for AddressLine2.
     * AddressLine2
     * @return Returns the Internal String
     */
    @JsonGetter("AddressLine2")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetAddressLine2() {
        return this.addressLine2;
    }

    /**
     * Getter for AddressLine2.
     * AddressLine2
     * @return Returns the String
     */
    public String getAddressLine2() {
        return OptionalNullable.getFrom(addressLine2);
    }

    /**
     * Setter for AddressLine2.
     * AddressLine2
     * @param addressLine2 Value for String
     */
    @JsonSetter("AddressLine2")
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = OptionalNullable.of(addressLine2);
    }

    /**
     * UnSetter for AddressLine2.
     * AddressLine2
     */
    public void unsetAddressLine2() {
        addressLine2 = null;
    }

    /**
     * Internal Getter for AddressLine3.
     * AddressLine3
     * @return Returns the Internal String
     */
    @JsonGetter("AddressLine3")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetAddressLine3() {
        return this.addressLine3;
    }

    /**
     * Getter for AddressLine3.
     * AddressLine3
     * @return Returns the String
     */
    public String getAddressLine3() {
        return OptionalNullable.getFrom(addressLine3);
    }

    /**
     * Setter for AddressLine3.
     * AddressLine3
     * @param addressLine3 Value for String
     */
    @JsonSetter("AddressLine3")
    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = OptionalNullable.of(addressLine3);
    }

    /**
     * UnSetter for AddressLine3.
     * AddressLine3
     */
    public void unsetAddressLine3() {
        addressLine3 = null;
    }

    /**
     * Internal Getter for City.
     * City
     * @return Returns the Internal String
     */
    @JsonGetter("City")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCity() {
        return this.city;
    }

    /**
     * Getter for City.
     * City
     * @return Returns the String
     */
    public String getCity() {
        return OptionalNullable.getFrom(city);
    }

    /**
     * Setter for City.
     * City
     * @param city Value for String
     */
    @JsonSetter("City")
    public void setCity(String city) {
        this.city = OptionalNullable.of(city);
    }

    /**
     * UnSetter for City.
     * City
     */
    public void unsetCity() {
        city = null;
    }

    /**
     * Internal Getter for CompanyName.
     * Account Name
     * @return Returns the Internal String
     */
    @JsonGetter("CompanyName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCompanyName() {
        return this.companyName;
    }

    /**
     * Getter for CompanyName.
     * Account Name
     * @return Returns the String
     */
    public String getCompanyName() {
        return OptionalNullable.getFrom(companyName);
    }

    /**
     * Setter for CompanyName.
     * Account Name
     * @param companyName Value for String
     */
    @JsonSetter("CompanyName")
    public void setCompanyName(String companyName) {
        this.companyName = OptionalNullable.of(companyName);
    }

    /**
     * UnSetter for CompanyName.
     * Account Name
     */
    public void unsetCompanyName() {
        companyName = null;
    }

    /**
     * Internal Getter for ContactForeName.
     * Contact fore name of the delivery address.
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
     * Contact fore name of the delivery address.
     * @return Returns the String
     */
    public String getContactForeName() {
        return OptionalNullable.getFrom(contactForeName);
    }

    /**
     * Setter for ContactForeName.
     * Contact fore name of the delivery address.
     * @param contactForeName Value for String
     */
    @JsonSetter("ContactForeName")
    public void setContactForeName(String contactForeName) {
        this.contactForeName = OptionalNullable.of(contactForeName);
    }

    /**
     * UnSetter for ContactForeName.
     * Contact fore name of the delivery address.
     */
    public void unsetContactForeName() {
        contactForeName = null;
    }

    /**
     * Internal Getter for ContactLastName.
     * Contact last name of the delivery address.
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
     * Contact last name of the delivery address.
     * @return Returns the String
     */
    public String getContactLastName() {
        return OptionalNullable.getFrom(contactLastName);
    }

    /**
     * Setter for ContactLastName.
     * Contact last name of the delivery address.
     * @param contactLastName Value for String
     */
    @JsonSetter("ContactLastName")
    public void setContactLastName(String contactLastName) {
        this.contactLastName = OptionalNullable.of(contactLastName);
    }

    /**
     * UnSetter for ContactLastName.
     * Contact last name of the delivery address.
     */
    public void unsetContactLastName() {
        contactLastName = null;
    }

    /**
     * Internal Getter for ContactMiddleName.
     * Contact middle name of the delivery address.
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
     * Contact middle name of the delivery address.
     * @return Returns the String
     */
    public String getContactMiddleName() {
        return OptionalNullable.getFrom(contactMiddleName);
    }

    /**
     * Setter for ContactMiddleName.
     * Contact middle name of the delivery address.
     * @param contactMiddleName Value for String
     */
    @JsonSetter("ContactMiddleName")
    public void setContactMiddleName(String contactMiddleName) {
        this.contactMiddleName = OptionalNullable.of(contactMiddleName);
    }

    /**
     * UnSetter for ContactMiddleName.
     * Contact middle name of the delivery address.
     */
    public void unsetContactMiddleName() {
        contactMiddleName = null;
    }

    /**
     * Internal Getter for ContactTitle.
     * ContactTitle
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
     * ContactTitle
     * @return Returns the String
     */
    public String getContactTitle() {
        return OptionalNullable.getFrom(contactTitle);
    }

    /**
     * Setter for ContactTitle.
     * ContactTitle
     * @param contactTitle Value for String
     */
    @JsonSetter("ContactTitle")
    public void setContactTitle(String contactTitle) {
        this.contactTitle = OptionalNullable.of(contactTitle);
    }

    /**
     * UnSetter for ContactTitle.
     * ContactTitle
     */
    public void unsetContactTitle() {
        contactTitle = null;
    }

    /**
     * Internal Getter for Country.
     * Country
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
     * Country
     * @return Returns the String
     */
    public String getCountry() {
        return OptionalNullable.getFrom(country);
    }

    /**
     * Setter for Country.
     * Country
     * @param country Value for String
     */
    @JsonSetter("Country")
    public void setCountry(String country) {
        this.country = OptionalNullable.of(country);
    }

    /**
     * UnSetter for Country.
     * Country
     */
    public void unsetCountry() {
        country = null;
    }

    /**
     * Internal Getter for CountryId.
     * Country Id
     * @return Returns the Internal Integer
     */
    @JsonGetter("CountryId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetCountryId() {
        return this.countryId;
    }

    /**
     * Getter for CountryId.
     * Country Id
     * @return Returns the Integer
     */
    public Integer getCountryId() {
        return OptionalNullable.getFrom(countryId);
    }

    /**
     * Setter for CountryId.
     * Country Id
     * @param countryId Value for Integer
     */
    @JsonSetter("CountryId")
    public void setCountryId(Integer countryId) {
        this.countryId = OptionalNullable.of(countryId);
    }

    /**
     * UnSetter for CountryId.
     * Country Id
     */
    public void unsetCountryId() {
        countryId = null;
    }

    /**
     * Internal Getter for CountryISOCode.
     * Country ISO code
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
     * Country ISO code
     * @return Returns the String
     */
    public String getCountryISOCode() {
        return OptionalNullable.getFrom(countryISOCode);
    }

    /**
     * Setter for CountryISOCode.
     * Country ISO code
     * @param countryISOCode Value for String
     */
    @JsonSetter("CountryISOCode")
    public void setCountryISOCode(String countryISOCode) {
        this.countryISOCode = OptionalNullable.of(countryISOCode);
    }

    /**
     * UnSetter for CountryISOCode.
     * Country ISO code
     */
    public void unsetCountryISOCode() {
        countryISOCode = null;
    }

    /**
     * Internal Getter for Fax.
     * Fax number of the address contact.
     * @return Returns the Internal String
     */
    @JsonGetter("Fax")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetFax() {
        return this.fax;
    }

    /**
     * Getter for Fax.
     * Fax number of the address contact.
     * @return Returns the String
     */
    public String getFax() {
        return OptionalNullable.getFrom(fax);
    }

    /**
     * Setter for Fax.
     * Fax number of the address contact.
     * @param fax Value for String
     */
    @JsonSetter("Fax")
    public void setFax(String fax) {
        this.fax = OptionalNullable.of(fax);
    }

    /**
     * UnSetter for Fax.
     * Fax number of the address contact.
     */
    public void unsetFax() {
        fax = null;
    }

    /**
     * Internal Getter for Region.
     * Region of the Card Delivery address
     * @return Returns the Internal String
     */
    @JsonGetter("Region")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetRegion() {
        return this.region;
    }

    /**
     * Getter for Region.
     * Region of the Card Delivery address
     * @return Returns the String
     */
    public String getRegion() {
        return OptionalNullable.getFrom(region);
    }

    /**
     * Setter for Region.
     * Region of the Card Delivery address
     * @param region Value for String
     */
    @JsonSetter("Region")
    public void setRegion(String region) {
        this.region = OptionalNullable.of(region);
    }

    /**
     * UnSetter for Region.
     * Region of the Card Delivery address
     */
    public void unsetRegion() {
        region = null;
    }

    /**
     * Internal Getter for RegionId.
     * Region Id of the address.
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
     * Region Id of the address.
     * @return Returns the Integer
     */
    public Integer getRegionId() {
        return OptionalNullable.getFrom(regionId);
    }

    /**
     * Setter for RegionId.
     * Region Id of the address.
     * @param regionId Value for Integer
     */
    @JsonSetter("RegionId")
    public void setRegionId(Integer regionId) {
        this.regionId = OptionalNullable.of(regionId);
    }

    /**
     * UnSetter for RegionId.
     * Region Id of the address.
     */
    public void unsetRegionId() {
        regionId = null;
    }

    /**
     * Internal Getter for Telephone.
     * Telephone number of the address contact
     * @return Returns the Internal String
     */
    @JsonGetter("Telephone")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetTelephone() {
        return this.telephone;
    }

    /**
     * Getter for Telephone.
     * Telephone number of the address contact
     * @return Returns the String
     */
    public String getTelephone() {
        return OptionalNullable.getFrom(telephone);
    }

    /**
     * Setter for Telephone.
     * Telephone number of the address contact
     * @param telephone Value for String
     */
    @JsonSetter("Telephone")
    public void setTelephone(String telephone) {
        this.telephone = OptionalNullable.of(telephone);
    }

    /**
     * UnSetter for Telephone.
     * Telephone number of the address contact
     */
    public void unsetTelephone() {
        telephone = null;
    }

    /**
     * Internal Getter for ZipCode.
     * Delivery Zip code
     * @return Returns the Internal String
     */
    @JsonGetter("ZipCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetZipCode() {
        return this.zipCode;
    }

    /**
     * Getter for ZipCode.
     * Delivery Zip code
     * @return Returns the String
     */
    public String getZipCode() {
        return OptionalNullable.getFrom(zipCode);
    }

    /**
     * Setter for ZipCode.
     * Delivery Zip code
     * @param zipCode Value for String
     */
    @JsonSetter("ZipCode")
    public void setZipCode(String zipCode) {
        this.zipCode = OptionalNullable.of(zipCode);
    }

    /**
     * UnSetter for ZipCode.
     * Delivery Zip code
     */
    public void unsetZipCode() {
        zipCode = null;
    }

    /**
     * Internal Getter for AddressType.
     * Delivery address type. Possible Values: 1 – Card and PIN delivery address 2 – Card delivery
     * address 3 – PIN delivery address
     * @return Returns the Internal Integer
     */
    @JsonGetter("AddressType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetAddressType() {
        return this.addressType;
    }

    /**
     * Getter for AddressType.
     * Delivery address type. Possible Values: 1 – Card and PIN delivery address 2 – Card delivery
     * address 3 – PIN delivery address
     * @return Returns the Integer
     */
    public Integer getAddressType() {
        return OptionalNullable.getFrom(addressType);
    }

    /**
     * Setter for AddressType.
     * Delivery address type. Possible Values: 1 – Card and PIN delivery address 2 – Card delivery
     * address 3 – PIN delivery address
     * @param addressType Value for Integer
     */
    @JsonSetter("AddressType")
    public void setAddressType(Integer addressType) {
        this.addressType = OptionalNullable.of(addressType);
    }

    /**
     * UnSetter for AddressType.
     * Delivery address type. Possible Values: 1 – Card and PIN delivery address 2 – Card delivery
     * address 3 – PIN delivery address
     */
    public void unsetAddressType() {
        addressType = null;
    }

    /**
     * Converts this DeliveryAddresses into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DeliveryAddresses [" + "addressId=" + addressId + ", addressLine1=" + addressLine1
                + ", addressLine2=" + addressLine2 + ", addressLine3=" + addressLine3 + ", city="
                + city + ", companyName=" + companyName + ", contactForeName=" + contactForeName
                + ", contactLastName=" + contactLastName + ", contactMiddleName="
                + contactMiddleName + ", contactTitle=" + contactTitle + ", country=" + country
                + ", countryId=" + countryId + ", countryISOCode=" + countryISOCode + ", fax=" + fax
                + ", region=" + region + ", regionId=" + regionId + ", telephone=" + telephone
                + ", zipCode=" + zipCode + ", addressType=" + addressType + "]";
    }

    /**
     * Builds a new {@link DeliveryAddresses.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DeliveryAddresses.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.addressId = internalGetAddressId();
        builder.addressLine1 = internalGetAddressLine1();
        builder.addressLine2 = internalGetAddressLine2();
        builder.addressLine3 = internalGetAddressLine3();
        builder.city = internalGetCity();
        builder.companyName = internalGetCompanyName();
        builder.contactForeName = internalGetContactForeName();
        builder.contactLastName = internalGetContactLastName();
        builder.contactMiddleName = internalGetContactMiddleName();
        builder.contactTitle = internalGetContactTitle();
        builder.country = internalGetCountry();
        builder.countryId = internalGetCountryId();
        builder.countryISOCode = internalGetCountryISOCode();
        builder.fax = internalGetFax();
        builder.region = internalGetRegion();
        builder.regionId = internalGetRegionId();
        builder.telephone = internalGetTelephone();
        builder.zipCode = internalGetZipCode();
        builder.addressType = internalGetAddressType();
        return builder;
    }

    /**
     * Class to build instances of {@link DeliveryAddresses}.
     */
    public static class Builder {
        private OptionalNullable<Integer> addressId;
        private OptionalNullable<String> addressLine1;
        private OptionalNullable<String> addressLine2;
        private OptionalNullable<String> addressLine3;
        private OptionalNullable<String> city;
        private OptionalNullable<String> companyName;
        private OptionalNullable<String> contactForeName;
        private OptionalNullable<String> contactLastName;
        private OptionalNullable<String> contactMiddleName;
        private OptionalNullable<String> contactTitle;
        private OptionalNullable<String> country;
        private OptionalNullable<Integer> countryId;
        private OptionalNullable<String> countryISOCode;
        private OptionalNullable<String> fax;
        private OptionalNullable<String> region;
        private OptionalNullable<Integer> regionId;
        private OptionalNullable<String> telephone;
        private OptionalNullable<String> zipCode;
        private OptionalNullable<Integer> addressType;



        /**
         * Setter for addressId.
         * @param  addressId  Integer value for addressId.
         * @return Builder
         */
        public Builder addressId(Integer addressId) {
            this.addressId = OptionalNullable.of(addressId);
            return this;
        }

        /**
         * UnSetter for addressId.
         * @return Builder
         */
        public Builder unsetAddressId() {
            addressId = null;
            return this;
        }

        /**
         * Setter for addressLine1.
         * @param  addressLine1  String value for addressLine1.
         * @return Builder
         */
        public Builder addressLine1(String addressLine1) {
            this.addressLine1 = OptionalNullable.of(addressLine1);
            return this;
        }

        /**
         * UnSetter for addressLine1.
         * @return Builder
         */
        public Builder unsetAddressLine1() {
            addressLine1 = null;
            return this;
        }

        /**
         * Setter for addressLine2.
         * @param  addressLine2  String value for addressLine2.
         * @return Builder
         */
        public Builder addressLine2(String addressLine2) {
            this.addressLine2 = OptionalNullable.of(addressLine2);
            return this;
        }

        /**
         * UnSetter for addressLine2.
         * @return Builder
         */
        public Builder unsetAddressLine2() {
            addressLine2 = null;
            return this;
        }

        /**
         * Setter for addressLine3.
         * @param  addressLine3  String value for addressLine3.
         * @return Builder
         */
        public Builder addressLine3(String addressLine3) {
            this.addressLine3 = OptionalNullable.of(addressLine3);
            return this;
        }

        /**
         * UnSetter for addressLine3.
         * @return Builder
         */
        public Builder unsetAddressLine3() {
            addressLine3 = null;
            return this;
        }

        /**
         * Setter for city.
         * @param  city  String value for city.
         * @return Builder
         */
        public Builder city(String city) {
            this.city = OptionalNullable.of(city);
            return this;
        }

        /**
         * UnSetter for city.
         * @return Builder
         */
        public Builder unsetCity() {
            city = null;
            return this;
        }

        /**
         * Setter for companyName.
         * @param  companyName  String value for companyName.
         * @return Builder
         */
        public Builder companyName(String companyName) {
            this.companyName = OptionalNullable.of(companyName);
            return this;
        }

        /**
         * UnSetter for companyName.
         * @return Builder
         */
        public Builder unsetCompanyName() {
            companyName = null;
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
         * Setter for countryId.
         * @param  countryId  Integer value for countryId.
         * @return Builder
         */
        public Builder countryId(Integer countryId) {
            this.countryId = OptionalNullable.of(countryId);
            return this;
        }

        /**
         * UnSetter for countryId.
         * @return Builder
         */
        public Builder unsetCountryId() {
            countryId = null;
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
         * Setter for fax.
         * @param  fax  String value for fax.
         * @return Builder
         */
        public Builder fax(String fax) {
            this.fax = OptionalNullable.of(fax);
            return this;
        }

        /**
         * UnSetter for fax.
         * @return Builder
         */
        public Builder unsetFax() {
            fax = null;
            return this;
        }

        /**
         * Setter for region.
         * @param  region  String value for region.
         * @return Builder
         */
        public Builder region(String region) {
            this.region = OptionalNullable.of(region);
            return this;
        }

        /**
         * UnSetter for region.
         * @return Builder
         */
        public Builder unsetRegion() {
            region = null;
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
         * Setter for telephone.
         * @param  telephone  String value for telephone.
         * @return Builder
         */
        public Builder telephone(String telephone) {
            this.telephone = OptionalNullable.of(telephone);
            return this;
        }

        /**
         * UnSetter for telephone.
         * @return Builder
         */
        public Builder unsetTelephone() {
            telephone = null;
            return this;
        }

        /**
         * Setter for zipCode.
         * @param  zipCode  String value for zipCode.
         * @return Builder
         */
        public Builder zipCode(String zipCode) {
            this.zipCode = OptionalNullable.of(zipCode);
            return this;
        }

        /**
         * UnSetter for zipCode.
         * @return Builder
         */
        public Builder unsetZipCode() {
            zipCode = null;
            return this;
        }

        /**
         * Setter for addressType.
         * @param  addressType  Integer value for addressType.
         * @return Builder
         */
        public Builder addressType(Integer addressType) {
            this.addressType = OptionalNullable.of(addressType);
            return this;
        }

        /**
         * UnSetter for addressType.
         * @return Builder
         */
        public Builder unsetAddressType() {
            addressType = null;
            return this;
        }

        /**
         * Builds a new {@link DeliveryAddresses} object using the set fields.
         * @return {@link DeliveryAddresses}
         */
        public DeliveryAddresses build() {
            return new DeliveryAddresses(addressId, addressLine1, addressLine2, addressLine3, city,
                    companyName, contactForeName, contactLastName, contactMiddleName, contactTitle,
                    country, countryId, countryISOCode, fax, region, regionId, telephone, zipCode,
                    addressType);
        }
    }
}

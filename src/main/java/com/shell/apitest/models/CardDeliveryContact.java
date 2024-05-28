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
 * This is a model class for CardDeliveryContact type.
 */
public class CardDeliveryContact {
    private OptionalNullable<String> deliveryContactTitle;
    private String deliveryContactName;
    private String deliveryCompanyName;
    private String deliveryAddressLine1;
    private OptionalNullable<String> deliveryAddressLine2;
    private OptionalNullable<String> deliveryAddressLine3;
    private String deliveryZipCode;
    private String deliveryCity;
    private OptionalNullable<Integer> deliveryRegionId;
    private OptionalNullable<String> deliveryRegion;
    private String deliveryCountry;
    private OptionalNullable<String> phoneNumber;
    private OptionalNullable<String> emailAddress;
    private Boolean saveForCardReissue;

    /**
     * Default constructor.
     */
    public CardDeliveryContact() {
    }

    /**
     * Initialization constructor.
     * @param  deliveryContactName  String value for deliveryContactName.
     * @param  deliveryCompanyName  String value for deliveryCompanyName.
     * @param  deliveryAddressLine1  String value for deliveryAddressLine1.
     * @param  deliveryZipCode  String value for deliveryZipCode.
     * @param  deliveryCity  String value for deliveryCity.
     * @param  deliveryCountry  String value for deliveryCountry.
     * @param  deliveryContactTitle  String value for deliveryContactTitle.
     * @param  deliveryAddressLine2  String value for deliveryAddressLine2.
     * @param  deliveryAddressLine3  String value for deliveryAddressLine3.
     * @param  deliveryRegionId  Integer value for deliveryRegionId.
     * @param  deliveryRegion  String value for deliveryRegion.
     * @param  phoneNumber  String value for phoneNumber.
     * @param  emailAddress  String value for emailAddress.
     * @param  saveForCardReissue  Boolean value for saveForCardReissue.
     */
    public CardDeliveryContact(
            String deliveryContactName,
            String deliveryCompanyName,
            String deliveryAddressLine1,
            String deliveryZipCode,
            String deliveryCity,
            String deliveryCountry,
            String deliveryContactTitle,
            String deliveryAddressLine2,
            String deliveryAddressLine3,
            Integer deliveryRegionId,
            String deliveryRegion,
            String phoneNumber,
            String emailAddress,
            Boolean saveForCardReissue) {
        this.deliveryContactTitle = OptionalNullable.of(deliveryContactTitle);
        this.deliveryContactName = deliveryContactName;
        this.deliveryCompanyName = deliveryCompanyName;
        this.deliveryAddressLine1 = deliveryAddressLine1;
        this.deliveryAddressLine2 = OptionalNullable.of(deliveryAddressLine2);
        this.deliveryAddressLine3 = OptionalNullable.of(deliveryAddressLine3);
        this.deliveryZipCode = deliveryZipCode;
        this.deliveryCity = deliveryCity;
        this.deliveryRegionId = OptionalNullable.of(deliveryRegionId);
        this.deliveryRegion = OptionalNullable.of(deliveryRegion);
        this.deliveryCountry = deliveryCountry;
        this.phoneNumber = OptionalNullable.of(phoneNumber);
        this.emailAddress = OptionalNullable.of(emailAddress);
        this.saveForCardReissue = saveForCardReissue;
    }

    /**
     * Initialization constructor.
     * @param  deliveryContactName  String value for deliveryContactName.
     * @param  deliveryCompanyName  String value for deliveryCompanyName.
     * @param  deliveryAddressLine1  String value for deliveryAddressLine1.
     * @param  deliveryZipCode  String value for deliveryZipCode.
     * @param  deliveryCity  String value for deliveryCity.
     * @param  deliveryCountry  String value for deliveryCountry.
     * @param  deliveryContactTitle  String value for deliveryContactTitle.
     * @param  deliveryAddressLine2  String value for deliveryAddressLine2.
     * @param  deliveryAddressLine3  String value for deliveryAddressLine3.
     * @param  deliveryRegionId  Integer value for deliveryRegionId.
     * @param  deliveryRegion  String value for deliveryRegion.
     * @param  phoneNumber  String value for phoneNumber.
     * @param  emailAddress  String value for emailAddress.
     * @param  saveForCardReissue  Boolean value for saveForCardReissue.
     */

    protected CardDeliveryContact(String deliveryContactName, String deliveryCompanyName,
            String deliveryAddressLine1, String deliveryZipCode, String deliveryCity,
            String deliveryCountry, OptionalNullable<String> deliveryContactTitle,
            OptionalNullable<String> deliveryAddressLine2,
            OptionalNullable<String> deliveryAddressLine3,
            OptionalNullable<Integer> deliveryRegionId, OptionalNullable<String> deliveryRegion,
            OptionalNullable<String> phoneNumber, OptionalNullable<String> emailAddress,
            Boolean saveForCardReissue) {
        this.deliveryContactTitle = deliveryContactTitle;
        this.deliveryContactName = deliveryContactName;
        this.deliveryCompanyName = deliveryCompanyName;
        this.deliveryAddressLine1 = deliveryAddressLine1;
        this.deliveryAddressLine2 = deliveryAddressLine2;
        this.deliveryAddressLine3 = deliveryAddressLine3;
        this.deliveryZipCode = deliveryZipCode;
        this.deliveryCity = deliveryCity;
        this.deliveryRegionId = deliveryRegionId;
        this.deliveryRegion = deliveryRegion;
        this.deliveryCountry = deliveryCountry;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.saveForCardReissue = saveForCardReissue;
    }

    /**
     * Internal Getter for DeliveryContactTitle.
     * Title of the contact person &lt;br /&gt; Optional Max field length: 10
     * @return Returns the Internal String
     */
    @JsonGetter("DeliveryContactTitle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDeliveryContactTitle() {
        return this.deliveryContactTitle;
    }

    /**
     * Getter for DeliveryContactTitle.
     * Title of the contact person &lt;br /&gt; Optional Max field length: 10
     * @return Returns the String
     */
    public String getDeliveryContactTitle() {
        return OptionalNullable.getFrom(deliveryContactTitle);
    }

    /**
     * Setter for DeliveryContactTitle.
     * Title of the contact person &lt;br /&gt; Optional Max field length: 10
     * @param deliveryContactTitle Value for String
     */
    @JsonSetter("DeliveryContactTitle")
    public void setDeliveryContactTitle(String deliveryContactTitle) {
        this.deliveryContactTitle = OptionalNullable.of(deliveryContactTitle);
    }

    /**
     * UnSetter for DeliveryContactTitle.
     * Title of the contact person &lt;br /&gt; Optional Max field length: 10
     */
    public void unsetDeliveryContactTitle() {
        deliveryContactTitle = null;
    }

    /**
     * Getter for DeliveryContactName.
     * Name of the contact person &lt;br /&gt; Mandatory &lt;br /&gt; Max field length: 50
     * @return Returns the String
     */
    @JsonGetter("DeliveryContactName")
    public String getDeliveryContactName() {
        return deliveryContactName;
    }

    /**
     * Setter for DeliveryContactName.
     * Name of the contact person &lt;br /&gt; Mandatory &lt;br /&gt; Max field length: 50
     * @param deliveryContactName Value for String
     */
    @JsonSetter("DeliveryContactName")
    public void setDeliveryContactName(String deliveryContactName) {
        this.deliveryContactName = deliveryContactName;
    }

    /**
     * Getter for DeliveryCompanyName.
     * Company name &lt;br /&gt; Mandatory &lt;br /&gt; Max field length: 50
     * @return Returns the String
     */
    @JsonGetter("DeliveryCompanyName")
    public String getDeliveryCompanyName() {
        return deliveryCompanyName;
    }

    /**
     * Setter for DeliveryCompanyName.
     * Company name &lt;br /&gt; Mandatory &lt;br /&gt; Max field length: 50
     * @param deliveryCompanyName Value for String
     */
    @JsonSetter("DeliveryCompanyName")
    public void setDeliveryCompanyName(String deliveryCompanyName) {
        this.deliveryCompanyName = deliveryCompanyName;
    }

    /**
     * Getter for DeliveryAddressLine1.
     * Address line 1 &lt;br /&gt; Mandatory&lt;br /&gt; Max field length: 40
     * @return Returns the String
     */
    @JsonGetter("DeliveryAddressLine1")
    public String getDeliveryAddressLine1() {
        return deliveryAddressLine1;
    }

    /**
     * Setter for DeliveryAddressLine1.
     * Address line 1 &lt;br /&gt; Mandatory&lt;br /&gt; Max field length: 40
     * @param deliveryAddressLine1 Value for String
     */
    @JsonSetter("DeliveryAddressLine1")
    public void setDeliveryAddressLine1(String deliveryAddressLine1) {
        this.deliveryAddressLine1 = deliveryAddressLine1;
    }

    /**
     * Internal Getter for DeliveryAddressLine2.
     * Address line 2 &lt;br /&gt; Optional &lt;br /&gt; Max field length: 40 &lt;br /&gt; Optional
     * @return Returns the Internal String
     */
    @JsonGetter("DeliveryAddressLine2")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDeliveryAddressLine2() {
        return this.deliveryAddressLine2;
    }

    /**
     * Getter for DeliveryAddressLine2.
     * Address line 2 &lt;br /&gt; Optional &lt;br /&gt; Max field length: 40 &lt;br /&gt; Optional
     * @return Returns the String
     */
    public String getDeliveryAddressLine2() {
        return OptionalNullable.getFrom(deliveryAddressLine2);
    }

    /**
     * Setter for DeliveryAddressLine2.
     * Address line 2 &lt;br /&gt; Optional &lt;br /&gt; Max field length: 40 &lt;br /&gt; Optional
     * @param deliveryAddressLine2 Value for String
     */
    @JsonSetter("DeliveryAddressLine2")
    public void setDeliveryAddressLine2(String deliveryAddressLine2) {
        this.deliveryAddressLine2 = OptionalNullable.of(deliveryAddressLine2);
    }

    /**
     * UnSetter for DeliveryAddressLine2.
     * Address line 2 &lt;br /&gt; Optional &lt;br /&gt; Max field length: 40 &lt;br /&gt; Optional
     */
    public void unsetDeliveryAddressLine2() {
        deliveryAddressLine2 = null;
    }

    /**
     * Internal Getter for DeliveryAddressLine3.
     * Address line 3 &lt;br /&gt; Optional &lt;br /&gt; Max field length: 40 &lt;br /&gt; Optional
     * @return Returns the Internal String
     */
    @JsonGetter("DeliveryAddressLine3")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDeliveryAddressLine3() {
        return this.deliveryAddressLine3;
    }

    /**
     * Getter for DeliveryAddressLine3.
     * Address line 3 &lt;br /&gt; Optional &lt;br /&gt; Max field length: 40 &lt;br /&gt; Optional
     * @return Returns the String
     */
    public String getDeliveryAddressLine3() {
        return OptionalNullable.getFrom(deliveryAddressLine3);
    }

    /**
     * Setter for DeliveryAddressLine3.
     * Address line 3 &lt;br /&gt; Optional &lt;br /&gt; Max field length: 40 &lt;br /&gt; Optional
     * @param deliveryAddressLine3 Value for String
     */
    @JsonSetter("DeliveryAddressLine3")
    public void setDeliveryAddressLine3(String deliveryAddressLine3) {
        this.deliveryAddressLine3 = OptionalNullable.of(deliveryAddressLine3);
    }

    /**
     * UnSetter for DeliveryAddressLine3.
     * Address line 3 &lt;br /&gt; Optional &lt;br /&gt; Max field length: 40 &lt;br /&gt; Optional
     */
    public void unsetDeliveryAddressLine3() {
        deliveryAddressLine3 = null;
    }

    /**
     * Getter for DeliveryZipCode.
     * ZIP code &lt;br /&gt; Mandatory &lt;br /&gt; Max field length: 10 &lt;br /&gt; Optional
     * @return Returns the String
     */
    @JsonGetter("DeliveryZipCode")
    public String getDeliveryZipCode() {
        return deliveryZipCode;
    }

    /**
     * Setter for DeliveryZipCode.
     * ZIP code &lt;br /&gt; Mandatory &lt;br /&gt; Max field length: 10 &lt;br /&gt; Optional
     * @param deliveryZipCode Value for String
     */
    @JsonSetter("DeliveryZipCode")
    public void setDeliveryZipCode(String deliveryZipCode) {
        this.deliveryZipCode = deliveryZipCode;
    }

    /**
     * Getter for DeliveryCity.
     * City &lt;br /&gt; Mandatory &lt;br /&gt; Max field length: 40
     * @return Returns the String
     */
    @JsonGetter("DeliveryCity")
    public String getDeliveryCity() {
        return deliveryCity;
    }

    /**
     * Setter for DeliveryCity.
     * City &lt;br /&gt; Mandatory &lt;br /&gt; Max field length: 40
     * @param deliveryCity Value for String
     */
    @JsonSetter("DeliveryCity")
    public void setDeliveryCity(String deliveryCity) {
        this.deliveryCity = deliveryCity;
    }

    /**
     * Internal Getter for DeliveryRegionId.
     * Region Id &lt;br /&gt; Optional
     * @return Returns the Internal Integer
     */
    @JsonGetter("DeliveryRegionId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetDeliveryRegionId() {
        return this.deliveryRegionId;
    }

    /**
     * Getter for DeliveryRegionId.
     * Region Id &lt;br /&gt; Optional
     * @return Returns the Integer
     */
    public Integer getDeliveryRegionId() {
        return OptionalNullable.getFrom(deliveryRegionId);
    }

    /**
     * Setter for DeliveryRegionId.
     * Region Id &lt;br /&gt; Optional
     * @param deliveryRegionId Value for Integer
     */
    @JsonSetter("DeliveryRegionId")
    public void setDeliveryRegionId(Integer deliveryRegionId) {
        this.deliveryRegionId = OptionalNullable.of(deliveryRegionId);
    }

    /**
     * UnSetter for DeliveryRegionId.
     * Region Id &lt;br /&gt; Optional
     */
    public void unsetDeliveryRegionId() {
        deliveryRegionId = null;
    }

    /**
     * Internal Getter for DeliveryRegion.
     * Region &lt;br /&gt; Optional&lt;br /&gt; When region is passed
     * @return Returns the Internal String
     */
    @JsonGetter("DeliveryRegion")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDeliveryRegion() {
        return this.deliveryRegion;
    }

    /**
     * Getter for DeliveryRegion.
     * Region &lt;br /&gt; Optional&lt;br /&gt; When region is passed
     * @return Returns the String
     */
    public String getDeliveryRegion() {
        return OptionalNullable.getFrom(deliveryRegion);
    }

    /**
     * Setter for DeliveryRegion.
     * Region &lt;br /&gt; Optional&lt;br /&gt; When region is passed
     * @param deliveryRegion Value for String
     */
    @JsonSetter("DeliveryRegion")
    public void setDeliveryRegion(String deliveryRegion) {
        this.deliveryRegion = OptionalNullable.of(deliveryRegion);
    }

    /**
     * UnSetter for DeliveryRegion.
     * Region &lt;br /&gt; Optional&lt;br /&gt; When region is passed
     */
    public void unsetDeliveryRegion() {
        deliveryRegion = null;
    }

    /**
     * Getter for DeliveryCountry.
     * The ISO code of the country.&lt;br /&gt;
     * @return Returns the String
     */
    @JsonGetter("DeliveryCountry")
    public String getDeliveryCountry() {
        return deliveryCountry;
    }

    /**
     * Setter for DeliveryCountry.
     * The ISO code of the country.&lt;br /&gt;
     * @param deliveryCountry Value for String
     */
    @JsonSetter("DeliveryCountry")
    public void setDeliveryCountry(String deliveryCountry) {
        this.deliveryCountry = deliveryCountry;
    }

    /**
     * Internal Getter for PhoneNumber.
     * Phone number for courier delivery.&lt;br /&gt; Optional.&lt;br /&gt; Max field length: 20
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
     * Phone number for courier delivery.&lt;br /&gt; Optional.&lt;br /&gt; Max field length: 20
     * @return Returns the String
     */
    public String getPhoneNumber() {
        return OptionalNullable.getFrom(phoneNumber);
    }

    /**
     * Setter for PhoneNumber.
     * Phone number for courier delivery.&lt;br /&gt; Optional.&lt;br /&gt; Max field length: 20
     * @param phoneNumber Value for String
     */
    @JsonSetter("PhoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = OptionalNullable.of(phoneNumber);
    }

    /**
     * UnSetter for PhoneNumber.
     * Phone number for courier delivery.&lt;br /&gt; Optional.&lt;br /&gt; Max field length: 20
     */
    public void unsetPhoneNumber() {
        phoneNumber = null;
    }

    /**
     * Internal Getter for EmailAddress.
     * Email address for courier delivery.&lt;br /&gt; Optional.&lt;br /&gt; Max field length: 90
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
     * Email address for courier delivery.&lt;br /&gt; Optional.&lt;br /&gt; Max field length: 90
     * &lt;br/&gt;Note:Based on the international standard that there can be Max Length 64 before the {@literal @}
     * (the 'Local part’) =64(minimum of 1) Max Lenth after the (the domain) = 88 (Minimum of 2)
     * @return Returns the String
     */
    public String getEmailAddress() {
        return OptionalNullable.getFrom(emailAddress);
    }

    /**
     * Setter for EmailAddress.
     * Email address for courier delivery.&lt;br /&gt; Optional.&lt;br /&gt; Max field length: 90
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
     * Email address for courier delivery.&lt;br /&gt; Optional.&lt;br /&gt; Max field length: 90
     * &lt;br/&gt;Note:Based on the international standard that there can be Max Length 64 before the {@literal @}
     * (the 'Local part’) =64(minimum of 1) Max Lenth after the (the domain) = 88 (Minimum of 2)
     */
    public void unsetEmailAddress() {
        emailAddress = null;
    }

    /**
     * Getter for SaveForCardReissue.
     * If this is specified, the contact address will be saved in cards platform for card reissue
     * processing.&lt;br /&gt; Optional
     * @return Returns the Boolean
     */
    @JsonGetter("SaveForCardReissue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getSaveForCardReissue() {
        return saveForCardReissue;
    }

    /**
     * Setter for SaveForCardReissue.
     * If this is specified, the contact address will be saved in cards platform for card reissue
     * processing.&lt;br /&gt; Optional
     * @param saveForCardReissue Value for Boolean
     */
    @JsonSetter("SaveForCardReissue")
    public void setSaveForCardReissue(Boolean saveForCardReissue) {
        this.saveForCardReissue = saveForCardReissue;
    }

    /**
     * Converts this CardDeliveryContact into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CardDeliveryContact [" + "deliveryContactName=" + deliveryContactName
                + ", deliveryCompanyName=" + deliveryCompanyName + ", deliveryAddressLine1="
                + deliveryAddressLine1 + ", deliveryZipCode=" + deliveryZipCode + ", deliveryCity="
                + deliveryCity + ", deliveryCountry=" + deliveryCountry + ", deliveryContactTitle="
                + deliveryContactTitle + ", deliveryAddressLine2=" + deliveryAddressLine2
                + ", deliveryAddressLine3=" + deliveryAddressLine3 + ", deliveryRegionId="
                + deliveryRegionId + ", deliveryRegion=" + deliveryRegion + ", phoneNumber="
                + phoneNumber + ", emailAddress=" + emailAddress + ", saveForCardReissue="
                + saveForCardReissue + "]";
    }

    /**
     * Builds a new {@link CardDeliveryContact.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CardDeliveryContact.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(deliveryContactName, deliveryCompanyName,
                deliveryAddressLine1, deliveryZipCode, deliveryCity, deliveryCountry)
                .saveForCardReissue(getSaveForCardReissue());
        builder.deliveryContactTitle = internalGetDeliveryContactTitle();
        builder.deliveryAddressLine2 = internalGetDeliveryAddressLine2();
        builder.deliveryAddressLine3 = internalGetDeliveryAddressLine3();
        builder.deliveryRegionId = internalGetDeliveryRegionId();
        builder.deliveryRegion = internalGetDeliveryRegion();
        builder.phoneNumber = internalGetPhoneNumber();
        builder.emailAddress = internalGetEmailAddress();
        return builder;
    }

    /**
     * Class to build instances of {@link CardDeliveryContact}.
     */
    public static class Builder {
        private String deliveryContactName;
        private String deliveryCompanyName;
        private String deliveryAddressLine1;
        private String deliveryZipCode;
        private String deliveryCity;
        private String deliveryCountry;
        private OptionalNullable<String> deliveryContactTitle;
        private OptionalNullable<String> deliveryAddressLine2;
        private OptionalNullable<String> deliveryAddressLine3;
        private OptionalNullable<Integer> deliveryRegionId;
        private OptionalNullable<String> deliveryRegion;
        private OptionalNullable<String> phoneNumber;
        private OptionalNullable<String> emailAddress;
        private Boolean saveForCardReissue;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  deliveryContactName  String value for deliveryContactName.
         * @param  deliveryCompanyName  String value for deliveryCompanyName.
         * @param  deliveryAddressLine1  String value for deliveryAddressLine1.
         * @param  deliveryZipCode  String value for deliveryZipCode.
         * @param  deliveryCity  String value for deliveryCity.
         * @param  deliveryCountry  String value for deliveryCountry.
         */
        public Builder(String deliveryContactName, String deliveryCompanyName,
                String deliveryAddressLine1, String deliveryZipCode, String deliveryCity,
                String deliveryCountry) {
            this.deliveryContactName = deliveryContactName;
            this.deliveryCompanyName = deliveryCompanyName;
            this.deliveryAddressLine1 = deliveryAddressLine1;
            this.deliveryZipCode = deliveryZipCode;
            this.deliveryCity = deliveryCity;
            this.deliveryCountry = deliveryCountry;
        }

        /**
         * Setter for deliveryContactName.
         * @param  deliveryContactName  String value for deliveryContactName.
         * @return Builder
         */
        public Builder deliveryContactName(String deliveryContactName) {
            this.deliveryContactName = deliveryContactName;
            return this;
        }

        /**
         * Setter for deliveryCompanyName.
         * @param  deliveryCompanyName  String value for deliveryCompanyName.
         * @return Builder
         */
        public Builder deliveryCompanyName(String deliveryCompanyName) {
            this.deliveryCompanyName = deliveryCompanyName;
            return this;
        }

        /**
         * Setter for deliveryAddressLine1.
         * @param  deliveryAddressLine1  String value for deliveryAddressLine1.
         * @return Builder
         */
        public Builder deliveryAddressLine1(String deliveryAddressLine1) {
            this.deliveryAddressLine1 = deliveryAddressLine1;
            return this;
        }

        /**
         * Setter for deliveryZipCode.
         * @param  deliveryZipCode  String value for deliveryZipCode.
         * @return Builder
         */
        public Builder deliveryZipCode(String deliveryZipCode) {
            this.deliveryZipCode = deliveryZipCode;
            return this;
        }

        /**
         * Setter for deliveryCity.
         * @param  deliveryCity  String value for deliveryCity.
         * @return Builder
         */
        public Builder deliveryCity(String deliveryCity) {
            this.deliveryCity = deliveryCity;
            return this;
        }

        /**
         * Setter for deliveryCountry.
         * @param  deliveryCountry  String value for deliveryCountry.
         * @return Builder
         */
        public Builder deliveryCountry(String deliveryCountry) {
            this.deliveryCountry = deliveryCountry;
            return this;
        }

        /**
         * Setter for deliveryContactTitle.
         * @param  deliveryContactTitle  String value for deliveryContactTitle.
         * @return Builder
         */
        public Builder deliveryContactTitle(String deliveryContactTitle) {
            this.deliveryContactTitle = OptionalNullable.of(deliveryContactTitle);
            return this;
        }

        /**
         * UnSetter for deliveryContactTitle.
         * @return Builder
         */
        public Builder unsetDeliveryContactTitle() {
            deliveryContactTitle = null;
            return this;
        }

        /**
         * Setter for deliveryAddressLine2.
         * @param  deliveryAddressLine2  String value for deliveryAddressLine2.
         * @return Builder
         */
        public Builder deliveryAddressLine2(String deliveryAddressLine2) {
            this.deliveryAddressLine2 = OptionalNullable.of(deliveryAddressLine2);
            return this;
        }

        /**
         * UnSetter for deliveryAddressLine2.
         * @return Builder
         */
        public Builder unsetDeliveryAddressLine2() {
            deliveryAddressLine2 = null;
            return this;
        }

        /**
         * Setter for deliveryAddressLine3.
         * @param  deliveryAddressLine3  String value for deliveryAddressLine3.
         * @return Builder
         */
        public Builder deliveryAddressLine3(String deliveryAddressLine3) {
            this.deliveryAddressLine3 = OptionalNullable.of(deliveryAddressLine3);
            return this;
        }

        /**
         * UnSetter for deliveryAddressLine3.
         * @return Builder
         */
        public Builder unsetDeliveryAddressLine3() {
            deliveryAddressLine3 = null;
            return this;
        }

        /**
         * Setter for deliveryRegionId.
         * @param  deliveryRegionId  Integer value for deliveryRegionId.
         * @return Builder
         */
        public Builder deliveryRegionId(Integer deliveryRegionId) {
            this.deliveryRegionId = OptionalNullable.of(deliveryRegionId);
            return this;
        }

        /**
         * UnSetter for deliveryRegionId.
         * @return Builder
         */
        public Builder unsetDeliveryRegionId() {
            deliveryRegionId = null;
            return this;
        }

        /**
         * Setter for deliveryRegion.
         * @param  deliveryRegion  String value for deliveryRegion.
         * @return Builder
         */
        public Builder deliveryRegion(String deliveryRegion) {
            this.deliveryRegion = OptionalNullable.of(deliveryRegion);
            return this;
        }

        /**
         * UnSetter for deliveryRegion.
         * @return Builder
         */
        public Builder unsetDeliveryRegion() {
            deliveryRegion = null;
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
         * Setter for saveForCardReissue.
         * @param  saveForCardReissue  Boolean value for saveForCardReissue.
         * @return Builder
         */
        public Builder saveForCardReissue(Boolean saveForCardReissue) {
            this.saveForCardReissue = saveForCardReissue;
            return this;
        }

        /**
         * Builds a new {@link CardDeliveryContact} object using the set fields.
         * @return {@link CardDeliveryContact}
         */
        public CardDeliveryContact build() {
            return new CardDeliveryContact(deliveryContactName, deliveryCompanyName,
                    deliveryAddressLine1, deliveryZipCode, deliveryCity, deliveryCountry,
                    deliveryContactTitle, deliveryAddressLine2, deliveryAddressLine3,
                    deliveryRegionId, deliveryRegion, phoneNumber, emailAddress,
                    saveForCardReissue);
        }
    }
}

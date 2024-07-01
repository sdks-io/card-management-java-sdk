/*
 * ShellCardManagementAPIsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.apitest.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for BundledDetailsProductList type.
 */
public class BundledDetailsProductList {
    private Integer purchaseCategoryId;
    private String purchaseCategoryCode;
    private List<String> products;
    private List<String> productGroups;
    private String fuelSetId;
    private String fuelSetName;
    private String nonFuelSets;

    /**
     * Default constructor.
     */
    public BundledDetailsProductList() {
    }

    /**
     * Initialization constructor.
     * @param  purchaseCategoryId  Integer value for purchaseCategoryId.
     * @param  purchaseCategoryCode  String value for purchaseCategoryCode.
     * @param  products  List of String value for products.
     * @param  productGroups  List of String value for productGroups.
     * @param  fuelSetId  String value for fuelSetId.
     * @param  fuelSetName  String value for fuelSetName.
     * @param  nonFuelSets  String value for nonFuelSets.
     */
    public BundledDetailsProductList(
            Integer purchaseCategoryId,
            String purchaseCategoryCode,
            List<String> products,
            List<String> productGroups,
            String fuelSetId,
            String fuelSetName,
            String nonFuelSets) {
        this.purchaseCategoryId = purchaseCategoryId;
        this.purchaseCategoryCode = purchaseCategoryCode;
        this.products = products;
        this.productGroups = productGroups;
        this.fuelSetId = fuelSetId;
        this.fuelSetName = fuelSetName;
        this.nonFuelSets = nonFuelSets;
    }

    /**
     * Getter for PurchaseCategoryId.
     * Purchase category Id Example: 123, 124, etc.,
     * @return Returns the Integer
     */
    @JsonGetter("PurchaseCategoryId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPurchaseCategoryId() {
        return purchaseCategoryId;
    }

    /**
     * Setter for PurchaseCategoryId.
     * Purchase category Id Example: 123, 124, etc.,
     * @param purchaseCategoryId Value for Integer
     */
    @JsonSetter("PurchaseCategoryId")
    public void setPurchaseCategoryId(Integer purchaseCategoryId) {
        this.purchaseCategoryId = purchaseCategoryId;
    }

    /**
     * Getter for PurchaseCategoryCode.
     * Purchase category name. Example: 0 - All Fuels (without VP) and Lubricants 1 - FuelSave only
     * 2 - FuelSave and Lubricants 3 - No Restrictions
     * @return Returns the String
     */
    @JsonGetter("PurchaseCategoryCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPurchaseCategoryCode() {
        return purchaseCategoryCode;
    }

    /**
     * Setter for PurchaseCategoryCode.
     * Purchase category name. Example: 0 - All Fuels (without VP) and Lubricants 1 - FuelSave only
     * 2 - FuelSave and Lubricants 3 - No Restrictions
     * @param purchaseCategoryCode Value for String
     */
    @JsonSetter("PurchaseCategoryCode")
    public void setPurchaseCategoryCode(String purchaseCategoryCode) {
        this.purchaseCategoryCode = purchaseCategoryCode;
    }

    /**
     * Getter for Products.
     * An array of 3-digit global product codes. Example: [ "033", "021", "023" ]
     * @return Returns the List of String
     */
    @JsonGetter("Products")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getProducts() {
        return products;
    }

    /**
     * Setter for Products.
     * An array of 3-digit global product codes. Example: [ "033", "021", "023" ]
     * @param products Value for List of String
     */
    @JsonSetter("Products")
    public void setProducts(List<String> products) {
        this.products = products;
    }

    /**
     * Getter for ProductGroups.
     * An array of product group ids. Example: [ "670246404", "40557126" ]
     * @return Returns the List of String
     */
    @JsonGetter("ProductGroups")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getProductGroups() {
        return productGroups;
    }

    /**
     * Setter for ProductGroups.
     * An array of product group ids. Example: [ "670246404", "40557126" ]
     * @param productGroups Value for List of String
     */
    @JsonSetter("ProductGroups")
    public void setProductGroups(List<String> productGroups) {
        this.productGroups = productGroups;
    }

    /**
     * Getter for FuelSetId.
     * Fuel set id that is allowed to be purchased with the card
     * @return Returns the String
     */
    @JsonGetter("FuelSetId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFuelSetId() {
        return fuelSetId;
    }

    /**
     * Setter for FuelSetId.
     * Fuel set id that is allowed to be purchased with the card
     * @param fuelSetId Value for String
     */
    @JsonSetter("FuelSetId")
    public void setFuelSetId(String fuelSetId) {
        this.fuelSetId = fuelSetId;
    }

    /**
     * Getter for FuelSetName.
     * Fuel set name that is allowed to be purchased with the card
     * @return Returns the String
     */
    @JsonGetter("FuelSetName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFuelSetName() {
        return fuelSetName;
    }

    /**
     * Setter for FuelSetName.
     * Fuel set name that is allowed to be purchased with the card
     * @param fuelSetName Value for String
     */
    @JsonSetter("FuelSetName")
    public void setFuelSetName(String fuelSetName) {
        this.fuelSetName = fuelSetName;
    }

    /**
     * Getter for NonFuelSets.
     * Non-Fuel set name that is allowed to be purchased with the card
     * @return Returns the String
     */
    @JsonGetter("NonFuelSets")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNonFuelSets() {
        return nonFuelSets;
    }

    /**
     * Setter for NonFuelSets.
     * Non-Fuel set name that is allowed to be purchased with the card
     * @param nonFuelSets Value for String
     */
    @JsonSetter("NonFuelSets")
    public void setNonFuelSets(String nonFuelSets) {
        this.nonFuelSets = nonFuelSets;
    }

    /**
     * Converts this BundledDetailsProductList into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BundledDetailsProductList [" + "purchaseCategoryId=" + purchaseCategoryId
                + ", purchaseCategoryCode=" + purchaseCategoryCode + ", products=" + products
                + ", productGroups=" + productGroups + ", fuelSetId=" + fuelSetId + ", fuelSetName="
                + fuelSetName + ", nonFuelSets=" + nonFuelSets + "]";
    }

    /**
     * Builds a new {@link BundledDetailsProductList.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BundledDetailsProductList.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .purchaseCategoryId(getPurchaseCategoryId())
                .purchaseCategoryCode(getPurchaseCategoryCode())
                .products(getProducts())
                .productGroups(getProductGroups())
                .fuelSetId(getFuelSetId())
                .fuelSetName(getFuelSetName())
                .nonFuelSets(getNonFuelSets());
        return builder;
    }

    /**
     * Class to build instances of {@link BundledDetailsProductList}.
     */
    public static class Builder {
        private Integer purchaseCategoryId;
        private String purchaseCategoryCode;
        private List<String> products;
        private List<String> productGroups;
        private String fuelSetId;
        private String fuelSetName;
        private String nonFuelSets;



        /**
         * Setter for purchaseCategoryId.
         * @param  purchaseCategoryId  Integer value for purchaseCategoryId.
         * @return Builder
         */
        public Builder purchaseCategoryId(Integer purchaseCategoryId) {
            this.purchaseCategoryId = purchaseCategoryId;
            return this;
        }

        /**
         * Setter for purchaseCategoryCode.
         * @param  purchaseCategoryCode  String value for purchaseCategoryCode.
         * @return Builder
         */
        public Builder purchaseCategoryCode(String purchaseCategoryCode) {
            this.purchaseCategoryCode = purchaseCategoryCode;
            return this;
        }

        /**
         * Setter for products.
         * @param  products  List of String value for products.
         * @return Builder
         */
        public Builder products(List<String> products) {
            this.products = products;
            return this;
        }

        /**
         * Setter for productGroups.
         * @param  productGroups  List of String value for productGroups.
         * @return Builder
         */
        public Builder productGroups(List<String> productGroups) {
            this.productGroups = productGroups;
            return this;
        }

        /**
         * Setter for fuelSetId.
         * @param  fuelSetId  String value for fuelSetId.
         * @return Builder
         */
        public Builder fuelSetId(String fuelSetId) {
            this.fuelSetId = fuelSetId;
            return this;
        }

        /**
         * Setter for fuelSetName.
         * @param  fuelSetName  String value for fuelSetName.
         * @return Builder
         */
        public Builder fuelSetName(String fuelSetName) {
            this.fuelSetName = fuelSetName;
            return this;
        }

        /**
         * Setter for nonFuelSets.
         * @param  nonFuelSets  String value for nonFuelSets.
         * @return Builder
         */
        public Builder nonFuelSets(String nonFuelSets) {
            this.nonFuelSets = nonFuelSets;
            return this;
        }

        /**
         * Builds a new {@link BundledDetailsProductList} object using the set fields.
         * @return {@link BundledDetailsProductList}
         */
        public BundledDetailsProductList build() {
            return new BundledDetailsProductList(purchaseCategoryId, purchaseCategoryCode, products,
                    productGroups, fuelSetId, fuelSetName, nonFuelSets);
        }
    }
}

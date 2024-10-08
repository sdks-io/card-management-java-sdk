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
 * This is a model class for ProductGroup type.
 */
public class ProductGroup {
    private Integer referenceId;
    private String productGroupId;
    private String name;
    private Boolean isDefault;
    private Boolean isFuelType;
    private List<ProductAllOf0> products;

    /**
     * Default constructor.
     */
    public ProductGroup() {
    }

    /**
     * Initialization constructor.
     * @param  referenceId  Integer value for referenceId.
     * @param  productGroupId  String value for productGroupId.
     * @param  name  String value for name.
     * @param  isDefault  Boolean value for isDefault.
     * @param  isFuelType  Boolean value for isFuelType.
     * @param  products  List of ProductAllOf0 value for products.
     */
    public ProductGroup(
            Integer referenceId,
            String productGroupId,
            String name,
            Boolean isDefault,
            Boolean isFuelType,
            List<ProductAllOf0> products) {
        this.referenceId = referenceId;
        this.productGroupId = productGroupId;
        this.name = name;
        this.isDefault = isDefault;
        this.isFuelType = isFuelType;
        this.products = products;
    }

    /**
     * Getter for ReferenceId.
     * Referenced Purchase Category Id Example: 123, 124
     * @return Returns the Integer
     */
    @JsonGetter("ReferenceId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getReferenceId() {
        return referenceId;
    }

    /**
     * Setter for ReferenceId.
     * Referenced Purchase Category Id Example: 123, 124
     * @param referenceId Value for Integer
     */
    @JsonSetter("ReferenceId")
    public void setReferenceId(Integer referenceId) {
        this.referenceId = referenceId;
    }

    /**
     * Getter for ProductGroupId.
     * Product group ID
     * @return Returns the String
     */
    @JsonGetter("ProductGroupId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProductGroupId() {
        return productGroupId;
    }

    /**
     * Setter for ProductGroupId.
     * Product group ID
     * @param productGroupId Value for String
     */
    @JsonSetter("ProductGroupId")
    public void setProductGroupId(String productGroupId) {
        this.productGroupId = productGroupId;
    }

    /**
     * Getter for Name.
     * Product group name
     * @return Returns the String
     */
    @JsonGetter("Name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Product group name
     * @param name Value for String
     */
    @JsonSetter("Name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for IsDefault.
     * Indicates whether this is a default Product Group at ColCo level or not. Note: The Customer
     * level default settings are not considered here.
     * @return Returns the Boolean
     */
    @JsonGetter("IsDefault")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * Setter for IsDefault.
     * Indicates whether this is a default Product Group at ColCo level or not. Note: The Customer
     * level default settings are not considered here.
     * @param isDefault Value for Boolean
     */
    @JsonSetter("IsDefault")
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * Getter for IsFuelType.
     * Identifies the type of Product group. true - if it is a Fuel type Product group false - if it
     * is Non-Fuel type
     * @return Returns the Boolean
     */
    @JsonGetter("IsFuelType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsFuelType() {
        return isFuelType;
    }

    /**
     * Setter for IsFuelType.
     * Identifies the type of Product group. true - if it is a Fuel type Product group false - if it
     * is Non-Fuel type
     * @param isFuelType Value for Boolean
     */
    @JsonSetter("IsFuelType")
    public void setIsFuelType(Boolean isFuelType) {
        this.isFuelType = isFuelType;
    }

    /**
     * Getter for Products.
     * @return Returns the List of ProductAllOf0
     */
    @JsonGetter("Products")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ProductAllOf0> getProducts() {
        return products;
    }

    /**
     * Setter for Products.
     * @param products Value for List of ProductAllOf0
     */
    @JsonSetter("Products")
    public void setProducts(List<ProductAllOf0> products) {
        this.products = products;
    }

    /**
     * Converts this ProductGroup into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ProductGroup [" + "referenceId=" + referenceId + ", productGroupId="
                + productGroupId + ", name=" + name + ", isDefault=" + isDefault + ", isFuelType="
                + isFuelType + ", products=" + products + "]";
    }

    /**
     * Builds a new {@link ProductGroup.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ProductGroup.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .referenceId(getReferenceId())
                .productGroupId(getProductGroupId())
                .name(getName())
                .isDefault(getIsDefault())
                .isFuelType(getIsFuelType())
                .products(getProducts());
        return builder;
    }

    /**
     * Class to build instances of {@link ProductGroup}.
     */
    public static class Builder {
        private Integer referenceId;
        private String productGroupId;
        private String name;
        private Boolean isDefault;
        private Boolean isFuelType;
        private List<ProductAllOf0> products;



        /**
         * Setter for referenceId.
         * @param  referenceId  Integer value for referenceId.
         * @return Builder
         */
        public Builder referenceId(Integer referenceId) {
            this.referenceId = referenceId;
            return this;
        }

        /**
         * Setter for productGroupId.
         * @param  productGroupId  String value for productGroupId.
         * @return Builder
         */
        public Builder productGroupId(String productGroupId) {
            this.productGroupId = productGroupId;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for isDefault.
         * @param  isDefault  Boolean value for isDefault.
         * @return Builder
         */
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }

        /**
         * Setter for isFuelType.
         * @param  isFuelType  Boolean value for isFuelType.
         * @return Builder
         */
        public Builder isFuelType(Boolean isFuelType) {
            this.isFuelType = isFuelType;
            return this;
        }

        /**
         * Setter for products.
         * @param  products  List of ProductAllOf0 value for products.
         * @return Builder
         */
        public Builder products(List<ProductAllOf0> products) {
            this.products = products;
            return this;
        }

        /**
         * Builds a new {@link ProductGroup} object using the set fields.
         * @return {@link ProductGroup}
         */
        public ProductGroup build() {
            return new ProductGroup(referenceId, productGroupId, name, isDefault, isFuelType,
                    products);
        }
    }
}

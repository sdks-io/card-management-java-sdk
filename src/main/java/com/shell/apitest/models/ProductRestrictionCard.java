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
 * This is a model class for ProductRestrictionCard type.
 */
public class ProductRestrictionCard {
    private List<String> products;
    private List<String> productGroups;

    /**
     * Default constructor.
     */
    public ProductRestrictionCard() {
    }

    /**
     * Initialization constructor.
     * @param  products  List of String value for products.
     * @param  productGroups  List of String value for productGroups.
     */
    public ProductRestrictionCard(
            List<String> products,
            List<String> productGroups) {
        this.products = products;
        this.productGroups = productGroups;
    }

    /**
     * Getter for Products.
     * An array of 3-digit global product codes. Optional. Example: [ "033", "021", "023”]
     * @return Returns the List of String
     */
    @JsonGetter("Products")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getProducts() {
        return products;
    }

    /**
     * Setter for Products.
     * An array of 3-digit global product codes. Optional. Example: [ "033", "021", "023”]
     * @param products Value for List of String
     */
    @JsonSetter("Products")
    public void setProducts(List<String> products) {
        this.products = products;
    }

    /**
     * Getter for ProductGroups.
     * An array of product group IDs. Optional. Example: [ "670246404", "40557126" ]
     * @return Returns the List of String
     */
    @JsonGetter("ProductGroups")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getProductGroups() {
        return productGroups;
    }

    /**
     * Setter for ProductGroups.
     * An array of product group IDs. Optional. Example: [ "670246404", "40557126" ]
     * @param productGroups Value for List of String
     */
    @JsonSetter("ProductGroups")
    public void setProductGroups(List<String> productGroups) {
        this.productGroups = productGroups;
    }

    /**
     * Converts this ProductRestrictionCard into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ProductRestrictionCard [" + "products=" + products + ", productGroups="
                + productGroups + "]";
    }

    /**
     * Builds a new {@link ProductRestrictionCard.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ProductRestrictionCard.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .products(getProducts())
                .productGroups(getProductGroups());
        return builder;
    }

    /**
     * Class to build instances of {@link ProductRestrictionCard}.
     */
    public static class Builder {
        private List<String> products;
        private List<String> productGroups;



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
         * Builds a new {@link ProductRestrictionCard} object using the set fields.
         * @return {@link ProductRestrictionCard}
         */
        public ProductRestrictionCard build() {
            return new ProductRestrictionCard(products, productGroups);
        }
    }
}

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
 * This is a model class for SearchProductRestriction type.
 */
public class SearchProductRestriction {
    private List<RestrictionProduct> products;
    private List<ProductGroup> productGroups;

    /**
     * Default constructor.
     */
    public SearchProductRestriction() {
    }

    /**
     * Initialization constructor.
     * @param  products  List of RestrictionProduct value for products.
     * @param  productGroups  List of ProductGroup value for productGroups.
     */
    public SearchProductRestriction(
            List<RestrictionProduct> products,
            List<ProductGroup> productGroups) {
        this.products = products;
        this.productGroups = productGroups;
    }

    /**
     * Getter for Products.
     * @return Returns the List of RestrictionProduct
     */
    @JsonGetter("Products")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<RestrictionProduct> getProducts() {
        return products;
    }

    /**
     * Setter for Products.
     * @param products Value for List of RestrictionProduct
     */
    @JsonSetter("Products")
    public void setProducts(List<RestrictionProduct> products) {
        this.products = products;
    }

    /**
     * Getter for ProductGroups.
     * @return Returns the List of ProductGroup
     */
    @JsonGetter("ProductGroups")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ProductGroup> getProductGroups() {
        return productGroups;
    }

    /**
     * Setter for ProductGroups.
     * @param productGroups Value for List of ProductGroup
     */
    @JsonSetter("ProductGroups")
    public void setProductGroups(List<ProductGroup> productGroups) {
        this.productGroups = productGroups;
    }

    /**
     * Converts this SearchProductRestriction into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SearchProductRestriction [" + "products=" + products + ", productGroups="
                + productGroups + "]";
    }

    /**
     * Builds a new {@link SearchProductRestriction.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SearchProductRestriction.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .products(getProducts())
                .productGroups(getProductGroups());
        return builder;
    }

    /**
     * Class to build instances of {@link SearchProductRestriction}.
     */
    public static class Builder {
        private List<RestrictionProduct> products;
        private List<ProductGroup> productGroups;



        /**
         * Setter for products.
         * @param  products  List of RestrictionProduct value for products.
         * @return Builder
         */
        public Builder products(List<RestrictionProduct> products) {
            this.products = products;
            return this;
        }

        /**
         * Setter for productGroups.
         * @param  productGroups  List of ProductGroup value for productGroups.
         * @return Builder
         */
        public Builder productGroups(List<ProductGroup> productGroups) {
            this.productGroups = productGroups;
            return this;
        }

        /**
         * Builds a new {@link SearchProductRestriction} object using the set fields.
         * @return {@link SearchProductRestriction}
         */
        public SearchProductRestriction build() {
            return new SearchProductRestriction(products, productGroups);
        }
    }
}

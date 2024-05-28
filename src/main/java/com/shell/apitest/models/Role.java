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
 * This is a model class for Role type.
 */
public class Role {
    private String roleName;
    private Boolean isCustomerAdmin;
    private Boolean isCustomerUser;
    private Boolean isShellAdmin;
    private Boolean isServiceAccount;
    private Boolean isUserAdmin;

    /**
     * Default constructor.
     */
    public Role() {
        isCustomerAdmin = true;
        isCustomerUser = false;
        isShellAdmin = false;
        isServiceAccount = false;
        isUserAdmin = true;
    }

    /**
     * Initialization constructor.
     * @param  roleName  String value for roleName.
     * @param  isCustomerAdmin  Boolean value for isCustomerAdmin.
     * @param  isCustomerUser  Boolean value for isCustomerUser.
     * @param  isShellAdmin  Boolean value for isShellAdmin.
     * @param  isServiceAccount  Boolean value for isServiceAccount.
     * @param  isUserAdmin  Boolean value for isUserAdmin.
     */
    public Role(
            String roleName,
            Boolean isCustomerAdmin,
            Boolean isCustomerUser,
            Boolean isShellAdmin,
            Boolean isServiceAccount,
            Boolean isUserAdmin) {
        this.roleName = roleName;
        this.isCustomerAdmin = isCustomerAdmin;
        this.isCustomerUser = isCustomerUser;
        this.isShellAdmin = isShellAdmin;
        this.isServiceAccount = isServiceAccount;
        this.isUserAdmin = isUserAdmin;
    }

    /**
     * Getter for RoleName.
     * Role Name of the user
     * @return Returns the String
     */
    @JsonGetter("RoleName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRoleName() {
        return roleName;
    }

    /**
     * Setter for RoleName.
     * Role Name of the user
     * @param roleName Value for String
     */
    @JsonSetter("RoleName")
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * Getter for IsCustomerAdmin.
     * Whether the role is an administrator.
     * @return Returns the Boolean
     */
    @JsonGetter("IsCustomerAdmin")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsCustomerAdmin() {
        return isCustomerAdmin;
    }

    /**
     * Setter for IsCustomerAdmin.
     * Whether the role is an administrator.
     * @param isCustomerAdmin Value for Boolean
     */
    @JsonSetter("IsCustomerAdmin")
    public void setIsCustomerAdmin(Boolean isCustomerAdmin) {
        this.isCustomerAdmin = isCustomerAdmin;
    }

    /**
     * Getter for IsCustomerUser.
     * Whether the role is a customer user.
     * @return Returns the Boolean
     */
    @JsonGetter("IsCustomerUser")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsCustomerUser() {
        return isCustomerUser;
    }

    /**
     * Setter for IsCustomerUser.
     * Whether the role is a customer user.
     * @param isCustomerUser Value for Boolean
     */
    @JsonSetter("IsCustomerUser")
    public void setIsCustomerUser(Boolean isCustomerUser) {
        this.isCustomerUser = isCustomerUser;
    }

    /**
     * Getter for IsShellAdmin.
     * True if the role is Shell user, else false.
     * @return Returns the Boolean
     */
    @JsonGetter("IsShellAdmin")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsShellAdmin() {
        return isShellAdmin;
    }

    /**
     * Setter for IsShellAdmin.
     * True if the role is Shell user, else false.
     * @param isShellAdmin Value for Boolean
     */
    @JsonSetter("IsShellAdmin")
    public void setIsShellAdmin(Boolean isShellAdmin) {
        this.isShellAdmin = isShellAdmin;
    }

    /**
     * Getter for IsServiceAccount.
     * True/False. True if the role is Service accounts, else false.
     * @return Returns the Boolean
     */
    @JsonGetter("IsServiceAccount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsServiceAccount() {
        return isServiceAccount;
    }

    /**
     * Setter for IsServiceAccount.
     * True/False. True if the role is Service accounts, else false.
     * @param isServiceAccount Value for Boolean
     */
    @JsonSetter("IsServiceAccount")
    public void setIsServiceAccount(Boolean isServiceAccount) {
        this.isServiceAccount = isServiceAccount;
    }

    /**
     * Getter for IsUserAdmin.
     * True/False. True, if the role allows user administration, else false.
     * @return Returns the Boolean
     */
    @JsonGetter("IsUserAdmin")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsUserAdmin() {
        return isUserAdmin;
    }

    /**
     * Setter for IsUserAdmin.
     * True/False. True, if the role allows user administration, else false.
     * @param isUserAdmin Value for Boolean
     */
    @JsonSetter("IsUserAdmin")
    public void setIsUserAdmin(Boolean isUserAdmin) {
        this.isUserAdmin = isUserAdmin;
    }

    /**
     * Converts this Role into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Role [" + "roleName=" + roleName + ", isCustomerAdmin=" + isCustomerAdmin
                + ", isCustomerUser=" + isCustomerUser + ", isShellAdmin=" + isShellAdmin
                + ", isServiceAccount=" + isServiceAccount + ", isUserAdmin=" + isUserAdmin + "]";
    }

    /**
     * Builds a new {@link Role.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Role.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .roleName(getRoleName())
                .isCustomerAdmin(getIsCustomerAdmin())
                .isCustomerUser(getIsCustomerUser())
                .isShellAdmin(getIsShellAdmin())
                .isServiceAccount(getIsServiceAccount())
                .isUserAdmin(getIsUserAdmin());
        return builder;
    }

    /**
     * Class to build instances of {@link Role}.
     */
    public static class Builder {
        private String roleName;
        private Boolean isCustomerAdmin = true;
        private Boolean isCustomerUser = false;
        private Boolean isShellAdmin = false;
        private Boolean isServiceAccount = false;
        private Boolean isUserAdmin = true;



        /**
         * Setter for roleName.
         * @param  roleName  String value for roleName.
         * @return Builder
         */
        public Builder roleName(String roleName) {
            this.roleName = roleName;
            return this;
        }

        /**
         * Setter for isCustomerAdmin.
         * @param  isCustomerAdmin  Boolean value for isCustomerAdmin.
         * @return Builder
         */
        public Builder isCustomerAdmin(Boolean isCustomerAdmin) {
            this.isCustomerAdmin = isCustomerAdmin;
            return this;
        }

        /**
         * Setter for isCustomerUser.
         * @param  isCustomerUser  Boolean value for isCustomerUser.
         * @return Builder
         */
        public Builder isCustomerUser(Boolean isCustomerUser) {
            this.isCustomerUser = isCustomerUser;
            return this;
        }

        /**
         * Setter for isShellAdmin.
         * @param  isShellAdmin  Boolean value for isShellAdmin.
         * @return Builder
         */
        public Builder isShellAdmin(Boolean isShellAdmin) {
            this.isShellAdmin = isShellAdmin;
            return this;
        }

        /**
         * Setter for isServiceAccount.
         * @param  isServiceAccount  Boolean value for isServiceAccount.
         * @return Builder
         */
        public Builder isServiceAccount(Boolean isServiceAccount) {
            this.isServiceAccount = isServiceAccount;
            return this;
        }

        /**
         * Setter for isUserAdmin.
         * @param  isUserAdmin  Boolean value for isUserAdmin.
         * @return Builder
         */
        public Builder isUserAdmin(Boolean isUserAdmin) {
            this.isUserAdmin = isUserAdmin;
            return this;
        }

        /**
         * Builds a new {@link Role} object using the set fields.
         * @return {@link Role}
         */
        public Role build() {
            return new Role(roleName, isCustomerAdmin, isCustomerUser, isShellAdmin,
                    isServiceAccount, isUserAdmin);
        }
    }
}